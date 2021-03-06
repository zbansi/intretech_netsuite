package com.bansi.webservices.samples.v2019_1;

import com.bansi.webservices.samples.v2019_1.WsClient_2019_1;
import com.bansi.webservices.samples.Operation;
import com.bansi.webservices.samples.utils_2019_1.PrintUtils;
import com.bansi.webservices.samples.v2019_1.Utils;
import com.netsuite.webservices.documents.filecabinet_2019_1.File;
import com.netsuite.webservices.documents.filecabinet_2019_1.types.FileAttachFrom;
import com.netsuite.webservices.lists.accounting_2019_1.InventoryItem;
import com.netsuite.webservices.lists.accounting_2019_1.ItemSearch;
import com.netsuite.webservices.lists.accounting_2019_1.ItemSearchAdvanced;
import com.netsuite.webservices.lists.accounting_2019_1.LotNumberedInventoryItem;
import com.netsuite.webservices.lists.accounting_2019_1.Price;
import com.netsuite.webservices.lists.accounting_2019_1.PriceList;
import com.netsuite.webservices.lists.accounting_2019_1.Pricing;
import com.netsuite.webservices.lists.accounting_2019_1.PricingMatrix;
import com.netsuite.webservices.lists.accounting_2019_1.types.ItemCostingMethod;
import com.netsuite.webservices.lists.relationships_2019_1.Customer;
import com.netsuite.webservices.lists.relationships_2019_1.CustomerAddressbook;
import com.netsuite.webservices.lists.relationships_2019_1.CustomerAddressbookList;
import com.netsuite.webservices.lists.relationships_2019_1.CustomerSearch;
import com.netsuite.webservices.lists.relationships_2019_1.CustomerSearchAdvanced;
import com.netsuite.webservices.lists.relationships_2019_1.CustomerSearchRow;
import com.netsuite.webservices.lists.relationships_2019_1.Vendor;
import com.netsuite.webservices.lists.relationships_2019_1.VendorSearch;
import com.netsuite.webservices.lists.relationships_2019_1.types.EmailPreference;
import com.netsuite.webservices.platform.common_2019_1.Address;
import com.netsuite.webservices.platform.common_2019_1.BomSearchBasic;
import com.netsuite.webservices.platform.common_2019_1.CustomRecordSearchBasic;
import com.netsuite.webservices.platform.common_2019_1.CustomerSearchBasic;
import com.netsuite.webservices.platform.common_2019_1.CustomerSearchRowBasic;
import com.netsuite.webservices.platform.common_2019_1.ItemSearchBasic;
import com.netsuite.webservices.platform.common_2019_1.TransactionSearchBasic;
import com.netsuite.webservices.platform.common_2019_1.TransactionSearchRowBasic;
import com.netsuite.webservices.platform.common_2019_1.VendorSearchBasic;
import com.netsuite.webservices.platform.common_2019_1.types.Country;
import com.netsuite.webservices.platform.core_2019_1.*;
import com.netsuite.webservices.platform.core_2019_1.types.GetAllRecordType;
import com.netsuite.webservices.platform.core_2019_1.types.InitializeRefType;
import com.netsuite.webservices.platform.core_2019_1.types.InitializeType;
import com.netsuite.webservices.platform.core_2019_1.types.RecordType;
import com.netsuite.webservices.platform.core_2019_1.types.SearchDateFieldOperator;
import com.netsuite.webservices.platform.core_2019_1.types.SearchEnumMultiSelectFieldOperator;
import com.netsuite.webservices.platform.core_2019_1.types.SearchMultiSelectFieldOperator;
import com.netsuite.webservices.platform.core_2019_1.types.SearchStringFieldOperator;
import com.netsuite.webservices.platform.messages_2019_1.ReadResponse;
import com.netsuite.webservices.platform.messages_2019_1.ReadResponseList;
import com.netsuite.webservices.platform.messages_2019_1.SearchPreferences;
import com.netsuite.webservices.platform.messages_2019_1.WriteResponse;
import com.netsuite.webservices.platform.messages_2019_1.WriteResponseList;
import com.netsuite.webservices.setup.customization_2019_1.CustomRecord;
import com.netsuite.webservices.transactions.purchases_2019_1.PurchaseOrder;
import com.netsuite.webservices.transactions.purchases_2019_1.PurchaseOrderItem;
import com.netsuite.webservices.transactions.purchases_2019_1.PurchaseOrderItemList;
import com.netsuite.webservices.transactions.purchases_2019_1.types.PurchaseOrderOrderStatus;
import com.netsuite.webservices.transactions.sales_2019_1.ItemFulfillment;
import com.netsuite.webservices.transactions.sales_2019_1.SalesOrder;
import com.netsuite.webservices.transactions.sales_2019_1.SalesOrderItem;
import com.netsuite.webservices.transactions.sales_2019_1.SalesOrderItemList;
import com.netsuite.webservices.transactions.sales_2019_1.TransactionSearch;
import com.netsuite.webservices.transactions.sales_2019_1.TransactionSearchAdvanced;
import com.netsuite.webservices.transactions.sales_2019_1.TransactionSearchRow;
import com.netsuite.webservices.transactions.sales_2019_1.types.SalesOrderOrderStatus;
import com.netsuite.webservices.lists.accounting_2019_1.AssemblyItem;
import com.netsuite.webservices.lists.accounting_2019_1.Bom;
import com.netsuite.webservices.lists.accounting_2019_1.BomRevision;
import com.netsuite.webservices.lists.accounting_2019_1.BomRevisionComponent;
import com.netsuite.webservices.lists.accounting_2019_1.BomRevisionComponentList;

import org.apache.axis.AxisFault;

import javax.annotation.ParametersAreNonnullByDefault;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import static com.netsuite.suitetalk.client.common.utils.CommonUtils.isEmptyString;
import static com.bansi.webservices.samples.v2019_1.Utils.createRecordRef;
import static com.bansi.webservices.samples.Messages.*;
import static com.bansi.webservices.samples.v2019_1.ResponseHandler_2019_1.*;
import static com.bansi.webservices.samples.io.Console.readLine;
import static com.bansi.webservices.samples.utils_2019_1.PrintUtils.*;
import static com.bansi.webservices.samples.utils.IndentationUtils.getIndentedString;
import static com.bansi.webservices.samples.utils.StringUtils.getBoolean;
import static com.bansi.webservices.samples.utils.StringUtils.getListItems;
import static com.bansi.webservices.samples.utils.StringUtils.getRandomString;
import static java.lang.String.format;

/**
 * <p>Displays a list of all sample operations and invokes the selected operation by the user.</p>
 * <p>2017 Intretech Inc. All rights reserved.</p>
 */
@ParametersAreNonnullByDefault
public class SampleOperations_2019_1 {

	private static final int DEFAULT_PAGE_SIZE = 1000;
	private static final int PAGE_SIZE = 10;

	private static final Map<String, Operation> SAMPLE_OPERATIONS = new LinkedHashMap<>();

	private WsClient_2019_1 client;

	/**
	 * Constructor initializing a list of all sample operations.
	 *
	 * @param client Client used for all SOAP requests
	 */
	public SampleOperations_2019_1(WsClient_2019_1 client) {
		this.client = client;
		// All possible sample operations
		//Item
		addInventoryItem();
		addLotNumberedInventoryItem();
		getInventoryItem();
		getAssemblyItem();
		searchItems();
		searchForSavedSearchItemRecord();
		searchForLastModifedItemRecord();
		upsertAssemblyItem();
		deleteAssemblyItem();
		//BOM
		addBom();
		addBomRevision();
		updateBom();
		getBom();
		searchBom();
		deleteBom();
		//customer
		addCustomer();
		addCustomerWithCustomFields();
		updateCustomer();
		upsertCustomer();
		updateListOfCustomers();
		getCustomer();
		getListOfCustomers();
		searchCustomers();
		deleteListOfCustomers();
		//vendor
		addVendor();
		addVendorWithCustomFields();
		updateVendor();
		upsertVendor();
		updateListOfVendors();
		getVendor();
		getListOfVendors();
		searchVendors();
		deleteListOfVendors();
		//sales order
		addSalesOrder();
		updateSalesOrder();
		searchSalesOrders();
		advancedSearchSalesOrders();
		//sales order transaction
		fulfillSalesOrder();

		//purchase order
		addPurchaseOrder();
		updatePurchaseOrder();
		searchPurchaseOrders();
		advancedSearchPurchaseOrders();
		//purchase order transaction
		receiptPurchaseOrder();

		//work order

		addCustomRecord();
		searchCustomRecord();
		deleteCustomRecord();

		getOtherListValues();
		uploadFile();
		getSelectFieldValues();
	}

	/**
	 * Starts selection of sample operation.
	 */
	public void run() {
		OptionList<Operation> operationList = new OptionList<>(MAKE_SELECTION, SAMPLE_OPERATIONS);
		operationList.setQuitOption(QUIT_CHARACTER, QUIT);

		Operation operation;
		while ((operation = operationList.displayAndGetUserChoice()) != null) {
			try {
				operation.performOperation();
			} catch (AxisFault axisFault) {
				// Handling of unexpected error
				printError(axisFault.getFaultString());
			} catch (RemoteException e) {
				printError(e.getMessage());
			}
			waitForEnter();
		}

		printWithEmptyLine(PRESS_TO_QUIT);
		readLine();
	}

	private void searchItems() {
		SAMPLE_OPERATIONS.put(SEARCH_ITEM_RECORDS, () -> {
			ItemSearchBasic isb = new ItemSearchBasic();
			//			SearchPreferences sp = new SearchPreferences();
			//			sp.setBodyFieldsOnly(false);
			SearchStringField name = new SearchStringField();
			name.setOperator(SearchStringFieldOperator.contains);
			name.setSearchValue("TEST");
			isb.setDisplayName(name);
			//invoke search() web services operation
			SearchResult response = client.callSearch(isb);
			//process response
			if (isSuccessfulSearchResult(response)) {
				printInfo("Success");
			} else {
				printError("error");
			}
		});
	}

	/**
	 * Demonstrates how to search saved search Item records from NetSuite.
	 */
	private void searchForSavedSearchItemRecord() {
		SAMPLE_OPERATIONS.put(SEARCH_FOR_SAVED_SEARCH_ITEM_RECORDS, () -> {
			printSendingRequestMessage();
			ItemSearchAdvanced itemSearch = new ItemSearchAdvanced();
			itemSearch.setSavedSearchId("274");
			client.search(itemSearch);
		});
	}

	/**
	 * Demonstrates how to search Last Modified Item records from NetSuite.
	 */
	private void searchForLastModifedItemRecord() {
		SAMPLE_OPERATIONS.put(GET_LAST_MODIFIED_ITEM_RECORDS, () -> {
			//printWithEmptyLine(ENTER_ITEM_SYNC_METHOD);
			//String itemSyncMethod = readLine(ITEM_SYNC_METHOD);			
			//printWithEmptyLine(ENTER_ITEM_SAVED_SEARCH_ID);
			//String savedSearchId = readLine(ITEM_SAVED_SEARCH_ID);	
			printSendingRequestMessage();
			//if (itemSyncMethod == "All") {
			// create search object
			ItemSearchAdvanced itemSearch = new ItemSearchAdvanced();
			//set saved search id
			itemSearch.setSavedSearchId("274");
			client.search(itemSearch);
			// perform the search			
			//List result = client.search(itemSearch);
			// Process the response
			//processOtherChargePurchaseItemSearchResponse(result);
			//} else if (itemSyncMethod == "Increase") {
			//}			

		});
	}

