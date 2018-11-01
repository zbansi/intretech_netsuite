
package com.netsuite.webservices.platform.core_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.activities.scheduling_2018_2.CalendarEventSearch;
import com.netsuite.webservices.activities.scheduling_2018_2.CalendarEventSearchAdvanced;
import com.netsuite.webservices.activities.scheduling_2018_2.PhoneCallSearch;
import com.netsuite.webservices.activities.scheduling_2018_2.PhoneCallSearchAdvanced;
import com.netsuite.webservices.activities.scheduling_2018_2.ProjectTaskSearch;
import com.netsuite.webservices.activities.scheduling_2018_2.ProjectTaskSearchAdvanced;
import com.netsuite.webservices.activities.scheduling_2018_2.ResourceAllocationSearch;
import com.netsuite.webservices.activities.scheduling_2018_2.ResourceAllocationSearchAdvanced;
import com.netsuite.webservices.activities.scheduling_2018_2.TaskSearch;
import com.netsuite.webservices.activities.scheduling_2018_2.TaskSearchAdvanced;
import com.netsuite.webservices.documents.filecabinet_2018_2.FileSearch;
import com.netsuite.webservices.documents.filecabinet_2018_2.FileSearchAdvanced;
import com.netsuite.webservices.documents.filecabinet_2018_2.FolderSearch;
import com.netsuite.webservices.documents.filecabinet_2018_2.FolderSearchAdvanced;
import com.netsuite.webservices.general.communication_2018_2.MessageSearch;
import com.netsuite.webservices.general.communication_2018_2.MessageSearchAdvanced;
import com.netsuite.webservices.general.communication_2018_2.NoteSearch;
import com.netsuite.webservices.general.communication_2018_2.NoteSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_2.AccountSearch;
import com.netsuite.webservices.lists.accounting_2018_2.AccountSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_2.AccountingPeriodSearch;
import com.netsuite.webservices.lists.accounting_2018_2.AccountingPeriodSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_2.BillingScheduleSearch;
import com.netsuite.webservices.lists.accounting_2018_2.BillingScheduleSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_2.BinSearch;
import com.netsuite.webservices.lists.accounting_2018_2.BinSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_2.BomRevisionSearch;
import com.netsuite.webservices.lists.accounting_2018_2.BomRevisionSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_2.BomSearch;
import com.netsuite.webservices.lists.accounting_2018_2.BomSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_2.ClassificationSearch;
import com.netsuite.webservices.lists.accounting_2018_2.ClassificationSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_2.ConsolidatedExchangeRateSearch;
import com.netsuite.webservices.lists.accounting_2018_2.ConsolidatedExchangeRateSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_2.ContactCategorySearch;
import com.netsuite.webservices.lists.accounting_2018_2.ContactCategorySearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_2.ContactRoleSearch;
import com.netsuite.webservices.lists.accounting_2018_2.ContactRoleSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_2.CostCategorySearch;
import com.netsuite.webservices.lists.accounting_2018_2.CostCategorySearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_2.CurrencyRateSearch;
import com.netsuite.webservices.lists.accounting_2018_2.CurrencyRateSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_2.CustomerCategorySearch;
import com.netsuite.webservices.lists.accounting_2018_2.CustomerCategorySearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_2.CustomerMessageSearch;
import com.netsuite.webservices.lists.accounting_2018_2.CustomerMessageSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_2.DepartmentSearch;
import com.netsuite.webservices.lists.accounting_2018_2.DepartmentSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_2.ExpenseCategorySearch;
import com.netsuite.webservices.lists.accounting_2018_2.ExpenseCategorySearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_2.FairValuePriceSearch;
import com.netsuite.webservices.lists.accounting_2018_2.FairValuePriceSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_2.GiftCertificateSearch;
import com.netsuite.webservices.lists.accounting_2018_2.GiftCertificateSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_2.GlobalAccountMappingSearch;
import com.netsuite.webservices.lists.accounting_2018_2.GlobalAccountMappingSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_2.InventoryNumberSearch;
import com.netsuite.webservices.lists.accounting_2018_2.InventoryNumberSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_2.ItemAccountMappingSearch;
import com.netsuite.webservices.lists.accounting_2018_2.ItemAccountMappingSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_2.ItemRevisionSearch;
import com.netsuite.webservices.lists.accounting_2018_2.ItemRevisionSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_2.ItemSearch;
import com.netsuite.webservices.lists.accounting_2018_2.ItemSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_2.LocationSearch;
import com.netsuite.webservices.lists.accounting_2018_2.LocationSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_2.NexusSearch;
import com.netsuite.webservices.lists.accounting_2018_2.NexusSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_2.NoteTypeSearch;
import com.netsuite.webservices.lists.accounting_2018_2.NoteTypeSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_2.OtherNameCategorySearch;
import com.netsuite.webservices.lists.accounting_2018_2.OtherNameCategorySearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_2.PartnerCategorySearch;
import com.netsuite.webservices.lists.accounting_2018_2.PartnerCategorySearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_2.PaymentMethodSearch;
import com.netsuite.webservices.lists.accounting_2018_2.PaymentMethodSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_2.PriceLevelSearch;
import com.netsuite.webservices.lists.accounting_2018_2.PriceLevelSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_2.PricingGroupSearch;
import com.netsuite.webservices.lists.accounting_2018_2.PricingGroupSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_2.RevRecScheduleSearch;
import com.netsuite.webservices.lists.accounting_2018_2.RevRecScheduleSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_2.RevRecTemplateSearch;
import com.netsuite.webservices.lists.accounting_2018_2.RevRecTemplateSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_2.SalesRoleSearch;
import com.netsuite.webservices.lists.accounting_2018_2.SalesRoleSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_2.SalesTaxItemSearch;
import com.netsuite.webservices.lists.accounting_2018_2.SalesTaxItemSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_2.SubsidiarySearch;
import com.netsuite.webservices.lists.accounting_2018_2.SubsidiarySearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_2.TaxGroupSearch;
import com.netsuite.webservices.lists.accounting_2018_2.TaxGroupSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_2.TaxTypeSearch;
import com.netsuite.webservices.lists.accounting_2018_2.TaxTypeSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_2.TermSearch;
import com.netsuite.webservices.lists.accounting_2018_2.TermSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_2.UnitsTypeSearch;
import com.netsuite.webservices.lists.accounting_2018_2.UnitsTypeSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_2.VendorCategorySearch;
import com.netsuite.webservices.lists.accounting_2018_2.VendorCategorySearchAdvanced;
import com.netsuite.webservices.lists.accounting_2018_2.WinLossReasonSearch;
import com.netsuite.webservices.lists.accounting_2018_2.WinLossReasonSearchAdvanced;
import com.netsuite.webservices.lists.employees_2018_2.EmployeeSearch;
import com.netsuite.webservices.lists.employees_2018_2.EmployeeSearchAdvanced;
import com.netsuite.webservices.lists.employees_2018_2.HcmJobSearch;
import com.netsuite.webservices.lists.employees_2018_2.HcmJobSearchAdvanced;
import com.netsuite.webservices.lists.employees_2018_2.PayrollItemSearch;
import com.netsuite.webservices.lists.employees_2018_2.PayrollItemSearchAdvanced;
import com.netsuite.webservices.lists.marketing_2018_2.CampaignSearch;
import com.netsuite.webservices.lists.marketing_2018_2.CampaignSearchAdvanced;
import com.netsuite.webservices.lists.marketing_2018_2.CouponCodeSearch;
import com.netsuite.webservices.lists.marketing_2018_2.CouponCodeSearchAdvanced;
import com.netsuite.webservices.lists.marketing_2018_2.PromotionCodeSearch;
import com.netsuite.webservices.lists.marketing_2018_2.PromotionCodeSearchAdvanced;
import com.netsuite.webservices.lists.relationships_2018_2.BillingAccountSearch;
import com.netsuite.webservices.lists.relationships_2018_2.BillingAccountSearchAdvanced;
import com.netsuite.webservices.lists.relationships_2018_2.ContactSearch;
import com.netsuite.webservices.lists.relationships_2018_2.ContactSearchAdvanced;
import com.netsuite.webservices.lists.relationships_2018_2.CustomerSearch;
import com.netsuite.webservices.lists.relationships_2018_2.CustomerSearchAdvanced;
import com.netsuite.webservices.lists.relationships_2018_2.CustomerStatusSearch;
import com.netsuite.webservices.lists.relationships_2018_2.CustomerStatusSearchAdvanced;
import com.netsuite.webservices.lists.relationships_2018_2.EntityGroupSearch;
import com.netsuite.webservices.lists.relationships_2018_2.EntityGroupSearchAdvanced;
import com.netsuite.webservices.lists.relationships_2018_2.JobSearch;
import com.netsuite.webservices.lists.relationships_2018_2.JobSearchAdvanced;
import com.netsuite.webservices.lists.relationships_2018_2.JobStatusSearch;
import com.netsuite.webservices.lists.relationships_2018_2.JobStatusSearchAdvanced;
import com.netsuite.webservices.lists.relationships_2018_2.JobTypeSearch;
import com.netsuite.webservices.lists.relationships_2018_2.JobTypeSearchAdvanced;
import com.netsuite.webservices.lists.relationships_2018_2.OriginatingLeadSearch;
import com.netsuite.webservices.lists.relationships_2018_2.PartnerSearch;
import com.netsuite.webservices.lists.relationships_2018_2.PartnerSearchAdvanced;
import com.netsuite.webservices.lists.relationships_2018_2.VendorSearch;
import com.netsuite.webservices.lists.relationships_2018_2.VendorSearchAdvanced;
import com.netsuite.webservices.lists.supplychain_2018_2.ManufacturingCostTemplateSearch;
import com.netsuite.webservices.lists.supplychain_2018_2.ManufacturingCostTemplateSearchAdvanced;
import com.netsuite.webservices.lists.supplychain_2018_2.ManufacturingOperationTaskSearch;
import com.netsuite.webservices.lists.supplychain_2018_2.ManufacturingOperationTaskSearchAdvanced;
import com.netsuite.webservices.lists.supplychain_2018_2.ManufacturingRoutingSearch;
import com.netsuite.webservices.lists.supplychain_2018_2.ManufacturingRoutingSearchAdvanced;
import com.netsuite.webservices.lists.support_2018_2.IssueSearch;
import com.netsuite.webservices.lists.support_2018_2.IssueSearchAdvanced;
import com.netsuite.webservices.lists.support_2018_2.SolutionSearch;
import com.netsuite.webservices.lists.support_2018_2.SolutionSearchAdvanced;
import com.netsuite.webservices.lists.support_2018_2.SupportCaseSearch;
import com.netsuite.webservices.lists.support_2018_2.SupportCaseSearchAdvanced;
import com.netsuite.webservices.lists.support_2018_2.TopicSearch;
import com.netsuite.webservices.lists.support_2018_2.TopicSearchAdvanced;
import com.netsuite.webservices.lists.website_2018_2.SiteCategorySearch;
import com.netsuite.webservices.lists.website_2018_2.SiteCategorySearchAdvanced;
import com.netsuite.webservices.setup.customization_2018_2.CustomListSearch;
import com.netsuite.webservices.setup.customization_2018_2.CustomListSearchAdvanced;
import com.netsuite.webservices.setup.customization_2018_2.CustomRecordSearch;
import com.netsuite.webservices.setup.customization_2018_2.CustomRecordSearchAdvanced;
import com.netsuite.webservices.transactions.customers_2018_2.ChargeSearch;
import com.netsuite.webservices.transactions.customers_2018_2.ChargeSearchAdvanced;
import com.netsuite.webservices.transactions.demandplanning_2018_2.ItemDemandPlanSearch;
import com.netsuite.webservices.transactions.demandplanning_2018_2.ItemDemandPlanSearchAdvanced;
import com.netsuite.webservices.transactions.demandplanning_2018_2.ItemSupplyPlanSearch;
import com.netsuite.webservices.transactions.demandplanning_2018_2.ItemSupplyPlanSearchAdvanced;
import com.netsuite.webservices.transactions.employees_2018_2.PaycheckSearch;
import com.netsuite.webservices.transactions.employees_2018_2.PaycheckSearchAdvanced;
import com.netsuite.webservices.transactions.employees_2018_2.TimeBillSearch;
import com.netsuite.webservices.transactions.employees_2018_2.TimeBillSearchAdvanced;
import com.netsuite.webservices.transactions.employees_2018_2.TimeEntrySearch;
import com.netsuite.webservices.transactions.employees_2018_2.TimeEntrySearchAdvanced;
import com.netsuite.webservices.transactions.employees_2018_2.TimeSheetSearch;
import com.netsuite.webservices.transactions.employees_2018_2.TimeSheetSearchAdvanced;
import com.netsuite.webservices.transactions.financial_2018_2.BudgetSearch;
import com.netsuite.webservices.transactions.financial_2018_2.BudgetSearchAdvanced;
import com.netsuite.webservices.transactions.purchases_2018_2.InboundShipmentSearch;
import com.netsuite.webservices.transactions.purchases_2018_2.InboundShipmentSearchAdvanced;
import com.netsuite.webservices.transactions.sales_2018_2.AccountingTransactionSearch;
import com.netsuite.webservices.transactions.sales_2018_2.AccountingTransactionSearchAdvanced;
import com.netsuite.webservices.transactions.sales_2018_2.OpportunitySearch;
import com.netsuite.webservices.transactions.sales_2018_2.OpportunitySearchAdvanced;
import com.netsuite.webservices.transactions.sales_2018_2.TransactionSearch;
import com.netsuite.webservices.transactions.sales_2018_2.TransactionSearchAdvanced;
import com.netsuite.webservices.transactions.sales_2018_2.UsageSearch;
import com.netsuite.webservices.transactions.sales_2018_2.UsageSearchAdvanced;


