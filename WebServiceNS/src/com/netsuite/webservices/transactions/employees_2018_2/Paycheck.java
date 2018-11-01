
package com.netsuite.webservices.transactions.employees_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.platform.core_2018_2.Record;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;


/**
 * <p>Paycheck complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Paycheck">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}Record">
 *       &lt;sequence>
 *         &lt;element name="batchNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entity" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="department" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="location" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="class" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="workplace" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="tranId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="account" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="payFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="balance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="tranDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="postingPeriod" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="periodEnding" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="payEarnList" type="{urn:employees_2018_2.transactions.webservices.netsuite.com}PaycheckPayEarnList" minOccurs="0"/>
 *         &lt;element name="payTimeList" type="{urn:employees_2018_2.transactions.webservices.netsuite.com}PaycheckPayTimeList" minOccurs="0"/>
 *         &lt;element name="payExpList" type="{urn:employees_2018_2.transactions.webservices.netsuite.com}PaycheckPayExpList" minOccurs="0"/>
 *         &lt;element name="payPtoList" type="{urn:employees_2018_2.transactions.webservices.netsuite.com}PaycheckPayPtoList" minOccurs="0"/>
 *         &lt;element name="payDeductList" type="{urn:employees_2018_2.transactions.webservices.netsuite.com}PaycheckPayDeductList" minOccurs="0"/>
 *         &lt;element name="payContribList" type="{urn:employees_2018_2.transactions.webservices.netsuite.com}PaycheckPayContribList" minOccurs="0"/>
 *         &lt;element name="payTaxList" type="{urn:employees_2018_2.transactions.webservices.netsuite.com}PaycheckPayTaxList" minOccurs="0"/>
 *         &lt;element name="paySummaryList" type="{urn:employees_2018_2.transactions.webservices.netsuite.com}PaycheckPaySummaryList" minOccurs="0"/>
 *         &lt;element name="payDisburseList" type="{urn:employees_2018_2.transactions.webservices.netsuite.com}PaycheckPayDisburseList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="internalId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="externalId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Paycheck", propOrder = {
    "batchNumber",
    "createdDate",
    "lastModifiedDate",
    "status",
    "entity",
    "address",
    "department",
    "location",
    "clazz",
    "workplace",
    "tranId",
    "userAmount",
    "memo",
    "account",
    "payFrequency",
    "balance",
    "tranDate",
    "postingPeriod",
    "periodEnding",
    "payEarnList",
    "payTimeList",
    "payExpList",
    "payPtoList",
    "payDeductList",
    "payContribList",
    "payTaxList",
    "paySummaryList",
    "payDisburseList"
})
public class Paycheck
    extends Record
{

    protected String batchNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    protected String status;
    protected RecordRef entity;
    protected String address;
    protected RecordRef department;
    protected RecordRef location;
    @XmlElement(name = "class")
    protected RecordRef clazz;
    protected RecordRef workplace;
    protected String tranId;
    protected Double userAmount;
    protected String memo;
    protected RecordRef account;
    protected String payFrequency;
    protected Double balance;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tranDate;
    protected RecordRef postingPeriod;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar periodEnding;
    protected PaycheckPayEarnList payEarnList;
    protected PaycheckPayTimeList payTimeList;
    protected PaycheckPayExpList payExpList;
    protected PaycheckPayPtoList payPtoList;
    protected PaycheckPayDeductList payDeductList;
    protected PaycheckPayContribList payContribList;
    protected PaycheckPayTaxList payTaxList;
    protected PaycheckPaySummaryList paySummaryList;
    protected PaycheckPayDisburseList payDisburseList;
    @XmlAttribute(name = "internalId")
    protected String internalId;
    @XmlAttribute(name = "externalId")
    protected String externalId;

    /**
     * 获取batchNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchNumber() {
        return batchNumber;
    }

    /**
     * 设置batchNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchNumber(String value) {
        this.batchNumber = value;
    }

    /**
     * 获取createdDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * 设置createdDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * 获取lastModifiedDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * 设置lastModifiedDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedDate(XMLGregorianCalendar value) {
        this.lastModifiedDate = value;
    }

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * 获取entity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getEntity() {
        return entity;
    }

    /**
     * 设置entity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setEntity(RecordRef value) {
        this.entity = value;
    }

    /**
     * 获取address属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置address属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * 获取department属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getDepartment() {
        return department;
    }

    /**
     * 设置department属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setDepartment(RecordRef value) {
        this.department = value;
    }

    /**
     * 获取location属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getLocation() {
        return location;
    }

    /**
     * 设置location属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setLocation(RecordRef value) {
        this.location = value;
    }

    /**
     * 获取clazz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getClazz() {
        return clazz;
    }

    /**
     * 设置clazz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setClazz(RecordRef value) {
        this.clazz = value;
    }

    /**
     * 获取workplace属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getWorkplace() {
        return workplace;
    }

    /**
     * 设置workplace属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setWorkplace(RecordRef value) {
        this.workplace = value;
    }

    /**
     * 获取tranId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranId() {
        return tranId;
    }

    /**
     * 设置tranId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranId(String value) {
        this.tranId = value;
    }

    /**
     * 获取userAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUserAmount() {
        return userAmount;
    }

    /**
     * 设置userAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUserAmount(Double value) {
        this.userAmount = value;
    }

    /**
     * 获取memo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 设置memo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
    }

    /**
     * 获取account属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getAccount() {
        return account;
    }

    /**
     * 设置account属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setAccount(RecordRef value) {
        this.account = value;
    }

    /**
     * 获取payFrequency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayFrequency() {
        return payFrequency;
    }

    /**
     * 设置payFrequency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayFrequency(String value) {
        this.payFrequency = value;
    }

    /**
     * 获取balance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBalance() {
        return balance;
    }

    /**
     * 设置balance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBalance(Double value) {
        this.balance = value;
    }

    /**
     * 获取tranDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTranDate() {
        return tranDate;
    }

    /**
     * 设置tranDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTranDate(XMLGregorianCalendar value) {
        this.tranDate = value;
    }

    /**
     * 获取postingPeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPostingPeriod() {
        return postingPeriod;
    }

    /**
     * 设置postingPeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPostingPeriod(RecordRef value) {
        this.postingPeriod = value;
    }

    /**
     * 获取periodEnding属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPeriodEnding() {
        return periodEnding;
    }

    /**
     * 设置periodEnding属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPeriodEnding(XMLGregorianCalendar value) {
        this.periodEnding = value;
    }

    /**
     * 获取payEarnList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PaycheckPayEarnList }
     *     
     */
    public PaycheckPayEarnList getPayEarnList() {
        return payEarnList;
    }

    /**
     * 设置payEarnList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PaycheckPayEarnList }
     *     
     */
    public void setPayEarnList(PaycheckPayEarnList value) {
        this.payEarnList = value;
    }

    /**
     * 获取payTimeList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PaycheckPayTimeList }
     *     
     */
    public PaycheckPayTimeList getPayTimeList() {
        return payTimeList;
    }

    /**
     * 设置payTimeList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PaycheckPayTimeList }
     *     
     */
    public void setPayTimeList(PaycheckPayTimeList value) {
        this.payTimeList = value;
    }

    /**
     * 获取payExpList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PaycheckPayExpList }
     *     
     */
    public PaycheckPayExpList getPayExpList() {
        return payExpList;
    }

    /**
     * 设置payExpList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PaycheckPayExpList }
     *     
     */
    public void setPayExpList(PaycheckPayExpList value) {
        this.payExpList = value;
    }

    /**
     * 获取payPtoList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PaycheckPayPtoList }
     *     
     */
    public PaycheckPayPtoList getPayPtoList() {
        return payPtoList;
    }

    /**
     * 设置payPtoList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PaycheckPayPtoList }
     *     
     */
    public void setPayPtoList(PaycheckPayPtoList value) {
        this.payPtoList = value;
    }

    /**
     * 获取payDeductList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PaycheckPayDeductList }
     *     
     */
    public PaycheckPayDeductList getPayDeductList() {
        return payDeductList;
    }

    /**
     * 设置payDeductList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PaycheckPayDeductList }
     *     
     */
    public void setPayDeductList(PaycheckPayDeductList value) {
        this.payDeductList = value;
    }

    /**
     * 获取payContribList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PaycheckPayContribList }
     *     
     */
    public PaycheckPayContribList getPayContribList() {
        return payContribList;
    }

    /**
     * 设置payContribList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PaycheckPayContribList }
     *     
     */
    public void setPayContribList(PaycheckPayContribList value) {
        this.payContribList = value;
    }

    /**
     * 获取payTaxList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PaycheckPayTaxList }
     *     
     */
    public PaycheckPayTaxList getPayTaxList() {
        return payTaxList;
    }

    /**
     * 设置payTaxList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PaycheckPayTaxList }
     *     
     */
    public void setPayTaxList(PaycheckPayTaxList value) {
        this.payTaxList = value;
    }

    /**
     * 获取paySummaryList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PaycheckPaySummaryList }
     *     
     */
    public PaycheckPaySummaryList getPaySummaryList() {
        return paySummaryList;
    }

    /**
     * 设置paySummaryList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PaycheckPaySummaryList }
     *     
     */
    public void setPaySummaryList(PaycheckPaySummaryList value) {
        this.paySummaryList = value;
    }

    /**
     * 获取payDisburseList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PaycheckPayDisburseList }
     *     
     */
    public PaycheckPayDisburseList getPayDisburseList() {
        return payDisburseList;
    }

    /**
     * 设置payDisburseList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PaycheckPayDisburseList }
     *     
     */
    public void setPayDisburseList(PaycheckPayDisburseList value) {
        this.payDisburseList = value;
    }

    /**
     * 获取internalId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalId() {
        return internalId;
    }

    /**
     * 设置internalId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalId(String value) {
        this.internalId = value;
    }

    /**
     * 获取externalId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * 设置externalId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
    }

}
