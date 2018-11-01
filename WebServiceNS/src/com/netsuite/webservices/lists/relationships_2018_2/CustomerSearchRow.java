
package com.netsuite.webservices.lists.relationships_2018_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_2.BillingAccountSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.BillingScheduleSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.CalendarEventSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.CampaignSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.ContactSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.CustomSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.CustomerSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.EmployeeSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.FileSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.ItemSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.JobSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.MessageSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.MseSubsidiarySearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.NoteSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.OpportunitySearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.OriginatingLeadSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.PartnerSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.PhoneCallSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.PricingSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.ResourceAllocationSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.SiteCategorySearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.SupportCaseSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.TaskSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.TimeBillSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.TransactionSearchRowBasic;
import com.netsuite.webservices.platform.core_2018_2.SearchRow;


/**
 * <p>CustomerSearchRow complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="CustomerSearchRow">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRow">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2018_2.platform.webservices.netsuite.com}CustomerSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="billingAccountJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}BillingAccountSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="billingScheduleJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}BillingScheduleSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="callJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}PhoneCallSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="campaignResponseJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}CampaignSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="caseJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}SupportCaseSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="contactJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ContactSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="contactPrimaryJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ContactSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="eventJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}CalendarEventSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="fileJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}FileSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="hostedPageJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}FileSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="jobJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}JobSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="leadSourceJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}CampaignSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="messagesJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}MessageSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="messagesFromJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}MessageSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="messagesToJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}MessageSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="mseSubsidiaryJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}MseSubsidiarySearchRowBasic" minOccurs="0"/>
 *         &lt;element name="opportunityJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}OpportunitySearchRowBasic" minOccurs="0"/>
 *         &lt;element name="originatingLeadJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}OriginatingLeadSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="parentCustomerJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}CustomerSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="partnerJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}PartnerSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="pricingJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}PricingSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="purchasedItemJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ItemSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="resourceAllocationJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ResourceAllocationSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="salesRepJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}EmployeeSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="subCustomerJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}CustomerSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="taskJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TaskSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="timeJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TimeBillSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="topLevelParentJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}CustomerSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="transactionJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="upsellItemJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ItemSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="userJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}EmployeeSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="userNotesJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}NoteSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="webSiteCategoryJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}SiteCategorySearchRowBasic" minOccurs="0"/>
 *         &lt;element name="webSiteItemJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ItemSearchRowBasic" minOccurs="0"/>
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
@XmlType(name = "CustomerSearchRow", propOrder = {
    "basic",
    "billingAccountJoin",
    "billingScheduleJoin",
    "callJoin",
    "campaignResponseJoin",
    "caseJoin",
    "contactJoin",
    "contactPrimaryJoin",
    "eventJoin",
    "fileJoin",
    "hostedPageJoin",
    "jobJoin",
    "leadSourceJoin",
    "messagesJoin",
    "messagesFromJoin",
    "messagesToJoin",
    "mseSubsidiaryJoin",
    "opportunityJoin",
    "originatingLeadJoin",
    "parentCustomerJoin",
    "partnerJoin",
    "pricingJoin",
    "purchasedItemJoin",
    "resourceAllocationJoin",
    "salesRepJoin",
    "subCustomerJoin",
    "taskJoin",
    "timeJoin",
    "topLevelParentJoin",
    "transactionJoin",
    "upsellItemJoin",
    "userJoin",
    "userNotesJoin",
    "webSiteCategoryJoin",
    "webSiteItemJoin",
    "customSearchJoin"
})
public class CustomerSearchRow
    extends SearchRow
{

    protected CustomerSearchRowBasic basic;
    protected BillingAccountSearchRowBasic billingAccountJoin;
    protected BillingScheduleSearchRowBasic billingScheduleJoin;
    protected PhoneCallSearchRowBasic callJoin;
    protected CampaignSearchRowBasic campaignResponseJoin;
    protected SupportCaseSearchRowBasic caseJoin;
    protected ContactSearchRowBasic contactJoin;
    protected ContactSearchRowBasic contactPrimaryJoin;
    protected CalendarEventSearchRowBasic eventJoin;
    protected FileSearchRowBasic fileJoin;
    protected FileSearchRowBasic hostedPageJoin;
    protected JobSearchRowBasic jobJoin;
    protected CampaignSearchRowBasic leadSourceJoin;
    protected MessageSearchRowBasic messagesJoin;
    protected MessageSearchRowBasic messagesFromJoin;
    protected MessageSearchRowBasic messagesToJoin;
    protected MseSubsidiarySearchRowBasic mseSubsidiaryJoin;
    protected OpportunitySearchRowBasic opportunityJoin;
    protected OriginatingLeadSearchRowBasic originatingLeadJoin;
    protected CustomerSearchRowBasic parentCustomerJoin;
    protected PartnerSearchRowBasic partnerJoin;
    protected PricingSearchRowBasic pricingJoin;
    protected ItemSearchRowBasic purchasedItemJoin;
    protected ResourceAllocationSearchRowBasic resourceAllocationJoin;
    protected EmployeeSearchRowBasic salesRepJoin;
    protected CustomerSearchRowBasic subCustomerJoin;
    protected TaskSearchRowBasic taskJoin;
    protected TimeBillSearchRowBasic timeJoin;
    protected CustomerSearchRowBasic topLevelParentJoin;
    protected TransactionSearchRowBasic transactionJoin;
    protected ItemSearchRowBasic upsellItemJoin;
    protected EmployeeSearchRowBasic userJoin;
    protected NoteSearchRowBasic userNotesJoin;
    protected SiteCategorySearchRowBasic webSiteCategoryJoin;
    protected ItemSearchRowBasic webSiteItemJoin;
    protected List<CustomSearchRowBasic> customSearchJoin;

    /**
     * ��ȡbasic���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CustomerSearchRowBasic }
     *     
     */
    public CustomerSearchRowBasic getBasic() {
        return basic;
    }

    /**
     * ����basic���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSearchRowBasic }
     *     
     */
    public void setBasic(CustomerSearchRowBasic value) {
        this.basic = value;
    }

    /**
     * ��ȡbillingAccountJoin���Ե�ֵ��
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
     * ����billingAccountJoin���Ե�ֵ��
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
     * ��ȡbillingScheduleJoin���Ե�ֵ��
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
     * ����billingScheduleJoin���Ե�ֵ��
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
     * ��ȡcallJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PhoneCallSearchRowBasic }
     *     
     */
    public PhoneCallSearchRowBasic getCallJoin() {
        return callJoin;
    }

    /**
     * ����callJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneCallSearchRowBasic }
     *     
     */
    public void setCallJoin(PhoneCallSearchRowBasic value) {
        this.callJoin = value;
    }

    /**
     * ��ȡcampaignResponseJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CampaignSearchRowBasic }
     *     
     */
    public CampaignSearchRowBasic getCampaignResponseJoin() {
        return campaignResponseJoin;
    }

    /**
     * ����campaignResponseJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignSearchRowBasic }
     *     
     */
    public void setCampaignResponseJoin(CampaignSearchRowBasic value) {
        this.campaignResponseJoin = value;
    }

    /**
     * ��ȡcaseJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SupportCaseSearchRowBasic }
     *     
     */
    public SupportCaseSearchRowBasic getCaseJoin() {
        return caseJoin;
    }

    /**
     * ����caseJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SupportCaseSearchRowBasic }
     *     
     */
    public void setCaseJoin(SupportCaseSearchRowBasic value) {
        this.caseJoin = value;
    }

    /**
     * ��ȡcontactJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ContactSearchRowBasic }
     *     
     */
    public ContactSearchRowBasic getContactJoin() {
        return contactJoin;
    }

    /**
     * ����contactJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ContactSearchRowBasic }
     *     
     */
    public void setContactJoin(ContactSearchRowBasic value) {
        this.contactJoin = value;
    }

    /**
     * ��ȡcontactPrimaryJoin���Ե�ֵ��
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
     * ����contactPrimaryJoin���Ե�ֵ��
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
     * ��ȡeventJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CalendarEventSearchRowBasic }
     *     
     */
    public CalendarEventSearchRowBasic getEventJoin() {
        return eventJoin;
    }

    /**
     * ����eventJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarEventSearchRowBasic }
     *     
     */
    public void setEventJoin(CalendarEventSearchRowBasic value) {
        this.eventJoin = value;
    }

    /**
     * ��ȡfileJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link FileSearchRowBasic }
     *     
     */
    public FileSearchRowBasic getFileJoin() {
        return fileJoin;
    }

    /**
     * ����fileJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link FileSearchRowBasic }
     *     
     */
    public void setFileJoin(FileSearchRowBasic value) {
        this.fileJoin = value;
    }

    /**
     * ��ȡhostedPageJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link FileSearchRowBasic }
     *     
     */
    public FileSearchRowBasic getHostedPageJoin() {
        return hostedPageJoin;
    }

    /**
     * ����hostedPageJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link FileSearchRowBasic }
     *     
     */
    public void setHostedPageJoin(FileSearchRowBasic value) {
        this.hostedPageJoin = value;
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
     * ��ȡleadSourceJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CampaignSearchRowBasic }
     *     
     */
    public CampaignSearchRowBasic getLeadSourceJoin() {
        return leadSourceJoin;
    }

    /**
     * ����leadSourceJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignSearchRowBasic }
     *     
     */
    public void setLeadSourceJoin(CampaignSearchRowBasic value) {
        this.leadSourceJoin = value;
    }

    /**
     * ��ȡmessagesJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MessageSearchRowBasic }
     *     
     */
    public MessageSearchRowBasic getMessagesJoin() {
        return messagesJoin;
    }

    /**
     * ����messagesJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MessageSearchRowBasic }
     *     
     */
    public void setMessagesJoin(MessageSearchRowBasic value) {
        this.messagesJoin = value;
    }

    /**
     * ��ȡmessagesFromJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MessageSearchRowBasic }
     *     
     */
    public MessageSearchRowBasic getMessagesFromJoin() {
        return messagesFromJoin;
    }

    /**
     * ����messagesFromJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MessageSearchRowBasic }
     *     
     */
    public void setMessagesFromJoin(MessageSearchRowBasic value) {
        this.messagesFromJoin = value;
    }

    /**
     * ��ȡmessagesToJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MessageSearchRowBasic }
     *     
     */
    public MessageSearchRowBasic getMessagesToJoin() {
        return messagesToJoin;
    }

    /**
     * ����messagesToJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MessageSearchRowBasic }
     *     
     */
    public void setMessagesToJoin(MessageSearchRowBasic value) {
        this.messagesToJoin = value;
    }

    /**
     * ��ȡmseSubsidiaryJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MseSubsidiarySearchRowBasic }
     *     
     */
    public MseSubsidiarySearchRowBasic getMseSubsidiaryJoin() {
        return mseSubsidiaryJoin;
    }

    /**
     * ����mseSubsidiaryJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MseSubsidiarySearchRowBasic }
     *     
     */
    public void setMseSubsidiaryJoin(MseSubsidiarySearchRowBasic value) {
        this.mseSubsidiaryJoin = value;
    }

    /**
     * ��ȡopportunityJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link OpportunitySearchRowBasic }
     *     
     */
    public OpportunitySearchRowBasic getOpportunityJoin() {
        return opportunityJoin;
    }

    /**
     * ����opportunityJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link OpportunitySearchRowBasic }
     *     
     */
    public void setOpportunityJoin(OpportunitySearchRowBasic value) {
        this.opportunityJoin = value;
    }

    /**
     * ��ȡoriginatingLeadJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link OriginatingLeadSearchRowBasic }
     *     
     */
    public OriginatingLeadSearchRowBasic getOriginatingLeadJoin() {
        return originatingLeadJoin;
    }

    /**
     * ����originatingLeadJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link OriginatingLeadSearchRowBasic }
     *     
     */
    public void setOriginatingLeadJoin(OriginatingLeadSearchRowBasic value) {
        this.originatingLeadJoin = value;
    }

    /**
     * ��ȡparentCustomerJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CustomerSearchRowBasic }
     *     
     */
    public CustomerSearchRowBasic getParentCustomerJoin() {
        return parentCustomerJoin;
    }

    /**
     * ����parentCustomerJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSearchRowBasic }
     *     
     */
    public void setParentCustomerJoin(CustomerSearchRowBasic value) {
        this.parentCustomerJoin = value;
    }

    /**
     * ��ȡpartnerJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PartnerSearchRowBasic }
     *     
     */
    public PartnerSearchRowBasic getPartnerJoin() {
        return partnerJoin;
    }

    /**
     * ����partnerJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerSearchRowBasic }
     *     
     */
    public void setPartnerJoin(PartnerSearchRowBasic value) {
        this.partnerJoin = value;
    }

    /**
     * ��ȡpricingJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PricingSearchRowBasic }
     *     
     */
    public PricingSearchRowBasic getPricingJoin() {
        return pricingJoin;
    }

    /**
     * ����pricingJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PricingSearchRowBasic }
     *     
     */
    public void setPricingJoin(PricingSearchRowBasic value) {
        this.pricingJoin = value;
    }

    /**
     * ��ȡpurchasedItemJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public ItemSearchRowBasic getPurchasedItemJoin() {
        return purchasedItemJoin;
    }

    /**
     * ����purchasedItemJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public void setPurchasedItemJoin(ItemSearchRowBasic value) {
        this.purchasedItemJoin = value;
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
     * ��ȡsalesRepJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public EmployeeSearchRowBasic getSalesRepJoin() {
        return salesRepJoin;
    }

    /**
     * ����salesRepJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public void setSalesRepJoin(EmployeeSearchRowBasic value) {
        this.salesRepJoin = value;
    }

    /**
     * ��ȡsubCustomerJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CustomerSearchRowBasic }
     *     
     */
    public CustomerSearchRowBasic getSubCustomerJoin() {
        return subCustomerJoin;
    }

    /**
     * ����subCustomerJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSearchRowBasic }
     *     
     */
    public void setSubCustomerJoin(CustomerSearchRowBasic value) {
        this.subCustomerJoin = value;
    }

    /**
     * ��ȡtaskJoin���Ե�ֵ��
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
     * ����taskJoin���Ե�ֵ��
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
     * ��ȡtopLevelParentJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CustomerSearchRowBasic }
     *     
     */
    public CustomerSearchRowBasic getTopLevelParentJoin() {
        return topLevelParentJoin;
    }

    /**
     * ����topLevelParentJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSearchRowBasic }
     *     
     */
    public void setTopLevelParentJoin(CustomerSearchRowBasic value) {
        this.topLevelParentJoin = value;
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
     * ��ȡupsellItemJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public ItemSearchRowBasic getUpsellItemJoin() {
        return upsellItemJoin;
    }

    /**
     * ����upsellItemJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public void setUpsellItemJoin(ItemSearchRowBasic value) {
        this.upsellItemJoin = value;
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
     * ��ȡwebSiteCategoryJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SiteCategorySearchRowBasic }
     *     
     */
    public SiteCategorySearchRowBasic getWebSiteCategoryJoin() {
        return webSiteCategoryJoin;
    }

    /**
     * ����webSiteCategoryJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SiteCategorySearchRowBasic }
     *     
     */
    public void setWebSiteCategoryJoin(SiteCategorySearchRowBasic value) {
        this.webSiteCategoryJoin = value;
    }

    /**
     * ��ȡwebSiteItemJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public ItemSearchRowBasic getWebSiteItemJoin() {
        return webSiteItemJoin;
    }

    /**
     * ����webSiteItemJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public void setWebSiteItemJoin(ItemSearchRowBasic value) {
        this.webSiteItemJoin = value;
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
