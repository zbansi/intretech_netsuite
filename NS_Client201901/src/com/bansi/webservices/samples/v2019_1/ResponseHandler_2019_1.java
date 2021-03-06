package com.bansi.webservices.samples.v2019_1;

import com.netsuite.webservices.lists.accounting_2019_1.InventoryItem;
import com.netsuite.webservices.lists.accounting_2019_1.LotNumberedInventoryItem;
import com.netsuite.webservices.lists.relationships_2019_1.Customer;
import com.netsuite.webservices.lists.relationships_2019_1.Vendor;
import com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic;
import com.netsuite.webservices.platform.core_2019_1.CustomRecordRef;
import com.netsuite.webservices.platform.core_2019_1.Record;
import com.netsuite.webservices.platform.core_2019_1.RecordRef;
import com.netsuite.webservices.platform.core_2019_1.SearchResult;
import com.netsuite.webservices.platform.messages_2019_1.ReadResponse;
import com.netsuite.webservices.platform.messages_2019_1.ReadResponseList;
import com.netsuite.webservices.platform.messages_2019_1.WriteResponse;
import com.netsuite.webservices.platform.messages_2019_1.WriteResponseList;
import com.netsuite.webservices.setup.customization_2019_1.CustomRecord;
import com.netsuite.webservices.transactions.sales_2019_1.ItemFulfillment;
import com.netsuite.webservices.transactions.sales_2019_1.SalesOrder;
import com.netsuite.webservices.transactions.sales_2019_1.TransactionSearchRow;
import com.bansi.webservices.samples.v2019_1.Fields;
import com.netsuite.webservices.lists.accounting_2019_1.Bom;
import com.netsuite.webservices.lists.accounting_2019_1.BomRevision;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.netsuite.suitetalk.client.common.utils.CommonUtils.isEmptyString;
import static com.bansi.webservices.samples.Messages.*;
import static com.bansi.webservices.samples.utils.IndentationUtils.getIndentedString;
import static com.bansi.webservices.samples.utils_2019_1.ParsingUtils.getErrorMessage;
import static com.bansi.webservices.samples.utils_2019_1.ParsingUtils.getInternalId;
import static com.bansi.webservices.samples.utils_2019_1.PrintUtils.*;

/**
 * <p>This class contains static procedures for processing all needed kinds of responses.</p>
 * <p>2017 Intretech Inc. All rights reserved.</p>
 */
@ParametersAreNonnullByDefault
public final class ResponseHandler_2019_1 {

	public static void processCustomerWriteResponse(WriteResponse response, Customer customer) {
		if (response.getStatus().isIsSuccess()) {
			printWithEmptyLine(SUCCESSFUL_SAVING_CUSTOMER);
			printMap(new Fields(response, customer));
		} else {
			printError(FAILED_SAVING_CUSTOMER + response.getStatus().getStatusDetail(0).getMessage());
		}
	}

	public static void processCustomerWriteResponseList(WriteResponseList responseList, List<Customer> customers) {
		WriteResponse[] responses = responseList.getWriteResponse();
		Map<WriteResponse, Customer> successfulResponses = new LinkedHashMap<>();
		Map<WriteResponse, Customer> failedResponses = new LinkedHashMap<>();

		for (int i = 0; i < responses.length; i++) {
			final WriteResponse response = responses[i];
			final Customer customer = customers.get(i);

			if (response.getStatus().isIsSuccess()) {
				successfulResponses.put(response, customer);
			} else {
				failedResponses.put(response, customer);
			}
		}

		if (successfulResponses.isEmpty()) {
			printError(NO_CUSTOMERS_UPDATED);
		} else {
			printWithEmptyLine(SUCCESSFULLY_UPDATED_CUSTOMERS);
			for (Map.Entry<WriteResponse, Customer> entry : successfulResponses.entrySet()) {
				final Customer customer = entry.getValue();
				Fields fields = new Fields();
				fields.put(INTERNAL_ID, getInternalId(entry.getKey()));
				fields.put(ENTITY_ID, customer.getEntityId());
				fields.put(COMPANY_NAME, customer.getCompanyName());
				printWithEmptyLine(getIndentedString(CUSTOMER_WITH_INDEX), getCustomersIndex(customer.getInternalId(), customers));
				printMap(fields);
			}
		}

		if (!failedResponses.isEmpty()) {
			printWithEmptyLine(NOT_UPDATED_CUSTOMERS);
			for (Map.Entry<WriteResponse, Customer> entry : failedResponses.entrySet()) {
				final WriteResponse response = entry.getKey();
				final Customer customer = entry.getValue();
				final String internalId = getInternalId(response);
				final String errorMessage = getErrorMessage(response);
				printWithEmptyLine(getIndentedString(CUSTOMER_WITH_INDEX), getCustomersIndex(customer.getInternalId(), customers));
				printMap(new Fields(internalId, errorMessage));
			}
		}
	}

