
package com.netsuite.webservices.lists.accounting_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.lists.accounting_2018_2.types.BillingScheduleFrequency;
import com.netsuite.webservices.lists.accounting_2018_2.types.BillingScheduleMonthDow;
import com.netsuite.webservices.lists.accounting_2018_2.types.BillingScheduleMonthDowim;
import com.netsuite.webservices.lists.accounting_2018_2.types.BillingScheduleRecurrenceMode;
import com.netsuite.webservices.lists.accounting_2018_2.types.BillingScheduleRecurrencePattern;
import com.netsuite.webservices.lists.accounting_2018_2.types.BillingScheduleType;
import com.netsuite.webservices.lists.accounting_2018_2.types.BillingScheduleYearDow;
import com.netsuite.webservices.lists.accounting_2018_2.types.BillingScheduleYearDowim;
import com.netsuite.webservices.lists.accounting_2018_2.types.BillingScheduleYearDowimMonth;
import com.netsuite.webservices.lists.accounting_2018_2.types.BillingScheduleYearMonth;
import com.netsuite.webservices.platform.common_2018_2.RecurrenceDowMaskList;
import com.netsuite.webservices.platform.core_2018_2.Record;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;


/**
 * <p>BillingSchedule complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="BillingSchedule">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}Record">
 *       &lt;sequence>
 *         &lt;element name="scheduleType" type="{urn:types.accounting_2018_2.lists.webservices.netsuite.com}BillingScheduleType" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recurrencePattern" type="{urn:types.accounting_2018_2.lists.webservices.netsuite.com}BillingScheduleRecurrencePattern" minOccurs="0"/>
 *         &lt;element name="project" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="initialAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="initialTerms" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="frequency" type="{urn:types.accounting_2018_2.lists.webservices.netsuite.com}BillingScheduleFrequency" minOccurs="0"/>
 *         &lt;element name="recurrenceDowMaskList" type="{urn:common_2018_2.platform.webservices.netsuite.com}RecurrenceDowMaskList" minOccurs="0"/>
 *         &lt;element name="yearMode" type="{urn:types.accounting_2018_2.lists.webservices.netsuite.com}BillingScheduleRecurrenceMode" minOccurs="0"/>
 *         &lt;element name="yearDowim" type="{urn:types.accounting_2018_2.lists.webservices.netsuite.com}BillingScheduleYearDowim" minOccurs="0"/>
 *         &lt;element name="yearDow" type="{urn:types.accounting_2018_2.lists.webservices.netsuite.com}BillingScheduleYearDow" minOccurs="0"/>
 *         &lt;element name="yearDowimMonth" type="{urn:types.accounting_2018_2.lists.webservices.netsuite.com}BillingScheduleYearDowimMonth" minOccurs="0"/>
 *         &lt;element name="yearMonth" type="{urn:types.accounting_2018_2.lists.webservices.netsuite.com}BillingScheduleYearMonth" minOccurs="0"/>
 *         &lt;element name="yearDom" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="monthMode" type="{urn:types.accounting_2018_2.lists.webservices.netsuite.com}BillingScheduleRecurrenceMode" minOccurs="0"/>
 *         &lt;element name="monthDowim" type="{urn:types.accounting_2018_2.lists.webservices.netsuite.com}BillingScheduleMonthDowim" minOccurs="0"/>
 *         &lt;element name="monthDow" type="{urn:types.accounting_2018_2.lists.webservices.netsuite.com}BillingScheduleMonthDow" minOccurs="0"/>
 *         &lt;element name="monthDom" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="dayPeriod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="repeatEvery" type="{urn:types.accounting_2018_2.lists.webservices.netsuite.com}BillingScheduleRepeatEvery" minOccurs="0"/>
 *         &lt;element name="billForActuals" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="numberRemaining" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="inArrears" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="recurrenceTerms" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="isPublic" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="applyToSubtotal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="transaction" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="isInactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="seriesStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="recurrenceList" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}BillingScheduleRecurrenceList" minOccurs="0"/>
 *         &lt;element name="milestoneList" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}BillingScheduleMilestoneList" minOccurs="0"/>
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
@XmlType(name = "BillingSchedule", propOrder = {
    "scheduleType",
    "name",
    "recurrencePattern",
    "project",
    "initialAmount",
    "initialTerms",
    "frequency",
    "recurrenceDowMaskList",
    "yearMode",
    "yearDowim",
    "yearDow",
    "yearDowimMonth",
    "yearMonth",
    "yearDom",
    "monthMode",
    "monthDowim",
    "monthDow",
    "monthDom",
    "dayPeriod",
    "repeatEvery",
    "billForActuals",
    "numberRemaining",
    "inArrears",
    "recurrenceTerms",
    "isPublic",
    "applyToSubtotal",
    "transaction",
    "isInactive",
    "seriesStartDate",
    "recurrenceList",
    "milestoneList"
})
public class BillingSchedule
    extends Record
{

    @XmlSchemaType(name = "string")
    protected BillingScheduleType scheduleType;
    protected String name;
    @XmlSchemaType(name = "string")
    protected BillingScheduleRecurrencePattern recurrencePattern;
    protected RecordRef project;
    protected String initialAmount;
    protected RecordRef initialTerms;
    @XmlSchemaType(name = "string")
    protected BillingScheduleFrequency frequency;
    protected RecurrenceDowMaskList recurrenceDowMaskList;
    @XmlSchemaType(name = "string")
    protected BillingScheduleRecurrenceMode yearMode;
    @XmlSchemaType(name = "string")
    protected BillingScheduleYearDowim yearDowim;
    @XmlSchemaType(name = "string")
    protected BillingScheduleYearDow yearDow;
    @XmlSchemaType(name = "string")
    protected BillingScheduleYearDowimMonth yearDowimMonth;
    @XmlSchemaType(name = "string")
    protected BillingScheduleYearMonth yearMonth;
    protected Long yearDom;
    @XmlSchemaType(name = "string")
    protected BillingScheduleRecurrenceMode monthMode;
    @XmlSchemaType(name = "string")
    protected BillingScheduleMonthDowim monthDowim;
    @XmlSchemaType(name = "string")
    protected BillingScheduleMonthDow monthDow;
    protected Long monthDom;
    protected Long dayPeriod;
    protected String repeatEvery;
    protected Boolean billForActuals;
    protected Long numberRemaining;
    protected Boolean inArrears;
    protected RecordRef recurrenceTerms;
    protected Boolean isPublic;
    protected Boolean applyToSubtotal;
    protected RecordRef transaction;
    protected Boolean isInactive;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar seriesStartDate;
    protected BillingScheduleRecurrenceList recurrenceList;
    protected BillingScheduleMilestoneList milestoneList;
    @XmlAttribute(name = "internalId")
    protected String internalId;
    @XmlAttribute(name = "externalId")
    protected String externalId;

    /**
     * ��ȡscheduleType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BillingScheduleType }
     *     
     */
    public BillingScheduleType getScheduleType() {
        return scheduleType;
    }

    /**
     * ����scheduleType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BillingScheduleType }
     *     
     */
    public void setScheduleType(BillingScheduleType value) {
        this.scheduleType = value;
    }

    /**
     * ��ȡname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * ����name���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * ��ȡrecurrencePattern���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BillingScheduleRecurrencePattern }
     *     
     */
    public BillingScheduleRecurrencePattern getRecurrencePattern() {
        return recurrencePattern;
    }

    /**
     * ����recurrencePattern���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BillingScheduleRecurrencePattern }
     *     
     */
    public void setRecurrencePattern(BillingScheduleRecurrencePattern value) {
        this.recurrencePattern = value;
    }

    /**
     * ��ȡproject���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getProject() {
        return project;
    }

    /**
     * ����project���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setProject(RecordRef value) {
        this.project = value;
    }

    /**
     * ��ȡinitialAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialAmount() {
        return initialAmount;
    }

    /**
     * ����initialAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialAmount(String value) {
        this.initialAmount = value;
    }

    /**
     * ��ȡinitialTerms���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getInitialTerms() {
        return initialTerms;
    }

    /**
     * ����initialTerms���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setInitialTerms(RecordRef value) {
        this.initialTerms = value;
    }

    /**
     * ��ȡfrequency���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BillingScheduleFrequency }
     *     
     */
    public BillingScheduleFrequency getFrequency() {
        return frequency;
    }

    /**
     * ����frequency���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BillingScheduleFrequency }
     *     
     */
    public void setFrequency(BillingScheduleFrequency value) {
        this.frequency = value;
    }

    /**
     * ��ȡrecurrenceDowMaskList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecurrenceDowMaskList }
     *     
     */
    public RecurrenceDowMaskList getRecurrenceDowMaskList() {
        return recurrenceDowMaskList;
    }

    /**
     * ����recurrenceDowMaskList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecurrenceDowMaskList }
     *     
     */
    public void setRecurrenceDowMaskList(RecurrenceDowMaskList value) {
        this.recurrenceDowMaskList = value;
    }

    /**
     * ��ȡyearMode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BillingScheduleRecurrenceMode }
     *     
     */
    public BillingScheduleRecurrenceMode getYearMode() {
        return yearMode;
    }

    /**
     * ����yearMode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BillingScheduleRecurrenceMode }
     *     
     */
    public void setYearMode(BillingScheduleRecurrenceMode value) {
        this.yearMode = value;
    }

    /**
     * ��ȡyearDowim���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BillingScheduleYearDowim }
     *     
     */
    public BillingScheduleYearDowim getYearDowim() {
        return yearDowim;
    }

    /**
     * ����yearDowim���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BillingScheduleYearDowim }
     *     
     */
    public void setYearDowim(BillingScheduleYearDowim value) {
        this.yearDowim = value;
    }

    /**
     * ��ȡyearDow���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BillingScheduleYearDow }
     *     
     */
    public BillingScheduleYearDow getYearDow() {
        return yearDow;
    }

    /**
     * ����yearDow���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BillingScheduleYearDow }
     *     
     */
    public void setYearDow(BillingScheduleYearDow value) {
        this.yearDow = value;
    }

    /**
     * ��ȡyearDowimMonth���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BillingScheduleYearDowimMonth }
     *     
     */
    public BillingScheduleYearDowimMonth getYearDowimMonth() {
        return yearDowimMonth;
    }

    /**
     * ����yearDowimMonth���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BillingScheduleYearDowimMonth }
     *     
     */
    public void setYearDowimMonth(BillingScheduleYearDowimMonth value) {
        this.yearDowimMonth = value;
    }

    /**
     * ��ȡyearMonth���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BillingScheduleYearMonth }
     *     
     */
    public BillingScheduleYearMonth getYearMonth() {
        return yearMonth;
    }

    /**
     * ����yearMonth���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BillingScheduleYearMonth }
     *     
     */
    public void setYearMonth(BillingScheduleYearMonth value) {
        this.yearMonth = value;
    }

    /**
     * ��ȡyearDom���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getYearDom() {
        return yearDom;
    }

    /**
     * ����yearDom���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setYearDom(Long value) {
        this.yearDom = value;
    }

    /**
     * ��ȡmonthMode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BillingScheduleRecurrenceMode }
     *     
     */
    public BillingScheduleRecurrenceMode getMonthMode() {
        return monthMode;
    }

    /**
     * ����monthMode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BillingScheduleRecurrenceMode }
     *     
     */
    public void setMonthMode(BillingScheduleRecurrenceMode value) {
        this.monthMode = value;
    }

    /**
     * ��ȡmonthDowim���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BillingScheduleMonthDowim }
     *     
     */
    public BillingScheduleMonthDowim getMonthDowim() {
        return monthDowim;
    }

    /**
     * ����monthDowim���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BillingScheduleMonthDowim }
     *     
     */
    public void setMonthDowim(BillingScheduleMonthDowim value) {
        this.monthDowim = value;
    }

    /**
     * ��ȡmonthDow���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BillingScheduleMonthDow }
     *     
     */
    public BillingScheduleMonthDow getMonthDow() {
        return monthDow;
    }

    /**
     * ����monthDow���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BillingScheduleMonthDow }
     *     
     */
    public void setMonthDow(BillingScheduleMonthDow value) {
        this.monthDow = value;
    }

    /**
     * ��ȡmonthDom���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMonthDom() {
        return monthDom;
    }

    /**
     * ����monthDom���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMonthDom(Long value) {
        this.monthDom = value;
    }

    /**
     * ��ȡdayPeriod���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDayPeriod() {
        return dayPeriod;
    }

    /**
     * ����dayPeriod���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDayPeriod(Long value) {
        this.dayPeriod = value;
    }

    /**
     * ��ȡrepeatEvery���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepeatEvery() {
        return repeatEvery;
    }

    /**
     * ����repeatEvery���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepeatEvery(String value) {
        this.repeatEvery = value;
    }

    /**
     * ��ȡbillForActuals���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBillForActuals() {
        return billForActuals;
    }

    /**
     * ����billForActuals���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBillForActuals(Boolean value) {
        this.billForActuals = value;
    }

    /**
     * ��ȡnumberRemaining���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberRemaining() {
        return numberRemaining;
    }

    /**
     * ����numberRemaining���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberRemaining(Long value) {
        this.numberRemaining = value;
    }

    /**
     * ��ȡinArrears���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInArrears() {
        return inArrears;
    }

    /**
     * ����inArrears���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInArrears(Boolean value) {
        this.inArrears = value;
    }

    /**
     * ��ȡrecurrenceTerms���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getRecurrenceTerms() {
        return recurrenceTerms;
    }

    /**
     * ����recurrenceTerms���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setRecurrenceTerms(RecordRef value) {
        this.recurrenceTerms = value;
    }

    /**
     * ��ȡisPublic���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPublic() {
        return isPublic;
    }

    /**
     * ����isPublic���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPublic(Boolean value) {
        this.isPublic = value;
    }

    /**
     * ��ȡapplyToSubtotal���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplyToSubtotal() {
        return applyToSubtotal;
    }

    /**
     * ����applyToSubtotal���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplyToSubtotal(Boolean value) {
        this.applyToSubtotal = value;
    }

    /**
     * ��ȡtransaction���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getTransaction() {
        return transaction;
    }

    /**
     * ����transaction���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setTransaction(RecordRef value) {
        this.transaction = value;
    }

    /**
     * ��ȡisInactive���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInactive() {
        return isInactive;
    }

    /**
     * ����isInactive���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInactive(Boolean value) {
        this.isInactive = value;
    }

    /**
     * ��ȡseriesStartDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSeriesStartDate() {
        return seriesStartDate;
    }

    /**
     * ����seriesStartDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSeriesStartDate(XMLGregorianCalendar value) {
        this.seriesStartDate = value;
    }

    /**
     * ��ȡrecurrenceList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BillingScheduleRecurrenceList }
     *     
     */
    public BillingScheduleRecurrenceList getRecurrenceList() {
        return recurrenceList;
    }

    /**
     * ����recurrenceList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BillingScheduleRecurrenceList }
     *     
     */
    public void setRecurrenceList(BillingScheduleRecurrenceList value) {
        this.recurrenceList = value;
    }

    /**
     * ��ȡmilestoneList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BillingScheduleMilestoneList }
     *     
     */
    public BillingScheduleMilestoneList getMilestoneList() {
        return milestoneList;
    }

    /**
     * ����milestoneList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BillingScheduleMilestoneList }
     *     
     */
    public void setMilestoneList(BillingScheduleMilestoneList value) {
        this.milestoneList = value;
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
