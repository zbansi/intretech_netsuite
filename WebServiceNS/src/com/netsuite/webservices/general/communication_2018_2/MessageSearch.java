
package com.netsuite.webservices.general.communication_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_2.CampaignSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.ContactSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.CustomerSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.EmployeeSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.EntitySearchBasic;
import com.netsuite.webservices.platform.common_2018_2.FileSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.MessageSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.OpportunitySearchBasic;
import com.netsuite.webservices.platform.common_2018_2.OriginatingLeadSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.PartnerSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.SupportCaseSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.TransactionSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.VendorSearchBasic;
import com.netsuite.webservices.platform.core_2018_2.SearchRecord;


/**
 * <p>MessageSearch complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MessageSearch">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRecord">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2018_2.platform.webservices.netsuite.com}MessageSearchBasic" minOccurs="0"/>
 *         &lt;element name="attachmentsJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}FileSearchBasic" minOccurs="0"/>
 *         &lt;element name="authorJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}EntitySearchBasic" minOccurs="0"/>
 *         &lt;element name="campaignJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}CampaignSearchBasic" minOccurs="0"/>
 *         &lt;element name="caseJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}SupportCaseSearchBasic" minOccurs="0"/>
 *         &lt;element name="contactJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ContactSearchBasic" minOccurs="0"/>
 *         &lt;element name="customerJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}CustomerSearchBasic" minOccurs="0"/>
 *         &lt;element name="employeeJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}EmployeeSearchBasic" minOccurs="0"/>
 *         &lt;element name="entityJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}EntitySearchBasic" minOccurs="0"/>
 *         &lt;element name="opportunityJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}OpportunitySearchBasic" minOccurs="0"/>
 *         &lt;element name="originatingLeadJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}OriginatingLeadSearchBasic" minOccurs="0"/>
 *         &lt;element name="partnerJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}PartnerSearchBasic" minOccurs="0"/>
 *         &lt;element name="recipientJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}EntitySearchBasic" minOccurs="0"/>
 *         &lt;element name="transactionJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/>
 *         &lt;element name="userJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}EmployeeSearchBasic" minOccurs="0"/>
 *         &lt;element name="vendorJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}VendorSearchBasic" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageSearch", propOrder = {
    "basic",
    "attachmentsJoin",
    "authorJoin",
    "campaignJoin",
    "caseJoin",
    "contactJoin",
    "customerJoin",
    "employeeJoin",
    "entityJoin",
    "opportunityJoin",
    "originatingLeadJoin",
    "partnerJoin",
    "recipientJoin",
    "transactionJoin",
    "userJoin",
    "vendorJoin"
})
public class MessageSearch
    extends SearchRecord
{

    protected MessageSearchBasic basic;
    protected FileSearchBasic attachmentsJoin;
    protected EntitySearchBasic authorJoin;
    protected CampaignSearchBasic campaignJoin;
    protected SupportCaseSearchBasic caseJoin;
    protected ContactSearchBasic contactJoin;
    protected CustomerSearchBasic customerJoin;
    protected EmployeeSearchBasic employeeJoin;
    protected EntitySearchBasic entityJoin;
    protected OpportunitySearchBasic opportunityJoin;
    protected OriginatingLeadSearchBasic originatingLeadJoin;
    protected PartnerSearchBasic partnerJoin;
    protected EntitySearchBasic recipientJoin;
    protected TransactionSearchBasic transactionJoin;
    protected EmployeeSearchBasic userJoin;
    protected VendorSearchBasic vendorJoin;

    /**
     * 获取basic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MessageSearchBasic }
     *     
     */
    public MessageSearchBasic getBasic() {
        return basic;
    }

    /**
     * 设置basic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MessageSearchBasic }
     *     
     */
    public void setBasic(MessageSearchBasic value) {
        this.basic = value;
    }

    /**
     * 获取attachmentsJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FileSearchBasic }
     *     
     */
    public FileSearchBasic getAttachmentsJoin() {
        return attachmentsJoin;
    }

    /**
     * 设置attachmentsJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FileSearchBasic }
     *     
     */
    public void setAttachmentsJoin(FileSearchBasic value) {
        this.attachmentsJoin = value;
    }

    /**
     * 获取authorJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EntitySearchBasic }
     *     
     */
    public EntitySearchBasic getAuthorJoin() {
        return authorJoin;
    }

    /**
     * 设置authorJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EntitySearchBasic }
     *     
     */
    public void setAuthorJoin(EntitySearchBasic value) {
        this.authorJoin = value;
    }

    /**
     * 获取campaignJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CampaignSearchBasic }
     *     
     */
    public CampaignSearchBasic getCampaignJoin() {
        return campaignJoin;
    }

    /**
     * 设置campaignJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignSearchBasic }
     *     
     */
    public void setCampaignJoin(CampaignSearchBasic value) {
        this.campaignJoin = value;
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
     * 获取entityJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EntitySearchBasic }
     *     
     */
    public EntitySearchBasic getEntityJoin() {
        return entityJoin;
    }

    /**
     * 设置entityJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EntitySearchBasic }
     *     
     */
    public void setEntityJoin(EntitySearchBasic value) {
        this.entityJoin = value;
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
     * 获取originatingLeadJoin属性的值。
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
     * 设置originatingLeadJoin属性的值。
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
     * 获取recipientJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EntitySearchBasic }
     *     
     */
    public EntitySearchBasic getRecipientJoin() {
        return recipientJoin;
    }

    /**
     * 设置recipientJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EntitySearchBasic }
     *     
     */
    public void setRecipientJoin(EntitySearchBasic value) {
        this.recipientJoin = value;
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

}
