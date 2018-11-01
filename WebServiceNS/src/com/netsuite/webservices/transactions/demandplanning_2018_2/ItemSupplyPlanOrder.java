
package com.netsuite.webservices.transactions.demandplanning_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;
import com.netsuite.webservices.transactions.demandplanning_2018_2.types.ItemSupplyPlanOrderType;


/**
 * <p>ItemSupplyPlanOrder complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ItemSupplyPlanOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderLineId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="orderDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="receiptDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="sourceLocation" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="orderCreated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="orderType" type="{urn:types.demandplanning_2018_2.transactions.webservices.netsuite.com}ItemSupplyPlanOrderType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemSupplyPlanOrder", propOrder = {
    "orderLineId",
    "orderDate",
    "receiptDate",
    "sourceLocation",
    "quantity",
    "orderCreated",
    "orderType"
})
public class ItemSupplyPlanOrder {

    protected Long orderLineId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar receiptDate;
    protected RecordRef sourceLocation;
    protected Double quantity;
    protected Boolean orderCreated;
    @XmlSchemaType(name = "string")
    protected ItemSupplyPlanOrderType orderType;

    /**
     * ��ȡorderLineId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrderLineId() {
        return orderLineId;
    }

    /**
     * ����orderLineId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrderLineId(Long value) {
        this.orderLineId = value;
    }

    /**
     * ��ȡorderDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderDate() {
        return orderDate;
    }

    /**
     * ����orderDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderDate(XMLGregorianCalendar value) {
        this.orderDate = value;
    }

    /**
     * ��ȡreceiptDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceiptDate() {
        return receiptDate;
    }

    /**
     * ����receiptDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceiptDate(XMLGregorianCalendar value) {
        this.receiptDate = value;
    }

    /**
     * ��ȡsourceLocation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSourceLocation() {
        return sourceLocation;
    }

    /**
     * ����sourceLocation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSourceLocation(RecordRef value) {
        this.sourceLocation = value;
    }

    /**
     * ��ȡquantity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantity() {
        return quantity;
    }

    /**
     * ����quantity���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantity(Double value) {
        this.quantity = value;
    }

    /**
     * ��ȡorderCreated���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderCreated() {
        return orderCreated;
    }

    /**
     * ����orderCreated���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderCreated(Boolean value) {
        this.orderCreated = value;
    }

    /**
     * ��ȡorderType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ItemSupplyPlanOrderType }
     *     
     */
    public ItemSupplyPlanOrderType getOrderType() {
        return orderType;
    }

    /**
     * ����orderType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSupplyPlanOrderType }
     *     
     */
    public void setOrderType(ItemSupplyPlanOrderType value) {
        this.orderType = value;
    }

}
