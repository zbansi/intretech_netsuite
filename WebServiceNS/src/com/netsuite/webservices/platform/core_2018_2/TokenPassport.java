
package com.netsuite.webservices.platform.core_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TokenPassport complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TokenPassport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="account" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="consumerKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nonce" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="signature" type="{urn:core_2018_2.platform.webservices.netsuite.com}TokenPassportSignature"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TokenPassport", propOrder = {
    "account",
    "consumerKey",
    "token",
    "nonce",
    "timestamp",
    "signature"
})
public class TokenPassport {

    @XmlElement(required = true)
    protected String account;
    @XmlElement(required = true)
    protected String consumerKey;
    @XmlElement(required = true)
    protected String token;
    @XmlElement(required = true)
    protected String nonce;
    protected long timestamp;
    @XmlElement(required = true)
    protected TokenPassportSignature signature;

    /**
     * 获取account属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置account属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount(String value) {
        this.account = value;
    }

    /**
     * 获取consumerKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerKey() {
        return consumerKey;
    }

    /**
     * 设置consumerKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerKey(String value) {
        this.consumerKey = value;
    }

    /**
     * 获取token属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * 设置token属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * 获取nonce属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonce() {
        return nonce;
    }

    /**
     * 设置nonce属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonce(String value) {
        this.nonce = value;
    }

    /**
     * 获取timestamp属性的值。
     * 
     */
    public long getTimestamp() {
        return timestamp;
    }

    /**
     * 设置timestamp属性的值。
     * 
     */
    public void setTimestamp(long value) {
        this.timestamp = value;
    }

    /**
     * 获取signature属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TokenPassportSignature }
     *     
     */
    public TokenPassportSignature getSignature() {
        return signature;
    }

    /**
     * 设置signature属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TokenPassportSignature }
     *     
     */
    public void setSignature(TokenPassportSignature value) {
        this.signature = value;
    }

}
