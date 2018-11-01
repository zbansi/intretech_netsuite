
package com.netsuite.webservices.platform.common_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_2.types.PostingPeriodDate;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;
import com.netsuite.webservices.platform.core_2018_2.SearchBooleanField;
import com.netsuite.webservices.platform.core_2018_2.SearchCustomFieldList;
import com.netsuite.webservices.platform.core_2018_2.SearchDateField;
import com.netsuite.webservices.platform.core_2018_2.SearchDoubleField;
import com.netsuite.webservices.platform.core_2018_2.SearchEnumMultiSelectField;
import com.netsuite.webservices.platform.core_2018_2.SearchLongField;
import com.netsuite.webservices.platform.core_2018_2.SearchMultiSelectField;
import com.netsuite.webservices.platform.core_2018_2.SearchRecordBasic;
import com.netsuite.webservices.platform.core_2018_2.SearchStringField;
import com.netsuite.webservices.platform.core_2018_2.SearchTextNumberField;


/**
 * <p>TransactionSearchBasic complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TransactionSearchBasic">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRecordBasic">
 *       &lt;sequence>
 *         &lt;element name="account" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="accountType" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="actualShipDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="altSalesAmount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="altSalesNetAmount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="amount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="amountPaid" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="amountRemaining" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="amountUnbilled" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="anyLineItem" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="appliedToForeignAmount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="appliedToIsFxVariance" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="appliedToLinkAmount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="appliedToLinkType" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="appliedToTransaction" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="applyingForeignAmount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="applyingIsFxVariance" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="applyingLinkAmount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="applyingLinkType" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="applyingTransaction" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="approvalStatus" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="authCode" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="autoCalculateLag" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="avsStreetMatch" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="avsZipMatch" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="billable" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="billAddress" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="billAddressee" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="billAttention" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="billCity" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="billCountry" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="billCounty" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="billedDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="billingAccount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="billingSchedule" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="billingStatus" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="billingTransaction" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="billPhone" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="billState" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="billVarianceStatus" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="billZip" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="binNumber" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="binNumberQuantity" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="bomQuantity" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="bookSpecificTransaction" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="buildEntireAssembly" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="buildVariance" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="built" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="canHaveStackablePromotions" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="catchUpPeriod" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="ccCustomerCode" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="ccExpireDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="ccName" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="ccNumber" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="chargeType" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="class" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="cleared" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="closed" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="closeDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="cogs" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="commissionEffectiveDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="commit" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="componentYield" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="confirmationNumber" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="contribution" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="costComponentAmount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="costComponentCategory" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="costComponentItem" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="costComponentQuantity" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="costComponentStandardCost" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="costEstimate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="costEstimateRate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="costEstimateType" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="createdBy" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="createdFrom" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="creditAmount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="cscMatch" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="currency" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="customerSubOf" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="customForm" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="customGL" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="custType" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="dateCreated" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="daysOpen" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="daysOverdue" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="debitAmount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="deferredRevenue" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="deferRevRec" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="department" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="depositDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="depositTransaction" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="drAccount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="dueDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="email" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="employee" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="endDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="entity" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="entityStatus" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="estGrossProfit" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="estGrossProfitPct" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="exchangeRate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="excludeCommission" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="excludeFromRateRequest" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="expectedCloseDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="expectedReceiptDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="expenseCategory" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="expenseDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="externalId" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="externalIdString" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="finChrg" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="firmed" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="forecastType" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="fulfillingTransaction" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="fxAccount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="fxAmount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="fxCostEstimate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="fxCostEstimateRate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="fxEstGrossProfit" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="fxTranCostEstimate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="fxVsoeAllocation" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="fxVsoeAmount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="fxVsoePrice" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="gcoAvailabelToCharge" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="gcoAvailableToRefund" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="gcoAvsStreetMatch" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="gcoAvsZipMatch" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="gcoBuyerAccountAge" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="gcoBuyerIp" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="gcoChargeAmount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="gcoChargebackAmount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="gcoConfirmedChargedTotal" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="gcoConfirmedRefundedTotal" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="gcoCreditcardNumber" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="gcoCscMatch" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="gcoFinancialState" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="gcoFulfillmentState" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="gcoOrderId" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="gcoOrderTotal" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="gcoPromotionAmount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="gcoPromotionName" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="gcoRefundAmount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="gcoShippingTotal" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="gcoStateChangedDetail" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="giftCertificate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="grossAmount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="includeInForecast" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="incoterm" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="intercoStatus" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="intercoTransaction" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="internalId" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="internalIdNumber" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="inVsoeBundle" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isAllocation" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isBackflush" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isGcoChargeback" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isGcoChargeConfirmed" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isGcoPaymentGuaranteed" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isGcoRefundConfirmed" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isInsideDelivery" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isInsidePickup" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isIntercompanyAdjustment" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isMultiShipTo" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isPayPalMeth" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isReversal" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isRevRecTransaction" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isScrap" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isShipAddress" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isTransferPriceCosting" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isVsoeAlloc" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isWip" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="item" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="itemFulfillmentChoice" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="itemRevision" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="itemSubOf" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="landedCostPerLine" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="lastModifiedDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="leadSource" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="lineUniqueKey" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="location" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="locationAutoAssigned" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="mainLine" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="mainName" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="manufacturingRouting" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="matchBillToReceipt" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="memo" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="memoMain" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="memorized" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="merchantAccount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="message" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="multiSubsidiary" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="nameText" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="netAmount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="nextApprover" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="nextBillDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="noAutoAssignLocation" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="nonReimbursable" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="number" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="oneTimeTotal" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="opportunity" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="orderPriority" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="otherRefNum" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchTextNumberField" minOccurs="0"/>
 *         &lt;element name="otherRefNumNonDeposit" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchTextNumberField" minOccurs="0"/>
 *         &lt;element name="overheadParentItem" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="packageCount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="paidTransaction" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="parent" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="partner" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="partnerContribution" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="partnerRole" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="partnerTeamMember" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="payingTransaction" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="paymentApproved" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="paymentEventDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="paymentEventHoldReason" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="paymentEventPurchaseCardUsed" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="paymentEventPurchaseDataSent" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="paymentEventResult" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="paymentEventType" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="paymentHold" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="paymentMethod" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="payPalPending" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="payPalStatus" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="payPalTranId" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="pnRefNum" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="poAsText" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="posting" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="postingPeriod" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="postingPeriodRelative" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}PostingPeriodDate" minOccurs="0"/>
 *         &lt;element name="priceLevel" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="printedPickingTicket" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="probability" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="projectedAmount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="projectTask" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="promoCode" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="purchaseOrder" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="quantity" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="quantityBilled" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="quantityCommitted" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="quantityPacked" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="quantityPicked" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="quantityRevCommitted" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="quantityShipRecv" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="recognizedRevenue" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="recordType" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="recurAnnuallyTotal" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="recurMonthlyTotal" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="recurQuarterlyTotal" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="recurringBill" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="recurWeeklyTotal" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="refNumber" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="revCommitStatus" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="revCommittingStatus" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="revCommittingTransaction" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="revenueStatus" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="reversalDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="reversalNumber" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="revRecEndDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="revRecOnRevCommitment" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="revRecStartDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="revRecTermInMonths" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="salesEffectiveDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="salesOrder" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="salesRep" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="salesTeamMember" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="salesTeamRole" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="schedulingMethod" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="serialNumber" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="serialNumberCost" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="serialNumberCostAdjustment" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="serialNumberQuantity" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="serialNumbers" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="shipAddress" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="shipAddressee" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="shipAttention" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="shipCarrier" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="shipCity" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="shipComplete" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="shipCountry" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="shipCounty" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="shipDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="shipGroup" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="shipMethod" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="shipPhone" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="shipping" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="shipRecvStatus" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="shipRecvStatusLine" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="shipState" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="shipTo" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="shipZip" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="source" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="startDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="statistical" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="status" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="subscription" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="subscriptionLine" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="subsidiary" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="taxItem" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="taxLine" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="taxPeriod" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="taxPeriodRelative" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}PostingPeriodDate" minOccurs="0"/>
 *         &lt;element name="taxRate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="terms" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="termsOfSale" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="title" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="toBeEmailed" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="toBePrinted" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="toSubsidiary" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="totalAmount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="trackingNumbers" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="tranCostEstimate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="tranDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="tranEstGrossProfit" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="tranEstGrossProfitPct" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="tranFxEstGrossProfit" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="tranId" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="tranIsVsoeBundle" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="transactionDiscount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="transactionLineType" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="transactionNumber" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="transferLocation" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="transferOrderQuantityCommitted" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="transferOrderQuantityPacked" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="transferOrderQuantityPicked" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="transferOrderQuantityReceived" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="transferOrderQuantityShipped" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="type" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="unit" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="unitCostOverride" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="unitsType" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="vendType" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="visibleToCustomer" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="voided" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="vsoeAllocation" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="vsoeAmount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="vsoeDeferral" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="vsoeDelivered" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="vsoePermitDiscount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="vsoePrice" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="webSite" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="customFieldList" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchCustomFieldList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionSearchBasic", propOrder = {
    "account",
    "accountType",
    "actualShipDate",
    "altSalesAmount",
    "altSalesNetAmount",
    "amount",
    "amountPaid",
    "amountRemaining",
    "amountUnbilled",
    "anyLineItem",
    "appliedToForeignAmount",
    "appliedToIsFxVariance",
    "appliedToLinkAmount",
    "appliedToLinkType",
    "appliedToTransaction",
    "applyingForeignAmount",
    "applyingIsFxVariance",
    "applyingLinkAmount",
    "applyingLinkType",
    "applyingTransaction",
    "approvalStatus",
    "authCode",
    "autoCalculateLag",
    "avsStreetMatch",
    "avsZipMatch",
    "billable",
    "billAddress",
    "billAddressee",
    "billAttention",
    "billCity",
    "billCountry",
    "billCounty",
    "billedDate",
    "billingAccount",
    "billingSchedule",
    "billingStatus",
    "billingTransaction",
    "billPhone",
    "billState",
    "billVarianceStatus",
    "billZip",
    "binNumber",
    "binNumberQuantity",
    "bomQuantity",
    "bookSpecificTransaction",
    "buildEntireAssembly",
    "buildVariance",
    "built",
    "canHaveStackablePromotions",
    "catchUpPeriod",
    "ccCustomerCode",
    "ccExpireDate",
    "ccName",
    "ccNumber",
    "chargeType",
    "clazz",
    "cleared",
    "closed",
    "closeDate",
    "cogs",
    "commissionEffectiveDate",
    "commit",
    "componentYield",
    "confirmationNumber",
    "contribution",
    "costComponentAmount",
    "costComponentCategory",
    "costComponentItem",
    "costComponentQuantity",
    "costComponentStandardCost",
    "costEstimate",
    "costEstimateRate",
    "costEstimateType",
    "createdBy",
    "createdFrom",
    "creditAmount",
    "cscMatch",
    "currency",
    "customerSubOf",
    "customForm",
    "customGL",
    "custType",
    "dateCreated",
    "daysOpen",
    "daysOverdue",
    "debitAmount",
    "deferredRevenue",
    "deferRevRec",
    "department",
    "depositDate",
    "depositTransaction",
    "drAccount",
    "dueDate",
    "email",
    "employee",
    "endDate",
    "entity",
    "entityStatus",
    "estGrossProfit",
    "estGrossProfitPct",
    "exchangeRate",
    "excludeCommission",
    "excludeFromRateRequest",
    "expectedCloseDate",
    "expectedReceiptDate",
    "expenseCategory",
    "expenseDate",
    "externalId",
    "externalIdString",
    "finChrg",
    "firmed",
    "forecastType",
    "fulfillingTransaction",
    "fxAccount",
    "fxAmount",
    "fxCostEstimate",
    "fxCostEstimateRate",
    "fxEstGrossProfit",
    "fxTranCostEstimate",
    "fxVsoeAllocation",
    "fxVsoeAmount",
    "fxVsoePrice",
    "gcoAvailabelToCharge",
    "gcoAvailableToRefund",
    "gcoAvsStreetMatch",
    "gcoAvsZipMatch",
    "gcoBuyerAccountAge",
    "gcoBuyerIp",
    "gcoChargeAmount",
    "gcoChargebackAmount",
    "gcoConfirmedChargedTotal",
    "gcoConfirmedRefundedTotal",
    "gcoCreditcardNumber",
    "gcoCscMatch",
    "gcoFinancialState",
    "gcoFulfillmentState",
    "gcoOrderId",
    "gcoOrderTotal",
    "gcoPromotionAmount",
    "gcoPromotionName",
    "gcoRefundAmount",
    "gcoShippingTotal",
    "gcoStateChangedDetail",
    "giftCertificate",
    "grossAmount",
    "includeInForecast",
    "incoterm",
    "intercoStatus",
    "intercoTransaction",
    "internalId",
    "internalIdNumber",
    "inVsoeBundle",
    "isAllocation",
    "isBackflush",
    "isGcoChargeback",
    "isGcoChargeConfirmed",
    "isGcoPaymentGuaranteed",
    "isGcoRefundConfirmed",
    "isInsideDelivery",
    "isInsidePickup",
    "isIntercompanyAdjustment",
    "isMultiShipTo",
    "isPayPalMeth",
    "isReversal",
    "isRevRecTransaction",
    "isScrap",
    "isShipAddress",
    "isTransferPriceCosting",
    "isVsoeAlloc",
    "isWip",
    "item",
    "itemFulfillmentChoice",
    "itemRevision",
    "itemSubOf",
    "landedCostPerLine",
    "lastModifiedDate",
    "leadSource",
    "lineUniqueKey",
    "location",
    "locationAutoAssigned",
    "mainLine",
    "mainName",
    "manufacturingRouting",
    "matchBillToReceipt",
    "memo",
    "memoMain",
    "memorized",
    "merchantAccount",
    "message",
    "multiSubsidiary",
    "nameText",
    "netAmount",
    "nextApprover",
    "nextBillDate",
    "noAutoAssignLocation",
    "nonReimbursable",
    "number",
    "oneTimeTotal",
    "opportunity",
    "orderPriority",
    "otherRefNum",
    "otherRefNumNonDeposit",
    "overheadParentItem",
    "packageCount",
    "paidTransaction",
    "parent",
    "partner",
    "partnerContribution",
    "partnerRole",
    "partnerTeamMember",
    "payingTransaction",
    "paymentApproved",
    "paymentEventDate",
    "paymentEventHoldReason",
    "paymentEventPurchaseCardUsed",
    "paymentEventPurchaseDataSent",
    "paymentEventResult",
    "paymentEventType",
    "paymentHold",
    "paymentMethod",
    "payPalPending",
    "payPalStatus",
    "payPalTranId",
    "pnRefNum",
    "poAsText",
    "posting",
    "postingPeriod",
    "postingPeriodRelative",
    "priceLevel",
    "printedPickingTicket",
    "probability",
    "projectedAmount",
    "projectTask",
    "promoCode",
    "purchaseOrder",
    "quantity",
    "quantityBilled",
    "quantityCommitted",
    "quantityPacked",
    "quantityPicked",
    "quantityRevCommitted",
    "quantityShipRecv",
    "recognizedRevenue",
    "recordType",
    "recurAnnuallyTotal",
    "recurMonthlyTotal",
    "recurQuarterlyTotal",
    "recurringBill",
    "recurWeeklyTotal",
    "refNumber",
    "revCommitStatus",
    "revCommittingStatus",
    "revCommittingTransaction",
    "revenueStatus",
    "reversalDate",
    "reversalNumber",
    "revRecEndDate",
    "revRecOnRevCommitment",
    "revRecStartDate",
    "revRecTermInMonths",
    "salesEffectiveDate",
    "salesOrder",
    "salesRep",
    "salesTeamMember",
    "salesTeamRole",
    "schedulingMethod",
    "serialNumber",
    "serialNumberCost",
    "serialNumberCostAdjustment",
    "serialNumberQuantity",
    "serialNumbers",
    "shipAddress",
    "shipAddressee",
    "shipAttention",
    "shipCarrier",
    "shipCity",
    "shipComplete",
    "shipCountry",
    "shipCounty",
    "shipDate",
    "shipGroup",
    "shipMethod",
    "shipPhone",
    "shipping",
    "shipRecvStatus",
    "shipRecvStatusLine",
    "shipState",
    "shipTo",
    "shipZip",
    "source",
    "startDate",
    "statistical",
    "status",
    "subscription",
    "subscriptionLine",
    "subsidiary",
    "taxItem",
    "taxLine",
    "taxPeriod",
    "taxPeriodRelative",
    "taxRate",
    "terms",
    "termsOfSale",
    "title",
    "toBeEmailed",
    "toBePrinted",
    "toSubsidiary",
    "totalAmount",
    "trackingNumbers",
    "tranCostEstimate",
    "tranDate",
    "tranEstGrossProfit",
    "tranEstGrossProfitPct",
    "tranFxEstGrossProfit",
    "tranId",
    "tranIsVsoeBundle",
    "transactionDiscount",
    "transactionLineType",
    "transactionNumber",
    "transferLocation",
    "transferOrderQuantityCommitted",
    "transferOrderQuantityPacked",
    "transferOrderQuantityPicked",
    "transferOrderQuantityReceived",
    "transferOrderQuantityShipped",
    "type",
    "unit",
    "unitCostOverride",
    "unitsType",
    "vendType",
    "visibleToCustomer",
    "voided",
    "vsoeAllocation",
    "vsoeAmount",
    "vsoeDeferral",
    "vsoeDelivered",
    "vsoePermitDiscount",
    "vsoePrice",
    "webSite",
    "customFieldList"
})
public class TransactionSearchBasic
    extends SearchRecordBasic
{

    protected SearchMultiSelectField account;
    protected SearchEnumMultiSelectField accountType;
    protected SearchDateField actualShipDate;
    protected SearchDoubleField altSalesAmount;
    protected SearchDoubleField altSalesNetAmount;
    protected SearchDoubleField amount;
    protected SearchDoubleField amountPaid;
    protected SearchDoubleField amountRemaining;
    protected SearchDoubleField amountUnbilled;
    protected SearchMultiSelectField anyLineItem;
    protected SearchDoubleField appliedToForeignAmount;
    protected SearchBooleanField appliedToIsFxVariance;
    protected SearchDoubleField appliedToLinkAmount;
    protected SearchEnumMultiSelectField appliedToLinkType;
    protected SearchMultiSelectField appliedToTransaction;
    protected SearchDoubleField applyingForeignAmount;
    protected SearchBooleanField applyingIsFxVariance;
    protected SearchDoubleField applyingLinkAmount;
    protected SearchEnumMultiSelectField applyingLinkType;
    protected SearchMultiSelectField applyingTransaction;
    protected SearchEnumMultiSelectField approvalStatus;
    protected SearchStringField authCode;
    protected SearchBooleanField autoCalculateLag;
    protected SearchEnumMultiSelectField avsStreetMatch;
    protected SearchEnumMultiSelectField avsZipMatch;
    protected SearchBooleanField billable;
    protected SearchStringField billAddress;
    protected SearchStringField billAddressee;
    protected SearchStringField billAttention;
    protected SearchStringField billCity;
    protected SearchEnumMultiSelectField billCountry;
    protected SearchStringField billCounty;
    protected SearchDateField billedDate;
    protected SearchMultiSelectField billingAccount;
    protected SearchMultiSelectField billingSchedule;
    protected SearchBooleanField billingStatus;
    protected SearchMultiSelectField billingTransaction;
    protected SearchStringField billPhone;
    protected SearchStringField billState;
    protected SearchEnumMultiSelectField billVarianceStatus;
    protected SearchStringField billZip;
    protected SearchStringField binNumber;
    protected SearchDoubleField binNumberQuantity;
    protected SearchDoubleField bomQuantity;
    protected SearchBooleanField bookSpecificTransaction;
    protected SearchBooleanField buildEntireAssembly;
    protected SearchDoubleField buildVariance;
    protected SearchDoubleField built;
    protected SearchBooleanField canHaveStackablePromotions;
    protected SearchMultiSelectField catchUpPeriod;
    protected SearchStringField ccCustomerCode;
    protected SearchDateField ccExpireDate;
    protected SearchStringField ccName;
    protected SearchStringField ccNumber;
    protected SearchEnumMultiSelectField chargeType;
    @XmlElement(name = "class")
    protected SearchMultiSelectField clazz;
    protected SearchBooleanField cleared;
    protected SearchBooleanField closed;
    protected SearchDateField closeDate;
    protected SearchBooleanField cogs;
    protected SearchDateField commissionEffectiveDate;
    protected SearchEnumMultiSelectField commit;
    protected SearchDoubleField componentYield;
    protected SearchStringField confirmationNumber;
    protected SearchLongField contribution;
    protected SearchDoubleField costComponentAmount;
    protected SearchMultiSelectField costComponentCategory;
    protected SearchMultiSelectField costComponentItem;
    protected SearchDoubleField costComponentQuantity;
    protected SearchDoubleField costComponentStandardCost;
    protected SearchDoubleField costEstimate;
    protected SearchDoubleField costEstimateRate;
    protected SearchEnumMultiSelectField costEstimateType;
    protected SearchMultiSelectField createdBy;
    protected SearchMultiSelectField createdFrom;
    protected SearchDoubleField creditAmount;
    protected SearchEnumMultiSelectField cscMatch;
    protected SearchMultiSelectField currency;
    protected SearchMultiSelectField customerSubOf;
    protected SearchMultiSelectField customForm;
    protected SearchBooleanField customGL;
    protected SearchMultiSelectField custType;
    protected SearchDateField dateCreated;
    protected SearchLongField daysOpen;
    protected SearchLongField daysOverdue;
    protected SearchDoubleField debitAmount;
    protected SearchDoubleField deferredRevenue;
    protected SearchBooleanField deferRevRec;
    protected SearchMultiSelectField department;
    protected SearchDateField depositDate;
    protected SearchMultiSelectField depositTransaction;
    protected SearchMultiSelectField drAccount;
    protected SearchDateField dueDate;
    protected SearchStringField email;
    protected SearchMultiSelectField employee;
    protected SearchDateField endDate;
    protected SearchMultiSelectField entity;
    protected SearchMultiSelectField entityStatus;
    protected SearchDoubleField estGrossProfit;
    protected SearchDoubleField estGrossProfitPct;
    protected SearchDoubleField exchangeRate;
    protected SearchBooleanField excludeCommission;
    protected SearchBooleanField excludeFromRateRequest;
    protected SearchDateField expectedCloseDate;
    protected SearchDateField expectedReceiptDate;
    protected SearchMultiSelectField expenseCategory;
    protected SearchDateField expenseDate;
    protected SearchMultiSelectField externalId;
    protected SearchStringField externalIdString;
    protected SearchBooleanField finChrg;
    protected SearchBooleanField firmed;
    protected SearchEnumMultiSelectField forecastType;
    protected SearchMultiSelectField fulfillingTransaction;
    protected SearchMultiSelectField fxAccount;
    protected SearchDoubleField fxAmount;
    protected SearchDoubleField fxCostEstimate;
    protected SearchDoubleField fxCostEstimateRate;
    protected SearchDoubleField fxEstGrossProfit;
    protected SearchDoubleField fxTranCostEstimate;
    protected SearchDoubleField fxVsoeAllocation;
    protected SearchDoubleField fxVsoeAmount;
    protected SearchDoubleField fxVsoePrice;
    protected SearchBooleanField gcoAvailabelToCharge;
    protected SearchBooleanField gcoAvailableToRefund;
    protected SearchEnumMultiSelectField gcoAvsStreetMatch;
    protected SearchEnumMultiSelectField gcoAvsZipMatch;
    protected SearchLongField gcoBuyerAccountAge;
    protected SearchStringField gcoBuyerIp;
    protected SearchDoubleField gcoChargeAmount;
    protected SearchDoubleField gcoChargebackAmount;
    protected SearchDoubleField gcoConfirmedChargedTotal;
    protected SearchDoubleField gcoConfirmedRefundedTotal;
    protected SearchStringField gcoCreditcardNumber;
    protected SearchEnumMultiSelectField gcoCscMatch;
    protected SearchStringField gcoFinancialState;
    protected SearchStringField gcoFulfillmentState;
    protected SearchStringField gcoOrderId;
    protected SearchDoubleField gcoOrderTotal;
    protected SearchDoubleField gcoPromotionAmount;
    protected SearchStringField gcoPromotionName;
    protected SearchDoubleField gcoRefundAmount;
    protected SearchDoubleField gcoShippingTotal;
    protected SearchStringField gcoStateChangedDetail;
    protected SearchStringField giftCertificate;
    protected SearchDoubleField grossAmount;
    protected SearchBooleanField includeInForecast;
    protected SearchMultiSelectField incoterm;
    protected SearchEnumMultiSelectField intercoStatus;
    protected SearchMultiSelectField intercoTransaction;
    protected SearchMultiSelectField internalId;
    protected SearchLongField internalIdNumber;
    protected SearchBooleanField inVsoeBundle;
    protected SearchBooleanField isAllocation;
    protected SearchBooleanField isBackflush;
    protected SearchBooleanField isGcoChargeback;
    protected SearchBooleanField isGcoChargeConfirmed;
    protected SearchBooleanField isGcoPaymentGuaranteed;
    protected SearchBooleanField isGcoRefundConfirmed;
    protected SearchBooleanField isInsideDelivery;
    protected SearchBooleanField isInsidePickup;
    protected SearchBooleanField isIntercompanyAdjustment;
    protected SearchBooleanField isMultiShipTo;
    protected SearchBooleanField isPayPalMeth;
    protected SearchBooleanField isReversal;
    protected SearchBooleanField isRevRecTransaction;
    protected SearchBooleanField isScrap;
    protected SearchBooleanField isShipAddress;
    protected SearchBooleanField isTransferPriceCosting;
    protected SearchBooleanField isVsoeAlloc;
    protected SearchBooleanField isWip;
    protected SearchMultiSelectField item;
    protected SearchEnumMultiSelectField itemFulfillmentChoice;
    protected SearchMultiSelectField itemRevision;
    protected SearchMultiSelectField itemSubOf;
    protected SearchBooleanField landedCostPerLine;
    protected SearchDateField lastModifiedDate;
    protected SearchMultiSelectField leadSource;
    protected SearchLongField lineUniqueKey;
    protected SearchMultiSelectField location;
    protected SearchBooleanField locationAutoAssigned;
    protected SearchBooleanField mainLine;
    protected SearchMultiSelectField mainName;
    protected SearchMultiSelectField manufacturingRouting;
    protected SearchBooleanField matchBillToReceipt;
    protected SearchStringField memo;
    protected SearchStringField memoMain;
    protected SearchBooleanField memorized;
    protected SearchStringField merchantAccount;
    protected SearchStringField message;
    protected SearchBooleanField multiSubsidiary;
    protected SearchStringField nameText;
    protected SearchDoubleField netAmount;
    protected SearchMultiSelectField nextApprover;
    protected SearchDateField nextBillDate;
    protected SearchBooleanField noAutoAssignLocation;
    protected SearchBooleanField nonReimbursable;
    protected SearchLongField number;
    protected SearchDoubleField oneTimeTotal;
    protected SearchMultiSelectField opportunity;
    protected SearchDoubleField orderPriority;
    protected SearchTextNumberField otherRefNum;
    protected SearchTextNumberField otherRefNumNonDeposit;
    protected SearchMultiSelectField overheadParentItem;
    protected SearchLongField packageCount;
    protected SearchMultiSelectField paidTransaction;
    protected SearchLongField parent;
    protected SearchMultiSelectField partner;
    protected SearchLongField partnerContribution;
    protected SearchMultiSelectField partnerRole;
    protected SearchMultiSelectField partnerTeamMember;
    protected SearchMultiSelectField payingTransaction;
    protected SearchBooleanField paymentApproved;
    protected SearchDateField paymentEventDate;
    protected SearchEnumMultiSelectField paymentEventHoldReason;
    protected SearchBooleanField paymentEventPurchaseCardUsed;
    protected SearchBooleanField paymentEventPurchaseDataSent;
    protected SearchEnumMultiSelectField paymentEventResult;
    protected SearchEnumMultiSelectField paymentEventType;
    protected SearchBooleanField paymentHold;
    protected SearchMultiSelectField paymentMethod;
    protected SearchBooleanField payPalPending;
    protected SearchStringField payPalStatus;
    protected SearchStringField payPalTranId;
    protected SearchStringField pnRefNum;
    protected SearchStringField poAsText;
    protected SearchBooleanField posting;
    protected RecordRef postingPeriod;
    @XmlSchemaType(name = "string")
    protected PostingPeriodDate postingPeriodRelative;
    protected SearchMultiSelectField priceLevel;
    protected SearchBooleanField printedPickingTicket;
    protected SearchLongField probability;
    protected SearchDoubleField projectedAmount;
    protected SearchMultiSelectField projectTask;
    protected SearchMultiSelectField promoCode;
    protected SearchMultiSelectField purchaseOrder;
    protected SearchDoubleField quantity;
    protected SearchDoubleField quantityBilled;
    protected SearchDoubleField quantityCommitted;
    protected SearchDoubleField quantityPacked;
    protected SearchDoubleField quantityPicked;
    protected SearchDoubleField quantityRevCommitted;
    protected SearchDoubleField quantityShipRecv;
    protected SearchDoubleField recognizedRevenue;
    protected SearchStringField recordType;
    protected SearchDoubleField recurAnnuallyTotal;
    protected SearchDoubleField recurMonthlyTotal;
    protected SearchDoubleField recurQuarterlyTotal;
    protected SearchBooleanField recurringBill;
    protected SearchDoubleField recurWeeklyTotal;
    protected SearchLongField refNumber;
    protected SearchEnumMultiSelectField revCommitStatus;
    protected SearchBooleanField revCommittingStatus;
    protected SearchMultiSelectField revCommittingTransaction;
    protected SearchEnumMultiSelectField revenueStatus;
    protected SearchDateField reversalDate;
    protected SearchStringField reversalNumber;
    protected SearchDateField revRecEndDate;
    protected SearchBooleanField revRecOnRevCommitment;
    protected SearchDateField revRecStartDate;
    protected SearchLongField revRecTermInMonths;
    protected SearchDateField salesEffectiveDate;
    protected SearchMultiSelectField salesOrder;
    protected SearchMultiSelectField salesRep;
    protected SearchMultiSelectField salesTeamMember;
    protected SearchMultiSelectField salesTeamRole;
    protected SearchEnumMultiSelectField schedulingMethod;
    protected SearchStringField serialNumber;
    protected SearchDoubleField serialNumberCost;
    protected SearchDoubleField serialNumberCostAdjustment;
    protected SearchDoubleField serialNumberQuantity;
    protected SearchStringField serialNumbers;
    protected SearchStringField shipAddress;
    protected SearchStringField shipAddressee;
    protected SearchStringField shipAttention;
    protected SearchEnumMultiSelectField shipCarrier;
    protected SearchStringField shipCity;
    protected SearchBooleanField shipComplete;
    protected SearchEnumMultiSelectField shipCountry;
    protected SearchStringField shipCounty;
    protected SearchDateField shipDate;
    protected SearchLongField shipGroup;
    protected SearchMultiSelectField shipMethod;
    protected SearchStringField shipPhone;
    protected SearchBooleanField shipping;
    protected SearchBooleanField shipRecvStatus;
    protected SearchBooleanField shipRecvStatusLine;
    protected SearchMultiSelectField shipState;
    protected SearchMultiSelectField shipTo;
    protected SearchStringField shipZip;
    protected SearchEnumMultiSelectField source;
    protected SearchDateField startDate;
    protected SearchBooleanField statistical;
    protected SearchEnumMultiSelectField status;
    protected SearchMultiSelectField subscription;
    protected SearchMultiSelectField subscriptionLine;
    protected SearchMultiSelectField subsidiary;
    protected SearchMultiSelectField taxItem;
    protected SearchBooleanField taxLine;
    protected RecordRef taxPeriod;
    @XmlSchemaType(name = "string")
    protected PostingPeriodDate taxPeriodRelative;
    protected SearchDoubleField taxRate;
    protected SearchMultiSelectField terms;
    protected SearchEnumMultiSelectField termsOfSale;
    protected SearchStringField title;
    protected SearchBooleanField toBeEmailed;
    protected SearchBooleanField toBePrinted;
    protected SearchMultiSelectField toSubsidiary;
    protected SearchDoubleField totalAmount;
    protected SearchStringField trackingNumbers;
    protected SearchDoubleField tranCostEstimate;
    protected SearchDateField tranDate;
    protected SearchDoubleField tranEstGrossProfit;
    protected SearchDoubleField tranEstGrossProfitPct;
    protected SearchDoubleField tranFxEstGrossProfit;
    protected SearchStringField tranId;
    protected SearchBooleanField tranIsVsoeBundle;
    protected SearchBooleanField transactionDiscount;
    protected SearchEnumMultiSelectField transactionLineType;
    protected SearchStringField transactionNumber;
    protected SearchMultiSelectField transferLocation;
    protected SearchDoubleField transferOrderQuantityCommitted;
    protected SearchDoubleField transferOrderQuantityPacked;
    protected SearchDoubleField transferOrderQuantityPicked;
    protected SearchDoubleField transferOrderQuantityReceived;
    protected SearchDoubleField transferOrderQuantityShipped;
    protected SearchEnumMultiSelectField type;
    protected SearchMultiSelectField unit;
    protected SearchDoubleField unitCostOverride;
    protected SearchMultiSelectField unitsType;
    protected SearchMultiSelectField vendType;
    protected SearchBooleanField visibleToCustomer;
    protected SearchBooleanField voided;
    protected SearchDoubleField vsoeAllocation;
    protected SearchDoubleField vsoeAmount;
    protected SearchEnumMultiSelectField vsoeDeferral;
    protected SearchBooleanField vsoeDelivered;
    protected SearchEnumMultiSelectField vsoePermitDiscount;
    protected SearchDoubleField vsoePrice;
    protected SearchMultiSelectField webSite;
    protected SearchCustomFieldList customFieldList;

    /**
     * 获取account属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getAccount() {
        return account;
    }

    /**
     * 设置account属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setAccount(SearchMultiSelectField value) {
        this.account = value;
    }

    /**
     * 获取accountType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getAccountType() {
        return accountType;
    }

    /**
     * 设置accountType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setAccountType(SearchEnumMultiSelectField value) {
        this.accountType = value;
    }

    /**
     * 获取actualShipDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getActualShipDate() {
        return actualShipDate;
    }

    /**
     * 设置actualShipDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setActualShipDate(SearchDateField value) {
        this.actualShipDate = value;
    }

    /**
     * 获取altSalesAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getAltSalesAmount() {
        return altSalesAmount;
    }

    /**
     * 设置altSalesAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setAltSalesAmount(SearchDoubleField value) {
        this.altSalesAmount = value;
    }

    /**
     * 获取altSalesNetAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getAltSalesNetAmount() {
        return altSalesNetAmount;
    }

    /**
     * 设置altSalesNetAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setAltSalesNetAmount(SearchDoubleField value) {
        this.altSalesNetAmount = value;
    }

    /**
     * 获取amount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getAmount() {
        return amount;
    }

    /**
     * 设置amount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setAmount(SearchDoubleField value) {
        this.amount = value;
    }

    /**
     * 获取amountPaid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getAmountPaid() {
        return amountPaid;
    }

    /**
     * 设置amountPaid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setAmountPaid(SearchDoubleField value) {
        this.amountPaid = value;
    }

    /**
     * 获取amountRemaining属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getAmountRemaining() {
        return amountRemaining;
    }

    /**
     * 设置amountRemaining属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setAmountRemaining(SearchDoubleField value) {
        this.amountRemaining = value;
    }

    /**
     * 获取amountUnbilled属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getAmountUnbilled() {
        return amountUnbilled;
    }

    /**
     * 设置amountUnbilled属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setAmountUnbilled(SearchDoubleField value) {
        this.amountUnbilled = value;
    }

    /**
     * 获取anyLineItem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getAnyLineItem() {
        return anyLineItem;
    }

    /**
     * 设置anyLineItem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setAnyLineItem(SearchMultiSelectField value) {
        this.anyLineItem = value;
    }

    /**
     * 获取appliedToForeignAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getAppliedToForeignAmount() {
        return appliedToForeignAmount;
    }

    /**
     * 设置appliedToForeignAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setAppliedToForeignAmount(SearchDoubleField value) {
        this.appliedToForeignAmount = value;
    }

    /**
     * 获取appliedToIsFxVariance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getAppliedToIsFxVariance() {
        return appliedToIsFxVariance;
    }

    /**
     * 设置appliedToIsFxVariance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setAppliedToIsFxVariance(SearchBooleanField value) {
        this.appliedToIsFxVariance = value;
    }

    /**
     * 获取appliedToLinkAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getAppliedToLinkAmount() {
        return appliedToLinkAmount;
    }

    /**
     * 设置appliedToLinkAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setAppliedToLinkAmount(SearchDoubleField value) {
        this.appliedToLinkAmount = value;
    }

    /**
     * 获取appliedToLinkType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getAppliedToLinkType() {
        return appliedToLinkType;
    }

    /**
     * 设置appliedToLinkType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setAppliedToLinkType(SearchEnumMultiSelectField value) {
        this.appliedToLinkType = value;
    }

    /**
     * 获取appliedToTransaction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getAppliedToTransaction() {
        return appliedToTransaction;
    }

    /**
     * 设置appliedToTransaction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setAppliedToTransaction(SearchMultiSelectField value) {
        this.appliedToTransaction = value;
    }

    /**
     * 获取applyingForeignAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getApplyingForeignAmount() {
        return applyingForeignAmount;
    }

    /**
     * 设置applyingForeignAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setApplyingForeignAmount(SearchDoubleField value) {
        this.applyingForeignAmount = value;
    }

    /**
     * 获取applyingIsFxVariance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getApplyingIsFxVariance() {
        return applyingIsFxVariance;
    }

    /**
     * 设置applyingIsFxVariance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setApplyingIsFxVariance(SearchBooleanField value) {
        this.applyingIsFxVariance = value;
    }

    /**
     * 获取applyingLinkAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getApplyingLinkAmount() {
        return applyingLinkAmount;
    }

    /**
     * 设置applyingLinkAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setApplyingLinkAmount(SearchDoubleField value) {
        this.applyingLinkAmount = value;
    }

    /**
     * 获取applyingLinkType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getApplyingLinkType() {
        return applyingLinkType;
    }

    /**
     * 设置applyingLinkType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setApplyingLinkType(SearchEnumMultiSelectField value) {
        this.applyingLinkType = value;
    }

    /**
     * 获取applyingTransaction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getApplyingTransaction() {
        return applyingTransaction;
    }

    /**
     * 设置applyingTransaction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setApplyingTransaction(SearchMultiSelectField value) {
        this.applyingTransaction = value;
    }

    /**
     * 获取approvalStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getApprovalStatus() {
        return approvalStatus;
    }

    /**
     * 设置approvalStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setApprovalStatus(SearchEnumMultiSelectField value) {
        this.approvalStatus = value;
    }

    /**
     * 获取authCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getAuthCode() {
        return authCode;
    }

    /**
     * 设置authCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setAuthCode(SearchStringField value) {
        this.authCode = value;
    }

    /**
     * 获取autoCalculateLag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getAutoCalculateLag() {
        return autoCalculateLag;
    }

    /**
     * 设置autoCalculateLag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setAutoCalculateLag(SearchBooleanField value) {
        this.autoCalculateLag = value;
    }

    /**
     * 获取avsStreetMatch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getAvsStreetMatch() {
        return avsStreetMatch;
    }

    /**
     * 设置avsStreetMatch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setAvsStreetMatch(SearchEnumMultiSelectField value) {
        this.avsStreetMatch = value;
    }

    /**
     * 获取avsZipMatch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getAvsZipMatch() {
        return avsZipMatch;
    }

    /**
     * 设置avsZipMatch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setAvsZipMatch(SearchEnumMultiSelectField value) {
        this.avsZipMatch = value;
    }

    /**
     * 获取billable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getBillable() {
        return billable;
    }

    /**
     * 设置billable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setBillable(SearchBooleanField value) {
        this.billable = value;
    }

    /**
     * 获取billAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getBillAddress() {
        return billAddress;
    }

    /**
     * 设置billAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setBillAddress(SearchStringField value) {
        this.billAddress = value;
    }

    /**
     * 获取billAddressee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getBillAddressee() {
        return billAddressee;
    }

    /**
     * 设置billAddressee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setBillAddressee(SearchStringField value) {
        this.billAddressee = value;
    }

    /**
     * 获取billAttention属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getBillAttention() {
        return billAttention;
    }

    /**
     * 设置billAttention属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setBillAttention(SearchStringField value) {
        this.billAttention = value;
    }

    /**
     * 获取billCity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getBillCity() {
        return billCity;
    }

    /**
     * 设置billCity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setBillCity(SearchStringField value) {
        this.billCity = value;
    }

    /**
     * 获取billCountry属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getBillCountry() {
        return billCountry;
    }

    /**
     * 设置billCountry属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setBillCountry(SearchEnumMultiSelectField value) {
        this.billCountry = value;
    }

    /**
     * 获取billCounty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getBillCounty() {
        return billCounty;
    }

    /**
     * 设置billCounty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setBillCounty(SearchStringField value) {
        this.billCounty = value;
    }

    /**
     * 获取billedDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getBilledDate() {
        return billedDate;
    }

    /**
     * 设置billedDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setBilledDate(SearchDateField value) {
        this.billedDate = value;
    }

    /**
     * 获取billingAccount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getBillingAccount() {
        return billingAccount;
    }

    /**
     * 设置billingAccount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setBillingAccount(SearchMultiSelectField value) {
        this.billingAccount = value;
    }

    /**
     * 获取billingSchedule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getBillingSchedule() {
        return billingSchedule;
    }

    /**
     * 设置billingSchedule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setBillingSchedule(SearchMultiSelectField value) {
        this.billingSchedule = value;
    }

    /**
     * 获取billingStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getBillingStatus() {
        return billingStatus;
    }

    /**
     * 设置billingStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setBillingStatus(SearchBooleanField value) {
        this.billingStatus = value;
    }

    /**
     * 获取billingTransaction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getBillingTransaction() {
        return billingTransaction;
    }

    /**
     * 设置billingTransaction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setBillingTransaction(SearchMultiSelectField value) {
        this.billingTransaction = value;
    }

    /**
     * 获取billPhone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getBillPhone() {
        return billPhone;
    }

    /**
     * 设置billPhone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setBillPhone(SearchStringField value) {
        this.billPhone = value;
    }

    /**
     * 获取billState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getBillState() {
        return billState;
    }

    /**
     * 设置billState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setBillState(SearchStringField value) {
        this.billState = value;
    }

    /**
     * 获取billVarianceStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getBillVarianceStatus() {
        return billVarianceStatus;
    }

    /**
     * 设置billVarianceStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setBillVarianceStatus(SearchEnumMultiSelectField value) {
        this.billVarianceStatus = value;
    }

    /**
     * 获取billZip属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getBillZip() {
        return billZip;
    }

    /**
     * 设置billZip属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setBillZip(SearchStringField value) {
        this.billZip = value;
    }

    /**
     * 获取binNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getBinNumber() {
        return binNumber;
    }

    /**
     * 设置binNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setBinNumber(SearchStringField value) {
        this.binNumber = value;
    }

    /**
     * 获取binNumberQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getBinNumberQuantity() {
        return binNumberQuantity;
    }

    /**
     * 设置binNumberQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setBinNumberQuantity(SearchDoubleField value) {
        this.binNumberQuantity = value;
    }

    /**
     * 获取bomQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getBomQuantity() {
        return bomQuantity;
    }

    /**
     * 设置bomQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setBomQuantity(SearchDoubleField value) {
        this.bomQuantity = value;
    }

    /**
     * 获取bookSpecificTransaction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getBookSpecificTransaction() {
        return bookSpecificTransaction;
    }

    /**
     * 设置bookSpecificTransaction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setBookSpecificTransaction(SearchBooleanField value) {
        this.bookSpecificTransaction = value;
    }

    /**
     * 获取buildEntireAssembly属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getBuildEntireAssembly() {
        return buildEntireAssembly;
    }

    /**
     * 设置buildEntireAssembly属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setBuildEntireAssembly(SearchBooleanField value) {
        this.buildEntireAssembly = value;
    }

    /**
     * 获取buildVariance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getBuildVariance() {
        return buildVariance;
    }

    /**
     * 设置buildVariance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setBuildVariance(SearchDoubleField value) {
        this.buildVariance = value;
    }

    /**
     * 获取built属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getBuilt() {
        return built;
    }

    /**
     * 设置built属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setBuilt(SearchDoubleField value) {
        this.built = value;
    }

    /**
     * 获取canHaveStackablePromotions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getCanHaveStackablePromotions() {
        return canHaveStackablePromotions;
    }

    /**
     * 设置canHaveStackablePromotions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setCanHaveStackablePromotions(SearchBooleanField value) {
        this.canHaveStackablePromotions = value;
    }

    /**
     * 获取catchUpPeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getCatchUpPeriod() {
        return catchUpPeriod;
    }

    /**
     * 设置catchUpPeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setCatchUpPeriod(SearchMultiSelectField value) {
        this.catchUpPeriod = value;
    }

    /**
     * 获取ccCustomerCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getCcCustomerCode() {
        return ccCustomerCode;
    }

    /**
     * 设置ccCustomerCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setCcCustomerCode(SearchStringField value) {
        this.ccCustomerCode = value;
    }

    /**
     * 获取ccExpireDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getCcExpireDate() {
        return ccExpireDate;
    }

    /**
     * 设置ccExpireDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setCcExpireDate(SearchDateField value) {
        this.ccExpireDate = value;
    }

    /**
     * 获取ccName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getCcName() {
        return ccName;
    }

    /**
     * 设置ccName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setCcName(SearchStringField value) {
        this.ccName = value;
    }

    /**
     * 获取ccNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getCcNumber() {
        return ccNumber;
    }

    /**
     * 设置ccNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setCcNumber(SearchStringField value) {
        this.ccNumber = value;
    }

    /**
     * 获取chargeType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getChargeType() {
        return chargeType;
    }

    /**
     * 设置chargeType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setChargeType(SearchEnumMultiSelectField value) {
        this.chargeType = value;
    }

    /**
     * 获取clazz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getClazz() {
        return clazz;
    }

    /**
     * 设置clazz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setClazz(SearchMultiSelectField value) {
        this.clazz = value;
    }

    /**
     * 获取cleared属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getCleared() {
        return cleared;
    }

    /**
     * 设置cleared属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setCleared(SearchBooleanField value) {
        this.cleared = value;
    }

    /**
     * 获取closed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getClosed() {
        return closed;
    }

    /**
     * 设置closed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setClosed(SearchBooleanField value) {
        this.closed = value;
    }

    /**
     * 获取closeDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getCloseDate() {
        return closeDate;
    }

    /**
     * 设置closeDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setCloseDate(SearchDateField value) {
        this.closeDate = value;
    }

    /**
     * 获取cogs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getCogs() {
        return cogs;
    }

    /**
     * 设置cogs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setCogs(SearchBooleanField value) {
        this.cogs = value;
    }

    /**
     * 获取commissionEffectiveDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getCommissionEffectiveDate() {
        return commissionEffectiveDate;
    }

    /**
     * 设置commissionEffectiveDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setCommissionEffectiveDate(SearchDateField value) {
        this.commissionEffectiveDate = value;
    }

    /**
     * 获取commit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getCommit() {
        return commit;
    }

    /**
     * 设置commit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setCommit(SearchEnumMultiSelectField value) {
        this.commit = value;
    }

    /**
     * 获取componentYield属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getComponentYield() {
        return componentYield;
    }

    /**
     * 设置componentYield属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setComponentYield(SearchDoubleField value) {
        this.componentYield = value;
    }

    /**
     * 获取confirmationNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getConfirmationNumber() {
        return confirmationNumber;
    }

    /**
     * 设置confirmationNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setConfirmationNumber(SearchStringField value) {
        this.confirmationNumber = value;
    }

    /**
     * 获取contribution属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getContribution() {
        return contribution;
    }

    /**
     * 设置contribution属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setContribution(SearchLongField value) {
        this.contribution = value;
    }

    /**
     * 获取costComponentAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getCostComponentAmount() {
        return costComponentAmount;
    }

    /**
     * 设置costComponentAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setCostComponentAmount(SearchDoubleField value) {
        this.costComponentAmount = value;
    }

    /**
     * 获取costComponentCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getCostComponentCategory() {
        return costComponentCategory;
    }

    /**
     * 设置costComponentCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setCostComponentCategory(SearchMultiSelectField value) {
        this.costComponentCategory = value;
    }

    /**
     * 获取costComponentItem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getCostComponentItem() {
        return costComponentItem;
    }

    /**
     * 设置costComponentItem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setCostComponentItem(SearchMultiSelectField value) {
        this.costComponentItem = value;
    }

    /**
     * 获取costComponentQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getCostComponentQuantity() {
        return costComponentQuantity;
    }

    /**
     * 设置costComponentQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setCostComponentQuantity(SearchDoubleField value) {
        this.costComponentQuantity = value;
    }

    /**
     * 获取costComponentStandardCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getCostComponentStandardCost() {
        return costComponentStandardCost;
    }

    /**
     * 设置costComponentStandardCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setCostComponentStandardCost(SearchDoubleField value) {
        this.costComponentStandardCost = value;
    }

    /**
     * 获取costEstimate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getCostEstimate() {
        return costEstimate;
    }

    /**
     * 设置costEstimate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setCostEstimate(SearchDoubleField value) {
        this.costEstimate = value;
    }

    /**
     * 获取costEstimateRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getCostEstimateRate() {
        return costEstimateRate;
    }

    /**
     * 设置costEstimateRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setCostEstimateRate(SearchDoubleField value) {
        this.costEstimateRate = value;
    }

    /**
     * 获取costEstimateType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getCostEstimateType() {
        return costEstimateType;
    }

    /**
     * 设置costEstimateType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setCostEstimateType(SearchEnumMultiSelectField value) {
        this.costEstimateType = value;
    }

    /**
     * 获取createdBy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getCreatedBy() {
        return createdBy;
    }

    /**
     * 设置createdBy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setCreatedBy(SearchMultiSelectField value) {
        this.createdBy = value;
    }

    /**
     * 获取createdFrom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getCreatedFrom() {
        return createdFrom;
    }

    /**
     * 设置createdFrom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setCreatedFrom(SearchMultiSelectField value) {
        this.createdFrom = value;
    }

    /**
     * 获取creditAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getCreditAmount() {
        return creditAmount;
    }

    /**
     * 设置creditAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setCreditAmount(SearchDoubleField value) {
        this.creditAmount = value;
    }

    /**
     * 获取cscMatch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getCscMatch() {
        return cscMatch;
    }

    /**
     * 设置cscMatch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setCscMatch(SearchEnumMultiSelectField value) {
        this.cscMatch = value;
    }

    /**
     * 获取currency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getCurrency() {
        return currency;
    }

    /**
     * 设置currency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setCurrency(SearchMultiSelectField value) {
        this.currency = value;
    }

    /**
     * 获取customerSubOf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getCustomerSubOf() {
        return customerSubOf;
    }

    /**
     * 设置customerSubOf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setCustomerSubOf(SearchMultiSelectField value) {
        this.customerSubOf = value;
    }

    /**
     * 获取customForm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getCustomForm() {
        return customForm;
    }

    /**
     * 设置customForm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setCustomForm(SearchMultiSelectField value) {
        this.customForm = value;
    }

    /**
     * 获取customGL属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getCustomGL() {
        return customGL;
    }

    /**
     * 设置customGL属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setCustomGL(SearchBooleanField value) {
        this.customGL = value;
    }

    /**
     * 获取custType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getCustType() {
        return custType;
    }

    /**
     * 设置custType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setCustType(SearchMultiSelectField value) {
        this.custType = value;
    }

    /**
     * 获取dateCreated属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getDateCreated() {
        return dateCreated;
    }

    /**
     * 设置dateCreated属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setDateCreated(SearchDateField value) {
        this.dateCreated = value;
    }

    /**
     * 获取daysOpen属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getDaysOpen() {
        return daysOpen;
    }

    /**
     * 设置daysOpen属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setDaysOpen(SearchLongField value) {
        this.daysOpen = value;
    }

    /**
     * 获取daysOverdue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getDaysOverdue() {
        return daysOverdue;
    }

    /**
     * 设置daysOverdue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setDaysOverdue(SearchLongField value) {
        this.daysOverdue = value;
    }

    /**
     * 获取debitAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getDebitAmount() {
        return debitAmount;
    }

    /**
     * 设置debitAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setDebitAmount(SearchDoubleField value) {
        this.debitAmount = value;
    }

    /**
     * 获取deferredRevenue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getDeferredRevenue() {
        return deferredRevenue;
    }

    /**
     * 设置deferredRevenue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setDeferredRevenue(SearchDoubleField value) {
        this.deferredRevenue = value;
    }

    /**
     * 获取deferRevRec属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getDeferRevRec() {
        return deferRevRec;
    }

    /**
     * 设置deferRevRec属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setDeferRevRec(SearchBooleanField value) {
        this.deferRevRec = value;
    }

    /**
     * 获取department属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getDepartment() {
        return department;
    }

    /**
     * 设置department属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setDepartment(SearchMultiSelectField value) {
        this.department = value;
    }

    /**
     * 获取depositDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getDepositDate() {
        return depositDate;
    }

    /**
     * 设置depositDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setDepositDate(SearchDateField value) {
        this.depositDate = value;
    }

    /**
     * 获取depositTransaction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getDepositTransaction() {
        return depositTransaction;
    }

    /**
     * 设置depositTransaction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setDepositTransaction(SearchMultiSelectField value) {
        this.depositTransaction = value;
    }

    /**
     * 获取drAccount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getDrAccount() {
        return drAccount;
    }

    /**
     * 设置drAccount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setDrAccount(SearchMultiSelectField value) {
        this.drAccount = value;
    }

    /**
     * 获取dueDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getDueDate() {
        return dueDate;
    }

    /**
     * 设置dueDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setDueDate(SearchDateField value) {
        this.dueDate = value;
    }

    /**
     * 获取email属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getEmail() {
        return email;
    }

    /**
     * 设置email属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setEmail(SearchStringField value) {
        this.email = value;
    }

    /**
     * 获取employee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getEmployee() {
        return employee;
    }

    /**
     * 设置employee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setEmployee(SearchMultiSelectField value) {
        this.employee = value;
    }

    /**
     * 获取endDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getEndDate() {
        return endDate;
    }

    /**
     * 设置endDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setEndDate(SearchDateField value) {
        this.endDate = value;
    }

    /**
     * 获取entity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getEntity() {
        return entity;
    }

    /**
     * 设置entity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setEntity(SearchMultiSelectField value) {
        this.entity = value;
    }

    /**
     * 获取entityStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getEntityStatus() {
        return entityStatus;
    }

    /**
     * 设置entityStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setEntityStatus(SearchMultiSelectField value) {
        this.entityStatus = value;
    }

    /**
     * 获取estGrossProfit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getEstGrossProfit() {
        return estGrossProfit;
    }

    /**
     * 设置estGrossProfit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setEstGrossProfit(SearchDoubleField value) {
        this.estGrossProfit = value;
    }

    /**
     * 获取estGrossProfitPct属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getEstGrossProfitPct() {
        return estGrossProfitPct;
    }

    /**
     * 设置estGrossProfitPct属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setEstGrossProfitPct(SearchDoubleField value) {
        this.estGrossProfitPct = value;
    }

    /**
     * 获取exchangeRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getExchangeRate() {
        return exchangeRate;
    }

    /**
     * 设置exchangeRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setExchangeRate(SearchDoubleField value) {
        this.exchangeRate = value;
    }

    /**
     * 获取excludeCommission属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getExcludeCommission() {
        return excludeCommission;
    }

    /**
     * 设置excludeCommission属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setExcludeCommission(SearchBooleanField value) {
        this.excludeCommission = value;
    }

    /**
     * 获取excludeFromRateRequest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getExcludeFromRateRequest() {
        return excludeFromRateRequest;
    }

    /**
     * 设置excludeFromRateRequest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setExcludeFromRateRequest(SearchBooleanField value) {
        this.excludeFromRateRequest = value;
    }

    /**
     * 获取expectedCloseDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getExpectedCloseDate() {
        return expectedCloseDate;
    }

    /**
     * 设置expectedCloseDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setExpectedCloseDate(SearchDateField value) {
        this.expectedCloseDate = value;
    }

    /**
     * 获取expectedReceiptDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getExpectedReceiptDate() {
        return expectedReceiptDate;
    }

    /**
     * 设置expectedReceiptDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setExpectedReceiptDate(SearchDateField value) {
        this.expectedReceiptDate = value;
    }

    /**
     * 获取expenseCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getExpenseCategory() {
        return expenseCategory;
    }

    /**
     * 设置expenseCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setExpenseCategory(SearchMultiSelectField value) {
        this.expenseCategory = value;
    }

    /**
     * 获取expenseDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getExpenseDate() {
        return expenseDate;
    }

    /**
     * 设置expenseDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setExpenseDate(SearchDateField value) {
        this.expenseDate = value;
    }

    /**
     * 获取externalId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getExternalId() {
        return externalId;
    }

    /**
     * 设置externalId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setExternalId(SearchMultiSelectField value) {
        this.externalId = value;
    }

    /**
     * 获取externalIdString属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getExternalIdString() {
        return externalIdString;
    }

    /**
     * 设置externalIdString属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setExternalIdString(SearchStringField value) {
        this.externalIdString = value;
    }

    /**
     * 获取finChrg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getFinChrg() {
        return finChrg;
    }

    /**
     * 设置finChrg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setFinChrg(SearchBooleanField value) {
        this.finChrg = value;
    }

    /**
     * 获取firmed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getFirmed() {
        return firmed;
    }

    /**
     * 设置firmed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setFirmed(SearchBooleanField value) {
        this.firmed = value;
    }

    /**
     * 获取forecastType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getForecastType() {
        return forecastType;
    }

    /**
     * 设置forecastType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setForecastType(SearchEnumMultiSelectField value) {
        this.forecastType = value;
    }

    /**
     * 获取fulfillingTransaction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getFulfillingTransaction() {
        return fulfillingTransaction;
    }

    /**
     * 设置fulfillingTransaction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setFulfillingTransaction(SearchMultiSelectField value) {
        this.fulfillingTransaction = value;
    }

    /**
     * 获取fxAccount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getFxAccount() {
        return fxAccount;
    }

    /**
     * 设置fxAccount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setFxAccount(SearchMultiSelectField value) {
        this.fxAccount = value;
    }

    /**
     * 获取fxAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getFxAmount() {
        return fxAmount;
    }

    /**
     * 设置fxAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setFxAmount(SearchDoubleField value) {
        this.fxAmount = value;
    }

    /**
     * 获取fxCostEstimate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getFxCostEstimate() {
        return fxCostEstimate;
    }

    /**
     * 设置fxCostEstimate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setFxCostEstimate(SearchDoubleField value) {
        this.fxCostEstimate = value;
    }

    /**
     * 获取fxCostEstimateRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getFxCostEstimateRate() {
        return fxCostEstimateRate;
    }

    /**
     * 设置fxCostEstimateRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setFxCostEstimateRate(SearchDoubleField value) {
        this.fxCostEstimateRate = value;
    }

    /**
     * 获取fxEstGrossProfit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getFxEstGrossProfit() {
        return fxEstGrossProfit;
    }

    /**
     * 设置fxEstGrossProfit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setFxEstGrossProfit(SearchDoubleField value) {
        this.fxEstGrossProfit = value;
    }

    /**
     * 获取fxTranCostEstimate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getFxTranCostEstimate() {
        return fxTranCostEstimate;
    }

    /**
     * 设置fxTranCostEstimate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setFxTranCostEstimate(SearchDoubleField value) {
        this.fxTranCostEstimate = value;
    }

    /**
     * 获取fxVsoeAllocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getFxVsoeAllocation() {
        return fxVsoeAllocation;
    }

    /**
     * 设置fxVsoeAllocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setFxVsoeAllocation(SearchDoubleField value) {
        this.fxVsoeAllocation = value;
    }

    /**
     * 获取fxVsoeAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getFxVsoeAmount() {
        return fxVsoeAmount;
    }

    /**
     * 设置fxVsoeAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setFxVsoeAmount(SearchDoubleField value) {
        this.fxVsoeAmount = value;
    }

    /**
     * 获取fxVsoePrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getFxVsoePrice() {
        return fxVsoePrice;
    }

    /**
     * 设置fxVsoePrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setFxVsoePrice(SearchDoubleField value) {
        this.fxVsoePrice = value;
    }

    /**
     * 获取gcoAvailabelToCharge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getGcoAvailabelToCharge() {
        return gcoAvailabelToCharge;
    }

    /**
     * 设置gcoAvailabelToCharge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setGcoAvailabelToCharge(SearchBooleanField value) {
        this.gcoAvailabelToCharge = value;
    }

    /**
     * 获取gcoAvailableToRefund属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getGcoAvailableToRefund() {
        return gcoAvailableToRefund;
    }

    /**
     * 设置gcoAvailableToRefund属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setGcoAvailableToRefund(SearchBooleanField value) {
        this.gcoAvailableToRefund = value;
    }

    /**
     * 获取gcoAvsStreetMatch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getGcoAvsStreetMatch() {
        return gcoAvsStreetMatch;
    }

    /**
     * 设置gcoAvsStreetMatch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setGcoAvsStreetMatch(SearchEnumMultiSelectField value) {
        this.gcoAvsStreetMatch = value;
    }

    /**
     * 获取gcoAvsZipMatch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getGcoAvsZipMatch() {
        return gcoAvsZipMatch;
    }

    /**
     * 设置gcoAvsZipMatch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setGcoAvsZipMatch(SearchEnumMultiSelectField value) {
        this.gcoAvsZipMatch = value;
    }

    /**
     * 获取gcoBuyerAccountAge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getGcoBuyerAccountAge() {
        return gcoBuyerAccountAge;
    }

    /**
     * 设置gcoBuyerAccountAge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setGcoBuyerAccountAge(SearchLongField value) {
        this.gcoBuyerAccountAge = value;
    }

    /**
     * 获取gcoBuyerIp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getGcoBuyerIp() {
        return gcoBuyerIp;
    }

    /**
     * 设置gcoBuyerIp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setGcoBuyerIp(SearchStringField value) {
        this.gcoBuyerIp = value;
    }

    /**
     * 获取gcoChargeAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getGcoChargeAmount() {
        return gcoChargeAmount;
    }

    /**
     * 设置gcoChargeAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setGcoChargeAmount(SearchDoubleField value) {
        this.gcoChargeAmount = value;
    }

    /**
     * 获取gcoChargebackAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getGcoChargebackAmount() {
        return gcoChargebackAmount;
    }

    /**
     * 设置gcoChargebackAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setGcoChargebackAmount(SearchDoubleField value) {
        this.gcoChargebackAmount = value;
    }

    /**
     * 获取gcoConfirmedChargedTotal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getGcoConfirmedChargedTotal() {
        return gcoConfirmedChargedTotal;
    }

    /**
     * 设置gcoConfirmedChargedTotal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setGcoConfirmedChargedTotal(SearchDoubleField value) {
        this.gcoConfirmedChargedTotal = value;
    }

    /**
     * 获取gcoConfirmedRefundedTotal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getGcoConfirmedRefundedTotal() {
        return gcoConfirmedRefundedTotal;
    }

    /**
     * 设置gcoConfirmedRefundedTotal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setGcoConfirmedRefundedTotal(SearchDoubleField value) {
        this.gcoConfirmedRefundedTotal = value;
    }

    /**
     * 获取gcoCreditcardNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getGcoCreditcardNumber() {
        return gcoCreditcardNumber;
    }

    /**
     * 设置gcoCreditcardNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setGcoCreditcardNumber(SearchStringField value) {
        this.gcoCreditcardNumber = value;
    }

    /**
     * 获取gcoCscMatch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getGcoCscMatch() {
        return gcoCscMatch;
    }

    /**
     * 设置gcoCscMatch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setGcoCscMatch(SearchEnumMultiSelectField value) {
        this.gcoCscMatch = value;
    }

    /**
     * 获取gcoFinancialState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getGcoFinancialState() {
        return gcoFinancialState;
    }

    /**
     * 设置gcoFinancialState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setGcoFinancialState(SearchStringField value) {
        this.gcoFinancialState = value;
    }

    /**
     * 获取gcoFulfillmentState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getGcoFulfillmentState() {
        return gcoFulfillmentState;
    }

    /**
     * 设置gcoFulfillmentState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setGcoFulfillmentState(SearchStringField value) {
        this.gcoFulfillmentState = value;
    }

    /**
     * 获取gcoOrderId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getGcoOrderId() {
        return gcoOrderId;
    }

    /**
     * 设置gcoOrderId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setGcoOrderId(SearchStringField value) {
        this.gcoOrderId = value;
    }

    /**
     * 获取gcoOrderTotal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getGcoOrderTotal() {
        return gcoOrderTotal;
    }

    /**
     * 设置gcoOrderTotal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setGcoOrderTotal(SearchDoubleField value) {
        this.gcoOrderTotal = value;
    }

    /**
     * 获取gcoPromotionAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getGcoPromotionAmount() {
        return gcoPromotionAmount;
    }

    /**
     * 设置gcoPromotionAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setGcoPromotionAmount(SearchDoubleField value) {
        this.gcoPromotionAmount = value;
    }

    /**
     * 获取gcoPromotionName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getGcoPromotionName() {
        return gcoPromotionName;
    }

    /**
     * 设置gcoPromotionName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setGcoPromotionName(SearchStringField value) {
        this.gcoPromotionName = value;
    }

    /**
     * 获取gcoRefundAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getGcoRefundAmount() {
        return gcoRefundAmount;
    }

    /**
     * 设置gcoRefundAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setGcoRefundAmount(SearchDoubleField value) {
        this.gcoRefundAmount = value;
    }

    /**
     * 获取gcoShippingTotal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getGcoShippingTotal() {
        return gcoShippingTotal;
    }

    /**
     * 设置gcoShippingTotal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setGcoShippingTotal(SearchDoubleField value) {
        this.gcoShippingTotal = value;
    }

    /**
     * 获取gcoStateChangedDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getGcoStateChangedDetail() {
        return gcoStateChangedDetail;
    }

    /**
     * 设置gcoStateChangedDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setGcoStateChangedDetail(SearchStringField value) {
        this.gcoStateChangedDetail = value;
    }

    /**
     * 获取giftCertificate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getGiftCertificate() {
        return giftCertificate;
    }

    /**
     * 设置giftCertificate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setGiftCertificate(SearchStringField value) {
        this.giftCertificate = value;
    }

    /**
     * 获取grossAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getGrossAmount() {
        return grossAmount;
    }

    /**
     * 设置grossAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setGrossAmount(SearchDoubleField value) {
        this.grossAmount = value;
    }

    /**
     * 获取includeInForecast属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIncludeInForecast() {
        return includeInForecast;
    }

    /**
     * 设置includeInForecast属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIncludeInForecast(SearchBooleanField value) {
        this.includeInForecast = value;
    }

    /**
     * 获取incoterm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getIncoterm() {
        return incoterm;
    }

    /**
     * 设置incoterm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setIncoterm(SearchMultiSelectField value) {
        this.incoterm = value;
    }

    /**
     * 获取intercoStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getIntercoStatus() {
        return intercoStatus;
    }

    /**
     * 设置intercoStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setIntercoStatus(SearchEnumMultiSelectField value) {
        this.intercoStatus = value;
    }

    /**
     * 获取intercoTransaction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getIntercoTransaction() {
        return intercoTransaction;
    }

    /**
     * 设置intercoTransaction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setIntercoTransaction(SearchMultiSelectField value) {
        this.intercoTransaction = value;
    }

    /**
     * 获取internalId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getInternalId() {
        return internalId;
    }

    /**
     * 设置internalId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setInternalId(SearchMultiSelectField value) {
        this.internalId = value;
    }

    /**
     * 获取internalIdNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }

    /**
     * 设置internalIdNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setInternalIdNumber(SearchLongField value) {
        this.internalIdNumber = value;
    }

    /**
     * 获取inVsoeBundle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getInVsoeBundle() {
        return inVsoeBundle;
    }

    /**
     * 设置inVsoeBundle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setInVsoeBundle(SearchBooleanField value) {
        this.inVsoeBundle = value;
    }

    /**
     * 获取isAllocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsAllocation() {
        return isAllocation;
    }

    /**
     * 设置isAllocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsAllocation(SearchBooleanField value) {
        this.isAllocation = value;
    }

    /**
     * 获取isBackflush属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsBackflush() {
        return isBackflush;
    }

    /**
     * 设置isBackflush属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsBackflush(SearchBooleanField value) {
        this.isBackflush = value;
    }

    /**
     * 获取isGcoChargeback属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsGcoChargeback() {
        return isGcoChargeback;
    }

    /**
     * 设置isGcoChargeback属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsGcoChargeback(SearchBooleanField value) {
        this.isGcoChargeback = value;
    }

    /**
     * 获取isGcoChargeConfirmed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsGcoChargeConfirmed() {
        return isGcoChargeConfirmed;
    }

    /**
     * 设置isGcoChargeConfirmed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsGcoChargeConfirmed(SearchBooleanField value) {
        this.isGcoChargeConfirmed = value;
    }

    /**
     * 获取isGcoPaymentGuaranteed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsGcoPaymentGuaranteed() {
        return isGcoPaymentGuaranteed;
    }

    /**
     * 设置isGcoPaymentGuaranteed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsGcoPaymentGuaranteed(SearchBooleanField value) {
        this.isGcoPaymentGuaranteed = value;
    }

    /**
     * 获取isGcoRefundConfirmed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsGcoRefundConfirmed() {
        return isGcoRefundConfirmed;
    }

    /**
     * 设置isGcoRefundConfirmed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsGcoRefundConfirmed(SearchBooleanField value) {
        this.isGcoRefundConfirmed = value;
    }

    /**
     * 获取isInsideDelivery属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsInsideDelivery() {
        return isInsideDelivery;
    }

    /**
     * 设置isInsideDelivery属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsInsideDelivery(SearchBooleanField value) {
        this.isInsideDelivery = value;
    }

    /**
     * 获取isInsidePickup属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsInsidePickup() {
        return isInsidePickup;
    }

    /**
     * 设置isInsidePickup属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsInsidePickup(SearchBooleanField value) {
        this.isInsidePickup = value;
    }

    /**
     * 获取isIntercompanyAdjustment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsIntercompanyAdjustment() {
        return isIntercompanyAdjustment;
    }

    /**
     * 设置isIntercompanyAdjustment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsIntercompanyAdjustment(SearchBooleanField value) {
        this.isIntercompanyAdjustment = value;
    }

    /**
     * 获取isMultiShipTo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsMultiShipTo() {
        return isMultiShipTo;
    }

    /**
     * 设置isMultiShipTo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsMultiShipTo(SearchBooleanField value) {
        this.isMultiShipTo = value;
    }

    /**
     * 获取isPayPalMeth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsPayPalMeth() {
        return isPayPalMeth;
    }

    /**
     * 设置isPayPalMeth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsPayPalMeth(SearchBooleanField value) {
        this.isPayPalMeth = value;
    }

    /**
     * 获取isReversal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsReversal() {
        return isReversal;
    }

    /**
     * 设置isReversal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsReversal(SearchBooleanField value) {
        this.isReversal = value;
    }

    /**
     * 获取isRevRecTransaction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsRevRecTransaction() {
        return isRevRecTransaction;
    }

    /**
     * 设置isRevRecTransaction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsRevRecTransaction(SearchBooleanField value) {
        this.isRevRecTransaction = value;
    }

    /**
     * 获取isScrap属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsScrap() {
        return isScrap;
    }

    /**
     * 设置isScrap属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsScrap(SearchBooleanField value) {
        this.isScrap = value;
    }

    /**
     * 获取isShipAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsShipAddress() {
        return isShipAddress;
    }

    /**
     * 设置isShipAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsShipAddress(SearchBooleanField value) {
        this.isShipAddress = value;
    }

    /**
     * 获取isTransferPriceCosting属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsTransferPriceCosting() {
        return isTransferPriceCosting;
    }

    /**
     * 设置isTransferPriceCosting属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsTransferPriceCosting(SearchBooleanField value) {
        this.isTransferPriceCosting = value;
    }

    /**
     * 获取isVsoeAlloc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsVsoeAlloc() {
        return isVsoeAlloc;
    }

    /**
     * 设置isVsoeAlloc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsVsoeAlloc(SearchBooleanField value) {
        this.isVsoeAlloc = value;
    }

    /**
     * 获取isWip属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsWip() {
        return isWip;
    }

    /**
     * 设置isWip属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsWip(SearchBooleanField value) {
        this.isWip = value;
    }

    /**
     * 获取item属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getItem() {
        return item;
    }

    /**
     * 设置item属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setItem(SearchMultiSelectField value) {
        this.item = value;
    }

    /**
     * 获取itemFulfillmentChoice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getItemFulfillmentChoice() {
        return itemFulfillmentChoice;
    }

    /**
     * 设置itemFulfillmentChoice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setItemFulfillmentChoice(SearchEnumMultiSelectField value) {
        this.itemFulfillmentChoice = value;
    }

    /**
     * 获取itemRevision属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getItemRevision() {
        return itemRevision;
    }

    /**
     * 设置itemRevision属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setItemRevision(SearchMultiSelectField value) {
        this.itemRevision = value;
    }

    /**
     * 获取itemSubOf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getItemSubOf() {
        return itemSubOf;
    }

    /**
     * 设置itemSubOf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setItemSubOf(SearchMultiSelectField value) {
        this.itemSubOf = value;
    }

    /**
     * 获取landedCostPerLine属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getLandedCostPerLine() {
        return landedCostPerLine;
    }

    /**
     * 设置landedCostPerLine属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setLandedCostPerLine(SearchBooleanField value) {
        this.landedCostPerLine = value;
    }

    /**
     * 获取lastModifiedDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * 设置lastModifiedDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setLastModifiedDate(SearchDateField value) {
        this.lastModifiedDate = value;
    }

    /**
     * 获取leadSource属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getLeadSource() {
        return leadSource;
    }

    /**
     * 设置leadSource属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setLeadSource(SearchMultiSelectField value) {
        this.leadSource = value;
    }

    /**
     * 获取lineUniqueKey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getLineUniqueKey() {
        return lineUniqueKey;
    }

    /**
     * 设置lineUniqueKey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setLineUniqueKey(SearchLongField value) {
        this.lineUniqueKey = value;
    }

    /**
     * 获取location属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getLocation() {
        return location;
    }

    /**
     * 设置location属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setLocation(SearchMultiSelectField value) {
        this.location = value;
    }

    /**
     * 获取locationAutoAssigned属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getLocationAutoAssigned() {
        return locationAutoAssigned;
    }

    /**
     * 设置locationAutoAssigned属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setLocationAutoAssigned(SearchBooleanField value) {
        this.locationAutoAssigned = value;
    }

    /**
     * 获取mainLine属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getMainLine() {
        return mainLine;
    }

    /**
     * 设置mainLine属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setMainLine(SearchBooleanField value) {
        this.mainLine = value;
    }

    /**
     * 获取mainName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getMainName() {
        return mainName;
    }

    /**
     * 设置mainName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setMainName(SearchMultiSelectField value) {
        this.mainName = value;
    }

    /**
     * 获取manufacturingRouting属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getManufacturingRouting() {
        return manufacturingRouting;
    }

    /**
     * 设置manufacturingRouting属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setManufacturingRouting(SearchMultiSelectField value) {
        this.manufacturingRouting = value;
    }

    /**
     * 获取matchBillToReceipt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getMatchBillToReceipt() {
        return matchBillToReceipt;
    }

    /**
     * 设置matchBillToReceipt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setMatchBillToReceipt(SearchBooleanField value) {
        this.matchBillToReceipt = value;
    }

    /**
     * 获取memo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getMemo() {
        return memo;
    }

    /**
     * 设置memo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setMemo(SearchStringField value) {
        this.memo = value;
    }

    /**
     * 获取memoMain属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getMemoMain() {
        return memoMain;
    }

    /**
     * 设置memoMain属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setMemoMain(SearchStringField value) {
        this.memoMain = value;
    }

    /**
     * 获取memorized属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getMemorized() {
        return memorized;
    }

    /**
     * 设置memorized属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setMemorized(SearchBooleanField value) {
        this.memorized = value;
    }

    /**
     * 获取merchantAccount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getMerchantAccount() {
        return merchantAccount;
    }

    /**
     * 设置merchantAccount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setMerchantAccount(SearchStringField value) {
        this.merchantAccount = value;
    }

    /**
     * 获取message属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getMessage() {
        return message;
    }

    /**
     * 设置message属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setMessage(SearchStringField value) {
        this.message = value;
    }

    /**
     * 获取multiSubsidiary属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getMultiSubsidiary() {
        return multiSubsidiary;
    }

    /**
     * 设置multiSubsidiary属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setMultiSubsidiary(SearchBooleanField value) {
        this.multiSubsidiary = value;
    }

    /**
     * 获取nameText属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getNameText() {
        return nameText;
    }

    /**
     * 设置nameText属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setNameText(SearchStringField value) {
        this.nameText = value;
    }

    /**
     * 获取netAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getNetAmount() {
        return netAmount;
    }

    /**
     * 设置netAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setNetAmount(SearchDoubleField value) {
        this.netAmount = value;
    }

    /**
     * 获取nextApprover属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getNextApprover() {
        return nextApprover;
    }

    /**
     * 设置nextApprover属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setNextApprover(SearchMultiSelectField value) {
        this.nextApprover = value;
    }

    /**
     * 获取nextBillDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getNextBillDate() {
        return nextBillDate;
    }

    /**
     * 设置nextBillDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setNextBillDate(SearchDateField value) {
        this.nextBillDate = value;
    }

    /**
     * 获取noAutoAssignLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getNoAutoAssignLocation() {
        return noAutoAssignLocation;
    }

    /**
     * 设置noAutoAssignLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setNoAutoAssignLocation(SearchBooleanField value) {
        this.noAutoAssignLocation = value;
    }

    /**
     * 获取nonReimbursable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getNonReimbursable() {
        return nonReimbursable;
    }

    /**
     * 设置nonReimbursable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setNonReimbursable(SearchBooleanField value) {
        this.nonReimbursable = value;
    }

    /**
     * 获取number属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getNumber() {
        return number;
    }

    /**
     * 设置number属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setNumber(SearchLongField value) {
        this.number = value;
    }

    /**
     * 获取oneTimeTotal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getOneTimeTotal() {
        return oneTimeTotal;
    }

    /**
     * 设置oneTimeTotal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setOneTimeTotal(SearchDoubleField value) {
        this.oneTimeTotal = value;
    }

    /**
     * 获取opportunity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getOpportunity() {
        return opportunity;
    }

    /**
     * 设置opportunity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setOpportunity(SearchMultiSelectField value) {
        this.opportunity = value;
    }

    /**
     * 获取orderPriority属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getOrderPriority() {
        return orderPriority;
    }

    /**
     * 设置orderPriority属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setOrderPriority(SearchDoubleField value) {
        this.orderPriority = value;
    }

    /**
     * 获取otherRefNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchTextNumberField }
     *     
     */
    public SearchTextNumberField getOtherRefNum() {
        return otherRefNum;
    }

    /**
     * 设置otherRefNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchTextNumberField }
     *     
     */
    public void setOtherRefNum(SearchTextNumberField value) {
        this.otherRefNum = value;
    }

    /**
     * 获取otherRefNumNonDeposit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchTextNumberField }
     *     
     */
    public SearchTextNumberField getOtherRefNumNonDeposit() {
        return otherRefNumNonDeposit;
    }

    /**
     * 设置otherRefNumNonDeposit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchTextNumberField }
     *     
     */
    public void setOtherRefNumNonDeposit(SearchTextNumberField value) {
        this.otherRefNumNonDeposit = value;
    }

    /**
     * 获取overheadParentItem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getOverheadParentItem() {
        return overheadParentItem;
    }

    /**
     * 设置overheadParentItem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setOverheadParentItem(SearchMultiSelectField value) {
        this.overheadParentItem = value;
    }

    /**
     * 获取packageCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getPackageCount() {
        return packageCount;
    }

    /**
     * 设置packageCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setPackageCount(SearchLongField value) {
        this.packageCount = value;
    }

    /**
     * 获取paidTransaction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getPaidTransaction() {
        return paidTransaction;
    }

    /**
     * 设置paidTransaction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setPaidTransaction(SearchMultiSelectField value) {
        this.paidTransaction = value;
    }

    /**
     * 获取parent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getParent() {
        return parent;
    }

    /**
     * 设置parent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setParent(SearchLongField value) {
        this.parent = value;
    }

    /**
     * 获取partner属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getPartner() {
        return partner;
    }

    /**
     * 设置partner属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setPartner(SearchMultiSelectField value) {
        this.partner = value;
    }

    /**
     * 获取partnerContribution属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getPartnerContribution() {
        return partnerContribution;
    }

    /**
     * 设置partnerContribution属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setPartnerContribution(SearchLongField value) {
        this.partnerContribution = value;
    }

    /**
     * 获取partnerRole属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getPartnerRole() {
        return partnerRole;
    }

    /**
     * 设置partnerRole属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setPartnerRole(SearchMultiSelectField value) {
        this.partnerRole = value;
    }

    /**
     * 获取partnerTeamMember属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getPartnerTeamMember() {
        return partnerTeamMember;
    }

    /**
     * 设置partnerTeamMember属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setPartnerTeamMember(SearchMultiSelectField value) {
        this.partnerTeamMember = value;
    }

    /**
     * 获取payingTransaction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getPayingTransaction() {
        return payingTransaction;
    }

    /**
     * 设置payingTransaction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setPayingTransaction(SearchMultiSelectField value) {
        this.payingTransaction = value;
    }

    /**
     * 获取paymentApproved属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getPaymentApproved() {
        return paymentApproved;
    }

    /**
     * 设置paymentApproved属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setPaymentApproved(SearchBooleanField value) {
        this.paymentApproved = value;
    }

    /**
     * 获取paymentEventDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getPaymentEventDate() {
        return paymentEventDate;
    }

    /**
     * 设置paymentEventDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setPaymentEventDate(SearchDateField value) {
        this.paymentEventDate = value;
    }

    /**
     * 获取paymentEventHoldReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getPaymentEventHoldReason() {
        return paymentEventHoldReason;
    }

    /**
     * 设置paymentEventHoldReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setPaymentEventHoldReason(SearchEnumMultiSelectField value) {
        this.paymentEventHoldReason = value;
    }

    /**
     * 获取paymentEventPurchaseCardUsed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getPaymentEventPurchaseCardUsed() {
        return paymentEventPurchaseCardUsed;
    }

    /**
     * 设置paymentEventPurchaseCardUsed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setPaymentEventPurchaseCardUsed(SearchBooleanField value) {
        this.paymentEventPurchaseCardUsed = value;
    }

    /**
     * 获取paymentEventPurchaseDataSent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getPaymentEventPurchaseDataSent() {
        return paymentEventPurchaseDataSent;
    }

    /**
     * 设置paymentEventPurchaseDataSent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setPaymentEventPurchaseDataSent(SearchBooleanField value) {
        this.paymentEventPurchaseDataSent = value;
    }

    /**
     * 获取paymentEventResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getPaymentEventResult() {
        return paymentEventResult;
    }

    /**
     * 设置paymentEventResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setPaymentEventResult(SearchEnumMultiSelectField value) {
        this.paymentEventResult = value;
    }

    /**
     * 获取paymentEventType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getPaymentEventType() {
        return paymentEventType;
    }

    /**
     * 设置paymentEventType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setPaymentEventType(SearchEnumMultiSelectField value) {
        this.paymentEventType = value;
    }

    /**
     * 获取paymentHold属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getPaymentHold() {
        return paymentHold;
    }

    /**
     * 设置paymentHold属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setPaymentHold(SearchBooleanField value) {
        this.paymentHold = value;
    }

    /**
     * 获取paymentMethod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * 设置paymentMethod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setPaymentMethod(SearchMultiSelectField value) {
        this.paymentMethod = value;
    }

    /**
     * 获取payPalPending属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getPayPalPending() {
        return payPalPending;
    }

    /**
     * 设置payPalPending属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setPayPalPending(SearchBooleanField value) {
        this.payPalPending = value;
    }

    /**
     * 获取payPalStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getPayPalStatus() {
        return payPalStatus;
    }

    /**
     * 设置payPalStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setPayPalStatus(SearchStringField value) {
        this.payPalStatus = value;
    }

    /**
     * 获取payPalTranId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getPayPalTranId() {
        return payPalTranId;
    }

    /**
     * 设置payPalTranId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setPayPalTranId(SearchStringField value) {
        this.payPalTranId = value;
    }

    /**
     * 获取pnRefNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getPnRefNum() {
        return pnRefNum;
    }

    /**
     * 设置pnRefNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setPnRefNum(SearchStringField value) {
        this.pnRefNum = value;
    }

    /**
     * 获取poAsText属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getPoAsText() {
        return poAsText;
    }

    /**
     * 设置poAsText属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setPoAsText(SearchStringField value) {
        this.poAsText = value;
    }

    /**
     * 获取posting属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getPosting() {
        return posting;
    }

    /**
     * 设置posting属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setPosting(SearchBooleanField value) {
        this.posting = value;
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
     * 获取postingPeriodRelative属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PostingPeriodDate }
     *     
     */
    public PostingPeriodDate getPostingPeriodRelative() {
        return postingPeriodRelative;
    }

    /**
     * 设置postingPeriodRelative属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PostingPeriodDate }
     *     
     */
    public void setPostingPeriodRelative(PostingPeriodDate value) {
        this.postingPeriodRelative = value;
    }

    /**
     * 获取priceLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getPriceLevel() {
        return priceLevel;
    }

    /**
     * 设置priceLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setPriceLevel(SearchMultiSelectField value) {
        this.priceLevel = value;
    }

    /**
     * 获取printedPickingTicket属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getPrintedPickingTicket() {
        return printedPickingTicket;
    }

    /**
     * 设置printedPickingTicket属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setPrintedPickingTicket(SearchBooleanField value) {
        this.printedPickingTicket = value;
    }

    /**
     * 获取probability属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getProbability() {
        return probability;
    }

    /**
     * 设置probability属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setProbability(SearchLongField value) {
        this.probability = value;
    }

    /**
     * 获取projectedAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getProjectedAmount() {
        return projectedAmount;
    }

    /**
     * 设置projectedAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setProjectedAmount(SearchDoubleField value) {
        this.projectedAmount = value;
    }

    /**
     * 获取projectTask属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getProjectTask() {
        return projectTask;
    }

    /**
     * 设置projectTask属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setProjectTask(SearchMultiSelectField value) {
        this.projectTask = value;
    }

    /**
     * 获取promoCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getPromoCode() {
        return promoCode;
    }

    /**
     * 设置promoCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setPromoCode(SearchMultiSelectField value) {
        this.promoCode = value;
    }

    /**
     * 获取purchaseOrder属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getPurchaseOrder() {
        return purchaseOrder;
    }

    /**
     * 设置purchaseOrder属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setPurchaseOrder(SearchMultiSelectField value) {
        this.purchaseOrder = value;
    }

    /**
     * 获取quantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getQuantity() {
        return quantity;
    }

    /**
     * 设置quantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setQuantity(SearchDoubleField value) {
        this.quantity = value;
    }

    /**
     * 获取quantityBilled属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getQuantityBilled() {
        return quantityBilled;
    }

    /**
     * 设置quantityBilled属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setQuantityBilled(SearchDoubleField value) {
        this.quantityBilled = value;
    }

    /**
     * 获取quantityCommitted属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getQuantityCommitted() {
        return quantityCommitted;
    }

    /**
     * 设置quantityCommitted属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setQuantityCommitted(SearchDoubleField value) {
        this.quantityCommitted = value;
    }

    /**
     * 获取quantityPacked属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getQuantityPacked() {
        return quantityPacked;
    }

    /**
     * 设置quantityPacked属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setQuantityPacked(SearchDoubleField value) {
        this.quantityPacked = value;
    }

    /**
     * 获取quantityPicked属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getQuantityPicked() {
        return quantityPicked;
    }

    /**
     * 设置quantityPicked属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setQuantityPicked(SearchDoubleField value) {
        this.quantityPicked = value;
    }

    /**
     * 获取quantityRevCommitted属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getQuantityRevCommitted() {
        return quantityRevCommitted;
    }

    /**
     * 设置quantityRevCommitted属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setQuantityRevCommitted(SearchDoubleField value) {
        this.quantityRevCommitted = value;
    }

    /**
     * 获取quantityShipRecv属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getQuantityShipRecv() {
        return quantityShipRecv;
    }

    /**
     * 设置quantityShipRecv属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setQuantityShipRecv(SearchDoubleField value) {
        this.quantityShipRecv = value;
    }

    /**
     * 获取recognizedRevenue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getRecognizedRevenue() {
        return recognizedRevenue;
    }

    /**
     * 设置recognizedRevenue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setRecognizedRevenue(SearchDoubleField value) {
        this.recognizedRevenue = value;
    }

    /**
     * 获取recordType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getRecordType() {
        return recordType;
    }

    /**
     * 设置recordType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setRecordType(SearchStringField value) {
        this.recordType = value;
    }

    /**
     * 获取recurAnnuallyTotal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getRecurAnnuallyTotal() {
        return recurAnnuallyTotal;
    }

    /**
     * 设置recurAnnuallyTotal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setRecurAnnuallyTotal(SearchDoubleField value) {
        this.recurAnnuallyTotal = value;
    }

    /**
     * 获取recurMonthlyTotal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getRecurMonthlyTotal() {
        return recurMonthlyTotal;
    }

    /**
     * 设置recurMonthlyTotal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setRecurMonthlyTotal(SearchDoubleField value) {
        this.recurMonthlyTotal = value;
    }

    /**
     * 获取recurQuarterlyTotal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getRecurQuarterlyTotal() {
        return recurQuarterlyTotal;
    }

    /**
     * 设置recurQuarterlyTotal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setRecurQuarterlyTotal(SearchDoubleField value) {
        this.recurQuarterlyTotal = value;
    }

    /**
     * 获取recurringBill属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getRecurringBill() {
        return recurringBill;
    }

    /**
     * 设置recurringBill属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setRecurringBill(SearchBooleanField value) {
        this.recurringBill = value;
    }

    /**
     * 获取recurWeeklyTotal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getRecurWeeklyTotal() {
        return recurWeeklyTotal;
    }

    /**
     * 设置recurWeeklyTotal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setRecurWeeklyTotal(SearchDoubleField value) {
        this.recurWeeklyTotal = value;
    }

    /**
     * 获取refNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getRefNumber() {
        return refNumber;
    }

    /**
     * 设置refNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setRefNumber(SearchLongField value) {
        this.refNumber = value;
    }

    /**
     * 获取revCommitStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getRevCommitStatus() {
        return revCommitStatus;
    }

    /**
     * 设置revCommitStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setRevCommitStatus(SearchEnumMultiSelectField value) {
        this.revCommitStatus = value;
    }

    /**
     * 获取revCommittingStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getRevCommittingStatus() {
        return revCommittingStatus;
    }

    /**
     * 设置revCommittingStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setRevCommittingStatus(SearchBooleanField value) {
        this.revCommittingStatus = value;
    }

    /**
     * 获取revCommittingTransaction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getRevCommittingTransaction() {
        return revCommittingTransaction;
    }

    /**
     * 设置revCommittingTransaction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setRevCommittingTransaction(SearchMultiSelectField value) {
        this.revCommittingTransaction = value;
    }

    /**
     * 获取revenueStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getRevenueStatus() {
        return revenueStatus;
    }

    /**
     * 设置revenueStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setRevenueStatus(SearchEnumMultiSelectField value) {
        this.revenueStatus = value;
    }

    /**
     * 获取reversalDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getReversalDate() {
        return reversalDate;
    }

    /**
     * 设置reversalDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setReversalDate(SearchDateField value) {
        this.reversalDate = value;
    }

    /**
     * 获取reversalNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getReversalNumber() {
        return reversalNumber;
    }

    /**
     * 设置reversalNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setReversalNumber(SearchStringField value) {
        this.reversalNumber = value;
    }

    /**
     * 获取revRecEndDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getRevRecEndDate() {
        return revRecEndDate;
    }

    /**
     * 设置revRecEndDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setRevRecEndDate(SearchDateField value) {
        this.revRecEndDate = value;
    }

    /**
     * 获取revRecOnRevCommitment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getRevRecOnRevCommitment() {
        return revRecOnRevCommitment;
    }

    /**
     * 设置revRecOnRevCommitment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setRevRecOnRevCommitment(SearchBooleanField value) {
        this.revRecOnRevCommitment = value;
    }

    /**
     * 获取revRecStartDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getRevRecStartDate() {
        return revRecStartDate;
    }

    /**
     * 设置revRecStartDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setRevRecStartDate(SearchDateField value) {
        this.revRecStartDate = value;
    }

    /**
     * 获取revRecTermInMonths属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getRevRecTermInMonths() {
        return revRecTermInMonths;
    }

    /**
     * 设置revRecTermInMonths属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setRevRecTermInMonths(SearchLongField value) {
        this.revRecTermInMonths = value;
    }

    /**
     * 获取salesEffectiveDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getSalesEffectiveDate() {
        return salesEffectiveDate;
    }

    /**
     * 设置salesEffectiveDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setSalesEffectiveDate(SearchDateField value) {
        this.salesEffectiveDate = value;
    }

    /**
     * 获取salesOrder属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getSalesOrder() {
        return salesOrder;
    }

    /**
     * 设置salesOrder属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setSalesOrder(SearchMultiSelectField value) {
        this.salesOrder = value;
    }

    /**
     * 获取salesRep属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getSalesRep() {
        return salesRep;
    }

    /**
     * 设置salesRep属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setSalesRep(SearchMultiSelectField value) {
        this.salesRep = value;
    }

    /**
     * 获取salesTeamMember属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getSalesTeamMember() {
        return salesTeamMember;
    }

    /**
     * 设置salesTeamMember属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setSalesTeamMember(SearchMultiSelectField value) {
        this.salesTeamMember = value;
    }

    /**
     * 获取salesTeamRole属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getSalesTeamRole() {
        return salesTeamRole;
    }

    /**
     * 设置salesTeamRole属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setSalesTeamRole(SearchMultiSelectField value) {
        this.salesTeamRole = value;
    }

    /**
     * 获取schedulingMethod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getSchedulingMethod() {
        return schedulingMethod;
    }

    /**
     * 设置schedulingMethod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setSchedulingMethod(SearchEnumMultiSelectField value) {
        this.schedulingMethod = value;
    }

    /**
     * 获取serialNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getSerialNumber() {
        return serialNumber;
    }

    /**
     * 设置serialNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setSerialNumber(SearchStringField value) {
        this.serialNumber = value;
    }

    /**
     * 获取serialNumberCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getSerialNumberCost() {
        return serialNumberCost;
    }

    /**
     * 设置serialNumberCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setSerialNumberCost(SearchDoubleField value) {
        this.serialNumberCost = value;
    }

    /**
     * 获取serialNumberCostAdjustment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getSerialNumberCostAdjustment() {
        return serialNumberCostAdjustment;
    }

    /**
     * 设置serialNumberCostAdjustment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setSerialNumberCostAdjustment(SearchDoubleField value) {
        this.serialNumberCostAdjustment = value;
    }

    /**
     * 获取serialNumberQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getSerialNumberQuantity() {
        return serialNumberQuantity;
    }

    /**
     * 设置serialNumberQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setSerialNumberQuantity(SearchDoubleField value) {
        this.serialNumberQuantity = value;
    }

    /**
     * 获取serialNumbers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getSerialNumbers() {
        return serialNumbers;
    }

    /**
     * 设置serialNumbers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setSerialNumbers(SearchStringField value) {
        this.serialNumbers = value;
    }

    /**
     * 获取shipAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getShipAddress() {
        return shipAddress;
    }

    /**
     * 设置shipAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setShipAddress(SearchStringField value) {
        this.shipAddress = value;
    }

    /**
     * 获取shipAddressee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getShipAddressee() {
        return shipAddressee;
    }

    /**
     * 设置shipAddressee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setShipAddressee(SearchStringField value) {
        this.shipAddressee = value;
    }

    /**
     * 获取shipAttention属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getShipAttention() {
        return shipAttention;
    }

    /**
     * 设置shipAttention属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setShipAttention(SearchStringField value) {
        this.shipAttention = value;
    }

    /**
     * 获取shipCarrier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getShipCarrier() {
        return shipCarrier;
    }

    /**
     * 设置shipCarrier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setShipCarrier(SearchEnumMultiSelectField value) {
        this.shipCarrier = value;
    }

    /**
     * 获取shipCity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getShipCity() {
        return shipCity;
    }

    /**
     * 设置shipCity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setShipCity(SearchStringField value) {
        this.shipCity = value;
    }

    /**
     * 获取shipComplete属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getShipComplete() {
        return shipComplete;
    }

    /**
     * 设置shipComplete属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setShipComplete(SearchBooleanField value) {
        this.shipComplete = value;
    }

    /**
     * 获取shipCountry属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getShipCountry() {
        return shipCountry;
    }

    /**
     * 设置shipCountry属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setShipCountry(SearchEnumMultiSelectField value) {
        this.shipCountry = value;
    }

    /**
     * 获取shipCounty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getShipCounty() {
        return shipCounty;
    }

    /**
     * 设置shipCounty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setShipCounty(SearchStringField value) {
        this.shipCounty = value;
    }

    /**
     * 获取shipDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getShipDate() {
        return shipDate;
    }

    /**
     * 设置shipDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setShipDate(SearchDateField value) {
        this.shipDate = value;
    }

    /**
     * 获取shipGroup属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getShipGroup() {
        return shipGroup;
    }

    /**
     * 设置shipGroup属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setShipGroup(SearchLongField value) {
        this.shipGroup = value;
    }

    /**
     * 获取shipMethod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getShipMethod() {
        return shipMethod;
    }

    /**
     * 设置shipMethod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setShipMethod(SearchMultiSelectField value) {
        this.shipMethod = value;
    }

    /**
     * 获取shipPhone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getShipPhone() {
        return shipPhone;
    }

    /**
     * 设置shipPhone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setShipPhone(SearchStringField value) {
        this.shipPhone = value;
    }

    /**
     * 获取shipping属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getShipping() {
        return shipping;
    }

    /**
     * 设置shipping属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setShipping(SearchBooleanField value) {
        this.shipping = value;
    }

    /**
     * 获取shipRecvStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getShipRecvStatus() {
        return shipRecvStatus;
    }

    /**
     * 设置shipRecvStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setShipRecvStatus(SearchBooleanField value) {
        this.shipRecvStatus = value;
    }

    /**
     * 获取shipRecvStatusLine属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getShipRecvStatusLine() {
        return shipRecvStatusLine;
    }

    /**
     * 设置shipRecvStatusLine属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setShipRecvStatusLine(SearchBooleanField value) {
        this.shipRecvStatusLine = value;
    }

    /**
     * 获取shipState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getShipState() {
        return shipState;
    }

    /**
     * 设置shipState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setShipState(SearchMultiSelectField value) {
        this.shipState = value;
    }

    /**
     * 获取shipTo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getShipTo() {
        return shipTo;
    }

    /**
     * 设置shipTo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setShipTo(SearchMultiSelectField value) {
        this.shipTo = value;
    }

    /**
     * 获取shipZip属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getShipZip() {
        return shipZip;
    }

    /**
     * 设置shipZip属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setShipZip(SearchStringField value) {
        this.shipZip = value;
    }

    /**
     * 获取source属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getSource() {
        return source;
    }

    /**
     * 设置source属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setSource(SearchEnumMultiSelectField value) {
        this.source = value;
    }

    /**
     * 获取startDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getStartDate() {
        return startDate;
    }

    /**
     * 设置startDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setStartDate(SearchDateField value) {
        this.startDate = value;
    }

    /**
     * 获取statistical属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getStatistical() {
        return statistical;
    }

    /**
     * 设置statistical属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setStatistical(SearchBooleanField value) {
        this.statistical = value;
    }

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setStatus(SearchEnumMultiSelectField value) {
        this.status = value;
    }

    /**
     * 获取subscription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getSubscription() {
        return subscription;
    }

    /**
     * 设置subscription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setSubscription(SearchMultiSelectField value) {
        this.subscription = value;
    }

    /**
     * 获取subscriptionLine属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getSubscriptionLine() {
        return subscriptionLine;
    }

    /**
     * 设置subscriptionLine属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setSubscriptionLine(SearchMultiSelectField value) {
        this.subscriptionLine = value;
    }

    /**
     * 获取subsidiary属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getSubsidiary() {
        return subsidiary;
    }

    /**
     * 设置subsidiary属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setSubsidiary(SearchMultiSelectField value) {
        this.subsidiary = value;
    }

    /**
     * 获取taxItem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getTaxItem() {
        return taxItem;
    }

    /**
     * 设置taxItem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setTaxItem(SearchMultiSelectField value) {
        this.taxItem = value;
    }

    /**
     * 获取taxLine属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getTaxLine() {
        return taxLine;
    }

    /**
     * 设置taxLine属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setTaxLine(SearchBooleanField value) {
        this.taxLine = value;
    }

    /**
     * 获取taxPeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getTaxPeriod() {
        return taxPeriod;
    }

    /**
     * 设置taxPeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setTaxPeriod(RecordRef value) {
        this.taxPeriod = value;
    }

    /**
     * 获取taxPeriodRelative属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PostingPeriodDate }
     *     
     */
    public PostingPeriodDate getTaxPeriodRelative() {
        return taxPeriodRelative;
    }

    /**
     * 设置taxPeriodRelative属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PostingPeriodDate }
     *     
     */
    public void setTaxPeriodRelative(PostingPeriodDate value) {
        this.taxPeriodRelative = value;
    }

    /**
     * 获取taxRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getTaxRate() {
        return taxRate;
    }

    /**
     * 设置taxRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setTaxRate(SearchDoubleField value) {
        this.taxRate = value;
    }

    /**
     * 获取terms属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getTerms() {
        return terms;
    }

    /**
     * 设置terms属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setTerms(SearchMultiSelectField value) {
        this.terms = value;
    }

    /**
     * 获取termsOfSale属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getTermsOfSale() {
        return termsOfSale;
    }

    /**
     * 设置termsOfSale属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setTermsOfSale(SearchEnumMultiSelectField value) {
        this.termsOfSale = value;
    }

    /**
     * 获取title属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getTitle() {
        return title;
    }

    /**
     * 设置title属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setTitle(SearchStringField value) {
        this.title = value;
    }

    /**
     * 获取toBeEmailed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getToBeEmailed() {
        return toBeEmailed;
    }

    /**
     * 设置toBeEmailed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setToBeEmailed(SearchBooleanField value) {
        this.toBeEmailed = value;
    }

    /**
     * 获取toBePrinted属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getToBePrinted() {
        return toBePrinted;
    }

    /**
     * 设置toBePrinted属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setToBePrinted(SearchBooleanField value) {
        this.toBePrinted = value;
    }

    /**
     * 获取toSubsidiary属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getToSubsidiary() {
        return toSubsidiary;
    }

    /**
     * 设置toSubsidiary属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setToSubsidiary(SearchMultiSelectField value) {
        this.toSubsidiary = value;
    }

    /**
     * 获取totalAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getTotalAmount() {
        return totalAmount;
    }

    /**
     * 设置totalAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setTotalAmount(SearchDoubleField value) {
        this.totalAmount = value;
    }

    /**
     * 获取trackingNumbers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getTrackingNumbers() {
        return trackingNumbers;
    }

    /**
     * 设置trackingNumbers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setTrackingNumbers(SearchStringField value) {
        this.trackingNumbers = value;
    }

    /**
     * 获取tranCostEstimate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getTranCostEstimate() {
        return tranCostEstimate;
    }

    /**
     * 设置tranCostEstimate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setTranCostEstimate(SearchDoubleField value) {
        this.tranCostEstimate = value;
    }

    /**
     * 获取tranDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getTranDate() {
        return tranDate;
    }

    /**
     * 设置tranDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setTranDate(SearchDateField value) {
        this.tranDate = value;
    }

    /**
     * 获取tranEstGrossProfit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getTranEstGrossProfit() {
        return tranEstGrossProfit;
    }

    /**
     * 设置tranEstGrossProfit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setTranEstGrossProfit(SearchDoubleField value) {
        this.tranEstGrossProfit = value;
    }

    /**
     * 获取tranEstGrossProfitPct属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getTranEstGrossProfitPct() {
        return tranEstGrossProfitPct;
    }

    /**
     * 设置tranEstGrossProfitPct属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setTranEstGrossProfitPct(SearchDoubleField value) {
        this.tranEstGrossProfitPct = value;
    }

    /**
     * 获取tranFxEstGrossProfit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getTranFxEstGrossProfit() {
        return tranFxEstGrossProfit;
    }

    /**
     * 设置tranFxEstGrossProfit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setTranFxEstGrossProfit(SearchDoubleField value) {
        this.tranFxEstGrossProfit = value;
    }

    /**
     * 获取tranId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getTranId() {
        return tranId;
    }

    /**
     * 设置tranId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setTranId(SearchStringField value) {
        this.tranId = value;
    }

    /**
     * 获取tranIsVsoeBundle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getTranIsVsoeBundle() {
        return tranIsVsoeBundle;
    }

    /**
     * 设置tranIsVsoeBundle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setTranIsVsoeBundle(SearchBooleanField value) {
        this.tranIsVsoeBundle = value;
    }

    /**
     * 获取transactionDiscount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getTransactionDiscount() {
        return transactionDiscount;
    }

    /**
     * 设置transactionDiscount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setTransactionDiscount(SearchBooleanField value) {
        this.transactionDiscount = value;
    }

    /**
     * 获取transactionLineType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getTransactionLineType() {
        return transactionLineType;
    }

    /**
     * 设置transactionLineType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setTransactionLineType(SearchEnumMultiSelectField value) {
        this.transactionLineType = value;
    }

    /**
     * 获取transactionNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getTransactionNumber() {
        return transactionNumber;
    }

    /**
     * 设置transactionNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setTransactionNumber(SearchStringField value) {
        this.transactionNumber = value;
    }

    /**
     * 获取transferLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getTransferLocation() {
        return transferLocation;
    }

    /**
     * 设置transferLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setTransferLocation(SearchMultiSelectField value) {
        this.transferLocation = value;
    }

    /**
     * 获取transferOrderQuantityCommitted属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getTransferOrderQuantityCommitted() {
        return transferOrderQuantityCommitted;
    }

    /**
     * 设置transferOrderQuantityCommitted属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setTransferOrderQuantityCommitted(SearchDoubleField value) {
        this.transferOrderQuantityCommitted = value;
    }

    /**
     * 获取transferOrderQuantityPacked属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getTransferOrderQuantityPacked() {
        return transferOrderQuantityPacked;
    }

    /**
     * 设置transferOrderQuantityPacked属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setTransferOrderQuantityPacked(SearchDoubleField value) {
        this.transferOrderQuantityPacked = value;
    }

    /**
     * 获取transferOrderQuantityPicked属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getTransferOrderQuantityPicked() {
        return transferOrderQuantityPicked;
    }

    /**
     * 设置transferOrderQuantityPicked属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setTransferOrderQuantityPicked(SearchDoubleField value) {
        this.transferOrderQuantityPicked = value;
    }

    /**
     * 获取transferOrderQuantityReceived属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getTransferOrderQuantityReceived() {
        return transferOrderQuantityReceived;
    }

    /**
     * 设置transferOrderQuantityReceived属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setTransferOrderQuantityReceived(SearchDoubleField value) {
        this.transferOrderQuantityReceived = value;
    }

    /**
     * 获取transferOrderQuantityShipped属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getTransferOrderQuantityShipped() {
        return transferOrderQuantityShipped;
    }

    /**
     * 设置transferOrderQuantityShipped属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setTransferOrderQuantityShipped(SearchDoubleField value) {
        this.transferOrderQuantityShipped = value;
    }

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setType(SearchEnumMultiSelectField value) {
        this.type = value;
    }

    /**
     * 获取unit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getUnit() {
        return unit;
    }

    /**
     * 设置unit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setUnit(SearchMultiSelectField value) {
        this.unit = value;
    }

    /**
     * 获取unitCostOverride属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getUnitCostOverride() {
        return unitCostOverride;
    }

    /**
     * 设置unitCostOverride属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setUnitCostOverride(SearchDoubleField value) {
        this.unitCostOverride = value;
    }

    /**
     * 获取unitsType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getUnitsType() {
        return unitsType;
    }

    /**
     * 设置unitsType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setUnitsType(SearchMultiSelectField value) {
        this.unitsType = value;
    }

    /**
     * 获取vendType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getVendType() {
        return vendType;
    }

    /**
     * 设置vendType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setVendType(SearchMultiSelectField value) {
        this.vendType = value;
    }

    /**
     * 获取visibleToCustomer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getVisibleToCustomer() {
        return visibleToCustomer;
    }

    /**
     * 设置visibleToCustomer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setVisibleToCustomer(SearchBooleanField value) {
        this.visibleToCustomer = value;
    }

    /**
     * 获取voided属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getVoided() {
        return voided;
    }

    /**
     * 设置voided属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setVoided(SearchBooleanField value) {
        this.voided = value;
    }

    /**
     * 获取vsoeAllocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getVsoeAllocation() {
        return vsoeAllocation;
    }

    /**
     * 设置vsoeAllocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setVsoeAllocation(SearchDoubleField value) {
        this.vsoeAllocation = value;
    }

    /**
     * 获取vsoeAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getVsoeAmount() {
        return vsoeAmount;
    }

    /**
     * 设置vsoeAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setVsoeAmount(SearchDoubleField value) {
        this.vsoeAmount = value;
    }

    /**
     * 获取vsoeDeferral属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getVsoeDeferral() {
        return vsoeDeferral;
    }

    /**
     * 设置vsoeDeferral属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setVsoeDeferral(SearchEnumMultiSelectField value) {
        this.vsoeDeferral = value;
    }

    /**
     * 获取vsoeDelivered属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getVsoeDelivered() {
        return vsoeDelivered;
    }

    /**
     * 设置vsoeDelivered属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setVsoeDelivered(SearchBooleanField value) {
        this.vsoeDelivered = value;
    }

    /**
     * 获取vsoePermitDiscount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getVsoePermitDiscount() {
        return vsoePermitDiscount;
    }

    /**
     * 设置vsoePermitDiscount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setVsoePermitDiscount(SearchEnumMultiSelectField value) {
        this.vsoePermitDiscount = value;
    }

    /**
     * 获取vsoePrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getVsoePrice() {
        return vsoePrice;
    }

    /**
     * 设置vsoePrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setVsoePrice(SearchDoubleField value) {
        this.vsoePrice = value;
    }

    /**
     * 获取webSite属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getWebSite() {
        return webSite;
    }

    /**
     * 设置webSite属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setWebSite(SearchMultiSelectField value) {
        this.webSite = value;
    }

    /**
     * 获取customFieldList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchCustomFieldList }
     *     
     */
    public SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }

    /**
     * 设置customFieldList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCustomFieldList }
     *     
     */
    public void setCustomFieldList(SearchCustomFieldList value) {
        this.customFieldList = value;
    }

}
