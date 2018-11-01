
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
 * <p>TransactionSearchBasic complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡaccount���Ե�ֵ��
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
     * ����account���Ե�ֵ��
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
     * ��ȡaccountType���Ե�ֵ��
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
     * ����accountType���Ե�ֵ��
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
     * ��ȡactualShipDate���Ե�ֵ��
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
     * ����actualShipDate���Ե�ֵ��
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
     * ��ȡaltSalesAmount���Ե�ֵ��
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
     * ����altSalesAmount���Ե�ֵ��
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
     * ��ȡaltSalesNetAmount���Ե�ֵ��
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
     * ����altSalesNetAmount���Ե�ֵ��
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
     * ��ȡamount���Ե�ֵ��
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
     * ����amount���Ե�ֵ��
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
     * ��ȡamountPaid���Ե�ֵ��
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
     * ����amountPaid���Ե�ֵ��
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
     * ��ȡamountRemaining���Ե�ֵ��
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
     * ����amountRemaining���Ե�ֵ��
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
     * ��ȡamountUnbilled���Ե�ֵ��
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
     * ����amountUnbilled���Ե�ֵ��
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
     * ��ȡanyLineItem���Ե�ֵ��
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
     * ����anyLineItem���Ե�ֵ��
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
     * ��ȡappliedToForeignAmount���Ե�ֵ��
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
     * ����appliedToForeignAmount���Ե�ֵ��
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
     * ��ȡappliedToIsFxVariance���Ե�ֵ��
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
     * ����appliedToIsFxVariance���Ե�ֵ��
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
     * ��ȡappliedToLinkAmount���Ե�ֵ��
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
     * ����appliedToLinkAmount���Ե�ֵ��
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
     * ��ȡappliedToLinkType���Ե�ֵ��
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
     * ����appliedToLinkType���Ե�ֵ��
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
     * ��ȡappliedToTransaction���Ե�ֵ��
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
     * ����appliedToTransaction���Ե�ֵ��
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
     * ��ȡapplyingForeignAmount���Ե�ֵ��
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
     * ����applyingForeignAmount���Ե�ֵ��
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
     * ��ȡapplyingIsFxVariance���Ե�ֵ��
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
     * ����applyingIsFxVariance���Ե�ֵ��
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
     * ��ȡapplyingLinkAmount���Ե�ֵ��
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
     * ����applyingLinkAmount���Ե�ֵ��
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
     * ��ȡapplyingLinkType���Ե�ֵ��
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
     * ����applyingLinkType���Ե�ֵ��
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
     * ��ȡapplyingTransaction���Ե�ֵ��
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
     * ����applyingTransaction���Ե�ֵ��
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
     * ��ȡapprovalStatus���Ե�ֵ��
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
     * ����approvalStatus���Ե�ֵ��
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
     * ��ȡauthCode���Ե�ֵ��
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
     * ����authCode���Ե�ֵ��
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
     * ��ȡautoCalculateLag���Ե�ֵ��
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
     * ����autoCalculateLag���Ե�ֵ��
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
     * ��ȡavsStreetMatch���Ե�ֵ��
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
     * ����avsStreetMatch���Ե�ֵ��
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
     * ��ȡavsZipMatch���Ե�ֵ��
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
     * ����avsZipMatch���Ե�ֵ��
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
     * ��ȡbillable���Ե�ֵ��
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
     * ����billable���Ե�ֵ��
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
     * ��ȡbillAddress���Ե�ֵ��
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
     * ����billAddress���Ե�ֵ��
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
     * ��ȡbillAddressee���Ե�ֵ��
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
     * ����billAddressee���Ե�ֵ��
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
     * ��ȡbillAttention���Ե�ֵ��
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
     * ����billAttention���Ե�ֵ��
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
     * ��ȡbillCity���Ե�ֵ��
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
     * ����billCity���Ե�ֵ��
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
     * ��ȡbillCountry���Ե�ֵ��
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
     * ����billCountry���Ե�ֵ��
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
     * ��ȡbillCounty���Ե�ֵ��
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
     * ����billCounty���Ե�ֵ��
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
     * ��ȡbilledDate���Ե�ֵ��
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
     * ����billedDate���Ե�ֵ��
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
     * ��ȡbillingAccount���Ե�ֵ��
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
     * ����billingAccount���Ե�ֵ��
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
     * ��ȡbillingSchedule���Ե�ֵ��
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
     * ����billingSchedule���Ե�ֵ��
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
     * ��ȡbillingStatus���Ե�ֵ��
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
     * ����billingStatus���Ե�ֵ��
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
     * ��ȡbillingTransaction���Ե�ֵ��
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
     * ����billingTransaction���Ե�ֵ��
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
     * ��ȡbillPhone���Ե�ֵ��
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
     * ����billPhone���Ե�ֵ��
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
     * ��ȡbillState���Ե�ֵ��
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
     * ����billState���Ե�ֵ��
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
     * ��ȡbillVarianceStatus���Ե�ֵ��
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
     * ����billVarianceStatus���Ե�ֵ��
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
     * ��ȡbillZip���Ե�ֵ��
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
     * ����billZip���Ե�ֵ��
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
     * ��ȡbinNumber���Ե�ֵ��
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
     * ����binNumber���Ե�ֵ��
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
     * ��ȡbinNumberQuantity���Ե�ֵ��
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
     * ����binNumberQuantity���Ե�ֵ��
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
     * ��ȡbomQuantity���Ե�ֵ��
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
     * ����bomQuantity���Ե�ֵ��
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
     * ��ȡbookSpecificTransaction���Ե�ֵ��
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
     * ����bookSpecificTransaction���Ե�ֵ��
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
     * ��ȡbuildEntireAssembly���Ե�ֵ��
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
     * ����buildEntireAssembly���Ե�ֵ��
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
     * ��ȡbuildVariance���Ե�ֵ��
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
     * ����buildVariance���Ե�ֵ��
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
     * ��ȡbuilt���Ե�ֵ��
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
     * ����built���Ե�ֵ��
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
     * ��ȡcanHaveStackablePromotions���Ե�ֵ��
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
     * ����canHaveStackablePromotions���Ե�ֵ��
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
     * ��ȡcatchUpPeriod���Ե�ֵ��
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
     * ����catchUpPeriod���Ե�ֵ��
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
     * ��ȡccCustomerCode���Ե�ֵ��
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
     * ����ccCustomerCode���Ե�ֵ��
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
     * ��ȡccExpireDate���Ե�ֵ��
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
     * ����ccExpireDate���Ե�ֵ��
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
     * ��ȡccName���Ե�ֵ��
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
     * ����ccName���Ե�ֵ��
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
     * ��ȡccNumber���Ե�ֵ��
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
     * ����ccNumber���Ե�ֵ��
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
     * ��ȡchargeType���Ե�ֵ��
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
     * ����chargeType���Ե�ֵ��
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
     * ��ȡclazz���Ե�ֵ��
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
     * ����clazz���Ե�ֵ��
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
     * ��ȡcleared���Ե�ֵ��
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
     * ����cleared���Ե�ֵ��
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
     * ��ȡclosed���Ե�ֵ��
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
     * ����closed���Ե�ֵ��
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
     * ��ȡcloseDate���Ե�ֵ��
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
     * ����closeDate���Ե�ֵ��
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
     * ��ȡcogs���Ե�ֵ��
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
     * ����cogs���Ե�ֵ��
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
     * ��ȡcommissionEffectiveDate���Ե�ֵ��
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
     * ����commissionEffectiveDate���Ե�ֵ��
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
     * ��ȡcommit���Ե�ֵ��
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
     * ����commit���Ե�ֵ��
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
     * ��ȡcomponentYield���Ե�ֵ��
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
     * ����componentYield���Ե�ֵ��
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
     * ��ȡconfirmationNumber���Ե�ֵ��
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
     * ����confirmationNumber���Ե�ֵ��
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
     * ��ȡcontribution���Ե�ֵ��
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
     * ����contribution���Ե�ֵ��
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
     * ��ȡcostComponentAmount���Ե�ֵ��
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
     * ����costComponentAmount���Ե�ֵ��
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
     * ��ȡcostComponentCategory���Ե�ֵ��
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
     * ����costComponentCategory���Ե�ֵ��
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
     * ��ȡcostComponentItem���Ե�ֵ��
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
     * ����costComponentItem���Ե�ֵ��
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
     * ��ȡcostComponentQuantity���Ե�ֵ��
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
     * ����costComponentQuantity���Ե�ֵ��
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
     * ��ȡcostComponentStandardCost���Ե�ֵ��
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
     * ����costComponentStandardCost���Ե�ֵ��
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
     * ��ȡcostEstimate���Ե�ֵ��
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
     * ����costEstimate���Ե�ֵ��
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
     * ��ȡcostEstimateRate���Ե�ֵ��
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
     * ����costEstimateRate���Ե�ֵ��
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
     * ��ȡcostEstimateType���Ե�ֵ��
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
     * ����costEstimateType���Ե�ֵ��
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
     * ��ȡcreatedBy���Ե�ֵ��
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
     * ����createdBy���Ե�ֵ��
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
     * ��ȡcreatedFrom���Ե�ֵ��
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
     * ����createdFrom���Ե�ֵ��
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
     * ��ȡcreditAmount���Ե�ֵ��
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
     * ����creditAmount���Ե�ֵ��
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
     * ��ȡcscMatch���Ե�ֵ��
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
     * ����cscMatch���Ե�ֵ��
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
     * ��ȡcurrency���Ե�ֵ��
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
     * ����currency���Ե�ֵ��
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
     * ��ȡcustomerSubOf���Ե�ֵ��
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
     * ����customerSubOf���Ե�ֵ��
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
     * ��ȡcustomForm���Ե�ֵ��
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
     * ����customForm���Ե�ֵ��
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
     * ��ȡcustomGL���Ե�ֵ��
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
     * ����customGL���Ե�ֵ��
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
     * ��ȡcustType���Ե�ֵ��
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
     * ����custType���Ե�ֵ��
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
     * ��ȡdateCreated���Ե�ֵ��
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
     * ����dateCreated���Ե�ֵ��
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
     * ��ȡdaysOpen���Ե�ֵ��
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
     * ����daysOpen���Ե�ֵ��
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
     * ��ȡdaysOverdue���Ե�ֵ��
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
     * ����daysOverdue���Ե�ֵ��
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
     * ��ȡdebitAmount���Ե�ֵ��
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
     * ����debitAmount���Ե�ֵ��
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
     * ��ȡdeferredRevenue���Ե�ֵ��
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
     * ����deferredRevenue���Ե�ֵ��
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
     * ��ȡdeferRevRec���Ե�ֵ��
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
     * ����deferRevRec���Ե�ֵ��
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
     * ��ȡdepartment���Ե�ֵ��
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
     * ����department���Ե�ֵ��
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
     * ��ȡdepositDate���Ե�ֵ��
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
     * ����depositDate���Ե�ֵ��
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
     * ��ȡdepositTransaction���Ե�ֵ��
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
     * ����depositTransaction���Ե�ֵ��
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
     * ��ȡdrAccount���Ե�ֵ��
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
     * ����drAccount���Ե�ֵ��
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
     * ��ȡdueDate���Ե�ֵ��
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
     * ����dueDate���Ե�ֵ��
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
     * ��ȡemail���Ե�ֵ��
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
     * ����email���Ե�ֵ��
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
     * ��ȡemployee���Ե�ֵ��
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
     * ����employee���Ե�ֵ��
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
     * ��ȡendDate���Ե�ֵ��
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
     * ����endDate���Ե�ֵ��
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
     * ��ȡentity���Ե�ֵ��
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
     * ����entity���Ե�ֵ��
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
     * ��ȡentityStatus���Ե�ֵ��
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
     * ����entityStatus���Ե�ֵ��
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
     * ��ȡestGrossProfit���Ե�ֵ��
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
     * ����estGrossProfit���Ե�ֵ��
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
     * ��ȡestGrossProfitPct���Ե�ֵ��
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
     * ����estGrossProfitPct���Ե�ֵ��
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
     * ��ȡexchangeRate���Ե�ֵ��
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
     * ����exchangeRate���Ե�ֵ��
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
     * ��ȡexcludeCommission���Ե�ֵ��
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
     * ����excludeCommission���Ե�ֵ��
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
     * ��ȡexcludeFromRateRequest���Ե�ֵ��
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
     * ����excludeFromRateRequest���Ե�ֵ��
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
     * ��ȡexpectedCloseDate���Ե�ֵ��
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
     * ����expectedCloseDate���Ե�ֵ��
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
     * ��ȡexpectedReceiptDate���Ե�ֵ��
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
     * ����expectedReceiptDate���Ե�ֵ��
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
     * ��ȡexpenseCategory���Ե�ֵ��
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
     * ����expenseCategory���Ե�ֵ��
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
     * ��ȡexpenseDate���Ե�ֵ��
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
     * ����expenseDate���Ե�ֵ��
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
     * ��ȡexternalId���Ե�ֵ��
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
     * ����externalId���Ե�ֵ��
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
     * ��ȡexternalIdString���Ե�ֵ��
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
     * ����externalIdString���Ե�ֵ��
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
     * ��ȡfinChrg���Ե�ֵ��
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
     * ����finChrg���Ե�ֵ��
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
     * ��ȡfirmed���Ե�ֵ��
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
     * ����firmed���Ե�ֵ��
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
     * ��ȡforecastType���Ե�ֵ��
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
     * ����forecastType���Ե�ֵ��
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
     * ��ȡfulfillingTransaction���Ե�ֵ��
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
     * ����fulfillingTransaction���Ե�ֵ��
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
     * ��ȡfxAccount���Ե�ֵ��
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
     * ����fxAccount���Ե�ֵ��
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
     * ��ȡfxAmount���Ե�ֵ��
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
     * ����fxAmount���Ե�ֵ��
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
     * ��ȡfxCostEstimate���Ե�ֵ��
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
     * ����fxCostEstimate���Ե�ֵ��
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
     * ��ȡfxCostEstimateRate���Ե�ֵ��
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
     * ����fxCostEstimateRate���Ե�ֵ��
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
     * ��ȡfxEstGrossProfit���Ե�ֵ��
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
     * ����fxEstGrossProfit���Ե�ֵ��
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
     * ��ȡfxTranCostEstimate���Ե�ֵ��
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
     * ����fxTranCostEstimate���Ե�ֵ��
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
     * ��ȡfxVsoeAllocation���Ե�ֵ��
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
     * ����fxVsoeAllocation���Ե�ֵ��
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
     * ��ȡfxVsoeAmount���Ե�ֵ��
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
     * ����fxVsoeAmount���Ե�ֵ��
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
     * ��ȡfxVsoePrice���Ե�ֵ��
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
     * ����fxVsoePrice���Ե�ֵ��
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
     * ��ȡgcoAvailabelToCharge���Ե�ֵ��
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
     * ����gcoAvailabelToCharge���Ե�ֵ��
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
     * ��ȡgcoAvailableToRefund���Ե�ֵ��
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
     * ����gcoAvailableToRefund���Ե�ֵ��
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
     * ��ȡgcoAvsStreetMatch���Ե�ֵ��
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
     * ����gcoAvsStreetMatch���Ե�ֵ��
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
     * ��ȡgcoAvsZipMatch���Ե�ֵ��
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
     * ����gcoAvsZipMatch���Ե�ֵ��
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
     * ��ȡgcoBuyerAccountAge���Ե�ֵ��
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
     * ����gcoBuyerAccountAge���Ե�ֵ��
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
     * ��ȡgcoBuyerIp���Ե�ֵ��
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
     * ����gcoBuyerIp���Ե�ֵ��
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
     * ��ȡgcoChargeAmount���Ե�ֵ��
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
     * ����gcoChargeAmount���Ե�ֵ��
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
     * ��ȡgcoChargebackAmount���Ե�ֵ��
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
     * ����gcoChargebackAmount���Ե�ֵ��
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
     * ��ȡgcoConfirmedChargedTotal���Ե�ֵ��
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
     * ����gcoConfirmedChargedTotal���Ե�ֵ��
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
     * ��ȡgcoConfirmedRefundedTotal���Ե�ֵ��
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
     * ����gcoConfirmedRefundedTotal���Ե�ֵ��
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
     * ��ȡgcoCreditcardNumber���Ե�ֵ��
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
     * ����gcoCreditcardNumber���Ե�ֵ��
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
     * ��ȡgcoCscMatch���Ե�ֵ��
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
     * ����gcoCscMatch���Ե�ֵ��
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
     * ��ȡgcoFinancialState���Ե�ֵ��
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
     * ����gcoFinancialState���Ե�ֵ��
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
     * ��ȡgcoFulfillmentState���Ե�ֵ��
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
     * ����gcoFulfillmentState���Ե�ֵ��
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
     * ��ȡgcoOrderId���Ե�ֵ��
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
     * ����gcoOrderId���Ե�ֵ��
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
     * ��ȡgcoOrderTotal���Ե�ֵ��
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
     * ����gcoOrderTotal���Ե�ֵ��
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
     * ��ȡgcoPromotionAmount���Ե�ֵ��
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
     * ����gcoPromotionAmount���Ե�ֵ��
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
     * ��ȡgcoPromotionName���Ե�ֵ��
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
     * ����gcoPromotionName���Ե�ֵ��
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
     * ��ȡgcoRefundAmount���Ե�ֵ��
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
     * ����gcoRefundAmount���Ե�ֵ��
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
     * ��ȡgcoShippingTotal���Ե�ֵ��
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
     * ����gcoShippingTotal���Ե�ֵ��
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
     * ��ȡgcoStateChangedDetail���Ե�ֵ��
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
     * ����gcoStateChangedDetail���Ե�ֵ��
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
     * ��ȡgiftCertificate���Ե�ֵ��
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
     * ����giftCertificate���Ե�ֵ��
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
     * ��ȡgrossAmount���Ե�ֵ��
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
     * ����grossAmount���Ե�ֵ��
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
     * ��ȡincludeInForecast���Ե�ֵ��
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
     * ����includeInForecast���Ե�ֵ��
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
     * ��ȡincoterm���Ե�ֵ��
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
     * ����incoterm���Ե�ֵ��
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
     * ��ȡintercoStatus���Ե�ֵ��
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
     * ����intercoStatus���Ե�ֵ��
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
     * ��ȡintercoTransaction���Ե�ֵ��
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
     * ����intercoTransaction���Ե�ֵ��
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
     * ��ȡinternalId���Ե�ֵ��
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
     * ����internalId���Ե�ֵ��
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
     * ��ȡinternalIdNumber���Ե�ֵ��
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
     * ����internalIdNumber���Ե�ֵ��
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
     * ��ȡinVsoeBundle���Ե�ֵ��
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
     * ����inVsoeBundle���Ե�ֵ��
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
     * ��ȡisAllocation���Ե�ֵ��
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
     * ����isAllocation���Ե�ֵ��
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
     * ��ȡisBackflush���Ե�ֵ��
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
     * ����isBackflush���Ե�ֵ��
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
     * ��ȡisGcoChargeback���Ե�ֵ��
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
     * ����isGcoChargeback���Ե�ֵ��
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
     * ��ȡisGcoChargeConfirmed���Ե�ֵ��
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
     * ����isGcoChargeConfirmed���Ե�ֵ��
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
     * ��ȡisGcoPaymentGuaranteed���Ե�ֵ��
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
     * ����isGcoPaymentGuaranteed���Ե�ֵ��
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
     * ��ȡisGcoRefundConfirmed���Ե�ֵ��
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
     * ����isGcoRefundConfirmed���Ե�ֵ��
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
     * ��ȡisInsideDelivery���Ե�ֵ��
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
     * ����isInsideDelivery���Ե�ֵ��
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
     * ��ȡisInsidePickup���Ե�ֵ��
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
     * ����isInsidePickup���Ե�ֵ��
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
     * ��ȡisIntercompanyAdjustment���Ե�ֵ��
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
     * ����isIntercompanyAdjustment���Ե�ֵ��
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
     * ��ȡisMultiShipTo���Ե�ֵ��
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
     * ����isMultiShipTo���Ե�ֵ��
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
     * ��ȡisPayPalMeth���Ե�ֵ��
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
     * ����isPayPalMeth���Ե�ֵ��
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
     * ��ȡisReversal���Ե�ֵ��
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
     * ����isReversal���Ե�ֵ��
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
     * ��ȡisRevRecTransaction���Ե�ֵ��
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
     * ����isRevRecTransaction���Ե�ֵ��
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
     * ��ȡisScrap���Ե�ֵ��
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
     * ����isScrap���Ե�ֵ��
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
     * ��ȡisShipAddress���Ե�ֵ��
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
     * ����isShipAddress���Ե�ֵ��
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
     * ��ȡisTransferPriceCosting���Ե�ֵ��
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
     * ����isTransferPriceCosting���Ե�ֵ��
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
     * ��ȡisVsoeAlloc���Ե�ֵ��
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
     * ����isVsoeAlloc���Ե�ֵ��
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
     * ��ȡisWip���Ե�ֵ��
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
     * ����isWip���Ե�ֵ��
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
     * ��ȡitem���Ե�ֵ��
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
     * ����item���Ե�ֵ��
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
     * ��ȡitemFulfillmentChoice���Ե�ֵ��
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
     * ����itemFulfillmentChoice���Ե�ֵ��
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
     * ��ȡitemRevision���Ե�ֵ��
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
     * ����itemRevision���Ե�ֵ��
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
     * ��ȡitemSubOf���Ե�ֵ��
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
     * ����itemSubOf���Ե�ֵ��
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
     * ��ȡlandedCostPerLine���Ե�ֵ��
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
     * ����landedCostPerLine���Ե�ֵ��
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
     * ��ȡlastModifiedDate���Ե�ֵ��
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
     * ����lastModifiedDate���Ե�ֵ��
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
     * ��ȡleadSource���Ե�ֵ��
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
     * ����leadSource���Ե�ֵ��
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
     * ��ȡlineUniqueKey���Ե�ֵ��
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
     * ����lineUniqueKey���Ե�ֵ��
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
     * ��ȡlocation���Ե�ֵ��
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
     * ����location���Ե�ֵ��
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
     * ��ȡlocationAutoAssigned���Ե�ֵ��
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
     * ����locationAutoAssigned���Ե�ֵ��
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
     * ��ȡmainLine���Ե�ֵ��
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
     * ����mainLine���Ե�ֵ��
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
     * ��ȡmainName���Ե�ֵ��
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
     * ����mainName���Ե�ֵ��
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
     * ��ȡmanufacturingRouting���Ե�ֵ��
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
     * ����manufacturingRouting���Ե�ֵ��
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
     * ��ȡmatchBillToReceipt���Ե�ֵ��
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
     * ����matchBillToReceipt���Ե�ֵ��
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
     * ��ȡmemo���Ե�ֵ��
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
     * ����memo���Ե�ֵ��
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
     * ��ȡmemoMain���Ե�ֵ��
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
     * ����memoMain���Ե�ֵ��
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
     * ��ȡmemorized���Ե�ֵ��
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
     * ����memorized���Ե�ֵ��
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
     * ��ȡmerchantAccount���Ե�ֵ��
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
     * ����merchantAccount���Ե�ֵ��
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
     * ��ȡmessage���Ե�ֵ��
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
     * ����message���Ե�ֵ��
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
     * ��ȡmultiSubsidiary���Ե�ֵ��
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
     * ����multiSubsidiary���Ե�ֵ��
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
     * ��ȡnameText���Ե�ֵ��
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
     * ����nameText���Ե�ֵ��
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
     * ��ȡnetAmount���Ե�ֵ��
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
     * ����netAmount���Ե�ֵ��
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
     * ��ȡnextApprover���Ե�ֵ��
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
     * ����nextApprover���Ե�ֵ��
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
     * ��ȡnextBillDate���Ե�ֵ��
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
     * ����nextBillDate���Ե�ֵ��
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
     * ��ȡnoAutoAssignLocation���Ե�ֵ��
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
     * ����noAutoAssignLocation���Ե�ֵ��
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
     * ��ȡnonReimbursable���Ե�ֵ��
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
     * ����nonReimbursable���Ե�ֵ��
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
     * ��ȡnumber���Ե�ֵ��
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
     * ����number���Ե�ֵ��
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
     * ��ȡoneTimeTotal���Ե�ֵ��
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
     * ����oneTimeTotal���Ե�ֵ��
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
     * ��ȡopportunity���Ե�ֵ��
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
     * ����opportunity���Ե�ֵ��
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
     * ��ȡorderPriority���Ե�ֵ��
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
     * ����orderPriority���Ե�ֵ��
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
     * ��ȡotherRefNum���Ե�ֵ��
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
     * ����otherRefNum���Ե�ֵ��
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
     * ��ȡotherRefNumNonDeposit���Ե�ֵ��
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
     * ����otherRefNumNonDeposit���Ե�ֵ��
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
     * ��ȡoverheadParentItem���Ե�ֵ��
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
     * ����overheadParentItem���Ե�ֵ��
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
     * ��ȡpackageCount���Ե�ֵ��
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
     * ����packageCount���Ե�ֵ��
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
     * ��ȡpaidTransaction���Ե�ֵ��
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
     * ����paidTransaction���Ե�ֵ��
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
     * ��ȡparent���Ե�ֵ��
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
     * ����parent���Ե�ֵ��
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
     * ��ȡpartner���Ե�ֵ��
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
     * ����partner���Ե�ֵ��
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
     * ��ȡpartnerContribution���Ե�ֵ��
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
     * ����partnerContribution���Ե�ֵ��
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
     * ��ȡpartnerRole���Ե�ֵ��
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
     * ����partnerRole���Ե�ֵ��
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
     * ��ȡpartnerTeamMember���Ե�ֵ��
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
     * ����partnerTeamMember���Ե�ֵ��
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
     * ��ȡpayingTransaction���Ե�ֵ��
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
     * ����payingTransaction���Ե�ֵ��
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
     * ��ȡpaymentApproved���Ե�ֵ��
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
     * ����paymentApproved���Ե�ֵ��
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
     * ��ȡpaymentEventDate���Ե�ֵ��
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
     * ����paymentEventDate���Ե�ֵ��
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
     * ��ȡpaymentEventHoldReason���Ե�ֵ��
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
     * ����paymentEventHoldReason���Ե�ֵ��
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
     * ��ȡpaymentEventPurchaseCardUsed���Ե�ֵ��
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
     * ����paymentEventPurchaseCardUsed���Ե�ֵ��
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
     * ��ȡpaymentEventPurchaseDataSent���Ե�ֵ��
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
     * ����paymentEventPurchaseDataSent���Ե�ֵ��
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
     * ��ȡpaymentEventResult���Ե�ֵ��
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
     * ����paymentEventResult���Ե�ֵ��
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
     * ��ȡpaymentEventType���Ե�ֵ��
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
     * ����paymentEventType���Ե�ֵ��
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
     * ��ȡpaymentHold���Ե�ֵ��
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
     * ����paymentHold���Ե�ֵ��
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
     * ��ȡpaymentMethod���Ե�ֵ��
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
     * ����paymentMethod���Ե�ֵ��
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
     * ��ȡpayPalPending���Ե�ֵ��
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
     * ����payPalPending���Ե�ֵ��
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
     * ��ȡpayPalStatus���Ե�ֵ��
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
     * ����payPalStatus���Ե�ֵ��
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
     * ��ȡpayPalTranId���Ե�ֵ��
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
     * ����payPalTranId���Ե�ֵ��
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
     * ��ȡpnRefNum���Ե�ֵ��
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
     * ����pnRefNum���Ե�ֵ��
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
     * ��ȡpoAsText���Ե�ֵ��
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
     * ����poAsText���Ե�ֵ��
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
     * ��ȡposting���Ե�ֵ��
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
     * ����posting���Ե�ֵ��
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
     * ��ȡpostingPeriodRelative���Ե�ֵ��
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
     * ����postingPeriodRelative���Ե�ֵ��
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
     * ��ȡpriceLevel���Ե�ֵ��
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
     * ����priceLevel���Ե�ֵ��
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
     * ��ȡprintedPickingTicket���Ե�ֵ��
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
     * ����printedPickingTicket���Ե�ֵ��
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
     * ��ȡprobability���Ե�ֵ��
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
     * ����probability���Ե�ֵ��
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
     * ��ȡprojectedAmount���Ե�ֵ��
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
     * ����projectedAmount���Ե�ֵ��
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
     * ��ȡprojectTask���Ե�ֵ��
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
     * ����projectTask���Ե�ֵ��
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
     * ��ȡpromoCode���Ե�ֵ��
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
     * ����promoCode���Ե�ֵ��
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
     * ��ȡpurchaseOrder���Ե�ֵ��
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
     * ����purchaseOrder���Ե�ֵ��
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
     * ��ȡquantity���Ե�ֵ��
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
     * ����quantity���Ե�ֵ��
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
     * ��ȡquantityBilled���Ե�ֵ��
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
     * ����quantityBilled���Ե�ֵ��
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
     * ��ȡquantityCommitted���Ե�ֵ��
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
     * ����quantityCommitted���Ե�ֵ��
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
     * ��ȡquantityPacked���Ե�ֵ��
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
     * ����quantityPacked���Ե�ֵ��
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
     * ��ȡquantityPicked���Ե�ֵ��
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
     * ����quantityPicked���Ե�ֵ��
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
     * ��ȡquantityRevCommitted���Ե�ֵ��
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
     * ����quantityRevCommitted���Ե�ֵ��
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
     * ��ȡquantityShipRecv���Ե�ֵ��
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
     * ����quantityShipRecv���Ե�ֵ��
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
     * ��ȡrecognizedRevenue���Ե�ֵ��
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
     * ����recognizedRevenue���Ե�ֵ��
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
     * ��ȡrecordType���Ե�ֵ��
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
     * ����recordType���Ե�ֵ��
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
     * ��ȡrecurAnnuallyTotal���Ե�ֵ��
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
     * ����recurAnnuallyTotal���Ե�ֵ��
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
     * ��ȡrecurMonthlyTotal���Ե�ֵ��
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
     * ����recurMonthlyTotal���Ե�ֵ��
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
     * ��ȡrecurQuarterlyTotal���Ե�ֵ��
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
     * ����recurQuarterlyTotal���Ե�ֵ��
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
     * ��ȡrecurringBill���Ե�ֵ��
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
     * ����recurringBill���Ե�ֵ��
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
     * ��ȡrecurWeeklyTotal���Ե�ֵ��
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
     * ����recurWeeklyTotal���Ե�ֵ��
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
     * ��ȡrefNumber���Ե�ֵ��
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
     * ����refNumber���Ե�ֵ��
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
     * ��ȡrevCommitStatus���Ե�ֵ��
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
     * ����revCommitStatus���Ե�ֵ��
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
     * ��ȡrevCommittingStatus���Ե�ֵ��
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
     * ����revCommittingStatus���Ե�ֵ��
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
     * ��ȡrevCommittingTransaction���Ե�ֵ��
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
     * ����revCommittingTransaction���Ե�ֵ��
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
     * ��ȡrevenueStatus���Ե�ֵ��
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
     * ����revenueStatus���Ե�ֵ��
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
     * ��ȡreversalDate���Ե�ֵ��
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
     * ����reversalDate���Ե�ֵ��
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
     * ��ȡreversalNumber���Ե�ֵ��
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
     * ����reversalNumber���Ե�ֵ��
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
     * ��ȡrevRecEndDate���Ե�ֵ��
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
     * ����revRecEndDate���Ե�ֵ��
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
     * ��ȡrevRecOnRevCommitment���Ե�ֵ��
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
     * ����revRecOnRevCommitment���Ե�ֵ��
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
     * ��ȡrevRecStartDate���Ե�ֵ��
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
     * ����revRecStartDate���Ե�ֵ��
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
     * ��ȡrevRecTermInMonths���Ե�ֵ��
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
     * ����revRecTermInMonths���Ե�ֵ��
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
     * ��ȡsalesEffectiveDate���Ե�ֵ��
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
     * ����salesEffectiveDate���Ե�ֵ��
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
     * ��ȡsalesOrder���Ե�ֵ��
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
     * ����salesOrder���Ե�ֵ��
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
     * ��ȡsalesRep���Ե�ֵ��
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
     * ����salesRep���Ե�ֵ��
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
     * ��ȡsalesTeamMember���Ե�ֵ��
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
     * ����salesTeamMember���Ե�ֵ��
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
     * ��ȡsalesTeamRole���Ե�ֵ��
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
     * ����salesTeamRole���Ե�ֵ��
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
     * ��ȡschedulingMethod���Ե�ֵ��
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
     * ����schedulingMethod���Ե�ֵ��
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
     * ��ȡserialNumber���Ե�ֵ��
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
     * ����serialNumber���Ե�ֵ��
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
     * ��ȡserialNumberCost���Ե�ֵ��
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
     * ����serialNumberCost���Ե�ֵ��
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
     * ��ȡserialNumberCostAdjustment���Ե�ֵ��
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
     * ����serialNumberCostAdjustment���Ե�ֵ��
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
     * ��ȡserialNumberQuantity���Ե�ֵ��
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
     * ����serialNumberQuantity���Ե�ֵ��
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
     * ��ȡserialNumbers���Ե�ֵ��
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
     * ����serialNumbers���Ե�ֵ��
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
     * ��ȡshipAddress���Ե�ֵ��
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
     * ����shipAddress���Ե�ֵ��
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
     * ��ȡshipAddressee���Ե�ֵ��
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
     * ����shipAddressee���Ե�ֵ��
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
     * ��ȡshipAttention���Ե�ֵ��
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
     * ����shipAttention���Ե�ֵ��
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
     * ��ȡshipCarrier���Ե�ֵ��
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
     * ����shipCarrier���Ե�ֵ��
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
     * ��ȡshipCity���Ե�ֵ��
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
     * ����shipCity���Ե�ֵ��
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
     * ��ȡshipComplete���Ե�ֵ��
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
     * ����shipComplete���Ե�ֵ��
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
     * ��ȡshipCountry���Ե�ֵ��
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
     * ����shipCountry���Ե�ֵ��
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
     * ��ȡshipCounty���Ե�ֵ��
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
     * ����shipCounty���Ե�ֵ��
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
     * ��ȡshipDate���Ե�ֵ��
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
     * ����shipDate���Ե�ֵ��
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
     * ��ȡshipGroup���Ե�ֵ��
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
     * ����shipGroup���Ե�ֵ��
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
     * ��ȡshipMethod���Ե�ֵ��
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
     * ����shipMethod���Ե�ֵ��
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
     * ��ȡshipPhone���Ե�ֵ��
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
     * ����shipPhone���Ե�ֵ��
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
     * ��ȡshipping���Ե�ֵ��
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
     * ����shipping���Ե�ֵ��
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
     * ��ȡshipRecvStatus���Ե�ֵ��
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
     * ����shipRecvStatus���Ե�ֵ��
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
     * ��ȡshipRecvStatusLine���Ե�ֵ��
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
     * ����shipRecvStatusLine���Ե�ֵ��
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
     * ��ȡshipState���Ե�ֵ��
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
     * ����shipState���Ե�ֵ��
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
     * ��ȡshipTo���Ե�ֵ��
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
     * ����shipTo���Ե�ֵ��
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
     * ��ȡshipZip���Ե�ֵ��
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
     * ����shipZip���Ե�ֵ��
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
     * ��ȡsource���Ե�ֵ��
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
     * ����source���Ե�ֵ��
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
     * ��ȡstartDate���Ե�ֵ��
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
     * ����startDate���Ե�ֵ��
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
     * ��ȡstatistical���Ե�ֵ��
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
     * ����statistical���Ե�ֵ��
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
     * ��ȡstatus���Ե�ֵ��
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
     * ����status���Ե�ֵ��
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
     * ��ȡsubscription���Ե�ֵ��
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
     * ����subscription���Ե�ֵ��
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
     * ��ȡsubscriptionLine���Ե�ֵ��
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
     * ����subscriptionLine���Ե�ֵ��
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
     * ��ȡsubsidiary���Ե�ֵ��
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
     * ����subsidiary���Ե�ֵ��
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
     * ��ȡtaxItem���Ե�ֵ��
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
     * ����taxItem���Ե�ֵ��
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
     * ��ȡtaxLine���Ե�ֵ��
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
     * ����taxLine���Ե�ֵ��
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
     * ��ȡtaxPeriod���Ե�ֵ��
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
     * ����taxPeriod���Ե�ֵ��
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
     * ��ȡtaxPeriodRelative���Ե�ֵ��
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
     * ����taxPeriodRelative���Ե�ֵ��
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
     * ��ȡtaxRate���Ե�ֵ��
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
     * ����taxRate���Ե�ֵ��
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
     * ��ȡterms���Ե�ֵ��
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
     * ����terms���Ե�ֵ��
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
     * ��ȡtermsOfSale���Ե�ֵ��
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
     * ����termsOfSale���Ե�ֵ��
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
     * ��ȡtitle���Ե�ֵ��
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
     * ����title���Ե�ֵ��
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
     * ��ȡtoBeEmailed���Ե�ֵ��
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
     * ����toBeEmailed���Ե�ֵ��
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
     * ��ȡtoBePrinted���Ե�ֵ��
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
     * ����toBePrinted���Ե�ֵ��
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
     * ��ȡtoSubsidiary���Ե�ֵ��
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
     * ����toSubsidiary���Ե�ֵ��
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
     * ��ȡtotalAmount���Ե�ֵ��
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
     * ����totalAmount���Ե�ֵ��
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
     * ��ȡtrackingNumbers���Ե�ֵ��
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
     * ����trackingNumbers���Ե�ֵ��
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
     * ��ȡtranCostEstimate���Ե�ֵ��
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
     * ����tranCostEstimate���Ե�ֵ��
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
     * ��ȡtranDate���Ե�ֵ��
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
     * ����tranDate���Ե�ֵ��
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
     * ��ȡtranEstGrossProfit���Ե�ֵ��
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
     * ����tranEstGrossProfit���Ե�ֵ��
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
     * ��ȡtranEstGrossProfitPct���Ե�ֵ��
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
     * ����tranEstGrossProfitPct���Ե�ֵ��
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
     * ��ȡtranFxEstGrossProfit���Ե�ֵ��
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
     * ����tranFxEstGrossProfit���Ե�ֵ��
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
     * ��ȡtranId���Ե�ֵ��
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
     * ����tranId���Ե�ֵ��
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
     * ��ȡtranIsVsoeBundle���Ե�ֵ��
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
     * ����tranIsVsoeBundle���Ե�ֵ��
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
     * ��ȡtransactionDiscount���Ե�ֵ��
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
     * ����transactionDiscount���Ե�ֵ��
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
     * ��ȡtransactionLineType���Ե�ֵ��
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
     * ����transactionLineType���Ե�ֵ��
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
     * ��ȡtransactionNumber���Ե�ֵ��
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
     * ����transactionNumber���Ե�ֵ��
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
     * ��ȡtransferLocation���Ե�ֵ��
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
     * ����transferLocation���Ե�ֵ��
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
     * ��ȡtransferOrderQuantityCommitted���Ե�ֵ��
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
     * ����transferOrderQuantityCommitted���Ե�ֵ��
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
     * ��ȡtransferOrderQuantityPacked���Ե�ֵ��
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
     * ����transferOrderQuantityPacked���Ե�ֵ��
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
     * ��ȡtransferOrderQuantityPicked���Ե�ֵ��
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
     * ����transferOrderQuantityPicked���Ե�ֵ��
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
     * ��ȡtransferOrderQuantityReceived���Ե�ֵ��
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
     * ����transferOrderQuantityReceived���Ե�ֵ��
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
     * ��ȡtransferOrderQuantityShipped���Ե�ֵ��
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
     * ����transferOrderQuantityShipped���Ե�ֵ��
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
     * ��ȡtype���Ե�ֵ��
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
     * ����type���Ե�ֵ��
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
     * ��ȡunit���Ե�ֵ��
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
     * ����unit���Ե�ֵ��
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
     * ��ȡunitCostOverride���Ե�ֵ��
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
     * ����unitCostOverride���Ե�ֵ��
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
     * ��ȡunitsType���Ե�ֵ��
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
     * ����unitsType���Ե�ֵ��
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
     * ��ȡvendType���Ե�ֵ��
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
     * ����vendType���Ե�ֵ��
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
     * ��ȡvisibleToCustomer���Ե�ֵ��
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
     * ����visibleToCustomer���Ե�ֵ��
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
     * ��ȡvoided���Ե�ֵ��
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
     * ����voided���Ե�ֵ��
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
     * ��ȡvsoeAllocation���Ե�ֵ��
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
     * ����vsoeAllocation���Ե�ֵ��
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
     * ��ȡvsoeAmount���Ե�ֵ��
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
     * ����vsoeAmount���Ե�ֵ��
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
     * ��ȡvsoeDeferral���Ե�ֵ��
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
     * ����vsoeDeferral���Ե�ֵ��
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
     * ��ȡvsoeDelivered���Ե�ֵ��
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
     * ����vsoeDelivered���Ե�ֵ��
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
     * ��ȡvsoePermitDiscount���Ե�ֵ��
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
     * ����vsoePermitDiscount���Ե�ֵ��
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
     * ��ȡvsoePrice���Ե�ֵ��
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
     * ����vsoePrice���Ե�ֵ��
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
     * ��ȡwebSite���Ե�ֵ��
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
     * ����webSite���Ե�ֵ��
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
     * ��ȡcustomFieldList���Ե�ֵ��
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
     * ����customFieldList���Ե�ֵ��
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
