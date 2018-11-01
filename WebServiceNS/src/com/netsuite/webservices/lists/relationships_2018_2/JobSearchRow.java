
package com.netsuite.webservices.lists.relationships_2018_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_2.BillingAccountSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.BillingScheduleSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.ContactSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.CustomSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.CustomerSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.JobSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.ProjectTaskSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.ResourceAllocationSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.TaskSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.TimeBillSearchRowBasic;
import com.netsuite.webservices.platform.core_2018_2.SearchRow;


/**
 * <p>JobSearchRow complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="JobSearchRow">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRow">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2018_2.platform.webservices.netsuite.com}JobSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="billingAccountJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}BillingAccountSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="billingScheduleJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}BillingScheduleSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="contactPrimaryJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ContactSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="customerJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}CustomerSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="projectTaskJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ProjectTaskSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="resourceAllocationJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ResourceAllocationSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="taskJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TaskSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="timeJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TimeBillSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="customSearchJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}CustomSearchRowBasic" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobSearchRow", propOrder = {
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
public class JobSearchRow
    extends SearchRow
{

    protected JobSearchRowBasic basic;
    protected BillingAccountSearchRowBasic billingAccountJoin;
    protected BillingScheduleSearchRowBasic billingScheduleJoin;
    protected ContactSearchRowBasic contactPrimaryJoin;
    protected CustomerSearchRowBasic customerJoin;
    protected ProjectTaskSearchRowBasic projectTaskJoin;
    protected ResourceAllocationSearchRowBasic resourceAllocationJoin;
    protected TaskSearchRowBasic taskJoin;
    protected TimeBillSearchRowBasic timeJoin;
    protected List<CustomSearchRowBasic> customSearchJoin;

    /**
     * 获取basic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JobSearchRowBasic }
     *     
     */
    public JobSearchRowBasic getBasic() {
        return basic;
    }

    /**
     * 设置basic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JobSearchRowBasic }
     *     
     */
    public void setBasic(JobSearchRowBasic value) {
        this.basic = value;
    }

    /**
     * 获取billingAccountJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BillingAccountSearchRowBasic }
     *     
     */
    public BillingAccountSearchRowBasic getBillingAccountJoin() {
        return billingAccountJoin;
    }

    /**
     * 设置billingAccountJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BillingAccountSearchRowBasic }
     *     
     */
    public void setBillingAccountJoin(BillingAccountSearchRowBasic value) {
        this.billingAccountJoin = value;
    }

    /**
     * 获取billingScheduleJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BillingScheduleSearchRowBasic }
     *     
     */
    public BillingScheduleSearchRowBasic getBillingScheduleJoin() {
        return billingScheduleJoin;
    }

    /**
     * 设置billingScheduleJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BillingScheduleSearchRowBasic }
     *     
     */
    public void setBillingScheduleJoin(BillingScheduleSearchRowBasic value) {
        this.billingScheduleJoin = value;
    }

    /**
     * 获取contactPrimaryJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ContactSearchRowBasic }
     *     
     */
    public ContactSearchRowBasic getContactPrimaryJoin() {
        return contactPrimaryJoin;
    }

    /**
     * 设置contactPrimaryJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ContactSearchRowBasic }
     *     
     */
    public void setContactPrimaryJoin(ContactSearchRowBasic value) {
        this.contactPrimaryJoin = value;
    }

    /**
     * 获取customerJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomerSearchRowBasic }
     *     
     */
    public CustomerSearchRowBasic getCustomerJoin() {
        return customerJoin;
    }

    /**
     * 设置customerJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSearchRowBasic }
     *     
     */
    public void setCustomerJoin(CustomerSearchRowBasic value) {
        this.customerJoin = value;
    }

    /**
     * 获取projectTaskJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProjectTaskSearchRowBasic }
     *     
     */
    public ProjectTaskSearchRowBasic getProjectTaskJoin() {
        return projectTaskJoin;
    }

    /**
     * 设置projectTaskJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectTaskSearchRowBasic }
     *     
     */
    public void setProjectTaskJoin(ProjectTaskSearchRowBasic value) {
        this.projectTaskJoin = value;
    }

    /**
     * 获取resourceAllocationJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResourceAllocationSearchRowBasic }
     *     
     */
    public ResourceAllocationSearchRowBasic getResourceAllocationJoin() {
        return resourceAllocationJoin;
    }

    /**
     * 设置resourceAllocationJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceAllocationSearchRowBasic }
     *     
     */
    public void setResourceAllocationJoin(ResourceAllocationSearchRowBasic value) {
        this.resourceAllocationJoin = value;
    }

    /**
     * 获取taskJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TaskSearchRowBasic }
     *     
     */
    public TaskSearchRowBasic getTaskJoin() {
        return taskJoin;
    }

    /**
     * 设置taskJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TaskSearchRowBasic }
     *     
     */
    public void setTaskJoin(TaskSearchRowBasic value) {
        this.taskJoin = value;
    }

    /**
     * 获取timeJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TimeBillSearchRowBasic }
     *     
     */
    public TimeBillSearchRowBasic getTimeJoin() {
        return timeJoin;
    }

    /**
     * 设置timeJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimeBillSearchRowBasic }
     *     
     */
    public void setTimeJoin(TimeBillSearchRowBasic value) {
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
     * {@link CustomSearchRowBasic }
     * 
     * 
     */
    public List<CustomSearchRowBasic> getCustomSearchJoin() {
        if (customSearchJoin == null) {
            customSearchJoin = new ArrayList<CustomSearchRowBasic>();
        }
        return this.customSearchJoin;
    }

}
