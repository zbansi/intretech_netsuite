
package com.netsuite.webservices.lists.relationships_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.lists.relationships_2018_2.types.EntityGroupType;
import com.netsuite.webservices.platform.core_2018_2.CustomFieldList;
import com.netsuite.webservices.platform.core_2018_2.Record;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;


/**
 * <p>EntityGroup complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="EntityGroup">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}Record">
 *       &lt;sequence>
 *         &lt;element name="groupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="groupType" type="{urn:types.relationships_2018_2.lists.webservices.netsuite.com}EntityGroupType" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="groupOwner" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="isSavedSearch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="parentGroupType" type="{urn:types.relationships_2018_2.lists.webservices.netsuite.com}EntityGroupType" minOccurs="0"/>
 *         &lt;element name="savedSearch" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="isSalesTeam" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isPrivate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="restrictionGroup" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="isInactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isSalesRep" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isSupportRep" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isProductTeam" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isFunctionalTeam" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="issueRole" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="isManufacturingWorkCenter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="subsidiary" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="machineResources" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="laborResources" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="workCalendar" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
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
@XmlType(name = "EntityGroup", propOrder = {
    "groupName",
    "groupType",
    "email",
    "groupOwner",
    "isSavedSearch",
    "parentGroupType",
    "savedSearch",
    "isSalesTeam",
    "comments",
    "isPrivate",
    "restrictionGroup",
    "isInactive",
    "isSalesRep",
    "isSupportRep",
    "isProductTeam",
    "isFunctionalTeam",
    "issueRole",
    "isManufacturingWorkCenter",
    "subsidiary",
    "machineResources",
    "laborResources",
    "workCalendar",
    "customFieldList"
})
public class EntityGroup
    extends Record
{

    protected String groupName;
    @XmlSchemaType(name = "string")
    protected EntityGroupType groupType;
    protected String email;
    protected RecordRef groupOwner;
    protected Boolean isSavedSearch;
    @XmlSchemaType(name = "string")
    protected EntityGroupType parentGroupType;
    protected RecordRef savedSearch;
    protected Boolean isSalesTeam;
    protected String comments;
    protected Boolean isPrivate;
    protected RecordRef restrictionGroup;
    protected Boolean isInactive;
    protected Boolean isSalesRep;
    protected Boolean isSupportRep;
    protected Boolean isProductTeam;
    protected Boolean isFunctionalTeam;
    protected RecordRef issueRole;
    protected Boolean isManufacturingWorkCenter;
    protected RecordRef subsidiary;
    protected Long machineResources;
    protected Long laborResources;
    protected RecordRef workCalendar;
    protected CustomFieldList customFieldList;
    @XmlAttribute(name = "internalId")
    protected String internalId;
    @XmlAttribute(name = "externalId")
    protected String externalId;

    /**
     * 获取groupName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * 设置groupName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * 获取groupType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EntityGroupType }
     *     
     */
    public EntityGroupType getGroupType() {
        return groupType;
    }

    /**
     * 设置groupType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EntityGroupType }
     *     
     */
    public void setGroupType(EntityGroupType value) {
        this.groupType = value;
    }

    /**
     * 获取email属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置email属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * 获取groupOwner属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getGroupOwner() {
        return groupOwner;
    }

    /**
     * 设置groupOwner属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setGroupOwner(RecordRef value) {
        this.groupOwner = value;
    }

    /**
     * 获取isSavedSearch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSavedSearch() {
        return isSavedSearch;
    }

    /**
     * 设置isSavedSearch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSavedSearch(Boolean value) {
        this.isSavedSearch = value;
    }

    /**
     * 获取parentGroupType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EntityGroupType }
     *     
     */
    public EntityGroupType getParentGroupType() {
        return parentGroupType;
    }

    /**
     * 设置parentGroupType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EntityGroupType }
     *     
     */
    public void setParentGroupType(EntityGroupType value) {
        this.parentGroupType = value;
    }

    /**
     * 获取savedSearch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSavedSearch() {
        return savedSearch;
    }

    /**
     * 设置savedSearch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSavedSearch(RecordRef value) {
        this.savedSearch = value;
    }

    /**
     * 获取isSalesTeam属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSalesTeam() {
        return isSalesTeam;
    }

    /**
     * 设置isSalesTeam属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSalesTeam(Boolean value) {
        this.isSalesTeam = value;
    }

    /**
     * 获取comments属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * 设置comments属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * 获取isPrivate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPrivate() {
        return isPrivate;
    }

    /**
     * 设置isPrivate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPrivate(Boolean value) {
        this.isPrivate = value;
    }

    /**
     * 获取restrictionGroup属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getRestrictionGroup() {
        return restrictionGroup;
    }

    /**
     * 设置restrictionGroup属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setRestrictionGroup(RecordRef value) {
        this.restrictionGroup = value;
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
     * 获取isSalesRep属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSalesRep() {
        return isSalesRep;
    }

    /**
     * 设置isSalesRep属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSalesRep(Boolean value) {
        this.isSalesRep = value;
    }

    /**
     * 获取isSupportRep属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSupportRep() {
        return isSupportRep;
    }

    /**
     * 设置isSupportRep属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSupportRep(Boolean value) {
        this.isSupportRep = value;
    }

    /**
     * 获取isProductTeam属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsProductTeam() {
        return isProductTeam;
    }

    /**
     * 设置isProductTeam属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsProductTeam(Boolean value) {
        this.isProductTeam = value;
    }

    /**
     * 获取isFunctionalTeam属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFunctionalTeam() {
        return isFunctionalTeam;
    }

    /**
     * 设置isFunctionalTeam属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFunctionalTeam(Boolean value) {
        this.isFunctionalTeam = value;
    }

    /**
     * 获取issueRole属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getIssueRole() {
        return issueRole;
    }

    /**
     * 设置issueRole属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setIssueRole(RecordRef value) {
        this.issueRole = value;
    }

    /**
     * 获取isManufacturingWorkCenter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsManufacturingWorkCenter() {
        return isManufacturingWorkCenter;
    }

    /**
     * 设置isManufacturingWorkCenter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsManufacturingWorkCenter(Boolean value) {
        this.isManufacturingWorkCenter = value;
    }

    /**
     * 获取subsidiary属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSubsidiary() {
        return subsidiary;
    }

    /**
     * 设置subsidiary属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSubsidiary(RecordRef value) {
        this.subsidiary = value;
    }

    /**
     * 获取machineResources属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMachineResources() {
        return machineResources;
    }

    /**
     * 设置machineResources属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMachineResources(Long value) {
        this.machineResources = value;
    }

    /**
     * 获取laborResources属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLaborResources() {
        return laborResources;
    }

    /**
     * 设置laborResources属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLaborResources(Long value) {
        this.laborResources = value;
    }

    /**
     * 获取workCalendar属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getWorkCalendar() {
        return workCalendar;
    }

    /**
     * 设置workCalendar属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setWorkCalendar(RecordRef value) {
        this.workCalendar = value;
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
