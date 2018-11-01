
package com.netsuite.webservices.lists.accounting_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.platform.core_2018_2.Record;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;


/**
 * <p>AccountingPeriod complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AccountingPeriod">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}Record">
 *       &lt;sequence>
 *         &lt;element name="periodName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parent" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fiscalCalendar" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="closedOnDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="isAdjust" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fiscalCalendarsList" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}AccountingPeriodFiscalCalendarsList" minOccurs="0"/>
 *         &lt;element name="isQuarter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isYear" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="closed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="apLocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="arLocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="payrollLocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="allLocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="allowNonGLChanges" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="internalId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountingPeriod", propOrder = {
    "periodName",
    "parent",
    "startDate",
    "endDate",
    "fiscalCalendar",
    "closedOnDate",
    "isAdjust",
    "fiscalCalendarsList",
    "isQuarter",
    "isYear",
    "closed",
    "apLocked",
    "arLocked",
    "payrollLocked",
    "allLocked",
    "allowNonGLChanges"
})
public class AccountingPeriod
    extends Record
{

    protected String periodName;
    protected RecordRef parent;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected RecordRef fiscalCalendar;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar closedOnDate;
    protected Boolean isAdjust;
    protected AccountingPeriodFiscalCalendarsList fiscalCalendarsList;
    protected Boolean isQuarter;
    protected Boolean isYear;
    protected Boolean closed;
    protected Boolean apLocked;
    protected Boolean arLocked;
    protected Boolean payrollLocked;
    protected Boolean allLocked;
    protected Boolean allowNonGLChanges;
    @XmlAttribute(name = "internalId")
    protected String internalId;

    /**
     * ��ȡperiodName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodName() {
        return periodName;
    }

    /**
     * ����periodName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodName(String value) {
        this.periodName = value;
    }

    /**
     * ��ȡparent���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getParent() {
        return parent;
    }

    /**
     * ����parent���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setParent(RecordRef value) {
        this.parent = value;
    }

    /**
     * ��ȡstartDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * ����startDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * ��ȡendDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * ����endDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * ��ȡfiscalCalendar���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getFiscalCalendar() {
        return fiscalCalendar;
    }

    /**
     * ����fiscalCalendar���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setFiscalCalendar(RecordRef value) {
        this.fiscalCalendar = value;
    }

    /**
     * ��ȡclosedOnDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClosedOnDate() {
        return closedOnDate;
    }

    /**
     * ����closedOnDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClosedOnDate(XMLGregorianCalendar value) {
        this.closedOnDate = value;
    }

    /**
     * ��ȡisAdjust���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAdjust() {
        return isAdjust;
    }

    /**
     * ����isAdjust���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAdjust(Boolean value) {
        this.isAdjust = value;
    }

    /**
     * ��ȡfiscalCalendarsList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AccountingPeriodFiscalCalendarsList }
     *     
     */
    public AccountingPeriodFiscalCalendarsList getFiscalCalendarsList() {
        return fiscalCalendarsList;
    }

    /**
     * ����fiscalCalendarsList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingPeriodFiscalCalendarsList }
     *     
     */
    public void setFiscalCalendarsList(AccountingPeriodFiscalCalendarsList value) {
        this.fiscalCalendarsList = value;
    }

    /**
     * ��ȡisQuarter���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsQuarter() {
        return isQuarter;
    }

    /**
     * ����isQuarter���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsQuarter(Boolean value) {
        this.isQuarter = value;
    }

    /**
     * ��ȡisYear���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsYear() {
        return isYear;
    }

    /**
     * ����isYear���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsYear(Boolean value) {
        this.isYear = value;
    }

    /**
     * ��ȡclosed���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClosed() {
        return closed;
    }

    /**
     * ����closed���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClosed(Boolean value) {
        this.closed = value;
    }

    /**
     * ��ȡapLocked���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApLocked() {
        return apLocked;
    }

    /**
     * ����apLocked���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApLocked(Boolean value) {
        this.apLocked = value;
    }

    /**
     * ��ȡarLocked���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isArLocked() {
        return arLocked;
    }

    /**
     * ����arLocked���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArLocked(Boolean value) {
        this.arLocked = value;
    }

    /**
     * ��ȡpayrollLocked���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPayrollLocked() {
        return payrollLocked;
    }

    /**
     * ����payrollLocked���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPayrollLocked(Boolean value) {
        this.payrollLocked = value;
    }

    /**
     * ��ȡallLocked���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllLocked() {
        return allLocked;
    }

    /**
     * ����allLocked���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllLocked(Boolean value) {
        this.allLocked = value;
    }

    /**
     * ��ȡallowNonGLChanges���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowNonGLChanges() {
        return allowNonGLChanges;
    }

    /**
     * ����allowNonGLChanges���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowNonGLChanges(Boolean value) {
        this.allowNonGLChanges = value;
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

}
