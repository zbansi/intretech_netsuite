
package com.netsuite.webservices.lists.relationships_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.lists.relationships_2018_2.types.EmailPreference;
import com.netsuite.webservices.lists.relationships_2018_2.types.JobBillingType;
import com.netsuite.webservices.platform.common_2018_2.types.GlobalSubscriptionStatus;
import com.netsuite.webservices.platform.core_2018_2.CustomFieldList;
import com.netsuite.webservices.platform.core_2018_2.Duration;
import com.netsuite.webservices.platform.core_2018_2.Record;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;


/**
 * <p>Job complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Job">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}Record">
 *       &lt;sequence>
 *         &lt;element name="customForm" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="entityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="altName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneticName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entityStatus" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="defaultAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parent" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="isInactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="percentCompleteOverrideList" type="{urn:relationships_2018_2.lists.webservices.netsuite.com}JobPercentCompleteOverrideList" minOccurs="0"/>
 *         &lt;element name="lastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="billPay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="dateCreated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="category" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="workplace" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="language" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currency" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="fxRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="altPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="calculatedEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="calculatedEndDateBaseline" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="startDateBaseline" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="projectedEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="projectedEndDateBaseline" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastBaselineDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="jobType" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="percentComplete" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="estimatedCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="estimatedRevenue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="estimatedTime" type="{urn:core_2018_2.platform.webservices.netsuite.com}Duration" minOccurs="0"/>
 *         &lt;element name="estimatedTimeOverride" type="{urn:core_2018_2.platform.webservices.netsuite.com}Duration" minOccurs="0"/>
 *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailPreference" type="{urn:types.relationships_2018_2.lists.webservices.netsuite.com}EmailPreference" minOccurs="0"/>
 *         &lt;element name="openingBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="openingBalanceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="openingBalanceAccount" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="subsidiary" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="jobBillingType" type="{urn:types.relationships_2018_2.lists.webservices.netsuite.com}JobBillingType" minOccurs="0"/>
 *         &lt;element name="billingSchedule" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="jobItem" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="percentTimeComplete" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="actualTime" type="{urn:core_2018_2.platform.webservices.netsuite.com}Duration" minOccurs="0"/>
 *         &lt;element name="allowTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="timeRemaining" type="{urn:core_2018_2.platform.webservices.netsuite.com}Duration" minOccurs="0"/>
 *         &lt;element name="limitTimeToAssignees" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="estimatedLaborCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="estimatedLaborCostBaseline" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="estimateRevRecTemplate" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="revRecForecastRule" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="usePercentCompleteOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="estimatedLaborRevenue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="estimatedGrossProfit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="estimatedGrossProfitPercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="projectExpenseType" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="applyProjectExpenseTypeToAll" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="allowAllResourcesForTasks" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="jobPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="isUtilizedTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isProductiveTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isExemptTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="materializeTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="allowExpenses" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="allocatePayrollExpenses" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="includeCrmTasksInTotals" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="globalSubscriptionStatus" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}GlobalSubscriptionStatus" minOccurs="0"/>
 *         &lt;element name="jobResourcesList" type="{urn:relationships_2018_2.lists.webservices.netsuite.com}JobResourcesList" minOccurs="0"/>
 *         &lt;element name="plStatementList" type="{urn:relationships_2018_2.lists.webservices.netsuite.com}JobPlStatementList" minOccurs="0"/>
 *         &lt;element name="addressbookList" type="{urn:relationships_2018_2.lists.webservices.netsuite.com}JobAddressbookList" minOccurs="0"/>
 *         &lt;element name="milestonesList" type="{urn:relationships_2018_2.lists.webservices.netsuite.com}JobMilestonesList" minOccurs="0"/>
 *         &lt;element name="creditCardsList" type="{urn:relationships_2018_2.lists.webservices.netsuite.com}JobCreditCardsList" minOccurs="0"/>
 *         &lt;element name="customFieldList" type="{urn:core_2018_2.platform.webservices.netsuite.com}CustomFieldList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="internalId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="externalId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Job", propOrder = {
    "customForm",
    "entityId",
    "altName",
    "companyName",
    "phoneticName",
    "entityStatus",
    "defaultAddress",
    "parent",
    "isInactive",
    "percentCompleteOverrideList",
    "lastModifiedDate",
    "billPay",
    "dateCreated",
    "category",
    "workplace",
    "language",
    "comments",
    "accountNumber",
    "currency",
    "fxRate",
    "startDate",
    "endDate",
    "phone",
    "altPhone",
    "calculatedEndDate",
    "calculatedEndDateBaseline",
    "startDateBaseline",
    "projectedEndDate",
    "projectedEndDateBaseline",
    "lastBaselineDate",
    "jobType",
    "percentComplete",
    "estimatedCost",
    "estimatedRevenue",
    "estimatedTime",
    "estimatedTimeOverride",
    "fax",
    "email",
    "emailPreference",
    "openingBalance",
    "openingBalanceDate",
    "openingBalanceAccount",
    "subsidiary",
    "jobBillingType",
    "billingSchedule",
    "jobItem",
    "percentTimeComplete",
    "actualTime",
    "allowTime",
    "timeRemaining",
    "limitTimeToAssignees",
    "estimatedLaborCost",
    "estimatedLaborCostBaseline",
    "estimateRevRecTemplate",
    "revRecForecastRule",
    "usePercentCompleteOverride",
    "estimatedLaborRevenue",
    "estimatedGrossProfit",
    "estimatedGrossProfitPercent",
    "projectExpenseType",
    "applyProjectExpenseTypeToAll",
    "allowAllResourcesForTasks",
    "jobPrice",
    "isUtilizedTime",
    "isProductiveTime",
    "isExemptTime",
    "materializeTime",
    "allowExpenses",
    "allocatePayrollExpenses",
    "includeCrmTasksInTotals",
    "globalSubscriptionStatus",
    "jobResourcesList",
    "plStatementList",
    "addressbookList",
    "milestonesList",
    "creditCardsList",
    "customFieldList"
})
public class Job
    extends Record
{

    protected RecordRef customForm;
    protected String entityId;
    protected String altName;
    protected String companyName;
    protected String phoneticName;
    protected RecordRef entityStatus;
    protected String defaultAddress;
    protected RecordRef parent;
    protected Boolean isInactive;
    protected JobPercentCompleteOverrideList percentCompleteOverrideList;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    protected Boolean billPay;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreated;
    protected RecordRef category;
    protected RecordRef workplace;
    protected RecordRef language;
    protected String comments;
    protected String accountNumber;
    protected RecordRef currency;
    protected Double fxRate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected String phone;
    protected String altPhone;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar calculatedEndDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar calculatedEndDateBaseline;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDateBaseline;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar projectedEndDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar projectedEndDateBaseline;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastBaselineDate;
    protected RecordRef jobType;
    protected Double percentComplete;
    protected Double estimatedCost;
    protected Double estimatedRevenue;
    protected Duration estimatedTime;
    protected Duration estimatedTimeOverride;
    protected String fax;
    protected String email;
    @XmlSchemaType(name = "string")
    protected EmailPreference emailPreference;
    protected Double openingBalance;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar openingBalanceDate;
    protected RecordRef openingBalanceAccount;
    protected RecordRef subsidiary;
    @XmlSchemaType(name = "string")
    protected JobBillingType jobBillingType;
    protected RecordRef billingSchedule;
    protected RecordRef jobItem;
    protected Double percentTimeComplete;
    protected Duration actualTime;
    protected Boolean allowTime;
    protected Duration timeRemaining;
    protected Boolean limitTimeToAssignees;
    protected Double estimatedLaborCost;
    protected Double estimatedLaborCostBaseline;
    protected RecordRef estimateRevRecTemplate;
    protected RecordRef revRecForecastRule;
    protected Boolean usePercentCompleteOverride;
    protected Double estimatedLaborRevenue;
    protected Double estimatedGrossProfit;
    protected Double estimatedGrossProfitPercent;
    protected RecordRef projectExpenseType;
    protected Boolean applyProjectExpenseTypeToAll;
    protected Boolean allowAllResourcesForTasks;
    protected Double jobPrice;
    protected Boolean isUtilizedTime;
    protected Boolean isProductiveTime;
    protected Boolean isExemptTime;
    protected Boolean materializeTime;
    protected Boolean allowExpenses;
    protected Boolean allocatePayrollExpenses;
    protected Boolean includeCrmTasksInTotals;
    @XmlSchemaType(name = "string")
    protected GlobalSubscriptionStatus globalSubscriptionStatus;
    protected JobResourcesList jobResourcesList;
    protected JobPlStatementList plStatementList;
    protected JobAddressbookList addressbookList;
    protected JobMilestonesList milestonesList;
    protected JobCreditCardsList creditCardsList;
    protected CustomFieldList customFieldList;
    @XmlAttribute(name = "internalId")
    protected String internalId;
    @XmlAttribute(name = "externalId")
    protected String externalId;

    /**
     * ��ȡcustomForm���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCustomForm() {
        return customForm;
    }

    /**
     * ����customForm���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCustomForm(RecordRef value) {
        this.customForm = value;
    }

    /**
     * ��ȡentityId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityId() {
        return entityId;
    }

    /**
     * ����entityId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityId(String value) {
        this.entityId = value;
    }

    /**
     * ��ȡaltName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltName() {
        return altName;
    }

    /**
     * ����altName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltName(String value) {
        this.altName = value;
    }

    /**
     * ��ȡcompanyName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * ����companyName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * ��ȡphoneticName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneticName() {
        return phoneticName;
    }

    /**
     * ����phoneticName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneticName(String value) {
        this.phoneticName = value;
    }

    /**
     * ��ȡentityStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getEntityStatus() {
        return entityStatus;
    }

    /**
     * ����entityStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setEntityStatus(RecordRef value) {
        this.entityStatus = value;
    }

    /**
     * ��ȡdefaultAddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultAddress() {
        return defaultAddress;
    }

    /**
     * ����defaultAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultAddress(String value) {
        this.defaultAddress = value;
    }

    /**
     * ��ȡparent���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getParent() {
        return parent;
    }

    /**
     * ����parent���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setParent(RecordRef value) {
        this.parent = value;
    }

    /**
     * ��ȡisInactive���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInactive() {
        return isInactive;
    }

    /**
     * ����isInactive���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInactive(Boolean value) {
        this.isInactive = value;
    }

    /**
     * ��ȡpercentCompleteOverrideList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JobPercentCompleteOverrideList }
     *     
     */
    public JobPercentCompleteOverrideList getPercentCompleteOverrideList() {
        return percentCompleteOverrideList;
    }

    /**
     * ����percentCompleteOverrideList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JobPercentCompleteOverrideList }
     *     
     */
    public void setPercentCompleteOverrideList(JobPercentCompleteOverrideList value) {
        this.percentCompleteOverrideList = value;
    }

    /**
     * ��ȡlastModifiedDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * ����lastModifiedDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedDate(XMLGregorianCalendar value) {
        this.lastModifiedDate = value;
    }

    /**
     * ��ȡbillPay���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBillPay() {
        return billPay;
    }

    /**
     * ����billPay���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBillPay(Boolean value) {
        this.billPay = value;
    }

    /**
     * ��ȡdateCreated���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCreated() {
        return dateCreated;
    }

    /**
     * ����dateCreated���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCreated(XMLGregorianCalendar value) {
        this.dateCreated = value;
    }

    /**
     * ��ȡcategory���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCategory() {
        return category;
    }

    /**
     * ����category���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCategory(RecordRef value) {
        this.category = value;
    }

    /**
     * ��ȡworkplace���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getWorkplace() {
        return workplace;
    }

    /**
     * ����workplace���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setWorkplace(RecordRef value) {
        this.workplace = value;
    }

    /**
     * ��ȡlanguage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getLanguage() {
        return language;
    }

    /**
     * ����language���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setLanguage(RecordRef value) {
        this.language = value;
    }

    /**
     * ��ȡcomments���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * ����comments���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * ��ȡaccountNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * ����accountNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * ��ȡcurrency���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCurrency() {
        return currency;
    }

    /**
     * ����currency���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCurrency(RecordRef value) {
        this.currency = value;
    }

    /**
     * ��ȡfxRate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFxRate() {
        return fxRate;
    }

    /**
     * ����fxRate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFxRate(Double value) {
        this.fxRate = value;
    }

    /**
     * ��ȡstartDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * ����startDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * ��ȡendDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * ����endDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * ��ȡphone���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * ����phone���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * ��ȡaltPhone���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltPhone() {
        return altPhone;
    }

    /**
     * ����altPhone���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltPhone(String value) {
        this.altPhone = value;
    }

    /**
     * ��ȡcalculatedEndDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCalculatedEndDate() {
        return calculatedEndDate;
    }

    /**
     * ����calculatedEndDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCalculatedEndDate(XMLGregorianCalendar value) {
        this.calculatedEndDate = value;
    }

    /**
     * ��ȡcalculatedEndDateBaseline���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCalculatedEndDateBaseline() {
        return calculatedEndDateBaseline;
    }

    /**
     * ����calculatedEndDateBaseline���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCalculatedEndDateBaseline(XMLGregorianCalendar value) {
        this.calculatedEndDateBaseline = value;
    }

    /**
     * ��ȡstartDateBaseline���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDateBaseline() {
        return startDateBaseline;
    }

    /**
     * ����startDateBaseline���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDateBaseline(XMLGregorianCalendar value) {
        this.startDateBaseline = value;
    }

    /**
     * ��ȡprojectedEndDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProjectedEndDate() {
        return projectedEndDate;
    }

    /**
     * ����projectedEndDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProjectedEndDate(XMLGregorianCalendar value) {
        this.projectedEndDate = value;
    }

    /**
     * ��ȡprojectedEndDateBaseline���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProjectedEndDateBaseline() {
        return projectedEndDateBaseline;
    }

    /**
     * ����projectedEndDateBaseline���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProjectedEndDateBaseline(XMLGregorianCalendar value) {
        this.projectedEndDateBaseline = value;
    }

    /**
     * ��ȡlastBaselineDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastBaselineDate() {
        return lastBaselineDate;
    }

    /**
     * ����lastBaselineDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastBaselineDate(XMLGregorianCalendar value) {
        this.lastBaselineDate = value;
    }

    /**
     * ��ȡjobType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getJobType() {
        return jobType;
    }

    /**
     * ����jobType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setJobType(RecordRef value) {
        this.jobType = value;
    }

    /**
     * ��ȡpercentComplete���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercentComplete() {
        return percentComplete;
    }

    /**
     * ����percentComplete���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercentComplete(Double value) {
        this.percentComplete = value;
    }

    /**
     * ��ȡestimatedCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEstimatedCost() {
        return estimatedCost;
    }

    /**
     * ����estimatedCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEstimatedCost(Double value) {
        this.estimatedCost = value;
    }

    /**
     * ��ȡestimatedRevenue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEstimatedRevenue() {
        return estimatedRevenue;
    }

    /**
     * ����estimatedRevenue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEstimatedRevenue(Double value) {
        this.estimatedRevenue = value;
    }

    /**
     * ��ȡestimatedTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getEstimatedTime() {
        return estimatedTime;
    }

    /**
     * ����estimatedTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setEstimatedTime(Duration value) {
        this.estimatedTime = value;
    }

    /**
     * ��ȡestimatedTimeOverride���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getEstimatedTimeOverride() {
        return estimatedTimeOverride;
    }

    /**
     * ����estimatedTimeOverride���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setEstimatedTimeOverride(Duration value) {
        this.estimatedTimeOverride = value;
    }

    /**
     * ��ȡfax���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * ����fax���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * ��ȡemail���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * ����email���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * ��ȡemailPreference���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link EmailPreference }
     *     
     */
    public EmailPreference getEmailPreference() {
        return emailPreference;
    }

    /**
     * ����emailPreference���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link EmailPreference }
     *     
     */
    public void setEmailPreference(EmailPreference value) {
        this.emailPreference = value;
    }

    /**
     * ��ȡopeningBalance���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOpeningBalance() {
        return openingBalance;
    }

    /**
     * ����openingBalance���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOpeningBalance(Double value) {
        this.openingBalance = value;
    }

    /**
     * ��ȡopeningBalanceDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOpeningBalanceDate() {
        return openingBalanceDate;
    }

    /**
     * ����openingBalanceDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOpeningBalanceDate(XMLGregorianCalendar value) {
        this.openingBalanceDate = value;
    }

    /**
     * ��ȡopeningBalanceAccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getOpeningBalanceAccount() {
        return openingBalanceAccount;
    }

    /**
     * ����openingBalanceAccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setOpeningBalanceAccount(RecordRef value) {
        this.openingBalanceAccount = value;
    }

    /**
     * ��ȡsubsidiary���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSubsidiary() {
        return subsidiary;
    }

    /**
     * ����subsidiary���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSubsidiary(RecordRef value) {
        this.subsidiary = value;
    }

    /**
     * ��ȡjobBillingType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JobBillingType }
     *     
     */
    public JobBillingType getJobBillingType() {
        return jobBillingType;
    }

    /**
     * ����jobBillingType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JobBillingType }
     *     
     */
    public void setJobBillingType(JobBillingType value) {
        this.jobBillingType = value;
    }

    /**
     * ��ȡbillingSchedule���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getBillingSchedule() {
        return billingSchedule;
    }

    /**
     * ����billingSchedule���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setBillingSchedule(RecordRef value) {
        this.billingSchedule = value;
    }

    /**
     * ��ȡjobItem���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getJobItem() {
        return jobItem;
    }

    /**
     * ����jobItem���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setJobItem(RecordRef value) {
        this.jobItem = value;
    }

    /**
     * ��ȡpercentTimeComplete���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercentTimeComplete() {
        return percentTimeComplete;
    }

    /**
     * ����percentTimeComplete���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercentTimeComplete(Double value) {
        this.percentTimeComplete = value;
    }

    /**
     * ��ȡactualTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getActualTime() {
        return actualTime;
    }

    /**
     * ����actualTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setActualTime(Duration value) {
        this.actualTime = value;
    }

    /**
     * ��ȡallowTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowTime() {
        return allowTime;
    }

    /**
     * ����allowTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowTime(Boolean value) {
        this.allowTime = value;
    }

    /**
     * ��ȡtimeRemaining���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimeRemaining() {
        return timeRemaining;
    }

    /**
     * ����timeRemaining���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTimeRemaining(Duration value) {
        this.timeRemaining = value;
    }

    /**
     * ��ȡlimitTimeToAssignees���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLimitTimeToAssignees() {
        return limitTimeToAssignees;
    }

    /**
     * ����limitTimeToAssignees���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLimitTimeToAssignees(Boolean value) {
        this.limitTimeToAssignees = value;
    }

    /**
     * ��ȡestimatedLaborCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEstimatedLaborCost() {
        return estimatedLaborCost;
    }

    /**
     * ����estimatedLaborCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEstimatedLaborCost(Double value) {
        this.estimatedLaborCost = value;
    }

    /**
     * ��ȡestimatedLaborCostBaseline���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEstimatedLaborCostBaseline() {
        return estimatedLaborCostBaseline;
    }

    /**
     * ����estimatedLaborCostBaseline���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEstimatedLaborCostBaseline(Double value) {
        this.estimatedLaborCostBaseline = value;
    }

    /**
     * ��ȡestimateRevRecTemplate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getEstimateRevRecTemplate() {
        return estimateRevRecTemplate;
    }

    /**
     * ����estimateRevRecTemplate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setEstimateRevRecTemplate(RecordRef value) {
        this.estimateRevRecTemplate = value;
    }

    /**
     * ��ȡrevRecForecastRule���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getRevRecForecastRule() {
        return revRecForecastRule;
    }

    /**
     * ����revRecForecastRule���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setRevRecForecastRule(RecordRef value) {
        this.revRecForecastRule = value;
    }

    /**
     * ��ȡusePercentCompleteOverride���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsePercentCompleteOverride() {
        return usePercentCompleteOverride;
    }

    /**
     * ����usePercentCompleteOverride���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsePercentCompleteOverride(Boolean value) {
        this.usePercentCompleteOverride = value;
    }

    /**
     * ��ȡestimatedLaborRevenue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEstimatedLaborRevenue() {
        return estimatedLaborRevenue;
    }

    /**
     * ����estimatedLaborRevenue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEstimatedLaborRevenue(Double value) {
        this.estimatedLaborRevenue = value;
    }

    /**
     * ��ȡestimatedGrossProfit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEstimatedGrossProfit() {
        return estimatedGrossProfit;
    }

    /**
     * ����estimatedGrossProfit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEstimatedGrossProfit(Double value) {
        this.estimatedGrossProfit = value;
    }

    /**
     * ��ȡestimatedGrossProfitPercent���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEstimatedGrossProfitPercent() {
        return estimatedGrossProfitPercent;
    }

    /**
     * ����estimatedGrossProfitPercent���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEstimatedGrossProfitPercent(Double value) {
        this.estimatedGrossProfitPercent = value;
    }

    /**
     * ��ȡprojectExpenseType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getProjectExpenseType() {
        return projectExpenseType;
    }

    /**
     * ����projectExpenseType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setProjectExpenseType(RecordRef value) {
        this.projectExpenseType = value;
    }

    /**
     * ��ȡapplyProjectExpenseTypeToAll���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplyProjectExpenseTypeToAll() {
        return applyProjectExpenseTypeToAll;
    }

    /**
     * ����applyProjectExpenseTypeToAll���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplyProjectExpenseTypeToAll(Boolean value) {
        this.applyProjectExpenseTypeToAll = value;
    }

    /**
     * ��ȡallowAllResourcesForTasks���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowAllResourcesForTasks() {
        return allowAllResourcesForTasks;
    }

    /**
     * ����allowAllResourcesForTasks���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowAllResourcesForTasks(Boolean value) {
        this.allowAllResourcesForTasks = value;
    }

    /**
     * ��ȡjobPrice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getJobPrice() {
        return jobPrice;
    }

    /**
     * ����jobPrice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setJobPrice(Double value) {
        this.jobPrice = value;
    }

    /**
     * ��ȡisUtilizedTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsUtilizedTime() {
        return isUtilizedTime;
    }

    /**
     * ����isUtilizedTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsUtilizedTime(Boolean value) {
        this.isUtilizedTime = value;
    }

    /**
     * ��ȡisProductiveTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsProductiveTime() {
        return isProductiveTime;
    }

    /**
     * ����isProductiveTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsProductiveTime(Boolean value) {
        this.isProductiveTime = value;
    }

    /**
     * ��ȡisExemptTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsExemptTime() {
        return isExemptTime;
    }

    /**
     * ����isExemptTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExemptTime(Boolean value) {
        this.isExemptTime = value;
    }

    /**
     * ��ȡmaterializeTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaterializeTime() {
        return materializeTime;
    }

    /**
     * ����materializeTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaterializeTime(Boolean value) {
        this.materializeTime = value;
    }

    /**
     * ��ȡallowExpenses���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowExpenses() {
        return allowExpenses;
    }

    /**
     * ����allowExpenses���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowExpenses(Boolean value) {
        this.allowExpenses = value;
    }

    /**
     * ��ȡallocatePayrollExpenses���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllocatePayrollExpenses() {
        return allocatePayrollExpenses;
    }

    /**
     * ����allocatePayrollExpenses���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllocatePayrollExpenses(Boolean value) {
        this.allocatePayrollExpenses = value;
    }

    /**
     * ��ȡincludeCrmTasksInTotals���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeCrmTasksInTotals() {
        return includeCrmTasksInTotals;
    }

    /**
     * ����includeCrmTasksInTotals���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeCrmTasksInTotals(Boolean value) {
        this.includeCrmTasksInTotals = value;
    }

    /**
     * ��ȡglobalSubscriptionStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GlobalSubscriptionStatus }
     *     
     */
    public GlobalSubscriptionStatus getGlobalSubscriptionStatus() {
        return globalSubscriptionStatus;
    }

    /**
     * ����globalSubscriptionStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalSubscriptionStatus }
     *     
     */
    public void setGlobalSubscriptionStatus(GlobalSubscriptionStatus value) {
        this.globalSubscriptionStatus = value;
    }

    /**
     * ��ȡjobResourcesList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JobResourcesList }
     *     
     */
    public JobResourcesList getJobResourcesList() {
        return jobResourcesList;
    }

    /**
     * ����jobResourcesList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JobResourcesList }
     *     
     */
    public void setJobResourcesList(JobResourcesList value) {
        this.jobResourcesList = value;
    }

    /**
     * ��ȡplStatementList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JobPlStatementList }
     *     
     */
    public JobPlStatementList getPlStatementList() {
        return plStatementList;
    }

    /**
     * ����plStatementList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JobPlStatementList }
     *     
     */
    public void setPlStatementList(JobPlStatementList value) {
        this.plStatementList = value;
    }

    /**
     * ��ȡaddressbookList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JobAddressbookList }
     *     
     */
    public JobAddressbookList getAddressbookList() {
        return addressbookList;
    }

    /**
     * ����addressbookList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JobAddressbookList }
     *     
     */
    public void setAddressbookList(JobAddressbookList value) {
        this.addressbookList = value;
    }

    /**
     * ��ȡmilestonesList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JobMilestonesList }
     *     
     */
    public JobMilestonesList getMilestonesList() {
        return milestonesList;
    }

    /**
     * ����milestonesList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JobMilestonesList }
     *     
     */
    public void setMilestonesList(JobMilestonesList value) {
        this.milestonesList = value;
    }

    /**
     * ��ȡcreditCardsList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JobCreditCardsList }
     *     
     */
    public JobCreditCardsList getCreditCardsList() {
        return creditCardsList;
    }

    /**
     * ����creditCardsList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JobCreditCardsList }
     *     
     */
    public void setCreditCardsList(JobCreditCardsList value) {
        this.creditCardsList = value;
    }

    /**
     * ��ȡcustomFieldList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CustomFieldList }
     *     
     */
    public CustomFieldList getCustomFieldList() {
        return customFieldList;
    }

    /**
     * ����customFieldList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFieldList }
     *     
     */
    public void setCustomFieldList(CustomFieldList value) {
        this.customFieldList = value;
    }

    /**
     * ��ȡinternalId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalId() {
        return internalId;
    }

    /**
     * ����internalId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalId(String value) {
        this.internalId = value;
    }

    /**
     * ��ȡexternalId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * ����externalId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
    }

}
