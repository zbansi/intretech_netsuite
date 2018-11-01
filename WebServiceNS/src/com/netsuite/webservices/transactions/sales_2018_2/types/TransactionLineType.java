
package com.netsuite.webservices.transactions.sales_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TransactionLineType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionLineType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_adjustedQuantity"/>
 *     &lt;enumeration value="_advanceToApplyAmount"/>
 *     &lt;enumeration value="_billExchangeRateVariance"/>
 *     &lt;enumeration value="_billPriceVariance"/>
 *     &lt;enumeration value="_billQuantityVariance"/>
 *     &lt;enumeration value="_countQuantity"/>
 *     &lt;enumeration value="_dropshipExpense"/>
 *     &lt;enumeration value="_gainLoss"/>
 *     &lt;enumeration value="_inTransit"/>
 *     &lt;enumeration value="_item"/>
 *     &lt;enumeration value="_materialOverhead"/>
 *     &lt;enumeration value="_nonReimbursuableExpenseOffset"/>
 *     &lt;enumeration value="_nonReimbursuableExpenseOriginal"/>
 *     &lt;enumeration value="_ownershipTransfer"/>
 *     &lt;enumeration value="_productionPriceVariance"/>
 *     &lt;enumeration value="_productionQuantityVariance"/>
 *     &lt;enumeration value="_purchasePriceVariance"/>
 *     &lt;enumeration value="_receiving"/>
 *     &lt;enumeration value="_routingItem"/>
 *     &lt;enumeration value="_routingWorkInProcess"/>
 *     &lt;enumeration value="_scrap"/>
 *     &lt;enumeration value="_shipping"/>
 *     &lt;enumeration value="_snapshotQuantity"/>
 *     &lt;enumeration value="_totalBillVariance"/>
 *     &lt;enumeration value="_unbuildVariance"/>
 *     &lt;enumeration value="_workInProcess"/>
 *     &lt;enumeration value="_workInProcessVariance"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransactionLineType", namespace = "urn:types.sales_2018_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum TransactionLineType {

    @XmlEnumValue("_adjustedQuantity")
    ADJUSTED_QUANTITY("_adjustedQuantity"),
    @XmlEnumValue("_advanceToApplyAmount")
    ADVANCE_TO_APPLY_AMOUNT("_advanceToApplyAmount"),
    @XmlEnumValue("_billExchangeRateVariance")
    BILL_EXCHANGE_RATE_VARIANCE("_billExchangeRateVariance"),
    @XmlEnumValue("_billPriceVariance")
    BILL_PRICE_VARIANCE("_billPriceVariance"),
    @XmlEnumValue("_billQuantityVariance")
    BILL_QUANTITY_VARIANCE("_billQuantityVariance"),
    @XmlEnumValue("_countQuantity")
    COUNT_QUANTITY("_countQuantity"),
    @XmlEnumValue("_dropshipExpense")
    DROPSHIP_EXPENSE("_dropshipExpense"),
    @XmlEnumValue("_gainLoss")
    GAIN_LOSS("_gainLoss"),
    @XmlEnumValue("_inTransit")
    IN_TRANSIT("_inTransit"),
    @XmlEnumValue("_item")
    ITEM("_item"),
    @XmlEnumValue("_materialOverhead")
    MATERIAL_OVERHEAD("_materialOverhead"),
    @XmlEnumValue("_nonReimbursuableExpenseOffset")
    NON_REIMBURSUABLE_EXPENSE_OFFSET("_nonReimbursuableExpenseOffset"),
    @XmlEnumValue("_nonReimbursuableExpenseOriginal")
    NON_REIMBURSUABLE_EXPENSE_ORIGINAL("_nonReimbursuableExpenseOriginal"),
    @XmlEnumValue("_ownershipTransfer")
    OWNERSHIP_TRANSFER("_ownershipTransfer"),
    @XmlEnumValue("_productionPriceVariance")
    PRODUCTION_PRICE_VARIANCE("_productionPriceVariance"),
    @XmlEnumValue("_productionQuantityVariance")
    PRODUCTION_QUANTITY_VARIANCE("_productionQuantityVariance"),
    @XmlEnumValue("_purchasePriceVariance")
    PURCHASE_PRICE_VARIANCE("_purchasePriceVariance"),
    @XmlEnumValue("_receiving")
    RECEIVING("_receiving"),
    @XmlEnumValue("_routingItem")
    ROUTING_ITEM("_routingItem"),
    @XmlEnumValue("_routingWorkInProcess")
    ROUTING_WORK_IN_PROCESS("_routingWorkInProcess"),
    @XmlEnumValue("_scrap")
    SCRAP("_scrap"),
    @XmlEnumValue("_shipping")
    SHIPPING("_shipping"),
    @XmlEnumValue("_snapshotQuantity")
    SNAPSHOT_QUANTITY("_snapshotQuantity"),
    @XmlEnumValue("_totalBillVariance")
    TOTAL_BILL_VARIANCE("_totalBillVariance"),
    @XmlEnumValue("_unbuildVariance")
    UNBUILD_VARIANCE("_unbuildVariance"),
    @XmlEnumValue("_workInProcess")
    WORK_IN_PROCESS("_workInProcess"),
    @XmlEnumValue("_workInProcessVariance")
    WORK_IN_PROCESS_VARIANCE("_workInProcessVariance");
    private final String value;

    TransactionLineType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionLineType fromValue(String v) {
        for (TransactionLineType c: TransactionLineType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
