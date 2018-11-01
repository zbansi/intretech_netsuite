
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
 * <p>TransactionSearch complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡbasic���Ե�ֵ��
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
     * ����basic���Ե�ֵ��
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
     * ��ȡaccountJoin���Ե�ֵ��
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
     * ����accountJoin���Ե�ֵ��
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
     * ��ȡaccountingPeriodJoin���Ե�ֵ��
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
     * ����accountingPeriodJoin���Ե�ֵ��
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
     * ��ȡaccountingTransactionJoin���Ե�ֵ��
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
     * ����accountingTransactionJoin���Ե�ֵ��
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
     * ��ȡadvanceToApplyAccountJoin���Ե�ֵ��
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
     * ����advanceToApplyAccountJoin���Ե�ֵ��
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
     * ��ȡappliedToTransactionJoin���Ե�ֵ��
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
     * ����appliedToTransactionJoin���Ե�ֵ��
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
     * ��ȡapplyingTransactionJoin���Ե�ֵ��
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
     * ����applyingTransactionJoin���Ե�ֵ��
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
     * ��ȡbillingAddressJoin���Ե�ֵ��
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
     * ����billingAddressJoin���Ե�ֵ��
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
     * ��ȡbillingTransactionJoin���Ե�ֵ��
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
     * ����billingTransactionJoin���Ե�ֵ��
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
     * ��ȡbinNumberJoin���Ե�ֵ��
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
     * ����binNumberJoin���Ե�ֵ��
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
     * ��ȡbomJoin���Ե�ֵ��
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
     * ����bomJoin���Ե�ֵ��
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
     * ��ȡbomRevisionJoin���Ե�ֵ��
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
     * ����bomRevisionJoin���Ե�ֵ��
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
     * ��ȡcallJoin���Ե�ֵ��
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
     * ����callJoin���Ե�ֵ��
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
     * ��ȡclassJoin���Ե�ֵ��
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
     * ����classJoin���Ե�ֵ��
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
     * ��ȡcogsPurchaseJoin���Ե�ֵ��
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
     * ����cogsPurchaseJoin���Ե�ֵ��
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
     * ��ȡcogsSaleJoin���Ե�ֵ��
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
     * ����cogsSaleJoin���Ե�ֵ��
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
     * ��ȡcontactPrimaryJoin���Ե�ֵ��
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
     * ����contactPrimaryJoin���Ե�ֵ��
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
     * ��ȡcreatedFromJoin���Ե�ֵ��
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
     * ����createdFromJoin���Ե�ֵ��
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
     * ��ȡcustomerJoin���Ե�ֵ��
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
     * ����customerJoin���Ե�ֵ��
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
     * ��ȡcustomerMainJoin���Ե�ֵ��
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
     * ����customerMainJoin���Ե�ֵ��
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
     * ��ȡdepartmentJoin���Ե�ֵ��
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
     * ����departmentJoin���Ե�ֵ��
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
     * ��ȡdepositTransactionJoin���Ե�ֵ��
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
     * ����depositTransactionJoin���Ե�ֵ��
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
     * ��ȡeventJoin���Ե�ֵ��
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
     * ����eventJoin���Ե�ֵ��
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
     * ��ȡexpenseCategoryJoin���Ե�ֵ��
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
     * ����expenseCategoryJoin���Ե�ֵ��
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
     * ��ȡfromLocationJoin���Ե�ֵ��
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
     * ����fromLocationJoin���Ե�ֵ��
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
     * ��ȡfulfillingTransactionJoin���Ե�ֵ��
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
     * ����fulfillingTransactionJoin���Ե�ֵ��
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
     * ��ȡheaderBillingAccountJoin���Ե�ֵ��
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
     * ����headerBillingAccountJoin���Ե�ֵ��
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
     * ��ȡinventoryDetailJoin���Ե�ֵ��
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
     * ����inventoryDetailJoin���Ե�ֵ��
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
     * ��ȡitemJoin���Ե�ֵ��
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
     * ����itemJoin���Ե�ֵ��
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
     * ��ȡitemNumberJoin���Ե�ֵ��
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
     * ����itemNumberJoin���Ե�ֵ��
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
     * ��ȡjobJoin���Ե�ֵ��
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
     * ����jobJoin���Ե�ֵ��
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
     * ��ȡjobMainJoin���Ե�ֵ��
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
     * ����jobMainJoin���Ե�ֵ��
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
     * ��ȡleadSourceJoin���Ե�ֵ��
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
     * ����leadSourceJoin���Ե�ֵ��
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
     * ��ȡlineBillingAccountJoin���Ե�ֵ��
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
     * ����lineBillingAccountJoin���Ե�ֵ��
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
     * ��ȡlineFileJoin���Ե�ֵ��
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
     * ����lineFileJoin���Ե�ֵ��
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
     * ��ȡlocationJoin���Ե�ֵ��
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
     * ����locationJoin���Ե�ֵ��
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
     * ��ȡmanufacturingOperationTaskJoin���Ե�ֵ��
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
     * ����manufacturingOperationTaskJoin���Ե�ֵ��
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
     * ��ȡmessagesJoin���Ե�ֵ��
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
     * ����messagesJoin���Ե�ֵ��
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
     * ��ȡnextApproverJoin���Ե�ֵ��
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
     * ����nextApproverJoin���Ե�ֵ��
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
     * ��ȡpaidTransactionJoin���Ե�ֵ��
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
     * ����paidTransactionJoin���Ե�ֵ��
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
     * ��ȡpartnerJoin���Ե�ֵ��
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
     * ����partnerJoin���Ե�ֵ��
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
     * ��ȡpayingTransactionJoin���Ե�ֵ��
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
     * ����payingTransactionJoin���Ե�ֵ��
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
     * ��ȡpayrollItemJoin���Ե�ֵ��
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
     * ����payrollItemJoin���Ե�ֵ��
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
     * ��ȡprojectTaskJoin���Ե�ֵ��
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
     * ����projectTaskJoin���Ե�ֵ��
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
     * ��ȡpurchaseOrderJoin���Ե�ֵ��
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
     * ����purchaseOrderJoin���Ե�ֵ��
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
     * ��ȡrequestorJoin���Ե�ֵ��
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
     * ����requestorJoin���Ե�ֵ��
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
     * ��ȡrevCommittingTransactionJoin���Ե�ֵ��
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
     * ����revCommittingTransactionJoin���Ե�ֵ��
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
     * ��ȡrevisionJoin���Ե�ֵ��
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
     * ����revisionJoin���Ե�ֵ��
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
     * ��ȡrevRecScheduleJoin���Ե�ֵ��
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
     * ����revRecScheduleJoin���Ե�ֵ��
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
     * ��ȡrgPostingTransactionJoin���Ե�ֵ��
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
     * ����rgPostingTransactionJoin���Ե�ֵ��
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
     * ��ȡsalesOrderJoin���Ե�ֵ��
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
     * ����salesOrderJoin���Ե�ֵ��
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
     * ��ȡsalesRepJoin���Ե�ֵ��
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
     * ����salesRepJoin���Ե�ֵ��
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
     * ��ȡshippingAddressJoin���Ե�ֵ��
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
     * ����shippingAddressJoin���Ե�ֵ��
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
     * ��ȡsubsidiaryJoin���Ե�ֵ��
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
     * ����subsidiaryJoin���Ե�ֵ��
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
     * ��ȡtaskJoin���Ե�ֵ��
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
     * ����taskJoin���Ե�ֵ��
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
     * ��ȡtaxCodeJoin���Ե�ֵ��
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
     * ����taxCodeJoin���Ե�ֵ��
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
     * ��ȡtaxDetailJoin���Ե�ֵ��
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
     * ����taxDetailJoin���Ե�ֵ��
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
     * ��ȡtaxItemJoin���Ե�ֵ��
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
     * ����taxItemJoin���Ե�ֵ��
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
     * ��ȡtimeJoin���Ե�ֵ��
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
     * ����timeJoin���Ե�ֵ��
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
     * ��ȡtoLocationJoin���Ե�ֵ��
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
     * ����toLocationJoin���Ե�ֵ��
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
     * ��ȡvendorJoin���Ե�ֵ��
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
     * ����vendorJoin���Ե�ֵ��
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
     * ��ȡvendorLineJoin���Ե�ֵ��
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
     * ����vendorLineJoin���Ե�ֵ��
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
