
package com.netsuite.webservices.activities.scheduling_2018_2;

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
import com.netsuite.webservices.platform.common_2018_2.NoteSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.OpportunitySearchBasic;
import com.netsuite.webservices.platform.common_2018_2.OriginatingLeadSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.PhoneCallSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.SupportCaseSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.TransactionSearchBasic;
import com.netsuite.webservices.platform.core_2018_2.SearchRecord;


/**
 * <p>PhoneCallSearch complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="PhoneCallSearch">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRecord">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2018_2.platform.webservices.netsuite.com}PhoneCallSearchBasic" minOccurs="0"/>
 *         &lt;element name="caseJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}SupportCaseSearchBasic" minOccurs="0"/>
 *         &lt;element name="companyCustomerJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}CustomerSearchBasic" minOccurs="0"/>
 *         &lt;element name="contactJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ContactSearchBasic" minOccurs="0"/>
 *         &lt;element name="employeeJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}EmployeeSearchBasic" minOccurs="0"/>
 *         &lt;element name="fileJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}FileSearchBasic" minOccurs="0"/>
 *         &lt;element name="opportunityJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}OpportunitySearchBasic" minOccurs="0"/>
 *         &lt;element name="originatingLeadJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}OriginatingLeadSearchBasic" minOccurs="0"/>
 *         &lt;element name="participantJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}EntitySearchBasic" minOccurs="0"/>
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
@XmlType(name = "PhoneCallSearch", propOrder = {
    "basic",
    "caseJoin",
    "companyCustomerJoin",
    "contactJoin",
    "employeeJoin",
    "fileJoin",
    "opportunityJoin",
    "originatingLeadJoin",
    "participantJoin",
    "transactionJoin",
    "userJoin",
    "userNotesJoin",
    "customSearchJoin"
})
public class PhoneCallSearch
    extends SearchRecord
{

    protected PhoneCallSearchBasic basic;
    protected SupportCaseSearchBasic caseJoin;
    protected CustomerSearchBasic companyCustomerJoin;
    protected ContactSearchBasic contactJoin;
    protected EmployeeSearchBasic employeeJoin;
    protected FileSearchBasic fileJoin;
    protected OpportunitySearchBasic opportunityJoin;
    protected OriginatingLeadSearchBasic originatingLeadJoin;
    protected EntitySearchBasic participantJoin;
    protected TransactionSearchBasic transactionJoin;
    protected EmployeeSearchBasic userJoin;
    protected NoteSearchBasic userNotesJoin;
    protected List<CustomSearchJoin> customSearchJoin;

    /**
     * ��ȡbasic���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PhoneCallSearchBasic }
     *     
     */
    public PhoneCallSearchBasic getBasic() {
        return basic;
    }

    /**
     * ����basic���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneCallSearchBasic }
     *     
     */
    public void setBasic(PhoneCallSearchBasic value) {
        this.basic = value;
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
     * ��ȡcompanyCustomerJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CustomerSearchBasic }
     *     
     */
    public CustomerSearchBasic getCompanyCustomerJoin() {
        return companyCustomerJoin;
    }

    /**
     * ����companyCustomerJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSearchBasic }
     *     
     */
    public void setCompanyCustomerJoin(CustomerSearchBasic value) {
        this.companyCustomerJoin = value;
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
     * ��ȡopportunityJoin���Ե�ֵ��
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
     * ����opportunityJoin���Ե�ֵ��
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
     * ��ȡparticipantJoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link EntitySearchBasic }
     *     
     */
    public EntitySearchBasic getParticipantJoin() {
        return participantJoin;
    }

    /**
     * ����participantJoin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link EntitySearchBasic }
     *     
     */
    public void setParticipantJoin(EntitySearchBasic value) {
        this.participantJoin = value;
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
