package com.bansi.webservices.samples.v2017_2;

import com.netsuite.suitetalk.proxy.v2017_2.lists.accounting.LotNumberedInventoryItem;
import com.netsuite.suitetalk.proxy.v2017_2.lists.accounting.OtherChargePurchaseItem;
import com.netsuite.suitetalk.proxy.v2017_2.lists.relationships.Customer;
import com.netsuite.suitetalk.proxy.v2017_2.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2017_2.platform.messages.WriteResponse;
import com.netsuite.suitetalk.proxy.v2017_2.setup.customization.CustomRecord;
import com.netsuite.suitetalk.proxy.v2017_2.transactions.sales.SalesOrder;
import com.netsuite.suitetalk.proxy.v2017_2.transactions.sales.SalesOrderItem;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.LinkedHashMap;
import java.util.Map;

import static com.bansi.webservices.samples.Messages.*;

/**
 * <p>This is type of map which converts particular objects to map of the fields. It can be simply printed
 * using {@link com.netsuite.webservices.samples.utils.PrintUtils#printMap(Map)} method.</p>
 * <p>2017 Intretech Inc. All rights reserved.</p>
 */
@ParametersAreNonnullByDefault
public class Fields extends LinkedHashMap<String, String> {

    public Fields() {
        super();
    }

    public Fields(String internalId) {
        super();
        put(INTERNAL_ID, internalId);
    }

    public Fields(String internalId, String errorMessage) {
        this(internalId);
        put(ERROR, errorMessage);
    }

    public Fields(Customer customer) {
        super();
        put(INTERNAL_ID, customer.getInternalId());
        put(EXTERNAL_ID, customer.getExternalId());
        put(ENTITY_ID, customer.getEntityId());
        put(COMPANY_NAME, customer.getCompanyName());
        put(EMAIL, customer.getEmail());
        put(PHONE, customer.getPhone());
        put(ENTITY_STATUS, customer.getEntityStatus().getName());
        put(IS_INACTIVE, String.valueOf(customer.getIsInactive()));
        put(DATE_CREATED, customer.getDateCreated().getTime().toString());
    }
    
    public Fields(LotNumberedInventoryItem lotNumberedInventoryItem) {
        super();
        put(INTERNAL_ID, lotNumberedInventoryItem.getInternalId());
        put(EXTERNAL_ID, lotNumberedInventoryItem.getExternalId()); 
        put(PURCHASE_DESCRIPTION, lotNumberedInventoryItem.getPurchaseDescription());
        put(IS_INACTIVE, String.valueOf(lotNumberedInventoryItem.getIsInactive()));
        put(DATE_CREATED, lotNumberedInventoryItem.getCreatedDate().getTime().toString());
    }
    
    public Fields(OtherChargePurchaseItem otherChargePurchaseItem) {
        super();
        put(INTERNAL_ID, otherChargePurchaseItem.getInternalId());
        put(EXTERNAL_ID, otherChargePurchaseItem.getExternalId()); 
        put(PURCHASE_DESCRIPTION, otherChargePurchaseItem.getPurchaseDescription());
        put(IS_INACTIVE, String.valueOf(otherChargePurchaseItem.getIsInactive()));
        put(DATE_CREATED, otherChargePurchaseItem.getCreatedDate().getTime().toString());
    }
    

    public Fields(WriteResponse response, Customer customer) {
        super();
        put(INTERNAL_ID, ((RecordRef) response.getBaseRef()).getInternalId());
        put(EXTERNAL_ID, ((RecordRef) response.getBaseRef()).getExternalId());
        put(ENTITY_ID, customer.getEntityId());
        put(COMPANY_NAME, customer.getCompanyName());
        put(EMAIL, customer.getEmail());
        put(STATUS_INTERNAL_ID, getStatusKey(customer));
        put(ADDRESS_BOOK_LABEL, getAddressBookLabel(customer));
    }

    public Fields(SalesOrder salesOrder, boolean isEntityId) {
        super();
        put(INTERNAL_ID, salesOrder.getInternalId());
        put(TRANSACTION_ID, salesOrder.getTranId());
        if (isEntityId) {
            put(ENTITY_ID, salesOrder.getEntity().getInternalId());
        } else {
            put(CUSTOMER_NAME, salesOrder.getEntity().getName());
        }
        put(TOTAL_AMOUNT, String.valueOf(salesOrder.getTotal()));
        put(DATE_CREATED, salesOrder.getCreatedDate().getTime().toString());
    }

    public Fields(SalesOrderItem item) {
        super();
        put(ITEM_NAME, item.getItem().getName());
        put(QUANTITY, String.valueOf(item.getQuantity()));
    }

    public Fields(CustomRecord customRecord) {
        super();
        put(CUSTOM_RECORD_TYPE_ID, customRecord.getRecType().getInternalId());
        put(INTERNAL_ID, customRecord.getInternalId());
        put(NAME, customRecord.getName());
    }

    private static String getStatusKey(Customer customer) {
        if (customer.getEntityStatus() == null) {
            return null;
        }
        return customer.getEntityStatus().getInternalId();
    }

    private static String getAddressBookLabel(Customer customer) {
        final int i = 0;
        if (customer.getAddressbookList() == null || customer.getAddressbookList().getAddressbook() == null
                || customer.getAddressbookList().getAddressbook()[i] == null) {
            return null;
        }
        return customer.getAddressbookList().getAddressbook()[i].getLabel();
    }
}
