
package com.netsuite.webservices.platform.messages_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.CurrencyRateFilter;


/**
 * <p>GetCurrencyRateRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetCurrencyRateRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currencyRateFilter" type="{urn:core_2018_2.platform.webservices.netsuite.com}CurrencyRateFilter"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCurrencyRateRequest", propOrder = {
    "currencyRateFilter"
})
public class GetCurrencyRateRequest {

    @XmlElement(required = true)
    protected CurrencyRateFilter currencyRateFilter;

    /**
     * 获取currencyRateFilter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CurrencyRateFilter }
     *     
     */
    public CurrencyRateFilter getCurrencyRateFilter() {
        return currencyRateFilter;
    }

    /**
     * 设置currencyRateFilter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyRateFilter }
     *     
     */
    public void setCurrencyRateFilter(CurrencyRateFilter value) {
        this.currencyRateFilter = value;
    }

}
