
package com.netsuite.webservices.transactions.sales_2018_2;

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
import com.netsuite.webservices.platform.common_2018_2.MessageSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.NoteSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.OpportunitySearchBasic;
import com.netsuite.webservices.platform.common_2018_2.OriginatingLeadSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.PartnerSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.PhoneCallSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.TaskSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.TransactionSearchBasic;
import com.netsuite.webservices.platform.core_2018_2.SearchRecord;


/**
 * <p>OpportunitySearch complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="OpportunitySearch">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRecord">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2018_2.platform.webservices.netsuite.com}OpportunitySearchBasic" minOccurs="0"/>
 *         &lt;element name="actualJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/>
 *         &lt;element name="callJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}PhoneCallSearchBasic" minOccurs="0"/>
 *         &lt;element name="customerJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}CustomerSearchBasic" minOccurs="0"/>
 *         &lt;element name="decisionMakerJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ContactSearchBasic" minOccurs="0"/>
 *         &lt;element name="estimateJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/>
 *         &lt;element name="eventJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}CalendarEventSearchBasic" minOccurs="0"/>
 *         &lt;element name="fileJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}FileSearchBasic" minOccurs="0"/>
 *         &lt;element name="itemJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ItemSearchBasic" minOccurs="0"/>
 *         &lt;element name="leadSourceJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}CampaignSearchBasic" minOccurs="0"/>
 *         &lt;element name="messagesJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}MessageSearchBasic" minOccurs="0"/>
 *         &lt;element name="orderJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/>
 *         &lt;element name="originatingLeadJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}OriginatingLeadSearchBasic" minOccurs="0"/>
 *         &lt;element name="partnerJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}PartnerSearchBasic" minOccurs="0"/>
 *         &lt;element name="salesRepJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}EmployeeSearchBasic" minOccurs="0"/>
 *         &lt;element name="taskJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TaskSearchBasic" minOccurs="0"/>
 *         &lt;element name="userNotesJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}NoteSearchBasic" minOccurs="0"/>
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
@XmlType(name = "OpportunitySearch", propOrder = {
    "basic",
    "actualJoin",
    "callJoin",
    "customerJoin",
    "decisionMakerJoin",
    "estimateJoin",
    "eventJoin",
    "fileJoin",
    "itemJoin",
    "leadSourceJoin",
    "messagesJoin",
    "orderJoin",
    "originatingLeadJoin",
    "partnerJoin",
    "salesRepJoin",
    "taskJoin",
    "userNotesJoin",
    "customSearchJoin"
})
public class OpportunitySearch
    extends SearchRecord
{

    protected OpportunitySearchBasic basic;
    protected TransactionSearchBasic actualJoin;
    protected PhoneCallSearchBasic callJoin;
    protected CustomerSearchBasic customerJoin;
    protected ContactSearchBasic decisionMakerJoin;
    protected TransactionSearchBasic estimateJoin;
    protected CalendarEventSearchBasic eventJoin;
    protected FileSearchBasic fileJoin;
    protected ItemSearchBasic itemJoin;
    protected CampaignSearchBasic leadSourceJoin;
    protected MessageSearchBasic messagesJoin;
    protected TransactionSearchBasic orderJoin;
    protected OriginatingLeadSearchBasic originatingLeadJoin;
    protected PartnerSearchBasic partnerJoin;
    protected EmployeeSearchBasic salesRepJoin;
    protected TaskSearchBasic taskJoin;
    protected NoteSearchBasic userNotesJoin;
    protected List<CustomSearchJoin> customSearchJoin;

    /**
     * ��ȡbasic���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link OpportunitySearchBasic }
     *     
     */
    public OpportunitySearchBasic getBasic() {
        return basic;
    }

    /**
     * ����basic���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link OpportunitySearchBasic }
     *     
     */
    public void setBasic(OpportunitySearchBasic value) {
        this.basic = value;
    }

    /**
     * ��ȡactualJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getActualJoin() {
        return actualJoin;
    }

    /**
     * ����actualJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setActualJoin(TransactionSearchBasic value) {
        this.actualJoin = value;
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
     * ��ȡdecisionMakerJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ContactSearchBasic }
     *     
     */
    public ContactSearchBasic getDecisionMakerJoin() {
        return decisionMakerJoin;
    }

    /**
     * ����decisionMakerJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ContactSearchBasic }
     *     
     */
    public void setDecisionMakerJoin(ContactSearchBasic value) {
        this.decisionMakerJoin = value;
    }

    /**
     * ��ȡestimateJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getEstimateJoin() {
        return estimateJoin;
    }

    /**
     * ����estimateJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setEstimateJoin(TransactionSearchBasic value) {
        this.estimateJoin = value;
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
     * ��ȡfileJoin���Ե�ֵ��
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
     * ����fileJoin���Ե�ֵ��
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
     * ��ȡleadSourceJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CampaignSearchBasic }
     *     
     */
    public CampaignSearchBasic getLeadSourceJoin() {
        return leadSourceJoin;
    }

    /**
     * ����leadSourceJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignSearchBasic }
     *     
     */
    public void setLeadSourceJoin(CampaignSearchBasic value) {
        this.leadSourceJoin = value;
    }

    /**
     * ��ȡmessagesJoin���Ե�ֵ��
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
     * ����messagesJoin���Ե�ֵ��
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
     * ��ȡorderJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getOrderJoin() {
        return orderJoin;
    }

    /**
     * ����orderJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setOrderJoin(TransactionSearchBasic value) {
        this.orderJoin = value;
    }

    /**
     * ��ȡoriginatingLeadJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link OriginatingLeadSearchBasic }
     *     
     */
    public OriginatingLeadSearchBasic getOriginatingLeadJoin() {
        return originatingLeadJoin;
    }

    /**
     * ����originatingLeadJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link OriginatingLeadSearchBasic }
     *     
     */
    public void setOriginatingLeadJoin(OriginatingLeadSearchBasic value) {
        this.originatingLeadJoin = value;
    }

    /**
     * ��ȡpartnerJoin���Ե�ֵ��
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
     * ����partnerJoin���Ե�ֵ��
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
     * ��ȡsalesRepJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public EmployeeSearchBasic getSalesRepJoin() {
        return salesRepJoin;
    }

    /**
     * ����salesRepJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public void setSalesRepJoin(EmployeeSearchBasic value) {
        this.salesRepJoin = value;
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
     * ��ȡuserNotesJoin���Ե�ֵ��
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
     * ����userNotesJoin���Ե�ֵ��
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
