
package com.netsuite.webservices.transactions.employees_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TimeSheetTimeGrid complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TimeSheetTimeGrid">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sunday" type="{urn:employees_2018_2.transactions.webservices.netsuite.com}TimeEntry" minOccurs="0"/>
 *         &lt;element name="monday" type="{urn:employees_2018_2.transactions.webservices.netsuite.com}TimeEntry" minOccurs="0"/>
 *         &lt;element name="tuesday" type="{urn:employees_2018_2.transactions.webservices.netsuite.com}TimeEntry" minOccurs="0"/>
 *         &lt;element name="wednesday" type="{urn:employees_2018_2.transactions.webservices.netsuite.com}TimeEntry" minOccurs="0"/>
 *         &lt;element name="thursday" type="{urn:employees_2018_2.transactions.webservices.netsuite.com}TimeEntry" minOccurs="0"/>
 *         &lt;element name="friday" type="{urn:employees_2018_2.transactions.webservices.netsuite.com}TimeEntry" minOccurs="0"/>
 *         &lt;element name="saturday" type="{urn:employees_2018_2.transactions.webservices.netsuite.com}TimeEntry" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeSheetTimeGrid", propOrder = {
    "sunday",
    "monday",
    "tuesday",
    "wednesday",
    "thursday",
    "friday",
    "saturday"
})
public class TimeSheetTimeGrid {

    protected TimeEntry sunday;
    protected TimeEntry monday;
    protected TimeEntry tuesday;
    protected TimeEntry wednesday;
    protected TimeEntry thursday;
    protected TimeEntry friday;
    protected TimeEntry saturday;

    /**
     * 获取sunday属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TimeEntry }
     *     
     */
    public TimeEntry getSunday() {
        return sunday;
    }

    /**
     * 设置sunday属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimeEntry }
     *     
     */
    public void setSunday(TimeEntry value) {
        this.sunday = value;
    }

    /**
     * 获取monday属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TimeEntry }
     *     
     */
    public TimeEntry getMonday() {
        return monday;
    }

    /**
     * 设置monday属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimeEntry }
     *     
     */
    public void setMonday(TimeEntry value) {
        this.monday = value;
    }

    /**
     * 获取tuesday属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TimeEntry }
     *     
     */
    public TimeEntry getTuesday() {
        return tuesday;
    }

    /**
     * 设置tuesday属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimeEntry }
     *     
     */
    public void setTuesday(TimeEntry value) {
        this.tuesday = value;
    }

    /**
     * 获取wednesday属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TimeEntry }
     *     
     */
    public TimeEntry getWednesday() {
        return wednesday;
    }

    /**
     * 设置wednesday属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimeEntry }
     *     
     */
    public void setWednesday(TimeEntry value) {
        this.wednesday = value;
    }

    /**
     * 获取thursday属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TimeEntry }
     *     
     */
    public TimeEntry getThursday() {
        return thursday;
    }

    /**
     * 设置thursday属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimeEntry }
     *     
     */
    public void setThursday(TimeEntry value) {
        this.thursday = value;
    }

    /**
     * 获取friday属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TimeEntry }
     *     
     */
    public TimeEntry getFriday() {
        return friday;
    }

    /**
     * 设置friday属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimeEntry }
     *     
     */
    public void setFriday(TimeEntry value) {
        this.friday = value;
    }

    /**
     * 获取saturday属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TimeEntry }
     *     
     */
    public TimeEntry getSaturday() {
        return saturday;
    }

    /**
     * 设置saturday属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimeEntry }
     *     
     */
    public void setSaturday(TimeEntry value) {
        this.saturday = value;
    }

}