	private void getInventoryItem() {
		SAMPLE_OPERATIONS.put(GET_ITEM, () -> {
			printWithEmptyLine(ENTER_ITEM_NUMBER);

			String internalId = readLine(ITEM_NUMBER);
			printSendingRequestMessage();

			// Invoke the get() operation to retrieve the record
			ReadResponse response = client.callGetRecord(createRecordRef(internalId, RecordType.lotNumberedInventoryItem));
			// Process the response
			processLotNumberedInventoryItemReadResponse(response);
		});
	}

	private void getAssemblyItem() {
		SAMPLE_OPERATIONS.put(GET_ASSEMBLY_ITEM, () -> {
			printWithEmptyLine(ENTER_ITEM_NUMBER);

			String internalId = readLine(ITEM_NUMBER);
			printSendingRequestMessage();

			// Invoke the get() operation to retrieve the record
			ReadResponse response = client.callGetRecord(createRecordRef(internalId, RecordType.assemblyItem));
			// Process the response
			//processAssemblyItemReadResponse(response);
		});
	}

	/**
	 * Demonstrates how to add an Inventory Item record into NetSuite using the {@code add()} operation.
	 */
	private void addInventoryItem() {
		SAMPLE_OPERATIONS.put(ADD_INVENTORY_ITEM, () -> {
			printWithEmptyLine(ENTER_INFORMATION_FOR_ITEM);

			InventoryItem inventoryItem = new InventoryItem();
			inventoryItem.setItemId(readLine(getIndentedString(ITEM_NAME), null));

			String costingMethodInput = readLine(getIndentedString(COSTING_METHOD)).trim();
			ItemCostingMethod itemCostingMethod = null;
			switch (costingMethodInput) {
			case "1":
				itemCostingMethod = ItemCostingMethod._average;
				break;
			case "2":
				itemCostingMethod = ItemCostingMethod._fifo;
				break;
			case "3":
				itemCostingMethod = ItemCostingMethod._lifo;
				break;
			}
			inventoryItem.setCostingMethod(itemCostingMethod);

			inventoryItem.setTaxSchedule(createRecordRef("1"));

			inventoryItem.setCogsAccount(createRecordRef("223"));
			inventoryItem.setAssetAccount(createRecordRef("242"));

			// Setting pricing matrix
			String number = null;
			try {
				Price price = new Price();
				number = readLine(getIndentedString(BASE_PRICE_WITH_EXAMPLE)).trim();
				price.setValue(Double.parseDouble(number));
				number = readLine(getIndentedString(QUANTITY_WITH_EXAMPLE)).trim();
				price.setQuantity(Double.parseDouble(number));

				Pricing pricing = new Pricing();
				pricing.setCurrency(createRecordRef("1"));
				pricing.setDiscount(0.0);
				pricing.setPriceLevel(createRecordRef("1"));
				pricing.setPriceList(new PriceList(new Price[] { price }));

				PricingMatrix pricingMatrix = new PricingMatrix();
				pricingMatrix.setPricing(new Pricing[] { pricing });

				inventoryItem.setPricingMatrix(pricingMatrix);
			} catch (NumberFormatException nfe) {
				printError(format(INVALID_NUMBER + SPACE + ITEM_WITHOUT_PRICING_MATRIX, number));
			}

			printSendingRequestMessage();

			// Invoke add() operation
			WriteResponse response = client.callAddRecord(inventoryItem);

			// Process the response
			processItemWriteResponse(response, inventoryItem);
		});
	}

	/**
	 * Demonstrates how to add an Inventory Item record into NetSuite using the {@code add()} operation.
	 */
	private void addLotNumberedInventoryItem() {
		SAMPLE_OPERATIONS.put(ADD_LOTNUMBERED_INVENTORY_ITEM, () -> {
			printWithEmptyLine(ENTER_INFORMATION_FOR_ITEM);

			LotNumberedInventoryItem lotNumberedInventoryItem = new LotNumberedInventoryItem();

			lotNumberedInventoryItem.setItemId(readLine(getIndentedString(ITEM_NAME), null));

			String costingMethodInput = readLine(getIndentedString(COSTING_METHOD)).trim();
			ItemCostingMethod itemCostingMethod = null;
			switch (costingMethodInput) {
			case "1":
				itemCostingMethod = ItemCostingMethod._average;
				break;
			case "2":
				itemCostingMethod = ItemCostingMethod._fifo;
				break;
			case "3":
				itemCostingMethod = ItemCostingMethod._lifo;
				break;
			}
			lotNumberedInventoryItem.setCostingMethod(itemCostingMethod);
			lotNumberedInventoryItem.setTaxSchedule(createRecordRef("1"));
			lotNumberedInventoryItem.setCogsAccount(createRecordRef("223"));
			lotNumberedInventoryItem.setAssetAccount(createRecordRef("242"));
			printSendingRequestMessage();

			// Invoke add() operation
			WriteResponse response = client.callAddRecord(lotNumberedInventoryItem);

			// Process the response
			processLotNumberedItemWriteResponse(response, lotNumberedInventoryItem);
		});
	}

	private void upsertAssemblyItem() {
		SAMPLE_OPERATIONS.put(UPSERT_ASSEMBLY_ITEM, () -> {
			printWithEmptyLine(ENTER_INFORMATION_FOR_ITEM);
			AssemblyItem item = new AssemblyItem();
			String externalId = readLine(getIndentedString(EXTERNAL_ID)).trim();
			item.setExternalId(externalId);
			String itemId = readLine(getIndentedString(ITEM_NAME)).trim();
			item.setItemId(itemId);
			item.setDisplayName("suitetalk test item name: " + getRandomString());

			String costingMethodInput = readLine(getIndentedString(COSTING_METHOD)).trim();
			ItemCostingMethod itemCostingMethod = null;
			switch (costingMethodInput) {
			case "1":
				itemCostingMethod = ItemCostingMethod._average;
				break;
			case "2":
				itemCostingMethod = ItemCostingMethod._fifo;
				break;
			case "3":
				itemCostingMethod = ItemCostingMethod._lifo;
				break;
			}
			item.setCostingMethod(itemCostingMethod);
			item.setTaxSchedule(createRecordRef("1"));
			item.setCogsAccount(createRecordRef("223"));
			item.setAssetAccount(createRecordRef("242"));
			printSendingRequestMessage();

			// Invoke add() operation
			WriteResponse response = client.callUpsertRecord(item);

			// Process the response
			//processUpsertAssemblyItemWriteResponse(response, item);

		});
	}

	private void deleteAssemblyItem() {
		SAMPLE_OPERATIONS.put(DELETE_ASSEMBLY_ITEM, () -> {
			printWithEmptyLine(ENTER_INFORMATION_FOR_ITEM);
			RecordRef recRef = new RecordRef();
			String internalId = readLine(getIndentedString(INTERNAL_ID)).trim();
			recRef.setInternalId(internalId);

			recRef.setType(RecordType.assemblyItem);

			printSendingRequestMessage();

			// Invoke add() operation
			WriteResponse response = client.callDeleteRecord(recRef, null);

			// Process the response
			//processUpsertAssemblyItemWriteResponse(response, item);
		});
	}

	/*
	 * Test Status: success
	 */
	private void addBom() {

		SAMPLE_OPERATIONS.put(ADD_BOM, () -> {
			printWithEmptyLine(ENTER_INFORMATION_FOR_BOM);

			Bom bomRec = new Bom();
			bomRec.setName(readLine(getIndentedString(BOM_NAME), null));
			bomRec.setIsInactive(false);
			bomRec.setUseComponentYield(true);

			//very BOM restrict to an Assembly			
			bomRec.setAvailableForAllAssemblies(false);
			RecordRef assembly = new RecordRef();
			RecordRefList restrictToAssembiesList = new RecordRefList();
			String assemblyInternalId = readLine(getIndentedString("key in assemblyInternalId"), "");
			if (!assemblyInternalId.isEmpty()) {
				assembly = createRecordRef(assemblyInternalId);
				assembly.setType(RecordType.lotNumberedAssemblyItem);
				restrictToAssembiesList.setRecordRef(new RecordRef[] { assembly });
				bomRec.setRestrictToAssembliesList(restrictToAssembiesList);

			} else
				bomRec.setAvailableForAllAssemblies(false);

			//
			bomRec.setAvailableForAllLocations(true);
			bomRec.setMemo("list of ingredients");
			printSendingRequestMessage();

			WriteResponse response = client.addBOMRecord(bomRec);

			// Process the response
			processBomWriteResponse(response, bomRec);
		});
	}

	/*
	 * Test status: success
	 */
	private void addBomRevision() {
		SAMPLE_OPERATIONS.put(ADD_BOM_REVISION, () -> {
			printWithEmptyLine(ENTER_INFORMATION_FOR_BOM_REVISION);
			RecordRef bomRef = new RecordRef();
			bomRef.setInternalId("101");

			BomRevisionComponent bomComp = new BomRevisionComponent();
			bomComp.setItem(createRecordRef("13"));
			bomComp.setBomQuantity(3.0);
			bomComp.setComponentYield(99.9);
			BomRevisionComponent[] comps = new BomRevisionComponent[] { bomComp };
			BomRevisionComponentList compList = new BomRevisionComponentList();
			compList.setBomRevisionComponent(comps);

			BomRevision bomRev = new BomRevision();
			bomRev.setName("List of ingredients - revision 1");
			bomRev.setIsInactive(true);
			bomRev.setMemo("New revision");
			bomRev.setEffectiveStartDate(new GregorianCalendar(2019, 1, 1));
			bomRev.setBillOfMaterials(bomRef);
			bomRev.setComponentList(compList);
			WriteResponse response = client.addBOMRevisionRecord(bomRev);
			// Process the response
			processBomRevisionWriteResponse(response, bomRev);

		});
	}

	/*
	 * Test Status: success
	 */
	private void updateBom() {
		SAMPLE_OPERATIONS.put(UPDATE_BOM, () -> {
			printWithEmptyLine(ENTER_INFORMATION_FOR_BOM);
			Bom bomRec = new Bom();
			// Get internal ID and entity ID for update
			bomRec.setInternalId(readLine(getIndentedString(INTERNAL_ID)).trim());
			bomRec.setName(readLine(getIndentedString(ENTITY_NAME), null));
			// Update some fields
			String randomString = getRandomString();
			bomRec.setMemo(randomString + " SuiteTalk test added.");

			// Add a bom revision

			// Add a component

			WriteResponse response = client.callUpdateRecord(bomRec);
			// Process the response
			processBomWriteResponse(response, bomRec);

		});
	}

