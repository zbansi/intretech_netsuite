
package com.netsuite.webservices.transactions.inventory_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.platform.common_2018_2.AccountingBookDetailList;
import com.netsuite.webservices.platform.core_2018_2.CustomFieldList;
import com.netsuite.webservices.platform.core_2018_2.Record;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;
import com.netsuite.webservices.transactions.inventory_2018_2.types.WorkOrderOrderStatus;
import com.netsuite.webservices.transactions.inventory_2018_2.types.WorkOrderSchedulingMethod;


/**
 * <p>WorkOrder complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WorkOrder">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}Record">
 *       &lt;sequence>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="customForm" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="manufacturingRouting" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="autoCalculateLag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tranId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entity" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="job" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="assemblyItem" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="expandAssembly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isWip" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="billOfMaterials" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="units" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="tranDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="orderStatus" type="{urn:types.inventory_2018_2.transactions.webservices.netsuite.com}WorkOrderOrderStatus" minOccurs="0"/>
 *         &lt;element name="firmed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="department" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="class" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="itemList" type="{urn:inventory_2018_2.transactions.webservices.netsuite.com}WorkOrderItemList" minOccurs="0"/>
 *         &lt;element name="location" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="schedulingMethod" type="{urn:types.inventory_2018_2.transactions.webservices.netsuite.com}WorkOrderSchedulingMethod" minOccurs="0"/>
 *         &lt;element name="salesTeamList" type="{urn:inventory_2018_2.transactions.webservices.netsuite.com}SalesTeamList" minOccurs="0"/>
 *         &lt;element name="partnersList" type="{urn:inventory_2018_2.transactions.webservices.netsuite.com}PartnersList" minOccurs="0"/>
 *         &lt;element name="createdFrom" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="sourceTransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceTransactionLine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="specialOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="buildable" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="options" type="{urn:core_2018_2.platform.webservices.netsuite.com}CustomFieldList" minOccurs="0"/>
 *         &lt;element name="built" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="revision" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="billOfMaterialsRevision" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="subsidiary" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="accountingBookDetailList" type="{urn:common_2018_2.platform.webservices.netsuite.com}AccountingBookDetailList" minOccurs="0"/>
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
@XmlType(name = "WorkOrder", propOrder = {
    "createdDate",
    "lastModifiedDate",
    "customForm",
    "manufacturingRouting",
    "autoCalculateLag",
    "status",
    "tranId",
    "entity",
    "job",
    "assemblyItem",
    "expandAssembly",
    "isWip",
    "quantity",
    "billOfMaterials",
    "units",
    "tranDate",
    "orderStatus",
    "firmed",
    "memo",
    "department",
    "clazz",
    "itemList",
    "location",
    "schedulingMethod",
    "salesTeamList",
    "partnersList",
    "createdFrom",
    "sourceTransactionId",
    "sourceTransactionLine",
    "specialOrder",
    "buildable",
    "options",
    "built",
    "startDate",
    "endDate",
    "revision",
    "billOfMaterialsRevision",
    "subsidiary",
    "accountingBookDetailList",
    "customFieldList"
})
public class WorkOrder
    extends Record
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    protected RecordRef customForm;
    protected RecordRef manufacturingRouting;
    protected Boolean autoCalculateLag;
    protected String status;
    protected String tranId;
    protected RecordRef entity;
    protected RecordRef job;
    protected RecordRef assemblyItem;
    protected Boolean expandAssembly;
    protected Boolean isWip;
    protected Double quantity;
    protected RecordRef billOfMaterials;
    protected RecordRef units;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tranDate;
    @XmlSchemaType(name = "string")
    protected WorkOrderOrderStatus orderStatus;
    protected Boolean firmed;
    protected String memo;
    protected RecordRef department;
    @XmlElement(name = "class")
    protected RecordRef clazz;
    protected WorkOrderItemList itemList;
    protected RecordRef location;
    @XmlSchemaType(name = "string")
    protected WorkOrderSchedulingMethod schedulingMethod;
    protected SalesTeamList salesTeamList;
    protected PartnersList partnersList;
    protected RecordRef createdFrom;
    protected String sourceTransactionId;
    protected Long sourceTransactionLine;
    protected Boolean specialOrder;
    protected Double buildable;
    protected CustomFieldList options;
    protected Double built;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected RecordRef revision;
    protected RecordRef billOfMaterialsRevision;
    protected RecordRef subsidiary;
    protected AccountingBookDetailList accountingBookDetailList;
    protected CustomFieldList customFieldList;
    @XmlAttribute(name = "internalId")
    protected String internalId;
    @XmlAttribute(name = "externalId")
    protected String externalId;

    /**
     * ��ȡcreatedDate���Ե�ֵ��
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
     * ����createdDate���Ե�ֵ��
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
     * ��ȡlastModifiedDate���Ե�ֵ��
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
     * ����lastModifiedDate���Ե�ֵ��
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
     * ��ȡmanufacturingRouting���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getManufacturingRouting() {
        return manufacturingRouting;
    }

    /**
     * ����manufacturingRouting���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setManufacturingRouting(RecordRef value) {
        this.manufacturingRouting = value;
    }

    /**
     * ��ȡautoCalculateLag���Ե�ֵ��
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
     * ����autoCalculateLag���Ե�ֵ��
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
     * ��ȡstatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * ����status���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * ��ȡtranId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranId() {
        return tranId;
    }

    /**
     * ����tranId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranId(String value) {
        this.tranId = value;
    }

    /**
     * ��ȡentity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getEntity() {
        return entity;
    }

    /**
     * ����entity���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setEntity(RecordRef value) {
        this.entity = value;
    }

    /**
     * ��ȡjob���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getJob() {
        return job;
    }

    /**
     * ����job���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setJob(RecordRef value) {
        this.job = value;
    }

    /**
     * ��ȡassemblyItem���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getAssemblyItem() {
        return assemblyItem;
    }

    /**
     * ����assemblyItem���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setAssemblyItem(RecordRef value) {
        this.assemblyItem = value;
    }

    /**
     * ��ȡexpandAssembly���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpandAssembly() {
        return expandAssembly;
    }

    /**
     * ����expandAssembly���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpandAssembly(Boolean value) {
        this.expandAssembly = value;
    }

    /**
     * ��ȡisWip���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsWip() {
        return isWip;
    }

    /**
     * ����isWip���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsWip(Boolean value) {
        this.isWip = value;
    }

    /**
     * ��ȡquantity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantity() {
        return quantity;
    }

    /**
     * ����quantity���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantity(Double value) {
        this.quantity = value;
    }

    /**
     * ��ȡbillOfMaterials���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getBillOfMaterials() {
        return billOfMaterials;
    }

    /**
     * ����billOfMaterials���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setBillOfMaterials(RecordRef value) {
        this.billOfMaterials = value;
    }

    /**
     * ��ȡunits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getUnits() {
        return units;
    }

    /**
     * ����units���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setUnits(RecordRef value) {
        this.units = value;
    }

    /**
     * ��ȡtranDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTranDate() {
        return tranDate;
    }

    /**
     * ����tranDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTranDate(XMLGregorianCalendar value) {
        this.tranDate = value;
    }

    /**
     * ��ȡorderStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WorkOrderOrderStatus }
     *     
     */
    public WorkOrderOrderStatus getOrderStatus() {
        return orderStatus;
    }

    /**
     * ����orderStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WorkOrderOrderStatus }
     *     
     */
    public void setOrderStatus(WorkOrderOrderStatus value) {
        this.orderStatus = value;
    }

    /**
     * ��ȡfirmed���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFirmed() {
        return firmed;
    }

    /**
     * ����firmed���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFirmed(Boolean value) {
        this.firmed = value;
    }

    /**
     * ��ȡmemo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * ����memo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
    }

    /**
     * ��ȡdepartment���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getDepartment() {
        return department;
    }

    /**
     * ����department���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setDepartment(RecordRef value) {
        this.department = value;
    }

    /**
     * ��ȡclazz���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getClazz() {
        return clazz;
    }

    /**
     * ����clazz���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setClazz(RecordRef value) {
        this.clazz = value;
    }

    /**
     * ��ȡitemList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WorkOrderItemList }
     *     
     */
    public WorkOrderItemList getItemList() {
        return itemList;
    }

    /**
     * ����itemList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WorkOrderItemList }
     *     
     */
    public void setItemList(WorkOrderItemList value) {
        this.itemList = value;
    }

    /**
     * ��ȡlocation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getLocation() {
        return location;
    }

    /**
     * ����location���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setLocation(RecordRef value) {
        this.location = value;
    }

    /**
     * ��ȡschedulingMethod���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WorkOrderSchedulingMethod }
     *     
     */
    public WorkOrderSchedulingMethod getSchedulingMethod() {
        return schedulingMethod;
    }

    /**
     * ����schedulingMethod���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WorkOrderSchedulingMethod }
     *     
     */
    public void setSchedulingMethod(WorkOrderSchedulingMethod value) {
        this.schedulingMethod = value;
    }

    /**
     * ��ȡsalesTeamList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SalesTeamList }
     *     
     */
    public SalesTeamList getSalesTeamList() {
        return salesTeamList;
    }

    /**
     * ����salesTeamList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SalesTeamList }
     *     
     */
    public void setSalesTeamList(SalesTeamList value) {
        this.salesTeamList = value;
    }

    /**
     * ��ȡpartnersList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PartnersList }
     *     
     */
    public PartnersList getPartnersList() {
        return partnersList;
    }

    /**
     * ����partnersList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PartnersList }
     *     
     */
    public void setPartnersList(PartnersList value) {
        this.partnersList = value;
    }

    /**
     * ��ȡcreatedFrom���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCreatedFrom() {
        return createdFrom;
    }

    /**
     * ����createdFrom���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCreatedFrom(RecordRef value) {
        this.createdFrom = value;
    }

    /**
     * ��ȡsourceTransactionId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceTransactionId() {
        return sourceTransactionId;
    }

    /**
     * ����sourceTransactionId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceTransactionId(String value) {
        this.sourceTransactionId = value;
    }

    /**
     * ��ȡsourceTransactionLine���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSourceTransactionLine() {
        return sourceTransactionLine;
    }

    /**
     * ����sourceTransactionLine���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSourceTransactionLine(Long value) {
        this.sourceTransactionLine = value;
    }

    /**
     * ��ȡspecialOrder���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpecialOrder() {
        return specialOrder;
    }

    /**
     * ����specialOrder���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpecialOrder(Boolean value) {
        this.specialOrder = value;
    }

    /**
     * ��ȡbuildable���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBuildable() {
        return buildable;
    }

    /**
     * ����buildable���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBuildable(Double value) {
        this.buildable = value;
    }

    /**
     * ��ȡoptions���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CustomFieldList }
     *     
     */
    public CustomFieldList getOptions() {
        return options;
    }

    /**
     * ����options���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFieldList }
     *     
     */
    public void setOptions(CustomFieldList value) {
        this.options = value;
    }

    /**
     * ��ȡbuilt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBuilt() {
        return built;
    }

    /**
     * ����built���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBuilt(Double value) {
        this.built = value;
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
     * ��ȡrevision���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getRevision() {
        return revision;
    }

    /**
     * ����revision���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setRevision(RecordRef value) {
        this.revision = value;
    }

    /**
     * ��ȡbillOfMaterialsRevision���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getBillOfMaterialsRevision() {
        return billOfMaterialsRevision;
    }

    /**
     * ����billOfMaterialsRevision���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setBillOfMaterialsRevision(RecordRef value) {
        this.billOfMaterialsRevision = value;
    }

    /**
     * ��ȡsubsidiary���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSubsidiary() {
        return subsidiary;
    }

    /**
     * ����subsidiary���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSubsidiary(RecordRef value) {
        this.subsidiary = value;
    }

    /**
     * ��ȡaccountingBookDetailList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AccountingBookDetailList }
     *     
     */
    public AccountingBookDetailList getAccountingBookDetailList() {
        return accountingBookDetailList;
    }

    /**
     * ����accountingBookDetailList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingBookDetailList }
     *     
     */
    public void setAccountingBookDetailList(AccountingBookDetailList value) {
        this.accountingBookDetailList = value;
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
