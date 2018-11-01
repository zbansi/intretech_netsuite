
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
 * <p>Employee complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡtemplate���Ե�ֵ��
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
     * ����template���Ե�ֵ��
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
     * ��ȡsalutation���Ե�ֵ��
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
     * ����salutation���Ե�ֵ��
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
     * ��ȡfirstName���Ե�ֵ��
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
     * ����firstName���Ե�ֵ��
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
     * ��ȡmiddleName���Ե�ֵ��
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
     * ����middleName���Ե�ֵ��
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
     * ��ȡlastName���Ե�ֵ��
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
     * ����lastName���Ե�ֵ��
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
     * ��ȡinitials���Ե�ֵ��
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
     * ����initials���Ե�ֵ��
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
     * ��ȡofficePhone���Ե�ֵ��
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
     * ����officePhone���Ե�ֵ��
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
     * ��ȡhomePhone���Ե�ֵ��
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
     * ����homePhone���Ե�ֵ��
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
     * ��ȡmobilePhone���Ե�ֵ��
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
     * ����mobilePhone���Ե�ֵ��
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
     * ��ȡdepartment���Ե�ֵ��
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
     * ����department���Ե�ֵ��
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
     * ��ȡclazz���Ե�ֵ��
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
     * ����clazz���Ե�ֵ��
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
     * ��ȡlocation���Ե�ֵ��
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
     * ����location���Ե�ֵ��
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
     * ��ȡbillingClass���Ե�ֵ��
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
     * ����billingClass���Ե�ֵ��
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
     * ��ȡcompensationCurrency���Ե�ֵ��
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
     * ����compensationCurrency���Ե�ֵ��
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
     * ��ȡbaseWageType���Ե�ֵ��
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
     * ����baseWageType���Ե�ֵ��
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
     * ��ȡbaseWage���Ե�ֵ��
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
     * ����baseWage���Ե�ֵ��
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
     * ��ȡimage���Ե�ֵ��
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
     * ����image���Ե�ֵ��
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
     * ��ȡpayFrequency���Ե�ֵ��
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
     * ����payFrequency���Ե�ֵ��
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
     * ��ȡlastPaidDate���Ե�ֵ��
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
     * ����lastPaidDate���Ե�ֵ��
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
     * ��ȡuseTimeData���Ե�ֵ��
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
     * ����useTimeData���Ե�ֵ��
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
     * ��ȡusePerquest���Ե�ֵ��
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
     * ����usePerquest���Ե�ֵ��
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
     * ��ȡadpId���Ե�ֵ��
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
     * ����adpId���Ե�ֵ��
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
     * ��ȡdirectDeposit���Ե�ֵ��
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
     * ����directDeposit���Ե�ֵ��
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
     * ��ȡexpenseLimit���Ե�ֵ��
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
     * ����expenseLimit���Ե�ֵ��
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
     * ��ȡpurchaseOrderLimit���Ե�ֵ��
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
     * ����purchaseOrderLimit���Ե�ֵ��
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
     * ��ȡpurchaseOrderApprovalLimit���Ե�ֵ��
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
     * ����purchaseOrderApprovalLimit���Ե�ֵ��
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
     * ��ȡsocialSecurityNumber���Ե�ֵ��
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
     * ����socialSecurityNumber���Ե�ֵ��
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
     * ��ȡsupervisor���Ե�ֵ��
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
     * ����supervisor���Ե�ֵ��
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
     * ��ȡapprover���Ե�ֵ��
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
     * ����approver���Ե�ֵ��
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
     * ��ȡapprovalLimit���Ե�ֵ��
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
     * ����approvalLimit���Ե�ֵ��
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
     * ��ȡtimeApprover���Ե�ֵ��
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
     * ����timeApprover���Ե�ֵ��
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
     * ��ȡemployeeType���Ե�ֵ��
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
     * ����employeeType���Ե�ֵ��
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
     * ��ȡisSalesRep���Ե�ֵ��
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
     * ����isSalesRep���Ե�ֵ��
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
     * ��ȡsalesRole���Ե�ֵ��
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
     * ����salesRole���Ե�ֵ��
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
     * ��ȡisSupportRep���Ե�ֵ��
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
     * ����isSupportRep���Ե�ֵ��
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
     * ��ȡisJobResource���Ե�ֵ��
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
     * ����isJobResource���Ե�ֵ��
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
     * ��ȡlaborCost���Ե�ֵ��
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
     * ����laborCost���Ե�ֵ��
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
     * ��ȡbirthDate���Ե�ֵ��
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
     * ����birthDate���Ե�ֵ��
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
     * ��ȡhireDate���Ե�ֵ��
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
     * ����hireDate���Ե�ֵ��
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
     * ��ȡreleaseDate���Ե�ֵ��
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
     * ����releaseDate���Ե�ֵ��
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
     * ��ȡterminationDetails���Ե�ֵ��
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
     * ����terminationDetails���Ե�ֵ��
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
     * ��ȡterminationReason���Ե�ֵ��
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
     * ����terminationReason���Ե�ֵ��
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
     * ��ȡterminationRegretted���Ե�ֵ��
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
     * ����terminationRegretted���Ե�ֵ��
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
     * ��ȡterminationCategory���Ե�ֵ��
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
     * ����terminationCategory���Ե�ֵ��
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
     * ��ȡtimeOffPlan���Ե�ֵ��
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
     * ����timeOffPlan���Ե�ֵ��
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
     * ��ȡlastReviewDate���Ե�ֵ��
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
     * ����lastReviewDate���Ե�ֵ��
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
     * ��ȡnextReviewDate���Ե�ֵ��
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
     * ����nextReviewDate���Ե�ֵ��
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
     * ��ȡtitle���Ե�ֵ��
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
     * ����title���Ե�ֵ��
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
     * ��ȡemployeeStatus���Ե�ֵ��
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
     * ����employeeStatus���Ե�ֵ��
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
     * ��ȡjobDescription���Ե�ֵ��
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
     * ����jobDescription���Ե�ֵ��
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
     * ��ȡworkAssignment���Ե�ֵ��
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
     * ����workAssignment���Ե�ֵ��
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
     * ��ȡjob���Ե�ֵ��
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
     * ����job���Ե�ֵ��
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
     * ��ȡmaritalStatus���Ե�ֵ��
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
     * ����maritalStatus���Ե�ֵ��
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
     * ��ȡethnicity���Ե�ֵ��
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
     * ����ethnicity���Ե�ֵ��
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
     * ��ȡgender���Ե�ֵ��
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
     * ����gender���Ե�ֵ��
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
     * ��ȡpurchaseOrderApprover���Ե�ֵ��
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
     * ����purchaseOrderApprover���Ե�ֵ��
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
     * ��ȡworkCalendar���Ե�ֵ��
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
     * ����workCalendar���Ե�ֵ��
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
     * ��ȡgiveAccess���Ե�ֵ��
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
     * ����giveAccess���Ե�ֵ��
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
     * ��ȡconcurrentWebServicesUser���Ե�ֵ��
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
     * ����concurrentWebServicesUser���Ե�ֵ��
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
     * ��ȡsendEmail���Ե�ֵ��
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
     * ����sendEmail���Ե�ֵ��
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
     * ��ȡhasOfflineAccess���Ե�ֵ��
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
     * ����hasOfflineAccess���Ե�ֵ��
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
     * ��ȡpassword���Ե�ֵ��
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
     * ����password���Ե�ֵ��
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
     * ��ȡpassword2���Ե�ֵ��
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
     * ����password2���Ե�ֵ��
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
     * ��ȡrequirePwdChange���Ե�ֵ��
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
     * ����requirePwdChange���Ե�ֵ��
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
     * ��ȡinheritIPRules���Ե�ֵ��
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
     * ����inheritIPRules���Ե�ֵ��
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
     * ��ȡipAddressRule���Ե�ֵ��
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
     * ����ipAddressRule���Ե�ֵ��
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
     * ��ȡstartDateTimeOffCalc���Ե�ֵ��
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
     * ����startDateTimeOffCalc���Ե�ֵ��
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
     * ��ȡcommissionPaymentPreference���Ե�ֵ��
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
     * ����commissionPaymentPreference���Ե�ֵ��
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
     * ��ȡeligibleForCommission���Ե�ֵ��
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
     * ����eligibleForCommission���Ե�ֵ��
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
     * ��ȡsubscriptionsList���Ե�ֵ��
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
     * ����subscriptionsList���Ե�ֵ��
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
     * ��ȡratesList���Ե�ֵ��
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
     * ����ratesList���Ե�ֵ��
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
     * ��ȡaddressbookList���Ե�ֵ��
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
     * ����addressbookList���Ե�ֵ��
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
     * ��ȡrolesList���Ե�ֵ��
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
     * ����rolesList���Ե�ֵ��
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
     * ��ȡhrEducationList���Ե�ֵ��
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
     * ����hrEducationList���Ե�ֵ��
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
     * ��ȡaccruedTimeList���Ե�ֵ��
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
     * ����accruedTimeList���Ե�ֵ��
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
     * ��ȡdirectDepositList���Ե�ֵ��
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
     * ����directDepositList���Ե�ֵ��
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
     * ��ȡcompanyContributionList���Ե�ֵ��
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
     * ����companyContributionList���Ե�ֵ��
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
     * ��ȡearningList���Ե�ֵ��
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
     * ����earningList���Ե�ֵ��
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
     * ��ȡemergencyContactList���Ե�ֵ��
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
     * ����emergencyContactList���Ե�ֵ��
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
     * ��ȡhcmPositionList���Ե�ֵ��
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
     * ����hcmPositionList���Ե�ֵ��
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
     * ��ȡdeductionList���Ե�ֵ��
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
     * ����deductionList���Ե�ֵ��
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
