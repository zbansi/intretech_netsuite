
package com.netsuite.webservices.lists.supplychain_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.lists.supplychain_2018_2.types.ManufacturingLagType;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;


/**
 * <p>ManufacturingRoutingRoutingStep complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取operationName属性的值。
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
     * 设置operationName属性的值。
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
     * 获取lagType属性的值。
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
     * 设置lagType属性的值。
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
     * 获取lagAmount属性的值。
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
     * 设置lagAmount属性的值。
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
     * 获取lagUnits属性的值。
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
     * 设置lagUnits属性的值。
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
