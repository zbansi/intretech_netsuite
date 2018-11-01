
package com.netsuite.webservices.platform.core_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetCurrencyRateResult complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="GetCurrencyRateResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:core_2018_2.platform.webservices.netsuite.com}status"/>
 *         &lt;element name="currencyRateList" type="{urn:core_2018_2.platform.webservices.netsuite.com}CurrencyRateList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCurrencyRateResult", propOrder = {
    "status",
    "currencyRateList"
})
public class GetCurrencyRateResult {

    @XmlElement(required = true)
    protected Status status;
    protected CurrencyRateList currencyRateList;

    /**
     * ��ȡstatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * ����status���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * ��ȡcurrencyRateList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CurrencyRateList }
     *     
     */
    public CurrencyRateList getCurrencyRateList() {
        return currencyRateList;
    }

    /**
     * ����currencyRateList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyRateList }
     *     
     */
    public void setCurrencyRateList(CurrencyRateList value) {
        this.currencyRateList = value;
    }

}
