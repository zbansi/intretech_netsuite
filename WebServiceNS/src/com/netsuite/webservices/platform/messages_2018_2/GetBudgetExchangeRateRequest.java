
package com.netsuite.webservices.platform.messages_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.BudgetExchangeRateFilter;


/**
 * <p>GetBudgetExchangeRateRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetBudgetExchangeRateRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="budgetExchangeRateFilter" type="{urn:core_2018_2.platform.webservices.netsuite.com}BudgetExchangeRateFilter"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBudgetExchangeRateRequest", propOrder = {
    "budgetExchangeRateFilter"
})
public class GetBudgetExchangeRateRequest {

    @XmlElement(required = true)
    protected BudgetExchangeRateFilter budgetExchangeRateFilter;

    /**
     * 获取budgetExchangeRateFilter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BudgetExchangeRateFilter }
     *     
     */
    public BudgetExchangeRateFilter getBudgetExchangeRateFilter() {
        return budgetExchangeRateFilter;
    }

    /**
     * 设置budgetExchangeRateFilter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BudgetExchangeRateFilter }
     *     
     */
    public void setBudgetExchangeRateFilter(BudgetExchangeRateFilter value) {
        this.budgetExchangeRateFilter = value;
    }

}
