
package com.netsuite.webservices.platform.core_2018_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_2.AccountSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.AccountingPeriodSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.AccountingTransactionSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.AddressSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.AssemblyItemBomSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.BillingAccountSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.BillingScheduleSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.BinSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.BomRevisionComponentSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.BomRevisionSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.BomSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.BudgetSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.CalendarEventSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.CampaignSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.ChargeSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.ClassificationSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.ConsolidatedExchangeRateSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.ContactCategorySearchBasic;
import com.netsuite.webservices.platform.common_2018_2.ContactRoleSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.ContactSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.CostCategorySearchBasic;
import com.netsuite.webservices.platform.common_2018_2.CouponCodeSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.CurrencyRateSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.CustomListSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.CustomRecordSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.CustomerCategorySearchBasic;
import com.netsuite.webservices.platform.common_2018_2.CustomerMessageSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.CustomerSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.CustomerStatusSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.DepartmentSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.EmployeeSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.EntityGroupSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.EntitySearchBasic;
import com.netsuite.webservices.platform.common_2018_2.ExpenseCategorySearchBasic;
import com.netsuite.webservices.platform.common_2018_2.FairValuePriceSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.FileSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.FolderSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.GiftCertificateSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.GlobalAccountMappingSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.GroupMemberSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.HcmJobSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.InboundShipmentSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.InventoryDetailSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.InventoryNumberBinSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.InventoryNumberSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.IssueSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.ItemAccountMappingSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.ItemBinNumberSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.ItemDemandPlanSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.ItemRevisionSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.ItemSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.ItemSupplyPlanSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.JobSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.JobStatusSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.JobTypeSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.LocationSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.ManufacturingCostTemplateSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.ManufacturingOperationTaskSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.ManufacturingRoutingSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.MessageSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.MseSubsidiarySearchBasic;
import com.netsuite.webservices.platform.common_2018_2.NexusSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.NoteSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.NoteTypeSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.OpportunitySearchBasic;
import com.netsuite.webservices.platform.common_2018_2.OriginatingLeadSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.OtherNameCategorySearchBasic;
import com.netsuite.webservices.platform.common_2018_2.PartnerCategorySearchBasic;
import com.netsuite.webservices.platform.common_2018_2.PartnerSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.PaycheckSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.PaymentMethodSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.PayrollItemSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.PhoneCallSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.PriceLevelSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.PricingGroupSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.PricingSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.ProjectTaskAssignmentSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.ProjectTaskSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.PromotionCodeSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.ResourceAllocationSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.RevRecScheduleSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.RevRecTemplateSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.SalesRoleSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.SalesTaxItemSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.SiteCategorySearchBasic;
import com.netsuite.webservices.platform.common_2018_2.SolutionSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.SubsidiarySearchBasic;
import com.netsuite.webservices.platform.common_2018_2.SupportCaseSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.TaskSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.TaxDetailSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.TaxGroupSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.TaxTypeSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.TermSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.TimeBillSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.TimeEntrySearchBasic;
import com.netsuite.webservices.platform.common_2018_2.TimeSheetSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.TopicSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.TransactionSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.UnitsTypeSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.UsageSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.VendorCategorySearchBasic;
import com.netsuite.webservices.platform.common_2018_2.VendorSearchBasic;
import com.netsuite.webservices.platform.common_2018_2.WinLossReasonSearchBasic;


