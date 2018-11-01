
package com.netsuite.webservices.lists.accounting_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.lists.accounting_2018_2.types.BillingScheduleRecurrenceRecurrenceUnits;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;


/**
 * <p>BillingScheduleRecurrence complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="BillingScheduleRecurrence">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recurrenceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="units" type="{urn:types.accounting_2018_2.lists.webservices.netsuite.com}BillingScheduleRecurrenceRecurrenceUnits" minOccurs="0"/>
 *         &lt;element name="relativeToPrevious" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="recurrenceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="paymentTerms" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingScheduleRecurrence", propOrder = {
    "recurrenceId",
    "count",
    "units",
    "relativeToPrevious",
    "recurrenceDate",
    "amount",
    "paymentTerms"
})
public class BillingScheduleRecurrence {

    protected Long recurrenceId;
    protected Long count;
    @XmlSchemaType(name = "string")
    protected BillingScheduleRecurrenceRecurrenceUnits units;
    protected Boolean relativeToPrevious;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar recurrenceDate;
    protected Double amount;
    protected RecordRef paymentTerms;

    /**
     * ��ȡrecurrenceId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecurrenceId() {
        return recurrenceId;
    }

    /**
     * ����recurrenceId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecurrenceId(Long value) {
        this.recurrenceId = value;
    }

    /**
     * ��ȡcount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCount() {
        return count;
    }

    /**
     * ����count���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCount(Long value) {
        this.count = value;
    }

    /**
     * ��ȡunits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BillingScheduleRecurrenceRecurrenceUnits }
     *     
     */
    public BillingScheduleRecurrenceRecurrenceUnits getUnits() {
        return units;
    }

    /**
     * ����units���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BillingScheduleRecurrenceRecurrenceUnits }
     *     
     */
    public void setUnits(BillingScheduleRecurrenceRecurrenceUnits value) {
        this.units = value;
    }

    /**
     * ��ȡrelativeToPrevious���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRelativeToPrevious() {
        return relativeToPrevious;
    }

    /**
     * ����relativeToPrevious���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRelativeToPrevious(Boolean value) {
        this.relativeToPrevious = value;
    }

    /**
     * ��ȡrecurrenceDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecurrenceDate() {
        return recurrenceDate;
    }

    /**
     * ����recurrenceDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecurrenceDate(XMLGregorianCalendar value) {
        this.recurrenceDate = value;
    }

    /**
     * ��ȡamount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * ����amount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmount(Double value) {
        this.amount = value;
    }

    /**
     * ��ȡpaymentTerms���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPaymentTerms() {
        return paymentTerms;
    }

    /**
     * ����paymentTerms���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPaymentTerms(RecordRef value) {
        this.paymentTerms = value;
    }

}