	/*
	 * Test Status: success
	 */
	private void getBom() {
		SAMPLE_OPERATIONS.put(GET_BOM, () -> {
			printWithEmptyLine(ENTER_INFORMATION_FOR_BOM);
			RecordRef bomRec = new RecordRef();
			// Get internal ID and entity ID for update
			bomRec.setType(RecordType.bom);
			bomRec.setInternalId(readLine(getIndentedString(INTERNAL_ID), null));

			ReadResponse response = client.callGetRecord(bomRec);
			// Process the response
			//processBomReadResponse(response, bomRec);

		});
	}

	/*
	 * Test Status: 
	 */
	private void searchBom() {
		SAMPLE_OPERATIONS.put(SEARCH_BOM, () -> {
			printWithEmptyLine(ENTER_INFORMATION_FOR_BOM);
			BomSearchBasic bomsb = new BomSearchBasic();
			SearchStringField name = new SearchStringField();
			name.setOperator(SearchStringFieldOperator.contains);
			name.setSearchValue("test");
			bomsb.setName(name);

			SearchResult response = client.callSearch(bomsb);
			// Process the response
			//processSearchResult(response);

		});
	}

	/*
	 * Test Status: success
	 */
	private void deleteBom() {
		SAMPLE_OPERATIONS.put(DELETE_BOM, () -> {
			printWithEmptyLine(ENTER_INFORMATION_FOR_BOM);
			RecordRef bomRec = new RecordRef();
			// Get internal ID and entity ID for update
			bomRec.setType(RecordType.bom);
			//��֧��external id
			bomRec.setInternalId(readLine(getIndentedString(INTERNAL_ID), null));

			WriteResponse response = client.callDeleteRecord(bomRec, null);
			// Process the response
			//processBomWriteResponse(response, bomRec);

		});
	}

	//CUSTOMER START
	/**
	 * Demonstrates how to add a Customer record into NetSuite using the {@code add()} operation.
	 */
	private void addCustomer() {
		SAMPLE_OPERATIONS.put(ADD_CUSTOMER, () -> {
			printWithEmptyLine(ENTER_CUSTOMER_INFORMATION + SPACE + FIELDS_ALREADY_POPULATED);

			Customer customer = new Customer();

			customer.setCompanyName(readLine(getIndentedString(COMPANY_NAME), null));
			customer.setEntityId(readLine(getIndentedString(ENTITY_NAME), null));
			customer.setExternalId(readLine(getIndentedString(EXTERNAL_ID), null));
			customer.setEmail(readLine(getIndentedString(EMAIL), null));
			customer.setEmailPreference(EmailPreference._hTML);
			RecordRef subsidiary = new RecordRef();
			subsidiary.setInternalId("1");
			subsidiary.setType(RecordType.subsidiary);
			customer.setSubsidiary(subsidiary);

			// Set entity status. The internal ID can be obtained from Setup > Sales > Customer Statuses.
			// The default status is "Closed Won" which has an internal ID of 13.
			String statusInternalId = readLine(getIndentedString(ENTITY_STATUS_INTERNAL_ID), DEFAULT_STATUS_INTERNAL_ID);
			customer.setEntityStatus(createRecordRef(statusInternalId));

			// Create address for this customer
			/*
			Address address = new Address();
			address.setAddressee("");
			address.setAttention("");
			address.setAddr1("Jiahe");
			address.setCity("Xiamen");
			address.setZip("361000");
			address.setState("Fujian Province");
			address.setCountry(Country._china);
			address.setAddr1(readLine(getIndentedString(ADDRESS_1), null));
			address.setAddr2(readLine(getIndentedString(ADDRESS_2), null));
			address.setAddr3(readLine(getIndentedString(ADDRESS_3), null));
			
			setCustomerAddress(customer, address, "Shipping Address", true, true);
			*/
			printSendingRequestMessage();

			// Invoke add() operation
			WriteResponse response = client.callAddRecord(customer);

			// Process the response
			processCustomerWriteResponse(response, customer);
		});
	}

	/**
	 * Demonstrates how to use custom fields when adding a Customer record into NetSuite
	 * using the {@code add()} operation. The custom fields need to be already created in NetSuite
	 * and the script IDs for these fields need to be obtained.
	 */
	private void addCustomerWithCustomFields() {
		SAMPLE_OPERATIONS.put(ADD_CUSTOMER_WITH_CUSTOM_FIELDS, () -> {

			// Prepare list of options for populating custom fields
			final Map<String, Supplier<CustomFieldRef>> customFieldPopulation = new LinkedHashMap<>();

			// For every option, create a custom field of respective type and read and assign value to it.

			customFieldPopulation.put(CUSTOM_FIELD_STRING, () -> {
				StringCustomFieldRef customFieldRef = new StringCustomFieldRef();
				customFieldRef.setScriptId(readLine(getIndentedString(SCRIPT_ID)));
				customFieldRef.setValue(readLine(getIndentedString(CUSTOM_FIELD_VALUE_STRING), "Test Value"));
				return customFieldRef;
			});

			customFieldPopulation.put(CUSTOM_FIELD_BOOLEAN, () -> {
				BooleanCustomFieldRef customFieldRef = new BooleanCustomFieldRef();
				customFieldRef.setScriptId(readLine(getIndentedString(SCRIPT_ID)));
				String readValue = readLine(getIndentedString(CUSTOM_FIELD_VALUE_BOOLEAN), TRUE_SHORT_VALUE).trim();
				customFieldRef.setValue(getBoolean(readValue));
				return customFieldRef;
			});

			customFieldPopulation.put(CUSTOM_FIELD_LIST, () -> {
				SelectCustomFieldRef customFieldRef = new SelectCustomFieldRef();
				customFieldRef.setScriptId(readLine(getIndentedString(SCRIPT_ID)));
				ListOrRecordRef listOrRecordRef = new ListOrRecordRef();
				listOrRecordRef.setInternalId(readLine(getIndentedString(CUSTOM_FIELD_VALUE_LIST)).trim());
				customFieldRef.setValue(listOrRecordRef);
				return customFieldRef;
			});

			customFieldPopulation.put(CUSTOM_FIELD_MULTI_SELECT, () -> {
				MultiSelectCustomFieldRef customFieldRef = new MultiSelectCustomFieldRef();
				customFieldRef.setScriptId(readLine(getIndentedString(SCRIPT_ID)));
				List<String> internalIds = getListItems(readLine(getIndentedString(CUSTOM_FIELD_VALUE_MULTI_SELECT)));
				ListOrRecordRef[] listOrRecordRefs = internalIds.stream().map(internalId -> new ListOrRecordRef(null, internalId, null, null))
						.toArray(ListOrRecordRef[]::new);
				customFieldRef.setValue(listOrRecordRefs);
				return customFieldRef;
			});

			// Create customer and fill its fields
			Customer customer = new Customer();

			String randomId = getRandomString();
			//customer.setEntityId(randomId + " Custom Inc");
			customer.setCompanyName(randomId + " Custom, Inc.");

			printWithEmptyLine(CUSTOM_FIELDS_WARNING);

			// Display options for populating custom fields to user

			OptionList<Supplier<CustomFieldRef>> customFieldOptionList = new OptionList<>(MAKE_CUSTOM_FIELD_SELECTION, customFieldPopulation);
			customFieldOptionList.setQuitOption(QUIT_CHARACTER, QUIT_CUSTOM_FIELDS);

			List<CustomFieldRef> customFieldRefs = new ArrayList<>();

			Supplier<CustomFieldRef> supplier;
			while ((supplier = customFieldOptionList.displayAndGetUserChoice()) != null) {
				printEmptyLine();
				customFieldRefs.add(supplier.get());
			}

			if (customFieldRefs.isEmpty()) {
				printError(NO_CUSTOM_FIELDS_SPECIFIED);
				return;
			}

			CustomFieldList customFieldList = new CustomFieldList();
			customFieldList.setCustomField(customFieldRefs.toArray(new CustomFieldRef[customFieldRefs.size()]));

			printSendingRequestMessage();

			// Invoke add() operation
			WriteResponse response = client.callAddRecord(customer);

			// Process the response
			processCustomerWriteResponse(response, customer);
		});
	}

	/**
	 * Demonstrates how to update an existing Customer record in NetSuite using the {@code update()} operation
	 * which uses an internal ID to reference the record to be updated.
	 */
	private void updateCustomer() {
		SAMPLE_OPERATIONS.put(UPDATE_CUSTOMER, () -> {
			printWithEmptyLine(ENTER_CUSTOMER_INFORMATION_FOR_UPDATE);

			Customer customer = new Customer();

			// Get internal ID and entity ID for update
			customer.setInternalId(readLine(getIndentedString(INTERNAL_ID)).trim());
			customer.setEntityId(readLine(getIndentedString(ENTITY_NAME), null));

			// Update some fields
			String randomString = getRandomString();
			customer.setCompanyName(randomString + " Updated Company Name, Inc.");
			customer.setEmail("company" + randomString + "@example.com");

			// Add a billing address
			/*
			Address address = new Address();
			address.setAddr1("4765 Sunset Blvd");
			address.setCity("San Mateo");
			address.setZip("94401");
			address.setState("CA");
			address.setCountry(Country._unitedStates);
			
			setCustomerAddress(customer, address, "Billing Address", true, false);
			*/
			printSendingRequestMessage();

			// Invoke update() operation
			WriteResponse response = client.callUpdateRecord(customer);

			// Process the response
			processCustomerWriteResponse(response, customer);
		});
	}

	/**
	 * Demonstrates how to Add/Update a Customer record into NetSuite using the {@code upsert()} operation.
	 */
	private void upsertCustomer() {
		SAMPLE_OPERATIONS.put(UPSERT_CUSTOMER, () -> {
			printWithEmptyLine(ENTER_CUSTOMER_INFORMATION + SPACE + FIELDS_ALREADY_POPULATED);

			Customer customer = new Customer();

			customer.setExternalId(readLine(getIndentedString(EXTERNAL_ID)));
			customer.setCompanyName(readLine(getIndentedString(COMPANY_NAME), null));
			customer.setEntityId(readLine(getIndentedString(ENTITY_NAME), null));
			customer.setEmail(readLine(getIndentedString(EMAIL), null));
			customer.setEmailPreference(EmailPreference._hTML);

			// Set entity status. The internal ID can be obtained from Setup > Sales > Customer Statuses.
			// The default status is "Closed Won" which has an internal ID of 13.
			String statusInternalId = readLine(getIndentedString(ENTITY_STATUS_INTERNAL_ID), DEFAULT_STATUS_INTERNAL_ID);
			customer.setEntityStatus(createRecordRef(statusInternalId));

			// Create address for this customer
			/*
			Address address = new Address();
			address.setAddressee("William Sanders");
			address.setAttention("William Sanders");
			address.setAddr1("4765 Sunset Blvd");
			address.setCity("San Francisco");
			address.setZip("94131");
			address.setState("CA");
			address.setCountry(Country._unitedStates);
			
			setCustomerAddress(customer, address, "Shipping Address", false, true);
			*/
			printSendingRequestMessage();

			// Invoke upsert() operation
			WriteResponse response = client.callUpsertRecord(customer);

			// Process the response
			processCustomerWriteResponse(response, customer);
		});
	}

