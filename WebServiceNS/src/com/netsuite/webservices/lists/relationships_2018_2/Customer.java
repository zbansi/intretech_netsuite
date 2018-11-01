
package com.netsuite.webservices.lists.relationships_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.lists.relationships_2018_2.types.CustomerCreditHoldOverride;
import com.netsuite.webservices.lists.relationships_2018_2.types.CustomerMonthlyClosing;
import com.netsuite.webservices.lists.relationships_2018_2.types.CustomerNegativeNumberFormat;
import com.netsuite.webservices.lists.relationships_2018_2.types.CustomerNumberFormat;
import com.netsuite.webservices.lists.relationships_2018_2.types.CustomerStage;
import com.netsuite.webservices.lists.relationships_2018_2.types.EmailPreference;
import com.netsuite.webservices.platform.common_2018_2.types.AlcoholRecipientType;
import com.netsuite.webservices.platform.common_2018_2.types.Country;
import com.netsuite.webservices.platform.common_2018_2.types.CurrencySymbolPlacement;
import com.netsuite.webservices.platform.common_2018_2.types.GlobalSubscriptionStatus;
import com.netsuite.webservices.platform.common_2018_2.types.Language;
import com.netsuite.webservices.platform.core_2018_2.CustomFieldList;
import com.netsuite.webservices.platform.core_2018_2.Record;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;


