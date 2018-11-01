
package com.netsuite.webservices.activities.scheduling_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.activities.scheduling_2018_2.types.CalendarEventAttendeeAttendance;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;
import com.netsuite.webservices.platform.core_2018_2.types.CalendarEventAttendeeResponse;


/**
 * <p>CalendarEventAttendee complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="CalendarEventAttendee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sendEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="attendee" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="response" type="{urn:types.core_2018_2.platform.webservices.netsuite.com}CalendarEventAttendeeResponse" minOccurs="0"/>
 *         &lt;element name="attendance" type="{urn:types.scheduling_2018_2.activities.webservices.netsuite.com}CalendarEventAttendeeAttendance" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalendarEventAttendee", propOrder = {
    "sendEmail",
    "attendee",
    "response",
    "attendance"
})
public class CalendarEventAttendee {

    protected Boolean sendEmail;
    protected RecordRef attendee;
    @XmlSchemaType(name = "string")
    protected CalendarEventAttendeeResponse response;
    @XmlSchemaType(name = "string")
    protected CalendarEventAttendeeAttendance attendance;

    /**
     * ��ȡsendEmail���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendEmail() {
        return sendEmail;
    }

    /**
     * ����sendEmail���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendEmail(Boolean value) {
        this.sendEmail = value;
    }

    /**
     * ��ȡattendee���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getAttendee() {
        return attendee;
    }

    /**
     * ����attendee���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setAttendee(RecordRef value) {
        this.attendee = value;
    }

    /**
     * ��ȡresponse���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CalendarEventAttendeeResponse }
     *     
     */
    public CalendarEventAttendeeResponse getResponse() {
        return response;
    }

    /**
     * ����response���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarEventAttendeeResponse }
     *     
     */
    public void setResponse(CalendarEventAttendeeResponse value) {
        this.response = value;
    }

    /**
     * ��ȡattendance���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CalendarEventAttendeeAttendance }
     *     
     */
    public CalendarEventAttendeeAttendance getAttendance() {
        return attendance;
    }

    /**
     * ����attendance���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarEventAttendeeAttendance }
     *     
     */
    public void setAttendance(CalendarEventAttendeeAttendance value) {
        this.attendance = value;
    }

}
