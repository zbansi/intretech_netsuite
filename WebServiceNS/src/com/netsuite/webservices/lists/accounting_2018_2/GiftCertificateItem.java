
package com.netsuite.webservices.lists.accounting_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.lists.accounting_2018_2.types.ItemOutOfStockBehavior;
import com.netsuite.webservices.platform.common_2018_2.types.ItemCostEstimateType;
import com.netsuite.webservices.platform.core_2018_2.CustomFieldList;
import com.netsuite.webservices.platform.core_2018_2.Record;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;
import com.netsuite.webservices.platform.core_2018_2.RecordRefList;


/**
 * <p>GiftCertificateItem complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="GiftCertificateItem">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}Record">
 *       &lt;sequence>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="customForm" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="upcCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="includeChildren" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
 *         &lt;element name="salesDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incomeAccount" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="liabilityAccount" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="daysBeforeExpiration" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isTaxable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="rate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="urlComponent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salesTaxCode" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="pricesIncludeTax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="taxSchedule" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="costEstimate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="costEstimateType" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}ItemCostEstimateType" minOccurs="0"/>
 *         &lt;element name="billingSchedule" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="issueProduct" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="isFulfillable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
 *         &lt;element name="specialsDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="featuredDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relatedItemsDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pricingMatrix" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}PricingMatrix" minOccurs="0"/>
 *         &lt;element name="authCodesList" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}GiftCertificateItemAuthCodesList" minOccurs="0"/>
 *         &lt;element name="siteCategoryList" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}SiteCategoryList" minOccurs="0"/>
 *         &lt;element name="translationsList" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}TranslationList" minOccurs="0"/>
 *         &lt;element name="itemOptionsList" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}ItemOptionsList" minOccurs="0"/>
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
@XmlType(name = "GiftCertificateItem", propOrder = {
    "createdDate",
    "lastModifiedDate",
    "customForm",
    "itemId",
    "upcCode",
    "displayName",
    "includeChildren",
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
    "salesDescription",
    "incomeAccount",
    "liabilityAccount",
    "daysBeforeExpiration",
    "isTaxable",
    "rate",
    "urlComponent",
    "salesTaxCode",
    "pricesIncludeTax",
    "taxSchedule",
    "costEstimate",
    "costEstimateType",
    "billingSchedule",
    "issueProduct",
    "isFulfillable",
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
    "specialsDescription",
    "featuredDescription",
    "relatedItemsDescription",
    "pricingMatrix",
    "authCodesList",
    "siteCategoryList",
    "translationsList",
    "itemOptionsList",
    "presentationItemList",
    "customFieldList"
})
public class GiftCertificateItem
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
    protected Boolean includeChildren;
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
    protected String salesDescription;
    protected RecordRef incomeAccount;
    protected RecordRef liabilityAccount;
    protected Long daysBeforeExpiration;
    protected Boolean isTaxable;
    protected Double rate;
    protected String urlComponent;
    protected RecordRef salesTaxCode;
    protected Boolean pricesIncludeTax;
    protected RecordRef taxSchedule;
    protected Double costEstimate;
    @XmlSchemaType(name = "string")
    protected ItemCostEstimateType costEstimateType;
    protected RecordRef billingSchedule;
    protected RecordRef issueProduct;
    protected Boolean isFulfillable;
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
    protected String specialsDescription;
    protected String featuredDescription;
    protected String relatedItemsDescription;
    protected PricingMatrix pricingMatrix;
    protected GiftCertificateItemAuthCodesList authCodesList;
    protected SiteCategoryList siteCategoryList;
    protected TranslationList translationsList;
    protected ItemOptionsList itemOptionsList;
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
     * ��ȡliabilityAccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getLiabilityAccount() {
        return liabilityAccount;
    }

    /**
     * ����liabilityAccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setLiabilityAccount(RecordRef value) {
        this.liabilityAccount = value;
    }

    /**
     * ��ȡdaysBeforeExpiration���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDaysBeforeExpiration() {
        return daysBeforeExpiration;
    }

    /**
     * ����daysBeforeExpiration���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDaysBeforeExpiration(Long value) {
        this.daysBeforeExpiration = value;
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
     * ��ȡauthCodesList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GiftCertificateItemAuthCodesList }
     *     
     */
    public GiftCertificateItemAuthCodesList getAuthCodesList() {
        return authCodesList;
    }

    /**
     * ����authCodesList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GiftCertificateItemAuthCodesList }
     *     
     */
    public void setAuthCodesList(GiftCertificateItemAuthCodesList value) {
        this.authCodesList = value;
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