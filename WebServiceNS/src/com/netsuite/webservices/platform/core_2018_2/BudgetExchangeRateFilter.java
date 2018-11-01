
package com.netsuite.webservices.platform.core_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BudgetExchangeRateFilter complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BudgetExchangeRateFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="period" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef"/>
 *         &lt;element name="fromSubsidiary" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="toSubsidiary" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BudgetExchangeRateFilter", propOrder = {
    "period",
    "fromSubsidiary",
    "toSubsidiary"
})
public class BudgetExchangeRateFilter {

    @XmlElement(required = true)
    protected RecordRef period;
    protected RecordRef fromSubsidiary;
    protected RecordRef toSubsidiary;

    /**
     * 获取period属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPeriod() {
        return period;
    }

    /**
     * 设置period属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPeriod(RecordRef value) {
        this.period = value;
    }

    /**
     * 获取fromSubsidiary属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getFromSubsidiary() {
        return fromSubsidiary;
    }

    /**
     * 设置fromSubsidiary属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setFromSubsidiary(RecordRef value) {
        this.fromSubsidiary = value;
    }

    /**
     * 获取toSubsidiary属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getToSubsidiary() {
        return toSubsidiary;
    }

    /**
     * 设置toSubsidiary属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setToSubsidiary(RecordRef value) {
        this.toSubsidiary = value;
    }

}
