
package com.netsuite.webservices.platform.faults_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.faults_2018_2.types.FaultCodeType;


/**
 * <p>SoapFault complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SoapFault">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{urn:types.faults_2018_2.platform.webservices.netsuite.com}FaultCodeType"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoapFault", propOrder = {
    "code",
    "message"
})
@XmlSeeAlso({
    InvalidVersionFault.class,
    InsufficientPermissionFault.class,
    ExceededRecordCountFault.class,
    AsyncFault.class,
    InvalidAccountFault.class,
    InvalidSessionFault.class,
    ExceededRequestLimitFault.class,
    ExceededUsageLimitFault.class,
    UnexpectedErrorFault.class,
    ExceededConcurrentRequestLimitFault.class,
    ExceededRequestSizeFault.class,
    InvalidCredentialsFault.class
})
public class SoapFault {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected FaultCodeType code;
    @XmlElement(required = true)
    protected String message;

    /**
     * 获取code属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FaultCodeType }
     *     
     */
    public FaultCodeType getCode() {
        return code;
    }

    /**
     * 设置code属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FaultCodeType }
     *     
     */
    public void setCode(FaultCodeType value) {
        this.code = value;
    }

    /**
     * 获取message属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * 设置message属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

}
