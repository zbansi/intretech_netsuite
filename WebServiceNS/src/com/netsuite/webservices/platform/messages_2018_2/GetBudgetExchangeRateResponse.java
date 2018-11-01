
package com.netsuite.webservices.platform.messages_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.GetBudgetExchangeRateResult;


/**
 * <p>GetBudgetExchangeRateResponse complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="GetBudgetExchangeRateResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:core_2018_2.platform.webservices.netsuite.com}getBudgetExchangeRateResult"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBudgetExchangeRateResponse", propOrder = {
    "getBudgetExchangeRateResult"
})
public class GetBudgetExchangeRateResponse {

    @XmlElement(namespace = "urn:core_2018_2.platform.webservices.netsuite.com", required = true)
    protected GetBudgetExchangeRateResult getBudgetExchangeRateResult;

    /**
     * ��ȡgetBudgetExchangeRateResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GetBudgetExchangeRateResult }
     *     
     */
    public GetBudgetExchangeRateResult getGetBudgetExchangeRateResult() {
        return getBudgetExchangeRateResult;
    }

    /**
     * ����getBudgetExchangeRateResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GetBudgetExchangeRateResult }
     *     
     */
    public void setGetBudgetExchangeRateResult(GetBudgetExchangeRateResult value) {
        this.getBudgetExchangeRateResult = value;
    }

}
