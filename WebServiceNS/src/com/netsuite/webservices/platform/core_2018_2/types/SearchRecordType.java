
package com.netsuite.webservices.platform.core_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SearchRecordType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="SearchRecordType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="account"/>
 *     &lt;enumeration value="accountingPeriod"/>
 *     &lt;enumeration value="accountingTransaction"/>
 *     &lt;enumeration value="billingAccount"/>
 *     &lt;enumeration value="billingSchedule"/>
 *     &lt;enumeration value="bin"/>
 *     &lt;enumeration value="bom"/>
 *     &lt;enumeration value="bomRevision"/>
 *     &lt;enumeration value="budget"/>
 *     &lt;enumeration value="calendarEvent"/>
 *     &lt;enumeration value="campaign"/>
 *     &lt;enumeration value="charge"/>
 *     &lt;enumeration value="classification"/>
 *     &lt;enumeration value="contact"/>
 *     &lt;enumeration value="contactCategory"/>
 *     &lt;enumeration value="contactRole"/>
 *     &lt;enumeration value="costCategory"/>
 *     &lt;enumeration value="consolidatedExchangeRate"/>
 *     &lt;enumeration value="couponCode"/>
 *     &lt;enumeration value="currencyRate"/>
 *     &lt;enumeration value="customer"/>
 *     &lt;enumeration value="customerCategory"/>
 *     &lt;enumeration value="customerMessage"/>
 *     &lt;enumeration value="customerStatus"/>
 *     &lt;enumeration value="customList"/>
 *     &lt;enumeration value="customRecord"/>
 *     &lt;enumeration value="department"/>
 *     &lt;enumeration value="employee"/>
 *     &lt;enumeration value="entityGroup"/>
 *     &lt;enumeration value="expenseCategory"/>
 *     &lt;enumeration value="fairValuePrice"/>
 *     &lt;enumeration value="file"/>
 *     &lt;enumeration value="folder"/>
 *     &lt;enumeration value="giftCertificate"/>
 *     &lt;enumeration value="globalAccountMapping"/>
 *     &lt;enumeration value="hcmJob"/>
 *     &lt;enumeration value="inboundShipment"/>
 *     &lt;enumeration value="inventoryNumber"/>
 *     &lt;enumeration value="item"/>
 *     &lt;enumeration value="itemAccountMapping"/>
 *     &lt;enumeration value="itemDemandPlan"/>
 *     &lt;enumeration value="itemRevision"/>
 *     &lt;enumeration value="itemSupplyPlan"/>
 *     &lt;enumeration value="issue"/>
 *     &lt;enumeration value="job"/>
 *     &lt;enumeration value="jobStatus"/>
 *     &lt;enumeration value="jobType"/>
 *     &lt;enumeration value="location"/>
 *     &lt;enumeration value="manufacturingCostTemplate"/>
 *     &lt;enumeration value="manufacturingOperationTask"/>
 *     &lt;enumeration value="manufacturingRouting"/>
 *     &lt;enumeration value="message"/>
 *     &lt;enumeration value="nexus"/>
 *     &lt;enumeration value="note"/>
 *     &lt;enumeration value="noteType"/>
 *     &lt;enumeration value="opportunity"/>
 *     &lt;enumeration value="otherNameCategory"/>
 *     &lt;enumeration value="partner"/>
 *     &lt;enumeration value="partnerCategory"/>
 *     &lt;enumeration value="paycheck"/>
 *     &lt;enumeration value="paymentMethod"/>
 *     &lt;enumeration value="payrollItem"/>
 *     &lt;enumeration value="phoneCall"/>
 *     &lt;enumeration value="priceLevel"/>
 *     &lt;enumeration value="pricingGroup"/>
 *     &lt;enumeration value="projectTask"/>
 *     &lt;enumeration value="promotionCode"/>
 *     &lt;enumeration value="resourceAllocation"/>
 *     &lt;enumeration value="revRecSchedule"/>
 *     &lt;enumeration value="revRecTemplate"/>
 *     &lt;enumeration value="salesRole"/>
 *     &lt;enumeration value="salesTaxItem"/>
 *     &lt;enumeration value="solution"/>
 *     &lt;enumeration value="siteCategory"/>
 *     &lt;enumeration value="subsidiary"/>
 *     &lt;enumeration value="supportCase"/>
 *     &lt;enumeration value="task"/>
 *     &lt;enumeration value="taxGroup"/>
 *     &lt;enumeration value="taxType"/>
 *     &lt;enumeration value="term"/>
 *     &lt;enumeration value="timeBill"/>
 *     &lt;enumeration value="timeSheet"/>
 *     &lt;enumeration value="topic"/>
 *     &lt;enumeration value="transaction"/>
 *     &lt;enumeration value="unitsType"/>
 *     &lt;enumeration value="usage"/>
 *     &lt;enumeration value="vendor"/>
 *     &lt;enumeration value="vendorCategory"/>
 *     &lt;enumeration value="winLossReason"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchRecordType", namespace = "urn:types.core_2018_2.platform.webservices.netsuite.com")
