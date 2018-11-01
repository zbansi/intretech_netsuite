
package com.netsuite.webservices.lists.website_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.Record;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;


/**
 * <p>SiteCategory complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SiteCategory">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}Record">
 *       &lt;sequence>
 *         &lt;element name="website" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentCategory" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="categoryListLayout" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="itemListLayout" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="relatedItemsListLayout" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="correlatedItemsListLayout" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="isOnline" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isInactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="storeDetailedDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="storeDisplayThumbnail" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="storeDisplayImage" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="pageTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="metaTagHtml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="excludeFromSitemap" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="urlComponent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sitemapPriority" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}SitemapPriority" minOccurs="0"/>
 *         &lt;element name="searchKeywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="presentationItemList" type="{urn:website_2018_2.lists.webservices.netsuite.com}SiteCategoryPresentationItemList" minOccurs="0"/>
 *         &lt;element name="translationsList" type="{urn:website_2018_2.lists.webservices.netsuite.com}SiteCategoryTranslationList" minOccurs="0"/>
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
@XmlType(name = "SiteCategory", propOrder = {
    "website",
    "itemId",
    "parentCategory",
    "categoryListLayout",
    "itemListLayout",
    "relatedItemsListLayout",
    "correlatedItemsListLayout",
    "isOnline",
    "isInactive",
    "description",
    "storeDetailedDescription",
    "storeDisplayThumbnail",
    "storeDisplayImage",
    "pageTitle",
    "metaTagHtml",
    "excludeFromSitemap",
    "urlComponent",
    "sitemapPriority",
    "searchKeywords",
    "presentationItemList",
    "translationsList"
})
public class SiteCategory
    extends Record
{

    protected RecordRef website;
    protected String itemId;
    protected RecordRef parentCategory;
    protected RecordRef categoryListLayout;
    protected RecordRef itemListLayout;
    protected RecordRef relatedItemsListLayout;
    protected RecordRef correlatedItemsListLayout;
    protected Boolean isOnline;
    protected Boolean isInactive;
    protected String description;
    protected String storeDetailedDescription;
    protected RecordRef storeDisplayThumbnail;
    protected RecordRef storeDisplayImage;
    protected String pageTitle;
    protected String metaTagHtml;
    protected Boolean excludeFromSitemap;
    protected String urlComponent;
    protected String sitemapPriority;
    protected String searchKeywords;
    protected SiteCategoryPresentationItemList presentationItemList;
    protected SiteCategoryTranslationList translationsList;
    @XmlAttribute(name = "internalId")
    protected String internalId;
    @XmlAttribute(name = "externalId")
    protected String externalId;

    /**
     * 获取website属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getWebsite() {
        return website;
    }

    /**
     * 设置website属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setWebsite(RecordRef value) {
        this.website = value;
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
     * 获取parentCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getParentCategory() {
        return parentCategory;
    }

    /**
     * 设置parentCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setParentCategory(RecordRef value) {
        this.parentCategory = value;
    }

    /**
     * 获取categoryListLayout属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCategoryListLayout() {
        return categoryListLayout;
    }

    /**
     * 设置categoryListLayout属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCategoryListLayout(RecordRef value) {
        this.categoryListLayout = value;
    }

    /**
     * 获取itemListLayout属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getItemListLayout() {
        return itemListLayout;
    }

    /**
     * 设置itemListLayout属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setItemListLayout(RecordRef value) {
        this.itemListLayout = value;
    }

    /**
     * 获取relatedItemsListLayout属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getRelatedItemsListLayout() {
        return relatedItemsListLayout;
    }

    /**
     * 设置relatedItemsListLayout属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setRelatedItemsListLayout(RecordRef value) {
        this.relatedItemsListLayout = value;
    }

    /**
     * 获取correlatedItemsListLayout属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCorrelatedItemsListLayout() {
        return correlatedItemsListLayout;
    }

    /**
     * 设置correlatedItemsListLayout属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCorrelatedItemsListLayout(RecordRef value) {
        this.correlatedItemsListLayout = value;
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
     * 获取presentationItemList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SiteCategoryPresentationItemList }
     *     
     */
    public SiteCategoryPresentationItemList getPresentationItemList() {
        return presentationItemList;
    }

    /**
     * 设置presentationItemList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SiteCategoryPresentationItemList }
     *     
     */
    public void setPresentationItemList(SiteCategoryPresentationItemList value) {
        this.presentationItemList = value;
    }

    /**
     * 获取translationsList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SiteCategoryTranslationList }
     *     
     */
    public SiteCategoryTranslationList getTranslationsList() {
        return translationsList;
    }

    /**
     * 设置translationsList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SiteCategoryTranslationList }
     *     
     */
    public void setTranslationsList(SiteCategoryTranslationList value) {
        this.translationsList = value;
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
