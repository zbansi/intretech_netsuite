
package com.netsuite.webservices.transactions.purchases_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;


/**
 * <p>InboundShipmentItems complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="InboundShipmentItems">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="purchaseOrder" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="shipmentItem" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="shipmentItemDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="poVendor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receivingLocation" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="quantityReceived" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="quantityExpected" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="quantityRemaining" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="unit" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="poRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="expectedRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="shipmentItemAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="poCurrency" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="incoterm" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InboundShipmentItems", propOrder = {
    "id",
    "purchaseOrder",
    "shipmentItem",
    "shipmentItemDescription",
    "poVendor",
    "receivingLocation",
    "quantityReceived",
    "quantityExpected",
    "quantityRemaining",
    "unit",
    "poRate",
    "expectedRate",
    "shipmentItemAmount",
    "poCurrency",
    "incoterm"
})
public class InboundShipmentItems {

    protected Long id;
    protected RecordRef purchaseOrder;
    protected RecordRef shipmentItem;
    protected String shipmentItemDescription;
    protected String poVendor;
    protected RecordRef receivingLocation;
    protected Double quantityReceived;
    protected Double quantityExpected;
    protected Double quantityRemaining;
    protected RecordRef unit;
    protected Double poRate;
    protected Double expectedRate;
    protected Double shipmentItemAmount;
    protected RecordRef poCurrency;
    protected RecordRef incoterm;

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * 获取purchaseOrder属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPurchaseOrder() {
        return purchaseOrder;
    }

    /**
     * 设置purchaseOrder属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPurchaseOrder(RecordRef value) {
        this.purchaseOrder = value;
    }

    /**
     * 获取shipmentItem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getShipmentItem() {
        return shipmentItem;
    }

    /**
     * 设置shipmentItem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setShipmentItem(RecordRef value) {
        this.shipmentItem = value;
    }

    /**
     * 获取shipmentItemDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentItemDescription() {
        return shipmentItemDescription;
    }

    /**
     * 设置shipmentItemDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentItemDescription(String value) {
        this.shipmentItemDescription = value;
    }

    /**
     * 获取poVendor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoVendor() {
        return poVendor;
    }

    /**
     * 设置poVendor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoVendor(String value) {
        this.poVendor = value;
    }

    /**
     * 获取receivingLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getReceivingLocation() {
        return receivingLocation;
    }

    /**
     * 设置receivingLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setReceivingLocation(RecordRef value) {
        this.receivingLocation = value;
    }

    /**
     * 获取quantityReceived属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantityReceived() {
        return quantityReceived;
    }

    /**
     * 设置quantityReceived属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantityReceived(Double value) {
        this.quantityReceived = value;
    }

    /**
     * 获取quantityExpected属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantityExpected() {
        return quantityExpected;
    }

    /**
     * 设置quantityExpected属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantityExpected(Double value) {
        this.quantityExpected = value;
    }

    /**
     * 获取quantityRemaining属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantityRemaining() {
        return quantityRemaining;
    }

    /**
     * 设置quantityRemaining属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantityRemaining(Double value) {
        this.quantityRemaining = value;
    }

    /**
     * 获取unit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getUnit() {
        return unit;
    }

    /**
     * 设置unit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setUnit(RecordRef value) {
        this.unit = value;
    }

    /**
     * 获取poRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPoRate() {
        return poRate;
    }

    /**
     * 设置poRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPoRate(Double value) {
        this.poRate = value;
    }

    /**
     * 获取expectedRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExpectedRate() {
        return expectedRate;
    }

    /**
     * 设置expectedRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExpectedRate(Double value) {
        this.expectedRate = value;
    }

    /**
     * 获取shipmentItemAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getShipmentItemAmount() {
        return shipmentItemAmount;
    }

    /**
     * 设置shipmentItemAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setShipmentItemAmount(Double value) {
        this.shipmentItemAmount = value;
    }

    /**
     * 获取poCurrency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPoCurrency() {
        return poCurrency;
    }

    /**
     * 设置poCurrency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPoCurrency(RecordRef value) {
        this.poCurrency = value;
    }

    /**
     * 获取incoterm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getIncoterm() {
        return incoterm;
    }

    /**
     * 设置incoterm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setIncoterm(RecordRef value) {
        this.incoterm = value;
    }

}
