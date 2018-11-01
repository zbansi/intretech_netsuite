
package com.netsuite.webservices.activities.scheduling_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.activities.scheduling_2018_2.types.CalendarEventAccessLevel;
import com.netsuite.webservices.activities.scheduling_2018_2.types.CalendarEventReminderType;
import com.netsuite.webservices.activities.scheduling_2018_2.types.CalendarEventStatus;
import com.netsuite.webservices.platform.common_2018_2.RecurrenceDowMaskList;
import com.netsuite.webservices.platform.common_2018_2.types.RecurrenceDow;
import com.netsuite.webservices.platform.common_2018_2.types.RecurrenceDowim;
import com.netsuite.webservices.platform.common_2018_2.types.RecurrenceFrequency;
import com.netsuite.webservices.platform.core_2018_2.CustomFieldList;
import com.netsuite.webservices.platform.core_2018_2.Record;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;


/**
 * <p>CalendarEvent complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CalendarEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}Record">
 *       &lt;sequence>
 *         &lt;element name="company" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="contact" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="supportCase" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="transaction" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="period" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="frequency" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}RecurrenceFrequency" minOccurs="0"/>
 *         &lt;element name="recurrenceDowMaskList" type="{urn:common_2018_2.platform.webservices.netsuite.com}RecurrenceDowMaskList" minOccurs="0"/>
 *         &lt;element name="recurrenceDow" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}RecurrenceDow" minOccurs="0"/>
 *         &lt;element name="recurrenceDowim" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}RecurrenceDowim" minOccurs="0"/>
 *         &lt;element name="seriesStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="endByDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="noEndDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sendEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="customForm" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recurrence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="allDayEvent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="timedEvent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="reminderType" type="{urn:types.scheduling_2018_2.activities.webservices.netsuite.com}CalendarEventReminderType" minOccurs="0"/>
 *         &lt;element name="reminderMinutes" type="{urn:types.scheduling_2018_2.activities.webservices.netsuite.com}CalendarEventReminderMinutes" minOccurs="0"/>
 *         &lt;element name="status" type="{urn:types.scheduling_2018_2.activities.webservices.netsuite.com}CalendarEventStatus" minOccurs="0"/>
 *         &lt;element name="accessLevel" type="{urn:types.scheduling_2018_2.activities.webservices.netsuite.com}CalendarEventAccessLevel" minOccurs="0"/>
 *         &lt;element name="organizer" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="exclusionDateList" type="{urn:scheduling_2018_2.activities.webservices.netsuite.com}ExclusionDateList" minOccurs="0"/>
 *         &lt;element name="lastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="owner" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="attendeeList" type="{urn:scheduling_2018_2.activities.webservices.netsuite.com}CalendarEventAttendeeList" minOccurs="0"/>
 *         &lt;element name="resourceList" type="{urn:scheduling_2018_2.activities.webservices.netsuite.com}CalendarEventResourceList" minOccurs="0"/>
 *         &lt;element name="timeItemList" type="{urn:scheduling_2018_2.activities.webservices.netsuite.com}CalendarEventTimeItemList" minOccurs="0"/>
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
@XmlType(name = "CalendarEvent", propOrder = {
    "company",
    "contact",
    "supportCase",
    "transaction",
    "period",
    "frequency",
    "recurrenceDowMaskList",
    "recurrenceDow",
    "recurrenceDowim",
    "seriesStartDate",
    "endByDate",
    "noEndDate",
    "sendEmail",
    "customForm",
    "title",
    "recurrence",
    "location",
    "startDate",
    "allDayEvent",
    "timedEvent",
    "reminderType",
    "reminderMinutes",
    "status",
    "accessLevel",
    "organizer",
    "message",
    "createdDate",
    "endDate",
    "exclusionDateList",
    "lastModifiedDate",
    "owner",
    "attendeeList",
    "resourceList",
    "timeItemList",
    "customFieldList"
})
public class CalendarEvent
    extends Record
{

    protected RecordRef company;
    protected RecordRef contact;
    protected RecordRef supportCase;
    protected RecordRef transaction;
    protected Long period;
    @XmlSchemaType(name = "string")
    protected RecurrenceFrequency frequency;
    protected RecurrenceDowMaskList recurrenceDowMaskList;
    @XmlSchemaType(name = "string")
    protected RecurrenceDow recurrenceDow;
    @XmlSchemaType(name = "string")
    protected RecurrenceDowim recurrenceDowim;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar seriesStartDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endByDate;
    protected Boolean noEndDate;
    protected Boolean sendEmail;
    protected RecordRef customForm;
    protected String title;
    protected String recurrence;
    protected String location;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    protected Boolean allDayEvent;
    protected Boolean timedEvent;
    @XmlSchemaType(name = "string")
    protected CalendarEventReminderType reminderType;
    protected String reminderMinutes;
    @XmlSchemaType(name = "string")
    protected CalendarEventStatus status;
    @XmlSchemaType(name = "string")
    protected CalendarEventAccessLevel accessLevel;
    protected RecordRef organizer;
    protected String message;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected ExclusionDateList exclusionDateList;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    protected RecordRef owner;
    protected CalendarEventAttendeeList attendeeList;
    protected CalendarEventResourceList resourceList;
    protected CalendarEventTimeItemList timeItemList;
    protected CustomFieldList customFieldList;
    @XmlAttribute(name = "internalId")
    protected String internalId;
    @XmlAttribute(name = "externalId")
    protected String externalId;

    /**
     * 获取company属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCompany() {
        return company;
    }

    /**
     * 设置company属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCompany(RecordRef value) {
        this.company = value;
    }

    /**
     * 获取contact属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getContact() {
        return contact;
    }

    /**
     * 设置contact属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setContact(RecordRef value) {
        this.contact = value;
    }

    /**
     * 获取supportCase属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSupportCase() {
        return supportCase;
    }

    /**
     * 设置supportCase属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSupportCase(RecordRef value) {
        this.supportCase = value;
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
     * 获取period属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPeriod() {
        return period;
    }

    /**
     * 设置period属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPeriod(Long value) {
        this.period = value;
    }

    /**
     * 获取frequency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecurrenceFrequency }
     *     
     */
    public RecurrenceFrequency getFrequency() {
        return frequency;
    }

    /**
     * 设置frequency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecurrenceFrequency }
     *     
     */
    public void setFrequency(RecurrenceFrequency value) {
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
     * 获取recurrenceDow属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecurrenceDow }
     *     
     */
    public RecurrenceDow getRecurrenceDow() {
        return recurrenceDow;
    }

    /**
     * 设置recurrenceDow属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecurrenceDow }
     *     
     */
    public void setRecurrenceDow(RecurrenceDow value) {
        this.recurrenceDow = value;
    }

    /**
     * 获取recurrenceDowim属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecurrenceDowim }
     *     
     */
    public RecurrenceDowim getRecurrenceDowim() {
        return recurrenceDowim;
    }

    /**
     * 设置recurrenceDowim属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecurrenceDowim }
     *     
     */
    public void setRecurrenceDowim(RecurrenceDowim value) {
        this.recurrenceDowim = value;
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
     * 获取endByDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndByDate() {
        return endByDate;
    }

    /**
     * 设置endByDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndByDate(XMLGregorianCalendar value) {
        this.endByDate = value;
    }

    /**
     * 获取noEndDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoEndDate() {
        return noEndDate;
    }

    /**
     * 设置noEndDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoEndDate(Boolean value) {
        this.noEndDate = value;
    }

    /**
     * 获取sendEmail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendEmail() {
        return sendEmail;
    }

    /**
     * 设置sendEmail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendEmail(Boolean value) {
        this.sendEmail = value;
    }

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
     * 获取title属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置title属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * 获取recurrence属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurrence() {
        return recurrence;
    }

    /**
     * 设置recurrence属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurrence(String value) {
        this.recurrence = value;
    }

    /**
     * 获取location属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * 设置location属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * 获取startDate属性的值。
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
     * 设置startDate属性的值。
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
     * 获取allDayEvent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllDayEvent() {
        return allDayEvent;
    }

    /**
     * 设置allDayEvent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllDayEvent(Boolean value) {
        this.allDayEvent = value;
    }

    /**
     * 获取timedEvent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimedEvent() {
        return timedEvent;
    }

    /**
     * 设置timedEvent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimedEvent(Boolean value) {
        this.timedEvent = value;
    }

    /**
     * 获取reminderType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CalendarEventReminderType }
     *     
     */
    public CalendarEventReminderType getReminderType() {
        return reminderType;
    }

    /**
     * 设置reminderType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarEventReminderType }
     *     
     */
    public void setReminderType(CalendarEventReminderType value) {
        this.reminderType = value;
    }

    /**
     * 获取reminderMinutes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReminderMinutes() {
        return reminderMinutes;
    }

    /**
     * 设置reminderMinutes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReminderMinutes(String value) {
        this.reminderMinutes = value;
    }

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CalendarEventStatus }
     *     
     */
    public CalendarEventStatus getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarEventStatus }
     *     
     */
    public void setStatus(CalendarEventStatus value) {
        this.status = value;
    }

    /**
     * 获取accessLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CalendarEventAccessLevel }
     *     
     */
    public CalendarEventAccessLevel getAccessLevel() {
        return accessLevel;
    }

    /**
     * 设置accessLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarEventAccessLevel }
     *     
     */
    public void setAccessLevel(CalendarEventAccessLevel value) {
        this.accessLevel = value;
    }

    /**
     * 获取organizer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getOrganizer() {
        return organizer;
    }

    /**
     * 设置organizer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setOrganizer(RecordRef value) {
        this.organizer = value;
    }

    /**
     * 获取message属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * 设置message属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * 获取createdDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * 设置createdDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * 获取endDate属性的值。
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
     * 设置endDate属性的值。
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
     * 获取exclusionDateList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ExclusionDateList }
     *     
     */
    public ExclusionDateList getExclusionDateList() {
        return exclusionDateList;
    }

    /**
     * 设置exclusionDateList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ExclusionDateList }
     *     
     */
    public void setExclusionDateList(ExclusionDateList value) {
        this.exclusionDateList = value;
    }

    /**
     * 获取lastModifiedDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * 设置lastModifiedDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedDate(XMLGregorianCalendar value) {
        this.lastModifiedDate = value;
    }

    /**
     * 获取owner属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getOwner() {
        return owner;
    }

    /**
     * 设置owner属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setOwner(RecordRef value) {
        this.owner = value;
    }

    /**
     * 获取attendeeList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CalendarEventAttendeeList }
     *     
     */
    public CalendarEventAttendeeList getAttendeeList() {
        return attendeeList;
    }

    /**
     * 设置attendeeList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarEventAttendeeList }
     *     
     */
    public void setAttendeeList(CalendarEventAttendeeList value) {
        this.attendeeList = value;
    }

    /**
     * 获取resourceList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CalendarEventResourceList }
     *     
     */
    public CalendarEventResourceList getResourceList() {
        return resourceList;
    }

    /**
     * 设置resourceList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarEventResourceList }
     *     
     */
    public void setResourceList(CalendarEventResourceList value) {
        this.resourceList = value;
    }

    /**
     * 获取timeItemList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CalendarEventTimeItemList }
     *     
     */
    public CalendarEventTimeItemList getTimeItemList() {
        return timeItemList;
    }

    /**
     * 设置timeItemList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarEventTimeItemList }
     *     
     */
    public void setTimeItemList(CalendarEventTimeItemList value) {
        this.timeItemList = value;
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
