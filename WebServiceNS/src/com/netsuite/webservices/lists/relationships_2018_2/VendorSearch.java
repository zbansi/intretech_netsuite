
package com.netsuite.webservices.lists.relationships_2018_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_2.AccountSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.CampaignSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.ContactSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.CustomSearchJoin;
import com.netsuite.webservices.platform.common_2018_2.EmployeeSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.FileSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.MessageSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.MseSubsidiarySearchBasic;
import com.netsuite.webservices.platform.common_2018_2.NoteSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.TransactionSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.VendorSearchBasic;
import com.netsuite.webservices.platform.core_2018_2.SearchRecord;


/**
 * <p>VendorSearch complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="VendorSearch">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRecord">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2018_2.platform.webservices.netsuite.com}VendorSearchBasic" minOccurs="0"/>
 *         &lt;element name="accountJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}AccountSearchBasic" minOccurs="0"/>
 *         &lt;element name="campaignResponseJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}CampaignSearchBasic" minOccurs="0"/>
 *         &lt;element name="contactJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ContactSearchBasic" minOccurs="0"/>
 *         &lt;element name="contactPrimaryJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ContactSearchBasic" minOccurs="0"/>
 *         &lt;element name="expAccountJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}AccountSearchBasic" minOccurs="0"/>
 *         &lt;element name="fileJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}FileSearchBasic" minOccurs="0"/>
 *         &lt;element name="messagesJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}MessageSearchBasic" minOccurs="0"/>
 *         &lt;element name="mseSubsidiaryJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}MseSubsidiarySearchBasic" minOccurs="0"/>
 *         &lt;element name="messagesFromJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}MessageSearchBasic" minOccurs="0"/>
 *         &lt;element name="messagesToJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}MessageSearchBasic" minOccurs="0"/>
 *         &lt;element name="timeApproverJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}EmployeeSearchBasic" minOccurs="0"/>
 *         &lt;element name="transactionJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/>
 *         &lt;element name="userJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}EmployeeSearchBasic" minOccurs="0"/>
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
@XmlType(name = "VendorSearch", propOrder = {
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
public class VendorSearch
    extends SearchRecord
{

    protected VendorSearchBasic basic;
    protected AccountSearchBasic accountJoin;
    protected CampaignSearchBasic campaignResponseJoin;
    protected ContactSearchBasic contactJoin;
    protected ContactSearchBasic contactPrimaryJoin;
    protected AccountSearchBasic expAccountJoin;
    protected FileSearchBasic fileJoin;
    protected MessageSearchBasic messagesJoin;
    protected MseSubsidiarySearchBasic mseSubsidiaryJoin;
    protected MessageSearchBasic messagesFromJoin;
    protected MessageSearchBasic messagesToJoin;
    protected EmployeeSearchBasic timeApproverJoin;
    protected TransactionSearchBasic transactionJoin;
    protected EmployeeSearchBasic userJoin;
    protected NoteSearchBasic userNotesJoin;
    protected List<CustomSearchJoin> customSearchJoin;

    /**
     * ��ȡbasic���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link VendorSearchBasic }
     *     
     */
    public VendorSearchBasic getBasic() {
        return basic;
    }

    /**
     * ����basic���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link VendorSearchBasic }
     *     
     */
    public void setBasic(VendorSearchBasic value) {
        this.basic = value;
    }

    /**
     * ��ȡaccountJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AccountSearchBasic }
     *     
     */
    public AccountSearchBasic getAccountJoin() {
        return accountJoin;
    }

    /**
     * ����accountJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSearchBasic }
     *     
     */
    public void setAccountJoin(AccountSearchBasic value) {
        this.accountJoin = value;
    }

    /**
     * ��ȡcampaignResponseJoin���Ե�ֵ��
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
     * ����campaignResponseJoin���Ե�ֵ��
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
     * ��ȡcontactJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ContactSearchBasic }
     *     
     */
    public ContactSearchBasic getContactJoin() {
        return contactJoin;
    }

    /**
     * ����contactJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ContactSearchBasic }
     *     
     */
    public void setContactJoin(ContactSearchBasic value) {
        this.contactJoin = value;
    }

    /**
     * ��ȡcontactPrimaryJoin���Ե�ֵ��
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
     * ����contactPrimaryJoin���Ե�ֵ��
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
     * ��ȡexpAccountJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AccountSearchBasic }
     *     
     */
    public AccountSearchBasic getExpAccountJoin() {
        return expAccountJoin;
    }

    /**
     * ����expAccountJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSearchBasic }
     *     
     */
    public void setExpAccountJoin(AccountSearchBasic value) {
        this.expAccountJoin = value;
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
     * ��ȡmseSubsidiaryJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MseSubsidiarySearchBasic }
     *     
     */
    public MseSubsidiarySearchBasic getMseSubsidiaryJoin() {
        return mseSubsidiaryJoin;
    }

    /**
     * ����mseSubsidiaryJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MseSubsidiarySearchBasic }
     *     
     */
    public void setMseSubsidiaryJoin(MseSubsidiarySearchBasic value) {
        this.mseSubsidiaryJoin = value;
    }

    /**
     * ��ȡmessagesFromJoin���Ե�ֵ��
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
     * ����messagesFromJoin���Ե�ֵ��
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
     * ��ȡmessagesToJoin���Ե�ֵ��
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
     * ����messagesToJoin���Ե�ֵ��
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
     * ��ȡtimeApproverJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public EmployeeSearchBasic getTimeApproverJoin() {
        return timeApproverJoin;
    }

    /**
     * ����timeApproverJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public void setTimeApproverJoin(EmployeeSearchBasic value) {
        this.timeApproverJoin = value;
    }

    /**
     * ��ȡtransactionJoin���Ե�ֵ��
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
     * ����transactionJoin���Ե�ֵ��
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
