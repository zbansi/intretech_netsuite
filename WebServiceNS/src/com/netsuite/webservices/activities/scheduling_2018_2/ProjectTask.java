
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
 * <p>ProjectTask complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡeventId���Ե�ֵ��
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
     * ����eventId���Ե�ֵ��
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
     * ��ȡpercentTimeComplete���Ե�ֵ��
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
     * ����percentTimeComplete���Ե�ֵ��
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
     * ��ȡtitle���Ե�ֵ��
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
     * ����title���Ե�ֵ��
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
     * ��ȡcompany���Ե�ֵ��
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
     * ����company���Ե�ֵ��
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
     * ��ȡcontact���Ե�ֵ��
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
     * ����contact���Ե�ֵ��
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
     * ��ȡorder���Ե�ֵ��
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
     * ����order���Ե�ֵ��
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
     * ��ȡowner���Ե�ֵ��
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
     * ����owner���Ե�ֵ��
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
     * ��ȡpriority���Ե�ֵ��
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
     * ����priority���Ե�ֵ��
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
     * ��ȡestimatedWork���Ե�ֵ��
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
     * ����estimatedWork���Ե�ֵ��
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
     * ��ȡestimatedWorkBaseline���Ե�ֵ��
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
     * ����estimatedWorkBaseline���Ե�ֵ��
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
     * ��ȡconstraintType���Ե�ֵ��
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
     * ����constraintType���Ե�ֵ��
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
     * ��ȡstartDateBaseline���Ե�ֵ��
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
     * ����startDateBaseline���Ե�ֵ��
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
     * ��ȡfinishByDate���Ե�ֵ��
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
     * ����finishByDate���Ե�ֵ��
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
     * ��ȡendDateBaseline���Ե�ֵ��
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
     * ����endDateBaseline���Ե�ֵ��
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
     * ��ȡactualWork���Ե�ֵ��
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
     * ����actualWork���Ե�ֵ��
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
     * ��ȡremainingWork���Ե�ֵ��
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
     * ����remainingWork���Ե�ֵ��
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
     * ��ȡmessage���Ե�ֵ��
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
     * ����message���Ե�ֵ��
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
     * ��ȡisMilestone���Ե�ֵ��
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
     * ����isMilestone���Ե�ֵ��
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
     * ��ȡisOnCriticalPath���Ե�ֵ��
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
     * ����isOnCriticalPath���Ե�ֵ��
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
     * ��ȡslackMinutes���Ե�ֵ��
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
     * ����slackMinutes���Ե�ֵ��
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
     * ��ȡlateEnd���Ե�ֵ��
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
     * ����lateEnd���Ե�ֵ��
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
     * ��ȡlateStart���Ե�ֵ��
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
     * ����lateStart���Ե�ֵ��
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
     * ��ȡstatus���Ե�ֵ��
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
     * ����status���Ե�ֵ��
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
     * ��ȡnonBillableTask���Ե�ֵ��
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
     * ����nonBillableTask���Ե�ֵ��
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
     * ��ȡassigneeList���Ե�ֵ��
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
     * ����assigneeList���Ե�ֵ��
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
     * ��ȡpredecessorList���Ե�ֵ��
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
     * ����predecessorList���Ե�ֵ��
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
     * ��ȡtimeItemList���Ե�ֵ��
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
     * ����timeItemList���Ե�ֵ��
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
