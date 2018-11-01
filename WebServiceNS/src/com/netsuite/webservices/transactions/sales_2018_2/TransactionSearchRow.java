
package com.netsuite.webservices.transactions.sales_2018_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_2.AccountSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.AccountingPeriodSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.AccountingTransactionSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.AddressSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.BillingAccountSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.BinSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.BomRevisionSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.BomSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.CalendarEventSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.CampaignSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.ClassificationSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.ContactSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.CustomSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.CustomerSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.DepartmentSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.EmployeeSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.EntitySearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.ExpenseCategorySearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.FileSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.InventoryDetailSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.InventoryNumberSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.ItemRevisionSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.ItemSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.JobSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.LocationSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.ManufacturingOperationTaskSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.MessageSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.NoteSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.OpportunitySearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.PartnerSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.PayrollItemSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.PhoneCallSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.ProjectTaskSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.RevRecScheduleSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.SalesTaxItemSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.SubsidiarySearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.SupportCaseSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.TaskSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.TaxDetailSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.TimeBillSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.TransactionSearchRowBasic;
import com.netsuite.webservices.platform.common_2018_2.VendorSearchRowBasic;
import com.netsuite.webservices.platform.core_2018_2.SearchRow;


/**
 * <p>TransactionSearchRow complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TransactionSearchRow">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRow">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2018_2.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="accountJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}AccountSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="accountingPeriodJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}AccountingPeriodSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="accountingTransactionJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}AccountingTransactionSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="advanceToApplyAccountJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}AccountSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="appliedToTransactionJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="applyingTransactionJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="billingAddressJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}AddressSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="billingTransactionJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="binNumberJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}BinSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="bomJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}BomSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="bomRevisionJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}BomRevisionSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="callJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}PhoneCallSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="caseJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}SupportCaseSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="classJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ClassificationSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="cogsPurchaseJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="cogsSaleJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="contactPrimaryJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ContactSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="createdFromJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="customerJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}CustomerSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="customerMainJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}CustomerSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="departmentJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}DepartmentSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="depositTransactionJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="employeeJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}EmployeeSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="eventJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}CalendarEventSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="expenseCategoryJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ExpenseCategorySearchRowBasic" minOccurs="0"/>
 *         &lt;element name="fileJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}FileSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="fromLocationJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}LocationSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="fulfillingTransactionJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="headerBillingAccountJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}BillingAccountSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="inventoryDetailJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}InventoryDetailSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="itemJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ItemSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="itemNumberJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}InventoryNumberSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="jobJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}JobSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="jobMainJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}JobSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="leadSourceJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}CampaignSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="lineBillingAccountJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}BillingAccountSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="lineFileJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}FileSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="locationJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}LocationSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="manufacturingOperationTaskJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ManufacturingOperationTaskSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="messagesJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}MessageSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="nextApproverJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}EntitySearchRowBasic" minOccurs="0"/>
 *         &lt;element name="opportunityJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}OpportunitySearchRowBasic" minOccurs="0"/>
 *         &lt;element name="paidTransactionJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="partnerJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}PartnerSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="payingTransactionJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="payrollItemJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}PayrollItemSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="projectTaskJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ProjectTaskSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="purchaseOrderJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="requestorJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}EmployeeSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="revCommittingTransactionJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="revisionJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}ItemRevisionSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="revRecScheduleJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}RevRecScheduleSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="rgPostingTransactionJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="salesOrderJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="salesRepJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}EmployeeSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="shippingAddressJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}AddressSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="subsidiaryJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}SubsidiarySearchRowBasic" minOccurs="0"/>
 *         &lt;element name="taskJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TaskSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="taxCodeJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}SalesTaxItemSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="taxDetailJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TaxDetailSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="taxItemJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}SalesTaxItemSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="timeJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}TimeBillSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="toLocationJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}LocationSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="userJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}EmployeeSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="userNotesJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}NoteSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="vendorJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}VendorSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="vendorLineJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}VendorSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="customSearchJoin" type="{urn:common_2018_2.platform.webservices.netsuite.com}CustomSearchRowBasic" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionSearchRow", propOrder = {
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
public class TransactionSearchRow
    extends SearchRow
{

    protected TransactionSearchRowBasic basic;
    protected AccountSearchRowBasic accountJoin;
    protected AccountingPeriodSearchRowBasic accountingPeriodJoin;
    protected AccountingTransactionSearchRowBasic accountingTransactionJoin;
    protected AccountSearchRowBasic advanceToApplyAccountJoin;
    protected TransactionSearchRowBasic appliedToTransactionJoin;
    protected TransactionSearchRowBasic applyingTransactionJoin;
    protected AddressSearchRowBasic billingAddressJoin;
    protected TransactionSearchRowBasic billingTransactionJoin;
    protected BinSearchRowBasic binNumberJoin;
    protected BomSearchRowBasic bomJoin;
    protected BomRevisionSearchRowBasic bomRevisionJoin;
    protected PhoneCallSearchRowBasic callJoin;
    protected SupportCaseSearchRowBasic caseJoin;
    protected ClassificationSearchRowBasic classJoin;
    protected TransactionSearchRowBasic cogsPurchaseJoin;
    protected TransactionSearchRowBasic cogsSaleJoin;
    protected ContactSearchRowBasic contactPrimaryJoin;
    protected TransactionSearchRowBasic createdFromJoin;
    protected CustomerSearchRowBasic customerJoin;
    protected CustomerSearchRowBasic customerMainJoin;
    protected DepartmentSearchRowBasic departmentJoin;
    protected TransactionSearchRowBasic depositTransactionJoin;
    protected EmployeeSearchRowBasic employeeJoin;
    protected CalendarEventSearchRowBasic eventJoin;
    protected ExpenseCategorySearchRowBasic expenseCategoryJoin;
    protected FileSearchRowBasic fileJoin;
    protected LocationSearchRowBasic fromLocationJoin;
    protected TransactionSearchRowBasic fulfillingTransactionJoin;
    protected BillingAccountSearchRowBasic headerBillingAccountJoin;
    protected InventoryDetailSearchRowBasic inventoryDetailJoin;
    protected ItemSearchRowBasic itemJoin;
    protected InventoryNumberSearchRowBasic itemNumberJoin;
    protected JobSearchRowBasic jobJoin;
    protected JobSearchRowBasic jobMainJoin;
    protected CampaignSearchRowBasic leadSourceJoin;
    protected BillingAccountSearchRowBasic lineBillingAccountJoin;
    protected FileSearchRowBasic lineFileJoin;
    protected LocationSearchRowBasic locationJoin;
    protected ManufacturingOperationTaskSearchRowBasic manufacturingOperationTaskJoin;
    protected MessageSearchRowBasic messagesJoin;
    protected EntitySearchRowBasic nextApproverJoin;
    protected OpportunitySearchRowBasic opportunityJoin;
    protected TransactionSearchRowBasic paidTransactionJoin;
    protected PartnerSearchRowBasic partnerJoin;
    protected TransactionSearchRowBasic payingTransactionJoin;
    protected PayrollItemSearchRowBasic payrollItemJoin;
    protected ProjectTaskSearchRowBasic projectTaskJoin;
    protected TransactionSearchRowBasic purchaseOrderJoin;
    protected EmployeeSearchRowBasic requestorJoin;
    protected TransactionSearchRowBasic revCommittingTransactionJoin;
    protected ItemRevisionSearchRowBasic revisionJoin;
    protected RevRecScheduleSearchRowBasic revRecScheduleJoin;
    protected TransactionSearchRowBasic rgPostingTransactionJoin;
    protected TransactionSearchRowBasic salesOrderJoin;
    protected EmployeeSearchRowBasic salesRepJoin;
    protected AddressSearchRowBasic shippingAddressJoin;
    protected SubsidiarySearchRowBasic subsidiaryJoin;
    protected TaskSearchRowBasic taskJoin;
    protected SalesTaxItemSearchRowBasic taxCodeJoin;
    protected TaxDetailSearchRowBasic taxDetailJoin;
    protected SalesTaxItemSearchRowBasic taxItemJoin;
    protected TimeBillSearchRowBasic timeJoin;
    protected LocationSearchRowBasic toLocationJoin;
    protected EmployeeSearchRowBasic userJoin;
    protected NoteSearchRowBasic userNotesJoin;
    protected VendorSearchRowBasic vendorJoin;
    protected VendorSearchRowBasic vendorLineJoin;
    protected List<CustomSearchRowBasic> customSearchJoin;

    /**
     * 获取basic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public TransactionSearchRowBasic getBasic() {
        return basic;
    }

    /**
     * 设置basic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public void setBasic(TransactionSearchRowBasic value) {
        this.basic = value;
    }

    /**
     * 获取accountJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AccountSearchRowBasic }
     *     
     */
    public AccountSearchRowBasic getAccountJoin() {
        return accountJoin;
    }

    /**
     * 设置accountJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSearchRowBasic }
     *     
     */
    public void setAccountJoin(AccountSearchRowBasic value) {
        this.accountJoin = value;
    }

    /**
     * 获取accountingPeriodJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AccountingPeriodSearchRowBasic }
     *     
     */
    public AccountingPeriodSearchRowBasic getAccountingPeriodJoin() {
        return accountingPeriodJoin;
    }

    /**
     * 设置accountingPeriodJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingPeriodSearchRowBasic }
     *     
     */
    public void setAccountingPeriodJoin(AccountingPeriodSearchRowBasic value) {
        this.accountingPeriodJoin = value;
    }

    /**
     * 获取accountingTransactionJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AccountingTransactionSearchRowBasic }
     *     
     */
    public AccountingTransactionSearchRowBasic getAccountingTransactionJoin() {
        return accountingTransactionJoin;
    }

    /**
     * 设置accountingTransactionJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingTransactionSearchRowBasic }
     *     
     */
    public void setAccountingTransactionJoin(AccountingTransactionSearchRowBasic value) {
        this.accountingTransactionJoin = value;
    }

    /**
     * 获取advanceToApplyAccountJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AccountSearchRowBasic }
     *     
     */
    public AccountSearchRowBasic getAdvanceToApplyAccountJoin() {
        return advanceToApplyAccountJoin;
    }

    /**
     * 设置advanceToApplyAccountJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSearchRowBasic }
     *     
     */
    public void setAdvanceToApplyAccountJoin(AccountSearchRowBasic value) {
        this.advanceToApplyAccountJoin = value;
    }

    /**
     * 获取appliedToTransactionJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public TransactionSearchRowBasic getAppliedToTransactionJoin() {
        return appliedToTransactionJoin;
    }

    /**
     * 设置appliedToTransactionJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public void setAppliedToTransactionJoin(TransactionSearchRowBasic value) {
        this.appliedToTransactionJoin = value;
    }

    /**
     * 获取applyingTransactionJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public TransactionSearchRowBasic getApplyingTransactionJoin() {
        return applyingTransactionJoin;
    }

    /**
     * 设置applyingTransactionJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public void setApplyingTransactionJoin(TransactionSearchRowBasic value) {
        this.applyingTransactionJoin = value;
    }

    /**
     * 获取billingAddressJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AddressSearchRowBasic }
     *     
     */
    public AddressSearchRowBasic getBillingAddressJoin() {
        return billingAddressJoin;
    }

    /**
     * 设置billingAddressJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AddressSearchRowBasic }
     *     
     */
    public void setBillingAddressJoin(AddressSearchRowBasic value) {
        this.billingAddressJoin = value;
    }

    /**
     * 获取billingTransactionJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public TransactionSearchRowBasic getBillingTransactionJoin() {
        return billingTransactionJoin;
    }

    /**
     * 设置billingTransactionJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public void setBillingTransactionJoin(TransactionSearchRowBasic value) {
        this.billingTransactionJoin = value;
    }

    /**
     * 获取binNumberJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BinSearchRowBasic }
     *     
     */
    public BinSearchRowBasic getBinNumberJoin() {
        return binNumberJoin;
    }

    /**
     * 设置binNumberJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BinSearchRowBasic }
     *     
     */
    public void setBinNumberJoin(BinSearchRowBasic value) {
        this.binNumberJoin = value;
    }

    /**
     * 获取bomJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BomSearchRowBasic }
     *     
     */
    public BomSearchRowBasic getBomJoin() {
        return bomJoin;
    }

    /**
     * 设置bomJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BomSearchRowBasic }
     *     
     */
    public void setBomJoin(BomSearchRowBasic value) {
        this.bomJoin = value;
    }

    /**
     * 获取bomRevisionJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BomRevisionSearchRowBasic }
     *     
     */
    public BomRevisionSearchRowBasic getBomRevisionJoin() {
        return bomRevisionJoin;
    }

    /**
     * 设置bomRevisionJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BomRevisionSearchRowBasic }
     *     
     */
    public void setBomRevisionJoin(BomRevisionSearchRowBasic value) {
        this.bomRevisionJoin = value;
    }

    /**
     * 获取callJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PhoneCallSearchRowBasic }
     *     
     */
    public PhoneCallSearchRowBasic getCallJoin() {
        return callJoin;
    }

    /**
     * 设置callJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneCallSearchRowBasic }
     *     
     */
    public void setCallJoin(PhoneCallSearchRowBasic value) {
        this.callJoin = value;
    }

    /**
     * 获取caseJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SupportCaseSearchRowBasic }
     *     
     */
    public SupportCaseSearchRowBasic getCaseJoin() {
        return caseJoin;
    }

    /**
     * 设置caseJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SupportCaseSearchRowBasic }
     *     
     */
    public void setCaseJoin(SupportCaseSearchRowBasic value) {
        this.caseJoin = value;
    }

    /**
     * 获取classJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ClassificationSearchRowBasic }
     *     
     */
    public ClassificationSearchRowBasic getClassJoin() {
        return classJoin;
    }

    /**
     * 设置classJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationSearchRowBasic }
     *     
     */
    public void setClassJoin(ClassificationSearchRowBasic value) {
        this.classJoin = value;
    }

    /**
     * 获取cogsPurchaseJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public TransactionSearchRowBasic getCogsPurchaseJoin() {
        return cogsPurchaseJoin;
    }

    /**
     * 设置cogsPurchaseJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public void setCogsPurchaseJoin(TransactionSearchRowBasic value) {
        this.cogsPurchaseJoin = value;
    }

    /**
     * 获取cogsSaleJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public TransactionSearchRowBasic getCogsSaleJoin() {
        return cogsSaleJoin;
    }

    /**
     * 设置cogsSaleJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public void setCogsSaleJoin(TransactionSearchRowBasic value) {
        this.cogsSaleJoin = value;
    }

    /**
     * 获取contactPrimaryJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ContactSearchRowBasic }
     *     
     */
    public ContactSearchRowBasic getContactPrimaryJoin() {
        return contactPrimaryJoin;
    }

    /**
     * 设置contactPrimaryJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ContactSearchRowBasic }
     *     
     */
    public void setContactPrimaryJoin(ContactSearchRowBasic value) {
        this.contactPrimaryJoin = value;
    }

    /**
     * 获取createdFromJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public TransactionSearchRowBasic getCreatedFromJoin() {
        return createdFromJoin;
    }

    /**
     * 设置createdFromJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public void setCreatedFromJoin(TransactionSearchRowBasic value) {
        this.createdFromJoin = value;
    }

    /**
     * 获取customerJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomerSearchRowBasic }
     *     
     */
    public CustomerSearchRowBasic getCustomerJoin() {
        return customerJoin;
    }

    /**
     * 设置customerJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSearchRowBasic }
     *     
     */
    public void setCustomerJoin(CustomerSearchRowBasic value) {
        this.customerJoin = value;
    }

    /**
     * 获取customerMainJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomerSearchRowBasic }
     *     
     */
    public CustomerSearchRowBasic getCustomerMainJoin() {
        return customerMainJoin;
    }

    /**
     * 设置customerMainJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSearchRowBasic }
     *     
     */
    public void setCustomerMainJoin(CustomerSearchRowBasic value) {
        this.customerMainJoin = value;
    }

    /**
     * 获取departmentJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DepartmentSearchRowBasic }
     *     
     */
    public DepartmentSearchRowBasic getDepartmentJoin() {
        return departmentJoin;
    }

    /**
     * 设置departmentJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DepartmentSearchRowBasic }
     *     
     */
    public void setDepartmentJoin(DepartmentSearchRowBasic value) {
        this.departmentJoin = value;
    }

    /**
     * 获取depositTransactionJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public TransactionSearchRowBasic getDepositTransactionJoin() {
        return depositTransactionJoin;
    }

    /**
     * 设置depositTransactionJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public void setDepositTransactionJoin(TransactionSearchRowBasic value) {
        this.depositTransactionJoin = value;
    }

    /**
     * 获取employeeJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public EmployeeSearchRowBasic getEmployeeJoin() {
        return employeeJoin;
    }

    /**
     * 设置employeeJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public void setEmployeeJoin(EmployeeSearchRowBasic value) {
        this.employeeJoin = value;
    }

    /**
     * 获取eventJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CalendarEventSearchRowBasic }
     *     
     */
    public CalendarEventSearchRowBasic getEventJoin() {
        return eventJoin;
    }

    /**
     * 设置eventJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarEventSearchRowBasic }
     *     
     */
    public void setEventJoin(CalendarEventSearchRowBasic value) {
        this.eventJoin = value;
    }

    /**
     * 获取expenseCategoryJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ExpenseCategorySearchRowBasic }
     *     
     */
    public ExpenseCategorySearchRowBasic getExpenseCategoryJoin() {
        return expenseCategoryJoin;
    }

    /**
     * 设置expenseCategoryJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ExpenseCategorySearchRowBasic }
     *     
     */
    public void setExpenseCategoryJoin(ExpenseCategorySearchRowBasic value) {
        this.expenseCategoryJoin = value;
    }

    /**
     * 获取fileJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FileSearchRowBasic }
     *     
     */
    public FileSearchRowBasic getFileJoin() {
        return fileJoin;
    }

    /**
     * 设置fileJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FileSearchRowBasic }
     *     
     */
    public void setFileJoin(FileSearchRowBasic value) {
        this.fileJoin = value;
    }

    /**
     * 获取fromLocationJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LocationSearchRowBasic }
     *     
     */
    public LocationSearchRowBasic getFromLocationJoin() {
        return fromLocationJoin;
    }

    /**
     * 设置fromLocationJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LocationSearchRowBasic }
     *     
     */
    public void setFromLocationJoin(LocationSearchRowBasic value) {
        this.fromLocationJoin = value;
    }

    /**
     * 获取fulfillingTransactionJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public TransactionSearchRowBasic getFulfillingTransactionJoin() {
        return fulfillingTransactionJoin;
    }

    /**
     * 设置fulfillingTransactionJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public void setFulfillingTransactionJoin(TransactionSearchRowBasic value) {
        this.fulfillingTransactionJoin = value;
    }

    /**
     * 获取headerBillingAccountJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BillingAccountSearchRowBasic }
     *     
     */
    public BillingAccountSearchRowBasic getHeaderBillingAccountJoin() {
        return headerBillingAccountJoin;
    }

    /**
     * 设置headerBillingAccountJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BillingAccountSearchRowBasic }
     *     
     */
    public void setHeaderBillingAccountJoin(BillingAccountSearchRowBasic value) {
        this.headerBillingAccountJoin = value;
    }

    /**
     * 获取inventoryDetailJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InventoryDetailSearchRowBasic }
     *     
     */
    public InventoryDetailSearchRowBasic getInventoryDetailJoin() {
        return inventoryDetailJoin;
    }

    /**
     * 设置inventoryDetailJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryDetailSearchRowBasic }
     *     
     */
    public void setInventoryDetailJoin(InventoryDetailSearchRowBasic value) {
        this.inventoryDetailJoin = value;
    }

    /**
     * 获取itemJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public ItemSearchRowBasic getItemJoin() {
        return itemJoin;
    }

    /**
     * 设置itemJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public void setItemJoin(ItemSearchRowBasic value) {
        this.itemJoin = value;
    }

    /**
     * 获取itemNumberJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InventoryNumberSearchRowBasic }
     *     
     */
    public InventoryNumberSearchRowBasic getItemNumberJoin() {
        return itemNumberJoin;
    }

    /**
     * 设置itemNumberJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryNumberSearchRowBasic }
     *     
     */
    public void setItemNumberJoin(InventoryNumberSearchRowBasic value) {
        this.itemNumberJoin = value;
    }

    /**
     * 获取jobJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JobSearchRowBasic }
     *     
     */
    public JobSearchRowBasic getJobJoin() {
        return jobJoin;
    }

    /**
     * 设置jobJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JobSearchRowBasic }
     *     
     */
    public void setJobJoin(JobSearchRowBasic value) {
        this.jobJoin = value;
    }

    /**
     * 获取jobMainJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JobSearchRowBasic }
     *     
     */
    public JobSearchRowBasic getJobMainJoin() {
        return jobMainJoin;
    }

    /**
     * 设置jobMainJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JobSearchRowBasic }
     *     
     */
    public void setJobMainJoin(JobSearchRowBasic value) {
        this.jobMainJoin = value;
    }

    /**
     * 获取leadSourceJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CampaignSearchRowBasic }
     *     
     */
    public CampaignSearchRowBasic getLeadSourceJoin() {
        return leadSourceJoin;
    }

    /**
     * 设置leadSourceJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignSearchRowBasic }
     *     
     */
    public void setLeadSourceJoin(CampaignSearchRowBasic value) {
        this.leadSourceJoin = value;
    }

    /**
     * 获取lineBillingAccountJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BillingAccountSearchRowBasic }
     *     
     */
    public BillingAccountSearchRowBasic getLineBillingAccountJoin() {
        return lineBillingAccountJoin;
    }

    /**
     * 设置lineBillingAccountJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BillingAccountSearchRowBasic }
     *     
     */
    public void setLineBillingAccountJoin(BillingAccountSearchRowBasic value) {
        this.lineBillingAccountJoin = value;
    }

    /**
     * 获取lineFileJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FileSearchRowBasic }
     *     
     */
    public FileSearchRowBasic getLineFileJoin() {
        return lineFileJoin;
    }

    /**
     * 设置lineFileJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FileSearchRowBasic }
     *     
     */
    public void setLineFileJoin(FileSearchRowBasic value) {
        this.lineFileJoin = value;
    }

    /**
     * 获取locationJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LocationSearchRowBasic }
     *     
     */
    public LocationSearchRowBasic getLocationJoin() {
        return locationJoin;
    }

    /**
     * 设置locationJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LocationSearchRowBasic }
     *     
     */
    public void setLocationJoin(LocationSearchRowBasic value) {
        this.locationJoin = value;
    }

    /**
     * 获取manufacturingOperationTaskJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ManufacturingOperationTaskSearchRowBasic }
     *     
     */
    public ManufacturingOperationTaskSearchRowBasic getManufacturingOperationTaskJoin() {
        return manufacturingOperationTaskJoin;
    }

    /**
     * 设置manufacturingOperationTaskJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ManufacturingOperationTaskSearchRowBasic }
     *     
     */
    public void setManufacturingOperationTaskJoin(ManufacturingOperationTaskSearchRowBasic value) {
        this.manufacturingOperationTaskJoin = value;
    }

    /**
     * 获取messagesJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MessageSearchRowBasic }
     *     
     */
    public MessageSearchRowBasic getMessagesJoin() {
        return messagesJoin;
    }

    /**
     * 设置messagesJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MessageSearchRowBasic }
     *     
     */
    public void setMessagesJoin(MessageSearchRowBasic value) {
        this.messagesJoin = value;
    }

    /**
     * 获取nextApproverJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EntitySearchRowBasic }
     *     
     */
    public EntitySearchRowBasic getNextApproverJoin() {
        return nextApproverJoin;
    }

    /**
     * 设置nextApproverJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EntitySearchRowBasic }
     *     
     */
    public void setNextApproverJoin(EntitySearchRowBasic value) {
        this.nextApproverJoin = value;
    }

    /**
     * 获取opportunityJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OpportunitySearchRowBasic }
     *     
     */
    public OpportunitySearchRowBasic getOpportunityJoin() {
        return opportunityJoin;
    }

    /**
     * 设置opportunityJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OpportunitySearchRowBasic }
     *     
     */
    public void setOpportunityJoin(OpportunitySearchRowBasic value) {
        this.opportunityJoin = value;
    }

    /**
     * 获取paidTransactionJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public TransactionSearchRowBasic getPaidTransactionJoin() {
        return paidTransactionJoin;
    }

    /**
     * 设置paidTransactionJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public void setPaidTransactionJoin(TransactionSearchRowBasic value) {
        this.paidTransactionJoin = value;
    }

    /**
     * 获取partnerJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PartnerSearchRowBasic }
     *     
     */
    public PartnerSearchRowBasic getPartnerJoin() {
        return partnerJoin;
    }

    /**
     * 设置partnerJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerSearchRowBasic }
     *     
     */
    public void setPartnerJoin(PartnerSearchRowBasic value) {
        this.partnerJoin = value;
    }

    /**
     * 获取payingTransactionJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public TransactionSearchRowBasic getPayingTransactionJoin() {
        return payingTransactionJoin;
    }

    /**
     * 设置payingTransactionJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public void setPayingTransactionJoin(TransactionSearchRowBasic value) {
        this.payingTransactionJoin = value;
    }

    /**
     * 获取payrollItemJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PayrollItemSearchRowBasic }
     *     
     */
    public PayrollItemSearchRowBasic getPayrollItemJoin() {
        return payrollItemJoin;
    }

    /**
     * 设置payrollItemJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PayrollItemSearchRowBasic }
     *     
     */
    public void setPayrollItemJoin(PayrollItemSearchRowBasic value) {
        this.payrollItemJoin = value;
    }

    /**
     * 获取projectTaskJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProjectTaskSearchRowBasic }
     *     
     */
    public ProjectTaskSearchRowBasic getProjectTaskJoin() {
        return projectTaskJoin;
    }

    /**
     * 设置projectTaskJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectTaskSearchRowBasic }
     *     
     */
    public void setProjectTaskJoin(ProjectTaskSearchRowBasic value) {
        this.projectTaskJoin = value;
    }

    /**
     * 获取purchaseOrderJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public TransactionSearchRowBasic getPurchaseOrderJoin() {
        return purchaseOrderJoin;
    }

    /**
     * 设置purchaseOrderJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public void setPurchaseOrderJoin(TransactionSearchRowBasic value) {
        this.purchaseOrderJoin = value;
    }

    /**
     * 获取requestorJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public EmployeeSearchRowBasic getRequestorJoin() {
        return requestorJoin;
    }

    /**
     * 设置requestorJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public void setRequestorJoin(EmployeeSearchRowBasic value) {
        this.requestorJoin = value;
    }

    /**
     * 获取revCommittingTransactionJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public TransactionSearchRowBasic getRevCommittingTransactionJoin() {
        return revCommittingTransactionJoin;
    }

    /**
     * 设置revCommittingTransactionJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public void setRevCommittingTransactionJoin(TransactionSearchRowBasic value) {
        this.revCommittingTransactionJoin = value;
    }

    /**
     * 获取revisionJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemRevisionSearchRowBasic }
     *     
     */
    public ItemRevisionSearchRowBasic getRevisionJoin() {
        return revisionJoin;
    }

    /**
     * 设置revisionJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemRevisionSearchRowBasic }
     *     
     */
    public void setRevisionJoin(ItemRevisionSearchRowBasic value) {
        this.revisionJoin = value;
    }

    /**
     * 获取revRecScheduleJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RevRecScheduleSearchRowBasic }
     *     
     */
    public RevRecScheduleSearchRowBasic getRevRecScheduleJoin() {
        return revRecScheduleJoin;
    }

    /**
     * 设置revRecScheduleJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RevRecScheduleSearchRowBasic }
     *     
     */
    public void setRevRecScheduleJoin(RevRecScheduleSearchRowBasic value) {
        this.revRecScheduleJoin = value;
    }

    /**
     * 获取rgPostingTransactionJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public TransactionSearchRowBasic getRgPostingTransactionJoin() {
        return rgPostingTransactionJoin;
    }

    /**
     * 设置rgPostingTransactionJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public void setRgPostingTransactionJoin(TransactionSearchRowBasic value) {
        this.rgPostingTransactionJoin = value;
    }

    /**
     * 获取salesOrderJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public TransactionSearchRowBasic getSalesOrderJoin() {
        return salesOrderJoin;
    }

    /**
     * 设置salesOrderJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public void setSalesOrderJoin(TransactionSearchRowBasic value) {
        this.salesOrderJoin = value;
    }

    /**
     * 获取salesRepJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public EmployeeSearchRowBasic getSalesRepJoin() {
        return salesRepJoin;
    }

    /**
     * 设置salesRepJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public void setSalesRepJoin(EmployeeSearchRowBasic value) {
        this.salesRepJoin = value;
    }

    /**
     * 获取shippingAddressJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AddressSearchRowBasic }
     *     
     */
    public AddressSearchRowBasic getShippingAddressJoin() {
        return shippingAddressJoin;
    }

    /**
     * 设置shippingAddressJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AddressSearchRowBasic }
     *     
     */
    public void setShippingAddressJoin(AddressSearchRowBasic value) {
        this.shippingAddressJoin = value;
    }

    /**
     * 获取subsidiaryJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SubsidiarySearchRowBasic }
     *     
     */
    public SubsidiarySearchRowBasic getSubsidiaryJoin() {
        return subsidiaryJoin;
    }

    /**
     * 设置subsidiaryJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SubsidiarySearchRowBasic }
     *     
     */
    public void setSubsidiaryJoin(SubsidiarySearchRowBasic value) {
        this.subsidiaryJoin = value;
    }

    /**
     * 获取taskJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TaskSearchRowBasic }
     *     
     */
    public TaskSearchRowBasic getTaskJoin() {
        return taskJoin;
    }

    /**
     * 设置taskJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TaskSearchRowBasic }
     *     
     */
    public void setTaskJoin(TaskSearchRowBasic value) {
        this.taskJoin = value;
    }

    /**
     * 获取taxCodeJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SalesTaxItemSearchRowBasic }
     *     
     */
    public SalesTaxItemSearchRowBasic getTaxCodeJoin() {
        return taxCodeJoin;
    }

    /**
     * 设置taxCodeJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SalesTaxItemSearchRowBasic }
     *     
     */
    public void setTaxCodeJoin(SalesTaxItemSearchRowBasic value) {
        this.taxCodeJoin = value;
    }

    /**
     * 获取taxDetailJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TaxDetailSearchRowBasic }
     *     
     */
    public TaxDetailSearchRowBasic getTaxDetailJoin() {
        return taxDetailJoin;
    }

    /**
     * 设置taxDetailJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDetailSearchRowBasic }
     *     
     */
    public void setTaxDetailJoin(TaxDetailSearchRowBasic value) {
        this.taxDetailJoin = value;
    }

    /**
     * 获取taxItemJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SalesTaxItemSearchRowBasic }
     *     
     */
    public SalesTaxItemSearchRowBasic getTaxItemJoin() {
        return taxItemJoin;
    }

    /**
     * 设置taxItemJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SalesTaxItemSearchRowBasic }
     *     
     */
    public void setTaxItemJoin(SalesTaxItemSearchRowBasic value) {
        this.taxItemJoin = value;
    }

    /**
     * 获取timeJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TimeBillSearchRowBasic }
     *     
     */
    public TimeBillSearchRowBasic getTimeJoin() {
        return timeJoin;
    }

    /**
     * 设置timeJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimeBillSearchRowBasic }
     *     
     */
    public void setTimeJoin(TimeBillSearchRowBasic value) {
        this.timeJoin = value;
    }

    /**
     * 获取toLocationJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LocationSearchRowBasic }
     *     
     */
    public LocationSearchRowBasic getToLocationJoin() {
        return toLocationJoin;
    }

    /**
     * 设置toLocationJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LocationSearchRowBasic }
     *     
     */
    public void setToLocationJoin(LocationSearchRowBasic value) {
        this.toLocationJoin = value;
    }

    /**
     * 获取userJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public EmployeeSearchRowBasic getUserJoin() {
        return userJoin;
    }

    /**
     * 设置userJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public void setUserJoin(EmployeeSearchRowBasic value) {
        this.userJoin = value;
    }

    /**
     * 获取userNotesJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NoteSearchRowBasic }
     *     
     */
    public NoteSearchRowBasic getUserNotesJoin() {
        return userNotesJoin;
    }

    /**
     * 设置userNotesJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NoteSearchRowBasic }
     *     
     */
    public void setUserNotesJoin(NoteSearchRowBasic value) {
        this.userNotesJoin = value;
    }

    /**
     * 获取vendorJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VendorSearchRowBasic }
     *     
     */
    public VendorSearchRowBasic getVendorJoin() {
        return vendorJoin;
    }

    /**
     * 设置vendorJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VendorSearchRowBasic }
     *     
     */
    public void setVendorJoin(VendorSearchRowBasic value) {
        this.vendorJoin = value;
    }

    /**
     * 获取vendorLineJoin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VendorSearchRowBasic }
     *     
     */
    public VendorSearchRowBasic getVendorLineJoin() {
        return vendorLineJoin;
    }

    /**
     * 设置vendorLineJoin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VendorSearchRowBasic }
     *     
     */
    public void setVendorLineJoin(VendorSearchRowBasic value) {
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
     * {@link CustomSearchRowBasic }
     * 
     * 
     */
    public List<CustomSearchRowBasic> getCustomSearchJoin() {
        if (customSearchJoin == null) {
            customSearchJoin = new ArrayList<CustomSearchRowBasic>();
        }
        return this.customSearchJoin;
    }

}
