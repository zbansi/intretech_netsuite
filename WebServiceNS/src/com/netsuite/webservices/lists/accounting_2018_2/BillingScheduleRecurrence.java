
package com.netsuite.webservices.lists.accounting_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.lists.accounting_2018_2.types.BillingScheduleRecurrenceRecurrenceUnits;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;


/**
 * <p>BillingScheduleRecurrence complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取recurrenceId属性的值。
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
     * 设置recurrenceId属性的值。
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
     * 获取count属性的值。
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
     * 设置count属性的值。
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
     * 获取units属性的值。
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
     * 设置units属性的值。
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
     * 获取relativeToPrevious属性的值。
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
     * 设置relativeToPrevious属性的值。
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
     * 获取recurrenceDate属性的值。
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
     * 设置recurrenceDate属性的值。
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
     * 获取amount属性的值。
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
     * 设置amount属性的值。
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
     * 获取paymentTerms属性的值。
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
     * 设置paymentTerms属性的值。
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
