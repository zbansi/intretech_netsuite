
package com.netsuite.webservices.transactions.employees_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TimeSheetTimeGrid complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡsunday���Ե�ֵ��
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
     * ����sunday���Ե�ֵ��
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
     * ��ȡmonday���Ե�ֵ��
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
     * ����monday���Ե�ֵ��
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
     * ��ȡtuesday���Ե�ֵ��
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
     * ����tuesday���Ե�ֵ��
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
     * ��ȡwednesday���Ե�ֵ��
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
     * ����wednesday���Ե�ֵ��
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
     * ��ȡthursday���Ե�ֵ��
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
     * ����thursday���Ե�ֵ��
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
     * ��ȡfriday���Ե�ֵ��
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
     * ����friday���Ե�ֵ��
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
     * ��ȡsaturday���Ե�ֵ��
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
     * ����saturday���Ե�ֵ��
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
