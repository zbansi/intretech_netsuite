
package com.netsuite.webservices.transactions.sales_2018_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_2.AccountSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.AccountingPeriodSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.AccountingTransactionSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.AddressSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.BillingAccountSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.BinSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.BomRevisionSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.BomSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.CalendarEventSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.CampaignSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.ClassificationSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.ContactSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.CustomSearchJoin;
import com.netsuite.webservices.platform.common_2018_2.CustomerSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.DepartmentSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.EmployeeSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.EntitySearchBasic;
import com.netsuite.webservices.platform.common_2018_2.ExpenseCategorySearchBasic;
import com.netsuite.webservices.platform.common_2018_2.FileSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.InventoryDetailSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.InventoryNumberSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.ItemRevisionSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.ItemSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.JobSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.LocationSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.ManufacturingOperationTaskSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.MessageSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.NoteSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.OpportunitySearchBasic;
import com.netsuite.webservices.platform.common_2018_2.PartnerSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.PayrollItemSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.PhoneCallSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.ProjectTaskSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.RevRecScheduleSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.SalesTaxItemSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.SubsidiarySearchBasic;
import com.netsuite.webservices.platform.common_2018_2.SupportCaseSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.TaskSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.TaxDetailSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.TimeBillSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.TransactionSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.VendorSearchBasic;
import com.netsuite.webservices.platform.core_2018_2.SearchRecord;


