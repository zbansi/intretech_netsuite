
package com.netsuite.webservices.lists.accounting_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.lists.accounting_2018_2.types.RevRecScheduleAmortizationType;
import com.netsuite.webservices.lists.accounting_2018_2.types.RevRecScheduleRecogIntervalSrc;
import com.netsuite.webservices.lists.accounting_2018_2.types.RevRecScheduleRecurrenceType;
import com.netsuite.webservices.platform.core_2018_2.Record;


/**
 * <p>RevRecTemplate complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RevRecTemplate">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}Record">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amortizationType" type="{urn:types.accounting_2018_2.lists.webservices.netsuite.com}RevRecScheduleAmortizationType" minOccurs="0"/>
 *         &lt;element name="recurrenceType" type="{urn:types.accounting_2018_2.lists.webservices.netsuite.com}RevRecScheduleRecurrenceType" minOccurs="0"/>
 *         &lt;element name="recogIntervalSrc" type="{urn:types.accounting_2018_2.lists.webservices.netsuite.com}RevRecScheduleRecogIntervalSrc" minOccurs="0"/>
 *         &lt;element name="amortizationPeriod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="periodOffset" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="revRecOffset" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="initialAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="isInactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="recurrenceList" type="{urn:accounting_2018_2.lists.webservices.netsuite.com}RevRecTemplateRecurrenceList" minOccurs="0"/>
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
@XmlType(name = "RevRecTemplate", propOrder = {
    "name",
    "amortizationType",
    "recurrenceType",
    "recogIntervalSrc",
    "amortizationPeriod",
    "periodOffset",
    "revRecOffset",
    "initialAmount",
    "isInactive",
    "recurrenceList"
})
public class RevRecTemplate
    extends Record
{

    protected String name;
    @XmlSchemaType(name = "string")
    protected RevRecScheduleAmortizationType amortizationType;
    @XmlSchemaType(name = "string")
    protected RevRecScheduleRecurrenceType recurrenceType;
    @XmlSchemaType(name = "string")
    protected RevRecScheduleRecogIntervalSrc recogIntervalSrc;
    protected Long amortizationPeriod;
    protected Long periodOffset;
    protected Long revRecOffset;
    protected Double initialAmount;
    protected Boolean isInactive;
    protected RevRecTemplateRecurrenceList recurrenceList;
    @XmlAttribute(name = "internalId")
    protected String internalId;
    @XmlAttribute(name = "externalId")
    protected String externalId;

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取amortizationType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RevRecScheduleAmortizationType }
     *     
     */
    public RevRecScheduleAmortizationType getAmortizationType() {
        return amortizationType;
    }

    /**
     * 设置amortizationType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RevRecScheduleAmortizationType }
     *     
     */
    public void setAmortizationType(RevRecScheduleAmortizationType value) {
        this.amortizationType = value;
    }

    /**
     * 获取recurrenceType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RevRecScheduleRecurrenceType }
     *     
     */
    public RevRecScheduleRecurrenceType getRecurrenceType() {
        return recurrenceType;
    }

    /**
     * 设置recurrenceType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RevRecScheduleRecurrenceType }
     *     
     */
    public void setRecurrenceType(RevRecScheduleRecurrenceType value) {
        this.recurrenceType = value;
    }

    /**
     * 获取recogIntervalSrc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RevRecScheduleRecogIntervalSrc }
     *     
     */
    public RevRecScheduleRecogIntervalSrc getRecogIntervalSrc() {
        return recogIntervalSrc;
    }

    /**
     * 设置recogIntervalSrc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RevRecScheduleRecogIntervalSrc }
     *     
     */
    public void setRecogIntervalSrc(RevRecScheduleRecogIntervalSrc value) {
        this.recogIntervalSrc = value;
    }

    /**
     * 获取amortizationPeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAmortizationPeriod() {
        return amortizationPeriod;
    }

    /**
     * 设置amortizationPeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAmortizationPeriod(Long value) {
        this.amortizationPeriod = value;
    }

    /**
     * 获取periodOffset属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPeriodOffset() {
        return periodOffset;
    }

    /**
     * 设置periodOffset属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPeriodOffset(Long value) {
        this.periodOffset = value;
    }

    /**
     * 获取revRecOffset属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRevRecOffset() {
        return revRecOffset;
    }

    /**
     * 设置revRecOffset属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRevRecOffset(Long value) {
        this.revRecOffset = value;
    }

    /**
     * 获取initialAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInitialAmount() {
        return initialAmount;
    }

    /**
     * 设置initialAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInitialAmount(Double value) {
        this.initialAmount = value;
    }

    /**
     * 获取isInactive属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInactive() {
        return isInactive;
    }

    /**
     * 设置isInactive属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInactive(Boolean value) {
        this.isInactive = value;
    }

    /**
     * 获取recurrenceList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RevRecTemplateRecurrenceList }
     *     
     */
    public RevRecTemplateRecurrenceList getRecurrenceList() {
        return recurrenceList;
    }

    /**
     * 设置recurrenceList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RevRecTemplateRecurrenceList }
     *     
     */
    public void setRecurrenceList(RevRecTemplateRecurrenceList value) {
        this.recurrenceList = value;
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
