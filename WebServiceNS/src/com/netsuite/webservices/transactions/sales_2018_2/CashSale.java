
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
 * <p>CashSale complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡbillingAccount���Ե�ֵ��
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
     * ����billingAccount���Ե�ֵ��
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
     * ��ȡrecurringBill���Ե�ֵ��
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
     * ����recurringBill���Ե�ֵ��
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
     * ��ȡopportunity���Ե�ֵ��
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
     * ����opportunity���Ե�ֵ��
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
     * ��ȡrevRecSchedule���Ե�ֵ��
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
     * ����revRecSchedule���Ե�ֵ��
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
     * ��ȡcanHaveStackable���Ե�ֵ��
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
     * ����canHaveStackable���Ե�ֵ��
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
     * ��ȡrevRecStartDate���Ե�ֵ��
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
     * ����revRecStartDate���Ե�ֵ��
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
     * ��ȡrevRecEndDate���Ե�ֵ��
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
     * ����revRecEndDate���Ե�ֵ��
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
     * ��ȡshippingAddress���Ե�ֵ��
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
     * ����shippingAddress���Ե�ֵ��
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
     * ��ȡshipIsResidential���Ե�ֵ��
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
     * ����shipIsResidential���Ե�ֵ��
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
     * ��ȡshipAddressList���Ե�ֵ��
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
     * ����shipAddressList���Ե�ֵ��
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
     * ��ȡfob���Ե�ֵ��
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
     * ����fob���Ե�ֵ��
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
     * ��ȡshipDate���Ե�ֵ��
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
     * ����shipDate���Ե�ֵ��
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
     * ��ȡlinkedTrackingNumbers���Ե�ֵ��
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
     * ����linkedTrackingNumbers���Ե�ֵ��
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
     * ��ȡtrackingNumbers���Ե�ֵ��
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
     * ����trackingNumbers���Ե�ֵ��
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
     * ��ȡpayPalStatus���Ե�ֵ��
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
     * ����payPalStatus���Ե�ֵ��
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
     * ��ȡpayPalTranId���Ե�ֵ��
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
     * ����payPalTranId���Ե�ֵ��
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
     * ��ȡitemCostDiscount���Ե�ֵ��
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
     * ����itemCostDiscount���Ե�ֵ��
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
     * ��ȡitemCostDiscRate���Ե�ֵ��
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
     * ����itemCostDiscRate���Ե�ֵ��
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
     * ��ȡitemCostDiscAmount���Ե�ֵ��
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
     * ����itemCostDiscAmount���Ե�ֵ��
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
     * ��ȡitemCostTaxRate1���Ե�ֵ��
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
     * ����itemCostTaxRate1���Ե�ֵ��
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
     * ��ȡitemCostTaxRate2���Ե�ֵ��
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
     * ����itemCostTaxRate2���Ե�ֵ��
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
     * ��ȡitemCostDiscTaxable���Ե�ֵ��
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
     * ����itemCostDiscTaxable���Ե�ֵ��
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
     * ��ȡitemCostTaxCode���Ե�ֵ��
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
     * ����itemCostTaxCode���Ե�ֵ��
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
     * ��ȡitemCostDiscTax1Amt���Ե�ֵ��
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
     * ����itemCostDiscTax1Amt���Ե�ֵ��
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
     * ��ȡitemCostDiscPrint���Ե�ֵ��
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
     * ����itemCostDiscPrint���Ե�ֵ��
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
     * ��ȡexpCostDiscount���Ե�ֵ��
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
     * ����expCostDiscount���Ե�ֵ��
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
     * ��ȡexpCostDiscRate���Ե�ֵ��
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
     * ����expCostDiscRate���Ե�ֵ��
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
     * ��ȡexpCostDiscAmount���Ե�ֵ��
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
     * ����expCostDiscAmount���Ե�ֵ��
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
     * ��ȡexpCostDiscTaxable���Ե�ֵ��
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
     * ����expCostDiscTaxable���Ե�ֵ��
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
     * ��ȡexpCostDiscprint���Ե�ֵ��
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
     * ����expCostDiscprint���Ե�ֵ��
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
     * ��ȡexpCostTaxRate1���Ե�ֵ��
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
     * ����expCostTaxRate1���Ե�ֵ��
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
     * ��ȡtimeDiscount���Ե�ֵ��
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
     * ����timeDiscount���Ե�ֵ��
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
     * ��ȡexpCostTaxCode���Ե�ֵ��
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
     * ����expCostTaxCode���Ե�ֵ��
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
     * ��ȡtimeDiscRate���Ե�ֵ��
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
     * ����timeDiscRate���Ե�ֵ��
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
     * ��ȡexpCostTaxRate2���Ե�ֵ��
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
     * ����expCostTaxRate2���Ե�ֵ��
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
     * ��ȡexpCostDiscTax1Amt���Ե�ֵ��
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
     * ����expCostDiscTax1Amt���Ե�ֵ��
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
     * ��ȡtimeDiscAmount���Ե�ֵ��
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
     * ����timeDiscAmount���Ե�ֵ��
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
     * ��ȡtimeDiscTaxable���Ե�ֵ��
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
     * ����timeDiscTaxable���Ե�ֵ��
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
     * ��ȡtimeDiscPrint���Ե�ֵ��
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
     * ����timeDiscPrint���Ե�ֵ��
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
     * ��ȡtimeTaxRate1���Ե�ֵ��
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
     * ����timeTaxRate1���Ե�ֵ��
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
     * ��ȡtimeTaxCode���Ե�ֵ��
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
     * ����timeTaxCode���Ե�ֵ��
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
     * ��ȡtimeDiscTax1Amt���Ե�ֵ��
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
     * ����timeDiscTax1Amt���Ե�ֵ��
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
     * ��ȡtimeTaxRate2���Ե�ֵ��
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
     * ����timeTaxRate2���Ե�ֵ��
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
     * ��ȡpaypalAuthId���Ե�ֵ��
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
     * ����paypalAuthId���Ե�ֵ��
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
     * ��ȡpaypalProcess���Ե�ֵ��
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
     * ����paypalProcess���Ե�ֵ��
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
     * ��ȡbillingSchedule���Ե�ֵ��
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
     * ����billingSchedule���Ե�ֵ��
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
     *     {@link CashSaleSalesTeamList }
     *     
     */
    public CashSaleSalesTeamList getSalesTeamList() {
        return salesTeamList;
    }

    /**
     * ����salesTeamList���Ե�ֵ��
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
     * ��ȡpartnersList���Ե�ֵ��
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
     * ����partnersList���Ե�ֵ��
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
     * ��ȡitemList���Ե�ֵ��
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
     * ����itemList���Ե�ֵ��
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
     * ��ȡitemCostList���Ե�ֵ��
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
     * ����itemCostList���Ե�ֵ��
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
     * ��ȡgiftCertRedemptionList���Ե�ֵ��
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
     * ����giftCertRedemptionList���Ե�ֵ��
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
     * ��ȡpromotionsList���Ե�ֵ��
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
     * ����promotionsList���Ե�ֵ��
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
     * ��ȡexpCostList���Ե�ֵ��
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
     * ����expCostList���Ե�ֵ��
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
     * ��ȡtimeList���Ե�ֵ��
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
     * ����timeList���Ե�ֵ��
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
     * ��ȡshipGroupList���Ե�ֵ��
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
     * ����shipGroupList���Ե�ֵ��
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
