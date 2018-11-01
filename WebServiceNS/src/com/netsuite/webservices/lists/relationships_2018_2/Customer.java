
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
 * <p>Customer complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取customForm属性的值。
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
     * 设置customForm属性的值。
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
     * 获取entityId属性的值。
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
     * 设置entityId属性的值。
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
     * 获取altName属性的值。
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
     * 设置altName属性的值。
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
     * 获取isPerson属性的值。
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
     * 设置isPerson属性的值。
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
     * 获取phoneticName属性的值。
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
     * 设置phoneticName属性的值。
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
     * 获取salutation属性的值。
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
     * 设置salutation属性的值。
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
     * 获取firstName属性的值。
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
     * 设置firstName属性的值。
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
     * 获取middleName属性的值。
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
     * 设置middleName属性的值。
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
     * 获取lastName属性的值。
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
     * 设置lastName属性的值。
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
     * 获取companyName属性的值。
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
     * 设置companyName属性的值。
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
     * 获取entityStatus属性的值。
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
     * 设置entityStatus属性的值。
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
     * 获取phone属性的值。
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
     * 设置phone属性的值。
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
     * 获取defaultAddress属性的值。
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
     * 设置defaultAddress属性的值。
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
     * 获取category属性的值。
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
     * 设置category属性的值。
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
     * 获取title属性的值。
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
     * 设置title属性的值。
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
     * 获取printOnCheckAs属性的值。
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
     * 设置printOnCheckAs属性的值。
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
     * 获取altPhone属性的值。
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
     * 设置altPhone属性的值。
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
     * 获取homePhone属性的值。
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
     * 设置homePhone属性的值。
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
     * 获取mobilePhone属性的值。
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
     * 设置mobilePhone属性的值。
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
     * 获取altEmail属性的值。
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
     * 设置altEmail属性的值。
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
     * 获取language属性的值。
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
     * 设置language属性的值。
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
     * 获取comments属性的值。
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
     * 设置comments属性的值。
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
     * 获取numberFormat属性的值。
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
     * 设置numberFormat属性的值。
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
     * 获取negativeNumberFormat属性的值。
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
     * 设置negativeNumberFormat属性的值。
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
     * 获取dateCreated属性的值。
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
     * 设置dateCreated属性的值。
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
     * 获取image属性的值。
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
     * 设置image属性的值。
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
     * 获取emailPreference属性的值。
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
     * 设置emailPreference属性的值。
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
     * 获取subsidiary属性的值。
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
     * 设置subsidiary属性的值。
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
     * 获取representingSubsidiary属性的值。
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
     * 设置representingSubsidiary属性的值。
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
     * 获取salesRep属性的值。
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
     * 设置salesRep属性的值。
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
     * 获取territory属性的值。
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
     * 设置territory属性的值。
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
     * 获取contribPct属性的值。
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
     * 设置contribPct属性的值。
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
     * 获取partner属性的值。
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
     * 设置partner属性的值。
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
     * 获取salesGroup属性的值。
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
     * 设置salesGroup属性的值。
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
     * 获取vatRegNumber属性的值。
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
     * 设置vatRegNumber属性的值。
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
     * 获取accountNumber属性的值。
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
     * 设置accountNumber属性的值。
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
     * 获取taxExempt属性的值。
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
     * 设置taxExempt属性的值。
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
     * 获取terms属性的值。
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
     * 设置terms属性的值。
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
     * 获取creditLimit属性的值。
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
     * 设置creditLimit属性的值。
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
     * 获取creditHoldOverride属性的值。
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
     * 设置creditHoldOverride属性的值。
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
     * 获取monthlyClosing属性的值。
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
     * 设置monthlyClosing属性的值。
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
     * 获取overrideCurrencyFormat属性的值。
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
     * 设置overrideCurrencyFormat属性的值。
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
     * 获取displaySymbol属性的值。
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
     * 设置displaySymbol属性的值。
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
     * 获取symbolPlacement属性的值。
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
     * 设置symbolPlacement属性的值。
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
     * 获取overdueBalance属性的值。
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
     * 设置overdueBalance属性的值。
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
     * 获取daysOverdue属性的值。
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
     * 设置daysOverdue属性的值。
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
     * 获取unbilledOrders属性的值。
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
     * 设置unbilledOrders属性的值。
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
     * 获取consolUnbilledOrders属性的值。
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
     * 设置consolUnbilledOrders属性的值。
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
     * 获取consolOverdueBalance属性的值。
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
     * 设置consolOverdueBalance属性的值。
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
     * 获取consolDepositBalance属性的值。
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
     * 设置consolDepositBalance属性的值。
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
     * 获取consolBalance属性的值。
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
     * 设置consolBalance属性的值。
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
     * 获取consolAging属性的值。
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
     * 设置consolAging属性的值。
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
     * 获取consolAging1属性的值。
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
     * 设置consolAging1属性的值。
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
     * 获取consolAging2属性的值。
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
     * 设置consolAging2属性的值。
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
     * 获取consolAging3属性的值。
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
     * 设置consolAging3属性的值。
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
     * 获取consolAging4属性的值。
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
     * 设置consolAging4属性的值。
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
     * 获取consolDaysOverdue属性的值。
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
     * 设置consolDaysOverdue属性的值。
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
     * 获取priceLevel属性的值。
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
     * 设置priceLevel属性的值。
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
     * 获取prefCCProcessor属性的值。
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
     * 设置prefCCProcessor属性的值。
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
     * 获取depositBalance属性的值。
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
     * 设置depositBalance属性的值。
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
     * 获取shipComplete属性的值。
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
     * 设置shipComplete属性的值。
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
     * 获取taxable属性的值。
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
     * 设置taxable属性的值。
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
     * 获取taxItem属性的值。
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
     * 设置taxItem属性的值。
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
     * 获取resaleNumber属性的值。
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
     * 设置resaleNumber属性的值。
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
     * 获取aging属性的值。
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
     * 设置aging属性的值。
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
     * 获取aging1属性的值。
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
     * 设置aging1属性的值。
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
     * 获取aging2属性的值。
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
     * 设置aging2属性的值。
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
     * 获取aging3属性的值。
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
     * 设置aging3属性的值。
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
     * 获取aging4属性的值。
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
     * 设置aging4属性的值。
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
     * 获取startDate属性的值。
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
     * 设置startDate属性的值。
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
     * 获取alcoholRecipientType属性的值。
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
     * 设置alcoholRecipientType属性的值。
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
     * 获取endDate属性的值。
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
     * 设置endDate属性的值。
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
     * 获取reminderDays属性的值。
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
     * 设置reminderDays属性的值。
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
     * 获取shippingItem属性的值。
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
     * 设置shippingItem属性的值。
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
     * 获取thirdPartyAcct属性的值。
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
     * 设置thirdPartyAcct属性的值。
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
     * 获取thirdPartyZipcode属性的值。
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
     * 设置thirdPartyZipcode属性的值。
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
     * 获取thirdPartyCountry属性的值。
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
     * 设置thirdPartyCountry属性的值。
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
     * 获取giveAccess属性的值。
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
     * 设置giveAccess属性的值。
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
     * 获取estimatedBudget属性的值。
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
     * 设置estimatedBudget属性的值。
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
     * 获取accessRole属性的值。
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
     * 设置accessRole属性的值。
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
     * 获取sendEmail属性的值。
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
     * 设置sendEmail属性的值。
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
     * 获取assignedWebSite属性的值。
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
     * 设置assignedWebSite属性的值。
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
     * 获取password属性的值。
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
     * 设置password属性的值。
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
     * 获取password2属性的值。
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
     * 设置password2属性的值。
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
     * 获取requirePwdChange属性的值。
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
     * 设置requirePwdChange属性的值。
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
     * 获取campaignCategory属性的值。
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
     * 设置campaignCategory属性的值。
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
     * 获取sourceWebSite属性的值。
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
     * 设置sourceWebSite属性的值。
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
     * 获取leadSource属性的值。
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
     * 设置leadSource属性的值。
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
     * 获取receivablesAccount属性的值。
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
     * 设置receivablesAccount属性的值。
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
     * 获取drAccount属性的值。
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
     * 设置drAccount属性的值。
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
     * 获取fxAccount属性的值。
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
     * 设置fxAccount属性的值。
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
     * 获取defaultOrderPriority属性的值。
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
     * 设置defaultOrderPriority属性的值。
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
     * 获取webLead属性的值。
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
     * 设置webLead属性的值。
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
     * 获取referrer属性的值。
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
     * 设置referrer属性的值。
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
     * 获取keywords属性的值。
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
     * 设置keywords属性的值。
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
     * 获取clickStream属性的值。
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
     * 设置clickStream属性的值。
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
     * 获取lastPageVisited属性的值。
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
     * 设置lastPageVisited属性的值。
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
     * 获取visits属性的值。
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
     * 设置visits属性的值。
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
     * 获取firstVisit属性的值。
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
     * 设置firstVisit属性的值。
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
     * 获取lastVisit属性的值。
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
     * 设置lastVisit属性的值。
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
     * 获取billPay属性的值。
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
     * 设置billPay属性的值。
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
     * 获取openingBalance属性的值。
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
     * 设置openingBalance属性的值。
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
     * 获取openingBalanceDate属性的值。
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
     * 设置openingBalanceDate属性的值。
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
     * 获取openingBalanceAccount属性的值。
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
     * 设置openingBalanceAccount属性的值。
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
     * 获取stage属性的值。
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
     * 设置stage属性的值。
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
     * 获取emailTransactions属性的值。
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
     * 设置emailTransactions属性的值。
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
     * 获取printTransactions属性的值。
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
     * 设置printTransactions属性的值。
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
     * 获取faxTransactions属性的值。
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
     * 设置faxTransactions属性的值。
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
     * 获取syncPartnerTeams属性的值。
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
     * 设置syncPartnerTeams属性的值。
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
     * 获取isBudgetApproved属性的值。
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
     * 设置isBudgetApproved属性的值。
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
     * 获取globalSubscriptionStatus属性的值。
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
     * 设置globalSubscriptionStatus属性的值。
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
     * 获取salesReadiness属性的值。
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
     * 设置salesReadiness属性的值。
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
     * 获取salesTeamList属性的值。
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
     * 设置salesTeamList属性的值。
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
     * 获取buyingReason属性的值。
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
     * 设置buyingReason属性的值。
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
     * 获取downloadList属性的值。
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
     * 设置downloadList属性的值。
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
     * 获取buyingTimeFrame属性的值。
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
     * 设置buyingTimeFrame属性的值。
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
     * 获取addressbookList属性的值。
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
     * 设置addressbookList属性的值。
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
     * 获取subscriptionsList属性的值。
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
     * 设置subscriptionsList属性的值。
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
     * 获取contactRolesList属性的值。
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
     * 设置contactRolesList属性的值。
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
     * 获取currencyList属性的值。
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
     * 设置currencyList属性的值。
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
     * 获取creditCardsList属性的值。
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
     * 设置creditCardsList属性的值。
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
     * 获取partnersList属性的值。
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
     * 设置partnersList属性的值。
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
     * 获取groupPricingList属性的值。
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
     * 设置groupPricingList属性的值。
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
     * 获取itemPricingList属性的值。
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
     * 设置itemPricingList属性的值。
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
