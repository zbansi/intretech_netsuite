
package com.netsuite.webservices.lists.relationships_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>JobMilestones complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="JobMilestones">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="milestoneName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="milestoneOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="milestoneEstComplete" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="milestoneCompleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="milestoneComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobMilestones", propOrder = {
    "milestoneName",
    "milestoneOrder",
    "milestoneEstComplete",
    "milestoneCompleted",
    "milestoneComments"
})
public class JobMilestones {

    protected String milestoneName;
    protected String milestoneOrder;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar milestoneEstComplete;
    protected Boolean milestoneCompleted;
    protected String milestoneComments;

    /**
     * ��ȡmilestoneName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMilestoneName() {
        return milestoneName;
    }

    /**
     * ����milestoneName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMilestoneName(String value) {
        this.milestoneName = value;
    }

    /**
     * ��ȡmilestoneOrder���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMilestoneOrder() {
        return milestoneOrder;
    }

    /**
     * ����milestoneOrder���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMilestoneOrder(String value) {
        this.milestoneOrder = value;
    }

    /**
     * ��ȡmilestoneEstComplete���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMilestoneEstComplete() {
        return milestoneEstComplete;
    }

    /**
     * ����milestoneEstComplete���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMilestoneEstComplete(XMLGregorianCalendar value) {
        this.milestoneEstComplete = value;
    }

    /**
     * ��ȡmilestoneCompleted���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMilestoneCompleted() {
        return milestoneCompleted;
    }

    /**
     * ����milestoneCompleted���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMilestoneCompleted(Boolean value) {
        this.milestoneCompleted = value;
    }

    /**
     * ��ȡmilestoneComments���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMilestoneComments() {
        return milestoneComments;
    }

    /**
     * ����milestoneComments���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMilestoneComments(String value) {
        this.milestoneComments = value;
    }

}
