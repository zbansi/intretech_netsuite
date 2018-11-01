
package com.netsuite.webservices.lists.accounting_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.lists.accounting_2018_2.types.ItemInvtClassification;
import com.netsuite.webservices.lists.accounting_2018_2.types.PeriodicLotSizeType;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;


/**
 * <p>LotNumberedInventoryItemLocations complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="LotNumberedInventoryItemLocations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quantityOnHand" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="onHandValueMli" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="serialNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="averageCostMli" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="lastPurchasePriceMli" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="reorderPoint" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="locationAllowStorePickup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="locationStorePickupBufferStock" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="locationQtyAvailForStorePickup" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="preferredStockLevel" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="leadTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="defaultReturnCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="safetyStockLevel" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="inventoryCostTemplate" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="buildTime" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="lastInvtCountDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="nextInvtCountDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="isWip" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="invtCountInterval" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="invtClassification" type="{urn:types.accounting_2018_2.lists.webservices.netsuite.com}ItemInvtClassification" minOccurs="0"/>
 *         &lt;element name="costingLotSize" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="quantityOnOrder" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="quantityCommitted" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="quantityAvailable" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="quantityBackOrdered" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="locationId" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="locationlookup" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="location_display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supplyReplenishmentMethod" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="alternateDemandSourceItem" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="fixedLotSize" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="periodicLotSizeType" type="{urn:types.accounting_2018_2.lists.webservices.netsuite.com}PeriodicLotSizeType" minOccurs="0"/>
 *         &lt;element name="periodicLotSizeDays" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="supplyType" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="supplyLotSizingMethod" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="demandSource" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="backwardConsumptionDays" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="forwardConsumptionDays" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="demandTimeFence" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="supplyTimeFence" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="rescheduleInDays" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="rescheduleOutDays" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LotNumberedInventoryItemLocations", propOrder = {
    "location",
    "quantityOnHand",
    "onHandValueMli",
    "serialNumbers",
    "expirationDate",
    "averageCostMli",
    "lastPurchasePriceMli",
    "reorderPoint",
    "locationAllowStorePickup",
    "locationStorePickupBufferStock",
    "locationQtyAvailForStorePickup",
    "preferredStockLevel",
    "leadTime",
    "defaultReturnCost",
    "safetyStockLevel",
    "cost",
    "inventoryCostTemplate",
    "buildTime",
    "lastInvtCountDate",
    "nextInvtCountDate",
    "isWip",
    "invtCountInterval",
    "invtClassification",
    "costingLotSize",
    "quantityOnOrder",
    "quantityCommitted",
    "quantityAvailable",
    "quantityBackOrdered",
    "locationId",
    "locationlookup",
    "locationDisplay",
    "supplyReplenishmentMethod",
    "alternateDemandSourceItem",
    "fixedLotSize",
    "periodicLotSizeType",
    "periodicLotSizeDays",
    "supplyType",
    "supplyLotSizingMethod",
    "demandSource",
    "backwardConsumptionDays",
    "forwardConsumptionDays",
    "demandTimeFence",
    "supplyTimeFence",
    "rescheduleInDays",
    "rescheduleOutDays"
})
public class LotNumberedInventoryItemLocations {

    protected String location;
    protected Double quantityOnHand;
    protected Double onHandValueMli;
    protected String serialNumbers;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;
    protected Double averageCostMli;
    protected Double lastPurchasePriceMli;
    protected Double reorderPoint;
    protected Boolean locationAllowStorePickup;
    protected Double locationStorePickupBufferStock;
    protected Double locationQtyAvailForStorePickup;
    protected Double preferredStockLevel;
    protected Long leadTime;
    protected Double defaultReturnCost;
    protected Double safetyStockLevel;
    protected Double cost;
    protected RecordRef inventoryCostTemplate;
    protected Double buildTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastInvtCountDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextInvtCountDate;
    protected Boolean isWip;
    protected Long invtCountInterval;
    @XmlSchemaType(name = "string")
    protected ItemInvtClassification invtClassification;
    protected Double costingLotSize;
    protected Double quantityOnOrder;
    protected Double quantityCommitted;
    protected Double quantityAvailable;
    protected Double quantityBackOrdered;
    protected RecordRef locationId;
    protected RecordRef locationlookup;
    @XmlElement(name = "location_display")
    protected String locationDisplay;
    protected RecordRef supplyReplenishmentMethod;
    protected RecordRef alternateDemandSourceItem;
    protected Double fixedLotSize;
    @XmlSchemaType(name = "string")
    protected PeriodicLotSizeType periodicLotSizeType;
    protected Long periodicLotSizeDays;
    protected RecordRef supplyType;
    protected RecordRef supplyLotSizingMethod;
    protected RecordRef demandSource;
    protected Long backwardConsumptionDays;
    protected Long forwardConsumptionDays;
    protected Long demandTimeFence;
    protected Long supplyTimeFence;
    protected Long rescheduleInDays;
    protected Long rescheduleOutDays;

    /**
     * 获取location属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * 设置location属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * 获取quantityOnHand属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantityOnHand() {
        return quantityOnHand;
    }

    /**
     * 设置quantityOnHand属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantityOnHand(Double value) {
        this.quantityOnHand = value;
    }

    /**
     * 获取onHandValueMli属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOnHandValueMli() {
        return onHandValueMli;
    }

    /**
     * 设置onHandValueMli属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOnHandValueMli(Double value) {
        this.onHandValueMli = value;
    }

    /**
     * 获取serialNumbers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumbers() {
        return serialNumbers;
    }

    /**
     * 设置serialNumbers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumbers(String value) {
        this.serialNumbers = value;
    }

    /**
     * 获取expirationDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * 设置expirationDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    /**
     * 获取averageCostMli属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAverageCostMli() {
        return averageCostMli;
    }

    /**
     * 设置averageCostMli属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAverageCostMli(Double value) {
        this.averageCostMli = value;
    }

    /**
     * 获取lastPurchasePriceMli属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLastPurchasePriceMli() {
        return lastPurchasePriceMli;
    }

    /**
     * 设置lastPurchasePriceMli属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLastPurchasePriceMli(Double value) {
        this.lastPurchasePriceMli = value;
    }

    /**
     * 获取reorderPoint属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getReorderPoint() {
        return reorderPoint;
    }

    /**
     * 设置reorderPoint属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setReorderPoint(Double value) {
        this.reorderPoint = value;
    }

    /**
     * 获取locationAllowStorePickup属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocationAllowStorePickup() {
        return locationAllowStorePickup;
    }

    /**
     * 设置locationAllowStorePickup属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocationAllowStorePickup(Boolean value) {
        this.locationAllowStorePickup = value;
    }

    /**
     * 获取locationStorePickupBufferStock属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLocationStorePickupBufferStock() {
        return locationStorePickupBufferStock;
    }

    /**
     * 设置locationStorePickupBufferStock属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLocationStorePickupBufferStock(Double value) {
        this.locationStorePickupBufferStock = value;
    }

    /**
     * 获取locationQtyAvailForStorePickup属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLocationQtyAvailForStorePickup() {
        return locationQtyAvailForStorePickup;
    }

    /**
     * 设置locationQtyAvailForStorePickup属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLocationQtyAvailForStorePickup(Double value) {
        this.locationQtyAvailForStorePickup = value;
    }

    /**
     * 获取preferredStockLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPreferredStockLevel() {
        return preferredStockLevel;
    }

    /**
     * 设置preferredStockLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPreferredStockLevel(Double value) {
        this.preferredStockLevel = value;
    }

    /**
     * 获取leadTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLeadTime() {
        return leadTime;
    }

    /**
     * 设置leadTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLeadTime(Long value) {
        this.leadTime = value;
    }

    /**
     * 获取defaultReturnCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDefaultReturnCost() {
        return defaultReturnCost;
    }

    /**
     * 设置defaultReturnCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDefaultReturnCost(Double value) {
        this.defaultReturnCost = value;
    }

    /**
     * 获取safetyStockLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSafetyStockLevel() {
        return safetyStockLevel;
    }

    /**
     * 设置safetyStockLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSafetyStockLevel(Double value) {
        this.safetyStockLevel = value;
    }

    /**
     * 获取cost属性的值。
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
     * 设置cost属性的值。
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
     * 获取inventoryCostTemplate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getInventoryCostTemplate() {
        return inventoryCostTemplate;
    }

    /**
     * 设置inventoryCostTemplate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setInventoryCostTemplate(RecordRef value) {
        this.inventoryCostTemplate = value;
    }

    /**
     * 获取buildTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBuildTime() {
        return buildTime;
    }

    /**
     * 设置buildTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBuildTime(Double value) {
        this.buildTime = value;
    }

    /**
     * 获取lastInvtCountDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastInvtCountDate() {
        return lastInvtCountDate;
    }

    /**
     * 设置lastInvtCountDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastInvtCountDate(XMLGregorianCalendar value) {
        this.lastInvtCountDate = value;
    }

    /**
     * 获取nextInvtCountDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextInvtCountDate() {
        return nextInvtCountDate;
    }

    /**
     * 设置nextInvtCountDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextInvtCountDate(XMLGregorianCalendar value) {
        this.nextInvtCountDate = value;
    }

    /**
     * 获取isWip属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsWip() {
        return isWip;
    }

    /**
     * 设置isWip属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsWip(Boolean value) {
        this.isWip = value;
    }

    /**
     * 获取invtCountInterval属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInvtCountInterval() {
        return invtCountInterval;
    }

    /**
     * 设置invtCountInterval属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInvtCountInterval(Long value) {
        this.invtCountInterval = value;
    }

    /**
     * 获取invtClassification属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemInvtClassification }
     *     
     */
    public ItemInvtClassification getInvtClassification() {
        return invtClassification;
    }

    /**
     * 设置invtClassification属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemInvtClassification }
     *     
     */
    public void setInvtClassification(ItemInvtClassification value) {
        this.invtClassification = value;
    }

    /**
     * 获取costingLotSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCostingLotSize() {
        return costingLotSize;
    }

    /**
     * 设置costingLotSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCostingLotSize(Double value) {
        this.costingLotSize = value;
    }

    /**
     * 获取quantityOnOrder属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantityOnOrder() {
        return quantityOnOrder;
    }

    /**
     * 设置quantityOnOrder属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantityOnOrder(Double value) {
        this.quantityOnOrder = value;
    }

    /**
     * 获取quantityCommitted属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantityCommitted() {
        return quantityCommitted;
    }

    /**
     * 设置quantityCommitted属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantityCommitted(Double value) {
        this.quantityCommitted = value;
    }

    /**
     * 获取quantityAvailable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantityAvailable() {
        return quantityAvailable;
    }

    /**
     * 设置quantityAvailable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantityAvailable(Double value) {
        this.quantityAvailable = value;
    }

    /**
     * 获取quantityBackOrdered属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantityBackOrdered() {
        return quantityBackOrdered;
    }

    /**
     * 设置quantityBackOrdered属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantityBackOrdered(Double value) {
        this.quantityBackOrdered = value;
    }

    /**
     * 获取locationId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getLocationId() {
        return locationId;
    }

    /**
     * 设置locationId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setLocationId(RecordRef value) {
        this.locationId = value;
    }

    /**
     * 获取locationlookup属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getLocationlookup() {
        return locationlookup;
    }

    /**
     * 设置locationlookup属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setLocationlookup(RecordRef value) {
        this.locationlookup = value;
    }

    /**
     * 获取locationDisplay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationDisplay() {
        return locationDisplay;
    }

    /**
     * 设置locationDisplay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationDisplay(String value) {
        this.locationDisplay = value;
    }

    /**
     * 获取supplyReplenishmentMethod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSupplyReplenishmentMethod() {
        return supplyReplenishmentMethod;
    }

    /**
     * 设置supplyReplenishmentMethod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSupplyReplenishmentMethod(RecordRef value) {
        this.supplyReplenishmentMethod = value;
    }

    /**
     * 获取alternateDemandSourceItem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getAlternateDemandSourceItem() {
        return alternateDemandSourceItem;
    }

    /**
     * 设置alternateDemandSourceItem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setAlternateDemandSourceItem(RecordRef value) {
        this.alternateDemandSourceItem = value;
    }

    /**
     * 获取fixedLotSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFixedLotSize() {
        return fixedLotSize;
    }

    /**
     * 设置fixedLotSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFixedLotSize(Double value) {
        this.fixedLotSize = value;
    }

    /**
     * 获取periodicLotSizeType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PeriodicLotSizeType }
     *     
     */
    public PeriodicLotSizeType getPeriodicLotSizeType() {
        return periodicLotSizeType;
    }

    /**
     * 设置periodicLotSizeType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodicLotSizeType }
     *     
     */
    public void setPeriodicLotSizeType(PeriodicLotSizeType value) {
        this.periodicLotSizeType = value;
    }

    /**
     * 获取periodicLotSizeDays属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPeriodicLotSizeDays() {
        return periodicLotSizeDays;
    }

    /**
     * 设置periodicLotSizeDays属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPeriodicLotSizeDays(Long value) {
        this.periodicLotSizeDays = value;
    }

    /**
     * 获取supplyType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSupplyType() {
        return supplyType;
    }

    /**
     * 设置supplyType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSupplyType(RecordRef value) {
        this.supplyType = value;
    }

    /**
     * 获取supplyLotSizingMethod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSupplyLotSizingMethod() {
        return supplyLotSizingMethod;
    }

    /**
     * 设置supplyLotSizingMethod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSupplyLotSizingMethod(RecordRef value) {
        this.supplyLotSizingMethod = value;
    }

    /**
     * 获取demandSource属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getDemandSource() {
        return demandSource;
    }

    /**
     * 设置demandSource属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setDemandSource(RecordRef value) {
        this.demandSource = value;
    }

    /**
     * 获取backwardConsumptionDays属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBackwardConsumptionDays() {
        return backwardConsumptionDays;
    }

    /**
     * 设置backwardConsumptionDays属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBackwardConsumptionDays(Long value) {
        this.backwardConsumptionDays = value;
    }

    /**
     * 获取forwardConsumptionDays属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getForwardConsumptionDays() {
        return forwardConsumptionDays;
    }

    /**
     * 设置forwardConsumptionDays属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setForwardConsumptionDays(Long value) {
        this.forwardConsumptionDays = value;
    }

    /**
     * 获取demandTimeFence属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDemandTimeFence() {
        return demandTimeFence;
    }

    /**
     * 设置demandTimeFence属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDemandTimeFence(Long value) {
        this.demandTimeFence = value;
    }

    /**
     * 获取supplyTimeFence属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSupplyTimeFence() {
        return supplyTimeFence;
    }

    /**
     * 设置supplyTimeFence属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSupplyTimeFence(Long value) {
        this.supplyTimeFence = value;
    }

    /**
     * 获取rescheduleInDays属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRescheduleInDays() {
        return rescheduleInDays;
    }

    /**
     * 设置rescheduleInDays属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRescheduleInDays(Long value) {
        this.rescheduleInDays = value;
    }

    /**
     * 获取rescheduleOutDays属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRescheduleOutDays() {
        return rescheduleOutDays;
    }

    /**
     * 设置rescheduleOutDays属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRescheduleOutDays(Long value) {
        this.rescheduleOutDays = value;
    }

}
