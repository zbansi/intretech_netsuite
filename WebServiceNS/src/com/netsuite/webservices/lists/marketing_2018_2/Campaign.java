
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
 * <p>Campaign complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡcampaignId���Ե�ֵ��
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
     * ����campaignId���Ե�ֵ��
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
     * ��ȡtitle���Ե�ֵ��
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
     * ����title���Ե�ֵ��
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
     * ��ȡcategory���Ե�ֵ��
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
     * ����category���Ե�ֵ��
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
     * ��ȡowner���Ե�ֵ��
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
     * ����owner���Ե�ֵ��
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
     * ��ȡstartDate���Ե�ֵ��
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
     * ����startDate���Ե�ֵ��
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
     * ��ȡendDate���Ե�ֵ��
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
     * ����endDate���Ե�ֵ��
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
     * ��ȡurl���Ե�ֵ��
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
     * ����url���Ե�ֵ��
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
     * ��ȡbaseCost���Ե�ֵ��
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
     * ����baseCost���Ե�ֵ��
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
     * ��ȡexpectedRevenue���Ե�ֵ��
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
     * ����expectedRevenue���Ե�ֵ��
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
     * ��ȡmessage���Ե�ֵ��
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
     * ����message���Ե�ֵ��
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
     * ��ȡlocal���Ե�ֵ��
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
     * ����local���Ե�ֵ��
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
     * ��ȡtotalRevenue���Ե�ֵ��
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
     * ����totalRevenue���Ե�ֵ��
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
     * ��ȡroi���Ե�ֵ��
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
     * ����roi���Ե�ֵ��
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
     * ��ȡprofit���Ե�ֵ��
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
     * ����profit���Ե�ֵ��
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
     * ��ȡcostPerCustomer���Ե�ֵ��
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
     * ����costPerCustomer���Ե�ֵ��
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
     * ��ȡconvCostPerCustomer���Ե�ֵ��
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
     * ����convCostPerCustomer���Ե�ֵ��
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
     * ��ȡconversions���Ե�ֵ��
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
     * ����conversions���Ե�ֵ��
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
     * ��ȡleadsGenerated���Ե�ֵ��
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
     * ����leadsGenerated���Ե�ֵ��
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
     * ��ȡuniqueVisitors���Ե�ֵ��
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
     * ����uniqueVisitors���Ե�ֵ��
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
     * ��ȡvertical���Ե�ֵ��
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
     * ����vertical���Ե�ֵ��
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
     * ��ȡaudience���Ե�ֵ��
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
     * ����audience���Ե�ֵ��
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
     * ��ȡoffer���Ե�ֵ��
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
     * ����offer���Ե�ֵ��
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
     * ��ȡpromotionCode���Ե�ֵ��
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
     * ����promotionCode���Ե�ֵ��
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
     * ��ȡitemList���Ե�ֵ��
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
     * ����itemList���Ե�ֵ��
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
     * ��ȡfamily���Ե�ֵ��
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
     * ����family���Ե�ֵ��
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
     * ��ȡsearchEngine���Ե�ֵ��
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
     * ����searchEngine���Ե�ֵ��
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
     * ��ȡkeyword���Ե�ֵ��
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
     * ����keyword���Ե�ֵ��
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
     * ��ȡcampaignEmailList���Ե�ֵ��
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
     * ����campaignEmailList���Ե�ֵ��
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
     * ��ȡcampaignDirectMailList���Ե�ֵ��
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
     * ����campaignDirectMailList���Ե�ֵ��
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
     * ��ȡcampaignEventList���Ե�ֵ��
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
     * ����campaignEventList���Ե�ֵ��
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
     * ��ȡeventResponseList���Ե�ֵ��
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
     * ����eventResponseList���Ե�ֵ��
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
