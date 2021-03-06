package com.bansi.webservices.samples.v2018_2;


import com.netsuite.suitetalk.client.common.EndpointVersion;
import com.netsuite.suitetalk.client.common.authentication.OAuthPassport;
import com.netsuite.suitetalk.client.common.authentication.Passport;
import com.netsuite.suitetalk.client.common.authentication.SsoPassport;
import com.netsuite.suitetalk.client.common.authentication.TokenPassport;
import com.netsuite.suitetalk.client.common.contract.Authentication;
import com.netsuite.suitetalk.client.common.contract.EndpointInfo;
import com.netsuite.suitetalk.client.common.contract.HttpHeaderHandler;
import com.netsuite.suitetalk.client.common.contract.SoapHeaderHandler;
import com.netsuite.suitetalk.client.common.utils.CommonUtils;
import com.netsuite.webservices.platform_2018_2.NetSuitePortType;
import com.netsuite.webservices.platform_2018_2.NetSuiteServiceLocator;
import org.apache.axis.AxisFault;
import org.apache.axis.Message;
import org.apache.axis.MessageContext;
import org.apache.axis.SimpleTargetedChain;
import org.apache.axis.client.Stub;
import org.apache.axis.configuration.SimpleProvider;
import org.apache.axis.message.SOAPHeaderElement;
import org.apache.axis.transport.http.CommonsHTTPSender;
import org.apache.axis.transport.http.HTTPConstants;
import org.apache.commons.httpclient.HttpVersion;
import org.apache.log4j.Logger;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;
import javax.xml.soap.MimeHeader;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import static com.bansi.webservices.samples.v2018_2.Utils.convertPassport;
import static com.bansi.webservices.samples.v2018_2.Utils.convertTokenPassport;
import static com.netsuite.suitetalk.client.common.Constants.*;
import static com.netsuite.suitetalk.client.common.utils.CommonUtils.getLogMessage;
import static com.netsuite.suitetalk.client.common.utils.CommonUtils.isEmptyString;

/**
 * <p>This is the core part of the web services client.</p>
 * <p>This class includes all needed methods and properties which could be convenient for every extending client.</p>
 * <p>If it is necessary to call remote SOAP operation from this core client, then method {@link #getPort()} provides
 * port to NetSuite which all possible remote operations can be called on.</p>
 * <p>&copy; 2017 NetSuite Inc.</p>
 *
 * @version 2019.1
 */
@ParametersAreNonnullByDefault
public class WsCoreClient_2018_2 implements Authentication, EndpointInfo, SoapHeaderHandler, HttpHeaderHandler {

    private static final Logger LOG = Logger.getLogger(WsCoreClient_2018_2.class);

    private final NetSuitePortType port;
    private final NetSuiteServiceLocator locator;

    private final URL endpointUrl;

    private final EndpointVersion endpointVersion;
    private final String messagesUrn;

    protected final List<MimeHeader> requestHttpHeaders = new ArrayList<>();
    private final List<MimeHeader> responseHttpHeaders = new ArrayList<>();

    private HttpVersion httpProtocolVersion = HttpVersion.HTTP_1_1;

    private Passport passport;
    private SsoPassport ssoPassport;
    private TokenPassport tokenPassport;
    private OAuthPassport oAuthPassport;