@XmlEnum
public enum SearchRecordType {

    @XmlEnumValue("account")
    ACCOUNT("account"),
    @XmlEnumValue("accountingPeriod")
    ACCOUNTING_PERIOD("accountingPeriod"),
    @XmlEnumValue("accountingTransaction")
    ACCOUNTING_TRANSACTION("accountingTransaction"),
    @XmlEnumValue("billingAccount")
    BILLING_ACCOUNT("billingAccount"),
    @XmlEnumValue("billingSchedule")
    BILLING_SCHEDULE("billingSchedule"),
    @XmlEnumValue("bin")
    BIN("bin"),
    @XmlEnumValue("bom")
    BOM("bom"),
    @XmlEnumValue("bomRevision")
    BOM_REVISION("bomRevision"),
    @XmlEnumValue("budget")
    BUDGET("budget"),
    @XmlEnumValue("calendarEvent")
    CALENDAR_EVENT("calendarEvent"),
    @XmlEnumValue("campaign")
    CAMPAIGN("campaign"),
    @XmlEnumValue("charge")
    CHARGE("charge"),
    @XmlEnumValue("classification")
    CLASSIFICATION("classification"),
    @XmlEnumValue("contact")
    CONTACT("contact"),
    @XmlEnumValue("contactCategory")
    CONTACT_CATEGORY("contactCategory"),
    @XmlEnumValue("contactRole")
    CONTACT_ROLE("contactRole"),
    @XmlEnumValue("costCategory")
    COST_CATEGORY("costCategory"),
    @XmlEnumValue("consolidatedExchangeRate")
    CONSOLIDATED_EXCHANGE_RATE("consolidatedExchangeRate"),
    @XmlEnumValue("couponCode")
    COUPON_CODE("couponCode"),
    @XmlEnumValue("currencyRate")
    CURRENCY_RATE("currencyRate"),
    @XmlEnumValue("customer")
    CUSTOMER("customer"),
    @XmlEnumValue("customerCategory")
    CUSTOMER_CATEGORY("customerCategory"),
    @XmlEnumValue("customerMessage")
    CUSTOMER_MESSAGE("customerMessage"),
    @XmlEnumValue("customerStatus")
    CUSTOMER_STATUS("customerStatus"),
    @XmlEnumValue("customList")
    CUSTOM_LIST("customList"),
    @XmlEnumValue("customRecord")
    CUSTOM_RECORD("customRecord"),
    @XmlEnumValue("department")
    DEPARTMENT("department"),
    @XmlEnumValue("employee")
    EMPLOYEE("employee"),
    @XmlEnumValue("entityGroup")
    ENTITY_GROUP("entityGroup"),
    @XmlEnumValue("expenseCategory")
    EXPENSE_CATEGORY("expenseCategory"),
    @XmlEnumValue("fairValuePrice")
    FAIR_VALUE_PRICE("fairValuePrice"),
    @XmlEnumValue("file")
    FILE("file"),
    @XmlEnumValue("folder")
    FOLDER("folder"),
    @XmlEnumValue("giftCertificate")
    GIFT_CERTIFICATE("giftCertificate"),
    @XmlEnumValue("globalAccountMapping")
    GLOBAL_ACCOUNT_MAPPING("globalAccountMapping"),
    @XmlEnumValue("hcmJob")
    HCM_JOB("hcmJob"),
    @XmlEnumValue("inboundShipment")
    INBOUND_SHIPMENT("inboundShipment"),
    @XmlEnumValue("inventoryNumber")
    INVENTORY_NUMBER("inventoryNumber"),
    @XmlEnumValue("item")
    ITEM("item"),
    @XmlEnumValue("itemAccountMapping")
    ITEM_ACCOUNT_MAPPING("itemAccountMapping"),
    @XmlEnumValue("itemDemandPlan")
    ITEM_DEMAND_PLAN("itemDemandPlan"),
    @XmlEnumValue("itemRevision")
    ITEM_REVISION("itemRevision"),
    @XmlEnumValue("itemSupplyPlan")
    ITEM_SUPPLY_PLAN("itemSupplyPlan"),
    @XmlEnumValue("issue")
    ISSUE("issue"),
    @XmlEnumValue("job")
    JOB("job"),
    @XmlEnumValue("jobStatus")
    JOB_STATUS("jobStatus"),
    @XmlEnumValue("jobType")
    JOB_TYPE("jobType"),
    @XmlEnumValue("location")
    LOCATION("location"),
    @XmlEnumValue("manufacturingCostTemplate")
    MANUFACTURING_COST_TEMPLATE("manufacturingCostTemplate"),
    @XmlEnumValue("manufacturingOperationTask")
    MANUFACTURING_OPERATION_TASK("manufacturingOperationTask"),
    @XmlEnumValue("manufacturingRouting")
    MANUFACTURING_ROUTING("manufacturingRouting"),
    @XmlEnumValue("message")
    MESSAGE("message"),
    @XmlEnumValue("nexus")
    NEXUS("nexus"),
    @XmlEnumValue("note")
    NOTE("note"),
    @XmlEnumValue("noteType")
    NOTE_TYPE("noteType"),
    @XmlEnumValue("opportunity")
    OPPORTUNITY("opportunity"),
    @XmlEnumValue("otherNameCategory")
    OTHER_NAME_CATEGORY("otherNameCategory"),
    @XmlEnumValue("partner")
    PARTNER("partner"),
    @XmlEnumValue("partnerCategory")
    PARTNER_CATEGORY("partnerCategory"),
    @XmlEnumValue("paycheck")
    PAYCHECK("paycheck"),
    @XmlEnumValue("paymentMethod")
    PAYMENT_METHOD("paymentMethod"),
    @XmlEnumValue("payrollItem")
    PAYROLL_ITEM("payrollItem"),
    @XmlEnumValue("phoneCall")
    PHONE_CALL("phoneCall"),
    @XmlEnumValue("priceLevel")
    PRICE_LEVEL("priceLevel"),
    @XmlEnumValue("pricingGroup")
    PRICING_GROUP("pricingGroup"),
    @XmlEnumValue("projectTask")
    PROJECT_TASK("projectTask"),
    @XmlEnumValue("promotionCode")
    PROMOTION_CODE("promotionCode"),
    @XmlEnumValue("resourceAllocation")
    RESOURCE_ALLOCATION("resourceAllocation"),
    @XmlEnumValue("revRecSchedule")
    REV_REC_SCHEDULE("revRecSchedule"),
    @XmlEnumValue("revRecTemplate")
    REV_REC_TEMPLATE("revRecTemplate"),
    @XmlEnumValue("salesRole")
    SALES_ROLE("salesRole"),
    @XmlEnumValue("salesTaxItem")
    SALES_TAX_ITEM("salesTaxItem"),
    @XmlEnumValue("solution")
    SOLUTION("solution"),
    @XmlEnumValue("siteCategory")
    SITE_CATEGORY("siteCategory"),
    @XmlEnumValue("subsidiary")
    SUBSIDIARY("subsidiary"),
    @XmlEnumValue("supportCase")
    SUPPORT_CASE("supportCase"),
    @XmlEnumValue("task")
    TASK("task"),
    @XmlEnumValue("taxGroup")
    TAX_GROUP("taxGroup"),
    @XmlEnumValue("taxType")
    TAX_TYPE("taxType"),
    @XmlEnumValue("term")
    TERM("term"),
    @XmlEnumValue("timeBill")
    TIME_BILL("timeBill"),
    @XmlEnumValue("timeSheet")
    TIME_SHEET("timeSheet"),
    @XmlEnumValue("topic")
    TOPIC("topic"),
    @XmlEnumValue("transaction")
    TRANSACTION("transaction"),
    @XmlEnumValue("unitsType")
    UNITS_TYPE("unitsType"),
    @XmlEnumValue("usage")
    USAGE("usage"),
    @XmlEnumValue("vendor")
    VENDOR("vendor"),
    @XmlEnumValue("vendorCategory")
    VENDOR_CATEGORY("vendorCategory"),
    @XmlEnumValue("winLossReason")
    WIN_LOSS_REASON("winLossReason");
    private final String value;

    SearchRecordType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchRecordType fromValue(String v) {
        for (SearchRecordType c: SearchRecordType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
