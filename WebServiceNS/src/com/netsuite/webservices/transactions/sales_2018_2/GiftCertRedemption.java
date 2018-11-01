
package com.netsuite.webservices.transactions.sales_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;


/**
 * <p>GiftCertRedemption complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GiftCertRedemption">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authCode" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="authCodeApplied" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="authCodeAmtRemaining" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="giftCertAvailable" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GiftCertRedemption", propOrder = {
    "authCode",
    "authCodeApplied",
    "authCodeAmtRemaining",
    "giftCertAvailable"
})
public class GiftCertRedemption {

    protected RecordRef authCode;
    protected Double authCodeApplied;
    protected Double authCodeAmtRemaining;
    protected Double giftCertAvailable;

    /**
     * 获取authCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getAuthCode() {
        return authCode;
    }

    /**
     * 设置authCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setAuthCode(RecordRef value) {
        this.authCode = value;
    }

    /**
     * 获取authCodeApplied属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAuthCodeApplied() {
        return authCodeApplied;
    }

    /**
     * 设置authCodeApplied属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAuthCodeApplied(Double value) {
        this.authCodeApplied = value;
    }

    /**
     * 获取authCodeAmtRemaining属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAuthCodeAmtRemaining() {
        return authCodeAmtRemaining;
    }

    /**
     * 设置authCodeAmtRemaining属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAuthCodeAmtRemaining(Double value) {
        this.authCodeAmtRemaining = value;
    }

    /**
     * 获取giftCertAvailable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGiftCertAvailable() {
        return giftCertAvailable;
    }

    /**
     * 设置giftCertAvailable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGiftCertAvailable(Double value) {
        this.giftCertAvailable = value;
    }

}
