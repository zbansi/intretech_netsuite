
package com.netsuite.webservices.setup.customization_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.Record;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;
import com.netsuite.webservices.setup.customization_2018_2.types.CustomRecordTypeAccessType;


/**
 * <p>CustomRecordType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CustomRecordType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}Record">
 *       &lt;sequence>
 *         &lt;element name="recordName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="includeName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showId" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showCreationDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showCreationDateOnList" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showLastModified" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showLastModifiedOnList" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showOwner" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showOwnerOnList" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showOwnerAllowChange" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="accessType" type="{urn:types.customization_2018_2.setup.webservices.netsuite.com}CustomRecordTypeAccessType" minOccurs="0"/>
 *         &lt;element name="allowAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showNotes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableMailMerge" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isOrdered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isAvailableOffline" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="allowQuickSearch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="hierarchical" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableDle" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableNameTranslation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isInactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="disclaimer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enableNumbering" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="numberingPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberingSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberingMinDigits" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numberingInit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numberingCurrentNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="allowNumberingOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isNumberingUpdateable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="owner" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tabsList" type="{urn:customization_2018_2.setup.webservices.netsuite.com}CustomRecordTypeTabsList" minOccurs="0"/>
 *         &lt;element name="sublistsList" type="{urn:customization_2018_2.setup.webservices.netsuite.com}CustomRecordTypeSublistsList" minOccurs="0"/>
 *         &lt;element name="formsList" type="{urn:customization_2018_2.setup.webservices.netsuite.com}CustomRecordTypeFormsList" minOccurs="0"/>
 *         &lt;element name="onlineFormsList" type="{urn:customization_2018_2.setup.webservices.netsuite.com}CustomRecordTypeOnlineFormsList" minOccurs="0"/>
 *         &lt;element name="permissionsList" type="{urn:customization_2018_2.setup.webservices.netsuite.com}CustomRecordTypePermissionsList" minOccurs="0"/>
 *         &lt;element name="linksList" type="{urn:customization_2018_2.setup.webservices.netsuite.com}CustomRecordTypeLinksList" minOccurs="0"/>
 *         &lt;element name="managersList" type="{urn:customization_2018_2.setup.webservices.netsuite.com}CustomRecordTypeManagersList" minOccurs="0"/>
 *         &lt;element name="childrenList" type="{urn:customization_2018_2.setup.webservices.netsuite.com}CustomRecordTypeChildrenList" minOccurs="0"/>
 *         &lt;element name="parentsList" type="{urn:customization_2018_2.setup.webservices.netsuite.com}CustomRecordTypeParentsList" minOccurs="0"/>
 *         &lt;element name="translationsList" type="{urn:customization_2018_2.setup.webservices.netsuite.com}CustomRecordTypeTranslationsList" minOccurs="0"/>
 *         &lt;element name="scriptId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customFieldList" type="{urn:customization_2018_2.setup.webservices.netsuite.com}CustomRecordTypeFieldList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="internalId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomRecordType", propOrder = {
    "recordName",
    "includeName",
    "showId",
    "showCreationDate",
    "showCreationDateOnList",
    "showLastModified",
    "showLastModifiedOnList",
    "showOwner",
    "showOwnerOnList",
    "showOwnerAllowChange",
    "accessType",
    "allowAttachments",
    "showNotes",
    "enableMailMerge",
    "isOrdered",
    "isAvailableOffline",
    "allowQuickSearch",
    "hierarchical",
    "enableDle",
    "enableNameTranslation",
    "isInactive",
    "disclaimer",
    "enableNumbering",
    "numberingPrefix",
    "numberingSuffix",
    "numberingMinDigits",
    "numberingInit",
    "numberingCurrentNumber",
    "allowNumberingOverride",
    "isNumberingUpdateable",
    "owner",
    "description",
    "tabsList",
    "sublistsList",
    "formsList",
    "onlineFormsList",
    "permissionsList",
    "linksList",
    "managersList",
    "childrenList",
    "parentsList",
    "translationsList",
    "scriptId",
    "customFieldList"
})
public class CustomRecordType
    extends Record
{

    protected String recordName;
    protected Boolean includeName;
    protected Boolean showId;
    protected Boolean showCreationDate;
    protected Boolean showCreationDateOnList;
    protected Boolean showLastModified;
    protected Boolean showLastModifiedOnList;
    protected Boolean showOwner;
    protected Boolean showOwnerOnList;
    protected Boolean showOwnerAllowChange;
    @XmlSchemaType(name = "string")
    protected CustomRecordTypeAccessType accessType;
    protected Boolean allowAttachments;
    protected Boolean showNotes;
    protected Boolean enableMailMerge;
    protected Boolean isOrdered;
    protected Boolean isAvailableOffline;
    protected Boolean allowQuickSearch;
    protected Boolean hierarchical;
    protected Boolean enableDle;
    protected Boolean enableNameTranslation;
    protected Boolean isInactive;
    protected String disclaimer;
    protected Boolean enableNumbering;
    protected String numberingPrefix;
    protected String numberingSuffix;
    protected Long numberingMinDigits;
    protected Long numberingInit;
    protected Long numberingCurrentNumber;
    protected Boolean allowNumberingOverride;
    protected Boolean isNumberingUpdateable;
    protected RecordRef owner;
    protected String description;
    protected CustomRecordTypeTabsList tabsList;
    protected CustomRecordTypeSublistsList sublistsList;
    protected CustomRecordTypeFormsList formsList;
    protected CustomRecordTypeOnlineFormsList onlineFormsList;
    protected CustomRecordTypePermissionsList permissionsList;
    protected CustomRecordTypeLinksList linksList;
    protected CustomRecordTypeManagersList managersList;
    protected CustomRecordTypeChildrenList childrenList;
    protected CustomRecordTypeParentsList parentsList;
    protected CustomRecordTypeTranslationsList translationsList;
    protected String scriptId;
    protected CustomRecordTypeFieldList customFieldList;
    @XmlAttribute(name = "internalId")
    protected String internalId;

    /**
     * 获取recordName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordName() {
        return recordName;
    }

    /**
     * 设置recordName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordName(String value) {
        this.recordName = value;
    }

    /**
     * 获取includeName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeName() {
        return includeName;
    }

    /**
     * 设置includeName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeName(Boolean value) {
        this.includeName = value;
    }

    /**
     * 获取showId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowId() {
        return showId;
    }

    /**
     * 设置showId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowId(Boolean value) {
        this.showId = value;
    }

    /**
     * 获取showCreationDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowCreationDate() {
        return showCreationDate;
    }

    /**
     * 设置showCreationDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowCreationDate(Boolean value) {
        this.showCreationDate = value;
    }

    /**
     * 获取showCreationDateOnList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowCreationDateOnList() {
        return showCreationDateOnList;
    }

    /**
     * 设置showCreationDateOnList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowCreationDateOnList(Boolean value) {
        this.showCreationDateOnList = value;
    }

    /**
     * 获取showLastModified属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowLastModified() {
        return showLastModified;
    }

    /**
     * 设置showLastModified属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowLastModified(Boolean value) {
        this.showLastModified = value;
    }

    /**
     * 获取showLastModifiedOnList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowLastModifiedOnList() {
        return showLastModifiedOnList;
    }

    /**
     * 设置showLastModifiedOnList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowLastModifiedOnList(Boolean value) {
        this.showLastModifiedOnList = value;
    }

    /**
     * 获取showOwner属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowOwner() {
        return showOwner;
    }

    /**
     * 设置showOwner属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowOwner(Boolean value) {
        this.showOwner = value;
    }

    /**
     * 获取showOwnerOnList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowOwnerOnList() {
        return showOwnerOnList;
    }

    /**
     * 设置showOwnerOnList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowOwnerOnList(Boolean value) {
        this.showOwnerOnList = value;
    }

    /**
     * 获取showOwnerAllowChange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowOwnerAllowChange() {
        return showOwnerAllowChange;
    }

    /**
     * 设置showOwnerAllowChange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowOwnerAllowChange(Boolean value) {
        this.showOwnerAllowChange = value;
    }

    /**
     * 获取accessType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomRecordTypeAccessType }
     *     
     */
    public CustomRecordTypeAccessType getAccessType() {
        return accessType;
    }

    /**
     * 设置accessType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomRecordTypeAccessType }
     *     
     */
    public void setAccessType(CustomRecordTypeAccessType value) {
        this.accessType = value;
    }

    /**
     * 获取allowAttachments属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowAttachments() {
        return allowAttachments;
    }

    /**
     * 设置allowAttachments属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowAttachments(Boolean value) {
        this.allowAttachments = value;
    }

    /**
     * 获取showNotes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowNotes() {
        return showNotes;
    }

    /**
     * 设置showNotes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowNotes(Boolean value) {
        this.showNotes = value;
    }

    /**
     * 获取enableMailMerge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableMailMerge() {
        return enableMailMerge;
    }

    /**
     * 设置enableMailMerge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableMailMerge(Boolean value) {
        this.enableMailMerge = value;
    }

    /**
     * 获取isOrdered属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOrdered() {
        return isOrdered;
    }

    /**
     * 设置isOrdered属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOrdered(Boolean value) {
        this.isOrdered = value;
    }

    /**
     * 获取isAvailableOffline属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAvailableOffline() {
        return isAvailableOffline;
    }

    /**
     * 设置isAvailableOffline属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAvailableOffline(Boolean value) {
        this.isAvailableOffline = value;
    }

    /**
     * 获取allowQuickSearch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowQuickSearch() {
        return allowQuickSearch;
    }

    /**
     * 设置allowQuickSearch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowQuickSearch(Boolean value) {
        this.allowQuickSearch = value;
    }

    /**
     * 获取hierarchical属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHierarchical() {
        return hierarchical;
    }

    /**
     * 设置hierarchical属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHierarchical(Boolean value) {
        this.hierarchical = value;
    }

    /**
     * 获取enableDle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableDle() {
        return enableDle;
    }

    /**
     * 设置enableDle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableDle(Boolean value) {
        this.enableDle = value;
    }

    /**
     * 获取enableNameTranslation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableNameTranslation() {
        return enableNameTranslation;
    }

    /**
     * 设置enableNameTranslation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableNameTranslation(Boolean value) {
        this.enableNameTranslation = value;
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
     * 获取disclaimer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisclaimer() {
        return disclaimer;
    }

    /**
     * 设置disclaimer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisclaimer(String value) {
        this.disclaimer = value;
    }

    /**
     * 获取enableNumbering属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableNumbering() {
        return enableNumbering;
    }

    /**
     * 设置enableNumbering属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableNumbering(Boolean value) {
        this.enableNumbering = value;
    }

    /**
     * 获取numberingPrefix属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberingPrefix() {
        return numberingPrefix;
    }

    /**
     * 设置numberingPrefix属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberingPrefix(String value) {
        this.numberingPrefix = value;
    }

    /**
     * 获取numberingSuffix属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberingSuffix() {
        return numberingSuffix;
    }

    /**
     * 设置numberingSuffix属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberingSuffix(String value) {
        this.numberingSuffix = value;
    }

    /**
     * 获取numberingMinDigits属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberingMinDigits() {
        return numberingMinDigits;
    }

    /**
     * 设置numberingMinDigits属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberingMinDigits(Long value) {
        this.numberingMinDigits = value;
    }

    /**
     * 获取numberingInit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberingInit() {
        return numberingInit;
    }

    /**
     * 设置numberingInit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberingInit(Long value) {
        this.numberingInit = value;
    }

    /**
     * 获取numberingCurrentNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberingCurrentNumber() {
        return numberingCurrentNumber;
    }

    /**
     * 设置numberingCurrentNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberingCurrentNumber(Long value) {
        this.numberingCurrentNumber = value;
    }

    /**
     * 获取allowNumberingOverride属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowNumberingOverride() {
        return allowNumberingOverride;
    }

    /**
     * 设置allowNumberingOverride属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowNumberingOverride(Boolean value) {
        this.allowNumberingOverride = value;
    }

    /**
     * 获取isNumberingUpdateable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNumberingUpdateable() {
        return isNumberingUpdateable;
    }

    /**
     * 设置isNumberingUpdateable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNumberingUpdateable(Boolean value) {
        this.isNumberingUpdateable = value;
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
     * 获取tabsList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomRecordTypeTabsList }
     *     
     */
    public CustomRecordTypeTabsList getTabsList() {
        return tabsList;
    }

    /**
     * 设置tabsList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomRecordTypeTabsList }
     *     
     */
    public void setTabsList(CustomRecordTypeTabsList value) {
        this.tabsList = value;
    }

    /**
     * 获取sublistsList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomRecordTypeSublistsList }
     *     
     */
    public CustomRecordTypeSublistsList getSublistsList() {
        return sublistsList;
    }

    /**
     * 设置sublistsList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomRecordTypeSublistsList }
     *     
     */
    public void setSublistsList(CustomRecordTypeSublistsList value) {
        this.sublistsList = value;
    }

    /**
     * 获取formsList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomRecordTypeFormsList }
     *     
     */
    public CustomRecordTypeFormsList getFormsList() {
        return formsList;
    }

    /**
     * 设置formsList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomRecordTypeFormsList }
     *     
     */
    public void setFormsList(CustomRecordTypeFormsList value) {
        this.formsList = value;
    }

    /**
     * 获取onlineFormsList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomRecordTypeOnlineFormsList }
     *     
     */
    public CustomRecordTypeOnlineFormsList getOnlineFormsList() {
        return onlineFormsList;
    }

    /**
     * 设置onlineFormsList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomRecordTypeOnlineFormsList }
     *     
     */
    public void setOnlineFormsList(CustomRecordTypeOnlineFormsList value) {
        this.onlineFormsList = value;
    }

    /**
     * 获取permissionsList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomRecordTypePermissionsList }
     *     
     */
    public CustomRecordTypePermissionsList getPermissionsList() {
        return permissionsList;
    }

    /**
     * 设置permissionsList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomRecordTypePermissionsList }
     *     
     */
    public void setPermissionsList(CustomRecordTypePermissionsList value) {
        this.permissionsList = value;
    }

    /**
     * 获取linksList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomRecordTypeLinksList }
     *     
     */
    public CustomRecordTypeLinksList getLinksList() {
        return linksList;
    }

    /**
     * 设置linksList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomRecordTypeLinksList }
     *     
     */
    public void setLinksList(CustomRecordTypeLinksList value) {
        this.linksList = value;
    }

    /**
     * 获取managersList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomRecordTypeManagersList }
     *     
     */
    public CustomRecordTypeManagersList getManagersList() {
        return managersList;
    }

    /**
     * 设置managersList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomRecordTypeManagersList }
     *     
     */
    public void setManagersList(CustomRecordTypeManagersList value) {
        this.managersList = value;
    }

    /**
     * 获取childrenList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomRecordTypeChildrenList }
     *     
     */
    public CustomRecordTypeChildrenList getChildrenList() {
        return childrenList;
    }

    /**
     * 设置childrenList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomRecordTypeChildrenList }
     *     
     */
    public void setChildrenList(CustomRecordTypeChildrenList value) {
        this.childrenList = value;
    }

    /**
     * 获取parentsList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomRecordTypeParentsList }
     *     
     */
    public CustomRecordTypeParentsList getParentsList() {
        return parentsList;
    }

    /**
     * 设置parentsList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomRecordTypeParentsList }
     *     
     */
    public void setParentsList(CustomRecordTypeParentsList value) {
        this.parentsList = value;
    }

    /**
     * 获取translationsList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomRecordTypeTranslationsList }
     *     
     */
    public CustomRecordTypeTranslationsList getTranslationsList() {
        return translationsList;
    }

    /**
     * 设置translationsList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomRecordTypeTranslationsList }
     *     
     */
    public void setTranslationsList(CustomRecordTypeTranslationsList value) {
        this.translationsList = value;
    }

    /**
     * 获取scriptId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScriptId() {
        return scriptId;
    }

    /**
     * 设置scriptId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScriptId(String value) {
        this.scriptId = value;
    }

    /**
     * 获取customFieldList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomRecordTypeFieldList }
     *     
     */
    public CustomRecordTypeFieldList getCustomFieldList() {
        return customFieldList;
    }

    /**
     * 设置customFieldList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomRecordTypeFieldList }
     *     
     */
    public void setCustomFieldList(CustomRecordTypeFieldList value) {
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

}
