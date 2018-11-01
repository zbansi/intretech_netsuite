
package com.netsuite.webservices.lists.marketing_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>CampaignEventResponse complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡname���Ե�ֵ��
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
     * ����name���Ե�ֵ��
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
     * ��ȡtype���Ե�ֵ��
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
     * ����type���Ե�ֵ��
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
     * ��ȡdateSent���Ե�ֵ��
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
     * ����dateSent���Ե�ֵ��
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
     * ��ȡsent���Ե�ֵ��
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
     * ����sent���Ե�ֵ��
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
     * ��ȡopened���Ե�ֵ��
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
     * ����opened���Ե�ֵ��
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
     * ��ȡopenedRatio���Ե�ֵ��
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
     * ����openedRatio���Ե�ֵ��
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
     * ��ȡclickedThru���Ե�ֵ��
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
     * ����clickedThru���Ե�ֵ��
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
     * ��ȡclickedThruRatio���Ե�ֵ��
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
     * ����clickedThruRatio���Ե�ֵ��
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
     * ��ȡresponded���Ե�ֵ��
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
     * ����responded���Ե�ֵ��
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
     * ��ȡrespondedRatio���Ե�ֵ��
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
     * ����respondedRatio���Ե�ֵ��
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
     * ��ȡunsubscribed���Ե�ֵ��
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
     * ����unsubscribed���Ե�ֵ��
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
     * ��ȡunsubscribedRatio���Ե�ֵ��
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
     * ����unsubscribedRatio���Ե�ֵ��
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
     * ��ȡbounced���Ե�ֵ��
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
     * ����bounced���Ե�ֵ��
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
     * ��ȡbouncedRatio���Ե�ֵ��
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
     * ����bouncedRatio���Ե�ֵ��
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
