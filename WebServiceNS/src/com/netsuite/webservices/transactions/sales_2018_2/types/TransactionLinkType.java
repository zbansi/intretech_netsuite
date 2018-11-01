
package com.netsuite.webservices.transactions.sales_2018_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TransactionLinkType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionLinkType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_advancedCostAmortization"/>
 *     &lt;enumeration value="_advancedExpenseAmortization"/>
 *     &lt;enumeration value="_authorizationDeposit"/>
 *     &lt;enumeration value="_blcgaJeFullfillment"/>
 *     &lt;enumeration value="_closedPeriodFxVariance"/>
 *     &lt;enumeration value="_closeWorkOrder"/>
 *     &lt;enumeration value="_cogsLink"/>
 *     &lt;enumeration value="_collectTegata"/>
 *     &lt;enumeration value="_commission"/>
 *     &lt;enumeration value="_contractCostDeferral"/>
 *     &lt;enumeration value="_contractCostDeferralReversal"/>
 *     &lt;enumeration value="_deferredRevenueReallocation"/>
 *     &lt;enumeration value="_depositApplication"/>
 *     &lt;enumeration value="_depositRefundCheck"/>
 *     &lt;enumeration value="_discountTegata"/>
 *     &lt;enumeration value="_dropShipment"/>
 *     &lt;enumeration value="_endorseTegata"/>
 *     &lt;enumeration value="_estimateInvoicing"/>
 *     &lt;enumeration value="_fulfillmentRequestFulfillment"/>
 *     &lt;enumeration value="_glImpactAdjustment"/>
 *     &lt;enumeration value="_intercompanyAdjustment"/>
 *     &lt;enumeration value="_inventoryCountAdjustment"/>
 *     &lt;enumeration value="_landedCost"/>
 *     &lt;enumeration value="_linkedReturnCost"/>
 *     &lt;enumeration value="_opportunityClose"/>
 *     &lt;enumeration value="_opportunityEstimate"/>
 *     &lt;enumeration value="_orderBillInvoice"/>
 *     &lt;enumeration value="_orderFulfillmentRequest"/>
 *     &lt;enumeration value="_orderPickingPacking"/>
 *     &lt;enumeration value="_ownershipTransferItemReceipt"/>
 *     &lt;enumeration value="_payment"/>
 *     &lt;enumeration value="_paymentRefund"/>
 *     &lt;enumeration value="_payTegata"/>
 *     &lt;enumeration value="_poToOwnershipTransfer"/>
 *     &lt;enumeration value="_purchaseContractOrder"/>
 *     &lt;enumeration value="_purchaseOrderRequisition"/>
 *     &lt;enumeration value="_purchaseOrderToBlanket"/>
 *     &lt;enumeration value="_purchaseReturn"/>
 *     &lt;enumeration value="_receiptBill"/>
 *     &lt;enumeration value="_receiptFulfillment"/>
 *     &lt;enumeration value="_reimbursement"/>
 *     &lt;enumeration value="_revalueWorkOrder"/>
 *     &lt;enumeration value="_revenueAmortizatonRecognition"/>
 *     &lt;enumeration value="_revenueArrangement"/>
 *     &lt;enumeration value="_revenueCommitted"/>
 *     &lt;enumeration value="_rfqToVendorRfq"/>
 *     &lt;enumeration value="_saleReturn"/>
 *     &lt;enumeration value="_salesOrderAuthorization"/>
 *     &lt;enumeration value="_salesOrderDegross"/>
 *     &lt;enumeration value="_salesOrderDeposit"/>
 *     &lt;enumeration value="_salesOrderRevenueRevaluation"/>
 *     &lt;enumeration value="_sourceOfRevenueContract"/>
 *     &lt;enumeration value="_specialOrder"/>
 *     &lt;enumeration value="_transferOrderFulfillmentReceipt"/>
 *     &lt;enumeration value="_vendorBillVariance"/>
 *     &lt;enumeration value="_vendorRfqToPurchaseContract"/>
 *     &lt;enumeration value="_wipBuild"/>
 *     &lt;enumeration value="_workOrderBuild"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransactionLinkType", namespace = "urn:types.sales_2018_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum TransactionLinkType {

    @XmlEnumValue("_advancedCostAmortization")
    ADVANCED_COST_AMORTIZATION("_advancedCostAmortization"),
    @XmlEnumValue("_advancedExpenseAmortization")
    ADVANCED_EXPENSE_AMORTIZATION("_advancedExpenseAmortization"),
    @XmlEnumValue("_authorizationDeposit")
    AUTHORIZATION_DEPOSIT("_authorizationDeposit"),
    @XmlEnumValue("_blcgaJeFullfillment")
    BLCGA_JE_FULLFILLMENT("_blcgaJeFullfillment"),
    @XmlEnumValue("_closedPeriodFxVariance")
    CLOSED_PERIOD_FX_VARIANCE("_closedPeriodFxVariance"),
    @XmlEnumValue("_closeWorkOrder")
    CLOSE_WORK_ORDER("_closeWorkOrder"),
    @XmlEnumValue("_cogsLink")
    COGS_LINK("_cogsLink"),
    @XmlEnumValue("_collectTegata")
    COLLECT_TEGATA("_collectTegata"),
    @XmlEnumValue("_commission")
    COMMISSION("_commission"),
    @XmlEnumValue("_contractCostDeferral")
    CONTRACT_COST_DEFERRAL("_contractCostDeferral"),
    @XmlEnumValue("_contractCostDeferralReversal")
    CONTRACT_COST_DEFERRAL_REVERSAL("_contractCostDeferralReversal"),
    @XmlEnumValue("_deferredRevenueReallocation")
    DEFERRED_REVENUE_REALLOCATION("_deferredRevenueReallocation"),
    @XmlEnumValue("_depositApplication")
    DEPOSIT_APPLICATION("_depositApplication"),
    @XmlEnumValue("_depositRefundCheck")
    DEPOSIT_REFUND_CHECK("_depositRefundCheck"),
    @XmlEnumValue("_discountTegata")
    DISCOUNT_TEGATA("_discountTegata"),
    @XmlEnumValue("_dropShipment")
    DROP_SHIPMENT("_dropShipment"),
    @XmlEnumValue("_endorseTegata")
    ENDORSE_TEGATA("_endorseTegata"),
    @XmlEnumValue("_estimateInvoicing")
    ESTIMATE_INVOICING("_estimateInvoicing"),
    @XmlEnumValue("_fulfillmentRequestFulfillment")
    FULFILLMENT_REQUEST_FULFILLMENT("_fulfillmentRequestFulfillment"),
    @XmlEnumValue("_glImpactAdjustment")
    GL_IMPACT_ADJUSTMENT("_glImpactAdjustment"),
    @XmlEnumValue("_intercompanyAdjustment")
    INTERCOMPANY_ADJUSTMENT("_intercompanyAdjustment"),
    @XmlEnumValue("_inventoryCountAdjustment")
    INVENTORY_COUNT_ADJUSTMENT("_inventoryCountAdjustment"),
    @XmlEnumValue("_landedCost")
    LANDED_COST("_landedCost"),
    @XmlEnumValue("_linkedReturnCost")
    LINKED_RETURN_COST("_linkedReturnCost"),
    @XmlEnumValue("_opportunityClose")
    OPPORTUNITY_CLOSE("_opportunityClose"),
    @XmlEnumValue("_opportunityEstimate")
    OPPORTUNITY_ESTIMATE("_opportunityEstimate"),
    @XmlEnumValue("_orderBillInvoice")
    ORDER_BILL_INVOICE("_orderBillInvoice"),
    @XmlEnumValue("_orderFulfillmentRequest")
    ORDER_FULFILLMENT_REQUEST("_orderFulfillmentRequest"),
    @XmlEnumValue("_orderPickingPacking")
    ORDER_PICKING_PACKING("_orderPickingPacking"),
    @XmlEnumValue("_ownershipTransferItemReceipt")
    OWNERSHIP_TRANSFER_ITEM_RECEIPT("_ownershipTransferItemReceipt"),
    @XmlEnumValue("_payment")
    PAYMENT("_payment"),
    @XmlEnumValue("_paymentRefund")
    PAYMENT_REFUND("_paymentRefund"),
    @XmlEnumValue("_payTegata")
    PAY_TEGATA("_payTegata"),
    @XmlEnumValue("_poToOwnershipTransfer")
    PO_TO_OWNERSHIP_TRANSFER("_poToOwnershipTransfer"),
    @XmlEnumValue("_purchaseContractOrder")
    PURCHASE_CONTRACT_ORDER("_purchaseContractOrder"),
    @XmlEnumValue("_purchaseOrderRequisition")
    PURCHASE_ORDER_REQUISITION("_purchaseOrderRequisition"),
    @XmlEnumValue("_purchaseOrderToBlanket")
    PURCHASE_ORDER_TO_BLANKET("_purchaseOrderToBlanket"),
    @XmlEnumValue("_purchaseReturn")
    PURCHASE_RETURN("_purchaseReturn"),
    @XmlEnumValue("_receiptBill")
    RECEIPT_BILL("_receiptBill"),
    @XmlEnumValue("_receiptFulfillment")
    RECEIPT_FULFILLMENT("_receiptFulfillment"),
    @XmlEnumValue("_reimbursement")
    REIMBURSEMENT("_reimbursement"),
    @XmlEnumValue("_revalueWorkOrder")
    REVALUE_WORK_ORDER("_revalueWorkOrder"),
    @XmlEnumValue("_revenueAmortizatonRecognition")
    REVENUE_AMORTIZATON_RECOGNITION("_revenueAmortizatonRecognition"),
    @XmlEnumValue("_revenueArrangement")
    REVENUE_ARRANGEMENT("_revenueArrangement"),
    @XmlEnumValue("_revenueCommitted")
    REVENUE_COMMITTED("_revenueCommitted"),
    @XmlEnumValue("_rfqToVendorRfq")
    RFQ_TO_VENDOR_RFQ("_rfqToVendorRfq"),
    @XmlEnumValue("_saleReturn")
    SALE_RETURN("_saleReturn"),
    @XmlEnumValue("_salesOrderAuthorization")
    SALES_ORDER_AUTHORIZATION("_salesOrderAuthorization"),
    @XmlEnumValue("_salesOrderDegross")
    SALES_ORDER_DEGROSS("_salesOrderDegross"),
    @XmlEnumValue("_salesOrderDeposit")
    SALES_ORDER_DEPOSIT("_salesOrderDeposit"),
    @XmlEnumValue("_salesOrderRevenueRevaluation")
    SALES_ORDER_REVENUE_REVALUATION("_salesOrderRevenueRevaluation"),
    @XmlEnumValue("_sourceOfRevenueContract")
    SOURCE_OF_REVENUE_CONTRACT("_sourceOfRevenueContract"),
    @XmlEnumValue("_specialOrder")
    SPECIAL_ORDER("_specialOrder"),
    @XmlEnumValue("_transferOrderFulfillmentReceipt")
    TRANSFER_ORDER_FULFILLMENT_RECEIPT("_transferOrderFulfillmentReceipt"),
    @XmlEnumValue("_vendorBillVariance")
    VENDOR_BILL_VARIANCE("_vendorBillVariance"),
    @XmlEnumValue("_vendorRfqToPurchaseContract")
    VENDOR_RFQ_TO_PURCHASE_CONTRACT("_vendorRfqToPurchaseContract"),
    @XmlEnumValue("_wipBuild")
    WIP_BUILD("_wipBuild"),
    @XmlEnumValue("_workOrderBuild")
    WORK_ORDER_BUILD("_workOrderBuild");
    private final String value;

    TransactionLinkType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionLinkType fromValue(String v) {
        for (TransactionLinkType c: TransactionLinkType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
