
package com.netsuite.webservices.transactions.customers_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.platform.common_2018_2.AccountingBookDetailList;
import com.netsuite.webservices.platform.common_2018_2.types.AvsMatchCode;
import com.netsuite.webservices.platform.core_2018_2.CustomFieldList;
import com.netsuite.webservices.platform.core_2018_2.Record;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;


/**
 * <p>CustomerDeposit complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="CustomerDeposit">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}Record">
 *       &lt;sequence>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customer" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="salesOrder" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="customForm" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="payment" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="currency" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="tranDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="postingPeriod" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="paymentMethod" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="ccIsPurchaseCardBin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ccProcessAsPurchaseCard" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="currencyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exchangeRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="checkNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditCardProcessor" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="creditCard" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="ccSecurityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ccNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subsidiary" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="department" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="class" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="location" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="ccExpireDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="debitCardIssueNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ccName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ccStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ccZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chargeIt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ccApproved" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="pnRefNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ccAvsStreetMatch" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}AvsMatchCode" minOccurs="0"/>
 *         &lt;element name="softDescriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ccAvsZipMatch" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}AvsMatchCode" minOccurs="0"/>
 *         &lt;element name="isRecurringPayment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ccSecurityCodeMatch" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}AvsMatchCode" minOccurs="0"/>
 *         &lt;element name="threeDStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ignoreAvs" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="account" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="undepFunds" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="tranId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applyList" type="{urn:customers_2018_2.transactions.webservices.netsuite.com}CustomerDepositApplyList" minOccurs="0"/>
 *         &lt;element name="accountingBookDetailList" type="{urn:common_2018_2.platform.webservices.netsuite.com}AccountingBookDetailList" minOccurs="0"/>
 *         &lt;element name="customFieldList" type="{urn:core_2018_2.platform.webservices.netsuite.com}CustomFieldList" minOccurs="0"/>
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
@XmlType(name = "CustomerDeposit", propOrder = {
    "createdDate",
    "lastModifiedDate",
    "status",
    "customer",
    "salesOrder",
    "customForm",
    "payment",
    "currency",
    "tranDate",
    "postingPeriod",
    "paymentMethod",
    "ccIsPurchaseCardBin",
    "memo",
    "ccProcessAsPurchaseCard",
    "currencyName",
    "exchangeRate",
    "checkNum",
    "creditCardProcessor",
    "creditCard",
    "ccSecurityCode",
    "ccNumber",
    "subsidiary",
    "department",
    "clazz",
    "location",
    "ccExpireDate",
    "debitCardIssueNo",
    "validFrom",
    "ccName",
    "ccStreet",
    "ccZipCode",
    "chargeIt",
    "ccApproved",
    "pnRefNum",
    "authCode",
    "ccAvsStreetMatch",
    "softDescriptor",
    "ccAvsZipMatch",
    "isRecurringPayment",
    "ccSecurityCodeMatch",
    "threeDStatusCode",
    "ignoreAvs",
    "account",
    "undepFunds",
    "tranId",
    "applyList",
    "accountingBookDetailList",
    "customFieldList"
})
public class CustomerDeposit
    extends Record
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    protected String status;
    protected RecordRef customer;
    protected RecordRef salesOrder;
    protected RecordRef customForm;
    protected Double payment;
    protected RecordRef currency;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tranDate;
    protected RecordRef postingPeriod;
    protected RecordRef paymentMethod;
    protected Boolean ccIsPurchaseCardBin;
    protected String memo;
    protected Boolean ccProcessAsPurchaseCard;
    protected String currencyName;
    protected Double exchangeRate;
    protected String checkNum;
    protected RecordRef creditCardProcessor;
    protected RecordRef creditCard;
    protected String ccSecurityCode;
    protected String ccNumber;
    protected RecordRef subsidiary;
    protected RecordRef department;
    @XmlElement(name = "class")
    protected RecordRef clazz;
    protected RecordRef location;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ccExpireDate;
    protected String debitCardIssueNo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validFrom;
    protected String ccName;
    protected String ccStreet;
    protected String ccZipCode;
    protected Boolean chargeIt;
    protected Boolean ccApproved;
    protected String pnRefNum;
    protected String authCode;
    @XmlSchemaType(name = "string")
    protected AvsMatchCode ccAvsStreetMatch;
    protected String softDescriptor;
    @XmlSchemaType(name = "string")
    protected AvsMatchCode ccAvsZipMatch;
    protected Boolean isRecurringPayment;
    @XmlSchemaType(name = "string")
    protected AvsMatchCode ccSecurityCodeMatch;
    protected String threeDStatusCode;
    protected Boolean ignoreAvs;
    protected RecordRef account;
    protected Boolean undepFunds;
    protected String tranId;
    protected CustomerDepositApplyList applyList;
    protected AccountingBookDetailList accountingBookDetailList;
    protected CustomFieldList customFieldList;
    @XmlAttribute(name = "internalId")
    protected String internalId;
    @XmlAttribute(name = "externalId")
    protected String externalId;

    /**
     * ��ȡcreatedDate���Ե�ֵ��
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
     * ����createdDate���Ե�ֵ��
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
     * ��ȡlastModifiedDate���Ե�ֵ��
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
     * ����lastModifiedDate���Ե�ֵ��
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
     * ��ȡstatus���Ե�ֵ��
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
     * ����status���Ե�ֵ��
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
     * ��ȡcustomer���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCustomer() {
        return customer;
    }

    /**
     * ����customer���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCustomer(RecordRef value) {
        this.customer = value;
    }

    /**
     * ��ȡsalesOrder���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSalesOrder() {
        return salesOrder;
    }

    /**
     * ����salesOrder���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSalesOrder(RecordRef value) {
        this.salesOrder = value;
    }

    /**
     * ��ȡcustomForm���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCustomForm() {
        return customForm;
    }

    /**
     * ����customForm���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCustomForm(RecordRef value) {
        this.customForm = value;
    }

    /**
     * ��ȡpayment���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPayment() {
        return payment;
    }

    /**
     * ����payment���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPayment(Double value) {
        this.payment = value;
    }

    /**
     * ��ȡcurrency���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCurrency() {
        return currency;
    }

    /**
     * ����currency���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCurrency(RecordRef value) {
        this.currency = value;
    }

    /**
     * ��ȡtranDate���Ե�ֵ��
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
     * ����tranDate���Ե�ֵ��
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
     * ��ȡpostingPeriod���Ե�ֵ��
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
     * ����postingPeriod���Ե�ֵ��
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
     * ��ȡpaymentMethod���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * ����paymentMethod���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPaymentMethod(RecordRef value) {
        this.paymentMethod = value;
    }

    /**
     * ��ȡccIsPurchaseCardBin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCcIsPurchaseCardBin() {
        return ccIsPurchaseCardBin;
    }

    /**
     * ����ccIsPurchaseCardBin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCcIsPurchaseCardBin(Boolean value) {
        this.ccIsPurchaseCardBin = value;
    }

    /**
     * ��ȡmemo���Ե�ֵ��
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
     * ����memo���Ե�ֵ��
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
     * ��ȡccProcessAsPurchaseCard���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCcProcessAsPurchaseCard() {
        return ccProcessAsPurchaseCard;
    }

    /**
     * ����ccProcessAsPurchaseCard���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCcProcessAsPurchaseCard(Boolean value) {
        this.ccProcessAsPurchaseCard = value;
    }

    /**
     * ��ȡcurrencyName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyName() {
        return currencyName;
    }

    /**
     * ����currencyName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyName(String value) {
        this.currencyName = value;
    }

    /**
     * ��ȡexchangeRate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExchangeRate() {
        return exchangeRate;
    }

    /**
     * ����exchangeRate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExchangeRate(Double value) {
        this.exchangeRate = value;
    }

    /**
     * ��ȡcheckNum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckNum() {
        return checkNum;
    }

    /**
     * ����checkNum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckNum(String value) {
        this.checkNum = value;
    }

    /**
     * ��ȡcreditCardProcessor���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCreditCardProcessor() {
        return creditCardProcessor;
    }

    /**
     * ����creditCardProcessor���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCreditCardProcessor(RecordRef value) {
        this.creditCardProcessor = value;
    }

    /**
     * ��ȡcreditCard���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCreditCard() {
        return creditCard;
    }

    /**
     * ����creditCard���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCreditCard(RecordRef value) {
        this.creditCard = value;
    }

    /**
     * ��ȡccSecurityCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcSecurityCode() {
        return ccSecurityCode;
    }

    /**
     * ����ccSecurityCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcSecurityCode(String value) {
        this.ccSecurityCode = value;
    }

    /**
     * ��ȡccNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcNumber() {
        return ccNumber;
    }

    /**
     * ����ccNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcNumber(String value) {
        this.ccNumber = value;
    }

    /**
     * ��ȡsubsidiary���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSubsidiary() {
        return subsidiary;
    }

    /**
     * ����subsidiary���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSubsidiary(RecordRef value) {
        this.subsidiary = value;
    }

    /**
     * ��ȡdepartment���Ե�ֵ��
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
     * ����department���Ե�ֵ��
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
     * ��ȡclazz���Ե�ֵ��
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
     * ����clazz���Ե�ֵ��
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
     * ��ȡlocation���Ե�ֵ��
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
     * ����location���Ե�ֵ��
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
     * ��ȡccExpireDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCcExpireDate() {
        return ccExpireDate;
    }

    /**
     * ����ccExpireDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCcExpireDate(XMLGregorianCalendar value) {
        this.ccExpireDate = value;
    }

    /**
     * ��ȡdebitCardIssueNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitCardIssueNo() {
        return debitCardIssueNo;
    }

    /**
     * ����debitCardIssueNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitCardIssueNo(String value) {
        this.debitCardIssueNo = value;
    }

    /**
     * ��ȡvalidFrom���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidFrom() {
        return validFrom;
    }

    /**
     * ����validFrom���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidFrom(XMLGregorianCalendar value) {
        this.validFrom = value;
    }

    /**
     * ��ȡccName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcName() {
        return ccName;
    }

    /**
     * ����ccName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcName(String value) {
        this.ccName = value;
    }

    /**
     * ��ȡccStreet���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcStreet() {
        return ccStreet;
    }

    /**
     * ����ccStreet���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcStreet(String value) {
        this.ccStreet = value;
    }

    /**
     * ��ȡccZipCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcZipCode() {
        return ccZipCode;
    }

    /**
     * ����ccZipCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcZipCode(String value) {
        this.ccZipCode = value;
    }

    /**
     * ��ȡchargeIt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChargeIt() {
        return chargeIt;
    }

    /**
     * ����chargeIt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChargeIt(Boolean value) {
        this.chargeIt = value;
    }

    /**
     * ��ȡccApproved���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCcApproved() {
        return ccApproved;
    }

    /**
     * ����ccApproved���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCcApproved(Boolean value) {
        this.ccApproved = value;
    }

    /**
     * ��ȡpnRefNum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnRefNum() {
        return pnRefNum;
    }

    /**
     * ����pnRefNum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnRefNum(String value) {
        this.pnRefNum = value;
    }

    /**
     * ��ȡauthCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthCode() {
        return authCode;
    }

    /**
     * ����authCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthCode(String value) {
        this.authCode = value;
    }

    /**
     * ��ȡccAvsStreetMatch���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AvsMatchCode }
     *     
     */
    public AvsMatchCode getCcAvsStreetMatch() {
        return ccAvsStreetMatch;
    }

    /**
     * ����ccAvsStreetMatch���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AvsMatchCode }
     *     
     */
    public void setCcAvsStreetMatch(AvsMatchCode value) {
        this.ccAvsStreetMatch = value;
    }

    /**
     * ��ȡsoftDescriptor���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftDescriptor() {
        return softDescriptor;
    }

    /**
     * ����softDescriptor���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftDescriptor(String value) {
        this.softDescriptor = value;
    }

    /**
     * ��ȡccAvsZipMatch���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AvsMatchCode }
     *     
     */
    public AvsMatchCode getCcAvsZipMatch() {
        return ccAvsZipMatch;
    }

    /**
     * ����ccAvsZipMatch���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AvsMatchCode }
     *     
     */
    public void setCcAvsZipMatch(AvsMatchCode value) {
        this.ccAvsZipMatch = value;
    }

    /**
     * ��ȡisRecurringPayment���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRecurringPayment() {
        return isRecurringPayment;
    }

    /**
     * ����isRecurringPayment���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRecurringPayment(Boolean value) {
        this.isRecurringPayment = value;
    }

    /**
     * ��ȡccSecurityCodeMatch���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AvsMatchCode }
     *     
     */
    public AvsMatchCode getCcSecurityCodeMatch() {
        return ccSecurityCodeMatch;
    }

    /**
     * ����ccSecurityCodeMatch���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AvsMatchCode }
     *     
     */
    public void setCcSecurityCodeMatch(AvsMatchCode value) {
        this.ccSecurityCodeMatch = value;
    }

    /**
     * ��ȡthreeDStatusCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreeDStatusCode() {
        return threeDStatusCode;
    }

    /**
     * ����threeDStatusCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreeDStatusCode(String value) {
        this.threeDStatusCode = value;
    }

    /**
     * ��ȡignoreAvs���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreAvs() {
        return ignoreAvs;
    }

    /**
     * ����ignoreAvs���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreAvs(Boolean value) {
        this.ignoreAvs = value;
    }

    /**
     * ��ȡaccount���Ե�ֵ��
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
     * ����account���Ե�ֵ��
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
     * ��ȡundepFunds���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUndepFunds() {
        return undepFunds;
    }

    /**
     * ����undepFunds���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUndepFunds(Boolean value) {
        this.undepFunds = value;
    }

    /**
     * ��ȡtranId���Ե�ֵ��
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
     * ����tranId���Ե�ֵ��
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
     * ��ȡapplyList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CustomerDepositApplyList }
     *     
     */
    public CustomerDepositApplyList getApplyList() {
        return applyList;
    }

    /**
     * ����applyList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDepositApplyList }
     *     
     */
    public void setApplyList(CustomerDepositApplyList value) {
        this.applyList = value;
    }

    /**
     * ��ȡaccountingBookDetailList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AccountingBookDetailList }
     *     
     */
    public AccountingBookDetailList getAccountingBookDetailList() {
        return accountingBookDetailList;
    }

    /**
     * ����accountingBookDetailList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingBookDetailList }
     *     
     */
    public void setAccountingBookDetailList(AccountingBookDetailList value) {
        this.accountingBookDetailList = value;
    }

    /**
     * ��ȡcustomFieldList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CustomFieldList }
     *     
     */
    public CustomFieldList getCustomFieldList() {
        return customFieldList;
    }

    /**
     * ����customFieldList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFieldList }
     *     
     */
    public void setCustomFieldList(CustomFieldList value) {
        this.customFieldList = value;
    }

    /**
     * ��ȡinternalId���Ե�ֵ��
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
     * ����internalId���Ե�ֵ��
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
     * ��ȡexternalId���Ե�ֵ��
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
     * ����externalId���Ե�ֵ��
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