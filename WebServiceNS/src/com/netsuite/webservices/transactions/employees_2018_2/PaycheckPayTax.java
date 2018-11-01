
package com.netsuite.webservices.transactions.employees_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PaycheckPayTax complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PaycheckPayTax">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="line" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="apply" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="payTax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payItem" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="taxableWageBase" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="taxedWageBase" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="reportableWageBase" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="isExempt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isResidentTax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaycheckPayTax", propOrder = {
    "line",
    "apply",
    "payTax",
    "payItem",
    "taxableWageBase",
    "taxedWageBase",
    "reportableWageBase",
    "isExempt",
    "isResidentTax",
    "amount"
})
public class PaycheckPayTax {

    protected Long line;
    protected Boolean apply;
    protected String payTax;
    protected Long payItem;
    protected Double taxableWageBase;
    protected Double taxedWageBase;
    protected Double reportableWageBase;
    protected Boolean isExempt;
    protected Boolean isResidentTax;
    protected Double amount;

    /**
     * 获取line属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLine() {
        return line;
    }

    /**
     * 设置line属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLine(Long value) {
        this.line = value;
    }

    /**
     * 获取apply属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApply() {
        return apply;
    }

    /**
     * 设置apply属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApply(Boolean value) {
        this.apply = value;
    }

    /**
     * 获取payTax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayTax() {
        return payTax;
    }

    /**
     * 设置payTax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayTax(String value) {
        this.payTax = value;
    }

    /**
     * 获取payItem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPayItem() {
        return payItem;
    }

    /**
     * 设置payItem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPayItem(Long value) {
        this.payItem = value;
    }

    /**
     * 获取taxableWageBase属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxableWageBase() {
        return taxableWageBase;
    }

    /**
     * 设置taxableWageBase属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxableWageBase(Double value) {
        this.taxableWageBase = value;
    }

    /**
     * 获取taxedWageBase属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxedWageBase() {
        return taxedWageBase;
    }

    /**
     * 设置taxedWageBase属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxedWageBase(Double value) {
        this.taxedWageBase = value;
    }

    /**
     * 获取reportableWageBase属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getReportableWageBase() {
        return reportableWageBase;
    }

    /**
     * 设置reportableWageBase属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setReportableWageBase(Double value) {
        this.reportableWageBase = value;
    }

    /**
     * 获取isExempt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsExempt() {
        return isExempt;
    }

    /**
     * 设置isExempt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExempt(Boolean value) {
        this.isExempt = value;
    }

    /**
     * 获取isResidentTax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsResidentTax() {
        return isResidentTax;
    }

    /**
     * 设置isResidentTax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsResidentTax(Boolean value) {
        this.isResidentTax = value;
    }

    /**
     * 获取amount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * 设置amount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmount(Double value) {
        this.amount = value;
    }

}
