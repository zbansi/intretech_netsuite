
package com.netsuite.webservices.platform.core_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.activities.scheduling_2018_2.CalendarEventSearchRow;
import com.netsuite.webservices.activities.scheduling_2018_2.PhoneCallSearchRow;
import com.netsuite.webservices.activities.scheduling_2018_2.ProjectTaskSearchRow;
import com.netsuite.webservices.activities.scheduling_2018_2.ResourceAllocationSearchRow;
import com.netsuite.webservices.activities.scheduling_2018_2.TaskSearchRow;
import com.netsuite.webservices.documents.filecabinet_2018_2.FileSearchRow;
import com.netsuite.webservices.documents.filecabinet_2018_2.FolderSearchRow;
import com.netsuite.webservices.general.communication_2018_2.MessageSearchRow;
import com.netsuite.webservices.general.communication_2018_2.NoteSearchRow;
import com.netsuite.webservices.lists.accounting_2018_2.AccountSearchRow;
import com.netsuite.webservices.lists.accounting_2018_2.AccountingPeriodSearchRow;
import com.netsuite.webservices.lists.accounting_2018_2.BillingScheduleSearchRow;
import com.netsuite.webservices.lists.accounting_2018_2.BinSearchRow;
import com.netsuite.webservices.lists.accounting_2018_2.BomRevisionSearchRow;
import com.netsuite.webservices.lists.accounting_2018_2.BomSearchRow;
import com.netsuite.webservices.lists.accounting_2018_2.ClassificationSearchRow;
import com.netsuite.webservices.lists.accounting_2018_2.ConsolidatedExchangeRateSearchRow;
import com.netsuite.webservices.lists.accounting_2018_2.ContactCategorySearchRow;
import com.netsuite.webservices.lists.accounting_2018_2.ContactRoleSearchRow;
import com.netsuite.webservices.lists.accounting_2018_2.CostCategorySearchRow;
import com.netsuite.webservices.lists.accounting_2018_2.CurrencyRateSearchRow;
import com.netsuite.webservices.lists.accounting_2018_2.CustomerCategorySearchRow;
import com.netsuite.webservices.lists.accounting_2018_2.CustomerMessageSearchRow;
import com.netsuite.webservices.lists.accounting_2018_2.DepartmentSearchRow;
import com.netsuite.webservices.lists.accounting_2018_2.ExpenseCategorySearchRow;
import com.netsuite.webservices.lists.accounting_2018_2.FairValuePriceSearchRow;
import com.netsuite.webservices.lists.accounting_2018_2.GiftCertificateSearchRow;
import com.netsuite.webservices.lists.accounting_2018_2.GlobalAccountMappingSearchRow;
import com.netsuite.webservices.lists.accounting_2018_2.InventoryNumberSearchRow;
import com.netsuite.webservices.lists.accounting_2018_2.ItemAccountMappingSearchRow;
import com.netsuite.webservices.lists.accounting_2018_2.ItemRevisionSearchRow;
import com.netsuite.webservices.lists.accounting_2018_2.ItemSearchRow;
import com.netsuite.webservices.lists.accounting_2018_2.LocationSearchRow;
import com.netsuite.webservices.lists.accounting_2018_2.NexusSearchRow;
import com.netsuite.webservices.lists.accounting_2018_2.NoteTypeSearchRow;
import com.netsuite.webservices.lists.accounting_2018_2.OtherNameCategorySearchRow;
import com.netsuite.webservices.lists.accounting_2018_2.PartnerCategorySearchRow;
import com.netsuite.webservices.lists.accounting_2018_2.PaymentMethodSearchRow;
import com.netsuite.webservices.lists.accounting_2018_2.PriceLevelSearchRow;
import com.netsuite.webservices.lists.accounting_2018_2.PricingGroupSearchRow;
import com.netsuite.webservices.lists.accounting_2018_2.RevRecScheduleSearchRow;
import com.netsuite.webservices.lists.accounting_2018_2.RevRecTemplateSearchRow;
import com.netsuite.webservices.lists.accounting_2018_2.SalesRoleSearchRow;
import com.netsuite.webservices.lists.accounting_2018_2.SalesTaxItemSearchRow;
import com.netsuite.webservices.lists.accounting_2018_2.SubsidiarySearchRow;
import com.netsuite.webservices.lists.accounting_2018_2.TaxGroupSearchRow;
import com.netsuite.webservices.lists.accounting_2018_2.TaxTypeSearchRow;
import com.netsuite.webservices.lists.accounting_2018_2.TermSearchRow;
import com.netsuite.webservices.lists.accounting_2018_2.UnitsTypeSearchRow;
import com.netsuite.webservices.lists.accounting_2018_2.VendorCategorySearchRow;
import com.netsuite.webservices.lists.accounting_2018_2.WinLossReasonSearchRow;
import com.netsuite.webservices.lists.employees_2018_2.EmployeeSearchRow;
import com.netsuite.webservices.lists.employees_2018_2.HcmJobSearchRow;
import com.netsuite.webservices.lists.employees_2018_2.PayrollItemSearchRow;
import com.netsuite.webservices.lists.marketing_2018_2.CampaignSearchRow;
import com.netsuite.webservices.lists.marketing_2018_2.CouponCodeSearchRow;
import com.netsuite.webservices.lists.marketing_2018_2.PromotionCodeSearchRow;
import com.netsuite.webservices.lists.relationships_2018_2.BillingAccountSearchRow;
import com.netsuite.webservices.lists.relationships_2018_2.ContactSearchRow;
import com.netsuite.webservices.lists.relationships_2018_2.CustomerSearchRow;
import com.netsuite.webservices.lists.relationships_2018_2.CustomerStatusSearchRow;
import com.netsuite.webservices.lists.relationships_2018_2.EntityGroupSearchRow;
import com.netsuite.webservices.lists.relationships_2018_2.JobSearchRow;
import com.netsuite.webservices.lists.relationships_2018_2.JobStatusSearchRow;
import com.netsuite.webservices.lists.relationships_2018_2.JobTypeSearchRow;
import com.netsuite.webservices.lists.relationships_2018_2.OriginatingLeadSearchRow;
import com.netsuite.webservices.lists.relationships_2018_2.PartnerSearchRow;
import com.netsuite.webservices.lists.relationships_2018_2.VendorSearchRow;
import com.netsuite.webservices.lists.supplychain_2018_2.ManufacturingCostTemplateSearchRow;
import com.netsuite.webservices.lists.supplychain_2018_2.ManufacturingOperationTaskSearchRow;
import com.netsuite.webservices.lists.supplychain_2018_2.ManufacturingRoutingSearchRow;
import com.netsuite.webservices.lists.support_2018_2.IssueSearchRow;
import com.netsuite.webservices.lists.support_2018_2.SolutionSearchRow;
import com.netsuite.webservices.lists.support_2018_2.SupportCaseSearchRow;
import com.netsuite.webservices.lists.support_2018_2.TopicSearchRow;
import com.netsuite.webservices.lists.website_2018_2.SiteCategorySearchRow;
import com.netsuite.webservices.setup.customization_2018_2.CustomListSearchRow;
import com.netsuite.webservices.setup.customization_2018_2.CustomRecordSearchRow;
import com.netsuite.webservices.transactions.customers_2018_2.ChargeSearchRow;
import com.netsuite.webservices.transactions.demandplanning_2018_2.ItemDemandPlanSearchRow;
import com.netsuite.webservices.transactions.demandplanning_2018_2.ItemSupplyPlanSearchRow;
import com.netsuite.webservices.transactions.employees_2018_2.PaycheckSearchRow;
import com.netsuite.webservices.transactions.employees_2018_2.TimeBillSearchRow;
import com.netsuite.webservices.transactions.employees_2018_2.TimeEntrySearchRow;
import com.netsuite.webservices.transactions.employees_2018_2.TimeSheetSearchRow;
import com.netsuite.webservices.transactions.financial_2018_2.BudgetSearchRow;
import com.netsuite.webservices.transactions.purchases_2018_2.InboundShipmentSearchRow;
import com.netsuite.webservices.transactions.sales_2018_2.AccountingTransactionSearchRow;
import com.netsuite.webservices.transactions.sales_2018_2.OpportunitySearchRow;
import com.netsuite.webservices.transactions.sales_2018_2.TransactionSearchRow;
import com.netsuite.webservices.transactions.sales_2018_2.UsageSearchRow;


