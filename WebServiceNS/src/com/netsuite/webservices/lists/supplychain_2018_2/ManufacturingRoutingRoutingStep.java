
package com.netsuite.webservices.lists.supplychain_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.lists.supplychain_2018_2.types.ManufacturingLagType;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;


/**
 * <p>ManufacturingRoutingRoutingStep complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ManufacturingRoutingRoutingStep">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="operationSequence" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="operationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manufacturingWorkCenter" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="machineResources" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="laborResources" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="manufacturingCostTemplate" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="setupTime" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="runRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="lagType" type="{urn:types.supplychain_2018_2.lists.webservices.netsuite.com}ManufacturingLagType" minOccurs="0"/>
 *         &lt;element name="lagAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="lagUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManufacturingRoutingRoutingStep", propOrder = {
    "operationSequence",
    "operationName",
    "manufacturingWorkCenter",
    "machineResources",
    "laborResources",
    "manufacturingCostTemplate",
    "setupTime",
    "runRate",
    "lagType",
    "lagAmount",
    "lagUnits"
})
public class ManufacturingRoutingRoutingStep {

    protected Long operationSequence;
    protected String operationName;
    protected RecordRef manufacturingWorkCenter;
    protected Long machineResources;
    protected Long laborResources;
    protected RecordRef manufacturingCostTemplate;
    protected Double setupTime;
    protected Double runRate;
    @XmlSchemaType(name = "string")
    protected ManufacturingLagType lagType;
    protected Long lagAmount;
    protected String lagUnits;

    /**
     * ��ȡoperationSequence���Ե�ֵ��
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
     * ����operationSequence���Ե�ֵ��
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
     * ��ȡoperationName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationName() {
        return operationName;
    }

    /**
     * ����operationName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationName(String value) {
        this.operationName = value;
    }

    /**
     * ��ȡmanufacturingWorkCenter���Ե�ֵ��
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
     * ����manufacturingWorkCenter���Ե�ֵ��
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
     * ��ȡmachineResources���Ե�ֵ��
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
     * ����machineResources���Ե�ֵ��
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
     * ��ȡlaborResources���Ե�ֵ��
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
     * ����laborResources���Ե�ֵ��
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
     * ��ȡmanufacturingCostTemplate���Ե�ֵ��
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
     * ����manufacturingCostTemplate���Ե�ֵ��
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
     * ��ȡsetupTime���Ե�ֵ��
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
     * ����setupTime���Ե�ֵ��
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
     * ��ȡrunRate���Ե�ֵ��
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
     * ����runRate���Ե�ֵ��
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
     * ��ȡlagType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ManufacturingLagType }
     *     
     */
    public ManufacturingLagType getLagType() {
        return lagType;
    }

    /**
     * ����lagType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ManufacturingLagType }
     *     
     */
    public void setLagType(ManufacturingLagType value) {
        this.lagType = value;
    }

    /**
     * ��ȡlagAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLagAmount() {
        return lagAmount;
    }

    /**
     * ����lagAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLagAmount(Long value) {
        this.lagAmount = value;
    }

    /**
     * ��ȡlagUnits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLagUnits() {
        return lagUnits;
    }

    /**
     * ����lagUnits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLagUnits(String value) {
        this.lagUnits = value;
    }

}