	public static void processCustomerReadResponse(ReadResponse response) {

		if (!response.getStatus().isIsSuccess()) {
			printError("get customer failed: %s", getErrorMessage(response));
			return;
		}
		printWithEmptyLine(RETRIEVED_RECORD);
		printMap(new Fields((Customer) response.getRecord()));
	}

	public static void processCustomerReadResponseList(ReadResponseList responseList, RecordRef[] recordRefs) {
		printWithEmptyLine(RETRIEVED_RECORDS);
		final ReadResponse[] responses = responseList.getReadResponse();
		for (int i = 0; i < responses.length; i++) {
			final ReadResponse response = responses[i];
			printWithEmptyLine(getIndentedString(CUSTOMER_WITH_INDEX), i + 1);
			if (response.getStatus().isIsSuccess()) {
				printMap(new Fields((Customer) response.getRecord()));
			} else {
				final String internalId = recordRefs[i].getInternalId();
				final String errorMessage = getErrorMessage(response);
				printMap(new Fields(internalId, errorMessage));
			}
		}
	}

	public static void processCustomerDeleteList(WriteResponseList responseList, RecordRef[] recordRefs) {
		printWithEmptyLine(RECORDS_WERE_DELETED);
		WriteResponse[] responses = responseList.getWriteResponse();
		for (int i = 0; i < responses.length; i++) {
			printWithEmptyLine(getIndentedString(CUSTOMER_WITH_INDEX), i + 1);
			final WriteResponse response = responses[i];
			if (response.getStatus().isIsSuccess()) {
				printMap(new Fields(getInternalId(response)));
			} else {
				printMap(new Fields(recordRefs[i].getInternalId(), getErrorMessage(response)));
			}
		}
	}

	//vendor start
	public static void processVendorWriteResponse(WriteResponse response, Vendor vendor) {
		if (response.getStatus().isIsSuccess()) {
			printWithEmptyLine(SUCCESSFUL_SAVING_VENDOR);
			printMap(new Fields(response, vendor));
		} else {
			printError(FAILED_SAVING_VENDOR + response.getStatus());
		}
	}

	public static void processVendorWriteResponseList(WriteResponseList responseList, List<Vendor> vendors) {
		WriteResponse[] responses = responseList.getWriteResponse();
		Map<WriteResponse, Vendor> successfulResponses = new LinkedHashMap<>();
		Map<WriteResponse, Vendor> failedResponses = new LinkedHashMap<>();

		for (int i = 0; i < responses.length; i++) {
			final WriteResponse response = responses[i];
			final Vendor vendor = vendors.get(i);
			if (response.getStatus().isIsSuccess()) {
				successfulResponses.put(response, vendor);
			} else {
				failedResponses.put(response, vendor);
			}
		}

		if (successfulResponses.isEmpty()) {
			printError(NO_VENDORS_UPDATED);
		} else {
			printWithEmptyLine(SUCCESSFULLY_UPDATED_VENDORS);
			for (Map.Entry<WriteResponse, Vendor> entry : successfulResponses.entrySet()) {
				final Vendor vendor = entry.getValue();
				Fields fields = new Fields();
				fields.put(INTERNAL_ID, getInternalId(entry.getKey()));
				fields.put(ENTITY_ID, vendor.getEntityId());
				fields.put(COMPANY_NAME, vendor.getCompanyName());
				printWithEmptyLine(getIndentedString(VENDOR_WITH_INDEX), getVendorsIndex(vendor.getInternalId(), vendors));
				printMap(fields);
			}
		}

		if (!failedResponses.isEmpty()) {
			printWithEmptyLine(NOT_UPDATED_VENDORS);
			for (Map.Entry<WriteResponse, Vendor> entry : failedResponses.entrySet()) {
				final WriteResponse response = entry.getKey();
				final Vendor vendor = entry.getValue();
				final String internalId = getInternalId(response);
				final String errorMessage = getErrorMessage(response);
				printWithEmptyLine(getIndentedString(VENDOR_WITH_INDEX), getVendorsIndex(vendor.getInternalId(), vendors));
				printMap(new Fields(internalId, errorMessage));
			}
		}
	}

