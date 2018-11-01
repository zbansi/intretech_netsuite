
package com.netsuite.webservices.lists.supplychain_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.lists.supplychain_2018_2.types.ManufacturingOperationTaskStatus;
import com.netsuite.webservices.platform.core_2018_2.CustomFieldList;
import com.netsuite.webservices.platform.core_2018_2.Record;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;


/**
 * <p>ManufacturingOperationTask complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ManufacturingOperationTask">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}Record">
 *       &lt;sequence>
 *         &lt;element name="customForm" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="manufacturingWorkCenter" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="manufacturingCostTemplate" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operationSequence" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="workOrder" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="order" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="status" type="{urn:types.supplychain_2018_2.lists.webservices.netsuite.com}ManufacturingOperationTaskStatus" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estimatedWork" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="actualWork" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="remainingWork" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="inputQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="completedQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="setupTime" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="runRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="autoCalculateLag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="machineResources" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="laborResources" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="costDetailList" type="{urn:supplychain_2018_2.lists.webservices.netsuite.com}ManufacturingCostDetailList" minOccurs="0"/>
 *         &lt;element name="predecessorList" type="{urn:supplychain_2018_2.lists.webservices.netsuite.com}ManufacturingOperationTaskPredecessorList" minOccurs="0"/>
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
@XmlType(name = "ManufacturingOperationTask", propOrder = {
    "customForm",
    "manufacturingWorkCenter",
    "manufacturingCostTemplate",
    "title",
    "operationSequence",
    "workOrder",
    "order",
    "status",
    "message",
    "estimatedWork",
    "actualWork",
    "remainingWork",
    "inputQuantity",
    "completedQuantity",
    "setupTime",
    "runRate",
    "startDate",
    "endDate",
    "autoCalculateLag",
    "machineResources",
    "laborResources",
    "costDetailList",
    "predecessorList",
    "customFieldList"
})
public class ManufacturingOperationTask
    extends Record
{

    protected RecordRef customForm;
    protected RecordRef manufacturingWorkCenter;
    protected RecordRef manufacturingCostTemplate;
    protected String title;
    protected Long operationSequence;
    protected RecordRef workOrder;
    protected RecordRef order;
    @XmlSchemaType(name = "string")
    protected ManufacturingOperationTaskStatus status;
    protected String message;
    protected Double estimatedWork;
    protected Double actualWork;
    protected Double remainingWork;
    protected Double inputQuantity;
    protected Double completedQuantity;
    protected Double setupTime;
    protected Double runRate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected Boolean autoCalculateLag;
    protected Long machineResources;
    protected Long laborResources;
    protected ManufacturingCostDetailList costDetailList;
    protected ManufacturingOperationTaskPredecessorList predecessorList;
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
     * 获取manufacturingWorkCenter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getManufacturingWorkCenter() {
        return manufacturingWorkCenter;
    }

    /**
     * 设置manufacturingWorkCenter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setManufacturingWorkCenter(RecordRef value) {
        this.manufacturingWorkCenter = value;
    }

    /**
     * 获取manufacturingCostTemplate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getManufacturingCostTemplate() {
        return manufacturingCostTemplate;
    }

    /**
     * 设置manufacturingCostTemplate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setManufacturingCostTemplate(RecordRef value) {
        this.manufacturingCostTemplate = value;
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
     * 获取operationSequence属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOperationSequence() {
        return operationSequence;
    }

    /**
     * 设置operationSequence属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOperationSequence(Long value) {
        this.operationSequence = value;
    }

    /**
     * 获取workOrder属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getWorkOrder() {
        return workOrder;
    }

    /**
     * 设置workOrder属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setWorkOrder(RecordRef value) {
        this.workOrder = value;
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
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ManufacturingOperationTaskStatus }
     *     
     */
    public ManufacturingOperationTaskStatus getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ManufacturingOperationTaskStatus }
     *     
     */
    public void setStatus(ManufacturingOperationTaskStatus value) {
        this.status = value;
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
     * 获取inputQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInputQuantity() {
        return inputQuantity;
    }

    /**
     * 设置inputQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInputQuantity(Double value) {
        this.inputQuantity = value;
    }

    /**
     * 获取completedQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCompletedQuantity() {
        return completedQuantity;
    }

    /**
     * 设置completedQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCompletedQuantity(Double value) {
        this.completedQuantity = value;
    }

    /**
     * 获取setupTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSetupTime() {
        return setupTime;
    }

    /**
     * 设置setupTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSetupTime(Double value) {
        this.setupTime = value;
    }

    /**
     * 获取runRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRunRate() {
        return runRate;
    }

    /**
     * 设置runRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRunRate(Double value) {
        this.runRate = value;
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
     * 获取autoCalculateLag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoCalculateLag() {
        return autoCalculateLag;
    }

    /**
     * 设置autoCalculateLag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoCalculateLag(Boolean value) {
        this.autoCalculateLag = value;
    }

    /**
     * 获取machineResources属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMachineResources() {
        return machineResources;
    }

    /**
     * 设置machineResources属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMachineResources(Long value) {
        this.machineResources = value;
    }

    /**
     * 获取laborResources属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLaborResources() {
        return laborResources;
    }

    /**
     * 设置laborResources属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLaborResources(Long value) {
        this.laborResources = value;
    }

    /**
     * 获取costDetailList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ManufacturingCostDetailList }
     *     
     */
    public ManufacturingCostDetailList getCostDetailList() {
        return costDetailList;
    }

    /**
     * 设置costDetailList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ManufacturingCostDetailList }
     *     
     */
    public void setCostDetailList(ManufacturingCostDetailList value) {
        this.costDetailList = value;
    }

    /**
     * 获取predecessorList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ManufacturingOperationTaskPredecessorList }
     *     
     */
    public ManufacturingOperationTaskPredecessorList getPredecessorList() {
        return predecessorList;
    }

    /**
     * 设置predecessorList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ManufacturingOperationTaskPredecessorList }
     *     
     */
    public void setPredecessorList(ManufacturingOperationTaskPredecessorList value) {
        this.predecessorList = value;
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
