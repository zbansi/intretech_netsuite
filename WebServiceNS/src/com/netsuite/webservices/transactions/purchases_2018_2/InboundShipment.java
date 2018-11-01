
package com.netsuite.webservices.transactions.purchases_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.platform.core_2018_2.CustomFieldList;
import com.netsuite.webservices.platform.core_2018_2.Record;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;
import com.netsuite.webservices.transactions.purchases_2018_2.types.InboundShipmentShipmentStatus;


/**
 * <p>InboundShipment complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="InboundShipment">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}Record">
 *       &lt;sequence>
 *         &lt;element name="customForm" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="shipmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="externalDocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipmentStatus" type="{urn:types.purchases_2018_2.transactions.webservices.netsuite.com}InboundShipmentShipmentStatus" minOccurs="0"/>
 *         &lt;element name="expectedShippingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="actualShippingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="expectedDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="actualDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="shipmentMemo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vesselNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billOfLading" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemsList" type="{urn:purchases_2018_2.transactions.webservices.netsuite.com}InboundShipmentItemsList" minOccurs="0"/>
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
@XmlType(name = "InboundShipment", propOrder = {
    "customForm",
    "shipmentNumber",
    "externalDocumentNumber",
    "shipmentStatus",
    "expectedShippingDate",
    "actualShippingDate",
    "expectedDeliveryDate",
    "actualDeliveryDate",
    "shipmentMemo",
    "vesselNumber",
    "billOfLading",
    "itemsList",
    "customFieldList"
})
public class InboundShipment
    extends Record
{

    protected RecordRef customForm;
    protected String shipmentNumber;
    protected String externalDocumentNumber;
    @XmlSchemaType(name = "string")
    protected InboundShipmentShipmentStatus shipmentStatus;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expectedShippingDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualShippingDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expectedDeliveryDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualDeliveryDate;
    protected String shipmentMemo;
    protected String vesselNumber;
    protected String billOfLading;
    protected InboundShipmentItemsList itemsList;
    protected CustomFieldList customFieldList;
    @XmlAttribute(name = "internalId")
    protected String internalId;
    @XmlAttribute(name = "externalId")
    protected String externalId;

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
     * 获取shipmentNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentNumber() {
        return shipmentNumber;
    }

    /**
     * 设置shipmentNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentNumber(String value) {
        this.shipmentNumber = value;
    }

    /**
     * 获取externalDocumentNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalDocumentNumber() {
        return externalDocumentNumber;
    }

    /**
     * 设置externalDocumentNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalDocumentNumber(String value) {
        this.externalDocumentNumber = value;
    }

    /**
     * 获取shipmentStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InboundShipmentShipmentStatus }
     *     
     */
    public InboundShipmentShipmentStatus getShipmentStatus() {
        return shipmentStatus;
    }

    /**
     * 设置shipmentStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InboundShipmentShipmentStatus }
     *     
     */
    public void setShipmentStatus(InboundShipmentShipmentStatus value) {
        this.shipmentStatus = value;
    }

    /**
     * 获取expectedShippingDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedShippingDate() {
        return expectedShippingDate;
    }

    /**
     * 设置expectedShippingDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedShippingDate(XMLGregorianCalendar value) {
        this.expectedShippingDate = value;
    }

    /**
     * 获取actualShippingDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualShippingDate() {
        return actualShippingDate;
    }

    /**
     * 设置actualShippingDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualShippingDate(XMLGregorianCalendar value) {
        this.actualShippingDate = value;
    }

    /**
     * 获取expectedDeliveryDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedDeliveryDate() {
        return expectedDeliveryDate;
    }

    /**
     * 设置expectedDeliveryDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedDeliveryDate(XMLGregorianCalendar value) {
        this.expectedDeliveryDate = value;
    }

    /**
     * 获取actualDeliveryDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualDeliveryDate() {
        return actualDeliveryDate;
    }

    /**
     * 设置actualDeliveryDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualDeliveryDate(XMLGregorianCalendar value) {
        this.actualDeliveryDate = value;
    }

    /**
     * 获取shipmentMemo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentMemo() {
        return shipmentMemo;
    }

    /**
     * 设置shipmentMemo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentMemo(String value) {
        this.shipmentMemo = value;
    }

    /**
     * 获取vesselNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVesselNumber() {
        return vesselNumber;
    }

    /**
     * 设置vesselNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVesselNumber(String value) {
        this.vesselNumber = value;
    }

    /**
     * 获取billOfLading属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillOfLading() {
        return billOfLading;
    }

    /**
     * 设置billOfLading属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillOfLading(String value) {
        this.billOfLading = value;
    }

    /**
     * 获取itemsList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InboundShipmentItemsList }
     *     
     */
    public InboundShipmentItemsList getItemsList() {
        return itemsList;
    }

    /**
     * 设置itemsList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InboundShipmentItemsList }
     *     
     */
    public void setItemsList(InboundShipmentItemsList value) {
        this.itemsList = value;
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
