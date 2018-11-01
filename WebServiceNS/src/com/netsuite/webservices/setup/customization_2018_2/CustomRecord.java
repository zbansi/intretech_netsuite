
package com.netsuite.webservices.setup.customization_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.platform.core_2018_2.CustomFieldList;
import com.netsuite.webservices.platform.core_2018_2.Record;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;


/**
 * <p>CustomRecord complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CustomRecord">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}Record">
 *       &lt;sequence>
 *         &lt;element name="customRecordId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customForm" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="isInactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="parent" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="disclaimer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastModified" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="autoName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="altName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="owner" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="recType" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="enableNumbering" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="numberingPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberingSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberingMinDigits" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberingInit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numberingCurrentNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="allowNumberingOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isNumberingUpdateable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="translationsList" type="{urn:customization_2018_2.setup.webservices.netsuite.com}CustomRecordTranslationsList" minOccurs="0"/>
 *         &lt;element name="includeName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showId" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showCreationDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showCreationDateOnList" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showLastModified" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showLastModifiedOnList" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showOwner" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showOwnerOnList" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showOwnerAllowChange" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="usePermissions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="allowAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showNotes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enablEmailMerge" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isOrdered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="allowInlineEditing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isAvailableOffline" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="allowQuickSearch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="recordName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scriptId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "CustomRecord", propOrder = {
    "customRecordId",
    "customForm",
    "isInactive",
    "parent",
    "disclaimer",
    "created",
    "lastModified",
    "name",
    "autoName",
    "altName",
    "owner",
    "recType",
    "enableNumbering",
    "numberingPrefix",
    "numberingSuffix",
    "numberingMinDigits",
    "description",
    "numberingInit",
    "numberingCurrentNumber",
    "allowNumberingOverride",
    "isNumberingUpdateable",
    "translationsList",
    "includeName",
    "showId",
    "showCreationDate",
    "showCreationDateOnList",
    "showLastModified",
    "showLastModifiedOnList",
    "showOwner",
    "showOwnerOnList",
    "showOwnerAllowChange",
    "usePermissions",
    "allowAttachments",
    "showNotes",
    "enablEmailMerge",
    "isOrdered",
    "allowInlineEditing",
    "isAvailableOffline",
    "allowQuickSearch",
    "recordName",
    "scriptId",
    "customFieldList"
})
public class CustomRecord
    extends Record
{

    protected String customRecordId;
    protected RecordRef customForm;
    protected Boolean isInactive;
    protected RecordRef parent;
    protected String disclaimer;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModified;
    protected String name;
    protected Boolean autoName;
    protected String altName;
    protected RecordRef owner;
    protected RecordRef recType;
    protected Boolean enableNumbering;
    protected String numberingPrefix;
    protected String numberingSuffix;
    protected Long numberingMinDigits;
    protected String description;
    protected Long numberingInit;
    protected Long numberingCurrentNumber;
    protected Boolean allowNumberingOverride;
    protected Boolean isNumberingUpdateable;
    protected CustomRecordTranslationsList translationsList;
    protected Boolean includeName;
    protected Boolean showId;
    protected Boolean showCreationDate;
    protected Boolean showCreationDateOnList;
    protected Boolean showLastModified;
    protected Boolean showLastModifiedOnList;
    protected Boolean showOwner;
    protected Boolean showOwnerOnList;
    protected Boolean showOwnerAllowChange;
    protected Boolean usePermissions;
    protected Boolean allowAttachments;
    protected Boolean showNotes;
    protected Boolean enablEmailMerge;
    protected Boolean isOrdered;
    protected Boolean allowInlineEditing;
    protected Boolean isAvailableOffline;
    protected Boolean allowQuickSearch;
    protected String recordName;
    protected String scriptId;
    protected CustomFieldList customFieldList;
    @XmlAttribute(name = "internalId")
    protected String internalId;
    @XmlAttribute(name = "externalId")
    protected String externalId;

    /**
     * 获取customRecordId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomRecordId() {
        return customRecordId;
    }

    /**
     * 设置customRecordId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomRecordId(String value) {
        this.customRecordId = value;
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
     * 获取created属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * 设置created属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
    }

    /**
     * 获取lastModified属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModified() {
        return lastModified;
    }

    /**
     * 设置lastModified属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModified(XMLGregorianCalendar value) {
        this.lastModified = value;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取autoName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoName() {
        return autoName;
    }

    /**
     * 设置autoName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoName(Boolean value) {
        this.autoName = value;
    }

    /**
     * 获取altName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltName() {
        return altName;
    }

    /**
     * 设置altName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltName(String value) {
        this.altName = value;
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
     * 获取recType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getRecType() {
        return recType;
    }

    /**
     * 设置recType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setRecType(RecordRef value) {
        this.recType = value;
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
     * 获取translationsList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomRecordTranslationsList }
     *     
     */
    public CustomRecordTranslationsList getTranslationsList() {
        return translationsList;
    }

    /**
     * 设置translationsList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomRecordTranslationsList }
     *     
     */
    public void setTranslationsList(CustomRecordTranslationsList value) {
        this.translationsList = value;
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
     * 获取usePermissions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsePermissions() {
        return usePermissions;
    }

    /**
     * 设置usePermissions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsePermissions(Boolean value) {
        this.usePermissions = value;
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
     * 获取enablEmailMerge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnablEmailMerge() {
        return enablEmailMerge;
    }

    /**
     * 设置enablEmailMerge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnablEmailMerge(Boolean value) {
        this.enablEmailMerge = value;
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
     * 获取allowInlineEditing属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowInlineEditing() {
        return allowInlineEditing;
    }

    /**
     * 设置allowInlineEditing属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowInlineEditing(Boolean value) {
        this.allowInlineEditing = value;
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