/**
 * <p>TransactionSearch complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TransactionSearch">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRecord">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2018_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/>
 *         &lt;element name="accountJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}AccountSearchBasic" minOccurs="0"/>
 *         &lt;element name="accountingPeriodJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}AccountingPeriodSearchBasic" minOccurs="0"/>
 *         &lt;element name="accountingTransactionJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}AccountingTransactionSearchBasic" minOccurs="0"/>
 *         &lt;element name="advanceToApplyAccountJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}AccountSearchBasic" minOccurs="0"/>
 *         &lt;element name="appliedToTransactionJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/>
 *         &lt;element name="applyingTransactionJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/>
 *         &lt;element name="billingAddressJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}AddressSearchBasic" minOccurs="0"/>
 *         &lt;element name="billingTransactionJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/>
 *         &lt;element name="binNumberJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}BinSearchBasic" minOccurs="0"/>
 *         &lt;element name="bomJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}BomSearchBasic" minOccurs="0"/>
 *         &lt;element name="bomRevisionJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}BomRevisionSearchBasic" minOccurs="0"/>
 *         &lt;element name="callJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}PhoneCallSearchBasic" minOccurs="0"/>
 *         &lt;element name="caseJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}SupportCaseSearchBasic" minOccurs="0"/>
 *         &lt;element name="classJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ClassificationSearchBasic" minOccurs="0"/>
 *         &lt;element name="cogsPurchaseJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/>
 *         &lt;element name="cogsSaleJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/>
 *         &lt;element name="contactPrimaryJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ContactSearchBasic" minOccurs="0"/>
 *         &lt;element name="createdFromJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/>
 *         &lt;element name="customerJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}CustomerSearchBasic" minOccurs="0"/>
 *         &lt;element name="customerMainJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}CustomerSearchBasic" minOccurs="0"/>
 *         &lt;element name="departmentJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}DepartmentSearchBasic" minOccurs="0"/>
 *         &lt;element name="depositTransactionJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/>
 *         &lt;element name="employeeJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}EmployeeSearchBasic" minOccurs="0"/>
 *         &lt;element name="eventJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}CalendarEventSearchBasic" minOccurs="0"/>
 *         &lt;element name="expenseCategoryJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ExpenseCategorySearchBasic" minOccurs="0"/>
 *         &lt;element name="fileJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}FileSearchBasic" minOccurs="0"/>
 *         &lt;element name="fromLocationJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}LocationSearchBasic" minOccurs="0"/>
 *         &lt;element name="fulfillingTransactionJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/>
 *         &lt;element name="headerBillingAccountJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}BillingAccountSearchBasic" minOccurs="0"/>
 *         &lt;element name="inventoryDetailJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}InventoryDetailSearchBasic" minOccurs="0"/>
 *         &lt;element name="itemJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ItemSearchBasic" minOccurs="0"/>
 *         &lt;element name="itemNumberJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}InventoryNumberSearchBasic" minOccurs="0"/>
 *         &lt;element name="jobJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}JobSearchBasic" minOccurs="0"/>
 *         &lt;element name="jobMainJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}JobSearchBasic" minOccurs="0"/>
 *         &lt;element name="leadSourceJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}CampaignSearchBasic" minOccurs="0"/>
 *         &lt;element name="lineBillingAccountJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}BillingAccountSearchBasic" minOccurs="0"/>
 *         &lt;element name="lineFileJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}FileSearchBasic" minOccurs="0"/>
 *         &lt;element name="locationJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}LocationSearchBasic" minOccurs="0"/>
 *         &lt;element name="manufacturingOperationTaskJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ManufacturingOperationTaskSearchBasic" minOccurs="0"/>
 *         &lt;element name="messagesJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}MessageSearchBasic" minOccurs="0"/>
 *         &lt;element name="nextApproverJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}EntitySearchBasic" minOccurs="0"/>
 *         &lt;element name="opportunityJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}OpportunitySearchBasic" minOccurs="0"/>
 *         &lt;element name="paidTransactionJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/>
 *         &lt;element name="partnerJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}PartnerSearchBasic" minOccurs="0"/>
 *         &lt;element name="payingTransactionJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/>
 *         &lt;element name="payrollItemJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}PayrollItemSearchBasic" minOccurs="0"/>
 *         &lt;element name="projectTaskJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ProjectTaskSearchBasic" minOccurs="0"/>
 *         &lt;element name="purchaseOrderJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/>
 *         &lt;element name="requestorJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}EmployeeSearchBasic" minOccurs="0"/>
 *         &lt;element name="revCommittingTransactionJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/>
 *         &lt;element name="revisionJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ItemRevisionSearchBasic" minOccurs="0"/>
 *         &lt;element name="revRecScheduleJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}RevRecScheduleSearchBasic" minOccurs="0"/>
 *         &lt;element name="rgPostingTransactionJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/>
 *         &lt;element name="salesOrderJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/>
 *         &lt;element name="salesRepJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}EmployeeSearchBasic" minOccurs="0"/>
 *         &lt;element name="shippingAddressJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}AddressSearchBasic" minOccurs="0"/>
 *         &lt;element name="subsidiaryJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}SubsidiarySearchBasic" minOccurs="0"/>
 *         &lt;element name="taskJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TaskSearchBasic" minOccurs="0"/>
 *         &lt;element name="taxCodeJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}SalesTaxItemSearchBasic" minOccurs="0"/>
 *         &lt;element name="taxDetailJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TaxDetailSearchBasic" minOccurs="0"/>
 *         &lt;element name="taxItemJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}SalesTaxItemSearchBasic" minOccurs="0"/>
 *         &lt;element name="timeJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TimeBillSearchBasic" minOccurs="0"/>
 *         &lt;element name="toLocationJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}LocationSearchBasic" minOccurs="0"/>
 *         &lt;element name="userJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}EmployeeSearchBasic" minOccurs="0"/>
 *         &lt;element name="userNotesJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}NoteSearchBasic" minOccurs="0"/>
 *         &lt;element name="vendorJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}VendorSearchBasic" minOccurs="0"/>
 *         &lt;element name="vendorLineJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}VendorSearchBasic" minOccurs="0"/>
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
@XmlType(name = "TransactionSearch", propOrder = {
    "basic",
    "accountJoin",
    "accountingPeriodJoin",
    "accountingTransactionJoin",
    "advanceToApplyAccountJoin",
    "appliedToTransactionJoin",
    "applyingTransactionJoin",
    "billingAddressJoin",
    "billingTransactionJoin",
    "binNumberJoin",
    "bomJoin",
    "bomRevisionJoin",
    "callJoin",
    "caseJoin",
    "classJoin",
    "cogsPurchaseJoin",
    "cogsSaleJoin",
    "contactPrimaryJoin",
    "createdFromJoin",
    "customerJoin",
    "customerMainJoin",
    "departmentJoin",
    "depositTransactionJoin",
    "employeeJoin",
    "eventJoin",
    "expenseCategoryJoin",
    "fileJoin",
    "fromLocationJoin",
    "fulfillingTransactionJoin",
    "headerBillingAccountJoin",
    "inventoryDetailJoin",
    "itemJoin",
    "itemNumberJoin",
    "jobJoin",
    "jobMainJoin",
    "leadSourceJoin",
    "lineBillingAccountJoin",
    "lineFileJoin",
    "locationJoin",
    "manufacturingOperationTaskJoin",
    "messagesJoin",
    "nextApproverJoin",
    "opportunityJoin",
    "paidTransactionJoin",
    "partnerJoin",
    "payingTransactionJoin",
    "payrollItemJoin",
    "projectTaskJoin",
    "purchaseOrderJoin",
    "requestorJoin",
    "revCommittingTransactionJoin",
    "revisionJoin",
    "revRecScheduleJoin",
    "rgPostingTransactionJoin",
    "salesOrderJoin",
    "salesRepJoin",
    "shippingAddressJoin",
    "subsidiaryJoin",
    "taskJoin",
    "taxCodeJoin",
    "taxDetailJoin",
    "taxItemJoin",
    "timeJoin",
    "toLocationJoin",
    "userJoin",
    "userNotesJoin",
    "vendorJoin",
    "vendorLineJoin",
    "customSearchJoin"
})
public class TransactionSearch
    extends SearchRecord
{

    protected TransactionSearchBasic basic;
    protected AccountSearchBasic accountJoin;
    protected AccountingPeriodSearchBasic accountingPeriodJoin;
    protected AccountingTransactionSearchBasic accountingTransactionJoin;
    protected AccountSearchBasic advanceToApplyAccountJoin;
    protected TransactionSearchBasic appliedToTransactionJoin;
    protected TransactionSearchBasic applyingTransactionJoin;
    protected AddressSearchBasic billingAddressJoin;
    protected TransactionSearchBasic billingTransactionJoin;
    protected BinSearchBasic binNumberJoin;
    protected BomSearchBasic bomJoin;
    protected BomRevisionSearchBasic bomRevisionJoin;
    protected PhoneCallSearchBasic callJoin;
    protected SupportCaseSearchBasic caseJoin;
    protected ClassificationSearchBasic classJoin;
    protected TransactionSearchBasic cogsPurchaseJoin;
    protected TransactionSearchBasic cogsSaleJoin;
    protected ContactSearchBasic contactPrimaryJoin;
    protected TransactionSearchBasic createdFromJoin;
    protected CustomerSearchBasic customerJoin;
    protected CustomerSearchBasic customerMainJoin;
    protected DepartmentSearchBasic departmentJoin;
    protected TransactionSearchBasic depositTransactionJoin;
    protected EmployeeSearchBasic employeeJoin;
    protected CalendarEventSearchBasic eventJoin;
    protected ExpenseCategorySearchBasic expenseCategoryJoin;
    protected FileSearchBasic fileJoin;
    protected LocationSearchBasic fromLocationJoin;
    protected TransactionSearchBasic fulfillingTransactionJoin;
    protected BillingAccountSearchBasic headerBillingAccountJoin;
    protected InventoryDetailSearchBasic inventoryDetailJoin;
    protected ItemSearchBasic itemJoin;
    protected InventoryNumberSearchBasic itemNumberJoin;
    protected JobSearchBasic jobJoin;
    protected JobSearchBasic jobMainJoin;
    protected CampaignSearchBasic leadSourceJoin;
    protected BillingAccountSearchBasic lineBillingAccountJoin;
    protected FileSearchBasic lineFileJoin;
    protected LocationSearchBasic locationJoin;
    protected ManufacturingOperationTaskSearchBasic manufacturingOperationTaskJoin;
    protected MessageSearchBasic messagesJoin;
    protected EntitySearchBasic nextApproverJoin;
    protected OpportunitySearchBasic opportunityJoin;
    protected TransactionSearchBasic paidTransactionJoin;
    protected PartnerSearchBasic partnerJoin;
    protected TransactionSearchBasic payingTransactionJoin;
    protected PayrollItemSearchBasic payrollItemJoin;
    protected ProjectTaskSearchBasic projectTaskJoin;
    protected TransactionSearchBasic purchaseOrderJoin;
    protected EmployeeSearchBasic requestorJoin;
    protected TransactionSearchBasic revCommittingTransactionJoin;
    protected ItemRevisionSearchBasic revisionJoin;
    protected RevRecScheduleSearchBasic revRecScheduleJoin;
    protected TransactionSearchBasic rgPostingTransactionJoin;
    protected TransactionSearchBasic salesOrderJoin;
    protected EmployeeSearchBasic salesRepJoin;
    protected AddressSearchBasic shippingAddressJoin;
    protected SubsidiarySearchBasic subsidiaryJoin;
    protected TaskSearchBasic taskJoin;
    protected SalesTaxItemSearchBasic taxCodeJoin;
    protected TaxDetailSearchBasic taxDetailJoin;
    protected SalesTaxItemSearchBasic taxItemJoin;
    protected TimeBillSearchBasic timeJoin;
    protected LocationSearchBasic toLocationJoin;
    protected EmployeeSearchBasic userJoin;
    protected NoteSearchBasic userNotesJoin;
    protected VendorSearchBasic vendorJoin;
    protected VendorSearchBasic vendorLineJoin;
    protected List<CustomSearchJoin> customSearchJoin;

    /**
     * 获取basic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getBasic() {
        return basic;
    }

    /**
     * 设置basic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setBasic(TransactionSearchBasic value) {
        this.basic = value;
    }

    /**
     * 获取accountJoin属性的值。
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
     * 设置accountJoin属性的值。
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
     * 获取accountingPeriodJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AccountingPeriodSearchBasic }
     *     
     */
    public AccountingPeriodSearchBasic getAccountingPeriodJoin() {
        return accountingPeriodJoin;
    }

    /**
     * 设置accountingPeriodJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingPeriodSearchBasic }
     *     
     */
    public void setAccountingPeriodJoin(AccountingPeriodSearchBasic value) {
        this.accountingPeriodJoin = value;
    }

    /**
     * 获取accountingTransactionJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AccountingTransactionSearchBasic }
     *     
     */
    public AccountingTransactionSearchBasic getAccountingTransactionJoin() {
        return accountingTransactionJoin;
    }

    /**
     * 设置accountingTransactionJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingTransactionSearchBasic }
     *     
     */
    public void setAccountingTransactionJoin(AccountingTransactionSearchBasic value) {
        this.accountingTransactionJoin = value;
    }

    /**
     * 获取advanceToApplyAccountJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AccountSearchBasic }
     *     
     */
    public AccountSearchBasic getAdvanceToApplyAccountJoin() {
        return advanceToApplyAccountJoin;
    }

    /**
     * 设置advanceToApplyAccountJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSearchBasic }
     *     
     */
    public void setAdvanceToApplyAccountJoin(AccountSearchBasic value) {
        this.advanceToApplyAccountJoin = value;
    }

    /**
     * 获取appliedToTransactionJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getAppliedToTransactionJoin() {
        return appliedToTransactionJoin;
    }

    /**
     * 设置appliedToTransactionJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setAppliedToTransactionJoin(TransactionSearchBasic value) {
        this.appliedToTransactionJoin = value;
    }

    /**
     * 获取applyingTransactionJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getApplyingTransactionJoin() {
        return applyingTransactionJoin;
    }

    /**
     * 设置applyingTransactionJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setApplyingTransactionJoin(TransactionSearchBasic value) {
        this.applyingTransactionJoin = value;
    }

    /**
     * 获取billingAddressJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AddressSearchBasic }
     *     
     */
    public AddressSearchBasic getBillingAddressJoin() {
        return billingAddressJoin;
    }

    /**
     * 设置billingAddressJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AddressSearchBasic }
     *     
     */
    public void setBillingAddressJoin(AddressSearchBasic value) {
        this.billingAddressJoin = value;
    }

    /**
     * 获取billingTransactionJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getBillingTransactionJoin() {
        return billingTransactionJoin;
    }

    /**
     * 设置billingTransactionJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setBillingTransactionJoin(TransactionSearchBasic value) {
        this.billingTransactionJoin = value;
    }

    /**
     * 获取binNumberJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BinSearchBasic }
     *     
     */
    public BinSearchBasic getBinNumberJoin() {
        return binNumberJoin;
    }

    /**
     * 设置binNumberJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BinSearchBasic }
     *     
     */
    public void setBinNumberJoin(BinSearchBasic value) {
        this.binNumberJoin = value;
    }

    /**
     * 获取bomJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BomSearchBasic }
     *     
     */
    public BomSearchBasic getBomJoin() {
        return bomJoin;
    }

    /**
     * 设置bomJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BomSearchBasic }
     *     
     */
    public void setBomJoin(BomSearchBasic value) {
        this.bomJoin = value;
    }

    /**
     * 获取bomRevisionJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BomRevisionSearchBasic }
     *     
     */
    public BomRevisionSearchBasic getBomRevisionJoin() {
        return bomRevisionJoin;
    }

    /**
     * 设置bomRevisionJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BomRevisionSearchBasic }
     *     
     */
    public void setBomRevisionJoin(BomRevisionSearchBasic value) {
        this.bomRevisionJoin = value;
    }

    /**
     * 获取callJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PhoneCallSearchBasic }
     *     
     */
    public PhoneCallSearchBasic getCallJoin() {
        return callJoin;
    }

    /**
     * 设置callJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneCallSearchBasic }
     *     
     */
    public void setCallJoin(PhoneCallSearchBasic value) {
        this.callJoin = value;
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
     * 获取classJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ClassificationSearchBasic }
     *     
     */
    public ClassificationSearchBasic getClassJoin() {
        return classJoin;
    }

    /**
     * 设置classJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationSearchBasic }
     *     
     */
    public void setClassJoin(ClassificationSearchBasic value) {
        this.classJoin = value;
    }

    /**
     * 获取cogsPurchaseJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getCogsPurchaseJoin() {
        return cogsPurchaseJoin;
    }

    /**
     * 设置cogsPurchaseJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setCogsPurchaseJoin(TransactionSearchBasic value) {
        this.cogsPurchaseJoin = value;
    }

    /**
     * 获取cogsSaleJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getCogsSaleJoin() {
        return cogsSaleJoin;
    }

    /**
     * 设置cogsSaleJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setCogsSaleJoin(TransactionSearchBasic value) {
        this.cogsSaleJoin = value;
    }

    /**
     * 获取contactPrimaryJoin属性的值。
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
     * 设置contactPrimaryJoin属性的值。
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
     * 获取createdFromJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getCreatedFromJoin() {
        return createdFromJoin;
    }

    /**
     * 设置createdFromJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setCreatedFromJoin(TransactionSearchBasic value) {
        this.createdFromJoin = value;
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
     * 获取customerMainJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomerSearchBasic }
     *     
     */
    public CustomerSearchBasic getCustomerMainJoin() {
        return customerMainJoin;
    }

    /**
     * 设置customerMainJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSearchBasic }
     *     
     */
    public void setCustomerMainJoin(CustomerSearchBasic value) {
        this.customerMainJoin = value;
    }

    /**
     * 获取departmentJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DepartmentSearchBasic }
     *     
     */
    public DepartmentSearchBasic getDepartmentJoin() {
        return departmentJoin;
    }

    /**
     * 设置departmentJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DepartmentSearchBasic }
     *     
     */
    public void setDepartmentJoin(DepartmentSearchBasic value) {
        this.departmentJoin = value;
    }

    /**
     * 获取depositTransactionJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getDepositTransactionJoin() {
        return depositTransactionJoin;
    }

    /**
     * 设置depositTransactionJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setDepositTransactionJoin(TransactionSearchBasic value) {
        this.depositTransactionJoin = value;
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
     * 获取eventJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CalendarEventSearchBasic }
     *     
     */
    public CalendarEventSearchBasic getEventJoin() {
        return eventJoin;
    }

    /**
     * 设置eventJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarEventSearchBasic }
     *     
     */
    public void setEventJoin(CalendarEventSearchBasic value) {
        this.eventJoin = value;
    }

    /**
     * 获取expenseCategoryJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ExpenseCategorySearchBasic }
     *     
     */
    public ExpenseCategorySearchBasic getExpenseCategoryJoin() {
        return expenseCategoryJoin;
    }

    /**
     * 设置expenseCategoryJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ExpenseCategorySearchBasic }
     *     
     */
    public void setExpenseCategoryJoin(ExpenseCategorySearchBasic value) {
        this.expenseCategoryJoin = value;
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
     * 获取fromLocationJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LocationSearchBasic }
     *     
     */
    public LocationSearchBasic getFromLocationJoin() {
        return fromLocationJoin;
    }

    /**
     * 设置fromLocationJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LocationSearchBasic }
     *     
     */
    public void setFromLocationJoin(LocationSearchBasic value) {
        this.fromLocationJoin = value;
    }

    /**
     * 获取fulfillingTransactionJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getFulfillingTransactionJoin() {
        return fulfillingTransactionJoin;
    }

    /**
     * 设置fulfillingTransactionJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setFulfillingTransactionJoin(TransactionSearchBasic value) {
        this.fulfillingTransactionJoin = value;
    }

    /**
     * 获取headerBillingAccountJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BillingAccountSearchBasic }
     *     
     */
    public BillingAccountSearchBasic getHeaderBillingAccountJoin() {
        return headerBillingAccountJoin;
    }

    /**
     * 设置headerBillingAccountJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BillingAccountSearchBasic }
     *     
     */
    public void setHeaderBillingAccountJoin(BillingAccountSearchBasic value) {
        this.headerBillingAccountJoin = value;
    }

    /**
     * 获取inventoryDetailJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InventoryDetailSearchBasic }
     *     
     */
    public InventoryDetailSearchBasic getInventoryDetailJoin() {
        return inventoryDetailJoin;
    }

    /**
     * 设置inventoryDetailJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryDetailSearchBasic }
     *     
     */
    public void setInventoryDetailJoin(InventoryDetailSearchBasic value) {
        this.inventoryDetailJoin = value;
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
     * 获取itemNumberJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InventoryNumberSearchBasic }
     *     
     */
    public InventoryNumberSearchBasic getItemNumberJoin() {
        return itemNumberJoin;
    }

    /**
     * 设置itemNumberJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryNumberSearchBasic }
     *     
     */
    public void setItemNumberJoin(InventoryNumberSearchBasic value) {
        this.itemNumberJoin = value;
    }

    /**
     * 获取jobJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JobSearchBasic }
     *     
     */
    public JobSearchBasic getJobJoin() {
        return jobJoin;
    }

    /**
     * 设置jobJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JobSearchBasic }
     *     
     */
    public void setJobJoin(JobSearchBasic value) {
        this.jobJoin = value;
    }

    /**
     * 获取jobMainJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JobSearchBasic }
     *     
     */
    public JobSearchBasic getJobMainJoin() {
        return jobMainJoin;
    }

    /**
     * 设置jobMainJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JobSearchBasic }
     *     
     */
    public void setJobMainJoin(JobSearchBasic value) {
        this.jobMainJoin = value;
    }

    /**
     * 获取leadSourceJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CampaignSearchBasic }
     *     
     */
    public CampaignSearchBasic getLeadSourceJoin() {
        return leadSourceJoin;
    }

    /**
     * 设置leadSourceJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignSearchBasic }
     *     
     */
    public void setLeadSourceJoin(CampaignSearchBasic value) {
        this.leadSourceJoin = value;
    }

    /**
     * 获取lineBillingAccountJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BillingAccountSearchBasic }
     *     
     */
    public BillingAccountSearchBasic getLineBillingAccountJoin() {
        return lineBillingAccountJoin;
    }

    /**
     * 设置lineBillingAccountJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BillingAccountSearchBasic }
     *     
     */
    public void setLineBillingAccountJoin(BillingAccountSearchBasic value) {
        this.lineBillingAccountJoin = value;
    }

    /**
     * 获取lineFileJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FileSearchBasic }
     *     
     */
    public FileSearchBasic getLineFileJoin() {
        return lineFileJoin;
    }

    /**
     * 设置lineFileJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FileSearchBasic }
     *     
     */
    public void setLineFileJoin(FileSearchBasic value) {
        this.lineFileJoin = value;
    }

    /**
     * 获取locationJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LocationSearchBasic }
     *     
     */
    public LocationSearchBasic getLocationJoin() {
        return locationJoin;
    }

    /**
     * 设置locationJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LocationSearchBasic }
     *     
     */
    public void setLocationJoin(LocationSearchBasic value) {
        this.locationJoin = value;
    }

    /**
     * 获取manufacturingOperationTaskJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ManufacturingOperationTaskSearchBasic }
     *     
     */
    public ManufacturingOperationTaskSearchBasic getManufacturingOperationTaskJoin() {
        return manufacturingOperationTaskJoin;
    }

    /**
     * 设置manufacturingOperationTaskJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ManufacturingOperationTaskSearchBasic }
     *     
     */
    public void setManufacturingOperationTaskJoin(ManufacturingOperationTaskSearchBasic value) {
        this.manufacturingOperationTaskJoin = value;
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
     * 获取nextApproverJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EntitySearchBasic }
     *     
     */
    public EntitySearchBasic getNextApproverJoin() {
        return nextApproverJoin;
    }

    /**
     * 设置nextApproverJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EntitySearchBasic }
     *     
     */
    public void setNextApproverJoin(EntitySearchBasic value) {
        this.nextApproverJoin = value;
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
     * 获取paidTransactionJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getPaidTransactionJoin() {
        return paidTransactionJoin;
    }

    /**
     * 设置paidTransactionJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setPaidTransactionJoin(TransactionSearchBasic value) {
        this.paidTransactionJoin = value;
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
     * 获取payingTransactionJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getPayingTransactionJoin() {
        return payingTransactionJoin;
    }

    /**
     * 设置payingTransactionJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setPayingTransactionJoin(TransactionSearchBasic value) {
        this.payingTransactionJoin = value;
    }

    /**
     * 获取payrollItemJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PayrollItemSearchBasic }
     *     
     */
    public PayrollItemSearchBasic getPayrollItemJoin() {
        return payrollItemJoin;
    }

    /**
     * 设置payrollItemJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PayrollItemSearchBasic }
     *     
     */
    public void setPayrollItemJoin(PayrollItemSearchBasic value) {
        this.payrollItemJoin = value;
    }

    /**
     * 获取projectTaskJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProjectTaskSearchBasic }
     *     
     */
    public ProjectTaskSearchBasic getProjectTaskJoin() {
        return projectTaskJoin;
    }

    /**
     * 设置projectTaskJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectTaskSearchBasic }
     *     
     */
    public void setProjectTaskJoin(ProjectTaskSearchBasic value) {
        this.projectTaskJoin = value;
    }

    /**
     * 获取purchaseOrderJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getPurchaseOrderJoin() {
        return purchaseOrderJoin;
    }

    /**
     * 设置purchaseOrderJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setPurchaseOrderJoin(TransactionSearchBasic value) {
        this.purchaseOrderJoin = value;
    }

    /**
     * 获取requestorJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public EmployeeSearchBasic getRequestorJoin() {
        return requestorJoin;
    }

    /**
     * 设置requestorJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public void setRequestorJoin(EmployeeSearchBasic value) {
        this.requestorJoin = value;
    }

    /**
     * 获取revCommittingTransactionJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getRevCommittingTransactionJoin() {
        return revCommittingTransactionJoin;
    }

    /**
     * 设置revCommittingTransactionJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setRevCommittingTransactionJoin(TransactionSearchBasic value) {
        this.revCommittingTransactionJoin = value;
    }

    /**
     * 获取revisionJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemRevisionSearchBasic }
     *     
     */
    public ItemRevisionSearchBasic getRevisionJoin() {
        return revisionJoin;
    }

    /**
     * 设置revisionJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemRevisionSearchBasic }
     *     
     */
    public void setRevisionJoin(ItemRevisionSearchBasic value) {
        this.revisionJoin = value;
    }

    /**
     * 获取revRecScheduleJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RevRecScheduleSearchBasic }
     *     
     */
    public RevRecScheduleSearchBasic getRevRecScheduleJoin() {
        return revRecScheduleJoin;
    }

    /**
     * 设置revRecScheduleJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RevRecScheduleSearchBasic }
     *     
     */
    public void setRevRecScheduleJoin(RevRecScheduleSearchBasic value) {
        this.revRecScheduleJoin = value;
    }

    /**
     * 获取rgPostingTransactionJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getRgPostingTransactionJoin() {
        return rgPostingTransactionJoin;
    }

    /**
     * 设置rgPostingTransactionJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setRgPostingTransactionJoin(TransactionSearchBasic value) {
        this.rgPostingTransactionJoin = value;
    }

    /**
     * 获取salesOrderJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getSalesOrderJoin() {
        return salesOrderJoin;
    }

    /**
     * 设置salesOrderJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setSalesOrderJoin(TransactionSearchBasic value) {
        this.salesOrderJoin = value;
    }

    /**
     * 获取salesRepJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public EmployeeSearchBasic getSalesRepJoin() {
        return salesRepJoin;
    }

    /**
     * 设置salesRepJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public void setSalesRepJoin(EmployeeSearchBasic value) {
        this.salesRepJoin = value;
    }

    /**
     * 获取shippingAddressJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AddressSearchBasic }
     *     
     */
    public AddressSearchBasic getShippingAddressJoin() {
        return shippingAddressJoin;
    }

    /**
     * 设置shippingAddressJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AddressSearchBasic }
     *     
     */
    public void setShippingAddressJoin(AddressSearchBasic value) {
        this.shippingAddressJoin = value;
    }

    /**
     * 获取subsidiaryJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SubsidiarySearchBasic }
     *     
     */
    public SubsidiarySearchBasic getSubsidiaryJoin() {
        return subsidiaryJoin;
    }

    /**
     * 设置subsidiaryJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SubsidiarySearchBasic }
     *     
     */
    public void setSubsidiaryJoin(SubsidiarySearchBasic value) {
        this.subsidiaryJoin = value;
    }

    /**
     * 获取taskJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TaskSearchBasic }
     *     
     */
    public TaskSearchBasic getTaskJoin() {
        return taskJoin;
    }

    /**
     * 设置taskJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TaskSearchBasic }
     *     
     */
    public void setTaskJoin(TaskSearchBasic value) {
        this.taskJoin = value;
    }

    /**
     * 获取taxCodeJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SalesTaxItemSearchBasic }
     *     
     */
    public SalesTaxItemSearchBasic getTaxCodeJoin() {
        return taxCodeJoin;
    }

    /**
     * 设置taxCodeJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SalesTaxItemSearchBasic }
     *     
     */
    public void setTaxCodeJoin(SalesTaxItemSearchBasic value) {
        this.taxCodeJoin = value;
    }

    /**
     * 获取taxDetailJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TaxDetailSearchBasic }
     *     
     */
    public TaxDetailSearchBasic getTaxDetailJoin() {
        return taxDetailJoin;
    }

    /**
     * 设置taxDetailJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDetailSearchBasic }
     *     
     */
    public void setTaxDetailJoin(TaxDetailSearchBasic value) {
        this.taxDetailJoin = value;
    }

    /**
     * 获取taxItemJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SalesTaxItemSearchBasic }
     *     
     */
    public SalesTaxItemSearchBasic getTaxItemJoin() {
        return taxItemJoin;
    }

    /**
     * 设置taxItemJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SalesTaxItemSearchBasic }
     *     
     */
    public void setTaxItemJoin(SalesTaxItemSearchBasic value) {
        this.taxItemJoin = value;
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
     * 获取toLocationJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LocationSearchBasic }
     *     
     */
    public LocationSearchBasic getToLocationJoin() {
        return toLocationJoin;
    }

    /**
     * 设置toLocationJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LocationSearchBasic }
     *     
     */
    public void setToLocationJoin(LocationSearchBasic value) {
        this.toLocationJoin = value;
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

    /**
     * 获取vendorLineJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VendorSearchBasic }
     *     
     */
    public VendorSearchBasic getVendorLineJoin() {
        return vendorLineJoin;
    }

    /**
     * 设置vendorLineJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VendorSearchBasic }
     *     
     */
    public void setVendorLineJoin(VendorSearchBasic value) {
        this.vendorLineJoin = value;
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
