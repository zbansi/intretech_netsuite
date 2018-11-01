
package com.netsuite.webservices.lists.accounting_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.lists.accounting_2018_2.types.HazmatPackingGroup;
import com.netsuite.webservices.lists.accounting_2018_2.types.InventoryItemFraudRisk;
import com.netsuite.webservices.lists.accounting_2018_2.types.ItemCostingMethod;
import com.netsuite.webservices.lists.accounting_2018_2.types.ItemInvtClassification;
import com.netsuite.webservices.lists.accounting_2018_2.types.ItemMatrixType;
import com.netsuite.webservices.lists.accounting_2018_2.types.ItemOutOfStockBehavior;
import com.netsuite.webservices.lists.accounting_2018_2.types.ItemOverallQuantityPricingType;
import com.netsuite.webservices.lists.accounting_2018_2.types.ItemPreferenceCriterion;
import com.netsuite.webservices.lists.accounting_2018_2.types.ItemSubType;
import com.netsuite.webservices.lists.accounting_2018_2.types.ItemType;
import com.netsuite.webservices.lists.accounting_2018_2.types.ItemWeightUnit;
import com.netsuite.webservices.lists.accounting_2018_2.types.PeriodicLotSizeType;
import com.netsuite.webservices.platform.common_2018_2.types.Country;
import com.netsuite.webservices.platform.common_2018_2.types.ItemCostEstimateType;
import com.netsuite.webservices.platform.common_2018_2.types.ShippingCarrier;
import com.netsuite.webservices.platform.common_2018_2.types.VsoeDeferral;
import com.netsuite.webservices.platform.common_2018_2.types.VsoePermitDiscount;
import com.netsuite.webservices.platform.common_2018_2.types.VsoeSopGroup;
import com.netsuite.webservices.platform.core_2018_2.CustomFieldList;
import com.netsuite.webservices.platform.core_2018_2.Record;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;
import com.netsuite.webservices.platform.core_2018_2.RecordRefList;


