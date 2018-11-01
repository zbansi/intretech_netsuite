
package com.netsuite.webservices.transactions.demandplanning_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.transactions.demandplanning_2018_2.types.DayOfTheWeek;


/**
 * <p>PeriodDemandPlan complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡquantity���Ե�ֵ��
     * 
     */
    public double getQuantity() {
        return quantity;
    }

    /**
     * ����quantity���Ե�ֵ��
     * 
     */
    public void setQuantity(double value) {
        this.quantity = value;
    }

    /**
     * ��ȡdayOfTheWeek���Ե�ֵ��
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
     * ����dayOfTheWeek���Ե�ֵ��
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
