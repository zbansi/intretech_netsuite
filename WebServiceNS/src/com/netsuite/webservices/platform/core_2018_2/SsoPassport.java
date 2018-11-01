
package com.netsuite.webservices.platform.core_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SsoPassport complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SsoPassport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authenticationToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="partnerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="partnerAccount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="partnerUserId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SsoPassport", propOrder = {
    "authenticationToken",
    "partnerId",
    "partnerAccount",
    "partnerUserId"
})
public class SsoPassport {

    @XmlElement(required = true)
    protected String authenticationToken;
    @XmlElement(required = true)
    protected String partnerId;
    @XmlElement(required = true)
    protected String partnerAccount;
    @XmlElement(required = true)
    protected String partnerUserId;

    /**
     * 获取authenticationToken属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationToken() {
        return authenticationToken;
    }

    /**
     * 设置authenticationToken属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationToken(String value) {
        this.authenticationToken = value;
    }

    /**
     * 获取partnerId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerId() {
        return partnerId;
    }

    /**
     * 设置partnerId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerId(String value) {
        this.partnerId = value;
    }

    /**
     * 获取partnerAccount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerAccount() {
        return partnerAccount;
    }

    /**
     * 设置partnerAccount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerAccount(String value) {
        this.partnerAccount = value;
    }

    /**
     * 获取partnerUserId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerUserId() {
        return partnerUserId;
    }

    /**
     * 设置partnerUserId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerUserId(String value) {
        this.partnerUserId = value;
    }

}
