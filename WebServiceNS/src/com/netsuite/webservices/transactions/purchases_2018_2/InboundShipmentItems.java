
package com.netsuite.webservices.transactions.purchases_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;


/**
 * <p>InboundShipmentItems complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡid���Ե�ֵ��
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
     * ����id���Ե�ֵ��
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
     * ��ȡpurchaseOrder���Ե�ֵ��
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
     * ����purchaseOrder���Ե�ֵ��
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
     * ��ȡshipmentItem���Ե�ֵ��
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
     * ����shipmentItem���Ե�ֵ��
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
     * ��ȡshipmentItemDescription���Ե�ֵ��
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
     * ����shipmentItemDescription���Ե�ֵ��
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
     * ��ȡpoVendor���Ե�ֵ��
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
     * ����poVendor���Ե�ֵ��
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
     * ��ȡreceivingLocation���Ե�ֵ��
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
     * ����receivingLocation���Ե�ֵ��
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
     * ��ȡquantityReceived���Ե�ֵ��
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
     * ����quantityReceived���Ե�ֵ��
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
     * ��ȡquantityExpected���Ե�ֵ��
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
     * ����quantityExpected���Ե�ֵ��
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
     * ��ȡquantityRemaining���Ե�ֵ��
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
     * ����quantityRemaining���Ե�ֵ��
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
     * ��ȡunit���Ե�ֵ��
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
     * ����unit���Ե�ֵ��
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
     * ��ȡpoRate���Ե�ֵ��
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
     * ����poRate���Ե�ֵ��
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
     * ��ȡexpectedRate���Ե�ֵ��
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
     * ����expectedRate���Ե�ֵ��
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
     * ��ȡshipmentItemAmount���Ե�ֵ��
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
     * ����shipmentItemAmount���Ե�ֵ��
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
     * ��ȡpoCurrency���Ե�ֵ��
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
     * ����poCurrency���Ե�ֵ��
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
     * ��ȡincoterm���Ե�ֵ��
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
     * ����incoterm���Ե�ֵ��
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