	public static void processVendorReadResponse(ReadResponse response) {

		if (!response.getStatus().isIsSuccess()) {
			printError("get vendor failed: %s", getErrorMessage(response));
			return;
		}
		printWithEmptyLine(RETRIEVED_RECORD);
		printMap(new Fields((Vendor) response.getRecord()));
	}

	public static void processVendorReadResponseList(ReadResponseList responseList, RecordRef[] recordRefs) {
		printWithEmptyLine(RETRIEVED_RECORDS);
		final ReadResponse[] responses = responseList.getReadResponse();
		for (int i = 0; i < responses.length; i++) {
			final ReadResponse response = responses[i];
			printWithEmptyLine(getIndentedString(VENDOR_WITH_INDEX), i + 1);
			if (response.getStatus().isIsSuccess()) {
				printMap(new Fields((Vendor) response.getRecord()));
			} else {
				final String internalId = recordRefs[i].getInternalId();
				final String errorMessage = getErrorMessage(response);
				printMap(new Fields(internalId, errorMessage));
			}
		}
	}

	public static void processVendorDeleteList(WriteResponseList responseList, RecordRef[] recordRefs) {
		printWithEmptyLine(RECORDS_WERE_DELETED);
		WriteResponse[] responses = responseList.getWriteResponse();
		for (int i = 0; i < responses.length; i++) {
			printWithEmptyLine(getIndentedString(VENDOR_WITH_INDEX), i + 1);
			final WriteResponse response = responses[i];
			if (response.getStatus().isIsSuccess()) {
				printMap(new Fields(getInternalId(response)));
			} else {
				printMap(new Fields(recordRefs[i].getInternalId(), getErrorMessage(response)));
			}
		}
	}
	//vendor end

	public static void processItemWriteResponse(WriteResponse response, InventoryItem item) {
		if (response.getStatus().isIsSuccess()) {
			printWithEmptyLine(ITEM_SUCCESSFULLY_ADDED, item.getItemId());
			printMap(new Fields(getInternalId(response)));
		} else {
			printError(ITEM_WAS_NOT_ADDED, item.getItemId(), getErrorMessage(response));
		}
	}

	public static void processBomWriteResponse(WriteResponse response, Bom bom) {
		if (response.getStatus().isIsSuccess()) {
			printWithEmptyLine(BOM_SUCCESSFULLY_ADDED, bom.getName());
			printMap(new Fields(getInternalId(response)));
		} else {
			printError(BOM_WAS_NOT_ADDED, bom.getName(), getErrorMessage(response));
		}
	}

	public static void processBomRevisionWriteResponse(WriteResponse response, BomRevision bomRev) {
		if (response.getStatus().isIsSuccess()) {
			printWithEmptyLine(BOM_REVISION_SUCCESSFULLY_ADDED, bomRev.getName());
			printMap(new Fields(getInternalId(response)));
		} else {
			printError(BOM_REVISION_WAS_NOT_ADDED, null, getErrorMessage(response));
		}
	}

	public static void processLotNumberedItemWriteResponse(WriteResponse response, LotNumberedInventoryItem item) {
		if (response.getStatus().isIsSuccess()) {
			printWithEmptyLine(ITEM_SUCCESSFULLY_ADDED, item.getItemId());
			printMap(new Fields(getInternalId(response)));
		} else {
			printError(ITEM_WAS_NOT_ADDED, item.getItemId(), getErrorMessage(response));
		}
	}

	//	public static void processOtherChargePurchaseItemSearchResponse(ReadResponse response) {
	//
	//		printWithEmptyLine(RETRIEVED_RECORD);
	//		//for (int i = 0; i < response.size(); i++) {
	//		printList(response);
	//		//}
	//	}
	//	public static void processOtherChargePurchaseItemSearchResponse(ReadResponse response) {
	//
	//		printWithEmptyLine(RETRIEVED_RECORD);
	//		//for (int i = 0; i < response.size(); i++) {
	//		printList(response);
	//		//}
	//	}

	public static void processLotNumberedInventoryItemReadResponse(ReadResponse response) {
		if (!response.getStatus().isIsSuccess()) {
			printError("lotnumbered inventoryitem read failed: %s", getErrorMessage(response));
			return;
		}
		printWithEmptyLine(RETRIEVED_RECORD);
		printMap(new Fields((LotNumberedInventoryItem) response.getRecord()));
	}

	public static void processSalesOrderWriteResponse(WriteResponse response) {
		if (response.getStatus().isIsSuccess()) {
			printWithEmptyLine(SALES_ORDER_CREATED_OR_UPDATED_SUCCESSFULLY);
			printMap(new Fields(getInternalId(response)));
		} else {
			printError(SALES_ORDER_NOT_CREATED_OR_UPDATED, getErrorMessage(response));
		}
	}

