
package com.netsuite.webservices.setup.customization_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;
import com.netsuite.webservices.setup.customization_2018_2.types.CustomizationAccessLevel;
import com.netsuite.webservices.setup.customization_2018_2.types.CustomizationDisplayType;
import com.netsuite.webservices.setup.customization_2018_2.types.CustomizationDynamicDefault;
import com.netsuite.webservices.setup.customization_2018_2.types.CustomizationSearchLevel;


/**
 * <p>EntityCustomField complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="EntityCustomField">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:customization_2018_2.setup.webservices.netsuite.com}CustomFieldType">
 *       &lt;sequence>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="owner" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="selectRecordType" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="storeValue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showInList" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="globalSearch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isParent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="insertBefore" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="availableToSso" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="subtab" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="displayType" type="{urn:types.customization_2018_2.setup.webservices.netsuite.com}CustomizationDisplayType" minOccurs="0"/>
 *         &lt;element name="displayWidth" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="displayHeight" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="help" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentSubtab" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="linkText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isMandatory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="checkSpelling" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="maxLength" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="minValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="maxValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="defaultChecked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="defaultValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isFormula" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="defaultSelection" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="dynamicDefault" type="{urn:types.customization_2018_2.setup.webservices.netsuite.com}CustomizationDynamicDefault" minOccurs="0"/>
 *         &lt;element name="searchDefault" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="searchCompareField" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="sourceList" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="sourceFrom" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="sourceFilterBy" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="appliesToCustomer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="appliesToProject" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="appliesToVendor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="appliesToEmployee" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="appliesToOtherName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="appliesToContact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="appliesToPartner" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="appliesToWebSite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="appliesToGroup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="availableExternally" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="filterList" type="{urn:customization_2018_2.setup.webservices.netsuite.com}EntityCustomFieldFilterList" minOccurs="0"/>
 *         &lt;element name="accessLevel" type="{urn:types.customization_2018_2.setup.webservices.netsuite.com}CustomizationAccessLevel" minOccurs="0"/>
 *         &lt;element name="appliesToStatement" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="searchLevel" type="{urn:types.customization_2018_2.setup.webservices.netsuite.com}CustomizationSearchLevel" minOccurs="0"/>
 *         &lt;element name="appliesToPriceList" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="roleAccessList" type="{urn:customization_2018_2.setup.webservices.netsuite.com}CustomFieldRoleAccessList" minOccurs="0"/>
 *         &lt;element name="deptAccessList" type="{urn:customization_2018_2.setup.webservices.netsuite.com}CustomFieldDepartmentAccessList" minOccurs="0"/>
 *         &lt;element name="subAccessList" type="{urn:customization_2018_2.setup.webservices.netsuite.com}CustomFieldSubAccessList" minOccurs="0"/>
 *         &lt;element name="translationsList" type="{urn:customization_2018_2.setup.webservices.netsuite.com}CustomFieldTranslationsList" minOccurs="0"/>
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
@XmlType(name = "EntityCustomField", propOrder = {
    "label",
    "owner",
    "description",
    "selectRecordType",
    "storeValue",
    "showInList",
    "globalSearch",
    "isParent",
    "insertBefore",
    "availableToSso",
    "subtab",
    "displayType",
    "displayWidth",
    "displayHeight",
    "help",
    "parentSubtab",
    "linkText",
    "isMandatory",
    "checkSpelling",
    "maxLength",
    "minValue",
    "maxValue",
    "defaultChecked",
    "defaultValue",
    "isFormula",
    "defaultSelection",
    "dynamicDefault",
    "searchDefault",
    "searchCompareField",
    "sourceList",
    "sourceFrom",
    "sourceFilterBy",
    "appliesToCustomer",
    "appliesToProject",
    "appliesToVendor",
    "appliesToEmployee",
    "appliesToOtherName",
    "appliesToContact",
    "appliesToPartner",
    "appliesToWebSite",
    "appliesToGroup",
    "availableExternally",
    "filterList",
    "accessLevel",
    "appliesToStatement",
    "searchLevel",
    "appliesToPriceList",
    "roleAccessList",
    "deptAccessList",
    "subAccessList",
    "translationsList"
})
public class EntityCustomField
    extends CustomFieldType
{

    protected String label;
    protected RecordRef owner;
    protected String description;
    protected RecordRef selectRecordType;
    protected Boolean storeValue;
    protected Boolean showInList;
    protected Boolean globalSearch;
    protected Boolean isParent;
    protected RecordRef insertBefore;
    protected Boolean availableToSso;
    protected RecordRef subtab;
    @XmlSchemaType(name = "string")
    protected CustomizationDisplayType displayType;
    protected Long displayWidth;
    protected Long displayHeight;
    protected String help;
    protected RecordRef parentSubtab;
    protected String linkText;
    protected Boolean isMandatory;
    protected Boolean checkSpelling;
    protected Long maxLength;
    protected Double minValue;
    protected Double maxValue;
    protected Boolean defaultChecked;
    protected String defaultValue;
    protected Boolean isFormula;
    protected RecordRef defaultSelection;
    @XmlSchemaType(name = "string")
    protected CustomizationDynamicDefault dynamicDefault;
    protected RecordRef searchDefault;
    protected RecordRef searchCompareField;
    protected RecordRef sourceList;
    protected RecordRef sourceFrom;
    protected RecordRef sourceFilterBy;
    protected Boolean appliesToCustomer;
    protected Boolean appliesToProject;
    protected Boolean appliesToVendor;
    protected Boolean appliesToEmployee;
    protected Boolean appliesToOtherName;
    protected Boolean appliesToContact;
    protected Boolean appliesToPartner;
    protected Boolean appliesToWebSite;
    protected Boolean appliesToGroup;
    protected Boolean availableExternally;
    protected EntityCustomFieldFilterList filterList;
    @XmlSchemaType(name = "string")
    protected CustomizationAccessLevel accessLevel;
    protected Boolean appliesToStatement;
    @XmlSchemaType(name = "string")
    protected CustomizationSearchLevel searchLevel;
    protected Boolean appliesToPriceList;
    protected CustomFieldRoleAccessList roleAccessList;
    protected CustomFieldDepartmentAccessList deptAccessList;
    protected CustomFieldSubAccessList subAccessList;
    protected CustomFieldTranslationsList translationsList;
    @XmlAttribute(name = "internalId")
    protected String internalId;

    /**
     * 获取label属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * 设置label属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
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
     * 获取selectRecordType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSelectRecordType() {
        return selectRecordType;
    }

    /**
     * 设置selectRecordType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSelectRecordType(RecordRef value) {
        this.selectRecordType = value;
    }

    /**
     * 获取storeValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStoreValue() {
        return storeValue;
    }

    /**
     * 设置storeValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStoreValue(Boolean value) {
        this.storeValue = value;
    }

    /**
     * 获取showInList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowInList() {
        return showInList;
    }

    /**
     * 设置showInList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowInList(Boolean value) {
        this.showInList = value;
    }

    /**
     * 获取globalSearch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGlobalSearch() {
        return globalSearch;
    }

    /**
     * 设置globalSearch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGlobalSearch(Boolean value) {
        this.globalSearch = value;
    }

    /**
     * 获取isParent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsParent() {
        return isParent;
    }

    /**
     * 设置isParent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsParent(Boolean value) {
        this.isParent = value;
    }

    /**
     * 获取insertBefore属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getInsertBefore() {
        return insertBefore;
    }

    /**
     * 设置insertBefore属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setInsertBefore(RecordRef value) {
        this.insertBefore = value;
    }

    /**
     * 获取availableToSso属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAvailableToSso() {
        return availableToSso;
    }

    /**
     * 设置availableToSso属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAvailableToSso(Boolean value) {
        this.availableToSso = value;
    }

    /**
     * 获取subtab属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSubtab() {
        return subtab;
    }

    /**
     * 设置subtab属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSubtab(RecordRef value) {
        this.subtab = value;
    }

    /**
     * 获取displayType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomizationDisplayType }
     *     
     */
    public CustomizationDisplayType getDisplayType() {
        return displayType;
    }

    /**
     * 设置displayType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizationDisplayType }
     *     
     */
    public void setDisplayType(CustomizationDisplayType value) {
        this.displayType = value;
    }

    /**
     * 获取displayWidth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDisplayWidth() {
        return displayWidth;
    }

    /**
     * 设置displayWidth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDisplayWidth(Long value) {
        this.displayWidth = value;
    }

    /**
     * 获取displayHeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDisplayHeight() {
        return displayHeight;
    }

    /**
     * 设置displayHeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDisplayHeight(Long value) {
        this.displayHeight = value;
    }

    /**
     * 获取help属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHelp() {
        return help;
    }

    /**
     * 设置help属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHelp(String value) {
        this.help = value;
    }

    /**
     * 获取parentSubtab属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getParentSubtab() {
        return parentSubtab;
    }

    /**
     * 设置parentSubtab属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setParentSubtab(RecordRef value) {
        this.parentSubtab = value;
    }

    /**
     * 获取linkText属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkText() {
        return linkText;
    }

    /**
     * 设置linkText属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkText(String value) {
        this.linkText = value;
    }

    /**
     * 获取isMandatory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMandatory() {
        return isMandatory;
    }

    /**
     * 设置isMandatory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMandatory(Boolean value) {
        this.isMandatory = value;
    }

    /**
     * 获取checkSpelling属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckSpelling() {
        return checkSpelling;
    }

    /**
     * 设置checkSpelling属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckSpelling(Boolean value) {
        this.checkSpelling = value;
    }

    /**
     * 获取maxLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxLength() {
        return maxLength;
    }

    /**
     * 设置maxLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxLength(Long value) {
        this.maxLength = value;
    }

    /**
     * 获取minValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinValue() {
        return minValue;
    }

    /**
     * 设置minValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinValue(Double value) {
        this.minValue = value;
    }

    /**
     * 获取maxValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxValue() {
        return maxValue;
    }

    /**
     * 设置maxValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxValue(Double value) {
        this.maxValue = value;
    }

    /**
     * 获取defaultChecked属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultChecked() {
        return defaultChecked;
    }

    /**
     * 设置defaultChecked属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultChecked(Boolean value) {
        this.defaultChecked = value;
    }

    /**
     * 获取defaultValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * 设置defaultValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultValue(String value) {
        this.defaultValue = value;
    }

    /**
     * 获取isFormula属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFormula() {
        return isFormula;
    }

    /**
     * 设置isFormula属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFormula(Boolean value) {
        this.isFormula = value;
    }

    /**
     * 获取defaultSelection属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getDefaultSelection() {
        return defaultSelection;
    }

    /**
     * 设置defaultSelection属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setDefaultSelection(RecordRef value) {
        this.defaultSelection = value;
    }

    /**
     * 获取dynamicDefault属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomizationDynamicDefault }
     *     
     */
    public CustomizationDynamicDefault getDynamicDefault() {
        return dynamicDefault;
    }

    /**
     * 设置dynamicDefault属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizationDynamicDefault }
     *     
     */
    public void setDynamicDefault(CustomizationDynamicDefault value) {
        this.dynamicDefault = value;
    }

    /**
     * 获取searchDefault属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSearchDefault() {
        return searchDefault;
    }

    /**
     * 设置searchDefault属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSearchDefault(RecordRef value) {
        this.searchDefault = value;
    }

    /**
     * 获取searchCompareField属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSearchCompareField() {
        return searchCompareField;
    }

    /**
     * 设置searchCompareField属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSearchCompareField(RecordRef value) {
        this.searchCompareField = value;
    }

    /**
     * 获取sourceList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSourceList() {
        return sourceList;
    }

    /**
     * 设置sourceList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSourceList(RecordRef value) {
        this.sourceList = value;
    }

    /**
     * 获取sourceFrom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSourceFrom() {
        return sourceFrom;
    }

    /**
     * 设置sourceFrom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSourceFrom(RecordRef value) {
        this.sourceFrom = value;
    }

    /**
     * 获取sourceFilterBy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSourceFilterBy() {
        return sourceFilterBy;
    }

    /**
     * 设置sourceFilterBy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSourceFilterBy(RecordRef value) {
        this.sourceFilterBy = value;
    }

    /**
     * 获取appliesToCustomer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAppliesToCustomer() {
        return appliesToCustomer;
    }

    /**
     * 设置appliesToCustomer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAppliesToCustomer(Boolean value) {
        this.appliesToCustomer = value;
    }

    /**
     * 获取appliesToProject属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAppliesToProject() {
        return appliesToProject;
    }

    /**
     * 设置appliesToProject属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAppliesToProject(Boolean value) {
        this.appliesToProject = value;
    }

    /**
     * 获取appliesToVendor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAppliesToVendor() {
        return appliesToVendor;
    }

    /**
     * 设置appliesToVendor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAppliesToVendor(Boolean value) {
        this.appliesToVendor = value;
    }

    /**
     * 获取appliesToEmployee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAppliesToEmployee() {
        return appliesToEmployee;
    }

    /**
     * 设置appliesToEmployee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAppliesToEmployee(Boolean value) {
        this.appliesToEmployee = value;
    }

    /**
     * 获取appliesToOtherName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAppliesToOtherName() {
        return appliesToOtherName;
    }

    /**
     * 设置appliesToOtherName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAppliesToOtherName(Boolean value) {
        this.appliesToOtherName = value;
    }

    /**
     * 获取appliesToContact属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAppliesToContact() {
        return appliesToContact;
    }

    /**
     * 设置appliesToContact属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAppliesToContact(Boolean value) {
        this.appliesToContact = value;
    }

    /**
     * 获取appliesToPartner属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAppliesToPartner() {
        return appliesToPartner;
    }

    /**
     * 设置appliesToPartner属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAppliesToPartner(Boolean value) {
        this.appliesToPartner = value;
    }

    /**
     * 获取appliesToWebSite属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAppliesToWebSite() {
        return appliesToWebSite;
    }

    /**
     * 设置appliesToWebSite属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAppliesToWebSite(Boolean value) {
        this.appliesToWebSite = value;
    }

    /**
     * 获取appliesToGroup属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAppliesToGroup() {
        return appliesToGroup;
    }

    /**
     * 设置appliesToGroup属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAppliesToGroup(Boolean value) {
        this.appliesToGroup = value;
    }

    /**
     * 获取availableExternally属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAvailableExternally() {
        return availableExternally;
    }

    /**
     * 设置availableExternally属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAvailableExternally(Boolean value) {
        this.availableExternally = value;
    }

    /**
     * 获取filterList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EntityCustomFieldFilterList }
     *     
     */
    public EntityCustomFieldFilterList getFilterList() {
        return filterList;
    }

    /**
     * 设置filterList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EntityCustomFieldFilterList }
     *     
     */
    public void setFilterList(EntityCustomFieldFilterList value) {
        this.filterList = value;
    }

    /**
     * 获取accessLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomizationAccessLevel }
     *     
     */
    public CustomizationAccessLevel getAccessLevel() {
        return accessLevel;
    }

    /**
     * 设置accessLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizationAccessLevel }
     *     
     */
    public void setAccessLevel(CustomizationAccessLevel value) {
        this.accessLevel = value;
    }

    /**
     * 获取appliesToStatement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAppliesToStatement() {
        return appliesToStatement;
    }

    /**
     * 设置appliesToStatement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAppliesToStatement(Boolean value) {
        this.appliesToStatement = value;
    }

    /**
     * 获取searchLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomizationSearchLevel }
     *     
     */
    public CustomizationSearchLevel getSearchLevel() {
        return searchLevel;
    }

    /**
     * 设置searchLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizationSearchLevel }
     *     
     */
    public void setSearchLevel(CustomizationSearchLevel value) {
        this.searchLevel = value;
    }

    /**
     * 获取appliesToPriceList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAppliesToPriceList() {
        return appliesToPriceList;
    }

    /**
     * 设置appliesToPriceList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAppliesToPriceList(Boolean value) {
        this.appliesToPriceList = value;
    }

    /**
     * 获取roleAccessList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomFieldRoleAccessList }
     *     
     */
    public CustomFieldRoleAccessList getRoleAccessList() {
        return roleAccessList;
    }

    /**
     * 设置roleAccessList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFieldRoleAccessList }
     *     
     */
    public void setRoleAccessList(CustomFieldRoleAccessList value) {
        this.roleAccessList = value;
    }

    /**
     * 获取deptAccessList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomFieldDepartmentAccessList }
     *     
     */
    public CustomFieldDepartmentAccessList getDeptAccessList() {
        return deptAccessList;
    }

    /**
     * 设置deptAccessList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFieldDepartmentAccessList }
     *     
     */
    public void setDeptAccessList(CustomFieldDepartmentAccessList value) {
        this.deptAccessList = value;
    }

    /**
     * 获取subAccessList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomFieldSubAccessList }
     *     
     */
    public CustomFieldSubAccessList getSubAccessList() {
        return subAccessList;
    }

    /**
     * 设置subAccessList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFieldSubAccessList }
     *     
     */
    public void setSubAccessList(CustomFieldSubAccessList value) {
        this.subAccessList = value;
    }

    /**
     * 获取translationsList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomFieldTranslationsList }
     *     
     */
    public CustomFieldTranslationsList getTranslationsList() {
        return translationsList;
    }

    /**
     * 设置translationsList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFieldTranslationsList }
     *     
     */
    public void setTranslationsList(CustomFieldTranslationsList value) {
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

}
