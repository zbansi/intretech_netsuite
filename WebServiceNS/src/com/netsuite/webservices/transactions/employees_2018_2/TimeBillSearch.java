
package com.netsuite.webservices.transactions.employees_2018_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_2.CalendarEventSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.ChargeSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.ClassificationSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.CustomSearchJoin;
import com.netsuite.webservices.platform.common_2018_2.CustomerSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.DepartmentSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.EmployeeSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.ItemSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.JobSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.LocationSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.PhoneCallSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.ProjectTaskAssignmentSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.ProjectTaskSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.ResourceAllocationSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.SupportCaseSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.TaskSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.TimeBillSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.TimeSheetSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.VendorSearchBasic;
import com.netsuite.webservices.platform.core_2018_2.SearchRecord;


/**
 * <p>TimeBillSearch complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="TimeBillSearch">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRecord">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2018_2.platform.webservices.netsuite.com}TimeBillSearchBasic" minOccurs="0"/>
 *         &lt;element name="callJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}PhoneCallSearchBasic" minOccurs="0"/>
 *         &lt;element name="caseJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}SupportCaseSearchBasic" minOccurs="0"/>
 *         &lt;element name="chargeJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ChargeSearchBasic" minOccurs="0"/>
 *         &lt;element name="classJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ClassificationSearchBasic" minOccurs="0"/>
 *         &lt;element name="customerJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}CustomerSearchBasic" minOccurs="0"/>
 *         &lt;element name="departmentJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}DepartmentSearchBasic" minOccurs="0"/>
 *         &lt;element name="employeeJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}EmployeeSearchBasic" minOccurs="0"/>
 *         &lt;element name="eventJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}CalendarEventSearchBasic" minOccurs="0"/>
 *         &lt;element name="itemJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ItemSearchBasic" minOccurs="0"/>
 *         &lt;element name="jobJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}JobSearchBasic" minOccurs="0"/>
 *         &lt;element name="locationJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}LocationSearchBasic" minOccurs="0"/>
 *         &lt;element name="projectTaskJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ProjectTaskSearchBasic" minOccurs="0"/>
 *         &lt;element name="projectTaskAssignmentJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ProjectTaskAssignmentSearchBasic" minOccurs="0"/>
 *         &lt;element name="resourceAllocationJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ResourceAllocationSearchBasic" minOccurs="0"/>
 *         &lt;element name="taskJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TaskSearchBasic" minOccurs="0"/>
 *         &lt;element name="userJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}EmployeeSearchBasic" minOccurs="0"/>
 *         &lt;element name="vendorJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}VendorSearchBasic" minOccurs="0"/>
 *         &lt;element name="timeSheetJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TimeSheetSearchBasic" minOccurs="0"/>
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
@XmlType(name = "TimeBillSearch", propOrder = {
    "basic",
    "callJoin",
    "caseJoin",
    "chargeJoin",
    "classJoin",
    "customerJoin",
    "departmentJoin",
    "employeeJoin",
    "eventJoin",
    "itemJoin",
    "jobJoin",
    "locationJoin",
    "projectTaskJoin",
    "projectTaskAssignmentJoin",
    "resourceAllocationJoin",
    "taskJoin",
    "userJoin",
    "vendorJoin",
    "timeSheetJoin",
    "customSearchJoin"
})
public class TimeBillSearch
    extends SearchRecord
{

    protected TimeBillSearchBasic basic;
    protected PhoneCallSearchBasic callJoin;
    protected SupportCaseSearchBasic caseJoin;
    protected ChargeSearchBasic chargeJoin;
    protected ClassificationSearchBasic classJoin;
    protected CustomerSearchBasic customerJoin;
    protected DepartmentSearchBasic departmentJoin;
    protected EmployeeSearchBasic employeeJoin;
    protected CalendarEventSearchBasic eventJoin;
    protected ItemSearchBasic itemJoin;
    protected JobSearchBasic jobJoin;
    protected LocationSearchBasic locationJoin;
    protected ProjectTaskSearchBasic projectTaskJoin;
    protected ProjectTaskAssignmentSearchBasic projectTaskAssignmentJoin;
    protected ResourceAllocationSearchBasic resourceAllocationJoin;
    protected TaskSearchBasic taskJoin;
    protected EmployeeSearchBasic userJoin;
    protected VendorSearchBasic vendorJoin;
    protected TimeSheetSearchBasic timeSheetJoin;
    protected List<CustomSearchJoin> customSearchJoin;

    /**
     * ��ȡbasic���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TimeBillSearchBasic }
     *     
     */
    public TimeBillSearchBasic getBasic() {
        return basic;
    }

    /**
     * ����basic���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TimeBillSearchBasic }
     *     
     */
    public void setBasic(TimeBillSearchBasic value) {
        this.basic = value;
    }

    /**
     * ��ȡcallJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PhoneCallSearchBasic }
     *     
     */
    public PhoneCallSearchBasic getCallJoin() {
        return callJoin;
    }

    /**
     * ����callJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneCallSearchBasic }
     *     
     */
    public void setCallJoin(PhoneCallSearchBasic value) {
        this.callJoin = value;
    }

    /**
     * ��ȡcaseJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SupportCaseSearchBasic }
     *     
     */
    public SupportCaseSearchBasic getCaseJoin() {
        return caseJoin;
    }

    /**
     * ����caseJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SupportCaseSearchBasic }
     *     
     */
    public void setCaseJoin(SupportCaseSearchBasic value) {
        this.caseJoin = value;
    }

    /**
     * ��ȡchargeJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ChargeSearchBasic }
     *     
     */
    public ChargeSearchBasic getChargeJoin() {
        return chargeJoin;
    }

    /**
     * ����chargeJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeSearchBasic }
     *     
     */
    public void setChargeJoin(ChargeSearchBasic value) {
        this.chargeJoin = value;
    }

    /**
     * ��ȡclassJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ClassificationSearchBasic }
     *     
     */
    public ClassificationSearchBasic getClassJoin() {
        return classJoin;
    }

    /**
     * ����classJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationSearchBasic }
     *     
     */
    public void setClassJoin(ClassificationSearchBasic value) {
        this.classJoin = value;
    }

    /**
     * ��ȡcustomerJoin���Ե�ֵ��
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
     * ����customerJoin���Ե�ֵ��
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
     * ��ȡdepartmentJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DepartmentSearchBasic }
     *     
     */
    public DepartmentSearchBasic getDepartmentJoin() {
        return departmentJoin;
    }

    /**
     * ����departmentJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DepartmentSearchBasic }
     *     
     */
    public void setDepartmentJoin(DepartmentSearchBasic value) {
        this.departmentJoin = value;
    }

    /**
     * ��ȡemployeeJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public EmployeeSearchBasic getEmployeeJoin() {
        return employeeJoin;
    }

    /**
     * ����employeeJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public void setEmployeeJoin(EmployeeSearchBasic value) {
        this.employeeJoin = value;
    }

    /**
     * ��ȡeventJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CalendarEventSearchBasic }
     *     
     */
    public CalendarEventSearchBasic getEventJoin() {
        return eventJoin;
    }

    /**
     * ����eventJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarEventSearchBasic }
     *     
     */
    public void setEventJoin(CalendarEventSearchBasic value) {
        this.eventJoin = value;
    }

    /**
     * ��ȡitemJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchBasic }
     *     
     */
    public ItemSearchBasic getItemJoin() {
        return itemJoin;
    }

    /**
     * ����itemJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchBasic }
     *     
     */
    public void setItemJoin(ItemSearchBasic value) {
        this.itemJoin = value;
    }

    /**
     * ��ȡjobJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JobSearchBasic }
     *     
     */
    public JobSearchBasic getJobJoin() {
        return jobJoin;
    }

    /**
     * ����jobJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JobSearchBasic }
     *     
     */
    public void setJobJoin(JobSearchBasic value) {
        this.jobJoin = value;
    }

    /**
     * ��ȡlocationJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link LocationSearchBasic }
     *     
     */
    public LocationSearchBasic getLocationJoin() {
        return locationJoin;
    }

    /**
     * ����locationJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link LocationSearchBasic }
     *     
     */
    public void setLocationJoin(LocationSearchBasic value) {
        this.locationJoin = value;
    }

    /**
     * ��ȡprojectTaskJoin���Ե�ֵ��
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
     * ����projectTaskJoin���Ե�ֵ��
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
     * ��ȡprojectTaskAssignmentJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ProjectTaskAssignmentSearchBasic }
     *     
     */
    public ProjectTaskAssignmentSearchBasic getProjectTaskAssignmentJoin() {
        return projectTaskAssignmentJoin;
    }

    /**
     * ����projectTaskAssignmentJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectTaskAssignmentSearchBasic }
     *     
     */
    public void setProjectTaskAssignmentJoin(ProjectTaskAssignmentSearchBasic value) {
        this.projectTaskAssignmentJoin = value;
    }

    /**
     * ��ȡresourceAllocationJoin���Ե�ֵ��
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
     * ����resourceAllocationJoin���Ե�ֵ��
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
     * ��ȡtaskJoin���Ե�ֵ��
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
     * ����taskJoin���Ե�ֵ��
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
     * ��ȡuserJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public EmployeeSearchBasic getUserJoin() {
        return userJoin;
    }

    /**
     * ����userJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public void setUserJoin(EmployeeSearchBasic value) {
        this.userJoin = value;
    }

    /**
     * ��ȡvendorJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link VendorSearchBasic }
     *     
     */
    public VendorSearchBasic getVendorJoin() {
        return vendorJoin;
    }

    /**
     * ����vendorJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link VendorSearchBasic }
     *     
     */
    public void setVendorJoin(VendorSearchBasic value) {
        this.vendorJoin = value;
    }

    /**
     * ��ȡtimeSheetJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TimeSheetSearchBasic }
     *     
     */
    public TimeSheetSearchBasic getTimeSheetJoin() {
        return timeSheetJoin;
    }

    /**
     * ����timeSheetJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSheetSearchBasic }
     *     
     */
    public void setTimeSheetJoin(TimeSheetSearchBasic value) {
        this.timeSheetJoin = value;
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
