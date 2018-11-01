
package com.netsuite.webservices.lists.supplychain_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.lists.supplychain_2018_2.types.ManufacturingLagType;
import com.netsuite.webservices.lists.supplychain_2018_2.types.ManufacturingOperationTaskPredecessorPredecessorType;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;


/**
 * <p>ManufacturingOperationTaskPredecessor complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ManufacturingOperationTaskPredecessor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="task" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="type" type="{urn:types.supplychain_2018_2.lists.webservices.netsuite.com}ManufacturingOperationTaskPredecessorPredecessorType" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
@XmlType(name = "ManufacturingOperationTaskPredecessor", propOrder = {
    "task",
    "type",
    "startDate",
    "endDate",
    "lagType",
    "lagAmount",
    "lagUnits"
})
public class ManufacturingOperationTaskPredecessor {

    protected RecordRef task;
    @XmlSchemaType(name = "string")
    protected ManufacturingOperationTaskPredecessorPredecessorType type;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlSchemaType(name = "string")
    protected ManufacturingLagType lagType;
    protected Long lagAmount;
    protected String lagUnits;

    /**
     * 获取task属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getTask() {
        return task;
    }

    /**
     * 设置task属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setTask(RecordRef value) {
        this.task = value;
    }

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ManufacturingOperationTaskPredecessorPredecessorType }
     *     
     */
    public ManufacturingOperationTaskPredecessorPredecessorType getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ManufacturingOperationTaskPredecessorPredecessorType }
     *     
     */
    public void setType(ManufacturingOperationTaskPredecessorPredecessorType value) {
        this.type = value;
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
