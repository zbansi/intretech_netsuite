package com.bansi.webservices.samples.v2018_2;

import com.netsuite.webservices.lists.accounting_2018_2.InventoryItem;
import com.netsuite.webservices.lists.accounting_2018_2.LotNumberedInventoryItem;
import com.netsuite.webservices.lists.relationships_2018_2.Customer;
import com.netsuite.webservices.platform.common_2018_2.TransactionSearchRowBasic;
import com.netsuite.webservices.platform.core_2018_2.CustomRecordRef;
import com.netsuite.webservices.platform.core_2018_2.Record;
import com.netsuite.webservices.platform.core_2018_2.RecordRef;
import com.netsuite.webservices.platform.core_2018_2.SearchResult;
import com.netsuite.webservices.platform.core_2018_2.StatusDetail;
import com.netsuite.webservices.platform.messages_2018_2.ReadResponse;
import com.netsuite.webservices.platform.messages_2018_2.ReadResponseList;
import com.netsuite.webservices.platform.messages_2018_2.WriteResponse;
import com.netsuite.webservices.platform.messages_2018_2.WriteResponseList;
import com.netsuite.webservices.setup.customization_2018_2.CustomRecord;
import com.netsuite.webservices.transactions.sales_2018_2.ItemFulfillment;
import com.netsuite.webservices.transactions.sales_2018_2.SalesOrder;
import com.netsuite.webservices.transactions.sales_2018_2.TransactionSearchRow;
import com.bansi.webservices.samples.v2018_2.Fields;
import com.netsuite.webservices.lists.accounting_2018_2.Bom;

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
import static com.bansi.webservices.samples.utils_2018_2.ParsingUtils.getErrorMessage;
import static com.bansi.webservices.samples.utils_2018_2.ParsingUtils.getInternalId;
import static com.bansi.webservices.samples.utils_2018_2.PrintUtils.*;

/**
 * <p>This class contains static procedures for processing all needed kinds of responses.</p>
 * <p>2017 Intretech Inc. All rights reserved.</p>
 */
@ParametersAreNonnullByDefault
public final class ResponseHandler_2018_2 {

	public static void processCustomerWriteResponse(WriteResponse response, Customer customer) {
		/*
		if (response.getStatus()[0].getAfterSubmitFailed()) {
			printWithEmptyLine(SUCCESSFUL_SAVING_CUSTOMER);
			printMap(new Fields(response, customer));
		} else {
			printError(FAILED_SAVING_CUSTOMER + response.getStatus().getStatusDetail(0).getMessage());
		}
		*/
		Boolean isIsSuccess = true;
		for (StatusDetail sd : response.getStatus()) {
			isIsSuccess = !sd.getAfterSubmitFailed() && isIsSuccess;
		}
		if (isIsSuccess) {
			printWithEmptyLine(SUCCESSFUL_SAVING_CUSTOMER);
			printMap(new Fields(response, customer));
		} else {
			printError(FAILED_SAVING_CUSTOMER + response.getStatus()[0].getMessage());
		}
	}

