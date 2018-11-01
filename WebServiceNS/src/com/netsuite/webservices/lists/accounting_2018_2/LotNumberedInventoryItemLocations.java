
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
 * <p>LotNumberedInventoryItemLocations complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡlocation���Ե�ֵ��
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
     * ����location���Ե�ֵ��
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
     * ��ȡquantityOnHand���Ե�ֵ��
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
     * ����quantityOnHand���Ե�ֵ��
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
     * ��ȡonHandValueMli���Ե�ֵ��
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
     * ����onHandValueMli���Ե�ֵ��
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
     * ��ȡserialNumbers���Ե�ֵ��
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
     * ����serialNumbers���Ե�ֵ��
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
     * ��ȡexpirationDate���Ե�ֵ��
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
     * ����expirationDate���Ե�ֵ��
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
     * ��ȡaverageCostMli���Ե�ֵ��
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
     * ����averageCostMli���Ե�ֵ��
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
     * ��ȡlastPurchasePriceMli���Ե�ֵ��
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
     * ����lastPurchasePriceMli���Ե�ֵ��
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
     * ��ȡreorderPoint���Ե�ֵ��
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
     * ����reorderPoint���Ե�ֵ��
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
     * ��ȡlocationAllowStorePickup���Ե�ֵ��
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
     * ����locationAllowStorePickup���Ե�ֵ��
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
     * ��ȡlocationStorePickupBufferStock���Ե�ֵ��
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
     * ����locationStorePickupBufferStock���Ե�ֵ��
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
     * ��ȡlocationQtyAvailForStorePickup���Ե�ֵ��
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
     * ����locationQtyAvailForStorePickup���Ե�ֵ��
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
     * ��ȡpreferredStockLevel���Ե�ֵ��
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
     * ����preferredStockLevel���Ե�ֵ��
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
     * ��ȡleadTime���Ե�ֵ��
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
     * ����leadTime���Ե�ֵ��
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
     * ��ȡdefaultReturnCost���Ե�ֵ��
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
     * ����defaultReturnCost���Ե�ֵ��
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
     * ��ȡsafetyStockLevel���Ե�ֵ��
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
     * ����safetyStockLevel���Ե�ֵ��
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
     * ��ȡcost���Ե�ֵ��
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
     * ����cost���Ե�ֵ��
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
     * ��ȡinventoryCostTemplate���Ե�ֵ��
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
     * ����inventoryCostTemplate���Ե�ֵ��
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
     * ��ȡbuildTime���Ե�ֵ��
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
     * ����buildTime���Ե�ֵ��
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
     * ��ȡlastInvtCountDate���Ե�ֵ��
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
     * ����lastInvtCountDate���Ե�ֵ��
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
     * ��ȡnextInvtCountDate���Ե�ֵ��
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
     * ����nextInvtCountDate���Ե�ֵ��
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
     * ��ȡisWip���Ե�ֵ��
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
     * ����isWip���Ե�ֵ��
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
     * ��ȡinvtCountInterval���Ե�ֵ��
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
     * ����invtCountInterval���Ե�ֵ��
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
     * ��ȡinvtClassification���Ե�ֵ��
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
     * ����invtClassification���Ե�ֵ��
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
     * ��ȡcostingLotSize���Ե�ֵ��
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
     * ����costingLotSize���Ե�ֵ��
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
     * ��ȡquantityOnOrder���Ե�ֵ��
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
     * ����quantityOnOrder���Ե�ֵ��
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
     * ��ȡquantityCommitted���Ե�ֵ��
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
     * ����quantityCommitted���Ե�ֵ��
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
     * ��ȡquantityAvailable���Ե�ֵ��
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
     * ����quantityAvailable���Ե�ֵ��
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
     * ��ȡquantityBackOrdered���Ե�ֵ��
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
     * ����quantityBackOrdered���Ե�ֵ��
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
     * ��ȡlocationId���Ե�ֵ��
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
     * ����locationId���Ե�ֵ��
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
     * ��ȡlocationlookup���Ե�ֵ��
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
     * ����locationlookup���Ե�ֵ��
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
     * ��ȡlocationDisplay���Ե�ֵ��
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
     * ����locationDisplay���Ե�ֵ��
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
     * ��ȡsupplyReplenishmentMethod���Ե�ֵ��
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
     * ����supplyReplenishmentMethod���Ե�ֵ��
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
     * ��ȡalternateDemandSourceItem���Ե�ֵ��
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
     * ����alternateDemandSourceItem���Ե�ֵ��
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
     * ��ȡfixedLotSize���Ե�ֵ��
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
     * ����fixedLotSize���Ե�ֵ��
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
     * ��ȡperiodicLotSizeType���Ե�ֵ��
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
     * ����periodicLotSizeType���Ե�ֵ��
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
     * ��ȡperiodicLotSizeDays���Ե�ֵ��
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
     * ����periodicLotSizeDays���Ե�ֵ��
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
     * ��ȡsupplyType���Ե�ֵ��
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
     * ����supplyType���Ե�ֵ��
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
     * ��ȡsupplyLotSizingMethod���Ե�ֵ��
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
     * ����supplyLotSizingMethod���Ե�ֵ��
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
     * ��ȡdemandSource���Ե�ֵ��
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
     * ����demandSource���Ե�ֵ��
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
     * ��ȡbackwardConsumptionDays���Ե�ֵ��
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
     * ����backwardConsumptionDays���Ե�ֵ��
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
     * ��ȡforwardConsumptionDays���Ե�ֵ��
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
     * ����forwardConsumptionDays���Ե�ֵ��
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
     * ��ȡdemandTimeFence���Ե�ֵ��
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
     * ����demandTimeFence���Ե�ֵ��
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
     * ��ȡsupplyTimeFence���Ե�ֵ��
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
     * ����supplyTimeFence���Ե�ֵ��
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
     * ��ȡrescheduleInDays���Ե�ֵ��
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
     * ����rescheduleInDays���Ե�ֵ��
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
     * ��ȡrescheduleOutDays���Ե�ֵ��
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
     * ����rescheduleOutDays���Ե�ֵ��
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
