
package com.netsuite.webservices.platform.common_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.SearchCustomFieldList;
import com.netsuite.webservices.platform.core_2018_2.SearchDateField;
import com.netsuite.webservices.platform.core_2018_2.SearchDoubleField;
import com.netsuite.webservices.platform.core_2018_2.SearchEnumMultiSelectField;
import com.netsuite.webservices.platform.core_2018_2.SearchLongField;
import com.netsuite.webservices.platform.core_2018_2.SearchMultiSelectField;
import com.netsuite.webservices.platform.core_2018_2.SearchRecordBasic;
import com.netsuite.webservices.platform.core_2018_2.SearchStringField;


/**
 * <p>InboundShipmentSearchBasic complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="InboundShipmentSearchBasic">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRecordBasic">
 *       &lt;sequence>
 *         &lt;element name="actualDeliveryDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="actualShippingDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="billOfLading" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="currency" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="description" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="expectedDeliveryDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="expectedRate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="expectedShippingDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="externalDocumentNumber" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="externalId" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="externalIdString" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="incoterm" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="internalId" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="internalIdNumber" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="item" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="memo" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="poAmount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="poRate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="purchaseOrder" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="quantityBilled" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="quantityExpected" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="quantityReceived" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="quantityRemaining" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="receivingLocation" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="shipmentNumber" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="status" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="unit" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="vendor" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="vesselNumber" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="customFieldList" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchCustomFieldList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InboundShipmentSearchBasic", propOrder = {
    "actualDeliveryDate",
    "actualShippingDate",
    "billOfLading",
    "createdDate",
    "currency",
    "description",
    "expectedDeliveryDate",
    "expectedRate",
    "expectedShippingDate",
    "externalDocumentNumber",
    "externalId",
    "externalIdString",
    "incoterm",
    "internalId",
    "internalIdNumber",
    "item",
    "memo",
    "poAmount",
    "poRate",
    "purchaseOrder",
    "quantityBilled",
    "quantityExpected",
    "quantityReceived",
    "quantityRemaining",
    "receivingLocation",
    "shipmentNumber",
    "status",
    "unit",
    "vendor",
    "vesselNumber",
    "customFieldList"
})
public class InboundShipmentSearchBasic
    extends SearchRecordBasic
{

    protected SearchDateField actualDeliveryDate;
    protected SearchDateField actualShippingDate;
    protected SearchStringField billOfLading;
    protected SearchDateField createdDate;
    protected SearchMultiSelectField currency;
    protected SearchStringField description;
    protected SearchDateField expectedDeliveryDate;
    protected SearchDoubleField expectedRate;
    protected SearchDateField expectedShippingDate;
    protected SearchMultiSelectField externalDocumentNumber;
    protected SearchMultiSelectField externalId;
    protected SearchStringField externalIdString;
    protected SearchMultiSelectField incoterm;
    protected SearchMultiSelectField internalId;
    protected SearchLongField internalIdNumber;
    protected SearchMultiSelectField item;
    protected SearchStringField memo;
    protected SearchDoubleField poAmount;
    protected SearchDoubleField poRate;
    protected SearchMultiSelectField purchaseOrder;
    protected SearchDoubleField quantityBilled;
    protected SearchDoubleField quantityExpected;
    protected SearchDoubleField quantityReceived;
    protected SearchDoubleField quantityRemaining;
    protected SearchMultiSelectField receivingLocation;
    protected SearchMultiSelectField shipmentNumber;
    protected SearchEnumMultiSelectField status;
    protected SearchMultiSelectField unit;
    protected SearchMultiSelectField vendor;
    protected SearchStringField vesselNumber;
    protected SearchCustomFieldList customFieldList;

    /**
     * 获取actualDeliveryDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getActualDeliveryDate() {
        return actualDeliveryDate;
    }

    /**
     * 设置actualDeliveryDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setActualDeliveryDate(SearchDateField value) {
        this.actualDeliveryDate = value;
    }

    /**
     * 获取actualShippingDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getActualShippingDate() {
        return actualShippingDate;
    }

    /**
     * 设置actualShippingDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setActualShippingDate(SearchDateField value) {
        this.actualShippingDate = value;
    }

    /**
     * 获取billOfLading属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getBillOfLading() {
        return billOfLading;
    }

    /**
     * 设置billOfLading属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setBillOfLading(SearchStringField value) {
        this.billOfLading = value;
    }

    /**
     * 获取createdDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getCreatedDate() {
        return createdDate;
    }

    /**
     * 设置createdDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setCreatedDate(SearchDateField value) {
        this.createdDate = value;
    }

    /**
     * 获取currency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getCurrency() {
        return currency;
    }

    /**
     * 设置currency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setCurrency(SearchMultiSelectField value) {
        this.currency = value;
    }

    /**
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setDescription(SearchStringField value) {
        this.description = value;
    }

    /**
     * 获取expectedDeliveryDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getExpectedDeliveryDate() {
        return expectedDeliveryDate;
    }

    /**
     * 设置expectedDeliveryDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setExpectedDeliveryDate(SearchDateField value) {
        this.expectedDeliveryDate = value;
    }

    /**
     * 获取expectedRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getExpectedRate() {
        return expectedRate;
    }

    /**
     * 设置expectedRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setExpectedRate(SearchDoubleField value) {
        this.expectedRate = value;
    }

    /**
     * 获取expectedShippingDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getExpectedShippingDate() {
        return expectedShippingDate;
    }

    /**
     * 设置expectedShippingDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setExpectedShippingDate(SearchDateField value) {
        this.expectedShippingDate = value;
    }

    /**
     * 获取externalDocumentNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getExternalDocumentNumber() {
        return externalDocumentNumber;
    }

    /**
     * 设置externalDocumentNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setExternalDocumentNumber(SearchMultiSelectField value) {
        this.externalDocumentNumber = value;
    }

    /**
     * 获取externalId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getExternalId() {
        return externalId;
    }

    /**
     * 设置externalId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setExternalId(SearchMultiSelectField value) {
        this.externalId = value;
    }

    /**
     * 获取externalIdString属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getExternalIdString() {
        return externalIdString;
    }

    /**
     * 设置externalIdString属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setExternalIdString(SearchStringField value) {
        this.externalIdString = value;
    }

    /**
     * 获取incoterm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getIncoterm() {
        return incoterm;
    }

    /**
     * 设置incoterm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setIncoterm(SearchMultiSelectField value) {
        this.incoterm = value;
    }

    /**
     * 获取internalId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getInternalId() {
        return internalId;
    }

    /**
     * 设置internalId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setInternalId(SearchMultiSelectField value) {
        this.internalId = value;
    }

    /**
     * 获取internalIdNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }

    /**
     * 设置internalIdNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setInternalIdNumber(SearchLongField value) {
        this.internalIdNumber = value;
    }

    /**
     * 获取item属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getItem() {
        return item;
    }

    /**
     * 设置item属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setItem(SearchMultiSelectField value) {
        this.item = value;
    }

    /**
     * 获取memo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getMemo() {
        return memo;
    }

    /**
     * 设置memo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setMemo(SearchStringField value) {
        this.memo = value;
    }

    /**
     * 获取poAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getPoAmount() {
        return poAmount;
    }

    /**
     * 设置poAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setPoAmount(SearchDoubleField value) {
        this.poAmount = value;
    }

    /**
     * 获取poRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getPoRate() {
        return poRate;
    }

    /**
     * 设置poRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setPoRate(SearchDoubleField value) {
        this.poRate = value;
    }

    /**
     * 获取purchaseOrder属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getPurchaseOrder() {
        return purchaseOrder;
    }

    /**
     * 设置purchaseOrder属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setPurchaseOrder(SearchMultiSelectField value) {
        this.purchaseOrder = value;
    }

    /**
     * 获取quantityBilled属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getQuantityBilled() {
        return quantityBilled;
    }

    /**
     * 设置quantityBilled属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setQuantityBilled(SearchDoubleField value) {
        this.quantityBilled = value;
    }

    /**
     * 获取quantityExpected属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getQuantityExpected() {
        return quantityExpected;
    }

    /**
     * 设置quantityExpected属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setQuantityExpected(SearchDoubleField value) {
        this.quantityExpected = value;
    }

    /**
     * 获取quantityReceived属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getQuantityReceived() {
        return quantityReceived;
    }

    /**
     * 设置quantityReceived属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setQuantityReceived(SearchDoubleField value) {
        this.quantityReceived = value;
    }

    /**
     * 获取quantityRemaining属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getQuantityRemaining() {
        return quantityRemaining;
    }

    /**
     * 设置quantityRemaining属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setQuantityRemaining(SearchDoubleField value) {
        this.quantityRemaining = value;
    }

    /**
     * 获取receivingLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getReceivingLocation() {
        return receivingLocation;
    }

    /**
     * 设置receivingLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setReceivingLocation(SearchMultiSelectField value) {
        this.receivingLocation = value;
    }

    /**
     * 获取shipmentNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getShipmentNumber() {
        return shipmentNumber;
    }

    /**
     * 设置shipmentNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setShipmentNumber(SearchMultiSelectField value) {
        this.shipmentNumber = value;
    }

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setStatus(SearchEnumMultiSelectField value) {
        this.status = value;
    }

    /**
     * 获取unit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getUnit() {
        return unit;
    }

    /**
     * 设置unit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setUnit(SearchMultiSelectField value) {
        this.unit = value;
    }

    /**
     * 获取vendor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getVendor() {
        return vendor;
    }

    /**
     * 设置vendor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setVendor(SearchMultiSelectField value) {
        this.vendor = value;
    }

    /**
     * 获取vesselNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getVesselNumber() {
        return vesselNumber;
    }

    /**
     * 设置vesselNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setVesselNumber(SearchStringField value) {
        this.vesselNumber = value;
    }

    /**
     * 获取customFieldList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchCustomFieldList }
     *     
     */
    public SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }

    /**
     * 设置customFieldList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCustomFieldList }
     *     
     */
    public void setCustomFieldList(SearchCustomFieldList value) {
        this.customFieldList = value;
    }

}