    /**
     * Constructor which initializes all required properties.
     * When the new instance is constructed, client is ready to send SOAP messages right away.
     * However, in most cases some kind of authentication is required but SOAP messages
     * are successfully sent to the server.
     *
     * @param endpointUrl URL to NetSuite web services endpoint
     */
    public WsCoreClient_2018_2(URL endpointUrl) {
        SimpleProvider engineConfiguration = new SimpleProvider();
        engineConfiguration.deployTransport(HTTP_PROTOCOL,
                new SimpleTargetedChain(new RequestHandler(), new CommonsHTTPSender(), new ResponseHandler()));

        locator = new NetSuiteServiceLocator(engineConfiguration);

        String serviceName = locator.getNetSuitePortAddress().split(SERVICES_PATH)[1];
        String endpointVersionAsString = serviceName.substring(NETSUITE_PORT_PREFIX.length());
        endpointVersion = new EndpointVersion(endpointVersionAsString);
        messagesUrn = CommonUtils.getMessagesUrn(endpointVersion);

        final String query = endpointUrl.getQuery() == null ? "" : '?' + endpointUrl.getQuery();

        try {
            this.endpointUrl = new URL(endpointUrl, SERVICES_PATH + serviceName + query);
            port = locator.getNetSuitePort(this.endpointUrl);
            Stub stub = (Stub) port;
            stub.setTimeout(DEFAULT_HTTP_SOCKET_TIMEOUT);
            stub.setMaintainSession(true); // this is needed for login and ssoLogin
        } catch (MalformedURLException | ServiceException e) {
            throw new RuntimeException(e);
        }
    }


    /**
     * Handles outgoing requests.
     * Sets version of HTTP protocol and adds extra HTTP headers set by user.
     * If TBA is desired authentication method, tokenPassport is added to SOAP header.
     */
    private class RequestHandler extends SimpleTargetedChain {
        @Override
        public void invoke(MessageContext messageContext) throws AxisFault {
            messageContext.setProperty("axis.transport.version", HttpVersion.HTTP_1_1.equals(getHttpProtocolVersion())
                    ? HTTPConstants.HEADER_PROTOCOL_V11 : HTTPConstants.HEADER_PROTOCOL_V10);

            final List<MimeHeader> mimeHeaders = new ArrayList<>(requestHttpHeaders);
            if (oAuthPassport != null) {
                mimeHeaders.add(new MimeHeader(
                        oAuthPassport.getOAuthHttpHeaderName(), oAuthPassport.getOAuthHttpHeaderValue()));
            }
            if (!mimeHeaders.isEmpty()) {
                Hashtable<String, String> headersMap = new Hashtable<>(mimeHeaders.size());
                mimeHeaders.forEach(header -> headersMap.put(header.getName(), header.getValue()));
                messageContext.setProperty(HTTPConstants.REQUEST_HEADERS, headersMap);
            }

            // If TBA is required type of authentication then the tokenPassport is sent with every request
            // Unlike passport, tokenPassport has to be recalculated every single time
            if (tokenPassport != null) {
                updateTokenPassportInMessage(messageContext, tokenPassport);
            }

            logMessage(messageContext.getRequestMessage(), true);

            super.invoke(messageContext);
        }
    }

    /**
     * Handles incoming responses.
     * Reads all HTTP headers which are available until the next response comes.
     */
    private class ResponseHandler extends SimpleTargetedChain {
        @Override
        public void invoke(MessageContext messageContext) throws AxisFault {
            responseHttpHeaders.clear(); // Clear headers from previous response
            Message responseMessage = messageContext.getResponseMessage();
            if (responseMessage != null) {
                MimeHeaders headers = responseMessage.getMimeHeaders();
                Iterator headersIterator = headers.getAllHeaders();
                while (headersIterator.hasNext()) {
                    responseHttpHeaders.add((MimeHeader) headersIterator.next());
                }
            }

            logMessage(messageContext.getResponseMessage(), false);

            super.invoke(messageContext);
        }
    }


    /**
     * Port providing access to all operations defined in WSDL.
     *
     * @return Port to NetSuite endpoint
     */
    public NetSuitePortType getPort() {
        return port;
    }

    protected Stub getStub() {
        return (Stub) getPort();
    }

