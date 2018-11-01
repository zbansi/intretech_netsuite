
package com.netsuite.webservices.activities.scheduling_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.activities.scheduling_2018_2.types.ProjectTaskConstraintType;
import com.netsuite.webservices.activities.scheduling_2018_2.types.ProjectTaskStatus;
import com.netsuite.webservices.platform.core_2018_2.CustomFieldList;
import com.netsuite.webservices.platform.core_2018_2.Record;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;


/**
 * <p>ProjectTask complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ProjectTask">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}Record">
 *       &lt;sequence>
 *         &lt;element name="customForm" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="eventId" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="percentTimeComplete" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="company" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="contact" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="order" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="owner" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="parent" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="priority" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="estimatedWork" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="estimatedWorkBaseline" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="constraintType" type="{urn:types.scheduling_2018_2.activities.webservices.netsuite.com}ProjectTaskConstraintType" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="startDateBaseline" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="finishByDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="endDateBaseline" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="actualWork" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="remainingWork" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isMilestone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isOnCriticalPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="slackMinutes" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="lateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lateStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="status" type="{urn:types.scheduling_2018_2.activities.webservices.netsuite.com}ProjectTaskStatus" minOccurs="0"/>
 *         &lt;element name="nonBillableTask" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="assigneeList" type="{urn:scheduling_2018_2.activities.webservices.netsuite.com}ProjectTaskAssigneeList" minOccurs="0"/>
 *         &lt;element name="predecessorList" type="{urn:scheduling_2018_2.activities.webservices.netsuite.com}ProjectTaskPredecessorList" minOccurs="0"/>
 *         &lt;element name="timeItemList" type="{urn:scheduling_2018_2.activities.webservices.netsuite.com}ProjectTaskTimeItemList" minOccurs="0"/>
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
@XmlType(name = "ProjectTask", propOrder = {
    "customForm",
    "eventId",
    "percentTimeComplete",
    "title",
    "company",
    "contact",
    "order",
    "owner",
    "parent",
    "priority",
    "estimatedWork",
    "estimatedWorkBaseline",
    "constraintType",
    "startDate",
    "startDateBaseline",
    "endDate",
    "finishByDate",
    "endDateBaseline",
    "actualWork",
    "remainingWork",
    "message",
    "isMilestone",
    "isOnCriticalPath",
    "slackMinutes",
    "lateEnd",
    "lateStart",
    "status",
    "nonBillableTask",
    "assigneeList",
    "predecessorList",
    "timeItemList",
    "customFieldList"
})
public class ProjectTask
    extends Record
{

    protected RecordRef customForm;
    protected RecordRef eventId;
    protected Double percentTimeComplete;
    protected String title;
    protected RecordRef company;
    protected RecordRef contact;
    protected RecordRef order;
    protected RecordRef owner;
    protected RecordRef parent;
    protected RecordRef priority;
    protected Double estimatedWork;
    protected Double estimatedWorkBaseline;
    @XmlSchemaType(name = "string")
    protected ProjectTaskConstraintType constraintType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDateBaseline;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar finishByDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDateBaseline;
    protected Double actualWork;
    protected Double remainingWork;
    protected String message;
    protected Boolean isMilestone;
    protected String isOnCriticalPath;
    protected Double slackMinutes;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lateEnd;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lateStart;
    @XmlSchemaType(name = "string")
    protected ProjectTaskStatus status;
    protected Boolean nonBillableTask;
    protected ProjectTaskAssigneeList assigneeList;
    protected ProjectTaskPredecessorList predecessorList;
    protected ProjectTaskTimeItemList timeItemList;
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
     * 获取eventId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getEventId() {
        return eventId;
    }

    /**
     * 设置eventId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setEventId(RecordRef value) {
        this.eventId = value;
    }

    /**
     * 获取percentTimeComplete属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercentTimeComplete() {
        return percentTimeComplete;
    }

    /**
     * 设置percentTimeComplete属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercentTimeComplete(Double value) {
        this.percentTimeComplete = value;
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
     * 获取order属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getOrder() {
        return order;
    }

    /**
     * 设置order属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setOrder(RecordRef value) {
        this.order = value;
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
     * 获取parent属性的值。
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
     * 设置parent属性的值。
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
     * 获取priority属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPriority() {
        return priority;
    }

    /**
     * 设置priority属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPriority(RecordRef value) {
        this.priority = value;
    }

    /**
     * 获取estimatedWork属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEstimatedWork() {
        return estimatedWork;
    }

    /**
     * 设置estimatedWork属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEstimatedWork(Double value) {
        this.estimatedWork = value;
    }

    /**
     * 获取estimatedWorkBaseline属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEstimatedWorkBaseline() {
        return estimatedWorkBaseline;
    }

    /**
     * 设置estimatedWorkBaseline属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEstimatedWorkBaseline(Double value) {
        this.estimatedWorkBaseline = value;
    }

    /**
     * 获取constraintType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProjectTaskConstraintType }
     *     
     */
    public ProjectTaskConstraintType getConstraintType() {
        return constraintType;
    }

    /**
     * 设置constraintType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectTaskConstraintType }
     *     
     */
    public void setConstraintType(ProjectTaskConstraintType value) {
        this.constraintType = value;
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
     * 获取startDateBaseline属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDateBaseline() {
        return startDateBaseline;
    }

    /**
     * 设置startDateBaseline属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDateBaseline(XMLGregorianCalendar value) {
        this.startDateBaseline = value;
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
     * 获取finishByDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFinishByDate() {
        return finishByDate;
    }

    /**
     * 设置finishByDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFinishByDate(XMLGregorianCalendar value) {
        this.finishByDate = value;
    }

    /**
     * 获取endDateBaseline属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDateBaseline() {
        return endDateBaseline;
    }

    /**
     * 设置endDateBaseline属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDateBaseline(XMLGregorianCalendar value) {
        this.endDateBaseline = value;
    }

    /**
     * 获取actualWork属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getActualWork() {
        return actualWork;
    }

    /**
     * 设置actualWork属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setActualWork(Double value) {
        this.actualWork = value;
    }

    /**
     * 获取remainingWork属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRemainingWork() {
        return remainingWork;
    }

    /**
     * 设置remainingWork属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRemainingWork(Double value) {
        this.remainingWork = value;
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
     * 获取isMilestone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMilestone() {
        return isMilestone;
    }

    /**
     * 设置isMilestone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMilestone(Boolean value) {
        this.isMilestone = value;
    }

    /**
     * 获取isOnCriticalPath属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsOnCriticalPath() {
        return isOnCriticalPath;
    }

    /**
     * 设置isOnCriticalPath属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsOnCriticalPath(String value) {
        this.isOnCriticalPath = value;
    }

    /**
     * 获取slackMinutes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSlackMinutes() {
        return slackMinutes;
    }

    /**
     * 设置slackMinutes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSlackMinutes(Double value) {
        this.slackMinutes = value;
    }

    /**
     * 获取lateEnd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLateEnd() {
        return lateEnd;
    }

    /**
     * 设置lateEnd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLateEnd(XMLGregorianCalendar value) {
        this.lateEnd = value;
    }

    /**
     * 获取lateStart属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLateStart() {
        return lateStart;
    }

    /**
     * 设置lateStart属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLateStart(XMLGregorianCalendar value) {
        this.lateStart = value;
    }

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProjectTaskStatus }
     *     
     */
    public ProjectTaskStatus getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectTaskStatus }
     *     
     */
    public void setStatus(ProjectTaskStatus value) {
        this.status = value;
    }

    /**
     * 获取nonBillableTask属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonBillableTask() {
        return nonBillableTask;
    }

    /**
     * 设置nonBillableTask属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonBillableTask(Boolean value) {
        this.nonBillableTask = value;
    }

    /**
     * 获取assigneeList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProjectTaskAssigneeList }
     *     
     */
    public ProjectTaskAssigneeList getAssigneeList() {
        return assigneeList;
    }

    /**
     * 设置assigneeList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectTaskAssigneeList }
     *     
     */
    public void setAssigneeList(ProjectTaskAssigneeList value) {
        this.assigneeList = value;
    }

    /**
     * 获取predecessorList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProjectTaskPredecessorList }
     *     
     */
    public ProjectTaskPredecessorList getPredecessorList() {
        return predecessorList;
    }

    /**
     * 设置predecessorList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectTaskPredecessorList }
     *     
     */
    public void setPredecessorList(ProjectTaskPredecessorList value) {
        this.predecessorList = value;
    }

    /**
     * 获取timeItemList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProjectTaskTimeItemList }
     *     
     */
    public ProjectTaskTimeItemList getTimeItemList() {
        return timeItemList;
    }

    /**
     * 设置timeItemList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectTaskTimeItemList }
     *     
     */
    public void setTimeItemList(ProjectTaskTimeItemList value) {
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
