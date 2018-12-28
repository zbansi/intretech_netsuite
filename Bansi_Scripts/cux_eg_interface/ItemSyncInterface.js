/**
 * @NApiVerison 2.x
 * @NScriptType Suitelet
 * @NModuleScope SameAccount
 * @author YQ12681
 */
/////////////////////////物料主数据接口///////////////////////
//
// 输出一个text文件
//
//////////////////////////////////////////////////////////
define([ 'N/record', 'N/ui/serverWidget', 'N/search' ],
/**
 * @param {record} record
 * @param {serverWidget} serverWidget
 * @param {search} search
 */
function(record, serverWidget, search) {
	/**
	 * Definition of the Suitelet script trigger point.
	 * 
	 * @param {Object} context
	 * @param {ServerRequest} context.request - Encapsulation of the incoming request
	 * @param {ServerResponse} context.response - Encapsulation of the Suitelet response
	 * @Since 2015.2
	 */
	function onRequest(context) {
		if (context.request.method == 'GET') {
			var form = serverWidget.createForm({ title : 'NS --> OA 物料主数据同步' });
			form.addField({ id : 'custpage_output',
			label : '输出文本',
			type : '' });
			var flt = [];
			var itemRec = search.loadSearch({ id : 'customsearch_eai_mst_item_oa',
			filters : flt }).run

		}

	}

	return { onRequest : onRequest }
});