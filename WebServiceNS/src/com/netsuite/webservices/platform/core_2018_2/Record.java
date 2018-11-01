
package com.netsuite.webservices.platform.core_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.activities.scheduling_2018_2.CalendarEvent;
import com.netsuite.webservices.activities.scheduling_2018_2.PhoneCall;
import com.netsuite.webservices.activities.scheduling_2018_2.ProjectTask;
import com.netsuite.webservices.activities.scheduling_2018_2.ResourceAllocation;
import com.netsuite.webservices.activities.scheduling_2018_2.Task;
import com.netsuite.webservices.documents.filecabinet_2018_2.File;
import com.netsuite.webservices.documents.filecabinet_2018_2.Folder;
import com.netsuite.webservices.general.communication_2018_2.Message;
import com.netsuite.webservices.general.communication_2018_2.Note;
import com.netsuite.webservices.lists.accounting_2018_2.Account;
import com.netsuite.webservices.lists.accounting_2018_2.AccountingPeriod;
import com.netsuite.webservices.lists.accounting_2018_2.AssemblyItem;
import com.netsuite.webservices.lists.accounting_2018_2.BillingSchedule;
import com.netsuite.webservices.lists.accounting_2018_2.Bin;
import com.netsuite.webservices.lists.accounting_2018_2.Bom;
import com.netsuite.webservices.lists.accounting_2018_2.BomRevision;
import com.netsuite.webservices.lists.accounting_2018_2.BudgetCategory;
import com.netsuite.webservices.lists.accounting_2018_2.Classification;
import com.netsuite.webservices.lists.accounting_2018_2.ConsolidatedExchangeRate;
import com.netsuite.webservices.lists.accounting_2018_2.ContactCategory;
import com.netsuite.webservices.lists.accounting_2018_2.ContactRole;
import com.netsuite.webservices.lists.accounting_2018_2.CostCategory;
import com.netsuite.webservices.lists.accounting_2018_2.Currency;
import com.netsuite.webservices.lists.accounting_2018_2.CurrencyRate;
import com.netsuite.webservices.lists.accounting_2018_2.CustomerCategory;
import com.netsuite.webservices.lists.accounting_2018_2.CustomerMessage;
import com.netsuite.webservices.lists.accounting_2018_2.Department;
import com.netsuite.webservices.lists.accounting_2018_2.DescriptionItem;
import com.netsuite.webservices.lists.accounting_2018_2.DiscountItem;
import com.netsuite.webservices.lists.accounting_2018_2.DownloadItem;
import com.netsuite.webservices.lists.accounting_2018_2.ExpenseCategory;
import com.netsuite.webservices.lists.accounting_2018_2.FairValuePrice;
import com.netsuite.webservices.lists.accounting_2018_2.GeneralToken;
import com.netsuite.webservices.lists.accounting_2018_2.GiftCertificate;
import com.netsuite.webservices.lists.accounting_2018_2.GiftCertificateItem;
import com.netsuite.webservices.lists.accounting_2018_2.GlobalAccountMapping;
import com.netsuite.webservices.lists.accounting_2018_2.InventoryItem;
import com.netsuite.webservices.lists.accounting_2018_2.InventoryNumber;
import com.netsuite.webservices.lists.accounting_2018_2.ItemAccountMapping;
import com.netsuite.webservices.lists.accounting_2018_2.ItemGroup;
import com.netsuite.webservices.lists.accounting_2018_2.ItemRevision;
import com.netsuite.webservices.lists.accounting_2018_2.KitItem;
import com.netsuite.webservices.lists.accounting_2018_2.LeadSource;
import com.netsuite.webservices.lists.accounting_2018_2.Location;
import com.netsuite.webservices.lists.accounting_2018_2.LotNumberedAssemblyItem;
import com.netsuite.webservices.lists.accounting_2018_2.LotNumberedInventoryItem;
import com.netsuite.webservices.lists.accounting_2018_2.MarkupItem;
import com.netsuite.webservices.lists.accounting_2018_2.Nexus;
import com.netsuite.webservices.lists.accounting_2018_2.NonInventoryPurchaseItem;
import com.netsuite.webservices.lists.accounting_2018_2.NonInventoryResaleItem;
import com.netsuite.webservices.lists.accounting_2018_2.NonInventorySaleItem;
import com.netsuite.webservices.lists.accounting_2018_2.NoteType;
import com.netsuite.webservices.lists.accounting_2018_2.OtherChargePurchaseItem;
import com.netsuite.webservices.lists.accounting_2018_2.OtherChargeResaleItem;
import com.netsuite.webservices.lists.accounting_2018_2.OtherChargeSaleItem;
import com.netsuite.webservices.lists.accounting_2018_2.OtherNameCategory;
import com.netsuite.webservices.lists.accounting_2018_2.PartnerCategory;
import com.netsuite.webservices.lists.accounting_2018_2.PaymentCard;
import com.netsuite.webservices.lists.accounting_2018_2.PaymentCardToken;
import com.netsuite.webservices.lists.accounting_2018_2.PaymentItem;
import com.netsuite.webservices.lists.accounting_2018_2.PaymentMethod;
import com.netsuite.webservices.lists.accounting_2018_2.PriceLevel;
import com.netsuite.webservices.lists.accounting_2018_2.PricingGroup;
import com.netsuite.webservices.lists.accounting_2018_2.RevRecSchedule;
import com.netsuite.webservices.lists.accounting_2018_2.RevRecTemplate;
import com.netsuite.webservices.lists.accounting_2018_2.SalesRole;
import com.netsuite.webservices.lists.accounting_2018_2.SalesTaxItem;
import com.netsuite.webservices.lists.accounting_2018_2.SerializedAssemblyItem;
import com.netsuite.webservices.lists.accounting_2018_2.SerializedInventoryItem;
import com.netsuite.webservices.lists.accounting_2018_2.ServicePurchaseItem;
import com.netsuite.webservices.lists.accounting_2018_2.ServiceResaleItem;
import com.netsuite.webservices.lists.accounting_2018_2.ServiceSaleItem;
import com.netsuite.webservices.lists.accounting_2018_2.State;
import com.netsuite.webservices.lists.accounting_2018_2.Subsidiary;
import com.netsuite.webservices.lists.accounting_2018_2.SubtotalItem;
import com.netsuite.webservices.lists.accounting_2018_2.TaxAcct;
import com.netsuite.webservices.lists.accounting_2018_2.TaxGroup;
import com.netsuite.webservices.lists.accounting_2018_2.TaxType;
import com.netsuite.webservices.lists.accounting_2018_2.Term;
import com.netsuite.webservices.lists.accounting_2018_2.UnitsType;
import com.netsuite.webservices.lists.accounting_2018_2.VendorCategory;
import com.netsuite.webservices.lists.accounting_2018_2.WinLossReason;
import com.netsuite.webservices.lists.employees_2018_2.Employee;
import com.netsuite.webservices.lists.employees_2018_2.HcmJob;
import com.netsuite.webservices.lists.employees_2018_2.PayrollItem;
import com.netsuite.webservices.lists.marketing_2018_2.Campaign;
import com.netsuite.webservices.lists.marketing_2018_2.CampaignAudience;
import com.netsuite.webservices.lists.marketing_2018_2.CampaignCategory;
import com.netsuite.webservices.lists.marketing_2018_2.CampaignChannel;
import com.netsuite.webservices.lists.marketing_2018_2.CampaignFamily;
import com.netsuite.webservices.lists.marketing_2018_2.CampaignOffer;
import com.netsuite.webservices.lists.marketing_2018_2.CampaignResponse;
import com.netsuite.webservices.lists.marketing_2018_2.CampaignSearchEngine;
import com.netsuite.webservices.lists.marketing_2018_2.CampaignSubscription;
import com.netsuite.webservices.lists.marketing_2018_2.CampaignVertical;
import com.netsuite.webservices.lists.marketing_2018_2.CouponCode;
import com.netsuite.webservices.lists.marketing_2018_2.PromotionCode;
import com.netsuite.webservices.lists.relationships_2018_2.BillingAccount;
import com.netsuite.webservices.lists.relationships_2018_2.Contact;
import com.netsuite.webservices.lists.relationships_2018_2.Customer;
import com.netsuite.webservices.lists.relationships_2018_2.CustomerStatus;
import com.netsuite.webservices.lists.relationships_2018_2.EntityGroup;
import com.netsuite.webservices.lists.relationships_2018_2.Job;
import com.netsuite.webservices.lists.relationships_2018_2.JobStatus;
import com.netsuite.webservices.lists.relationships_2018_2.JobType;
import com.netsuite.webservices.lists.relationships_2018_2.Partner;
import com.netsuite.webservices.lists.relationships_2018_2.Vendor;
import com.netsuite.webservices.lists.supplychain_2018_2.ManufacturingCostTemplate;
import com.netsuite.webservices.lists.supplychain_2018_2.ManufacturingOperationTask;
import com.netsuite.webservices.lists.supplychain_2018_2.ManufacturingRouting;
import com.netsuite.webservices.lists.support_2018_2.Issue;
import com.netsuite.webservices.lists.support_2018_2.Solution;
import com.netsuite.webservices.lists.support_2018_2.SupportCase;
import com.netsuite.webservices.lists.support_2018_2.SupportCaseIssue;
import com.netsuite.webservices.lists.support_2018_2.SupportCaseOrigin;
import com.netsuite.webservices.lists.support_2018_2.SupportCasePriority;
import com.netsuite.webservices.lists.support_2018_2.SupportCaseStatus;
import com.netsuite.webservices.lists.support_2018_2.SupportCaseType;
import com.netsuite.webservices.lists.support_2018_2.Topic;
import com.netsuite.webservices.lists.website_2018_2.SiteCategory;
import com.netsuite.webservices.platform.common_2018_2.Address;
import com.netsuite.webservices.platform.common_2018_2.InventoryDetail;
import com.netsuite.webservices.platform.common_2018_2.LandedCost;
import com.netsuite.webservices.setup.customization_2018_2.CustomFieldType;
import com.netsuite.webservices.setup.customization_2018_2.CustomList;
import com.netsuite.webservices.setup.customization_2018_2.CustomRecord;
import com.netsuite.webservices.setup.customization_2018_2.CustomRecordType;
import com.netsuite.webservices.setup.customization_2018_2.CustomTransaction;
import com.netsuite.webservices.transactions.bank_2018_2.Check;
import com.netsuite.webservices.transactions.bank_2018_2.Deposit;
import com.netsuite.webservices.transactions.customers_2018_2.CashRefund;
import com.netsuite.webservices.transactions.customers_2018_2.Charge;
import com.netsuite.webservices.transactions.customers_2018_2.CreditMemo;
import com.netsuite.webservices.transactions.customers_2018_2.CustomerDeposit;
import com.netsuite.webservices.transactions.customers_2018_2.CustomerPayment;
import com.netsuite.webservices.transactions.customers_2018_2.CustomerRefund;
import com.netsuite.webservices.transactions.customers_2018_2.DepositApplication;
import com.netsuite.webservices.transactions.customers_2018_2.ReturnAuthorization;
import com.netsuite.webservices.transactions.demandplanning_2018_2.ItemDemandPlan;
import com.netsuite.webservices.transactions.demandplanning_2018_2.ItemSupplyPlan;
import com.netsuite.webservices.transactions.employees_2018_2.ExpenseReport;
import com.netsuite.webservices.transactions.employees_2018_2.Paycheck;
import com.netsuite.webservices.transactions.employees_2018_2.PaycheckJournal;
import com.netsuite.webservices.transactions.employees_2018_2.TimeBill;
import com.netsuite.webservices.transactions.employees_2018_2.TimeEntry;
import com.netsuite.webservices.transactions.employees_2018_2.TimeSheet;
import com.netsuite.webservices.transactions.financial_2018_2.Budget;
import com.netsuite.webservices.transactions.general_2018_2.AdvInterCompanyJournalEntry;
import com.netsuite.webservices.transactions.general_2018_2.InterCompanyJournalEntry;
import com.netsuite.webservices.transactions.general_2018_2.JournalEntry;
import com.netsuite.webservices.transactions.general_2018_2.StatisticalJournalEntry;
import com.netsuite.webservices.transactions.inventory_2018_2.AssemblyBuild;
import com.netsuite.webservices.transactions.inventory_2018_2.AssemblyUnbuild;
import com.netsuite.webservices.transactions.inventory_2018_2.BinTransfer;
import com.netsuite.webservices.transactions.inventory_2018_2.BinWorksheet;
import com.netsuite.webservices.transactions.inventory_2018_2.InterCompanyTransferOrder;
import com.netsuite.webservices.transactions.inventory_2018_2.InventoryAdjustment;
import com.netsuite.webservices.transactions.inventory_2018_2.InventoryCostRevaluation;
import com.netsuite.webservices.transactions.inventory_2018_2.InventoryTransfer;
import com.netsuite.webservices.transactions.inventory_2018_2.TransferOrder;
import com.netsuite.webservices.transactions.inventory_2018_2.WorkOrder;
import com.netsuite.webservices.transactions.inventory_2018_2.WorkOrderClose;
import com.netsuite.webservices.transactions.inventory_2018_2.WorkOrderCompletion;
import com.netsuite.webservices.transactions.inventory_2018_2.WorkOrderIssue;
import com.netsuite.webservices.transactions.purchases_2018_2.InboundShipment;
import com.netsuite.webservices.transactions.purchases_2018_2.ItemReceipt;
import com.netsuite.webservices.transactions.purchases_2018_2.PurchaseOrder;
import com.netsuite.webservices.transactions.purchases_2018_2.PurchaseRequisition;
import com.netsuite.webservices.transactions.purchases_2018_2.VendorBill;
import com.netsuite.webservices.transactions.purchases_2018_2.VendorCredit;
import com.netsuite.webservices.transactions.purchases_2018_2.VendorPayment;
import com.netsuite.webservices.transactions.purchases_2018_2.VendorReturnAuthorization;
import com.netsuite.webservices.transactions.sales_2018_2.CashSale;
import com.netsuite.webservices.transactions.sales_2018_2.Estimate;
import com.netsuite.webservices.transactions.sales_2018_2.Invoice;
import com.netsuite.webservices.transactions.sales_2018_2.ItemFulfillment;
import com.netsuite.webservices.transactions.sales_2018_2.Opportunity;
import com.netsuite.webservices.transactions.sales_2018_2.SalesOrder;
import com.netsuite.webservices.transactions.sales_2018_2.Usage;


