
package com.netsuite.webservices.transactions.inventory_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.platform.common_2018_2.InventoryDetail;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;


/**
 * <p>InventoryAdjustmentInventory complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="InventoryAdjustmentInventory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="item" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="line" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="inventoryDetail" type="{urn:common_2018_2.platform.webservices.netsuite.com}InventoryDetail" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="department" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="class" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="location" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="units" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="quantityOnHand" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="currentValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="adjustQtyBy" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="binNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serialNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="unitCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="foreignCurrencyUnitCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="exchangeRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryAdjustmentInventory", propOrder = {
    "item",
    "line",
    "inventoryDetail",
    "description",
    "department",
    "clazz",
    "location",
    "units",
    "quantityOnHand",
    "currentValue",
    "adjustQtyBy",
    "binNumbers",
    "serialNumbers",
    "newQuantity",
    "unitCost",
    "foreignCurrencyUnitCost",
    "memo",
    "currency",
    "expirationDate",
    "exchangeRate"
})
public class InventoryAdjustmentInventory {

    protected RecordRef item;
    protected Long line;
    protected InventoryDetail inventoryDetail;
    protected String description;
    protected RecordRef department;
    @XmlElement(name = "class")
    protected RecordRef clazz;
    protected RecordRef location;
    protected RecordRef units;
    protected Double quantityOnHand;
    protected Double currentValue;
    protected Double adjustQtyBy;
    protected String binNumbers;
    protected String serialNumbers;
    protected Double newQuantity;
    protected Double unitCost;
    protected Double foreignCurrencyUnitCost;
    protected String memo;
    protected String currency;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;
    protected Double exchangeRate;

    /**
     * ��ȡitem���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getItem() {
        return item;
    }

    /**
     * ����item���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setItem(RecordRef value) {
        this.item = value;
    }

    /**
     * ��ȡline���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLine() {
        return line;
    }

    /**
     * ����line���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLine(Long value) {
        this.line = value;
    }

    /**
     * ��ȡinventoryDetail���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link InventoryDetail }
     *     
     */
    public InventoryDetail getInventoryDetail() {
        return inventoryDetail;
    }

    /**
     * ����inventoryDetail���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryDetail }
     *     
     */
    public void setInventoryDetail(InventoryDetail value) {
        this.inventoryDetail = value;
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
     * ��ȡdepartment���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getDepartment() {
        return department;
    }

    /**
     * ����department���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setDepartment(RecordRef value) {
        this.department = value;
    }

    /**
     * ��ȡclazz���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getClazz() {
        return clazz;
    }

    /**
     * ����clazz���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setClazz(RecordRef value) {
        this.clazz = value;
    }

    /**
     * ��ȡlocation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getLocation() {
        return location;
    }

    /**
     * ����location���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setLocation(RecordRef value) {
        this.location = value;
    }

    /**
     * ��ȡunits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getUnits() {
        return units;
    }

    /**
     * ����units���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setUnits(RecordRef value) {
        this.units = value;
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
     * ��ȡcurrentValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCurrentValue() {
        return currentValue;
    }

    /**
     * ����currentValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCurrentValue(Double value) {
        this.currentValue = value;
    }

    /**
     * ��ȡadjustQtyBy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAdjustQtyBy() {
        return adjustQtyBy;
    }

    /**
     * ����adjustQtyBy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAdjustQtyBy(Double value) {
        this.adjustQtyBy = value;
    }

    /**
     * ��ȡbinNumbers���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinNumbers() {
        return binNumbers;
    }

    /**
     * ����binNumbers���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinNumbers(String value) {
        this.binNumbers = value;
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
     * ��ȡnewQuantity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNewQuantity() {
        return newQuantity;
    }

    /**
     * ����newQuantity���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNewQuantity(Double value) {
        this.newQuantity = value;
    }

    /**
     * ��ȡunitCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUnitCost() {
        return unitCost;
    }

    /**
     * ����unitCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUnitCost(Double value) {
        this.unitCost = value;
    }

    /**
     * ��ȡforeignCurrencyUnitCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getForeignCurrencyUnitCost() {
        return foreignCurrencyUnitCost;
    }

    /**
     * ����foreignCurrencyUnitCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setForeignCurrencyUnitCost(Double value) {
        this.foreignCurrencyUnitCost = value;
    }

    /**
     * ��ȡmemo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * ����memo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
    }

    /**
     * ��ȡcurrency���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * ����currency���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
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
     * ��ȡexchangeRate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExchangeRate() {
        return exchangeRate;
    }

    /**
     * ����exchangeRate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExchangeRate(Double value) {
        this.exchangeRate = value;
    }

}