    protected NetSuiteServiceLocator getLocator() {
        return locator;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public URL getEndpointUrl() {
        return endpointUrl;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EndpointVersion getEndpointVersion() {
        return endpointVersion;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getMessagesUrn() {
        return messagesUrn;
    }


    /**
     * @return HTTP protocol version used by the client
     */
    public HttpVersion getHttpProtocolVersion() {
        return httpProtocolVersion;
    }

    /**
     * Sets HTTP protocol version which should be used for sending requests.
     * Supported versions are HTTP/1.0 and HTTP/1.1.
     *
     * @param httpProtocolVersion HTTP protocol version to be used for sending requests
     */
    public void setHttpProtocolVersion(HttpVersion httpProtocolVersion) {
        this.httpProtocolVersion = httpProtocolVersion;
    }


    /**
     * {@inheritDoc}
     * <p>Only one header with particular name can be set because Axis stores all headers into hashtable where header
     * with the same name is replaced by newly set header.</p>
     */
    @Override
    public void setHttpHeader(String name, String value) {
        requestHttpHeaders.add(new MimeHeader(name, value));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void unsetHttpHeader(String name) {
        requestHttpHeaders.removeAll(
                requestHttpHeaders.stream()
                        .filter(header -> header.getName().equals(name))
                        .collect(Collectors.toList())
        );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isHttpHeaderSet(String name) {
        for (MimeHeader header : requestHttpHeaders) {
            if (header.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }


    /**
     * @return Read-only list of all extra HTTP headers set by user which are sent with requests
     */
    public List<MimeHeader> getHttpHeaders() {
        return Collections.unmodifiableList(requestHttpHeaders);
    }

    /**
     * Clears all extra HTTP headers set by user so that no extra headers are sent with the subsequent requests.
     */
    public void clearHttpHeaders() {
        requestHttpHeaders.clear();
    }


    /**
     * Returns all received HTTP headers from the server.
     * This method always returns the headers included in the very last response.
     * It means that response HTTP headers cannot be accessed reliably if running parallel within more threads.
     *
     * @return All HTTP headers returned in last response
     */
    public List<MimeHeader> getResponseHttpHeaders() {
        return Collections.unmodifiableList(responseHttpHeaders);
    }

    /**
     * Gets all values of all headers returned in response with given {@code name}.
     *
     * @param name Name of desired HTTP header
     * @return List of values for headers with given {@code name}. One value for one header.
     */
    public List<String> getResponseHttpHeader(String name) {
        return getResponseHttpHeaders().stream()
                .filter(header -> header.getName().equals(name))
                .map(MimeHeader::getValue)
                .collect(Collectors.toList());
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public SOAPHeaderElement getSoapHeader(String namespace, String headerName) {
        return getStub().getHeader(namespace, headerName);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized void addSoapHeader(@Nullable String namespace, String headerName, Object value) {
        getStub().setHeader(namespace == null ? "" : namespace, headerName, value);
    }

    /**
     * Adds SOAP header to request with default namespace.
     *
     * @param headerName Name of header element
     * @param value      Content of SOAP header
     */
    public void addSoapHeader(String headerName, Object value) {
        addSoapHeader(getMessagesUrn(), headerName, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void removeSoapHeader(@Nullable String namespace, String headerName) {
        if (isEmptyString(headerName)) {
            return;
        }

        String headerNamespace = namespace == null ? "" : namespace;

        if (!isSoapHeaderSet(headerNamespace, headerName)) {
            return;
        }

        Stub stub = getStub();
        SOAPHeaderElement[] headers = stub.getHeaders();
        List<SOAPHeaderElement> remainingHeaders = Arrays.stream(headers)
                .filter(header -> !(headerName.equals(header.getLocalName()) && headerNamespace.equals(header.getNamespaceURI())))
                .collect(Collectors.toList());

        synchronized (this) {
            // There is no other way how to remove SOAP header
            stub.clearHeaders();
            // Add all headers back to SOAP headers except the one with given namespace and name
            remainingHeaders.forEach(stub::setHeader);
            // Axis does not add empty SOAP Header to request
        }
    }

    /**
     * Removes SOAP header with given name and default namespace.
     *
     * @param headerName Name of SOAP header which should be removed
     */
    public void removeSoapHeader(String headerName) {
        removeSoapHeader(getMessagesUrn(), headerName);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isSoapHeaderSet(String namespace, String headerName) {
        return getStub().getHeader(namespace, headerName) != null;
    }

    /**
     * Checks if SOAP header with default namespace is set or not.
     *
     * @param headerName Name of SOAP header element
     * @return {@code true} if given SOAP header is already set, {@code false} otherwise
     */
    public boolean isSoapHeaderSet(String headerName) {
        return isSoapHeaderSet(getMessagesUrn(), headerName);
    }

    /**
     * Removes and adds new SOAP header with given name.
     *
     * @param headerName SOAP header name
     * @param value      Value which should be added to SOAP header with name {@code headerName}
     */
    protected void replaceSoapHeader(String headerName, Object value) {
        removeSoapHeader(headerName);
        addSoapHeader(headerName, value);
    }


    /**
     * Updates {@code tokenPassport} in request represented by {@code messageContext}.
     *
     * @param messageContext Message context containing request which should be updated
     * @param tokenPassport  Token passport which should be set to request
     */
    protected void updateTokenPassportInMessage(MessageContext messageContext, TokenPassport tokenPassport) {
        QName tokenPassportQName = new QName(getMessagesUrn(), SOAP_HEADER_TOKEN_PASSPORT);
        try {
            SOAPHeader soapHeader = messageContext.getCurrentMessage().getSOAPHeader();
            // If the token passport should be automatically updated then we update it
            if (tokenPassport.isAutomaticallyUpdated()) {
                tokenPassport.update();
            }
            soapHeader.addChildElement(new SOAPHeaderElement(tokenPassportQName, convertTokenPassport(tokenPassport)));
        } catch (SOAPException e) {
            e.printStackTrace();
        }
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Passport getPassport() {
        return passport;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void unsetPassport() {
        setRequestLevelCredentials(false);
        passport = null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setRequestLevelCredentials(boolean useRequestLevelCredentials) {
        if (useRequestLevelCredentials && passport == null) {
            throw new IllegalStateException("Passport must be set before setting Request-Level Credentials");
        }
        if (useRequestLevelCredentials) {
            replaceSoapHeader(SOAP_HEADER_PASSPORT, convertPassport(passport));
        } else {
            removeSoapHeader(SOAP_HEADER_PASSPORT);
        }
    }

    /**
     * Invokes {@link #setPassport(Passport)} first and then sets Request-Level Credentials to {@code true}.
     *
     * @param passport Passport to be used for authentication
     */
    public void setRequestLevelCredentials(Passport passport) {
        setPassport(passport);
        setRequestLevelCredentials(true);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsoPassport getSsoPassport() {
        return ssoPassport;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setSsoPassport(SsoPassport ssoPassport) {
        this.ssoPassport = ssoPassport;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void unsetSsoPassport() {
        ssoPassport = null;
        removeSoapHeader(SOAP_HEADER_SSO_PASSPORT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TokenPassport getTokenPassport() {
        return tokenPassport;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setTokenPassport(TokenPassport tokenPassport) {
        this.tokenPassport = tokenPassport;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void unsetTokenPassport() {
        tokenPassport = null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OAuthPassport getOAuthPassport() {
        return oAuthPassport;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setOAuthPassport(OAuthPassport oAuthPassport) {
        this.oAuthPassport = oAuthPassport;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void unsetOAuthPassport() {
        oAuthPassport = null;
    }

    /**
     * Automatic session management means that client automatically saves JSESSIONID if it is received and client
     * sends this JSESSIONID with every subsequent request.
     *
     * @param automaticSessionManagement If {@code true} then automatic session management is turned on,
     *                                   if {@code false} then any received JSESSIONID is ignored and session management
     *                                   is up to an user
     */
    public void setAutomaticSessionManagement(boolean automaticSessionManagement) {
        getStub().setMaintainSession(automaticSessionManagement);
    }


    /**
     * Logs request/response into INFO category.
     *
     * @param message   SOAP message to log
     * @param isRequest {@code true} if message is request, {@code false} if message is response
     * @throws AxisFault If some unexpected error occurs
     */
    protected static void logMessage(Message message, boolean isRequest) throws AxisFault {
        if (message != null && message.getSOAPPartAsString() != null) {
            LOG.info(getLogMessage(message.getSOAPPartAsString(), isRequest));
        }
    }
}
