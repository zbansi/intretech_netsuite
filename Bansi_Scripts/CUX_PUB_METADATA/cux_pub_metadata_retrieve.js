/**
 * @NApiVersion 2.x
 * @NScriptType Suitelet
 * @author 朱焱龙
 */
define([ 'N/record', 'N/ui/serverWidget', 'N/search' ],
/**
 * @param {record} record
 * @param {serverWidget} serverWidget
 * @param {search} search
 */
function(record, ui, search) {
	function onRequest(params) {
		var request = params.request;
		var response = params.response;

		if (request.method === 'GET') {
			var form = ui.createForm({ title : '客户化记录查询' });
			var cuxRecordOwner = form.addField({ id : 'custpage_cux_record_owner',
			label : '自定义记录Owner',
			type : 'SELECT',
			source : 'employee' });
			var cuxRecordType = form.addField({ id : 'custpage_cux_record_type',
			label : '自定义记录类型',
			type : 'SELECT',
			source : '' });

			/*var sr = search.create({ type : search.Type.CUSTOM_RECORD,
			// filters : flt,
			columns : [ 'name', 'created', 'owner', 'recordid' ],
			title : 'Custom Record Search',
			id : 'customsearch_cuxRecord_search' }).run();
			*/

		} else {
		}

		response.writePage(form);
	}

	return { onRequest : onRequest };
});