package com.bansi.webservices.samples.v2019_1;

import com.bansi.webservices.samples.v2017_2.Properties;
import com.netsuite.suitetalk.client.common.authentication.OAuthPassport;
import com.netsuite.suitetalk.client.common.authentication.Passport;
import com.netsuite.suitetalk.client.common.authentication.SsoPassport;
import com.netsuite.suitetalk.client.common.authentication.TokenPassport;
import com.netsuite.suitetalk.client.common.contract.WebServicesSoapClient;
import com.netsuite.webservices.platform.core_2019_1.AsyncStatusResult;
import com.netsuite.webservices.platform.core_2019_1.AttachBasicReference;
import com.netsuite.webservices.platform.core_2019_1.AttachContactReference;
import com.netsuite.webservices.platform.core_2019_1.AttachReference;
import com.netsuite.webservices.platform.core_2019_1.BaseRef;
import com.netsuite.webservices.platform.core_2019_1.BudgetExchangeRate;
import com.netsuite.webservices.platform.core_2019_1.BudgetExchangeRateFilter;
import com.netsuite.webservices.platform.core_2019_1.ChangeEmail;
import com.netsuite.webservices.platform.core_2019_1.ChangePassword;
import com.netsuite.webservices.platform.core_2019_1.CurrencyRate;
import com.netsuite.webservices.platform.core_2019_1.CurrencyRateFilter;
import com.netsuite.webservices.platform.core_2019_1.CustomizationRef;
import com.netsuite.webservices.platform.core_2019_1.CustomizationType;
import com.netsuite.webservices.platform.core_2019_1.DataCenterUrls;
import com.netsuite.webservices.platform.core_2019_1.DeletedRecord;
import com.netsuite.webservices.platform.core_2019_1.DeletionReason;
import com.netsuite.webservices.platform.core_2019_1.DetachBasicReference;
import com.netsuite.webservices.platform.core_2019_1.DetachReference;
import com.netsuite.webservices.platform.core_2019_1.GetAllRecord;
import com.netsuite.webservices.platform.core_2019_1.GetAllResult;
import com.netsuite.webservices.platform.core_2019_1.GetBudgetExchangeRateResult;
import com.netsuite.webservices.platform.core_2019_1.GetCurrencyRateResult;
import com.netsuite.webservices.platform.core_2019_1.GetCustomizationIdResult;
import com.netsuite.webservices.platform.core_2019_1.GetDataCenterUrlsResult;
import com.netsuite.webservices.platform.core_2019_1.GetDeletedFilter;
import com.netsuite.webservices.platform.core_2019_1.GetDeletedResult;
import com.netsuite.webservices.platform.core_2019_1.GetItemAvailabilityResult;
import com.netsuite.webservices.platform.core_2019_1.GetPostingTransactionSummaryResult;
import com.netsuite.webservices.platform.core_2019_1.GetSavedSearchRecord;
import com.netsuite.webservices.platform.core_2019_1.GetSavedSearchResult;
import com.netsuite.webservices.platform.core_2019_1.GetSelectValueFieldDescription;
import com.netsuite.webservices.platform.core_2019_1.GetSelectValueResult;
import com.netsuite.webservices.platform.core_2019_1.GetServerTimeResult;
import com.netsuite.webservices.platform.core_2019_1.InitializeRecord;
import com.netsuite.webservices.platform.core_2019_1.InitializeRef;
import com.netsuite.webservices.platform.core_2019_1.ItemAvailability;
import com.netsuite.webservices.platform.core_2019_1.ItemAvailabilityFilter;
import com.netsuite.webservices.platform.core_2019_1.PostingTransactionSummaryField;
import com.netsuite.webservices.platform.core_2019_1.PostingTransactionSummaryFilter;
import com.netsuite.webservices.platform.core_2019_1.Record;
import com.netsuite.webservices.platform.core_2019_1.RecordRef;
import com.netsuite.webservices.platform.core_2019_1.SearchRecord;
import com.netsuite.webservices.platform.core_2019_1.SearchResult;
import com.netsuite.webservices.platform.core_2019_1.SsoCredentials;
import com.netsuite.webservices.platform.core_2019_1.StatusDetail;
import com.netsuite.webservices.platform.core_2019_1.UpdateInviteeStatusReference;
import com.netsuite.webservices.platform.core_2019_1.types.AsyncStatusType;
import com.netsuite.webservices.platform.core_2019_1.types.CalendarEventAttendeeResponse;
import com.netsuite.webservices.platform.core_2019_1.types.GetAllRecordType;
import com.netsuite.webservices.platform.core_2019_1.types.GetCustomizationType;
import com.netsuite.webservices.platform.core_2019_1.types.InitializeType;
import com.netsuite.webservices.platform.core_2019_1.types.RecordType;
import com.netsuite.webservices.platform.core_2019_1.types.SearchRecordType;
import com.netsuite.webservices.platform.faults_2019_1.InvalidCredentialsFault;
import com.netsuite.webservices.platform.messages_2019_1.ApplicationInfo;
import com.netsuite.webservices.platform.messages_2019_1.AsyncResult;
import com.netsuite.webservices.platform.messages_2019_1.Preferences;
import com.netsuite.webservices.platform.messages_2019_1.ReadResponse;
import com.netsuite.webservices.platform.messages_2019_1.ReadResponseList;
import com.netsuite.webservices.platform.messages_2019_1.SearchPreferences;
import com.netsuite.webservices.platform.messages_2019_1.SessionResponse;
import com.netsuite.webservices.platform.messages_2019_1.WriteResponse;
import com.netsuite.webservices.platform.messages_2019_1.WriteResponseList;
import org.apache.axis.Message;
import org.apache.axis.client.Call;
import org.apache.axis.message.SOAPHeaderElement;
import org.apache.axis.soap.MessageFactoryImpl;
import org.apache.commons.httpclient.HttpVersion;
import org.apache.log4j.Logger;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.xml.rpc.ServiceException;
import javax.xml.soap.MimeHeader;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.netsuite.suitetalk.client.common.Constants.*;
import static com.netsuite.suitetalk.client.common.utils.CommonUtils.getCookieWithoutSessionId;
import static com.netsuite.suitetalk.client.common.utils.CommonUtils.isEmptyString;
import static com.netsuite.suitetalk.client.common.utils.CommonUtils.parseSessionIdFromCookie;


@ParametersAreNonnullByDefault
public class WsClient_2019_1 extends WsCoreClient_2019_1 implements WebServicesSoapClient {
	private static final Logger LOG = Logger.getLogger(WsClient_2019_1.class);

	private String sessionId;
	private String applicationId;

	private String lastSearchJobId;
	private String lastGetPostingTransactionSummaryJobId;

	// Do not access preferences directly
	// Use always their getters because of initialization
	private Preferences preferences;
	private SearchPreferences searchPreferences;

	/**
	 * Client constructed by this constructor can be used right away for sending SOAP messages but it is not
	 * authenticated. Most of the remote operations require authenticated user so for actual use of this client
	 * additional authentication is needed. For authentication use either other constructor or one of the methods
	 * setting passport.
	 *
	 * @param url URL to which the requests are sent
	 * @see #setPassport(Passport)
	 * @see #setSsoPassport(SsoPassport)
	 * @see #setTokenPassport(TokenPassport)
	 */
	public WsClient_2019_1(URL url) {
		super(url);
		setHttpProtocolVersion(HttpVersion.HTTP_1_0);
	}

	/**
	 * Client constructed by this constructor is ready to send authenticated SOAP messages after first {@code login}
	 * operation. If Request-Level credentials are desired then {@link #setRequestLevelCredentials(boolean)}
	 * must be invoked.
	 *
	 * @param passport Passport used for authentication
	 * @param url      URL to which the requests are sent
	 */
	public WsClient_2019_1(Passport passport, URL url) {
		this(url);
		setPassport(passport);
	}

	/**
	 * Client constructed by this constructor is ready to send authentication SOAP messages via Single-Sign On
	 * authentication. However, mapping between NetSuite account and third party account must be created prior to use of
	 * {@link #ssoLogin(SsoPassport)} method. SSO mapping can be created by invoking
	 * {@link #mapSso(Passport, SsoPassport)} method.
	 *
	 * @param ssoPassport Single-Sign On passport used for authentication
	 * @param url         URL to which the requests are sent
	 */
	public WsClient_2019_1(SsoPassport ssoPassport, URL url) {
		this(url);
		setSsoPassport(ssoPassport);
	}

	/**
	 * Client constructed by this constructor is ready to send SOAP messages with Token Based Authentication (TBA).
	 *
	 * @param tokenPassport Token passport used for authentication
	 * @param url           URL to which the requests are sent
	 */
	public WsClient_2019_1(TokenPassport tokenPassport, URL url) {
		this(url);
		setTokenPassport(tokenPassport);
	}

	/**
	 * Client constructed by this constructor is ready to send SOAP messages with OAuth authentication.
	 * It is usually used for outbound SSO.
	 *
	 * @param oAuthPassport OAuth passport used for authentication
	 * @param url           URL to which the requests are sent
	 */
	public WsClient_2019_1(OAuthPassport oAuthPassport, URL url) {
		this(url);
		setOAuthPassport(oAuthPassport);
	}

	/**
	 * Initializes, adds to SOAP header and returns SOAP preferences.
	 *
	 * @return SOAP {@code Preferences} object
	 */
	protected Preferences getPreferences() {
		if (preferences == null) {
			preferences = new Preferences();
		}
		if (!isSoapHeaderSet(SOAP_HEADER_PREFERENCES)) {
			addSoapHeader(SOAP_HEADER_PREFERENCES, preferences);
		}
		return preferences;
	}

