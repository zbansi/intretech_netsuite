
package com.netsuite.webservices.lists.support_2018_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_2.ContactSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.CustomSearchJoin;
import com.netsuite.webservices.platform.common_2018_2.CustomerSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.EmployeeSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.EntitySearchBasic;
import com.netsuite.webservices.platform.common_2018_2.FileSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.IssueSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.ItemSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.MessageSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.NoteSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.SupportCaseSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.TimeBillSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.TransactionSearchBasic;
import com.netsuite.webservices.platform.core_2018_2.SearchRecord;


/**
 * <p>SupportCaseSearch complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SupportCaseSearch">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRecord">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2018_2.platform.webservices.netsuite.com}SupportCaseSearchBasic" minOccurs="0"/>
 *         &lt;element name="companyJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}EntitySearchBasic" minOccurs="0"/>
 *         &lt;element name="contactJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ContactSearchBasic" minOccurs="0"/>
 *         &lt;element name="customerJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}CustomerSearchBasic" minOccurs="0"/>
 *         &lt;element name="employeeJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}EmployeeSearchBasic" minOccurs="0"/>
 *         &lt;element name="fileJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}FileSearchBasic" minOccurs="0"/>
 *         &lt;element name="issueJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}IssueSearchBasic" minOccurs="0"/>
 *         &lt;element name="itemJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ItemSearchBasic" minOccurs="0"/>
 *         &lt;element name="messagesJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}MessageSearchBasic" minOccurs="0"/>
 *         &lt;element name="timeJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TimeBillSearchBasic" minOccurs="0"/>
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
@XmlType(name = "SupportCaseSearch", propOrder = {
    "basic",
    "companyJoin",
    "contactJoin",
    "customerJoin",
    "employeeJoin",
    "fileJoin",
    "issueJoin",
    "itemJoin",
    "messagesJoin",
    "timeJoin",
    "transactionJoin",
    "userJoin",
    "userNotesJoin",
    "customSearchJoin"
})
public class SupportCaseSearch
    extends SearchRecord
{

    protected SupportCaseSearchBasic basic;
    protected EntitySearchBasic companyJoin;
    protected ContactSearchBasic contactJoin;
    protected CustomerSearchBasic customerJoin;
    protected EmployeeSearchBasic employeeJoin;
    protected FileSearchBasic fileJoin;
    protected IssueSearchBasic issueJoin;
    protected ItemSearchBasic itemJoin;
    protected MessageSearchBasic messagesJoin;
    protected TimeBillSearchBasic timeJoin;
    protected TransactionSearchBasic transactionJoin;
    protected EmployeeSearchBasic userJoin;
    protected NoteSearchBasic userNotesJoin;
    protected List<CustomSearchJoin> customSearchJoin;

    /**
     * 获取basic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SupportCaseSearchBasic }
     *     
     */
    public SupportCaseSearchBasic getBasic() {
        return basic;
    }

    /**
     * 设置basic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SupportCaseSearchBasic }
     *     
     */
    public void setBasic(SupportCaseSearchBasic value) {
        this.basic = value;
    }

    /**
     * 获取companyJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EntitySearchBasic }
     *     
     */
    public EntitySearchBasic getCompanyJoin() {
        return companyJoin;
    }

    /**
     * 设置companyJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EntitySearchBasic }
     *     
     */
    public void setCompanyJoin(EntitySearchBasic value) {
        this.companyJoin = value;
    }

    /**
     * 获取contactJoin属性的值。
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
     * 设置contactJoin属性的值。
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
     * 获取employeeJoin属性的值。
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
     * 设置employeeJoin属性的值。
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
     * 获取issueJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IssueSearchBasic }
     *     
     */
    public IssueSearchBasic getIssueJoin() {
        return issueJoin;
    }

    /**
     * 设置issueJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IssueSearchBasic }
     *     
     */
    public void setIssueJoin(IssueSearchBasic value) {
        this.issueJoin = value;
    }

    /**
     * 获取itemJoin属性的值。
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
     * 设置itemJoin属性的值。
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
