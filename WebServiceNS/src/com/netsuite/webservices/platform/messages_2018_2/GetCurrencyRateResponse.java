
package com.netsuite.webservices.platform.messages_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.GetCurrencyRateResult;


/**
 * <p>GetCurrencyRateResponse complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="GetCurrencyRateResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:core_2018_2.platform.webservices.netsuite.com}getCurrencyRateResult"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCurrencyRateResponse", propOrder = {
    "getCurrencyRateResult"
})
public class GetCurrencyRateResponse {

    @XmlElement(namespace = "urn:core_2018_2.platform.webservices.netsuite.com", required = true)
    protected GetCurrencyRateResult getCurrencyRateResult;

    /**
     * ��ȡgetCurrencyRateResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GetCurrencyRateResult }
     *     
     */
    public GetCurrencyRateResult getGetCurrencyRateResult() {
        return getCurrencyRateResult;
    }

    /**
     * ����getCurrencyRateResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GetCurrencyRateResult }
     *     
     */
    public void setGetCurrencyRateResult(GetCurrencyRateResult value) {
        this.getCurrencyRateResult = value;
    }

}
