
package com.netsuite.webservices.platform.core_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.types.CalendarEventAttendeeResponse;


/**
 * <p>UpdateInviteeStatusReference complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取eventId属性的值。
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
     * 设置eventId属性的值。
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
     * 获取responseCode属性的值。
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
     * 设置responseCode属性的值。
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
