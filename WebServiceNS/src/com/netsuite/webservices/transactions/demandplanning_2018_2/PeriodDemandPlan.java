
package com.netsuite.webservices.transactions.demandplanning_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.transactions.demandplanning_2018_2.types.DayOfTheWeek;


/**
 * <p>PeriodDemandPlan complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PeriodDemandPlan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="dayOfTheWeek" type="{urn:types.demandplanning_2018_2.transactions.webservices.netsuite.com}DayOfTheWeek" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeriodDemandPlan", propOrder = {
    "quantity",
    "dayOfTheWeek"
})
public class PeriodDemandPlan {

    protected double quantity;
    @XmlSchemaType(name = "string")
    protected DayOfTheWeek dayOfTheWeek;

    /**
     * 获取quantity属性的值。
     * 
     */
    public double getQuantity() {
        return quantity;
    }

    /**
     * 设置quantity属性的值。
     * 
     */
    public void setQuantity(double value) {
        this.quantity = value;
    }

    /**
     * 获取dayOfTheWeek属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DayOfTheWeek }
     *     
     */
    public DayOfTheWeek getDayOfTheWeek() {
        return dayOfTheWeek;
    }

    /**
     * 设置dayOfTheWeek属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfTheWeek }
     *     
     */
    public void setDayOfTheWeek(DayOfTheWeek value) {
        this.dayOfTheWeek = value;
    }

}
