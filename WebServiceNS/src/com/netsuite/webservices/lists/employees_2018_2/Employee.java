
package com.netsuite.webservices.lists.employees_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.netsuite.webservices.lists.employees_2018_2.types.EmployeeBaseWageType;
import com.netsuite.webservices.lists.employees_2018_2.types.EmployeeCommissionPaymentPreference;
import com.netsuite.webservices.lists.employees_2018_2.types.EmployeeCompensationCurrency;
import com.netsuite.webservices.lists.employees_2018_2.types.EmployeePayFrequency;
import com.netsuite.webservices.lists.employees_2018_2.types.EmployeeTerminationCategory;
import com.netsuite.webservices.lists.employees_2018_2.types.EmployeeTerminationRegretted;
import com.netsuite.webservices.lists.employees_2018_2.types.EmployeeUseTimeData;
import com.netsuite.webservices.lists.employees_2018_2.types.EmployeeWorkAssignment;
import com.netsuite.webservices.lists.employees_2018_2.types.Gender;
import com.netsuite.webservices.platform.common_2018_2.types.GlobalSubscriptionStatus;
import com.netsuite.webservices.platform.core_2018_2.CustomFieldList;
import com.netsuite.webservices.platform.core_2018_2.Record;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;


/**
 * <p>Employee complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Employee">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}Record">
 *       &lt;sequence>
 *         &lt;element name="customForm" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="template" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="entityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salutation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="altName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="defaultAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isInactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="phoneticName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateCreated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="initials" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="officePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="homePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="department" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="class" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="location" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="subsidiary" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="billingClass" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compensationCurrency" type="{urn:types.employees_2018_2.lists.webservices.netsuite.com}EmployeeCompensationCurrency" minOccurs="0"/>
 *         &lt;element name="baseWageType" type="{urn:types.employees_2018_2.lists.webservices.netsuite.com}EmployeeBaseWageType" minOccurs="0"/>
 *         &lt;element name="baseWage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="globalSubscriptionStatus" type="{urn:types.common_2018_2.platform.webservices.netsuite.com}GlobalSubscriptionStatus" minOccurs="0"/>
 *         &lt;element name="image" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="payFrequency" type="{urn:types.employees_2018_2.lists.webservices.netsuite.com}EmployeePayFrequency" minOccurs="0"/>
 *         &lt;element name="lastPaidDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="currency" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="useTimeData" type="{urn:types.employees_2018_2.lists.webservices.netsuite.com}EmployeeUseTimeData" minOccurs="0"/>
 *         &lt;element name="usePerquest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="workplace" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="adpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="directDeposit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="expenseLimit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="purchaseOrderLimit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="purchaseOrderApprovalLimit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="socialSecurityNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supervisor" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="approver" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="approvalLimit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="timeApprover" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="employeeType" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="isSalesRep" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="salesRole" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="isSupportRep" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isJobResource" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="laborCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="hireDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="releaseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="terminationDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="terminationReason" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="terminationRegretted" type="{urn:types.employees_2018_2.lists.webservices.netsuite.com}EmployeeTerminationRegretted" minOccurs="0"/>
 *         &lt;element name="terminationCategory" type="{urn:types.employees_2018_2.lists.webservices.netsuite.com}EmployeeTerminationCategory" minOccurs="0"/>
 *         &lt;element name="timeOffPlan" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="lastReviewDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="nextReviewDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employeeStatus" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="jobDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workAssignment" type="{urn:types.employees_2018_2.lists.webservices.netsuite.com}EmployeeWorkAssignment" minOccurs="0"/>
 *         &lt;element name="job" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="maritalStatus" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="ethnicity" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="gender" type="{urn:types.employees_2018_2.lists.webservices.netsuite.com}Gender" minOccurs="0"/>
 *         &lt;element name="purchaseOrderApprover" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="workCalendar" type="{urn:core_2018_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="giveAccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="concurrentWebServicesUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sendEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="hasOfflineAccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requirePwdChange" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="inheritIPRules" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IPAddressRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDateTimeOffCalc" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="commissionPaymentPreference" type="{urn:types.employees_2018_2.lists.webservices.netsuite.com}EmployeeCommissionPaymentPreference" minOccurs="0"/>
 *         &lt;element name="billPay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="eligibleForCommission" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="subscriptionsList" type="{urn:employees_2018_2.lists.webservices.netsuite.com}EmployeeSubscriptionsList" minOccurs="0"/>
 *         &lt;element name="ratesList" type="{urn:employees_2018_2.lists.webservices.netsuite.com}EmployeeRatesList" minOccurs="0"/>
 *         &lt;element name="addressbookList" type="{urn:employees_2018_2.lists.webservices.netsuite.com}EmployeeAddressbookList" minOccurs="0"/>
 *         &lt;element name="rolesList" type="{urn:employees_2018_2.lists.webservices.netsuite.com}EmployeeRolesList" minOccurs="0"/>
 *         &lt;element name="hrEducationList" type="{urn:employees_2018_2.lists.webservices.netsuite.com}EmployeeHrEducationList" minOccurs="0"/>
 *         &lt;element name="accruedTimeList" type="{urn:employees_2018_2.lists.webservices.netsuite.com}EmployeeAccruedTimeList" minOccurs="0"/>
 *         &lt;element name="directDepositList" type="{urn:employees_2018_2.lists.webservices.netsuite.com}EmployeeDirectDepositList" minOccurs="0"/>
 *         &lt;element name="companyContributionList" type="{urn:employees_2018_2.lists.webservices.netsuite.com}EmployeeCompanyContributionList" minOccurs="0"/>
 *         &lt;element name="earningList" type="{urn:employees_2018_2.lists.webservices.netsuite.com}EmployeeEarningList" minOccurs="0"/>
 *         &lt;element name="emergencyContactList" type="{urn:employees_2018_2.lists.webservices.netsuite.com}EmployeeEmergencyContactList" minOccurs="0"/>
 *         &lt;element name="hcmPositionList" type="{urn:employees_2018_2.lists.webservices.netsuite.com}EmployeeHcmPositionList" minOccurs="0"/>
 *         &lt;element name="deductionList" type="{urn:employees_2018_2.lists.webservices.netsuite.com}EmployeeDeductionList" minOccurs="0"/>
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
@XmlType(name = "Employee", propOrder = {
    "customForm",
    "template",
    "entityId",
    "salutation",
    "firstName",
    "middleName",
    "lastName",
    "altName",
    "phone",
    "fax",
    "email",
    "defaultAddress",
    "isInactive",
    "phoneticName",
    "lastModifiedDate",
    "dateCreated",
    "initials",
    "officePhone",
    "homePhone",
    "mobilePhone",
    "department",
    "clazz",
    "location",
    "subsidiary",
    "billingClass",
    "accountNumber",
    "compensationCurrency",
    "baseWageType",
    "baseWage",
    "comments",
    "globalSubscriptionStatus",
    "image",
    "payFrequency",
    "lastPaidDate",
    "currency",
    "useTimeData",
    "usePerquest",
    "workplace",
    "adpId",
    "directDeposit",
    "expenseLimit",
    "purchaseOrderLimit",
    "purchaseOrderApprovalLimit",
    "socialSecurityNumber",
    "supervisor",
    "approver",
    "approvalLimit",
    "timeApprover",
    "employeeType",
    "isSalesRep",
    "salesRole",
    "isSupportRep",
    "isJobResource",
    "laborCost",
    "birthDate",
    "hireDate",
    "releaseDate",
    "terminationDetails",
    "terminationReason",
    "terminationRegretted",
    "terminationCategory",
    "timeOffPlan",
    "lastReviewDate",
    "nextReviewDate",
    "title",
    "employeeStatus",
    "jobDescription",
    "workAssignment",
    "job",
    "maritalStatus",
    "ethnicity",
    "gender",
    "purchaseOrderApprover",
    "workCalendar",
    "giveAccess",
    "concurrentWebServicesUser",
    "sendEmail",
    "hasOfflineAccess",
    "password",
    "password2",
    "requirePwdChange",
    "inheritIPRules",
    "ipAddressRule",
    "startDateTimeOffCalc",
    "commissionPaymentPreference",
    "billPay",
    "eligibleForCommission",
    "subscriptionsList",
    "ratesList",
    "addressbookList",
    "rolesList",
    "hrEducationList",
    "accruedTimeList",
    "directDepositList",
    "companyContributionList",
    "earningList",
    "emergencyContactList",
    "hcmPositionList",
    "deductionList",
    "customFieldList"
})
public class Employee
    extends Record
{

    protected RecordRef customForm;
    protected RecordRef template;
    protected String entityId;
    protected String salutation;
    protected String firstName;
    protected String middleName;
    protected String lastName;
    protected String altName;
    protected String phone;
    protected String fax;
    protected String email;
    protected String defaultAddress;
    protected Boolean isInactive;
    protected String phoneticName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreated;
    protected String initials;
    protected String officePhone;
    protected String homePhone;
    protected String mobilePhone;
    protected RecordRef department;
    @XmlElement(name = "class")
    protected RecordRef clazz;
    protected RecordRef location;
    protected RecordRef subsidiary;
    protected RecordRef billingClass;
    protected String accountNumber;
    @XmlSchemaType(name = "string")
    protected EmployeeCompensationCurrency compensationCurrency;
    @XmlSchemaType(name = "string")
    protected EmployeeBaseWageType baseWageType;
    protected Double baseWage;
    protected String comments;
    @XmlSchemaType(name = "string")
    protected GlobalSubscriptionStatus globalSubscriptionStatus;
    protected RecordRef image;
    @XmlSchemaType(name = "string")
    protected EmployeePayFrequency payFrequency;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastPaidDate;
    protected RecordRef currency;
    @XmlSchemaType(name = "string")
    protected EmployeeUseTimeData useTimeData;
    protected Boolean usePerquest;
    protected RecordRef workplace;
    protected String adpId;
    protected Boolean directDeposit;
    protected Double expenseLimit;
    protected Double purchaseOrderLimit;
    protected Double purchaseOrderApprovalLimit;
    protected String socialSecurityNumber;
    protected RecordRef supervisor;
    protected RecordRef approver;
    protected Double approvalLimit;
    protected RecordRef timeApprover;
    protected RecordRef employeeType;
    protected Boolean isSalesRep;
    protected RecordRef salesRole;
    protected Boolean isSupportRep;
    protected Boolean isJobResource;
    protected Double laborCost;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar hireDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar releaseDate;
    protected String terminationDetails;
    protected RecordRef terminationReason;
    @XmlSchemaType(name = "string")
    protected EmployeeTerminationRegretted terminationRegretted;
    @XmlSchemaType(name = "string")
    protected EmployeeTerminationCategory terminationCategory;
    protected RecordRef timeOffPlan;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastReviewDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextReviewDate;
    protected String title;
    protected RecordRef employeeStatus;
    protected String jobDescription;
    @XmlSchemaType(name = "string")
    protected EmployeeWorkAssignment workAssignment;
    protected RecordRef job;
    protected RecordRef maritalStatus;
    protected RecordRef ethnicity;
    @XmlSchemaType(name = "string")
    protected Gender gender;
    protected RecordRef purchaseOrderApprover;
    protected RecordRef workCalendar;
    protected Boolean giveAccess;
    protected Boolean concurrentWebServicesUser;
    protected Boolean sendEmail;
    protected Boolean hasOfflineAccess;
    protected String password;
    protected String password2;
    protected Boolean requirePwdChange;
    protected Boolean inheritIPRules;
    @XmlElement(name = "IPAddressRule")
    protected String ipAddressRule;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDateTimeOffCalc;
    @XmlSchemaType(name = "string")
    protected EmployeeCommissionPaymentPreference commissionPaymentPreference;
    protected Boolean billPay;
    protected Boolean eligibleForCommission;
    protected EmployeeSubscriptionsList subscriptionsList;
    protected EmployeeRatesList ratesList;
    protected EmployeeAddressbookList addressbookList;
    protected EmployeeRolesList rolesList;
    protected EmployeeHrEducationList hrEducationList;
    protected EmployeeAccruedTimeList accruedTimeList;
    protected EmployeeDirectDepositList directDepositList;
    protected EmployeeCompanyContributionList companyContributionList;
    protected EmployeeEarningList earningList;
    protected EmployeeEmergencyContactList emergencyContactList;
    protected EmployeeHcmPositionList hcmPositionList;
    protected EmployeeDeductionList deductionList;
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
     * 获取template属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getTemplate() {
        return template;
    }

    /**
     * 设置template属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setTemplate(RecordRef value) {
        this.template = value;
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
     * 获取salutation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalutation() {
        return salutation;
    }

    /**
     * 设置salutation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalutation(String value) {
        this.salutation = value;
    }

    /**
     * 获取firstName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * 设置firstName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * 获取middleName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * 设置middleName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * 获取lastName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * 设置lastName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
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
     * 获取initials属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitials() {
        return initials;
    }

    /**
     * 设置initials属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitials(String value) {
        this.initials = value;
    }

    /**
     * 获取officePhone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficePhone() {
        return officePhone;
    }

    /**
     * 设置officePhone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficePhone(String value) {
        this.officePhone = value;
    }

    /**
     * 获取homePhone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * 设置homePhone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhone(String value) {
        this.homePhone = value;
    }

    /**
     * 获取mobilePhone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * 设置mobilePhone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhone(String value) {
        this.mobilePhone = value;
    }

    /**
     * 获取department属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getDepartment() {
        return department;
    }

    /**
     * 设置department属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setDepartment(RecordRef value) {
        this.department = value;
    }

    /**
     * 获取clazz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getClazz() {
        return clazz;
    }

    /**
     * 设置clazz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setClazz(RecordRef value) {
        this.clazz = value;
    }

    /**
     * 获取location属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getLocation() {
        return location;
    }

    /**
     * 设置location属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setLocation(RecordRef value) {
        this.location = value;
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
     * 获取billingClass属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getBillingClass() {
        return billingClass;
    }

    /**
     * 设置billingClass属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setBillingClass(RecordRef value) {
        this.billingClass = value;
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
     * 获取compensationCurrency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EmployeeCompensationCurrency }
     *     
     */
    public EmployeeCompensationCurrency getCompensationCurrency() {
        return compensationCurrency;
    }

    /**
     * 设置compensationCurrency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeCompensationCurrency }
     *     
     */
    public void setCompensationCurrency(EmployeeCompensationCurrency value) {
        this.compensationCurrency = value;
    }

    /**
     * 获取baseWageType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EmployeeBaseWageType }
     *     
     */
    public EmployeeBaseWageType getBaseWageType() {
        return baseWageType;
    }

    /**
     * 设置baseWageType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeBaseWageType }
     *     
     */
    public void setBaseWageType(EmployeeBaseWageType value) {
        this.baseWageType = value;
    }

    /**
     * 获取baseWage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBaseWage() {
        return baseWage;
    }

    /**
     * 设置baseWage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBaseWage(Double value) {
        this.baseWage = value;
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
     * 获取image属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getImage() {
        return image;
    }

    /**
     * 设置image属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setImage(RecordRef value) {
        this.image = value;
    }

    /**
     * 获取payFrequency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EmployeePayFrequency }
     *     
     */
    public EmployeePayFrequency getPayFrequency() {
        return payFrequency;
    }

    /**
     * 设置payFrequency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeePayFrequency }
     *     
     */
    public void setPayFrequency(EmployeePayFrequency value) {
        this.payFrequency = value;
    }

    /**
     * 获取lastPaidDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastPaidDate() {
        return lastPaidDate;
    }

    /**
     * 设置lastPaidDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastPaidDate(XMLGregorianCalendar value) {
        this.lastPaidDate = value;
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
     * 获取useTimeData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EmployeeUseTimeData }
     *     
     */
    public EmployeeUseTimeData getUseTimeData() {
        return useTimeData;
    }

    /**
     * 设置useTimeData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeUseTimeData }
     *     
     */
    public void setUseTimeData(EmployeeUseTimeData value) {
        this.useTimeData = value;
    }

    /**
     * 获取usePerquest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsePerquest() {
        return usePerquest;
    }

    /**
     * 设置usePerquest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsePerquest(Boolean value) {
        this.usePerquest = value;
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
     * 获取adpId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdpId() {
        return adpId;
    }

    /**
     * 设置adpId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdpId(String value) {
        this.adpId = value;
    }

    /**
     * 获取directDeposit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDirectDeposit() {
        return directDeposit;
    }

    /**
     * 设置directDeposit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDirectDeposit(Boolean value) {
        this.directDeposit = value;
    }

    /**
     * 获取expenseLimit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExpenseLimit() {
        return expenseLimit;
    }

    /**
     * 设置expenseLimit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExpenseLimit(Double value) {
        this.expenseLimit = value;
    }

    /**
     * 获取purchaseOrderLimit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPurchaseOrderLimit() {
        return purchaseOrderLimit;
    }

    /**
     * 设置purchaseOrderLimit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPurchaseOrderLimit(Double value) {
        this.purchaseOrderLimit = value;
    }

    /**
     * 获取purchaseOrderApprovalLimit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPurchaseOrderApprovalLimit() {
        return purchaseOrderApprovalLimit;
    }

    /**
     * 设置purchaseOrderApprovalLimit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPurchaseOrderApprovalLimit(Double value) {
        this.purchaseOrderApprovalLimit = value;
    }

    /**
     * 获取socialSecurityNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    /**
     * 设置socialSecurityNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocialSecurityNumber(String value) {
        this.socialSecurityNumber = value;
    }

    /**
     * 获取supervisor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSupervisor() {
        return supervisor;
    }

    /**
     * 设置supervisor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSupervisor(RecordRef value) {
        this.supervisor = value;
    }

    /**
     * 获取approver属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getApprover() {
        return approver;
    }

    /**
     * 设置approver属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setApprover(RecordRef value) {
        this.approver = value;
    }

    /**
     * 获取approvalLimit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getApprovalLimit() {
        return approvalLimit;
    }

    /**
     * 设置approvalLimit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setApprovalLimit(Double value) {
        this.approvalLimit = value;
    }

    /**
     * 获取timeApprover属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getTimeApprover() {
        return timeApprover;
    }

    /**
     * 设置timeApprover属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setTimeApprover(RecordRef value) {
        this.timeApprover = value;
    }

    /**
     * 获取employeeType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getEmployeeType() {
        return employeeType;
    }

    /**
     * 设置employeeType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setEmployeeType(RecordRef value) {
        this.employeeType = value;
    }

    /**
     * 获取isSalesRep属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSalesRep() {
        return isSalesRep;
    }

    /**
     * 设置isSalesRep属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSalesRep(Boolean value) {
        this.isSalesRep = value;
    }

    /**
     * 获取salesRole属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSalesRole() {
        return salesRole;
    }

    /**
     * 设置salesRole属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSalesRole(RecordRef value) {
        this.salesRole = value;
    }

    /**
     * 获取isSupportRep属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSupportRep() {
        return isSupportRep;
    }

    /**
     * 设置isSupportRep属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSupportRep(Boolean value) {
        this.isSupportRep = value;
    }

    /**
     * 获取isJobResource属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsJobResource() {
        return isJobResource;
    }

    /**
     * 设置isJobResource属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsJobResource(Boolean value) {
        this.isJobResource = value;
    }

    /**
     * 获取laborCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLaborCost() {
        return laborCost;
    }

    /**
     * 设置laborCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLaborCost(Double value) {
        this.laborCost = value;
    }

    /**
     * 获取birthDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * 设置birthDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * 获取hireDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHireDate() {
        return hireDate;
    }

    /**
     * 设置hireDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHireDate(XMLGregorianCalendar value) {
        this.hireDate = value;
    }

    /**
     * 获取releaseDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReleaseDate() {
        return releaseDate;
    }

    /**
     * 设置releaseDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReleaseDate(XMLGregorianCalendar value) {
        this.releaseDate = value;
    }

    /**
     * 获取terminationDetails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminationDetails() {
        return terminationDetails;
    }

    /**
     * 设置terminationDetails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminationDetails(String value) {
        this.terminationDetails = value;
    }

    /**
     * 获取terminationReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getTerminationReason() {
        return terminationReason;
    }

    /**
     * 设置terminationReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setTerminationReason(RecordRef value) {
        this.terminationReason = value;
    }

    /**
     * 获取terminationRegretted属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EmployeeTerminationRegretted }
     *     
     */
    public EmployeeTerminationRegretted getTerminationRegretted() {
        return terminationRegretted;
    }

    /**
     * 设置terminationRegretted属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeTerminationRegretted }
     *     
     */
    public void setTerminationRegretted(EmployeeTerminationRegretted value) {
        this.terminationRegretted = value;
    }

    /**
     * 获取terminationCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EmployeeTerminationCategory }
     *     
     */
    public EmployeeTerminationCategory getTerminationCategory() {
        return terminationCategory;
    }

    /**
     * 设置terminationCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeTerminationCategory }
     *     
     */
    public void setTerminationCategory(EmployeeTerminationCategory value) {
        this.terminationCategory = value;
    }

    /**
     * 获取timeOffPlan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getTimeOffPlan() {
        return timeOffPlan;
    }

    /**
     * 设置timeOffPlan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setTimeOffPlan(RecordRef value) {
        this.timeOffPlan = value;
    }

    /**
     * 获取lastReviewDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastReviewDate() {
        return lastReviewDate;
    }

    /**
     * 设置lastReviewDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastReviewDate(XMLGregorianCalendar value) {
        this.lastReviewDate = value;
    }

    /**
     * 获取nextReviewDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextReviewDate() {
        return nextReviewDate;
    }

    /**
     * 设置nextReviewDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextReviewDate(XMLGregorianCalendar value) {
        this.nextReviewDate = value;
    }

    /**
     * 获取title属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置title属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * 获取employeeStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getEmployeeStatus() {
        return employeeStatus;
    }

    /**
     * 设置employeeStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setEmployeeStatus(RecordRef value) {
        this.employeeStatus = value;
    }

    /**
     * 获取jobDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobDescription() {
        return jobDescription;
    }

    /**
     * 设置jobDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobDescription(String value) {
        this.jobDescription = value;
    }

    /**
     * 获取workAssignment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EmployeeWorkAssignment }
     *     
     */
    public EmployeeWorkAssignment getWorkAssignment() {
        return workAssignment;
    }

    /**
     * 设置workAssignment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeWorkAssignment }
     *     
     */
    public void setWorkAssignment(EmployeeWorkAssignment value) {
        this.workAssignment = value;
    }

    /**
     * 获取job属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getJob() {
        return job;
    }

    /**
     * 设置job属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setJob(RecordRef value) {
        this.job = value;
    }

    /**
     * 获取maritalStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * 设置maritalStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setMaritalStatus(RecordRef value) {
        this.maritalStatus = value;
    }

    /**
     * 获取ethnicity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getEthnicity() {
        return ethnicity;
    }

    /**
     * 设置ethnicity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setEthnicity(RecordRef value) {
        this.ethnicity = value;
    }

    /**
     * 获取gender属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Gender }
     *     
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * 设置gender属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Gender }
     *     
     */
    public void setGender(Gender value) {
        this.gender = value;
    }

    /**
     * 获取purchaseOrderApprover属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPurchaseOrderApprover() {
        return purchaseOrderApprover;
    }

    /**
     * 设置purchaseOrderApprover属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPurchaseOrderApprover(RecordRef value) {
        this.purchaseOrderApprover = value;
    }

    /**
     * 获取workCalendar属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getWorkCalendar() {
        return workCalendar;
    }

    /**
     * 设置workCalendar属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setWorkCalendar(RecordRef value) {
        this.workCalendar = value;
    }

    /**
     * 获取giveAccess属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGiveAccess() {
        return giveAccess;
    }

    /**
     * 设置giveAccess属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGiveAccess(Boolean value) {
        this.giveAccess = value;
    }

    /**
     * 获取concurrentWebServicesUser属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConcurrentWebServicesUser() {
        return concurrentWebServicesUser;
    }

    /**
     * 设置concurrentWebServicesUser属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConcurrentWebServicesUser(Boolean value) {
        this.concurrentWebServicesUser = value;
    }

    /**
     * 获取sendEmail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendEmail() {
        return sendEmail;
    }

    /**
     * 设置sendEmail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendEmail(Boolean value) {
        this.sendEmail = value;
    }

    /**
     * 获取hasOfflineAccess属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasOfflineAccess() {
        return hasOfflineAccess;
    }

    /**
     * 设置hasOfflineAccess属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasOfflineAccess(Boolean value) {
        this.hasOfflineAccess = value;
    }

    /**
     * 获取password属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置password属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * 获取password2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword2() {
        return password2;
    }

    /**
     * 设置password2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword2(String value) {
        this.password2 = value;
    }

    /**
     * 获取requirePwdChange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequirePwdChange() {
        return requirePwdChange;
    }

    /**
     * 设置requirePwdChange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequirePwdChange(Boolean value) {
        this.requirePwdChange = value;
    }

    /**
     * 获取inheritIPRules属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInheritIPRules() {
        return inheritIPRules;
    }

    /**
     * 设置inheritIPRules属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInheritIPRules(Boolean value) {
        this.inheritIPRules = value;
    }

    /**
     * 获取ipAddressRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAddressRule() {
        return ipAddressRule;
    }

    /**
     * 设置ipAddressRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAddressRule(String value) {
        this.ipAddressRule = value;
    }

    /**
     * 获取startDateTimeOffCalc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDateTimeOffCalc() {
        return startDateTimeOffCalc;
    }

    /**
     * 设置startDateTimeOffCalc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDateTimeOffCalc(XMLGregorianCalendar value) {
        this.startDateTimeOffCalc = value;
    }

    /**
     * 获取commissionPaymentPreference属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EmployeeCommissionPaymentPreference }
     *     
     */
    public EmployeeCommissionPaymentPreference getCommissionPaymentPreference() {
        return commissionPaymentPreference;
    }

    /**
     * 设置commissionPaymentPreference属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeCommissionPaymentPreference }
     *     
     */
    public void setCommissionPaymentPreference(EmployeeCommissionPaymentPreference value) {
        this.commissionPaymentPreference = value;
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
     * 获取eligibleForCommission属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEligibleForCommission() {
        return eligibleForCommission;
    }

    /**
     * 设置eligibleForCommission属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEligibleForCommission(Boolean value) {
        this.eligibleForCommission = value;
    }

    /**
     * 获取subscriptionsList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSubscriptionsList }
     *     
     */
    public EmployeeSubscriptionsList getSubscriptionsList() {
        return subscriptionsList;
    }

    /**
     * 设置subscriptionsList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSubscriptionsList }
     *     
     */
    public void setSubscriptionsList(EmployeeSubscriptionsList value) {
        this.subscriptionsList = value;
    }

    /**
     * 获取ratesList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EmployeeRatesList }
     *     
     */
    public EmployeeRatesList getRatesList() {
        return ratesList;
    }

    /**
     * 设置ratesList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeRatesList }
     *     
     */
    public void setRatesList(EmployeeRatesList value) {
        this.ratesList = value;
    }

    /**
     * 获取addressbookList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EmployeeAddressbookList }
     *     
     */
    public EmployeeAddressbookList getAddressbookList() {
        return addressbookList;
    }

    /**
     * 设置addressbookList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeAddressbookList }
     *     
     */
    public void setAddressbookList(EmployeeAddressbookList value) {
        this.addressbookList = value;
    }

    /**
     * 获取rolesList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EmployeeRolesList }
     *     
     */
    public EmployeeRolesList getRolesList() {
        return rolesList;
    }

    /**
     * 设置rolesList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeRolesList }
     *     
     */
    public void setRolesList(EmployeeRolesList value) {
        this.rolesList = value;
    }

    /**
     * 获取hrEducationList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EmployeeHrEducationList }
     *     
     */
    public EmployeeHrEducationList getHrEducationList() {
        return hrEducationList;
    }

    /**
     * 设置hrEducationList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeHrEducationList }
     *     
     */
    public void setHrEducationList(EmployeeHrEducationList value) {
        this.hrEducationList = value;
    }

    /**
     * 获取accruedTimeList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EmployeeAccruedTimeList }
     *     
     */
    public EmployeeAccruedTimeList getAccruedTimeList() {
        return accruedTimeList;
    }

    /**
     * 设置accruedTimeList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeAccruedTimeList }
     *     
     */
    public void setAccruedTimeList(EmployeeAccruedTimeList value) {
        this.accruedTimeList = value;
    }

    /**
     * 获取directDepositList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EmployeeDirectDepositList }
     *     
     */
    public EmployeeDirectDepositList getDirectDepositList() {
        return directDepositList;
    }

    /**
     * 设置directDepositList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeDirectDepositList }
     *     
     */
    public void setDirectDepositList(EmployeeDirectDepositList value) {
        this.directDepositList = value;
    }

    /**
     * 获取companyContributionList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EmployeeCompanyContributionList }
     *     
     */
    public EmployeeCompanyContributionList getCompanyContributionList() {
        return companyContributionList;
    }

    /**
     * 设置companyContributionList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeCompanyContributionList }
     *     
     */
    public void setCompanyContributionList(EmployeeCompanyContributionList value) {
        this.companyContributionList = value;
    }

    /**
     * 获取earningList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EmployeeEarningList }
     *     
     */
    public EmployeeEarningList getEarningList() {
        return earningList;
    }

    /**
     * 设置earningList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeEarningList }
     *     
     */
    public void setEarningList(EmployeeEarningList value) {
        this.earningList = value;
    }

    /**
     * 获取emergencyContactList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EmployeeEmergencyContactList }
     *     
     */
    public EmployeeEmergencyContactList getEmergencyContactList() {
        return emergencyContactList;
    }

    /**
     * 设置emergencyContactList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeEmergencyContactList }
     *     
     */
    public void setEmergencyContactList(EmployeeEmergencyContactList value) {
        this.emergencyContactList = value;
    }

    /**
     * 获取hcmPositionList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EmployeeHcmPositionList }
     *     
     */
    public EmployeeHcmPositionList getHcmPositionList() {
        return hcmPositionList;
    }

    /**
     * 设置hcmPositionList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeHcmPositionList }
     *     
     */
    public void setHcmPositionList(EmployeeHcmPositionList value) {
        this.hcmPositionList = value;
    }

    /**
     * 获取deductionList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EmployeeDeductionList }
     *     
     */
    public EmployeeDeductionList getDeductionList() {
        return deductionList;
    }

    /**
     * 设置deductionList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeDeductionList }
     *     
     */
    public void setDeductionList(EmployeeDeductionList value) {
        this.deductionList = value;
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
