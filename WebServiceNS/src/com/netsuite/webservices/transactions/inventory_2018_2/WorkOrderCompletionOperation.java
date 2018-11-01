
package com.netsuite.webservices.transactions.inventory_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WorkOrderCompletionOperation complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡworkCenter���Ե�ֵ��
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
     * ����workCenter���Ե�ֵ��
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
     * ��ȡinputQuantity���Ե�ֵ��
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
     * ����inputQuantity���Ե�ֵ��
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
     * ��ȡquantityRemaining���Ե�ֵ��
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
     * ����quantityRemaining���Ե�ֵ��
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
     * ��ȡpredecessorCompletedQuantity���Ե�ֵ��
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
     * ����predecessorCompletedQuantity���Ե�ֵ��
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
     * ��ȡcompletedQuantity���Ե�ֵ��
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
     * ����completedQuantity���Ե�ֵ��
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
     * ��ȡrecordSetup���Ե�ֵ��
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
     * ����recordSetup���Ե�ֵ��
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
     * ��ȡmachineSetupTime���Ե�ֵ��
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
     * ����machineSetupTime���Ե�ֵ��
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
     * ��ȡlaborSetupTime���Ե�ֵ��
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
     * ����laborSetupTime���Ե�ֵ��
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
     * ��ȡmachineRunTime���Ե�ֵ��
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
     * ����machineRunTime���Ե�ֵ��
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
     * ��ȡlaborRunTime���Ե�ֵ��
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
     * ����laborRunTime���Ե�ֵ��
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
