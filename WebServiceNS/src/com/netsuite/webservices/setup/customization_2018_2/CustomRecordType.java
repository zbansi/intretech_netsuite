
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
 * <p>CustomRecordType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡrecordName���Ե�ֵ��
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
     * ����recordName���Ե�ֵ��
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
     * ��ȡincludeName���Ե�ֵ��
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
     * ����includeName���Ե�ֵ��
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
     * ��ȡshowId���Ե�ֵ��
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
     * ����showId���Ե�ֵ��
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
     * ��ȡshowCreationDate���Ե�ֵ��
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
     * ����showCreationDate���Ե�ֵ��
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
     * ��ȡshowCreationDateOnList���Ե�ֵ��
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
     * ����showCreationDateOnList���Ե�ֵ��
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
     * ��ȡshowLastModified���Ե�ֵ��
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
     * ����showLastModified���Ե�ֵ��
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
     * ��ȡshowLastModifiedOnList���Ե�ֵ��
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
     * ����showLastModifiedOnList���Ե�ֵ��
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
     * ��ȡshowOwner���Ե�ֵ��
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
     * ����showOwner���Ե�ֵ��
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
     * ��ȡshowOwnerOnList���Ե�ֵ��
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
     * ����showOwnerOnList���Ե�ֵ��
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
     * ��ȡshowOwnerAllowChange���Ե�ֵ��
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
     * ����showOwnerAllowChange���Ե�ֵ��
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
     * ��ȡaccessType���Ե�ֵ��
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
     * ����accessType���Ե�ֵ��
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
     * ��ȡallowAttachments���Ե�ֵ��
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
     * ����allowAttachments���Ե�ֵ��
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
     * ��ȡshowNotes���Ե�ֵ��
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
     * ����showNotes���Ե�ֵ��
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
     * ��ȡenableMailMerge���Ե�ֵ��
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
     * ����enableMailMerge���Ե�ֵ��
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
     * ��ȡisOrdered���Ե�ֵ��
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
     * ����isOrdered���Ե�ֵ��
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
     * ��ȡisAvailableOffline���Ե�ֵ��
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
     * ����isAvailableOffline���Ե�ֵ��
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
     * ��ȡallowQuickSearch���Ե�ֵ��
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
     * ����allowQuickSearch���Ե�ֵ��
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
     * ��ȡhierarchical���Ե�ֵ��
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
     * ����hierarchical���Ե�ֵ��
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
     * ��ȡenableDle���Ե�ֵ��
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
     * ����enableDle���Ե�ֵ��
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
     * ��ȡenableNameTranslation���Ե�ֵ��
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
     * ����enableNameTranslation���Ե�ֵ��
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
     * ��ȡdisclaimer���Ե�ֵ��
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
     * ����disclaimer���Ե�ֵ��
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
     * ��ȡenableNumbering���Ե�ֵ��
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
     * ����enableNumbering���Ե�ֵ��
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
     * ��ȡnumberingPrefix���Ե�ֵ��
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
     * ����numberingPrefix���Ե�ֵ��
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
     * ��ȡnumberingSuffix���Ե�ֵ��
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
     * ����numberingSuffix���Ե�ֵ��
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
     * ��ȡnumberingMinDigits���Ե�ֵ��
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
     * ����numberingMinDigits���Ե�ֵ��
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
     * ��ȡnumberingInit���Ե�ֵ��
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
     * ����numberingInit���Ե�ֵ��
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
     * ��ȡnumberingCurrentNumber���Ե�ֵ��
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
     * ����numberingCurrentNumber���Ե�ֵ��
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
     * ��ȡallowNumberingOverride���Ե�ֵ��
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
     * ����allowNumberingOverride���Ե�ֵ��
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
     * ��ȡisNumberingUpdateable���Ե�ֵ��
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
     * ����isNumberingUpdateable���Ե�ֵ��
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
     * ��ȡdescription���Ե�ֵ��
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
     * ����description���Ե�ֵ��
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
     * ��ȡtabsList���Ե�ֵ��
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
     * ����tabsList���Ե�ֵ��
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
     * ��ȡsublistsList���Ե�ֵ��
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
     * ����sublistsList���Ե�ֵ��
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
     * ��ȡformsList���Ե�ֵ��
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
     * ����formsList���Ե�ֵ��
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
     * ��ȡonlineFormsList���Ե�ֵ��
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
     * ����onlineFormsList���Ե�ֵ��
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
     * ��ȡpermissionsList���Ե�ֵ��
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
     * ����permissionsList���Ե�ֵ��
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
     * ��ȡlinksList���Ե�ֵ��
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
     * ����linksList���Ե�ֵ��
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
     * ��ȡmanagersList���Ե�ֵ��
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
     * ����managersList���Ե�ֵ��
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
     * ��ȡchildrenList���Ե�ֵ��
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
     * ����childrenList���Ե�ֵ��
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
     * ��ȡparentsList���Ե�ֵ��
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
     * ����parentsList���Ե�ֵ��
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
     * ��ȡtranslationsList���Ե�ֵ��
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
     * ����translationsList���Ե�ֵ��
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
     * ��ȡscriptId���Ե�ֵ��
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
     * ����scriptId���Ե�ֵ��
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
     * ��ȡcustomFieldList���Ե�ֵ��
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
     * ����customFieldList���Ե�ֵ��
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

}
