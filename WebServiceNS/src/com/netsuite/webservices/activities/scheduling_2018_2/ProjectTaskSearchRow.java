
package com.netsuite.webservices.activities.scheduling_2018_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_2.CustomSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.EmployeeSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.JobSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.NoteSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.ProjectTaskAssignmentSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.ProjectTaskSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.ResourceAllocationSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.TimeBillSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.TransactionSearchRowBasic;
import com.netsuite.webservices.platform.core_2018_2.SearchRow;


/**
 * <p>ProjectTaskSearchRow complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ProjectTaskSearchRow">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRow">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2018_2.platform.webservices.netsuite.com}ProjectTaskSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="jobJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}JobSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="predecessorJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ProjectTaskSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="projectTaskAssignmentJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ProjectTaskAssignmentSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="resourceAllocationJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ResourceAllocationSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="successorJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ProjectTaskSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="timeJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TimeBillSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="transactionJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="userJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}EmployeeSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="userNotesJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}NoteSearchRowBasic" minOccurs="0"/>
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
@XmlType(name = "ProjectTaskSearchRow", propOrder = {
    "basic",
    "jobJoin",
    "predecessorJoin",
    "projectTaskAssignmentJoin",
    "resourceAllocationJoin",
    "successorJoin",
    "timeJoin",
    "transactionJoin",
    "userJoin",
    "userNotesJoin",
    "customSearchJoin"
})
public class ProjectTaskSearchRow
    extends SearchRow
{

    protected ProjectTaskSearchRowBasic basic;
    protected JobSearchRowBasic jobJoin;
    protected ProjectTaskSearchRowBasic predecessorJoin;
    protected ProjectTaskAssignmentSearchRowBasic projectTaskAssignmentJoin;
    protected ResourceAllocationSearchRowBasic resourceAllocationJoin;
    protected ProjectTaskSearchRowBasic successorJoin;
    protected TimeBillSearchRowBasic timeJoin;
    protected TransactionSearchRowBasic transactionJoin;
    protected EmployeeSearchRowBasic userJoin;
    protected NoteSearchRowBasic userNotesJoin;
    protected List<CustomSearchRowBasic> customSearchJoin;

    /**
     * ��ȡbasic���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ProjectTaskSearchRowBasic }
     *     
     */
    public ProjectTaskSearchRowBasic getBasic() {
        return basic;
    }

    /**
     * ����basic���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectTaskSearchRowBasic }
     *     
     */
    public void setBasic(ProjectTaskSearchRowBasic value) {
        this.basic = value;
    }

    /**
     * ��ȡjobJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JobSearchRowBasic }
     *     
     */
    public JobSearchRowBasic getJobJoin() {
        return jobJoin;
    }

    /**
     * ����jobJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JobSearchRowBasic }
     *     
     */
    public void setJobJoin(JobSearchRowBasic value) {
        this.jobJoin = value;
    }

    /**
     * ��ȡpredecessorJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ProjectTaskSearchRowBasic }
     *     
     */
    public ProjectTaskSearchRowBasic getPredecessorJoin() {
        return predecessorJoin;
    }

    /**
     * ����predecessorJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectTaskSearchRowBasic }
     *     
     */
    public void setPredecessorJoin(ProjectTaskSearchRowBasic value) {
        this.predecessorJoin = value;
    }

    /**
     * ��ȡprojectTaskAssignmentJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ProjectTaskAssignmentSearchRowBasic }
     *     
     */
    public ProjectTaskAssignmentSearchRowBasic getProjectTaskAssignmentJoin() {
        return projectTaskAssignmentJoin;
    }

    /**
     * ����projectTaskAssignmentJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectTaskAssignmentSearchRowBasic }
     *     
     */
    public void setProjectTaskAssignmentJoin(ProjectTaskAssignmentSearchRowBasic value) {
        this.projectTaskAssignmentJoin = value;
    }

    /**
     * ��ȡresourceAllocationJoin���Ե�ֵ��
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
     * ����resourceAllocationJoin���Ե�ֵ��
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
     * ��ȡsuccessorJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ProjectTaskSearchRowBasic }
     *     
     */
    public ProjectTaskSearchRowBasic getSuccessorJoin() {
        return successorJoin;
    }

    /**
     * ����successorJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectTaskSearchRowBasic }
     *     
     */
    public void setSuccessorJoin(ProjectTaskSearchRowBasic value) {
        this.successorJoin = value;
    }

    /**
     * ��ȡtimeJoin���Ե�ֵ��
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
     * ����timeJoin���Ե�ֵ��
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
     * ��ȡtransactionJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public TransactionSearchRowBasic getTransactionJoin() {
        return transactionJoin;
    }

    /**
     * ����transactionJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public void setTransactionJoin(TransactionSearchRowBasic value) {
        this.transactionJoin = value;
    }

    /**
     * ��ȡuserJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public EmployeeSearchRowBasic getUserJoin() {
        return userJoin;
    }

    /**
     * ����userJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public void setUserJoin(EmployeeSearchRowBasic value) {
        this.userJoin = value;
    }

    /**
     * ��ȡuserNotesJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NoteSearchRowBasic }
     *     
     */
    public NoteSearchRowBasic getUserNotesJoin() {
        return userNotesJoin;
    }

    /**
     * ����userNotesJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NoteSearchRowBasic }
     *     
     */
    public void setUserNotesJoin(NoteSearchRowBasic value) {
        this.userNotesJoin = value;
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
