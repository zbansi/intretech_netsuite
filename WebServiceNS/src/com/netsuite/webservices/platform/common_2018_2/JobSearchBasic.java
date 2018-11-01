
package com.netsuite.webservices.platform.common_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2018_2.SearchBooleanField;
import com.netsuite.webservices.platform.core_2018_2.SearchCustomFieldList;
import com.netsuite.webservices.platform.core_2018_2.SearchDateField;
import com.netsuite.webservices.platform.core_2018_2.SearchDoubleField;
import com.netsuite.webservices.platform.core_2018_2.SearchEnumMultiSelectField;
import com.netsuite.webservices.platform.core_2018_2.SearchLongField;
import com.netsuite.webservices.platform.core_2018_2.SearchMultiSelectField;
import com.netsuite.webservices.platform.core_2018_2.SearchRecordBasic;
import com.netsuite.webservices.platform.core_2018_2.SearchStringField;


/**
 * <p>JobSearchBasic complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="JobSearchBasic">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRecordBasic">
 *       &lt;sequence>
 *         &lt;element name="accountNumber" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="actualTime" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="address" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="addressee" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="addressLabel" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="addressPhone" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="allocatePayrollExpenses" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="allowAllResourcesForTasks" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="allowExpenses" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="allowTime" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="applyProjectExpenseTypeToAll" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="attention" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="billingSchedule" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="calculatedEndDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="calculatedEndDateBaseline" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="category" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="city" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="comments" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="contact" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="country" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="county" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="customer" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="dateCreated" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="email" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="endDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="entityId" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="estCost" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="estEndDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="estimatedGrossProfit" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="estimatedGrossProfitPercent" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="estimatedLaborCost" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="estimatedLaborCostBaseline" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="estimatedLaborRevenue" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="estimatedTime" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="estimatedTimeOverride" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="estimatedTimeOverrideBaseline" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="estRevenue" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="externalId" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="externalIdString" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="fax" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="giveAccess" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="globalSubscriptionStatus" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="image" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="includeCrmTasksInTotals" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="internalId" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="internalIdNumber" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="isDefaultBilling" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isDefaultShipping" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isExemptTime" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isInactive" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isProductiveTime" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isUtilizedTime" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="jobBillingType" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="jobItem" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="jobPrice" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="jobResource" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="jobResourceRole" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="language" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="lastBaselineDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="lastModifiedDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="level" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="limitTimeToAssignees" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="materializeTime" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="parent" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="pctComplete" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="percentTimeComplete" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="permission" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="phone" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="phoneticName" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="projectedEndDateBaseline" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="projectExpenseType" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="revRecForecastRule" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="startDate" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="startDateBaseline" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="state" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="status" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="subsidiary" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="timeRemaining" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="type" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="usePercentCompleteOverride" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="zipCode" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="customFieldList" type="{urn:core_2018_2.platform.webservices.netsuite.com}SearchCustomFieldList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobSearchBasic", propOrder = {
    "accountNumber",
    "actualTime",
    "address",
    "addressee",
    "addressLabel",
    "addressPhone",
    "allocatePayrollExpenses",
    "allowAllResourcesForTasks",
    "allowExpenses",
    "allowTime",
    "applyProjectExpenseTypeToAll",
    "attention",
    "billingSchedule",
    "calculatedEndDate",
    "calculatedEndDateBaseline",
    "category",
    "city",
    "comments",
    "contact",
    "country",
    "county",
    "customer",
    "dateCreated",
    "email",
    "endDate",
    "entityId",
    "estCost",
    "estEndDate",
    "estimatedGrossProfit",
    "estimatedGrossProfitPercent",
    "estimatedLaborCost",
    "estimatedLaborCostBaseline",
    "estimatedLaborRevenue",
    "estimatedTime",
    "estimatedTimeOverride",
    "estimatedTimeOverrideBaseline",
    "estRevenue",
    "externalId",
    "externalIdString",
    "fax",
    "giveAccess",
    "globalSubscriptionStatus",
    "image",
    "includeCrmTasksInTotals",
    "internalId",
    "internalIdNumber",
    "isDefaultBilling",
    "isDefaultShipping",
    "isExemptTime",
    "isInactive",
    "isProductiveTime",
    "isUtilizedTime",
    "jobBillingType",
    "jobItem",
    "jobPrice",
    "jobResource",
    "jobResourceRole",
    "language",
    "lastBaselineDate",
    "lastModifiedDate",
    "level",
    "limitTimeToAssignees",
    "materializeTime",
    "parent",
    "pctComplete",
    "percentTimeComplete",
    "permission",
    "phone",
    "phoneticName",
    "projectedEndDateBaseline",
    "projectExpenseType",
    "revRecForecastRule",
    "startDate",
    "startDateBaseline",
    "state",
    "status",
    "subsidiary",
    "timeRemaining",
    "type",
    "usePercentCompleteOverride",
    "zipCode",
    "customFieldList"
})
public class JobSearchBasic
    extends SearchRecordBasic
{

    protected SearchStringField accountNumber;
    protected SearchDoubleField actualTime;
    protected SearchStringField address;
    protected SearchStringField addressee;
    protected SearchStringField addressLabel;
    protected SearchStringField addressPhone;
    protected SearchBooleanField allocatePayrollExpenses;
    protected SearchBooleanField allowAllResourcesForTasks;
    protected SearchBooleanField allowExpenses;
    protected SearchBooleanField allowTime;
    protected SearchBooleanField applyProjectExpenseTypeToAll;
    protected SearchStringField attention;
    protected SearchMultiSelectField billingSchedule;
    protected SearchDateField calculatedEndDate;
    protected SearchDateField calculatedEndDateBaseline;
    protected SearchMultiSelectField category;
    protected SearchStringField city;
    protected SearchStringField comments;
    protected SearchStringField contact;
    protected SearchEnumMultiSelectField country;
    protected SearchStringField county;
    protected SearchMultiSelectField customer;
    protected SearchDateField dateCreated;
    protected SearchStringField email;
    protected SearchDateField endDate;
    protected SearchStringField entityId;
    protected SearchDoubleField estCost;
    protected SearchDateField estEndDate;
    protected SearchDoubleField estimatedGrossProfit;
    protected SearchDoubleField estimatedGrossProfitPercent;
    protected SearchDoubleField estimatedLaborCost;
    protected SearchDoubleField estimatedLaborCostBaseline;
    protected SearchDoubleField estimatedLaborRevenue;
    protected SearchDoubleField estimatedTime;
    protected SearchDoubleField estimatedTimeOverride;
    protected SearchDoubleField estimatedTimeOverrideBaseline;
    protected SearchDoubleField estRevenue;
    protected SearchMultiSelectField externalId;
    protected SearchStringField externalIdString;
    protected SearchStringField fax;
    protected SearchBooleanField giveAccess;
    protected SearchEnumMultiSelectField globalSubscriptionStatus;
    protected SearchStringField image;
    protected SearchBooleanField includeCrmTasksInTotals;
    protected SearchMultiSelectField internalId;
    protected SearchLongField internalIdNumber;
    protected SearchBooleanField isDefaultBilling;
    protected SearchBooleanField isDefaultShipping;
    protected SearchBooleanField isExemptTime;
    protected SearchBooleanField isInactive;
    protected SearchBooleanField isProductiveTime;
    protected SearchBooleanField isUtilizedTime;
    protected SearchEnumMultiSelectField jobBillingType;
    protected SearchMultiSelectField jobItem;
    protected SearchDoubleField jobPrice;
    protected SearchMultiSelectField jobResource;
    protected SearchMultiSelectField jobResourceRole;
    protected SearchEnumMultiSelectField language;
    protected SearchDateField lastBaselineDate;
    protected SearchDateField lastModifiedDate;
    protected SearchEnumMultiSelectField level;
    protected SearchBooleanField limitTimeToAssignees;
    protected SearchBooleanField materializeTime;
    protected SearchMultiSelectField parent;
    protected SearchLongField pctComplete;
    protected SearchLongField percentTimeComplete;
    protected SearchEnumMultiSelectField permission;
    protected SearchStringField phone;
    protected SearchStringField phoneticName;
    protected SearchDateField projectedEndDateBaseline;
    protected SearchMultiSelectField projectExpenseType;
    protected SearchMultiSelectField revRecForecastRule;
    protected SearchDateField startDate;
    protected SearchDateField startDateBaseline;
    protected SearchStringField state;
    protected SearchMultiSelectField status;
    protected SearchMultiSelectField subsidiary;
    protected SearchDoubleField timeRemaining;
    protected SearchMultiSelectField type;
    protected SearchBooleanField usePercentCompleteOverride;
    protected SearchStringField zipCode;
    protected SearchCustomFieldList customFieldList;

    /**
     * ��ȡaccountNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getAccountNumber() {
        return accountNumber;
    }

    /**
     * ����accountNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setAccountNumber(SearchStringField value) {
        this.accountNumber = value;
    }

    /**
     * ��ȡactualTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getActualTime() {
        return actualTime;
    }

    /**
     * ����actualTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setActualTime(SearchDoubleField value) {
        this.actualTime = value;
    }

    /**
     * ��ȡaddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getAddress() {
        return address;
    }

    /**
     * ����address���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setAddress(SearchStringField value) {
        this.address = value;
    }

    /**
     * ��ȡaddressee���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getAddressee() {
        return addressee;
    }

    /**
     * ����addressee���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setAddressee(SearchStringField value) {
        this.addressee = value;
    }

    /**
     * ��ȡaddressLabel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getAddressLabel() {
        return addressLabel;
    }

    /**
     * ����addressLabel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setAddressLabel(SearchStringField value) {
        this.addressLabel = value;
    }

    /**
     * ��ȡaddressPhone���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getAddressPhone() {
        return addressPhone;
    }

    /**
     * ����addressPhone���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setAddressPhone(SearchStringField value) {
        this.addressPhone = value;
    }

    /**
     * ��ȡallocatePayrollExpenses���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getAllocatePayrollExpenses() {
        return allocatePayrollExpenses;
    }

    /**
     * ����allocatePayrollExpenses���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setAllocatePayrollExpenses(SearchBooleanField value) {
        this.allocatePayrollExpenses = value;
    }

    /**
     * ��ȡallowAllResourcesForTasks���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getAllowAllResourcesForTasks() {
        return allowAllResourcesForTasks;
    }

    /**
     * ����allowAllResourcesForTasks���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setAllowAllResourcesForTasks(SearchBooleanField value) {
        this.allowAllResourcesForTasks = value;
    }

    /**
     * ��ȡallowExpenses���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getAllowExpenses() {
        return allowExpenses;
    }

    /**
     * ����allowExpenses���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setAllowExpenses(SearchBooleanField value) {
        this.allowExpenses = value;
    }

    /**
     * ��ȡallowTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getAllowTime() {
        return allowTime;
    }

    /**
     * ����allowTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setAllowTime(SearchBooleanField value) {
        this.allowTime = value;
    }

    /**
     * ��ȡapplyProjectExpenseTypeToAll���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getApplyProjectExpenseTypeToAll() {
        return applyProjectExpenseTypeToAll;
    }

    /**
     * ����applyProjectExpenseTypeToAll���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setApplyProjectExpenseTypeToAll(SearchBooleanField value) {
        this.applyProjectExpenseTypeToAll = value;
    }

    /**
     * ��ȡattention���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getAttention() {
        return attention;
    }

    /**
     * ����attention���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setAttention(SearchStringField value) {
        this.attention = value;
    }

    /**
     * ��ȡbillingSchedule���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getBillingSchedule() {
        return billingSchedule;
    }

    /**
     * ����billingSchedule���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setBillingSchedule(SearchMultiSelectField value) {
        this.billingSchedule = value;
    }

    /**
     * ��ȡcalculatedEndDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getCalculatedEndDate() {
        return calculatedEndDate;
    }

    /**
     * ����calculatedEndDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setCalculatedEndDate(SearchDateField value) {
        this.calculatedEndDate = value;
    }

    /**
     * ��ȡcalculatedEndDateBaseline���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getCalculatedEndDateBaseline() {
        return calculatedEndDateBaseline;
    }

    /**
     * ����calculatedEndDateBaseline���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setCalculatedEndDateBaseline(SearchDateField value) {
        this.calculatedEndDateBaseline = value;
    }

    /**
     * ��ȡcategory���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getCategory() {
        return category;
    }

    /**
     * ����category���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setCategory(SearchMultiSelectField value) {
        this.category = value;
    }

    /**
     * ��ȡcity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getCity() {
        return city;
    }

    /**
     * ����city���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setCity(SearchStringField value) {
        this.city = value;
    }

    /**
     * ��ȡcomments���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getComments() {
        return comments;
    }

    /**
     * ����comments���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setComments(SearchStringField value) {
        this.comments = value;
    }

    /**
     * ��ȡcontact���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getContact() {
        return contact;
    }

    /**
     * ����contact���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setContact(SearchStringField value) {
        this.contact = value;
    }

    /**
     * ��ȡcountry���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getCountry() {
        return country;
    }

    /**
     * ����country���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setCountry(SearchEnumMultiSelectField value) {
        this.country = value;
    }

    /**
     * ��ȡcounty���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getCounty() {
        return county;
    }

    /**
     * ����county���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setCounty(SearchStringField value) {
        this.county = value;
    }

    /**
     * ��ȡcustomer���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getCustomer() {
        return customer;
    }

    /**
     * ����customer���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setCustomer(SearchMultiSelectField value) {
        this.customer = value;
    }

    /**
     * ��ȡdateCreated���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getDateCreated() {
        return dateCreated;
    }

    /**
     * ����dateCreated���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setDateCreated(SearchDateField value) {
        this.dateCreated = value;
    }

    /**
     * ��ȡemail���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getEmail() {
        return email;
    }

    /**
     * ����email���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setEmail(SearchStringField value) {
        this.email = value;
    }

    /**
     * ��ȡendDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getEndDate() {
        return endDate;
    }

    /**
     * ����endDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setEndDate(SearchDateField value) {
        this.endDate = value;
    }

    /**
     * ��ȡentityId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getEntityId() {
        return entityId;
    }

    /**
     * ����entityId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setEntityId(SearchStringField value) {
        this.entityId = value;
    }

    /**
     * ��ȡestCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getEstCost() {
        return estCost;
    }

    /**
     * ����estCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setEstCost(SearchDoubleField value) {
        this.estCost = value;
    }

    /**
     * ��ȡestEndDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getEstEndDate() {
        return estEndDate;
    }

    /**
     * ����estEndDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setEstEndDate(SearchDateField value) {
        this.estEndDate = value;
    }

    /**
     * ��ȡestimatedGrossProfit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getEstimatedGrossProfit() {
        return estimatedGrossProfit;
    }

    /**
     * ����estimatedGrossProfit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setEstimatedGrossProfit(SearchDoubleField value) {
        this.estimatedGrossProfit = value;
    }

    /**
     * ��ȡestimatedGrossProfitPercent���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getEstimatedGrossProfitPercent() {
        return estimatedGrossProfitPercent;
    }

    /**
     * ����estimatedGrossProfitPercent���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setEstimatedGrossProfitPercent(SearchDoubleField value) {
        this.estimatedGrossProfitPercent = value;
    }

    /**
     * ��ȡestimatedLaborCost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getEstimatedLaborCost() {
        return estimatedLaborCost;
    }

    /**
     * ����estimatedLaborCost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setEstimatedLaborCost(SearchDoubleField value) {
        this.estimatedLaborCost = value;
    }

    /**
     * ��ȡestimatedLaborCostBaseline���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getEstimatedLaborCostBaseline() {
        return estimatedLaborCostBaseline;
    }

    /**
     * ����estimatedLaborCostBaseline���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setEstimatedLaborCostBaseline(SearchDoubleField value) {
        this.estimatedLaborCostBaseline = value;
    }

    /**
     * ��ȡestimatedLaborRevenue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getEstimatedLaborRevenue() {
        return estimatedLaborRevenue;
    }

    /**
     * ����estimatedLaborRevenue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setEstimatedLaborRevenue(SearchDoubleField value) {
        this.estimatedLaborRevenue = value;
    }

    /**
     * ��ȡestimatedTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getEstimatedTime() {
        return estimatedTime;
    }

    /**
     * ����estimatedTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setEstimatedTime(SearchDoubleField value) {
        this.estimatedTime = value;
    }

    /**
     * ��ȡestimatedTimeOverride���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getEstimatedTimeOverride() {
        return estimatedTimeOverride;
    }

    /**
     * ����estimatedTimeOverride���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setEstimatedTimeOverride(SearchDoubleField value) {
        this.estimatedTimeOverride = value;
    }

    /**
     * ��ȡestimatedTimeOverrideBaseline���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getEstimatedTimeOverrideBaseline() {
        return estimatedTimeOverrideBaseline;
    }

    /**
     * ����estimatedTimeOverrideBaseline���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setEstimatedTimeOverrideBaseline(SearchDoubleField value) {
        this.estimatedTimeOverrideBaseline = value;
    }

    /**
     * ��ȡestRevenue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getEstRevenue() {
        return estRevenue;
    }

    /**
     * ����estRevenue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setEstRevenue(SearchDoubleField value) {
        this.estRevenue = value;
    }

    /**
     * ��ȡexternalId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getExternalId() {
        return externalId;
    }

    /**
     * ����externalId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setExternalId(SearchMultiSelectField value) {
        this.externalId = value;
    }

    /**
     * ��ȡexternalIdString���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getExternalIdString() {
        return externalIdString;
    }

    /**
     * ����externalIdString���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setExternalIdString(SearchStringField value) {
        this.externalIdString = value;
    }

    /**
     * ��ȡfax���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getFax() {
        return fax;
    }

    /**
     * ����fax���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setFax(SearchStringField value) {
        this.fax = value;
    }

    /**
     * ��ȡgiveAccess���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getGiveAccess() {
        return giveAccess;
    }

    /**
     * ����giveAccess���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setGiveAccess(SearchBooleanField value) {
        this.giveAccess = value;
    }

    /**
     * ��ȡglobalSubscriptionStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getGlobalSubscriptionStatus() {
        return globalSubscriptionStatus;
    }

    /**
     * ����globalSubscriptionStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setGlobalSubscriptionStatus(SearchEnumMultiSelectField value) {
        this.globalSubscriptionStatus = value;
    }

    /**
     * ��ȡimage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getImage() {
        return image;
    }

    /**
     * ����image���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setImage(SearchStringField value) {
        this.image = value;
    }

    /**
     * ��ȡincludeCrmTasksInTotals���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIncludeCrmTasksInTotals() {
        return includeCrmTasksInTotals;
    }

    /**
     * ����includeCrmTasksInTotals���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIncludeCrmTasksInTotals(SearchBooleanField value) {
        this.includeCrmTasksInTotals = value;
    }

    /**
     * ��ȡinternalId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getInternalId() {
        return internalId;
    }

    /**
     * ����internalId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setInternalId(SearchMultiSelectField value) {
        this.internalId = value;
    }

    /**
     * ��ȡinternalIdNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }

    /**
     * ����internalIdNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setInternalIdNumber(SearchLongField value) {
        this.internalIdNumber = value;
    }

    /**
     * ��ȡisDefaultBilling���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsDefaultBilling() {
        return isDefaultBilling;
    }

    /**
     * ����isDefaultBilling���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsDefaultBilling(SearchBooleanField value) {
        this.isDefaultBilling = value;
    }

    /**
     * ��ȡisDefaultShipping���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsDefaultShipping() {
        return isDefaultShipping;
    }

    /**
     * ����isDefaultShipping���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsDefaultShipping(SearchBooleanField value) {
        this.isDefaultShipping = value;
    }

    /**
     * ��ȡisExemptTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsExemptTime() {
        return isExemptTime;
    }

    /**
     * ����isExemptTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsExemptTime(SearchBooleanField value) {
        this.isExemptTime = value;
    }

    /**
     * ��ȡisInactive���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsInactive() {
        return isInactive;
    }

    /**
     * ����isInactive���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsInactive(SearchBooleanField value) {
        this.isInactive = value;
    }

    /**
     * ��ȡisProductiveTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsProductiveTime() {
        return isProductiveTime;
    }

    /**
     * ����isProductiveTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsProductiveTime(SearchBooleanField value) {
        this.isProductiveTime = value;
    }

    /**
     * ��ȡisUtilizedTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsUtilizedTime() {
        return isUtilizedTime;
    }

    /**
     * ����isUtilizedTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsUtilizedTime(SearchBooleanField value) {
        this.isUtilizedTime = value;
    }

    /**
     * ��ȡjobBillingType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getJobBillingType() {
        return jobBillingType;
    }

    /**
     * ����jobBillingType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setJobBillingType(SearchEnumMultiSelectField value) {
        this.jobBillingType = value;
    }

    /**
     * ��ȡjobItem���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getJobItem() {
        return jobItem;
    }

    /**
     * ����jobItem���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setJobItem(SearchMultiSelectField value) {
        this.jobItem = value;
    }

    /**
     * ��ȡjobPrice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getJobPrice() {
        return jobPrice;
    }

    /**
     * ����jobPrice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setJobPrice(SearchDoubleField value) {
        this.jobPrice = value;
    }

    /**
     * ��ȡjobResource���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getJobResource() {
        return jobResource;
    }

    /**
     * ����jobResource���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setJobResource(SearchMultiSelectField value) {
        this.jobResource = value;
    }

    /**
     * ��ȡjobResourceRole���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getJobResourceRole() {
        return jobResourceRole;
    }

    /**
     * ����jobResourceRole���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setJobResourceRole(SearchMultiSelectField value) {
        this.jobResourceRole = value;
    }

    /**
     * ��ȡlanguage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getLanguage() {
        return language;
    }

    /**
     * ����language���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setLanguage(SearchEnumMultiSelectField value) {
        this.language = value;
    }

    /**
     * ��ȡlastBaselineDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getLastBaselineDate() {
        return lastBaselineDate;
    }

    /**
     * ����lastBaselineDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setLastBaselineDate(SearchDateField value) {
        this.lastBaselineDate = value;
    }

    /**
     * ��ȡlastModifiedDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * ����lastModifiedDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setLastModifiedDate(SearchDateField value) {
        this.lastModifiedDate = value;
    }

    /**
     * ��ȡlevel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getLevel() {
        return level;
    }

    /**
     * ����level���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setLevel(SearchEnumMultiSelectField value) {
        this.level = value;
    }

    /**
     * ��ȡlimitTimeToAssignees���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getLimitTimeToAssignees() {
        return limitTimeToAssignees;
    }

    /**
     * ����limitTimeToAssignees���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setLimitTimeToAssignees(SearchBooleanField value) {
        this.limitTimeToAssignees = value;
    }

    /**
     * ��ȡmaterializeTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getMaterializeTime() {
        return materializeTime;
    }

    /**
     * ����materializeTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setMaterializeTime(SearchBooleanField value) {
        this.materializeTime = value;
    }

    /**
     * ��ȡparent���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getParent() {
        return parent;
    }

    /**
     * ����parent���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setParent(SearchMultiSelectField value) {
        this.parent = value;
    }

    /**
     * ��ȡpctComplete���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getPctComplete() {
        return pctComplete;
    }

    /**
     * ����pctComplete���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setPctComplete(SearchLongField value) {
        this.pctComplete = value;
    }

    /**
     * ��ȡpercentTimeComplete���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getPercentTimeComplete() {
        return percentTimeComplete;
    }

    /**
     * ����percentTimeComplete���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setPercentTimeComplete(SearchLongField value) {
        this.percentTimeComplete = value;
    }

    /**
     * ��ȡpermission���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getPermission() {
        return permission;
    }

    /**
     * ����permission���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setPermission(SearchEnumMultiSelectField value) {
        this.permission = value;
    }

    /**
     * ��ȡphone���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getPhone() {
        return phone;
    }

    /**
     * ����phone���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setPhone(SearchStringField value) {
        this.phone = value;
    }

    /**
     * ��ȡphoneticName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getPhoneticName() {
        return phoneticName;
    }

    /**
     * ����phoneticName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setPhoneticName(SearchStringField value) {
        this.phoneticName = value;
    }

    /**
     * ��ȡprojectedEndDateBaseline���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getProjectedEndDateBaseline() {
        return projectedEndDateBaseline;
    }

    /**
     * ����projectedEndDateBaseline���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setProjectedEndDateBaseline(SearchDateField value) {
        this.projectedEndDateBaseline = value;
    }

    /**
     * ��ȡprojectExpenseType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getProjectExpenseType() {
        return projectExpenseType;
    }

    /**
     * ����projectExpenseType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setProjectExpenseType(SearchMultiSelectField value) {
        this.projectExpenseType = value;
    }

    /**
     * ��ȡrevRecForecastRule���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getRevRecForecastRule() {
        return revRecForecastRule;
    }

    /**
     * ����revRecForecastRule���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setRevRecForecastRule(SearchMultiSelectField value) {
        this.revRecForecastRule = value;
    }

    /**
     * ��ȡstartDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getStartDate() {
        return startDate;
    }

    /**
     * ����startDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setStartDate(SearchDateField value) {
        this.startDate = value;
    }

    /**
     * ��ȡstartDateBaseline���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getStartDateBaseline() {
        return startDateBaseline;
    }

    /**
     * ����startDateBaseline���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setStartDateBaseline(SearchDateField value) {
        this.startDateBaseline = value;
    }

    /**
     * ��ȡstate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getState() {
        return state;
    }

    /**
     * ����state���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setState(SearchStringField value) {
        this.state = value;
    }

    /**
     * ��ȡstatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getStatus() {
        return status;
    }

    /**
     * ����status���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setStatus(SearchMultiSelectField value) {
        this.status = value;
    }

    /**
     * ��ȡsubsidiary���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getSubsidiary() {
        return subsidiary;
    }

    /**
     * ����subsidiary���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setSubsidiary(SearchMultiSelectField value) {
        this.subsidiary = value;
    }

    /**
     * ��ȡtimeRemaining���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getTimeRemaining() {
        return timeRemaining;
    }

    /**
     * ����timeRemaining���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setTimeRemaining(SearchDoubleField value) {
        this.timeRemaining = value;
    }

    /**
     * ��ȡtype���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getType() {
        return type;
    }

    /**
     * ����type���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setType(SearchMultiSelectField value) {
        this.type = value;
    }

    /**
     * ��ȡusePercentCompleteOverride���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getUsePercentCompleteOverride() {
        return usePercentCompleteOverride;
    }

    /**
     * ����usePercentCompleteOverride���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setUsePercentCompleteOverride(SearchBooleanField value) {
        this.usePercentCompleteOverride = value;
    }

    /**
     * ��ȡzipCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getZipCode() {
        return zipCode;
    }

    /**
     * ����zipCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setZipCode(SearchStringField value) {
        this.zipCode = value;
    }

    /**
     * ��ȡcustomFieldList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SearchCustomFieldList }
     *     
     */
    public SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }

    /**
     * ����customFieldList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCustomFieldList }
     *     
     */
    public void setCustomFieldList(SearchCustomFieldList value) {
        this.customFieldList = value;
    }

}
