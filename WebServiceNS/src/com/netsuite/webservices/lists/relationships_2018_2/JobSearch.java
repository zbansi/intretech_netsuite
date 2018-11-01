
package com.netsuite.webservices.lists.relationships_2018_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_2.BillingAccountSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.BillingScheduleSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.ContactSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.CustomSearchJoin;
import com.netsuite.webservices.platform.common_2018_2.CustomerSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.JobSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.ProjectTaskSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.ResourceAllocationSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.TaskSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.TimeBillSearchBasic;
import com.netsuite.webservices.platform.core_2018_2.SearchRecord;


/**
 * <p>JobSearch complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="JobSearch">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRecord">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2018_2.platform.webservices.netsuite.com}JobSearchBasic" minOccurs="0"/>
 *         &lt;element name="billingAccountJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}BillingAccountSearchBasic" minOccurs="0"/>
 *         &lt;element name="billingScheduleJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}BillingScheduleSearchBasic" minOccurs="0"/>
 *         &lt;element name="contactPrimaryJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ContactSearchBasic" minOccurs="0"/>
 *         &lt;element name="customerJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}CustomerSearchBasic" minOccurs="0"/>
 *         &lt;element name="projectTaskJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ProjectTaskSearchBasic" minOccurs="0"/>
 *         &lt;element name="resourceAllocationJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ResourceAllocationSearchBasic" minOccurs="0"/>
 *         &lt;element name="taskJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TaskSearchBasic" minOccurs="0"/>
 *         &lt;element name="timeJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TimeBillSearchBasic" minOccurs="0"/>
 *         &lt;element name="customSearchJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}CustomSearchJoin" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobSearch", propOrder = {
    "basic",
    "billingAccountJoin",
    "billingScheduleJoin",
    "contactPrimaryJoin",
    "customerJoin",
    "projectTaskJoin",
    "resourceAllocationJoin",
    "taskJoin",
    "timeJoin",
    "customSearchJoin"
})
public class JobSearch
    extends SearchRecord
{

    protected JobSearchBasic basic;
    protected BillingAccountSearchBasic billingAccountJoin;
    protected BillingScheduleSearchBasic billingScheduleJoin;
    protected ContactSearchBasic contactPrimaryJoin;
    protected CustomerSearchBasic customerJoin;
    protected ProjectTaskSearchBasic projectTaskJoin;
    protected ResourceAllocationSearchBasic resourceAllocationJoin;
    protected TaskSearchBasic taskJoin;
    protected TimeBillSearchBasic timeJoin;
    protected List<CustomSearchJoin> customSearchJoin;

    /**
     * 获取basic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JobSearchBasic }
     *     
     */
    public JobSearchBasic getBasic() {
        return basic;
    }

    /**
     * 设置basic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JobSearchBasic }
     *     
     */
    public void setBasic(JobSearchBasic value) {
        this.basic = value;
    }

    /**
     * 获取billingAccountJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BillingAccountSearchBasic }
     *     
     */
    public BillingAccountSearchBasic getBillingAccountJoin() {
        return billingAccountJoin;
    }

    /**
     * 设置billingAccountJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BillingAccountSearchBasic }
     *     
     */
    public void setBillingAccountJoin(BillingAccountSearchBasic value) {
        this.billingAccountJoin = value;
    }

    /**
     * 获取billingScheduleJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BillingScheduleSearchBasic }
     *     
     */
    public BillingScheduleSearchBasic getBillingScheduleJoin() {
        return billingScheduleJoin;
    }

    /**
     * 设置billingScheduleJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BillingScheduleSearchBasic }
     *     
     */
    public void setBillingScheduleJoin(BillingScheduleSearchBasic value) {
        this.billingScheduleJoin = value;
    }

    /**
     * 获取contactPrimaryJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ContactSearchBasic }
     *     
     */
    public ContactSearchBasic getContactPrimaryJoin() {
        return contactPrimaryJoin;
    }

    /**
     * 设置contactPrimaryJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ContactSearchBasic }
     *     
     */
    public void setContactPrimaryJoin(ContactSearchBasic value) {
        this.contactPrimaryJoin = value;
    }

    /**
     * 获取customerJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomerSearchBasic }
     *     
     */
    public CustomerSearchBasic getCustomerJoin() {
        return customerJoin;
    }

    /**
     * 设置customerJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSearchBasic }
     *     
     */
    public void setCustomerJoin(CustomerSearchBasic value) {
        this.customerJoin = value;
    }

    /**
     * 获取projectTaskJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProjectTaskSearchBasic }
     *     
     */
    public ProjectTaskSearchBasic getProjectTaskJoin() {
        return projectTaskJoin;
    }

    /**
     * 设置projectTaskJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectTaskSearchBasic }
     *     
     */
    public void setProjectTaskJoin(ProjectTaskSearchBasic value) {
        this.projectTaskJoin = value;
    }

    /**
     * 获取resourceAllocationJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResourceAllocationSearchBasic }
     *     
     */
    public ResourceAllocationSearchBasic getResourceAllocationJoin() {
        return resourceAllocationJoin;
    }

    /**
     * 设置resourceAllocationJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceAllocationSearchBasic }
     *     
     */
    public void setResourceAllocationJoin(ResourceAllocationSearchBasic value) {
        this.resourceAllocationJoin = value;
    }

    /**
     * 获取taskJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TaskSearchBasic }
     *     
     */
    public TaskSearchBasic getTaskJoin() {
        return taskJoin;
    }

    /**
     * 设置taskJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TaskSearchBasic }
     *     
     */
    public void setTaskJoin(TaskSearchBasic value) {
        this.taskJoin = value;
    }

    /**
     * 获取timeJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TimeBillSearchBasic }
     *     
     */
    public TimeBillSearchBasic getTimeJoin() {
        return timeJoin;
    }

    /**
     * 设置timeJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimeBillSearchBasic }
     *     
     */
    public void setTimeJoin(TimeBillSearchBasic value) {
        this.timeJoin = value;
    }

    /**
     * Gets the value of the customSearchJoin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customSearchJoin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomSearchJoin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomSearchJoin }
     * 
     * 
     */
    public List<CustomSearchJoin> getCustomSearchJoin() {
        if (customSearchJoin == null) {
            customSearchJoin = new ArrayList<CustomSearchJoin>();
        }
        return this.customSearchJoin;
    }

}
