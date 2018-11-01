
package com.netsuite.webservices.lists.relationships_2018_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_2.CalendarEventSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.CampaignSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.ContactSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.CustomSearchJoin;
import com.netsuite.webservices.platform.common_2018_2.CustomerSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.EmployeeSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.FileSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.ItemSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.JobSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.MessageSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.NoteSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.OpportunitySearchBasic;
import com.netsuite.webservices.platform.common_2018_2.PartnerSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.PhoneCallSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.SupportCaseSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.TaskSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.TransactionSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.VendorSearchBasic;
import com.netsuite.webservices.platform.core_2018_2.SearchRecord;


/**
 * <p>ContactSearch complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ContactSearch">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRecord">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2018_2.platform.webservices.netsuite.com}ContactSearchBasic" minOccurs="0"/>
 *         &lt;element name="callJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}PhoneCallSearchBasic" minOccurs="0"/>
 *         &lt;element name="campaignResponseJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}CampaignSearchBasic" minOccurs="0"/>
 *         &lt;element name="caseJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}SupportCaseSearchBasic" minOccurs="0"/>
 *         &lt;element name="customerJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}CustomerSearchBasic" minOccurs="0"/>
 *         &lt;element name="customerPrimaryJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}CustomerSearchBasic" minOccurs="0"/>
 *         &lt;element name="eventJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}CalendarEventSearchBasic" minOccurs="0"/>
 *         &lt;element name="fileJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}FileSearchBasic" minOccurs="0"/>
 *         &lt;element name="jobJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}JobSearchBasic" minOccurs="0"/>
 *         &lt;element name="jobPrimaryJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}JobSearchBasic" minOccurs="0"/>
 *         &lt;element name="messagesJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}MessageSearchBasic" minOccurs="0"/>
 *         &lt;element name="messagesFromJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}MessageSearchBasic" minOccurs="0"/>
 *         &lt;element name="messagesToJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}MessageSearchBasic" minOccurs="0"/>
 *         &lt;element name="opportunityJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}OpportunitySearchBasic" minOccurs="0"/>
 *         &lt;element name="parentCustomerJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}CustomerSearchBasic" minOccurs="0"/>
 *         &lt;element name="parentJobJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}JobSearchBasic" minOccurs="0"/>
 *         &lt;element name="parentPartnerJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}PartnerSearchBasic" minOccurs="0"/>
 *         &lt;element name="parentVendorJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}VendorSearchBasic" minOccurs="0"/>
 *         &lt;element name="partnerJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}PartnerSearchBasic" minOccurs="0"/>
 *         &lt;element name="partnerPrimaryJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}PartnerSearchBasic" minOccurs="0"/>
 *         &lt;element name="purchasedItemJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ItemSearchBasic" minOccurs="0"/>
 *         &lt;element name="taskJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TaskSearchBasic" minOccurs="0"/>
 *         &lt;element name="transactionJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/>
 *         &lt;element name="upsellItemJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ItemSearchBasic" minOccurs="0"/>
 *         &lt;element name="userJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}EmployeeSearchBasic" minOccurs="0"/>
 *         &lt;element name="userNotesJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}NoteSearchBasic" minOccurs="0"/>
 *         &lt;element name="vendorJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}VendorSearchBasic" minOccurs="0"/>
 *         &lt;element name="vendorPrimaryJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}VendorSearchBasic" minOccurs="0"/>
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
@XmlType(name = "ContactSearch", propOrder = {
    "basic",
    "callJoin",
    "campaignResponseJoin",
    "caseJoin",
    "customerJoin",
    "customerPrimaryJoin",
    "eventJoin",
    "fileJoin",
    "jobJoin",
    "jobPrimaryJoin",
    "messagesJoin",
    "messagesFromJoin",
    "messagesToJoin",
    "opportunityJoin",
    "parentCustomerJoin",
    "parentJobJoin",
    "parentPartnerJoin",
    "parentVendorJoin",
    "partnerJoin",
    "partnerPrimaryJoin",
    "purchasedItemJoin",
    "taskJoin",
    "transactionJoin",
    "upsellItemJoin",
    "userJoin",
    "userNotesJoin",
    "vendorJoin",
    "vendorPrimaryJoin",
    "customSearchJoin"
})
public class ContactSearch
    extends SearchRecord
{

    protected ContactSearchBasic basic;
    protected PhoneCallSearchBasic callJoin;
    protected CampaignSearchBasic campaignResponseJoin;
    protected SupportCaseSearchBasic caseJoin;
    protected CustomerSearchBasic customerJoin;
    protected CustomerSearchBasic customerPrimaryJoin;
    protected CalendarEventSearchBasic eventJoin;
    protected FileSearchBasic fileJoin;
    protected JobSearchBasic jobJoin;
    protected JobSearchBasic jobPrimaryJoin;
    protected MessageSearchBasic messagesJoin;
    protected MessageSearchBasic messagesFromJoin;
    protected MessageSearchBasic messagesToJoin;
    protected OpportunitySearchBasic opportunityJoin;
    protected CustomerSearchBasic parentCustomerJoin;
    protected JobSearchBasic parentJobJoin;
    protected PartnerSearchBasic parentPartnerJoin;
    protected VendorSearchBasic parentVendorJoin;
    protected PartnerSearchBasic partnerJoin;
    protected PartnerSearchBasic partnerPrimaryJoin;
    protected ItemSearchBasic purchasedItemJoin;
    protected TaskSearchBasic taskJoin;
    protected TransactionSearchBasic transactionJoin;
    protected ItemSearchBasic upsellItemJoin;
    protected EmployeeSearchBasic userJoin;
    protected NoteSearchBasic userNotesJoin;
    protected VendorSearchBasic vendorJoin;
    protected VendorSearchBasic vendorPrimaryJoin;
    protected List<CustomSearchJoin> customSearchJoin;

    /**
     * 获取basic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ContactSearchBasic }
     *     
     */
    public ContactSearchBasic getBasic() {
        return basic;
    }

    /**
     * 设置basic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ContactSearchBasic }
     *     
     */
    public void setBasic(ContactSearchBasic value) {
        this.basic = value;
    }

    /**
     * 获取callJoin属性的值。
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
     * 设置callJoin属性的值。
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
     * 获取campaignResponseJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CampaignSearchBasic }
     *     
     */
    public CampaignSearchBasic getCampaignResponseJoin() {
        return campaignResponseJoin;
    }

    /**
     * 设置campaignResponseJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignSearchBasic }
     *     
     */
    public void setCampaignResponseJoin(CampaignSearchBasic value) {
        this.campaignResponseJoin = value;
    }

    /**
     * 获取caseJoin属性的值。
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
     * 设置caseJoin属性的值。
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
     * 获取customerPrimaryJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomerSearchBasic }
     *     
     */
    public CustomerSearchBasic getCustomerPrimaryJoin() {
        return customerPrimaryJoin;
    }

    /**
     * 设置customerPrimaryJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSearchBasic }
     *     
     */
    public void setCustomerPrimaryJoin(CustomerSearchBasic value) {
        this.customerPrimaryJoin = value;
    }

    /**
     * 获取eventJoin属性的值。
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
     * 设置eventJoin属性的值。
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
     * 获取fileJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FileSearchBasic }
     *     
     */
    public FileSearchBasic getFileJoin() {
        return fileJoin;
    }

    /**
     * 设置fileJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FileSearchBasic }
     *     
     */
    public void setFileJoin(FileSearchBasic value) {
        this.fileJoin = value;
    }

    /**
     * 获取jobJoin属性的值。
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
     * 设置jobJoin属性的值。
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
     * 获取jobPrimaryJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JobSearchBasic }
     *     
     */
    public JobSearchBasic getJobPrimaryJoin() {
        return jobPrimaryJoin;
    }

    /**
     * 设置jobPrimaryJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JobSearchBasic }
     *     
     */
    public void setJobPrimaryJoin(JobSearchBasic value) {
        this.jobPrimaryJoin = value;
    }

    /**
     * 获取messagesJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MessageSearchBasic }
     *     
     */
    public MessageSearchBasic getMessagesJoin() {
        return messagesJoin;
    }

    /**
     * 设置messagesJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MessageSearchBasic }
     *     
     */
    public void setMessagesJoin(MessageSearchBasic value) {
        this.messagesJoin = value;
    }

    /**
     * 获取messagesFromJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MessageSearchBasic }
     *     
     */
    public MessageSearchBasic getMessagesFromJoin() {
        return messagesFromJoin;
    }

    /**
     * 设置messagesFromJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MessageSearchBasic }
     *     
     */
    public void setMessagesFromJoin(MessageSearchBasic value) {
        this.messagesFromJoin = value;
    }

    /**
     * 获取messagesToJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MessageSearchBasic }
     *     
     */
    public MessageSearchBasic getMessagesToJoin() {
        return messagesToJoin;
    }

    /**
     * 设置messagesToJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MessageSearchBasic }
     *     
     */
    public void setMessagesToJoin(MessageSearchBasic value) {
        this.messagesToJoin = value;
    }

    /**
     * 获取opportunityJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OpportunitySearchBasic }
     *     
     */
    public OpportunitySearchBasic getOpportunityJoin() {
        return opportunityJoin;
    }

    /**
     * 设置opportunityJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OpportunitySearchBasic }
     *     
     */
    public void setOpportunityJoin(OpportunitySearchBasic value) {
        this.opportunityJoin = value;
    }

    /**
     * 获取parentCustomerJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomerSearchBasic }
     *     
     */
    public CustomerSearchBasic getParentCustomerJoin() {
        return parentCustomerJoin;
    }

    /**
     * 设置parentCustomerJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSearchBasic }
     *     
     */
    public void setParentCustomerJoin(CustomerSearchBasic value) {
        this.parentCustomerJoin = value;
    }

    /**
     * 获取parentJobJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JobSearchBasic }
     *     
     */
    public JobSearchBasic getParentJobJoin() {
        return parentJobJoin;
    }

    /**
     * 设置parentJobJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JobSearchBasic }
     *     
     */
    public void setParentJobJoin(JobSearchBasic value) {
        this.parentJobJoin = value;
    }

    /**
     * 获取parentPartnerJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PartnerSearchBasic }
     *     
     */
    public PartnerSearchBasic getParentPartnerJoin() {
        return parentPartnerJoin;
    }

    /**
     * 设置parentPartnerJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerSearchBasic }
     *     
     */
    public void setParentPartnerJoin(PartnerSearchBasic value) {
        this.parentPartnerJoin = value;
    }

    /**
     * 获取parentVendorJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VendorSearchBasic }
     *     
     */
    public VendorSearchBasic getParentVendorJoin() {
        return parentVendorJoin;
    }

    /**
     * 设置parentVendorJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VendorSearchBasic }
     *     
     */
    public void setParentVendorJoin(VendorSearchBasic value) {
        this.parentVendorJoin = value;
    }

    /**
     * 获取partnerJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PartnerSearchBasic }
     *     
     */
    public PartnerSearchBasic getPartnerJoin() {
        return partnerJoin;
    }

    /**
     * 设置partnerJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerSearchBasic }
     *     
     */
    public void setPartnerJoin(PartnerSearchBasic value) {
        this.partnerJoin = value;
    }

    /**
     * 获取partnerPrimaryJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PartnerSearchBasic }
     *     
     */
    public PartnerSearchBasic getPartnerPrimaryJoin() {
        return partnerPrimaryJoin;
    }

    /**
     * 设置partnerPrimaryJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerSearchBasic }
     *     
     */
    public void setPartnerPrimaryJoin(PartnerSearchBasic value) {
        this.partnerPrimaryJoin = value;
    }

    /**
     * 获取purchasedItemJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchBasic }
     *     
     */
    public ItemSearchBasic getPurchasedItemJoin() {
        return purchasedItemJoin;
    }

    /**
     * 设置purchasedItemJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchBasic }
     *     
     */
    public void setPurchasedItemJoin(ItemSearchBasic value) {
        this.purchasedItemJoin = value;
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
     * 获取transactionJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getTransactionJoin() {
        return transactionJoin;
    }

    /**
     * 设置transactionJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setTransactionJoin(TransactionSearchBasic value) {
        this.transactionJoin = value;
    }

    /**
     * 获取upsellItemJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchBasic }
     *     
     */
    public ItemSearchBasic getUpsellItemJoin() {
        return upsellItemJoin;
    }

    /**
     * 设置upsellItemJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchBasic }
     *     
     */
    public void setUpsellItemJoin(ItemSearchBasic value) {
        this.upsellItemJoin = value;
    }

    /**
     * 获取userJoin属性的值。
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
     * 设置userJoin属性的值。
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
     * 获取userNotesJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NoteSearchBasic }
     *     
     */
    public NoteSearchBasic getUserNotesJoin() {
        return userNotesJoin;
    }

    /**
     * 设置userNotesJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NoteSearchBasic }
     *     
     */
    public void setUserNotesJoin(NoteSearchBasic value) {
        this.userNotesJoin = value;
    }

    /**
     * 获取vendorJoin属性的值。
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
     * 设置vendorJoin属性的值。
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
     * 获取vendorPrimaryJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VendorSearchBasic }
     *     
     */
    public VendorSearchBasic getVendorPrimaryJoin() {
        return vendorPrimaryJoin;
    }

    /**
     * 设置vendorPrimaryJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VendorSearchBasic }
     *     
     */
    public void setVendorPrimaryJoin(VendorSearchBasic value) {
        this.vendorPrimaryJoin = value;
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
