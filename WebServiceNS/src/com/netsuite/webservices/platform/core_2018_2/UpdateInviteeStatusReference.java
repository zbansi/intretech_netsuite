
package com.netsuite.webservices.platform.core_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.types.CalendarEventAttendeeResponse;


/**
 * <p>UpdateInviteeStatusReference complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="UpdateInviteeStatusReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eventId" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef"/>
 *         &lt;element name="responseCode" type="{urn:types.core_2018_2.platform.webservices.netsuite.com}CalendarEventAttendeeResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateInviteeStatusReference", propOrder = {
    "eventId",
    "responseCode"
})
public class UpdateInviteeStatusReference {

    @XmlElement(required = true)
    protected RecordRef eventId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CalendarEventAttendeeResponse responseCode;

    /**
     * ��ȡeventId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getEventId() {
        return eventId;
    }

    /**
     * ����eventId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setEventId(RecordRef value) {
        this.eventId = value;
    }

    /**
     * ��ȡresponseCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CalendarEventAttendeeResponse }
     *     
     */
    public CalendarEventAttendeeResponse getResponseCode() {
        return responseCode;
    }

    /**
     * ����responseCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarEventAttendeeResponse }
     *     
     */
    public void setResponseCode(CalendarEventAttendeeResponse value) {
        this.responseCode = value;
    }

}