/**
 * <p>SearchRecordBasic complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SearchRecordBasic">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_2.platform.webservices.netsuite.com}SearchRecord">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchRecordBasic")
@XmlSeeAlso({
    RevRecScheduleSearchBasic.class,
    AccountSearchBasic.class,
    TermSearchBasic.class,
    InventoryNumberBinSearchBasic.class,
    CustomerSearchBasic.class,
    ItemSearchBasic.class,
    ItemDemandPlanSearchBasic.class,
    ProjectTaskAssignmentSearchBasic.class,
    SiteCategorySearchBasic.class,
    ManufacturingRoutingSearchBasic.class,
    AccountingTransactionSearchBasic.class,
    TaskSearchBasic.class,
    NexusSearchBasic.class,
    JobStatusSearchBasic.class,
    UsageSearchBasic.class,
    ContactRoleSearchBasic.class,
    MseSubsidiarySearchBasic.class,
    CustomerStatusSearchBasic.class,
    EntityGroupSearchBasic.class,
    ContactSearchBasic.class,
    BomRevisionSearchBasic.class,
    HcmJobSearchBasic.class,
    CostCategorySearchBasic.class,
    GiftCertificateSearchBasic.class,
    ItemBinNumberSearchBasic.class,
    FairValuePriceSearchBasic.class,
    PaycheckSearchBasic.class,
    CalendarEventSearchBasic.class,
    PaymentMethodSearchBasic.class,
    EntitySearchBasic.class,
    CustomRecordSearchBasic.class,
    TaxTypeSearchBasic.class,
    ManufacturingOperationTaskSearchBasic.class,
    SupportCaseSearchBasic.class,
    ManufacturingCostTemplateSearchBasic.class,
    VendorSearchBasic.class,
    ItemRevisionSearchBasic.class,
    TransactionSearchBasic.class,
    TopicSearchBasic.class,
    PartnerCategorySearchBasic.class,
    BomRevisionComponentSearchBasic.class,
    SubsidiarySearchBasic.class,
    ItemAccountMappingSearchBasic.class,
    DepartmentSearchBasic.class,
    SolutionSearchBasic.class,
    OriginatingLeadSearchBasic.class,
    EmployeeSearchBasic.class,
    OpportunitySearchBasic.class,
    AddressSearchBasic.class,
    PhoneCallSearchBasic.class,
    CustomerMessageSearchBasic.class,
    ResourceAllocationSearchBasic.class,
    PayrollItemSearchBasic.class,
    SalesRoleSearchBasic.class,
    JobSearchBasic.class,
    BinSearchBasic.class,
    PriceLevelSearchBasic.class,
    TimeBillSearchBasic.class,
    RevRecTemplateSearchBasic.class,
    CustomerCategorySearchBasic.class,
    OtherNameCategorySearchBasic.class,
    InventoryDetailSearchBasic.class,
    ConsolidatedExchangeRateSearchBasic.class,
    UnitsTypeSearchBasic.class,
    AssemblyItemBomSearchBasic.class,
    ItemSupplyPlanSearchBasic.class,
    SalesTaxItemSearchBasic.class,
    AccountingPeriodSearchBasic.class,
    InboundShipmentSearchBasic.class,
    TaxGroupSearchBasic.class,
    TimeSheetSearchBasic.class,
    ExpenseCategorySearchBasic.class,
    InventoryNumberSearchBasic.class,
    ContactCategorySearchBasic.class,
    MessageSearchBasic.class,
    IssueSearchBasic.class,
    TaxDetailSearchBasic.class,
    TimeEntrySearchBasic.class,
    PromotionCodeSearchBasic.class,
    PartnerSearchBasic.class,
    VendorCategorySearchBasic.class,
    BillingScheduleSearchBasic.class,
    CustomListSearchBasic.class,
    ClassificationSearchBasic.class,
    LocationSearchBasic.class,
    ProjectTaskSearchBasic.class,
    CouponCodeSearchBasic.class,
    PricingSearchBasic.class,
    FolderSearchBasic.class,
    GroupMemberSearchBasic.class,
    WinLossReasonSearchBasic.class,
    CurrencyRateSearchBasic.class,
    NoteTypeSearchBasic.class,
    FileSearchBasic.class,
    GlobalAccountMappingSearchBasic.class,
    CampaignSearchBasic.class,
    ChargeSearchBasic.class,
    BillingAccountSearchBasic.class,
    BomSearchBasic.class,
    JobTypeSearchBasic.class,
    NoteSearchBasic.class,
    PricingGroupSearchBasic.class,
    BudgetSearchBasic.class
})
public abstract class SearchRecordBasic
    extends SearchRecord
{


}
