
package com.netsuite.webservices.lists.accounting_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_2.Address;
import com.netsuite.webservices.platform.common_2018_2.types.Country;
import com.netsuite.webservices.platform.core_2018_2.CustomFieldList;
import com.netsuite.webservices.platform.core_2018_2.Record;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;


/**
 * <p>Subsidiary complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Subsidiary">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}Record">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parent" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="isInactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showSubsidiaryName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="logo" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="tranPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pageLogo" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}Country" minOccurs="0"/>
 *         &lt;element name="mainAddress" type="{urn:common_2018_2.platform.webservices.netsuite.com}Address" minOccurs="0"/>
 *         &lt;element name="shippingAddress" type="{urn:common_2018_2.platform.webservices.netsuite.com}Address" minOccurs="0"/>
 *         &lt;element name="returnAddress" type="{urn:common_2018_2.platform.webservices.netsuite.com}Address" minOccurs="0"/>
 *         &lt;element name="legalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isElimination" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fiscalCalendar" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="taxFiscalCalendar" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="allowPayroll" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currency" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="purchaseOrderQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="purchaseOrderAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="purchaseOrderQuantityDiff" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="receiptQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="receiptAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="receiptQuantityDiff" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="edition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="federalIdNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addrLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nonConsol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state1TaxNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxRegistrationList" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}SubsidiaryTaxRegistrationList" minOccurs="0"/>
 *         &lt;element name="ssnOrTin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interCoAccount" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="nexusList" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}SubsidiaryNexusList" minOccurs="0"/>
 *         &lt;element name="accountingBookDetailList" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}SubsidiaryAccountingBookDetailList" minOccurs="0"/>
 *         &lt;element name="checkLayout" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="inboundEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="classTranslationList" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}ClassTranslationList" minOccurs="0"/>
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
@XmlType(name = "Subsidiary", propOrder = {
    "name",
    "parent",
    "isInactive",
    "showSubsidiaryName",
    "url",
    "logo",
    "tranPrefix",
    "pageLogo",
    "state",
    "country",
    "mainAddress",
    "shippingAddress",
    "returnAddress",
    "legalName",
    "isElimination",
    "fiscalCalendar",
    "taxFiscalCalendar",
    "allowPayroll",
    "email",
    "currency",
    "purchaseOrderQuantity",
    "purchaseOrderAmount",
    "purchaseOrderQuantityDiff",
    "receiptQuantity",
    "receiptAmount",
    "receiptQuantityDiff",
    "fax",
    "edition",
    "federalIdNumber",
    "addrLanguage",
    "nonConsol",
    "consol",
    "state1TaxNumber",
    "taxRegistrationList",
    "ssnOrTin",
    "interCoAccount",
    "nexusList",
    "accountingBookDetailList",
    "checkLayout",
    "inboundEmail",
    "classTranslationList",
    "customFieldList"
})
public class Subsidiary
    extends Record
{

    protected String name;
    protected RecordRef parent;
    protected Boolean isInactive;
    protected Boolean showSubsidiaryName;
    protected String url;
    protected RecordRef logo;
    protected String tranPrefix;
    protected RecordRef pageLogo;
    protected String state;
    @XmlSchemaType(name = "string")
    protected Country country;
    protected Address mainAddress;
    protected Address shippingAddress;
    protected Address returnAddress;
    protected String legalName;
    protected Boolean isElimination;
    protected RecordRef fiscalCalendar;
    protected RecordRef taxFiscalCalendar;
    protected Boolean allowPayroll;
    protected String email;
    protected RecordRef currency;
    protected Double purchaseOrderQuantity;
    protected Double purchaseOrderAmount;
    protected Double purchaseOrderQuantityDiff;
    protected Double receiptQuantity;
    protected Double receiptAmount;
    protected Double receiptQuantityDiff;
    protected String fax;
    protected String edition;
    protected String federalIdNumber;
    protected String addrLanguage;
    protected String nonConsol;
    protected String consol;
    protected String state1TaxNumber;
    protected SubsidiaryTaxRegistrationList taxRegistrationList;
    protected String ssnOrTin;
    protected RecordRef interCoAccount;
    protected SubsidiaryNexusList nexusList;
    protected SubsidiaryAccountingBookDetailList accountingBookDetailList;
    protected RecordRef checkLayout;
    protected String inboundEmail;
    protected ClassTranslationList classTranslationList;
    protected CustomFieldList customFieldList;
    @XmlAttribute(name = "internalId")
    protected String internalId;
    @XmlAttribute(name = "externalId")
    protected String externalId;

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取parent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getParent() {
        return parent;
    }

    /**
     * 设置parent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setParent(RecordRef value) {
        this.parent = value;
    }

    /**
     * 获取isInactive属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInactive() {
        return isInactive;
    }

    /**
     * 设置isInactive属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInactive(Boolean value) {
        this.isInactive = value;
    }

    /**
     * 获取showSubsidiaryName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowSubsidiaryName() {
        return showSubsidiaryName;
    }

    /**
     * 设置showSubsidiaryName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowSubsidiaryName(Boolean value) {
        this.showSubsidiaryName = value;
    }

    /**
     * 获取url属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置url属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * 获取logo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getLogo() {
        return logo;
    }

    /**
     * 设置logo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setLogo(RecordRef value) {
        this.logo = value;
    }

    /**
     * 获取tranPrefix属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranPrefix() {
        return tranPrefix;
    }

    /**
     * 设置tranPrefix属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranPrefix(String value) {
        this.tranPrefix = value;
    }

    /**
     * 获取pageLogo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPageLogo() {
        return pageLogo;
    }

    /**
     * 设置pageLogo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPageLogo(RecordRef value) {
        this.pageLogo = value;
    }

    /**
     * 获取state属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * 设置state属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * 获取country属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getCountry() {
        return country;
    }

    /**
     * 设置country属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setCountry(Country value) {
        this.country = value;
    }

    /**
     * 获取mainAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getMainAddress() {
        return mainAddress;
    }

    /**
     * 设置mainAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setMainAddress(Address value) {
        this.mainAddress = value;
    }

    /**
     * 获取shippingAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getShippingAddress() {
        return shippingAddress;
    }

    /**
     * 设置shippingAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setShippingAddress(Address value) {
        this.shippingAddress = value;
    }

    /**
     * 获取returnAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getReturnAddress() {
        return returnAddress;
    }

    /**
     * 设置returnAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setReturnAddress(Address value) {
        this.returnAddress = value;
    }

    /**
     * 获取legalName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalName() {
        return legalName;
    }

    /**
     * 设置legalName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalName(String value) {
        this.legalName = value;
    }

    /**
     * 获取isElimination属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsElimination() {
        return isElimination;
    }

    /**
     * 设置isElimination属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsElimination(Boolean value) {
        this.isElimination = value;
    }

    /**
     * 获取fiscalCalendar属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getFiscalCalendar() {
        return fiscalCalendar;
    }

    /**
     * 设置fiscalCalendar属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setFiscalCalendar(RecordRef value) {
        this.fiscalCalendar = value;
    }

    /**
     * 获取taxFiscalCalendar属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getTaxFiscalCalendar() {
        return taxFiscalCalendar;
    }

    /**
     * 设置taxFiscalCalendar属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setTaxFiscalCalendar(RecordRef value) {
        this.taxFiscalCalendar = value;
    }

    /**
     * 获取allowPayroll属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowPayroll() {
        return allowPayroll;
    }

    /**
     * 设置allowPayroll属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowPayroll(Boolean value) {
        this.allowPayroll = value;
    }

    /**
     * 获取email属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置email属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * 获取currency属性的值。
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
     * 设置currency属性的值。
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
     * 获取purchaseOrderQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPurchaseOrderQuantity() {
        return purchaseOrderQuantity;
    }

    /**
     * 设置purchaseOrderQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPurchaseOrderQuantity(Double value) {
        this.purchaseOrderQuantity = value;
    }

    /**
     * 获取purchaseOrderAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPurchaseOrderAmount() {
        return purchaseOrderAmount;
    }

    /**
     * 设置purchaseOrderAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPurchaseOrderAmount(Double value) {
        this.purchaseOrderAmount = value;
    }

    /**
     * 获取purchaseOrderQuantityDiff属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPurchaseOrderQuantityDiff() {
        return purchaseOrderQuantityDiff;
    }

    /**
     * 设置purchaseOrderQuantityDiff属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPurchaseOrderQuantityDiff(Double value) {
        this.purchaseOrderQuantityDiff = value;
    }

    /**
     * 获取receiptQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getReceiptQuantity() {
        return receiptQuantity;
    }

    /**
     * 设置receiptQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setReceiptQuantity(Double value) {
        this.receiptQuantity = value;
    }

    /**
     * 获取receiptAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getReceiptAmount() {
        return receiptAmount;
    }

    /**
     * 设置receiptAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setReceiptAmount(Double value) {
        this.receiptAmount = value;
    }

    /**
     * 获取receiptQuantityDiff属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getReceiptQuantityDiff() {
        return receiptQuantityDiff;
    }

    /**
     * 设置receiptQuantityDiff属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setReceiptQuantityDiff(Double value) {
        this.receiptQuantityDiff = value;
    }

    /**
     * 获取fax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * 设置fax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * 获取edition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdition() {
        return edition;
    }

    /**
     * 设置edition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdition(String value) {
        this.edition = value;
    }

    /**
     * 获取federalIdNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFederalIdNumber() {
        return federalIdNumber;
    }

    /**
     * 设置federalIdNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFederalIdNumber(String value) {
        this.federalIdNumber = value;
    }

    /**
     * 获取addrLanguage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrLanguage() {
        return addrLanguage;
    }

    /**
     * 设置addrLanguage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrLanguage(String value) {
        this.addrLanguage = value;
    }

    /**
     * 获取nonConsol属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonConsol() {
        return nonConsol;
    }

    /**
     * 设置nonConsol属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonConsol(String value) {
        this.nonConsol = value;
    }

    /**
     * 获取consol属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsol() {
        return consol;
    }

    /**
     * 设置consol属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsol(String value) {
        this.consol = value;
    }

    /**
     * 获取state1TaxNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState1TaxNumber() {
        return state1TaxNumber;
    }

    /**
     * 设置state1TaxNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState1TaxNumber(String value) {
        this.state1TaxNumber = value;
    }

    /**
     * 获取taxRegistrationList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SubsidiaryTaxRegistrationList }
     *     
     */
    public SubsidiaryTaxRegistrationList getTaxRegistrationList() {
        return taxRegistrationList;
    }

    /**
     * 设置taxRegistrationList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SubsidiaryTaxRegistrationList }
     *     
     */
    public void setTaxRegistrationList(SubsidiaryTaxRegistrationList value) {
        this.taxRegistrationList = value;
    }

    /**
     * 获取ssnOrTin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsnOrTin() {
        return ssnOrTin;
    }

    /**
     * 设置ssnOrTin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsnOrTin(String value) {
        this.ssnOrTin = value;
    }

    /**
     * 获取interCoAccount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getInterCoAccount() {
        return interCoAccount;
    }

    /**
     * 设置interCoAccount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setInterCoAccount(RecordRef value) {
        this.interCoAccount = value;
    }

    /**
     * 获取nexusList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SubsidiaryNexusList }
     *     
     */
    public SubsidiaryNexusList getNexusList() {
        return nexusList;
    }

    /**
     * 设置nexusList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SubsidiaryNexusList }
     *     
     */
    public void setNexusList(SubsidiaryNexusList value) {
        this.nexusList = value;
    }

    /**
     * 获取accountingBookDetailList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SubsidiaryAccountingBookDetailList }
     *     
     */
    public SubsidiaryAccountingBookDetailList getAccountingBookDetailList() {
        return accountingBookDetailList;
    }

    /**
     * 设置accountingBookDetailList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SubsidiaryAccountingBookDetailList }
     *     
     */
    public void setAccountingBookDetailList(SubsidiaryAccountingBookDetailList value) {
        this.accountingBookDetailList = value;
    }

    /**
     * 获取checkLayout属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCheckLayout() {
        return checkLayout;
    }

    /**
     * 设置checkLayout属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCheckLayout(RecordRef value) {
        this.checkLayout = value;
    }

    /**
     * 获取inboundEmail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInboundEmail() {
        return inboundEmail;
    }

    /**
     * 设置inboundEmail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInboundEmail(String value) {
        this.inboundEmail = value;
    }

    /**
     * 获取classTranslationList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ClassTranslationList }
     *     
     */
    public ClassTranslationList getClassTranslationList() {
        return classTranslationList;
    }

    /**
     * 设置classTranslationList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ClassTranslationList }
     *     
     */
    public void setClassTranslationList(ClassTranslationList value) {
        this.classTranslationList = value;
    }

    /**
     * 获取customFieldList属性的值。
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
     * 设置customFieldList属性的值。
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
