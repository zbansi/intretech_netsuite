
package com.netsuite.webservices.transactions.sales_2018_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_2.CalendarEventSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.CampaignSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.ContactSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.CustomSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.CustomerSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.EmployeeSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.FileSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.ItemSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.MessageSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.NoteSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.OpportunitySearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.OriginatingLeadSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.PartnerSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.PhoneCallSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.TaskSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.TransactionSearchRowBasic;
import com.netsuite.webservices.platform.core_2018_2.SearchRow;


/**
 * <p>OpportunitySearchRow complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OpportunitySearchRow">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRow">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2018_2.platform.webservices.netsuite.com}OpportunitySearchRowBasic" minOccurs="0"/>
 *         &lt;element name="actualJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="callJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}PhoneCallSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="customerJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}CustomerSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="decisionMakerJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ContactSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="estimateJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="eventJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}CalendarEventSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="fileJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}FileSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="itemJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ItemSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="leadSourceJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}CampaignSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="messagesJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}MessageSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="orderJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="originatingLeadJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}OriginatingLeadSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="partnerJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}PartnerSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="salesRepJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}EmployeeSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="taskJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TaskSearchRowBasic" minOccurs="0"/>
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
@XmlType(name = "OpportunitySearchRow", propOrder = {
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
public class OpportunitySearchRow
    extends SearchRow
{

    protected OpportunitySearchRowBasic basic;
    protected TransactionSearchRowBasic actualJoin;
    protected PhoneCallSearchRowBasic callJoin;
    protected CustomerSearchRowBasic customerJoin;
    protected ContactSearchRowBasic decisionMakerJoin;
    protected TransactionSearchRowBasic estimateJoin;
    protected CalendarEventSearchRowBasic eventJoin;
    protected FileSearchRowBasic fileJoin;
    protected ItemSearchRowBasic itemJoin;
    protected CampaignSearchRowBasic leadSourceJoin;
    protected MessageSearchRowBasic messagesJoin;
    protected TransactionSearchRowBasic orderJoin;
    protected OriginatingLeadSearchRowBasic originatingLeadJoin;
    protected PartnerSearchRowBasic partnerJoin;
    protected EmployeeSearchRowBasic salesRepJoin;
    protected TaskSearchRowBasic taskJoin;
    protected NoteSearchRowBasic userNotesJoin;
    protected List<CustomSearchRowBasic> customSearchJoin;

    /**
     * 获取basic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OpportunitySearchRowBasic }
     *     
     */
    public OpportunitySearchRowBasic getBasic() {
        return basic;
    }

    /**
     * 设置basic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OpportunitySearchRowBasic }
     *     
     */
    public void setBasic(OpportunitySearchRowBasic value) {
        this.basic = value;
    }

    /**
     * 获取actualJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public TransactionSearchRowBasic getActualJoin() {
        return actualJoin;
    }

    /**
     * 设置actualJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public void setActualJoin(TransactionSearchRowBasic value) {
        this.actualJoin = value;
    }

    /**
     * 获取callJoin属性的值。
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
     * 设置callJoin属性的值。
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
     * 获取decisionMakerJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ContactSearchRowBasic }
     *     
     */
    public ContactSearchRowBasic getDecisionMakerJoin() {
        return decisionMakerJoin;
    }

    /**
     * 设置decisionMakerJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ContactSearchRowBasic }
     *     
     */
    public void setDecisionMakerJoin(ContactSearchRowBasic value) {
        this.decisionMakerJoin = value;
    }

    /**
     * 获取estimateJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public TransactionSearchRowBasic getEstimateJoin() {
        return estimateJoin;
    }

    /**
     * 设置estimateJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public void setEstimateJoin(TransactionSearchRowBasic value) {
        this.estimateJoin = value;
    }

    /**
     * 获取eventJoin属性的值。
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
     * 设置eventJoin属性的值。
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
     * 获取fileJoin属性的值。
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
     * 设置fileJoin属性的值。
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
     * 获取itemJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public ItemSearchRowBasic getItemJoin() {
        return itemJoin;
    }

    /**
     * 设置itemJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public void setItemJoin(ItemSearchRowBasic value) {
        this.itemJoin = value;
    }

    /**
     * 获取leadSourceJoin属性的值。
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
     * 设置leadSourceJoin属性的值。
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
     * 获取messagesJoin属性的值。
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
     * 设置messagesJoin属性的值。
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
     * 获取orderJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public TransactionSearchRowBasic getOrderJoin() {
        return orderJoin;
    }

    /**
     * 设置orderJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public void setOrderJoin(TransactionSearchRowBasic value) {
        this.orderJoin = value;
    }

    /**
     * 获取originatingLeadJoin属性的值。
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
     * 设置originatingLeadJoin属性的值。
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
     * 获取partnerJoin属性的值。
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
     * 设置partnerJoin属性的值。
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
     * 获取salesRepJoin属性的值。
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
     * 设置salesRepJoin属性的值。
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
     * 获取userNotesJoin属性的值。
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
     * 设置userNotesJoin属性的值。
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
