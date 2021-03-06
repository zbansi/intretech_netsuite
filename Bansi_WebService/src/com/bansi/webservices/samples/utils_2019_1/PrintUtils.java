package com.bansi.webservices.samples.utils_2019_1;

import com.netsuite.webservices.lists.accounting_2019_1.BudgetCategory;
import com.netsuite.webservices.lists.accounting_2019_1.Currency;
import com.netsuite.webservices.lists.accounting_2019_1.ItemSearchRow;
import com.netsuite.webservices.lists.accounting_2019_1.State;
import com.netsuite.webservices.lists.marketing_2019_1.CampaignCategory;
import com.netsuite.webservices.platform.common_2019_1.ItemSearchRowBasic;
import com.netsuite.webservices.platform.core_2019_1.Record;
import com.netsuite.webservices.platform.core_2019_1.SearchColumnStringField;
import com.netsuite.webservices.platform.core_2019_1.SearchResult;
import com.netsuite.webservices.transactions.sales_2019_1.SalesOrder;
import com.netsuite.webservices.transactions.sales_2019_1.SalesOrderItem;

import com.bansi.webservices.samples.v2019_1.Fields;
import com.bansi.webservices.samples.io.Logger;

import java.util.List;
import java.util.Map;

import static com.netsuite.suitetalk.client.common.utils.CommonUtils.isEmptyString;
import static com.bansi.webservices.samples.Messages.*;
import static com.bansi.webservices.samples.io.Console.readLine;
import static com.bansi.webservices.samples.utils.IndentationUtils.getIndentedString;
import static com.bansi.webservices.samples.utils.IndentationUtils.getSuitableIndentation;
import static java.lang.String.format;
import static java.lang.String.valueOf;

/**
 * <p>Utils class containing some convenient methods for printing output to the user.</p>
 * <p>© 2017 NetSuite Inc. All rights reserved.</p>
 */
public final class PrintUtils {

	private static final Logger LOG = Logger.getInstance();

	private PrintUtils() {
	}

	public static void print(String message) {
		LOG.info(message);
	}

	public static void print(String format, Object... objects) {
		print(format(format, objects));
	}

	public static void printInfo(String message) {
		LOG.info(message, true);
	}

	public static void printInfoWithEmptyLine(String message) {
		printEmptyLine();
		printInfo(message);
	}

	public static void printEmptyLine() {
		LOG.info(EMPTY_STRING);
	}

	public static void printWithEmptyLine(String message) {
		printEmptyLine();
		print(message);
	}

	public static void printWithEmptyLine(String format, Object... objects) {
		printEmptyLine();
		print(format, objects);
	}

	public static void printPrompt(String prompt) {
		LOG.prompt(prompt + PROMPT);
	}

	public static void printError(String message) {
		printEmptyLine();
		LOG.error(message);
	}

	public static void printError(String format, Object... objects) {
		printError(format(format, objects));
	}

	public static void printSendingRequestMessage() {
		printEmptyLine();
		LOG.info(SENDING_REQUEST, true);
	}

	public static void printInvalidChoiceMessage() {
		printWithEmptyLine(getIndentedString(INVALID_CHOICE));
	}

	public static void printMap(Map<String, String> map) {
		final int indentation = getSuitableIndentation(map.keySet());
		for (Map.Entry<String, String> entry : map.entrySet()) {
			final String value = entry.getValue();
			LOG.info(format("%1$" + indentation + "s = %2$s", entry.getKey(), isEmptyString(value) ? NOT_AVAILABLE : value));
		}
	}

	public static void printMapInline(Map<String, String> map) {
		final String DELIMITER = LIST_ITEM_DELIMITER + SPACE;
		StringBuilder sb = new StringBuilder();
		for (Map.Entry<String, String> entry : map.entrySet()) {
			sb.append(entry.getKey()).append(SPACE).append('=').append(SPACE).append(entry.getValue()).append(DELIMITER);
		}
		if (sb.length() > 0) {
			sb.delete(sb.length() - DELIMITER.length(), sb.length());
		}
		LOG.info(getIndentedString(sb.toString()));
	}

	public static void printSalesOrder(SalesOrder salesOrder, boolean isEntityId, int index) {
		printEmptyLine();
		LOG.info(format(SALES_ORDER_WITH_INDEX, index));
		printMap(new Fields(salesOrder, isEntityId));
		if (salesOrder.getItemList() != null) {
			LOG.info(ITEM_LIST);
			for (SalesOrderItem item : salesOrder.getItemList()) {
				printMapInline(new Fields(item));
			}
		}
	}

	public static void printSearchResultSummary(SearchResult searchResult) {
		Fields summary = new Fields();
		summary.put(TOTAL_RECORDS, valueOf(searchResult.getTotalRecords()));
		summary.put(TOTAL_PAGES, valueOf(searchResult.getTotalPages()));
		summary.put(PAGE_SIZE, valueOf(searchResult.getPageSize()));
		summary.put(PAGE_INDEX, valueOf(searchResult.getPageIndex()));

		printEmptyLine();
		printMap(summary);
	}

	public static void printGetAllRecord(Record record) {
		String internalId = NOT_AVAILABLE;
		String name = NOT_AVAILABLE;
		if (record instanceof BudgetCategory) {
			BudgetCategory budgetCategory = (BudgetCategory) record;
			internalId = budgetCategory.getInternalId();
			name = budgetCategory.getName();
		} else if (record instanceof CampaignCategory) {
			CampaignCategory campaignCategory = (CampaignCategory) record;
			internalId = campaignCategory.getInternalId();
			name = campaignCategory.getName();
		} else if (record instanceof State) {
			State state = (State) record;
			internalId = state.getInternalId();
			name = state.getFullName();
		} else if (record instanceof Currency) {
			Currency currency = (Currency) record;
			internalId = currency.getInternalId();
			name = currency.getName();
		}
		Fields fields = new Fields();
		fields.put(INTERNAL_ID, internalId);
		fields.put(NAME, name);
		printMapInline(fields);
	}

	public static void printItemSearchRowList(ItemSearchRow[] rowList) {

		for (int i = 0; i < rowList.length; i++) {
			ItemSearchRow row = rowList[i];
			ItemSearchRowBasic basic = row.getBasic();
			SearchColumnStringField itemId = basic.getItemId(i);
			LOG.info("Item Id: " + itemId.getSearchValue());
			if (basic.getAssetAccount(0).getSearchValue() != null) {
				String assetAccount = basic.getAssetAccount(0).getSearchValue().toString();
				LOG.info("\tAssetAccount: " + assetAccount);
			}
		}
	}

	public static void printList(List<?> list) {
		String sb = "";
		for (int i = 0; i < list.size(); i++) {
			sb += list.get(i).toString();
		}
		LOG.info("\tList: " + sb);

	}

	public static void waitForEnter() {
		printWithEmptyLine(PRESS_TO_CONTINUE);
		readLine();
	}
}