	/**
	 * Demonstrates how to update a list of existing customer records in NetSuite using the updateList() operation.
	 */
	private void updateListOfCustomers() {
		SAMPLE_OPERATIONS.put(UPDATE_LIST_OF_CUSTOMERS, () -> {
			printEmptyLine();

			List<String> internalIds = getListItems(readLine(ENTER_LIST_OF_CUSTOMERS));
			List<Customer> customersToUpdate = new ArrayList<>(internalIds.size());

			String randomString = getRandomString();

			for (int i = 0; i < internalIds.size(); i++) {
				Customer customer = new Customer();
				customer.setInternalId(internalIds.get(i));

				// Update name
				//customer.setEntityId(randomString + " XYZ Inc " + (i + 1));
				customer.setCompanyName(randomString + " XYZ, Inc. " + (i + 1));

				customersToUpdate.add(customer);
			}

			if (customersToUpdate.isEmpty()) {
				printError(NO_VALID_INTERNAL_IDS_FOR_UPDATE_PROVIDED);
			} else {
				printSendingRequestMessage();

				// Invoke updateList() operation to update customers
				WriteResponseList responseList = client.callUpdateRecords(customersToUpdate);

				// Process the response
				processCustomerWriteResponseList(responseList, customersToUpdate);
			}
		});
	}

	/**
	 * Demonstrates how to get an existing record in NetSuite using the get() operation.
	 * 
	 * Test Status: failed
	 */
	private void getCustomer() {
		SAMPLE_OPERATIONS.put(GET_CUSTOMER, () -> {
			printEmptyLine();

			// Prompt for the internal ID
			String internalId = readLine(INTERNAL_ID_TO_GET);

			printSendingRequestMessage();

			// Invoke the get() operation to retrieve the record
			ReadResponse response = client.callGetRecord(createRecordRef(internalId, RecordType.customer));

			// Process the response
			processCustomerReadResponse(response);
		});
	}

	/**
	 * Demonstrates how to get a list of existing records in NetSuite using the getList() operation.
	 */
	private void getListOfCustomers() {
		SAMPLE_OPERATIONS.put(GET_LIST_OF_CUSTOMERS, () -> {
			printEmptyLine();

			// Prompt for list of internal IDs
			List<String> internalIds = getListItems(readLine(INTERNAL_IDS_TO_GET));
			if (internalIds.isEmpty()) {
				printError(NO_VALID_INTERNAL_IDS_FOR_GET_PROVIDED);
				return;
			}

			// Create RecordRef for every internal ID
			RecordRef[] recordRefs = internalIds.stream().map(internalId -> createRecordRef(internalId, RecordType.customer)).toArray(RecordRef[]::new);

			printSendingRequestMessage();

			// Invoke getList() operation to retrieve the records
			ReadResponseList responseList = client.callGetRecords(recordRefs);

			// Process the response
			processCustomerReadResponseList(responseList, recordRefs);
		});
	}

	private void searchCustomers() {
		SAMPLE_OPERATIONS.put(SEARCH_CUSTOMERS, () -> {
			printWithEmptyLine(ENTER_INFORMATION_FOR_CUSTOMER);
			CustomerSearchBasic csb = new CustomerSearchBasic();
			SearchStringField name = new SearchStringField();
			name.setOperator(SearchStringFieldOperator.contains);
			name.setSearchValue("COM");
			csb.setCompanyName(name);

			SearchResult response = client.callSearch(csb);
			// Process the response
			//processSearchResult(response);

		});
	}

	/**
	 * Demonstrates how to delete a list of existing customer records in NetSuite using the deleteList() operation.
	 */
	private void deleteListOfCustomers() {
		SAMPLE_OPERATIONS.put(DELETE_LIST_OF_CUSTOMERS, () -> {
			printEmptyLine();

			// Prompt for list of internal IDs
			List<String> internalIds = getListItems(readLine(INTERNAL_IDS_TO_DELETE));
			if (internalIds.isEmpty()) {
				printError(NO_VALID_INTERNAL_IDS_FOR_DELETE_PROVIDED);
				return;
			}

			// First get the records from NetSuite
			printInfoWithEmptyLine(CHECKING_EXISTENCE_OF_RECORDS);

			List<Customer> records = client
					.getRecords(internalIds.stream().map(internalId -> createRecordRef(internalId, RecordType.customer)).toArray(RecordRef[]::new))
					// Filter just non-null records
					.stream().filter(Objects::nonNull).map(record -> (Customer) record).collect(Collectors.toList());

			if (records == null || records.isEmpty()) {
				printError(NO_VALID_INTERNAL_IDS_FOR_DELETE_PROVIDED);
				return;
			}

			printWithEmptyLine(FOLLOWING_RECORDS_WILL_BE_DELETED);

			for (int i = 0; i < records.size(); i++) {
				printWithEmptyLine(getIndentedString(CUSTOMER_WITH_INDEX), i + 1);
				printMap(new Fields(records.get(i)));
			}

			printEmptyLine();
			boolean isDeletionConfirmed = getBoolean(readLine(DELETE_ALL_RECORDS, "N"));

			if (isDeletionConfirmed) {
				printSendingRequestMessage();
				// Invoke deleteList() operation to delete the records
				RecordRef[] recordRefs = records.stream().map(record -> createRecordRef(record.getInternalId(), RecordType.customer)).toArray(RecordRef[]::new);
				WriteResponseList responseList = client.callDeleteRecords(recordRefs);
				processCustomerDeleteList(responseList, recordRefs);
			} else {
				printInfoWithEmptyLine(RECORDS_WERE_NOT_DELETED);
			}
		});
	}
	//CUSTOMER END

	//VENDOR START
	/**
	 * Demonstrates how to add a Vendor record into NetSuite using the {@code add()} operation.
	 */
	private void addVendor() {
		SAMPLE_OPERATIONS.put(ADD_VENDOR, () -> {
			printWithEmptyLine(ENTER_VENDOR_INFORMATION + SPACE + FIELDS_ALREADY_POPULATED);

			Vendor vendor = new Vendor();

			vendor.setCompanyName(readLine(getIndentedString(COMPANY_NAME), null));
			vendor.setEntityId(readLine(getIndentedString(ENTITY_NAME), null));
			vendor.setExternalId(readLine(getIndentedString(EXTERNAL_ID), null));
			vendor.setEmail(readLine(getIndentedString(EMAIL), null));
			vendor.setEmailPreference(EmailPreference._hTML);
			RecordRef subsidiary = new RecordRef();
			subsidiary.setInternalId("1");
			subsidiary.setType(RecordType.subsidiary);
			vendor.setSubsidiary(subsidiary);

			// Set entity status. The internal ID can be obtained from Setup > Sales > Vendor Statuses.
			// The default status is "Closed Won" which has an internal ID of 13.
			String statusInternalId = readLine(getIndentedString(ENTITY_STATUS_INTERNAL_ID), DEFAULT_STATUS_INTERNAL_ID);

			// Create address for this vendor
			/*
			Address address = new Address();
			address.setAddressee("");
			address.setAttention("");
			address.setAddr1("Jiahe");
			address.setCity("Xiamen");
			address.setZip("361000");
			address.setState("Fujian Province");
			address.setCountry(Country._china);
			address.setAddr1(readLine(getIndentedString(ADDRESS_1), null));
			address.setAddr2(readLine(getIndentedString(ADDRESS_2), null));
			address.setAddr3(readLine(getIndentedString(ADDRESS_3), null));
			
			setVendorAddress(vendor, address, "Shipping Address", true, true);
			*/
			printSendingRequestMessage();

			// Invoke add() operation
			WriteResponse response = client.callAddRecord(vendor);

			// Process the response
			processVendorWriteResponse(response, vendor);
		});
	}

	/**
	 * Demonstrates how to use custom fields when adding a Vendor record into NetSuite
	 * using the {@code add()} operation. The custom fields need to be already created in NetSuite
	 * and the script IDs for these fields need to be obtained.
	 */
	private void addVendorWithCustomFields() {
		SAMPLE_OPERATIONS.put(ADD_VENDOR_WITH_CUSTOM_FIELDS, () -> {

			// Prepare list of options for populating custom fields
			final Map<String, Supplier<CustomFieldRef>> customFieldPopulation = new LinkedHashMap<>();

			// For every option, create a custom field of respective type and read and assign value to it.

			customFieldPopulation.put(CUSTOM_FIELD_STRING, () -> {
				StringCustomFieldRef customFieldRef = new StringCustomFieldRef();
				customFieldRef.setScriptId(readLine(getIndentedString(SCRIPT_ID)));
				customFieldRef.setValue(readLine(getIndentedString(CUSTOM_FIELD_VALUE_STRING), "Test Value"));
				return customFieldRef;
			});

			customFieldPopulation.put(CUSTOM_FIELD_BOOLEAN, () -> {
				BooleanCustomFieldRef customFieldRef = new BooleanCustomFieldRef();
				customFieldRef.setScriptId(readLine(getIndentedString(SCRIPT_ID)));
				String readValue = readLine(getIndentedString(CUSTOM_FIELD_VALUE_BOOLEAN), TRUE_SHORT_VALUE).trim();
				customFieldRef.setValue(getBoolean(readValue));
				return customFieldRef;
			});

			customFieldPopulation.put(CUSTOM_FIELD_LIST, () -> {
				SelectCustomFieldRef customFieldRef = new SelectCustomFieldRef();
				customFieldRef.setScriptId(readLine(getIndentedString(SCRIPT_ID)));
				ListOrRecordRef listOrRecordRef = new ListOrRecordRef();
				listOrRecordRef.setInternalId(readLine(getIndentedString(CUSTOM_FIELD_VALUE_LIST)).trim());
				customFieldRef.setValue(listOrRecordRef);
				return customFieldRef;
			});

			customFieldPopulation.put(CUSTOM_FIELD_MULTI_SELECT, () -> {
				MultiSelectCustomFieldRef customFieldRef = new MultiSelectCustomFieldRef();
				customFieldRef.setScriptId(readLine(getIndentedString(SCRIPT_ID)));
				List<String> internalIds = getListItems(readLine(getIndentedString(CUSTOM_FIELD_VALUE_MULTI_SELECT)));
				ListOrRecordRef[] listOrRecordRefs = internalIds.stream().map(internalId -> new ListOrRecordRef(null, internalId, null, null))
						.toArray(ListOrRecordRef[]::new);
				customFieldRef.setValue(listOrRecordRefs);
				return customFieldRef;
			});

			// Create vendor and fill its fields
			Vendor vendor = new Vendor();

			String randomId = getRandomString();
			//vendor.setEntityId(randomId + " Custom Inc");
			vendor.setCompanyName(randomId + " Custom, Inc.");

			printWithEmptyLine(CUSTOM_FIELDS_WARNING);

			// Display options for populating custom fields to user

			OptionList<Supplier<CustomFieldRef>> customFieldOptionList = new OptionList<>(MAKE_CUSTOM_FIELD_SELECTION, customFieldPopulation);
			customFieldOptionList.setQuitOption(QUIT_CHARACTER, QUIT_CUSTOM_FIELDS);

			List<CustomFieldRef> customFieldRefs = new ArrayList<>();

			Supplier<CustomFieldRef> supplier;
			while ((supplier = customFieldOptionList.displayAndGetUserChoice()) != null) {
				printEmptyLine();
				customFieldRefs.add(supplier.get());
			}

			if (customFieldRefs.isEmpty()) {
				printError(NO_CUSTOM_FIELDS_SPECIFIED);
				return;
			}

			CustomFieldList customFieldList = new CustomFieldList();
			customFieldList.setCustomField(customFieldRefs.toArray(new CustomFieldRef[customFieldRefs.size()]));

			printSendingRequestMessage();

			// Invoke add() operation
			WriteResponse response = client.callAddRecord(vendor);

			// Process the response
			processVendorWriteResponse(response, vendor);
		});
	}

