
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
 * <p>BillingSchedule complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取scheduleType属性的值。
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
     * 设置scheduleType属性的值。
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
     * 获取name属性的值。
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
     * 设置name属性的值。
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
     * 获取recurrencePattern属性的值。
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
     * 设置recurrencePattern属性的值。
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
     * 获取project属性的值。
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
     * 设置project属性的值。
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
     * 获取initialAmount属性的值。
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
     * 设置initialAmount属性的值。
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
     * 获取initialTerms属性的值。
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
     * 设置initialTerms属性的值。
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
     * 获取frequency属性的值。
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
     * 设置frequency属性的值。
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
     * 获取recurrenceDowMaskList属性的值。
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
     * 设置recurrenceDowMaskList属性的值。
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
     * 获取yearMode属性的值。
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
     * 设置yearMode属性的值。
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
     * 获取yearDowim属性的值。
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
     * 设置yearDowim属性的值。
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
     * 获取yearDow属性的值。
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
     * 设置yearDow属性的值。
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
     * 获取yearDowimMonth属性的值。
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
     * 设置yearDowimMonth属性的值。
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
     * 获取yearMonth属性的值。
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
     * 设置yearMonth属性的值。
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
     * 获取yearDom属性的值。
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
     * 设置yearDom属性的值。
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
     * 获取monthMode属性的值。
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
     * 设置monthMode属性的值。
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
     * 获取monthDowim属性的值。
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
     * 设置monthDowim属性的值。
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
     * 获取monthDow属性的值。
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
     * 设置monthDow属性的值。
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
     * 获取monthDom属性的值。
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
     * 设置monthDom属性的值。
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
     * 获取dayPeriod属性的值。
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
     * 设置dayPeriod属性的值。
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
     * 获取repeatEvery属性的值。
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
     * 设置repeatEvery属性的值。
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
     * 获取billForActuals属性的值。
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
     * 设置billForActuals属性的值。
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
     * 获取numberRemaining属性的值。
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
     * 设置numberRemaining属性的值。
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
     * 获取inArrears属性的值。
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
     * 设置inArrears属性的值。
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
     * 获取recurrenceTerms属性的值。
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
     * 设置recurrenceTerms属性的值。
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
     * 获取isPublic属性的值。
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
     * 设置isPublic属性的值。
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
     * 获取applyToSubtotal属性的值。
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
     * 设置applyToSubtotal属性的值。
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
     * 获取transaction属性的值。
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
     * 设置transaction属性的值。
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
     * 获取isInactive属性的值。
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
     * 设置isInactive属性的值。
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
     * 获取seriesStartDate属性的值。
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
     * 设置seriesStartDate属性的值。
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
     * 获取recurrenceList属性的值。
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
     * 设置recurrenceList属性的值。
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
     * 获取milestoneList属性的值。
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
     * 设置milestoneList属性的值。
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
