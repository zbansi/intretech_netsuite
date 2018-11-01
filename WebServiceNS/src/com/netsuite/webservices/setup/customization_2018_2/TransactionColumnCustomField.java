
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
 * <p>TransactionColumnCustomField complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="TransactionColumnCustomField">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:customization_2018_2.setup.webservices.netsuite.com}CustomFieldType">
 *       &lt;sequence>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="owner" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="selectRecordType" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="storeValue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="insertBefore" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="availableToSso" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="displayType" type="{urn:types.customization_2018_2.setup.webservices.netsuite.com}CustomizationDisplayType" minOccurs="0"/>
 *         &lt;element name="displayWidth" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="displayHeight" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="help" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="linkText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isMandatory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="maxLength" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="minValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="maxValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="defaultChecked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="defaultValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isFormula" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="defaultSelection" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="dynamicDefault" type="{urn:types.customization_2018_2.setup.webservices.netsuite.com}CustomizationDynamicDefault" minOccurs="0"/>
 *         &lt;element name="sourceList" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="sourceFrom" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="sourceFilterBy" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="colExpense" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="colPurchase" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="colSale" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="colOpportunity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="colStore" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="colStoreHidden" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="colJournal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="colBuild" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="colExpenseReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="colTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="colTransferOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="colTimeGroup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="colItemReceipt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="colItemReceiptOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="colItemFulfillment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="colItemFulfillmentOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="colPrintFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="colPickingTicket" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="colPackingSlip" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="colReturnForm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="colStoreWithGroups" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="colGroupOnInvoices" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="colKitItem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="filterList" type="{urn:customization_2018_2.setup.webservices.netsuite.com}TransactionColumnCustomFieldFilterList" minOccurs="0"/>
 *         &lt;element name="accessLevel" type="{urn:types.customization_2018_2.setup.webservices.netsuite.com}CustomizationAccessLevel" minOccurs="0"/>
 *         &lt;element name="searchLevel" type="{urn:types.customization_2018_2.setup.webservices.netsuite.com}CustomizationSearchLevel" minOccurs="0"/>
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
@XmlType(name = "TransactionColumnCustomField", propOrder = {
    "label",
    "owner",
    "description",
    "selectRecordType",
    "storeValue",
    "insertBefore",
    "availableToSso",
    "displayType",
    "displayWidth",
    "displayHeight",
    "help",
    "linkText",
    "isMandatory",
    "maxLength",
    "minValue",
    "maxValue",
    "defaultChecked",
    "defaultValue",
    "isFormula",
    "defaultSelection",
    "dynamicDefault",
    "sourceList",
    "sourceFrom",
    "sourceFilterBy",
    "colExpense",
    "colPurchase",
    "colSale",
    "colOpportunity",
    "colStore",
    "colStoreHidden",
    "colJournal",
    "colBuild",
    "colExpenseReport",
    "colTime",
    "colTransferOrder",
    "colTimeGroup",
    "colItemReceipt",
    "colItemReceiptOrder",
    "colItemFulfillment",
    "colItemFulfillmentOrder",
    "colPrintFlag",
    "colPickingTicket",
    "colPackingSlip",
    "colReturnForm",
    "colStoreWithGroups",
    "colGroupOnInvoices",
    "colKitItem",
    "filterList",
    "accessLevel",
    "searchLevel",
    "roleAccessList",
    "deptAccessList",
    "subAccessList",
    "translationsList"
})
public class TransactionColumnCustomField
    extends CustomFieldType
{

    protected String label;
    protected RecordRef owner;
    protected String description;
    protected RecordRef selectRecordType;
    protected Boolean storeValue;
    protected RecordRef insertBefore;
    protected Boolean availableToSso;
    @XmlSchemaType(name = "string")
    protected CustomizationDisplayType displayType;
    protected Long displayWidth;
    protected Long displayHeight;
    protected String help;
    protected String linkText;
    protected Boolean isMandatory;
    protected Long maxLength;
    protected Double minValue;
    protected Double maxValue;
    protected Boolean defaultChecked;
    protected String defaultValue;
    protected Boolean isFormula;
    protected RecordRef defaultSelection;
    @XmlSchemaType(name = "string")
    protected CustomizationDynamicDefault dynamicDefault;
    protected RecordRef sourceList;
    protected RecordRef sourceFrom;
    protected RecordRef sourceFilterBy;
    protected Boolean colExpense;
    protected Boolean colPurchase;
    protected Boolean colSale;
    protected Boolean colOpportunity;
    protected Boolean colStore;
    protected Boolean colStoreHidden;
    protected Boolean colJournal;
    protected Boolean colBuild;
    protected Boolean colExpenseReport;
    protected Boolean colTime;
    protected Boolean colTransferOrder;
    protected Boolean colTimeGroup;
    protected Boolean colItemReceipt;
    protected Boolean colItemReceiptOrder;
    protected Boolean colItemFulfillment;
    protected Boolean colItemFulfillmentOrder;
    protected Boolean colPrintFlag;
    protected Boolean colPickingTicket;
    protected Boolean colPackingSlip;
    protected Boolean colReturnForm;
    protected Boolean colStoreWithGroups;
    protected Boolean colGroupOnInvoices;
    protected Boolean colKitItem;
    protected TransactionColumnCustomFieldFilterList filterList;
    @XmlSchemaType(name = "string")
    protected CustomizationAccessLevel accessLevel;
    @XmlSchemaType(name = "string")
    protected CustomizationSearchLevel searchLevel;
    protected CustomFieldRoleAccessList roleAccessList;
    protected CustomFieldDepartmentAccessList deptAccessList;
    protected CustomFieldSubAccessList subAccessList;
    protected CustomFieldTranslationsList translationsList;
    @XmlAttribute(name = "internalId")
    protected String internalId;

    /**
     * ��ȡlabel���Ե�ֵ��
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
     * ����label���Ե�ֵ��
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
     * ��ȡselectRecordType���Ե�ֵ��
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
     * ����selectRecordType���Ե�ֵ��
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
     * ��ȡstoreValue���Ե�ֵ��
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
     * ����storeValue���Ե�ֵ��
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
     * ��ȡinsertBefore���Ե�ֵ��
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
     * ����insertBefore���Ե�ֵ��
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
     * ��ȡavailableToSso���Ե�ֵ��
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
     * ����availableToSso���Ե�ֵ��
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
     * ��ȡdisplayType���Ե�ֵ��
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
     * ����displayType���Ե�ֵ��
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
     * ��ȡdisplayWidth���Ե�ֵ��
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
     * ����displayWidth���Ե�ֵ��
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
     * ��ȡdisplayHeight���Ե�ֵ��
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
     * ����displayHeight���Ե�ֵ��
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
     * ��ȡhelp���Ե�ֵ��
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
     * ����help���Ե�ֵ��
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
     * ��ȡlinkText���Ե�ֵ��
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
     * ����linkText���Ե�ֵ��
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
     * ��ȡisMandatory���Ե�ֵ��
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
     * ����isMandatory���Ե�ֵ��
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
     * ��ȡmaxLength���Ե�ֵ��
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
     * ����maxLength���Ե�ֵ��
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
     * ��ȡminValue���Ե�ֵ��
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
     * ����minValue���Ե�ֵ��
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
     * ��ȡmaxValue���Ե�ֵ��
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
     * ����maxValue���Ե�ֵ��
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
     * ��ȡdefaultChecked���Ե�ֵ��
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
     * ����defaultChecked���Ե�ֵ��
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
     * ��ȡdefaultValue���Ե�ֵ��
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
     * ����defaultValue���Ե�ֵ��
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
     * ��ȡisFormula���Ե�ֵ��
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
     * ����isFormula���Ե�ֵ��
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
     * ��ȡdefaultSelection���Ե�ֵ��
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
     * ����defaultSelection���Ե�ֵ��
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
     * ��ȡdynamicDefault���Ե�ֵ��
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
     * ����dynamicDefault���Ե�ֵ��
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
     * ��ȡsourceList���Ե�ֵ��
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
     * ����sourceList���Ե�ֵ��
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
     * ��ȡsourceFrom���Ե�ֵ��
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
     * ����sourceFrom���Ե�ֵ��
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
     * ��ȡsourceFilterBy���Ե�ֵ��
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
     * ����sourceFilterBy���Ե�ֵ��
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
     * ��ȡcolExpense���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isColExpense() {
        return colExpense;
    }

    /**
     * ����colExpense���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setColExpense(Boolean value) {
        this.colExpense = value;
    }

    /**
     * ��ȡcolPurchase���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isColPurchase() {
        return colPurchase;
    }

    /**
     * ����colPurchase���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setColPurchase(Boolean value) {
        this.colPurchase = value;
    }

    /**
     * ��ȡcolSale���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isColSale() {
        return colSale;
    }

    /**
     * ����colSale���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setColSale(Boolean value) {
        this.colSale = value;
    }

    /**
     * ��ȡcolOpportunity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isColOpportunity() {
        return colOpportunity;
    }

    /**
     * ����colOpportunity���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setColOpportunity(Boolean value) {
        this.colOpportunity = value;
    }

    /**
     * ��ȡcolStore���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isColStore() {
        return colStore;
    }

    /**
     * ����colStore���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setColStore(Boolean value) {
        this.colStore = value;
    }

    /**
     * ��ȡcolStoreHidden���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isColStoreHidden() {
        return colStoreHidden;
    }

    /**
     * ����colStoreHidden���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setColStoreHidden(Boolean value) {
        this.colStoreHidden = value;
    }

    /**
     * ��ȡcolJournal���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isColJournal() {
        return colJournal;
    }

    /**
     * ����colJournal���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setColJournal(Boolean value) {
        this.colJournal = value;
    }

    /**
     * ��ȡcolBuild���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isColBuild() {
        return colBuild;
    }

    /**
     * ����colBuild���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setColBuild(Boolean value) {
        this.colBuild = value;
    }

    /**
     * ��ȡcolExpenseReport���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isColExpenseReport() {
        return colExpenseReport;
    }

    /**
     * ����colExpenseReport���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setColExpenseReport(Boolean value) {
        this.colExpenseReport = value;
    }

    /**
     * ��ȡcolTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isColTime() {
        return colTime;
    }

    /**
     * ����colTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setColTime(Boolean value) {
        this.colTime = value;
    }

    /**
     * ��ȡcolTransferOrder���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isColTransferOrder() {
        return colTransferOrder;
    }

    /**
     * ����colTransferOrder���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setColTransferOrder(Boolean value) {
        this.colTransferOrder = value;
    }

    /**
     * ��ȡcolTimeGroup���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isColTimeGroup() {
        return colTimeGroup;
    }

    /**
     * ����colTimeGroup���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setColTimeGroup(Boolean value) {
        this.colTimeGroup = value;
    }

    /**
     * ��ȡcolItemReceipt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isColItemReceipt() {
        return colItemReceipt;
    }

    /**
     * ����colItemReceipt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setColItemReceipt(Boolean value) {
        this.colItemReceipt = value;
    }

    /**
     * ��ȡcolItemReceiptOrder���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isColItemReceiptOrder() {
        return colItemReceiptOrder;
    }

    /**
     * ����colItemReceiptOrder���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setColItemReceiptOrder(Boolean value) {
        this.colItemReceiptOrder = value;
    }

    /**
     * ��ȡcolItemFulfillment���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isColItemFulfillment() {
        return colItemFulfillment;
    }

    /**
     * ����colItemFulfillment���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setColItemFulfillment(Boolean value) {
        this.colItemFulfillment = value;
    }

    /**
     * ��ȡcolItemFulfillmentOrder���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isColItemFulfillmentOrder() {
        return colItemFulfillmentOrder;
    }

    /**
     * ����colItemFulfillmentOrder���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setColItemFulfillmentOrder(Boolean value) {
        this.colItemFulfillmentOrder = value;
    }

    /**
     * ��ȡcolPrintFlag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isColPrintFlag() {
        return colPrintFlag;
    }

    /**
     * ����colPrintFlag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setColPrintFlag(Boolean value) {
        this.colPrintFlag = value;
    }

    /**
     * ��ȡcolPickingTicket���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isColPickingTicket() {
        return colPickingTicket;
    }

    /**
     * ����colPickingTicket���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setColPickingTicket(Boolean value) {
        this.colPickingTicket = value;
    }

    /**
     * ��ȡcolPackingSlip���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isColPackingSlip() {
        return colPackingSlip;
    }

    /**
     * ����colPackingSlip���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setColPackingSlip(Boolean value) {
        this.colPackingSlip = value;
    }

    /**
     * ��ȡcolReturnForm���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isColReturnForm() {
        return colReturnForm;
    }

    /**
     * ����colReturnForm���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setColReturnForm(Boolean value) {
        this.colReturnForm = value;
    }

    /**
     * ��ȡcolStoreWithGroups���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isColStoreWithGroups() {
        return colStoreWithGroups;
    }

    /**
     * ����colStoreWithGroups���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setColStoreWithGroups(Boolean value) {
        this.colStoreWithGroups = value;
    }

    /**
     * ��ȡcolGroupOnInvoices���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isColGroupOnInvoices() {
        return colGroupOnInvoices;
    }

    /**
     * ����colGroupOnInvoices���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setColGroupOnInvoices(Boolean value) {
        this.colGroupOnInvoices = value;
    }

    /**
     * ��ȡcolKitItem���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isColKitItem() {
        return colKitItem;
    }

    /**
     * ����colKitItem���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setColKitItem(Boolean value) {
        this.colKitItem = value;
    }

    /**
     * ��ȡfilterList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TransactionColumnCustomFieldFilterList }
     *     
     */
    public TransactionColumnCustomFieldFilterList getFilterList() {
        return filterList;
    }

    /**
     * ����filterList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionColumnCustomFieldFilterList }
     *     
     */
    public void setFilterList(TransactionColumnCustomFieldFilterList value) {
        this.filterList = value;
    }

    /**
     * ��ȡaccessLevel���Ե�ֵ��
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
     * ����accessLevel���Ե�ֵ��
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
     * ��ȡsearchLevel���Ե�ֵ��
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
     * ����searchLevel���Ե�ֵ��
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
     * ��ȡroleAccessList���Ե�ֵ��
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
     * ����roleAccessList���Ե�ֵ��
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
     * ��ȡdeptAccessList���Ե�ֵ��
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
     * ����deptAccessList���Ե�ֵ��
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
     * ��ȡsubAccessList���Ե�ֵ��
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
     * ����subAccessList���Ե�ֵ��
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
     * ��ȡtranslationsList���Ե�ֵ��
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
     * ����translationsList���Ե�ֵ��
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
