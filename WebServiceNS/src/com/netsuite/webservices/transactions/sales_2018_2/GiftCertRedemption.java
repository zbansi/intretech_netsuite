
package com.netsuite.webservices.transactions.sales_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;


/**
 * <p>GiftCertRedemption complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡauthCode���Ե�ֵ��
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
     * ����authCode���Ե�ֵ��
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
     * ��ȡauthCodeApplied���Ե�ֵ��
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
     * ����authCodeApplied���Ե�ֵ��
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
     * ��ȡauthCodeAmtRemaining���Ե�ֵ��
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
     * ����authCodeAmtRemaining���Ե�ֵ��
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
     * ��ȡgiftCertAvailable���Ե�ֵ��
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
     * ����giftCertAvailable���Ե�ֵ��
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