	/**
	 * Demonstrates how to update an existing Vendor record in NetSuite using the {@code update()} operation
	 * which uses an internal ID to reference the record to be updated.
	 */
	private void updateVendor() {
		SAMPLE_OPERATIONS.put(UPDATE_VENDOR, () -> {
			printWithEmptyLine(ENTER_VENDOR_INFORMATION_FOR_UPDATE);

			Vendor vendor = new Vendor();

			// Get internal ID and entity ID for update
			vendor.setInternalId(readLine(getIndentedString(INTERNAL_ID)).trim());
			vendor.setEntityId(readLine(getIndentedString(ENTITY_NAME), null));

			// Update some fields
			String randomString = getRandomString();
			vendor.setCompanyName(randomString + " Updated Company Name, Inc.");
			vendor.setEmail("company" + randomString + "@example.com");

			// Add a billing address
			/*
			Address address = new Address();
			address.setAddr1("4765 Sunset Blvd");
			address.setCity("San Mateo");
			address.setZip("94401");
			address.setState("CA");
			address.setCountry(Country._unitedStates);
			
			setVendorAddress(vendor, address, "Billing Address", true, false);
			*/
			printSendingRequestMessage();

			// Invoke update() operation
			WriteResponse response = client.callUpdateRecord(vendor);

			// Process the response
			processVendorWriteResponse(response, vendor);
		});
	}

	/**
	 * Demonstrates how to Add/Update a Vendor record into NetSuite using the {@code upsert()} operation.
	 */
	private void upsertVendor() {
		SAMPLE_OPERATIONS.put(UPSERT_VENDOR, () -> {
			printWithEmptyLine(ENTER_VENDOR_INFORMATION + SPACE + FIELDS_ALREADY_POPULATED);

			Vendor vendor = new Vendor();

			vendor.setExternalId(readLine(getIndentedString(EXTERNAL_ID)));
			vendor.setCompanyName(readLine(getIndentedString(COMPANY_NAME), null));
			vendor.setEntityId(readLine(getIndentedString(ENTITY_NAME), null));
			vendor.setEmail(readLine(getIndentedString(EMAIL), null));
			vendor.setEmailPreference(EmailPreference._hTML);

			// Set entity status. The internal ID can be obtained from Setup > Sales > Vendor Statuses.
			// The default status is "Closed Won" which has an internal ID of 13.
			String statusInternalId = readLine(getIndentedString(ENTITY_STATUS_INTERNAL_ID), DEFAULT_STATUS_INTERNAL_ID);

			// Create address for this vendor
			/*
			Address address = new Address();
			address.setAddressee("William Sanders");
			address.setAttention("William Sanders");
			address.setAddr1("4765 Sunset Blvd");
			address.setCity("San Francisco");
			address.setZip("94131");
			address.setState("CA");
			address.setCountry(Country._unitedStates);
			
			setVendorAddress(vendor, address, "Shipping Address", false, true);
			*/
			printSendingRequestMessage();

			// Invoke upsert() operation
			WriteResponse response = client.callUpsertRecord(vendor);

			// Process the response
			processVendorWriteResponse(response, vendor);
		});
	}

	/**
	 * Demonstrates how to update a list of existing vendor records in NetSuite using the updateList() operation.
	 */
	private void updateListOfVendors() {
		SAMPLE_OPERATIONS.put(UPDATE_LIST_OF_VENDORS, () -> {
			printEmptyLine();

			List<String> internalIds = getListItems(readLine(ENTER_LIST_OF_VENDORS));
			List<Vendor> vendorsToUpdate = new ArrayList<>(internalIds.size());

			String randomString = getRandomString();

			for (int i = 0; i < internalIds.size(); i++) {
				Vendor vendor = new Vendor();
				vendor.setInternalId(internalIds.get(i));

				// Update name
				//vendor.setEntityId(randomString + " XYZ Inc " + (i + 1));
				vendor.setCompanyName(randomString + " XYZ, Inc. " + (i + 1));

				vendorsToUpdate.add(vendor);
			}

			if (vendorsToUpdate.isEmpty()) {
				printError(NO_VALID_INTERNAL_IDS_FOR_UPDATE_PROVIDED);
			} else {
				printSendingRequestMessage();

				// Invoke updateList() operation to update vendors
				WriteResponseList responseList = client.callUpdateRecords(vendorsToUpdate);

				// Process the response
				processVendorWriteResponseList(responseList, vendorsToUpdate);
			}
		});
	}

	/**
	 * Demonstrates how to get an existing record in NetSuite using the get() operation.
	 * 
	 * Test Status: failed
	 */
	private void getVendor() {
		SAMPLE_OPERATIONS.put(GET_VENDOR, () -> {
			printEmptyLine();

			// Prompt for the internal ID
			String internalId = readLine(INTERNAL_ID_TO_GET);

			printSendingRequestMessage();

			// Invoke the get() operation to retrieve the record
			ReadResponse response = client.callGetRecord(createRecordRef(internalId, RecordType.vendor));

			// Process the response
			processVendorReadResponse(response);
		});
	}

	/**
	 * Demonstrates how to get a list of existing records in NetSuite using the getList() operation.
	 */
	private void getListOfVendors() {
		SAMPLE_OPERATIONS.put(GET_LIST_OF_VENDORS, () -> {
			printEmptyLine();

			// Prompt for list of internal IDs
			List<String> internalIds = getListItems(readLine(INTERNAL_IDS_TO_GET));
			if (internalIds.isEmpty()) {
				printError(NO_VALID_INTERNAL_IDS_FOR_GET_PROVIDED);
				return;
			}

			// Create RecordRef for every internal ID
			RecordRef[] recordRefs = internalIds.stream().map(internalId -> createRecordRef(internalId, RecordType.vendor)).toArray(RecordRef[]::new);

			printSendingRequestMessage();

			// Invoke getList() operation to retrieve the records
			ReadResponseList responseList = client.callGetRecords(recordRefs);

			// Process the response
			processVendorReadResponseList(responseList, recordRefs);
		});
	}

	private void searchVendors() {
		SAMPLE_OPERATIONS.put(SEARCH_VENDORS, () -> {
			printWithEmptyLine(ENTER_INFORMATION_FOR_CUSTOMER);
			VendorSearchBasic vsb = new VendorSearchBasic();
			SearchStringField name = new SearchStringField();
			name.setOperator(SearchStringFieldOperator.contains);
			name.setSearchValue(readLine(getIndentedString(COMPANY_NAME), "����"));
			SearchBooleanField isPerson = new SearchBooleanField();
			isPerson.setSearchValue(false);

			vsb.setIsPerson(isPerson);
			//vsb.setLastName(name);

			SearchResult response = client.callSearch(vsb);
			// Process the response
			//processSearchResult(response);

		});
	}

	/**
	 * Demonstrates how to delete a list of existing vendor records in NetSuite using the deleteList() operation.
	 */
	private void deleteListOfVendors() {
		SAMPLE_OPERATIONS.put(DELETE_LIST_OF_VENDORS, () -> {
			printEmptyLine();

			// Prompt for list of internal IDs
			List<String> internalIds = getListItems(readLine(INTERNAL_IDS_TO_DELETE));
			if (internalIds.isEmpty()) {
				printError(NO_VALID_INTERNAL_IDS_FOR_DELETE_PROVIDED);
				return;
			}

			// First get the records from NetSuite
			printInfoWithEmptyLine(CHECKING_EXISTENCE_OF_RECORDS);

			List<Vendor> records = client
					.getRecords(internalIds.stream().map(internalId -> createRecordRef(internalId, RecordType.vendor)).toArray(RecordRef[]::new))
					// Filter just non-null records
					.stream().filter(Objects::nonNull).map(record -> (Vendor) record).collect(Collectors.toList());

			if (records == null || records.isEmpty()) {
				printError(NO_VALID_INTERNAL_IDS_FOR_DELETE_PROVIDED);
				return;
			}

			printWithEmptyLine(FOLLOWING_RECORDS_WILL_BE_DELETED);

			for (int i = 0; i < records.size(); i++) {
				printWithEmptyLine(getIndentedString(VENDOR_WITH_INDEX), i + 1);
				printMap(new Fields(records.get(i)));
			}

			printEmptyLine();
			boolean isDeletionConfirmed = getBoolean(readLine(DELETE_ALL_RECORDS, "N"));

			if (isDeletionConfirmed) {
				printSendingRequestMessage();
				// Invoke deleteList() operation to delete the records
				RecordRef[] recordRefs = records.stream().map(record -> createRecordRef(record.getInternalId(), RecordType.vendor)).toArray(RecordRef[]::new);
				WriteResponseList responseList = client.callDeleteRecords(recordRefs);
				processVendorDeleteList(responseList, recordRefs);
			} else {
				printInfoWithEmptyLine(RECORDS_WERE_NOT_DELETED);
			}
		});
	}

	//VENDOR END

	//SALES ORDER START
	/**
	 * Demonstrates how to add a Sales Order record into NetSuite using the {@code add()} operation.
	 */
	private void addSalesOrder() {
		SAMPLE_OPERATIONS.put(ADD_SALES_ORDER, () -> {
			printWithEmptyLine(ENTER_CUSTOMER_INFORMATION);

			SearchStringField entityId = new SearchStringField();
			entityId.setOperator(SearchStringFieldOperator.is);
			String customerName = readLine(getIndentedString(CUSTOMER_NAME));
			entityId.setSearchValue(customerName);

			CustomerSearchBasic customerSearchBasic = new CustomerSearchBasic();
			customerSearchBasic.setEntityId(entityId);

			printSendingRequestMessage();

			List<?> foundCustomers = client.search(customerSearchBasic);
			if (foundCustomers == null || foundCustomers.isEmpty()) {
				printError(SALES_ORDER_CUSTOMER_NOT_FOUND, customerName);
				return;
			}
			if (foundCustomers.size() > 1) {
				printError(SALES_ORDER_MORE_CUSTOMERS_FOUND, customerName);
				return;
			}

			printEmptyLine();

			SalesOrder salesOrder = new SalesOrder();
			salesOrder.setEntity(createRecordRef(((Customer) foundCustomers.get(0)).getInternalId()));

			// Set the transaction date and status
			salesOrder.setTranDate(Calendar.getInstance());
			salesOrder.setOrderStatus(SalesOrderOrderStatus._pendingFulfillment);

			// Enter the internal IDs of inventory items to be added to this Sales Order
			List<String> itemsInternalIds = getListItems(readLine(ENTER_ITEM_IDS_FOR_SALES_ORDER));
			salesOrder.setItemList(getSalesOrderItemList(itemsInternalIds));

			printSendingRequestMessage();

			// Invoke add() operation
			WriteResponse response = client.callAddRecord(salesOrder);

			// Process the response
			processSalesOrderWriteResponse(response);
		});
	}

