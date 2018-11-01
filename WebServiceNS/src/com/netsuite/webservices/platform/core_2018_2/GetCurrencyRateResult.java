
package com.netsuite.webservices.platform.core_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetCurrencyRateResult complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取status属性的值。
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
     * 设置status属性的值。
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
     * 获取currencyRateList属性的值。
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
     * 设置currencyRateList属性的值。
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
