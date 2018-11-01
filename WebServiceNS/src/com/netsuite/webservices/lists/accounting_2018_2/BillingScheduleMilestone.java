
package com.netsuite.webservices.lists.accounting_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;


/**
 * <p>BillingScheduleMilestone complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BillingScheduleMilestone">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="milestoneId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="milestoneAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="milestoneTerms" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="projectTask" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="milestoneDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="milestoneCompleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="milestoneActualCompletionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingScheduleMilestone", propOrder = {
    "milestoneId",
    "milestoneAmount",
    "milestoneTerms",
    "projectTask",
    "milestoneDate",
    "milestoneCompleted",
    "milestoneActualCompletionDate",
    "comments"
})
public class BillingScheduleMilestone {

    protected Long milestoneId;
    protected Double milestoneAmount;
    protected RecordRef milestoneTerms;
    protected RecordRef projectTask;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar milestoneDate;
    protected Boolean milestoneCompleted;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar milestoneActualCompletionDate;
    protected String comments;

    /**
     * 获取milestoneId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMilestoneId() {
        return milestoneId;
    }

    /**
     * 设置milestoneId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMilestoneId(Long value) {
        this.milestoneId = value;
    }

    /**
     * 获取milestoneAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMilestoneAmount() {
        return milestoneAmount;
    }

    /**
     * 设置milestoneAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMilestoneAmount(Double value) {
        this.milestoneAmount = value;
    }

    /**
     * 获取milestoneTerms属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getMilestoneTerms() {
        return milestoneTerms;
    }

    /**
     * 设置milestoneTerms属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setMilestoneTerms(RecordRef value) {
        this.milestoneTerms = value;
    }

    /**
     * 获取projectTask属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getProjectTask() {
        return projectTask;
    }

    /**
     * 设置projectTask属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setProjectTask(RecordRef value) {
        this.projectTask = value;
    }

    /**
     * 获取milestoneDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMilestoneDate() {
        return milestoneDate;
    }

    /**
     * 设置milestoneDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMilestoneDate(XMLGregorianCalendar value) {
        this.milestoneDate = value;
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
     * 获取milestoneActualCompletionDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMilestoneActualCompletionDate() {
        return milestoneActualCompletionDate;
    }

    /**
     * 设置milestoneActualCompletionDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMilestoneActualCompletionDate(XMLGregorianCalendar value) {
        this.milestoneActualCompletionDate = value;
    }

    /**
     * 获取comments属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * 设置comments属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

}
