
package com.netsuite.webservices.lists.employees_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.lists.employees_2018_2.types.EmployeeAccruedTimeAccrualMethod;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;


/**
 * <p>EmployeeAccruedTime complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="EmployeeAccruedTime">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="payrollItem" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="accruedHours" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="accrualRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="monetaryRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="resetAccruedHoursAtYearEnd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="accrualMethod" type="{urn:types.employees_2018_2.lists.webservices.netsuite.com}EmployeeAccruedTimeAccrualMethod" minOccurs="0"/>
 *         &lt;element name="maximumAccruedHours" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="inactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeAccruedTime", propOrder = {
    "payrollItem",
    "accruedHours",
    "accrualRate",
    "monetaryRate",
    "resetAccruedHoursAtYearEnd",
    "accrualMethod",
    "maximumAccruedHours",
    "inactive",
    "effectiveDate",
    "expirationDate"
})
public class EmployeeAccruedTime {

    protected RecordRef payrollItem;
    protected Double accruedHours;
    protected Double accrualRate;
    protected Double monetaryRate;
    protected Boolean resetAccruedHoursAtYearEnd;
    @XmlSchemaType(name = "string")
    protected EmployeeAccruedTimeAccrualMethod accrualMethod;
    protected Double maximumAccruedHours;
    protected Boolean inactive;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectiveDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;

    /**
     * ��ȡpayrollItem���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPayrollItem() {
        return payrollItem;
    }

    /**
     * ����payrollItem���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPayrollItem(RecordRef value) {
        this.payrollItem = value;
    }

    /**
     * ��ȡaccruedHours���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAccruedHours() {
        return accruedHours;
    }

    /**
     * ����accruedHours���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAccruedHours(Double value) {
        this.accruedHours = value;
    }

    /**
     * ��ȡaccrualRate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAccrualRate() {
        return accrualRate;
    }

    /**
     * ����accrualRate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAccrualRate(Double value) {
        this.accrualRate = value;
    }

    /**
     * ��ȡmonetaryRate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMonetaryRate() {
        return monetaryRate;
    }

    /**
     * ����monetaryRate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMonetaryRate(Double value) {
        this.monetaryRate = value;
    }

    /**
     * ��ȡresetAccruedHoursAtYearEnd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResetAccruedHoursAtYearEnd() {
        return resetAccruedHoursAtYearEnd;
    }

    /**
     * ����resetAccruedHoursAtYearEnd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResetAccruedHoursAtYearEnd(Boolean value) {
        this.resetAccruedHoursAtYearEnd = value;
    }

    /**
     * ��ȡaccrualMethod���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link EmployeeAccruedTimeAccrualMethod }
     *     
     */
    public EmployeeAccruedTimeAccrualMethod getAccrualMethod() {
        return accrualMethod;
    }

    /**
     * ����accrualMethod���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeAccruedTimeAccrualMethod }
     *     
     */
    public void setAccrualMethod(EmployeeAccruedTimeAccrualMethod value) {
        this.accrualMethod = value;
    }

    /**
     * ��ȡmaximumAccruedHours���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaximumAccruedHours() {
        return maximumAccruedHours;
    }

    /**
     * ����maximumAccruedHours���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaximumAccruedHours(Double value) {
        this.maximumAccruedHours = value;
    }

    /**
     * ��ȡinactive���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInactive() {
        return inactive;
    }

    /**
     * ����inactive���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInactive(Boolean value) {
        this.inactive = value;
    }

    /**
     * ��ȡeffectiveDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * ����effectiveDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
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

}
