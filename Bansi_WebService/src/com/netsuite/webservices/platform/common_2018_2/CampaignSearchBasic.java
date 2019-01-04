/**
 * CampaignSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 28, 2010 (04:07:04 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2018_2;

public class CampaignSearchBasic  extends com.netsuite.webservices.platform.core_2018_2.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2018_2.RecordRef[] audience;

    private com.netsuite.webservices.platform.core_2018_2.SearchDoubleField baseCost;

    private java.lang.String[] campaignEventType;

    private com.netsuite.webservices.platform.core_2018_2.SearchStringField campaignId;

    private com.netsuite.webservices.platform.core_2018_2.RecordRef[] category;

    private com.netsuite.webservices.platform.core_2018_2.RecordRef[] channel;

    private com.netsuite.webservices.platform.core_2018_2.SearchDoubleField cost;

    private com.netsuite.webservices.platform.core_2018_2.SearchDateField createdDate;

    private com.netsuite.webservices.platform.core_2018_2.SearchDateField endDate;

    private com.netsuite.webservices.platform.core_2018_2.SearchStringField event;

    private com.netsuite.webservices.platform.core_2018_2.SearchDoubleField expectedRevenue;

    private com.netsuite.webservices.platform.core_2018_2.RecordRef[] externalId;

    private com.netsuite.webservices.platform.core_2018_2.SearchStringField externalIdString;

    private com.netsuite.webservices.platform.core_2018_2.RecordRef[] family;

    private com.netsuite.webservices.platform.core_2018_2.RecordRef[] group;

    private com.netsuite.webservices.platform.core_2018_2.RecordRef[] internalId;

    private com.netsuite.webservices.platform.core_2018_2.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2018_2.SearchBooleanField isInactive;

    private com.netsuite.webservices.platform.core_2018_2.SearchBooleanField isSalesCampaign;

    private com.netsuite.webservices.platform.core_2018_2.RecordRef[] item;

    private com.netsuite.webservices.platform.core_2018_2.SearchStringField keyword;

    private com.netsuite.webservices.platform.core_2018_2.SearchDateField lastModifiedDate;

    private com.netsuite.webservices.platform.core_2018_2.RecordRef[] manager;

    private com.netsuite.webservices.platform.core_2018_2.RecordRef[] managerRole;

    private com.netsuite.webservices.platform.core_2018_2.SearchLongField number;

    private com.netsuite.webservices.platform.core_2018_2.RecordRef[] offer;

    private com.netsuite.webservices.platform.core_2018_2.RecordRef[] promoCode;

    private com.netsuite.webservices.platform.core_2018_2.RecordRef[] recipient;

    private java.lang.String[] response;

    private java.lang.String[] responseCategory;

    private com.netsuite.webservices.platform.core_2018_2.SearchLongField responseCode;

    private com.netsuite.webservices.platform.core_2018_2.SearchStringField responseComments;

    private com.netsuite.webservices.platform.core_2018_2.SearchDateField responseDate;

    private com.netsuite.webservices.platform.core_2018_2.SearchDateField scheduleDate;

    private com.netsuite.webservices.platform.core_2018_2.RecordRef[] searchEngine;

    private com.netsuite.webservices.platform.core_2018_2.SearchDateField startDate;

    private java.lang.String[] status;

    private com.netsuite.webservices.platform.core_2018_2.RecordRef[] subscription;

    private com.netsuite.webservices.platform.core_2018_2.RecordRef[] template;

    private com.netsuite.webservices.platform.core_2018_2.SearchStringField title;

    private com.netsuite.webservices.platform.core_2018_2.RecordRef[] vertical;

    private com.netsuite.webservices.platform.core_2018_2.SearchCustomField[] customFieldList;

    public CampaignSearchBasic() {
    }

    public CampaignSearchBasic(
           com.netsuite.webservices.platform.core_2018_2.RecordRef[] audience,
           com.netsuite.webservices.platform.core_2018_2.SearchDoubleField baseCost,
           java.lang.String[] campaignEventType,
           com.netsuite.webservices.platform.core_2018_2.SearchStringField campaignId,
           com.netsuite.webservices.platform.core_2018_2.RecordRef[] category,
           com.netsuite.webservices.platform.core_2018_2.RecordRef[] channel,
           com.netsuite.webservices.platform.core_2018_2.SearchDoubleField cost,
           com.netsuite.webservices.platform.core_2018_2.SearchDateField createdDate,
           com.netsuite.webservices.platform.core_2018_2.SearchDateField endDate,
           com.netsuite.webservices.platform.core_2018_2.SearchStringField event,
           com.netsuite.webservices.platform.core_2018_2.SearchDoubleField expectedRevenue,
           com.netsuite.webservices.platform.core_2018_2.RecordRef[] externalId,
           com.netsuite.webservices.platform.core_2018_2.SearchStringField externalIdString,
           com.netsuite.webservices.platform.core_2018_2.RecordRef[] family,
           com.netsuite.webservices.platform.core_2018_2.RecordRef[] group,
           com.netsuite.webservices.platform.core_2018_2.RecordRef[] internalId,
           com.netsuite.webservices.platform.core_2018_2.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2018_2.SearchBooleanField isInactive,
           com.netsuite.webservices.platform.core_2018_2.SearchBooleanField isSalesCampaign,
           com.netsuite.webservices.platform.core_2018_2.RecordRef[] item,
           com.netsuite.webservices.platform.core_2018_2.SearchStringField keyword,
           com.netsuite.webservices.platform.core_2018_2.SearchDateField lastModifiedDate,
           com.netsuite.webservices.platform.core_2018_2.RecordRef[] manager,
           com.netsuite.webservices.platform.core_2018_2.RecordRef[] managerRole,
           com.netsuite.webservices.platform.core_2018_2.SearchLongField number,
           com.netsuite.webservices.platform.core_2018_2.RecordRef[] offer,
           com.netsuite.webservices.platform.core_2018_2.RecordRef[] promoCode,
           com.netsuite.webservices.platform.core_2018_2.RecordRef[] recipient,
           java.lang.String[] response,
           java.lang.String[] responseCategory,
           com.netsuite.webservices.platform.core_2018_2.SearchLongField responseCode,
           com.netsuite.webservices.platform.core_2018_2.SearchStringField responseComments,
           com.netsuite.webservices.platform.core_2018_2.SearchDateField responseDate,
           com.netsuite.webservices.platform.core_2018_2.SearchDateField scheduleDate,
           com.netsuite.webservices.platform.core_2018_2.RecordRef[] searchEngine,
           com.netsuite.webservices.platform.core_2018_2.SearchDateField startDate,
           java.lang.String[] status,
           com.netsuite.webservices.platform.core_2018_2.RecordRef[] subscription,
           com.netsuite.webservices.platform.core_2018_2.RecordRef[] template,
           com.netsuite.webservices.platform.core_2018_2.SearchStringField title,
           com.netsuite.webservices.platform.core_2018_2.RecordRef[] vertical,
           com.netsuite.webservices.platform.core_2018_2.SearchCustomField[] customFieldList) {
        this.audience = audience;
        this.baseCost = baseCost;
        this.campaignEventType = campaignEventType;
        this.campaignId = campaignId;
        this.category = category;
        this.channel = channel;
        this.cost = cost;
        this.createdDate = createdDate;
        this.endDate = endDate;
        this.event = event;
        this.expectedRevenue = expectedRevenue;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.family = family;
        this.group = group;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isInactive = isInactive;
        this.isSalesCampaign = isSalesCampaign;
        this.item = item;
        this.keyword = keyword;
        this.lastModifiedDate = lastModifiedDate;
        this.manager = manager;
        this.managerRole = managerRole;
        this.number = number;
        this.offer = offer;
        this.promoCode = promoCode;
        this.recipient = recipient;
        this.response = response;
        this.responseCategory = responseCategory;
        this.responseCode = responseCode;
        this.responseComments = responseComments;
        this.responseDate = responseDate;
        this.scheduleDate = scheduleDate;
        this.searchEngine = searchEngine;
        this.startDate = startDate;
        this.status = status;
        this.subscription = subscription;
        this.template = template;
        this.title = title;
        this.vertical = vertical;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the audience value for this CampaignSearchBasic.
     * 
     * @return audience
     */
    public com.netsuite.webservices.platform.core_2018_2.RecordRef[] getAudience() {
        return audience;
    }


    /**
     * Sets the audience value for this CampaignSearchBasic.
     * 
     * @param audience
     */
    public void setAudience(com.netsuite.webservices.platform.core_2018_2.RecordRef[] audience) {
        this.audience = audience;
    }


    /**
     * Gets the baseCost value for this CampaignSearchBasic.
     * 
     * @return baseCost
     */
    public com.netsuite.webservices.platform.core_2018_2.SearchDoubleField getBaseCost() {
        return baseCost;
    }


    /**
     * Sets the baseCost value for this CampaignSearchBasic.
     * 
     * @param baseCost
     */
    public void setBaseCost(com.netsuite.webservices.platform.core_2018_2.SearchDoubleField baseCost) {
        this.baseCost = baseCost;
    }


    /**
     * Gets the campaignEventType value for this CampaignSearchBasic.
     * 
     * @return campaignEventType
     */
    public java.lang.String[] getCampaignEventType() {
        return campaignEventType;
    }


    /**
     * Sets the campaignEventType value for this CampaignSearchBasic.
     * 
     * @param campaignEventType
     */
    public void setCampaignEventType(java.lang.String[] campaignEventType) {
        this.campaignEventType = campaignEventType;
    }


    /**
     * Gets the campaignId value for this CampaignSearchBasic.
     * 
     * @return campaignId
     */
    public com.netsuite.webservices.platform.core_2018_2.SearchStringField getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this CampaignSearchBasic.
     * 
     * @param campaignId
     */
    public void setCampaignId(com.netsuite.webservices.platform.core_2018_2.SearchStringField campaignId) {
        this.campaignId = campaignId;
    }


    /**
     * Gets the category value for this CampaignSearchBasic.
     * 
     * @return category
     */
    public com.netsuite.webservices.platform.core_2018_2.RecordRef[] getCategory() {
        return category;
    }


    /**
     * Sets the category value for this CampaignSearchBasic.
     * 
     * @param category
     */
    public void setCategory(com.netsuite.webservices.platform.core_2018_2.RecordRef[] category) {
        this.category = category;
    }


    /**
     * Gets the channel value for this CampaignSearchBasic.
     * 
     * @return channel
     */
    public com.netsuite.webservices.platform.core_2018_2.RecordRef[] getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this CampaignSearchBasic.
     * 
     * @param channel
     */
    public void setChannel(com.netsuite.webservices.platform.core_2018_2.RecordRef[] channel) {
        this.channel = channel;
    }


    /**
     * Gets the cost value for this CampaignSearchBasic.
     * 
     * @return cost
     */
    public com.netsuite.webservices.platform.core_2018_2.SearchDoubleField getCost() {
        return cost;
    }


    /**
     * Sets the cost value for this CampaignSearchBasic.
     * 
     * @param cost
     */
    public void setCost(com.netsuite.webservices.platform.core_2018_2.SearchDoubleField cost) {
        this.cost = cost;
    }


    /**
     * Gets the createdDate value for this CampaignSearchBasic.
     * 
     * @return createdDate
     */
    public com.netsuite.webservices.platform.core_2018_2.SearchDateField getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this CampaignSearchBasic.
     * 
     * @param createdDate
     */
    public void setCreatedDate(com.netsuite.webservices.platform.core_2018_2.SearchDateField createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the endDate value for this CampaignSearchBasic.
     * 
     * @return endDate
     */
    public com.netsuite.webservices.platform.core_2018_2.SearchDateField getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this CampaignSearchBasic.
     * 
     * @param endDate
     */
    public void setEndDate(com.netsuite.webservices.platform.core_2018_2.SearchDateField endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the event value for this CampaignSearchBasic.
     * 
     * @return event
     */
    public com.netsuite.webservices.platform.core_2018_2.SearchStringField getEvent() {
        return event;
    }


    /**
     * Sets the event value for this CampaignSearchBasic.
     * 
     * @param event
     */
    public void setEvent(com.netsuite.webservices.platform.core_2018_2.SearchStringField event) {
        this.event = event;
    }


    /**
     * Gets the expectedRevenue value for this CampaignSearchBasic.
     * 
     * @return expectedRevenue
     */
    public com.netsuite.webservices.platform.core_2018_2.SearchDoubleField getExpectedRevenue() {
        return expectedRevenue;
    }


    /**
     * Sets the expectedRevenue value for this CampaignSearchBasic.
     * 
     * @param expectedRevenue
     */
    public void setExpectedRevenue(com.netsuite.webservices.platform.core_2018_2.SearchDoubleField expectedRevenue) {
        this.expectedRevenue = expectedRevenue;
    }


    /**
     * Gets the externalId value for this CampaignSearchBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2018_2.RecordRef[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this CampaignSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2018_2.RecordRef[] externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this CampaignSearchBasic.
     * 
     * @return externalIdString
     */
    public com.netsuite.webservices.platform.core_2018_2.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this CampaignSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(com.netsuite.webservices.platform.core_2018_2.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the family value for this CampaignSearchBasic.
     * 
     * @return family
     */
    public com.netsuite.webservices.platform.core_2018_2.RecordRef[] getFamily() {
        return family;
    }


    /**
     * Sets the family value for this CampaignSearchBasic.
     * 
     * @param family
     */
    public void setFamily(com.netsuite.webservices.platform.core_2018_2.RecordRef[] family) {
        this.family = family;
    }


    /**
     * Gets the group value for this CampaignSearchBasic.
     * 
     * @return group
     */
    public com.netsuite.webservices.platform.core_2018_2.RecordRef[] getGroup() {
        return group;
    }


    /**
     * Sets the group value for this CampaignSearchBasic.
     * 
     * @param group
     */
    public void setGroup(com.netsuite.webservices.platform.core_2018_2.RecordRef[] group) {
        this.group = group;
    }


    /**
     * Gets the internalId value for this CampaignSearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2018_2.RecordRef[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this CampaignSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2018_2.RecordRef[] internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this CampaignSearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2018_2.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this CampaignSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2018_2.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the isInactive value for this CampaignSearchBasic.
     * 
     * @return isInactive
     */
    public com.netsuite.webservices.platform.core_2018_2.SearchBooleanField getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this CampaignSearchBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(com.netsuite.webservices.platform.core_2018_2.SearchBooleanField isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the isSalesCampaign value for this CampaignSearchBasic.
     * 
     * @return isSalesCampaign
     */
    public com.netsuite.webservices.platform.core_2018_2.SearchBooleanField getIsSalesCampaign() {
        return isSalesCampaign;
    }


    /**
     * Sets the isSalesCampaign value for this CampaignSearchBasic.
     * 
     * @param isSalesCampaign
     */
    public void setIsSalesCampaign(com.netsuite.webservices.platform.core_2018_2.SearchBooleanField isSalesCampaign) {
        this.isSalesCampaign = isSalesCampaign;
    }


    /**
     * Gets the item value for this CampaignSearchBasic.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2018_2.RecordRef[] getItem() {
        return item;
    }


    /**
     * Sets the item value for this CampaignSearchBasic.
     * 
     * @param item
     */
    public void setItem(com.netsuite.webservices.platform.core_2018_2.RecordRef[] item) {
        this.item = item;
    }


    /**
     * Gets the keyword value for this CampaignSearchBasic.
     * 
     * @return keyword
     */
    public com.netsuite.webservices.platform.core_2018_2.SearchStringField getKeyword() {
        return keyword;
    }


    /**
     * Sets the keyword value for this CampaignSearchBasic.
     * 
     * @param keyword
     */
    public void setKeyword(com.netsuite.webservices.platform.core_2018_2.SearchStringField keyword) {
        this.keyword = keyword;
    }


    /**
     * Gets the lastModifiedDate value for this CampaignSearchBasic.
     * 
     * @return lastModifiedDate
     */
    public com.netsuite.webservices.platform.core_2018_2.SearchDateField getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this CampaignSearchBasic.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(com.netsuite.webservices.platform.core_2018_2.SearchDateField lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the manager value for this CampaignSearchBasic.
     * 
     * @return manager
     */
    public com.netsuite.webservices.platform.core_2018_2.RecordRef[] getManager() {
        return manager;
    }


    /**
     * Sets the manager value for this CampaignSearchBasic.
     * 
     * @param manager
     */
    public void setManager(com.netsuite.webservices.platform.core_2018_2.RecordRef[] manager) {
        this.manager = manager;
    }


    /**
     * Gets the managerRole value for this CampaignSearchBasic.
     * 
     * @return managerRole
     */
    public com.netsuite.webservices.platform.core_2018_2.RecordRef[] getManagerRole() {
        return managerRole;
    }


    /**
     * Sets the managerRole value for this CampaignSearchBasic.
     * 
     * @param managerRole
     */
    public void setManagerRole(com.netsuite.webservices.platform.core_2018_2.RecordRef[] managerRole) {
        this.managerRole = managerRole;
    }


    /**
     * Gets the number value for this CampaignSearchBasic.
     * 
     * @return number
     */
    public com.netsuite.webservices.platform.core_2018_2.SearchLongField getNumber() {
        return number;
    }


    /**
     * Sets the number value for this CampaignSearchBasic.
     * 
     * @param number
     */
    public void setNumber(com.netsuite.webservices.platform.core_2018_2.SearchLongField number) {
        this.number = number;
    }


    /**
     * Gets the offer value for this CampaignSearchBasic.
     * 
     * @return offer
     */
    public com.netsuite.webservices.platform.core_2018_2.RecordRef[] getOffer() {
        return offer;
    }


    /**
     * Sets the offer value for this CampaignSearchBasic.
     * 
     * @param offer
     */
    public void setOffer(com.netsuite.webservices.platform.core_2018_2.RecordRef[] offer) {
        this.offer = offer;
    }


    /**
     * Gets the promoCode value for this CampaignSearchBasic.
     * 
     * @return promoCode
     */
    public com.netsuite.webservices.platform.core_2018_2.RecordRef[] getPromoCode() {
        return promoCode;
    }


    /**
     * Sets the promoCode value for this CampaignSearchBasic.
     * 
     * @param promoCode
     */
    public void setPromoCode(com.netsuite.webservices.platform.core_2018_2.RecordRef[] promoCode) {
        this.promoCode = promoCode;
    }


    /**
     * Gets the recipient value for this CampaignSearchBasic.
     * 
     * @return recipient
     */
    public com.netsuite.webservices.platform.core_2018_2.RecordRef[] getRecipient() {
        return recipient;
    }


    /**
     * Sets the recipient value for this CampaignSearchBasic.
     * 
     * @param recipient
     */
    public void setRecipient(com.netsuite.webservices.platform.core_2018_2.RecordRef[] recipient) {
        this.recipient = recipient;
    }


    /**
     * Gets the response value for this CampaignSearchBasic.
     * 
     * @return response
     */
    public java.lang.String[] getResponse() {
        return response;
    }


    /**
     * Sets the response value for this CampaignSearchBasic.
     * 
     * @param response
     */
    public void setResponse(java.lang.String[] response) {
        this.response = response;
    }


    /**
     * Gets the responseCategory value for this CampaignSearchBasic.
     * 
     * @return responseCategory
     */
    public java.lang.String[] getResponseCategory() {
        return responseCategory;
    }


    /**
     * Sets the responseCategory value for this CampaignSearchBasic.
     * 
     * @param responseCategory
     */
    public void setResponseCategory(java.lang.String[] responseCategory) {
        this.responseCategory = responseCategory;
    }


    /**
     * Gets the responseCode value for this CampaignSearchBasic.
     * 
     * @return responseCode
     */
    public com.netsuite.webservices.platform.core_2018_2.SearchLongField getResponseCode() {
        return responseCode;
    }


    /**
     * Sets the responseCode value for this CampaignSearchBasic.
     * 
     * @param responseCode
     */
    public void setResponseCode(com.netsuite.webservices.platform.core_2018_2.SearchLongField responseCode) {
        this.responseCode = responseCode;
    }


    /**
     * Gets the responseComments value for this CampaignSearchBasic.
     * 
     * @return responseComments
     */
    public com.netsuite.webservices.platform.core_2018_2.SearchStringField getResponseComments() {
        return responseComments;
    }


    /**
     * Sets the responseComments value for this CampaignSearchBasic.
     * 
     * @param responseComments
     */
    public void setResponseComments(com.netsuite.webservices.platform.core_2018_2.SearchStringField responseComments) {
        this.responseComments = responseComments;
    }


    /**
     * Gets the responseDate value for this CampaignSearchBasic.
     * 
     * @return responseDate
     */
    public com.netsuite.webservices.platform.core_2018_2.SearchDateField getResponseDate() {
        return responseDate;
    }


    /**
     * Sets the responseDate value for this CampaignSearchBasic.
     * 
     * @param responseDate
     */
    public void setResponseDate(com.netsuite.webservices.platform.core_2018_2.SearchDateField responseDate) {
        this.responseDate = responseDate;
    }


    /**
     * Gets the scheduleDate value for this CampaignSearchBasic.
     * 
     * @return scheduleDate
     */
    public com.netsuite.webservices.platform.core_2018_2.SearchDateField getScheduleDate() {
        return scheduleDate;
    }


    /**
     * Sets the scheduleDate value for this CampaignSearchBasic.
     * 
     * @param scheduleDate
     */
    public void setScheduleDate(com.netsuite.webservices.platform.core_2018_2.SearchDateField scheduleDate) {
        this.scheduleDate = scheduleDate;
    }


    /**
     * Gets the searchEngine value for this CampaignSearchBasic.
     * 
     * @return searchEngine
     */
    public com.netsuite.webservices.platform.core_2018_2.RecordRef[] getSearchEngine() {
        return searchEngine;
    }


    /**
     * Sets the searchEngine value for this CampaignSearchBasic.
     * 
     * @param searchEngine
     */
    public void setSearchEngine(com.netsuite.webservices.platform.core_2018_2.RecordRef[] searchEngine) {
        this.searchEngine = searchEngine;
    }


    /**
     * Gets the startDate value for this CampaignSearchBasic.
     * 
     * @return startDate
     */
    public com.netsuite.webservices.platform.core_2018_2.SearchDateField getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this CampaignSearchBasic.
     * 
     * @param startDate
     */
    public void setStartDate(com.netsuite.webservices.platform.core_2018_2.SearchDateField startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the status value for this CampaignSearchBasic.
     * 
     * @return status
     */
    public java.lang.String[] getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CampaignSearchBasic.
     * 
     * @param status
     */
    public void setStatus(java.lang.String[] status) {
        this.status = status;
    }


    /**
     * Gets the subscription value for this CampaignSearchBasic.
     * 
     * @return subscription
     */
    public com.netsuite.webservices.platform.core_2018_2.RecordRef[] getSubscription() {
        return subscription;
    }


    /**
     * Sets the subscription value for this CampaignSearchBasic.
     * 
     * @param subscription
     */
    public void setSubscription(com.netsuite.webservices.platform.core_2018_2.RecordRef[] subscription) {
        this.subscription = subscription;
    }


    /**
     * Gets the template value for this CampaignSearchBasic.
     * 
     * @return template
     */
    public com.netsuite.webservices.platform.core_2018_2.RecordRef[] getTemplate() {
        return template;
    }


    /**
     * Sets the template value for this CampaignSearchBasic.
     * 
     * @param template
     */
    public void setTemplate(com.netsuite.webservices.platform.core_2018_2.RecordRef[] template) {
        this.template = template;
    }


    /**
     * Gets the title value for this CampaignSearchBasic.
     * 
     * @return title
     */
    public com.netsuite.webservices.platform.core_2018_2.SearchStringField getTitle() {
        return title;
    }


    /**
     * Sets the title value for this CampaignSearchBasic.
     * 
     * @param title
     */
    public void setTitle(com.netsuite.webservices.platform.core_2018_2.SearchStringField title) {
        this.title = title;
    }


    /**
     * Gets the vertical value for this CampaignSearchBasic.
     * 
     * @return vertical
     */
    public com.netsuite.webservices.platform.core_2018_2.RecordRef[] getVertical() {
        return vertical;
    }


    /**
     * Sets the vertical value for this CampaignSearchBasic.
     * 
     * @param vertical
     */
    public void setVertical(com.netsuite.webservices.platform.core_2018_2.RecordRef[] vertical) {
        this.vertical = vertical;
    }


    /**
     * Gets the customFieldList value for this CampaignSearchBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2018_2.SearchCustomField[] getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this CampaignSearchBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2018_2.SearchCustomField[] customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CampaignSearchBasic)) return false;
        CampaignSearchBasic other = (CampaignSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.audience==null && other.getAudience()==null) || 
             (this.audience!=null &&
              java.util.Arrays.equals(this.audience, other.getAudience()))) &&
            ((this.baseCost==null && other.getBaseCost()==null) || 
             (this.baseCost!=null &&
              this.baseCost.equals(other.getBaseCost()))) &&
            ((this.campaignEventType==null && other.getCampaignEventType()==null) || 
             (this.campaignEventType!=null &&
              java.util.Arrays.equals(this.campaignEventType, other.getCampaignEventType()))) &&
            ((this.campaignId==null && other.getCampaignId()==null) || 
             (this.campaignId!=null &&
              this.campaignId.equals(other.getCampaignId()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              java.util.Arrays.equals(this.category, other.getCategory()))) &&
            ((this.channel==null && other.getChannel()==null) || 
             (this.channel!=null &&
              java.util.Arrays.equals(this.channel, other.getChannel()))) &&
            ((this.cost==null && other.getCost()==null) || 
             (this.cost!=null &&
              this.cost.equals(other.getCost()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.event==null && other.getEvent()==null) || 
             (this.event!=null &&
              this.event.equals(other.getEvent()))) &&
            ((this.expectedRevenue==null && other.getExpectedRevenue()==null) || 
             (this.expectedRevenue!=null &&
              this.expectedRevenue.equals(other.getExpectedRevenue()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.family==null && other.getFamily()==null) || 
             (this.family!=null &&
              java.util.Arrays.equals(this.family, other.getFamily()))) &&
            ((this.group==null && other.getGroup()==null) || 
             (this.group!=null &&
              java.util.Arrays.equals(this.group, other.getGroup()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.isSalesCampaign==null && other.getIsSalesCampaign()==null) || 
             (this.isSalesCampaign!=null &&
              this.isSalesCampaign.equals(other.getIsSalesCampaign()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              java.util.Arrays.equals(this.item, other.getItem()))) &&
            ((this.keyword==null && other.getKeyword()==null) || 
             (this.keyword!=null &&
              this.keyword.equals(other.getKeyword()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.manager==null && other.getManager()==null) || 
             (this.manager!=null &&
              java.util.Arrays.equals(this.manager, other.getManager()))) &&
            ((this.managerRole==null && other.getManagerRole()==null) || 
             (this.managerRole!=null &&
              java.util.Arrays.equals(this.managerRole, other.getManagerRole()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.offer==null && other.getOffer()==null) || 
             (this.offer!=null &&
              java.util.Arrays.equals(this.offer, other.getOffer()))) &&
            ((this.promoCode==null && other.getPromoCode()==null) || 
             (this.promoCode!=null &&
              java.util.Arrays.equals(this.promoCode, other.getPromoCode()))) &&
            ((this.recipient==null && other.getRecipient()==null) || 
             (this.recipient!=null &&
              java.util.Arrays.equals(this.recipient, other.getRecipient()))) &&
            ((this.response==null && other.getResponse()==null) || 
             (this.response!=null &&
              java.util.Arrays.equals(this.response, other.getResponse()))) &&
            ((this.responseCategory==null && other.getResponseCategory()==null) || 
             (this.responseCategory!=null &&
              java.util.Arrays.equals(this.responseCategory, other.getResponseCategory()))) &&
            ((this.responseCode==null && other.getResponseCode()==null) || 
             (this.responseCode!=null &&
              this.responseCode.equals(other.getResponseCode()))) &&
            ((this.responseComments==null && other.getResponseComments()==null) || 
             (this.responseComments!=null &&
              this.responseComments.equals(other.getResponseComments()))) &&
            ((this.responseDate==null && other.getResponseDate()==null) || 
             (this.responseDate!=null &&
              this.responseDate.equals(other.getResponseDate()))) &&
            ((this.scheduleDate==null && other.getScheduleDate()==null) || 
             (this.scheduleDate!=null &&
              this.scheduleDate.equals(other.getScheduleDate()))) &&
            ((this.searchEngine==null && other.getSearchEngine()==null) || 
             (this.searchEngine!=null &&
              java.util.Arrays.equals(this.searchEngine, other.getSearchEngine()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              java.util.Arrays.equals(this.status, other.getStatus()))) &&
            ((this.subscription==null && other.getSubscription()==null) || 
             (this.subscription!=null &&
              java.util.Arrays.equals(this.subscription, other.getSubscription()))) &&
            ((this.template==null && other.getTemplate()==null) || 
             (this.template!=null &&
              java.util.Arrays.equals(this.template, other.getTemplate()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.vertical==null && other.getVertical()==null) || 
             (this.vertical!=null &&
              java.util.Arrays.equals(this.vertical, other.getVertical()))) &&
            ((this.customFieldList==null && other.getCustomFieldList()==null) || 
             (this.customFieldList!=null &&
              java.util.Arrays.equals(this.customFieldList, other.getCustomFieldList())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAudience() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAudience());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAudience(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBaseCost() != null) {
            _hashCode += getBaseCost().hashCode();
        }
        if (getCampaignEventType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCampaignEventType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCampaignEventType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCampaignId() != null) {
            _hashCode += getCampaignId().hashCode();
        }
        if (getCategory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCategory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCategory(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getChannel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChannel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChannel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCost() != null) {
            _hashCode += getCost().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getEvent() != null) {
            _hashCode += getEvent().hashCode();
        }
        if (getExpectedRevenue() != null) {
            _hashCode += getExpectedRevenue().hashCode();
        }
        if (getExternalId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExternalId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExternalId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExternalIdString() != null) {
            _hashCode += getExternalIdString().hashCode();
        }
        if (getFamily() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFamily());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFamily(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGroup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGroup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGroup(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInternalId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInternalId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInternalId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getIsSalesCampaign() != null) {
            _hashCode += getIsSalesCampaign().hashCode();
        }
        if (getItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getKeyword() != null) {
            _hashCode += getKeyword().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getManager() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getManager());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getManager(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getManagerRole() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getManagerRole());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getManagerRole(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getOffer() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOffer());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOffer(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPromoCode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPromoCode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPromoCode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecipient() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecipient());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecipient(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResponse() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResponse());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResponse(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResponseCategory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResponseCategory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResponseCategory(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResponseCode() != null) {
            _hashCode += getResponseCode().hashCode();
        }
        if (getResponseComments() != null) {
            _hashCode += getResponseComments().hashCode();
        }
        if (getResponseDate() != null) {
            _hashCode += getResponseDate().hashCode();
        }
        if (getScheduleDate() != null) {
            _hashCode += getScheduleDate().hashCode();
        }
        if (getSearchEngine() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSearchEngine());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSearchEngine(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubscription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubscription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubscription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTemplate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTemplate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTemplate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getVertical() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVertical());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVertical(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomFieldList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomFieldList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomFieldList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CampaignSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "CampaignSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audience");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "audience"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "baseCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignEventType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "campaignEventType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "campaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "channel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "cost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("event");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "event"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "expectedRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalIdString");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "externalIdString"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("family");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "family"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "group"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalIdNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "internalIdNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSalesCampaign");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "isSalesCampaign"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyword");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "keyword"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "manager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managerRole");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "managerRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "offer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promoCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "promoCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipient");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "recipient"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("response");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "response"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "responseCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "responseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseComments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "responseComments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "responseDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "scheduleDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchEngine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "searchEngine"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "subscription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("template");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "template"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vertical");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "vertical"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2018_2.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "SearchCustomField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2018_2.platform.webservices.netsuite.com", "customField"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
