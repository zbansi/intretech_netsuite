
package com.netsuite.webservices.platform.core_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.types.DurationUnit;


/**
 * <p>Duration complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡtimeSpan���Ե�ֵ��
     * 
     */
    public double getTimeSpan() {
        return timeSpan;
    }

    /**
     * ����timeSpan���Ե�ֵ��
     * 
     */
    public void setTimeSpan(double value) {
        this.timeSpan = value;
    }

    /**
     * ��ȡunit���Ե�ֵ��
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
     * ����unit���Ե�ֵ��
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
