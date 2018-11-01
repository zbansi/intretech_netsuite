
package com.netsuite.webservices.platform.common_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.SearchCustomFieldList;
import com.netsuite.webservices.platform.core_2018_2.SearchDateField;
import com.netsuite.webservices.platform.core_2018_2.SearchDoubleField;
import com.netsuite.webservices.platform.core_2018_2.SearchEnumMultiSelectField;
import com.netsuite.webservices.platform.core_2018_2.SearchLongField;
import com.netsuite.webservices.platform.core_2018_2.SearchMultiSelectField;
import com.netsuite.webservices.platform.core_2018_2.SearchRecordBasic;
import com.netsuite.webservices.platform.core_2018_2.SearchStringField;


/**
 * <p>ManufacturingOperationTaskSearchBasic complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ManufacturingOperationTaskSearchBasic">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRecordBasic">
 *       &lt;sequence>
 *         &lt;element name="actualRunTime" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="actualSetupTime" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="completedQuantity" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="endDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="estimatedWork" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="externalId" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="externalIdString" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="id" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="inputQuantity" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="internalId" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="internalIdNumber" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="laborResources" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="lagAmount" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="lagType" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="lagUnits" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="machineResources" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="manufacturingCostTemplate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="manufacturingWorkCenter" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="name" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="order" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="predecessor" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="remainingQuantity" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="runRate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="runTime" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="sequence" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="setupTime" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="startDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="status" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="workOrder" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="customFieldList" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchCustomFieldList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManufacturingOperationTaskSearchBasic", propOrder = {
    "actualRunTime",
    "actualSetupTime",
    "completedQuantity",
    "endDate",
    "estimatedWork",
    "externalId",
    "externalIdString",
    "id",
    "inputQuantity",
    "internalId",
    "internalIdNumber",
    "laborResources",
    "lagAmount",
    "lagType",
    "lagUnits",
    "machineResources",
    "manufacturingCostTemplate",
    "manufacturingWorkCenter",
    "name",
    "order",
    "predecessor",
    "remainingQuantity",
    "runRate",
    "runTime",
    "sequence",
    "setupTime",
    "startDate",
    "status",
    "workOrder",
    "customFieldList"
})
public class ManufacturingOperationTaskSearchBasic
    extends SearchRecordBasic
{

    protected SearchDoubleField actualRunTime;
    protected SearchDoubleField actualSetupTime;
    protected SearchDoubleField completedQuantity;
    protected SearchDateField endDate;
    protected SearchDoubleField estimatedWork;
    protected SearchMultiSelectField externalId;
    protected SearchStringField externalIdString;
    protected SearchLongField id;
    protected SearchDoubleField inputQuantity;
    protected SearchMultiSelectField internalId;
    protected SearchLongField internalIdNumber;
    protected SearchLongField laborResources;
    protected SearchDoubleField lagAmount;
    protected SearchEnumMultiSelectField lagType;
    protected SearchStringField lagUnits;
    protected SearchLongField machineResources;
    protected SearchMultiSelectField manufacturingCostTemplate;
    protected SearchMultiSelectField manufacturingWorkCenter;
    protected SearchStringField name;
    protected SearchDoubleField order;
    protected SearchMultiSelectField predecessor;
    protected SearchDoubleField remainingQuantity;
    protected SearchDoubleField runRate;
    protected SearchDoubleField runTime;
    protected SearchLongField sequence;
    protected SearchDoubleField setupTime;
    protected SearchDateField startDate;
    protected SearchMultiSelectField status;
    protected SearchMultiSelectField workOrder;
    protected SearchCustomFieldList customFieldList;

    /**
     * ��ȡactualRunTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getActualRunTime() {
        return actualRunTime;
    }

    /**
     * ����actualRunTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setActualRunTime(SearchDoubleField value) {
        this.actualRunTime = value;
    }

    /**
     * ��ȡactualSetupTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getActualSetupTime() {
        return actualSetupTime;
    }

    /**
     * ����actualSetupTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setActualSetupTime(SearchDoubleField value) {
        this.actualSetupTime = value;
    }

    /**
     * ��ȡcompletedQuantity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getCompletedQuantity() {
        return completedQuantity;
    }

    /**
     * ����completedQuantity���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setCompletedQuantity(SearchDoubleField value) {
        this.completedQuantity = value;
    }

    /**
     * ��ȡendDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getEndDate() {
        return endDate;
    }

    /**
     * ����endDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setEndDate(SearchDateField value) {
        this.endDate = value;
    }

    /**
     * ��ȡestimatedWork���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getEstimatedWork() {
        return estimatedWork;
    }

    /**
     * ����estimatedWork���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setEstimatedWork(SearchDoubleField value) {
        this.estimatedWork = value;
    }

    /**
     * ��ȡexternalId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getExternalId() {
        return externalId;
    }

    /**
     * ����externalId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setExternalId(SearchMultiSelectField value) {
        this.externalId = value;
    }

    /**
     * ��ȡexternalIdString���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getExternalIdString() {
        return externalIdString;
    }

    /**
     * ����externalIdString���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setExternalIdString(SearchStringField value) {
        this.externalIdString = value;
    }

    /**
     * ��ȡid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getId() {
        return id;
    }

    /**
     * ����id���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setId(SearchLongField value) {
        this.id = value;
    }

    /**
     * ��ȡinputQuantity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getInputQuantity() {
        return inputQuantity;
    }

    /**
     * ����inputQuantity���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setInputQuantity(SearchDoubleField value) {
        this.inputQuantity = value;
    }

    /**
     * ��ȡinternalId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getInternalId() {
        return internalId;
    }

    /**
     * ����internalId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setInternalId(SearchMultiSelectField value) {
        this.internalId = value;
    }

    /**
     * ��ȡinternalIdNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }

    /**
     * ����internalIdNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setInternalIdNumber(SearchLongField value) {
        this.internalIdNumber = value;
    }

    /**
     * ��ȡlaborResources���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getLaborResources() {
        return laborResources;
    }

    /**
     * ����laborResources���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setLaborResources(SearchLongField value) {
        this.laborResources = value;
    }

    /**
     * ��ȡlagAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getLagAmount() {
        return lagAmount;
    }

    /**
     * ����lagAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setLagAmount(SearchDoubleField value) {
        this.lagAmount = value;
    }

    /**
     * ��ȡlagType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getLagType() {
        return lagType;
    }

    /**
     * ����lagType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setLagType(SearchEnumMultiSelectField value) {
        this.lagType = value;
    }

    /**
     * ��ȡlagUnits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getLagUnits() {
        return lagUnits;
    }

    /**
     * ����lagUnits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setLagUnits(SearchStringField value) {
        this.lagUnits = value;
    }

    /**
     * ��ȡmachineResources���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getMachineResources() {
        return machineResources;
    }

    /**
     * ����machineResources���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setMachineResources(SearchLongField value) {
        this.machineResources = value;
    }

    /**
     * ��ȡmanufacturingCostTemplate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getManufacturingCostTemplate() {
        return manufacturingCostTemplate;
    }

    /**
     * ����manufacturingCostTemplate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setManufacturingCostTemplate(SearchMultiSelectField value) {
        this.manufacturingCostTemplate = value;
    }

    /**
     * ��ȡmanufacturingWorkCenter���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getManufacturingWorkCenter() {
        return manufacturingWorkCenter;
    }

    /**
     * ����manufacturingWorkCenter���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setManufacturingWorkCenter(SearchMultiSelectField value) {
        this.manufacturingWorkCenter = value;
    }

    /**
     * ��ȡname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getName() {
        return name;
    }

    /**
     * ����name���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setName(SearchStringField value) {
        this.name = value;
    }

    /**
     * ��ȡorder���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getOrder() {
        return order;
    }

    /**
     * ����order���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setOrder(SearchDoubleField value) {
        this.order = value;
    }

    /**
     * ��ȡpredecessor���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getPredecessor() {
        return predecessor;
    }

    /**
     * ����predecessor���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setPredecessor(SearchMultiSelectField value) {
        this.predecessor = value;
    }

    /**
     * ��ȡremainingQuantity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getRemainingQuantity() {
        return remainingQuantity;
    }

    /**
     * ����remainingQuantity���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setRemainingQuantity(SearchDoubleField value) {
        this.remainingQuantity = value;
    }

    /**
     * ��ȡrunRate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getRunRate() {
        return runRate;
    }

    /**
     * ����runRate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setRunRate(SearchDoubleField value) {
        this.runRate = value;
    }

    /**
     * ��ȡrunTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getRunTime() {
        return runTime;
    }

    /**
     * ����runTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setRunTime(SearchDoubleField value) {
        this.runTime = value;
    }

    /**
     * ��ȡsequence���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getSequence() {
        return sequence;
    }

    /**
     * ����sequence���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setSequence(SearchLongField value) {
        this.sequence = value;
    }

    /**
     * ��ȡsetupTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getSetupTime() {
        return setupTime;
    }

    /**
     * ����setupTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setSetupTime(SearchDoubleField value) {
        this.setupTime = value;
    }

    /**
     * ��ȡstartDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getStartDate() {
        return startDate;
    }

    /**
     * ����startDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setStartDate(SearchDateField value) {
        this.startDate = value;
    }

    /**
     * ��ȡstatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getStatus() {
        return status;
    }

    /**
     * ����status���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setStatus(SearchMultiSelectField value) {
        this.status = value;
    }

    /**
     * ��ȡworkOrder���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getWorkOrder() {
        return workOrder;
    }

    /**
     * ����workOrder���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setWorkOrder(SearchMultiSelectField value) {
        this.workOrder = value;
    }

    /**
     * ��ȡcustomFieldList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchCustomFieldList }
     *     
     */
    public SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }

    /**
     * ����customFieldList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCustomFieldList }
     *     
     */
    public void setCustomFieldList(SearchCustomFieldList value) {
        this.customFieldList = value;
    }

}
