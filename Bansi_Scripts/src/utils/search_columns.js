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
		switch (searchType) {
		case search.Type.SALES_ORDER:
			return [ 'entity', 'salesrep', 'linesequencenumber', 'item',
					'itemrevision', 'pricelevel', 'rate', 'status', 'trandate',
					'startdate', 'enddate', 'quantity', 'quantityuom', 'unit',
					'firmed', 'memo', 'shipdate' ];
			break;
		case search.Type.ITEM_FULFILLMENT:
			return [ 'entity', 'salesrep', 'linesequencenumber', 'item',
					'itemrevision', 'pricelevel', 'rate', 'status', 'trandate',
					'startdate', 'enddate', 'quantity', 'quantityuom', 'unit',
					'firmed', 'memo', 'shipdate' ];
			break;
			
		case search.Type.WORK_ORDER:
			return [ 'item', 'itemrevision', 'iswip', 'status', 'trandate',
					'startdate', 'enddate', 'quantity', 'quantityuom', 'unit',
					'firmed', 'memo' ];
			break;
		case search.Type.WORK_ORDER_ISSUE:
			return [ 'item', 'itemrevision', 'iswip', 'status', 'trandate',
					'startdate', 'enddate', 'quantity', 'quantityuom', 'unit',
					'firmed', 'memo' ];
			break;
		case search.Type.WORK_ORDER_COMPLETION:
			return [ 'item', 'itemrevision', 'iswip', 'status', 'trandate',
					'startdate', 'enddate', 'quantity', 'quantityuom', 'unit',
					'firmed', 'memo' ];
			break;
		case search.Type.WORK_ORDER_CLOSE:
			return [ 'item', 'itemrevision', 'iswip', 'status', 'trandate',
					'startdate', 'enddate', 'quantity', 'quantityuom', 'unit',
					'firmed', 'memo' ];
			break;
		default:
			break;
		}
	}

	return {
		'setColumns' : setColumns
	}
});
