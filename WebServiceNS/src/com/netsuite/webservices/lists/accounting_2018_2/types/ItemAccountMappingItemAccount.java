
package com.netsuite.webservices.lists.accounting_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ItemAccountMappingItemAccount的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ItemAccountMappingItemAccount">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_asset"/>
 *     &lt;enumeration value="_costOfGoods"/>
 *     &lt;enumeration value="_customerReturnVariance"/>
 *     &lt;enumeration value="_deferral"/>
 *     &lt;enumeration value="_deferredRevenue"/>
 *     &lt;enumeration value="_discount"/>
 *     &lt;enumeration value="_dropShipExpense"/>
 *     &lt;enumeration value="_exchangeRateVariance"/>
 *     &lt;enumeration value="_expense"/>
 *     &lt;enumeration value="_foreignCurrencyAdjustmentRevenueAccount"/>
 *     &lt;enumeration value="_gainLoss"/>
 *     &lt;enumeration value="_income"/>
 *     &lt;enumeration value="_intercompanyCostOfGoods"/>
 *     &lt;enumeration value="_intercompanyDeferredRevenue"/>
 *     &lt;enumeration value="_intercompanyExpense"/>
 *     &lt;enumeration value="_intercompanyIncome"/>
 *     &lt;enumeration value="_liability"/>
 *     &lt;enumeration value="_markup"/>
 *     &lt;enumeration value="_payment"/>
 *     &lt;enumeration value="_priceVariance"/>
 *     &lt;enumeration value="_productionPriceVariance"/>
 *     &lt;enumeration value="_productionQuantityVariance"/>
 *     &lt;enumeration value="_purchasePriceVariance"/>
 *     &lt;enumeration value="_quantityVariance"/>
 *     &lt;enumeration value="_scrap"/>
 *     &lt;enumeration value="_unbuildVariance"/>
 *     &lt;enumeration value="_vendorReturnVariance"/>
 *     &lt;enumeration value="_wipVariance"/>
 *     &lt;enumeration value="_workInProcess"/>
 *     &lt;enumeration value="_writeOff"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemAccountMappingItemAccount", namespace = "urn:types.accounting_2018_2.lists.webservices.netsuite.com")
@XmlEnum
public enum ItemAccountMappingItemAccount {

    @XmlEnumValue("_asset")
    ASSET("_asset"),
    @XmlEnumValue("_costOfGoods")
    COST_OF_GOODS("_costOfGoods"),
    @XmlEnumValue("_customerReturnVariance")
    CUSTOMER_RETURN_VARIANCE("_customerReturnVariance"),
    @XmlEnumValue("_deferral")
    DEFERRAL("_deferral"),
    @XmlEnumValue("_deferredRevenue")
    DEFERRED_REVENUE("_deferredRevenue"),
    @XmlEnumValue("_discount")
    DISCOUNT("_discount"),
    @XmlEnumValue("_dropShipExpense")
    DROP_SHIP_EXPENSE("_dropShipExpense"),
    @XmlEnumValue("_exchangeRateVariance")
    EXCHANGE_RATE_VARIANCE("_exchangeRateVariance"),
    @XmlEnumValue("_expense")
    EXPENSE("_expense"),
    @XmlEnumValue("_foreignCurrencyAdjustmentRevenueAccount")
    FOREIGN_CURRENCY_ADJUSTMENT_REVENUE_ACCOUNT("_foreignCurrencyAdjustmentRevenueAccount"),
    @XmlEnumValue("_gainLoss")
    GAIN_LOSS("_gainLoss"),
    @XmlEnumValue("_income")
    INCOME("_income"),
    @XmlEnumValue("_intercompanyCostOfGoods")
    INTERCOMPANY_COST_OF_GOODS("_intercompanyCostOfGoods"),
    @XmlEnumValue("_intercompanyDeferredRevenue")
    INTERCOMPANY_DEFERRED_REVENUE("_intercompanyDeferredRevenue"),
    @XmlEnumValue("_intercompanyExpense")
    INTERCOMPANY_EXPENSE("_intercompanyExpense"),
    @XmlEnumValue("_intercompanyIncome")
    INTERCOMPANY_INCOME("_intercompanyIncome"),
    @XmlEnumValue("_liability")
    LIABILITY("_liability"),
    @XmlEnumValue("_markup")
    MARKUP("_markup"),
    @XmlEnumValue("_payment")
    PAYMENT("_payment"),
    @XmlEnumValue("_priceVariance")
    PRICE_VARIANCE("_priceVariance"),
    @XmlEnumValue("_productionPriceVariance")
    PRODUCTION_PRICE_VARIANCE("_productionPriceVariance"),
    @XmlEnumValue("_productionQuantityVariance")
    PRODUCTION_QUANTITY_VARIANCE("_productionQuantityVariance"),
    @XmlEnumValue("_purchasePriceVariance")
    PURCHASE_PRICE_VARIANCE("_purchasePriceVariance"),
    @XmlEnumValue("_quantityVariance")
    QUANTITY_VARIANCE("_quantityVariance"),
    @XmlEnumValue("_scrap")
    SCRAP("_scrap"),
    @XmlEnumValue("_unbuildVariance")
    UNBUILD_VARIANCE("_unbuildVariance"),
    @XmlEnumValue("_vendorReturnVariance")
    VENDOR_RETURN_VARIANCE("_vendorReturnVariance"),
    @XmlEnumValue("_wipVariance")
    WIP_VARIANCE("_wipVariance"),
    @XmlEnumValue("_workInProcess")
    WORK_IN_PROCESS("_workInProcess"),
    @XmlEnumValue("_writeOff")
    WRITE_OFF("_writeOff");
    private final String value;

    ItemAccountMappingItemAccount(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemAccountMappingItemAccount fromValue(String v) {
        for (ItemAccountMappingItemAccount c: ItemAccountMappingItemAccount.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