	public static ItemFulfillment processInitializeReadResponse(ReadResponse response) {
		if (response.getStatus().isIsSuccess()) {
			printWithEmptyLine(ITEM_FULFILLMENT_RETRIEVED);
			return (ItemFulfillment) response.getRecord();
		} else
			printError(INITIALIZE_OPERATION_FAILED, getErrorMessage(response));
		return null;
	}

	public static void processItemFulfillmentWriteResponse(WriteResponse response, String salesOrderInternalId) {
		if (response.getStatus().isIsSuccess()) {
			printWithEmptyLine(SALES_ORDER_FULFILLED, salesOrderInternalId, getInternalId(response));
		} else {
			printError(SALES_ORDER_NOT_FULFILLED, getErrorMessage(response));
		}
	}

	public static void processPurchaseOrderWriteResponse(WriteResponse response) {
		if (response.getStatus().isIsSuccess()) {
			printWithEmptyLine(PURCHASE_ORDER_CREATED_OR_UPDATED_SUCCESSFULLY);
			printMap(new Fields(getInternalId(response)));
		} else {
			printError(PURCHASE_ORDER_NOT_CREATED_OR_UPDATED, getErrorMessage(response));
		}
	}

	public static void processCustomRecordWriteResponse(WriteResponse response, CustomRecord customRecord) {
		if (response.getStatus().isIsSuccess()) {
			printWithEmptyLine(CUSTOM_RECORD_SUCCESSFULLY_ADDED);
			customRecord.setInternalId(((CustomRecordRef) response.getBaseRef()).getInternalId());
			printMap(new Fields(customRecord));
		} else {
			printError(CUSTOM_RECORD_NOT_ADDED, getErrorMessage(response));
		}
	}

	public static void processCustomRecordWriteResponse(WriteResponse response) {
		if (response.getStatus().isIsSuccess()) {
			printWithEmptyLine(CUSTOM_RECORD_SUCCESSFULLY_DELETED);
			CustomRecordRef customRecordRef = (CustomRecordRef) response.getBaseRef();
			Fields fields = new Fields();
			fields.put(CUSTOM_RECORD_TYPE_ID, customRecordRef.getTypeId());
			fields.put(INTERNAL_ID, customRecordRef.getInternalId());
			printMap(fields);
		} else {
			printError(CUSTOM_RECORD_NOT_DELETED, getErrorMessage(response));
		}
	}

	public static void processFileUploadWriteResponse(WriteResponse response) {
		if (response.getStatus().isIsSuccess()) {
			printWithEmptyLine(FILE_UPLOADED);
			printMap(new Fields(getInternalId(response)));
		} else {
			printError(FILE_NOT_UPLOADED, getErrorMessage(response));
		}
	}

	public static void processSearchResult(SearchResult searchResult, @Nullable String customerName) {
		final boolean isCustomerNameNull = customerName == null;

		if (searchResult == null || (searchResult.getStatus().isIsSuccess() && searchResult.getTotalRecords() == 0)) {
			if (isCustomerNameNull) {
				printWithEmptyLine(NO_SALES_ORDERS_FOUND);
			} else {
				printWithEmptyLine(NO_SALES_ORDERS_WITH_CUSTOMER_FOUND, customerName);
			}
			return;
		}
		if (searchResult.getStatus().isIsSuccess()) {
			final int currentPageIndex = searchResult.getPageIndex();
			final int firstIndexOnCurrentPage = calculateFirstIndexOnPage(searchResult.getPageSize(), currentPageIndex);

			if (currentPageIndex == 1) {
				printWithEmptyLine(SALES_ORDERS_FOUND);
			}

			printSearchResultSummary(searchResult);

			List<SalesOrder> salesOrders;
			if (isCustomerNameNull) {
				salesOrders = Arrays.stream(searchResult.getSearchRowList().getSearchRow()).map(row -> {
					TransactionSearchRowBasic rowBasic = ((TransactionSearchRow) row).getBasic();
					SalesOrder salesOrder = new SalesOrder();
					salesOrder.setInternalId(rowBasic.getInternalId(0).getSearchValue().getInternalId());
					salesOrder.setTranId(rowBasic.getTranId(0).getSearchValue());
					salesOrder.setEntity(rowBasic.getEntity(0).getSearchValue());
					salesOrder.setTotal(rowBasic.getTotal(0).getSearchValue());
					salesOrder.setCreatedDate(rowBasic.getDateCreated(0).getSearchValue());
					return salesOrder;
				}).collect(Collectors.toList());
			} else {
				salesOrders = Arrays.stream(searchResult.getRecordList().getRecord()).map(record -> (SalesOrder) record).collect(Collectors.toList());
			}

			for (int i = 0; i < salesOrders.size(); i++) {
				printSalesOrder(salesOrders.get(i), isCustomerNameNull, firstIndexOnCurrentPage + i);
			}
		} else {
			printError(SEARCH_FAILED, getErrorMessage(searchResult));
		}
	}