	/**
	 * Demonstrates how to update an existing Sales Order record in NetSuite using the {@code update()} operation
	 * which uses an internal ID to reference the record to be updated.
	 */
	private void updateSalesOrder() {
		SAMPLE_OPERATIONS.put(UPDATE_SALES_ORDER, () -> {
			printEmptyLine();

			SalesOrder salesOrder = new SalesOrder();

			// Get internal ID for update
			salesOrder.setInternalId(readLine(ENTER_SALES_ORDER_FOR_UPDATE));

			printEmptyLine();

			// Enter the internal IDs of inventory items to be added to the Sales Order
			List<String> itemsInternalIds = getListItems(readLine(ENTER_ITEM_IDS_FOR_SALES_ORDER));
			SalesOrderItemList salesOrderItemList = getSalesOrderItemList(itemsInternalIds);

			salesOrder.setItemList(salesOrderItemList);

			printSendingRequestMessage();

			// Invoke update() operation
			WriteResponse response = client.callUpdateRecord(salesOrder);

			// Process the response
			processSalesOrderWriteResponse(response);
		});
	}

	/**
	 * Demonstrates how to fulfill a Sales Order using the {@code initialize()} and {@code add()} operations.
	 */
	private void fulfillSalesOrder() {
		SAMPLE_OPERATIONS.put(FULFILL_SALES_ORDER, () -> {
			printEmptyLine();

			InitializeRef initializeRef = new InitializeRef();
			initializeRef.setType(InitializeRefType.salesOrder);
			// Get internal ID for initialize() operation
			initializeRef.setInternalId(readLine(ENTER_SALES_ORDER_FOR_FULFILLING));

			InitializeRecord initializeRecord = new InitializeRecord();
			initializeRecord.setType(InitializeType.itemFulfillment);
			initializeRecord.setReference(initializeRef);

			printSendingRequestMessage();

			// Perform initialize() operation to get a copy of ItemFulfillment record
			ReadResponse initializeResponse = client.callInitialize(initializeRecord);
			ItemFulfillment itemFulfillment = processInitializeReadResponse(initializeResponse);
			if (itemFulfillment == null) {
				return;
			}

			// You can change any desired properties of retrieved Item Fulfillment
			// itemFulfillment.setTransferLocation(...);

			// Set preference to ignore read-only fields. Some of the fields included in retrieved ItemFulfillment
			// record cannot be set. Setting this preference solve that problem.
			client.setIgnoreReadOnlyFields(true);

			printSendingRequestMessage();

			// Store retrieved Item Fulfillment record into NetSuite
			WriteResponse response = client.callAddRecord(itemFulfillment);

			// Set ignore read-only preference to the default value
			client.setIgnoreReadOnlyFields(false);

			// Process the response
			processItemFulfillmentWriteResponse(response, initializeRef.getInternalId());
		});
	}

	/**
	 * Demonstrates how to search for Sales Orders for a given customer name.
	 */
	private void searchSalesOrders() {
		SAMPLE_OPERATIONS.put(SEARCH_SALES_ORDERS, () -> {
			printWithEmptyLine(ENTER_CUSTOMER_INFORMATION);

			String customerName = readLine(getIndentedString(CUSTOMER_NAME));
			List<Customer> customers = searchForCustomers(customerName);
			if (customers.isEmpty()) {
				printError(NO_CUSTOMERS_FOUND, customerName);
				return;
			}

			// Search sales order for all found customers

			SearchMultiSelectField entities = new SearchMultiSelectField();
			entities.setOperator(SearchMultiSelectFieldOperator.anyOf);

			//entities.setSearchValue(customers.stream().map(customer->));

			entities.setSearchValue(
					customers.stream().map(customer -> createRecordRef(customer.getInternalId(), RecordType.customer)).toArray(RecordRef[]::new));

			TransactionSearchBasic transactionSearchBasic = new TransactionSearchBasic();

			transactionSearchBasic.setType(new SearchEnumMultiSelectField(new String[] { RecordType._salesOrder }, SearchEnumMultiSelectFieldOperator.anyOf));
			transactionSearchBasic.setEntity(entities);

			// We want to returned also list of items so we need to set the following preference
			client.setBodyFieldsOnly(false);

			// Set smaller page size in order to demonstrate how searchMoreWithId() operation works
			client.setPageSize(PAGE_SIZE);

			printSendingRequestMessage();

			// Search for sales orders
			SearchResult searchResult = client.callSearch(transactionSearchBasic);
			final String jobId = client.getLastJobId();

			processSearchResult(searchResult, customerName);

			// Get next pages of the search result
			if (isSuccessfulSearchResult(searchResult)) {
				for (int i = 2; i <= searchResult.getTotalPages(); i++) {
					printSendingRequestMessage();
					processSearchResult(client.callSearchMoreWithId(jobId, i), customerName);
				}
			}

			// We can revert search preferences to the default values now
			client.setBodyFieldsOnly(true);
			client.setPageSize(DEFAULT_PAGE_SIZE);
		});
	}

	/**
	 * Demonstrates how to use advanced search for searching Sales Orders which belong to a given customer name.
	 */
	private void advancedSearchSalesOrders() {
		SAMPLE_OPERATIONS.put(ADVANCED_SEARCH_SALES_ORDERS, () -> {
			printEmptyLine();

			SearchEnumMultiSelectField recordType = new SearchEnumMultiSelectField();
			recordType.setOperator(SearchEnumMultiSelectFieldOperator.anyOf);
			recordType.setSearchValue(new String[] { RecordType._salesOrder });

			TransactionSearchBasic transactionSearchBasic = new TransactionSearchBasic();
			transactionSearchBasic.setType(recordType);

			// In order to have a particular sales order in search result just once, set the following field.
			transactionSearchBasic.setMainLine(new SearchBooleanField(true));

			final String tranId = readLine(ENTER_TRANSACTION_ID);
			if (!isEmptyString(tranId)) {
				SearchStringField tranIdField = new SearchStringField();
				tranIdField.setOperator(SearchStringFieldOperator.is);
				tranIdField.setSearchValue(tranId);
				transactionSearchBasic.setTranId(tranIdField);
			}

			final List<String> customerIds = getListItems(readLine(ENTER_CUSTOMER_INTERNAL_ID_FOR_SALES_ORDER_SEARCH));
			if (!customerIds.isEmpty()) {
				SearchMultiSelectField entityField = new SearchMultiSelectField();
				entityField.setOperator(SearchMultiSelectFieldOperator.anyOf);
				entityField.setSearchValue(customerIds.stream().map(Utils::createRecordRef).toArray(RecordRef[]::new));
				transactionSearchBasic.setEntity(entityField);
			}

			// Apply search criteria
			TransactionSearch transactionSearch = new TransactionSearch();
			transactionSearch.setBasic(transactionSearchBasic);

			// Define columns to be returned
			TransactionSearchRowBasic transactionSearchRowBasic = new TransactionSearchRowBasic();
			transactionSearchRowBasic.setInternalId(new SearchColumnSelectField[] { new SearchColumnSelectField() });
			transactionSearchRowBasic.setTranId(new SearchColumnStringField[] { new SearchColumnStringField() });
			transactionSearchRowBasic.setDateCreated(new SearchColumnDateField[] { new SearchColumnDateField() });
			transactionSearchRowBasic.setTotal(new SearchColumnDoubleField[] { new SearchColumnDoubleField() });
			transactionSearchRowBasic.setEntity(new SearchColumnSelectField[] { new SearchColumnSelectField() });

			TransactionSearchRow transactionSearchRow = new TransactionSearchRow();
			transactionSearchRow.setBasic(transactionSearchRowBasic);

			TransactionSearchAdvanced transactionSearchAdvanced = new TransactionSearchAdvanced();
			transactionSearchAdvanced.setCriteria(transactionSearch);
			transactionSearchAdvanced.setColumns(transactionSearchRow);

			if (isEmptyString(tranId) && customerIds.isEmpty()) {
				printInfoWithEmptyLine(NO_SEARCH_CRITERIA_DEFINED);
			}

			// Set smaller page size in order to demonstrate how searchMoreWithId() operation works
			client.setPageSize(PAGE_SIZE);

			printSendingRequestMessage();

			SearchResult searchResult = client.callSearch(transactionSearchAdvanced);
			final String jobId = client.getLastJobId();

			processSearchResult(searchResult, null);

			// Get next pages of the search result
			if (isSuccessfulSearchResult(searchResult)) {
				for (int i = 2; i <= searchResult.getTotalPages(); i++) {
					printSendingRequestMessage();
					processSearchResult(client.callSearchMoreWithId(jobId, i), null);
				}
			}

			// We can revert search preferences to the default values now
			client.setPageSize(DEFAULT_PAGE_SIZE);
		});
	}
	//SALES ORDER END

	//=================PURCHASE ORDE START=====================
	/**
	 * Demonstrates how to add a Purchase Order record into NetSuite using the {@code add()} operation.
	 */
	private void addPurchaseOrder() {
		SAMPLE_OPERATIONS.put(ADD_PURCHASE_ORDER, () -> {
			printWithEmptyLine(ENTER_VENDOR_INFORMATION);

			SearchStringField entityId = new SearchStringField();
			entityId.setOperator(SearchStringFieldOperator.is);
			String vendorName = readLine(getIndentedString(VENDOR_NAME));
			entityId.setSearchValue(vendorName);

			CustomerSearchBasic vendorSearchBasic = new CustomerSearchBasic();
			vendorSearchBasic.setEntityId(entityId);

			printSendingRequestMessage();

			List<?> foundCustomers = client.search(vendorSearchBasic);
			if (foundCustomers == null || foundCustomers.isEmpty()) {
				printError(PURCHASE_ORDER_VENDOR_NOT_FOUND, vendorName);
				return;
			}
			if (foundCustomers.size() > 1) {
				printError(PURCHASE_ORDER_MORE_VENDORS_FOUND, vendorName);
				return;
			}

			printEmptyLine();

			PurchaseOrder purchaseOrder = new PurchaseOrder();
			purchaseOrder.setEntity(createRecordRef(((Customer) foundCustomers.get(0)).getInternalId()));

			// Set the transaction date and status
			purchaseOrder.setTranDate(Calendar.getInstance());
			purchaseOrder.setOrderStatus(PurchaseOrderOrderStatus._pendingReceipt);

			// Enter the internal IDs of inventory items to be added to this Purchase Order
			List<String> itemsInternalIds = getListItems(readLine(ENTER_ITEM_IDS_FOR_PURCHASE_ORDER));
			purchaseOrder.setItemList(getPurchaseOrderItemList(itemsInternalIds));

			printSendingRequestMessage();

			// Invoke add() operation
			WriteResponse response = client.callAddRecord(purchaseOrder);

			// Process the response
			processPurchaseOrderWriteResponse(response);
		});
	}