/**
 * <p>SearchRow complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SearchRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchRow")
@XmlSeeAlso({
    SearchRowBasic.class,
    TaskSearchRow.class,
    PhoneCallSearchRow.class,
    ProjectTaskSearchRow.class,
    ResourceAllocationSearchRow.class,
    CalendarEventSearchRow.class,
    MessageSearchRow.class,
    NoteSearchRow.class,
    FileSearchRow.class,
    FolderSearchRow.class,
    ContactSearchRow.class,
    JobStatusSearchRow.class,
    BillingAccountSearchRow.class,
    OriginatingLeadSearchRow.class,
    CustomerSearchRow.class,
    CustomerStatusSearchRow.class,
    VendorSearchRow.class,
    PartnerSearchRow.class,
    EntityGroupSearchRow.class,
    JobSearchRow.class,
    JobTypeSearchRow.class,
    IssueSearchRow.class,
    SolutionSearchRow.class,
    TopicSearchRow.class,
    SupportCaseSearchRow.class,
    SalesTaxItemSearchRow.class,
    BomRevisionSearchRow.class,
    OtherNameCategorySearchRow.class,
    LocationSearchRow.class,
    CustomerCategorySearchRow.class,
    InventoryNumberSearchRow.class,
    NoteTypeSearchRow.class,
    TaxGroupSearchRow.class,
    ContactRoleSearchRow.class,
    BillingScheduleSearchRow.class,
    ItemAccountMappingSearchRow.class,
    NexusSearchRow.class,
    ClassificationSearchRow.class,
    SubsidiarySearchRow.class,
    RevRecScheduleSearchRow.class,
    GiftCertificateSearchRow.class,
    DepartmentSearchRow.class,
    VendorCategorySearchRow.class,
    ItemRevisionSearchRow.class,
    RevRecTemplateSearchRow.class,
    ExpenseCategorySearchRow.class,
    CurrencyRateSearchRow.class,
    ContactCategorySearchRow.class,
    BomSearchRow.class,
    AccountingPeriodSearchRow.class,
    AccountSearchRow.class,
    TermSearchRow.class,
    TaxTypeSearchRow.class,
    UnitsTypeSearchRow.class,
    PricingGroupSearchRow.class,
    FairValuePriceSearchRow.class,
    ConsolidatedExchangeRateSearchRow.class,
    BinSearchRow.class,
    CostCategorySearchRow.class,
    PriceLevelSearchRow.class,
    GlobalAccountMappingSearchRow.class,
    PartnerCategorySearchRow.class,
    PaymentMethodSearchRow.class,
    ItemSearchRow.class,
    CustomerMessageSearchRow.class,
    WinLossReasonSearchRow.class,
    SalesRoleSearchRow.class,
    UsageSearchRow.class,
    OpportunitySearchRow.class,
    AccountingTransactionSearchRow.class,
    TransactionSearchRow.class,
    InboundShipmentSearchRow.class,
    ChargeSearchRow.class,
    BudgetSearchRow.class,
    CustomRecordSearchRow.class,
    CustomListSearchRow.class,
    PayrollItemSearchRow.class,
    HcmJobSearchRow.class,
    EmployeeSearchRow.class,
    SiteCategorySearchRow.class,
    TimeSheetSearchRow.class,
    TimeEntrySearchRow.class,
    PaycheckSearchRow.class,
    TimeBillSearchRow.class,
    PromotionCodeSearchRow.class,
    CampaignSearchRow.class,
    CouponCodeSearchRow.class,
    ItemDemandPlanSearchRow.class,
    ItemSupplyPlanSearchRow.class,
    ManufacturingCostTemplateSearchRow.class,
    ManufacturingRoutingSearchRow.class,
    ManufacturingOperationTaskSearchRow.class
})
public abstract class SearchRow {


}
