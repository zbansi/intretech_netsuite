
package com.netsuite.webservices.platform.core_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.types.DurationUnit;


/**
 * <p>Duration complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Duration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="timeSpan" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="unit" type="{urn:types.core_2018_2.platform.webservices.netsuite.com}DurationUnit"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Duration", propOrder = {
    "timeSpan",
    "unit"
})
public class Duration {

    protected double timeSpan;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DurationUnit unit;

    /**
     * 获取timeSpan属性的值。
     * 
     */
    public double getTimeSpan() {
        return timeSpan;
    }

    /**
     * 设置timeSpan属性的值。
     * 
     */
    public void setTimeSpan(double value) {
        this.timeSpan = value;
    }

    /**
     * 获取unit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DurationUnit }
     *     
     */
    public DurationUnit getUnit() {
        return unit;
    }

    /**
     * 设置unit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DurationUnit }
     *     
     */
    public void setUnit(DurationUnit value) {
        this.unit = value;
    }

}