	/**
	 * Demonstrates how to update an existing Purchase Order record in NetSuite using the {@code update()} operation
	 * which uses an internal ID to reference the record to be updated.
	 */
	private void updatePurchaseOrder() {
		SAMPLE_OPERATIONS.put(UPDATE_PURCHASE_ORDER, () -> {
			printEmptyLine();

			PurchaseOrder purchaseOrder = new PurchaseOrder();

			// Get internal ID for update
			purchaseOrder.setInternalId(readLine(ENTER_PURCHASE_ORDER_FOR_UPDATE));

			printEmptyLine();

			// Enter the internal IDs of inventory items to be added to the Purchase Order
			List<String> itemsInternalIds = getListItems(readLine(ENTER_ITEM_IDS_FOR_PURCHASE_ORDER));
			PurchaseOrderItemList purchaseOrderItemList = getPurchaseOrderItemList(itemsInternalIds);

			purchaseOrder.setItemList(purchaseOrderItemList);

			printSendingRequestMessage();

			// Invoke update() operation
			WriteResponse response = client.callUpdateRecord(purchaseOrder);

			// Process the response
			processPurchaseOrderWriteResponse(response);
		});
	}

	/**
	 * Demonstrates how to fulfill a Purchase Order using the {@code initialize()} and {@code add()} operations.
	 */
	private void receiptPurchaseOrder() {
		SAMPLE_OPERATIONS.put(RECEIPT_PURCHASE_ORDER, () -> {
			printEmptyLine();

			InitializeRef initializeRef = new InitializeRef();
			initializeRef.setType(InitializeRefType.purchaseOrder);
			// Get internal ID for initialize() operation
			initializeRef.setInternalId(readLine(ENTER_PURCHASE_ORDER_FOR_FULFILLING));

			InitializeRecord initializeRecord = new InitializeRecord();
			initializeRecord.setType(InitializeType.itemFulfillment);
			initializeRecord.setReference(initializeRef);

			printSendingRequestMessage();

			// Perform initialize() operation to get a copy of ItemFulfillment record
			ReadResponse initializeResponse = client.callInitialize(initializeRecord);
			ItemFulfillment itemFulfillment = processInitializeReadResponse(initializeResponse);
			if (itemFulfillment == null) {
				return;
			}

			// You can change any desired properties of retrieved Item Fulfillment
			// itemFulfillment.setTransferLocation(...);

			// Set preference to ignore read-only fields. Some of the fields included in retrieved ItemFulfillment
			// record cannot be set. Setting this preference solve that problem.
			client.setIgnoreReadOnlyFields(true);

			printSendingRequestMessage();

			// Store retrieved Item Fulfillment record into NetSuite
			WriteResponse response = client.callAddRecord(itemFulfillment);

			// Set ignore read-only preference to the default value
			client.setIgnoreReadOnlyFields(false);

			// Process the response
			processItemFulfillmentWriteResponse(response, initializeRef.getInternalId());
		});
	}

	/**
	 * Demonstrates how to search for Purchase Orders for a given vendor name.
	 */
	private void searchPurchaseOrders() {
		SAMPLE_OPERATIONS.put(SEARCH_PURCHASE_ORDERS, () -> {
			printWithEmptyLine(ENTER_VENDOR_INFORMATION);

			String vendorName = readLine(getIndentedString(VENDOR_NAME));
			List<Customer> vendors = searchForCustomers(vendorName);
			if (vendors.isEmpty()) {
				printError(NO_VENDORS_FOUND, vendorName);
				return;
			}

			// Search sales order for all found vendors
			SearchMultiSelectField entities = new SearchMultiSelectField();
			entities.setOperator(SearchMultiSelectFieldOperator.anyOf);

			//entities.setSearchValue(vendors.stream().map(vendor->));

			entities.setSearchValue(vendors.stream().map(vendor -> createRecordRef(vendor.getInternalId(), RecordType.vendor)).toArray(RecordRef[]::new));
			TransactionSearchBasic transactionSearchBasic = new TransactionSearchBasic();
			transactionSearchBasic
					.setType(new SearchEnumMultiSelectField(new String[] { RecordType._purchaseOrder }, SearchEnumMultiSelectFieldOperator.anyOf));
			transactionSearchBasic.setEntity(entities);

			// We want to returned also list of items so we need to set the following preference
			client.setBodyFieldsOnly(false);

			// Set smaller page size in order to demonstrate how searchMoreWithId() operation works
			client.setPageSize(PAGE_SIZE);

			printSendingRequestMessage();

			// Search for sales orders
			SearchResult searchResult = client.callSearch(transactionSearchBasic);
			final String jobId = client.getLastJobId();

			processSearchResult(searchResult, vendorName);

			// Get next pages of the search result
			if (isSuccessfulSearchResult(searchResult)) {
				for (int i = 2; i <= searchResult.getTotalPages(); i++) {
					printSendingRequestMessage();
					processSearchResult(client.callSearchMoreWithId(jobId, i), vendorName);
				}
			}

			// We can revert search preferences to the default values now
			client.setBodyFieldsOnly(true);
			client.setPageSize(DEFAULT_PAGE_SIZE);
		});
	}

	/**
	 * Demonstrates how to use advanced search for searching Purchase Orders which belong to a given vendor name.
	 */
	private void advancedSearchPurchaseOrders() {
		SAMPLE_OPERATIONS.put(ADVANCED_SEARCH_PURCHASE_ORDERS, () -> {
			printEmptyLine();

			SearchEnumMultiSelectField recordType = new SearchEnumMultiSelectField();
			recordType.setOperator(SearchEnumMultiSelectFieldOperator.anyOf);
			recordType.setSearchValue(new String[] { RecordType._purchaseOrder });
			TransactionSearchBasic transactionSearchBasic = new TransactionSearchBasic();
			transactionSearchBasic.setType(recordType);

			// In order to have a particular sales order in search result just once, set the following field.
			transactionSearchBasic.setMainLine(new SearchBooleanField(true));

			final String tranId = readLine(ENTER_TRANSACTION_ID);
			if (!isEmptyString(tranId)) {
				SearchStringField tranIdField = new SearchStringField();
				tranIdField.setOperator(SearchStringFieldOperator.is);
				tranIdField.setSearchValue(tranId);
				transactionSearchBasic.setTranId(tranIdField);
			}

			final List<String> vendorIds = getListItems(readLine(ENTER_VENDOR_INTERNAL_ID_FOR_PURCHASE_ORDER_SEARCH));
			if (!vendorIds.isEmpty()) {
				SearchMultiSelectField entityField = new SearchMultiSelectField();
				entityField.setOperator(SearchMultiSelectFieldOperator.anyOf);
				entityField.setSearchValue(vendorIds.stream().map(Utils::createRecordRef).toArray(RecordRef[]::new));
				transactionSearchBasic.setEntity(entityField);
			}

			// Apply search criteria
			TransactionSearch transactionSearch = new TransactionSearch();
			transactionSearch.setBasic(transactionSearchBasic);

			// Define columns to be returned
			TransactionSearchRowBasic transactionSearchRowBasic = new TransactionSearchRowBasic();
			transactionSearchRowBasic.setInternalId(new SearchColumnSelectField[] { new SearchColumnSelectField() });
			transactionSearchRowBasic.setTranId(new SearchColumnStringField[] { new SearchColumnStringField() });
			transactionSearchRowBasic.setDateCreated(new SearchColumnDateField[] { new SearchColumnDateField() });
			transactionSearchRowBasic.setTotal(new SearchColumnDoubleField[] { new SearchColumnDoubleField() });
			transactionSearchRowBasic.setEntity(new SearchColumnSelectField[] { new SearchColumnSelectField() });

			TransactionSearchRow transactionSearchRow = new TransactionSearchRow();
			transactionSearchRow.setBasic(transactionSearchRowBasic);

			TransactionSearchAdvanced transactionSearchAdvanced = new TransactionSearchAdvanced();
			transactionSearchAdvanced.setCriteria(transactionSearch);
			transactionSearchAdvanced.setColumns(transactionSearchRow);

			if (isEmptyString(tranId) && vendorIds.isEmpty()) {
				printInfoWithEmptyLine(NO_SEARCH_CRITERIA_DEFINED);
			}

			// Set smaller page size in order to demonstrate how searchMoreWithId() operation works
			client.setPageSize(PAGE_SIZE);

			printSendingRequestMessage();

			SearchResult searchResult = client.callSearch(transactionSearchAdvanced);
			final String jobId = client.getLastJobId();

			processSearchResult(searchResult, null);

			// Get next pages of the search result
			if (isSuccessfulSearchResult(searchResult)) {
				for (int i = 2; i <= searchResult.getTotalPages(); i++) {
					printSendingRequestMessage();
					processSearchResult(client.callSearchMoreWithId(jobId, i), null);
				}
			}

			// We can revert search preferences to the default values now
			client.setPageSize(DEFAULT_PAGE_SIZE);
		});
	}

	//=================PURCHASE ORDER END======================

	/**
	 * Demonstrates how to add a certain Custom Record into NetSuite.
	 */
	private void addCustomRecord() {
		SAMPLE_OPERATIONS.put(ADD_CUSTOM_RECORD, () -> {
			printWithEmptyLine(ENTER_CUSTOM_RECORD_DATA_FOR_ADD);

			CustomRecord customRecord = new CustomRecord();
			customRecord.setRecType(createRecordRef(readLine(getIndentedString(CUSTOM_RECORD_TYPE_ID)).trim()));
			customRecord.setName(readLine(getIndentedString(NAME)));

			printSendingRequestMessage();

			// Invoke add() operation
			WriteResponse response = client.callAddRecord(customRecord);

			// Process response
			processCustomRecordWriteResponse(response, customRecord);
		});
	}

	/**
	 * Demonstrates how to search for Custom Record. Since Custom Record implementations vary vastly, this search
	 * is only implemented to search on the Custom Record field 'Name'.
	 */
	private void searchCustomRecord() {
		SAMPLE_OPERATIONS.put(SEARCH_CUSTOM_RECORD, () -> {
			printWithEmptyLine(ENTER_CUSTOM_RECORD_DATA_FOR_SEARCH);

			CustomRecordSearchBasic customRecordSearchBasic = new CustomRecordSearchBasic();
			customRecordSearchBasic.setRecType(createRecordRef(readLine(getIndentedString(CUSTOM_RECORD_TYPE_ID)).trim()));

			final String name = readLine(getIndentedString(NAME));
			if (isEmptyString(name)) {
				printInfoWithEmptyLine(NO_SEARCH_CRITERIA_DEFINED);
			} else {
				SearchStringField nameField = new SearchStringField();
				nameField.setOperator(SearchStringFieldOperator.contains);
				nameField.setSearchValue(name);
				customRecordSearchBasic.setName(nameField);
			}

			// Set smaller page size in order to demonstrate how searchMoreWithId() operation works
			client.setPageSize(PAGE_SIZE);

			printSendingRequestMessage();

			// Search for all matching Custom Records
			SearchResult searchResult = client.callSearch(customRecordSearchBasic);
			final String jobId = client.getLastJobId();

			processSearchResult(searchResult);

			// Get next pages of the search result
			if (isSuccessfulSearchResult(searchResult)) {
				for (int i = 2; i <= searchResult.getTotalPages(); i++) {
					printSendingRequestMessage();
					processSearchResult(client.callSearchMoreWithId(jobId, i));
				}
			}

			// We can revert search preferences to the default values now
			client.setPageSize(DEFAULT_PAGE_SIZE);
		});
	}

