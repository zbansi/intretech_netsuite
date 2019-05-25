/**
 * search_columns.js
 * 
 * @NApiversion 2.x
 * @NModuleScope Public
 */

define([ 'N/search' ],
/**
 * @param {search} search
 */
function(search) {

	function setColumns(searchType) {
		var _salesOrderSearchColumns = [ 'entity', 'salesrep', 'linesequencenumber', 'item', 'itemrevision', 'pricelevel', 'rate', 'status', 'trandate',
				'startdate', 'enddate', 'quantity', 'quantityuom', 'unit', 'firmed', 'memo', 'shipdate' ];
		var _itemFulfillmentSearchColumns = [ 'salesorder', 'entity', 'salesrep', 'linesequencenumber', 'item', 'itemrevision', 'pricelevel', 'rate', 'status',
				'trandate', 'startdate', 'enddate', 'quantity', 'quantityuom', 'unit', 'firmed', 'memo', 'shipdate' ];
		var _workOrderSearchColumns = [ 'item', 'itemrevision', 'iswip', 'status', 'trandate', 'startdate', 'enddate', 'quantity', 'quantityuom', 'unit',
				'firmed', 'memo' ];
		var _workOrderIssueSearchColumns = [ 'item', 'itemrevision', 'iswip', 'status', 'trandate', 'startdate', 'enddate', 'quantity', 'quantityuom', 'unit',
				'firmed', 'memo' ];
		var _workOrderCompletionSearchColumns = [ 'item', 'itemrevision', 'iswip', 'status', 'trandate', 'startdate', 'enddate', 'quantity', 'quantityuom',
				'unit', 'firmed', 'memo' ];
		var _workOrderCloseSearchColumns = [ 'item', 'itemrevision', 'iswip', 'status', 'trandate', 'startdate', 'enddate', 'quantity', 'quantityuom', 'unit',
				'firmed', 'memo' ];
		var _transferOrderSearchColumns = [ 'entity', 'salesrep', 'linesequencenumber', 'item', 'itemrevision', 'pricelevel', 'rate', 'status', 'trandate',
				'startdate', 'enddate', 'quantity', 'quantityuom', 'unit', 'firmed', 'memo', 'shipdate' ];
		var _inventoryTransferSearchColumns = [ 'entity', 'salesrep', 'linesequencenumber', 'item', 'itemrevision', 'pricelevel', 'rate', 'status', 'trandate',
				'startdate', 'enddate', 'quantity', 'quantityuom', 'unit', 'firmed', 'memo', 'shipdate' ];
		var _inventoryAdjustmentSearchColumns = [ 'entity', 'salesrep', 'linesequencenumber', 'item', 'itemrevision', 'pricelevel', 'rate', 'status',
				'trandate', 'startdate', 'enddate', 'quantity', 'quantityuom', 'unit', 'firmed', 'memo', 'shipdate' ];
		var _purchaseOrderSearchColumns = [ 'entity', 'salesrep', 'linesequencenumber', 'item', 'itemrevision', 'pricelevel', 'rate', 'status', 'trandate',
				'startdate', 'enddate', 'quantity', 'quantityuom', 'unit', 'firmed', 'memo', 'shipdate' ];
		var _itemReceiptSearchColumns = [ 'entity', 'salesrep', 'linesequencenumber', 'item', 'itemrevision', 'pricelevel', 'rate', 'status', 'trandate',
				'startdate', 'enddate', 'quantity', 'quantityuom', 'unit', 'firmed', 'memo', 'shipdate' ];
		var columnList = [];
		switch (searchType) {
		case search.Type.SALES_ORDER:
			return createColumns(_salesOrderSearchColumns);
			break;
		case 'salesorder':
			return createColumns(_salesOrderSearchColumns);
			break;
		case search.Type.ITEM_FULFILLMENT:
			return createColumns(_itemFulfillmentSearchColumns);
			break;
		case 'itemfulfillment':
			return createColumns(_itemFulfillmentSearchColumns);
			break;
		case search.Type.WORK_ORDER:
			return createColumns(_workOrderSearchColumns);
			break;
		case 'workorder':
			return createColumns(_workOrderSearchColumns);
			break;
		case search.Type.WORK_ORDER_ISSUE:
			return createColumns(_workOrderIssueSearchColumns);
			break;
		case 'workorderissue':
			return createColumns(_workOrderIssueSearchColumns);
			break;
		case search.Type.WORK_ORDER_COMPLETION:
			return createColumns(_workOrderCompletionSearchColumns);
			break;
		case 'workordercompletion':
			return createColumns(_workOrderCompletionSearchColumns);
			break;
		case search.Type.WORK_ORDER_CLOSE:
			return createColumns(_workOrderCloseSearchColumns);
			break;
		case 'workorderclose':
			return createColumns(_workOrderCloseSearchColumns);
			break;
		case search.Type.TRANSFER_ORDER:
			return createColumns(_transferOrderSearchColumns);
			break;
		case 'transferorder':
			return createColumns(_transferOrderSearchColumns);
			break;
		case search.Type.INVENTORY_TRANSFER:
			return createColumns(_inventoryTransferSearchColumns);
			break;
		case 'inventorytransfer':
			return createColumns(_inventoryTransferSearchColumns);
			break;
		case search.Type.INVENTORY_ADJUSTMENT:
			return createColumns(_inventoryAdjustmentSearchColumns);
			break;
		case 'inventoryadjustment':
			return createColumns(_inventoryAdjustmentSearchColumns);
			break;
		case search.Type.PURCHASE_ORDER:
			return createColumns(_purchaseOrderSearchColumns);
			break;
		case 'purchaseorder':
			return createColumns(_purchaseOrderSearchColumns);
			break;
		case search.Type.ITEM_RECEIPT:
			return createColumns(_itemReceiptSearchColumns);
			break;
		case 'itemreceipt':
			return createColumns(_itemReceiptSearchColumns);
			break;
		default:
			break;
		}
	}

	function setJoinColumns(searchType) {
		var _salesOrderSearchJoins = {
			'location' : [ 'name' ],
			'subsidiary' : [ 'name' ],
			'item' : [ 'itemid' ]
		};
		var _purchaseOrderSearchJoins = {
			'location' : [ 'name' ],
			'subsidiary' : [ 'name' ],
			'item' : [ 'itemid' ]
		};
		var _workOrderSearchJoins = {
			'location' : [ 'name' ],
			'subsidiary' : [ 'name' ],
			'item' : [ 'itemid' ]
		};
		var _transferOrderSearchJoins = {
			'location' : [ 'name' ],
			'subsidiary' : [ 'name' ],
			'item' : [ 'itemid' ]
		};
		var _salesOrderFulfillmentSearchJoins = {
			'location' : [ 'name' ],
			'subsidiary' : [ 'name' ],
			'item' : [ 'itemid' ]
		};
		var _purchaseOrderItemReceiptSearchJoins = {
			'location' : [ 'name' ],
			'subsidiary' : [ 'name' ],
			'item' : [ 'itemid' ]
		};
		var _workOrderIssueSearchJoins = {
			'location' : [ 'name' ],
			'subsidiary' : [ 'name' ],
			'item' : [ 'itemid' ]
		};
		var _workOrderCompletionSearchJoins = {
			'location' : [ 'name' ],
			'subsidiary' : [ 'name' ],
			'item' : [ 'itemid' ]
		};
		var _workOrderCloseSearchJoins = {
			'location' : [ 'name' ],
			'subsidiary' : [ 'name' ],
			'item' : [ 'itemid' ]
		};
		var _inventoryAdjustmentSearchJoins = {
			'location' : [ 'name' ],
			'subsidiary' : [ 'name' ],
			'item' : [ 'itemid' ]
		};
		var _inventoryTransferSearchJoins = {
			'location' : [ 'name' ],
			'subsidiary' : [ 'name' ],
			'item' : [ 'itemid' ]
		};

		switch (searchType) {
		case search.Type.SALES_ORDER:
			return createJoinColumns(_salesOrderSearchJoins);
			break;

		case search.Type.ITEM_FULFILLMENT:
			return createJoinColumns(_salesOrderFulfillmentSearchJoins);
			break;

		case search.Type.WORK_ORDER:
			return createJoinColumns(_workOrderSearchJoins);
			break;

		case search.Type.WORK_ORDER_ISSUE:
			return createJoinColumns(_workOrderIssueSearchJoins);
			break;

		case search.Type.WORK_ORDER_COMPLETION:
			return createJoinColumns(_workOrderCompletionSearchJoins);
			break;

		case search.Type.WORK_ORDER_CLOSE:
			return createJoinColumns(_workOrderCloseSearchJoins);
			break;

		case search.Type.TRANSFER_ORDER:
			return createJoinColumns(_transferOrderSearchJoins);
			break;

		case search.Type.INVENTORY_TRANSFER:
			return createJoinColumns(_inventoryTransferSearchJoins);
			break;

		case search.Type.INVENTORY_ADJUSTMENT:
			return createJoinColumns(_inventoryAdjustmentSearchJoins);
			break;

		case search.Type.PURCHASE_ORDER:
			return createJoinColumns(_purchaseOrderSearchJoins);
			break;

		case search.Type.ITEM_RECEIPT:
			return createJoinColumns(_purchaseOrderItemReceiptSearchJoins);
			break;

		case 'salesorder':
			return createJoinColumns(_salesOrderSearchJoins);
			break;

		case 'itemfulfillment':
			return createJoinColumns(_salesOrderFulfillmentSearchJoins);
			break;

		case 'workorder':
			return createJoinColumns(_workOrderSearchJoins);
			break;

		case 'workorderissue':
			return createJoinColumns(_workOrderIssueSearchJoins);
			break;

		case 'workordercompletion':
			return createJoinColumns(_workOrderCompletionSearchJoins);
			break;

		case 'workorderclose':
			return createJoinColumns(_workOrderCloseSearchJoins);
			break;

		case 'transferorder':
			return createJoinColumns(_transferOrderSearchJoins);
			break;

		case 'inventorytransfer':
			return createJoinColumns(_inventoryTransferSearchJoins);
			break;

		case 'inventoryadjustment':
			return createJoinColumns(_inventoryAdjustmentSearchJoins);
			break;

		case 'purchaseorder':
			return createJoinColumns(_purchaseOrderSearchJoins);
			break;

		case 'itemreceipt':
			return createJoinColumns(_purchaseOrderItemReceiptSearchJoins);
			break;

		default:
			break;
		}
	}

	function createColumns(searchColumns) {
		var columnList = [];
		if (searchColumns && searchColumns.length > 0) {
			searchColumns.forEach(function(e) {
				columnList.push(search.createColumn({
					name : e
				}));
			});
		}
		return columnList;
	}

	function createJoinColumns(searchJoins) {
		var joinColumns = [];
		if (searchJoins) {
			for ( var key in searchJoins) {
				if (searchJoins.hasOwnProperty(key)) {
					searchJoins[key].forEach(function(value) {
						joinColumns.push(search.createColumn({
							name : value,
							join : key
						}));
					});
				}
			}
		}
		return joinColumns;
	}

	return {
		'setColumns' : setColumns,
		'setJoinColumns' : setJoinColumns,
		'createColumns' : createColumns,
		'createJoinColumns' : createJoinColumns
	}
});