	/**
	 * Initializes, adds to SOAP header and returns SOAP search preferences.
	 *
	 * @return SOAP {@code SearchPreferences} object
	 */
	protected SearchPreferences getSearchPreferences() {
		if (searchPreferences == null) {
			searchPreferences = new SearchPreferences();
		}
		if (!isSoapHeaderSet(SOAP_HEADER_SEARCH_PREFERENCES)) {
			addSoapHeader(SOAP_HEADER_SEARCH_PREFERENCES, searchPreferences);
		}
		return searchPreferences;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setIgnoreReadOnlyFields(boolean ignoreReadOnlyFields) {
		getPreferences().setIgnoreReadOnlyFields(ignoreReadOnlyFields);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setWarningAsError(boolean warningAsError) {
		getPreferences().setWarningAsError(warningAsError);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setDisableMandatoryCustomFieldValidation(boolean disableValidation) {
		getPreferences().setDisableMandatoryCustomFieldValidation(disableValidation);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setDisableSystemNotesForCustomFields(boolean disableSystemNotes) {
		getPreferences().setDisableSystemNotesForCustomFields(disableSystemNotes);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setRunServerSuiteScriptAndWorkflowTriggers(boolean runServerSuiteScriptAndWorkflowTriggers) {
		getPreferences().setRunServerSuiteScriptAndTriggerWorkflows(runServerSuiteScriptAndWorkflowTriggers);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setBodyFieldsOnly(boolean bodyFieldsOnly) {
		getSearchPreferences().setBodyFieldsOnly(bodyFieldsOnly);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setPageSize(int pageSize) {
		getSearchPreferences().setPageSize(pageSize);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setReturnSearchColumns(boolean returnSearchColumns) {
		getSearchPreferences().setReturnSearchColumns(returnSearchColumns);
	}

	/**
	 * <p>Sets all search preferences within one method. For more information about search preferences,
	 * see documentation of setter for particular preference.</p>
	 * <p>For more information, see
	 * <a href="https://system.netsuite.com/app/help/helpcenter.nl?fid=section_4170181850.html">Request-Level Preferences</a>
	 * in Help Center.</p>
	 *
	 * @param bodyFieldsOnly      If {@code true} then only body fields are returned in search result
	 * @param pageSize            Number of records returned on single page of search results
	 * @param returnSearchColumns In case of advanced saved search,
	 *                            if {@code false} then whole records are returned instead of just columns
	 * @see #setBodyFieldsOnly(boolean)
	 * @see #setPageSize(int)
	 * @see #setReturnSearchColumns(boolean)
	 */
	public void setSearchPreferences(boolean bodyFieldsOnly, int pageSize, boolean returnSearchColumns) {
		setBodyFieldsOnly(bodyFieldsOnly);
		setPageSize(pageSize);
		setReturnSearchColumns(returnSearchColumns);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getApplicationId() {
		return applicationId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setApplicationId(String applicationId) {
		if (applicationId == null || applicationId.equals(getApplicationId())) {
			// We set the given application ID last time or there is no application ID to be set
			return;
		}

		this.applicationId = applicationId;

		ApplicationInfo applicationInfo = new ApplicationInfo();
		applicationInfo.setApplicationId(applicationId);

		replaceSoapHeader(SOAP_HEADER_APPLICATION_INFO, applicationInfo);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void unsetApplicationId() {
		applicationId = null;
		removeSoapHeader(SOAP_HEADER_APPLICATION_INFO);
	}

	/**
	 * @return Value of {@code JSESSIONID} if client is authenticated or {@code null} otherwise
	 */
	public String getSessionId() {
		return sessionId;
	}

	/**
	 * Sets {@code JSESSIONID} as a cookie to every subsequent request.
	 * If the session ID is manually set by invoking this method then automatic session management is turned off.
	 * For turning automatic session management on again, use {@link #unsetSessionId()}.
	 *
	 * @param sessionId Desired {@code JSESSIONID} to be set to request cookies
	 */
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
		setAutomaticSessionManagement(false);
		setHttpHeader(REQUEST_COOKIE_HEADER, SESSION_ID + '=' + sessionId);
	}

	/**
	 * Removes session ID provided by {@link #setSessionId(String)} method from request cookies and turns on
	 * automatic session management. If you do not want to set session ID manually and at the same time you
	 * do not want to use automatic session management then you can turn it off by calling
	 * {@code getStub().setMaintainSession(false)}.
	 */
	public void unsetSessionId() {
		sessionId = null;
		removeSessionIdFromRequestHeaders();
		setAutomaticSessionManagement(true);
	}

	/**
	 * Removes JSESSIONID from request HTTP headers.
	 */
	protected void removeSessionIdFromRequestHeaders() {
		MimeHeader sessionCookie = null;
		for (MimeHeader header : requestHttpHeaders) {
			if (REQUEST_COOKIE_HEADER.equals(header.getName()) && header.getValue().contains(SESSION_ID)) {
				sessionCookie = header;
				break;
			}
		}
		if (sessionCookie != null) {
			int index = requestHttpHeaders.indexOf(sessionCookie);
			requestHttpHeaders.remove(sessionCookie);
			String cookieWithoutSessionId = getCookieWithoutSessionId(sessionCookie.getValue());
			if (!cookieWithoutSessionId.isEmpty()) {
				requestHttpHeaders.add(index, new MimeHeader(sessionCookie.getName(), cookieWithoutSessionId));
			}
		}
	}

	/**
	 * Every response contains job ID which identifies particular request. This ID can be used for tracking
	 * request/response in NetSuite's logs.
	 * Example of job ID is {@code WEBSERVICES_3604360_030920171294347334403176987_d5e18962ec6f}.
	 *
	 * @return ID of the last processed job or {@code null} if no ID was returned in last response
	 */
	public String getLastJobId() {
		try {
			Call call = getStub()._getCall();
			Message message = call.getResponseMessage();
			SOAPHeader soapHeader = message.getSOAPHeader();
			SOAPHeaderElement documentInfo = (SOAPHeaderElement) soapHeader.getElementsByTagName("documentInfo").item(0);
			SOAPElement jobId = (SOAPElement) documentInfo.getElementsByTagName("nsId").item(0);
			return jobId.getValue();
		} catch (SOAPException | NullPointerException e) {
			// For not checking all variables for null we just catch NullPointerException.
			// If SOAPException or NullPointerException occur then it means the response does not contain any job ID.
			return null;
		}
	}

	/**
	 * <p>This method invokes remote {@code login} operation. The {@code login} operation is used to authenticate
	 * a user and start a new web services session in NetSuite.</p>
	 * <p>For more information, see
	 * <a href="https://system.netsuite.com/app/help/helpcenter.nl?fid=section_N3512617.html">login</a>
	 * operation in Help Center.</p>
	 *
	 * @param passport Passport used for authentication
	 * @return {@code SessionResponse}
	 * @throws RemoteException         If some unexpected error occurs between client and server
	 * @throws InvalidCredentialsFault If provided credentials are not valid
	 * @see #callLogout()
	 */
	public SessionResponse callLogin(Passport passport) throws RemoteException {
		com.netsuite.webservices.platform.core_2019_1.Passport endpointSpecificPassport = com.bansi.webservices.samples.v2019_1.Utils.convertPassport(passport);
		SessionResponse sessionResponse;
		synchronized (this) {
			sessionResponse = getPort().login(endpointSpecificPassport);
		}
		saveSessionId(sessionResponse);
		return sessionResponse;
	}

	/**
	 * <p>For information about {@code login} operation, see documentation of {@link #callLogin(Passport)} method.</p>
	 * <p>This method invokes remote {@code login} operation with passport which was set by constructor
	 * or {@link #setPassport(Passport)} method.</p>
	 *
	 * @return {@code SessionResponse}
	 * @throws RemoteException         If some unexpected error occurs between client and server
	 * @throws InvalidCredentialsFault If set credentials are not valid
	 * @see #setPassport(Passport)
	 * @see #callLogout()
	 */
	public SessionResponse callLogin() throws RemoteException {
		Passport passport = getPassport();
		if (passport == null) {
			throw new IllegalStateException("Passport must be set before invoking login operation.");
		}
		return callLogin(passport);
	}

	/**
	 * For information about {@code login} operation, see documentation of {@link #callLogin(Passport)} method.
	 *
	 * @param passport Passport used for authentication
	 * @return {@code true} if login was successful, {@code false} otherwise
	 * @see #logout()
	 */
	public StatusDetail[] login(Passport passport) {
		SessionResponse sessionResponse = null;
		try {
			sessionResponse = callLogin(passport);
		} catch (RemoteException e) {
			LOG.warn("Login failed", e);
			return sessionResponse.getStatus();
		}
		return sessionResponse.getStatus();
	}

	/**
	 * <p>For information about {@code login} operation, see documentation of {@link #callLogin()} method.</p>
	 * <p>This method invokes remote {@code login} operation with passport which was set by constructor
	 * or {@link #setPassport(Passport)} method.</p>
	 *
	 * @return {@code true} if login was successful, {@code false} otherwise
	 * @see #setPassport(Passport)
	 * @see #logout()
	 */
	public StatusDetail[] login() {
		Passport passport = getPassport();
		if (passport == null) {
			throw new IllegalStateException("Passport must be set before invoking login operation.");
		}
		return login(passport);
	}

	/**
	 * Parses JSESSIONID from given {@code sessionResponse} and stores it as a last session ID.
	 *
	 * @param sessionResponse {@code SessionResponse} which contains JSESSIONID and usually comes from login operation
	 */
	private void saveSessionId(SessionResponse sessionResponse) {
		Boolean isIsSuccess = true;
		for (StatusDetail sd : sessionResponse.getStatus()) {
			isIsSuccess = !sd.getAfterSubmitFailed() && isIsSuccess;
		}
		if (isIsSuccess) {
			List<String> cookiesWithSession = getResponseHttpHeader(RESPONSE_COOKIE_HEADER).stream().filter(cookie -> cookie.contains(SESSION_ID))
					.collect(Collectors.toList());
			if (cookiesWithSession.isEmpty()) {
				sessionId = null;
			} else {
				sessionId = parseSessionIdFromCookie(cookiesWithSession.get(0));
			}
		}
	}

	/**
	 * <p>This method invokes remote {@code logout} operation.
	 * The {@code logout} operation is used to terminate an active session.</p>
	 * <p>For more information, see
	 * <a href="https://system.netsuite.com/app/help/helpcenter.nl?fid=section_N3513430.html">logout</a>
	 * operation in Help Center.</p>
	 *
	 * @return {@code SessionResponse}
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public SessionResponse callLogout() throws RemoteException {
		SessionResponse sessionResponse;
		synchronized (this) {
			sessionResponse = getPort().logout();
		}
		clearSessionId(sessionResponse);
		return sessionResponse;
	}

	/**
	 * For information about {@code logout} operation, see documentation of {@link #callLogout()} method.
	 *
	 * @return {@code true} if logout was successful, {@code false} otherwise
	 */
	public boolean logout() {
		SessionResponse sessionResponse;
		try {
			sessionResponse = callLogout();
		} catch (RemoteException e) {
			LOG.warn("Logout failed", e);
			return false;
		}
		Boolean isIsSuccess = true;
		for (StatusDetail sd : sessionResponse.getStatus()) {
			isIsSuccess = !sd.getAfterSubmitFailed() && isIsSuccess;
		}

		return isIsSuccess;
	}

	/**
	 * Clears current session ID. This method is used after successful logout operation.
	 *
	 * @param sessionResponse Logout operation response
	 */
	private void clearSessionId(SessionResponse sessionResponse) {
		Boolean isIsSuccess = true;
		for (StatusDetail sd : sessionResponse.getStatus()) {
			isIsSuccess = !sd.getAfterSubmitFailed() && isIsSuccess;
		}
		if (isIsSuccess) {
			sessionId = null;
		}
	}

	/**
	 * <p>This method invokes remote {@code mapSso} operation.
	 * The {@code mapSso} operation supports NetSuite's inbound single sign-on feature.
	 * This feature allows users to go directly from an external user-authenticating application to NetSuite,
	 * without having to separately log in to NetSuite. Validation is provided by the passing of an encrypted token,
	 * and user identification is provided by a mapping between external application credentials
	 * (remote company ID and remote user ID), and NetSuite credentials (email, password, account, and role used to
	 * log in to NetSuite).</p>
	 * <p>For more information, see
	 * <a href="https://system.netsuite.com/app/help/helpcenter.nl?fid=section_N3513702.html">mapSso</a>
	 * operation in Help Center.</p>
	 *
	 * @param netsuitePassport   NetSuite's passport for NetSuite's account which external account should be mapped to
	 * @param thirdPartyPassport Third party passport which is mapped to
	 *                           NetSuite's account represented by {@code netsuitePassport}
	 * @return {@code SessionResponse}
	 * @throws RemoteException If some unexpected error occurs between client and server
	 * @see #callSsoLogin(SsoPassport)
	 */
	public SessionResponse callMapSso(Passport netsuitePassport, SsoPassport thirdPartyPassport) throws RemoteException {
		SsoCredentials ssoCredentials = new SsoCredentials();

		ssoCredentials.setEmail(netsuitePassport.getEmail());
		ssoCredentials.setPassword(netsuitePassport.getPassword());
		ssoCredentials.setAccount(netsuitePassport.getAccount());
		RecordRef rf = new RecordRef(netsuitePassport.getRole(), applicationId, applicationId, null);
		ssoCredentials.setRole(rf);

		ssoCredentials.setAuthenticationToken(thirdPartyPassport.getAuthenticationToken());
		ssoCredentials.setPartnerId(thirdPartyPassport.getPartnerId());

		SessionResponse sessionResponse;
		synchronized (this) {
			sessionResponse = getPort().mapSso(ssoCredentials);
		}

		saveSessionId(sessionResponse);

		return sessionResponse;
	}

	/**
	 * For information about {@code mapSso} operation,
	 * see documentation of {@link #callMapSso(Passport, SsoPassport)} method.
	 *
	 * @param netsuitePassport   NetSuite's passport for NetSuite's account which external account should be mapped to
	 * @param thirdPartyPassport Third party passport which is mapped to
	 *                           NetSuite's account represented by {@code netsuitePassport}
	 * @return {@code true} if mapping was successfully created
	 * @throws RemoteException If some unexpected error occurs between client and server
	 * @see #ssoLogin(SsoPassport)
	 */
	public boolean mapSso(Passport netsuitePassport, SsoPassport thirdPartyPassport) throws RemoteException {
		SessionResponse sessionResponse;
		try {
			sessionResponse = callMapSso(netsuitePassport, thirdPartyPassport);
		} catch (RemoteException e) {
			LOG.warn("SSO mapping failed", e);
			return false;
		}
		Boolean isIsSuccess = true;
		for (StatusDetail sd : sessionResponse.getStatus()) {
			isIsSuccess = !sd.getAfterSubmitFailed() && isIsSuccess;
		}

		return isIsSuccess;
	}

	/**
	 * <p>This method invokes remote {@code ssoLogin} operation.
	 * The {@code ssoLogin} operation provides a mechanism for a partner application to log in to NetSuite on behalf
	 * of the user. This approach enables login to take place without the user's credentials ever going
	 * through the partner servers.</p>
	 * <p>For inbound single sign-on to work, a single sign-on mapping must exist for every user that accesses NetSuite
	 * through the external application. This mapping can be created manually when the user logs in, or by using
	 * the {@link #callMapSso(Passport, SsoPassport)} operation.</p>
	 * <p>For more information, see
	 * <a href="https://system.netsuite.com/app/help/helpcenter.nl?fid=section_N3526370.html">ssoLogin</a>
	 * operation in Help Center.</p>
	 *
	 * @param ssoPassport Passport containing all required information (authentication token, partner ID,
	 *                    partner account, partner user ID)
	 * @return Session response
	 * @throws RemoteException If some unexpected error occurs between client and server
	 * @see #callMapSso(Passport, SsoPassport)
	 */

	/*public SessionResponse callSsoLogin(SsoPassport ssoPassport) throws RemoteException {
		com.netsuite.webservices.platform.core_2019_1.SsoPassport endpointSsoPassport = com.bansi.webservices.samples.v2019_1.Utils.convertSsoPassport(ssoPassport);
		SessionResponse sessionResponse;
		synchronized (this) {
			sessionResponse = getPort().ssoLogin(endpointSsoPassport);
		}
		saveSessionId(sessionResponse);
		return sessionResponse;
	}
	*/

	/**
	 * For information about {@code ssoLogin} operation, see documentation of {@link #callSsoLogin(SsoPassport)} method.
	 *
	 * @param ssoPassport Passport containing all required information (authentication token, partner ID,
	 *                    partner account, partner user ID)
	 * @return {@code true} if SSO login was successful
	 */
	/*
	public boolean ssoLogin(SsoPassport ssoPassport) throws RemoteException {
		SessionResponse sessionResponse;
		try {
			sessionResponse = callSsoLogin(ssoPassport);
		} catch (RemoteException e) {
			LOG.warn("SSO login failed", e);
			return false;
		}
		return sessionResponse.getStatus().isIsSuccess();
	}
	*/
	/**
	 * <p>This method invokes remote {@code add} operation.
	 * The {@code add} operation is used to add a new instance of a record in NetSuite.
	 * It is similar to the {@code addList} operation except that it allows only one record to be added at a time.
	 * Note that to prevent duplicate records, NetSuite recommends using the alternate {@code upsert} and
	 * {@code upsertList} operations along with external IDs to add records to NetSuite.</p>
	 * <p>For more information, see
	 * <a href="https://system.netsuite.com/app/help/helpcenter.nl?fid=section_N3480855.html">add</a>
	 * operation in Help Center.</p>
	 *
	 * @param record Record that should be created in NetSuite
	 * @return Write response
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public synchronized WriteResponse callAddRecord(Record record) throws RemoteException {
		return getPort().add(record);
	}

	/**
	 * For information about {@code add} operation, see documentation of {@link #callAddRecord(Record)} method.
	 *
	 * @param record Record that should be created in NetSuite
	 * @return Internal ID of successfully created record or {@code null} if add operation failed
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public String addRecord(Record record) throws RemoteException {
		WriteResponse writeResponse = callAddRecord(record);
		
		Boolean isIsSuccess = true;
		for (StatusDetail sd : writeResponse.getStatus()) {
			isIsSuccess = !sd.getAfterSubmitFailed() && isIsSuccess;
		}
		if (isIsSuccess) {

			return com.bansi.webservices.samples.v2019_1.Utils.getInternalId(writeResponse.getBaseRef());
		}
		return null;
	}
	
	public WriteResponse addBOMRecord(Record record) throws RemoteException {
		WriteResponse writeResponse = callAddRecord(record);
		
		
		return writeResponse;
	}

	/**
	 * <p>This method invokes remote operation {@code addList}. The {@code addList} operation is used to add one
	 * or more new instances of a record to NetSuite. If there are multiple records, they can either be of the same
	 * record type or different record types. For example, it is possible to add a customer and a contact
	 * within a single request using this operation. However, each record entered must have a unique signature.
	 * Adding two records with the same signature results in a SOAP fault. The signature consists of parameters
	 * required to identify a record as unique.</p>
	 * <p>For example, in the case of entities, a record is uniquely identified by its name, its type and
	 * its parent hierarchy. So you could have two records with the same entityId (or name) belonging
	 * to two different record types</p>
	 * <p>For more information, see
	 * <a href="https://system.netsuite.com/app/help/helpcenter.nl?fid=section_N3481360.html">addList</a>
	 * operation in Help Center.</p>
	 *
	 * @param records Records to be created
	 * @return Write response
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public synchronized WriteResponseList callAddRecords(Record... records) throws RemoteException {
		return getPort().addList(records);
	}

	/**
	 * For information about {@code addList} operation, see documentation of {@link #callAddRecords(Record...)} method.
	 *
	 * @param records Records to be created
	 * @return Write response
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public WriteResponseList callAddRecords(List<? extends Record> records) throws RemoteException {
		return callAddRecords(records.toArray(new Record[records.size()]));
	}

	/**
	 * For information about {@code addList} operation, see documentation of {@link #callAddRecords(Record...)} method.
	 *
	 * @param records Records to be created
	 * @return List of internal IDs of newly created records. {@code null} as an item of the list represents
	 * unsuccessful creation of the record. Returned list of IDs is in the same order as the sent list of records
	 */
	public List<String> addRecords(Record... records) throws RemoteException {
		return com.bansi.webservices.samples.v2019_1.Utils.getInternalIds(callAddRecords(records));
	}

	/**
	 * For information about {@code addList} operation, see documentation of {@link #callAddRecords(Record...)} method.
	 *
	 * @param records Records to be created
	 * @return List of internal IDs of newly created records. {@code null} as an item of the list represents
	 * unsuccessful creation of the record. Returned list of IDs is in the same order as the sent list of records
	 */
	public List<String> addRecords(List<? extends Record> records) throws RemoteException {
		return addRecords(records.toArray(new Record[records.size()]));
	}

	/**
	 * <p>This operation invokes remote {@code update} operation. The {@code update} operation is used to update
	 * an instance of a record in NetSuite. It is similar to the {@code updateList} operation, which allows users to
	 * update more than one record at a time.</p>
	 * <p>Only the fields that have been populated in each submitted record are updated in the system.
	 * If a field has NOT been populated, it is not updated in the system and it retains its previous value.
	 * If a field is set to an empty string, the previous value of the field is replaced with an empty string.
	 * Therefore, when updating records, it is recommended that you get the desired record, instantiate a new record
	 * of the same type, populate only the fields that require an update and then submit the updated record.
	 * This ensures that only the fields requiring an update are written on submission.</p>
	 * <p>For more information, see
	 * <a href="https://system.netsuite.com/app/help/helpcenter.nl?fid=section_N3527090.html">update</a>
	 * operation in Help Center.</p>
	 *
	 * @param record Record to be updated
	 * @return Write response
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public synchronized WriteResponse callUpdateRecord(Record record) throws RemoteException {
		return getPort().update(record);
	}

	/**
	 * For information about {@code update} operation, see documentation of {@link #callUpdateRecord(Record)} method.
	 *
	 * @param record Record to be updated
	 * @return Internal ID of updated record or {@code null} if update was unsuccessful
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public String updateRecord(Record record) throws RemoteException {
		WriteResponse writeResponse = callUpdateRecord(record);
		Boolean isIsSuccess = true;
		for (StatusDetail sd : writeResponse.getStatus()) {
			isIsSuccess = !sd.getAfterSubmitFailed() && isIsSuccess;
		}
		if (isIsSuccess) {
			return com.bansi.webservices.samples.v2019_1.Utils.getInternalId(writeResponse.getBaseRef());
		}
		return null;
	}

	/**
	 * <p>This method invokes remote {@code updateList} operation. The {@code updateList} operation
	 * is used to update one or more instances of a record type in NetSuite.</p>
	 * <p>If there are multiple records, they can either be of the same record type or different record types.
	 * For example, it is possible to update a customer and a contact within a single request using this operation.</p>
	 * <p>Only the fields that have been populated in each submitted record are updated in the system.
	 * If a field has not been populated, it is not updated in the system and it retains its previous value.
	 * If a field is set to an empty string, the previous value of the field is replaced with an empty string.</p>
	 * <p>For more information, see
	 * <a href="https://system.netsuite.com/app/help/helpcenter.nl?fid=section_N3527652.html">updateList</a>
	 * operation in Help Center.</p>
	 *
	 * @param records Records to be updated
	 * @return Write response list
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public synchronized WriteResponseList callUpdateRecords(Record... records) throws RemoteException {
		return getPort().updateList(records);
	}

	/**
	 * For information about {@code updateList} operation, see documentation of {@link #callUpdateRecords(Record...)}
	 * method.
	 *
	 * @param records Records to be updated
	 * @return Write response list
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public WriteResponseList callUpdateRecords(List<? extends Record> records) throws RemoteException {
		return callUpdateRecords(records.toArray(new Record[records.size()]));
	}

	/**
	 * For information about {@code updateList} operation, see documentation of {@link #callUpdateRecords(Record...)}
	 * method.
	 *
	 * @param records Records to be updated
	 * @return List of internal IDs of updated records. {@code null} as an item of the list represents
	 * unsuccessful update of the record. Returned list of IDs is in the same order as the sent list of records
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public List<String> updateRecords(Record... records) throws RemoteException {
		return com.bansi.webservices.samples.v2019_1.Utils.getInternalIds(callUpdateRecords(records));
	}

	/**
	 * For information about {@code updateList} operation, see documentation of {@link #callUpdateRecords(Record...)}
	 * method.
	 *
	 * @param records Records to be updated
	 * @return List of internal IDs of updated records. {@code null} as an item of the list represents
	 * unsuccessful update of the record. Returned list of IDs is in the same order as the sent list of records
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public List<String> updateRecords(List<? extends Record> records) throws RemoteException {
		return updateRecords(records.toArray(new Record[records.size()]));
	}

	/**
	 * <p>This method invokes remote {@code upsert} operation. The {@code upsert} operation is used to add
	 * a new instance or to update an instance of a record in NetSuite. It is similar to the {@code upsertList}
	 * operation, which allows users to add or update more than one record at a time.</p>
	 * <p>The {@code upsert} operation is similar to both the {@code add} and {@code update} operations, but
	 * {@code upsert} can be run without first determining whether a record exists in NetSuite.
	 * A record is identified by its external ID and its record type. If a record of the specified type with a matching
	 * external ID exists in the system, it is updated. If it does not exist, a new record is created.</p>
	 * <p>Because external ID is mandatory for this operation, {@code upsert} is supported only for records that support
	 * the external ID field. Also, this operation prohibits the passing of internal ID values.</p>
	 * <p>For more information, see
	 * <a href="https://system.netsuite.com/app/help/helpcenter.nl?fid=section_N3532463.html">upsert</a>
	 * operation in Help Center.</p>
	 *
	 * @param record Record to be created or updated
	 * @return Write response
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public synchronized WriteResponse callUpsertRecord(Record record) throws RemoteException {
		return getPort().upsert(record);
	}

	/**
	 * For information about {@code upsert} operation, see documentation of {@link #callUpsertRecord(Record)} method.
	 *
	 * @param record Record to be created or updated
	 * @return Internal ID of created or updated record
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public String upsertRecord(Record record) throws RemoteException {
		WriteResponse writeResponse = callUpsertRecord(record);
		Boolean isIsSuccess = true;
		for (StatusDetail sd : writeResponse.getStatus()) {
			isIsSuccess = !sd.getAfterSubmitFailed() && isIsSuccess;
		}
		if (isIsSuccess) {
			return com.bansi.webservices.samples.v2019_1.Utils.getInternalId(writeResponse.getBaseRef());
		}
		return null;
	}

	/**
	 * <p>This method invokes remote {@code upsertList} operation. The {@code upsertList} operation is used to
	 * add or update one or more instances of a record type in NetSuite.</p>
	 * <p>If there are multiple records, they can either be of the same record type or different record types.
	 * For example, it is possible to add or update a customer and a contact within a single request using
	 * this operation.</p>
	 * <p>The {@code upsertList} operation is similar to both the {@code addList} and {@code updateList} operations,
	 * but {@code upsertList} can be run without first determining whether records exist in NetSuite. Records are
	 * identified by their external ID and their record type. If a record of the specified type with a matching
	 * external ID exists in the system, it is updated. If it does not exist, a new record is created.</p>
	 * <p>Because external ID is mandatory for this operation, {@code upsertList} is supported only for records that
	 * support the external ID field. Also, this operation prohibits the passing of internal ID values.</p>
	 * <p>For more information, see
	 * <a href="https://system.netsuite.com/app/help/helpcenter.nl?fid=section_N3533243.html">upsertList</a>
	 * operation in Help Center.</p>
	 *
	 * @param records Records to be created or updated
	 * @return Write response list
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public synchronized WriteResponseList callUpsertRecords(Record... records) throws RemoteException {
		return getPort().upsertList(records);
	}

	/**
	 * For information about {@code upsertList} operation, see documentation of {@link #callUpsertRecords(Record...)}
	 * method.
	 *
	 * @param records Records to be created or updated
	 * @return Write response list
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public WriteResponseList callUpsertRecords(List<? extends Record> records) throws RemoteException {
		return callUpsertRecords(records.toArray(new Record[records.size()]));
	}

	/**
	 * For information about {@code upsertList} operation, see documentation of {@link #callUpsertRecords(Record...)}
	 * method.
	 *
	 * @param records Records to be created or updated
	 * @return List of internal IDs of created/updated records. {@code null} as an item of the list represents
	 * unsuccessful creation/update of the record. Returned list of IDs is in the same order as the sent list of records
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public List<String> upsertRecords(Record... records) throws RemoteException {
		return com.bansi.webservices.samples.v2019_1.Utils.getInternalIds(callUpsertRecords(records));
	}

	/**
	 * For information about {@code upsertList} operation, see documentation of {@link #callUpsertRecords(Record...)}
	 * method.
	 *
	 * @param records Records to be created or updated
	 * @return List of internal IDs of created/updated records. {@code null} as an item of the list represents
	 * unsuccessful creation/update of the record. Returned list of IDs is in the same order as the sent list of records
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public List<String> upsertRecords(List<? extends Record> records) throws RemoteException {
		return upsertRecords(records.toArray(new Record[records.size()]));
	}

	/**
	 * <p>This method invokes remote {@code get} operation. The {@code get} operation is used to retrieve
	 * a record by providing the unique ID that identifies that record.</p>
	 * <p>For more information, see
	 * <a href="https://system.netsuite.com/app/help/helpcenter.nl?fid=section_N3488543.html">get</a>
	 * operation in Help Center.</p>
	 *
	 * @param baseRef Reference to desired record. Most often {@code RecordRef} is used which contains
	 *                type of record and its internal or external ID
	 * @return Read response containg desired record
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public synchronized ReadResponse callGetRecord(BaseRef baseRef) throws RemoteException {
		return getPort().get(baseRef);
	}

	/**
	 * For information about {@code get} operation, see documentation of {@link #callGetRecord(BaseRef)} method.
	 *
	 * @param internalId Internal ID of desired record
	 * @param recordType Type of desired record (e.g. customer, contact, sales order)
	 * @return Read response containing desired record
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public ReadResponse callGetRecord(String internalId, RecordType recordType) throws RemoteException {
		return callGetRecord(com.bansi.webservices.samples.v2019_1.Utils.createRecordRef(internalId, recordType));
	}

	/**
	 * For information about {@code get} operation, see documentation of {@link #callGetRecord(BaseRef)} method.
	 *
	 * @param baseRef Reference to desired record. Most often {@code RecordRef} is used which contains
	 *                type of record and its internal or external ID
	 * @return Desired record or {@code null} if an error occurred (e.g. record does not exist)
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public Record getRecord(BaseRef baseRef) throws RemoteException {
		return callGetRecord(baseRef).getRecord();
	}

	/**
	 * For information about {@code get} operation, see documentation of {@link #callGetRecord(BaseRef)} method.
	 *
	 * @param internalId Internal ID of desired record
	 * @param recordType Type of desired record (e.g. customer, contact, sales order)
	 * @return Desired record or {@code null} if an error occurred (e.g. record does not exist)
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public Record getRecord(String internalId, RecordType recordType) throws RemoteException {
		return getRecord(com.bansi.webservices.samples.v2019_1.Utils.createRecordRef(internalId, recordType));
	}

	/**
	 * For information about {@code get} operation, see documentation of {@link #callGetRecord(BaseRef)} method.
	 *
	 * @param externalId External ID of desired record
	 * @param recordType Type of desired record (e.g. customer, contact, sales order)
	 * @return Read response containing desired record
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public ReadResponse callGetRecordByExternalId(String externalId, RecordType recordType) throws RemoteException {
		return callGetRecord(com.bansi.webservices.samples.v2019_1.Utils.createRecordRefWithExternalId(externalId, recordType));
	}

	/**
	 * For information about {@code get} operation, see documentation of {@link #callGetRecord(BaseRef)} method.
	 *
	 * @param externalId External ID of desired record
	 * @param recordType Type of desired record (e.g. customer, contact, sales order)
	 * @return Desired record or {@code null} if an error occurred (e.g. record does not exist)
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public Record getRecordByExternalId(String externalId, RecordType recordType) throws RemoteException {
		return callGetRecordByExternalId(externalId, recordType).getRecord();
	}

	/**
	 * <p>This method invokes remote {@code getList} operation. The {@code getList} operation is used to retrieve
	 * a list of one or more records by providing the unique IDs that identify those records.</p>
	 * <p>If there are multiple IDs provided, they can either belong to the same record type or different record types.
	 * For example, it is possible to retrieve a customer and a contact within a single request using this operation.</p>
	 * <p>If some of the provided IDs are invalid, the request is still processed for the valid IDs and the response
	 * will contain a warning that indicates that some of the ids were invalid.</p>
	 * <p>For more information, see
	 * <a href="https://system.netsuite.com/app/help/helpcenter.nl?fid=section_N3499748.html">getList</a>
	 * operation in Help Center.</p>
	 *
	 * @param baseRefs References to desired records. Most often {@code RecordRef}s are used which contain
	 *                 type of records and their internal or external IDs
	 * @return Read response list containing desired records
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public synchronized ReadResponseList callGetRecords(BaseRef... baseRefs) throws RemoteException {
		return getPort().getList(baseRefs);
	}

	/**
	 * For information about {@code getList} operation, see documentation of {@link #callGetRecords(BaseRef...)} method.
	 *
	 * @param refs References to desired records. Most often {@code RecordRef}s are used which contain
	 *             type of records and their internal or external IDs
	 * @return Read response list containing desired records
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public ReadResponseList callGetRecords(List<? extends BaseRef> refs) throws RemoteException {
		return callGetRecords(refs.toArray(new BaseRef[refs.size()]));
	}

	/**
	 * For information about {@code getList} operation, see documentation of {@link #callGetRecords(BaseRef...)} method.
	 *
	 * @param baseRefs References to desired records. Most often {@code RecordRef}s are used which contain
	 *                 type of records and their internal or external IDs
	 * @return List of desired records.
	 * If some item of the list is {@code null} it represents an error (e.g. record does not exist).
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public List<Record> getRecords(BaseRef... baseRefs) throws RemoteException {
		return Utils.getRecords(callGetRecords(baseRefs));
	}

	/**
	 * For information about {@code getList} operation, see documentation of {@link #callGetRecords(BaseRef...)} method.
	 *
	 * @param refs References to desired records. Most often {@code RecordRef}s are used which contain
	 *             type of records and their internal or external IDs
	 * @return List of desired records.
	 * If some item of the list is {@code null} it represents an error (e.g. record does not exist).
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public List<Record> getRecords(List<? extends BaseRef> refs) throws RemoteException {
		return getRecords(refs.toArray(new BaseRef[refs.size()]));
	}

	/**
	 * <p>This method invokes remote {@code delete} operation. The {@code delete} operation is used to delete
	 * an instance of a record. It is similar to the {@code deleteList} operation, except that it permits only
	 * one record to be deleted per request.</p>
	 * <p>For more information, see
	 * <a href="https://system.netsuite.com/app/help/helpcenter.nl?fid=section_N3486046.html">delete</a>
	 * operation in Help Center.</p>
	 *
	 * @param deleteRecordReference Identifies the record to be deleted
	 * @param deletionReason        Identifies a deletion reason and deletion reason memo. This parameter supports
	 *                              the Use Deletion Reasons feature, which requires users to provide reasons when they
	 *                              delete transactions. However, even when this feature is not enabled, you must use
	 *                              this parameter with every delete request. You can provide a value of
	 *                              {@code null} in such cases.
	 * @return Write response which contains details on the status of the {@code delete} operation and a reference
	 * to the deleted record
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public synchronized WriteResponse callDeleteRecord(BaseRef deleteRecordReference, @Nullable DeletionReason deletionReason) throws RemoteException {
		return getPort().delete(deleteRecordReference, deletionReason);
	}

	/**
	 * For information about {@code delete} operation, see documentation of
	 * {@link #callDeleteRecord(BaseRef, DeletionReason)} method.
	 *
	 * @param internalId         Internal ID of record which should be deleted
	 * @param recordType         Type of deleted record (e.g. customer, contact, sales order, item)
	 * @param deletionReasonCode Identifies a deletion reason that is listed at Setup > Accounting > Accounting Lists.
	 *                           If the Use Deletion Reasons feature is enabled and you use the
	 *                           {@code deletionReasonCode} to identify a code that does not exist, the request fails
	 *                           with an {@code INVALID_REF_KEY} error.
	 * @param deletionReasonMemo Deletion reason memo
	 * @return Write response which contains details on the status of the {@code delete} operation and a reference
	 * to the deleted record
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public WriteResponse callDeleteRecord(String internalId, RecordType recordType, @Nullable RecordRef deletionReasonCode, @Nullable String deletionReasonMemo)
			throws RemoteException {
		return callDeleteRecord(com.bansi.webservices.samples.v2019_1.Utils.createRecordRef(internalId, recordType), getDeletionReason(deletionReasonCode, deletionReasonMemo));
	}

	/**
	 * For information about {@code delete} operation, see documentation of
	 * {@link #callDeleteRecord(BaseRef, DeletionReason)} method.
	 *
	 * @param internalId Internal ID of record which should be deleted
	 * @param recordType Type of deleted record (e.g. customer, contact, sales order, item)
	 * @return Write response which contains details on the status of the {@code delete} operation and a reference
	 * to the deleted record
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public WriteResponse callDeleteRecord(String internalId, RecordType recordType) throws RemoteException {
		return callDeleteRecord(com.bansi.webservices.samples.v2019_1.Utils.createRecordRef(internalId, recordType), null);
	}

	/**
	 * For information about {@code delete} operation, see documentation of
	 * {@link #callDeleteRecord(BaseRef, DeletionReason)} method.
	 *
	 * @param externalId External ID of record which should be deleted
	 * @param recordType Type of deleted record (e.g. customer, contact, sales order, item)
	 * @return Write response which contains details on the status of the {@code delete} operation and a reference
	 * to the deleted record
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public WriteResponse callDeleteRecordByExternalId(String externalId, RecordType recordType) throws RemoteException {
		return callDeleteRecord(com.bansi.webservices.samples.v2019_1.Utils.createRecordRefWithExternalId(externalId, recordType), null);
	}

	/**
	 * For information about {@code delete} operation, see documentation of
	 * {@link #callDeleteRecord(BaseRef, DeletionReason)} method.
	 *
	 * @param externalId         External ID of record which should be deleted
	 * @param recordType         Type of deleted record (e.g. customer, contact, sales order, item)
	 * @param deletionReasonCode Identifies a deletion reason that is listed at Setup > Accounting > Accounting Lists.
	 *                           If the Use Deletion Reasons feature is enabled and you use the
	 *                           {@code deletionReasonCode} to identify a code that does not exist, the request fails
	 *                           with an {@code INVALID_REF_KEY} error.
	 * @param deletionReasonMemo Deletion reason memo
	 * @return Write response which contains details on the status of the {@code delete} operation and a reference
	 * to the deleted record
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public WriteResponse callDeleteRecordByExternalId(String externalId, RecordType recordType, @Nullable RecordRef deletionReasonCode,
			@Nullable String deletionReasonMemo) throws RemoteException {
		return callDeleteRecord(com.bansi.webservices.samples.v2019_1.Utils.createRecordRefWithExternalId(externalId, recordType), getDeletionReason(deletionReasonCode, deletionReasonMemo));
	}

	/**
	 * For information about {@code delete} operation, see documentation of
	 * {@link #callDeleteRecord(BaseRef, DeletionReason)} method.
	 *
	 * @param baseRef        Identifies the record to be deleted
	 * @param deletionReason Identifies a deletion reason and deletion reason memo. This parameter supports
	 *                       the Use Deletion Reasons feature, which requires users to provide reasons when they
	 *                       delete transactions. However, even when this feature is not enabled, you must use
	 *                       this parameter with every delete request. You can provide a value of
	 *                       {@code null} in such cases.
	 * @return {@code true} if deletion was successful, {@code false} if deletion failed
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public boolean deleteRecord(BaseRef baseRef, @Nullable DeletionReason deletionReason) throws RemoteException {
		WriteResponse	deleteRecordResponse = callDeleteRecord(baseRef, deletionReason);
		Boolean isIsSuccess = true;
		for (StatusDetail sd : deleteRecordResponse.getStatus()) {
			isIsSuccess = !sd.getAfterSubmitFailed() && isIsSuccess;
		}
		
		return isIsSuccess;
	}

	/**
	 * For information about {@code delete} operation, see documentation of
	 * {@link #callDeleteRecord(BaseRef, DeletionReason)} method.
	 *
	 * @param internalId         Internal ID of record which should be deleted
	 * @param recordType         Type of deleted record (e.g. customer, contact, sales order, item)
	 * @param deletionReasonCode Identifies a deletion reason that is listed at Setup > Accounting > Accounting Lists.
	 *                           If the Use Deletion Reasons feature is enabled and you use the
	 *                           {@code deletionReasonCode} to identify a code that does not exist, the request fails
	 *                           with an {@code INVALID_REF_KEY} error.
	 * @param deletionReasonMemo Deletion reason memo
	 * @return {@code true} if deletion was successful, {@code false} if deletion failed
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public boolean deleteRecord(String internalId, RecordType recordType, @Nullable RecordRef deletionReasonCode, @Nullable String deletionReasonMemo)
			throws RemoteException {
		return deleteRecord(com.bansi.webservices.samples.v2019_1.Utils.createRecordRef(internalId, recordType), getDeletionReason(deletionReasonCode, deletionReasonMemo));
	}

	/**
	 * For information about {@code delete} operation, see documentation of
	 * {@link #callDeleteRecord(BaseRef, DeletionReason)} method.
	 *
	 * @param internalId Internal ID of record which should be deleted
	 * @param recordType Type of deleted record (e.g. customer, contact, sales order, item)
	 * @return {@code true} if deletion was successful, {@code false} if deletion failed
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public boolean deleteRecord(String internalId, RecordType recordType) throws RemoteException {
		return deleteRecord(com.bansi.webservices.samples.v2019_1.Utils.createRecordRef(internalId, recordType), null);
	}

	/**
	 * For information about {@code delete} operation, see documentation of
	 * {@link #callDeleteRecord(BaseRef, DeletionReason)} method.
	 *
	 * @param externalId         External ID of record which should be deleted
	 * @param recordType         Type of deleted record (e.g. customer, contact, sales order, item)
	 * @param deletionReasonCode Identifies a deletion reason that is listed at Setup > Accounting > Accounting Lists.
	 *                           If the Use Deletion Reasons feature is enabled and you use the
	 *                           {@code deletionReasonCode} to identify a code that does not exist, the request fails
	 *                           with an {@code INVALID_REF_KEY} error.
	 * @param deletionReasonMemo Deletion reason memo
	 * @return {@code true} if deletion was successful, {@code false} if deletion failed
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public boolean deleteRecordByExternalId(String externalId, RecordType recordType, @Nullable RecordRef deletionReasonCode,
			@Nullable String deletionReasonMemo) throws RemoteException {
		return deleteRecord(com.bansi.webservices.samples.v2019_1.Utils.createRecordRefWithExternalId(externalId, recordType), getDeletionReason(deletionReasonCode, deletionReasonMemo));
	}

	/**
	 * For information about {@code delete} operation, see documentation of
	 * {@link #callDeleteRecord(BaseRef, DeletionReason)} method.
	 *
	 * @param externalId External ID of record which should be deleted
	 * @param recordType Type of deleted record (e.g. customer, contact, sales order, item)
	 * @return {@code true} if deletion was successful, {@code false} if deletion failed
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public boolean deleteRecordByExternalId(String externalId, RecordType recordType) throws RemoteException {
		return deleteRecord(com.bansi.webservices.samples.v2019_1.Utils.createRecordRefWithExternalId(externalId, recordType), null);
	}

	/**
	 * @return {@code null} if both parameters are {@code null} or {@code DeletionReason} with set parameters
	 */
	private DeletionReason getDeletionReason(@Nullable RecordRef deletionReasonCode, @Nullable String deletionMemo) {
		if (deletionReasonCode == null && deletionMemo == null) {
			return null;
		}
		DeletionReason deletionReason = new DeletionReason();
		deletionReason.setDeletionReasonCode(deletionReasonCode);
		deletionReason.setDeletionReasonMemo(deletionMemo);
		return deletionReason;
	}

	/**
	 * <p>This method invokes remote {@code deleteList} operation. The {@code deleteList} operation is used to delete
	 * one or more record instances. The record instances can be of various record types. For example, it is possible
	 * to delete a customer and a contact within a single request by using this operation.</p>
	 * <p>For more information, see
	 * <a href="https://system.netsuite.com/app/help/helpcenter.nl?fid=section_N3486552.html">deleteList</a>
	 * operation in Help Center.</p>
	 *
	 * @param deletionReason Identifies a deletion reason and deletion reason memo. This parameter supports
	 *                       the Use Deletion Reasons feature, which requires users to provide reasons when they
	 *                       delete transactions. However, even when this feature is not enabled, you must use
	 *                       this parameter with every delete request. You can provide a value of
	 *                       {@code null} in such cases.
	 * @param baseRefs       References to records which should be deleted
	 * @return Write response list containing a list of WriteResponse objects, each of which contains details
	 * on the status of the delete operation and a reference to the deleted record
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public synchronized WriteResponseList callDeleteRecords(@Nullable DeletionReason deletionReason, BaseRef... baseRefs) throws RemoteException {
		return getPort().deleteList(baseRefs, deletionReason);
	}

	/**
	 * For information about {@code deleteList} operation, see documentation of
	 * {@link #callDeleteRecords(DeletionReason, BaseRef...)} method.
	 *
	 * @param baseRefs References to records which should be deleted
	 * @return Write response list containing a list of WriteResponse objects, each of which contains details
	 * on the status of the delete operation and a reference to the deleted record
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public WriteResponseList callDeleteRecords(BaseRef... baseRefs) throws RemoteException {
		return callDeleteRecords(null, baseRefs);
	}

	/**
	 * For information about {@code deleteList} operation, see documentation of
	 * {@link #callDeleteRecords(DeletionReason, BaseRef...)} method.
	 *
	 * @param deletionReason Identifies a deletion reason and deletion reason memo. This parameter supports
	 *                       the Use Deletion Reasons feature, which requires users to provide reasons when they
	 *                       delete transactions. However, even when this feature is not enabled, you must use
	 *                       this parameter with every delete request. You can provide a value of
	 *                       {@code null} in such cases.
	 * @param baseRefs       References to records which should be deleted
	 * @return Write response list containing a list of WriteResponse objects, each of which contains details
	 * on the status of the delete operation and a reference to the deleted record
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public WriteResponseList callDeleteRecords(@Nullable DeletionReason deletionReason, List<? extends BaseRef> baseRefs) throws RemoteException {
		return callDeleteRecords(deletionReason, baseRefs.toArray(new BaseRef[baseRefs.size()]));
	}

	/**
	 * For information about {@code deleteList} operation, see documentation of
	 * {@link #callDeleteRecords(DeletionReason, BaseRef...)} method.
	 *
	 * @param baseRefs References to records which should be deleted
	 * @return Write response list containing a list of WriteResponse objects, each of which contains details
	 * on the status of the delete operation and a reference to the deleted record
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public WriteResponseList callDeleteRecords(List<? extends BaseRef> baseRefs) throws RemoteException {
		return callDeleteRecords(null, baseRefs);
	}

	/**
	 * For information about {@code deleteList} operation, see documentation of
	 * {@link #callDeleteRecords(DeletionReason, BaseRef...)} method.
	 *
	 * @param deletionReason Identifies a deletion reason and deletion reason memo. This parameter supports
	 *                       the Use Deletion Reasons feature, which requires users to provide reasons when they
	 *                       delete transactions. However, even when this feature is not enabled, you must use
	 *                       this parameter with every delete request. You can provide a value of
	 *                       {@code null} in such cases.
	 * @param baseRefs       References to records which should be deleted
	 * @return List of {@code Boolean}s where {@code true} means successful deletetion and {@code false} failed deletion
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public List<Boolean> deleteRecords(@Nullable DeletionReason deletionReason, BaseRef... baseRefs) throws RemoteException {
		return com.bansi.webservices.samples.v2019_1.Utils.getSuccess(callDeleteRecords(deletionReason, baseRefs));
	}

	/**
	 * For information about {@code deleteList} operation, see documentation of
	 * {@link #callDeleteRecords(DeletionReason, BaseRef...)} method.
	 *
	 * @param baseRefs References to records which should be deleted
	 * @return List of {@code Boolean}s where {@code true} means successful deletetion and {@code false} failed deletion
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public List<Boolean> deleteRecords(BaseRef... baseRefs) throws RemoteException {
		return com.bansi.webservices.samples.v2019_1.Utils.getSuccess(callDeleteRecords(baseRefs));
	}

	/**
	 * For information about {@code deleteList} operation, see documentation of
	 * {@link #callDeleteRecords(DeletionReason, BaseRef...)} method.
	 *
	 * @param deletionReason Identifies a deletion reason and deletion reason memo. This parameter supports
	 *                       the Use Deletion Reasons feature, which requires users to provide reasons when they
	 *                       delete transactions. However, even when this feature is not enabled, you must use
	 *                       this parameter with every delete request. You can provide a value of
	 *                       {@code null} in such cases.
	 * @param baseRefs       References to records which should be deleted
	 * @return List of {@code Boolean}s where {@code true} means successful deletetion and {@code false} failed deletion
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public List<Boolean> deleteRecords(@Nullable DeletionReason deletionReason, List<? extends BaseRef> baseRefs) throws RemoteException {
		return deleteRecords(deletionReason, baseRefs.toArray(new BaseRef[baseRefs.size()]));
	}

	/**
	 * For information about {@code deleteList} operation, see documentation of
	 * {@link #callDeleteRecords(DeletionReason, BaseRef...)} method.
	 *
	 * @param baseRefs References to records which should be deleted
	 * @return List of {@code Boolean}s where {@code true} means successful deletetion and {@code false} failed deletion
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public List<Boolean> deleteRecords(List<? extends BaseRef> baseRefs) throws RemoteException {
		return deleteRecords(null, baseRefs);
	}

	/**
	 * <p>This method invokes remote operation {@code getDeleted}. You use the {@code getDeleted} operation to retrieve
	 * a list of deleted records. When you use this operation, you can filter by record type, by script ID, and by the
	 * date of the record deletion.</p>
	 * <p>The {@code getDeleted} operation can be useful when you want to synchronize information in a client application
	 * with NetSuite. For example, an Outlook client application plug-in maintains a list of contacts and synchronizes
	 * that list with NetSuite. The {@code getDeleted} operation can be used to determine contact deletions
	 * since the last synchronization with NetSuite.</p>
	 * <p>There is a known issue (no. <a href="https://system.netsuite.com/app/crm/support/issuedb/issue.nl?id=1915164">143388</a>)
	 * that filtering according to a given {@code SearchDateField} works improperly. Please check if the issue is
	 * resolved before relying on this feature.</p>
	 * <p>For more information, see
	 * <a href="https://system.netsuite.com/app/help/helpcenter.nl?fid=section_N3497592.html">getDeleted</a>
	 * operation in Help Center.</p>
	 *
	 * @param getDeletedFilter This filter lets you retrieve data based on the date, record type, and script ID
	 *                         of the deleted records.
	 * @param pageIndex        Use this argument to specify which page of results to return in your response.
	 *                         If there is only one page of results, enter 1
	 * @return Result containing following data for each deleted record:
	 * the record’s type, its internal ID, and the date the record was deleted
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public synchronized GetDeletedResult callGetDeletedRecords(GetDeletedFilter getDeletedFilter, int pageIndex) throws RemoteException {
		return getPort().getDeleted(getDeletedFilter, pageIndex);
	}

	/**
	 * For information about {@code getDeleted} operation, see documentation of
	 * {@link #callGetDeletedRecords(GetDeletedFilter, int)} method.
	 *
	 * @param getDeletedFilter This filter lets you retrieve data based on the date, record type, and script ID
	 *                         of the deleted records.
	 * @return List of deleted records found by given search criteria (deleted filter)
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public List<DeletedRecord> getDeletedRecords(GetDeletedFilter getDeletedFilter, int pageIndex) throws RemoteException {
		GetDeletedResult getDeletedResult = callGetDeletedRecords(getDeletedFilter, pageIndex);
		
		if (getDeletedResult.getDeletedRecordList().length <=0) {
			return null;
		}

		DeletedRecord[] deletedRecords = getDeletedResult.getDeletedRecordList();
		if (deletedRecords == null || deletedRecords.length == 0) {
			return Collections.emptyList();
		}
		return Arrays.asList(deletedRecords);
	}

	/**
	 * <p>This method invokes remote {@code getAll} operation. The {@code getAll} operation is used to retrieve
	 * a list of all records of the specified type. Records that support the {@code getAll} operation are listed
	 * in the {@code GetAllRecordType}.</p>
	 * <p>For more information, see
	 * <a href="https://system.netsuite.com/app/help/helpcenter.nl?fid=section_N3489077.html">getAll</a>
	 * operation in Help Center.</p>
	 *
	 * @param getAllRecordType Specifies the record type of which all records should be returned
	 * @return Response containing all records of given type
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public synchronized GetAllResult callGetAllRecords(GetAllRecordType getAllRecordType) throws RemoteException {
		return getPort().getAll(new GetAllRecord(getAllRecordType));
	}

	/**
	 * For information about {@code getAll} operation, see documentation of
	 * {@link #callGetAllRecords(GetAllRecordType)} method.
	 *
	 * @param getAllRecordType Specifies the record type of which all records should be returned
	 * @return List of all records of given type
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public List<Record> getAllRecords(GetAllRecordType getAllRecordType) throws RemoteException {
		GetAllResult getAllResult = callGetAllRecords(getAllRecordType);
		if (getAllResult.getRecordList().length<=0) {
			return null;
		}
		Record[] allRecords = getAllResult.getRecordList();
		if (allRecords == null || allRecords.length == 0) {
			return Collections.emptyList();
		}
		return Arrays.asList(allRecords);
	}

	/**
	 * <p>This method invokes remote {@code initialize} operation. Use the {@code initialize} operation to emulate
	 * the UI workflow by prepopulating fields on transaction line items with values from a related record.
	 * Your web services application can then modify only the values it needs to before submitting the record.</p>
	 * <p>For more information, see
	 * <a href="https://system.netsuite.com/app/help/helpcenter.nl?fid=section_N3508536.html">initialize</a>
	 * operation in Help Center.</p>
	 *
	 * @param initializeRecord Record which defines the initialization
	 * @return Read response containing initialized record
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public synchronized ReadResponse callInitialize(InitializeRecord initializeRecord) throws RemoteException {
		return getPort().initialize(initializeRecord);
	}

	/**
	 * For information about {@code initialize} operation, see documentation of
	 * {@link #callInitialize(InitializeRecord)} method.
	 *
	 * @param reference Reference to record from which the initialization should be done (e.g. sales order)
	 * @param type      Type of initialized record (e.g. item fulfilment)
	 * @return Read response containing initialized record of given {@code type}
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public ReadResponse callInitialize(InitializeRef reference, InitializeType type) throws RemoteException {
		InitializeRecord initializeRecord = new InitializeRecord();
		initializeRecord.setReference(reference);
		initializeRecord.setType(type);
		return callInitialize(initializeRecord);
	}

	/**
	 * For information about {@code initialize} operation, see documentation of
	 * {@link #callInitialize(InitializeRecord)} method.
	 *
	 * @param initializeRecord Record which defines the initialization
	 * @return The initialized record of desired type prepared for submitting
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public Record initialize(InitializeRecord initializeRecord) throws RemoteException {
		return callInitialize(initializeRecord).getRecord();
	}

	/**
	 * For information about {@code initialize} operation, see documentation of
	 * {@link #callInitialize(InitializeRecord)} method.
	 *
	 * @param reference Reference to record from which the initialization should be done (e.g. sales order)
	 * @param type      Type of initialized record (e.g. item fulfilment)
	 * @return The initialized record of desired {@code type} prepared for submitting
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public Record initialize(InitializeRef reference, InitializeType type) throws RemoteException {
		InitializeRecord initializeRecord = new InitializeRecord();
		initializeRecord.setReference(reference);
		initializeRecord.setType(type);
		return initialize(initializeRecord);
	}

	/**
	 * <p>This method invokes remote {@code initializeList} operation. Use the {@code initialize} operation to emulate
	 * the UI workflow by prepopulating fields on transaction line items with values from a related record.
	 * Your web services application can then modify only the values it needs to before submitting the record.
	 * This method enables to initialize more than one record within one request.</p>
	 * <p>For more information, see
	 * <a href="https://system.netsuite.com/app/help/helpcenter.nl?fid=section_N3508536.html">initializeList</a>
	 * operation in Help Center.</p>
	 *
	 * @param initializeRecords Records which define all initializations
	 * @return Read response list containing initialized records of given {@code type}s
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public synchronized ReadResponseList callInitializeList(InitializeRecord... initializeRecords) throws RemoteException {
		return getPort().initializeList(initializeRecords);
	}

	/**
	 * For information about {@code initializeList} operation, see documentation of
	 * {@link #callInitializeList(InitializeRecord...)} method.
	 *
	 * @param initializeRecords Records which define all initializations
	 * @return Read response list containing initialized records of given {@code type}s
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public ReadResponseList callInitializeList(List<? extends InitializeRecord> initializeRecords) throws RemoteException {
		return callInitializeList(initializeRecords.toArray(new InitializeRecord[initializeRecords.size()]));
	}

	/**
	 * For information about {@code initializeList} operation, see documentation of
	 * {@link #callInitializeList(InitializeRecord...)} method.
	 *
	 * @param initializeRecords Records which define all initializations
	 * @return List of the initialized records of desired {@code type}s prepared for submitting
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public List<Record> initializeList(InitializeRecord... initializeRecords) throws RemoteException {
		ReadResponseList readResponseList = callInitializeList(initializeRecords);
		ReadResponse[] readResponses = readResponseList.getReadResponse();
		if (readResponses == null) {
			return null;
		}
		return Arrays.stream(readResponses).map(ReadResponse::getRecord).collect(Collectors.toList());
	}

	/**
	 * For information about {@code initializeList} operation, see documentation of
	 * {@link #callInitializeList(InitializeRecord...)} method.
	 *
	 * @param initializeRecords Records which define all initializations
	 * @return List of the initialized records of desired {@code type}s prepared for submitting
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public List<Record> initializeList(List<? extends InitializeRecord> initializeRecords) throws RemoteException {
		return initializeList(initializeRecords.toArray(new InitializeRecord[initializeRecords.size()]));
	}

	/**
	 * <p>This method invokes remote {@code search} operation. The {@code search} operation is used to execute
	 * a search on a specific record type based on a set of criteria. You can search by defining search filter fields
	 * on the record, joined fields on an associated record, search return columns, or joined search return columns
	 * from an associated record. The results of the search can be complete records, or a select set of fields
	 * specified through search return columns.</p>
	 * <p>For more information, see
	 * <a href="https://system.netsuite.com/app/help/helpcenter.nl?fid=section_N3514306.html">search</a>
	 * operation in Help Center.</p>
	 *
	 * @param searchRecord Specifies the search. It can be basic search, join search or advanced search
	 * @return Search result
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public SearchResult callSearch(SearchRecord searchRecord) throws RemoteException {
		SearchResult searchResult;
		synchronized (this) {
			searchResult = getPort().search(searchRecord);
		}
		lastSearchJobId = getLastJobId();
		return searchResult;
	}

	/**
	 * For information about {@code search} operation, see documentation of {@link #callSearch(SearchRecord)} method.
	 *
	 * @param searchRecord Specifies the search. It can be basic search, join search or advanced search
	 * @return List of matching {@code SearchRow}s in case of advanced search or list of matching records otherwise
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public List<?> search(SearchRecord searchRecord) throws RemoteException {
		SearchResult searchResult = callSearch(searchRecord);
		return com.bansi.webservices.samples.v2019_1.Utils.getSearchResults(searchResult);
	}

	/**
	 * <p>This method invokes remote {@code searchMore} operation. The {@code searchMore} operation is used to retrieve
	 * more records after an initial search operation.</p>
	 * <p>Users who authenticate to NetSuite through {@code login} can use either {@code searchMore} or
	 * {@code searchMoreWithId} to paginate through search results. Users who authenticate to NetSuite by providing
	 * user credentials in the header of their SOAP requests can use only {@code searchMoreWithId} to paginate through
	 * search results, since {@code searchMore} requires an active session.</p>
	 * <p>For more information, see
	 * <a href="https://system.netsuite.com/app/help/helpcenter.nl?fid=section_n3522244.html">searchMore</a>
	 * operation in Help Center.</p>
	 *
	 * @param pageIndex An index that specifies which page in the search to return
	 * @return Search result containing page with index {@code pageIndex}
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public synchronized SearchResult callSearchMore(int pageIndex) throws RemoteException {
		return getPort().searchMore(pageIndex);
	}

	/**
	 * For information about {@code searchMore} operation, see documentation of {@link #callSearchMore(int)} method.
	 *
	 * @param pageIndex An index that specifies which page in the search to return
	 * @return List of matching {@code SearchRow}s in case of advanced search or list of matching records otherwise
	 * on the page with index {@code pageIndex}
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public List<?> searchMore(int pageIndex) throws RemoteException {
		return com.bansi.webservices.samples.v2019_1.Utils.getSearchResults(callSearchMore(pageIndex));
	}

	/**
	 * <p>This method invokes remote {@code searchNext} operation. The {@code searchNext} operation is used to retrieve
	 * the next set of records after an initial search operation.</p>
	 * <p>This operation can be used only with {@code login}. It does not work with other kind of authentication.</p>
	 * <p>For more information, see
	 * <a href="https://system.netsuite.com/app/help/helpcenter.nl?fid=section_n3524037.html">searchNext</a>
	 * operation in Help Center.</p>
	 *
	 * @return Next page of search result
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public synchronized SearchResult callSearchNext() throws RemoteException {
		return getPort().searchNext();
	}

	/**
	 * For information about {@code searchNext} operation, see documentation of {@link #callSearchNext()} method.
	 *
	 * @return List of matching {@code SearchRow}s in case of advanced search or list of matching records otherwise
	 * for the next page of search result
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public List<?> searchNext() throws RemoteException {
		return com.bansi.webservices.samples.v2019_1.Utils.getSearchResults(callSearchNext());
	}

	/**
	 * For information about {@code searchMoreWithId} operation, see documentation of
	 * {@link #callSearchMoreWithId(String, int)} method.
	 *
	 * @param pageIndex An index that specifies which page in the search to return
	 * @return Search result for page with index {@code pageIndex}
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public SearchResult callSearchMoreWithId(int pageIndex) throws RemoteException {
		if (lastSearchJobId == null) {
			throw new IllegalStateException("Operation search has to be called before calling callSearchMoreWithId");
		}
		return callSearchMoreWithId(lastSearchJobId, pageIndex);
	}

	/**
	 * For information about {@code searchMoreWithId} operation, see documentation of
	 * {@link #callSearchMoreWithId(String, int)} method.
	 *
	 * @param pageIndex An index that specifies which page in the search to return
	 * @return List of matching {@code SearchRow}s in case of advanced search or list of matching records otherwise
	 * for the page with index {@code pageIndex} of the search result
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public List<?> searchMoreWithId(int pageIndex) throws RemoteException {
		return com.bansi.webservices.samples.v2019_1.Utils.getSearchResults(callSearchMoreWithId(pageIndex));
	}

	/**
	 * <p>This method invokes remote {@code searchMoreWithId} operation. Users who authenticate to NetSuite by providing
	 * their credentials in the SOAP header of their requests must use {@code searchMoreWithId} to retrieve search
	 * results that span multiple pages. They cannot use {@code searchMore} or {@code searchNext}, since both operations
	 * require an active session.</p>
	 * <p>For more information, see
	 * <a href="https://system.netsuite.com/app/help/helpcenter.nl?fid=section_n3523074.html">searchMoreWithId</a>
	 * operation in Help Center.</p>
	 *
	 * @param jobId     The search result ID (ID included in the response for initial search)
	 * @param pageIndex An index that specifies which page in the search to return
	 * @return Search result for page with index {@code pageIndex}
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public synchronized SearchResult callSearchMoreWithId(String jobId, int pageIndex) throws RemoteException {
		return getPort().searchMoreWithId(jobId, pageIndex);
	}

	/**
	 * For information about {@code searchMoreWithId} operation, see documentation of
	 * {@link #callSearchMoreWithId(String, int)} method.
	 *
	 * @param jobId     The search result ID (ID included in the response for initial search)
	 * @param pageIndex An index that specifies which page in the search to return
	 * @return List of matching {@code SearchRow}s in case of advanced search or list of matching records otherwise
	 * for the page with index {@code pageIndex} of the search result
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public List<?> searchMoreWithId(String jobId, int pageIndex) throws RemoteException {
		return com.bansi.webservices.samples.v2019_1.Utils.getSearchResults(callSearchMoreWithId(jobId, pageIndex));
	}

	/**
	 * <p>This method searches for all records according to provided {@code searchRecord}. It invokes remote
	 * {@code search} operation followed by particular number of {@code searchMoreWithId} operations. Operation
	 * {@code searchMoreWithId} is called {@code n} times ({@code n} is number of pages returned by the search
	 * and it depends on {@code pageSize} preference).</p>
	 * <p>For more information about remote {@code search} operation, see {@link #callSearch(SearchRecord)}.<br/>
	 * For more information about remote {@code searchMoreWithId} operation, see {@link #callSearchMoreWithId(String, int)}.</p>
	 *
	 * @param searchRecord Specifies the search. It can be basic search, join search or advanced search
	 * @return List of matching {@code SearchRow}s in case of advanced search or list of matching records otherwise
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public List<?> searchAll(SearchRecord searchRecord) throws RemoteException {
		SearchResult searchResult = callSearch(searchRecord);
		List<?> firstPageResults = com.bansi.webservices.samples.v2019_1.Utils.getSearchResults(searchResult);
		if (firstPageResults == null) {
			return null;
		}
		if (firstPageResults.isEmpty()) {
			return firstPageResults;
		}
		final List<Object> foundRecords = new ArrayList<>(searchResult.getTotalRecords());
		foundRecords.addAll(firstPageResults);

		final int totalPages = searchResult.getTotalPages();
		final String searchId = searchResult.getSearchId();

		for (int pageIndex = 2; pageIndex <= totalPages; pageIndex++) {
			SearchResult searchMoreResult = callSearchMoreWithId(searchId, pageIndex);
			List<?> otherPageResults = com.bansi.webservices.samples.v2019_1.Utils.getSearchResults(searchMoreResult);
			if (otherPageResults == null) {
				// Something went wrong so the search result is not complete
				// thus we return rather null value to indicate a problem
				return null;
			}
			foundRecords.addAll(otherPageResults);
		}

		return foundRecords;
	}

	/**
	 * <p>This method invokes remote {@code asyncAddList} operation.</p>
	 * <p>For more information, see
	 * <a href="https://system.netsuite.com/app/help/helpcenter.nl?fid=section_3770809638.html">Asynchronous Request
	 * Processing</a> page in Help Center.</p>
	 *
	 * @param records Records to be created
	 * @return Result indicating the status of the asynchronous request
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public synchronized AsyncStatusResult callAsyncAddList(Record... records) throws RemoteException {
		return getPort().asyncAddList(records);
	}

	/**
	 * For information about {@code asyncAddList} operation, see documentation of
	 * {@link #callAsyncAddList(Record...)} method.
	 *
	 * @param records Records to be created
	 * @return Result indicating the status of the asynchronous request
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public AsyncStatusResult callAsyncAddList(List<? extends Record> records) throws RemoteException {
		return callAsyncAddList(records.toArray(new Record[records.size()]));
	}

	/**
	 * For information about {@code asyncAddList} operation, see documentation of
	 * {@link #callAsyncAddList(Record...)} method.
	 *
	 * @param records Records to be created
	 * @return Job ID of the asynchronous request
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public String asyncAddList(Record... records) throws RemoteException {
		return callAsyncAddList(records).getJobId();
	}

	/**
	 * For information about {@code asyncAddList} operation, see documentation of
	 * {@link #callAsyncAddList(Record...)} method.
	 *
	 * @param records Records to be created
	 * @return Job ID of the asynchronous request
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public String asyncAddList(List<? extends Record> records) throws RemoteException {
		return asyncAddList(records.toArray(new Record[records.size()]));
	}

	/**
	 * <p>This method invokes remote {@code asyncGetList} operation.</p>
	 * <p>For more information, see
	 * <a href="https://system.netsuite.com/app/help/helpcenter.nl?fid=section_3770809638.html">Asynchronous Request
	 * Processing</a> page in Help Center.</p>
	 *
	 * @param refs Records to be delivered
	 * @return Result indicating the status of the asynchronous request
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public synchronized AsyncStatusResult callAsyncGetList(BaseRef... refs) throws RemoteException {
		return getPort().asyncGetList(refs);
	}

	/**
	 * For information about {@code asyncGetList} operation, see documentation of
	 * {@link #callAsyncGetList(BaseRef...)} method.
	 *
	 * @param refs Records to be delivered
	 * @return Result indicating the status of the asynchronous request
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public AsyncStatusResult callAsyncGetList(List<? extends BaseRef> refs) throws RemoteException {
		return callAsyncGetList(refs.toArray(new BaseRef[refs.size()]));
	}

	/**
	 * For information about {@code asyncGetList} operation, see documentation of
	 * {@link #callAsyncGetList(BaseRef...)} method.
	 *
	 * @param refs Records to be delivered
	 * @return Job ID of the asynchronous request
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public String asyncGetList(BaseRef... refs) throws RemoteException {
		return callAsyncGetList(refs).getJobId();
	}

	/**
	 * For information about {@code asyncGetList} operation, see documentation of
	 * {@link #callAsyncGetList(BaseRef...)} method.
	 *
	 * @param refs Records to be delivered
	 * @return Job ID of the asynchronous request
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public String asyncGetList(List<? extends BaseRef> refs) throws RemoteException {
		return asyncGetList(refs.toArray(new BaseRef[refs.size()]));
	}

	/**
	 * <p>This method invokes remote {@code asyncUpdateList} operation.</p>
	 * <p>For more information, see
	 * <a href="https://system.netsuite.com/app/help/helpcenter.nl?fid=section_3770809638.html">Asynchronous Request
	 * Processing</a> page in Help Center.</p>
	 *
	 * @param records Records to be updated
	 * @return Result indicating the status of the asynchronous request
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public synchronized AsyncStatusResult callAsyncUpdateList(Record... records) throws RemoteException {
		return getPort().asyncUpdateList(records);
	}

	/**
	 * For information about {@code asyncUpdateList} operation, see documentation of
	 * {@link #callAsyncUpdateList(Record...)} method.
	 *
	 * @param records Records to be updated
	 * @return Result indicating the status of the asynchronous request
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public AsyncStatusResult callAsyncUpdateList(List<? extends Record> records) throws RemoteException {
		return callAsyncUpdateList(records.toArray(new Record[records.size()]));
	}

	/**
	 * For information about {@code asyncUpdateList} operation, see documentation of
	 * {@link #callAsyncUpdateList(Record...)} method.
	 *
	 * @param records Records to be updated
	 * @return Job ID of the asynchronous request
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public String asyncUpdateList(Record... records) throws RemoteException {
		return callAsyncUpdateList(records).getJobId();
	}

	/**
	 * For information about {@code asyncUpdateList} operation, see documentation of
	 * {@link #callAsyncUpdateList(Record...)} method.
	 *
	 * @param records Records to be updated
	 * @return Job ID of the asynchronous request
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public String asyncUpdateList(List<? extends Record> records) throws RemoteException {
		return asyncUpdateList(records.toArray(new Record[records.size()]));
	}

	/**
	 * <p>This method invokes remote {@code asyncUpsertList} operation.</p>
	 * <p>For more information, see
	 * <a href="https://system.netsuite.com/app/help/helpcenter.nl?fid=section_3770809638.html">Asynchronous Request
	 * Processing</a> page in Help Center.</p>
	 *
	 * @param records Records to be created or updated
	 * @return Result indicating the status of the asynchronous request
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public synchronized AsyncStatusResult callAsyncUpsertList(Record... records) throws RemoteException {
		return getPort().asyncUpsertList(records);
	}

	/**
	 * For information about {@code asyncUpsertList} operation, see documentation of
	 * {@link #callAsyncUpsertList(Record...)} method.
	 *
	 * @param records Records to be created or updated
	 * @return Result indicating the status of the asynchronous request
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public AsyncStatusResult callAsyncUpsertList(List<? extends Record> records) throws RemoteException {
		return callAsyncUpsertList(records.toArray(new Record[records.size()]));
	}

	/**
	 * For information about {@code asyncUpsertList} operation, see documentation of
	 * {@link #callAsyncUpsertList(Record...)} method.
	 *
	 * @param records Records to be created or updated
	 * @return Job ID of the asynchronous request
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public String asyncUpsertList(Record... records) throws RemoteException {
		return callAsyncUpsertList(records).getJobId();
	}

	/**
	 * For information about {@code asyncUpsertList} operation, see documentation of
	 * {@link #callAsyncUpsertList(Record...)} method.
	 *
	 * @param records Records to be created or updated
	 * @return Job ID of the asynchronous request
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public String asyncUpsertList(List<? extends Record> records) throws RemoteException {
		return asyncUpsertList(records.toArray(new Record[records.size()]));
	}

	/**
	 * <p>This method invokes remote {@code asyncDeleteList} operation.</p>
	 * <p>For more information, see
	 * <a href="https://system.netsuite.com/app/help/helpcenter.nl?fid=section_3770809638.html">Asynchronous Request
	 * Processing</a> page in Help Center.</p>
	 *
	 * @param deletionReason Reason of the deletion. Can be {@code null}
	 * @param refs           References to records which should be deleted
	 * @return Result indicating the status of the asynchronous request
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public synchronized AsyncStatusResult callAsyncDeleteList(@Nullable DeletionReason deletionReason, BaseRef... refs) throws RemoteException {
		return getPort().asyncDeleteList(refs, deletionReason);
	}

	/**
	 * For information about {@code asyncDeleteList} operation, see documentation of
	 * {@link #callAsyncDeleteList(DeletionReason, BaseRef...)} method.
	 *
	 * @param refs References to records which should be deleted
	 * @return Result indicating the status of the asynchronous request
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public AsyncStatusResult callAsyncDeleteList(BaseRef... refs) throws RemoteException {
		return callAsyncDeleteList(null, refs);
	}

	/**
	 * For information about {@code asyncDeleteList} operation, see documentation of
	 * {@link #callAsyncDeleteList(DeletionReason, BaseRef...)} method.
	 *
	 * @param deletionReason Reason of the deletion. Can be {@code null}
	 * @param refs           References to records which should be deleted
	 * @return Result indicating the status of the asynchronous request
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public AsyncStatusResult callAsyncDeleteList(@Nullable DeletionReason deletionReason, List<? extends BaseRef> refs) throws RemoteException {
		return callAsyncDeleteList(deletionReason, refs.toArray(new BaseRef[refs.size()]));
	}

	/**
	 * For information about {@code asyncDeleteList} operation, see documentation of
	 * {@link #callAsyncDeleteList(DeletionReason, BaseRef...)} method.
	 *
	 * @param refs References to records which should be deleted
	 * @return Result indicating the status of the asynchronous request
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public AsyncStatusResult callAsyncDeleteList(List<? extends BaseRef> refs) throws RemoteException {
		return callAsyncDeleteList(null, refs);
	}

	/**
	 * For information about {@code asyncDeleteList} operation, see documentation of
	 * {@link #callAsyncDeleteList(DeletionReason, BaseRef...)} method.
	 *
	 * @param refs References to records which should be deleted
	 * @return Job ID of the asynchronous request
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public String asyncDeleteList(BaseRef... refs) throws RemoteException {
		return callAsyncDeleteList(refs).getJobId();
	}

	/**
	 * For information about {@code asyncDeleteList} operation, see documentation of
	 * {@link #callAsyncDeleteList(DeletionReason, BaseRef...)} method.
	 *
	 * @param refs References to records which should be deleted
	 * @return Job ID of the asynchronous request
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public String asyncDeleteList(List<? extends BaseRef> refs) throws RemoteException {
		return asyncDeleteList(refs.toArray(new BaseRef[refs.size()]));
	}

	/**
	 * <p>This method invokes remote {@code asyncSearch} operation.</p>
	 * <p>For more information, see
	 * <a href="https://system.netsuite.com/app/help/helpcenter.nl?fid=section_3770809638.html">Asynchronous Request
	 * Processing</a> page in Help Center.</p>
	 *
	 * @param searchRecord Record defining the search
	 * @return Result indicating the status of the asynchronous request
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public synchronized AsyncStatusResult callAsyncSearch(SearchRecord searchRecord) throws RemoteException {
		return getPort().asyncSearch(searchRecord);
	}

	/**
	 * For information about {@code asyncSearch} operation, see documentation of
	 * {@link #callAsyncSearch(SearchRecord)} method.
	 *
	 * @param searchRecord Record defining the search
	 * @return Job ID of the asynchronous request
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public String asyncSearch(SearchRecord searchRecord) throws RemoteException {
		return callAsyncSearch(searchRecord).getJobId();
	}

	/**
	 * <p>This method invokes remote {@code asyncInitializeList} operation.</p>
	 * <p>For more information, see
	 * <a href="https://system.netsuite.com/app/help/helpcenter.nl?fid=section_3770809638.html">Asynchronous Request
	 * Processing</a> page in Help Center.</p>
	 *
	 * @param initializeRecords Records defining the initializations
	 * @return Result indicating the status of the asynchronous request
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public synchronized AsyncStatusResult callAsyncInitializeList(InitializeRecord... initializeRecords) throws RemoteException {
		return getPort().asyncInitializeList(initializeRecords);
	}

	/**
	 * For information about {@code asyncInitializeList} operation, see documentation of
	 * {@link #callAsyncInitializeList(InitializeRecord...)} method.
	 *
	 * @param initializeRecords Records defining the initializations
	 * @return Result indicating the status of the asynchronous request
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public AsyncStatusResult callAsyncInitializeList(List<? extends InitializeRecord> initializeRecords) throws RemoteException {
		return callAsyncInitializeList(initializeRecords.toArray(new InitializeRecord[initializeRecords.size()]));
	}

	/**
	 * For information about {@code asyncInitializeList} operation, see documentation of
	 * {@link #callAsyncInitializeList(InitializeRecord...)} method.
	 *
	 * @param initializeRecords Records defining the initializations
	 * @return Job ID of the asynchronous request
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public String asyncInitializeList(InitializeRecord... initializeRecords) throws RemoteException {
		return callAsyncInitializeList(initializeRecords).getJobId();
	}

	/**
	 * For information about {@code asyncInitializeList} operation, see documentation of
	 * {@link #callAsyncInitializeList(InitializeRecord...)} method.
	 *
	 * @param initializeRecords Records defining the initializations
	 * @return Job ID of the asynchronous request
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public String asyncInitializeList(List<? extends InitializeRecord> initializeRecords) throws RemoteException {
		return asyncInitializeList(initializeRecords.toArray(new InitializeRecord[initializeRecords.size()]));
	}

	/**
	 * <p>This method invokes remote {@code checkAsyncStatus} operation.</p>
	 * <p>For more information, see
	 * <a href="https://system.netsuite.com/app/help/helpcenter.nl?fid=section_N3485891.html">checkAsyncStatus</a>
	 * operation in Help Center.</p>
	 *
	 * @param jobId ID of asynchronous request to be checked
	 * @return Result indicating the status of the asynchronous request
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public synchronized AsyncStatusResult callCheckAsyncStatus(String jobId) throws RemoteException {
		return getPort().checkAsyncStatus(jobId);
	}

	/**
	 * For information about {@code checkAsyncStatus} operation, see documentation of
	 * {@link #callCheckAsyncStatus(String)} method.
	 *
	 * @param jobId ID of asynchronous request to be checked
	 * @return Status of the asynchronous request
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public AsyncStatusType checkAsyncStatus(String jobId) throws RemoteException {
		return callCheckAsyncStatus(jobId).getStatus();
	}

	/**
	 * <p>This method invokes remote {@code getAsyncResult} operation.</p>
	 * <p>For more information, see
	 * <a href="https://system.netsuite.com/app/help/helpcenter.nl?fid=section_n3489563.html">getAsyncResult</a>
	 * operation in Help Center.</p>
	 *
	 * @param jobId     ID of asynchronous request whose result should be delivered
	 * @param pageIndex Index of the page of the result which should be delivered
	 * @return Result of the asynchronous request
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public synchronized AsyncResult callGetAsyncResult(String jobId, int pageIndex) throws RemoteException {
		return getPort().getAsyncResult(jobId, pageIndex);
	}

	/**
	 * For information about {@code getAsyncResult} operation, see documentation of
	 * {@link #callGetAsyncResult(String, int)} method.
	 *
	 * @param jobId     ID of asynchronous request whose result should be delivered
	 * @param pageIndex Index of the page of the result which should be delivered
	 * @return Result of the asynchronous request
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public AsyncResult getAsyncResult(String jobId, int pageIndex) throws RemoteException {
		return callGetAsyncResult(jobId, pageIndex);
	}

	/**
	 * <p>This method invokes remote {@code attach} operation. The attach and detach operations can be used to define
	 * or remove a relationship between two records. For example, a Contact record can be associated with a Partner
	 * record, or an Opportunity record can be associated with a Customer record.</p>
	 * <p>For more information, see
	 * <a href="https://system.netsuite.com/app/help/helpcenter.nl?fid=section_N3481947.html">attach</a>
	 * operation in Help Center.</p>
	 *
	 * @param attachReference Defines relationship between two records
	 * @return Write response
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public synchronized WriteResponse callAttach(AttachReference attachReference) throws RemoteException {
		return getPort().attach(attachReference);
	}

	/**
	 * For information about {@code attach} operation, see documentation of
	 * {@link #callAttach(AttachReference)} method.
	 *
	 * @param attachTo       Reference to record which {@code attachedRecord} should be attached to
	 * @param attachedRecord Reference to record which should be attached to {@code attachTo}
	 * @return Write response
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public WriteResponse callAttach(BaseRef attachTo, BaseRef attachedRecord) throws RemoteException {
		AttachBasicReference attachReference = new AttachBasicReference();
		attachReference.setAttachTo(attachTo);
		attachReference.setAttachedRecord(attachedRecord);
		return callAttach(attachReference);
	}

	/**
	 * For information about {@code attach} operation, see documentation of
	 * {@link #callAttach(AttachReference)} method.
	 *
	 * @param attachReference Defines relationship between two records
	 * @return {@code true} if record was successfully attached, {@code false} otherwise
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public boolean attach(AttachReference attachReference) throws RemoteException {
		WriteResponse writeResponse = callAttach(attachReference);
		Boolean isIsSuccess = true;
		for (StatusDetail sd : writeResponse.getStatus()) {
			isIsSuccess = !sd.getAfterSubmitFailed() && isIsSuccess;
		}
		
		return isIsSuccess;
	}

	/**
	 * For information about {@code attach} operation, see documentation of
	 * {@link #callAttach(AttachReference)} method.
	 *
	 * @param attachTo       Reference to record which {@code attachedRecord} should be attached to
	 * @param attachedRecord Reference to record which should be attached to {@code attachTo}
	 * @return {@code true} if record was successfully attached, {@code false} otherwise
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public boolean attach(BaseRef attachTo, BaseRef attachedRecord) throws RemoteException {
		AttachBasicReference attachReference = new AttachBasicReference();
		attachReference.setAttachTo(attachTo);
		attachReference.setAttachedRecord(attachedRecord);
		return attach(attachReference);
	}

	/**
	 * <p>This method invokes remote {@code detach} operation. The attach and detach operations can be used to define
	 * or remove a relationship between two records. For example, a Contact record can be associated with a Partner
	 * record, or an Opportunity record can be associated with a Customer record.</p>
	 * <p>For more information, see
	 * <a href="https://system.netsuite.com/app/help/helpcenter.nl?fid=section_N3481947.html">detach</a>
	 * operation in Help Center.</p>
	 *
	 * @param detachReference Defines which relationship between two records should be removed
	 * @return Write response
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public synchronized WriteResponse callDetach(DetachReference detachReference) throws RemoteException {
		return getPort().detach(detachReference);
	}

	/**
	 * For information about {@code detach} operation, see documentation of
	 * {@link #callDetach(DetachReference)} method.
	 *
	 * @param detachFrom     Reference to record from which the {@code detachedRecord} should be detached
	 * @param detachedRecord Reference to record which should be detached from {@code detachFrom}
	 * @return Write response
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public WriteResponse callDetach(BaseRef detachFrom, BaseRef detachedRecord) throws RemoteException {
		DetachBasicReference detachReference = new DetachBasicReference();
		detachReference.setDetachFrom(detachFrom);
		detachReference.setDetachedRecord(detachedRecord);
		return callDetach(detachReference);
	}

	/**
	 * For information about {@code detach} operation, see documentation of
	 * {@link #callDetach(DetachReference)} method.
	 *
	 * @param detachReference Defines which relationship between two records should be removed
	 * @return {@code true} if record was successfully detached, {@code false} otherwise
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public boolean detach(DetachReference detachReference) throws RemoteException {
		WriteResponse writeResponse = callDetach(detachReference);
		Boolean isIsSuccess = true;
		for (StatusDetail sd : writeResponse.getStatus()) {
			isIsSuccess = !sd.getAfterSubmitFailed() && isIsSuccess;
		}
		
		return isIsSuccess;
	}

	/**
	 * For information about {@code detach} operation, see documentation of
	 * {@link #callDetach(DetachReference)} method.
	 *
	 * @param detachFrom     Reference to record from which the {@code detachedRecord} should be detached
	 * @param detachedRecord Reference to record which should be detached from {@code detachFrom}
	 * @return {@code true} if record was successfully detached, {@code false} otherwise
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public boolean detach(BaseRef detachFrom, BaseRef detachedRecord) throws RemoteException {
		DetachBasicReference detachReference = new DetachBasicReference();
		detachReference.setDetachFrom(detachFrom);
		detachReference.setDetachedRecord(detachedRecord);
		return detach(detachReference);
	}

	/**
	 * <p>Attaches contact to other record.</p>
	 * <p>For information about {@code attach} operation, see documentation of
	 * {@link #callAttach(AttachReference)} method.</p>
	 *
	 * @param attachTo    Reference to record which contact should be attached to
	 * @param contact     Contact which should be attached to {@code attachTo}
	 * @param contactRole Role of contact which should be attached
	 * @return Write response
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public WriteResponse callAttachContact(BaseRef attachTo, RecordRef contact, RecordRef contactRole) throws RemoteException {
		AttachContactReference attachContactReference = new AttachContactReference();
		attachContactReference.setAttachTo(attachTo);
		attachContactReference.setContact(contact);
		attachContactReference.setContactRole(contactRole);
		return callAttach(attachContactReference);
	}

	/**
	 * <p>Attaches contact to other record.</p>
	 * <p>For information about {@code attach} operation, see documentation of
	 * {@link #callAttach(AttachReference)} method.</p>
	 *
	 * @param attachTo Reference to record which contact should be attached to
	 * @param contact  Contact which should be attached to {@code attachTo}
	 * @return Write response
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public WriteResponse callAttachContact(BaseRef attachTo, RecordRef contact) throws RemoteException {
		return callAttachContact(attachTo, contact, null);
	}

	/**
	 * <p>Attaches contact to other record.</p>
	 * <p>For information about {@code attach} operation, see documentation of
	 * {@link #callAttach(AttachReference)} method.</p>
	 *
	 * @param attachTo    Reference to record which contact should be attached to
	 * @param contact     Contact which should be attached to {@code attachTo}
	 * @param contactRole Role of contact which should be attached
	 * @return {@code true} if contact was successfully attached to the record, {@code false} otherwise
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public boolean attachContact(BaseRef attachTo, RecordRef contact, RecordRef contactRole) throws RemoteException {
		WriteResponse writeResponse = callAttachContact(attachTo, contact, contactRole);
		Boolean isIsSuccess = true;
		for (StatusDetail sd : writeResponse.getStatus()) {
			isIsSuccess = !sd.getAfterSubmitFailed() && isIsSuccess;
		}
		
		return  isIsSuccess;
	}

	/**
	 * <p>Attaches contact to other record.</p>
	 * <p>For information about {@code attach} operation, see documentation of
	 * {@link #callAttach(AttachReference)} method.</p>
	 *
	 * @param attachTo Reference to record which contact should be attached to
	 * @param contact  Contact which should be attached to {@code attachTo}
	 * @return {@code true} if contact was successfully attached to the record, {@code false} otherwise
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public boolean attachContact(BaseRef attachTo, RecordRef contact) throws RemoteException {
		return attachContact(attachTo, contact, null);
	}

	/**
	 * <p>This method invokes remote {@code getServerTime} operation. This operation takes no arguments and returns the
	 * NetSuite server time in GMT, regardless of a user's time zone. Developers do not have to rely on client time when
	 * writing synchronization procedures because the client time may not be in sync with the NetSuite server time.</p>
	 * <p>For more information, see
	 * <a href="https://system.netsuite.com/app/help/helpcenter.nl?fid=section_n3508018.html">getServerTime</a>
	 * operation in Help Center.</p>
	 *
	 * @return Response which contains time of server in GMT
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public synchronized GetServerTimeResult callGetServerTime() throws RemoteException {
		return getPort().getServerTime();
	}

	/**
	 * <p>For information about {@code getServerTime} operation, see documentation of
	 * {@link #callGetServerTime()} method.</p>
	 *
	 * @return Calendar set to current server time in GMT or {@code null} if request was not successful
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public Calendar getServerTime() throws RemoteException {
		GetServerTimeResult serverTimeResult = callGetServerTime();
		Boolean isIsSuccess = true;
		for (StatusDetail sd : serverTimeResult.getStatus()) {
			isIsSuccess = !sd.getAfterSubmitFailed() && isIsSuccess;
		}
		if (isIsSuccess) {
			return serverTimeResult.getServerTime();
		}
		return null;
	}

	/**
	 * <p>This method invokes remote {@code getDataCenterUrls} operation. You use the {@code getDataCenterUrls}
	 * operation to obtain the correct URL for external client access to NetSuite.</p>
	 * <p>This operation is critical because NetSuite hosts customer accounts in multiple data centers. The correct URL
	 * for web services access varies depending on the data center hosting the account. Your integration must
	 * incorporate logic that dynamically determines the correct URL.</p>
	 * <p>For more information, see
	 * <a href="https://system.netsuite.com/app/help/helpcenter.nl?fid=section_n3494684.html">getDataCenterUrls</a>
	 * operation in Help Center.</p>
	 *
	 * @param companyId ID of company whose URLs should be retrieved
	 * @return Response with correct URLs for Web Services, RESTlets and system domains
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public synchronized GetDataCenterUrlsResult callGetDataCenterUrls(String companyId) throws RemoteException {
		return getPort().getDataCenterUrls(companyId);
	}

	/**
	 * <p>For information about {@code getDataCenterUrls} operation, see documentation of
	 * {@link #callGetDataCenterUrls(String)} method.</p>
	 *
	 * @param companyId ID of company whose URLs should be retrieved
	 * @return Instance of {@code DataCenterUrls} containing correct URLs for Web Services, RESTlets and system domains
	 * or {@code null} if request was not successful
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public DataCenterUrls getDataCenterUrls(String companyId) throws RemoteException {
		GetDataCenterUrlsResult dataCenterUrlsResult = callGetDataCenterUrls(companyId);
		Boolean isIsSuccess = true;
		for (StatusDetail sd : dataCenterUrlsResult.getStatus()) {
			isIsSuccess = !sd.getAfterSubmitFailed() && isIsSuccess;
		}
		if (isIsSuccess) {
			return dataCenterUrlsResult.getDataCenterUrls();
		}
		return null;
	}

	/**
	 * <p>This method invokes remote {@code changeEmail} operation. Use this operation to change
	 * a user's email address.</p>
	 * <p>For more information, see
	 * <a href="https://system.netsuite.com/app/help/helpcenter.nl?fid=section_n3484955.html">changeEmail</a>
	 * operation in Help Center.</p>
	 *
	 * @param changeEmail {@code ChangeEmail} object containing information about change of email
	 * @return Session response
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public synchronized SessionResponse callChangeEmail(ChangeEmail changeEmail) throws RemoteException {
		return getPort().changeEmail(changeEmail);
	}

	/**
	 * <p>For information about {@code changeEmail} operation, see documentation of
	 * {@link #callChangeEmail(ChangeEmail)} method.</p>
	 *
	 * @param password        Current user's password
	 * @param newEmail        New email
	 * @param justThisAccount If the change should be made just for the currently authenticated account
	 * @return Session response
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public SessionResponse callChangeEmail(String password, String newEmail, boolean justThisAccount) throws RemoteException {
		ChangeEmail changeEmail = new ChangeEmail();
		changeEmail.setCurrentPassword(password);
		changeEmail.setNewEmail(newEmail);
		changeEmail.setNewEmail2(newEmail);
		changeEmail.setJustThisAccount(justThisAccount);
		return callChangeEmail(changeEmail);
	}

	/**
	 * <p>For information about {@code changeEmail} operation, see documentation of
	 * {@link #callChangeEmail(ChangeEmail)} method.</p>
	 * <p>Email is changed just for currently authenticated account used for this client.</p>
	 *
	 * @param password Current user's password
	 * @param newEmail New email
	 * @return Session response
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public SessionResponse callChangeEmail(String password, String newEmail) throws RemoteException {
		return callChangeEmail(password, newEmail, true);
	}

	/**
	 * Checks given {@code SessionResponse} for success.
	 *
	 * @param sessionResponse Session response to be checked
	 * @return {@code true} if given {@code sessionResponse} was successful, {@code false} otherwise
	 */
	private boolean getSuccessFromSessionResponse(SessionResponse sessionResponse) {
		Boolean isIsSuccess = true;
		for (StatusDetail sd : sessionResponse.getStatus()) {
			isIsSuccess = !sd.getAfterSubmitFailed() && isIsSuccess;
		}
		
		return  isIsSuccess;
	}

	/**
	 * <p>For information about {@code changeEmail} operation, see documentation of
	 * {@link #callChangeEmail(ChangeEmail)} method.</p>
	 *
	 * @param changeEmail {@code ChangeEmail} object containing information about change of email
	 * @return {@code true} if email was successfully changed, {@code false} otherwise
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public boolean changeEmail(ChangeEmail changeEmail) throws RemoteException {
		return getSuccessFromSessionResponse(callChangeEmail(changeEmail));
	}

	/**
	 * <p>For information about {@code changeEmail} operation, see documentation of
	 * {@link #callChangeEmail(ChangeEmail)} method.</p>
	 *
	 * @param password        Current user's password
	 * @param newEmail        New email
	 * @param justThisAccount If the change should be made just for the currently authenticated account
	 * @return {@code true} if email was successfully changed, {@code false} otherwise
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public boolean changeEmail(String password, String newEmail, boolean justThisAccount) throws RemoteException {
		return getSuccessFromSessionResponse(callChangeEmail(password, newEmail, justThisAccount));
	}

	/**
	 * <p>For information about {@code changeEmail} operation, see documentation of
	 * {@link #callChangeEmail(ChangeEmail)} method.</p>
	 * <p>Email is changed just for currently authenticated account used for this client.</p>
	 *
	 * @param password Current user's password
	 * @param newEmail New email
	 * @return {@code true} if email was successfully changed, {@code false} otherwise
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public boolean changeEmail(String password, String newEmail) throws RemoteException {
		return getSuccessFromSessionResponse(callChangeEmail(password, newEmail));
	}

	/**
	 * <p>This method invokes remote {@code changePassword} operation. Use this operation to change a user's
	 * NetSuite password. Password is changed for all accounts assigned to user's email address.</p>
	 * <p>For more information, see
	 * <a href="https://system.netsuite.com/app/help/helpcenter.nl?fid=section_n3485424.html">changePassword</a>
	 * operation in Help Center.</p>
	 *
	 * @param changePassword Object which holds information about changing password
	 * @return Session response
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public synchronized SessionResponse callChangePassword(ChangePassword changePassword) throws RemoteException {
		return getPort().changePassword(changePassword);
	}

	/**
	 * <p>For information about {@code changePassword} operation, see documentation of
	 * {@link #callChangePassword(ChangePassword)} method.</p>
	 *
	 * @param currentPassword Current password
	 * @param newPassword     New password
	 * @return Session response
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public SessionResponse callChangePassword(String currentPassword, String newPassword) throws RemoteException {
		ChangePassword changePassword = new ChangePassword();
		changePassword.setCurrentPassword(currentPassword);
		changePassword.setNewPassword(newPassword);
		changePassword.setNewPassword2(newPassword);
		return callChangePassword(changePassword);
	}

	/**
	 * <p>For information about {@code changePassword} operation, see documentation of
	 * {@link #callChangePassword(ChangePassword)} method.</p>
	 *
	 * @param changePassword Object which holds information about changing password
	 * @return {@code true} if request for change of password was successful, {@code false} otherwise
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public boolean changePassword(ChangePassword changePassword) throws RemoteException {
		return getSuccessFromSessionResponse(callChangePassword(changePassword));
	}

	/**
	 * <p>For information about {@code changePassword} operation, see documentation of
	 * {@link #callChangePassword(ChangePassword)} method.</p>
	 *
	 * @param currentPassword Current password
	 * @param newPassword     New password
	 * @return {@code true} if request for change of password was successful, {@code false} otherwise
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public boolean changePassword(String currentPassword, String newPassword) throws RemoteException {
		return getSuccessFromSessionResponse(callChangePassword(currentPassword, newPassword));
	}

	/**
	 * <p>This method invokes remote {@code getSelectValue} operation. Use this operation to retrieve valid select
	 * options for a given {@code RecordRef}, {@code CustomRecordRef}, or enumerated static field. This is useful if you
	 * are writing an application that needs to mimic NetSuite UI logic, if the referenced record type is not yet
	 * exposed in SuiteTalk, or when the logged-in user's role does not have permission to the instances
	 * of the referenced record type. A call to {@code getSelectValue} may return different results
	 * for the same field for different roles.</p>
	 * <p>For more information, see
	 * <a href="https://system.netsuite.com/app/help/helpcenter.nl?fid=section_n3504236.html">getSelectValue</a>
	 * operation in Help Center.</p>
	 *
	 * @param getSelectValueFieldDescription Object which holds parameters for {@code getSelectValue} operation
	 * @param pageIndex                      Index of desired page. To define a page size, use {@link #setPageSize(int)}
	 * @return Object holding valid values for requested field
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public synchronized GetSelectValueResult callGetSelectValue(GetSelectValueFieldDescription getSelectValueFieldDescription, int pageIndex)
			throws RemoteException {
		return getPort().getSelectValue(getSelectValueFieldDescription, pageIndex);
	}

	/**
	 * <p>For information about {@code getSelectValue} operation, see documentation of
	 * {@link #callGetSelectValue(GetSelectValueFieldDescription, int)} method.</p>
	 *
	 * @param getSelectValueFieldDescription Object which holds parameters for {@code getSelectValue} operation
	 * @param pageIndex                      Index of desired page. To define a page size, use {@link #setPageSize(int)}
	 * @return List of references to valid select options or {@code null} if request was not successful
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public List<BaseRef> getSelectValue(GetSelectValueFieldDescription getSelectValueFieldDescription, int pageIndex) throws RemoteException {
		GetSelectValueResult getSelectValueResult = callGetSelectValue(getSelectValueFieldDescription, pageIndex);
		Boolean isIsSuccess = true;
		for (StatusDetail sd : getSelectValueResult.getStatus()) {
			isIsSuccess = !sd.getAfterSubmitFailed() && isIsSuccess;
		}
		if (isIsSuccess) {
			BaseRef[] baseRefList = getSelectValueResult.getBaseRefList();
			if (baseRefList == null) {
				return Collections.emptyList();
			}
			return Arrays.asList(baseRefList);
		}
		return null;
	}

	/**
	 * <p>For information about {@code getSelectValue} operation, see documentation of
	 * {@link #callGetSelectValue(GetSelectValueFieldDescription, int)} method.</p>
	 * <p>
	 * <p>This method calls as many {@code getSelectValue} requests as many pages are in response.</p>
	 *
	 * @param getSelectValueFieldDescription Object which holds parameters for {@code getSelectValue} operation
	 * @return Full list of references to valid select options or {@code null} if some of the requests failed
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public List<BaseRef> getSelectValue(GetSelectValueFieldDescription getSelectValueFieldDescription) throws RemoteException {
		List<BaseRef> allValues = new ArrayList<>();
		int totalPages = 1;
		int currentPage = 0;
		while (++currentPage <= totalPages) {
			GetSelectValueResult getSelectValueResult = callGetSelectValue(getSelectValueFieldDescription, currentPage);
			Boolean isIsSuccess = true;
			for (StatusDetail sd : getSelectValueResult.getStatus()) {
				isIsSuccess = !sd.getAfterSubmitFailed() && isIsSuccess;
			}
			
			if (getSelectValueResult.getStatus() != null && isIsSuccess) {
				totalPages = getSelectValueResult.getTotalPages();
				BaseRef[] baseRefList = getSelectValueResult.getBaseRefList();
				if (baseRefList != null) {
					allValues.addAll(Arrays.asList(baseRefList));
				}
			} else {
				return null;
			}
		}
		return allValues;
	}

	/**
	 * <p>This method invokes remote {@code getBudgetExchangeRate} operation. On the Budget Exchange Rates table,
	 * you can maintain exchange rates between the root-parent and child subsidiaries for use in the budgeting process.
	 * Use the {@code getBudgetExchangeRate} operation to get and filter all data related to this table.</p>
	 * <p>For more information, see
	 * <a href="https://system.netsuite.com/app/help/helpcenter.nl?fid=section_n3489718.html">getBudgetExchangeRate</a>
	 * operation in Help Center.</p>
	 *
	 * @param budgetExchangeRateFilter You can filter the returned exchange rates for a budget using this filter
	 * @return Object containing a list of available exchange rates in a budget
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public synchronized GetBudgetExchangeRateResult callGetBudgetExchangeRate(BudgetExchangeRateFilter budgetExchangeRateFilter) throws RemoteException {
		return getPort().getBudgetExchangeRate(budgetExchangeRateFilter);
	}

	/**
	 * <p>For information about {@code getBudgetExchangeRate} operation, see documentation of
	 * {@link #callGetBudgetExchangeRate(BudgetExchangeRateFilter)} method.</p>
	 *
	 * @param period         Reference to an existing period
	 * @param fromSubsidiary Reference to the originating subsidiary
	 * @param toSubsidiary   Reference to the receiving subsidiary
	 * @return List of available exchange rates in a budget or {@code null} if request was not successful
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public List<BudgetExchangeRate> getBudgetExchangeRate(RecordRef period, RecordRef fromSubsidiary, RecordRef toSubsidiary) throws RemoteException {
		BudgetExchangeRateFilter budgetExchangeRateFilter = new BudgetExchangeRateFilter();
		budgetExchangeRateFilter.setPeriod(period);
		budgetExchangeRateFilter.setFromSubsidiary(fromSubsidiary);
		budgetExchangeRateFilter.setToSubsidiary(toSubsidiary);

		GetBudgetExchangeRateResult getBudgetExchangeRateResult = callGetBudgetExchangeRate(budgetExchangeRateFilter);
		Boolean isIsSuccess = true;
		for (StatusDetail sd : getBudgetExchangeRateResult.getStatus()) {
			isIsSuccess = !sd.getAfterSubmitFailed() && isIsSuccess;
		}
		
		if (getBudgetExchangeRateResult.getStatus() != null && isIsSuccess) {
			BudgetExchangeRate[] budgetExchangeRateList = getBudgetExchangeRateResult.getBudgetExchangeRateList();
			if (budgetExchangeRateList == null) {
				return Collections.emptyList();
			}
			return Arrays.asList(budgetExchangeRateList);
		}
		return null;
	}

	/**
	 * <p>This method invokes remote {@code getCurrencyRate} operation. Use this operation to get the exchange rate
	 * between two currencies based on a certain date.</p>
	 * <p>For more information, see
	 * <a href="https://system.netsuite.com/app/help/helpcenter.nl?fid=section_n3492280.html">getCurrencyRate</a>
	 * operation in Help Center.</p>
	 *
	 * @param currencyRateFilter Filter the returned currency exchange rates using this filter
	 * @return Object containing a list of available currency exchange rates
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public synchronized GetCurrencyRateResult callGetCurrencyRate(CurrencyRateFilter currencyRateFilter) throws RemoteException {
		return getPort().getCurrencyRate(currencyRateFilter);
	}

	/**
	 * <p>For information about {@code getCurrencyRate} operation, see documentation of
	 * {@link #callGetCurrencyRate(CurrencyRateFilter)} method.</p>
	 *
	 * @param baseCurrency  Reference to base currency
	 * @param fromCurrency  Reference to from or "exchange" currency
	 * @param effectiveDate If a date is not provided (is {@code null}), the date defaults to the current date
	 * @return List of available currency exchange rates or {@code null} if request was not successful
	 * @throws RemoteException If some unexpected error occurs between client and server
	 * @see #callGetCurrencyRate(CurrencyRateFilter)
	 */
	public List<CurrencyRate> getCurrencyRate(RecordRef baseCurrency, RecordRef fromCurrency, Calendar effectiveDate) throws RemoteException {
		CurrencyRateFilter currencyRateFilter = new CurrencyRateFilter();
		currencyRateFilter.setBaseCurrency(baseCurrency);
		currencyRateFilter.setFromCurrency(fromCurrency);
		currencyRateFilter.setEffectiveDate(effectiveDate);

		GetCurrencyRateResult currencyRateResult = callGetCurrencyRate(currencyRateFilter);
		Boolean isIsSuccess = true;
		for (StatusDetail sd : currencyRateResult.getStatus()) {
			isIsSuccess = !sd.getAfterSubmitFailed() && isIsSuccess;
		}
		
		if (currencyRateResult.getStatus() != null && isIsSuccess) {
			CurrencyRate[] currencyRateList = currencyRateResult.getCurrencyRateList();
			if (currencyRateList == null) {
				return Collections.emptyList();
			}
			return Arrays.asList(currencyRateList);
		}
		return null;
	}

	/**
	 * <p>This method invokes remote {@code getCustomizationId} operation. To learn which custom objects exist
	 * in an account, use this method to retrieve the internalIds, externalIds, and/or scriptIds of all custom objects
	 * of a specified type.</p>
	 * <p>For more information, see
	 * <a href="https://system.netsuite.com/app/help/helpcenter.nl?fid=section_n3493817.html">getCustomizationId</a>
	 * operation in Help Center.</p>
	 *
	 * @param customizationType Any of the custom object types enumerated in {@code CustomizationType}
	 * @param includeInactives  If {@code true} then both active and inactive custom objects are returned in the response.
	 *                          {@code false} means no inactive custom objects are returned in the response
	 * @return Object containing a list of custom objects that correspond to the specified customization type.
	 * Also returns the internalId, externalId, and/or scriptId of each object.
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public synchronized GetCustomizationIdResult callGetCustomizationId(CustomizationType customizationType, boolean includeInactives) throws RemoteException {
		return getPort().getCustomizationId(customizationType, includeInactives);
	}

	/**
	 * <p>For information about {@code getCustomizationId} operation, see documentation of
	 * {@link #callGetCustomizationId(CustomizationType, boolean)} method.</p>
	 *
	 * @param customizationType Any of the custom object types enumerated in {@code GetCustomizationType}
	 * @param includeInactives  If {@code true} then both active and inactive custom objects are returned in the response.
	 *                          {@code false} means no inactive custom objects are returned in the response
	 * @return A list of custom objects that correspond to the specified customization type
	 * or {@code null} if request was not successful
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public List<CustomizationRef> getCustomizationId(GetCustomizationType customizationType, boolean includeInactives) throws RemoteException {
		GetCustomizationIdResult customizationIdResult = callGetCustomizationId(new CustomizationType(customizationType), includeInactives);
		Boolean isIsSuccess = true;
		for (StatusDetail sd : customizationIdResult.getStatus()) {
			isIsSuccess = !sd.getAfterSubmitFailed() && isIsSuccess;
		}
		
		if (customizationIdResult.getStatus() != null && isIsSuccess) {
			CustomizationRef[] customizationRefList = customizationIdResult.getCustomizationRefList();
			if (customizationRefList == null) {
				return Collections.emptyList();
			}
			return Arrays.asList(customizationRefList);
		}
		return null;
	}

	/**
	 * <p>This method invokes remote {@code getItemAvailability} operation.
	 * Retrieves the inventory availability for a given list of items.</p>
	 * <p>For more information, see
	 * <a href="https://system.netsuite.com/app/help/helpcenter.nl?fid=section_n3498308.html">getItemAvailability</a>
	 * operation in Help Center.</p>
	 *
	 * @param itemAvailabilityFilter References to an exiting item records in NetSuite.
	 * @return Inventory availability for a given list of items
	 * @throws RemoteException If some unexpected error occurs between client and server
	 * @see #getItemAvailability(Calendar, RecordRef...)
	 */
	public synchronized GetItemAvailabilityResult callGetItemAvailability(ItemAvailabilityFilter itemAvailabilityFilter) throws RemoteException {
		return getPort().getItemAvailability(itemAvailabilityFilter);
	}

	/**
	 * <p>For information about {@code getItemAvailability} operation, see documentation of
	 * {@link #callGetItemAvailability(ItemAvailabilityFilter)} method.</p>
	 *
	 * @param lastQtyAvailableChange If set, only items with quantity available changes recorded as of the specified
	 *                               date are returned. Can be {@code null}
	 * @param itemsReferences        References to an exiting item records in NetSuite
	 * @return List of inventory availability for a given list of items
	 * @throws RemoteException If some unexpected error occurs between client and server
	 * @see #callGetItemAvailability(ItemAvailabilityFilter)
	 */
	public List<ItemAvailability> getItemAvailability(Calendar lastQtyAvailableChange, RecordRef... itemsReferences) throws RemoteException {
		ItemAvailabilityFilter itemAvailabilityFilter = new ItemAvailabilityFilter();
		itemAvailabilityFilter.setItem(itemsReferences);
		itemAvailabilityFilter.setLastQtyAvailableChange(lastQtyAvailableChange);

		GetItemAvailabilityResult getItemAvailabilityResult = callGetItemAvailability(itemAvailabilityFilter);
		Boolean isIsSuccess = true;
		for (StatusDetail sd : getItemAvailabilityResult.getStatus()) {
			isIsSuccess = !sd.getAfterSubmitFailed() && isIsSuccess;
		}
		
		if (getItemAvailabilityResult.getStatus() != null && isIsSuccess) {
			ItemAvailability[] itemAvailabilityList = getItemAvailabilityResult.getItemAvailabilityList();
			if (itemAvailabilityList == null) {
				return Collections.emptyList();
			}
			return Arrays.asList(itemAvailabilityList);
		}
		return null;
	}

	/**
	 * <p>This method invokes remote {@code getPostingTransactionSummary} operation.
	 * This method lets you retrieve a summary of the actual data that posted to the general ledger in an account.</p>
	 * <p>For more information, see
	 * <a href="https://system.netsuite.com/app/help/helpcenter.nl?fid=section_n3500304.html">getPostingTransactionSummary</a>
	 * operation in Help Center.</p>
	 *
	 * @param postingTransactionSummaryField  Specify how you want your data grouped
	 * @param postingTransactionSummaryFilter Specify your filtering criteria
	 * @param pageIndex                       Specify the page to be returned
	 * @param operationId                     Job ID of initial {@code getPostingTransactionSummary} request
	 *                                        with {@code pageIndex} equal to one
	 * @return A list of available transaction summary results based on filters defined in your request
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public synchronized GetPostingTransactionSummaryResult callGetPostingTransactionSummary(PostingTransactionSummaryField postingTransactionSummaryField,
			PostingTransactionSummaryFilter postingTransactionSummaryFilter, int pageIndex, @Nullable String operationId) throws RemoteException {
		return getPort().getPostingTransactionSummary(postingTransactionSummaryField, postingTransactionSummaryFilter, pageIndex, operationId);
	}

	/**
	 * <p>For information about {@code getPostingTransactionSummary} operation, see documentation of {@link
	 * #callGetPostingTransactionSummary(PostingTransactionSummaryField, PostingTransactionSummaryFilter, int, String)}
	 * method.</p>
	 *
	 * @param postingTransactionSummaryField  Specify how you want your data grouped
	 * @param postingTransactionSummaryFilter Specify your filtering criteria
	 * @param pageIndex                       Specify the page to be returned
	 * @return A list of available transaction summary results based on filters defined in your request
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public GetPostingTransactionSummaryResult getPostingTransactionSummary(PostingTransactionSummaryField postingTransactionSummaryField,
			PostingTransactionSummaryFilter postingTransactionSummaryFilter, int pageIndex) throws RemoteException {
		GetPostingTransactionSummaryResult postingTransactionSummaryResult = callGetPostingTransactionSummary(postingTransactionSummaryField,
				postingTransactionSummaryFilter, pageIndex, pageIndex == 1 ? null : lastGetPostingTransactionSummaryJobId);
		if (pageIndex == 1) {
			lastGetPostingTransactionSummaryJobId = getLastJobId();
		}
		return postingTransactionSummaryResult;
	}

	/**
	 * <p>This method invokes remote {@code getSavedSearch} operation. This operation allows users to retrieve a list
	 * of existing saved search IDs on a per-record-type basis (for example, all saved search IDs for every Customer
	 * saved search). Note that after you retrieve the list of saved search IDs, you may need to look in the NetSuite UI
	 * to see the criteria defined for the saved search.</p>
	 * <p>For more information, see
	 * <a href="https://system.netsuite.com/app/help/helpcenter.nl?fid=section_n3503649.html">getSavedSearch</a>
	 * operation in Help Center.</p>
	 *
	 * @param searchRecordType Saved searches for this type of record will be returned
	 * @return Object containing a list of references to saved searches for given record type or {@code null}
	 * if request was not successful
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public synchronized GetSavedSearchResult callGetSavedSearch(GetSavedSearchRecord searchRecordType) throws RemoteException {
		return getPort().getSavedSearch(searchRecordType);
	}

	/**
	 * <p>For information about {@code getSavedSearch} operation, see documentation of
	 * {@link #callGetSavedSearch(GetSavedSearchRecord)} method.</p>
	 *
	 * @param searchRecordType Saved searches for this type of record will be returned
	 * @return A list of record references of the saved searches which contain internal ID, script ID and name
	 * or {@code null} if request was not successful
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public List<RecordRef> getSavedSearch(SearchRecordType searchRecordType) throws RemoteException {
		GetSavedSearchRecord getSavedSearchRecord = new GetSavedSearchRecord();
		getSavedSearchRecord.setSearchType(searchRecordType);
		GetSavedSearchResult getSavedSearchResult = callGetSavedSearch(getSavedSearchRecord);
		Boolean isIsSuccess = true;
		for (StatusDetail sd : getSavedSearchResult.getStatus()) {
			isIsSuccess = !sd.getAfterSubmitFailed() && isIsSuccess;
		}
		
		if (getSavedSearchResult.getStatus() != null && isIsSuccess) {
			RecordRef[] recordRefList = getSavedSearchResult.getRecordRefList();
			if (recordRefList == null || recordRefList == null) {
				return Collections.emptyList();
			}
			return Arrays.asList(recordRefList);
		}
		return null;
	}

	/**
	 * <p>This method invokes remote {@code updateInviteeStatus} operation. This operation lets users respond to
	 * NetSuite events that have been sent to them.</p>
	 * <p>For more information, see
	 * <a href="https://system.netsuite.com/app/help/helpcenter.nl?fid=section_n3531056.html">updateInviteeStatus</a>
	 * operation in Help Center.</p>
	 *
	 * @param eventInternalId Internal ID of event which user reacts to
	 * @param response        Response status
	 * @return Write response
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public WriteResponse callUpdateInviteeStatus(String eventInternalId, CalendarEventAttendeeResponse response) throws RemoteException {
		UpdateInviteeStatusReference updateInviteeStatusReference = new UpdateInviteeStatusReference();
		updateInviteeStatusReference.setEventId(com.bansi.webservices.samples.v2019_1.Utils.createRecordRef(eventInternalId));
		updateInviteeStatusReference.setResponseCode(response);
		synchronized (this) {
			return getPort().updateInviteeStatus(updateInviteeStatusReference);
		}
	}

	/**
	 * <p>For information about {@code updateInviteeStatus} operation, see documentation of
	 * {@link #callUpdateInviteeStatus(String, CalendarEventAttendeeResponse)} method.</p>
	 *
	 * @param eventInternalId Internal ID of event which user reacts to
	 * @param response        Response status
	 * @return Reference to updated event or {@code null} if an error occurred
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public RecordRef updateInviteeStatus(String eventInternalId, CalendarEventAttendeeResponse response) throws RemoteException {
		WriteResponse writeResponse = callUpdateInviteeStatus(eventInternalId, response);
		
		Boolean isIsSuccess = true;
		for (StatusDetail sd : writeResponse.getStatus()) {
			isIsSuccess = !sd.getAfterSubmitFailed() && isIsSuccess;
		}
		
		if (writeResponse.getStatus() != null && isIsSuccess) {
			return (RecordRef) writeResponse.getBaseRef();
		}
		return null;
	}

	/**
	 * <p>This method invokes remote {@code updateInviteeStatusList} operation. The {@code updateInviteeStatusList}
	 * operation is used to update one or more NetSuite events.</p>
	 * <p>For more information, see
	 * <a href="https://system.netsuite.com/app/help/helpcenter.nl?fid=section_n3531763.html">updateInviteeStatusList</a>
	 * operation in Help Center.</p>
	 *
	 * @param updateInviteeStatusReferences Array of objects containing event IDs and response codes
	 * @return List of write responses with references to updated events
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public synchronized WriteResponseList callUpdateInviteeStatusList(UpdateInviteeStatusReference... updateInviteeStatusReferences) throws RemoteException {
		return getPort().updateInviteeStatusList(updateInviteeStatusReferences);
	}

	/**
	 * <p>For information about {@code updateInviteeStatusList} operation, see documentation of
	 * {@link #callUpdateInviteeStatusList(UpdateInviteeStatusReference...)} method.</p>
	 *
	 * @param updateInviteeStatusReferences List of objects containing event IDs and response codes
	 * @return List of write responses with references to updated events
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public WriteResponseList callUpdateInviteeStatusList(List<UpdateInviteeStatusReference> updateInviteeStatusReferences) throws RemoteException {
		return callUpdateInviteeStatusList(updateInviteeStatusReferences.toArray(new UpdateInviteeStatusReference[updateInviteeStatusReferences.size()]));
	}

	/**
	 * <p>For information about {@code updateInviteeStatusList} operation, see documentation of
	 * {@link #callUpdateInviteeStatusList(UpdateInviteeStatusReference...)} method.</p>
	 *
	 * @param updateInviteeStatusReferences List of objects containing event IDs and response codes
	 * @return List of write responses with references to updated events
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public List<RecordRef> updateInviteeStatusList(UpdateInviteeStatusReference... updateInviteeStatusReferences) throws RemoteException {
		WriteResponseList writeResponseList = callUpdateInviteeStatusList(updateInviteeStatusReferences);
		return getUpdatedEventsFromResponseList(writeResponseList);
	}

	/**
	 * <p>For information about {@code updateInviteeStatusList} operation, see documentation of
	 * {@link #callUpdateInviteeStatusList(UpdateInviteeStatusReference...)} method.</p>
	 *
	 * @param updateInviteeStatusReferences List of objects containing event IDs and response codes
	 * @return List of write responses with references to updated events
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public List<RecordRef> updateInviteeStatusList(List<UpdateInviteeStatusReference> updateInviteeStatusReferences) throws RemoteException {
		return updateInviteeStatusList(updateInviteeStatusReferences.toArray(new UpdateInviteeStatusReference[updateInviteeStatusReferences.size()]));
	}

	/**
	 * <p>For information about {@code updateInviteeStatusList} operation, see documentation of
	 * {@link #callUpdateInviteeStatusList(UpdateInviteeStatusReference...)} method.</p>
	 *
	 * @param statusUpdates Map of event IDs and their responses
	 * @return Write response list
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public WriteResponseList callUpdateInviteeStatusList(Map<String, CalendarEventAttendeeResponse> statusUpdates) throws RemoteException {
		return callUpdateInviteeStatusList(statusUpdates.entrySet().stream().map(entry -> {
			UpdateInviteeStatusReference updateInviteeStatusReference = new UpdateInviteeStatusReference();
			
			updateInviteeStatusReference.setEventId(com.bansi.webservices.samples.v2019_1.Utils.createRecordRef(entry.getKey()));
			
			updateInviteeStatusReference.setResponseCode(entry.getValue());
			return updateInviteeStatusReference;
		}).toArray(UpdateInviteeStatusReference[]::new));
	}

	/**
	 * <p>For information about {@code updateInviteeStatusList} operation, see documentation of
	 * {@link #callUpdateInviteeStatusList(UpdateInviteeStatusReference...)} method.</p>
	 *
	 * @param statusUpdates Map of event IDs and their responses
	 * @return List of write responses with references to updated events
	 * @throws RemoteException If some unexpected error occurs between client and server
	 */
	public List<RecordRef> updateInviteeStatusList(Map<String, CalendarEventAttendeeResponse> statusUpdates) throws RemoteException {
		WriteResponseList writeResponseList = callUpdateInviteeStatusList(statusUpdates);
		return getUpdatedEventsFromResponseList(writeResponseList);
	}

	/**
	 * Converts write response list to {@code RecordRef}s.
	 *
	 * @param writeResponseList Write response list to be converted
	 * @return List of {@code RecordRef}s to updated events
	 */
	private List<RecordRef> getUpdatedEventsFromResponseList(WriteResponseList writeResponseList) {
		return Arrays.stream(writeResponseList.getWriteResponse())
				.map(writeResponse -> writeResponse.getStatus().length > 0 ? (RecordRef) writeResponse.getBaseRef() : null).collect(Collectors.toList());
	}

	/**
	 * Sends raw SOAP message. In case of sending raw SOAP message, session has to be maintained manually.
	 * Given SOAP message can contain Request-Level Credentials passport or cookie can be read from login request by
	 * using {@link #getSessionId()} method and set to HTTP headers by using {@link #setSessionId(String)}.
	 *
	 * @param soapAction          SOAP action (e.g. add, get, update, delete, search)
	 * @param soapMessage         XML representing SOAP message
	 * @param soapMessageEncoding Encoding of SOAP message
	 * @return {@code SOAPEnvelope} containing SOAP response
	 */
	public SOAPEnvelope sendSoapMessage(String soapAction, String soapMessage, Charset soapMessageEncoding) {
		try {
			// HTTP headers must be empty because RequestHandler adds all extra headers
			org.apache.axis.message.MimeHeaders httpHeaders = new org.apache.axis.message.MimeHeaders();
			SOAPMessage message = new MessageFactoryImpl().createMessage(httpHeaders, new ByteArrayInputStream(soapMessage.getBytes(soapMessageEncoding)));

			Call call = (Call) getLocator().createCall();
			call.setTargetEndpointAddress(getEndpointUrl());
			call.setSOAPActionURI(soapAction);

			return call.invoke((Message) message);
		} catch (SOAPException | ServiceException | IOException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * <p>For information about sending raw SOAP messages, see {@link #sendSoapMessage(String, String, Charset)}</p>.
	 * <p>If you use this method, the charset UTF-8 is used for SOAP message.</p>
	 *
	 * @param soapAction  SOAP action (e.g. add, get, update, delete, search)
	 * @param soapMessage XML representing SOAP message in UTF-8 encoding
	 * @return {@code SOAPEnvelope} containing SOAP response
	 */
	public SOAPEnvelope sendSoapMessage(String soapAction, String soapMessage) {
		return sendSoapMessage(soapAction, soapMessage, Charset.forName("UTF-8"));
	}

	/**
	 * <p>For information about sending raw SOAP messages, see {@link #sendSoapMessage(String, String, Charset)}</p>.
	 * <p>If you use this method, SOAP action is parsed from XML and UTF-8 charset is used.</p>
	 *
	 * @param soapMessage XML representing SOAP message in UTF-8 encoding
	 * @return {@code SOAPEnvelope} containing SOAP response
	 */
	public SOAPEnvelope sendSoapMessage(String soapMessage) {
		String soapAction = null;
		try {
			XPath xPath = XPathFactory.newInstance().newXPath();
			soapAction = ((Node) xPath.evaluate("/*[local-name()='Envelope']/*[local-name()='Body']/*[1]", new InputSource(new StringReader(soapMessage)),
					XPathConstants.NODE)).getLocalName();
			if (isEmptyString(soapAction)) {
				throw new IllegalStateException(
						"SOAPAction cannot be determined from provided soapMessage. " + "Please check if Body element contains the correct child element.");
			}
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		}
		return sendSoapMessage(soapAction, soapMessage);
	}

}