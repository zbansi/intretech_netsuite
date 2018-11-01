
package com.netsuite.webservices.lists.accounting_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.lists.accounting_2018_2.types.HazmatPackingGroup;
import com.netsuite.webservices.lists.accounting_2018_2.types.ItemOutOfStockBehavior;
import com.netsuite.webservices.lists.accounting_2018_2.types.ItemOverallQuantityPricingType;
import com.netsuite.webservices.lists.accounting_2018_2.types.ItemPreferenceCriterion;
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
 * <p>KitItem complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="KitItem">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}Record">
 *       &lt;sequence>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="customForm" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="upcCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parent" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="printItems" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isOnline" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isGcoCompliant" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="offerSupport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isInactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="availableToPartners" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="department" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="subsidiaryList" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRefList" minOccurs="0"/>
 *         &lt;element name="class" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="includeChildren" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="location" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incomeAccount" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="taxSchedule" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="shippingCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="handlingCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="isTaxable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="deferRevRec" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="revenueRecognitionRule" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="revRecForecastRule" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="revenueAllocationGroup" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="createRevenuePlansOn" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="directRevenuePosting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="contingentRevenueHandling" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="revReclassFXAccount" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="salesTaxCode" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="weightUnit" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="rate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="billingSchedule" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="deferredRevenueAccount" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="revRecSchedule" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="stockDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="producer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mpn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="multManufactureAddr" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="manufactureraddr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manufacturerCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manufacturerState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manufacturerZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryOfManufacture" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}Country" minOccurs="0"/>
 *         &lt;element name="defaultItemShipMethod" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="itemCarrier" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}ShippingCarrier" minOccurs="0"/>
 *         &lt;element name="itemShipMethodList" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRefList" minOccurs="0"/>
 *         &lt;element name="manufacturerTaxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scheduleBNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scheduleBQuantity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="scheduleBCode" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="manufacturerTariff" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preferenceCriterion" type="{urn:types.accounting_2018_2.lists.webservices.netsuite.com}ItemPreferenceCriterion" minOccurs="0"/>
 *         &lt;element name="issueProduct" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="minimumQuantity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="enforceMinQtyInternally" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="softDescriptor" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="isFulfillable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="pricesIncludeTax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="quantityPricingSchedule" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="useMarginalRates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="costEstimateType" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}ItemCostEstimateType" minOccurs="0"/>
 *         &lt;element name="isHazmatItem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="hazmatId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hazmatShippingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hazmatHazardClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hazmatPackingGroup" type="{urn:types.accounting_2018_2.lists.webservices.netsuite.com}HazmatPackingGroup" minOccurs="0"/>
 *         &lt;element name="hazmatItemUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hazmatItemUnitsQty" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="costEstimate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="overallQuantityPricingType" type="{urn:types.accounting_2018_2.lists.webservices.netsuite.com}ItemOverallQuantityPricingType" minOccurs="0"/>
 *         &lt;element name="pricingGroup" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="vsoePrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="vsoeSopGroup" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}VsoeSopGroup" minOccurs="0"/>
 *         &lt;element name="vsoeDeferral" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}VsoeDeferral" minOccurs="0"/>
 *         &lt;element name="vsoePermitDiscount" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}VsoePermitDiscount" minOccurs="0"/>
 *         &lt;element name="vsoeDelivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="itemRevenueCategory" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="shipIndividually" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="shipPackage" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="storeDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="storeDisplayThumbnail" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="outOfStockMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="storeDisplayImage" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="storeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="storeDetailedDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="storeItemTemplate" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="pageTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urlComponent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="metaTagHtml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="excludeFromSitemap" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sitemapPriority" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}SitemapPriority" minOccurs="0"/>
 *         &lt;element name="searchKeywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemOptionsList" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}ItemOptionsList" minOccurs="0"/>
 *         &lt;element name="isDonationItem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showDefaultDonationAmount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="maxDonationAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="dontShowPrice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="noPriceMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shoppingDotComCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shopzillaCategoryId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="outOfStockBehavior" type="{urn:types.accounting_2018_2.lists.webservices.netsuite.com}ItemOutOfStockBehavior" minOccurs="0"/>
 *         &lt;element name="nexTagCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productFeedList" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}ProductFeedList" minOccurs="0"/>
 *         &lt;element name="relatedItemsDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="onSpecial" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="specialsDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="featuredDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pricingMatrix" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}PricingMatrix" minOccurs="0"/>
 *         &lt;element name="siteCategoryList" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}SiteCategoryList" minOccurs="0"/>
 *         &lt;element name="memberList" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}ItemMemberList" minOccurs="0"/>
 *         &lt;element name="accountingBookDetailList" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}ItemAccountingBookDetailList" minOccurs="0"/>
 *         &lt;element name="translationsList" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}TranslationList" minOccurs="0"/>
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
@XmlType(name = "KitItem", propOrder = {
    "createdDate",
    "lastModifiedDate",
    "customForm",
    "itemId",
    "upcCode",
    "displayName",
    "parent",
    "printItems",
    "isOnline",
    "isGcoCompliant",
    "offerSupport",
    "isInactive",
    "availableToPartners",
    "department",
    "subsidiaryList",
    "clazz",
    "includeChildren",
    "location",
    "description",
    "incomeAccount",
    "taxSchedule",
    "shippingCost",
    "handlingCost",
    "isTaxable",
    "deferRevRec",
    "revenueRecognitionRule",
    "revRecForecastRule",
    "revenueAllocationGroup",
    "createRevenuePlansOn",
    "directRevenuePosting",
    "contingentRevenueHandling",
    "revReclassFXAccount",
    "salesTaxCode",
    "weight",
    "weightUnit",
    "rate",
    "billingSchedule",
    "deferredRevenueAccount",
    "revRecSchedule",
    "stockDescription",
    "producer",
    "manufacturer",
    "mpn",
    "multManufactureAddr",
    "manufactureraddr1",
    "manufacturerCity",
    "manufacturerState",
    "manufacturerZip",
    "countryOfManufacture",
    "defaultItemShipMethod",
    "itemCarrier",
    "itemShipMethodList",
    "manufacturerTaxId",
    "scheduleBNumber",
    "scheduleBQuantity",
    "scheduleBCode",
    "manufacturerTariff",
    "preferenceCriterion",
    "issueProduct",
    "minimumQuantity",
    "enforceMinQtyInternally",
    "softDescriptor",
    "isFulfillable",
    "pricesIncludeTax",
    "quantityPricingSchedule",
    "useMarginalRates",
    "costEstimateType",
    "isHazmatItem",
    "hazmatId",
    "hazmatShippingName",
    "hazmatHazardClass",
    "hazmatPackingGroup",
    "hazmatItemUnits",
    "hazmatItemUnitsQty",
    "costEstimate",
    "overallQuantityPricingType",
    "pricingGroup",
    "vsoePrice",
    "vsoeSopGroup",
    "vsoeDeferral",
    "vsoePermitDiscount",
    "vsoeDelivered",
    "itemRevenueCategory",
    "shipIndividually",
    "shipPackage",
    "storeDisplayName",
    "storeDisplayThumbnail",
    "outOfStockMessage",
    "storeDisplayImage",
    "storeDescription",
    "storeDetailedDescription",
    "storeItemTemplate",
    "pageTitle",
    "urlComponent",
    "metaTagHtml",
    "excludeFromSitemap",
    "sitemapPriority",
    "searchKeywords",
    "itemOptionsList",
    "isDonationItem",
    "showDefaultDonationAmount",
    "maxDonationAmount",
    "dontShowPrice",
    "noPriceMessage",
    "shoppingDotComCategory",
    "shopzillaCategoryId",
    "outOfStockBehavior",
    "nexTagCategory",
    "productFeedList",
    "relatedItemsDescription",
    "onSpecial",
    "specialsDescription",
    "featuredDescription",
    "pricingMatrix",
    "siteCategoryList",
    "memberList",
    "accountingBookDetailList",
    "translationsList",
    "presentationItemList",
    "customFieldList"
})
public class KitItem
    extends Record
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    protected RecordRef customForm;
    protected String itemId;
    protected String upcCode;
    protected String displayName;
    protected RecordRef parent;
    protected Boolean printItems;
    protected Boolean isOnline;
    protected Boolean isGcoCompliant;
    protected Boolean offerSupport;
    protected Boolean isInactive;
    protected Boolean availableToPartners;
    protected RecordRef department;
    protected RecordRefList subsidiaryList;
    @XmlElement(name = "class")
    protected RecordRef clazz;
    protected Boolean includeChildren;
    protected RecordRef location;
    protected String description;
    protected RecordRef incomeAccount;
    protected RecordRef taxSchedule;
    protected Double shippingCost;
    protected Double handlingCost;
    protected Boolean isTaxable;
    protected Boolean deferRevRec;
    protected RecordRef revenueRecognitionRule;
    protected RecordRef revRecForecastRule;
    protected RecordRef revenueAllocationGroup;
    protected RecordRef createRevenuePlansOn;
    protected Boolean directRevenuePosting;
    protected Boolean contingentRevenueHandling;
    protected RecordRef revReclassFXAccount;
    protected RecordRef salesTaxCode;
    protected Double weight;
    protected RecordRef weightUnit;
    protected Double rate;
    protected RecordRef billingSchedule;
    protected RecordRef deferredRevenueAccount;
    protected RecordRef revRecSchedule;
    protected String stockDescription;
    protected Boolean producer;
    protected String manufacturer;
    protected String mpn;
    protected Boolean multManufactureAddr;
    protected String manufactureraddr1;
    protected String manufacturerCity;
    protected String manufacturerState;
    protected String manufacturerZip;
    @XmlSchemaType(name = "string")
    protected Country countryOfManufacture;
    protected RecordRef defaultItemShipMethod;
    @XmlSchemaType(name = "string")
    protected ShippingCarrier itemCarrier;
    protected RecordRefList itemShipMethodList;
    protected String manufacturerTaxId;
    protected String scheduleBNumber;
    protected Long scheduleBQuantity;
    protected RecordRef scheduleBCode;
    protected String manufacturerTariff;
    @XmlSchemaType(name = "string")
    protected ItemPreferenceCriterion preferenceCriterion;
    protected RecordRef issueProduct;
    protected Long minimumQuantity;
    protected Boolean enforceMinQtyInternally;
    protected RecordRef softDescriptor;
    protected Boolean isFulfillable;
    protected Boolean pricesIncludeTax;
    protected RecordRef quantityPricingSchedule;
    protected Boolean useMarginalRates;
    @XmlSchemaType(name = "string")
    protected ItemCostEstimateType costEstimateType;
    protected Boolean isHazmatItem;
    protected String hazmatId;
    protected String hazmatShippingName;
    protected String hazmatHazardClass;
    @XmlSchemaType(name = "string")
    protected HazmatPackingGroup hazmatPackingGroup;
    protected String hazmatItemUnits;
    protected Double hazmatItemUnitsQty;
    protected Double costEstimate;
    @XmlSchemaType(name = "string")
    protected ItemOverallQuantityPricingType overallQuantityPricingType;
    protected RecordRef pricingGroup;
    protected Double vsoePrice;
    @XmlSchemaType(name = "string")
    protected VsoeSopGroup vsoeSopGroup;
    @XmlSchemaType(name = "string")
    protected VsoeDeferral vsoeDeferral;
    @XmlSchemaType(name = "string")
    protected VsoePermitDiscount vsoePermitDiscount;
    protected Boolean vsoeDelivered;
    protected RecordRef itemRevenueCategory;
    protected Boolean shipIndividually;
    protected RecordRef shipPackage;
    protected String storeDisplayName;
    protected RecordRef storeDisplayThumbnail;
    protected String outOfStockMessage;
    protected RecordRef storeDisplayImage;
    protected String storeDescription;
    protected String storeDetailedDescription;
    protected RecordRef storeItemTemplate;
    protected String pageTitle;
    protected String urlComponent;
    protected String metaTagHtml;
    protected Boolean excludeFromSitemap;
    protected String sitemapPriority;
    protected String searchKeywords;
    protected ItemOptionsList itemOptionsList;
    protected Boolean isDonationItem;
    protected Boolean showDefaultDonationAmount;
    protected Double maxDonationAmount;
    protected Boolean dontShowPrice;
    protected String noPriceMessage;
    protected String shoppingDotComCategory;
    protected Long shopzillaCategoryId;
    @XmlSchemaType(name = "string")
    protected ItemOutOfStockBehavior outOfStockBehavior;
    protected String nexTagCategory;
    protected ProductFeedList productFeedList;
    protected String relatedItemsDescription;
    protected Boolean onSpecial;
    protected String specialsDescription;
    protected String featuredDescription;
    protected PricingMatrix pricingMatrix;
    protected SiteCategoryList siteCategoryList;
    protected ItemMemberList memberList;
    protected ItemAccountingBookDetailList accountingBookDetailList;
    protected TranslationList translationsList;
    protected PresentationItemList presentationItemList;
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
     * 获取itemId属性的值。
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
     * 设置itemId属性的值。
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
     * 获取upcCode属性的值。
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
     * 设置upcCode属性的值。
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
     * 获取displayName属性的值。
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
     * 设置displayName属性的值。
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
     * 获取printItems属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrintItems() {
        return printItems;
    }

    /**
     * 设置printItems属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrintItems(Boolean value) {
        this.printItems = value;
    }

    /**
     * 获取isOnline属性的值。
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
     * 设置isOnline属性的值。
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
     * 获取isGcoCompliant属性的值。
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
     * 设置isGcoCompliant属性的值。
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
     * 获取offerSupport属性的值。
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
     * 设置offerSupport属性的值。
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
     * 获取availableToPartners属性的值。
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
     * 设置availableToPartners属性的值。
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
     * 获取subsidiaryList属性的值。
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
     * 设置subsidiaryList属性的值。
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
     * 获取includeChildren属性的值。
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
     * 设置includeChildren属性的值。
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
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * 获取incomeAccount属性的值。
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
     * 设置incomeAccount属性的值。
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
     * 获取taxSchedule属性的值。
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
     * 设置taxSchedule属性的值。
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
     * 获取deferRevRec属性的值。
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
     * 设置deferRevRec属性的值。
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
     * 获取revenueRecognitionRule属性的值。
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
     * 设置revenueRecognitionRule属性的值。
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
     * 获取revRecForecastRule属性的值。
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
     * 设置revRecForecastRule属性的值。
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
     * 获取revenueAllocationGroup属性的值。
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
     * 设置revenueAllocationGroup属性的值。
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
     * 获取createRevenuePlansOn属性的值。
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
     * 设置createRevenuePlansOn属性的值。
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
     * 获取directRevenuePosting属性的值。
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
     * 设置directRevenuePosting属性的值。
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
     * 获取contingentRevenueHandling属性的值。
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
     * 设置contingentRevenueHandling属性的值。
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
     * 获取revReclassFXAccount属性的值。
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
     * 设置revReclassFXAccount属性的值。
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
     * 获取salesTaxCode属性的值。
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
     * 设置salesTaxCode属性的值。
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
     * 获取weight属性的值。
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
     * 设置weight属性的值。
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
     * 获取weightUnit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getWeightUnit() {
        return weightUnit;
    }

    /**
     * 设置weightUnit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setWeightUnit(RecordRef value) {
        this.weightUnit = value;
    }

    /**
     * 获取rate属性的值。
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
     * 设置rate属性的值。
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
     * 获取deferredRevenueAccount属性的值。
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
     * 设置deferredRevenueAccount属性的值。
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
     * 获取stockDescription属性的值。
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
     * 设置stockDescription属性的值。
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
     * 获取producer属性的值。
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
     * 设置producer属性的值。
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
     * 获取manufacturer属性的值。
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
     * 设置manufacturer属性的值。
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
     * 获取mpn属性的值。
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
     * 设置mpn属性的值。
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
     * 获取multManufactureAddr属性的值。
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
     * 设置multManufactureAddr属性的值。
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
     * 获取manufactureraddr1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufactureraddr1() {
        return manufactureraddr1;
    }

    /**
     * 设置manufactureraddr1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufactureraddr1(String value) {
        this.manufactureraddr1 = value;
    }

    /**
     * 获取manufacturerCity属性的值。
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
     * 设置manufacturerCity属性的值。
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
     * 获取manufacturerState属性的值。
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
     * 设置manufacturerState属性的值。
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
     * 获取manufacturerZip属性的值。
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
     * 设置manufacturerZip属性的值。
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
     * 获取countryOfManufacture属性的值。
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
     * 设置countryOfManufacture属性的值。
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
     * 获取defaultItemShipMethod属性的值。
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
     * 设置defaultItemShipMethod属性的值。
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
     * 获取itemCarrier属性的值。
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
     * 设置itemCarrier属性的值。
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
     * 获取itemShipMethodList属性的值。
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
     * 设置itemShipMethodList属性的值。
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
     * 获取manufacturerTaxId属性的值。
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
     * 设置manufacturerTaxId属性的值。
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
     * 获取scheduleBNumber属性的值。
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
     * 设置scheduleBNumber属性的值。
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
     * 获取scheduleBQuantity属性的值。
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
     * 设置scheduleBQuantity属性的值。
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
     * 获取scheduleBCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getScheduleBCode() {
        return scheduleBCode;
    }

    /**
     * 设置scheduleBCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setScheduleBCode(RecordRef value) {
        this.scheduleBCode = value;
    }

    /**
     * 获取manufacturerTariff属性的值。
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
     * 设置manufacturerTariff属性的值。
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
     * 获取preferenceCriterion属性的值。
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
     * 设置preferenceCriterion属性的值。
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
     * 获取issueProduct属性的值。
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
     * 设置issueProduct属性的值。
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
     * 获取minimumQuantity属性的值。
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
     * 设置minimumQuantity属性的值。
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
     * 获取enforceMinQtyInternally属性的值。
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
     * 设置enforceMinQtyInternally属性的值。
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
     * 获取softDescriptor属性的值。
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
     * 设置softDescriptor属性的值。
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
     * 获取isFulfillable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFulfillable() {
        return isFulfillable;
    }

    /**
     * 设置isFulfillable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFulfillable(Boolean value) {
        this.isFulfillable = value;
    }

    /**
     * 获取pricesIncludeTax属性的值。
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
     * 设置pricesIncludeTax属性的值。
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
     * 获取quantityPricingSchedule属性的值。
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
     * 设置quantityPricingSchedule属性的值。
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
     * 获取useMarginalRates属性的值。
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
     * 设置useMarginalRates属性的值。
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
     * 获取costEstimateType属性的值。
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
     * 设置costEstimateType属性的值。
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
     * 获取isHazmatItem属性的值。
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
     * 设置isHazmatItem属性的值。
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
     * 获取hazmatId属性的值。
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
     * 设置hazmatId属性的值。
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
     * 获取hazmatShippingName属性的值。
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
     * 设置hazmatShippingName属性的值。
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
     * 获取hazmatHazardClass属性的值。
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
     * 设置hazmatHazardClass属性的值。
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
     * 获取hazmatPackingGroup属性的值。
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
     * 设置hazmatPackingGroup属性的值。
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
     * 获取hazmatItemUnits属性的值。
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
     * 设置hazmatItemUnits属性的值。
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
     * 获取hazmatItemUnitsQty属性的值。
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
     * 设置hazmatItemUnitsQty属性的值。
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
     * 获取costEstimate属性的值。
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
     * 设置costEstimate属性的值。
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
     * 获取overallQuantityPricingType属性的值。
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
     * 设置overallQuantityPricingType属性的值。
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
     * 获取pricingGroup属性的值。
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
     * 设置pricingGroup属性的值。
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
     * 获取vsoePrice属性的值。
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
     * 设置vsoePrice属性的值。
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
     * 获取vsoeSopGroup属性的值。
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
     * 设置vsoeSopGroup属性的值。
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
     * 获取vsoeDeferral属性的值。
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
     * 设置vsoeDeferral属性的值。
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
     * 获取vsoePermitDiscount属性的值。
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
     * 设置vsoePermitDiscount属性的值。
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
     * 获取vsoeDelivered属性的值。
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
     * 设置vsoeDelivered属性的值。
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
     * 获取itemRevenueCategory属性的值。
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
     * 设置itemRevenueCategory属性的值。
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
     * 获取shipIndividually属性的值。
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
     * 设置shipIndividually属性的值。
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
     * 获取shipPackage属性的值。
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
     * 设置shipPackage属性的值。
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
     * 获取storeDisplayName属性的值。
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
     * 设置storeDisplayName属性的值。
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
     * 获取storeDisplayThumbnail属性的值。
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
     * 设置storeDisplayThumbnail属性的值。
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
     * 获取outOfStockMessage属性的值。
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
     * 设置outOfStockMessage属性的值。
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
     * 获取storeDisplayImage属性的值。
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
     * 设置storeDisplayImage属性的值。
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
     * 获取storeDescription属性的值。
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
     * 设置storeDescription属性的值。
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
     * 获取storeDetailedDescription属性的值。
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
     * 设置storeDetailedDescription属性的值。
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
     * 获取storeItemTemplate属性的值。
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
     * 设置storeItemTemplate属性的值。
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
     * 获取pageTitle属性的值。
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
     * 设置pageTitle属性的值。
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
     * 获取urlComponent属性的值。
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
     * 设置urlComponent属性的值。
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
     * 获取metaTagHtml属性的值。
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
     * 设置metaTagHtml属性的值。
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
     * 获取excludeFromSitemap属性的值。
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
     * 设置excludeFromSitemap属性的值。
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
     * 获取sitemapPriority属性的值。
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
     * 设置sitemapPriority属性的值。
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
     * 获取searchKeywords属性的值。
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
     * 设置searchKeywords属性的值。
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
     * 获取itemOptionsList属性的值。
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
     * 设置itemOptionsList属性的值。
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
     * 获取isDonationItem属性的值。
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
     * 设置isDonationItem属性的值。
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
     * 获取showDefaultDonationAmount属性的值。
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
     * 设置showDefaultDonationAmount属性的值。
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
     * 获取maxDonationAmount属性的值。
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
     * 设置maxDonationAmount属性的值。
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
     * 获取dontShowPrice属性的值。
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
     * 设置dontShowPrice属性的值。
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
     * 获取noPriceMessage属性的值。
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
     * 设置noPriceMessage属性的值。
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
     * 获取shoppingDotComCategory属性的值。
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
     * 设置shoppingDotComCategory属性的值。
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
     * 获取shopzillaCategoryId属性的值。
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
     * 设置shopzillaCategoryId属性的值。
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
     * 获取outOfStockBehavior属性的值。
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
     * 设置outOfStockBehavior属性的值。
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
     * 获取nexTagCategory属性的值。
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
     * 设置nexTagCategory属性的值。
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
     * 获取productFeedList属性的值。
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
     * 设置productFeedList属性的值。
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
     * 获取relatedItemsDescription属性的值。
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
     * 设置relatedItemsDescription属性的值。
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
     * 获取onSpecial属性的值。
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
     * 设置onSpecial属性的值。
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
     * 获取specialsDescription属性的值。
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
     * 设置specialsDescription属性的值。
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
     * 获取featuredDescription属性的值。
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
     * 设置featuredDescription属性的值。
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
     * 获取pricingMatrix属性的值。
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
     * 设置pricingMatrix属性的值。
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
     * 获取siteCategoryList属性的值。
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
     * 设置siteCategoryList属性的值。
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
     * 获取memberList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemMemberList }
     *     
     */
    public ItemMemberList getMemberList() {
        return memberList;
    }

    /**
     * 设置memberList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemMemberList }
     *     
     */
    public void setMemberList(ItemMemberList value) {
        this.memberList = value;
    }

    /**
     * 获取accountingBookDetailList属性的值。
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
     * 设置accountingBookDetailList属性的值。
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
     * 获取translationsList属性的值。
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
     * 设置translationsList属性的值。
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
     * 获取presentationItemList属性的值。
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
     * 设置presentationItemList属性的值。
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
