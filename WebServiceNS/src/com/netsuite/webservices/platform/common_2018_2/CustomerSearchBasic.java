
package com.netsuite.webservices.platform.common_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.SearchBooleanField;
import com.netsuite.webservices.platform.core_2018_2.SearchCustomFieldList;
import com.netsuite.webservices.platform.core_2018_2.SearchDateField;
import com.netsuite.webservices.platform.core_2018_2.SearchDoubleField;
import com.netsuite.webservices.platform.core_2018_2.SearchEnumMultiSelectField;
import com.netsuite.webservices.platform.core_2018_2.SearchLongField;
import com.netsuite.webservices.platform.core_2018_2.SearchMultiSelectField;
import com.netsuite.webservices.platform.core_2018_2.SearchRecordBasic;
import com.netsuite.webservices.platform.core_2018_2.SearchStringField;


/**
 * <p>CustomerSearchBasic complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CustomerSearchBasic">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRecordBasic">
 *       &lt;sequence>
 *         &lt;element name="accountNumber" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="address" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="addressee" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="addressLabel" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="addressPhone" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="assignedSite" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="assignedSiteId" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="attention" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="availableOffline" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="balance" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="billAddress" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="boughtAmount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="boughtDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="buyingReason" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="buyingTimeFrame" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="category" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="ccCustomerCode" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="ccDefault" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="ccExpDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="ccHolderName" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="ccNumber" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="ccState" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="ccStateFrom" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="ccType" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="city" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="classBought" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="comments" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="companyName" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="consolBalance" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="consolDaysOverdue" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="consolDepositBalance" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="consolOverdueBalance" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="consolUnbilledOrders" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="contact" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="contribution" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="conversionDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="country" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="county" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="creditHold" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="creditHoldOverride" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="creditLimit" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="currency" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="custStage" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="custStatus" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="dateClosed" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="dateCreated" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="daysOverdue" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="defaultOrderPriority" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="depositBalance" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="deptBought" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="drAccount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="email" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="emailPreference" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="emailTransactions" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="endDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="entityId" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="entityStatus" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="estimatedBudget" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="explicitConversion" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="externalId" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="externalIdString" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="fax" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="faxTransactions" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="firstName" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="firstOrderDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="firstSaleDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="fxAccount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="fxBalance" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="fxConsolBalance" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="fxConsolUnbilledOrders" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="fxUnbilledOrders" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="giveAccess" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="globalSubscriptionStatus" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="group" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="groupPricingLevel" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="hasDuplicates" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="image" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="internalId" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="internalIdNumber" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="isBudgetApproved" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isDefaultBilling" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isDefaultShipping" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isInactive" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isPerson" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isReportedLead" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isShipAddress" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="itemPricingLevel" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="itemPricingUnitPrice" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="itemsBought" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="itemsOrdered" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="language" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="lastModifiedDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="lastName" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="lastOrderDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="lastSaleDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="leadDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="leadSource" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="level" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="locationBought" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="manualCreditHold" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="merchantAccount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="middleName" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="monthlyClosing" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="onCreditHold" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="orderedAmount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="orderedDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="otherRelationships" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="overdueBalance" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="parent" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="parentItemsBought" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="parentItemsOrdered" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="partner" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="partnerContribution" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="partnerRole" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="partnerTeamMember" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="pec" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="permission" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="phone" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="phoneticName" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="priceLevel" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="pricingGroup" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="pricingItem" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="printTransactions" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="prospectDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="pstExempt" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="receivablesAccount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="reminderDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="resaleNumber" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="role" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="salesReadiness" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="salesRep" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="salesTeamMember" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="salesTeamRole" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="salutation" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="shipAddress" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="shipComplete" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="shippingItem" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="sourceSite" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="sourceSiteId" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="stage" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="startDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="state" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="subsidBought" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="subsidiary" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="taxable" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="terms" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="territory" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="title" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="unbilledOrders" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="url" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="vatRegNumber" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="webLead" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="zipCode" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
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
@XmlType(name = "CustomerSearchBasic", propOrder = {
    "accountNumber",
    "address",
    "addressee",
    "addressLabel",
    "addressPhone",
    "assignedSite",
    "assignedSiteId",
    "attention",
    "availableOffline",
    "balance",
    "billAddress",
    "boughtAmount",
    "boughtDate",
    "buyingReason",
    "buyingTimeFrame",
    "category",
    "ccCustomerCode",
    "ccDefault",
    "ccExpDate",
    "ccHolderName",
    "ccNumber",
    "ccState",
    "ccStateFrom",
    "ccType",
    "city",
    "classBought",
    "comments",
    "companyName",
    "consolBalance",
    "consolDaysOverdue",
    "consolDepositBalance",
    "consolOverdueBalance",
    "consolUnbilledOrders",
    "contact",
    "contribution",
    "conversionDate",
    "country",
    "county",
    "creditHold",
    "creditHoldOverride",
    "creditLimit",
    "currency",
    "custStage",
    "custStatus",
    "dateClosed",
    "dateCreated",
    "daysOverdue",
    "defaultOrderPriority",
    "depositBalance",
    "deptBought",
    "drAccount",
    "email",
    "emailPreference",
    "emailTransactions",
    "endDate",
    "entityId",
    "entityStatus",
    "estimatedBudget",
    "explicitConversion",
    "externalId",
    "externalIdString",
    "fax",
    "faxTransactions",
    "firstName",
    "firstOrderDate",
    "firstSaleDate",
    "fxAccount",
    "fxBalance",
    "fxConsolBalance",
    "fxConsolUnbilledOrders",
    "fxUnbilledOrders",
    "giveAccess",
    "globalSubscriptionStatus",
    "group",
    "groupPricingLevel",
    "hasDuplicates",
    "image",
    "internalId",
    "internalIdNumber",
    "isBudgetApproved",
    "isDefaultBilling",
    "isDefaultShipping",
    "isInactive",
    "isPerson",
    "isReportedLead",
    "isShipAddress",
    "itemPricingLevel",
    "itemPricingUnitPrice",
    "itemsBought",
    "itemsOrdered",
    "language",
    "lastModifiedDate",
    "lastName",
    "lastOrderDate",
    "lastSaleDate",
    "leadDate",
    "leadSource",
    "level",
    "locationBought",
    "manualCreditHold",
    "merchantAccount",
    "middleName",
    "monthlyClosing",
    "onCreditHold",
    "orderedAmount",
    "orderedDate",
    "otherRelationships",
    "overdueBalance",
    "parent",
    "parentItemsBought",
    "parentItemsOrdered",
    "partner",
    "partnerContribution",
    "partnerRole",
    "partnerTeamMember",
    "pec",
    "permission",
    "phone",
    "phoneticName",
    "priceLevel",
    "pricingGroup",
    "pricingItem",
    "printTransactions",
    "prospectDate",
    "pstExempt",
    "receivablesAccount",
    "reminderDate",
    "resaleNumber",
    "role",
    "salesReadiness",
    "salesRep",
    "salesTeamMember",
    "salesTeamRole",
    "salutation",
    "shipAddress",
    "shipComplete",
    "shippingItem",
    "sourceSite",
    "sourceSiteId",
    "stage",
    "startDate",
    "state",
    "subsidBought",
    "subsidiary",
    "taxable",
    "terms",
    "territory",
    "title",
    "unbilledOrders",
    "url",
    "vatRegNumber",
    "webLead",
    "zipCode",
    "customFieldList"
})
public class CustomerSearchBasic
    extends SearchRecordBasic
{

    protected SearchStringField accountNumber;
    protected SearchStringField address;
    protected SearchStringField addressee;
    protected SearchStringField addressLabel;
    protected SearchStringField addressPhone;
    protected SearchMultiSelectField assignedSite;
    protected SearchMultiSelectField assignedSiteId;
    protected SearchStringField attention;
    protected SearchBooleanField availableOffline;
    protected SearchDoubleField balance;
    protected SearchStringField billAddress;
    protected SearchDoubleField boughtAmount;
    protected SearchDateField boughtDate;
    protected SearchMultiSelectField buyingReason;
    protected SearchMultiSelectField buyingTimeFrame;
    protected SearchMultiSelectField category;
    protected SearchStringField ccCustomerCode;
    protected SearchBooleanField ccDefault;
    protected SearchDateField ccExpDate;
    protected SearchStringField ccHolderName;
    protected SearchStringField ccNumber;
    protected SearchMultiSelectField ccState;
    protected SearchDateField ccStateFrom;
    protected SearchMultiSelectField ccType;
    protected SearchStringField city;
    protected SearchMultiSelectField classBought;
    protected SearchStringField comments;
    protected SearchStringField companyName;
    protected SearchDoubleField consolBalance;
    protected SearchLongField consolDaysOverdue;
    protected SearchDoubleField consolDepositBalance;
    protected SearchDoubleField consolOverdueBalance;
    protected SearchDoubleField consolUnbilledOrders;
    protected SearchStringField contact;
    protected SearchLongField contribution;
    protected SearchDateField conversionDate;
    protected SearchEnumMultiSelectField country;
    protected SearchStringField county;
    protected SearchEnumMultiSelectField creditHold;
    protected SearchBooleanField creditHoldOverride;
    protected SearchDoubleField creditLimit;
    protected SearchMultiSelectField currency;
    protected SearchMultiSelectField custStage;
    protected SearchMultiSelectField custStatus;
    protected SearchDateField dateClosed;
    protected SearchDateField dateCreated;
    protected SearchLongField daysOverdue;
    protected SearchDoubleField defaultOrderPriority;
    protected SearchDoubleField depositBalance;
    protected SearchMultiSelectField deptBought;
    protected SearchMultiSelectField drAccount;
    protected SearchStringField email;
    protected SearchEnumMultiSelectField emailPreference;
    protected SearchBooleanField emailTransactions;
    protected SearchDateField endDate;
    protected SearchStringField entityId;
    protected SearchMultiSelectField entityStatus;
    protected SearchDoubleField estimatedBudget;
    protected SearchBooleanField explicitConversion;
    protected SearchMultiSelectField externalId;
    protected SearchStringField externalIdString;
    protected SearchStringField fax;
    protected SearchBooleanField faxTransactions;
    protected SearchStringField firstName;
    protected SearchDateField firstOrderDate;
    protected SearchDateField firstSaleDate;
    protected SearchMultiSelectField fxAccount;
    protected SearchDoubleField fxBalance;
    protected SearchDoubleField fxConsolBalance;
    protected SearchDoubleField fxConsolUnbilledOrders;
    protected SearchDoubleField fxUnbilledOrders;
    protected SearchBooleanField giveAccess;
    protected SearchEnumMultiSelectField globalSubscriptionStatus;
    protected SearchMultiSelectField group;
    protected SearchMultiSelectField groupPricingLevel;
    protected SearchBooleanField hasDuplicates;
    protected SearchStringField image;
    protected SearchMultiSelectField internalId;
    protected SearchLongField internalIdNumber;
    protected SearchBooleanField isBudgetApproved;
    protected SearchBooleanField isDefaultBilling;
    protected SearchBooleanField isDefaultShipping;
    protected SearchBooleanField isInactive;
    protected SearchBooleanField isPerson;
    protected SearchBooleanField isReportedLead;
    protected SearchBooleanField isShipAddress;
    protected SearchMultiSelectField itemPricingLevel;
    protected SearchDoubleField itemPricingUnitPrice;
    protected SearchMultiSelectField itemsBought;
    protected SearchMultiSelectField itemsOrdered;
    protected SearchEnumMultiSelectField language;
    protected SearchDateField lastModifiedDate;
    protected SearchStringField lastName;
    protected SearchDateField lastOrderDate;
    protected SearchDateField lastSaleDate;
    protected SearchDateField leadDate;
    protected SearchMultiSelectField leadSource;
    protected SearchEnumMultiSelectField level;
    protected SearchMultiSelectField locationBought;
    protected SearchBooleanField manualCreditHold;
    protected SearchMultiSelectField merchantAccount;
    protected SearchStringField middleName;
    protected SearchEnumMultiSelectField monthlyClosing;
    protected SearchBooleanField onCreditHold;
    protected SearchDoubleField orderedAmount;
    protected SearchDateField orderedDate;
    protected SearchEnumMultiSelectField otherRelationships;
    protected SearchDoubleField overdueBalance;
    protected SearchMultiSelectField parent;
    protected SearchMultiSelectField parentItemsBought;
    protected SearchMultiSelectField parentItemsOrdered;
    protected SearchMultiSelectField partner;
    protected SearchLongField partnerContribution;
    protected SearchMultiSelectField partnerRole;
    protected SearchMultiSelectField partnerTeamMember;
    protected SearchStringField pec;
    protected SearchEnumMultiSelectField permission;
    protected SearchStringField phone;
    protected SearchStringField phoneticName;
    protected SearchMultiSelectField priceLevel;
    protected SearchMultiSelectField pricingGroup;
    protected SearchMultiSelectField pricingItem;
    protected SearchBooleanField printTransactions;
    protected SearchDateField prospectDate;
    protected SearchBooleanField pstExempt;
    protected SearchMultiSelectField receivablesAccount;
    protected SearchDateField reminderDate;
    protected SearchStringField resaleNumber;
    protected SearchMultiSelectField role;
    protected SearchMultiSelectField salesReadiness;
    protected SearchMultiSelectField salesRep;
    protected SearchMultiSelectField salesTeamMember;
    protected SearchMultiSelectField salesTeamRole;
    protected SearchStringField salutation;
    protected SearchStringField shipAddress;
    protected SearchBooleanField shipComplete;
    protected SearchMultiSelectField shippingItem;
    protected SearchMultiSelectField sourceSite;
    protected SearchMultiSelectField sourceSiteId;
    protected SearchEnumMultiSelectField stage;
    protected SearchDateField startDate;
    protected SearchStringField state;
    protected SearchMultiSelectField subsidBought;
    protected SearchMultiSelectField subsidiary;
    protected SearchBooleanField taxable;
    protected SearchMultiSelectField terms;
    protected SearchMultiSelectField territory;
    protected SearchStringField title;
    protected SearchDoubleField unbilledOrders;
    protected SearchStringField url;
    protected SearchStringField vatRegNumber;
    protected SearchBooleanField webLead;
    protected SearchStringField zipCode;
    protected SearchCustomFieldList customFieldList;

    /**
     * 获取accountNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getAccountNumber() {
        return accountNumber;
    }

    /**
     * 设置accountNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setAccountNumber(SearchStringField value) {
        this.accountNumber = value;
    }

    /**
     * 获取address属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getAddress() {
        return address;
    }

    /**
     * 设置address属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setAddress(SearchStringField value) {
        this.address = value;
    }

    /**
     * 获取addressee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getAddressee() {
        return addressee;
    }

    /**
     * 设置addressee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setAddressee(SearchStringField value) {
        this.addressee = value;
    }

    /**
     * 获取addressLabel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getAddressLabel() {
        return addressLabel;
    }

    /**
     * 设置addressLabel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setAddressLabel(SearchStringField value) {
        this.addressLabel = value;
    }

    /**
     * 获取addressPhone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getAddressPhone() {
        return addressPhone;
    }

    /**
     * 设置addressPhone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setAddressPhone(SearchStringField value) {
        this.addressPhone = value;
    }

    /**
     * 获取assignedSite属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getAssignedSite() {
        return assignedSite;
    }

    /**
     * 设置assignedSite属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setAssignedSite(SearchMultiSelectField value) {
        this.assignedSite = value;
    }

    /**
     * 获取assignedSiteId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getAssignedSiteId() {
        return assignedSiteId;
    }

    /**
     * 设置assignedSiteId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setAssignedSiteId(SearchMultiSelectField value) {
        this.assignedSiteId = value;
    }

    /**
     * 获取attention属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getAttention() {
        return attention;
    }

    /**
     * 设置attention属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setAttention(SearchStringField value) {
        this.attention = value;
    }

    /**
     * 获取availableOffline属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getAvailableOffline() {
        return availableOffline;
    }

    /**
     * 设置availableOffline属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setAvailableOffline(SearchBooleanField value) {
        this.availableOffline = value;
    }

    /**
     * 获取balance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getBalance() {
        return balance;
    }

    /**
     * 设置balance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setBalance(SearchDoubleField value) {
        this.balance = value;
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
     * 获取boughtAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getBoughtAmount() {
        return boughtAmount;
    }

    /**
     * 设置boughtAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setBoughtAmount(SearchDoubleField value) {
        this.boughtAmount = value;
    }

    /**
     * 获取boughtDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getBoughtDate() {
        return boughtDate;
    }

    /**
     * 设置boughtDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setBoughtDate(SearchDateField value) {
        this.boughtDate = value;
    }

    /**
     * 获取buyingReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getBuyingReason() {
        return buyingReason;
    }

    /**
     * 设置buyingReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setBuyingReason(SearchMultiSelectField value) {
        this.buyingReason = value;
    }

    /**
     * 获取buyingTimeFrame属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getBuyingTimeFrame() {
        return buyingTimeFrame;
    }

    /**
     * 设置buyingTimeFrame属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setBuyingTimeFrame(SearchMultiSelectField value) {
        this.buyingTimeFrame = value;
    }

    /**
     * 获取category属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getCategory() {
        return category;
    }

    /**
     * 设置category属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setCategory(SearchMultiSelectField value) {
        this.category = value;
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
     * 获取ccDefault属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getCcDefault() {
        return ccDefault;
    }

    /**
     * 设置ccDefault属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setCcDefault(SearchBooleanField value) {
        this.ccDefault = value;
    }

    /**
     * 获取ccExpDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getCcExpDate() {
        return ccExpDate;
    }

    /**
     * 设置ccExpDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setCcExpDate(SearchDateField value) {
        this.ccExpDate = value;
    }

    /**
     * 获取ccHolderName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getCcHolderName() {
        return ccHolderName;
    }

    /**
     * 设置ccHolderName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setCcHolderName(SearchStringField value) {
        this.ccHolderName = value;
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
     * 获取ccState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getCcState() {
        return ccState;
    }

    /**
     * 设置ccState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setCcState(SearchMultiSelectField value) {
        this.ccState = value;
    }

    /**
     * 获取ccStateFrom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getCcStateFrom() {
        return ccStateFrom;
    }

    /**
     * 设置ccStateFrom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setCcStateFrom(SearchDateField value) {
        this.ccStateFrom = value;
    }

    /**
     * 获取ccType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getCcType() {
        return ccType;
    }

    /**
     * 设置ccType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setCcType(SearchMultiSelectField value) {
        this.ccType = value;
    }

    /**
     * 获取city属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getCity() {
        return city;
    }

    /**
     * 设置city属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setCity(SearchStringField value) {
        this.city = value;
    }

    /**
     * 获取classBought属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getClassBought() {
        return classBought;
    }

    /**
     * 设置classBought属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setClassBought(SearchMultiSelectField value) {
        this.classBought = value;
    }

    /**
     * 获取comments属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getComments() {
        return comments;
    }

    /**
     * 设置comments属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setComments(SearchStringField value) {
        this.comments = value;
    }

    /**
     * 获取companyName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getCompanyName() {
        return companyName;
    }

    /**
     * 设置companyName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setCompanyName(SearchStringField value) {
        this.companyName = value;
    }

    /**
     * 获取consolBalance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getConsolBalance() {
        return consolBalance;
    }

    /**
     * 设置consolBalance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setConsolBalance(SearchDoubleField value) {
        this.consolBalance = value;
    }

    /**
     * 获取consolDaysOverdue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getConsolDaysOverdue() {
        return consolDaysOverdue;
    }

    /**
     * 设置consolDaysOverdue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setConsolDaysOverdue(SearchLongField value) {
        this.consolDaysOverdue = value;
    }

    /**
     * 获取consolDepositBalance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getConsolDepositBalance() {
        return consolDepositBalance;
    }

    /**
     * 设置consolDepositBalance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setConsolDepositBalance(SearchDoubleField value) {
        this.consolDepositBalance = value;
    }

    /**
     * 获取consolOverdueBalance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getConsolOverdueBalance() {
        return consolOverdueBalance;
    }

    /**
     * 设置consolOverdueBalance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setConsolOverdueBalance(SearchDoubleField value) {
        this.consolOverdueBalance = value;
    }

    /**
     * 获取consolUnbilledOrders属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getConsolUnbilledOrders() {
        return consolUnbilledOrders;
    }

    /**
     * 设置consolUnbilledOrders属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setConsolUnbilledOrders(SearchDoubleField value) {
        this.consolUnbilledOrders = value;
    }

    /**
     * 获取contact属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getContact() {
        return contact;
    }

    /**
     * 设置contact属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setContact(SearchStringField value) {
        this.contact = value;
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
     * 获取conversionDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getConversionDate() {
        return conversionDate;
    }

    /**
     * 设置conversionDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setConversionDate(SearchDateField value) {
        this.conversionDate = value;
    }

    /**
     * 获取country属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getCountry() {
        return country;
    }

    /**
     * 设置country属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setCountry(SearchEnumMultiSelectField value) {
        this.country = value;
    }

    /**
     * 获取county属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getCounty() {
        return county;
    }

    /**
     * 设置county属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setCounty(SearchStringField value) {
        this.county = value;
    }

    /**
     * 获取creditHold属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getCreditHold() {
        return creditHold;
    }

    /**
     * 设置creditHold属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setCreditHold(SearchEnumMultiSelectField value) {
        this.creditHold = value;
    }

    /**
     * 获取creditHoldOverride属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getCreditHoldOverride() {
        return creditHoldOverride;
    }

    /**
     * 设置creditHoldOverride属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setCreditHoldOverride(SearchBooleanField value) {
        this.creditHoldOverride = value;
    }

    /**
     * 获取creditLimit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getCreditLimit() {
        return creditLimit;
    }

    /**
     * 设置creditLimit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setCreditLimit(SearchDoubleField value) {
        this.creditLimit = value;
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
     * 获取custStage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getCustStage() {
        return custStage;
    }

    /**
     * 设置custStage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setCustStage(SearchMultiSelectField value) {
        this.custStage = value;
    }

    /**
     * 获取custStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getCustStatus() {
        return custStatus;
    }

    /**
     * 设置custStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setCustStatus(SearchMultiSelectField value) {
        this.custStatus = value;
    }

    /**
     * 获取dateClosed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getDateClosed() {
        return dateClosed;
    }

    /**
     * 设置dateClosed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setDateClosed(SearchDateField value) {
        this.dateClosed = value;
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
     * 获取defaultOrderPriority属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getDefaultOrderPriority() {
        return defaultOrderPriority;
    }

    /**
     * 设置defaultOrderPriority属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setDefaultOrderPriority(SearchDoubleField value) {
        this.defaultOrderPriority = value;
    }

    /**
     * 获取depositBalance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getDepositBalance() {
        return depositBalance;
    }

    /**
     * 设置depositBalance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setDepositBalance(SearchDoubleField value) {
        this.depositBalance = value;
    }

    /**
     * 获取deptBought属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getDeptBought() {
        return deptBought;
    }

    /**
     * 设置deptBought属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setDeptBought(SearchMultiSelectField value) {
        this.deptBought = value;
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
     * 获取emailPreference属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getEmailPreference() {
        return emailPreference;
    }

    /**
     * 设置emailPreference属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setEmailPreference(SearchEnumMultiSelectField value) {
        this.emailPreference = value;
    }

    /**
     * 获取emailTransactions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getEmailTransactions() {
        return emailTransactions;
    }

    /**
     * 设置emailTransactions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setEmailTransactions(SearchBooleanField value) {
        this.emailTransactions = value;
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
     * 获取entityId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getEntityId() {
        return entityId;
    }

    /**
     * 设置entityId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setEntityId(SearchStringField value) {
        this.entityId = value;
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
     * 获取estimatedBudget属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getEstimatedBudget() {
        return estimatedBudget;
    }

    /**
     * 设置estimatedBudget属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setEstimatedBudget(SearchDoubleField value) {
        this.estimatedBudget = value;
    }

    /**
     * 获取explicitConversion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getExplicitConversion() {
        return explicitConversion;
    }

    /**
     * 设置explicitConversion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setExplicitConversion(SearchBooleanField value) {
        this.explicitConversion = value;
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
     * 获取fax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getFax() {
        return fax;
    }

    /**
     * 设置fax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setFax(SearchStringField value) {
        this.fax = value;
    }

    /**
     * 获取faxTransactions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getFaxTransactions() {
        return faxTransactions;
    }

    /**
     * 设置faxTransactions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setFaxTransactions(SearchBooleanField value) {
        this.faxTransactions = value;
    }

    /**
     * 获取firstName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getFirstName() {
        return firstName;
    }

    /**
     * 设置firstName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setFirstName(SearchStringField value) {
        this.firstName = value;
    }

    /**
     * 获取firstOrderDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getFirstOrderDate() {
        return firstOrderDate;
    }

    /**
     * 设置firstOrderDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setFirstOrderDate(SearchDateField value) {
        this.firstOrderDate = value;
    }

    /**
     * 获取firstSaleDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getFirstSaleDate() {
        return firstSaleDate;
    }

    /**
     * 设置firstSaleDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setFirstSaleDate(SearchDateField value) {
        this.firstSaleDate = value;
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
     * 获取fxBalance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getFxBalance() {
        return fxBalance;
    }

    /**
     * 设置fxBalance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setFxBalance(SearchDoubleField value) {
        this.fxBalance = value;
    }

    /**
     * 获取fxConsolBalance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getFxConsolBalance() {
        return fxConsolBalance;
    }

    /**
     * 设置fxConsolBalance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setFxConsolBalance(SearchDoubleField value) {
        this.fxConsolBalance = value;
    }

    /**
     * 获取fxConsolUnbilledOrders属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getFxConsolUnbilledOrders() {
        return fxConsolUnbilledOrders;
    }

    /**
     * 设置fxConsolUnbilledOrders属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setFxConsolUnbilledOrders(SearchDoubleField value) {
        this.fxConsolUnbilledOrders = value;
    }

    /**
     * 获取fxUnbilledOrders属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getFxUnbilledOrders() {
        return fxUnbilledOrders;
    }

    /**
     * 设置fxUnbilledOrders属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setFxUnbilledOrders(SearchDoubleField value) {
        this.fxUnbilledOrders = value;
    }

    /**
     * 获取giveAccess属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getGiveAccess() {
        return giveAccess;
    }

    /**
     * 设置giveAccess属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setGiveAccess(SearchBooleanField value) {
        this.giveAccess = value;
    }

    /**
     * 获取globalSubscriptionStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getGlobalSubscriptionStatus() {
        return globalSubscriptionStatus;
    }

    /**
     * 设置globalSubscriptionStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setGlobalSubscriptionStatus(SearchEnumMultiSelectField value) {
        this.globalSubscriptionStatus = value;
    }

    /**
     * 获取group属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getGroup() {
        return group;
    }

    /**
     * 设置group属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setGroup(SearchMultiSelectField value) {
        this.group = value;
    }

    /**
     * 获取groupPricingLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getGroupPricingLevel() {
        return groupPricingLevel;
    }

    /**
     * 设置groupPricingLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setGroupPricingLevel(SearchMultiSelectField value) {
        this.groupPricingLevel = value;
    }

    /**
     * 获取hasDuplicates属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getHasDuplicates() {
        return hasDuplicates;
    }

    /**
     * 设置hasDuplicates属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setHasDuplicates(SearchBooleanField value) {
        this.hasDuplicates = value;
    }

    /**
     * 获取image属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getImage() {
        return image;
    }

    /**
     * 设置image属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setImage(SearchStringField value) {
        this.image = value;
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
     * 获取isBudgetApproved属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsBudgetApproved() {
        return isBudgetApproved;
    }

    /**
     * 设置isBudgetApproved属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsBudgetApproved(SearchBooleanField value) {
        this.isBudgetApproved = value;
    }

    /**
     * 获取isDefaultBilling属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsDefaultBilling() {
        return isDefaultBilling;
    }

    /**
     * 设置isDefaultBilling属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsDefaultBilling(SearchBooleanField value) {
        this.isDefaultBilling = value;
    }

    /**
     * 获取isDefaultShipping属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsDefaultShipping() {
        return isDefaultShipping;
    }

    /**
     * 设置isDefaultShipping属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsDefaultShipping(SearchBooleanField value) {
        this.isDefaultShipping = value;
    }

    /**
     * 获取isInactive属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsInactive() {
        return isInactive;
    }

    /**
     * 设置isInactive属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsInactive(SearchBooleanField value) {
        this.isInactive = value;
    }

    /**
     * 获取isPerson属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsPerson() {
        return isPerson;
    }

    /**
     * 设置isPerson属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsPerson(SearchBooleanField value) {
        this.isPerson = value;
    }

    /**
     * 获取isReportedLead属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsReportedLead() {
        return isReportedLead;
    }

    /**
     * 设置isReportedLead属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsReportedLead(SearchBooleanField value) {
        this.isReportedLead = value;
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
     * 获取itemPricingLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getItemPricingLevel() {
        return itemPricingLevel;
    }

    /**
     * 设置itemPricingLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setItemPricingLevel(SearchMultiSelectField value) {
        this.itemPricingLevel = value;
    }

    /**
     * 获取itemPricingUnitPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getItemPricingUnitPrice() {
        return itemPricingUnitPrice;
    }

    /**
     * 设置itemPricingUnitPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setItemPricingUnitPrice(SearchDoubleField value) {
        this.itemPricingUnitPrice = value;
    }

    /**
     * 获取itemsBought属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getItemsBought() {
        return itemsBought;
    }

    /**
     * 设置itemsBought属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setItemsBought(SearchMultiSelectField value) {
        this.itemsBought = value;
    }

    /**
     * 获取itemsOrdered属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getItemsOrdered() {
        return itemsOrdered;
    }

    /**
     * 设置itemsOrdered属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setItemsOrdered(SearchMultiSelectField value) {
        this.itemsOrdered = value;
    }

    /**
     * 获取language属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getLanguage() {
        return language;
    }

    /**
     * 设置language属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setLanguage(SearchEnumMultiSelectField value) {
        this.language = value;
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
     * 获取lastName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getLastName() {
        return lastName;
    }

    /**
     * 设置lastName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setLastName(SearchStringField value) {
        this.lastName = value;
    }

    /**
     * 获取lastOrderDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getLastOrderDate() {
        return lastOrderDate;
    }

    /**
     * 设置lastOrderDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setLastOrderDate(SearchDateField value) {
        this.lastOrderDate = value;
    }

    /**
     * 获取lastSaleDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getLastSaleDate() {
        return lastSaleDate;
    }

    /**
     * 设置lastSaleDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setLastSaleDate(SearchDateField value) {
        this.lastSaleDate = value;
    }

    /**
     * 获取leadDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getLeadDate() {
        return leadDate;
    }

    /**
     * 设置leadDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setLeadDate(SearchDateField value) {
        this.leadDate = value;
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
     * 获取level属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getLevel() {
        return level;
    }

    /**
     * 设置level属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setLevel(SearchEnumMultiSelectField value) {
        this.level = value;
    }

    /**
     * 获取locationBought属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getLocationBought() {
        return locationBought;
    }

    /**
     * 设置locationBought属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setLocationBought(SearchMultiSelectField value) {
        this.locationBought = value;
    }

    /**
     * 获取manualCreditHold属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getManualCreditHold() {
        return manualCreditHold;
    }

    /**
     * 设置manualCreditHold属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setManualCreditHold(SearchBooleanField value) {
        this.manualCreditHold = value;
    }

    /**
     * 获取merchantAccount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getMerchantAccount() {
        return merchantAccount;
    }

    /**
     * 设置merchantAccount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setMerchantAccount(SearchMultiSelectField value) {
        this.merchantAccount = value;
    }

    /**
     * 获取middleName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getMiddleName() {
        return middleName;
    }

    /**
     * 设置middleName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setMiddleName(SearchStringField value) {
        this.middleName = value;
    }

    /**
     * 获取monthlyClosing属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getMonthlyClosing() {
        return monthlyClosing;
    }

    /**
     * 设置monthlyClosing属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setMonthlyClosing(SearchEnumMultiSelectField value) {
        this.monthlyClosing = value;
    }

    /**
     * 获取onCreditHold属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getOnCreditHold() {
        return onCreditHold;
    }

    /**
     * 设置onCreditHold属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setOnCreditHold(SearchBooleanField value) {
        this.onCreditHold = value;
    }

    /**
     * 获取orderedAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getOrderedAmount() {
        return orderedAmount;
    }

    /**
     * 设置orderedAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setOrderedAmount(SearchDoubleField value) {
        this.orderedAmount = value;
    }

    /**
     * 获取orderedDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getOrderedDate() {
        return orderedDate;
    }

    /**
     * 设置orderedDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setOrderedDate(SearchDateField value) {
        this.orderedDate = value;
    }

    /**
     * 获取otherRelationships属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getOtherRelationships() {
        return otherRelationships;
    }

    /**
     * 设置otherRelationships属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setOtherRelationships(SearchEnumMultiSelectField value) {
        this.otherRelationships = value;
    }

    /**
     * 获取overdueBalance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getOverdueBalance() {
        return overdueBalance;
    }

    /**
     * 设置overdueBalance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setOverdueBalance(SearchDoubleField value) {
        this.overdueBalance = value;
    }

    /**
     * 获取parent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getParent() {
        return parent;
    }

    /**
     * 设置parent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setParent(SearchMultiSelectField value) {
        this.parent = value;
    }

    /**
     * 获取parentItemsBought属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getParentItemsBought() {
        return parentItemsBought;
    }

    /**
     * 设置parentItemsBought属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setParentItemsBought(SearchMultiSelectField value) {
        this.parentItemsBought = value;
    }

    /**
     * 获取parentItemsOrdered属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getParentItemsOrdered() {
        return parentItemsOrdered;
    }

    /**
     * 设置parentItemsOrdered属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setParentItemsOrdered(SearchMultiSelectField value) {
        this.parentItemsOrdered = value;
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
     * 获取pec属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getPec() {
        return pec;
    }

    /**
     * 设置pec属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setPec(SearchStringField value) {
        this.pec = value;
    }

    /**
     * 获取permission属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getPermission() {
        return permission;
    }

    /**
     * 设置permission属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setPermission(SearchEnumMultiSelectField value) {
        this.permission = value;
    }

    /**
     * 获取phone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getPhone() {
        return phone;
    }

    /**
     * 设置phone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setPhone(SearchStringField value) {
        this.phone = value;
    }

    /**
     * 获取phoneticName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getPhoneticName() {
        return phoneticName;
    }

    /**
     * 设置phoneticName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setPhoneticName(SearchStringField value) {
        this.phoneticName = value;
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
     * 获取pricingGroup属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getPricingGroup() {
        return pricingGroup;
    }

    /**
     * 设置pricingGroup属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setPricingGroup(SearchMultiSelectField value) {
        this.pricingGroup = value;
    }

    /**
     * 获取pricingItem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getPricingItem() {
        return pricingItem;
    }

    /**
     * 设置pricingItem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setPricingItem(SearchMultiSelectField value) {
        this.pricingItem = value;
    }

    /**
     * 获取printTransactions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getPrintTransactions() {
        return printTransactions;
    }

    /**
     * 设置printTransactions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setPrintTransactions(SearchBooleanField value) {
        this.printTransactions = value;
    }

    /**
     * 获取prospectDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getProspectDate() {
        return prospectDate;
    }

    /**
     * 设置prospectDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setProspectDate(SearchDateField value) {
        this.prospectDate = value;
    }

    /**
     * 获取pstExempt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getPstExempt() {
        return pstExempt;
    }

    /**
     * 设置pstExempt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setPstExempt(SearchBooleanField value) {
        this.pstExempt = value;
    }

    /**
     * 获取receivablesAccount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getReceivablesAccount() {
        return receivablesAccount;
    }

    /**
     * 设置receivablesAccount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setReceivablesAccount(SearchMultiSelectField value) {
        this.receivablesAccount = value;
    }

    /**
     * 获取reminderDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getReminderDate() {
        return reminderDate;
    }

    /**
     * 设置reminderDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setReminderDate(SearchDateField value) {
        this.reminderDate = value;
    }

    /**
     * 获取resaleNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getResaleNumber() {
        return resaleNumber;
    }

    /**
     * 设置resaleNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setResaleNumber(SearchStringField value) {
        this.resaleNumber = value;
    }

    /**
     * 获取role属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getRole() {
        return role;
    }

    /**
     * 设置role属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setRole(SearchMultiSelectField value) {
        this.role = value;
    }

    /**
     * 获取salesReadiness属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getSalesReadiness() {
        return salesReadiness;
    }

    /**
     * 设置salesReadiness属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setSalesReadiness(SearchMultiSelectField value) {
        this.salesReadiness = value;
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
     * 获取salutation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getSalutation() {
        return salutation;
    }

    /**
     * 设置salutation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setSalutation(SearchStringField value) {
        this.salutation = value;
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
     * 获取shippingItem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getShippingItem() {
        return shippingItem;
    }

    /**
     * 设置shippingItem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setShippingItem(SearchMultiSelectField value) {
        this.shippingItem = value;
    }

    /**
     * 获取sourceSite属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getSourceSite() {
        return sourceSite;
    }

    /**
     * 设置sourceSite属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setSourceSite(SearchMultiSelectField value) {
        this.sourceSite = value;
    }

    /**
     * 获取sourceSiteId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getSourceSiteId() {
        return sourceSiteId;
    }

    /**
     * 设置sourceSiteId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setSourceSiteId(SearchMultiSelectField value) {
        this.sourceSiteId = value;
    }

    /**
     * 获取stage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getStage() {
        return stage;
    }

    /**
     * 设置stage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setStage(SearchEnumMultiSelectField value) {
        this.stage = value;
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
     * 获取state属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getState() {
        return state;
    }

    /**
     * 设置state属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setState(SearchStringField value) {
        this.state = value;
    }

    /**
     * 获取subsidBought属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getSubsidBought() {
        return subsidBought;
    }

    /**
     * 设置subsidBought属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setSubsidBought(SearchMultiSelectField value) {
        this.subsidBought = value;
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
     * 获取taxable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getTaxable() {
        return taxable;
    }

    /**
     * 设置taxable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setTaxable(SearchBooleanField value) {
        this.taxable = value;
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
     * 获取territory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getTerritory() {
        return territory;
    }

    /**
     * 设置territory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setTerritory(SearchMultiSelectField value) {
        this.territory = value;
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
     * 获取unbilledOrders属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getUnbilledOrders() {
        return unbilledOrders;
    }

    /**
     * 设置unbilledOrders属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setUnbilledOrders(SearchDoubleField value) {
        this.unbilledOrders = value;
    }

    /**
     * 获取url属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getUrl() {
        return url;
    }

    /**
     * 设置url属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setUrl(SearchStringField value) {
        this.url = value;
    }

    /**
     * 获取vatRegNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getVatRegNumber() {
        return vatRegNumber;
    }

    /**
     * 设置vatRegNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setVatRegNumber(SearchStringField value) {
        this.vatRegNumber = value;
    }

    /**
     * 获取webLead属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getWebLead() {
        return webLead;
    }

    /**
     * 设置webLead属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setWebLead(SearchBooleanField value) {
        this.webLead = value;
    }

    /**
     * 获取zipCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getZipCode() {
        return zipCode;
    }

    /**
     * 设置zipCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setZipCode(SearchStringField value) {
        this.zipCode = value;
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