/**
 * <p>InventoryItem complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="InventoryItem">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}Record">
 *       &lt;sequence>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="purchaseDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="copyDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="expenseAccount" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="dateConvertedToInv" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="originalItemType" type="{urn:types.accounting_2018_2.lists.webservices.netsuite.com}ItemType" minOccurs="0"/>
 *         &lt;element name="originalItemSubtype" type="{urn:types.accounting_2018_2.lists.webservices.netsuite.com}ItemSubType" minOccurs="0"/>
 *         &lt;element name="cogsAccount" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="intercoCogsAccount" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="salesDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fraudRisk" type="{urn:types.accounting_2018_2.lists.webservices.netsuite.com}InventoryItemFraudRisk" minOccurs="0"/>
 *         &lt;element name="includeChildren" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="incomeAccount" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="intercoIncomeAccount" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="taxSchedule" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="dropshipExpenseAccount" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="deferRevRec" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="revenueRecognitionRule" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="revRecForecastRule" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="revenueAllocationGroup" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="createRevenuePlansOn" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="directRevenuePosting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="contingentRevenueHandling" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="revReclassFXAccount" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="isTaxable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="matrixType" type="{urn:types.accounting_2018_2.lists.webservices.netsuite.com}ItemMatrixType" minOccurs="0"/>
 *         &lt;element name="assetAccount" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="matchBillToReceipt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="billQtyVarianceAcct" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="billPriceVarianceAcct" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="billExchRateVarianceAcct" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="gainLossAccount" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="shippingCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="shippingCostUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="handlingCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="handlingCostUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="weightUnit" type="{urn:types.accounting_2018_2.lists.webservices.netsuite.com}ItemWeightUnit" minOccurs="0"/>
 *         &lt;element name="weightUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="costingMethodDisplay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitsType" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="stockUnit" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="purchaseUnit" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="saleUnit" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="issueProduct" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="billingSchedule" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="trackLandedCost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="matrixItemNameTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isDropShipItem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isSpecialOrderItem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="stockDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deferredRevenueAccount" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="intercoDefRevAccount" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="producer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="revRecSchedule" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="mpn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="multManufactureAddr" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="manufacturerAddr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manufacturerCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manufacturerState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manufacturerZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryOfManufacture" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}Country" minOccurs="0"/>
 *         &lt;element name="roundUpAsComponent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="purchaseOrderQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="purchaseOrderAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="purchaseOrderQuantityDiff" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="receiptQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="receiptAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="receiptQuantityDiff" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="defaultItemShipMethod" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="itemCarrier" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}ShippingCarrier" minOccurs="0"/>
 *         &lt;element name="itemShipMethodList" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRefList" minOccurs="0"/>
 *         &lt;element name="manufacturerTaxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scheduleBNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scheduleBQuantity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="scheduleBCode" type="{urn:types.accounting_2018_2.lists.webservices.netsuite.com}ScheduleBCode" minOccurs="0"/>
 *         &lt;element name="manufacturerTariff" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preferenceCriterion" type="{urn:types.accounting_2018_2.lists.webservices.netsuite.com}ItemPreferenceCriterion" minOccurs="0"/>
 *         &lt;element name="minimumQuantity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="enforceMinQtyInternally" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="minimumQuantityUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="softDescriptor" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="shipPackage" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="shipIndividually" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="costCategory" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="pricesIncludeTax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="purchasePriceVarianceAcct" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="quantityPricingSchedule" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="reorderPointUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="useMarginalRates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="preferredStockLevelUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="costEstimateType" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}ItemCostEstimateType" minOccurs="0"/>
 *         &lt;element name="costEstimate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="transferPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="overallQuantityPricingType" type="{urn:types.accounting_2018_2.lists.webservices.netsuite.com}ItemOverallQuantityPricingType" minOccurs="0"/>
 *         &lt;element name="pricingGroup" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="vsoePrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="vsoeSopGroup" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}VsoeSopGroup" minOccurs="0"/>
 *         &lt;element name="costEstimateUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vsoeDeferral" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}VsoeDeferral" minOccurs="0"/>
 *         &lt;element name="vsoePermitDiscount" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}VsoePermitDiscount" minOccurs="0"/>
 *         &lt;element name="vsoeDelivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="itemRevenueCategory" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="preferredLocation" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="isStorePickupAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="reorderMultiple" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="lastInvtCountDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="nextInvtCountDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="invtCountInterval" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="invtClassification" type="{urn:types.accounting_2018_2.lists.webservices.netsuite.com}ItemInvtClassification" minOccurs="0"/>
 *         &lt;element name="costUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="averageCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="useBins" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="quantityReorderUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="leadTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="autoLeadTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="lastPurchasePrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="autoPreferredStockLevel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="preferredStockLevelDays" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="safetyStockLevel" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="safetyStockLevelDays" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="backwardConsumptionDays" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="seasonalDemand" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="safetyStockLevelUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="demandModifier" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="distributionNetwork" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="distributionCategory" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="autoReorderPoint" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="storeDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="storeDisplayThumbnail" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="storeDisplayImage" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="storeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="storeDetailedDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="storeItemTemplate" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="pageTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="metaTagHtml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="excludeFromSitemap" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sitemapPriority" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}SitemapPriority" minOccurs="0"/>
 *         &lt;element name="searchKeywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isDonationItem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showDefaultDonationAmount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="maxDonationAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="dontShowPrice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="noPriceMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outOfStockMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="onSpecial" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="outOfStockBehavior" type="{urn:types.accounting_2018_2.lists.webservices.netsuite.com}ItemOutOfStockBehavior" minOccurs="0"/>
 *         &lt;element name="relatedItemsDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="specialsDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="featuredDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shoppingDotComCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shopzillaCategoryId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nexTagCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urlComponent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customForm" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="upcCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vendorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parent" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="isOnline" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isHazmatItem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="hazmatId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hazmatShippingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hazmatHazardClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hazmatPackingGroup" type="{urn:types.accounting_2018_2.lists.webservices.netsuite.com}HazmatPackingGroup" minOccurs="0"/>
 *         &lt;element name="hazmatItemUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hazmatItemUnitsQty" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="isGcoCompliant" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="offerSupport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isInactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="availableToPartners" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="department" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="class" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="location" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="costingMethod" type="{urn:types.accounting_2018_2.lists.webservices.netsuite.com}ItemCostingMethod" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preferredStockLevel" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="pricingMatrix" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}PricingMatrix" minOccurs="0"/>
 *         &lt;element name="accountingBookDetailList" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}ItemAccountingBookDetailList" minOccurs="0"/>
 *         &lt;element name="purchaseTaxCode" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="defaultReturnCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="supplyReplenishmentMethod" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="alternateDemandSourceItem" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="fixedLotSize" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="periodicLotSizeType" type="{urn:types.accounting_2018_2.lists.webservices.netsuite.com}PeriodicLotSizeType" minOccurs="0"/>
 *         &lt;element name="supplyType" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="demandTimeFence" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="supplyTimeFence" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="rescheduleInDays" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="rescheduleOutDays" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="periodicLotSizeDays" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="supplyLotSizingMethod" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="forwardConsumptionDays" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="demandSource" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="quantityBackOrdered" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="quantityCommitted" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="quantityAvailable" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="quantityOnHand" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="onHandValueMli" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="quantityOnOrder" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="rate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="reorderPoint" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="quantityCommittedUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salesTaxCode" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="quantityAvailableUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quantityOnHandUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vendor" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="quantityOnOrderUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productFeedList" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}ProductFeedList" minOccurs="0"/>
 *         &lt;element name="subsidiaryList" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRefList" minOccurs="0"/>
 *         &lt;element name="itemOptionsList" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}ItemOptionsList" minOccurs="0"/>
 *         &lt;element name="itemVendorList" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}ItemVendorList" minOccurs="0"/>
 *         &lt;element name="siteCategoryList" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}SiteCategoryList" minOccurs="0"/>
 *         &lt;element name="translationsList" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}TranslationList" minOccurs="0"/>
 *         &lt;element name="binNumberList" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}InventoryItemBinNumberList" minOccurs="0"/>
 *         &lt;element name="locationsList" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}InventoryItemLocationsList" minOccurs="0"/>
 *         &lt;element name="matrixOptionList" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}MatrixOptionList" minOccurs="0"/>
 *         &lt;element name="presentationItemList" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}PresentationItemList" minOccurs="0"/>
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
@XmlType(name = "InventoryItem", propOrder = {
    "createdDate",
    "lastModifiedDate",
    "purchaseDescription",
    "copyDescription",
    "expenseAccount",
    "dateConvertedToInv",
    "originalItemType",
    "originalItemSubtype",
    "cogsAccount",
    "intercoCogsAccount",
    "salesDescription",
    "fraudRisk",
    "includeChildren",
    "incomeAccount",
    "intercoIncomeAccount",
    "taxSchedule",
    "dropshipExpenseAccount",
    "deferRevRec",
    "revenueRecognitionRule",
    "revRecForecastRule",
    "revenueAllocationGroup",
    "createRevenuePlansOn",
    "directRevenuePosting",
    "contingentRevenueHandling",
    "revReclassFXAccount",
    "isTaxable",
    "matrixType",
    "assetAccount",
    "matchBillToReceipt",
    "billQtyVarianceAcct",
    "billPriceVarianceAcct",
    "billExchRateVarianceAcct",
    "gainLossAccount",
    "shippingCost",
    "shippingCostUnits",
    "handlingCost",
    "handlingCostUnits",
    "weight",
    "weightUnit",
    "weightUnits",
    "costingMethodDisplay",
    "unitsType",
    "stockUnit",
    "purchaseUnit",
    "saleUnit",
    "issueProduct",
    "billingSchedule",
    "trackLandedCost",
    "matrixItemNameTemplate",
    "isDropShipItem",
    "isSpecialOrderItem",
    "stockDescription",
    "deferredRevenueAccount",
    "intercoDefRevAccount",
    "producer",
    "manufacturer",
    "revRecSchedule",
    "mpn",
    "multManufactureAddr",
    "manufacturerAddr1",
    "manufacturerCity",
    "manufacturerState",
    "manufacturerZip",
    "countryOfManufacture",
    "roundUpAsComponent",
    "purchaseOrderQuantity",
    "purchaseOrderAmount",
    "purchaseOrderQuantityDiff",
    "receiptQuantity",
    "receiptAmount",
    "receiptQuantityDiff",
    "defaultItemShipMethod",
    "itemCarrier",
    "itemShipMethodList",
    "manufacturerTaxId",
    "scheduleBNumber",
    "scheduleBQuantity",
    "scheduleBCode",
    "manufacturerTariff",
    "preferenceCriterion",
    "minimumQuantity",
    "enforceMinQtyInternally",
    "minimumQuantityUnits",
    "softDescriptor",
    "shipPackage",
    "shipIndividually",
    "costCategory",
    "pricesIncludeTax",
    "purchasePriceVarianceAcct",
    "quantityPricingSchedule",
    "reorderPointUnits",
    "useMarginalRates",
    "preferredStockLevelUnits",
    "costEstimateType",
    "costEstimate",
    "transferPrice",
    "overallQuantityPricingType",
    "pricingGroup",
    "vsoePrice",
    "vsoeSopGroup",
    "costEstimateUnits",
    "vsoeDeferral",
    "vsoePermitDiscount",
    "vsoeDelivered",
    "itemRevenueCategory",
    "preferredLocation",
    "isStorePickupAllowed",
    "reorderMultiple",
    "cost",
    "lastInvtCountDate",
    "nextInvtCountDate",
    "invtCountInterval",
    "invtClassification",
    "costUnits",
    "totalValue",
    "averageCost",
    "useBins",
    "quantityReorderUnits",
    "leadTime",
    "autoLeadTime",
    "lastPurchasePrice",
    "autoPreferredStockLevel",
    "preferredStockLevelDays",
    "safetyStockLevel",
    "safetyStockLevelDays",
    "backwardConsumptionDays",
    "seasonalDemand",
    "safetyStockLevelUnits",
    "demandModifier",
    "distributionNetwork",
    "distributionCategory",
    "autoReorderPoint",
    "storeDisplayName",
    "storeDisplayThumbnail",
    "storeDisplayImage",
    "storeDescription",
    "storeDetailedDescription",
    "storeItemTemplate",
    "pageTitle",
    "metaTagHtml",
    "excludeFromSitemap",
    "sitemapPriority",
    "searchKeywords",
    "isDonationItem",
    "showDefaultDonationAmount",
    "maxDonationAmount",
    "dontShowPrice",
    "noPriceMessage",
    "outOfStockMessage",
    "onSpecial",
    "outOfStockBehavior",
    "relatedItemsDescription",
    "specialsDescription",
    "featuredDescription",
    "shoppingDotComCategory",
    "shopzillaCategoryId",
    "nexTagCategory",
    "urlComponent",
    "customForm",
    "itemId",
    "upcCode",
    "displayName",
    "vendorName",
    "parent",
    "isOnline",
    "isHazmatItem",
    "hazmatId",
    "hazmatShippingName",
    "hazmatHazardClass",
    "hazmatPackingGroup",
    "hazmatItemUnits",
    "hazmatItemUnitsQty",
    "isGcoCompliant",
    "offerSupport",
    "isInactive",
    "availableToPartners",
    "department",
    "clazz",
    "location",
    "costingMethod",
    "currency",
    "preferredStockLevel",
    "pricingMatrix",
    "accountingBookDetailList",
    "purchaseTaxCode",
    "defaultReturnCost",
    "supplyReplenishmentMethod",
    "alternateDemandSourceItem",
    "fixedLotSize",
    "periodicLotSizeType",
    "supplyType",
    "demandTimeFence",
    "supplyTimeFence",
    "rescheduleInDays",
    "rescheduleOutDays",
    "periodicLotSizeDays",
    "supplyLotSizingMethod",
    "forwardConsumptionDays",
    "demandSource",
    "quantityBackOrdered",
    "quantityCommitted",
    "quantityAvailable",
    "quantityOnHand",
    "onHandValueMli",
    "quantityOnOrder",
    "rate",
    "reorderPoint",
    "quantityCommittedUnits",
    "salesTaxCode",
    "quantityAvailableUnits",
    "quantityOnHandUnits",
    "vendor",
    "quantityOnOrderUnits",
    "productFeedList",
    "subsidiaryList",
    "itemOptionsList",
    "itemVendorList",
    "siteCategoryList",
    "translationsList",
    "binNumberList",
    "locationsList",
    "matrixOptionList",
    "presentationItemList",
    "customFieldList"
})
public class InventoryItem
    extends Record
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    protected String purchaseDescription;
    protected Boolean copyDescription;
    protected RecordRef expenseAccount;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateConvertedToInv;
    @XmlSchemaType(name = "string")
    protected ItemType originalItemType;
    @XmlSchemaType(name = "string")
    protected ItemSubType originalItemSubtype;
    protected RecordRef cogsAccount;
    protected RecordRef intercoCogsAccount;
    protected String salesDescription;
    @XmlSchemaType(name = "string")
    protected InventoryItemFraudRisk fraudRisk;
    protected Boolean includeChildren;
    protected RecordRef incomeAccount;
    protected RecordRef intercoIncomeAccount;
    protected RecordRef taxSchedule;
    protected RecordRef dropshipExpenseAccount;
    protected Boolean deferRevRec;
    protected RecordRef revenueRecognitionRule;
    protected RecordRef revRecForecastRule;
    protected RecordRef revenueAllocationGroup;
    protected RecordRef createRevenuePlansOn;
    protected Boolean directRevenuePosting;
    protected Boolean contingentRevenueHandling;
    protected RecordRef revReclassFXAccount;
    protected Boolean isTaxable;
    @XmlSchemaType(name = "string")
    protected ItemMatrixType matrixType;
    protected RecordRef assetAccount;
    protected Boolean matchBillToReceipt;
    protected RecordRef billQtyVarianceAcct;
    protected RecordRef billPriceVarianceAcct;
    protected RecordRef billExchRateVarianceAcct;
    protected RecordRef gainLossAccount;
    protected Double shippingCost;
    protected String shippingCostUnits;
    protected Double handlingCost;
    protected String handlingCostUnits;
    protected Double weight;
    @XmlSchemaType(name = "string")
    protected ItemWeightUnit weightUnit;
    protected String weightUnits;
    protected String costingMethodDisplay;
    protected RecordRef unitsType;
    protected RecordRef stockUnit;
    protected RecordRef purchaseUnit;
    protected RecordRef saleUnit;
    protected RecordRef issueProduct;
    protected RecordRef billingSchedule;
    protected Boolean trackLandedCost;
    protected String matrixItemNameTemplate;
    protected Boolean isDropShipItem;
    protected Boolean isSpecialOrderItem;
    protected String stockDescription;
    protected RecordRef deferredRevenueAccount;
    protected RecordRef intercoDefRevAccount;
    protected Boolean producer;
    protected String manufacturer;
    protected RecordRef revRecSchedule;
    protected String mpn;
    protected Boolean multManufactureAddr;
    protected String manufacturerAddr1;
    protected String manufacturerCity;
    protected String manufacturerState;
    protected String manufacturerZip;
    @XmlSchemaType(name = "string")
    protected Country countryOfManufacture;
    protected Boolean roundUpAsComponent;
    protected Double purchaseOrderQuantity;
    protected Double purchaseOrderAmount;
    protected Double purchaseOrderQuantityDiff;
    protected Double receiptQuantity;
    protected Double receiptAmount;
    protected Double receiptQuantityDiff;
    protected RecordRef defaultItemShipMethod;
    @XmlSchemaType(name = "string")
    protected ShippingCarrier itemCarrier;
    protected RecordRefList itemShipMethodList;
    protected String manufacturerTaxId;
    protected String scheduleBNumber;
    protected Long scheduleBQuantity;
    protected String scheduleBCode;
    protected String manufacturerTariff;
    @XmlSchemaType(name = "string")
    protected ItemPreferenceCriterion preferenceCriterion;
    protected Long minimumQuantity;
    protected Boolean enforceMinQtyInternally;
    protected String minimumQuantityUnits;
    protected RecordRef softDescriptor;
    protected RecordRef shipPackage;
    protected Boolean shipIndividually;
    protected RecordRef costCategory;
    protected Boolean pricesIncludeTax;
    protected RecordRef purchasePriceVarianceAcct;
    protected RecordRef quantityPricingSchedule;
    protected String reorderPointUnits;
    protected Boolean useMarginalRates;
    protected String preferredStockLevelUnits;
    @XmlSchemaType(name = "string")
    protected ItemCostEstimateType costEstimateType;
    protected Double costEstimate;
    protected Double transferPrice;
    @XmlSchemaType(name = "string")
    protected ItemOverallQuantityPricingType overallQuantityPricingType;
    protected RecordRef pricingGroup;
    protected Double vsoePrice;
    @XmlSchemaType(name = "string")
    protected VsoeSopGroup vsoeSopGroup;
    protected String costEstimateUnits;
    @XmlSchemaType(name = "string")
    protected VsoeDeferral vsoeDeferral;
    @XmlSchemaType(name = "string")
    protected VsoePermitDiscount vsoePermitDiscount;
    protected Boolean vsoeDelivered;
    protected RecordRef itemRevenueCategory;
    protected RecordRef preferredLocation;
    protected Boolean isStorePickupAllowed;
    protected Long reorderMultiple;
    protected Double cost;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastInvtCountDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextInvtCountDate;
    protected Long invtCountInterval;
    @XmlSchemaType(name = "string")
    protected ItemInvtClassification invtClassification;
    protected String costUnits;
    protected Double totalValue;
    protected Double averageCost;
    protected Boolean useBins;
    protected String quantityReorderUnits;
    protected Long leadTime;
    protected Boolean autoLeadTime;
    protected Double lastPurchasePrice;
    protected Boolean autoPreferredStockLevel;
    protected Double preferredStockLevelDays;
    protected Double safetyStockLevel;
    protected Long safetyStockLevelDays;
    protected Long backwardConsumptionDays;
    protected Boolean seasonalDemand;
    protected String safetyStockLevelUnits;
    protected Double demandModifier;
    protected RecordRef distributionNetwork;
    protected RecordRef distributionCategory;
    protected Boolean autoReorderPoint;
    protected String storeDisplayName;
    protected RecordRef storeDisplayThumbnail;
    protected RecordRef storeDisplayImage;
    protected String storeDescription;
    protected String storeDetailedDescription;
    protected RecordRef storeItemTemplate;
    protected String pageTitle;
    protected String metaTagHtml;
    protected Boolean excludeFromSitemap;
    protected String sitemapPriority;
    protected String searchKeywords;
    protected Boolean isDonationItem;
    protected Boolean showDefaultDonationAmount;
    protected Double maxDonationAmount;
    protected Boolean dontShowPrice;
    protected String noPriceMessage;
    protected String outOfStockMessage;
    protected Boolean onSpecial;
    @XmlSchemaType(name = "string")
    protected ItemOutOfStockBehavior outOfStockBehavior;
    protected String relatedItemsDescription;
    protected String specialsDescription;
    protected String featuredDescription;
    protected String shoppingDotComCategory;
    protected Long shopzillaCategoryId;
    protected String nexTagCategory;
    protected String urlComponent;
    protected RecordRef customForm;
    protected String itemId;
    protected String upcCode;
    protected String displayName;
    protected String vendorName;
    protected RecordRef parent;
    protected Boolean isOnline;
    protected Boolean isHazmatItem;
    protected String hazmatId;
    protected String hazmatShippingName;
    protected String hazmatHazardClass;
    @XmlSchemaType(name = "string")
    protected HazmatPackingGroup hazmatPackingGroup;
    protected String hazmatItemUnits;
    protected Double hazmatItemUnitsQty;
    protected Boolean isGcoCompliant;
    protected Boolean offerSupport;
    protected Boolean isInactive;
    protected Boolean availableToPartners;
    protected RecordRef department;
    @XmlElement(name = "class")
    protected RecordRef clazz;
    protected RecordRef location;
    @XmlSchemaType(name = "string")
    protected ItemCostingMethod costingMethod;
    protected String currency;
    protected Double preferredStockLevel;
    protected PricingMatrix pricingMatrix;
    protected ItemAccountingBookDetailList accountingBookDetailList;
    protected RecordRef purchaseTaxCode;
    protected Double defaultReturnCost;
    protected RecordRef supplyReplenishmentMethod;
    protected RecordRef alternateDemandSourceItem;
    protected Double fixedLotSize;
    @XmlSchemaType(name = "string")
    protected PeriodicLotSizeType periodicLotSizeType;
    protected RecordRef supplyType;
    protected Long demandTimeFence;
    protected Long supplyTimeFence;
    protected Long rescheduleInDays;
    protected Long rescheduleOutDays;
    protected Long periodicLotSizeDays;
    protected RecordRef supplyLotSizingMethod;
    protected Long forwardConsumptionDays;
    protected RecordRef demandSource;
    protected Double quantityBackOrdered;
    protected Double quantityCommitted;
    protected Double quantityAvailable;
    protected Double quantityOnHand;
    protected Double onHandValueMli;
    protected Double quantityOnOrder;
    protected Double rate;
    protected Double reorderPoint;
    protected String quantityCommittedUnits;
    protected RecordRef salesTaxCode;
    protected String quantityAvailableUnits;
    protected String quantityOnHandUnits;
    protected RecordRef vendor;
    protected String quantityOnOrderUnits;
    protected ProductFeedList productFeedList;
    protected RecordRefList subsidiaryList;
    protected ItemOptionsList itemOptionsList;
    protected ItemVendorList itemVendorList;
    protected SiteCategoryList siteCategoryList;
    protected TranslationList translationsList;
    protected InventoryItemBinNumberList binNumberList;
    protected InventoryItemLocationsList locationsList;
    protected MatrixOptionList matrixOptionList;
    protected PresentationItemList presentationItemList;
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
     * ��ȡpurchaseDescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseDescription() {
        return purchaseDescription;
    }

    /**
     * ����purchaseDescription���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseDescription(String value) {
        this.purchaseDescription = value;
    }

    /**
     * ��ȡcopyDescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCopyDescription() {
        return copyDescription;
    }

    /**
     * ����copyDescription���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCopyDescription(Boolean value) {
        this.copyDescription = value;
    }

    /**
     * ��ȡexpenseAccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getExpenseAccount() {
        return expenseAccount;
    }

    /**
     * ����expenseAccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setExpenseAccount(RecordRef value) {
        this.expenseAccount = value;
    }

    /**
     * ��ȡdateConvertedToInv���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateConvertedToInv() {
        return dateConvertedToInv;
    }

    /**
     * ����dateConvertedToInv���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateConvertedToInv(XMLGregorianCalendar value) {
        this.dateConvertedToInv = value;
    }

    /**
     * ��ȡoriginalItemType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ItemType }
     *     
     */
    public ItemType getOriginalItemType() {
        return originalItemType;
    }

    /**
     * ����originalItemType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType }
     *     
     */
    public void setOriginalItemType(ItemType value) {
        this.originalItemType = value;
    }

    /**
     * ��ȡoriginalItemSubtype���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ItemSubType }
     *     
     */
    public ItemSubType getOriginalItemSubtype() {
        return originalItemSubtype;
    }

    /**
     * ����originalItemSubtype���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSubType }
     *     
     */
    public void setOriginalItemSubtype(ItemSubType value) {
        this.originalItemSubtype = value;
    }

    /**
     * ��ȡcogsAccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCogsAccount() {
        return cogsAccount;
    }

    /**
     * ����cogsAccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCogsAccount(RecordRef value) {
        this.cogsAccount = value;
    }

    /**
     * ��ȡintercoCogsAccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getIntercoCogsAccount() {
        return intercoCogsAccount;
    }

    /**
     * ����intercoCogsAccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setIntercoCogsAccount(RecordRef value) {
        this.intercoCogsAccount = value;
    }

    /**
     * ��ȡsalesDescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesDescription() {
        return salesDescription;
    }

    /**
     * ����salesDescription���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesDescription(String value) {
        this.salesDescription = value;
    }

    /**
     * ��ȡfraudRisk���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link InventoryItemFraudRisk }
     *     
     */
    public InventoryItemFraudRisk getFraudRisk() {
        return fraudRisk;
    }

    /**
     * ����fraudRisk���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryItemFraudRisk }
     *     
     */
    public void setFraudRisk(InventoryItemFraudRisk value) {
        this.fraudRisk = value;
    }

    /**
     * ��ȡincludeChildren���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeChildren() {
        return includeChildren;
    }

    /**
     * ����includeChildren���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeChildren(Boolean value) {
        this.includeChildren = value;
    }

    /**
     * ��ȡincomeAccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getIncomeAccount() {
        return incomeAccount;
    }

    /**
     * ����incomeAccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setIncomeAccount(RecordRef value) {
        this.incomeAccount = value;
    }

    /**
     * ��ȡintercoIncomeAccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getIntercoIncomeAccount() {
        return intercoIncomeAccount;
    }

    /**
     * ����intercoIncomeAccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setIntercoIncomeAccount(RecordRef value) {
        this.intercoIncomeAccount = value;
    }

    /**
     * ��ȡtaxSchedule���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getTaxSchedule() {
        return taxSchedule;
    }

    /**
     * ����taxSchedule���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setTaxSchedule(RecordRef value) {
        this.taxSchedule = value;
    }

    /**
     * ��ȡdropshipExpenseAccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getDropshipExpenseAccount() {
        return dropshipExpenseAccount;
    }

    /**
     * ����dropshipExpenseAccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setDropshipExpenseAccount(RecordRef value) {
        this.dropshipExpenseAccount = value;
    }

    /**
     * ��ȡdeferRevRec���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeferRevRec() {
        return deferRevRec;
    }

    /**
     * ����deferRevRec���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeferRevRec(Boolean value) {
        this.deferRevRec = value;
    }

    /**
     * ��ȡrevenueRecognitionRule���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getRevenueRecognitionRule() {
        return revenueRecognitionRule;
    }

    /**
     * ����revenueRecognitionRule���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setRevenueRecognitionRule(RecordRef value) {
        this.revenueRecognitionRule = value;
    }

    /**
     * ��ȡrevRecForecastRule���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getRevRecForecastRule() {
        return revRecForecastRule;
    }

    /**
     * ����revRecForecastRule���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setRevRecForecastRule(RecordRef value) {
        this.revRecForecastRule = value;
    }

    /**
     * ��ȡrevenueAllocationGroup���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getRevenueAllocationGroup() {
        return revenueAllocationGroup;
    }

    /**
     * ����revenueAllocationGroup���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setRevenueAllocationGroup(RecordRef value) {
        this.revenueAllocationGroup = value;
    }

    /**
     * ��ȡcreateRevenuePlansOn���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCreateRevenuePlansOn() {
        return createRevenuePlansOn;
    }

    /**
     * ����createRevenuePlansOn���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCreateRevenuePlansOn(RecordRef value) {
        this.createRevenuePlansOn = value;
    }

    /**
     * ��ȡdirectRevenuePosting���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDirectRevenuePosting() {
        return directRevenuePosting;
    }

    /**
     * ����directRevenuePosting���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDirectRevenuePosting(Boolean value) {
        this.directRevenuePosting = value;
    }

    /**
     * ��ȡcontingentRevenueHandling���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContingentRevenueHandling() {
        return contingentRevenueHandling;
    }

    /**
     * ����contingentRevenueHandling���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContingentRevenueHandling(Boolean value) {
        this.contingentRevenueHandling = value;
    }

    /**
     * ��ȡrevReclassFXAccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getRevReclassFXAccount() {
        return revReclassFXAccount;
    }

    /**
     * ����revReclassFXAccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setRevReclassFXAccount(RecordRef value) {
        this.revReclassFXAccount = value;
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
     * ��ȡmatrixType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ItemMatrixType }
     *     
     */
    public ItemMatrixType getMatrixType() {
        return matrixType;
    }

    /**
     * ����matrixType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ItemMatrixType }
     *     
     */
    public void setMatrixType(ItemMatrixType value) {
        this.matrixType = value;
    }

    /**
     * ��ȡassetAccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getAssetAccount() {
        return assetAccount;
    }

    /**
     * ����assetAccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setAssetAccount(RecordRef value) {
        this.assetAccount = value;
    }

    /**
     * ��ȡmatchBillToReceipt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMatchBillToReceipt() {
        return matchBillToReceipt;
    }

    /**
     * ����matchBillToReceipt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMatchBillToReceipt(Boolean value) {
        this.matchBillToReceipt = value;
    }

    /**
     * ��ȡbillQtyVarianceAcct���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getBillQtyVarianceAcct() {
        return billQtyVarianceAcct;
    }

    /**
     * ����billQtyVarianceAcct���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setBillQtyVarianceAcct(RecordRef value) {
        this.billQtyVarianceAcct = value;
    }

    /**
     * ��ȡbillPriceVarianceAcct���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getBillPriceVarianceAcct() {
        return billPriceVarianceAcct;
    }

    /**
     * ����billPriceVarianceAcct���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setBillPriceVarianceAcct(RecordRef value) {
        this.billPriceVarianceAcct = value;
    }

    /**
     * ��ȡbillExchRateVarianceAcct���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getBillExchRateVarianceAcct() {
        return billExchRateVarianceAcct;
    }

    /**
     * ����billExchRateVarianceAcct���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setBillExchRateVarianceAcct(RecordRef value) {
        this.billExchRateVarianceAcct = value;
    }

    /**
     * ��ȡgainLossAccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getGainLossAccount() {
        return gainLossAccount;
    }

    /**
     * ����gainLossAccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setGainLossAccount(RecordRef value) {
        this.gainLossAccount = value;
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
     * ��ȡshippingCostUnits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingCostUnits() {
        return shippingCostUnits;
    }

    /**
     * ����shippingCostUnits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingCostUnits(String value) {
        this.shippingCostUnits = value;
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
     * ��ȡhandlingCostUnits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandlingCostUnits() {
        return handlingCostUnits;
    }

    /**
     * ����handlingCostUnits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandlingCostUnits(String value) {
        this.handlingCostUnits = value;
    }

    /**
     * ��ȡweight���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * ����weight���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWeight(Double value) {
        this.weight = value;
    }

    /**
     * ��ȡweightUnit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ItemWeightUnit }
     *     
     */
    public ItemWeightUnit getWeightUnit() {
        return weightUnit;
    }

    /**
     * ����weightUnit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ItemWeightUnit }
     *     
     */
    public void setWeightUnit(ItemWeightUnit value) {
        this.weightUnit = value;
    }

    /**
     * ��ȡweightUnits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeightUnits() {
        return weightUnits;
    }

    /**
     * ����weightUnits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeightUnits(String value) {
        this.weightUnits = value;
    }

    /**
     * ��ȡcostingMethodDisplay���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostingMethodDisplay() {
        return costingMethodDisplay;
    }

    /**
     * ����costingMethodDisplay���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostingMethodDisplay(String value) {
        this.costingMethodDisplay = value;
    }

    /**
     * ��ȡunitsType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getUnitsType() {
        return unitsType;
    }

    /**
     * ����unitsType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setUnitsType(RecordRef value) {
        this.unitsType = value;
    }

    /**
     * ��ȡstockUnit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getStockUnit() {
        return stockUnit;
    }

    /**
     * ����stockUnit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setStockUnit(RecordRef value) {
        this.stockUnit = value;
    }

    /**
     * ��ȡpurchaseUnit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPurchaseUnit() {
        return purchaseUnit;
    }

    /**
     * ����purchaseUnit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPurchaseUnit(RecordRef value) {
        this.purchaseUnit = value;
    }

    /**
     * ��ȡsaleUnit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSaleUnit() {
        return saleUnit;
    }

    /**
     * ����saleUnit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSaleUnit(RecordRef value) {
        this.saleUnit = value;
    }

    /**
     * ��ȡissueProduct���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getIssueProduct() {
        return issueProduct;
    }

    /**
     * ����issueProduct���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setIssueProduct(RecordRef value) {
        this.issueProduct = value;
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
     * ��ȡtrackLandedCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrackLandedCost() {
        return trackLandedCost;
    }

    /**
     * ����trackLandedCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrackLandedCost(Boolean value) {
        this.trackLandedCost = value;
    }

    /**
     * ��ȡmatrixItemNameTemplate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatrixItemNameTemplate() {
        return matrixItemNameTemplate;
    }

    /**
     * ����matrixItemNameTemplate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatrixItemNameTemplate(String value) {
        this.matrixItemNameTemplate = value;
    }

    /**
     * ��ȡisDropShipItem���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDropShipItem() {
        return isDropShipItem;
    }

    /**
     * ����isDropShipItem���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDropShipItem(Boolean value) {
        this.isDropShipItem = value;
    }

    /**
     * ��ȡisSpecialOrderItem���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSpecialOrderItem() {
        return isSpecialOrderItem;
    }

    /**
     * ����isSpecialOrderItem���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSpecialOrderItem(Boolean value) {
        this.isSpecialOrderItem = value;
    }

    /**
     * ��ȡstockDescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockDescription() {
        return stockDescription;
    }

    /**
     * ����stockDescription���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockDescription(String value) {
        this.stockDescription = value;
    }

    /**
     * ��ȡdeferredRevenueAccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getDeferredRevenueAccount() {
        return deferredRevenueAccount;
    }

    /**
     * ����deferredRevenueAccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setDeferredRevenueAccount(RecordRef value) {
        this.deferredRevenueAccount = value;
    }

    /**
     * ��ȡintercoDefRevAccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getIntercoDefRevAccount() {
        return intercoDefRevAccount;
    }

    /**
     * ����intercoDefRevAccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setIntercoDefRevAccount(RecordRef value) {
        this.intercoDefRevAccount = value;
    }

    /**
     * ��ȡproducer���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProducer() {
        return producer;
    }

    /**
     * ����producer���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProducer(Boolean value) {
        this.producer = value;
    }

    /**
     * ��ȡmanufacturer���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * ����manufacturer���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
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
     * ��ȡmpn���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMpn() {
        return mpn;
    }

    /**
     * ����mpn���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMpn(String value) {
        this.mpn = value;
    }

    /**
     * ��ȡmultManufactureAddr���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultManufactureAddr() {
        return multManufactureAddr;
    }

    /**
     * ����multManufactureAddr���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultManufactureAddr(Boolean value) {
        this.multManufactureAddr = value;
    }

    /**
     * ��ȡmanufacturerAddr1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerAddr1() {
        return manufacturerAddr1;
    }

    /**
     * ����manufacturerAddr1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerAddr1(String value) {
        this.manufacturerAddr1 = value;
    }

    /**
     * ��ȡmanufacturerCity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerCity() {
        return manufacturerCity;
    }

    /**
     * ����manufacturerCity���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerCity(String value) {
        this.manufacturerCity = value;
    }

    /**
     * ��ȡmanufacturerState���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerState() {
        return manufacturerState;
    }

    /**
     * ����manufacturerState���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerState(String value) {
        this.manufacturerState = value;
    }

    /**
     * ��ȡmanufacturerZip���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerZip() {
        return manufacturerZip;
    }

    /**
     * ����manufacturerZip���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerZip(String value) {
        this.manufacturerZip = value;
    }

    /**
     * ��ȡcountryOfManufacture���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getCountryOfManufacture() {
        return countryOfManufacture;
    }

    /**
     * ����countryOfManufacture���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setCountryOfManufacture(Country value) {
        this.countryOfManufacture = value;
    }

    /**
     * ��ȡroundUpAsComponent���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRoundUpAsComponent() {
        return roundUpAsComponent;
    }

    /**
     * ����roundUpAsComponent���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRoundUpAsComponent(Boolean value) {
        this.roundUpAsComponent = value;
    }

    /**
     * ��ȡpurchaseOrderQuantity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPurchaseOrderQuantity() {
        return purchaseOrderQuantity;
    }

    /**
     * ����purchaseOrderQuantity���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPurchaseOrderQuantity(Double value) {
        this.purchaseOrderQuantity = value;
    }

    /**
     * ��ȡpurchaseOrderAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPurchaseOrderAmount() {
        return purchaseOrderAmount;
    }

    /**
     * ����purchaseOrderAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPurchaseOrderAmount(Double value) {
        this.purchaseOrderAmount = value;
    }

    /**
     * ��ȡpurchaseOrderQuantityDiff���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPurchaseOrderQuantityDiff() {
        return purchaseOrderQuantityDiff;
    }

    /**
     * ����purchaseOrderQuantityDiff���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPurchaseOrderQuantityDiff(Double value) {
        this.purchaseOrderQuantityDiff = value;
    }

    /**
     * ��ȡreceiptQuantity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getReceiptQuantity() {
        return receiptQuantity;
    }

    /**
     * ����receiptQuantity���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setReceiptQuantity(Double value) {
        this.receiptQuantity = value;
    }

    /**
     * ��ȡreceiptAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getReceiptAmount() {
        return receiptAmount;
    }

    /**
     * ����receiptAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setReceiptAmount(Double value) {
        this.receiptAmount = value;
    }

    /**
     * ��ȡreceiptQuantityDiff���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getReceiptQuantityDiff() {
        return receiptQuantityDiff;
    }

    /**
     * ����receiptQuantityDiff���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setReceiptQuantityDiff(Double value) {
        this.receiptQuantityDiff = value;
    }

    /**
     * ��ȡdefaultItemShipMethod���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getDefaultItemShipMethod() {
        return defaultItemShipMethod;
    }

    /**
     * ����defaultItemShipMethod���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setDefaultItemShipMethod(RecordRef value) {
        this.defaultItemShipMethod = value;
    }

    /**
     * ��ȡitemCarrier���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ShippingCarrier }
     *     
     */
    public ShippingCarrier getItemCarrier() {
        return itemCarrier;
    }

    /**
     * ����itemCarrier���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingCarrier }
     *     
     */
    public void setItemCarrier(ShippingCarrier value) {
        this.itemCarrier = value;
    }

    /**
     * ��ȡitemShipMethodList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRefList }
     *     
     */
    public RecordRefList getItemShipMethodList() {
        return itemShipMethodList;
    }

    /**
     * ����itemShipMethodList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRefList }
     *     
     */
    public void setItemShipMethodList(RecordRefList value) {
        this.itemShipMethodList = value;
    }

    /**
     * ��ȡmanufacturerTaxId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerTaxId() {
        return manufacturerTaxId;
    }

    /**
     * ����manufacturerTaxId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerTaxId(String value) {
        this.manufacturerTaxId = value;
    }

    /**
     * ��ȡscheduleBNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleBNumber() {
        return scheduleBNumber;
    }

    /**
     * ����scheduleBNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleBNumber(String value) {
        this.scheduleBNumber = value;
    }

    /**
     * ��ȡscheduleBQuantity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getScheduleBQuantity() {
        return scheduleBQuantity;
    }

    /**
     * ����scheduleBQuantity���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setScheduleBQuantity(Long value) {
        this.scheduleBQuantity = value;
    }

    /**
     * ��ȡscheduleBCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleBCode() {
        return scheduleBCode;
    }

    /**
     * ����scheduleBCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleBCode(String value) {
        this.scheduleBCode = value;
    }

    /**
     * ��ȡmanufacturerTariff���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerTariff() {
        return manufacturerTariff;
    }

    /**
     * ����manufacturerTariff���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerTariff(String value) {
        this.manufacturerTariff = value;
    }

    /**
     * ��ȡpreferenceCriterion���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ItemPreferenceCriterion }
     *     
     */
    public ItemPreferenceCriterion getPreferenceCriterion() {
        return preferenceCriterion;
    }

    /**
     * ����preferenceCriterion���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ItemPreferenceCriterion }
     *     
     */
    public void setPreferenceCriterion(ItemPreferenceCriterion value) {
        this.preferenceCriterion = value;
    }

    /**
     * ��ȡminimumQuantity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMinimumQuantity() {
        return minimumQuantity;
    }

    /**
     * ����minimumQuantity���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMinimumQuantity(Long value) {
        this.minimumQuantity = value;
    }

    /**
     * ��ȡenforceMinQtyInternally���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnforceMinQtyInternally() {
        return enforceMinQtyInternally;
    }

    /**
     * ����enforceMinQtyInternally���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnforceMinQtyInternally(Boolean value) {
        this.enforceMinQtyInternally = value;
    }

    /**
     * ��ȡminimumQuantityUnits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimumQuantityUnits() {
        return minimumQuantityUnits;
    }

    /**
     * ����minimumQuantityUnits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumQuantityUnits(String value) {
        this.minimumQuantityUnits = value;
    }

    /**
     * ��ȡsoftDescriptor���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSoftDescriptor() {
        return softDescriptor;
    }

    /**
     * ����softDescriptor���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSoftDescriptor(RecordRef value) {
        this.softDescriptor = value;
    }

    /**
     * ��ȡshipPackage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getShipPackage() {
        return shipPackage;
    }

    /**
     * ����shipPackage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setShipPackage(RecordRef value) {
        this.shipPackage = value;
    }

    /**
     * ��ȡshipIndividually���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShipIndividually() {
        return shipIndividually;
    }

    /**
     * ����shipIndividually���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShipIndividually(Boolean value) {
        this.shipIndividually = value;
    }

    /**
     * ��ȡcostCategory���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCostCategory() {
        return costCategory;
    }

    /**
     * ����costCategory���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCostCategory(RecordRef value) {
        this.costCategory = value;
    }

    /**
     * ��ȡpricesIncludeTax���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPricesIncludeTax() {
        return pricesIncludeTax;
    }

    /**
     * ����pricesIncludeTax���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPricesIncludeTax(Boolean value) {
        this.pricesIncludeTax = value;
    }

    /**
     * ��ȡpurchasePriceVarianceAcct���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPurchasePriceVarianceAcct() {
        return purchasePriceVarianceAcct;
    }

    /**
     * ����purchasePriceVarianceAcct���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPurchasePriceVarianceAcct(RecordRef value) {
        this.purchasePriceVarianceAcct = value;
    }

    /**
     * ��ȡquantityPricingSchedule���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getQuantityPricingSchedule() {
        return quantityPricingSchedule;
    }

    /**
     * ����quantityPricingSchedule���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setQuantityPricingSchedule(RecordRef value) {
        this.quantityPricingSchedule = value;
    }

    /**
     * ��ȡreorderPointUnits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReorderPointUnits() {
        return reorderPointUnits;
    }

    /**
     * ����reorderPointUnits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReorderPointUnits(String value) {
        this.reorderPointUnits = value;
    }

    /**
     * ��ȡuseMarginalRates���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseMarginalRates() {
        return useMarginalRates;
    }

    /**
     * ����useMarginalRates���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseMarginalRates(Boolean value) {
        this.useMarginalRates = value;
    }

    /**
     * ��ȡpreferredStockLevelUnits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredStockLevelUnits() {
        return preferredStockLevelUnits;
    }

    /**
     * ����preferredStockLevelUnits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredStockLevelUnits(String value) {
        this.preferredStockLevelUnits = value;
    }

    /**
     * ��ȡcostEstimateType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ItemCostEstimateType }
     *     
     */
    public ItemCostEstimateType getCostEstimateType() {
        return costEstimateType;
    }

    /**
     * ����costEstimateType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ItemCostEstimateType }
     *     
     */
    public void setCostEstimateType(ItemCostEstimateType value) {
        this.costEstimateType = value;
    }

    /**
     * ��ȡcostEstimate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCostEstimate() {
        return costEstimate;
    }

    /**
     * ����costEstimate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCostEstimate(Double value) {
        this.costEstimate = value;
    }

    /**
     * ��ȡtransferPrice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTransferPrice() {
        return transferPrice;
    }

    /**
     * ����transferPrice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTransferPrice(Double value) {
        this.transferPrice = value;
    }

    /**
     * ��ȡoverallQuantityPricingType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ItemOverallQuantityPricingType }
     *     
     */
    public ItemOverallQuantityPricingType getOverallQuantityPricingType() {
        return overallQuantityPricingType;
    }

    /**
     * ����overallQuantityPricingType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ItemOverallQuantityPricingType }
     *     
     */
    public void setOverallQuantityPricingType(ItemOverallQuantityPricingType value) {
        this.overallQuantityPricingType = value;
    }

    /**
     * ��ȡpricingGroup���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPricingGroup() {
        return pricingGroup;
    }

    /**
     * ����pricingGroup���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPricingGroup(RecordRef value) {
        this.pricingGroup = value;
    }

    /**
     * ��ȡvsoePrice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVsoePrice() {
        return vsoePrice;
    }

    /**
     * ����vsoePrice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVsoePrice(Double value) {
        this.vsoePrice = value;
    }

    /**
     * ��ȡvsoeSopGroup���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link VsoeSopGroup }
     *     
     */
    public VsoeSopGroup getVsoeSopGroup() {
        return vsoeSopGroup;
    }

    /**
     * ����vsoeSopGroup���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link VsoeSopGroup }
     *     
     */
    public void setVsoeSopGroup(VsoeSopGroup value) {
        this.vsoeSopGroup = value;
    }

    /**
     * ��ȡcostEstimateUnits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostEstimateUnits() {
        return costEstimateUnits;
    }

    /**
     * ����costEstimateUnits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostEstimateUnits(String value) {
        this.costEstimateUnits = value;
    }

    /**
     * ��ȡvsoeDeferral���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link VsoeDeferral }
     *     
     */
    public VsoeDeferral getVsoeDeferral() {
        return vsoeDeferral;
    }

    /**
     * ����vsoeDeferral���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link VsoeDeferral }
     *     
     */
    public void setVsoeDeferral(VsoeDeferral value) {
        this.vsoeDeferral = value;
    }

    /**
     * ��ȡvsoePermitDiscount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link VsoePermitDiscount }
     *     
     */
    public VsoePermitDiscount getVsoePermitDiscount() {
        return vsoePermitDiscount;
    }

    /**
     * ����vsoePermitDiscount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link VsoePermitDiscount }
     *     
     */
    public void setVsoePermitDiscount(VsoePermitDiscount value) {
        this.vsoePermitDiscount = value;
    }

    /**
     * ��ȡvsoeDelivered���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVsoeDelivered() {
        return vsoeDelivered;
    }

    /**
     * ����vsoeDelivered���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVsoeDelivered(Boolean value) {
        this.vsoeDelivered = value;
    }

    /**
     * ��ȡitemRevenueCategory���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getItemRevenueCategory() {
        return itemRevenueCategory;
    }

    /**
     * ����itemRevenueCategory���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setItemRevenueCategory(RecordRef value) {
        this.itemRevenueCategory = value;
    }

    /**
     * ��ȡpreferredLocation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPreferredLocation() {
        return preferredLocation;
    }

    /**
     * ����preferredLocation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPreferredLocation(RecordRef value) {
        this.preferredLocation = value;
    }

    /**
     * ��ȡisStorePickupAllowed���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsStorePickupAllowed() {
        return isStorePickupAllowed;
    }

    /**
     * ����isStorePickupAllowed���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsStorePickupAllowed(Boolean value) {
        this.isStorePickupAllowed = value;
    }

    /**
     * ��ȡreorderMultiple���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReorderMultiple() {
        return reorderMultiple;
    }

    /**
     * ����reorderMultiple���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReorderMultiple(Long value) {
        this.reorderMultiple = value;
    }

    /**
     * ��ȡcost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCost() {
        return cost;
    }

    /**
     * ����cost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCost(Double value) {
        this.cost = value;
    }

    /**
     * ��ȡlastInvtCountDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastInvtCountDate() {
        return lastInvtCountDate;
    }

    /**
     * ����lastInvtCountDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastInvtCountDate(XMLGregorianCalendar value) {
        this.lastInvtCountDate = value;
    }

    /**
     * ��ȡnextInvtCountDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextInvtCountDate() {
        return nextInvtCountDate;
    }

    /**
     * ����nextInvtCountDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextInvtCountDate(XMLGregorianCalendar value) {
        this.nextInvtCountDate = value;
    }

    /**
     * ��ȡinvtCountInterval���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInvtCountInterval() {
        return invtCountInterval;
    }

    /**
     * ����invtCountInterval���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInvtCountInterval(Long value) {
        this.invtCountInterval = value;
    }

    /**
     * ��ȡinvtClassification���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ItemInvtClassification }
     *     
     */
    public ItemInvtClassification getInvtClassification() {
        return invtClassification;
    }

    /**
     * ����invtClassification���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ItemInvtClassification }
     *     
     */
    public void setInvtClassification(ItemInvtClassification value) {
        this.invtClassification = value;
    }

    /**
     * ��ȡcostUnits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostUnits() {
        return costUnits;
    }

    /**
     * ����costUnits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostUnits(String value) {
        this.costUnits = value;
    }

    /**
     * ��ȡtotalValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalValue() {
        return totalValue;
    }

    /**
     * ����totalValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalValue(Double value) {
        this.totalValue = value;
    }

    /**
     * ��ȡaverageCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAverageCost() {
        return averageCost;
    }

    /**
     * ����averageCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAverageCost(Double value) {
        this.averageCost = value;
    }

    /**
     * ��ȡuseBins���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseBins() {
        return useBins;
    }

    /**
     * ����useBins���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseBins(Boolean value) {
        this.useBins = value;
    }

    /**
     * ��ȡquantityReorderUnits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityReorderUnits() {
        return quantityReorderUnits;
    }

    /**
     * ����quantityReorderUnits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityReorderUnits(String value) {
        this.quantityReorderUnits = value;
    }

    /**
     * ��ȡleadTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLeadTime() {
        return leadTime;
    }

    /**
     * ����leadTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLeadTime(Long value) {
        this.leadTime = value;
    }

    /**
     * ��ȡautoLeadTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoLeadTime() {
        return autoLeadTime;
    }

    /**
     * ����autoLeadTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoLeadTime(Boolean value) {
        this.autoLeadTime = value;
    }

    /**
     * ��ȡlastPurchasePrice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLastPurchasePrice() {
        return lastPurchasePrice;
    }

    /**
     * ����lastPurchasePrice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLastPurchasePrice(Double value) {
        this.lastPurchasePrice = value;
    }

    /**
     * ��ȡautoPreferredStockLevel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoPreferredStockLevel() {
        return autoPreferredStockLevel;
    }

    /**
     * ����autoPreferredStockLevel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoPreferredStockLevel(Boolean value) {
        this.autoPreferredStockLevel = value;
    }

    /**
     * ��ȡpreferredStockLevelDays���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPreferredStockLevelDays() {
        return preferredStockLevelDays;
    }

    /**
     * ����preferredStockLevelDays���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPreferredStockLevelDays(Double value) {
        this.preferredStockLevelDays = value;
    }

    /**
     * ��ȡsafetyStockLevel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSafetyStockLevel() {
        return safetyStockLevel;
    }

    /**
     * ����safetyStockLevel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSafetyStockLevel(Double value) {
        this.safetyStockLevel = value;
    }

    /**
     * ��ȡsafetyStockLevelDays���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSafetyStockLevelDays() {
        return safetyStockLevelDays;
    }

    /**
     * ����safetyStockLevelDays���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSafetyStockLevelDays(Long value) {
        this.safetyStockLevelDays = value;
    }

    /**
     * ��ȡbackwardConsumptionDays���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBackwardConsumptionDays() {
        return backwardConsumptionDays;
    }

    /**
     * ����backwardConsumptionDays���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBackwardConsumptionDays(Long value) {
        this.backwardConsumptionDays = value;
    }

    /**
     * ��ȡseasonalDemand���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSeasonalDemand() {
        return seasonalDemand;
    }

    /**
     * ����seasonalDemand���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSeasonalDemand(Boolean value) {
        this.seasonalDemand = value;
    }

    /**
     * ��ȡsafetyStockLevelUnits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSafetyStockLevelUnits() {
        return safetyStockLevelUnits;
    }

    /**
     * ����safetyStockLevelUnits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSafetyStockLevelUnits(String value) {
        this.safetyStockLevelUnits = value;
    }

    /**
     * ��ȡdemandModifier���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDemandModifier() {
        return demandModifier;
    }

    /**
     * ����demandModifier���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDemandModifier(Double value) {
        this.demandModifier = value;
    }

    /**
     * ��ȡdistributionNetwork���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getDistributionNetwork() {
        return distributionNetwork;
    }

    /**
     * ����distributionNetwork���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setDistributionNetwork(RecordRef value) {
        this.distributionNetwork = value;
    }

    /**
     * ��ȡdistributionCategory���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getDistributionCategory() {
        return distributionCategory;
    }

    /**
     * ����distributionCategory���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setDistributionCategory(RecordRef value) {
        this.distributionCategory = value;
    }

    /**
     * ��ȡautoReorderPoint���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoReorderPoint() {
        return autoReorderPoint;
    }

    /**
     * ����autoReorderPoint���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoReorderPoint(Boolean value) {
        this.autoReorderPoint = value;
    }

    /**
     * ��ȡstoreDisplayName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreDisplayName() {
        return storeDisplayName;
    }

    /**
     * ����storeDisplayName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreDisplayName(String value) {
        this.storeDisplayName = value;
    }

    /**
     * ��ȡstoreDisplayThumbnail���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getStoreDisplayThumbnail() {
        return storeDisplayThumbnail;
    }

    /**
     * ����storeDisplayThumbnail���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setStoreDisplayThumbnail(RecordRef value) {
        this.storeDisplayThumbnail = value;
    }

    /**
     * ��ȡstoreDisplayImage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getStoreDisplayImage() {
        return storeDisplayImage;
    }

    /**
     * ����storeDisplayImage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setStoreDisplayImage(RecordRef value) {
        this.storeDisplayImage = value;
    }

    /**
     * ��ȡstoreDescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreDescription() {
        return storeDescription;
    }

    /**
     * ����storeDescription���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreDescription(String value) {
        this.storeDescription = value;
    }

    /**
     * ��ȡstoreDetailedDescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreDetailedDescription() {
        return storeDetailedDescription;
    }

    /**
     * ����storeDetailedDescription���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreDetailedDescription(String value) {
        this.storeDetailedDescription = value;
    }

    /**
     * ��ȡstoreItemTemplate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getStoreItemTemplate() {
        return storeItemTemplate;
    }

    /**
     * ����storeItemTemplate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setStoreItemTemplate(RecordRef value) {
        this.storeItemTemplate = value;
    }

    /**
     * ��ȡpageTitle���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageTitle() {
        return pageTitle;
    }

    /**
     * ����pageTitle���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageTitle(String value) {
        this.pageTitle = value;
    }

    /**
     * ��ȡmetaTagHtml���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetaTagHtml() {
        return metaTagHtml;
    }

    /**
     * ����metaTagHtml���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetaTagHtml(String value) {
        this.metaTagHtml = value;
    }

    /**
     * ��ȡexcludeFromSitemap���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeFromSitemap() {
        return excludeFromSitemap;
    }

    /**
     * ����excludeFromSitemap���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeFromSitemap(Boolean value) {
        this.excludeFromSitemap = value;
    }

    /**
     * ��ȡsitemapPriority���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSitemapPriority() {
        return sitemapPriority;
    }

    /**
     * ����sitemapPriority���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSitemapPriority(String value) {
        this.sitemapPriority = value;
    }

    /**
     * ��ȡsearchKeywords���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchKeywords() {
        return searchKeywords;
    }

    /**
     * ����searchKeywords���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchKeywords(String value) {
        this.searchKeywords = value;
    }

    /**
     * ��ȡisDonationItem���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDonationItem() {
        return isDonationItem;
    }

    /**
     * ����isDonationItem���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDonationItem(Boolean value) {
        this.isDonationItem = value;
    }

    /**
     * ��ȡshowDefaultDonationAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowDefaultDonationAmount() {
        return showDefaultDonationAmount;
    }

    /**
     * ����showDefaultDonationAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowDefaultDonationAmount(Boolean value) {
        this.showDefaultDonationAmount = value;
    }

    /**
     * ��ȡmaxDonationAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxDonationAmount() {
        return maxDonationAmount;
    }

    /**
     * ����maxDonationAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxDonationAmount(Double value) {
        this.maxDonationAmount = value;
    }

    /**
     * ��ȡdontShowPrice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDontShowPrice() {
        return dontShowPrice;
    }

    /**
     * ����dontShowPrice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDontShowPrice(Boolean value) {
        this.dontShowPrice = value;
    }

    /**
     * ��ȡnoPriceMessage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoPriceMessage() {
        return noPriceMessage;
    }

    /**
     * ����noPriceMessage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoPriceMessage(String value) {
        this.noPriceMessage = value;
    }

    /**
     * ��ȡoutOfStockMessage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOfStockMessage() {
        return outOfStockMessage;
    }

    /**
     * ����outOfStockMessage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOfStockMessage(String value) {
        this.outOfStockMessage = value;
    }

    /**
     * ��ȡonSpecial���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnSpecial() {
        return onSpecial;
    }

    /**
     * ����onSpecial���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnSpecial(Boolean value) {
        this.onSpecial = value;
    }

    /**
     * ��ȡoutOfStockBehavior���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ItemOutOfStockBehavior }
     *     
     */
    public ItemOutOfStockBehavior getOutOfStockBehavior() {
        return outOfStockBehavior;
    }

    /**
     * ����outOfStockBehavior���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ItemOutOfStockBehavior }
     *     
     */
    public void setOutOfStockBehavior(ItemOutOfStockBehavior value) {
        this.outOfStockBehavior = value;
    }

    /**
     * ��ȡrelatedItemsDescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedItemsDescription() {
        return relatedItemsDescription;
    }

    /**
     * ����relatedItemsDescription���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedItemsDescription(String value) {
        this.relatedItemsDescription = value;
    }

    /**
     * ��ȡspecialsDescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialsDescription() {
        return specialsDescription;
    }

    /**
     * ����specialsDescription���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialsDescription(String value) {
        this.specialsDescription = value;
    }

    /**
     * ��ȡfeaturedDescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeaturedDescription() {
        return featuredDescription;
    }

    /**
     * ����featuredDescription���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeaturedDescription(String value) {
        this.featuredDescription = value;
    }

    /**
     * ��ȡshoppingDotComCategory���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShoppingDotComCategory() {
        return shoppingDotComCategory;
    }

    /**
     * ����shoppingDotComCategory���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShoppingDotComCategory(String value) {
        this.shoppingDotComCategory = value;
    }

    /**
     * ��ȡshopzillaCategoryId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getShopzillaCategoryId() {
        return shopzillaCategoryId;
    }

    /**
     * ����shopzillaCategoryId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setShopzillaCategoryId(Long value) {
        this.shopzillaCategoryId = value;
    }

    /**
     * ��ȡnexTagCategory���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNexTagCategory() {
        return nexTagCategory;
    }

    /**
     * ����nexTagCategory���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNexTagCategory(String value) {
        this.nexTagCategory = value;
    }

    /**
     * ��ȡurlComponent���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlComponent() {
        return urlComponent;
    }

    /**
     * ����urlComponent���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlComponent(String value) {
        this.urlComponent = value;
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
     * ��ȡitemId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * ����itemId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemId(String value) {
        this.itemId = value;
    }

    /**
     * ��ȡupcCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpcCode() {
        return upcCode;
    }

    /**
     * ����upcCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpcCode(String value) {
        this.upcCode = value;
    }

    /**
     * ��ȡdisplayName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * ����displayName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * ��ȡvendorName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorName() {
        return vendorName;
    }

    /**
     * ����vendorName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorName(String value) {
        this.vendorName = value;
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
     * ��ȡisOnline���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOnline() {
        return isOnline;
    }

    /**
     * ����isOnline���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOnline(Boolean value) {
        this.isOnline = value;
    }

    /**
     * ��ȡisHazmatItem���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsHazmatItem() {
        return isHazmatItem;
    }

    /**
     * ����isHazmatItem���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsHazmatItem(Boolean value) {
        this.isHazmatItem = value;
    }

    /**
     * ��ȡhazmatId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHazmatId() {
        return hazmatId;
    }

    /**
     * ����hazmatId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHazmatId(String value) {
        this.hazmatId = value;
    }

    /**
     * ��ȡhazmatShippingName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHazmatShippingName() {
        return hazmatShippingName;
    }

    /**
     * ����hazmatShippingName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHazmatShippingName(String value) {
        this.hazmatShippingName = value;
    }

    /**
     * ��ȡhazmatHazardClass���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHazmatHazardClass() {
        return hazmatHazardClass;
    }

    /**
     * ����hazmatHazardClass���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHazmatHazardClass(String value) {
        this.hazmatHazardClass = value;
    }

    /**
     * ��ȡhazmatPackingGroup���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link HazmatPackingGroup }
     *     
     */
    public HazmatPackingGroup getHazmatPackingGroup() {
        return hazmatPackingGroup;
    }

    /**
     * ����hazmatPackingGroup���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link HazmatPackingGroup }
     *     
     */
    public void setHazmatPackingGroup(HazmatPackingGroup value) {
        this.hazmatPackingGroup = value;
    }

    /**
     * ��ȡhazmatItemUnits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHazmatItemUnits() {
        return hazmatItemUnits;
    }

    /**
     * ����hazmatItemUnits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHazmatItemUnits(String value) {
        this.hazmatItemUnits = value;
    }

    /**
     * ��ȡhazmatItemUnitsQty���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHazmatItemUnitsQty() {
        return hazmatItemUnitsQty;
    }

    /**
     * ����hazmatItemUnitsQty���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHazmatItemUnitsQty(Double value) {
        this.hazmatItemUnitsQty = value;
    }

    /**
     * ��ȡisGcoCompliant���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsGcoCompliant() {
        return isGcoCompliant;
    }

    /**
     * ����isGcoCompliant���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsGcoCompliant(Boolean value) {
        this.isGcoCompliant = value;
    }

    /**
     * ��ȡofferSupport���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOfferSupport() {
        return offerSupport;
    }

    /**
     * ����offerSupport���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOfferSupport(Boolean value) {
        this.offerSupport = value;
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
     * ��ȡavailableToPartners���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAvailableToPartners() {
        return availableToPartners;
    }

    /**
     * ����availableToPartners���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAvailableToPartners(Boolean value) {
        this.availableToPartners = value;
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
     * ��ȡcostingMethod���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ItemCostingMethod }
     *     
     */
    public ItemCostingMethod getCostingMethod() {
        return costingMethod;
    }

    /**
     * ����costingMethod���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ItemCostingMethod }
     *     
     */
    public void setCostingMethod(ItemCostingMethod value) {
        this.costingMethod = value;
    }

    /**
     * ��ȡcurrency���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * ����currency���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * ��ȡpreferredStockLevel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPreferredStockLevel() {
        return preferredStockLevel;
    }

    /**
     * ����preferredStockLevel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPreferredStockLevel(Double value) {
        this.preferredStockLevel = value;
    }

    /**
     * ��ȡpricingMatrix���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PricingMatrix }
     *     
     */
    public PricingMatrix getPricingMatrix() {
        return pricingMatrix;
    }

    /**
     * ����pricingMatrix���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PricingMatrix }
     *     
     */
    public void setPricingMatrix(PricingMatrix value) {
        this.pricingMatrix = value;
    }

    /**
     * ��ȡaccountingBookDetailList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ItemAccountingBookDetailList }
     *     
     */
    public ItemAccountingBookDetailList getAccountingBookDetailList() {
        return accountingBookDetailList;
    }

    /**
     * ����accountingBookDetailList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ItemAccountingBookDetailList }
     *     
     */
    public void setAccountingBookDetailList(ItemAccountingBookDetailList value) {
        this.accountingBookDetailList = value;
    }

    /**
     * ��ȡpurchaseTaxCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPurchaseTaxCode() {
        return purchaseTaxCode;
    }

    /**
     * ����purchaseTaxCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPurchaseTaxCode(RecordRef value) {
        this.purchaseTaxCode = value;
    }

    /**
     * ��ȡdefaultReturnCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDefaultReturnCost() {
        return defaultReturnCost;
    }

    /**
     * ����defaultReturnCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDefaultReturnCost(Double value) {
        this.defaultReturnCost = value;
    }

    /**
     * ��ȡsupplyReplenishmentMethod���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSupplyReplenishmentMethod() {
        return supplyReplenishmentMethod;
    }

    /**
     * ����supplyReplenishmentMethod���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSupplyReplenishmentMethod(RecordRef value) {
        this.supplyReplenishmentMethod = value;
    }

    /**
     * ��ȡalternateDemandSourceItem���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getAlternateDemandSourceItem() {
        return alternateDemandSourceItem;
    }

    /**
     * ����alternateDemandSourceItem���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setAlternateDemandSourceItem(RecordRef value) {
        this.alternateDemandSourceItem = value;
    }

    /**
     * ��ȡfixedLotSize���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFixedLotSize() {
        return fixedLotSize;
    }

    /**
     * ����fixedLotSize���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFixedLotSize(Double value) {
        this.fixedLotSize = value;
    }

    /**
     * ��ȡperiodicLotSizeType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PeriodicLotSizeType }
     *     
     */
    public PeriodicLotSizeType getPeriodicLotSizeType() {
        return periodicLotSizeType;
    }

    /**
     * ����periodicLotSizeType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodicLotSizeType }
     *     
     */
    public void setPeriodicLotSizeType(PeriodicLotSizeType value) {
        this.periodicLotSizeType = value;
    }

    /**
     * ��ȡsupplyType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSupplyType() {
        return supplyType;
    }

    /**
     * ����supplyType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSupplyType(RecordRef value) {
        this.supplyType = value;
    }

    /**
     * ��ȡdemandTimeFence���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDemandTimeFence() {
        return demandTimeFence;
    }

    /**
     * ����demandTimeFence���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDemandTimeFence(Long value) {
        this.demandTimeFence = value;
    }

    /**
     * ��ȡsupplyTimeFence���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSupplyTimeFence() {
        return supplyTimeFence;
    }

    /**
     * ����supplyTimeFence���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSupplyTimeFence(Long value) {
        this.supplyTimeFence = value;
    }

    /**
     * ��ȡrescheduleInDays���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRescheduleInDays() {
        return rescheduleInDays;
    }

    /**
     * ����rescheduleInDays���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRescheduleInDays(Long value) {
        this.rescheduleInDays = value;
    }

    /**
     * ��ȡrescheduleOutDays���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRescheduleOutDays() {
        return rescheduleOutDays;
    }

    /**
     * ����rescheduleOutDays���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRescheduleOutDays(Long value) {
        this.rescheduleOutDays = value;
    }

    /**
     * ��ȡperiodicLotSizeDays���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPeriodicLotSizeDays() {
        return periodicLotSizeDays;
    }

    /**
     * ����periodicLotSizeDays���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPeriodicLotSizeDays(Long value) {
        this.periodicLotSizeDays = value;
    }

    /**
     * ��ȡsupplyLotSizingMethod���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSupplyLotSizingMethod() {
        return supplyLotSizingMethod;
    }

    /**
     * ����supplyLotSizingMethod���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSupplyLotSizingMethod(RecordRef value) {
        this.supplyLotSizingMethod = value;
    }

    /**
     * ��ȡforwardConsumptionDays���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getForwardConsumptionDays() {
        return forwardConsumptionDays;
    }

    /**
     * ����forwardConsumptionDays���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setForwardConsumptionDays(Long value) {
        this.forwardConsumptionDays = value;
    }

    /**
     * ��ȡdemandSource���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getDemandSource() {
        return demandSource;
    }

    /**
     * ����demandSource���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setDemandSource(RecordRef value) {
        this.demandSource = value;
    }

    /**
     * ��ȡquantityBackOrdered���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantityBackOrdered() {
        return quantityBackOrdered;
    }

    /**
     * ����quantityBackOrdered���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantityBackOrdered(Double value) {
        this.quantityBackOrdered = value;
    }

    /**
     * ��ȡquantityCommitted���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantityCommitted() {
        return quantityCommitted;
    }

    /**
     * ����quantityCommitted���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantityCommitted(Double value) {
        this.quantityCommitted = value;
    }

    /**
     * ��ȡquantityAvailable���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantityAvailable() {
        return quantityAvailable;
    }

    /**
     * ����quantityAvailable���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantityAvailable(Double value) {
        this.quantityAvailable = value;
    }

    /**
     * ��ȡquantityOnHand���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantityOnHand() {
        return quantityOnHand;
    }

    /**
     * ����quantityOnHand���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantityOnHand(Double value) {
        this.quantityOnHand = value;
    }

    /**
     * ��ȡonHandValueMli���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOnHandValueMli() {
        return onHandValueMli;
    }

    /**
     * ����onHandValueMli���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOnHandValueMli(Double value) {
        this.onHandValueMli = value;
    }

    /**
     * ��ȡquantityOnOrder���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantityOnOrder() {
        return quantityOnOrder;
    }

    /**
     * ����quantityOnOrder���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantityOnOrder(Double value) {
        this.quantityOnOrder = value;
    }

    /**
     * ��ȡrate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRate() {
        return rate;
    }

    /**
     * ����rate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRate(Double value) {
        this.rate = value;
    }

    /**
     * ��ȡreorderPoint���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getReorderPoint() {
        return reorderPoint;
    }

    /**
     * ����reorderPoint���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setReorderPoint(Double value) {
        this.reorderPoint = value;
    }

    /**
     * ��ȡquantityCommittedUnits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityCommittedUnits() {
        return quantityCommittedUnits;
    }

    /**
     * ����quantityCommittedUnits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityCommittedUnits(String value) {
        this.quantityCommittedUnits = value;
    }

    /**
     * ��ȡsalesTaxCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSalesTaxCode() {
        return salesTaxCode;
    }

    /**
     * ����salesTaxCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSalesTaxCode(RecordRef value) {
        this.salesTaxCode = value;
    }

    /**
     * ��ȡquantityAvailableUnits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityAvailableUnits() {
        return quantityAvailableUnits;
    }

    /**
     * ����quantityAvailableUnits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityAvailableUnits(String value) {
        this.quantityAvailableUnits = value;
    }

    /**
     * ��ȡquantityOnHandUnits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityOnHandUnits() {
        return quantityOnHandUnits;
    }

    /**
     * ����quantityOnHandUnits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityOnHandUnits(String value) {
        this.quantityOnHandUnits = value;
    }

    /**
     * ��ȡvendor���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getVendor() {
        return vendor;
    }

    /**
     * ����vendor���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setVendor(RecordRef value) {
        this.vendor = value;
    }

    /**
     * ��ȡquantityOnOrderUnits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityOnOrderUnits() {
        return quantityOnOrderUnits;
    }

    /**
     * ����quantityOnOrderUnits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityOnOrderUnits(String value) {
        this.quantityOnOrderUnits = value;
    }

    /**
     * ��ȡproductFeedList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ProductFeedList }
     *     
     */
    public ProductFeedList getProductFeedList() {
        return productFeedList;
    }

    /**
     * ����productFeedList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ProductFeedList }
     *     
     */
    public void setProductFeedList(ProductFeedList value) {
        this.productFeedList = value;
    }

    /**
     * ��ȡsubsidiaryList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRefList }
     *     
     */
    public RecordRefList getSubsidiaryList() {
        return subsidiaryList;
    }

    /**
     * ����subsidiaryList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRefList }
     *     
     */
    public void setSubsidiaryList(RecordRefList value) {
        this.subsidiaryList = value;
    }

    /**
     * ��ȡitemOptionsList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ItemOptionsList }
     *     
     */
    public ItemOptionsList getItemOptionsList() {
        return itemOptionsList;
    }

    /**
     * ����itemOptionsList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ItemOptionsList }
     *     
     */
    public void setItemOptionsList(ItemOptionsList value) {
        this.itemOptionsList = value;
    }

    /**
     * ��ȡitemVendorList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ItemVendorList }
     *     
     */
    public ItemVendorList getItemVendorList() {
        return itemVendorList;
    }

    /**
     * ����itemVendorList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ItemVendorList }
     *     
     */
    public void setItemVendorList(ItemVendorList value) {
        this.itemVendorList = value;
    }

    /**
     * ��ȡsiteCategoryList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SiteCategoryList }
     *     
     */
    public SiteCategoryList getSiteCategoryList() {
        return siteCategoryList;
    }

    /**
     * ����siteCategoryList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SiteCategoryList }
     *     
     */
    public void setSiteCategoryList(SiteCategoryList value) {
        this.siteCategoryList = value;
    }

    /**
     * ��ȡtranslationsList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TranslationList }
     *     
     */
    public TranslationList getTranslationsList() {
        return translationsList;
    }

    /**
     * ����translationsList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TranslationList }
     *     
     */
    public void setTranslationsList(TranslationList value) {
        this.translationsList = value;
    }

    /**
     * ��ȡbinNumberList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link InventoryItemBinNumberList }
     *     
     */
    public InventoryItemBinNumberList getBinNumberList() {
        return binNumberList;
    }

    /**
     * ����binNumberList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryItemBinNumberList }
     *     
     */
    public void setBinNumberList(InventoryItemBinNumberList value) {
        this.binNumberList = value;
    }

    /**
     * ��ȡlocationsList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link InventoryItemLocationsList }
     *     
     */
    public InventoryItemLocationsList getLocationsList() {
        return locationsList;
    }

    /**
     * ����locationsList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryItemLocationsList }
     *     
     */
    public void setLocationsList(InventoryItemLocationsList value) {
        this.locationsList = value;
    }

    /**
     * ��ȡmatrixOptionList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MatrixOptionList }
     *     
     */
    public MatrixOptionList getMatrixOptionList() {
        return matrixOptionList;
    }

    /**
     * ����matrixOptionList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MatrixOptionList }
     *     
     */
    public void setMatrixOptionList(MatrixOptionList value) {
        this.matrixOptionList = value;
    }

    /**
     * ��ȡpresentationItemList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PresentationItemList }
     *     
     */
    public PresentationItemList getPresentationItemList() {
        return presentationItemList;
    }

    /**
     * ����presentationItemList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PresentationItemList }
     *     
     */
    public void setPresentationItemList(PresentationItemList value) {
        this.presentationItemList = value;
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