	public static void processCustomerWriteResponseList(WriteResponseList responseList, List<Customer> customers) {
		WriteResponse[] responses = responseList.getWriteResponse();
		Map<WriteResponse, Customer> successfulResponses = new LinkedHashMap<>();
		Map<WriteResponse, Customer> failedResponses = new LinkedHashMap<>();

		for (int i = 0; i < responses.length; i++) {
			final WriteResponse response = responses[i];
			final Customer customer = customers.get(i);
			Boolean isIsSuccess = true;
			for (StatusDetail sd : response.getStatus()) {
				isIsSuccess = !sd.getAfterSubmitFailed() && isIsSuccess;
			}
			if (isIsSuccess) {
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
		Boolean isIsSuccess = true;
		for (StatusDetail sd : response.getStatus()) {
			isIsSuccess = !sd.getAfterSubmitFailed() && isIsSuccess;
		}
		if (isIsSuccess) {
			printError(response.getStatus()[0].getMessage());
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
			Boolean isIsSuccess = true;
			for (StatusDetail sd : response.getStatus()) {
				isIsSuccess = !sd.getAfterSubmitFailed() && isIsSuccess;
			}
			if (isIsSuccess) {
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
			Boolean isIsSuccess = true;
			for (StatusDetail sd : response.getStatus()) {
				isIsSuccess = !sd.getAfterSubmitFailed() && isIsSuccess;
			}
			if (isIsSuccess) {
				printMap(new Fields(getInternalId(response)));
			} else {
				printMap(new Fields(recordRefs[i].getInternalId(), getErrorMessage(response)));
			}
		}
	}

	public static void processItemWriteResponse(WriteResponse response, InventoryItem item) {
		Boolean isIsSuccess = true;
		for (StatusDetail sd : response.getStatus()) {
			isIsSuccess = !sd.getAfterSubmitFailed() && isIsSuccess;
		}
		if (isIsSuccess) {
			printWithEmptyLine(ITEM_SUCCESSFULLY_ADDED, item.getItemId());
			printMap(new Fields(getInternalId(response)));
		} else {
			printError(ITEM_WAS_NOT_ADDED, item.getItemId(), getErrorMessage(response));
		}
	}

	public static void processBomWriteResponse(WriteResponse response, Bom bom) {
		Boolean isIsSuccess = true;
		for (StatusDetail sd : response.getStatus()) {
			isIsSuccess = !sd.getAfterSubmitFailed() && isIsSuccess;
		}
		if (isIsSuccess) {
			printWithEmptyLine(BOM_SUCCESSFULLY_ADDED, bom.getName());
			printMap(new Fields(getInternalId(response)));
		} else {
			printError(BOM_WAS_NOT_ADDED, bom.getName(), getErrorMessage(response));
		}
	}

	public static void processLotNumberedItemWriteResponse(WriteResponse response, LotNumberedInventoryItem item) {
		Boolean isIsSuccess = true;
		for (StatusDetail sd : response.getStatus()) {
			isIsSuccess = !sd.getAfterSubmitFailed() && isIsSuccess;
		}
		if (isIsSuccess) {
			printWithEmptyLine(ITEM_SUCCESSFULLY_ADDED, item.getItemId());
			printMap(new Fields(getInternalId(response)));
		} else {
			printError(ITEM_WAS_NOT_ADDED, item.getItemId(), getErrorMessage(response));
		}
	}

	public static void processOtherChargePurchaseItemSearchResponse(List<?> response) {

		printWithEmptyLine(RETRIEVED_RECORD);
		//for (int i = 0; i < response.size(); i++) {
		printList(response);
		//}
	}

	public static void processLotNumberedInventoryItemReadResponse(ReadResponse response) {
		Boolean isIsSuccess = true;
		for (StatusDetail sd : response.getStatus()) {
			isIsSuccess = !sd.getAfterSubmitFailed() && isIsSuccess;
		}
		if (!isIsSuccess) {
			printError("lotnumbered inventoryitem read failed", getErrorMessage(response));
			return;
		}
		printWithEmptyLine(RETRIEVED_RECORD);
		printMap(new Fields((LotNumberedInventoryItem) response.getRecord()));
	}

	public static void processSalesOrderWriteResponse(WriteResponse response) {
		Boolean isIsSuccess = true;
		for (StatusDetail sd : response.getStatus()) {
			isIsSuccess = !sd.getAfterSubmitFailed() && isIsSuccess;
		}
		if (isIsSuccess) {
			printWithEmptyLine(SALES_ORDER_CREATED_OR_UPDATED_SUCCESSFULLY);
			printMap(new Fields(getInternalId(response)));
		} else {
			printError(SALES_ORDER_NOT_CREATED_OR_UPDATED, getErrorMessage(response));
		}
	}

	public static ItemFulfillment processInitializeReadResponse(ReadResponse response) {
		Boolean isIsSuccess = true;
		for (StatusDetail sd : response.getStatus()) {
			isIsSuccess = !sd.getAfterSubmitFailed() && isIsSuccess;
		}
		if (isIsSuccess) {
			printWithEmptyLine(ITEM_FULFILLMENT_RETRIEVED);
			return (ItemFulfillment) response.getRecord();
		}
		printError(INITIALIZE_OPERATION_FAILED, getErrorMessage(response));
		return null;
	}

	public static void processItemFulfillmentWriteResponse(WriteResponse response, String salesOrderInternalId) {
		Boolean isIsSuccess = true;
		for (StatusDetail sd : response.getStatus()) {
			isIsSuccess = !sd.getAfterSubmitFailed() && isIsSuccess;
		}
		if (isIsSuccess) {
			printWithEmptyLine(SALES_ORDER_FULFILLED, salesOrderInternalId, getInternalId(response));
		} else {
			printError(SALES_ORDER_NOT_FULFILLED, getErrorMessage(response));
		}
	}

	public static void processCustomRecordWriteResponse(WriteResponse response, CustomRecord customRecord) {
		Boolean isIsSuccess = true;
		for (StatusDetail sd : response.getStatus()) {
			isIsSuccess = !sd.getAfterSubmitFailed() && isIsSuccess;
		}
		if (isIsSuccess) {
			printWithEmptyLine(CUSTOM_RECORD_SUCCESSFULLY_ADDED);
			customRecord.setInternalId(((CustomRecordRef) response.getBaseRef()).getInternalId());
			printMap(new Fields(customRecord));
		} else {
			printError(CUSTOM_RECORD_NOT_ADDED, getErrorMessage(response));
		}
	}

	public static void processCustomRecordWriteResponse(WriteResponse response) {
		Boolean isIsSuccess = true;
		for (StatusDetail sd : response.getStatus()) {
			isIsSuccess = !sd.getAfterSubmitFailed() && isIsSuccess;
		}
		if (isIsSuccess) {
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
		Boolean isIsSuccess = true;
		for (StatusDetail sd : response.getStatus()) {
			isIsSuccess = !sd.getAfterSubmitFailed() && isIsSuccess;
		}
		if (isIsSuccess) {
			printWithEmptyLine(FILE_UPLOADED);
			printMap(new Fields(getInternalId(response)));
		} else {
			printError(FILE_NOT_UPLOADED, getErrorMessage(response));
		}
	}

	public static void processSearchResult(SearchResult searchResult, @Nullable String customerName) {
		final boolean isCustomerNameNull = customerName == null;
		Boolean isIsSuccess = true;
		for (StatusDetail sd : searchResult.getStatus()) {
			isIsSuccess = !sd.getAfterSubmitFailed() && isIsSuccess;
		}

		if (searchResult == null || (isIsSuccess && searchResult.getTotalRecords() == 0)) {
			if (isCustomerNameNull) {
				printWithEmptyLine(NO_SALES_ORDERS_FOUND);
			} else {
				printWithEmptyLine(NO_SALES_ORDERS_WITH_CUSTOMER_FOUND, customerName);
			}
			return;
		}
		if (isIsSuccess) {
			final int currentPageIndex = searchResult.getPageIndex();
			final int firstIndexOnCurrentPage = calculateFirstIndexOnPage(searchResult.getPageSize(), currentPageIndex);

			if (currentPageIndex == 1) {
				printWithEmptyLine(SALES_ORDERS_FOUND);
			}

			printSearchResultSummary(searchResult);

			List<SalesOrder> salesOrders;
			if (isCustomerNameNull) {
				salesOrders = Arrays.stream(searchResult.getSearchRowList()).map(row -> {
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
				salesOrders = Arrays.stream(searchResult.getRecordList()).map(record -> (SalesOrder) record).collect(Collectors.toList());
			}

			for (int i = 0; i < salesOrders.size(); i++) {
				printSalesOrder(salesOrders.get(i), isCustomerNameNull, firstIndexOnCurrentPage + i);
			}
		} else {
			printError(SEARCH_FAILED, getErrorMessage(searchResult));
		}
	}

	public static void processSearchResult(SearchResult searchResult) {
		Boolean isIsSuccess = true;
		for (StatusDetail sd : searchResult.getStatus()) {
			isIsSuccess = !sd.getAfterSubmitFailed() && isIsSuccess;
		}
		if (searchResult == null || (isIsSuccess && searchResult.getTotalRecords() == 0)) {
			printWithEmptyLine(NO_CUSTOM_RECORDS_FOUND);
			return;
		}
		if (isIsSuccess) {
			final int currentPageIndex = searchResult.getPageIndex();
			final int firstIndexOnCurrentPage = calculateFirstIndexOnPage(searchResult.getPageSize(), currentPageIndex);

			if (currentPageIndex == 1) {
				printWithEmptyLine(CUSTOM_RECORDS_FOUND);
			}

			printSearchResultSummary(searchResult);

			Record[] customRecords = searchResult.getRecordList();
			for (int i = 0; i < customRecords.length; i++) {
				printWithEmptyLine(CUSTOM_RECORD_WITH_INDEX, firstIndexOnCurrentPage + i);
				printMap(new Fields((CustomRecord) customRecords[i]));
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

	private static int calculateFirstIndexOnPage(int pageSize, int pageIndex) {
		return pageSize * (pageIndex - 1) + 1;
	}

	private ResponseHandler_2018_2() {
	}
}
