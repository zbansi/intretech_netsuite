
package com.netsuite.webservices.transactions.inventory_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WorkOrderCompletionOperation complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="WorkOrderCompletionOperation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="operationSequence" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="operationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workCenter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="machineResources" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="laborResources" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="inputQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="quantityRemaining" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="predecessorCompletedQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="completedQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="recordSetup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="machineSetupTime" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="laborSetupTime" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="machineRunTime" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="laborRunTime" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkOrderCompletionOperation", propOrder = {
    "operationSequence",
    "operationName",
    "workCenter",
    "machineResources",
    "laborResources",
    "inputQuantity",
    "quantityRemaining",
    "predecessorCompletedQuantity",
    "completedQuantity",
    "recordSetup",
    "machineSetupTime",
    "laborSetupTime",
    "machineRunTime",
    "laborRunTime"
})
public class WorkOrderCompletionOperation {

    protected Long operationSequence;
    protected String operationName;
    protected String workCenter;
    protected Long machineResources;
    protected Long laborResources;
    protected Double inputQuantity;
    protected Double quantityRemaining;
    protected Double predecessorCompletedQuantity;
    protected Double completedQuantity;
    protected Boolean recordSetup;
    protected Double machineSetupTime;
    protected Double laborSetupTime;
    protected Double machineRunTime;
    protected Double laborRunTime;

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
     * 获取workCenter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkCenter() {
        return workCenter;
    }

    /**
     * 设置workCenter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkCenter(String value) {
        this.workCenter = value;
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
     * 获取quantityRemaining属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantityRemaining() {
        return quantityRemaining;
    }

    /**
     * 设置quantityRemaining属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantityRemaining(Double value) {
        this.quantityRemaining = value;
    }

    /**
     * 获取predecessorCompletedQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPredecessorCompletedQuantity() {
        return predecessorCompletedQuantity;
    }

    /**
     * 设置predecessorCompletedQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPredecessorCompletedQuantity(Double value) {
        this.predecessorCompletedQuantity = value;
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
     * 获取recordSetup属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecordSetup() {
        return recordSetup;
    }

    /**
     * 设置recordSetup属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecordSetup(Boolean value) {
        this.recordSetup = value;
    }

    /**
     * 获取machineSetupTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMachineSetupTime() {
        return machineSetupTime;
    }

    /**
     * 设置machineSetupTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMachineSetupTime(Double value) {
        this.machineSetupTime = value;
    }

    /**
     * 获取laborSetupTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLaborSetupTime() {
        return laborSetupTime;
    }

    /**
     * 设置laborSetupTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLaborSetupTime(Double value) {
        this.laborSetupTime = value;
    }

    /**
     * 获取machineRunTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMachineRunTime() {
        return machineRunTime;
    }

    /**
     * 设置machineRunTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMachineRunTime(Double value) {
        this.machineRunTime = value;
    }

    /**
     * 获取laborRunTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLaborRunTime() {
        return laborRunTime;
    }

    /**
     * 设置laborRunTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLaborRunTime(Double value) {
        this.laborRunTime = value;
    }

}
