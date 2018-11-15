
package com.netsuite.webservices.lists.accounting_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.lists.accounting_2018_2.types.ItemMatrixType;
import com.netsuite.webservices.lists.accounting_2018_2.types.ItemOutOfStockBehavior;
import com.netsuite.webservices.lists.accounting_2018_2.types.ItemOverallQuantityPricingType;
import com.netsuite.webservices.platform.common_2018_2.types.ItemCostEstimateType;
import com.netsuite.webservices.platform.common_2018_2.types.VsoeDeferral;
import com.netsuite.webservices.platform.common_2018_2.types.VsoePermitDiscount;
import com.netsuite.webservices.platform.common_2018_2.types.VsoeSopGroup;
import com.netsuite.webservices.platform.core_2018_2.CustomFieldList;
import com.netsuite.webservices.platform.core_2018_2.Record;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;
import com.netsuite.webservices.platform.core_2018_2.RecordRefList;


/**
 * <p>ServiceSaleItem complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ServiceSaleItem">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}Record">
 *       &lt;sequence>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="salesDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="includeChildren" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="incomeAccount" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="isTaxable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="matrixType" type="{urn:types.accounting_2018_2.lists.webservices.netsuite.com}ItemMatrixType" minOccurs="0"/>
 *         &lt;element name="taxSchedule" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="costEstimateType" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}ItemCostEstimateType" minOccurs="0"/>
 *         &lt;element name="costEstimate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="unitsType" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="saleUnit" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="issueProduct" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="costEstimateUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billingSchedule" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="deferredRevenueAccount" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="revRecSchedule" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="minimumQuantity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="enforceMinQtyInternally" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="softDescriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pricesIncludeTax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="quantityPricingSchedule" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="useMarginalRates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="overallQuantityPricingType" type="{urn:types.accounting_2018_2.lists.webservices.netsuite.com}ItemOverallQuantityPricingType" minOccurs="0"/>
 *         &lt;element name="isFulfillable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="costCategory" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="pricingGroup" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="minimumQuantityUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vsoePrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="vsoeSopGroup" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}VsoeSopGroup" minOccurs="0"/>
 *         &lt;element name="vsoeDeferral" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}VsoeDeferral" minOccurs="0"/>
 *         &lt;element name="vsoePermitDiscount" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}VsoePermitDiscount" minOccurs="0"/>
 *         &lt;element name="vsoeDelivered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="itemRevenueCategory" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="deferRevRec" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="revenueRecognitionRule" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="revRecForecastRule" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="revenueAllocationGroup" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="createRevenuePlansOn" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="directRevenuePosting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="contingentRevenueHandling" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="revReclassFXAccount" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="createJob" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="matrixItemNameTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="storeDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="storeDisplayThumbnail" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
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
 *         &lt;element name="itemTaskTemplatesList" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}ServiceItemTaskTemplatesList" minOccurs="0"/>
 *         &lt;element name="featuredDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customForm" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="upcCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parent" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="isOnline" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isGcoCompliant" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="offerSupport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isInactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="availableToPartners" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="department" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="class" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="location" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="subsidiaryList" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRefList" minOccurs="0"/>
 *         &lt;element name="billingRatesMatrix" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}BillingRatesMatrix" minOccurs="0"/>
 *         &lt;element name="accountingBookDetailList" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}ItemAccountingBookDetailList" minOccurs="0"/>
 *         &lt;element name="itemOptionsList" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}ItemOptionsList" minOccurs="0"/>
 *         &lt;element name="matrixOptionList" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}MatrixOptionList" minOccurs="0"/>
 *         &lt;element name="pricingMatrix" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}PricingMatrix" minOccurs="0"/>
 *         &lt;element name="purchaseTaxCode" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="rate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="salesTaxCode" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="siteCategoryList" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}SiteCategoryList" minOccurs="0"/>
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
@XmlType(name = "ServiceSaleItem", propOrder = {
    "createdDate",
    "lastModifiedDate",
    "salesDescription",
    "includeChildren",
    "incomeAccount",
    "isTaxable",
    "matrixType",
    "taxSchedule",
    "costEstimateType",
    "costEstimate",
    "unitsType",
    "saleUnit",
    "issueProduct",
    "costEstimateUnits",
    "billingSchedule",
    "deferredRevenueAccount",
    "revRecSchedule",
    "minimumQuantity",
    "enforceMinQtyInternally",
    "softDescriptor",
    "pricesIncludeTax",
    "quantityPricingSchedule",
    "useMarginalRates",
    "overallQuantityPricingType",
    "isFulfillable",
    "costCategory",
    "pricingGroup",
    "minimumQuantityUnits",
    "vsoePrice",
    "vsoeSopGroup",
    "vsoeDeferral",
    "vsoePermitDiscount",
    "vsoeDelivered",
    "itemRevenueCategory",
    "deferRevRec",
    "revenueRecognitionRule",
    "revRecForecastRule",
    "revenueAllocationGroup",
    "createRevenuePlansOn",
    "directRevenuePosting",
    "contingentRevenueHandling",
    "revReclassFXAccount",
    "createJob",
    "matrixItemNameTemplate",
    "storeDisplayName",
    "storeDisplayThumbnail",
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
    "itemTaskTemplatesList",
    "featuredDescription",
    "customForm",
    "itemId",
    "upcCode",
    "displayName",
    "parent",
    "isOnline",
    "isGcoCompliant",
    "offerSupport",
    "isInactive",
    "availableToPartners",
    "department",
    "clazz",
    "location",
    "subsidiaryList",
    "billingRatesMatrix",
    "accountingBookDetailList",
    "itemOptionsList",
    "matrixOptionList",
    "pricingMatrix",
    "purchaseTaxCode",
    "rate",
    "salesTaxCode",
    "siteCategoryList",
    "translationsList",
    "presentationItemList",
    "customFieldList"
})
public class ServiceSaleItem
    extends Record
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    protected String salesDescription;
    protected Boolean includeChildren;
    protected RecordRef incomeAccount;
    protected Boolean isTaxable;
    @XmlSchemaType(name = "string")
    protected ItemMatrixType matrixType;
    protected RecordRef taxSchedule;
    @XmlSchemaType(name = "string")
    protected ItemCostEstimateType costEstimateType;
    protected Double costEstimate;
    protected RecordRef unitsType;
    protected RecordRef saleUnit;
    protected RecordRef issueProduct;
    protected String costEstimateUnits;
    protected RecordRef billingSchedule;
    protected RecordRef deferredRevenueAccount;
    protected RecordRef revRecSchedule;
    protected Long minimumQuantity;
    protected Boolean enforceMinQtyInternally;
    protected String softDescriptor;
    protected Boolean pricesIncludeTax;
    protected RecordRef quantityPricingSchedule;
    protected Boolean useMarginalRates;
    @XmlSchemaType(name = "string")
    protected ItemOverallQuantityPricingType overallQuantityPricingType;
    protected Boolean isFulfillable;
    protected RecordRef costCategory;
    protected RecordRef pricingGroup;
    protected String minimumQuantityUnits;
    protected Double vsoePrice;
    @XmlSchemaType(name = "string")
    protected VsoeSopGroup vsoeSopGroup;
    @XmlSchemaType(name = "string")
    protected VsoeDeferral vsoeDeferral;
    @XmlSchemaType(name = "string")
    protected VsoePermitDiscount vsoePermitDiscount;
    protected Boolean vsoeDelivered;
    protected RecordRef itemRevenueCategory;
    protected Boolean deferRevRec;
    protected RecordRef revenueRecognitionRule;
    protected RecordRef revRecForecastRule;
    protected RecordRef revenueAllocationGroup;
    protected RecordRef createRevenuePlansOn;
    protected Boolean directRevenuePosting;
    protected Boolean contingentRevenueHandling;
    protected RecordRef revReclassFXAccount;
    protected Boolean createJob;
    protected String matrixItemNameTemplate;
    protected String storeDisplayName;
    protected RecordRef storeDisplayThumbnail;
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
    protected ServiceItemTaskTemplatesList itemTaskTemplatesList;
    protected String featuredDescription;
    protected RecordRef customForm;
    protected String itemId;
    protected String upcCode;
    protected String displayName;
    protected RecordRef parent;
    protected Boolean isOnline;
    protected Boolean isGcoCompliant;
    protected Boolean offerSupport;
    protected Boolean isInactive;
    protected Boolean availableToPartners;
    protected RecordRef department;
    @XmlElement(name = "class")
    protected RecordRef clazz;
    protected RecordRef location;
    protected RecordRefList subsidiaryList;
    protected BillingRatesMatrix billingRatesMatrix;
    protected ItemAccountingBookDetailList accountingBookDetailList;
    protected ItemOptionsList itemOptionsList;
    protected MatrixOptionList matrixOptionList;
    protected PricingMatrix pricingMatrix;
    protected RecordRef purchaseTaxCode;
    protected Double rate;
    protected RecordRef salesTaxCode;
    protected SiteCategoryList siteCategoryList;
    protected TranslationList translationsList;
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
     * ��ȡsoftDescriptor���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftDescriptor() {
        return softDescriptor;
    }

    /**
     * ����softDescriptor���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftDescriptor(String value) {
        this.softDescriptor = value;
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
     * ��ȡisFulfillable���Ե�ֵ��
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
     * ����isFulfillable���Ե�ֵ��
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
     * ��ȡcreateJob���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreateJob() {
        return createJob;
    }

    /**
     * ����createJob���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreateJob(Boolean value) {
        this.createJob = value;
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
     * ��ȡitemTaskTemplatesList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ServiceItemTaskTemplatesList }
     *     
     */
    public ServiceItemTaskTemplatesList getItemTaskTemplatesList() {
        return itemTaskTemplatesList;
    }

    /**
     * ����itemTaskTemplatesList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceItemTaskTemplatesList }
     *     
     */
    public void setItemTaskTemplatesList(ServiceItemTaskTemplatesList value) {
        this.itemTaskTemplatesList = value;
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
     * ��ȡbillingRatesMatrix���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BillingRatesMatrix }
     *     
     */
    public BillingRatesMatrix getBillingRatesMatrix() {
        return billingRatesMatrix;
    }

    /**
     * ����billingRatesMatrix���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BillingRatesMatrix }
     *     
     */
    public void setBillingRatesMatrix(BillingRatesMatrix value) {
        this.billingRatesMatrix = value;
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