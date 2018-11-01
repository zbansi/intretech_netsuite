
package com.netsuite.webservices.transactions.sales_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TransactionType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_assemblyBuild"/>
 *     &lt;enumeration value="_assemblyUnbuild"/>
 *     &lt;enumeration value="_binTransfer"/>
 *     &lt;enumeration value="_binWorksheet"/>
 *     &lt;enumeration value="_cashRefund"/>
 *     &lt;enumeration value="_cashSale"/>
 *     &lt;enumeration value="_check"/>
 *     &lt;enumeration value="_creditMemo"/>
 *     &lt;enumeration value="_custom"/>
 *     &lt;enumeration value="_customerDeposit"/>
 *     &lt;enumeration value="_customerPayment"/>
 *     &lt;enumeration value="_customerRefund"/>
 *     &lt;enumeration value="_deposit"/>
 *     &lt;enumeration value="_depositApplication"/>
 *     &lt;enumeration value="_estimate"/>
 *     &lt;enumeration value="_expenseReport"/>
 *     &lt;enumeration value="_inboundShipment"/>
 *     &lt;enumeration value="_inventoryAdjustment"/>
 *     &lt;enumeration value="_inventoryCostRevaluation"/>
 *     &lt;enumeration value="_inventoryTransfer"/>
 *     &lt;enumeration value="_invoice"/>
 *     &lt;enumeration value="_itemFulfillment"/>
 *     &lt;enumeration value="_itemReceipt"/>
 *     &lt;enumeration value="_journal"/>
 *     &lt;enumeration value="_opportunity"/>
 *     &lt;enumeration value="_paycheck"/>
 *     &lt;enumeration value="_paycheckJournal"/>
 *     &lt;enumeration value="_purchaseOrder"/>
 *     &lt;enumeration value="_requisition"/>
 *     &lt;enumeration value="_returnAuthorization"/>
 *     &lt;enumeration value="_salesOrder"/>
 *     &lt;enumeration value="_transferOrder"/>
 *     &lt;enumeration value="_vendorBill"/>
 *     &lt;enumeration value="_vendorCredit"/>
 *     &lt;enumeration value="_vendorPayment"/>
 *     &lt;enumeration value="_vendorReturnAuthorization"/>
 *     &lt;enumeration value="_workOrder"/>
 *     &lt;enumeration value="_workOrderClose"/>
 *     &lt;enumeration value="_workOrderCompletion"/>
 *     &lt;enumeration value="_workOrderIssue"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransactionType", namespace = "urn:types.sales_2018_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum TransactionType {

    @XmlEnumValue("_assemblyBuild")
    ASSEMBLY_BUILD("_assemblyBuild"),
    @XmlEnumValue("_assemblyUnbuild")
    ASSEMBLY_UNBUILD("_assemblyUnbuild"),
    @XmlEnumValue("_binTransfer")
    BIN_TRANSFER("_binTransfer"),
    @XmlEnumValue("_binWorksheet")
    BIN_WORKSHEET("_binWorksheet"),
    @XmlEnumValue("_cashRefund")
    CASH_REFUND("_cashRefund"),
    @XmlEnumValue("_cashSale")
    CASH_SALE("_cashSale"),
    @XmlEnumValue("_check")
    CHECK("_check"),
    @XmlEnumValue("_creditMemo")
    CREDIT_MEMO("_creditMemo"),
    @XmlEnumValue("_custom")
    CUSTOM("_custom"),
    @XmlEnumValue("_customerDeposit")
    CUSTOMER_DEPOSIT("_customerDeposit"),
    @XmlEnumValue("_customerPayment")
    CUSTOMER_PAYMENT("_customerPayment"),
    @XmlEnumValue("_customerRefund")
    CUSTOMER_REFUND("_customerRefund"),
    @XmlEnumValue("_deposit")
    DEPOSIT("_deposit"),
    @XmlEnumValue("_depositApplication")
    DEPOSIT_APPLICATION("_depositApplication"),
    @XmlEnumValue("_estimate")
    ESTIMATE("_estimate"),
    @XmlEnumValue("_expenseReport")
    EXPENSE_REPORT("_expenseReport"),
    @XmlEnumValue("_inboundShipment")
    INBOUND_SHIPMENT("_inboundShipment"),
    @XmlEnumValue("_inventoryAdjustment")
    INVENTORY_ADJUSTMENT("_inventoryAdjustment"),
    @XmlEnumValue("_inventoryCostRevaluation")
    INVENTORY_COST_REVALUATION("_inventoryCostRevaluation"),
    @XmlEnumValue("_inventoryTransfer")
    INVENTORY_TRANSFER("_inventoryTransfer"),
    @XmlEnumValue("_invoice")
    INVOICE("_invoice"),
    @XmlEnumValue("_itemFulfillment")
    ITEM_FULFILLMENT("_itemFulfillment"),
    @XmlEnumValue("_itemReceipt")
    ITEM_RECEIPT("_itemReceipt"),
    @XmlEnumValue("_journal")
    JOURNAL("_journal"),
    @XmlEnumValue("_opportunity")
    OPPORTUNITY("_opportunity"),
    @XmlEnumValue("_paycheck")
    PAYCHECK("_paycheck"),
    @XmlEnumValue("_paycheckJournal")
    PAYCHECK_JOURNAL("_paycheckJournal"),
    @XmlEnumValue("_purchaseOrder")
    PURCHASE_ORDER("_purchaseOrder"),
    @XmlEnumValue("_requisition")
    REQUISITION("_requisition"),
    @XmlEnumValue("_returnAuthorization")
    RETURN_AUTHORIZATION("_returnAuthorization"),
    @XmlEnumValue("_salesOrder")
    SALES_ORDER("_salesOrder"),
    @XmlEnumValue("_transferOrder")
    TRANSFER_ORDER("_transferOrder"),
    @XmlEnumValue("_vendorBill")
    VENDOR_BILL("_vendorBill"),
    @XmlEnumValue("_vendorCredit")
    VENDOR_CREDIT("_vendorCredit"),
    @XmlEnumValue("_vendorPayment")
    VENDOR_PAYMENT("_vendorPayment"),
    @XmlEnumValue("_vendorReturnAuthorization")
    VENDOR_RETURN_AUTHORIZATION("_vendorReturnAuthorization"),
    @XmlEnumValue("_workOrder")
    WORK_ORDER("_workOrder"),
    @XmlEnumValue("_workOrderClose")
    WORK_ORDER_CLOSE("_workOrderClose"),
    @XmlEnumValue("_workOrderCompletion")
    WORK_ORDER_COMPLETION("_workOrderCompletion"),
    @XmlEnumValue("_workOrderIssue")
    WORK_ORDER_ISSUE("_workOrderIssue");
    private final String value;

    TransactionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionType fromValue(String v) {
        for (TransactionType c: TransactionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