	public static void processSearchResult(SearchResult searchResult) {
		if (searchResult == null || (searchResult.getStatus().isIsSuccess() && searchResult.getTotalRecords() == 0)) {
			printWithEmptyLine(NO_CUSTOM_RECORDS_FOUND);
			return;
		}
		if (searchResult.getStatus().isIsSuccess()) {
			final int currentPageIndex = searchResult.getPageIndex();
			final int firstIndexOnCurrentPage = calculateFirstIndexOnPage(searchResult.getPageSize(), currentPageIndex);

			if (currentPageIndex == 1) {
				printWithEmptyLine(CUSTOM_RECORDS_FOUND);
			}

			printSearchResultSummary(searchResult);

			Record[] customRecords = searchResult.getRecordList().getRecord();
			if (customRecords != null)
				for (int i = 0; i < customRecords.length; i++) {
					printWithEmptyLine(CUSTOM_RECORD_WITH_INDEX, firstIndexOnCurrentPage + i);
					printMap(new Fields((CustomRecord) customRecords[i]));
				}
		} else {
			printError(SEARCH_FAILED, getErrorMessage(searchResult));
		}
	}

	public static void processBomSearchResult(SearchResult searchResult) {
		if (searchResult == null || (searchResult.getStatus().isIsSuccess() && searchResult.getTotalRecords() == 0)) {
			printWithEmptyLine(NO_CUSTOM_RECORDS_FOUND);
			return;
		}
		if (searchResult.getStatus().isIsSuccess()) {
			final int currentPageIndex = searchResult.getPageIndex();
			final int firstIndexOnCurrentPage = calculateFirstIndexOnPage(searchResult.getPageSize(), currentPageIndex);

			if (currentPageIndex == 1) {
				printWithEmptyLine(CUSTOM_RECORDS_FOUND);
			}

			printSearchResultSummary(searchResult);

			Record[] bomRecords = searchResult.getRecordList().getRecord();
			if (bomRecords != null)
				for (int i = 0; i < bomRecords.length; i++) {
					printWithEmptyLine(CUSTOM_RECORD_WITH_INDEX, firstIndexOnCurrentPage + i);
					printMap(new Fields((Bom) bomRecords[i]));
				}
		} else {
			printError(SEARCH_FAILED, getErrorMessage(searchResult));
		}
	}

	/**
	 * This is very ineffective way of finding customer's index in collection.
	 * However, we expect just small number of customers which makes this algorithm good enough.
	 *
	 * @param internalId Internal ID of customer whose index should be found
	 * @param customers  List of all customers
	 * @return Index of customer (starting from 1) with given {@code internalId}
	 */
	private static int getCustomersIndex(String internalId, List<Customer> customers) {
		final int invalidIndex = -1;
		if (isEmptyString(internalId)) {
			return invalidIndex;
		}
		for (int i = 0; i < customers.size(); i++) {
			if (internalId.equals(customers.get(i).getInternalId())) {
				return i + 1;
			}
		}
		return invalidIndex;
	}

	/**
	 * This is very ineffective way of finding vendor's index in collection.
	 * However, we expect just small number of vendors which makes this algorithm good enough.
	 *
	 * @param internalId Internal ID of vendor whose index should be found
	 * @param vendors  List of all vendors
	 * @return Index of vendor (starting from 1) with given {@code internalId}
	 */
	private static int getVendorsIndex(String internalId, List<Vendor> vendors) {
		final int invalidIndex = -1;
		if (isEmptyString(internalId)) {
			return invalidIndex;
		}
		for (int i = 0; i < vendors.size(); i++) {
			if (internalId.equals(vendors.get(i).getInternalId())) {
				return i + 1;
			}
		}
		return invalidIndex;
	}

	private static int calculateFirstIndexOnPage(int pageSize, int pageIndex) {
		return pageSize * (pageIndex - 1) + 1;
	}

	private ResponseHandler_2019_1() {
	}
}
