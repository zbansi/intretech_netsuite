
package com.netsuite.webservices.platform.common_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.SearchDateField;
import com.netsuite.webservices.platform.core_2018_2.SearchDoubleField;
import com.netsuite.webservices.platform.core_2018_2.SearchLongField;
import com.netsuite.webservices.platform.core_2018_2.SearchMultiSelectField;
import com.netsuite.webservices.platform.core_2018_2.SearchRecordBasic;
import com.netsuite.webservices.platform.core_2018_2.SearchStringField;


/**
 * <p>ProjectTaskAssignmentSearchBasic complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ProjectTaskAssignmentSearchBasic">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRecordBasic">
 *       &lt;sequence>
 *         &lt;element name="actualWork" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="cost" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="costBase" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="endDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="estimatedWork" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="estimatedWorkBaseline" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="grossProfit" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="grossProfitBase" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="internalId" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="internalIdNumber" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="price" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="priceBase" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="resource" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="resourceName" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="serviceItem" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="serviceItemDesc" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="startDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="unitCost" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="unitCostBase" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="unitPrice" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="unitPriceBase" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="units" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="workCalendar" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectTaskAssignmentSearchBasic", propOrder = {
    "actualWork",
    "cost",
    "costBase",
    "endDate",
    "estimatedWork",
    "estimatedWorkBaseline",
    "grossProfit",
    "grossProfitBase",
    "internalId",
    "internalIdNumber",
    "price",
    "priceBase",
    "resource",
    "resourceName",
    "serviceItem",
    "serviceItemDesc",
    "startDate",
    "unitCost",
    "unitCostBase",
    "unitPrice",
    "unitPriceBase",
    "units",
    "workCalendar"
})
public class ProjectTaskAssignmentSearchBasic
    extends SearchRecordBasic
{

    protected SearchDoubleField actualWork;
    protected SearchDoubleField cost;
    protected SearchDoubleField costBase;
    protected SearchDateField endDate;
    protected SearchDoubleField estimatedWork;
    protected SearchDoubleField estimatedWorkBaseline;
    protected SearchDoubleField grossProfit;
    protected SearchDoubleField grossProfitBase;
    protected SearchMultiSelectField internalId;
    protected SearchLongField internalIdNumber;
    protected SearchDoubleField price;
    protected SearchDoubleField priceBase;
    protected SearchMultiSelectField resource;
    protected SearchStringField resourceName;
    protected SearchStringField serviceItem;
    protected SearchStringField serviceItemDesc;
    protected SearchDateField startDate;
    protected SearchDoubleField unitCost;
    protected SearchDoubleField unitCostBase;
    protected SearchDoubleField unitPrice;
    protected SearchDoubleField unitPriceBase;
    protected SearchDoubleField units;
    protected SearchMultiSelectField workCalendar;

    /**
     * ��ȡactualWork���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getActualWork() {
        return actualWork;
    }

    /**
     * ����actualWork���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setActualWork(SearchDoubleField value) {
        this.actualWork = value;
    }

    /**
     * ��ȡcost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getCost() {
        return cost;
    }

    /**
     * ����cost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setCost(SearchDoubleField value) {
        this.cost = value;
    }

    /**
     * ��ȡcostBase���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getCostBase() {
        return costBase;
    }

    /**
     * ����costBase���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setCostBase(SearchDoubleField value) {
        this.costBase = value;
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
     * ��ȡestimatedWorkBaseline���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getEstimatedWorkBaseline() {
        return estimatedWorkBaseline;
    }

    /**
     * ����estimatedWorkBaseline���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setEstimatedWorkBaseline(SearchDoubleField value) {
        this.estimatedWorkBaseline = value;
    }

    /**
     * ��ȡgrossProfit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getGrossProfit() {
        return grossProfit;
    }

    /**
     * ����grossProfit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setGrossProfit(SearchDoubleField value) {
        this.grossProfit = value;
    }

    /**
     * ��ȡgrossProfitBase���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getGrossProfitBase() {
        return grossProfitBase;
    }

    /**
     * ����grossProfitBase���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setGrossProfitBase(SearchDoubleField value) {
        this.grossProfitBase = value;
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
     * ��ȡprice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getPrice() {
        return price;
    }

    /**
     * ����price���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setPrice(SearchDoubleField value) {
        this.price = value;
    }

    /**
     * ��ȡpriceBase���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getPriceBase() {
        return priceBase;
    }

    /**
     * ����priceBase���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setPriceBase(SearchDoubleField value) {
        this.priceBase = value;
    }

    /**
     * ��ȡresource���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getResource() {
        return resource;
    }

    /**
     * ����resource���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setResource(SearchMultiSelectField value) {
        this.resource = value;
    }

    /**
     * ��ȡresourceName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getResourceName() {
        return resourceName;
    }

    /**
     * ����resourceName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setResourceName(SearchStringField value) {
        this.resourceName = value;
    }

    /**
     * ��ȡserviceItem���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getServiceItem() {
        return serviceItem;
    }

    /**
     * ����serviceItem���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setServiceItem(SearchStringField value) {
        this.serviceItem = value;
    }

    /**
     * ��ȡserviceItemDesc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getServiceItemDesc() {
        return serviceItemDesc;
    }

    /**
     * ����serviceItemDesc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setServiceItemDesc(SearchStringField value) {
        this.serviceItemDesc = value;
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
     * ��ȡunitCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getUnitCost() {
        return unitCost;
    }

    /**
     * ����unitCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setUnitCost(SearchDoubleField value) {
        this.unitCost = value;
    }

    /**
     * ��ȡunitCostBase���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getUnitCostBase() {
        return unitCostBase;
    }

    /**
     * ����unitCostBase���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setUnitCostBase(SearchDoubleField value) {
        this.unitCostBase = value;
    }

    /**
     * ��ȡunitPrice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getUnitPrice() {
        return unitPrice;
    }

    /**
     * ����unitPrice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setUnitPrice(SearchDoubleField value) {
        this.unitPrice = value;
    }

    /**
     * ��ȡunitPriceBase���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getUnitPriceBase() {
        return unitPriceBase;
    }

    /**
     * ����unitPriceBase���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setUnitPriceBase(SearchDoubleField value) {
        this.unitPriceBase = value;
    }

    /**
     * ��ȡunits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getUnits() {
        return units;
    }

    /**
     * ����units���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setUnits(SearchDoubleField value) {
        this.units = value;
    }

    /**
     * ��ȡworkCalendar���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getWorkCalendar() {
        return workCalendar;
    }

    /**
     * ����workCalendar���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setWorkCalendar(SearchMultiSelectField value) {
        this.workCalendar = value;
    }

}
