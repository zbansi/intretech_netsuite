
package com.netsuite.webservices.transactions.sales_2018_2;

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
import com.netsuite.webservices.platform.common_2018_2.types.AvsMatchCode;
import com.netsuite.webservices.platform.common_2018_2.types.RevenueStatus;
import com.netsuite.webservices.platform.core_2018_2.CustomFieldList;
import com.netsuite.webservices.platform.core_2018_2.Record;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;


/**
 * <p>CashSale complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CashSale">
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
 *         &lt;element name="entity" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="billingAccount" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="recurringBill" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="tranDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tranId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entityTaxRegNum" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postingPeriod" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="createdFrom" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="opportunity" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="department" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="class" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="location" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="subsidiary" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="salesRep" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="contribPct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partner" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="leadSource" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="otherRefNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salesEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="excludeCommission" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="revRecSchedule" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="undepFunds" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="canHaveStackable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="currency" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="account" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="revRecStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="revRecEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="totalCostEstimate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="estGrossProfit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="estGrossProfitPercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="exchangeRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="currencyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promoCode" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="discountItem" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="discountRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isTaxable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="taxItem" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="taxRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="toBePrinted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="toBeEmailed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="toBeFaxed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messageSel" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billingAddress" type="{urn:common_2018_2.platform.webservices.netsuite.com}Address" minOccurs="0"/>
 *         &lt;element name="billAddressList" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="shippingAddress" type="{urn:common_2018_2.platform.webservices.netsuite.com}Address" minOccurs="0"/>
 *         &lt;element name="shipIsResidential" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="shipAddressList" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="fob" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="shipMethod" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="shippingCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="shippingTax1Rate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="shippingTax2Rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shippingTaxCode" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="handlingTaxCode" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="handlingTax1Rate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="handlingCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="handlingTax2Rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="linkedTrackingNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trackingNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salesGroup" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="revenueStatus" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}RevenueStatus" minOccurs="0"/>
 *         &lt;element name="recognizedRevenue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="deferredRevenue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="revRecOnRevCommitment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="syncSalesTeams" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="paymentMethod" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="payPalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditCard" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="ccNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ccExpireDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ccName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ccStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ccZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditCardProcessor" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="ccApproved" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="authCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ccAvsStreetMatch" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}AvsMatchCode" minOccurs="0"/>
 *         &lt;element name="ccAvsZipMatch" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}AvsMatchCode" minOccurs="0"/>
 *         &lt;element name="isRecurringPayment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="payPalTranId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ccIsPurchaseCardBin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ignoreAvs" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ccProcessAsPurchaseCard" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="itemCostDiscount" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="itemCostDiscRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemCostDiscAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="itemCostTaxRate1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="itemCostTaxRate2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="itemCostDiscTaxable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="itemCostTaxCode" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="itemCostDiscTax1Amt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="itemCostDiscPrint" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="expCostDiscount" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="expCostDiscRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expCostDiscAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="expCostDiscTaxable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="expCostDiscprint" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="expCostTaxRate1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="timeDiscount" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="expCostTaxCode" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="timeDiscRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expCostTaxRate2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="expCostDiscTax1Amt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="timeDiscAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="timeDiscTaxable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="timeDiscPrint" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="discountTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="taxTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="timeTaxRate1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="altShippingCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="timeTaxCode" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="altHandlingCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="timeDiscTax1Amt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ccSecurityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeTaxRate2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ccSecurityCodeMatch" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}AvsMatchCode" minOccurs="0"/>
 *         &lt;element name="chargeIt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="debitCardIssueNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="threeDStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pnRefNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalAuthId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paypalProcess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="job" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="billingSchedule" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tax2Total" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="validFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="vatRegNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="giftCertApplied" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="tranIsVsoeBundle" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="vsoeAutoCalc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="syncPartnerTeams" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="salesTeamList" type="{urn:sales_2018_2.transactions.webservices.netsuite.com}CashSaleSalesTeamList" minOccurs="0"/>
 *         &lt;element name="partnersList" type="{urn:sales_2018_2.transactions.webservices.netsuite.com}CashSalePartnersList" minOccurs="0"/>
 *         &lt;element name="itemList" type="{urn:sales_2018_2.transactions.webservices.netsuite.com}CashSaleItemList" minOccurs="0"/>
 *         &lt;element name="accountingBookDetailList" type="{urn:common_2018_2.platform.webservices.netsuite.com}AccountingBookDetailList" minOccurs="0"/>
 *         &lt;element name="itemCostList" type="{urn:sales_2018_2.transactions.webservices.netsuite.com}CashSaleItemCostList" minOccurs="0"/>
 *         &lt;element name="giftCertRedemptionList" type="{urn:sales_2018_2.transactions.webservices.netsuite.com}GiftCertRedemptionList" minOccurs="0"/>
 *         &lt;element name="promotionsList" type="{urn:sales_2018_2.transactions.webservices.netsuite.com}PromotionsList" minOccurs="0"/>
 *         &lt;element name="expCostList" type="{urn:sales_2018_2.transactions.webservices.netsuite.com}CashSaleExpCostList" minOccurs="0"/>
 *         &lt;element name="timeList" type="{urn:sales_2018_2.transactions.webservices.netsuite.com}CashSaleTimeList" minOccurs="0"/>
 *         &lt;element name="shipGroupList" type="{urn:sales_2018_2.transactions.webservices.netsuite.com}CashSaleShipGroupList" minOccurs="0"/>
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
@XmlType(name = "CashSale", propOrder = {
    "createdDate",
    "lastModifiedDate",
    "nexus",
    "subsidiaryTaxRegNum",
    "taxRegOverride",
    "taxDetailsOverride",
    "customForm",
    "entity",
    "billingAccount",
    "recurringBill",
    "tranDate",
    "tranId",
    "entityTaxRegNum",
    "source",
    "postingPeriod",
    "createdFrom",
    "opportunity",
    "department",
    "clazz",
    "location",
    "subsidiary",
    "salesRep",
    "contribPct",
    "partner",
    "leadSource",
    "startDate",
    "endDate",
    "otherRefNum",
    "memo",
    "salesEffectiveDate",
    "excludeCommission",
    "revRecSchedule",
    "undepFunds",
    "canHaveStackable",
    "currency",
    "account",
    "revRecStartDate",
    "revRecEndDate",
    "totalCostEstimate",
    "estGrossProfit",
    "estGrossProfitPercent",
    "exchangeRate",
    "currencyName",
    "promoCode",
    "discountItem",
    "discountRate",
    "isTaxable",
    "taxItem",
    "taxRate",
    "toBePrinted",
    "toBeEmailed",
    "toBeFaxed",
    "fax",
    "messageSel",
    "message",
    "billingAddress",
    "billAddressList",
    "shippingAddress",
    "shipIsResidential",
    "shipAddressList",
    "fob",
    "shipDate",
    "shipMethod",
    "shippingCost",
    "shippingTax1Rate",
    "shippingTax2Rate",
    "shippingTaxCode",
    "handlingTaxCode",
    "handlingTax1Rate",
    "handlingCost",
    "handlingTax2Rate",
    "linkedTrackingNumbers",
    "trackingNumbers",
    "salesGroup",
    "revenueStatus",
    "recognizedRevenue",
    "deferredRevenue",
    "revRecOnRevCommitment",
    "syncSalesTeams",
    "paymentMethod",
    "payPalStatus",
    "creditCard",
    "ccNumber",
    "ccExpireDate",
    "ccName",
    "ccStreet",
    "ccZipCode",
    "creditCardProcessor",
    "ccApproved",
    "authCode",
    "ccAvsStreetMatch",
    "ccAvsZipMatch",
    "isRecurringPayment",
    "payPalTranId",
    "subTotal",
    "ccIsPurchaseCardBin",
    "ignoreAvs",
    "ccProcessAsPurchaseCard",
    "itemCostDiscount",
    "itemCostDiscRate",
    "itemCostDiscAmount",
    "itemCostTaxRate1",
    "itemCostTaxRate2",
    "itemCostDiscTaxable",
    "itemCostTaxCode",
    "itemCostDiscTax1Amt",
    "itemCostDiscPrint",
    "expCostDiscount",
    "expCostDiscRate",
    "expCostDiscAmount",
    "expCostDiscTaxable",
    "expCostDiscprint",
    "expCostTaxRate1",
    "timeDiscount",
    "expCostTaxCode",
    "timeDiscRate",
    "expCostTaxRate2",
    "expCostDiscTax1Amt",
    "timeDiscAmount",
    "timeDiscTaxable",
    "timeDiscPrint",
    "discountTotal",
    "taxTotal",
    "timeTaxRate1",
    "altShippingCost",
    "timeTaxCode",
    "altHandlingCost",
    "total",
    "timeDiscTax1Amt",
    "ccSecurityCode",
    "timeTaxRate2",
    "ccSecurityCodeMatch",
    "chargeIt",
    "debitCardIssueNo",
    "threeDStatusCode",
    "pnRefNum",
    "paypalAuthId",
    "status",
    "paypalProcess",
    "job",
    "billingSchedule",
    "email",
    "tax2Total",
    "validFrom",
    "vatRegNum",
    "giftCertApplied",
    "tranIsVsoeBundle",
    "vsoeAutoCalc",
    "syncPartnerTeams",
    "salesTeamList",
    "partnersList",
    "itemList",
    "accountingBookDetailList",
    "itemCostList",
    "giftCertRedemptionList",
    "promotionsList",
    "expCostList",
    "timeList",
    "shipGroupList",
    "taxDetailsList",
    "customFieldList"
})
public class CashSale
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
    protected RecordRef entity;
    protected RecordRef billingAccount;
    protected Boolean recurringBill;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tranDate;
    protected String tranId;
    protected RecordRef entityTaxRegNum;
    protected String source;
    protected RecordRef postingPeriod;
    protected RecordRef createdFrom;
    protected RecordRef opportunity;
    protected RecordRef department;
    @XmlElement(name = "class")
    protected RecordRef clazz;
    protected RecordRef location;
    protected RecordRef subsidiary;
    protected RecordRef salesRep;
    protected String contribPct;
    protected RecordRef partner;
    protected RecordRef leadSource;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected String otherRefNum;
    protected String memo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar salesEffectiveDate;
    protected Boolean excludeCommission;
    protected RecordRef revRecSchedule;
    protected Boolean undepFunds;
    protected Boolean canHaveStackable;
    protected RecordRef currency;
    protected RecordRef account;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar revRecStartDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar revRecEndDate;
    protected Double totalCostEstimate;
    protected Double estGrossProfit;
    protected Double estGrossProfitPercent;
    protected Double exchangeRate;
    protected String currencyName;
    protected RecordRef promoCode;
    protected RecordRef discountItem;
    protected String discountRate;
    protected Boolean isTaxable;
    protected RecordRef taxItem;
    protected Double taxRate;
    protected Boolean toBePrinted;
    protected Boolean toBeEmailed;
    protected Boolean toBeFaxed;
    protected String fax;
    protected RecordRef messageSel;
    protected String message;
    protected Address billingAddress;
    protected RecordRef billAddressList;
    protected Address shippingAddress;
    protected Boolean shipIsResidential;
    protected RecordRef shipAddressList;
    protected String fob;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar shipDate;
    protected RecordRef shipMethod;
    protected Double shippingCost;
    protected Double shippingTax1Rate;
    protected String shippingTax2Rate;
    protected RecordRef shippingTaxCode;
    protected RecordRef handlingTaxCode;
    protected Double handlingTax1Rate;
    protected Double handlingCost;
    protected String handlingTax2Rate;
    protected String linkedTrackingNumbers;
    protected String trackingNumbers;
    protected RecordRef salesGroup;
    @XmlSchemaType(name = "string")
    protected RevenueStatus revenueStatus;
    protected Double recognizedRevenue;
    protected Double deferredRevenue;
    protected Boolean revRecOnRevCommitment;
    protected Boolean syncSalesTeams;
    protected RecordRef paymentMethod;
    protected String payPalStatus;
    protected RecordRef creditCard;
    protected String ccNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ccExpireDate;
    protected String ccName;
    protected String ccStreet;
    protected String ccZipCode;
    protected RecordRef creditCardProcessor;
    protected Boolean ccApproved;
    protected String authCode;
    @XmlSchemaType(name = "string")
    protected AvsMatchCode ccAvsStreetMatch;
    @XmlSchemaType(name = "string")
    protected AvsMatchCode ccAvsZipMatch;
    protected Boolean isRecurringPayment;
    protected String payPalTranId;
    protected Double subTotal;
    protected Boolean ccIsPurchaseCardBin;
    protected Boolean ignoreAvs;
    protected Boolean ccProcessAsPurchaseCard;
    protected RecordRef itemCostDiscount;
    protected String itemCostDiscRate;
    protected Double itemCostDiscAmount;
    protected Double itemCostTaxRate1;
    protected Double itemCostTaxRate2;
    protected Boolean itemCostDiscTaxable;
    protected RecordRef itemCostTaxCode;
    protected Double itemCostDiscTax1Amt;
    protected Boolean itemCostDiscPrint;
    protected RecordRef expCostDiscount;
    protected String expCostDiscRate;
    protected Double expCostDiscAmount;
    protected Boolean expCostDiscTaxable;
    protected Boolean expCostDiscprint;
    protected Double expCostTaxRate1;
    protected RecordRef timeDiscount;
    protected RecordRef expCostTaxCode;
    protected String timeDiscRate;
    protected Double expCostTaxRate2;
    protected Double expCostDiscTax1Amt;
    protected Double timeDiscAmount;
    protected Boolean timeDiscTaxable;
    protected Boolean timeDiscPrint;
    protected Double discountTotal;
    protected Double taxTotal;
    protected Double timeTaxRate1;
    protected Double altShippingCost;
    protected RecordRef timeTaxCode;
    protected Double altHandlingCost;
    protected Double total;
    protected Double timeDiscTax1Amt;
    protected String ccSecurityCode;
    protected Double timeTaxRate2;
    @XmlSchemaType(name = "string")
    protected AvsMatchCode ccSecurityCodeMatch;
    protected Boolean chargeIt;
    protected String debitCardIssueNo;
    protected String threeDStatusCode;
    protected String pnRefNum;
    protected String paypalAuthId;
    protected String status;
    protected Boolean paypalProcess;
    protected RecordRef job;
    protected RecordRef billingSchedule;
    protected String email;
    protected Double tax2Total;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validFrom;
    protected String vatRegNum;
    protected Double giftCertApplied;
    protected Boolean tranIsVsoeBundle;
    protected Boolean vsoeAutoCalc;
    protected Boolean syncPartnerTeams;
    protected CashSaleSalesTeamList salesTeamList;
    protected CashSalePartnersList partnersList;
    protected CashSaleItemList itemList;
    protected AccountingBookDetailList accountingBookDetailList;
    protected CashSaleItemCostList itemCostList;
    protected GiftCertRedemptionList giftCertRedemptionList;
    protected PromotionsList promotionsList;
    protected CashSaleExpCostList expCostList;
    protected CashSaleTimeList timeList;
    protected CashSaleShipGroupList shipGroupList;
    protected TaxDetailsList taxDetailsList;
    protected CustomFieldList customFieldList;
    @XmlAttribute(name = "internalId")
    protected String internalId;
    @XmlAttribute(name = "externalId")
    protected String externalId;

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
     * 获取nexus属性的值。
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
     * 设置nexus属性的值。
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
     * 获取subsidiaryTaxRegNum属性的值。
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
     * 设置subsidiaryTaxRegNum属性的值。
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
     * 获取taxRegOverride属性的值。
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
     * 设置taxRegOverride属性的值。
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
     * 获取taxDetailsOverride属性的值。
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
     * 设置taxDetailsOverride属性的值。
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
     * 获取billingAccount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getBillingAccount() {
        return billingAccount;
    }

    /**
     * 设置billingAccount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setBillingAccount(RecordRef value) {
        this.billingAccount = value;
    }

    /**
     * 获取recurringBill属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecurringBill() {
        return recurringBill;
    }

    /**
     * 设置recurringBill属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecurringBill(Boolean value) {
        this.recurringBill = value;
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
     * 获取entityTaxRegNum属性的值。
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
     * 设置entityTaxRegNum属性的值。
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
     * 获取source属性的值。
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
     * 设置source属性的值。
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
     * 获取createdFrom属性的值。
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
     * 设置createdFrom属性的值。
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
     * 获取opportunity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getOpportunity() {
        return opportunity;
    }

    /**
     * 设置opportunity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setOpportunity(RecordRef value) {
        this.opportunity = value;
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
     * 获取otherRefNum属性的值。
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
     * 设置otherRefNum属性的值。
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
     * 获取salesEffectiveDate属性的值。
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
     * 设置salesEffectiveDate属性的值。
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
     * 获取excludeCommission属性的值。
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
     * 设置excludeCommission属性的值。
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
     * 获取revRecSchedule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getRevRecSchedule() {
        return revRecSchedule;
    }

    /**
     * 设置revRecSchedule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setRevRecSchedule(RecordRef value) {
        this.revRecSchedule = value;
    }

    /**
     * 获取undepFunds属性的值。
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
     * 设置undepFunds属性的值。
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
     * 获取canHaveStackable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanHaveStackable() {
        return canHaveStackable;
    }

    /**
     * 设置canHaveStackable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanHaveStackable(Boolean value) {
        this.canHaveStackable = value;
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
     * 获取revRecStartDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRevRecStartDate() {
        return revRecStartDate;
    }

    /**
     * 设置revRecStartDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRevRecStartDate(XMLGregorianCalendar value) {
        this.revRecStartDate = value;
    }

    /**
     * 获取revRecEndDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRevRecEndDate() {
        return revRecEndDate;
    }

    /**
     * 设置revRecEndDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRevRecEndDate(XMLGregorianCalendar value) {
        this.revRecEndDate = value;
    }

    /**
     * 获取totalCostEstimate属性的值。
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
     * 设置totalCostEstimate属性的值。
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
     * 获取estGrossProfit属性的值。
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
     * 设置estGrossProfit属性的值。
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
     * 获取estGrossProfitPercent属性的值。
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
     * 设置estGrossProfitPercent属性的值。
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
     * 获取exchangeRate属性的值。
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
     * 设置exchangeRate属性的值。
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
     * 获取currencyName属性的值。
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
     * 设置currencyName属性的值。
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
     * 获取promoCode属性的值。
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
     * 设置promoCode属性的值。
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
     * 获取discountItem属性的值。
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
     * 设置discountItem属性的值。
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
     * 获取discountRate属性的值。
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
     * 设置discountRate属性的值。
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
     * 获取isTaxable属性的值。
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
     * 设置isTaxable属性的值。
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
     * 获取taxRate属性的值。
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
     * 设置taxRate属性的值。
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
     * 获取toBePrinted属性的值。
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
     * 设置toBePrinted属性的值。
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
     * 获取toBeEmailed属性的值。
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
     * 设置toBeEmailed属性的值。
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
     * 获取toBeFaxed属性的值。
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
     * 设置toBeFaxed属性的值。
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
     * 获取messageSel属性的值。
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
     * 设置messageSel属性的值。
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
     * 获取message属性的值。
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
     * 设置message属性的值。
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
     * 获取billingAddress属性的值。
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
     * 设置billingAddress属性的值。
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
     * 获取billAddressList属性的值。
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
     * 设置billAddressList属性的值。
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
     * 获取shipIsResidential属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShipIsResidential() {
        return shipIsResidential;
    }

    /**
     * 设置shipIsResidential属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShipIsResidential(Boolean value) {
        this.shipIsResidential = value;
    }

    /**
     * 获取shipAddressList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getShipAddressList() {
        return shipAddressList;
    }

    /**
     * 设置shipAddressList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setShipAddressList(RecordRef value) {
        this.shipAddressList = value;
    }

    /**
     * 获取fob属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFob() {
        return fob;
    }

    /**
     * 设置fob属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFob(String value) {
        this.fob = value;
    }

    /**
     * 获取shipDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShipDate() {
        return shipDate;
    }

    /**
     * 设置shipDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShipDate(XMLGregorianCalendar value) {
        this.shipDate = value;
    }

    /**
     * 获取shipMethod属性的值。
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
     * 设置shipMethod属性的值。
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
     * 获取shippingCost属性的值。
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
     * 设置shippingCost属性的值。
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
     * 获取shippingTax1Rate属性的值。
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
     * 设置shippingTax1Rate属性的值。
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
     * 获取shippingTax2Rate属性的值。
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
     * 设置shippingTax2Rate属性的值。
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
     * 获取shippingTaxCode属性的值。
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
     * 设置shippingTaxCode属性的值。
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
     * 获取handlingTaxCode属性的值。
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
     * 设置handlingTaxCode属性的值。
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
     * 获取handlingTax1Rate属性的值。
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
     * 设置handlingTax1Rate属性的值。
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
     * 获取handlingCost属性的值。
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
     * 设置handlingCost属性的值。
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
     * 获取handlingTax2Rate属性的值。
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
     * 设置handlingTax2Rate属性的值。
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
     * 获取linkedTrackingNumbers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkedTrackingNumbers() {
        return linkedTrackingNumbers;
    }

    /**
     * 设置linkedTrackingNumbers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkedTrackingNumbers(String value) {
        this.linkedTrackingNumbers = value;
    }

    /**
     * 获取trackingNumbers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingNumbers() {
        return trackingNumbers;
    }

    /**
     * 设置trackingNumbers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingNumbers(String value) {
        this.trackingNumbers = value;
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
     * 获取revenueStatus属性的值。
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
     * 设置revenueStatus属性的值。
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
     * 获取recognizedRevenue属性的值。
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
     * 设置recognizedRevenue属性的值。
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
     * 获取deferredRevenue属性的值。
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
     * 设置deferredRevenue属性的值。
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
     * 获取revRecOnRevCommitment属性的值。
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
     * 设置revRecOnRevCommitment属性的值。
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
     * 获取syncSalesTeams属性的值。
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
     * 设置syncSalesTeams属性的值。
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
     * 获取paymentMethod属性的值。
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
     * 设置paymentMethod属性的值。
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
     * 获取payPalStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayPalStatus() {
        return payPalStatus;
    }

    /**
     * 设置payPalStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayPalStatus(String value) {
        this.payPalStatus = value;
    }

    /**
     * 获取creditCard属性的值。
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
     * 设置creditCard属性的值。
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
     * 获取ccNumber属性的值。
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
     * 设置ccNumber属性的值。
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
     * 获取ccExpireDate属性的值。
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
     * 设置ccExpireDate属性的值。
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
     * 获取ccName属性的值。
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
     * 设置ccName属性的值。
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
     * 获取ccStreet属性的值。
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
     * 设置ccStreet属性的值。
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
     * 获取ccZipCode属性的值。
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
     * 设置ccZipCode属性的值。
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
     * 获取creditCardProcessor属性的值。
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
     * 设置creditCardProcessor属性的值。
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
     * 获取ccApproved属性的值。
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
     * 设置ccApproved属性的值。
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
     * 获取authCode属性的值。
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
     * 设置authCode属性的值。
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
     * 获取ccAvsStreetMatch属性的值。
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
     * 设置ccAvsStreetMatch属性的值。
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
     * 获取ccAvsZipMatch属性的值。
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
     * 设置ccAvsZipMatch属性的值。
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
     * 获取isRecurringPayment属性的值。
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
     * 设置isRecurringPayment属性的值。
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
     * 获取payPalTranId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayPalTranId() {
        return payPalTranId;
    }

    /**
     * 设置payPalTranId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayPalTranId(String value) {
        this.payPalTranId = value;
    }

    /**
     * 获取subTotal属性的值。
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
     * 设置subTotal属性的值。
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
     * 获取ccIsPurchaseCardBin属性的值。
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
     * 设置ccIsPurchaseCardBin属性的值。
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
     * 获取ignoreAvs属性的值。
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
     * 设置ignoreAvs属性的值。
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
     * 获取ccProcessAsPurchaseCard属性的值。
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
     * 设置ccProcessAsPurchaseCard属性的值。
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
     * 获取itemCostDiscount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getItemCostDiscount() {
        return itemCostDiscount;
    }

    /**
     * 设置itemCostDiscount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setItemCostDiscount(RecordRef value) {
        this.itemCostDiscount = value;
    }

    /**
     * 获取itemCostDiscRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemCostDiscRate() {
        return itemCostDiscRate;
    }

    /**
     * 设置itemCostDiscRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemCostDiscRate(String value) {
        this.itemCostDiscRate = value;
    }

    /**
     * 获取itemCostDiscAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getItemCostDiscAmount() {
        return itemCostDiscAmount;
    }

    /**
     * 设置itemCostDiscAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setItemCostDiscAmount(Double value) {
        this.itemCostDiscAmount = value;
    }

    /**
     * 获取itemCostTaxRate1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getItemCostTaxRate1() {
        return itemCostTaxRate1;
    }

    /**
     * 设置itemCostTaxRate1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setItemCostTaxRate1(Double value) {
        this.itemCostTaxRate1 = value;
    }

    /**
     * 获取itemCostTaxRate2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getItemCostTaxRate2() {
        return itemCostTaxRate2;
    }

    /**
     * 设置itemCostTaxRate2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setItemCostTaxRate2(Double value) {
        this.itemCostTaxRate2 = value;
    }

    /**
     * 获取itemCostDiscTaxable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isItemCostDiscTaxable() {
        return itemCostDiscTaxable;
    }

    /**
     * 设置itemCostDiscTaxable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setItemCostDiscTaxable(Boolean value) {
        this.itemCostDiscTaxable = value;
    }

    /**
     * 获取itemCostTaxCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getItemCostTaxCode() {
        return itemCostTaxCode;
    }

    /**
     * 设置itemCostTaxCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setItemCostTaxCode(RecordRef value) {
        this.itemCostTaxCode = value;
    }

    /**
     * 获取itemCostDiscTax1Amt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getItemCostDiscTax1Amt() {
        return itemCostDiscTax1Amt;
    }

    /**
     * 设置itemCostDiscTax1Amt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setItemCostDiscTax1Amt(Double value) {
        this.itemCostDiscTax1Amt = value;
    }

    /**
     * 获取itemCostDiscPrint属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isItemCostDiscPrint() {
        return itemCostDiscPrint;
    }

    /**
     * 设置itemCostDiscPrint属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setItemCostDiscPrint(Boolean value) {
        this.itemCostDiscPrint = value;
    }

    /**
     * 获取expCostDiscount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getExpCostDiscount() {
        return expCostDiscount;
    }

    /**
     * 设置expCostDiscount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setExpCostDiscount(RecordRef value) {
        this.expCostDiscount = value;
    }

    /**
     * 获取expCostDiscRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpCostDiscRate() {
        return expCostDiscRate;
    }

    /**
     * 设置expCostDiscRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpCostDiscRate(String value) {
        this.expCostDiscRate = value;
    }

    /**
     * 获取expCostDiscAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExpCostDiscAmount() {
        return expCostDiscAmount;
    }

    /**
     * 设置expCostDiscAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExpCostDiscAmount(Double value) {
        this.expCostDiscAmount = value;
    }

    /**
     * 获取expCostDiscTaxable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpCostDiscTaxable() {
        return expCostDiscTaxable;
    }

    /**
     * 设置expCostDiscTaxable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpCostDiscTaxable(Boolean value) {
        this.expCostDiscTaxable = value;
    }

    /**
     * 获取expCostDiscprint属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpCostDiscprint() {
        return expCostDiscprint;
    }

    /**
     * 设置expCostDiscprint属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpCostDiscprint(Boolean value) {
        this.expCostDiscprint = value;
    }

    /**
     * 获取expCostTaxRate1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExpCostTaxRate1() {
        return expCostTaxRate1;
    }

    /**
     * 设置expCostTaxRate1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExpCostTaxRate1(Double value) {
        this.expCostTaxRate1 = value;
    }

    /**
     * 获取timeDiscount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getTimeDiscount() {
        return timeDiscount;
    }

    /**
     * 设置timeDiscount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setTimeDiscount(RecordRef value) {
        this.timeDiscount = value;
    }

    /**
     * 获取expCostTaxCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getExpCostTaxCode() {
        return expCostTaxCode;
    }

    /**
     * 设置expCostTaxCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setExpCostTaxCode(RecordRef value) {
        this.expCostTaxCode = value;
    }

    /**
     * 获取timeDiscRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeDiscRate() {
        return timeDiscRate;
    }

    /**
     * 设置timeDiscRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeDiscRate(String value) {
        this.timeDiscRate = value;
    }

    /**
     * 获取expCostTaxRate2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExpCostTaxRate2() {
        return expCostTaxRate2;
    }

    /**
     * 设置expCostTaxRate2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExpCostTaxRate2(Double value) {
        this.expCostTaxRate2 = value;
    }

    /**
     * 获取expCostDiscTax1Amt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExpCostDiscTax1Amt() {
        return expCostDiscTax1Amt;
    }

    /**
     * 设置expCostDiscTax1Amt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExpCostDiscTax1Amt(Double value) {
        this.expCostDiscTax1Amt = value;
    }

    /**
     * 获取timeDiscAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTimeDiscAmount() {
        return timeDiscAmount;
    }

    /**
     * 设置timeDiscAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTimeDiscAmount(Double value) {
        this.timeDiscAmount = value;
    }

    /**
     * 获取timeDiscTaxable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimeDiscTaxable() {
        return timeDiscTaxable;
    }

    /**
     * 设置timeDiscTaxable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimeDiscTaxable(Boolean value) {
        this.timeDiscTaxable = value;
    }

    /**
     * 获取timeDiscPrint属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimeDiscPrint() {
        return timeDiscPrint;
    }

    /**
     * 设置timeDiscPrint属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimeDiscPrint(Boolean value) {
        this.timeDiscPrint = value;
    }

    /**
     * 获取discountTotal属性的值。
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
     * 设置discountTotal属性的值。
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
     * 获取taxTotal属性的值。
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
     * 设置taxTotal属性的值。
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
     * 获取timeTaxRate1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTimeTaxRate1() {
        return timeTaxRate1;
    }

    /**
     * 设置timeTaxRate1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTimeTaxRate1(Double value) {
        this.timeTaxRate1 = value;
    }

    /**
     * 获取altShippingCost属性的值。
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
     * 设置altShippingCost属性的值。
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
     * 获取timeTaxCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getTimeTaxCode() {
        return timeTaxCode;
    }

    /**
     * 设置timeTaxCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setTimeTaxCode(RecordRef value) {
        this.timeTaxCode = value;
    }

    /**
     * 获取altHandlingCost属性的值。
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
     * 设置altHandlingCost属性的值。
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
     * 获取total属性的值。
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
     * 设置total属性的值。
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
     * 获取timeDiscTax1Amt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTimeDiscTax1Amt() {
        return timeDiscTax1Amt;
    }

    /**
     * 设置timeDiscTax1Amt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTimeDiscTax1Amt(Double value) {
        this.timeDiscTax1Amt = value;
    }

    /**
     * 获取ccSecurityCode属性的值。
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
     * 设置ccSecurityCode属性的值。
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
     * 获取timeTaxRate2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTimeTaxRate2() {
        return timeTaxRate2;
    }

    /**
     * 设置timeTaxRate2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTimeTaxRate2(Double value) {
        this.timeTaxRate2 = value;
    }

    /**
     * 获取ccSecurityCodeMatch属性的值。
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
     * 设置ccSecurityCodeMatch属性的值。
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
     * 获取chargeIt属性的值。
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
     * 设置chargeIt属性的值。
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
     * 获取debitCardIssueNo属性的值。
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
     * 设置debitCardIssueNo属性的值。
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
     * 获取threeDStatusCode属性的值。
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
     * 设置threeDStatusCode属性的值。
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
     * 获取pnRefNum属性的值。
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
     * 设置pnRefNum属性的值。
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
     * 获取paypalAuthId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaypalAuthId() {
        return paypalAuthId;
    }

    /**
     * 设置paypalAuthId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaypalAuthId(String value) {
        this.paypalAuthId = value;
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
     * 获取paypalProcess属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaypalProcess() {
        return paypalProcess;
    }

    /**
     * 设置paypalProcess属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaypalProcess(Boolean value) {
        this.paypalProcess = value;
    }

    /**
     * 获取job属性的值。
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
     * 设置job属性的值。
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
     * 获取billingSchedule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getBillingSchedule() {
        return billingSchedule;
    }

    /**
     * 设置billingSchedule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setBillingSchedule(RecordRef value) {
        this.billingSchedule = value;
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
     * 获取tax2Total属性的值。
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
     * 设置tax2Total属性的值。
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
     * 获取validFrom属性的值。
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
     * 设置validFrom属性的值。
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
     * 获取vatRegNum属性的值。
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
     * 设置vatRegNum属性的值。
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
     * 获取giftCertApplied属性的值。
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
     * 设置giftCertApplied属性的值。
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
     * 获取tranIsVsoeBundle属性的值。
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
     * 设置tranIsVsoeBundle属性的值。
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
     * 获取vsoeAutoCalc属性的值。
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
     * 设置vsoeAutoCalc属性的值。
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
     * 获取salesTeamList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CashSaleSalesTeamList }
     *     
     */
    public CashSaleSalesTeamList getSalesTeamList() {
        return salesTeamList;
    }

    /**
     * 设置salesTeamList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CashSaleSalesTeamList }
     *     
     */
    public void setSalesTeamList(CashSaleSalesTeamList value) {
        this.salesTeamList = value;
    }

    /**
     * 获取partnersList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CashSalePartnersList }
     *     
     */
    public CashSalePartnersList getPartnersList() {
        return partnersList;
    }

    /**
     * 设置partnersList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CashSalePartnersList }
     *     
     */
    public void setPartnersList(CashSalePartnersList value) {
        this.partnersList = value;
    }

    /**
     * 获取itemList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CashSaleItemList }
     *     
     */
    public CashSaleItemList getItemList() {
        return itemList;
    }

    /**
     * 设置itemList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CashSaleItemList }
     *     
     */
    public void setItemList(CashSaleItemList value) {
        this.itemList = value;
    }

    /**
     * 获取accountingBookDetailList属性的值。
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
     * 设置accountingBookDetailList属性的值。
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
     * 获取itemCostList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CashSaleItemCostList }
     *     
     */
    public CashSaleItemCostList getItemCostList() {
        return itemCostList;
    }

    /**
     * 设置itemCostList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CashSaleItemCostList }
     *     
     */
    public void setItemCostList(CashSaleItemCostList value) {
        this.itemCostList = value;
    }

    /**
     * 获取giftCertRedemptionList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GiftCertRedemptionList }
     *     
     */
    public GiftCertRedemptionList getGiftCertRedemptionList() {
        return giftCertRedemptionList;
    }

    /**
     * 设置giftCertRedemptionList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GiftCertRedemptionList }
     *     
     */
    public void setGiftCertRedemptionList(GiftCertRedemptionList value) {
        this.giftCertRedemptionList = value;
    }

    /**
     * 获取promotionsList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PromotionsList }
     *     
     */
    public PromotionsList getPromotionsList() {
        return promotionsList;
    }

    /**
     * 设置promotionsList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionsList }
     *     
     */
    public void setPromotionsList(PromotionsList value) {
        this.promotionsList = value;
    }

    /**
     * 获取expCostList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CashSaleExpCostList }
     *     
     */
    public CashSaleExpCostList getExpCostList() {
        return expCostList;
    }

    /**
     * 设置expCostList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CashSaleExpCostList }
     *     
     */
    public void setExpCostList(CashSaleExpCostList value) {
        this.expCostList = value;
    }

    /**
     * 获取timeList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CashSaleTimeList }
     *     
     */
    public CashSaleTimeList getTimeList() {
        return timeList;
    }

    /**
     * 设置timeList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CashSaleTimeList }
     *     
     */
    public void setTimeList(CashSaleTimeList value) {
        this.timeList = value;
    }

    /**
     * 获取shipGroupList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CashSaleShipGroupList }
     *     
     */
    public CashSaleShipGroupList getShipGroupList() {
        return shipGroupList;
    }

    /**
     * 设置shipGroupList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CashSaleShipGroupList }
     *     
     */
    public void setShipGroupList(CashSaleShipGroupList value) {
        this.shipGroupList = value;
    }

    /**
     * 获取taxDetailsList属性的值。
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
     * 设置taxDetailsList属性的值。
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
