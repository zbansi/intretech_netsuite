/**
 * @NApiVersion 2.x
 * @NScriptType Suitelet
 * @NModuleScope SameAccount
 * @author YQ12681
 */
/////////////////////////物料主数据接口///////////////////////
//
// 输出一个text文件
//
//////////////////////////////////////////////////////////
define([ 'N/record', 'N/ui/serverWidget', 'N/search', 'N/file', 'N/runtime' ],
/**
 * @param {record} record
 * @param {serverWidget} serverWidget
 * @param {search} search
 * @param {file} file
 * @param {runtime} runtime
 */
function(record, serverWidget, search, file, runtime) {
	/**
	 * Definition of the Suitelet script trigger point.
	 * 
	 * @param {Object} context
	 * @param {ServerRequest} context.request - Encapsulation of the incoming request
	 * @param {ServerResponse} context.response - Encapsulation of the Suitelet response
	 * @Since 2015.2
	 */
	function onRequest(context) {
		//获取最后一次同步时间、是否增量同步参数

		var lastSyncDate = runtime.getCurrentScript().getParameter("custscript_itemsync_inf_last_update_date");
		var dataSyncType = runtime.getCurrentScript().getParameter("custscript_itemsync_inf_allorincrement");

		/*if (context.request.method == 'GET') {
			try {
				var form = serverWidget.createForm({ title : 'NS --> OA 物料主数据同步' });
				var submitButton = form.addSubmitButton({ label : '提交' });
				var outputField = form.addField({ id : 'custpage_output',
				label : '输出文本',
				type : serverWidget.FieldType.LONGTEXT });
				var flt = [];
				var itemRec = search.load({ id : 'customsearch_eai_mst_item_oa' }).run().getRange({ start : 0,
				end : 100 });
				var output = JSON.stringify(itemRec);
				outputField.setHelpText({ help : '该字段显示接口输出消息',
				showInlineForAssistant : true });
				outputField.defaultValue = output;
				context.response.writePage(form);

			} catch (err) {
				log.debug({ title : err.name,
				details : err.message });
			}
		} else {}*/

		//var itemRec = search.load({ id : 'customsearch_eai_mst_item_oa' }).run().getRange({ start : 0,
		//end : 100 });
		var itemRec = null;
		if (dataSyncType == '1') {
			itemRec = search.load({ id : 'customsearch_eai_mst_item_oa' }).run().getRange({ start : 0,
			end : 100 });
		} else if (dataSyncType == '2') {
			itemRec = search.creat({ type : 'item',
			filters : [ [ 'isinactive', search.Operator.EQUALTO, 'N' ], 'and', [ 'created', search.Operator.AFTER, toString(lastSyncDate,'MM/DD/YYYY hh:mm') ] ],
			columns : [ 'internalid', 'displayname', 'category', 'purchaseunit', 'location', 'created' ]

			}).run();
		}
		var output = JSON.stringify(itemRec);
		var fileObj = file.create({ name : 'yq_ns_eai_oa_itemdata_output.txt',
		fileType : file.Type.PLAINTEXT,
		contents : output });

		/*fileObj.folder = -15;
		var fileId = fileObj.save();
		log.audit({ title : 'Id of new file record',
		details : fileId });
		*/
		try {
			//load参数的id注意是internalId不是ID
			var scriptRecord = record.load({ type : 'scriptdeployment',
			id : 67 });
			var date = new Date();
			var year = date.getFullYear(); //获取当前年份   
			var mon = date.getMonth() + 1; //获取当前月份   
			var da = date.getDate(); //获取当前日   
			var day = date.getDay(); //获取当前星期几   
			var h = date.getHours(); //获取小时   
			var m = date.getMinutes(); //获取分钟   
			var s = date.getSeconds(); //获取秒   
			var dateStr = year + '/' + mon + '/' + da + ' ' + h + ':' + m + ':' + s;
			scriptRecord.setText({ fieldId : 'custscript_itemsync_inf_last_update_date',
			value : dateStr });
			log.debug({ title : 'Success',
			details : 'lastSyncDate = ' + lastSyncDate + ' dateStr = ' + dateStr });
		} catch (err) {
			log.debug({ title : err.name,
			details : err.message });
		}
		context.response.writeFile({ file : fileObj,
		isInline : false });
	}

	return { onRequest : onRequest }
});