
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
 * <p>Job complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取customForm属性的值。
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
     * 设置customForm属性的值。
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
     * 获取entityId属性的值。
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
     * 设置entityId属性的值。
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
     * 获取altName属性的值。
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
     * 设置altName属性的值。
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
     * 获取companyName属性的值。
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
     * 设置companyName属性的值。
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
     * 获取phoneticName属性的值。
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
     * 设置phoneticName属性的值。
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
     * 获取entityStatus属性的值。
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
     * 设置entityStatus属性的值。
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
     * 获取defaultAddress属性的值。
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
     * 设置defaultAddress属性的值。
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
     * 获取parent属性的值。
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
     * 设置parent属性的值。
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
     * 获取isInactive属性的值。
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
     * 设置isInactive属性的值。
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
     * 获取percentCompleteOverrideList属性的值。
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
     * 设置percentCompleteOverrideList属性的值。
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
     * 获取lastModifiedDate属性的值。
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
     * 设置lastModifiedDate属性的值。
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
     * 获取billPay属性的值。
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
     * 设置billPay属性的值。
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
     * 获取dateCreated属性的值。
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
     * 设置dateCreated属性的值。
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
     * 获取category属性的值。
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
     * 设置category属性的值。
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
     * 获取workplace属性的值。
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
     * 设置workplace属性的值。
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
     * 获取language属性的值。
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
     * 设置language属性的值。
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
     * 获取comments属性的值。
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
     * 设置comments属性的值。
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
     * 获取accountNumber属性的值。
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
     * 设置accountNumber属性的值。
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
     * 获取currency属性的值。
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
     * 设置currency属性的值。
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
     * 获取fxRate属性的值。
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
     * 设置fxRate属性的值。
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
     * 获取startDate属性的值。
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
     * 设置startDate属性的值。
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
     * 获取endDate属性的值。
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
     * 设置endDate属性的值。
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
     * 获取phone属性的值。
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
     * 设置phone属性的值。
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
     * 获取altPhone属性的值。
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
     * 设置altPhone属性的值。
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
     * 获取calculatedEndDate属性的值。
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
     * 设置calculatedEndDate属性的值。
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
     * 获取calculatedEndDateBaseline属性的值。
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
     * 设置calculatedEndDateBaseline属性的值。
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
     * 获取startDateBaseline属性的值。
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
     * 设置startDateBaseline属性的值。
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
     * 获取projectedEndDate属性的值。
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
     * 设置projectedEndDate属性的值。
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
     * 获取projectedEndDateBaseline属性的值。
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
     * 设置projectedEndDateBaseline属性的值。
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
     * 获取lastBaselineDate属性的值。
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
     * 设置lastBaselineDate属性的值。
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
     * 获取jobType属性的值。
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
     * 设置jobType属性的值。
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
     * 获取percentComplete属性的值。
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
     * 设置percentComplete属性的值。
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
     * 获取estimatedCost属性的值。
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
     * 设置estimatedCost属性的值。
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
     * 获取estimatedRevenue属性的值。
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
     * 设置estimatedRevenue属性的值。
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
     * 获取estimatedTime属性的值。
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
     * 设置estimatedTime属性的值。
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
     * 获取estimatedTimeOverride属性的值。
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
     * 设置estimatedTimeOverride属性的值。
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
     * 获取fax属性的值。
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
     * 设置fax属性的值。
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
     * 获取email属性的值。
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
     * 设置email属性的值。
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
     * 获取emailPreference属性的值。
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
     * 设置emailPreference属性的值。
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
     * 获取openingBalance属性的值。
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
     * 设置openingBalance属性的值。
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
     * 获取openingBalanceDate属性的值。
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
     * 设置openingBalanceDate属性的值。
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
     * 获取openingBalanceAccount属性的值。
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
     * 设置openingBalanceAccount属性的值。
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
     * 获取subsidiary属性的值。
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
     * 设置subsidiary属性的值。
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
     * 获取jobBillingType属性的值。
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
     * 设置jobBillingType属性的值。
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
     * 获取billingSchedule属性的值。
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
     * 设置billingSchedule属性的值。
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
     * 获取jobItem属性的值。
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
     * 设置jobItem属性的值。
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
     * 获取percentTimeComplete属性的值。
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
     * 设置percentTimeComplete属性的值。
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
     * 获取actualTime属性的值。
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
     * 设置actualTime属性的值。
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
     * 获取allowTime属性的值。
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
     * 设置allowTime属性的值。
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
     * 获取timeRemaining属性的值。
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
     * 设置timeRemaining属性的值。
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
     * 获取limitTimeToAssignees属性的值。
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
     * 设置limitTimeToAssignees属性的值。
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
     * 获取estimatedLaborCost属性的值。
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
     * 设置estimatedLaborCost属性的值。
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
     * 获取estimatedLaborCostBaseline属性的值。
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
     * 设置estimatedLaborCostBaseline属性的值。
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
     * 获取estimateRevRecTemplate属性的值。
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
     * 设置estimateRevRecTemplate属性的值。
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
     * 获取revRecForecastRule属性的值。
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
     * 设置revRecForecastRule属性的值。
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
     * 获取usePercentCompleteOverride属性的值。
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
     * 设置usePercentCompleteOverride属性的值。
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
     * 获取estimatedLaborRevenue属性的值。
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
     * 设置estimatedLaborRevenue属性的值。
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
     * 获取estimatedGrossProfit属性的值。
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
     * 设置estimatedGrossProfit属性的值。
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
     * 获取estimatedGrossProfitPercent属性的值。
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
     * 设置estimatedGrossProfitPercent属性的值。
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
     * 获取projectExpenseType属性的值。
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
     * 设置projectExpenseType属性的值。
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
     * 获取applyProjectExpenseTypeToAll属性的值。
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
     * 设置applyProjectExpenseTypeToAll属性的值。
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
     * 获取allowAllResourcesForTasks属性的值。
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
     * 设置allowAllResourcesForTasks属性的值。
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
     * 获取jobPrice属性的值。
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
     * 设置jobPrice属性的值。
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
     * 获取isUtilizedTime属性的值。
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
     * 设置isUtilizedTime属性的值。
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
     * 获取isProductiveTime属性的值。
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
     * 设置isProductiveTime属性的值。
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
     * 获取isExemptTime属性的值。
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
     * 设置isExemptTime属性的值。
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
     * 获取materializeTime属性的值。
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
     * 设置materializeTime属性的值。
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
     * 获取allowExpenses属性的值。
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
     * 设置allowExpenses属性的值。
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
     * 获取allocatePayrollExpenses属性的值。
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
     * 设置allocatePayrollExpenses属性的值。
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
     * 获取includeCrmTasksInTotals属性的值。
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
     * 设置includeCrmTasksInTotals属性的值。
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
     * 获取globalSubscriptionStatus属性的值。
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
     * 设置globalSubscriptionStatus属性的值。
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
     * 获取jobResourcesList属性的值。
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
     * 设置jobResourcesList属性的值。
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
     * 获取plStatementList属性的值。
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
     * 设置plStatementList属性的值。
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
     * 获取addressbookList属性的值。
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
     * 设置addressbookList属性的值。
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
     * 获取milestonesList属性的值。
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
     * 设置milestonesList属性的值。
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
     * 获取creditCardsList属性的值。
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
     * 设置creditCardsList属性的值。
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
     * 获取customFieldList属性的值。
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
     * 设置customFieldList属性的值。
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
     * 获取internalId属性的值。
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
     * 设置internalId属性的值。
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
     * 获取externalId属性的值。
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
     * 设置externalId属性的值。
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
