
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
 * <p>TransactionSearchRow complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡbasic���Ե�ֵ��
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
     * ����basic���Ե�ֵ��
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
     * ��ȡaccountJoin���Ե�ֵ��
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
     * ����accountJoin���Ե�ֵ��
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
     * ��ȡaccountingPeriodJoin���Ե�ֵ��
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
     * ����accountingPeriodJoin���Ե�ֵ��
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
     * ��ȡaccountingTransactionJoin���Ե�ֵ��
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
     * ����accountingTransactionJoin���Ե�ֵ��
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
     * ��ȡadvanceToApplyAccountJoin���Ե�ֵ��
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
     * ����advanceToApplyAccountJoin���Ե�ֵ��
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
     * ��ȡappliedToTransactionJoin���Ե�ֵ��
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
     * ����appliedToTransactionJoin���Ե�ֵ��
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
     * ��ȡapplyingTransactionJoin���Ե�ֵ��
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
     * ����applyingTransactionJoin���Ե�ֵ��
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
     * ��ȡbillingAddressJoin���Ե�ֵ��
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
     * ����billingAddressJoin���Ե�ֵ��
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
     * ��ȡbillingTransactionJoin���Ե�ֵ��
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
     * ����billingTransactionJoin���Ե�ֵ��
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
     * ��ȡbinNumberJoin���Ե�ֵ��
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
     * ����binNumberJoin���Ե�ֵ��
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
     * ��ȡbomJoin���Ե�ֵ��
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
     * ����bomJoin���Ե�ֵ��
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
     * ��ȡbomRevisionJoin���Ե�ֵ��
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
     * ����bomRevisionJoin���Ե�ֵ��
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
     * ��ȡcallJoin���Ե�ֵ��
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
     * ����callJoin���Ե�ֵ��
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
     * ��ȡcaseJoin���Ե�ֵ��
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
     * ����caseJoin���Ե�ֵ��
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
     * ��ȡclassJoin���Ե�ֵ��
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
     * ����classJoin���Ե�ֵ��
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
     * ��ȡcogsPurchaseJoin���Ե�ֵ��
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
     * ����cogsPurchaseJoin���Ե�ֵ��
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
     * ��ȡcogsSaleJoin���Ե�ֵ��
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
     * ����cogsSaleJoin���Ե�ֵ��
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
     * ��ȡcontactPrimaryJoin���Ե�ֵ��
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
     * ����contactPrimaryJoin���Ե�ֵ��
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
     * ��ȡcreatedFromJoin���Ե�ֵ��
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
     * ����createdFromJoin���Ե�ֵ��
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
     * ��ȡcustomerJoin���Ե�ֵ��
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
     * ����customerJoin���Ե�ֵ��
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
     * ��ȡcustomerMainJoin���Ե�ֵ��
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
     * ����customerMainJoin���Ե�ֵ��
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
     * ��ȡdepartmentJoin���Ե�ֵ��
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
     * ����departmentJoin���Ե�ֵ��
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
     * ��ȡdepositTransactionJoin���Ե�ֵ��
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
     * ����depositTransactionJoin���Ե�ֵ��
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
     * ��ȡemployeeJoin���Ե�ֵ��
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
     * ����employeeJoin���Ե�ֵ��
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
     * ��ȡeventJoin���Ե�ֵ��
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
     * ����eventJoin���Ե�ֵ��
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
     * ��ȡexpenseCategoryJoin���Ե�ֵ��
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
     * ����expenseCategoryJoin���Ե�ֵ��
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
     * ��ȡfileJoin���Ե�ֵ��
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
     * ����fileJoin���Ե�ֵ��
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
     * ��ȡfromLocationJoin���Ե�ֵ��
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
     * ����fromLocationJoin���Ե�ֵ��
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
     * ��ȡfulfillingTransactionJoin���Ե�ֵ��
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
     * ����fulfillingTransactionJoin���Ե�ֵ��
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
     * ��ȡheaderBillingAccountJoin���Ե�ֵ��
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
     * ����headerBillingAccountJoin���Ե�ֵ��
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
     * ��ȡinventoryDetailJoin���Ե�ֵ��
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
     * ����inventoryDetailJoin���Ե�ֵ��
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
     * ��ȡitemJoin���Ե�ֵ��
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
     * ����itemJoin���Ե�ֵ��
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
     * ��ȡitemNumberJoin���Ե�ֵ��
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
     * ����itemNumberJoin���Ե�ֵ��
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
     * ��ȡjobJoin���Ե�ֵ��
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
     * ����jobJoin���Ե�ֵ��
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
     * ��ȡjobMainJoin���Ե�ֵ��
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
     * ����jobMainJoin���Ե�ֵ��
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
     * ��ȡleadSourceJoin���Ե�ֵ��
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
     * ����leadSourceJoin���Ե�ֵ��
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
     * ��ȡlineBillingAccountJoin���Ե�ֵ��
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
     * ����lineBillingAccountJoin���Ե�ֵ��
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
     * ��ȡlineFileJoin���Ե�ֵ��
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
     * ����lineFileJoin���Ե�ֵ��
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
     * ��ȡlocationJoin���Ե�ֵ��
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
     * ����locationJoin���Ե�ֵ��
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
     * ��ȡmanufacturingOperationTaskJoin���Ե�ֵ��
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
     * ����manufacturingOperationTaskJoin���Ե�ֵ��
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
     * ��ȡmessagesJoin���Ե�ֵ��
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
     * ����messagesJoin���Ե�ֵ��
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
     * ��ȡnextApproverJoin���Ե�ֵ��
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
     * ����nextApproverJoin���Ե�ֵ��
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
     * ��ȡopportunityJoin���Ե�ֵ��
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
     * ����opportunityJoin���Ե�ֵ��
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
     * ��ȡpaidTransactionJoin���Ե�ֵ��
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
     * ����paidTransactionJoin���Ե�ֵ��
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
     * ��ȡpartnerJoin���Ե�ֵ��
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
     * ����partnerJoin���Ե�ֵ��
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
     * ��ȡpayingTransactionJoin���Ե�ֵ��
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
     * ����payingTransactionJoin���Ե�ֵ��
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
     * ��ȡpayrollItemJoin���Ե�ֵ��
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
     * ����payrollItemJoin���Ե�ֵ��
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
     * ��ȡprojectTaskJoin���Ե�ֵ��
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
     * ����projectTaskJoin���Ե�ֵ��
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
     * ��ȡpurchaseOrderJoin���Ե�ֵ��
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
     * ����purchaseOrderJoin���Ե�ֵ��
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
     * ��ȡrequestorJoin���Ե�ֵ��
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
     * ����requestorJoin���Ե�ֵ��
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
     * ��ȡrevCommittingTransactionJoin���Ե�ֵ��
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
     * ����revCommittingTransactionJoin���Ե�ֵ��
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
     * ��ȡrevisionJoin���Ե�ֵ��
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
     * ����revisionJoin���Ե�ֵ��
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
     * ��ȡrevRecScheduleJoin���Ե�ֵ��
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
     * ����revRecScheduleJoin���Ե�ֵ��
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
     * ��ȡrgPostingTransactionJoin���Ե�ֵ��
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
     * ����rgPostingTransactionJoin���Ե�ֵ��
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
     * ��ȡsalesOrderJoin���Ե�ֵ��
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
     * ����salesOrderJoin���Ե�ֵ��
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
     * ��ȡsalesRepJoin���Ե�ֵ��
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
     * ����salesRepJoin���Ե�ֵ��
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
     * ��ȡshippingAddressJoin���Ե�ֵ��
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
     * ����shippingAddressJoin���Ե�ֵ��
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
     * ��ȡsubsidiaryJoin���Ե�ֵ��
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
     * ����subsidiaryJoin���Ե�ֵ��
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
     * ��ȡtaskJoin���Ե�ֵ��
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
     * ����taskJoin���Ե�ֵ��
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
     * ��ȡtaxCodeJoin���Ե�ֵ��
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
     * ����taxCodeJoin���Ե�ֵ��
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
     * ��ȡtaxDetailJoin���Ե�ֵ��
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
     * ����taxDetailJoin���Ե�ֵ��
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
     * ��ȡtaxItemJoin���Ե�ֵ��
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
     * ����taxItemJoin���Ե�ֵ��
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
     * ��ȡtimeJoin���Ե�ֵ��
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
     * ����timeJoin���Ե�ֵ��
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
     * ��ȡtoLocationJoin���Ե�ֵ��
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
     * ����toLocationJoin���Ե�ֵ��
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
     * ��ȡuserJoin���Ե�ֵ��
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
     * ����userJoin���Ե�ֵ��
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
     * ��ȡuserNotesJoin���Ե�ֵ��
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
     * ����userNotesJoin���Ե�ֵ��
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
     * ��ȡvendorJoin���Ե�ֵ��
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
     * ����vendorJoin���Ե�ֵ��
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
     * ��ȡvendorLineJoin���Ե�ֵ��
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
     * ����vendorLineJoin���Ե�ֵ��
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
