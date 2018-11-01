
package com.netsuite.webservices.platform.messages_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.CurrencyRateFilter;


/**
 * <p>GetCurrencyRateRequest complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡcurrencyRateFilter���Ե�ֵ��
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
     * ����currencyRateFilter���Ե�ֵ��
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
