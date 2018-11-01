
package com.netsuite.webservices.transactions.employees_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PaycheckPayTax complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡline���Ե�ֵ��
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
     * ����line���Ե�ֵ��
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
     * ��ȡapply���Ե�ֵ��
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
     * ����apply���Ե�ֵ��
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
     * ��ȡpayTax���Ե�ֵ��
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
     * ����payTax���Ե�ֵ��
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
     * ��ȡpayItem���Ե�ֵ��
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
     * ����payItem���Ե�ֵ��
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
     * ��ȡtaxableWageBase���Ե�ֵ��
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
     * ����taxableWageBase���Ե�ֵ��
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
     * ��ȡtaxedWageBase���Ե�ֵ��
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
     * ����taxedWageBase���Ե�ֵ��
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
     * ��ȡreportableWageBase���Ե�ֵ��
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
     * ����reportableWageBase���Ե�ֵ��
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
     * ��ȡisExempt���Ե�ֵ��
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
     * ����isExempt���Ե�ֵ��
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
     * ��ȡisResidentTax���Ե�ֵ��
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
     * ����isResidentTax���Ե�ֵ��
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
     * ��ȡamount���Ե�ֵ��
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
     * ����amount���Ե�ֵ��
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
