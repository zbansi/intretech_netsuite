
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
 * <p>InboundShipment complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡcustomForm���Ե�ֵ��
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
     * ����customForm���Ե�ֵ��
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
     * ��ȡshipmentNumber���Ե�ֵ��
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
     * ����shipmentNumber���Ե�ֵ��
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
     * ��ȡexternalDocumentNumber���Ե�ֵ��
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
     * ����externalDocumentNumber���Ե�ֵ��
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
     * ��ȡshipmentStatus���Ե�ֵ��
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
     * ����shipmentStatus���Ե�ֵ��
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
     * ��ȡexpectedShippingDate���Ե�ֵ��
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
     * ����expectedShippingDate���Ե�ֵ��
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
     * ��ȡactualShippingDate���Ե�ֵ��
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
     * ����actualShippingDate���Ե�ֵ��
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
     * ��ȡexpectedDeliveryDate���Ե�ֵ��
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
     * ����expectedDeliveryDate���Ե�ֵ��
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
     * ��ȡactualDeliveryDate���Ե�ֵ��
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
     * ����actualDeliveryDate���Ե�ֵ��
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
     * ��ȡshipmentMemo���Ե�ֵ��
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
     * ����shipmentMemo���Ե�ֵ��
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
     * ��ȡvesselNumber���Ե�ֵ��
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
     * ����vesselNumber���Ե�ֵ��
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
     * ��ȡbillOfLading���Ե�ֵ��
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
     * ����billOfLading���Ե�ֵ��
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
     * ��ȡitemsList���Ե�ֵ��
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
     * ����itemsList���Ե�ֵ��
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
     * ��ȡcustomFieldList���Ե�ֵ��
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
     * ����customFieldList���Ե�ֵ��
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

    /**
     * ��ȡexternalId���Ե�ֵ��
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
     * ����externalId���Ե�ֵ��
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
