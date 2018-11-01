
package com.netsuite.webservices.lists.relationships_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>JobMilestones complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取milestoneName属性的值。
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
     * 设置milestoneName属性的值。
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
     * 获取milestoneOrder属性的值。
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
     * 设置milestoneOrder属性的值。
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
     * 获取milestoneEstComplete属性的值。
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
     * 设置milestoneEstComplete属性的值。
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
     * 获取milestoneCompleted属性的值。
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
     * 设置milestoneCompleted属性的值。
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
     * 获取milestoneComments属性的值。
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
     * 设置milestoneComments属性的值。
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
