
package com.netsuite.webservices.transactions.customers_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.platform.common_2018_2.AccountingBookDetailList;
import com.netsuite.webservices.platform.common_2018_2.Address;
import com.netsuite.webservices.platform.common_2018_2.TaxDetailsList;
import com.netsuite.webservices.platform.common_2018_2.types.RevenueStatus;
import com.netsuite.webservices.platform.core_2018_2.CustomFieldList;
import com.netsuite.webservices.platform.core_2018_2.Record;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;


/**
 * <p>CreditMemo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="CreditMemo">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}Record">
 *       &lt;sequence>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="nexus" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="subsidiaryTaxRegNum" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="taxRegOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="taxDetailsOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="customForm" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="currency" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="entity" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="vatRegNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tranDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tranId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entityTaxRegNum" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="createdFrom" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="postingPeriod" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="department" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="class" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="location" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="subsidiary" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="job" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="salesRep" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="partner" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="contribPct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherRefNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="excludeCommission" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="leadSource" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="balance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="account" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="exchangeRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="onCreditHold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amountPaid" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="salesEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="totalCostEstimate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="estGrossProfit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="estGrossProfitPercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="currencyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promoCode" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="amountRemaining" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="discountItem" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="discountRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isTaxable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="taxItem" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="taxRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="unapplied" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="autoApply" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="applied" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="toBePrinted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="toBeEmailed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="toBeFaxed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messageSel" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billingAddress" type="{urn:common_2018_2.platform.webservices.netsuite.com}Address" minOccurs="0"/>
 *         &lt;element name="billAddressList" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="shipMethod" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="shippingCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="shippingTax1Rate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="shippingTaxCode" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="handlingTaxCode" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="shippingTax2Rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="handlingTax1Rate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="handlingTax2Rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="handlingCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="subTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="discountTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="revenueStatus" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}RevenueStatus" minOccurs="0"/>
 *         &lt;element name="recognizedRevenue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="deferredRevenue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="revRecOnRevCommitment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="taxTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="tax2Total" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="altShippingCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="altHandlingCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="isMultiShipTo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="salesGroup" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="syncSalesTeams" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="giftCert" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="giftCertTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="giftCertApplied" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="giftCertAvailable" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="tranIsVsoeBundle" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="vsoeAutoCalc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="syncPartnerTeams" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="salesTeamList" type="{urn:customers_2018_2.transactions.webservices.netsuite.com}CreditMemoSalesTeamList" minOccurs="0"/>
 *         &lt;element name="itemList" type="{urn:customers_2018_2.transactions.webservices.netsuite.com}CreditMemoItemList" minOccurs="0"/>
 *         &lt;element name="accountingBookDetailList" type="{urn:common_2018_2.platform.webservices.netsuite.com}AccountingBookDetailList" minOccurs="0"/>
 *         &lt;element name="partnersList" type="{urn:customers_2018_2.transactions.webservices.netsuite.com}CreditMemoPartnersList" minOccurs="0"/>
 *         &lt;element name="applyList" type="{urn:customers_2018_2.transactions.webservices.netsuite.com}CreditMemoApplyList" minOccurs="0"/>
 *         &lt;element name="taxDetailsList" type="{urn:common_2018_2.platform.webservices.netsuite.com}TaxDetailsList" minOccurs="0"/>
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
@XmlType(name = "CreditMemo", propOrder = {
    "createdDate",
    "lastModifiedDate",
    "nexus",
    "subsidiaryTaxRegNum",
    "taxRegOverride",
    "taxDetailsOverride",
    "customForm",
    "currency",
    "entity",
    "vatRegNum",
    "tranDate",
    "tranId",
    "entityTaxRegNum",
    "createdFrom",
    "postingPeriod",
    "department",
    "clazz",
    "location",
    "subsidiary",
    "job",
    "salesRep",
    "partner",
    "contribPct",
    "otherRefNum",
    "memo",
    "excludeCommission",
    "leadSource",
    "balance",
    "account",
    "exchangeRate",
    "onCreditHold",
    "amountPaid",
    "salesEffectiveDate",
    "totalCostEstimate",
    "estGrossProfit",
    "estGrossProfitPercent",
    "currencyName",
    "promoCode",
    "amountRemaining",
    "discountItem",
    "source",
    "discountRate",
    "isTaxable",
    "taxItem",
    "taxRate",
    "unapplied",
    "autoApply",
    "applied",
    "toBePrinted",
    "toBeEmailed",
    "email",
    "toBeFaxed",
    "fax",
    "messageSel",
    "message",
    "billingAddress",
    "billAddressList",
    "shipMethod",
    "shippingCost",
    "shippingTax1Rate",
    "shippingTaxCode",
    "handlingTaxCode",
    "shippingTax2Rate",
    "handlingTax1Rate",
    "handlingTax2Rate",
    "handlingCost",
    "subTotal",
    "discountTotal",
    "revenueStatus",
    "recognizedRevenue",
    "deferredRevenue",
    "revRecOnRevCommitment",
    "taxTotal",
    "tax2Total",
    "altShippingCost",
    "altHandlingCost",
    "isMultiShipTo",
    "total",
    "salesGroup",
    "syncSalesTeams",
    "status",
    "giftCert",
    "giftCertTotal",
    "giftCertApplied",
    "giftCertAvailable",
    "tranIsVsoeBundle",
    "vsoeAutoCalc",
    "syncPartnerTeams",
    "salesTeamList",
    "itemList",
    "accountingBookDetailList",
    "partnersList",
    "applyList",
    "taxDetailsList",
    "customFieldList"
})
public class CreditMemo
    extends Record
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    protected RecordRef nexus;
    protected RecordRef subsidiaryTaxRegNum;
    protected Boolean taxRegOverride;
    protected Boolean taxDetailsOverride;
    protected RecordRef customForm;
    protected RecordRef currency;
    protected RecordRef entity;
    protected String vatRegNum;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tranDate;
    protected String tranId;
    protected RecordRef entityTaxRegNum;
    protected RecordRef createdFrom;
    protected RecordRef postingPeriod;
    protected RecordRef department;
    @XmlElement(name = "class")
    protected RecordRef clazz;
    protected RecordRef location;
    protected RecordRef subsidiary;
    protected RecordRef job;
    protected RecordRef salesRep;
    protected RecordRef partner;
    protected String contribPct;
    protected String otherRefNum;
    protected String memo;
    protected Boolean excludeCommission;
    protected RecordRef leadSource;
    protected Double balance;
    protected RecordRef account;
    protected Double exchangeRate;
    protected String onCreditHold;
    protected Double amountPaid;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar salesEffectiveDate;
    protected Double totalCostEstimate;
    protected Double estGrossProfit;
    protected Double estGrossProfitPercent;
    protected String currencyName;
    protected RecordRef promoCode;
    protected Double amountRemaining;
    protected RecordRef discountItem;
    protected String source;
    protected String discountRate;
    protected Boolean isTaxable;
    protected RecordRef taxItem;
    protected Double taxRate;
    protected Double unapplied;
    protected Boolean autoApply;
    protected Double applied;
    protected Boolean toBePrinted;
    protected Boolean toBeEmailed;
    protected String email;
    protected Boolean toBeFaxed;
    protected String fax;
    protected RecordRef messageSel;
    protected String message;
    protected Address billingAddress;
    protected RecordRef billAddressList;
    protected RecordRef shipMethod;
    protected Double shippingCost;
    protected Double shippingTax1Rate;
    protected RecordRef shippingTaxCode;
    protected RecordRef handlingTaxCode;
    protected String shippingTax2Rate;
    protected Double handlingTax1Rate;
    protected String handlingTax2Rate;
    protected Double handlingCost;
    protected Double subTotal;
    protected Double discountTotal;
    @XmlSchemaType(name = "string")
    protected RevenueStatus revenueStatus;
    protected Double recognizedRevenue;
    protected Double deferredRevenue;
    protected Boolean revRecOnRevCommitment;
    protected Double taxTotal;
    protected Double tax2Total;
    protected Double altShippingCost;
    protected Double altHandlingCost;
    protected Boolean isMultiShipTo;
    protected Double total;
    protected RecordRef salesGroup;
    protected Boolean syncSalesTeams;
    protected String status;
    protected RecordRef giftCert;
    protected Double giftCertTotal;
    protected Double giftCertApplied;
    protected Double giftCertAvailable;
    protected Boolean tranIsVsoeBundle;
    protected Boolean vsoeAutoCalc;
    protected Boolean syncPartnerTeams;
    protected CreditMemoSalesTeamList salesTeamList;
    protected CreditMemoItemList itemList;
    protected AccountingBookDetailList accountingBookDetailList;
    protected CreditMemoPartnersList partnersList;
    protected CreditMemoApplyList applyList;
    protected TaxDetailsList taxDetailsList;
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
     * ��ȡnexus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getNexus() {
        return nexus;
    }

    /**
     * ����nexus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setNexus(RecordRef value) {
        this.nexus = value;
    }

    /**
     * ��ȡsubsidiaryTaxRegNum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSubsidiaryTaxRegNum() {
        return subsidiaryTaxRegNum;
    }

    /**
     * ����subsidiaryTaxRegNum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSubsidiaryTaxRegNum(RecordRef value) {
        this.subsidiaryTaxRegNum = value;
    }

    /**
     * ��ȡtaxRegOverride���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxRegOverride() {
        return taxRegOverride;
    }

    /**
     * ����taxRegOverride���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxRegOverride(Boolean value) {
        this.taxRegOverride = value;
    }

    /**
     * ��ȡtaxDetailsOverride���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxDetailsOverride() {
        return taxDetailsOverride;
    }

    /**
     * ����taxDetailsOverride���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxDetailsOverride(Boolean value) {
        this.taxDetailsOverride = value;
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
     * ��ȡentity���Ե�ֵ��
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
     * ����entity���Ե�ֵ��
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
     * ��ȡvatRegNum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatRegNum() {
        return vatRegNum;
    }

    /**
     * ����vatRegNum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatRegNum(String value) {
        this.vatRegNum = value;
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
     * ��ȡentityTaxRegNum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getEntityTaxRegNum() {
        return entityTaxRegNum;
    }

    /**
     * ����entityTaxRegNum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setEntityTaxRegNum(RecordRef value) {
        this.entityTaxRegNum = value;
    }

    /**
     * ��ȡcreatedFrom���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCreatedFrom() {
        return createdFrom;
    }

    /**
     * ����createdFrom���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCreatedFrom(RecordRef value) {
        this.createdFrom = value;
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
     * ��ȡjob���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getJob() {
        return job;
    }

    /**
     * ����job���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setJob(RecordRef value) {
        this.job = value;
    }

    /**
     * ��ȡsalesRep���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSalesRep() {
        return salesRep;
    }

    /**
     * ����salesRep���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSalesRep(RecordRef value) {
        this.salesRep = value;
    }

    /**
     * ��ȡpartner���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPartner() {
        return partner;
    }

    /**
     * ����partner���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPartner(RecordRef value) {
        this.partner = value;
    }

    /**
     * ��ȡcontribPct���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContribPct() {
        return contribPct;
    }

    /**
     * ����contribPct���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContribPct(String value) {
        this.contribPct = value;
    }

    /**
     * ��ȡotherRefNum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherRefNum() {
        return otherRefNum;
    }

    /**
     * ����otherRefNum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherRefNum(String value) {
        this.otherRefNum = value;
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
     * ��ȡexcludeCommission���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeCommission() {
        return excludeCommission;
    }

    /**
     * ����excludeCommission���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeCommission(Boolean value) {
        this.excludeCommission = value;
    }

    /**
     * ��ȡleadSource���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getLeadSource() {
        return leadSource;
    }

    /**
     * ����leadSource���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setLeadSource(RecordRef value) {
        this.leadSource = value;
    }

    /**
     * ��ȡbalance���Ե�ֵ��
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
     * ����balance���Ե�ֵ��
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
     * ��ȡonCreditHold���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnCreditHold() {
        return onCreditHold;
    }

    /**
     * ����onCreditHold���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnCreditHold(String value) {
        this.onCreditHold = value;
    }

    /**
     * ��ȡamountPaid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmountPaid() {
        return amountPaid;
    }

    /**
     * ����amountPaid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmountPaid(Double value) {
        this.amountPaid = value;
    }

    /**
     * ��ȡsalesEffectiveDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSalesEffectiveDate() {
        return salesEffectiveDate;
    }

    /**
     * ����salesEffectiveDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSalesEffectiveDate(XMLGregorianCalendar value) {
        this.salesEffectiveDate = value;
    }

    /**
     * ��ȡtotalCostEstimate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalCostEstimate() {
        return totalCostEstimate;
    }

    /**
     * ����totalCostEstimate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalCostEstimate(Double value) {
        this.totalCostEstimate = value;
    }

    /**
     * ��ȡestGrossProfit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEstGrossProfit() {
        return estGrossProfit;
    }

    /**
     * ����estGrossProfit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEstGrossProfit(Double value) {
        this.estGrossProfit = value;
    }

    /**
     * ��ȡestGrossProfitPercent���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEstGrossProfitPercent() {
        return estGrossProfitPercent;
    }

    /**
     * ����estGrossProfitPercent���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEstGrossProfitPercent(Double value) {
        this.estGrossProfitPercent = value;
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
     * ��ȡpromoCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPromoCode() {
        return promoCode;
    }

    /**
     * ����promoCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPromoCode(RecordRef value) {
        this.promoCode = value;
    }

    /**
     * ��ȡamountRemaining���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmountRemaining() {
        return amountRemaining;
    }

    /**
     * ����amountRemaining���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmountRemaining(Double value) {
        this.amountRemaining = value;
    }

    /**
     * ��ȡdiscountItem���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getDiscountItem() {
        return discountItem;
    }

    /**
     * ����discountItem���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setDiscountItem(RecordRef value) {
        this.discountItem = value;
    }

    /**
     * ��ȡsource���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * ����source���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * ��ȡdiscountRate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountRate() {
        return discountRate;
    }

    /**
     * ����discountRate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountRate(String value) {
        this.discountRate = value;
    }

    /**
     * ��ȡisTaxable���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTaxable() {
        return isTaxable;
    }

    /**
     * ����isTaxable���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTaxable(Boolean value) {
        this.isTaxable = value;
    }

    /**
     * ��ȡtaxItem���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getTaxItem() {
        return taxItem;
    }

    /**
     * ����taxItem���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setTaxItem(RecordRef value) {
        this.taxItem = value;
    }

    /**
     * ��ȡtaxRate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxRate() {
        return taxRate;
    }

    /**
     * ����taxRate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxRate(Double value) {
        this.taxRate = value;
    }

    /**
     * ��ȡunapplied���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUnapplied() {
        return unapplied;
    }

    /**
     * ����unapplied���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUnapplied(Double value) {
        this.unapplied = value;
    }

    /**
     * ��ȡautoApply���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoApply() {
        return autoApply;
    }

    /**
     * ����autoApply���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoApply(Boolean value) {
        this.autoApply = value;
    }

    /**
     * ��ȡapplied���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getApplied() {
        return applied;
    }

    /**
     * ����applied���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setApplied(Double value) {
        this.applied = value;
    }

    /**
     * ��ȡtoBePrinted���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isToBePrinted() {
        return toBePrinted;
    }

    /**
     * ����toBePrinted���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setToBePrinted(Boolean value) {
        this.toBePrinted = value;
    }

    /**
     * ��ȡtoBeEmailed���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isToBeEmailed() {
        return toBeEmailed;
    }

    /**
     * ����toBeEmailed���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setToBeEmailed(Boolean value) {
        this.toBeEmailed = value;
    }

    /**
     * ��ȡemail���Ե�ֵ��
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
     * ����email���Ե�ֵ��
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
     * ��ȡtoBeFaxed���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isToBeFaxed() {
        return toBeFaxed;
    }

    /**
     * ����toBeFaxed���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setToBeFaxed(Boolean value) {
        this.toBeFaxed = value;
    }

    /**
     * ��ȡfax���Ե�ֵ��
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
     * ����fax���Ե�ֵ��
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
     * ��ȡmessageSel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getMessageSel() {
        return messageSel;
    }

    /**
     * ����messageSel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setMessageSel(RecordRef value) {
        this.messageSel = value;
    }

    /**
     * ��ȡmessage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * ����message���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * ��ȡbillingAddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getBillingAddress() {
        return billingAddress;
    }

    /**
     * ����billingAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setBillingAddress(Address value) {
        this.billingAddress = value;
    }

    /**
     * ��ȡbillAddressList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getBillAddressList() {
        return billAddressList;
    }

    /**
     * ����billAddressList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setBillAddressList(RecordRef value) {
        this.billAddressList = value;
    }

    /**
     * ��ȡshipMethod���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getShipMethod() {
        return shipMethod;
    }

    /**
     * ����shipMethod���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setShipMethod(RecordRef value) {
        this.shipMethod = value;
    }

    /**
     * ��ȡshippingCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getShippingCost() {
        return shippingCost;
    }

    /**
     * ����shippingCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setShippingCost(Double value) {
        this.shippingCost = value;
    }

    /**
     * ��ȡshippingTax1Rate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getShippingTax1Rate() {
        return shippingTax1Rate;
    }

    /**
     * ����shippingTax1Rate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setShippingTax1Rate(Double value) {
        this.shippingTax1Rate = value;
    }

    /**
     * ��ȡshippingTaxCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getShippingTaxCode() {
        return shippingTaxCode;
    }

    /**
     * ����shippingTaxCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setShippingTaxCode(RecordRef value) {
        this.shippingTaxCode = value;
    }

    /**
     * ��ȡhandlingTaxCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getHandlingTaxCode() {
        return handlingTaxCode;
    }

    /**
     * ����handlingTaxCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setHandlingTaxCode(RecordRef value) {
        this.handlingTaxCode = value;
    }

    /**
     * ��ȡshippingTax2Rate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingTax2Rate() {
        return shippingTax2Rate;
    }

    /**
     * ����shippingTax2Rate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingTax2Rate(String value) {
        this.shippingTax2Rate = value;
    }

    /**
     * ��ȡhandlingTax1Rate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHandlingTax1Rate() {
        return handlingTax1Rate;
    }

    /**
     * ����handlingTax1Rate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHandlingTax1Rate(Double value) {
        this.handlingTax1Rate = value;
    }

    /**
     * ��ȡhandlingTax2Rate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandlingTax2Rate() {
        return handlingTax2Rate;
    }

    /**
     * ����handlingTax2Rate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandlingTax2Rate(String value) {
        this.handlingTax2Rate = value;
    }

    /**
     * ��ȡhandlingCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHandlingCost() {
        return handlingCost;
    }

    /**
     * ����handlingCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHandlingCost(Double value) {
        this.handlingCost = value;
    }

    /**
     * ��ȡsubTotal���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSubTotal() {
        return subTotal;
    }

    /**
     * ����subTotal���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSubTotal(Double value) {
        this.subTotal = value;
    }

    /**
     * ��ȡdiscountTotal���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDiscountTotal() {
        return discountTotal;
    }

    /**
     * ����discountTotal���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDiscountTotal(Double value) {
        this.discountTotal = value;
    }

    /**
     * ��ȡrevenueStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RevenueStatus }
     *     
     */
    public RevenueStatus getRevenueStatus() {
        return revenueStatus;
    }

    /**
     * ����revenueStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RevenueStatus }
     *     
     */
    public void setRevenueStatus(RevenueStatus value) {
        this.revenueStatus = value;
    }

    /**
     * ��ȡrecognizedRevenue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRecognizedRevenue() {
        return recognizedRevenue;
    }

    /**
     * ����recognizedRevenue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRecognizedRevenue(Double value) {
        this.recognizedRevenue = value;
    }

    /**
     * ��ȡdeferredRevenue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDeferredRevenue() {
        return deferredRevenue;
    }

    /**
     * ����deferredRevenue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDeferredRevenue(Double value) {
        this.deferredRevenue = value;
    }

    /**
     * ��ȡrevRecOnRevCommitment���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRevRecOnRevCommitment() {
        return revRecOnRevCommitment;
    }

    /**
     * ����revRecOnRevCommitment���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRevRecOnRevCommitment(Boolean value) {
        this.revRecOnRevCommitment = value;
    }

    /**
     * ��ȡtaxTotal���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxTotal() {
        return taxTotal;
    }

    /**
     * ����taxTotal���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxTotal(Double value) {
        this.taxTotal = value;
    }

    /**
     * ��ȡtax2Total���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTax2Total() {
        return tax2Total;
    }

    /**
     * ����tax2Total���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTax2Total(Double value) {
        this.tax2Total = value;
    }

    /**
     * ��ȡaltShippingCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAltShippingCost() {
        return altShippingCost;
    }

    /**
     * ����altShippingCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAltShippingCost(Double value) {
        this.altShippingCost = value;
    }

    /**
     * ��ȡaltHandlingCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAltHandlingCost() {
        return altHandlingCost;
    }

    /**
     * ����altHandlingCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAltHandlingCost(Double value) {
        this.altHandlingCost = value;
    }

    /**
     * ��ȡisMultiShipTo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMultiShipTo() {
        return isMultiShipTo;
    }

    /**
     * ����isMultiShipTo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMultiShipTo(Boolean value) {
        this.isMultiShipTo = value;
    }

    /**
     * ��ȡtotal���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotal() {
        return total;
    }

    /**
     * ����total���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotal(Double value) {
        this.total = value;
    }

    /**
     * ��ȡsalesGroup���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSalesGroup() {
        return salesGroup;
    }

    /**
     * ����salesGroup���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSalesGroup(RecordRef value) {
        this.salesGroup = value;
    }

    /**
     * ��ȡsyncSalesTeams���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSyncSalesTeams() {
        return syncSalesTeams;
    }

    /**
     * ����syncSalesTeams���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSyncSalesTeams(Boolean value) {
        this.syncSalesTeams = value;
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
     * ��ȡgiftCert���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getGiftCert() {
        return giftCert;
    }

    /**
     * ����giftCert���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setGiftCert(RecordRef value) {
        this.giftCert = value;
    }

    /**
     * ��ȡgiftCertTotal���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGiftCertTotal() {
        return giftCertTotal;
    }

    /**
     * ����giftCertTotal���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGiftCertTotal(Double value) {
        this.giftCertTotal = value;
    }

    /**
     * ��ȡgiftCertApplied���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGiftCertApplied() {
        return giftCertApplied;
    }

    /**
     * ����giftCertApplied���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGiftCertApplied(Double value) {
        this.giftCertApplied = value;
    }

    /**
     * ��ȡgiftCertAvailable���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGiftCertAvailable() {
        return giftCertAvailable;
    }

    /**
     * ����giftCertAvailable���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGiftCertAvailable(Double value) {
        this.giftCertAvailable = value;
    }

    /**
     * ��ȡtranIsVsoeBundle���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTranIsVsoeBundle() {
        return tranIsVsoeBundle;
    }

    /**
     * ����tranIsVsoeBundle���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTranIsVsoeBundle(Boolean value) {
        this.tranIsVsoeBundle = value;
    }

    /**
     * ��ȡvsoeAutoCalc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVsoeAutoCalc() {
        return vsoeAutoCalc;
    }

    /**
     * ����vsoeAutoCalc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVsoeAutoCalc(Boolean value) {
        this.vsoeAutoCalc = value;
    }

    /**
     * ��ȡsyncPartnerTeams���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSyncPartnerTeams() {
        return syncPartnerTeams;
    }

    /**
     * ����syncPartnerTeams���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSyncPartnerTeams(Boolean value) {
        this.syncPartnerTeams = value;
    }

    /**
     * ��ȡsalesTeamList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CreditMemoSalesTeamList }
     *     
     */
    public CreditMemoSalesTeamList getSalesTeamList() {
        return salesTeamList;
    }

    /**
     * ����salesTeamList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CreditMemoSalesTeamList }
     *     
     */
    public void setSalesTeamList(CreditMemoSalesTeamList value) {
        this.salesTeamList = value;
    }

    /**
     * ��ȡitemList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CreditMemoItemList }
     *     
     */
    public CreditMemoItemList getItemList() {
        return itemList;
    }

    /**
     * ����itemList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CreditMemoItemList }
     *     
     */
    public void setItemList(CreditMemoItemList value) {
        this.itemList = value;
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
     * ��ȡpartnersList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CreditMemoPartnersList }
     *     
     */
    public CreditMemoPartnersList getPartnersList() {
        return partnersList;
    }

    /**
     * ����partnersList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CreditMemoPartnersList }
     *     
     */
    public void setPartnersList(CreditMemoPartnersList value) {
        this.partnersList = value;
    }

    /**
     * ��ȡapplyList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CreditMemoApplyList }
     *     
     */
    public CreditMemoApplyList getApplyList() {
        return applyList;
    }

    /**
     * ����applyList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CreditMemoApplyList }
     *     
     */
    public void setApplyList(CreditMemoApplyList value) {
        this.applyList = value;
    }

    /**
     * ��ȡtaxDetailsList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TaxDetailsList }
     *     
     */
    public TaxDetailsList getTaxDetailsList() {
        return taxDetailsList;
    }

    /**
     * ����taxDetailsList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDetailsList }
     *     
     */
    public void setTaxDetailsList(TaxDetailsList value) {
        this.taxDetailsList = value;
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
