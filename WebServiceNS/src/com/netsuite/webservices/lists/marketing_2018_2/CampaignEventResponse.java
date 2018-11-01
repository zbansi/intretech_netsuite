
package com.netsuite.webservices.lists.marketing_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>CampaignEventResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CampaignEventResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateSent" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="sent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="opened" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="openedRatio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="clickedThru" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="clickedThruRatio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="responded" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="respondedRatio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="unsubscribed" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="unsubscribedRatio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="bounced" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="bouncedRatio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampaignEventResponse", propOrder = {
    "name",
    "type",
    "dateSent",
    "sent",
    "opened",
    "openedRatio",
    "clickedThru",
    "clickedThruRatio",
    "responded",
    "respondedRatio",
    "unsubscribed",
    "unsubscribedRatio",
    "bounced",
    "bouncedRatio"
})
public class CampaignEventResponse {

    protected String name;
    protected String type;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateSent;
    protected Double sent;
    protected Double opened;
    protected Double openedRatio;
    protected Double clickedThru;
    protected Double clickedThruRatio;
    protected Long responded;
    protected Double respondedRatio;
    protected Long unsubscribed;
    protected Double unsubscribedRatio;
    protected Long bounced;
    protected Double bouncedRatio;

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * 获取dateSent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateSent() {
        return dateSent;
    }

    /**
     * 设置dateSent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateSent(XMLGregorianCalendar value) {
        this.dateSent = value;
    }

    /**
     * 获取sent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSent() {
        return sent;
    }

    /**
     * 设置sent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSent(Double value) {
        this.sent = value;
    }

    /**
     * 获取opened属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOpened() {
        return opened;
    }

    /**
     * 设置opened属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOpened(Double value) {
        this.opened = value;
    }

    /**
     * 获取openedRatio属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOpenedRatio() {
        return openedRatio;
    }

    /**
     * 设置openedRatio属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOpenedRatio(Double value) {
        this.openedRatio = value;
    }

    /**
     * 获取clickedThru属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getClickedThru() {
        return clickedThru;
    }

    /**
     * 设置clickedThru属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setClickedThru(Double value) {
        this.clickedThru = value;
    }

    /**
     * 获取clickedThruRatio属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getClickedThruRatio() {
        return clickedThruRatio;
    }

    /**
     * 设置clickedThruRatio属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setClickedThruRatio(Double value) {
        this.clickedThruRatio = value;
    }

    /**
     * 获取responded属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getResponded() {
        return responded;
    }

    /**
     * 设置responded属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setResponded(Long value) {
        this.responded = value;
    }

    /**
     * 获取respondedRatio属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRespondedRatio() {
        return respondedRatio;
    }

    /**
     * 设置respondedRatio属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRespondedRatio(Double value) {
        this.respondedRatio = value;
    }

    /**
     * 获取unsubscribed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUnsubscribed() {
        return unsubscribed;
    }

    /**
     * 设置unsubscribed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUnsubscribed(Long value) {
        this.unsubscribed = value;
    }

    /**
     * 获取unsubscribedRatio属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUnsubscribedRatio() {
        return unsubscribedRatio;
    }

    /**
     * 设置unsubscribedRatio属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUnsubscribedRatio(Double value) {
        this.unsubscribedRatio = value;
    }

    /**
     * 获取bounced属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBounced() {
        return bounced;
    }

    /**
     * 设置bounced属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBounced(Long value) {
        this.bounced = value;
    }

    /**
     * 获取bouncedRatio属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBouncedRatio() {
        return bouncedRatio;
    }

    /**
     * 设置bouncedRatio属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBouncedRatio(Double value) {
        this.bouncedRatio = value;
    }

}
