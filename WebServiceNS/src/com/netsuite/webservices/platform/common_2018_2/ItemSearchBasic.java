
package com.netsuite.webservices.platform.common_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 * <p>ItemSearchBasic complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ItemSearchBasic">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRecordBasic">
 *       &lt;sequence>
 *         &lt;element name="accBookRevRecForecastRule" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="account" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="accountingBook" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="accountingBookAmortization" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="accountingBookCreatePlansOn" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="accountingBookRevRecRule" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="accountingBookRevRecSchedule" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="allowedShippingMethod" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="alternateDemandSourceItem" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="atpLeadTime" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="atpMethod" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="autoLeadTime" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="autoPreferredStockLevel" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="autoReorderPoint" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="availableToPartners" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="averageCost" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="backwardConsumptionDays" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="binNumber" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="binOnHandAvail" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="binOnHandCount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="bomQuantity" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="buildEntireAssembly" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="buildTime" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="buyItNowPrice" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="caption" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="category" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="class" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="component" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="componentOf" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="componentYield" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="contingentRevenueHandling" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="copyDescription" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="correlatedItem" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="correlatedItemCorrelation" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="correlatedItemCount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="correlatedItemLift" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="correlatedItemPurchaseRate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="cost" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="costAccountingStatus" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="costCategory" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="costEstimate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="costEstimateType" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="costingMethod" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="countryOfManufacture" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="created" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="createJob" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="createRevenuePlansOn" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="dateViewed" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="daysBeforeExpiration" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="defaultReturnCost" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="defaultShippingMethod" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="deferRevRec" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="demandModifier" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="demandSource" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="demandTimeFence" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="department" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="directRevenuePosting" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="displayIneBayStore" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="displayName" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="distributionCategory" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="distributionNetwork" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="dontShowPrice" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="eBayItemDescription" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="eBayItemSubtitle" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="eBayItemTitle" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="ebayRelistingOption" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="effectiveBomControl" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="effectiveDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="effectiveRevision" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="endAuctionsWhenOutOfStock" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="excludeFromSitemap" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="externalId" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="externalIdString" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="featuredDescription" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="feedDescription" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="feedName" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="fixedLotSize" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="forwardConsumptionDays" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="fraudRisk" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="froogleProductFeed" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="fxCost" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="generateAccruals" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="giftCertAuthCode" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="giftCertEmail" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="giftCertExpDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="giftCertFrom" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="giftCertMsg" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="giftCertOrigAmt" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="giftCertRecipient" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="imageUrl" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="includeChildren" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="internalId" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="internalIdNumber" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="inventoryLocation" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="invtClassification" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="invtCountInterval" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="isAvailable" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isDropShipItem" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isFulfillable" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isGcoCompliant" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isInactive" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isLotItem" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isOnline" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isPreferredVendor" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isSerialItem" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isSpecialOrderItem" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isSpecialWorkOrderItem" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isStorePickupAllowed" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="issueProduct" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="isTaxable" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isVsoeBundle" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isWip" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="itemId" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="itemRevenueCategory" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="itemUrl" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="lastInvtCountDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="lastModifiedDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="lastPurchasePrice" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="lastQuantityAvailableChange" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="leadTime" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="listingDuration" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="location" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="locationAllowStorePickup" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="locationAtpLeadTime" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="locationAverageCost" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="locationBuildTime" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="locationCost" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="locationCostAccountingStatus" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="locationDefaultReturnCost" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="locationDemandSource" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="locationDemandTimeFence" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="locationFixedLotSize" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="locationInventoryCostTemplate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="locationInvtClassification" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="locationInvtCountInterval" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="locationLastInvtCountDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="locationLeadTime" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="locationNextInvtCountDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="locationPeriodicLotSizeDays" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="locationPeriodicLotSizeType" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="locationPreferredStockLevel" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="locationQtyAvailForStorePickup" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="locationQuantityAvailable" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="locationQuantityBackOrdered" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="locationQuantityCommitted" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="locationQuantityInTransit" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="locationQuantityOnHand" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="locationQuantityOnOrder" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="locationReorderPoint" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="locationRescheduleInDays" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="locationRescheduleOutDays" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="locationSafetyStockLevel" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="locationStorePickupBufferStock" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="locationSupplyLotSizingMethod" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="locationSupplyTimeFence" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="locationSupplyType" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="locationTotalValue" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="locBackwardConsumptionDays" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="locForwardConsumptionDays" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="manufacturer" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="manufactureraddr1" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="manufacturerCity" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="manufacturerState" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="manufacturerTariff" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="manufacturerTaxId" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="manufacturerZip" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="manufacturingChargeItem" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="matchBillToReceipt" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="matrix" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="matrixChild" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="metaTagHtml" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="minimumQuantity" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="mossApplies" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="mpn" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="multManufactureAddr" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="nexTagCategory" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="nexTagProductFeed" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="nextInvtCountDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="numActiveListings" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="numberAllowedDownloads" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="numCurrentlyListed" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="obsoleteDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="obsoleteRevision" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="offerSupport" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="onlineCustomerPrice" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="onSpecial" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="otherVendor" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="outOfStockBehavior" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="overallQuantityPricingType" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="overheadType" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="pageTitle" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="parent" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="periodicLotSizeDays" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="periodicLotSizeType" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="preferenceCriterion" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="preferredBin" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="preferredLocation" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="preferredStockLevel" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="preferredStockLevelDays" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="price" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="pricesIncludeTax" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="pricingGroup" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="primaryCategory" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="purchaseOrderAmount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="purchaseOrderQuantity" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="purchaseOrderQuantityDiff" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="purchaseUnit" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="quantityAvailable" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="quantityBackOrdered" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="quantityCommitted" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="quantityOnHand" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="quantityOnOrder" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="quantityPricingSchedule" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="receiptAmount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="receiptQuantity" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="receiptQuantityDiff" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="reorderMultiple" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="reorderPoint" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="rescheduleInDays" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="rescheduleOutDays" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="reservePrice" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="revenueAllocationGroup" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="revenueRecognitionRule" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="revRecForecastRule" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="revRecSchedule" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="roundUpAsComponent" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="safetyStockLevel" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="safetyStockLevelDays" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="salesDescription" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="saleUnit" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="sameAsPrimaryBookAmortization" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="sameAsPrimaryBookRevRec" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="scheduleBCode" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="scheduleBNumber" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="scheduleBQuantity" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="searchKeywords" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="seasonalDemand" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="sellOnEBay" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="serialNumber" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="serialNumberLocation" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="shipIndividually" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="shipPackage" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="shippingCarrier" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="shippingRate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="shoppingDotComCategory" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="shoppingProductFeed" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="shopzillaCategoryId" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="shopzillaProductFeed" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="sitemapPriority" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="softDescriptor" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="startingPrice" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="stockDescription" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="stockUnit" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="storeDescription" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="subsidiary" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="subType" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="supplyLotSizingMethod" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="supplyReplenishmentMethod" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="supplyTimeFence" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="supplyType" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="taxCode" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="taxSchedule" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="thumbnailUrl" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="totalValue" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="trackLandedCost" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="transferPrice" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="type" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="unitsType" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="upcCode" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="urlComponent" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="useBins" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="useComponentYield" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="useMarginalRates" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="vendor" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="vendorCode" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="vendorCost" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="vendorCostEntered" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="vendorName" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="vendorPriceCurrency" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="vsoeDeferral" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="vsoeDelivered" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="vsoePermitDiscount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="vsoePrice" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="vsoeSopGroup" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="webSite" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="weight" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="yahooProductFeed" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
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
@XmlType(name = "ItemSearchBasic", propOrder = {
    "accBookRevRecForecastRule",
    "account",
    "accountingBook",
    "accountingBookAmortization",
    "accountingBookCreatePlansOn",
    "accountingBookRevRecRule",
    "accountingBookRevRecSchedule",
    "allowedShippingMethod",
    "alternateDemandSourceItem",
    "atpLeadTime",
    "atpMethod",
    "autoLeadTime",
    "autoPreferredStockLevel",
    "autoReorderPoint",
    "availableToPartners",
    "averageCost",
    "backwardConsumptionDays",
    "binNumber",
    "binOnHandAvail",
    "binOnHandCount",
    "bomQuantity",
    "buildEntireAssembly",
    "buildTime",
    "buyItNowPrice",
    "caption",
    "category",
    "clazz",
    "component",
    "componentOf",
    "componentYield",
    "contingentRevenueHandling",
    "copyDescription",
    "correlatedItem",
    "correlatedItemCorrelation",
    "correlatedItemCount",
    "correlatedItemLift",
    "correlatedItemPurchaseRate",
    "cost",
    "costAccountingStatus",
    "costCategory",
    "costEstimate",
    "costEstimateType",
    "costingMethod",
    "countryOfManufacture",
    "created",
    "createJob",
    "createRevenuePlansOn",
    "dateViewed",
    "daysBeforeExpiration",
    "defaultReturnCost",
    "defaultShippingMethod",
    "deferRevRec",
    "demandModifier",
    "demandSource",
    "demandTimeFence",
    "department",
    "directRevenuePosting",
    "displayIneBayStore",
    "displayName",
    "distributionCategory",
    "distributionNetwork",
    "dontShowPrice",
    "eBayItemDescription",
    "eBayItemSubtitle",
    "eBayItemTitle",
    "ebayRelistingOption",
    "effectiveBomControl",
    "effectiveDate",
    "effectiveRevision",
    "endAuctionsWhenOutOfStock",
    "excludeFromSitemap",
    "externalId",
    "externalIdString",
    "featuredDescription",
    "feedDescription",
    "feedName",
    "fixedLotSize",
    "forwardConsumptionDays",
    "fraudRisk",
    "froogleProductFeed",
    "fxCost",
    "generateAccruals",
    "giftCertAuthCode",
    "giftCertEmail",
    "giftCertExpDate",
    "giftCertFrom",
    "giftCertMsg",
    "giftCertOrigAmt",
    "giftCertRecipient",
    "imageUrl",
    "includeChildren",
    "internalId",
    "internalIdNumber",
    "inventoryLocation",
    "invtClassification",
    "invtCountInterval",
    "isAvailable",
    "isDropShipItem",
    "isFulfillable",
    "isGcoCompliant",
    "isInactive",
    "isLotItem",
    "isOnline",
    "isPreferredVendor",
    "isSerialItem",
    "isSpecialOrderItem",
    "isSpecialWorkOrderItem",
    "isStorePickupAllowed",
    "issueProduct",
    "isTaxable",
    "isVsoeBundle",
    "isWip",
    "itemId",
    "itemRevenueCategory",
    "itemUrl",
    "lastInvtCountDate",
    "lastModifiedDate",
    "lastPurchasePrice",
    "lastQuantityAvailableChange",
    "leadTime",
    "listingDuration",
    "location",
    "locationAllowStorePickup",
    "locationAtpLeadTime",
    "locationAverageCost",
    "locationBuildTime",
    "locationCost",
    "locationCostAccountingStatus",
    "locationDefaultReturnCost",
    "locationDemandSource",
    "locationDemandTimeFence",
    "locationFixedLotSize",
    "locationInventoryCostTemplate",
    "locationInvtClassification",
    "locationInvtCountInterval",
    "locationLastInvtCountDate",
    "locationLeadTime",
    "locationNextInvtCountDate",
    "locationPeriodicLotSizeDays",
    "locationPeriodicLotSizeType",
    "locationPreferredStockLevel",
    "locationQtyAvailForStorePickup",
    "locationQuantityAvailable",
    "locationQuantityBackOrdered",
    "locationQuantityCommitted",
    "locationQuantityInTransit",
    "locationQuantityOnHand",
    "locationQuantityOnOrder",
    "locationReorderPoint",
    "locationRescheduleInDays",
    "locationRescheduleOutDays",
    "locationSafetyStockLevel",
    "locationStorePickupBufferStock",
    "locationSupplyLotSizingMethod",
    "locationSupplyTimeFence",
    "locationSupplyType",
    "locationTotalValue",
    "locBackwardConsumptionDays",
    "locForwardConsumptionDays",
    "manufacturer",
    "manufactureraddr1",
    "manufacturerCity",
    "manufacturerState",
    "manufacturerTariff",
    "manufacturerTaxId",
    "manufacturerZip",
    "manufacturingChargeItem",
    "matchBillToReceipt",
    "matrix",
    "matrixChild",
    "metaTagHtml",
    "minimumQuantity",
    "mossApplies",
    "mpn",
    "multManufactureAddr",
    "nexTagCategory",
    "nexTagProductFeed",
    "nextInvtCountDate",
    "numActiveListings",
    "numberAllowedDownloads",
    "numCurrentlyListed",
    "obsoleteDate",
    "obsoleteRevision",
    "offerSupport",
    "onlineCustomerPrice",
    "onSpecial",
    "otherVendor",
    "outOfStockBehavior",
    "overallQuantityPricingType",
    "overheadType",
    "pageTitle",
    "parent",
    "periodicLotSizeDays",
    "periodicLotSizeType",
    "preferenceCriterion",
    "preferredBin",
    "preferredLocation",
    "preferredStockLevel",
    "preferredStockLevelDays",
    "price",
    "pricesIncludeTax",
    "pricingGroup",
    "primaryCategory",
    "purchaseOrderAmount",
    "purchaseOrderQuantity",
    "purchaseOrderQuantityDiff",
    "purchaseUnit",
    "quantityAvailable",
    "quantityBackOrdered",
    "quantityCommitted",
    "quantityOnHand",
    "quantityOnOrder",
    "quantityPricingSchedule",
    "receiptAmount",
    "receiptQuantity",
    "receiptQuantityDiff",
    "reorderMultiple",
    "reorderPoint",
    "rescheduleInDays",
    "rescheduleOutDays",
    "reservePrice",
    "revenueAllocationGroup",
    "revenueRecognitionRule",
    "revRecForecastRule",
    "revRecSchedule",
    "roundUpAsComponent",
    "safetyStockLevel",
    "safetyStockLevelDays",
    "salesDescription",
    "saleUnit",
    "sameAsPrimaryBookAmortization",
    "sameAsPrimaryBookRevRec",
    "scheduleBCode",
    "scheduleBNumber",
    "scheduleBQuantity",
    "searchKeywords",
    "seasonalDemand",
    "sellOnEBay",
    "serialNumber",
    "serialNumberLocation",
    "shipIndividually",
    "shipPackage",
    "shippingCarrier",
    "shippingRate",
    "shoppingDotComCategory",
    "shoppingProductFeed",
    "shopzillaCategoryId",
    "shopzillaProductFeed",
    "sitemapPriority",
    "softDescriptor",
    "startingPrice",
    "stockDescription",
    "stockUnit",
    "storeDescription",
    "subsidiary",
    "subType",
    "supplyLotSizingMethod",
    "supplyReplenishmentMethod",
    "supplyTimeFence",
    "supplyType",
    "taxCode",
    "taxSchedule",
    "thumbnailUrl",
    "totalValue",
    "trackLandedCost",
    "transferPrice",
    "type",
    "unitsType",
    "upcCode",
    "urlComponent",
    "useBins",
    "useComponentYield",
    "useMarginalRates",
    "vendor",
    "vendorCode",
    "vendorCost",
    "vendorCostEntered",
    "vendorName",
    "vendorPriceCurrency",
    "vsoeDeferral",
    "vsoeDelivered",
    "vsoePermitDiscount",
    "vsoePrice",
    "vsoeSopGroup",
    "webSite",
    "weight",
    "yahooProductFeed",
    "customFieldList"
})
public class ItemSearchBasic
    extends SearchRecordBasic
{

    protected SearchMultiSelectField accBookRevRecForecastRule;
    protected SearchMultiSelectField account;
    protected SearchMultiSelectField accountingBook;
    protected SearchMultiSelectField accountingBookAmortization;
    protected SearchMultiSelectField accountingBookCreatePlansOn;
    protected SearchMultiSelectField accountingBookRevRecRule;
    protected SearchMultiSelectField accountingBookRevRecSchedule;
    protected SearchMultiSelectField allowedShippingMethod;
    protected SearchMultiSelectField alternateDemandSourceItem;
    protected SearchDoubleField atpLeadTime;
    protected SearchEnumMultiSelectField atpMethod;
    protected SearchBooleanField autoLeadTime;
    protected SearchBooleanField autoPreferredStockLevel;
    protected SearchBooleanField autoReorderPoint;
    protected SearchBooleanField availableToPartners;
    protected SearchDoubleField averageCost;
    protected SearchLongField backwardConsumptionDays;
    protected SearchStringField binNumber;
    protected SearchDoubleField binOnHandAvail;
    protected SearchDoubleField binOnHandCount;
    protected SearchDoubleField bomQuantity;
    protected SearchBooleanField buildEntireAssembly;
    protected SearchDoubleField buildTime;
    protected SearchDoubleField buyItNowPrice;
    protected SearchStringField caption;
    protected SearchMultiSelectField category;
    @XmlElement(name = "class")
    protected SearchMultiSelectField clazz;
    protected SearchMultiSelectField component;
    protected SearchMultiSelectField componentOf;
    protected SearchDoubleField componentYield;
    protected SearchBooleanField contingentRevenueHandling;
    protected SearchBooleanField copyDescription;
    protected SearchMultiSelectField correlatedItem;
    protected SearchDoubleField correlatedItemCorrelation;
    protected SearchLongField correlatedItemCount;
    protected SearchDoubleField correlatedItemLift;
    protected SearchDoubleField correlatedItemPurchaseRate;
    protected SearchDoubleField cost;
    protected SearchEnumMultiSelectField costAccountingStatus;
    protected SearchMultiSelectField costCategory;
    protected SearchDoubleField costEstimate;
    protected SearchEnumMultiSelectField costEstimateType;
    protected SearchEnumMultiSelectField costingMethod;
    protected SearchEnumMultiSelectField countryOfManufacture;
    protected SearchDateField created;
    protected SearchBooleanField createJob;
    protected SearchMultiSelectField createRevenuePlansOn;
    protected SearchDateField dateViewed;
    protected SearchDoubleField daysBeforeExpiration;
    protected SearchDoubleField defaultReturnCost;
    protected SearchMultiSelectField defaultShippingMethod;
    protected SearchBooleanField deferRevRec;
    protected SearchDoubleField demandModifier;
    protected SearchEnumMultiSelectField demandSource;
    protected SearchLongField demandTimeFence;
    protected SearchMultiSelectField department;
    protected SearchBooleanField directRevenuePosting;
    protected SearchBooleanField displayIneBayStore;
    protected SearchStringField displayName;
    protected SearchMultiSelectField distributionCategory;
    protected SearchMultiSelectField distributionNetwork;
    protected SearchBooleanField dontShowPrice;
    protected SearchStringField eBayItemDescription;
    protected SearchStringField eBayItemSubtitle;
    protected SearchStringField eBayItemTitle;
    protected SearchEnumMultiSelectField ebayRelistingOption;
    protected SearchEnumMultiSelectField effectiveBomControl;
    protected SearchDateField effectiveDate;
    protected SearchMultiSelectField effectiveRevision;
    protected SearchBooleanField endAuctionsWhenOutOfStock;
    protected SearchBooleanField excludeFromSitemap;
    protected SearchMultiSelectField externalId;
    protected SearchStringField externalIdString;
    protected SearchStringField featuredDescription;
    protected SearchStringField feedDescription;
    protected SearchStringField feedName;
    protected SearchDoubleField fixedLotSize;
    protected SearchLongField forwardConsumptionDays;
    protected SearchEnumMultiSelectField fraudRisk;
    protected SearchBooleanField froogleProductFeed;
    protected SearchDoubleField fxCost;
    protected SearchBooleanField generateAccruals;
    protected SearchStringField giftCertAuthCode;
    protected SearchStringField giftCertEmail;
    protected SearchDateField giftCertExpDate;
    protected SearchStringField giftCertFrom;
    protected SearchStringField giftCertMsg;
    protected SearchStringField giftCertOrigAmt;
    protected SearchStringField giftCertRecipient;
    protected SearchStringField imageUrl;
    protected SearchBooleanField includeChildren;
    protected SearchMultiSelectField internalId;
    protected SearchLongField internalIdNumber;
    protected SearchMultiSelectField inventoryLocation;
    protected SearchEnumMultiSelectField invtClassification;
    protected SearchLongField invtCountInterval;
    protected SearchBooleanField isAvailable;
    protected SearchBooleanField isDropShipItem;
    protected SearchBooleanField isFulfillable;
    protected SearchBooleanField isGcoCompliant;
    protected SearchBooleanField isInactive;
    protected SearchBooleanField isLotItem;
    protected SearchBooleanField isOnline;
    protected SearchBooleanField isPreferredVendor;
    protected SearchBooleanField isSerialItem;
    protected SearchBooleanField isSpecialOrderItem;
    protected SearchBooleanField isSpecialWorkOrderItem;
    protected SearchBooleanField isStorePickupAllowed;
    protected SearchMultiSelectField issueProduct;
    protected SearchBooleanField isTaxable;
    protected SearchBooleanField isVsoeBundle;
    protected SearchBooleanField isWip;
    protected SearchStringField itemId;
    protected SearchMultiSelectField itemRevenueCategory;
    protected SearchStringField itemUrl;
    protected SearchDateField lastInvtCountDate;
    protected SearchDateField lastModifiedDate;
    protected SearchDoubleField lastPurchasePrice;
    protected SearchDateField lastQuantityAvailableChange;
    protected SearchLongField leadTime;
    protected SearchEnumMultiSelectField listingDuration;
    protected SearchMultiSelectField location;
    protected SearchBooleanField locationAllowStorePickup;
    protected SearchDoubleField locationAtpLeadTime;
    protected SearchDoubleField locationAverageCost;
    protected SearchDoubleField locationBuildTime;
    protected SearchDoubleField locationCost;
    protected SearchEnumMultiSelectField locationCostAccountingStatus;
    protected SearchDoubleField locationDefaultReturnCost;
    protected SearchEnumMultiSelectField locationDemandSource;
    protected SearchLongField locationDemandTimeFence;
    protected SearchDoubleField locationFixedLotSize;
    protected SearchMultiSelectField locationInventoryCostTemplate;
    protected SearchEnumMultiSelectField locationInvtClassification;
    protected SearchLongField locationInvtCountInterval;
    protected SearchDateField locationLastInvtCountDate;
    protected SearchLongField locationLeadTime;
    protected SearchDateField locationNextInvtCountDate;
    protected SearchLongField locationPeriodicLotSizeDays;
    protected SearchEnumMultiSelectField locationPeriodicLotSizeType;
    protected SearchDoubleField locationPreferredStockLevel;
    protected SearchDoubleField locationQtyAvailForStorePickup;
    protected SearchDoubleField locationQuantityAvailable;
    protected SearchDoubleField locationQuantityBackOrdered;
    protected SearchDoubleField locationQuantityCommitted;
    protected SearchDoubleField locationQuantityInTransit;
    protected SearchDoubleField locationQuantityOnHand;
    protected SearchDoubleField locationQuantityOnOrder;
    protected SearchDoubleField locationReorderPoint;
    protected SearchLongField locationRescheduleInDays;
    protected SearchLongField locationRescheduleOutDays;
    protected SearchDoubleField locationSafetyStockLevel;
    protected SearchDoubleField locationStorePickupBufferStock;
    protected SearchEnumMultiSelectField locationSupplyLotSizingMethod;
    protected SearchLongField locationSupplyTimeFence;
    protected SearchEnumMultiSelectField locationSupplyType;
    protected SearchDoubleField locationTotalValue;
    protected SearchLongField locBackwardConsumptionDays;
    protected SearchLongField locForwardConsumptionDays;
    protected SearchStringField manufacturer;
    protected SearchStringField manufactureraddr1;
    protected SearchStringField manufacturerCity;
    protected SearchStringField manufacturerState;
    protected SearchStringField manufacturerTariff;
    protected SearchStringField manufacturerTaxId;
    protected SearchStringField manufacturerZip;
    protected SearchBooleanField manufacturingChargeItem;
    protected SearchBooleanField matchBillToReceipt;
    protected SearchBooleanField matrix;
    protected SearchBooleanField matrixChild;
    protected SearchStringField metaTagHtml;
    protected SearchLongField minimumQuantity;
    protected SearchBooleanField mossApplies;
    protected SearchStringField mpn;
    protected SearchBooleanField multManufactureAddr;
    protected SearchStringField nexTagCategory;
    protected SearchBooleanField nexTagProductFeed;
    protected SearchDateField nextInvtCountDate;
    protected SearchLongField numActiveListings;
    protected SearchDoubleField numberAllowedDownloads;
    protected SearchLongField numCurrentlyListed;
    protected SearchDateField obsoleteDate;
    protected SearchMultiSelectField obsoleteRevision;
    protected SearchBooleanField offerSupport;
    protected SearchDoubleField onlineCustomerPrice;
    protected SearchBooleanField onSpecial;
    protected SearchMultiSelectField otherVendor;
    protected SearchMultiSelectField outOfStockBehavior;
    protected SearchEnumMultiSelectField overallQuantityPricingType;
    protected SearchEnumMultiSelectField overheadType;
    protected SearchStringField pageTitle;
    protected SearchMultiSelectField parent;
    protected SearchLongField periodicLotSizeDays;
    protected SearchEnumMultiSelectField periodicLotSizeType;
    protected SearchStringField preferenceCriterion;
    protected SearchBooleanField preferredBin;
    protected SearchMultiSelectField preferredLocation;
    protected SearchDoubleField preferredStockLevel;
    protected SearchLongField preferredStockLevelDays;
    protected SearchDoubleField price;
    protected SearchBooleanField pricesIncludeTax;
    protected SearchMultiSelectField pricingGroup;
    protected SearchLongField primaryCategory;
    protected SearchDoubleField purchaseOrderAmount;
    protected SearchDoubleField purchaseOrderQuantity;
    protected SearchDoubleField purchaseOrderQuantityDiff;
    protected SearchMultiSelectField purchaseUnit;
    protected SearchDoubleField quantityAvailable;
    protected SearchDoubleField quantityBackOrdered;
    protected SearchDoubleField quantityCommitted;
    protected SearchDoubleField quantityOnHand;
    protected SearchDoubleField quantityOnOrder;
    protected SearchMultiSelectField quantityPricingSchedule;
    protected SearchDoubleField receiptAmount;
    protected SearchDoubleField receiptQuantity;
    protected SearchDoubleField receiptQuantityDiff;
    protected SearchLongField reorderMultiple;
    protected SearchDoubleField reorderPoint;
    protected SearchLongField rescheduleInDays;
    protected SearchLongField rescheduleOutDays;
    protected SearchDoubleField reservePrice;
    protected SearchMultiSelectField revenueAllocationGroup;
    protected SearchMultiSelectField revenueRecognitionRule;
    protected SearchMultiSelectField revRecForecastRule;
    protected SearchMultiSelectField revRecSchedule;
    protected SearchBooleanField roundUpAsComponent;
    protected SearchDoubleField safetyStockLevel;
    protected SearchLongField safetyStockLevelDays;
    protected SearchStringField salesDescription;
    protected SearchMultiSelectField saleUnit;
    protected SearchBooleanField sameAsPrimaryBookAmortization;
    protected SearchBooleanField sameAsPrimaryBookRevRec;
    protected SearchEnumMultiSelectField scheduleBCode;
    protected SearchStringField scheduleBNumber;
    protected SearchStringField scheduleBQuantity;
    protected SearchStringField searchKeywords;
    protected SearchBooleanField seasonalDemand;
    protected SearchBooleanField sellOnEBay;
    protected SearchStringField serialNumber;
    protected SearchMultiSelectField serialNumberLocation;
    protected SearchBooleanField shipIndividually;
    protected SearchMultiSelectField shipPackage;
    protected SearchEnumMultiSelectField shippingCarrier;
    protected SearchDoubleField shippingRate;
    protected SearchStringField shoppingDotComCategory;
    protected SearchBooleanField shoppingProductFeed;
    protected SearchLongField shopzillaCategoryId;
    protected SearchBooleanField shopzillaProductFeed;
    protected SearchEnumMultiSelectField sitemapPriority;
    protected SearchMultiSelectField softDescriptor;
    protected SearchDoubleField startingPrice;
    protected SearchStringField stockDescription;
    protected SearchMultiSelectField stockUnit;
    protected SearchStringField storeDescription;
    protected SearchMultiSelectField subsidiary;
    protected SearchEnumMultiSelectField subType;
    protected SearchEnumMultiSelectField supplyLotSizingMethod;
    protected SearchEnumMultiSelectField supplyReplenishmentMethod;
    protected SearchLongField supplyTimeFence;
    protected SearchEnumMultiSelectField supplyType;
    protected SearchMultiSelectField taxCode;
    protected SearchMultiSelectField taxSchedule;
    protected SearchStringField thumbnailUrl;
    protected SearchDoubleField totalValue;
    protected SearchBooleanField trackLandedCost;
    protected SearchDoubleField transferPrice;
    protected SearchEnumMultiSelectField type;
    protected SearchMultiSelectField unitsType;
    protected SearchStringField upcCode;
    protected SearchStringField urlComponent;
    protected SearchBooleanField useBins;
    protected SearchBooleanField useComponentYield;
    protected SearchBooleanField useMarginalRates;
    protected SearchMultiSelectField vendor;
    protected SearchStringField vendorCode;
    protected SearchDoubleField vendorCost;
    protected SearchDoubleField vendorCostEntered;
    protected SearchStringField vendorName;
    protected SearchMultiSelectField vendorPriceCurrency;
    protected SearchEnumMultiSelectField vsoeDeferral;
    protected SearchBooleanField vsoeDelivered;
    protected SearchEnumMultiSelectField vsoePermitDiscount;
    protected SearchDoubleField vsoePrice;
    protected SearchEnumMultiSelectField vsoeSopGroup;
    protected SearchMultiSelectField webSite;
    protected SearchDoubleField weight;
    protected SearchBooleanField yahooProductFeed;
    protected SearchCustomFieldList customFieldList;

    /**
     * 获取accBookRevRecForecastRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getAccBookRevRecForecastRule() {
        return accBookRevRecForecastRule;
    }

    /**
     * 设置accBookRevRecForecastRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setAccBookRevRecForecastRule(SearchMultiSelectField value) {
        this.accBookRevRecForecastRule = value;
    }

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
     * 获取accountingBook属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getAccountingBook() {
        return accountingBook;
    }

    /**
     * 设置accountingBook属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setAccountingBook(SearchMultiSelectField value) {
        this.accountingBook = value;
    }

    /**
     * 获取accountingBookAmortization属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getAccountingBookAmortization() {
        return accountingBookAmortization;
    }

    /**
     * 设置accountingBookAmortization属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setAccountingBookAmortization(SearchMultiSelectField value) {
        this.accountingBookAmortization = value;
    }

    /**
     * 获取accountingBookCreatePlansOn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getAccountingBookCreatePlansOn() {
        return accountingBookCreatePlansOn;
    }

    /**
     * 设置accountingBookCreatePlansOn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setAccountingBookCreatePlansOn(SearchMultiSelectField value) {
        this.accountingBookCreatePlansOn = value;
    }

    /**
     * 获取accountingBookRevRecRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getAccountingBookRevRecRule() {
        return accountingBookRevRecRule;
    }

    /**
     * 设置accountingBookRevRecRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setAccountingBookRevRecRule(SearchMultiSelectField value) {
        this.accountingBookRevRecRule = value;
    }

    /**
     * 获取accountingBookRevRecSchedule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getAccountingBookRevRecSchedule() {
        return accountingBookRevRecSchedule;
    }

    /**
     * 设置accountingBookRevRecSchedule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setAccountingBookRevRecSchedule(SearchMultiSelectField value) {
        this.accountingBookRevRecSchedule = value;
    }

    /**
     * 获取allowedShippingMethod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getAllowedShippingMethod() {
        return allowedShippingMethod;
    }

    /**
     * 设置allowedShippingMethod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setAllowedShippingMethod(SearchMultiSelectField value) {
        this.allowedShippingMethod = value;
    }

    /**
     * 获取alternateDemandSourceItem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getAlternateDemandSourceItem() {
        return alternateDemandSourceItem;
    }

    /**
     * 设置alternateDemandSourceItem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setAlternateDemandSourceItem(SearchMultiSelectField value) {
        this.alternateDemandSourceItem = value;
    }

    /**
     * 获取atpLeadTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getAtpLeadTime() {
        return atpLeadTime;
    }

    /**
     * 设置atpLeadTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setAtpLeadTime(SearchDoubleField value) {
        this.atpLeadTime = value;
    }

    /**
     * 获取atpMethod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getAtpMethod() {
        return atpMethod;
    }

    /**
     * 设置atpMethod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setAtpMethod(SearchEnumMultiSelectField value) {
        this.atpMethod = value;
    }

    /**
     * 获取autoLeadTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getAutoLeadTime() {
        return autoLeadTime;
    }

    /**
     * 设置autoLeadTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setAutoLeadTime(SearchBooleanField value) {
        this.autoLeadTime = value;
    }

    /**
     * 获取autoPreferredStockLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getAutoPreferredStockLevel() {
        return autoPreferredStockLevel;
    }

    /**
     * 设置autoPreferredStockLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setAutoPreferredStockLevel(SearchBooleanField value) {
        this.autoPreferredStockLevel = value;
    }

    /**
     * 获取autoReorderPoint属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getAutoReorderPoint() {
        return autoReorderPoint;
    }

    /**
     * 设置autoReorderPoint属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setAutoReorderPoint(SearchBooleanField value) {
        this.autoReorderPoint = value;
    }

    /**
     * 获取availableToPartners属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getAvailableToPartners() {
        return availableToPartners;
    }

    /**
     * 设置availableToPartners属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setAvailableToPartners(SearchBooleanField value) {
        this.availableToPartners = value;
    }

    /**
     * 获取averageCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getAverageCost() {
        return averageCost;
    }

    /**
     * 设置averageCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setAverageCost(SearchDoubleField value) {
        this.averageCost = value;
    }

    /**
     * 获取backwardConsumptionDays属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getBackwardConsumptionDays() {
        return backwardConsumptionDays;
    }

    /**
     * 设置backwardConsumptionDays属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setBackwardConsumptionDays(SearchLongField value) {
        this.backwardConsumptionDays = value;
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
     * 获取binOnHandAvail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getBinOnHandAvail() {
        return binOnHandAvail;
    }

    /**
     * 设置binOnHandAvail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setBinOnHandAvail(SearchDoubleField value) {
        this.binOnHandAvail = value;
    }

    /**
     * 获取binOnHandCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getBinOnHandCount() {
        return binOnHandCount;
    }

    /**
     * 设置binOnHandCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setBinOnHandCount(SearchDoubleField value) {
        this.binOnHandCount = value;
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
     * 获取buildTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getBuildTime() {
        return buildTime;
    }

    /**
     * 设置buildTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setBuildTime(SearchDoubleField value) {
        this.buildTime = value;
    }

    /**
     * 获取buyItNowPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getBuyItNowPrice() {
        return buyItNowPrice;
    }

    /**
     * 设置buyItNowPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setBuyItNowPrice(SearchDoubleField value) {
        this.buyItNowPrice = value;
    }

    /**
     * 获取caption属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getCaption() {
        return caption;
    }

    /**
     * 设置caption属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setCaption(SearchStringField value) {
        this.caption = value;
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
     * 获取component属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getComponent() {
        return component;
    }

    /**
     * 设置component属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setComponent(SearchMultiSelectField value) {
        this.component = value;
    }

    /**
     * 获取componentOf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getComponentOf() {
        return componentOf;
    }

    /**
     * 设置componentOf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setComponentOf(SearchMultiSelectField value) {
        this.componentOf = value;
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
     * 获取contingentRevenueHandling属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getContingentRevenueHandling() {
        return contingentRevenueHandling;
    }

    /**
     * 设置contingentRevenueHandling属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setContingentRevenueHandling(SearchBooleanField value) {
        this.contingentRevenueHandling = value;
    }

    /**
     * 获取copyDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getCopyDescription() {
        return copyDescription;
    }

    /**
     * 设置copyDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setCopyDescription(SearchBooleanField value) {
        this.copyDescription = value;
    }

    /**
     * 获取correlatedItem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getCorrelatedItem() {
        return correlatedItem;
    }

    /**
     * 设置correlatedItem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setCorrelatedItem(SearchMultiSelectField value) {
        this.correlatedItem = value;
    }

    /**
     * 获取correlatedItemCorrelation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getCorrelatedItemCorrelation() {
        return correlatedItemCorrelation;
    }

    /**
     * 设置correlatedItemCorrelation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setCorrelatedItemCorrelation(SearchDoubleField value) {
        this.correlatedItemCorrelation = value;
    }

    /**
     * 获取correlatedItemCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getCorrelatedItemCount() {
        return correlatedItemCount;
    }

    /**
     * 设置correlatedItemCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setCorrelatedItemCount(SearchLongField value) {
        this.correlatedItemCount = value;
    }

    /**
     * 获取correlatedItemLift属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getCorrelatedItemLift() {
        return correlatedItemLift;
    }

    /**
     * 设置correlatedItemLift属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setCorrelatedItemLift(SearchDoubleField value) {
        this.correlatedItemLift = value;
    }

    /**
     * 获取correlatedItemPurchaseRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getCorrelatedItemPurchaseRate() {
        return correlatedItemPurchaseRate;
    }

    /**
     * 设置correlatedItemPurchaseRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setCorrelatedItemPurchaseRate(SearchDoubleField value) {
        this.correlatedItemPurchaseRate = value;
    }

    /**
     * 获取cost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getCost() {
        return cost;
    }

    /**
     * 设置cost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setCost(SearchDoubleField value) {
        this.cost = value;
    }

    /**
     * 获取costAccountingStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getCostAccountingStatus() {
        return costAccountingStatus;
    }

    /**
     * 设置costAccountingStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setCostAccountingStatus(SearchEnumMultiSelectField value) {
        this.costAccountingStatus = value;
    }

    /**
     * 获取costCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getCostCategory() {
        return costCategory;
    }

    /**
     * 设置costCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setCostCategory(SearchMultiSelectField value) {
        this.costCategory = value;
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
     * 获取costingMethod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getCostingMethod() {
        return costingMethod;
    }

    /**
     * 设置costingMethod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setCostingMethod(SearchEnumMultiSelectField value) {
        this.costingMethod = value;
    }

    /**
     * 获取countryOfManufacture属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getCountryOfManufacture() {
        return countryOfManufacture;
    }

    /**
     * 设置countryOfManufacture属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setCountryOfManufacture(SearchEnumMultiSelectField value) {
        this.countryOfManufacture = value;
    }

    /**
     * 获取created属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getCreated() {
        return created;
    }

    /**
     * 设置created属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setCreated(SearchDateField value) {
        this.created = value;
    }

    /**
     * 获取createJob属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getCreateJob() {
        return createJob;
    }

    /**
     * 设置createJob属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setCreateJob(SearchBooleanField value) {
        this.createJob = value;
    }

    /**
     * 获取createRevenuePlansOn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getCreateRevenuePlansOn() {
        return createRevenuePlansOn;
    }

    /**
     * 设置createRevenuePlansOn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setCreateRevenuePlansOn(SearchMultiSelectField value) {
        this.createRevenuePlansOn = value;
    }

    /**
     * 获取dateViewed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getDateViewed() {
        return dateViewed;
    }

    /**
     * 设置dateViewed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setDateViewed(SearchDateField value) {
        this.dateViewed = value;
    }

    /**
     * 获取daysBeforeExpiration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getDaysBeforeExpiration() {
        return daysBeforeExpiration;
    }

    /**
     * 设置daysBeforeExpiration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setDaysBeforeExpiration(SearchDoubleField value) {
        this.daysBeforeExpiration = value;
    }

    /**
     * 获取defaultReturnCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getDefaultReturnCost() {
        return defaultReturnCost;
    }

    /**
     * 设置defaultReturnCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setDefaultReturnCost(SearchDoubleField value) {
        this.defaultReturnCost = value;
    }

    /**
     * 获取defaultShippingMethod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getDefaultShippingMethod() {
        return defaultShippingMethod;
    }

    /**
     * 设置defaultShippingMethod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setDefaultShippingMethod(SearchMultiSelectField value) {
        this.defaultShippingMethod = value;
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
     * 获取demandModifier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getDemandModifier() {
        return demandModifier;
    }

    /**
     * 设置demandModifier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setDemandModifier(SearchDoubleField value) {
        this.demandModifier = value;
    }

    /**
     * 获取demandSource属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getDemandSource() {
        return demandSource;
    }

    /**
     * 设置demandSource属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setDemandSource(SearchEnumMultiSelectField value) {
        this.demandSource = value;
    }

    /**
     * 获取demandTimeFence属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getDemandTimeFence() {
        return demandTimeFence;
    }

    /**
     * 设置demandTimeFence属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setDemandTimeFence(SearchLongField value) {
        this.demandTimeFence = value;
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
     * 获取directRevenuePosting属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getDirectRevenuePosting() {
        return directRevenuePosting;
    }

    /**
     * 设置directRevenuePosting属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setDirectRevenuePosting(SearchBooleanField value) {
        this.directRevenuePosting = value;
    }

    /**
     * 获取displayIneBayStore属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getDisplayIneBayStore() {
        return displayIneBayStore;
    }

    /**
     * 设置displayIneBayStore属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setDisplayIneBayStore(SearchBooleanField value) {
        this.displayIneBayStore = value;
    }

    /**
     * 获取displayName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getDisplayName() {
        return displayName;
    }

    /**
     * 设置displayName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setDisplayName(SearchStringField value) {
        this.displayName = value;
    }

    /**
     * 获取distributionCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getDistributionCategory() {
        return distributionCategory;
    }

    /**
     * 设置distributionCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setDistributionCategory(SearchMultiSelectField value) {
        this.distributionCategory = value;
    }

    /**
     * 获取distributionNetwork属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getDistributionNetwork() {
        return distributionNetwork;
    }

    /**
     * 设置distributionNetwork属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setDistributionNetwork(SearchMultiSelectField value) {
        this.distributionNetwork = value;
    }

    /**
     * 获取dontShowPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getDontShowPrice() {
        return dontShowPrice;
    }

    /**
     * 设置dontShowPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setDontShowPrice(SearchBooleanField value) {
        this.dontShowPrice = value;
    }

    /**
     * 获取eBayItemDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getEBayItemDescription() {
        return eBayItemDescription;
    }

    /**
     * 设置eBayItemDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setEBayItemDescription(SearchStringField value) {
        this.eBayItemDescription = value;
    }

    /**
     * 获取eBayItemSubtitle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getEBayItemSubtitle() {
        return eBayItemSubtitle;
    }

    /**
     * 设置eBayItemSubtitle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setEBayItemSubtitle(SearchStringField value) {
        this.eBayItemSubtitle = value;
    }

    /**
     * 获取eBayItemTitle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getEBayItemTitle() {
        return eBayItemTitle;
    }

    /**
     * 设置eBayItemTitle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setEBayItemTitle(SearchStringField value) {
        this.eBayItemTitle = value;
    }

    /**
     * 获取ebayRelistingOption属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getEbayRelistingOption() {
        return ebayRelistingOption;
    }

    /**
     * 设置ebayRelistingOption属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setEbayRelistingOption(SearchEnumMultiSelectField value) {
        this.ebayRelistingOption = value;
    }

    /**
     * 获取effectiveBomControl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getEffectiveBomControl() {
        return effectiveBomControl;
    }

    /**
     * 设置effectiveBomControl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setEffectiveBomControl(SearchEnumMultiSelectField value) {
        this.effectiveBomControl = value;
    }

    /**
     * 获取effectiveDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * 设置effectiveDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setEffectiveDate(SearchDateField value) {
        this.effectiveDate = value;
    }

    /**
     * 获取effectiveRevision属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getEffectiveRevision() {
        return effectiveRevision;
    }

    /**
     * 设置effectiveRevision属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setEffectiveRevision(SearchMultiSelectField value) {
        this.effectiveRevision = value;
    }

    /**
     * 获取endAuctionsWhenOutOfStock属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getEndAuctionsWhenOutOfStock() {
        return endAuctionsWhenOutOfStock;
    }

    /**
     * 设置endAuctionsWhenOutOfStock属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setEndAuctionsWhenOutOfStock(SearchBooleanField value) {
        this.endAuctionsWhenOutOfStock = value;
    }

    /**
     * 获取excludeFromSitemap属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getExcludeFromSitemap() {
        return excludeFromSitemap;
    }

    /**
     * 设置excludeFromSitemap属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setExcludeFromSitemap(SearchBooleanField value) {
        this.excludeFromSitemap = value;
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
     * 获取featuredDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getFeaturedDescription() {
        return featuredDescription;
    }

    /**
     * 设置featuredDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setFeaturedDescription(SearchStringField value) {
        this.featuredDescription = value;
    }

    /**
     * 获取feedDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getFeedDescription() {
        return feedDescription;
    }

    /**
     * 设置feedDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setFeedDescription(SearchStringField value) {
        this.feedDescription = value;
    }

    /**
     * 获取feedName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getFeedName() {
        return feedName;
    }

    /**
     * 设置feedName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setFeedName(SearchStringField value) {
        this.feedName = value;
    }

    /**
     * 获取fixedLotSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getFixedLotSize() {
        return fixedLotSize;
    }

    /**
     * 设置fixedLotSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setFixedLotSize(SearchDoubleField value) {
        this.fixedLotSize = value;
    }

    /**
     * 获取forwardConsumptionDays属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getForwardConsumptionDays() {
        return forwardConsumptionDays;
    }

    /**
     * 设置forwardConsumptionDays属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setForwardConsumptionDays(SearchLongField value) {
        this.forwardConsumptionDays = value;
    }

    /**
     * 获取fraudRisk属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getFraudRisk() {
        return fraudRisk;
    }

    /**
     * 设置fraudRisk属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setFraudRisk(SearchEnumMultiSelectField value) {
        this.fraudRisk = value;
    }

    /**
     * 获取froogleProductFeed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getFroogleProductFeed() {
        return froogleProductFeed;
    }

    /**
     * 设置froogleProductFeed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setFroogleProductFeed(SearchBooleanField value) {
        this.froogleProductFeed = value;
    }

    /**
     * 获取fxCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getFxCost() {
        return fxCost;
    }

    /**
     * 设置fxCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setFxCost(SearchDoubleField value) {
        this.fxCost = value;
    }

    /**
     * 获取generateAccruals属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getGenerateAccruals() {
        return generateAccruals;
    }

    /**
     * 设置generateAccruals属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setGenerateAccruals(SearchBooleanField value) {
        this.generateAccruals = value;
    }

    /**
     * 获取giftCertAuthCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getGiftCertAuthCode() {
        return giftCertAuthCode;
    }

    /**
     * 设置giftCertAuthCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setGiftCertAuthCode(SearchStringField value) {
        this.giftCertAuthCode = value;
    }

    /**
     * 获取giftCertEmail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getGiftCertEmail() {
        return giftCertEmail;
    }

    /**
     * 设置giftCertEmail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setGiftCertEmail(SearchStringField value) {
        this.giftCertEmail = value;
    }

    /**
     * 获取giftCertExpDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getGiftCertExpDate() {
        return giftCertExpDate;
    }

    /**
     * 设置giftCertExpDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setGiftCertExpDate(SearchDateField value) {
        this.giftCertExpDate = value;
    }

    /**
     * 获取giftCertFrom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getGiftCertFrom() {
        return giftCertFrom;
    }

    /**
     * 设置giftCertFrom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setGiftCertFrom(SearchStringField value) {
        this.giftCertFrom = value;
    }

    /**
     * 获取giftCertMsg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getGiftCertMsg() {
        return giftCertMsg;
    }

    /**
     * 设置giftCertMsg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setGiftCertMsg(SearchStringField value) {
        this.giftCertMsg = value;
    }

    /**
     * 获取giftCertOrigAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getGiftCertOrigAmt() {
        return giftCertOrigAmt;
    }

    /**
     * 设置giftCertOrigAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setGiftCertOrigAmt(SearchStringField value) {
        this.giftCertOrigAmt = value;
    }

    /**
     * 获取giftCertRecipient属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getGiftCertRecipient() {
        return giftCertRecipient;
    }

    /**
     * 设置giftCertRecipient属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setGiftCertRecipient(SearchStringField value) {
        this.giftCertRecipient = value;
    }

    /**
     * 获取imageUrl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getImageUrl() {
        return imageUrl;
    }

    /**
     * 设置imageUrl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setImageUrl(SearchStringField value) {
        this.imageUrl = value;
    }

    /**
     * 获取includeChildren属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIncludeChildren() {
        return includeChildren;
    }

    /**
     * 设置includeChildren属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIncludeChildren(SearchBooleanField value) {
        this.includeChildren = value;
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
     * 获取inventoryLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getInventoryLocation() {
        return inventoryLocation;
    }

    /**
     * 设置inventoryLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setInventoryLocation(SearchMultiSelectField value) {
        this.inventoryLocation = value;
    }

    /**
     * 获取invtClassification属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getInvtClassification() {
        return invtClassification;
    }

    /**
     * 设置invtClassification属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setInvtClassification(SearchEnumMultiSelectField value) {
        this.invtClassification = value;
    }

    /**
     * 获取invtCountInterval属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getInvtCountInterval() {
        return invtCountInterval;
    }

    /**
     * 设置invtCountInterval属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setInvtCountInterval(SearchLongField value) {
        this.invtCountInterval = value;
    }

    /**
     * 获取isAvailable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsAvailable() {
        return isAvailable;
    }

    /**
     * 设置isAvailable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsAvailable(SearchBooleanField value) {
        this.isAvailable = value;
    }

    /**
     * 获取isDropShipItem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsDropShipItem() {
        return isDropShipItem;
    }

    /**
     * 设置isDropShipItem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsDropShipItem(SearchBooleanField value) {
        this.isDropShipItem = value;
    }

    /**
     * 获取isFulfillable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsFulfillable() {
        return isFulfillable;
    }

    /**
     * 设置isFulfillable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsFulfillable(SearchBooleanField value) {
        this.isFulfillable = value;
    }

    /**
     * 获取isGcoCompliant属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsGcoCompliant() {
        return isGcoCompliant;
    }

    /**
     * 设置isGcoCompliant属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsGcoCompliant(SearchBooleanField value) {
        this.isGcoCompliant = value;
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
     * 获取isLotItem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsLotItem() {
        return isLotItem;
    }

    /**
     * 设置isLotItem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsLotItem(SearchBooleanField value) {
        this.isLotItem = value;
    }

    /**
     * 获取isOnline属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsOnline() {
        return isOnline;
    }

    /**
     * 设置isOnline属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsOnline(SearchBooleanField value) {
        this.isOnline = value;
    }

    /**
     * 获取isPreferredVendor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsPreferredVendor() {
        return isPreferredVendor;
    }

    /**
     * 设置isPreferredVendor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsPreferredVendor(SearchBooleanField value) {
        this.isPreferredVendor = value;
    }

    /**
     * 获取isSerialItem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsSerialItem() {
        return isSerialItem;
    }

    /**
     * 设置isSerialItem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsSerialItem(SearchBooleanField value) {
        this.isSerialItem = value;
    }

    /**
     * 获取isSpecialOrderItem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsSpecialOrderItem() {
        return isSpecialOrderItem;
    }

    /**
     * 设置isSpecialOrderItem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsSpecialOrderItem(SearchBooleanField value) {
        this.isSpecialOrderItem = value;
    }

    /**
     * 获取isSpecialWorkOrderItem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsSpecialWorkOrderItem() {
        return isSpecialWorkOrderItem;
    }

    /**
     * 设置isSpecialWorkOrderItem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsSpecialWorkOrderItem(SearchBooleanField value) {
        this.isSpecialWorkOrderItem = value;
    }

    /**
     * 获取isStorePickupAllowed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsStorePickupAllowed() {
        return isStorePickupAllowed;
    }

    /**
     * 设置isStorePickupAllowed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsStorePickupAllowed(SearchBooleanField value) {
        this.isStorePickupAllowed = value;
    }

    /**
     * 获取issueProduct属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getIssueProduct() {
        return issueProduct;
    }

    /**
     * 设置issueProduct属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setIssueProduct(SearchMultiSelectField value) {
        this.issueProduct = value;
    }

    /**
     * 获取isTaxable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsTaxable() {
        return isTaxable;
    }

    /**
     * 设置isTaxable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsTaxable(SearchBooleanField value) {
        this.isTaxable = value;
    }

    /**
     * 获取isVsoeBundle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsVsoeBundle() {
        return isVsoeBundle;
    }

    /**
     * 设置isVsoeBundle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsVsoeBundle(SearchBooleanField value) {
        this.isVsoeBundle = value;
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
     * 获取itemId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getItemId() {
        return itemId;
    }

    /**
     * 设置itemId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setItemId(SearchStringField value) {
        this.itemId = value;
    }

    /**
     * 获取itemRevenueCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getItemRevenueCategory() {
        return itemRevenueCategory;
    }

    /**
     * 设置itemRevenueCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setItemRevenueCategory(SearchMultiSelectField value) {
        this.itemRevenueCategory = value;
    }

    /**
     * 获取itemUrl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getItemUrl() {
        return itemUrl;
    }

    /**
     * 设置itemUrl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setItemUrl(SearchStringField value) {
        this.itemUrl = value;
    }

    /**
     * 获取lastInvtCountDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getLastInvtCountDate() {
        return lastInvtCountDate;
    }

    /**
     * 设置lastInvtCountDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setLastInvtCountDate(SearchDateField value) {
        this.lastInvtCountDate = value;
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
     * 获取lastPurchasePrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getLastPurchasePrice() {
        return lastPurchasePrice;
    }

    /**
     * 设置lastPurchasePrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setLastPurchasePrice(SearchDoubleField value) {
        this.lastPurchasePrice = value;
    }

    /**
     * 获取lastQuantityAvailableChange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getLastQuantityAvailableChange() {
        return lastQuantityAvailableChange;
    }

    /**
     * 设置lastQuantityAvailableChange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setLastQuantityAvailableChange(SearchDateField value) {
        this.lastQuantityAvailableChange = value;
    }

    /**
     * 获取leadTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getLeadTime() {
        return leadTime;
    }

    /**
     * 设置leadTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setLeadTime(SearchLongField value) {
        this.leadTime = value;
    }

    /**
     * 获取listingDuration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getListingDuration() {
        return listingDuration;
    }

    /**
     * 设置listingDuration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setListingDuration(SearchEnumMultiSelectField value) {
        this.listingDuration = value;
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
     * 获取locationAllowStorePickup属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getLocationAllowStorePickup() {
        return locationAllowStorePickup;
    }

    /**
     * 设置locationAllowStorePickup属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setLocationAllowStorePickup(SearchBooleanField value) {
        this.locationAllowStorePickup = value;
    }

    /**
     * 获取locationAtpLeadTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getLocationAtpLeadTime() {
        return locationAtpLeadTime;
    }

    /**
     * 设置locationAtpLeadTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setLocationAtpLeadTime(SearchDoubleField value) {
        this.locationAtpLeadTime = value;
    }

    /**
     * 获取locationAverageCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getLocationAverageCost() {
        return locationAverageCost;
    }

    /**
     * 设置locationAverageCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setLocationAverageCost(SearchDoubleField value) {
        this.locationAverageCost = value;
    }

    /**
     * 获取locationBuildTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getLocationBuildTime() {
        return locationBuildTime;
    }

    /**
     * 设置locationBuildTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setLocationBuildTime(SearchDoubleField value) {
        this.locationBuildTime = value;
    }

    /**
     * 获取locationCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getLocationCost() {
        return locationCost;
    }

    /**
     * 设置locationCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setLocationCost(SearchDoubleField value) {
        this.locationCost = value;
    }

    /**
     * 获取locationCostAccountingStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getLocationCostAccountingStatus() {
        return locationCostAccountingStatus;
    }

    /**
     * 设置locationCostAccountingStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setLocationCostAccountingStatus(SearchEnumMultiSelectField value) {
        this.locationCostAccountingStatus = value;
    }

    /**
     * 获取locationDefaultReturnCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getLocationDefaultReturnCost() {
        return locationDefaultReturnCost;
    }

    /**
     * 设置locationDefaultReturnCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setLocationDefaultReturnCost(SearchDoubleField value) {
        this.locationDefaultReturnCost = value;
    }

    /**
     * 获取locationDemandSource属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getLocationDemandSource() {
        return locationDemandSource;
    }

    /**
     * 设置locationDemandSource属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setLocationDemandSource(SearchEnumMultiSelectField value) {
        this.locationDemandSource = value;
    }

    /**
     * 获取locationDemandTimeFence属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getLocationDemandTimeFence() {
        return locationDemandTimeFence;
    }

    /**
     * 设置locationDemandTimeFence属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setLocationDemandTimeFence(SearchLongField value) {
        this.locationDemandTimeFence = value;
    }

    /**
     * 获取locationFixedLotSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getLocationFixedLotSize() {
        return locationFixedLotSize;
    }

    /**
     * 设置locationFixedLotSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setLocationFixedLotSize(SearchDoubleField value) {
        this.locationFixedLotSize = value;
    }

    /**
     * 获取locationInventoryCostTemplate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getLocationInventoryCostTemplate() {
        return locationInventoryCostTemplate;
    }

    /**
     * 设置locationInventoryCostTemplate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setLocationInventoryCostTemplate(SearchMultiSelectField value) {
        this.locationInventoryCostTemplate = value;
    }

    /**
     * 获取locationInvtClassification属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getLocationInvtClassification() {
        return locationInvtClassification;
    }

    /**
     * 设置locationInvtClassification属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setLocationInvtClassification(SearchEnumMultiSelectField value) {
        this.locationInvtClassification = value;
    }

    /**
     * 获取locationInvtCountInterval属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getLocationInvtCountInterval() {
        return locationInvtCountInterval;
    }

    /**
     * 设置locationInvtCountInterval属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setLocationInvtCountInterval(SearchLongField value) {
        this.locationInvtCountInterval = value;
    }

    /**
     * 获取locationLastInvtCountDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getLocationLastInvtCountDate() {
        return locationLastInvtCountDate;
    }

    /**
     * 设置locationLastInvtCountDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setLocationLastInvtCountDate(SearchDateField value) {
        this.locationLastInvtCountDate = value;
    }

    /**
     * 获取locationLeadTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getLocationLeadTime() {
        return locationLeadTime;
    }

    /**
     * 设置locationLeadTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setLocationLeadTime(SearchLongField value) {
        this.locationLeadTime = value;
    }

    /**
     * 获取locationNextInvtCountDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getLocationNextInvtCountDate() {
        return locationNextInvtCountDate;
    }

    /**
     * 设置locationNextInvtCountDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setLocationNextInvtCountDate(SearchDateField value) {
        this.locationNextInvtCountDate = value;
    }

    /**
     * 获取locationPeriodicLotSizeDays属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getLocationPeriodicLotSizeDays() {
        return locationPeriodicLotSizeDays;
    }

    /**
     * 设置locationPeriodicLotSizeDays属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setLocationPeriodicLotSizeDays(SearchLongField value) {
        this.locationPeriodicLotSizeDays = value;
    }

    /**
     * 获取locationPeriodicLotSizeType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getLocationPeriodicLotSizeType() {
        return locationPeriodicLotSizeType;
    }

    /**
     * 设置locationPeriodicLotSizeType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setLocationPeriodicLotSizeType(SearchEnumMultiSelectField value) {
        this.locationPeriodicLotSizeType = value;
    }

    /**
     * 获取locationPreferredStockLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getLocationPreferredStockLevel() {
        return locationPreferredStockLevel;
    }

    /**
     * 设置locationPreferredStockLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setLocationPreferredStockLevel(SearchDoubleField value) {
        this.locationPreferredStockLevel = value;
    }

    /**
     * 获取locationQtyAvailForStorePickup属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getLocationQtyAvailForStorePickup() {
        return locationQtyAvailForStorePickup;
    }

    /**
     * 设置locationQtyAvailForStorePickup属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setLocationQtyAvailForStorePickup(SearchDoubleField value) {
        this.locationQtyAvailForStorePickup = value;
    }

    /**
     * 获取locationQuantityAvailable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getLocationQuantityAvailable() {
        return locationQuantityAvailable;
    }

    /**
     * 设置locationQuantityAvailable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setLocationQuantityAvailable(SearchDoubleField value) {
        this.locationQuantityAvailable = value;
    }

    /**
     * 获取locationQuantityBackOrdered属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getLocationQuantityBackOrdered() {
        return locationQuantityBackOrdered;
    }

    /**
     * 设置locationQuantityBackOrdered属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setLocationQuantityBackOrdered(SearchDoubleField value) {
        this.locationQuantityBackOrdered = value;
    }

    /**
     * 获取locationQuantityCommitted属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getLocationQuantityCommitted() {
        return locationQuantityCommitted;
    }

    /**
     * 设置locationQuantityCommitted属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setLocationQuantityCommitted(SearchDoubleField value) {
        this.locationQuantityCommitted = value;
    }

    /**
     * 获取locationQuantityInTransit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getLocationQuantityInTransit() {
        return locationQuantityInTransit;
    }

    /**
     * 设置locationQuantityInTransit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setLocationQuantityInTransit(SearchDoubleField value) {
        this.locationQuantityInTransit = value;
    }

    /**
     * 获取locationQuantityOnHand属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getLocationQuantityOnHand() {
        return locationQuantityOnHand;
    }

    /**
     * 设置locationQuantityOnHand属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setLocationQuantityOnHand(SearchDoubleField value) {
        this.locationQuantityOnHand = value;
    }

    /**
     * 获取locationQuantityOnOrder属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getLocationQuantityOnOrder() {
        return locationQuantityOnOrder;
    }

    /**
     * 设置locationQuantityOnOrder属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setLocationQuantityOnOrder(SearchDoubleField value) {
        this.locationQuantityOnOrder = value;
    }

    /**
     * 获取locationReorderPoint属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getLocationReorderPoint() {
        return locationReorderPoint;
    }

    /**
     * 设置locationReorderPoint属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setLocationReorderPoint(SearchDoubleField value) {
        this.locationReorderPoint = value;
    }

    /**
     * 获取locationRescheduleInDays属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getLocationRescheduleInDays() {
        return locationRescheduleInDays;
    }

    /**
     * 设置locationRescheduleInDays属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setLocationRescheduleInDays(SearchLongField value) {
        this.locationRescheduleInDays = value;
    }

    /**
     * 获取locationRescheduleOutDays属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getLocationRescheduleOutDays() {
        return locationRescheduleOutDays;
    }

    /**
     * 设置locationRescheduleOutDays属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setLocationRescheduleOutDays(SearchLongField value) {
        this.locationRescheduleOutDays = value;
    }

    /**
     * 获取locationSafetyStockLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getLocationSafetyStockLevel() {
        return locationSafetyStockLevel;
    }

    /**
     * 设置locationSafetyStockLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setLocationSafetyStockLevel(SearchDoubleField value) {
        this.locationSafetyStockLevel = value;
    }

    /**
     * 获取locationStorePickupBufferStock属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getLocationStorePickupBufferStock() {
        return locationStorePickupBufferStock;
    }

    /**
     * 设置locationStorePickupBufferStock属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setLocationStorePickupBufferStock(SearchDoubleField value) {
        this.locationStorePickupBufferStock = value;
    }

    /**
     * 获取locationSupplyLotSizingMethod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getLocationSupplyLotSizingMethod() {
        return locationSupplyLotSizingMethod;
    }

    /**
     * 设置locationSupplyLotSizingMethod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setLocationSupplyLotSizingMethod(SearchEnumMultiSelectField value) {
        this.locationSupplyLotSizingMethod = value;
    }

    /**
     * 获取locationSupplyTimeFence属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getLocationSupplyTimeFence() {
        return locationSupplyTimeFence;
    }

    /**
     * 设置locationSupplyTimeFence属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setLocationSupplyTimeFence(SearchLongField value) {
        this.locationSupplyTimeFence = value;
    }

    /**
     * 获取locationSupplyType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getLocationSupplyType() {
        return locationSupplyType;
    }

    /**
     * 设置locationSupplyType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setLocationSupplyType(SearchEnumMultiSelectField value) {
        this.locationSupplyType = value;
    }

    /**
     * 获取locationTotalValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getLocationTotalValue() {
        return locationTotalValue;
    }

    /**
     * 设置locationTotalValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setLocationTotalValue(SearchDoubleField value) {
        this.locationTotalValue = value;
    }

    /**
     * 获取locBackwardConsumptionDays属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getLocBackwardConsumptionDays() {
        return locBackwardConsumptionDays;
    }

    /**
     * 设置locBackwardConsumptionDays属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setLocBackwardConsumptionDays(SearchLongField value) {
        this.locBackwardConsumptionDays = value;
    }

    /**
     * 获取locForwardConsumptionDays属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getLocForwardConsumptionDays() {
        return locForwardConsumptionDays;
    }

    /**
     * 设置locForwardConsumptionDays属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setLocForwardConsumptionDays(SearchLongField value) {
        this.locForwardConsumptionDays = value;
    }

    /**
     * 获取manufacturer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getManufacturer() {
        return manufacturer;
    }

    /**
     * 设置manufacturer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setManufacturer(SearchStringField value) {
        this.manufacturer = value;
    }

    /**
     * 获取manufactureraddr1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getManufactureraddr1() {
        return manufactureraddr1;
    }

    /**
     * 设置manufactureraddr1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setManufactureraddr1(SearchStringField value) {
        this.manufactureraddr1 = value;
    }

    /**
     * 获取manufacturerCity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getManufacturerCity() {
        return manufacturerCity;
    }

    /**
     * 设置manufacturerCity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setManufacturerCity(SearchStringField value) {
        this.manufacturerCity = value;
    }

    /**
     * 获取manufacturerState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getManufacturerState() {
        return manufacturerState;
    }

    /**
     * 设置manufacturerState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setManufacturerState(SearchStringField value) {
        this.manufacturerState = value;
    }

    /**
     * 获取manufacturerTariff属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getManufacturerTariff() {
        return manufacturerTariff;
    }

    /**
     * 设置manufacturerTariff属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setManufacturerTariff(SearchStringField value) {
        this.manufacturerTariff = value;
    }

    /**
     * 获取manufacturerTaxId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getManufacturerTaxId() {
        return manufacturerTaxId;
    }

    /**
     * 设置manufacturerTaxId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setManufacturerTaxId(SearchStringField value) {
        this.manufacturerTaxId = value;
    }

    /**
     * 获取manufacturerZip属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getManufacturerZip() {
        return manufacturerZip;
    }

    /**
     * 设置manufacturerZip属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setManufacturerZip(SearchStringField value) {
        this.manufacturerZip = value;
    }

    /**
     * 获取manufacturingChargeItem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getManufacturingChargeItem() {
        return manufacturingChargeItem;
    }

    /**
     * 设置manufacturingChargeItem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setManufacturingChargeItem(SearchBooleanField value) {
        this.manufacturingChargeItem = value;
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
     * 获取matrix属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getMatrix() {
        return matrix;
    }

    /**
     * 设置matrix属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setMatrix(SearchBooleanField value) {
        this.matrix = value;
    }

    /**
     * 获取matrixChild属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getMatrixChild() {
        return matrixChild;
    }

    /**
     * 设置matrixChild属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setMatrixChild(SearchBooleanField value) {
        this.matrixChild = value;
    }

    /**
     * 获取metaTagHtml属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getMetaTagHtml() {
        return metaTagHtml;
    }

    /**
     * 设置metaTagHtml属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setMetaTagHtml(SearchStringField value) {
        this.metaTagHtml = value;
    }

    /**
     * 获取minimumQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getMinimumQuantity() {
        return minimumQuantity;
    }

    /**
     * 设置minimumQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setMinimumQuantity(SearchLongField value) {
        this.minimumQuantity = value;
    }

    /**
     * 获取mossApplies属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getMossApplies() {
        return mossApplies;
    }

    /**
     * 设置mossApplies属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setMossApplies(SearchBooleanField value) {
        this.mossApplies = value;
    }

    /**
     * 获取mpn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getMpn() {
        return mpn;
    }

    /**
     * 设置mpn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setMpn(SearchStringField value) {
        this.mpn = value;
    }

    /**
     * 获取multManufactureAddr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getMultManufactureAddr() {
        return multManufactureAddr;
    }

    /**
     * 设置multManufactureAddr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setMultManufactureAddr(SearchBooleanField value) {
        this.multManufactureAddr = value;
    }

    /**
     * 获取nexTagCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getNexTagCategory() {
        return nexTagCategory;
    }

    /**
     * 设置nexTagCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setNexTagCategory(SearchStringField value) {
        this.nexTagCategory = value;
    }

    /**
     * 获取nexTagProductFeed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getNexTagProductFeed() {
        return nexTagProductFeed;
    }

    /**
     * 设置nexTagProductFeed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setNexTagProductFeed(SearchBooleanField value) {
        this.nexTagProductFeed = value;
    }

    /**
     * 获取nextInvtCountDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getNextInvtCountDate() {
        return nextInvtCountDate;
    }

    /**
     * 设置nextInvtCountDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setNextInvtCountDate(SearchDateField value) {
        this.nextInvtCountDate = value;
    }

    /**
     * 获取numActiveListings属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getNumActiveListings() {
        return numActiveListings;
    }

    /**
     * 设置numActiveListings属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setNumActiveListings(SearchLongField value) {
        this.numActiveListings = value;
    }

    /**
     * 获取numberAllowedDownloads属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getNumberAllowedDownloads() {
        return numberAllowedDownloads;
    }

    /**
     * 设置numberAllowedDownloads属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setNumberAllowedDownloads(SearchDoubleField value) {
        this.numberAllowedDownloads = value;
    }

    /**
     * 获取numCurrentlyListed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getNumCurrentlyListed() {
        return numCurrentlyListed;
    }

    /**
     * 设置numCurrentlyListed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setNumCurrentlyListed(SearchLongField value) {
        this.numCurrentlyListed = value;
    }

    /**
     * 获取obsoleteDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getObsoleteDate() {
        return obsoleteDate;
    }

    /**
     * 设置obsoleteDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setObsoleteDate(SearchDateField value) {
        this.obsoleteDate = value;
    }

    /**
     * 获取obsoleteRevision属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getObsoleteRevision() {
        return obsoleteRevision;
    }

    /**
     * 设置obsoleteRevision属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setObsoleteRevision(SearchMultiSelectField value) {
        this.obsoleteRevision = value;
    }

    /**
     * 获取offerSupport属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getOfferSupport() {
        return offerSupport;
    }

    /**
     * 设置offerSupport属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setOfferSupport(SearchBooleanField value) {
        this.offerSupport = value;
    }

    /**
     * 获取onlineCustomerPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getOnlineCustomerPrice() {
        return onlineCustomerPrice;
    }

    /**
     * 设置onlineCustomerPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setOnlineCustomerPrice(SearchDoubleField value) {
        this.onlineCustomerPrice = value;
    }

    /**
     * 获取onSpecial属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getOnSpecial() {
        return onSpecial;
    }

    /**
     * 设置onSpecial属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setOnSpecial(SearchBooleanField value) {
        this.onSpecial = value;
    }

    /**
     * 获取otherVendor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getOtherVendor() {
        return otherVendor;
    }

    /**
     * 设置otherVendor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setOtherVendor(SearchMultiSelectField value) {
        this.otherVendor = value;
    }

    /**
     * 获取outOfStockBehavior属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getOutOfStockBehavior() {
        return outOfStockBehavior;
    }

    /**
     * 设置outOfStockBehavior属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setOutOfStockBehavior(SearchMultiSelectField value) {
        this.outOfStockBehavior = value;
    }

    /**
     * 获取overallQuantityPricingType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getOverallQuantityPricingType() {
        return overallQuantityPricingType;
    }

    /**
     * 设置overallQuantityPricingType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setOverallQuantityPricingType(SearchEnumMultiSelectField value) {
        this.overallQuantityPricingType = value;
    }

    /**
     * 获取overheadType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getOverheadType() {
        return overheadType;
    }

    /**
     * 设置overheadType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setOverheadType(SearchEnumMultiSelectField value) {
        this.overheadType = value;
    }

    /**
     * 获取pageTitle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getPageTitle() {
        return pageTitle;
    }

    /**
     * 设置pageTitle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setPageTitle(SearchStringField value) {
        this.pageTitle = value;
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
     * 获取periodicLotSizeDays属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getPeriodicLotSizeDays() {
        return periodicLotSizeDays;
    }

    /**
     * 设置periodicLotSizeDays属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setPeriodicLotSizeDays(SearchLongField value) {
        this.periodicLotSizeDays = value;
    }

    /**
     * 获取periodicLotSizeType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getPeriodicLotSizeType() {
        return periodicLotSizeType;
    }

    /**
     * 设置periodicLotSizeType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setPeriodicLotSizeType(SearchEnumMultiSelectField value) {
        this.periodicLotSizeType = value;
    }

    /**
     * 获取preferenceCriterion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getPreferenceCriterion() {
        return preferenceCriterion;
    }

    /**
     * 设置preferenceCriterion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setPreferenceCriterion(SearchStringField value) {
        this.preferenceCriterion = value;
    }

    /**
     * 获取preferredBin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getPreferredBin() {
        return preferredBin;
    }

    /**
     * 设置preferredBin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setPreferredBin(SearchBooleanField value) {
        this.preferredBin = value;
    }

    /**
     * 获取preferredLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getPreferredLocation() {
        return preferredLocation;
    }

    /**
     * 设置preferredLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setPreferredLocation(SearchMultiSelectField value) {
        this.preferredLocation = value;
    }

    /**
     * 获取preferredStockLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getPreferredStockLevel() {
        return preferredStockLevel;
    }

    /**
     * 设置preferredStockLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setPreferredStockLevel(SearchDoubleField value) {
        this.preferredStockLevel = value;
    }

    /**
     * 获取preferredStockLevelDays属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getPreferredStockLevelDays() {
        return preferredStockLevelDays;
    }

    /**
     * 设置preferredStockLevelDays属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setPreferredStockLevelDays(SearchLongField value) {
        this.preferredStockLevelDays = value;
    }

    /**
     * 获取price属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getPrice() {
        return price;
    }

    /**
     * 设置price属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setPrice(SearchDoubleField value) {
        this.price = value;
    }

    /**
     * 获取pricesIncludeTax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getPricesIncludeTax() {
        return pricesIncludeTax;
    }

    /**
     * 设置pricesIncludeTax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setPricesIncludeTax(SearchBooleanField value) {
        this.pricesIncludeTax = value;
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
     * 获取primaryCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getPrimaryCategory() {
        return primaryCategory;
    }

    /**
     * 设置primaryCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setPrimaryCategory(SearchLongField value) {
        this.primaryCategory = value;
    }

    /**
     * 获取purchaseOrderAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getPurchaseOrderAmount() {
        return purchaseOrderAmount;
    }

    /**
     * 设置purchaseOrderAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setPurchaseOrderAmount(SearchDoubleField value) {
        this.purchaseOrderAmount = value;
    }

    /**
     * 获取purchaseOrderQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getPurchaseOrderQuantity() {
        return purchaseOrderQuantity;
    }

    /**
     * 设置purchaseOrderQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setPurchaseOrderQuantity(SearchDoubleField value) {
        this.purchaseOrderQuantity = value;
    }

    /**
     * 获取purchaseOrderQuantityDiff属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getPurchaseOrderQuantityDiff() {
        return purchaseOrderQuantityDiff;
    }

    /**
     * 设置purchaseOrderQuantityDiff属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setPurchaseOrderQuantityDiff(SearchDoubleField value) {
        this.purchaseOrderQuantityDiff = value;
    }

    /**
     * 获取purchaseUnit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getPurchaseUnit() {
        return purchaseUnit;
    }

    /**
     * 设置purchaseUnit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setPurchaseUnit(SearchMultiSelectField value) {
        this.purchaseUnit = value;
    }

    /**
     * 获取quantityAvailable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getQuantityAvailable() {
        return quantityAvailable;
    }

    /**
     * 设置quantityAvailable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setQuantityAvailable(SearchDoubleField value) {
        this.quantityAvailable = value;
    }

    /**
     * 获取quantityBackOrdered属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getQuantityBackOrdered() {
        return quantityBackOrdered;
    }

    /**
     * 设置quantityBackOrdered属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setQuantityBackOrdered(SearchDoubleField value) {
        this.quantityBackOrdered = value;
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
     * 获取quantityOnHand属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getQuantityOnHand() {
        return quantityOnHand;
    }

    /**
     * 设置quantityOnHand属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setQuantityOnHand(SearchDoubleField value) {
        this.quantityOnHand = value;
    }

    /**
     * 获取quantityOnOrder属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getQuantityOnOrder() {
        return quantityOnOrder;
    }

    /**
     * 设置quantityOnOrder属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setQuantityOnOrder(SearchDoubleField value) {
        this.quantityOnOrder = value;
    }

    /**
     * 获取quantityPricingSchedule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getQuantityPricingSchedule() {
        return quantityPricingSchedule;
    }

    /**
     * 设置quantityPricingSchedule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setQuantityPricingSchedule(SearchMultiSelectField value) {
        this.quantityPricingSchedule = value;
    }

    /**
     * 获取receiptAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getReceiptAmount() {
        return receiptAmount;
    }

    /**
     * 设置receiptAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setReceiptAmount(SearchDoubleField value) {
        this.receiptAmount = value;
    }

    /**
     * 获取receiptQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getReceiptQuantity() {
        return receiptQuantity;
    }

    /**
     * 设置receiptQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setReceiptQuantity(SearchDoubleField value) {
        this.receiptQuantity = value;
    }

    /**
     * 获取receiptQuantityDiff属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getReceiptQuantityDiff() {
        return receiptQuantityDiff;
    }

    /**
     * 设置receiptQuantityDiff属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setReceiptQuantityDiff(SearchDoubleField value) {
        this.receiptQuantityDiff = value;
    }

    /**
     * 获取reorderMultiple属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getReorderMultiple() {
        return reorderMultiple;
    }

    /**
     * 设置reorderMultiple属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setReorderMultiple(SearchLongField value) {
        this.reorderMultiple = value;
    }

    /**
     * 获取reorderPoint属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getReorderPoint() {
        return reorderPoint;
    }

    /**
     * 设置reorderPoint属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setReorderPoint(SearchDoubleField value) {
        this.reorderPoint = value;
    }

    /**
     * 获取rescheduleInDays属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getRescheduleInDays() {
        return rescheduleInDays;
    }

    /**
     * 设置rescheduleInDays属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setRescheduleInDays(SearchLongField value) {
        this.rescheduleInDays = value;
    }

    /**
     * 获取rescheduleOutDays属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getRescheduleOutDays() {
        return rescheduleOutDays;
    }

    /**
     * 设置rescheduleOutDays属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setRescheduleOutDays(SearchLongField value) {
        this.rescheduleOutDays = value;
    }

    /**
     * 获取reservePrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getReservePrice() {
        return reservePrice;
    }

    /**
     * 设置reservePrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setReservePrice(SearchDoubleField value) {
        this.reservePrice = value;
    }

    /**
     * 获取revenueAllocationGroup属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getRevenueAllocationGroup() {
        return revenueAllocationGroup;
    }

    /**
     * 设置revenueAllocationGroup属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setRevenueAllocationGroup(SearchMultiSelectField value) {
        this.revenueAllocationGroup = value;
    }

    /**
     * 获取revenueRecognitionRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getRevenueRecognitionRule() {
        return revenueRecognitionRule;
    }

    /**
     * 设置revenueRecognitionRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setRevenueRecognitionRule(SearchMultiSelectField value) {
        this.revenueRecognitionRule = value;
    }

    /**
     * 获取revRecForecastRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getRevRecForecastRule() {
        return revRecForecastRule;
    }

    /**
     * 设置revRecForecastRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setRevRecForecastRule(SearchMultiSelectField value) {
        this.revRecForecastRule = value;
    }

    /**
     * 获取revRecSchedule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getRevRecSchedule() {
        return revRecSchedule;
    }

    /**
     * 设置revRecSchedule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setRevRecSchedule(SearchMultiSelectField value) {
        this.revRecSchedule = value;
    }

    /**
     * 获取roundUpAsComponent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getRoundUpAsComponent() {
        return roundUpAsComponent;
    }

    /**
     * 设置roundUpAsComponent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setRoundUpAsComponent(SearchBooleanField value) {
        this.roundUpAsComponent = value;
    }

    /**
     * 获取safetyStockLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getSafetyStockLevel() {
        return safetyStockLevel;
    }

    /**
     * 设置safetyStockLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setSafetyStockLevel(SearchDoubleField value) {
        this.safetyStockLevel = value;
    }

    /**
     * 获取safetyStockLevelDays属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getSafetyStockLevelDays() {
        return safetyStockLevelDays;
    }

    /**
     * 设置safetyStockLevelDays属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setSafetyStockLevelDays(SearchLongField value) {
        this.safetyStockLevelDays = value;
    }

    /**
     * 获取salesDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getSalesDescription() {
        return salesDescription;
    }

    /**
     * 设置salesDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setSalesDescription(SearchStringField value) {
        this.salesDescription = value;
    }

    /**
     * 获取saleUnit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getSaleUnit() {
        return saleUnit;
    }

    /**
     * 设置saleUnit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setSaleUnit(SearchMultiSelectField value) {
        this.saleUnit = value;
    }

    /**
     * 获取sameAsPrimaryBookAmortization属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getSameAsPrimaryBookAmortization() {
        return sameAsPrimaryBookAmortization;
    }

    /**
     * 设置sameAsPrimaryBookAmortization属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setSameAsPrimaryBookAmortization(SearchBooleanField value) {
        this.sameAsPrimaryBookAmortization = value;
    }

    /**
     * 获取sameAsPrimaryBookRevRec属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getSameAsPrimaryBookRevRec() {
        return sameAsPrimaryBookRevRec;
    }

    /**
     * 设置sameAsPrimaryBookRevRec属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setSameAsPrimaryBookRevRec(SearchBooleanField value) {
        this.sameAsPrimaryBookRevRec = value;
    }

    /**
     * 获取scheduleBCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getScheduleBCode() {
        return scheduleBCode;
    }

    /**
     * 设置scheduleBCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setScheduleBCode(SearchEnumMultiSelectField value) {
        this.scheduleBCode = value;
    }

    /**
     * 获取scheduleBNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getScheduleBNumber() {
        return scheduleBNumber;
    }

    /**
     * 设置scheduleBNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setScheduleBNumber(SearchStringField value) {
        this.scheduleBNumber = value;
    }

    /**
     * 获取scheduleBQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getScheduleBQuantity() {
        return scheduleBQuantity;
    }

    /**
     * 设置scheduleBQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setScheduleBQuantity(SearchStringField value) {
        this.scheduleBQuantity = value;
    }

    /**
     * 获取searchKeywords属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getSearchKeywords() {
        return searchKeywords;
    }

    /**
     * 设置searchKeywords属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setSearchKeywords(SearchStringField value) {
        this.searchKeywords = value;
    }

    /**
     * 获取seasonalDemand属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getSeasonalDemand() {
        return seasonalDemand;
    }

    /**
     * 设置seasonalDemand属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setSeasonalDemand(SearchBooleanField value) {
        this.seasonalDemand = value;
    }

    /**
     * 获取sellOnEBay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getSellOnEBay() {
        return sellOnEBay;
    }

    /**
     * 设置sellOnEBay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setSellOnEBay(SearchBooleanField value) {
        this.sellOnEBay = value;
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
     * 获取serialNumberLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getSerialNumberLocation() {
        return serialNumberLocation;
    }

    /**
     * 设置serialNumberLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setSerialNumberLocation(SearchMultiSelectField value) {
        this.serialNumberLocation = value;
    }

    /**
     * 获取shipIndividually属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getShipIndividually() {
        return shipIndividually;
    }

    /**
     * 设置shipIndividually属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setShipIndividually(SearchBooleanField value) {
        this.shipIndividually = value;
    }

    /**
     * 获取shipPackage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getShipPackage() {
        return shipPackage;
    }

    /**
     * 设置shipPackage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setShipPackage(SearchMultiSelectField value) {
        this.shipPackage = value;
    }

    /**
     * 获取shippingCarrier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getShippingCarrier() {
        return shippingCarrier;
    }

    /**
     * 设置shippingCarrier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setShippingCarrier(SearchEnumMultiSelectField value) {
        this.shippingCarrier = value;
    }

    /**
     * 获取shippingRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getShippingRate() {
        return shippingRate;
    }

    /**
     * 设置shippingRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setShippingRate(SearchDoubleField value) {
        this.shippingRate = value;
    }

    /**
     * 获取shoppingDotComCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getShoppingDotComCategory() {
        return shoppingDotComCategory;
    }

    /**
     * 设置shoppingDotComCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setShoppingDotComCategory(SearchStringField value) {
        this.shoppingDotComCategory = value;
    }

    /**
     * 获取shoppingProductFeed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getShoppingProductFeed() {
        return shoppingProductFeed;
    }

    /**
     * 设置shoppingProductFeed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setShoppingProductFeed(SearchBooleanField value) {
        this.shoppingProductFeed = value;
    }

    /**
     * 获取shopzillaCategoryId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getShopzillaCategoryId() {
        return shopzillaCategoryId;
    }

    /**
     * 设置shopzillaCategoryId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setShopzillaCategoryId(SearchLongField value) {
        this.shopzillaCategoryId = value;
    }

    /**
     * 获取shopzillaProductFeed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getShopzillaProductFeed() {
        return shopzillaProductFeed;
    }

    /**
     * 设置shopzillaProductFeed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setShopzillaProductFeed(SearchBooleanField value) {
        this.shopzillaProductFeed = value;
    }

    /**
     * 获取sitemapPriority属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getSitemapPriority() {
        return sitemapPriority;
    }

    /**
     * 设置sitemapPriority属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setSitemapPriority(SearchEnumMultiSelectField value) {
        this.sitemapPriority = value;
    }

    /**
     * 获取softDescriptor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getSoftDescriptor() {
        return softDescriptor;
    }

    /**
     * 设置softDescriptor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setSoftDescriptor(SearchMultiSelectField value) {
        this.softDescriptor = value;
    }

    /**
     * 获取startingPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getStartingPrice() {
        return startingPrice;
    }

    /**
     * 设置startingPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setStartingPrice(SearchDoubleField value) {
        this.startingPrice = value;
    }

    /**
     * 获取stockDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getStockDescription() {
        return stockDescription;
    }

    /**
     * 设置stockDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setStockDescription(SearchStringField value) {
        this.stockDescription = value;
    }

    /**
     * 获取stockUnit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getStockUnit() {
        return stockUnit;
    }

    /**
     * 设置stockUnit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setStockUnit(SearchMultiSelectField value) {
        this.stockUnit = value;
    }

    /**
     * 获取storeDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getStoreDescription() {
        return storeDescription;
    }

    /**
     * 设置storeDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setStoreDescription(SearchStringField value) {
        this.storeDescription = value;
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
     * 获取subType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getSubType() {
        return subType;
    }

    /**
     * 设置subType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setSubType(SearchEnumMultiSelectField value) {
        this.subType = value;
    }

    /**
     * 获取supplyLotSizingMethod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getSupplyLotSizingMethod() {
        return supplyLotSizingMethod;
    }

    /**
     * 设置supplyLotSizingMethod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setSupplyLotSizingMethod(SearchEnumMultiSelectField value) {
        this.supplyLotSizingMethod = value;
    }

    /**
     * 获取supplyReplenishmentMethod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getSupplyReplenishmentMethod() {
        return supplyReplenishmentMethod;
    }

    /**
     * 设置supplyReplenishmentMethod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setSupplyReplenishmentMethod(SearchEnumMultiSelectField value) {
        this.supplyReplenishmentMethod = value;
    }

    /**
     * 获取supplyTimeFence属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getSupplyTimeFence() {
        return supplyTimeFence;
    }

    /**
     * 设置supplyTimeFence属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setSupplyTimeFence(SearchLongField value) {
        this.supplyTimeFence = value;
    }

    /**
     * 获取supplyType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getSupplyType() {
        return supplyType;
    }

    /**
     * 设置supplyType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setSupplyType(SearchEnumMultiSelectField value) {
        this.supplyType = value;
    }

    /**
     * 获取taxCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getTaxCode() {
        return taxCode;
    }

    /**
     * 设置taxCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setTaxCode(SearchMultiSelectField value) {
        this.taxCode = value;
    }

    /**
     * 获取taxSchedule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getTaxSchedule() {
        return taxSchedule;
    }

    /**
     * 设置taxSchedule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setTaxSchedule(SearchMultiSelectField value) {
        this.taxSchedule = value;
    }

    /**
     * 获取thumbnailUrl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getThumbnailUrl() {
        return thumbnailUrl;
    }

    /**
     * 设置thumbnailUrl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setThumbnailUrl(SearchStringField value) {
        this.thumbnailUrl = value;
    }

    /**
     * 获取totalValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getTotalValue() {
        return totalValue;
    }

    /**
     * 设置totalValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setTotalValue(SearchDoubleField value) {
        this.totalValue = value;
    }

    /**
     * 获取trackLandedCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getTrackLandedCost() {
        return trackLandedCost;
    }

    /**
     * 设置trackLandedCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setTrackLandedCost(SearchBooleanField value) {
        this.trackLandedCost = value;
    }

    /**
     * 获取transferPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getTransferPrice() {
        return transferPrice;
    }

    /**
     * 设置transferPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setTransferPrice(SearchDoubleField value) {
        this.transferPrice = value;
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
     * 获取upcCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getUpcCode() {
        return upcCode;
    }

    /**
     * 设置upcCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setUpcCode(SearchStringField value) {
        this.upcCode = value;
    }

    /**
     * 获取urlComponent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getUrlComponent() {
        return urlComponent;
    }

    /**
     * 设置urlComponent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setUrlComponent(SearchStringField value) {
        this.urlComponent = value;
    }

    /**
     * 获取useBins属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getUseBins() {
        return useBins;
    }

    /**
     * 设置useBins属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setUseBins(SearchBooleanField value) {
        this.useBins = value;
    }

    /**
     * 获取useComponentYield属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getUseComponentYield() {
        return useComponentYield;
    }

    /**
     * 设置useComponentYield属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setUseComponentYield(SearchBooleanField value) {
        this.useComponentYield = value;
    }

    /**
     * 获取useMarginalRates属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getUseMarginalRates() {
        return useMarginalRates;
    }

    /**
     * 设置useMarginalRates属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setUseMarginalRates(SearchBooleanField value) {
        this.useMarginalRates = value;
    }

    /**
     * 获取vendor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getVendor() {
        return vendor;
    }

    /**
     * 设置vendor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setVendor(SearchMultiSelectField value) {
        this.vendor = value;
    }

    /**
     * 获取vendorCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getVendorCode() {
        return vendorCode;
    }

    /**
     * 设置vendorCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setVendorCode(SearchStringField value) {
        this.vendorCode = value;
    }

    /**
     * 获取vendorCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getVendorCost() {
        return vendorCost;
    }

    /**
     * 设置vendorCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setVendorCost(SearchDoubleField value) {
        this.vendorCost = value;
    }

    /**
     * 获取vendorCostEntered属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getVendorCostEntered() {
        return vendorCostEntered;
    }

    /**
     * 设置vendorCostEntered属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setVendorCostEntered(SearchDoubleField value) {
        this.vendorCostEntered = value;
    }

    /**
     * 获取vendorName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getVendorName() {
        return vendorName;
    }

    /**
     * 设置vendorName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setVendorName(SearchStringField value) {
        this.vendorName = value;
    }

    /**
     * 获取vendorPriceCurrency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getVendorPriceCurrency() {
        return vendorPriceCurrency;
    }

    /**
     * 设置vendorPriceCurrency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setVendorPriceCurrency(SearchMultiSelectField value) {
        this.vendorPriceCurrency = value;
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
     * 获取vsoeSopGroup属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getVsoeSopGroup() {
        return vsoeSopGroup;
    }

    /**
     * 设置vsoeSopGroup属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setVsoeSopGroup(SearchEnumMultiSelectField value) {
        this.vsoeSopGroup = value;
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
     * 获取weight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getWeight() {
        return weight;
    }

    /**
     * 设置weight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setWeight(SearchDoubleField value) {
        this.weight = value;
    }

    /**
     * 获取yahooProductFeed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getYahooProductFeed() {
        return yahooProductFeed;
    }

    /**
     * 设置yahooProductFeed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setYahooProductFeed(SearchBooleanField value) {
        this.yahooProductFeed = value;
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