/**
 * <p>SearchRecord complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SearchRecord">
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
@XmlType(name = "SearchRecord")
@XmlSeeAlso({
    SearchRecordBasic.class,
    CalendarEventSearch.class,
    PhoneCallSearch.class,
    ProjectTaskSearch.class,
    TaskSearch.class,
    ResourceAllocationSearch.class,
    TaskSearchAdvanced.class,
    CalendarEventSearchAdvanced.class,
    ResourceAllocationSearchAdvanced.class,
    PhoneCallSearchAdvanced.class,
    ProjectTaskSearchAdvanced.class,
    MessageSearch.class,
    NoteSearch.class,
    MessageSearchAdvanced.class,
    NoteSearchAdvanced.class,
    FolderSearch.class,
    FileSearch.class,
    FileSearchAdvanced.class,
    FolderSearchAdvanced.class,
    JobTypeSearch.class,
    JobStatusSearch.class,
    CustomerStatusSearch.class,
    BillingAccountSearch.class,
    CustomerSearch.class,
    PartnerSearch.class,
    OriginatingLeadSearch.class,
    EntityGroupSearch.class,
    ContactSearch.class,
    VendorSearch.class,
    JobSearch.class,
    EntityGroupSearchAdvanced.class,
    CustomerSearchAdvanced.class,
    CustomerStatusSearchAdvanced.class,
    ContactSearchAdvanced.class,
    JobSearchAdvanced.class,
    JobStatusSearchAdvanced.class,
    JobTypeSearchAdvanced.class,
    BillingAccountSearchAdvanced.class,
    VendorSearchAdvanced.class,
    PartnerSearchAdvanced.class,
    IssueSearch.class,
    SupportCaseSearch.class,
    SolutionSearch.class,
    TopicSearch.class,
    TopicSearchAdvanced.class,
    SupportCaseSearchAdvanced.class,
    IssueSearchAdvanced.class,
    SolutionSearchAdvanced.class,
    RevRecScheduleSearch.class,
    PaymentMethodSearch.class,
    DepartmentSearch.class,
    PriceLevelSearch.class,
    VendorCategorySearch.class,
    BinSearch.class,
    BillingScheduleSearch.class,
    WinLossReasonSearch.class,
    ItemRevisionSearch.class,
    ConsolidatedExchangeRateSearch.class,
    TaxGroupSearch.class,
    OtherNameCategorySearch.class,
    CostCategorySearch.class,
    AccountSearch.class,
    ContactCategorySearch.class,
    AccountingPeriodSearch.class,
    ClassificationSearch.class,
    NexusSearch.class,
    TaxTypeSearch.class,
    CurrencyRateSearch.class,
    CustomerMessageSearch.class,
    ItemAccountMappingSearch.class,
    RevRecTemplateSearch.class,
    SalesTaxItemSearch.class,
    CustomerCategorySearch.class,
    SubsidiarySearch.class,
    LocationSearch.class,
    PartnerCategorySearch.class,
    ExpenseCategorySearch.class,
    BomRevisionSearch.class,
    GlobalAccountMappingSearch.class,
    ItemSearch.class,
    BomSearch.class,
    TermSearch.class,
    GiftCertificateSearch.class,
    PricingGroupSearch.class,
    FairValuePriceSearch.class,
    UnitsTypeSearch.class,
    ContactRoleSearch.class,
    NoteTypeSearch.class,
    InventoryNumberSearch.class,
    SalesRoleSearch.class,
    FairValuePriceSearchAdvanced.class,
    RevRecScheduleSearchAdvanced.class,
    BillingScheduleSearchAdvanced.class,
    ItemAccountMappingSearchAdvanced.class,
    PriceLevelSearchAdvanced.class,
    OtherNameCategorySearchAdvanced.class,
    BinSearchAdvanced.class,
    LocationSearchAdvanced.class,
    CustomerCategorySearchAdvanced.class,
    UnitsTypeSearchAdvanced.class,
    ItemSearchAdvanced.class,
    SubsidiarySearchAdvanced.class,
    TaxGroupSearchAdvanced.class,
    VendorCategorySearchAdvanced.class,
    SalesTaxItemSearchAdvanced.class,
    PricingGroupSearchAdvanced.class,
    CostCategorySearchAdvanced.class,
    WinLossReasonSearchAdvanced.class,
    ExpenseCategorySearchAdvanced.class,
    InventoryNumberSearchAdvanced.class,
    BomRevisionSearchAdvanced.class,
    SalesRoleSearchAdvanced.class,
    AccountSearchAdvanced.class,
    DepartmentSearchAdvanced.class,
    ContactCategorySearchAdvanced.class,
    PaymentMethodSearchAdvanced.class,
    ContactRoleSearchAdvanced.class,
    ItemRevisionSearchAdvanced.class,
    TaxTypeSearchAdvanced.class,
    AccountingPeriodSearchAdvanced.class,
    NoteTypeSearchAdvanced.class,
    ConsolidatedExchangeRateSearchAdvanced.class,
    TermSearchAdvanced.class,
    GlobalAccountMappingSearchAdvanced.class,
    BomSearchAdvanced.class,
    CustomerMessageSearchAdvanced.class,
    NexusSearchAdvanced.class,
    RevRecTemplateSearchAdvanced.class,
    GiftCertificateSearchAdvanced.class,
    CurrencyRateSearchAdvanced.class,
    ClassificationSearchAdvanced.class,
    PartnerCategorySearchAdvanced.class,
    OpportunitySearch.class,
    TransactionSearch.class,
    UsageSearch.class,
    AccountingTransactionSearch.class,
    TransactionSearchAdvanced.class,
    AccountingTransactionSearchAdvanced.class,
    OpportunitySearchAdvanced.class,
    UsageSearchAdvanced.class,
    InboundShipmentSearch.class,
    InboundShipmentSearchAdvanced.class,
    ChargeSearch.class,
    ChargeSearchAdvanced.class,
    BudgetSearch.class,
    BudgetSearchAdvanced.class,
    CustomListSearch.class,
    CustomRecordSearch.class,
    CustomListSearchAdvanced.class,
    CustomRecordSearchAdvanced.class,
    PayrollItemSearch.class,
    HcmJobSearch.class,
    EmployeeSearch.class,
    HcmJobSearchAdvanced.class,
    EmployeeSearchAdvanced.class,
    PayrollItemSearchAdvanced.class,
    SiteCategorySearch.class,
    SiteCategorySearchAdvanced.class,
    TimeSheetSearch.class,
    PaycheckSearch.class,
    TimeBillSearch.class,
    TimeEntrySearch.class,
    TimeEntrySearchAdvanced.class,
    TimeBillSearchAdvanced.class,
    TimeSheetSearchAdvanced.class,
    PaycheckSearchAdvanced.class,
    PromotionCodeSearch.class,
    CouponCodeSearch.class,
    CampaignSearch.class,
    PromotionCodeSearchAdvanced.class,
    CouponCodeSearchAdvanced.class,
    CampaignSearchAdvanced.class,
    ItemDemandPlanSearch.class,
    ItemSupplyPlanSearch.class,
    ItemSupplyPlanSearchAdvanced.class,
    ItemDemandPlanSearchAdvanced.class,
    ManufacturingOperationTaskSearch.class,
    ManufacturingRoutingSearch.class,
    ManufacturingCostTemplateSearch.class,
    ManufacturingRoutingSearchAdvanced.class,
    ManufacturingCostTemplateSearchAdvanced.class,
    ManufacturingOperationTaskSearchAdvanced.class
})
public abstract class SearchRecord {


}