	/**
	 * Demonstrates how to delete a Custom Record from NetSuite.
	 */
	private void deleteCustomRecord() {
		SAMPLE_OPERATIONS.put(DELETE_CUSTOM_RECORD, () -> {
			printWithEmptyLine(ENTER_CUSTOM_RECORD_DATA_FOR_DELETION);

			CustomRecordRef customRecordRef = new CustomRecordRef();
			// Prompt user for the internal ID of the Custom Record type
			customRecordRef.setTypeId(readLine(getIndentedString(CUSTOM_RECORD_TYPE_ID)));
			// Prompt user for internal ID of Custom Record to be deleted
			customRecordRef.setInternalId(readLine(getIndentedString(INTERNAL_ID)));

			printSendingRequestMessage();

			// Delete record
			WriteResponse response = client.callDeleteRecord(customRecordRef, null);

			// Process response
			processCustomRecordWriteResponse(response);
		});
	}

	/**
	 * Demonstrates how to get a list of values for an other list type in NetSuite using the {@code getAll()} operation.
	 */
	private void getOtherListValues() {
		SAMPLE_OPERATIONS.put(GET_OTHER_LIST_VALUES, () -> {
			Map<String, GetAllRecordType> options = new LinkedHashMap<>(4);
			options.put(BUDGET_CATEGORIES, GetAllRecordType.budgetCategory);
			options.put(CAMPAIGN_CATEGORIES, GetAllRecordType.campaignCategory);
			options.put(STATES, GetAllRecordType.state);
			options.put(CURRENCIES, GetAllRecordType.currency);

			// Display list of choices to the user
			OptionList<GetAllRecordType> optionList = new OptionList<>(SELECT_LIST_TYPE, options);
			GetAllRecordType selectedRecordType = optionList.displayAndGetUserChoice();

			printSendingRequestMessage();

			// Invoke getAll() operation
			List<Record> allRecords = client.getAllRecords(selectedRecordType);

			if (allRecords == null || allRecords.isEmpty()) {
				printWithEmptyLine(NO_RECORDS_FOUND);
			} else {
				String stringType = options.entrySet().stream().filter(entry -> entry.getValue().equals(selectedRecordType)).map(Map.Entry::getKey)
						.toArray(String[]::new)[0];
				printWithEmptyLine(REQUESTED_LIST_OF_RECORDS, stringType, allRecords.size());
				allRecords.forEach(PrintUtils::printGetAllRecord);
			}
		});
	}

	/**
	 * Demonstrates how to upload a file from a computer using the {@code add()} operation.
	 */
	private void uploadFile() {
		SAMPLE_OPERATIONS.put(UPLOAD_FILE, () -> {
			printEmptyLine();

			File file = new File();
			file.setAttachFrom(FileAttachFrom._computer);

			// Prompt for the file name and load the file content
			Path filePath = null;
			try {
				filePath = Paths.get(readLine(FILE_TO_BE_UPLOADED));
				file.setContent(Files.readAllBytes(filePath));
			} catch (IOException e) {
				printError(e.getClass().getSimpleName() + ": " + filePath.toAbsolutePath().toString());
				return;
			}

			// Prompt for the NetSuite file name
			file.setName(readLine(FILE_NAME));

			// Prompt for the folder internal ID
			file.setFolder(createRecordRef(readLine(FOLDER_INTERNAL_ID).trim()));

			printSendingRequestMessage();

			// Invoke add() operation to upload the file to NetSuite
			WriteResponse response = client.callAddRecord(file);

			// Process the response
			processFileUploadWriteResponse(response);
		});
	}

	/**
	 * Demonstrates how to get a list of possible values for Select field in NetSuite
	 * using {@code getSelectValue()} operation.
	 */
	private void getSelectFieldValues() {
		SAMPLE_OPERATIONS.put(GET_SELECT_FIELD_VALUES, () -> {
			Map<String, RecordType> options = new LinkedHashMap<>();
			options.put(CUSTOMER, RecordType.customer);
			options.put(VENDOR, RecordType.vendor);
			options.put(INVENTORY_ITEM, RecordType.inventoryItem);
			options.put(ACCOUNT, RecordType.account);

			GetSelectValueFieldDescription fieldDescription = new GetSelectValueFieldDescription();
			fieldDescription.setRecordType(new OptionList<>(SELECT_RECORD_TYPE_OF_THE_FIELD, options).displayAndGetUserChoice());
			printEmptyLine();
			String fieldName = readLine(WRITE_FIELD_NAME, SUBSIDIARY);
			fieldDescription.setField(fieldName);

			printSendingRequestMessage();

			List<BaseRef> values = client.getSelectValue(fieldDescription);

			if (values == null || values.isEmpty()) {
				printWithEmptyLine(NO_VALUES_FOUND_FOR_THE_FIELD, fieldName);
			} else {
				printWithEmptyLine(VALUES_FOUND_FOR_THE_FIELD, values.size(), fieldName);
				values.forEach(baseRef -> {
					RecordRef recordRef = (RecordRef) baseRef;
					Fields fields = new Fields();
					fields.put(INTERNAL_ID, recordRef.getInternalId());
					fields.put(NAME, recordRef.getName().replaceAll(NON_BREAKING_SPACE, SPACE));
					if (recordRef.getType() != null) {
						fields.put(TYPE, recordRef.getType().toString());
					}
					printMapInline(fields);
				});
			}
		});
	}

	/////////////////////////////////// Auxiliary methods ///////////////////////////////////

	private static void setCustomerAddress(Customer customer, Address address, String addressBookLabel, boolean defaultBilling, boolean defaultShipping) {
		// Populate the address list for the customer. You can put in as many addresses as you like.
		CustomerAddressbook addressBook = new CustomerAddressbook();
		addressBook.setDefaultBilling(defaultBilling);
		addressBook.setDefaultShipping(defaultShipping);
		addressBook.setLabel(addressBookLabel);
		addressBook.setAddressbookAddress(address);

		// Attach the address to the customer
		CustomerAddressbookList addressBookList = customer.getAddressbookList();
		if (addressBookList == null) {
			addressBookList = new CustomerAddressbookList();
		}
		CustomerAddressbook[] addressBooks = addressBookList.getAddressbook();
		if (addressBooks == null || addressBooks.length == 0) {
			addressBooks = new CustomerAddressbook[] { addressBook };
		} else {
			addressBooks = Arrays.copyOf(addressBooks, addressBooks.length + 1);
		}
		addressBookList.setAddressbook(addressBooks);
		customer.setAddressbookList(addressBookList);
	}

	private static SalesOrderItemList getSalesOrderItemList(List<String> itemsInternalIds) {
		SalesOrderItemList salesOrderItems = new SalesOrderItemList();

		// Create the sales order items and populate the quantity
		int i = 0;
		for (String internalId : itemsInternalIds) {
			SalesOrderItem item = new SalesOrderItem();
			item.setItem(createRecordRef(internalId));
			String number = null;
			try {
				number = readLine(getIndentedString(format(ENTER_QUANTITY_FOR_ITEM, internalId)));
				item.setQuantity(Double.parseDouble(number));
			} catch (NumberFormatException nfe) {
				printError(format(INVALID_NUMBER, number) + SPACE + ITEM_NOT_ADDED_TO_SALES_ORDER);
				continue;
			}
			item.setAmount(1.0);

			salesOrderItems.setItem(i, item);
			i++;
		}

		SalesOrderItemList salesOrderItemList = salesOrderItems;

		return salesOrderItemList;
	}

	/**
	 * Search for all customers whose names contains string entered by the user. Since we need just an internal ID
	 * of Customer record it is much faster to use advanced search for this particular purpose.
	 *
	 * @param customerName Customer's name
	 */
	private List<Customer> searchForCustomers(String customerName) throws RemoteException {
		// Setting criteria
		SearchStringField entityId = new SearchStringField();
		entityId.setOperator(SearchStringFieldOperator.contains);
		entityId.setSearchValue(customerName);

		CustomerSearchBasic customerSearchBasic = new CustomerSearchBasic();
		customerSearchBasic.setEntityId(entityId);

		CustomerSearch customerSearch = new CustomerSearch();
		customerSearch.setBasic(customerSearchBasic);

		// Setting returned columns
		CustomerSearchRowBasic customerSearchRowBasic = new CustomerSearchRowBasic();
		customerSearchRowBasic.setInternalId(new SearchColumnSelectField[] { new SearchColumnSelectField() });

		CustomerSearchRow customerSearchRow = new CustomerSearchRow();
		customerSearchRow.setBasic(customerSearchRowBasic);

		CustomerSearchAdvanced customerSearchAdvanced = new CustomerSearchAdvanced();
		customerSearchAdvanced.setCriteria(customerSearch);
		customerSearchAdvanced.setColumns(customerSearchRow);

		printSendingRequestMessage();

		List<?> returnedRows = client.searchAll(customerSearchAdvanced);

		if (returnedRows == null || returnedRows.isEmpty()) {
			return Collections.emptyList();
		}

		// Convert returned rows to list of customers
		return returnedRows.stream().map(row -> {
			CustomerSearchRowBasic searchRow = ((CustomerSearchRow) row).getBasic();
			Customer customer = new Customer();
			customer.setInternalId(searchRow.getInternalId(0).getSearchValue().getInternalId());
			return customer;
		}).collect(Collectors.toList());
	}

	private static PurchaseOrderItemList getPurchaseOrderItemList(List<String> itemsInternalIds) {
		PurchaseOrderItemList purchaseOrderItems = new PurchaseOrderItemList();

		// Create the sales order items and populate the quantity
		int i = 0;
		for (String internalId : itemsInternalIds) {
			PurchaseOrderItem item = new PurchaseOrderItem();
			item.setItem(createRecordRef(internalId));
			String number = null;
			try {
				number = readLine(getIndentedString(format(ENTER_QUANTITY_FOR_ITEM, internalId)));
				item.setQuantity(Double.parseDouble(number));
			} catch (NumberFormatException nfe) {
				printError(format(INVALID_NUMBER, number) + SPACE + ITEM_NOT_ADDED_TO_SALES_ORDER);
				continue;
			}
			item.setAmount(1.0);

			purchaseOrderItems.setItem(i, item);
			i++;
		}

		PurchaseOrderItemList purchaseOrderItemList = purchaseOrderItems;

		return purchaseOrderItemList;
	}

	private boolean isSuccessfulSearchResult(SearchResult searchResult) {
		Boolean isIsSuccess = true;
		for (StatusDetail sd : searchResult.getStatus().getStatusDetail()) {
			isIsSuccess = !sd.getAfterSubmitFailed() && isIsSuccess;
		}
		return searchResult.getStatus() != null && isIsSuccess;
	}
}