/**
 * <p>Customer complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Customer">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}Record">
 *       &lt;sequence>
 *         &lt;element name="customForm" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="entityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="altName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isPerson" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="phoneticName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salutation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entityStatus" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="parent" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="defaultAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isInactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="category" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="printOnCheckAs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="altPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="homePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="altEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="language" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}Language" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberFormat" type="{urn:types.relationships_2018_2.lists.webservices.netsuite.com}CustomerNumberFormat" minOccurs="0"/>
 *         &lt;element name="negativeNumberFormat" type="{urn:types.relationships_2018_2.lists.webservices.netsuite.com}CustomerNegativeNumberFormat" minOccurs="0"/>
 *         &lt;element name="dateCreated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="image" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="emailPreference" type="{urn:types.relationships_2018_2.lists.webservices.netsuite.com}EmailPreference" minOccurs="0"/>
 *         &lt;element name="subsidiary" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="representingSubsidiary" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="salesRep" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="territory" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="contribPct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partner" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="salesGroup" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="vatRegNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxExempt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="terms" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="creditLimit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="creditHoldOverride" type="{urn:types.relationships_2018_2.lists.webservices.netsuite.com}CustomerCreditHoldOverride" minOccurs="0"/>
 *         &lt;element name="monthlyClosing" type="{urn:types.relationships_2018_2.lists.webservices.netsuite.com}CustomerMonthlyClosing" minOccurs="0"/>
 *         &lt;element name="overrideCurrencyFormat" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="displaySymbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="symbolPlacement" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}CurrencySymbolPlacement" minOccurs="0"/>
 *         &lt;element name="balance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="overdueBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="daysOverdue" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="unbilledOrders" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="consolUnbilledOrders" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="consolOverdueBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="consolDepositBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="consolBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="consolAging" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="consolAging1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="consolAging2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="consolAging3" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="consolAging4" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="consolDaysOverdue" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="priceLevel" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="currency" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="prefCCProcessor" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="depositBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="shipComplete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="taxable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="taxItem" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="resaleNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aging" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="aging1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="aging2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="aging3" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="aging4" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="alcoholRecipientType" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}AlcoholRecipientType" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="reminderDays" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="shippingItem" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="thirdPartyAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="thirdPartyZipcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="thirdPartyCountry" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}Country" minOccurs="0"/>
 *         &lt;element name="giveAccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="estimatedBudget" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="accessRole" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="sendEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="assignedWebSite" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requirePwdChange" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="campaignCategory" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="sourceWebSite" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="leadSource" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="receivablesAccount" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="drAccount" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="fxAccount" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="defaultOrderPriority" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="webLead" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referrer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="keywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clickStream" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastPageVisited" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visits" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="firstVisit" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastVisit" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="billPay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="openingBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="lastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="openingBalanceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="openingBalanceAccount" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="stage" type="{urn:types.relationships_2018_2.lists.webservices.netsuite.com}CustomerStage" minOccurs="0"/>
 *         &lt;element name="emailTransactions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="printTransactions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="faxTransactions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="syncPartnerTeams" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isBudgetApproved" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="globalSubscriptionStatus" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}GlobalSubscriptionStatus" minOccurs="0"/>
 *         &lt;element name="salesReadiness" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="salesTeamList" type="{urn:relationships_2018_2.lists.webservices.netsuite.com}CustomerSalesTeamList" minOccurs="0"/>
 *         &lt;element name="buyingReason" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="downloadList" type="{urn:relationships_2018_2.lists.webservices.netsuite.com}CustomerDownloadList" minOccurs="0"/>
 *         &lt;element name="buyingTimeFrame" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="addressbookList" type="{urn:relationships_2018_2.lists.webservices.netsuite.com}CustomerAddressbookList" minOccurs="0"/>
 *         &lt;element name="subscriptionsList" type="{urn:relationships_2018_2.lists.webservices.netsuite.com}SubscriptionsList" minOccurs="0"/>
 *         &lt;element name="contactRolesList" type="{urn:relationships_2018_2.lists.webservices.netsuite.com}ContactAccessRolesList" minOccurs="0"/>
 *         &lt;element name="currencyList" type="{urn:relationships_2018_2.lists.webservices.netsuite.com}CustomerCurrencyList" minOccurs="0"/>
 *         &lt;element name="creditCardsList" type="{urn:relationships_2018_2.lists.webservices.netsuite.com}CustomerCreditCardsList" minOccurs="0"/>
 *         &lt;element name="partnersList" type="{urn:relationships_2018_2.lists.webservices.netsuite.com}CustomerPartnersList" minOccurs="0"/>
 *         &lt;element name="groupPricingList" type="{urn:relationships_2018_2.lists.webservices.netsuite.com}CustomerGroupPricingList" minOccurs="0"/>
 *         &lt;element name="itemPricingList" type="{urn:relationships_2018_2.lists.webservices.netsuite.com}CustomerItemPricingList" minOccurs="0"/>
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
@XmlType(name = "Customer", propOrder = {
    "customForm",
    "entityId",
    "altName",
    "isPerson",
    "phoneticName",
    "salutation",
    "firstName",
    "middleName",
    "lastName",
    "companyName",
    "entityStatus",
    "parent",
    "phone",
    "fax",
    "email",
    "url",
    "defaultAddress",
    "isInactive",
    "category",
    "title",
    "printOnCheckAs",
    "altPhone",
    "homePhone",
    "mobilePhone",
    "altEmail",
    "language",
    "comments",
    "numberFormat",
    "negativeNumberFormat",
    "dateCreated",
    "image",
    "emailPreference",
    "subsidiary",
    "representingSubsidiary",
    "salesRep",
    "territory",
    "contribPct",
    "partner",
    "salesGroup",
    "vatRegNumber",
    "accountNumber",
    "taxExempt",
    "terms",
    "creditLimit",
    "creditHoldOverride",
    "monthlyClosing",
    "overrideCurrencyFormat",
    "displaySymbol",
    "symbolPlacement",
    "balance",
    "overdueBalance",
    "daysOverdue",
    "unbilledOrders",
    "consolUnbilledOrders",
    "consolOverdueBalance",
    "consolDepositBalance",
    "consolBalance",
    "consolAging",
    "consolAging1",
    "consolAging2",
    "consolAging3",
    "consolAging4",
    "consolDaysOverdue",
    "priceLevel",
    "currency",
    "prefCCProcessor",
    "depositBalance",
    "shipComplete",
    "taxable",
    "taxItem",
    "resaleNumber",
    "aging",
    "aging1",
    "aging2",
    "aging3",
    "aging4",
    "startDate",
    "alcoholRecipientType",
    "endDate",
    "reminderDays",
    "shippingItem",
    "thirdPartyAcct",
    "thirdPartyZipcode",
    "thirdPartyCountry",
    "giveAccess",
    "estimatedBudget",
    "accessRole",
    "sendEmail",
    "assignedWebSite",
    "password",
    "password2",
    "requirePwdChange",
    "campaignCategory",
    "sourceWebSite",
    "leadSource",
    "receivablesAccount",
    "drAccount",
    "fxAccount",
    "defaultOrderPriority",
    "webLead",
    "referrer",
    "keywords",
    "clickStream",
    "lastPageVisited",
    "visits",
    "firstVisit",
    "lastVisit",
    "billPay",
    "openingBalance",
    "lastModifiedDate",
    "openingBalanceDate",
    "openingBalanceAccount",
    "stage",
    "emailTransactions",
    "printTransactions",
    "faxTransactions",
    "syncPartnerTeams",
    "isBudgetApproved",
    "globalSubscriptionStatus",
    "salesReadiness",
    "salesTeamList",
    "buyingReason",
    "downloadList",
    "buyingTimeFrame",
    "addressbookList",
    "subscriptionsList",
    "contactRolesList",
    "currencyList",
    "creditCardsList",
    "partnersList",
    "groupPricingList",
    "itemPricingList",
    "customFieldList"
})
public class Customer
    extends Record
{

    protected RecordRef customForm;
    protected String entityId;
    protected String altName;
    protected Boolean isPerson;
    protected String phoneticName;
    protected String salutation;
    protected String firstName;
    protected String middleName;
    protected String lastName;
    protected String companyName;
    protected RecordRef entityStatus;
    protected RecordRef parent;
    protected String phone;
    protected String fax;
    protected String email;
    protected String url;
    protected String defaultAddress;
    protected Boolean isInactive;
    protected RecordRef category;
    protected String title;
    protected String printOnCheckAs;
    protected String altPhone;
    protected String homePhone;
    protected String mobilePhone;
    protected String altEmail;
    @XmlSchemaType(name = "string")
    protected Language language;
    protected String comments;
    @XmlSchemaType(name = "string")
    protected CustomerNumberFormat numberFormat;
    @XmlSchemaType(name = "string")
    protected CustomerNegativeNumberFormat negativeNumberFormat;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreated;
    protected RecordRef image;
    @XmlSchemaType(name = "string")
    protected EmailPreference emailPreference;
    protected RecordRef subsidiary;
    protected RecordRef representingSubsidiary;
    protected RecordRef salesRep;
    protected RecordRef territory;
    protected String contribPct;
    protected RecordRef partner;
    protected RecordRef salesGroup;
    protected String vatRegNumber;
    protected String accountNumber;
    protected Boolean taxExempt;
    protected RecordRef terms;
    protected Double creditLimit;
    @XmlSchemaType(name = "string")
    protected CustomerCreditHoldOverride creditHoldOverride;
    @XmlSchemaType(name = "string")
    protected CustomerMonthlyClosing monthlyClosing;
    protected Boolean overrideCurrencyFormat;
    protected String displaySymbol;
    @XmlSchemaType(name = "string")
    protected CurrencySymbolPlacement symbolPlacement;
    protected Double balance;
    protected Double overdueBalance;
    protected Long daysOverdue;
    protected Double unbilledOrders;
    protected Double consolUnbilledOrders;
    protected Double consolOverdueBalance;
    protected Double consolDepositBalance;
    protected Double consolBalance;
    protected Double consolAging;
    protected Double consolAging1;
    protected Double consolAging2;
    protected Double consolAging3;
    protected Double consolAging4;
    protected Long consolDaysOverdue;
    protected RecordRef priceLevel;
    protected RecordRef currency;
    protected RecordRef prefCCProcessor;
    protected Double depositBalance;
    protected Boolean shipComplete;
    protected Boolean taxable;
    protected RecordRef taxItem;
    protected String resaleNumber;
    protected Double aging;
    protected Double aging1;
    protected Double aging2;
    protected Double aging3;
    protected Double aging4;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "string")
    protected AlcoholRecipientType alcoholRecipientType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected Long reminderDays;
    protected RecordRef shippingItem;
    protected String thirdPartyAcct;
    protected String thirdPartyZipcode;
    @XmlSchemaType(name = "string")
    protected Country thirdPartyCountry;
    protected Boolean giveAccess;
    protected Double estimatedBudget;
    protected RecordRef accessRole;
    protected Boolean sendEmail;
    protected RecordRef assignedWebSite;
    protected String password;
    protected String password2;
    protected Boolean requirePwdChange;
    protected RecordRef campaignCategory;
    protected RecordRef sourceWebSite;
    protected RecordRef leadSource;
    protected RecordRef receivablesAccount;
    protected RecordRef drAccount;
    protected RecordRef fxAccount;
    protected Double defaultOrderPriority;
    protected String webLead;
    protected String referrer;
    protected String keywords;
    protected String clickStream;
    protected String lastPageVisited;
    protected Long visits;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstVisit;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastVisit;
    protected Boolean billPay;
    protected Double openingBalance;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar openingBalanceDate;
    protected RecordRef openingBalanceAccount;
    @XmlSchemaType(name = "string")
    protected CustomerStage stage;
    protected Boolean emailTransactions;
    protected Boolean printTransactions;
    protected Boolean faxTransactions;
    protected Boolean syncPartnerTeams;
    protected Boolean isBudgetApproved;
    @XmlSchemaType(name = "string")
    protected GlobalSubscriptionStatus globalSubscriptionStatus;
    protected RecordRef salesReadiness;
    protected CustomerSalesTeamList salesTeamList;
    protected RecordRef buyingReason;
    protected CustomerDownloadList downloadList;
    protected RecordRef buyingTimeFrame;
    protected CustomerAddressbookList addressbookList;
    protected SubscriptionsList subscriptionsList;
    protected ContactAccessRolesList contactRolesList;
    protected CustomerCurrencyList currencyList;
    protected CustomerCreditCardsList creditCardsList;
    protected CustomerPartnersList partnersList;
    protected CustomerGroupPricingList groupPricingList;
    protected CustomerItemPricingList itemPricingList;
    protected CustomFieldList customFieldList;
    @XmlAttribute(name = "internalId")
    protected String internalId;
    @XmlAttribute(name = "externalId")
    protected String externalId;

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
     * ��ȡentityId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityId() {
        return entityId;
    }

    /**
     * ����entityId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityId(String value) {
        this.entityId = value;
    }

    /**
     * ��ȡaltName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltName() {
        return altName;
    }

    /**
     * ����altName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltName(String value) {
        this.altName = value;
    }

    /**
     * ��ȡisPerson���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPerson() {
        return isPerson;
    }

    /**
     * ����isPerson���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPerson(Boolean value) {
        this.isPerson = value;
    }

    /**
     * ��ȡphoneticName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneticName() {
        return phoneticName;
    }

    /**
     * ����phoneticName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneticName(String value) {
        this.phoneticName = value;
    }

    /**
     * ��ȡsalutation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalutation() {
        return salutation;
    }

    /**
     * ����salutation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalutation(String value) {
        this.salutation = value;
    }

    /**
     * ��ȡfirstName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * ����firstName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * ��ȡmiddleName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * ����middleName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * ��ȡlastName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * ����lastName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * ��ȡcompanyName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * ����companyName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * ��ȡentityStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getEntityStatus() {
        return entityStatus;
    }

    /**
     * ����entityStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setEntityStatus(RecordRef value) {
        this.entityStatus = value;
    }

    /**
     * ��ȡparent���Ե�ֵ��
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
     * ����parent���Ե�ֵ��
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
     * ��ȡphone���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * ����phone���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
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
     * ��ȡurl���Ե�ֵ��
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
     * ����url���Ե�ֵ��
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
     * ��ȡdefaultAddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultAddress() {
        return defaultAddress;
    }

    /**
     * ����defaultAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultAddress(String value) {
        this.defaultAddress = value;
    }

    /**
     * ��ȡisInactive���Ե�ֵ��
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
     * ����isInactive���Ե�ֵ��
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
     * ��ȡcategory���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCategory() {
        return category;
    }

    /**
     * ����category���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCategory(RecordRef value) {
        this.category = value;
    }

    /**
     * ��ȡtitle���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * ����title���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * ��ȡprintOnCheckAs���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintOnCheckAs() {
        return printOnCheckAs;
    }

    /**
     * ����printOnCheckAs���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintOnCheckAs(String value) {
        this.printOnCheckAs = value;
    }

    /**
     * ��ȡaltPhone���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltPhone() {
        return altPhone;
    }

    /**
     * ����altPhone���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltPhone(String value) {
        this.altPhone = value;
    }

    /**
     * ��ȡhomePhone���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * ����homePhone���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhone(String value) {
        this.homePhone = value;
    }

    /**
     * ��ȡmobilePhone���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * ����mobilePhone���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhone(String value) {
        this.mobilePhone = value;
    }

    /**
     * ��ȡaltEmail���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltEmail() {
        return altEmail;
    }

    /**
     * ����altEmail���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltEmail(String value) {
        this.altEmail = value;
    }

    /**
     * ��ȡlanguage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Language }
     *     
     */
    public Language getLanguage() {
        return language;
    }

    /**
     * ����language���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Language }
     *     
     */
    public void setLanguage(Language value) {
        this.language = value;
    }

    /**
     * ��ȡcomments���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * ����comments���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * ��ȡnumberFormat���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CustomerNumberFormat }
     *     
     */
    public CustomerNumberFormat getNumberFormat() {
        return numberFormat;
    }

    /**
     * ����numberFormat���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerNumberFormat }
     *     
     */
    public void setNumberFormat(CustomerNumberFormat value) {
        this.numberFormat = value;
    }

    /**
     * ��ȡnegativeNumberFormat���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CustomerNegativeNumberFormat }
     *     
     */
    public CustomerNegativeNumberFormat getNegativeNumberFormat() {
        return negativeNumberFormat;
    }

    /**
     * ����negativeNumberFormat���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerNegativeNumberFormat }
     *     
     */
    public void setNegativeNumberFormat(CustomerNegativeNumberFormat value) {
        this.negativeNumberFormat = value;
    }

    /**
     * ��ȡdateCreated���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCreated() {
        return dateCreated;
    }

    /**
     * ����dateCreated���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCreated(XMLGregorianCalendar value) {
        this.dateCreated = value;
    }

    /**
     * ��ȡimage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getImage() {
        return image;
    }

    /**
     * ����image���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setImage(RecordRef value) {
        this.image = value;
    }

    /**
     * ��ȡemailPreference���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link EmailPreference }
     *     
     */
    public EmailPreference getEmailPreference() {
        return emailPreference;
    }

    /**
     * ����emailPreference���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link EmailPreference }
     *     
     */
    public void setEmailPreference(EmailPreference value) {
        this.emailPreference = value;
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
     * ��ȡrepresentingSubsidiary���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getRepresentingSubsidiary() {
        return representingSubsidiary;
    }

    /**
     * ����representingSubsidiary���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setRepresentingSubsidiary(RecordRef value) {
        this.representingSubsidiary = value;
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
     * ��ȡterritory���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getTerritory() {
        return territory;
    }

    /**
     * ����territory���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setTerritory(RecordRef value) {
        this.territory = value;
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
     * ��ȡvatRegNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatRegNumber() {
        return vatRegNumber;
    }

    /**
     * ����vatRegNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatRegNumber(String value) {
        this.vatRegNumber = value;
    }

    /**
     * ��ȡaccountNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * ����accountNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * ��ȡtaxExempt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxExempt() {
        return taxExempt;
    }

    /**
     * ����taxExempt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxExempt(Boolean value) {
        this.taxExempt = value;
    }

    /**
     * ��ȡterms���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getTerms() {
        return terms;
    }

    /**
     * ����terms���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setTerms(RecordRef value) {
        this.terms = value;
    }

    /**
     * ��ȡcreditLimit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCreditLimit() {
        return creditLimit;
    }

    /**
     * ����creditLimit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCreditLimit(Double value) {
        this.creditLimit = value;
    }

    /**
     * ��ȡcreditHoldOverride���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CustomerCreditHoldOverride }
     *     
     */
    public CustomerCreditHoldOverride getCreditHoldOverride() {
        return creditHoldOverride;
    }

    /**
     * ����creditHoldOverride���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerCreditHoldOverride }
     *     
     */
    public void setCreditHoldOverride(CustomerCreditHoldOverride value) {
        this.creditHoldOverride = value;
    }

    /**
     * ��ȡmonthlyClosing���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CustomerMonthlyClosing }
     *     
     */
    public CustomerMonthlyClosing getMonthlyClosing() {
        return monthlyClosing;
    }

    /**
     * ����monthlyClosing���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerMonthlyClosing }
     *     
     */
    public void setMonthlyClosing(CustomerMonthlyClosing value) {
        this.monthlyClosing = value;
    }

    /**
     * ��ȡoverrideCurrencyFormat���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverrideCurrencyFormat() {
        return overrideCurrencyFormat;
    }

    /**
     * ����overrideCurrencyFormat���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverrideCurrencyFormat(Boolean value) {
        this.overrideCurrencyFormat = value;
    }

    /**
     * ��ȡdisplaySymbol���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplaySymbol() {
        return displaySymbol;
    }

    /**
     * ����displaySymbol���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplaySymbol(String value) {
        this.displaySymbol = value;
    }

    /**
     * ��ȡsymbolPlacement���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CurrencySymbolPlacement }
     *     
     */
    public CurrencySymbolPlacement getSymbolPlacement() {
        return symbolPlacement;
    }

    /**
     * ����symbolPlacement���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencySymbolPlacement }
     *     
     */
    public void setSymbolPlacement(CurrencySymbolPlacement value) {
        this.symbolPlacement = value;
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
     * ��ȡoverdueBalance���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOverdueBalance() {
        return overdueBalance;
    }

    /**
     * ����overdueBalance���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOverdueBalance(Double value) {
        this.overdueBalance = value;
    }

    /**
     * ��ȡdaysOverdue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDaysOverdue() {
        return daysOverdue;
    }

    /**
     * ����daysOverdue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDaysOverdue(Long value) {
        this.daysOverdue = value;
    }

    /**
     * ��ȡunbilledOrders���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUnbilledOrders() {
        return unbilledOrders;
    }

    /**
     * ����unbilledOrders���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUnbilledOrders(Double value) {
        this.unbilledOrders = value;
    }

    /**
     * ��ȡconsolUnbilledOrders���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConsolUnbilledOrders() {
        return consolUnbilledOrders;
    }

    /**
     * ����consolUnbilledOrders���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConsolUnbilledOrders(Double value) {
        this.consolUnbilledOrders = value;
    }

    /**
     * ��ȡconsolOverdueBalance���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConsolOverdueBalance() {
        return consolOverdueBalance;
    }

    /**
     * ����consolOverdueBalance���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConsolOverdueBalance(Double value) {
        this.consolOverdueBalance = value;
    }

    /**
     * ��ȡconsolDepositBalance���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConsolDepositBalance() {
        return consolDepositBalance;
    }

    /**
     * ����consolDepositBalance���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConsolDepositBalance(Double value) {
        this.consolDepositBalance = value;
    }

    /**
     * ��ȡconsolBalance���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConsolBalance() {
        return consolBalance;
    }

    /**
     * ����consolBalance���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConsolBalance(Double value) {
        this.consolBalance = value;
    }

    /**
     * ��ȡconsolAging���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConsolAging() {
        return consolAging;
    }

    /**
     * ����consolAging���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConsolAging(Double value) {
        this.consolAging = value;
    }

    /**
     * ��ȡconsolAging1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConsolAging1() {
        return consolAging1;
    }

    /**
     * ����consolAging1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConsolAging1(Double value) {
        this.consolAging1 = value;
    }

    /**
     * ��ȡconsolAging2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConsolAging2() {
        return consolAging2;
    }

    /**
     * ����consolAging2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConsolAging2(Double value) {
        this.consolAging2 = value;
    }

    /**
     * ��ȡconsolAging3���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConsolAging3() {
        return consolAging3;
    }

    /**
     * ����consolAging3���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConsolAging3(Double value) {
        this.consolAging3 = value;
    }

    /**
     * ��ȡconsolAging4���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConsolAging4() {
        return consolAging4;
    }

    /**
     * ����consolAging4���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConsolAging4(Double value) {
        this.consolAging4 = value;
    }

    /**
     * ��ȡconsolDaysOverdue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConsolDaysOverdue() {
        return consolDaysOverdue;
    }

    /**
     * ����consolDaysOverdue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConsolDaysOverdue(Long value) {
        this.consolDaysOverdue = value;
    }

    /**
     * ��ȡpriceLevel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPriceLevel() {
        return priceLevel;
    }

    /**
     * ����priceLevel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPriceLevel(RecordRef value) {
        this.priceLevel = value;
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
     * ��ȡprefCCProcessor���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPrefCCProcessor() {
        return prefCCProcessor;
    }

    /**
     * ����prefCCProcessor���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPrefCCProcessor(RecordRef value) {
        this.prefCCProcessor = value;
    }

    /**
     * ��ȡdepositBalance���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDepositBalance() {
        return depositBalance;
    }

    /**
     * ����depositBalance���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDepositBalance(Double value) {
        this.depositBalance = value;
    }

    /**
     * ��ȡshipComplete���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShipComplete() {
        return shipComplete;
    }

    /**
     * ����shipComplete���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShipComplete(Boolean value) {
        this.shipComplete = value;
    }

    /**
     * ��ȡtaxable���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxable() {
        return taxable;
    }

    /**
     * ����taxable���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxable(Boolean value) {
        this.taxable = value;
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
     * ��ȡresaleNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResaleNumber() {
        return resaleNumber;
    }

    /**
     * ����resaleNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResaleNumber(String value) {
        this.resaleNumber = value;
    }

    /**
     * ��ȡaging���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAging() {
        return aging;
    }

    /**
     * ����aging���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAging(Double value) {
        this.aging = value;
    }

    /**
     * ��ȡaging1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAging1() {
        return aging1;
    }

    /**
     * ����aging1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAging1(Double value) {
        this.aging1 = value;
    }

    /**
     * ��ȡaging2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAging2() {
        return aging2;
    }

    /**
     * ����aging2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAging2(Double value) {
        this.aging2 = value;
    }

    /**
     * ��ȡaging3���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAging3() {
        return aging3;
    }

    /**
     * ����aging3���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAging3(Double value) {
        this.aging3 = value;
    }

    /**
     * ��ȡaging4���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAging4() {
        return aging4;
    }

    /**
     * ����aging4���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAging4(Double value) {
        this.aging4 = value;
    }

    /**
     * ��ȡstartDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * ����startDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * ��ȡalcoholRecipientType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AlcoholRecipientType }
     *     
     */
    public AlcoholRecipientType getAlcoholRecipientType() {
        return alcoholRecipientType;
    }

    /**
     * ����alcoholRecipientType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AlcoholRecipientType }
     *     
     */
    public void setAlcoholRecipientType(AlcoholRecipientType value) {
        this.alcoholRecipientType = value;
    }

    /**
     * ��ȡendDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * ����endDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * ��ȡreminderDays���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReminderDays() {
        return reminderDays;
    }

    /**
     * ����reminderDays���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReminderDays(Long value) {
        this.reminderDays = value;
    }

    /**
     * ��ȡshippingItem���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getShippingItem() {
        return shippingItem;
    }

    /**
     * ����shippingItem���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setShippingItem(RecordRef value) {
        this.shippingItem = value;
    }

    /**
     * ��ȡthirdPartyAcct���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyAcct() {
        return thirdPartyAcct;
    }

    /**
     * ����thirdPartyAcct���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyAcct(String value) {
        this.thirdPartyAcct = value;
    }

    /**
     * ��ȡthirdPartyZipcode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyZipcode() {
        return thirdPartyZipcode;
    }

    /**
     * ����thirdPartyZipcode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyZipcode(String value) {
        this.thirdPartyZipcode = value;
    }

    /**
     * ��ȡthirdPartyCountry���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getThirdPartyCountry() {
        return thirdPartyCountry;
    }

    /**
     * ����thirdPartyCountry���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setThirdPartyCountry(Country value) {
        this.thirdPartyCountry = value;
    }

    /**
     * ��ȡgiveAccess���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGiveAccess() {
        return giveAccess;
    }

    /**
     * ����giveAccess���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGiveAccess(Boolean value) {
        this.giveAccess = value;
    }

    /**
     * ��ȡestimatedBudget���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEstimatedBudget() {
        return estimatedBudget;
    }

    /**
     * ����estimatedBudget���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEstimatedBudget(Double value) {
        this.estimatedBudget = value;
    }

    /**
     * ��ȡaccessRole���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getAccessRole() {
        return accessRole;
    }

    /**
     * ����accessRole���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setAccessRole(RecordRef value) {
        this.accessRole = value;
    }

    /**
     * ��ȡsendEmail���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendEmail() {
        return sendEmail;
    }

    /**
     * ����sendEmail���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendEmail(Boolean value) {
        this.sendEmail = value;
    }

    /**
     * ��ȡassignedWebSite���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getAssignedWebSite() {
        return assignedWebSite;
    }

    /**
     * ����assignedWebSite���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setAssignedWebSite(RecordRef value) {
        this.assignedWebSite = value;
    }

    /**
     * ��ȡpassword���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * ����password���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * ��ȡpassword2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword2() {
        return password2;
    }

    /**
     * ����password2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword2(String value) {
        this.password2 = value;
    }

    /**
     * ��ȡrequirePwdChange���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequirePwdChange() {
        return requirePwdChange;
    }

    /**
     * ����requirePwdChange���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequirePwdChange(Boolean value) {
        this.requirePwdChange = value;
    }

    /**
     * ��ȡcampaignCategory���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCampaignCategory() {
        return campaignCategory;
    }

    /**
     * ����campaignCategory���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCampaignCategory(RecordRef value) {
        this.campaignCategory = value;
    }

    /**
     * ��ȡsourceWebSite���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSourceWebSite() {
        return sourceWebSite;
    }

    /**
     * ����sourceWebSite���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSourceWebSite(RecordRef value) {
        this.sourceWebSite = value;
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
     * ��ȡreceivablesAccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getReceivablesAccount() {
        return receivablesAccount;
    }

    /**
     * ����receivablesAccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setReceivablesAccount(RecordRef value) {
        this.receivablesAccount = value;
    }

    /**
     * ��ȡdrAccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getDrAccount() {
        return drAccount;
    }

    /**
     * ����drAccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setDrAccount(RecordRef value) {
        this.drAccount = value;
    }

    /**
     * ��ȡfxAccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getFxAccount() {
        return fxAccount;
    }

    /**
     * ����fxAccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setFxAccount(RecordRef value) {
        this.fxAccount = value;
    }

    /**
     * ��ȡdefaultOrderPriority���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDefaultOrderPriority() {
        return defaultOrderPriority;
    }

    /**
     * ����defaultOrderPriority���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDefaultOrderPriority(Double value) {
        this.defaultOrderPriority = value;
    }

    /**
     * ��ȡwebLead���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebLead() {
        return webLead;
    }

    /**
     * ����webLead���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebLead(String value) {
        this.webLead = value;
    }

    /**
     * ��ȡreferrer���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferrer() {
        return referrer;
    }

    /**
     * ����referrer���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferrer(String value) {
        this.referrer = value;
    }

    /**
     * ��ȡkeywords���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * ����keywords���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeywords(String value) {
        this.keywords = value;
    }

    /**
     * ��ȡclickStream���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClickStream() {
        return clickStream;
    }

    /**
     * ����clickStream���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClickStream(String value) {
        this.clickStream = value;
    }

    /**
     * ��ȡlastPageVisited���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastPageVisited() {
        return lastPageVisited;
    }

    /**
     * ����lastPageVisited���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastPageVisited(String value) {
        this.lastPageVisited = value;
    }

    /**
     * ��ȡvisits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVisits() {
        return visits;
    }

    /**
     * ����visits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVisits(Long value) {
        this.visits = value;
    }

    /**
     * ��ȡfirstVisit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstVisit() {
        return firstVisit;
    }

    /**
     * ����firstVisit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstVisit(XMLGregorianCalendar value) {
        this.firstVisit = value;
    }

    /**
     * ��ȡlastVisit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastVisit() {
        return lastVisit;
    }

    /**
     * ����lastVisit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastVisit(XMLGregorianCalendar value) {
        this.lastVisit = value;
    }

    /**
     * ��ȡbillPay���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBillPay() {
        return billPay;
    }

    /**
     * ����billPay���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBillPay(Boolean value) {
        this.billPay = value;
    }

    /**
     * ��ȡopeningBalance���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOpeningBalance() {
        return openingBalance;
    }

    /**
     * ����openingBalance���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOpeningBalance(Double value) {
        this.openingBalance = value;
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
     * ��ȡopeningBalanceDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOpeningBalanceDate() {
        return openingBalanceDate;
    }

    /**
     * ����openingBalanceDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOpeningBalanceDate(XMLGregorianCalendar value) {
        this.openingBalanceDate = value;
    }

    /**
     * ��ȡopeningBalanceAccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getOpeningBalanceAccount() {
        return openingBalanceAccount;
    }

    /**
     * ����openingBalanceAccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setOpeningBalanceAccount(RecordRef value) {
        this.openingBalanceAccount = value;
    }

    /**
     * ��ȡstage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CustomerStage }
     *     
     */
    public CustomerStage getStage() {
        return stage;
    }

    /**
     * ����stage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerStage }
     *     
     */
    public void setStage(CustomerStage value) {
        this.stage = value;
    }

    /**
     * ��ȡemailTransactions���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmailTransactions() {
        return emailTransactions;
    }

    /**
     * ����emailTransactions���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmailTransactions(Boolean value) {
        this.emailTransactions = value;
    }

    /**
     * ��ȡprintTransactions���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrintTransactions() {
        return printTransactions;
    }

    /**
     * ����printTransactions���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrintTransactions(Boolean value) {
        this.printTransactions = value;
    }

    /**
     * ��ȡfaxTransactions���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFaxTransactions() {
        return faxTransactions;
    }

    /**
     * ����faxTransactions���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFaxTransactions(Boolean value) {
        this.faxTransactions = value;
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
     * ��ȡisBudgetApproved���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBudgetApproved() {
        return isBudgetApproved;
    }

    /**
     * ����isBudgetApproved���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBudgetApproved(Boolean value) {
        this.isBudgetApproved = value;
    }

    /**
     * ��ȡglobalSubscriptionStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GlobalSubscriptionStatus }
     *     
     */
    public GlobalSubscriptionStatus getGlobalSubscriptionStatus() {
        return globalSubscriptionStatus;
    }

    /**
     * ����globalSubscriptionStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalSubscriptionStatus }
     *     
     */
    public void setGlobalSubscriptionStatus(GlobalSubscriptionStatus value) {
        this.globalSubscriptionStatus = value;
    }

    /**
     * ��ȡsalesReadiness���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSalesReadiness() {
        return salesReadiness;
    }

    /**
     * ����salesReadiness���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSalesReadiness(RecordRef value) {
        this.salesReadiness = value;
    }

    /**
     * ��ȡsalesTeamList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CustomerSalesTeamList }
     *     
     */
    public CustomerSalesTeamList getSalesTeamList() {
        return salesTeamList;
    }

    /**
     * ����salesTeamList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSalesTeamList }
     *     
     */
    public void setSalesTeamList(CustomerSalesTeamList value) {
        this.salesTeamList = value;
    }

    /**
     * ��ȡbuyingReason���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getBuyingReason() {
        return buyingReason;
    }

    /**
     * ����buyingReason���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setBuyingReason(RecordRef value) {
        this.buyingReason = value;
    }

    /**
     * ��ȡdownloadList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CustomerDownloadList }
     *     
     */
    public CustomerDownloadList getDownloadList() {
        return downloadList;
    }

    /**
     * ����downloadList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDownloadList }
     *     
     */
    public void setDownloadList(CustomerDownloadList value) {
        this.downloadList = value;
    }

    /**
     * ��ȡbuyingTimeFrame���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getBuyingTimeFrame() {
        return buyingTimeFrame;
    }

    /**
     * ����buyingTimeFrame���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setBuyingTimeFrame(RecordRef value) {
        this.buyingTimeFrame = value;
    }

    /**
     * ��ȡaddressbookList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CustomerAddressbookList }
     *     
     */
    public CustomerAddressbookList getAddressbookList() {
        return addressbookList;
    }

    /**
     * ����addressbookList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAddressbookList }
     *     
     */
    public void setAddressbookList(CustomerAddressbookList value) {
        this.addressbookList = value;
    }

    /**
     * ��ȡsubscriptionsList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionsList }
     *     
     */
    public SubscriptionsList getSubscriptionsList() {
        return subscriptionsList;
    }

    /**
     * ����subscriptionsList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionsList }
     *     
     */
    public void setSubscriptionsList(SubscriptionsList value) {
        this.subscriptionsList = value;
    }

    /**
     * ��ȡcontactRolesList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ContactAccessRolesList }
     *     
     */
    public ContactAccessRolesList getContactRolesList() {
        return contactRolesList;
    }

    /**
     * ����contactRolesList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ContactAccessRolesList }
     *     
     */
    public void setContactRolesList(ContactAccessRolesList value) {
        this.contactRolesList = value;
    }

    /**
     * ��ȡcurrencyList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CustomerCurrencyList }
     *     
     */
    public CustomerCurrencyList getCurrencyList() {
        return currencyList;
    }

    /**
     * ����currencyList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerCurrencyList }
     *     
     */
    public void setCurrencyList(CustomerCurrencyList value) {
        this.currencyList = value;
    }

    /**
     * ��ȡcreditCardsList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CustomerCreditCardsList }
     *     
     */
    public CustomerCreditCardsList getCreditCardsList() {
        return creditCardsList;
    }

    /**
     * ����creditCardsList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerCreditCardsList }
     *     
     */
    public void setCreditCardsList(CustomerCreditCardsList value) {
        this.creditCardsList = value;
    }

    /**
     * ��ȡpartnersList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CustomerPartnersList }
     *     
     */
    public CustomerPartnersList getPartnersList() {
        return partnersList;
    }

    /**
     * ����partnersList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPartnersList }
     *     
     */
    public void setPartnersList(CustomerPartnersList value) {
        this.partnersList = value;
    }

    /**
     * ��ȡgroupPricingList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CustomerGroupPricingList }
     *     
     */
    public CustomerGroupPricingList getGroupPricingList() {
        return groupPricingList;
    }

    /**
     * ����groupPricingList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerGroupPricingList }
     *     
     */
    public void setGroupPricingList(CustomerGroupPricingList value) {
        this.groupPricingList = value;
    }

    /**
     * ��ȡitemPricingList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CustomerItemPricingList }
     *     
     */
    public CustomerItemPricingList getItemPricingList() {
        return itemPricingList;
    }

    /**
     * ����itemPricingList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerItemPricingList }
     *     
     */
    public void setItemPricingList(CustomerItemPricingList value) {
        this.itemPricingList = value;
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
