
package com.netsuite.webservices.platform_2018_2;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "invalidVersionFault", targetNamespace = "urn:faults_2018_2.platform.webservices.netsuite.com")
public class InvalidVersionFault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private com.netsuite.webservices.platform.faults_2018_2.InvalidVersionFault faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public InvalidVersionFault(String message, com.netsuite.webservices.platform.faults_2018_2.InvalidVersionFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public InvalidVersionFault(String message, com.netsuite.webservices.platform.faults_2018_2.InvalidVersionFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.netsuite.webservices.platform.faults_2018_2.InvalidVersionFault
     */
    public com.netsuite.webservices.platform.faults_2018_2.InvalidVersionFault getFaultInfo() {
        return faultInfo;
    }

}