/**
 * <p>Record complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Record">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nullFieldList" type="{urn:core_2018_2.platform.webservices.netsuite.com}NullField" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Record", propOrder = {
    "nullFieldList"
})
@XmlSeeAlso({
    LandedCost.class,
    InventoryDetail.class,
    Address.class,
    Task.class,
    ResourceAllocation.class,
    ProjectTask.class,
    PhoneCall.class,
    CalendarEvent.class,
    Message.class,
    Note.class,
    Folder.class,
    File.class,
    Customer.class,
    EntityGroup.class,
    Vendor.class,
    BillingAccount.class,
    Contact.class,
    JobStatus.class,
    JobType.class,
    CustomerStatus.class,
    Job.class,
    Partner.class,
    Issue.class,
    SupportCaseType.class,
    SupportCaseIssue.class,
    SupportCase.class,
    SupportCaseStatus.class,
    SupportCasePriority.class,
    Topic.class,
    Solution.class,
    SupportCaseOrigin.class,
    MarkupItem.class,
    Account.class,
    Bin.class,
    PricingGroup.class,
    PaymentCardToken.class,
    ItemAccountMapping.class,
    InventoryNumber.class,
    PaymentCard.class,
    Department.class,
    ServicePurchaseItem.class,
    GeneralToken.class,
    Currency.class,
    Classification.class,
    State.class,
    FairValuePrice.class,
    ItemGroup.class,
    CustomerMessage.class,
    OtherChargePurchaseItem.class,
    CustomerCategory.class,
    AssemblyItem.class,
    WinLossReason.class,
    ContactCategory.class,
    ContactRole.class,
    OtherChargeResaleItem.class,
    PriceLevel.class,
    CostCategory.class,
    DescriptionItem.class,
    GiftCertificateItem.class,
    BillingSchedule.class,
    GiftCertificate.class,
    BudgetCategory.class,
    BomRevision.class,
    NoteType.class,
    LotNumberedInventoryItem.class,
    CurrencyRate.class,
    UnitsType.class,
    GlobalAccountMapping.class,
    OtherNameCategory.class,
    ServiceResaleItem.class,
    VendorCategory.class,
    PaymentItem.class,
    NonInventorySaleItem.class,
    Subsidiary.class,
    SubtotalItem.class,
    RevRecTemplate.class,
    AccountingPeriod.class,
    DiscountItem.class,
    Term.class,
    DownloadItem.class,
    TaxType.class,
    LeadSource.class,
    TaxGroup.class,
    LotNumberedAssemblyItem.class,
    PaymentMethod.class,
    InventoryItem.class,
    PartnerCategory.class,
    Bom.class,
    Nexus.class,
    SerializedInventoryItem.class,
    TaxAcct.class,
    NonInventoryResaleItem.class,
    ConsolidatedExchangeRate.class,
    SalesTaxItem.class,
    ServiceSaleItem.class,
    KitItem.class,
    ItemRevision.class,
    RevRecSchedule.class,
    SerializedAssemblyItem.class,
    ExpenseCategory.class,
    SalesRole.class,
    NonInventoryPurchaseItem.class,
    OtherChargeSaleItem.class,
    Location.class,
    Estimate.class,
    Invoice.class,
    CashSale.class,
    Opportunity.class,
    Usage.class,
    SalesOrder.class,
    ItemFulfillment.class,
    VendorReturnAuthorization.class,
    VendorBill.class,
    PurchaseOrder.class,
    VendorPayment.class,
    VendorCredit.class,
    ItemReceipt.class,
    PurchaseRequisition.class,
    InboundShipment.class,
    Charge.class,
    CustomerPayment.class,
    ReturnAuthorization.class,
    DepositApplication.class,
    CustomerRefund.class,
    CreditMemo.class,
    CustomerDeposit.class,
    CashRefund.class,
    Budget.class,
    Check.class,
    Deposit.class,
    WorkOrder.class,
    InventoryCostRevaluation.class,
    BinWorksheet.class,
    AssemblyUnbuild.class,
    WorkOrderCompletion.class,
    WorkOrderClose.class,
    TransferOrder.class,
    WorkOrderIssue.class,
    InterCompanyTransferOrder.class,
    BinTransfer.class,
    InventoryTransfer.class,
    InventoryAdjustment.class,
    AssemblyBuild.class,
    StatisticalJournalEntry.class,
    InterCompanyJournalEntry.class,
    AdvInterCompanyJournalEntry.class,
    JournalEntry.class,
    CustomTransaction.class,
    CustomRecordType.class,
    CustomList.class,
    CustomRecord.class,
    CustomFieldType.class,
    Employee.class,
    HcmJob.class,
    PayrollItem.class,
    SiteCategory.class,
    TimeSheet.class,
    TimeBill.class,
    ExpenseReport.class,
    PaycheckJournal.class,
    TimeEntry.class,
    Paycheck.class,
    CampaignSearchEngine.class,
    CampaignResponse.class,
    PromotionCode.class,
    CampaignOffer.class,
    CampaignSubscription.class,
    CampaignCategory.class,
    CampaignAudience.class,
    Campaign.class,
    CampaignFamily.class,
    CampaignVertical.class,
    CouponCode.class,
    CampaignChannel.class,
    ItemDemandPlan.class,
    ItemSupplyPlan.class,
    ManufacturingOperationTask.class,
    ManufacturingCostTemplate.class,
    ManufacturingRouting.class
})
public abstract class Record {

    protected NullField nullFieldList;

    /**
     * 获取nullFieldList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NullField }
     *     
     */
    public NullField getNullFieldList() {
        return nullFieldList;
    }

    /**
     * 设置nullFieldList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NullField }
     *     
     */
    public void setNullFieldList(NullField value) {
        this.nullFieldList = value;
    }

}
