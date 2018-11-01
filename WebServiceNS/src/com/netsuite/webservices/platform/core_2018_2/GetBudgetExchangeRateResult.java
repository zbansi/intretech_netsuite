
package com.netsuite.webservices.platform.core_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetBudgetExchangeRateResult complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetBudgetExchangeRateResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:core_2018_2.platform.webservices.netsuite.com}status"/>
 *         &lt;element name="budgetExchangeRateList" type="{urn:core_2018_2.platform.webservices.netsuite.com}BudgetExchangeRateList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBudgetExchangeRateResult", propOrder = {
    "status",
    "budgetExchangeRateList"
})
public class GetBudgetExchangeRateResult {

    @XmlElement(required = true)
    protected Status status;
    protected BudgetExchangeRateList budgetExchangeRateList;

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
     * 获取budgetExchangeRateList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BudgetExchangeRateList }
     *     
     */
    public BudgetExchangeRateList getBudgetExchangeRateList() {
        return budgetExchangeRateList;
    }

    /**
     * 设置budgetExchangeRateList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BudgetExchangeRateList }
     *     
     */
    public void setBudgetExchangeRateList(BudgetExchangeRateList value) {
        this.budgetExchangeRateList = value;
    }

}
