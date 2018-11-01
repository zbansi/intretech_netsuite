
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
 * <p>ItemSearchBasic complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡaccBookRevRecForecastRule���Ե�ֵ��
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
     * ����accBookRevRecForecastRule���Ե�ֵ��
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
     * ��ȡaccountingBook���Ե�ֵ��
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
     * ����accountingBook���Ե�ֵ��
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
     * ��ȡaccountingBookAmortization���Ե�ֵ��
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
     * ����accountingBookAmortization���Ե�ֵ��
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
     * ��ȡaccountingBookCreatePlansOn���Ե�ֵ��
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
     * ����accountingBookCreatePlansOn���Ե�ֵ��
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
     * ��ȡaccountingBookRevRecRule���Ե�ֵ��
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
     * ����accountingBookRevRecRule���Ե�ֵ��
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
     * ��ȡaccountingBookRevRecSchedule���Ե�ֵ��
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
     * ����accountingBookRevRecSchedule���Ե�ֵ��
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
     * ��ȡallowedShippingMethod���Ե�ֵ��
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
     * ����allowedShippingMethod���Ե�ֵ��
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
     * ��ȡalternateDemandSourceItem���Ե�ֵ��
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
     * ����alternateDemandSourceItem���Ե�ֵ��
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
     * ��ȡatpLeadTime���Ե�ֵ��
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
     * ����atpLeadTime���Ե�ֵ��
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
     * ��ȡatpMethod���Ե�ֵ��
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
     * ����atpMethod���Ե�ֵ��
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
     * ��ȡautoLeadTime���Ե�ֵ��
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
     * ����autoLeadTime���Ե�ֵ��
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
     * ��ȡautoPreferredStockLevel���Ե�ֵ��
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
     * ����autoPreferredStockLevel���Ե�ֵ��
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
     * ��ȡautoReorderPoint���Ե�ֵ��
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
     * ����autoReorderPoint���Ե�ֵ��
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
     * ��ȡavailableToPartners���Ե�ֵ��
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
     * ����availableToPartners���Ե�ֵ��
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
     * ��ȡaverageCost���Ե�ֵ��
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
     * ����averageCost���Ե�ֵ��
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
     * ��ȡbackwardConsumptionDays���Ե�ֵ��
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
     * ����backwardConsumptionDays���Ե�ֵ��
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
     * ��ȡbinOnHandAvail���Ե�ֵ��
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
     * ����binOnHandAvail���Ե�ֵ��
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
     * ��ȡbinOnHandCount���Ե�ֵ��
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
     * ����binOnHandCount���Ե�ֵ��
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
     * ��ȡbuildTime���Ե�ֵ��
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
     * ����buildTime���Ե�ֵ��
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
     * ��ȡbuyItNowPrice���Ե�ֵ��
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
     * ����buyItNowPrice���Ե�ֵ��
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
     * ��ȡcaption���Ե�ֵ��
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
     * ����caption���Ե�ֵ��
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
     * ��ȡcategory���Ե�ֵ��
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
     * ����category���Ե�ֵ��
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
     * ��ȡcomponent���Ե�ֵ��
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
     * ����component���Ե�ֵ��
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
     * ��ȡcomponentOf���Ե�ֵ��
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
     * ����componentOf���Ե�ֵ��
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
     * ��ȡcontingentRevenueHandling���Ե�ֵ��
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
     * ����contingentRevenueHandling���Ե�ֵ��
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
     * ��ȡcopyDescription���Ե�ֵ��
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
     * ����copyDescription���Ե�ֵ��
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
     * ��ȡcorrelatedItem���Ե�ֵ��
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
     * ����correlatedItem���Ե�ֵ��
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
     * ��ȡcorrelatedItemCorrelation���Ե�ֵ��
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
     * ����correlatedItemCorrelation���Ե�ֵ��
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
     * ��ȡcorrelatedItemCount���Ե�ֵ��
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
     * ����correlatedItemCount���Ե�ֵ��
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
     * ��ȡcorrelatedItemLift���Ե�ֵ��
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
     * ����correlatedItemLift���Ե�ֵ��
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
     * ��ȡcorrelatedItemPurchaseRate���Ե�ֵ��
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
     * ����correlatedItemPurchaseRate���Ե�ֵ��
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
     * ��ȡcost���Ե�ֵ��
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
     * ����cost���Ե�ֵ��
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
     * ��ȡcostAccountingStatus���Ե�ֵ��
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
     * ����costAccountingStatus���Ե�ֵ��
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
     * ��ȡcostCategory���Ե�ֵ��
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
     * ����costCategory���Ե�ֵ��
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
     * ��ȡcostingMethod���Ե�ֵ��
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
     * ����costingMethod���Ե�ֵ��
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
     * ��ȡcountryOfManufacture���Ե�ֵ��
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
     * ����countryOfManufacture���Ե�ֵ��
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
     * ��ȡcreated���Ե�ֵ��
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
     * ����created���Ե�ֵ��
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
     * ��ȡcreateJob���Ե�ֵ��
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
     * ����createJob���Ե�ֵ��
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
     * ��ȡcreateRevenuePlansOn���Ե�ֵ��
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
     * ����createRevenuePlansOn���Ե�ֵ��
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
     * ��ȡdateViewed���Ե�ֵ��
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
     * ����dateViewed���Ե�ֵ��
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
     * ��ȡdaysBeforeExpiration���Ե�ֵ��
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
     * ����daysBeforeExpiration���Ե�ֵ��
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
     * ��ȡdefaultReturnCost���Ե�ֵ��
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
     * ����defaultReturnCost���Ե�ֵ��
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
     * ��ȡdefaultShippingMethod���Ե�ֵ��
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
     * ����defaultShippingMethod���Ե�ֵ��
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
     * ��ȡdemandModifier���Ե�ֵ��
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
     * ����demandModifier���Ե�ֵ��
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
     * ��ȡdemandSource���Ե�ֵ��
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
     * ����demandSource���Ե�ֵ��
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
     * ��ȡdemandTimeFence���Ե�ֵ��
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
     * ����demandTimeFence���Ե�ֵ��
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
     * ��ȡdirectRevenuePosting���Ե�ֵ��
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
     * ����directRevenuePosting���Ե�ֵ��
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
     * ��ȡdisplayIneBayStore���Ե�ֵ��
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
     * ����displayIneBayStore���Ե�ֵ��
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
     * ��ȡdisplayName���Ե�ֵ��
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
     * ����displayName���Ե�ֵ��
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
     * ��ȡdistributionCategory���Ե�ֵ��
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
     * ����distributionCategory���Ե�ֵ��
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
     * ��ȡdistributionNetwork���Ե�ֵ��
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
     * ����distributionNetwork���Ե�ֵ��
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
     * ��ȡdontShowPrice���Ե�ֵ��
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
     * ����dontShowPrice���Ե�ֵ��
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
     * ��ȡeBayItemDescription���Ե�ֵ��
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
     * ����eBayItemDescription���Ե�ֵ��
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
     * ��ȡeBayItemSubtitle���Ե�ֵ��
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
     * ����eBayItemSubtitle���Ե�ֵ��
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
     * ��ȡeBayItemTitle���Ե�ֵ��
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
     * ����eBayItemTitle���Ե�ֵ��
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
     * ��ȡebayRelistingOption���Ե�ֵ��
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
     * ����ebayRelistingOption���Ե�ֵ��
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
     * ��ȡeffectiveBomControl���Ե�ֵ��
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
     * ����effectiveBomControl���Ե�ֵ��
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
     * ��ȡeffectiveDate���Ե�ֵ��
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
     * ����effectiveDate���Ե�ֵ��
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
     * ��ȡeffectiveRevision���Ե�ֵ��
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
     * ����effectiveRevision���Ե�ֵ��
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
     * ��ȡendAuctionsWhenOutOfStock���Ե�ֵ��
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
     * ����endAuctionsWhenOutOfStock���Ե�ֵ��
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
     * ��ȡexcludeFromSitemap���Ե�ֵ��
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
     * ����excludeFromSitemap���Ե�ֵ��
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
     * ��ȡfeaturedDescription���Ե�ֵ��
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
     * ����featuredDescription���Ե�ֵ��
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
     * ��ȡfeedDescription���Ե�ֵ��
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
     * ����feedDescription���Ե�ֵ��
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
     * ��ȡfeedName���Ե�ֵ��
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
     * ����feedName���Ե�ֵ��
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
     * ��ȡfixedLotSize���Ե�ֵ��
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
     * ����fixedLotSize���Ե�ֵ��
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
     * ��ȡforwardConsumptionDays���Ե�ֵ��
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
     * ����forwardConsumptionDays���Ե�ֵ��
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
     * ��ȡfraudRisk���Ե�ֵ��
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
     * ����fraudRisk���Ե�ֵ��
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
     * ��ȡfroogleProductFeed���Ե�ֵ��
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
     * ����froogleProductFeed���Ե�ֵ��
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
     * ��ȡfxCost���Ե�ֵ��
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
     * ����fxCost���Ե�ֵ��
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
     * ��ȡgenerateAccruals���Ե�ֵ��
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
     * ����generateAccruals���Ե�ֵ��
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
     * ��ȡgiftCertAuthCode���Ե�ֵ��
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
     * ����giftCertAuthCode���Ե�ֵ��
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
     * ��ȡgiftCertEmail���Ե�ֵ��
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
     * ����giftCertEmail���Ե�ֵ��
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
     * ��ȡgiftCertExpDate���Ե�ֵ��
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
     * ����giftCertExpDate���Ե�ֵ��
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
     * ��ȡgiftCertFrom���Ե�ֵ��
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
     * ����giftCertFrom���Ե�ֵ��
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
     * ��ȡgiftCertMsg���Ե�ֵ��
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
     * ����giftCertMsg���Ե�ֵ��
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
     * ��ȡgiftCertOrigAmt���Ե�ֵ��
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
     * ����giftCertOrigAmt���Ե�ֵ��
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
     * ��ȡgiftCertRecipient���Ե�ֵ��
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
     * ����giftCertRecipient���Ե�ֵ��
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
     * ��ȡimageUrl���Ե�ֵ��
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
     * ����imageUrl���Ե�ֵ��
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
     * ��ȡincludeChildren���Ե�ֵ��
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
     * ����includeChildren���Ե�ֵ��
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
     * ��ȡinventoryLocation���Ե�ֵ��
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
     * ����inventoryLocation���Ե�ֵ��
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
     * ��ȡinvtClassification���Ե�ֵ��
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
     * ����invtClassification���Ե�ֵ��
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
     * ��ȡinvtCountInterval���Ե�ֵ��
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
     * ����invtCountInterval���Ե�ֵ��
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
     * ��ȡisAvailable���Ե�ֵ��
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
     * ����isAvailable���Ե�ֵ��
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
     * ��ȡisDropShipItem���Ե�ֵ��
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
     * ����isDropShipItem���Ե�ֵ��
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
     * ��ȡisFulfillable���Ե�ֵ��
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
     * ����isFulfillable���Ե�ֵ��
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
     * ��ȡisGcoCompliant���Ե�ֵ��
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
     * ����isGcoCompliant���Ե�ֵ��
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
     * ��ȡisInactive���Ե�ֵ��
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
     * ����isInactive���Ե�ֵ��
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
     * ��ȡisLotItem���Ե�ֵ��
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
     * ����isLotItem���Ե�ֵ��
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
     * ��ȡisOnline���Ե�ֵ��
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
     * ����isOnline���Ե�ֵ��
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
     * ��ȡisPreferredVendor���Ե�ֵ��
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
     * ����isPreferredVendor���Ե�ֵ��
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
     * ��ȡisSerialItem���Ե�ֵ��
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
     * ����isSerialItem���Ե�ֵ��
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
     * ��ȡisSpecialOrderItem���Ե�ֵ��
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
     * ����isSpecialOrderItem���Ե�ֵ��
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
     * ��ȡisSpecialWorkOrderItem���Ե�ֵ��
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
     * ����isSpecialWorkOrderItem���Ե�ֵ��
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
     * ��ȡisStorePickupAllowed���Ե�ֵ��
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
     * ����isStorePickupAllowed���Ե�ֵ��
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
     * ��ȡissueProduct���Ե�ֵ��
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
     * ����issueProduct���Ե�ֵ��
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
     * ��ȡisTaxable���Ե�ֵ��
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
     * ����isTaxable���Ե�ֵ��
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
     * ��ȡisVsoeBundle���Ե�ֵ��
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
     * ����isVsoeBundle���Ե�ֵ��
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
     * ��ȡitemId���Ե�ֵ��
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
     * ����itemId���Ե�ֵ��
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
     * ��ȡitemRevenueCategory���Ե�ֵ��
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
     * ����itemRevenueCategory���Ե�ֵ��
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
     * ��ȡitemUrl���Ե�ֵ��
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
     * ����itemUrl���Ե�ֵ��
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
     * ��ȡlastInvtCountDate���Ե�ֵ��
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
     * ����lastInvtCountDate���Ե�ֵ��
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
     * ��ȡlastPurchasePrice���Ե�ֵ��
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
     * ����lastPurchasePrice���Ե�ֵ��
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
     * ��ȡlastQuantityAvailableChange���Ե�ֵ��
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
     * ����lastQuantityAvailableChange���Ե�ֵ��
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
     * ��ȡleadTime���Ե�ֵ��
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
     * ����leadTime���Ե�ֵ��
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
     * ��ȡlistingDuration���Ե�ֵ��
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
     * ����listingDuration���Ե�ֵ��
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
     * ��ȡlocationAllowStorePickup���Ե�ֵ��
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
     * ����locationAllowStorePickup���Ե�ֵ��
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
     * ��ȡlocationAtpLeadTime���Ե�ֵ��
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
     * ����locationAtpLeadTime���Ե�ֵ��
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
     * ��ȡlocationAverageCost���Ե�ֵ��
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
     * ����locationAverageCost���Ե�ֵ��
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
     * ��ȡlocationBuildTime���Ե�ֵ��
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
     * ����locationBuildTime���Ե�ֵ��
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
     * ��ȡlocationCost���Ե�ֵ��
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
     * ����locationCost���Ե�ֵ��
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
     * ��ȡlocationCostAccountingStatus���Ե�ֵ��
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
     * ����locationCostAccountingStatus���Ե�ֵ��
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
     * ��ȡlocationDefaultReturnCost���Ե�ֵ��
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
     * ����locationDefaultReturnCost���Ե�ֵ��
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
     * ��ȡlocationDemandSource���Ե�ֵ��
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
     * ����locationDemandSource���Ե�ֵ��
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
     * ��ȡlocationDemandTimeFence���Ե�ֵ��
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
     * ����locationDemandTimeFence���Ե�ֵ��
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
     * ��ȡlocationFixedLotSize���Ե�ֵ��
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
     * ����locationFixedLotSize���Ե�ֵ��
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
     * ��ȡlocationInventoryCostTemplate���Ե�ֵ��
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
     * ����locationInventoryCostTemplate���Ե�ֵ��
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
     * ��ȡlocationInvtClassification���Ե�ֵ��
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
     * ����locationInvtClassification���Ե�ֵ��
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
     * ��ȡlocationInvtCountInterval���Ե�ֵ��
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
     * ����locationInvtCountInterval���Ե�ֵ��
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
     * ��ȡlocationLastInvtCountDate���Ե�ֵ��
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
     * ����locationLastInvtCountDate���Ե�ֵ��
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
     * ��ȡlocationLeadTime���Ե�ֵ��
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
     * ����locationLeadTime���Ե�ֵ��
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
     * ��ȡlocationNextInvtCountDate���Ե�ֵ��
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
     * ����locationNextInvtCountDate���Ե�ֵ��
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
     * ��ȡlocationPeriodicLotSizeDays���Ե�ֵ��
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
     * ����locationPeriodicLotSizeDays���Ե�ֵ��
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
     * ��ȡlocationPeriodicLotSizeType���Ե�ֵ��
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
     * ����locationPeriodicLotSizeType���Ե�ֵ��
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
     * ��ȡlocationPreferredStockLevel���Ե�ֵ��
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
     * ����locationPreferredStockLevel���Ե�ֵ��
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
     * ��ȡlocationQtyAvailForStorePickup���Ե�ֵ��
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
     * ����locationQtyAvailForStorePickup���Ե�ֵ��
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
     * ��ȡlocationQuantityAvailable���Ե�ֵ��
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
     * ����locationQuantityAvailable���Ե�ֵ��
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
     * ��ȡlocationQuantityBackOrdered���Ե�ֵ��
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
     * ����locationQuantityBackOrdered���Ե�ֵ��
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
     * ��ȡlocationQuantityCommitted���Ե�ֵ��
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
     * ����locationQuantityCommitted���Ե�ֵ��
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
     * ��ȡlocationQuantityInTransit���Ե�ֵ��
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
     * ����locationQuantityInTransit���Ե�ֵ��
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
     * ��ȡlocationQuantityOnHand���Ե�ֵ��
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
     * ����locationQuantityOnHand���Ե�ֵ��
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
     * ��ȡlocationQuantityOnOrder���Ե�ֵ��
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
     * ����locationQuantityOnOrder���Ե�ֵ��
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
     * ��ȡlocationReorderPoint���Ե�ֵ��
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
     * ����locationReorderPoint���Ե�ֵ��
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
     * ��ȡlocationRescheduleInDays���Ե�ֵ��
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
     * ����locationRescheduleInDays���Ե�ֵ��
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
     * ��ȡlocationRescheduleOutDays���Ե�ֵ��
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
     * ����locationRescheduleOutDays���Ե�ֵ��
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
     * ��ȡlocationSafetyStockLevel���Ե�ֵ��
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
     * ����locationSafetyStockLevel���Ե�ֵ��
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
     * ��ȡlocationStorePickupBufferStock���Ե�ֵ��
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
     * ����locationStorePickupBufferStock���Ե�ֵ��
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
     * ��ȡlocationSupplyLotSizingMethod���Ե�ֵ��
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
     * ����locationSupplyLotSizingMethod���Ե�ֵ��
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
     * ��ȡlocationSupplyTimeFence���Ե�ֵ��
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
     * ����locationSupplyTimeFence���Ե�ֵ��
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
     * ��ȡlocationSupplyType���Ե�ֵ��
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
     * ����locationSupplyType���Ե�ֵ��
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
     * ��ȡlocationTotalValue���Ե�ֵ��
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
     * ����locationTotalValue���Ե�ֵ��
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
     * ��ȡlocBackwardConsumptionDays���Ե�ֵ��
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
     * ����locBackwardConsumptionDays���Ե�ֵ��
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
     * ��ȡlocForwardConsumptionDays���Ե�ֵ��
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
     * ����locForwardConsumptionDays���Ե�ֵ��
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
     * ��ȡmanufacturer���Ե�ֵ��
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
     * ����manufacturer���Ե�ֵ��
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
     * ��ȡmanufactureraddr1���Ե�ֵ��
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
     * ����manufactureraddr1���Ե�ֵ��
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
     * ��ȡmanufacturerCity���Ե�ֵ��
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
     * ����manufacturerCity���Ե�ֵ��
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
     * ��ȡmanufacturerState���Ե�ֵ��
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
     * ����manufacturerState���Ե�ֵ��
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
     * ��ȡmanufacturerTariff���Ե�ֵ��
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
     * ����manufacturerTariff���Ե�ֵ��
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
     * ��ȡmanufacturerTaxId���Ե�ֵ��
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
     * ����manufacturerTaxId���Ե�ֵ��
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
     * ��ȡmanufacturerZip���Ե�ֵ��
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
     * ����manufacturerZip���Ե�ֵ��
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
     * ��ȡmanufacturingChargeItem���Ե�ֵ��
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
     * ����manufacturingChargeItem���Ե�ֵ��
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
     * ��ȡmatrix���Ե�ֵ��
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
     * ����matrix���Ե�ֵ��
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
     * ��ȡmatrixChild���Ե�ֵ��
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
     * ����matrixChild���Ե�ֵ��
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
     * ��ȡmetaTagHtml���Ե�ֵ��
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
     * ����metaTagHtml���Ե�ֵ��
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
     * ��ȡminimumQuantity���Ե�ֵ��
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
     * ����minimumQuantity���Ե�ֵ��
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
     * ��ȡmossApplies���Ե�ֵ��
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
     * ����mossApplies���Ե�ֵ��
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
     * ��ȡmpn���Ե�ֵ��
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
     * ����mpn���Ե�ֵ��
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
     * ��ȡmultManufactureAddr���Ե�ֵ��
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
     * ����multManufactureAddr���Ե�ֵ��
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
     * ��ȡnexTagCategory���Ե�ֵ��
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
     * ����nexTagCategory���Ե�ֵ��
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
     * ��ȡnexTagProductFeed���Ե�ֵ��
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
     * ����nexTagProductFeed���Ե�ֵ��
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
     * ��ȡnextInvtCountDate���Ե�ֵ��
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
     * ����nextInvtCountDate���Ե�ֵ��
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
     * ��ȡnumActiveListings���Ե�ֵ��
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
     * ����numActiveListings���Ե�ֵ��
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
     * ��ȡnumberAllowedDownloads���Ե�ֵ��
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
     * ����numberAllowedDownloads���Ե�ֵ��
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
     * ��ȡnumCurrentlyListed���Ե�ֵ��
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
     * ����numCurrentlyListed���Ե�ֵ��
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
     * ��ȡobsoleteDate���Ե�ֵ��
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
     * ����obsoleteDate���Ե�ֵ��
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
     * ��ȡobsoleteRevision���Ե�ֵ��
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
     * ����obsoleteRevision���Ե�ֵ��
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
     * ��ȡofferSupport���Ե�ֵ��
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
     * ����offerSupport���Ե�ֵ��
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
     * ��ȡonlineCustomerPrice���Ե�ֵ��
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
     * ����onlineCustomerPrice���Ե�ֵ��
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
     * ��ȡonSpecial���Ե�ֵ��
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
     * ����onSpecial���Ե�ֵ��
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
     * ��ȡotherVendor���Ե�ֵ��
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
     * ����otherVendor���Ե�ֵ��
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
     * ��ȡoutOfStockBehavior���Ե�ֵ��
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
     * ����outOfStockBehavior���Ե�ֵ��
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
     * ��ȡoverallQuantityPricingType���Ե�ֵ��
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
     * ����overallQuantityPricingType���Ե�ֵ��
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
     * ��ȡoverheadType���Ե�ֵ��
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
     * ����overheadType���Ե�ֵ��
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
     * ��ȡpageTitle���Ե�ֵ��
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
     * ����pageTitle���Ե�ֵ��
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
     * ��ȡparent���Ե�ֵ��
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
     * ����parent���Ե�ֵ��
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
     * ��ȡperiodicLotSizeDays���Ե�ֵ��
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
     * ����periodicLotSizeDays���Ե�ֵ��
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
     * ��ȡperiodicLotSizeType���Ե�ֵ��
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
     * ����periodicLotSizeType���Ե�ֵ��
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
     * ��ȡpreferenceCriterion���Ե�ֵ��
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
     * ����preferenceCriterion���Ե�ֵ��
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
     * ��ȡpreferredBin���Ե�ֵ��
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
     * ����preferredBin���Ե�ֵ��
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
     * ��ȡpreferredLocation���Ե�ֵ��
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
     * ����preferredLocation���Ե�ֵ��
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
     * ��ȡpreferredStockLevel���Ե�ֵ��
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
     * ����preferredStockLevel���Ե�ֵ��
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
     * ��ȡpreferredStockLevelDays���Ե�ֵ��
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
     * ����preferredStockLevelDays���Ե�ֵ��
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
     * ��ȡprice���Ե�ֵ��
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
     * ����price���Ե�ֵ��
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
     * ��ȡpricesIncludeTax���Ե�ֵ��
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
     * ����pricesIncludeTax���Ե�ֵ��
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
     * ��ȡpricingGroup���Ե�ֵ��
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
     * ����pricingGroup���Ե�ֵ��
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
     * ��ȡprimaryCategory���Ե�ֵ��
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
     * ����primaryCategory���Ե�ֵ��
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
     * ��ȡpurchaseOrderAmount���Ե�ֵ��
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
     * ����purchaseOrderAmount���Ե�ֵ��
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
     * ��ȡpurchaseOrderQuantity���Ե�ֵ��
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
     * ����purchaseOrderQuantity���Ե�ֵ��
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
     * ��ȡpurchaseOrderQuantityDiff���Ե�ֵ��
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
     * ����purchaseOrderQuantityDiff���Ե�ֵ��
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
     * ��ȡpurchaseUnit���Ե�ֵ��
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
     * ����purchaseUnit���Ե�ֵ��
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
     * ��ȡquantityAvailable���Ե�ֵ��
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
     * ����quantityAvailable���Ե�ֵ��
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
     * ��ȡquantityBackOrdered���Ե�ֵ��
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
     * ����quantityBackOrdered���Ե�ֵ��
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
     * ��ȡquantityOnHand���Ե�ֵ��
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
     * ����quantityOnHand���Ե�ֵ��
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
     * ��ȡquantityOnOrder���Ե�ֵ��
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
     * ����quantityOnOrder���Ե�ֵ��
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
     * ��ȡquantityPricingSchedule���Ե�ֵ��
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
     * ����quantityPricingSchedule���Ե�ֵ��
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
     * ��ȡreceiptAmount���Ե�ֵ��
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
     * ����receiptAmount���Ե�ֵ��
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
     * ��ȡreceiptQuantity���Ե�ֵ��
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
     * ����receiptQuantity���Ե�ֵ��
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
     * ��ȡreceiptQuantityDiff���Ե�ֵ��
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
     * ����receiptQuantityDiff���Ե�ֵ��
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
     * ��ȡreorderMultiple���Ե�ֵ��
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
     * ����reorderMultiple���Ե�ֵ��
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
     * ��ȡreorderPoint���Ե�ֵ��
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
     * ����reorderPoint���Ե�ֵ��
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
     * ��ȡrescheduleInDays���Ե�ֵ��
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
     * ����rescheduleInDays���Ե�ֵ��
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
     * ��ȡrescheduleOutDays���Ե�ֵ��
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
     * ����rescheduleOutDays���Ե�ֵ��
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
     * ��ȡreservePrice���Ե�ֵ��
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
     * ����reservePrice���Ե�ֵ��
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
     * ��ȡrevenueAllocationGroup���Ե�ֵ��
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
     * ����revenueAllocationGroup���Ե�ֵ��
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
     * ��ȡrevenueRecognitionRule���Ե�ֵ��
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
     * ����revenueRecognitionRule���Ե�ֵ��
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
     * ��ȡrevRecForecastRule���Ե�ֵ��
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
     * ����revRecForecastRule���Ե�ֵ��
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
     * ��ȡrevRecSchedule���Ե�ֵ��
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
     * ����revRecSchedule���Ե�ֵ��
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
     * ��ȡroundUpAsComponent���Ե�ֵ��
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
     * ����roundUpAsComponent���Ե�ֵ��
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
     * ��ȡsafetyStockLevel���Ե�ֵ��
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
     * ����safetyStockLevel���Ե�ֵ��
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
     * ��ȡsafetyStockLevelDays���Ե�ֵ��
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
     * ����safetyStockLevelDays���Ե�ֵ��
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
     * ��ȡsalesDescription���Ե�ֵ��
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
     * ����salesDescription���Ե�ֵ��
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
     * ��ȡsaleUnit���Ե�ֵ��
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
     * ����saleUnit���Ե�ֵ��
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
     * ��ȡsameAsPrimaryBookAmortization���Ե�ֵ��
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
     * ����sameAsPrimaryBookAmortization���Ե�ֵ��
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
     * ��ȡsameAsPrimaryBookRevRec���Ե�ֵ��
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
     * ����sameAsPrimaryBookRevRec���Ե�ֵ��
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
     * ��ȡscheduleBCode���Ե�ֵ��
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
     * ����scheduleBCode���Ե�ֵ��
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
     * ��ȡscheduleBNumber���Ե�ֵ��
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
     * ����scheduleBNumber���Ե�ֵ��
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
     * ��ȡscheduleBQuantity���Ե�ֵ��
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
     * ����scheduleBQuantity���Ե�ֵ��
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
     * ��ȡsearchKeywords���Ե�ֵ��
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
     * ����searchKeywords���Ե�ֵ��
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
     * ��ȡseasonalDemand���Ե�ֵ��
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
     * ����seasonalDemand���Ե�ֵ��
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
     * ��ȡsellOnEBay���Ե�ֵ��
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
     * ����sellOnEBay���Ե�ֵ��
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
     * ��ȡserialNumberLocation���Ե�ֵ��
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
     * ����serialNumberLocation���Ե�ֵ��
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
     * ��ȡshipIndividually���Ե�ֵ��
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
     * ����shipIndividually���Ե�ֵ��
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
     * ��ȡshipPackage���Ե�ֵ��
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
     * ����shipPackage���Ե�ֵ��
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
     * ��ȡshippingCarrier���Ե�ֵ��
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
     * ����shippingCarrier���Ե�ֵ��
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
     * ��ȡshippingRate���Ե�ֵ��
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
     * ����shippingRate���Ե�ֵ��
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
     * ��ȡshoppingDotComCategory���Ե�ֵ��
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
     * ����shoppingDotComCategory���Ե�ֵ��
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
     * ��ȡshoppingProductFeed���Ե�ֵ��
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
     * ����shoppingProductFeed���Ե�ֵ��
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
     * ��ȡshopzillaCategoryId���Ե�ֵ��
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
     * ����shopzillaCategoryId���Ե�ֵ��
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
     * ��ȡshopzillaProductFeed���Ե�ֵ��
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
     * ����shopzillaProductFeed���Ե�ֵ��
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
     * ��ȡsitemapPriority���Ե�ֵ��
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
     * ����sitemapPriority���Ե�ֵ��
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
     * ��ȡsoftDescriptor���Ե�ֵ��
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
     * ����softDescriptor���Ե�ֵ��
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
     * ��ȡstartingPrice���Ե�ֵ��
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
     * ����startingPrice���Ե�ֵ��
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
     * ��ȡstockDescription���Ե�ֵ��
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
     * ����stockDescription���Ե�ֵ��
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
     * ��ȡstockUnit���Ե�ֵ��
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
     * ����stockUnit���Ե�ֵ��
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
     * ��ȡstoreDescription���Ե�ֵ��
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
     * ����storeDescription���Ե�ֵ��
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
     * ��ȡsubType���Ե�ֵ��
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
     * ����subType���Ե�ֵ��
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
     * ��ȡsupplyLotSizingMethod���Ե�ֵ��
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
     * ����supplyLotSizingMethod���Ե�ֵ��
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
     * ��ȡsupplyReplenishmentMethod���Ե�ֵ��
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
     * ����supplyReplenishmentMethod���Ե�ֵ��
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
     * ��ȡsupplyTimeFence���Ե�ֵ��
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
     * ����supplyTimeFence���Ե�ֵ��
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
     * ��ȡsupplyType���Ե�ֵ��
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
     * ����supplyType���Ե�ֵ��
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
     * ��ȡtaxCode���Ե�ֵ��
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
     * ����taxCode���Ե�ֵ��
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
     * ��ȡtaxSchedule���Ե�ֵ��
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
     * ����taxSchedule���Ե�ֵ��
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
     * ��ȡthumbnailUrl���Ե�ֵ��
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
     * ����thumbnailUrl���Ե�ֵ��
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
     * ��ȡtotalValue���Ե�ֵ��
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
     * ����totalValue���Ե�ֵ��
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
     * ��ȡtrackLandedCost���Ե�ֵ��
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
     * ����trackLandedCost���Ե�ֵ��
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
     * ��ȡtransferPrice���Ե�ֵ��
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
     * ����transferPrice���Ե�ֵ��
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
     * ��ȡupcCode���Ե�ֵ��
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
     * ����upcCode���Ե�ֵ��
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
     * ��ȡurlComponent���Ե�ֵ��
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
     * ����urlComponent���Ե�ֵ��
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
     * ��ȡuseBins���Ե�ֵ��
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
     * ����useBins���Ե�ֵ��
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
     * ��ȡuseComponentYield���Ե�ֵ��
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
     * ����useComponentYield���Ե�ֵ��
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
     * ��ȡuseMarginalRates���Ե�ֵ��
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
     * ����useMarginalRates���Ե�ֵ��
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
     * ��ȡvendor���Ե�ֵ��
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
     * ����vendor���Ե�ֵ��
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
     * ��ȡvendorCode���Ե�ֵ��
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
     * ����vendorCode���Ե�ֵ��
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
     * ��ȡvendorCost���Ե�ֵ��
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
     * ����vendorCost���Ե�ֵ��
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
     * ��ȡvendorCostEntered���Ե�ֵ��
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
     * ����vendorCostEntered���Ե�ֵ��
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
     * ��ȡvendorName���Ե�ֵ��
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
     * ����vendorName���Ե�ֵ��
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
     * ��ȡvendorPriceCurrency���Ե�ֵ��
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
     * ����vendorPriceCurrency���Ե�ֵ��
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
     * ��ȡvsoeSopGroup���Ե�ֵ��
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
     * ����vsoeSopGroup���Ե�ֵ��
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
     * ��ȡweight���Ե�ֵ��
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
     * ����weight���Ե�ֵ��
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
     * ��ȡyahooProductFeed���Ե�ֵ��
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
     * ����yahooProductFeed���Ե�ֵ��
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
