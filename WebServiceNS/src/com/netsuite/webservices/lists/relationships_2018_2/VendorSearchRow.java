
package com.netsuite.webservices.lists.relationships_2018_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_2.AccountSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.CampaignSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.ContactSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.CustomSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.EmployeeSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.FileSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.MessageSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.MseSubsidiarySearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.NoteSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.TransactionSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.VendorSearchRowBasic;
import com.netsuite.webservices.platform.core_2018_2.SearchRow;


/**
 * <p>VendorSearchRow complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="VendorSearchRow">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRow">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2018_2.platform.webservices.netsuite.com}VendorSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="accountJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}AccountSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="campaignResponseJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}CampaignSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="contactJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ContactSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="contactPrimaryJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ContactSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="expAccountJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}AccountSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="fileJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}FileSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="messagesJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}MessageSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="mseSubsidiaryJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}MseSubsidiarySearchRowBasic" minOccurs="0"/>
 *         &lt;element name="messagesFromJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}MessageSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="messagesToJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}MessageSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="timeApproverJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}EmployeeSearchRowBasic" minOccurs="0"/>
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
@XmlType(name = "VendorSearchRow", propOrder = {
    "basic",
    "accountJoin",
    "campaignResponseJoin",
    "contactJoin",
    "contactPrimaryJoin",
    "expAccountJoin",
    "fileJoin",
    "messagesJoin",
    "mseSubsidiaryJoin",
    "messagesFromJoin",
    "messagesToJoin",
    "timeApproverJoin",
    "transactionJoin",
    "userJoin",
    "userNotesJoin",
    "customSearchJoin"
})
public class VendorSearchRow
    extends SearchRow
{

    protected VendorSearchRowBasic basic;
    protected AccountSearchRowBasic accountJoin;
    protected CampaignSearchRowBasic campaignResponseJoin;
    protected ContactSearchRowBasic contactJoin;
    protected ContactSearchRowBasic contactPrimaryJoin;
    protected AccountSearchRowBasic expAccountJoin;
    protected FileSearchRowBasic fileJoin;
    protected MessageSearchRowBasic messagesJoin;
    protected MseSubsidiarySearchRowBasic mseSubsidiaryJoin;
    protected MessageSearchRowBasic messagesFromJoin;
    protected MessageSearchRowBasic messagesToJoin;
    protected EmployeeSearchRowBasic timeApproverJoin;
    protected TransactionSearchRowBasic transactionJoin;
    protected EmployeeSearchRowBasic userJoin;
    protected NoteSearchRowBasic userNotesJoin;
    protected List<CustomSearchRowBasic> customSearchJoin;

    /**
     * 获取basic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VendorSearchRowBasic }
     *     
     */
    public VendorSearchRowBasic getBasic() {
        return basic;
    }

    /**
     * 设置basic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VendorSearchRowBasic }
     *     
     */
    public void setBasic(VendorSearchRowBasic value) {
        this.basic = value;
    }

    /**
     * 获取accountJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AccountSearchRowBasic }
     *     
     */
    public AccountSearchRowBasic getAccountJoin() {
        return accountJoin;
    }

    /**
     * 设置accountJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSearchRowBasic }
     *     
     */
    public void setAccountJoin(AccountSearchRowBasic value) {
        this.accountJoin = value;
    }

    /**
     * 获取campaignResponseJoin属性的值。
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
     * 设置campaignResponseJoin属性的值。
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
     * 获取contactJoin属性的值。
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
     * 设置contactJoin属性的值。
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
     * 获取expAccountJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AccountSearchRowBasic }
     *     
     */
    public AccountSearchRowBasic getExpAccountJoin() {
        return expAccountJoin;
    }

    /**
     * 设置expAccountJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSearchRowBasic }
     *     
     */
    public void setExpAccountJoin(AccountSearchRowBasic value) {
        this.expAccountJoin = value;
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
     * 获取mseSubsidiaryJoin属性的值。
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
     * 设置mseSubsidiaryJoin属性的值。
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
     * 获取messagesFromJoin属性的值。
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
     * 设置messagesFromJoin属性的值。
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
     * 获取messagesToJoin属性的值。
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
     * 设置messagesToJoin属性的值。
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
     * 获取timeApproverJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public EmployeeSearchRowBasic getTimeApproverJoin() {
        return timeApproverJoin;
    }

    /**
     * 设置timeApproverJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public void setTimeApproverJoin(EmployeeSearchRowBasic value) {
        this.timeApproverJoin = value;
    }

    /**
     * 获取transactionJoin属性的值。
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
     * 设置transactionJoin属性的值。
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
     * 获取userJoin属性的值。
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
     * 设置userJoin属性的值。
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
