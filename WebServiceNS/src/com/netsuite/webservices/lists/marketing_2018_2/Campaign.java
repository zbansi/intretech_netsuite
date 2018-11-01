
package com.netsuite.webservices.lists.marketing_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.platform.core_2018_2.CustomFieldList;
import com.netsuite.webservices.platform.core_2018_2.Record;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;
import com.netsuite.webservices.platform.core_2018_2.RecordRefList;


/**
 * <p>Campaign complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Campaign">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}Record">
 *       &lt;sequence>
 *         &lt;element name="customForm" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="category" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="owner" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="baseCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="expectedRevenue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isInactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="local" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="totalRevenue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="roi" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="profit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="costPerCustomer" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="convCostPerCustomer" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="conversions" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="leadsGenerated" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="uniqueVisitors" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="vertical" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="audience" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="offer" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="promotionCode" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="itemList" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRefList" minOccurs="0"/>
 *         &lt;element name="family" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="searchEngine" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="keyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campaignEmailList" type="{urn:marketing_2018_2.lists.webservices.netsuite.com}CampaignEmailList" minOccurs="0"/>
 *         &lt;element name="campaignDirectMailList" type="{urn:marketing_2018_2.lists.webservices.netsuite.com}CampaignDirectMailList" minOccurs="0"/>
 *         &lt;element name="campaignEventList" type="{urn:marketing_2018_2.lists.webservices.netsuite.com}CampaignEventList" minOccurs="0"/>
 *         &lt;element name="eventResponseList" type="{urn:marketing_2018_2.lists.webservices.netsuite.com}CampaignEventResponseList" minOccurs="0"/>
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
@XmlType(name = "Campaign", propOrder = {
    "customForm",
    "campaignId",
    "title",
    "category",
    "owner",
    "startDate",
    "endDate",
    "url",
    "baseCost",
    "cost",
    "expectedRevenue",
    "message",
    "isInactive",
    "local",
    "totalRevenue",
    "roi",
    "profit",
    "costPerCustomer",
    "convCostPerCustomer",
    "conversions",
    "leadsGenerated",
    "uniqueVisitors",
    "vertical",
    "audience",
    "offer",
    "promotionCode",
    "itemList",
    "family",
    "searchEngine",
    "keyword",
    "campaignEmailList",
    "campaignDirectMailList",
    "campaignEventList",
    "eventResponseList",
    "customFieldList"
})
public class Campaign
    extends Record
{

    protected RecordRef customForm;
    protected String campaignId;
    protected String title;
    protected RecordRef category;
    protected RecordRef owner;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected String url;
    protected Double baseCost;
    protected Double cost;
    protected Double expectedRevenue;
    protected String message;
    protected Boolean isInactive;
    protected Boolean local;
    protected Double totalRevenue;
    protected Double roi;
    protected Double profit;
    protected Double costPerCustomer;
    protected Double convCostPerCustomer;
    protected Long conversions;
    protected Long leadsGenerated;
    protected Long uniqueVisitors;
    protected RecordRef vertical;
    protected RecordRef audience;
    protected RecordRef offer;
    protected RecordRef promotionCode;
    protected RecordRefList itemList;
    protected RecordRef family;
    protected RecordRef searchEngine;
    protected String keyword;
    protected CampaignEmailList campaignEmailList;
    protected CampaignDirectMailList campaignDirectMailList;
    protected CampaignEventList campaignEventList;
    protected CampaignEventResponseList eventResponseList;
    protected CustomFieldList customFieldList;
    @XmlAttribute(name = "internalId")
    protected String internalId;
    @XmlAttribute(name = "externalId")
    protected String externalId;

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
     * 获取campaignId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignId() {
        return campaignId;
    }

    /**
     * 设置campaignId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignId(String value) {
        this.campaignId = value;
    }

    /**
     * 获取title属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置title属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * 获取category属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCategory() {
        return category;
    }

    /**
     * 设置category属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCategory(RecordRef value) {
        this.category = value;
    }

    /**
     * 获取owner属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getOwner() {
        return owner;
    }

    /**
     * 设置owner属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setOwner(RecordRef value) {
        this.owner = value;
    }

    /**
     * 获取startDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * 设置startDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * 获取endDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * 设置endDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * 获取url属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置url属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * 获取baseCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBaseCost() {
        return baseCost;
    }

    /**
     * 设置baseCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBaseCost(Double value) {
        this.baseCost = value;
    }

    /**
     * 获取cost属性的值。
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
     * 设置cost属性的值。
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
     * 获取expectedRevenue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExpectedRevenue() {
        return expectedRevenue;
    }

    /**
     * 设置expectedRevenue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExpectedRevenue(Double value) {
        this.expectedRevenue = value;
    }

    /**
     * 获取message属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * 设置message属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
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
     * 获取local属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocal() {
        return local;
    }

    /**
     * 设置local属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocal(Boolean value) {
        this.local = value;
    }

    /**
     * 获取totalRevenue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalRevenue() {
        return totalRevenue;
    }

    /**
     * 设置totalRevenue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalRevenue(Double value) {
        this.totalRevenue = value;
    }

    /**
     * 获取roi属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRoi() {
        return roi;
    }

    /**
     * 设置roi属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRoi(Double value) {
        this.roi = value;
    }

    /**
     * 获取profit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getProfit() {
        return profit;
    }

    /**
     * 设置profit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setProfit(Double value) {
        this.profit = value;
    }

    /**
     * 获取costPerCustomer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCostPerCustomer() {
        return costPerCustomer;
    }

    /**
     * 设置costPerCustomer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCostPerCustomer(Double value) {
        this.costPerCustomer = value;
    }

    /**
     * 获取convCostPerCustomer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConvCostPerCustomer() {
        return convCostPerCustomer;
    }

    /**
     * 设置convCostPerCustomer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConvCostPerCustomer(Double value) {
        this.convCostPerCustomer = value;
    }

    /**
     * 获取conversions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConversions() {
        return conversions;
    }

    /**
     * 设置conversions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConversions(Long value) {
        this.conversions = value;
    }

    /**
     * 获取leadsGenerated属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLeadsGenerated() {
        return leadsGenerated;
    }

    /**
     * 设置leadsGenerated属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLeadsGenerated(Long value) {
        this.leadsGenerated = value;
    }

    /**
     * 获取uniqueVisitors属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUniqueVisitors() {
        return uniqueVisitors;
    }

    /**
     * 设置uniqueVisitors属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUniqueVisitors(Long value) {
        this.uniqueVisitors = value;
    }

    /**
     * 获取vertical属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getVertical() {
        return vertical;
    }

    /**
     * 设置vertical属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setVertical(RecordRef value) {
        this.vertical = value;
    }

    /**
     * 获取audience属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getAudience() {
        return audience;
    }

    /**
     * 设置audience属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setAudience(RecordRef value) {
        this.audience = value;
    }

    /**
     * 获取offer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getOffer() {
        return offer;
    }

    /**
     * 设置offer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setOffer(RecordRef value) {
        this.offer = value;
    }

    /**
     * 获取promotionCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPromotionCode() {
        return promotionCode;
    }

    /**
     * 设置promotionCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPromotionCode(RecordRef value) {
        this.promotionCode = value;
    }

    /**
     * 获取itemList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRefList }
     *     
     */
    public RecordRefList getItemList() {
        return itemList;
    }

    /**
     * 设置itemList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRefList }
     *     
     */
    public void setItemList(RecordRefList value) {
        this.itemList = value;
    }

    /**
     * 获取family属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getFamily() {
        return family;
    }

    /**
     * 设置family属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setFamily(RecordRef value) {
        this.family = value;
    }

    /**
     * 获取searchEngine属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSearchEngine() {
        return searchEngine;
    }

    /**
     * 设置searchEngine属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSearchEngine(RecordRef value) {
        this.searchEngine = value;
    }

    /**
     * 获取keyword属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * 设置keyword属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyword(String value) {
        this.keyword = value;
    }

    /**
     * 获取campaignEmailList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CampaignEmailList }
     *     
     */
    public CampaignEmailList getCampaignEmailList() {
        return campaignEmailList;
    }

    /**
     * 设置campaignEmailList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignEmailList }
     *     
     */
    public void setCampaignEmailList(CampaignEmailList value) {
        this.campaignEmailList = value;
    }

    /**
     * 获取campaignDirectMailList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CampaignDirectMailList }
     *     
     */
    public CampaignDirectMailList getCampaignDirectMailList() {
        return campaignDirectMailList;
    }

    /**
     * 设置campaignDirectMailList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignDirectMailList }
     *     
     */
    public void setCampaignDirectMailList(CampaignDirectMailList value) {
        this.campaignDirectMailList = value;
    }

    /**
     * 获取campaignEventList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CampaignEventList }
     *     
     */
    public CampaignEventList getCampaignEventList() {
        return campaignEventList;
    }

    /**
     * 设置campaignEventList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignEventList }
     *     
     */
    public void setCampaignEventList(CampaignEventList value) {
        this.campaignEventList = value;
    }

    /**
     * 获取eventResponseList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CampaignEventResponseList }
     *     
     */
    public CampaignEventResponseList getEventResponseList() {
        return eventResponseList;
    }

    /**
     * 设置eventResponseList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignEventResponseList }
     *     
     */
    public void setEventResponseList(CampaignEventResponseList value) {
        this.eventResponseList = value;
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
