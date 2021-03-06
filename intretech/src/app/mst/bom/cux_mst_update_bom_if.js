/**
 * @NApiVersion 2.x
 * @NScriptType Restlet
 * @NModuleScope SameAccount
 * @NAmdConfig /SuiteScripts/intretech/config.json
 * @author Zhu Yanlong
 */
/////////////////////////BOM接口////////////////////////////
//	
//	PUT
//
//////////////////////////////////////////////////////////
define([ 'N/record', 'N/search', 'N/runtime', 'N/task', 'dao' ],
/**
 * @param {record} record
 * @param {search} search
 * @param {runtime} runtime
 * @param {task} task
 * @param {dao} dao
 */
function(record, search, runtime, task, dao) {

	/**
	 * Function called upon sending a PUT request to the RESTlet.
	 * 
	 * @param {string | Object} requestBody - The HTTP request body; request body will be passed into function as a string when request Content-Type is
	 *            'text/plain' or parsed into an Object when request Content-Type is 'application/json' (in which case the body must be a valid JSON)
	 * @returns {string | Object} HTTP response body; return string when request Content-Type is 'text/plain'; return Object when request Content-Type is
	 *          'application/json'
	 * @since 2015.2
	 */

	function doPut(requestBody) {
		log.audit("Remaining governance units start: " + runtime.getCurrentScript().getRemainingUsage());

		//将请求报文存放到脚本参数中
		var scriptRecord = record.load({
			type : 'scriptdeployment',
			id : 512
		});
		scriptRecord.setValue({
			fieldId : 'custscript_request_body',
			value : JSON.stringify(requestBody)
		});
		scriptRecord.save();

		//======================调用Map/Reduce脚本实例 start============================
		var mapReduceScriptTask = task.create({
			taskType : task.TaskType.MAP_REDUCE
		});
		mapReduceScriptTask.scriptId = 'customscript_if_bom_update_mapreduce';
		mapReduceScriptTask.deploymentId = 'customdeploy_if_bom_update_mapreduce';
		mapReduceScriptTask.params = {
			"custscript_requestbody" : requestBody,
			"custscript_methodtype" : "PUT"
		};
		var mapReduceScriptTaskId = mapReduceScriptTask.submit();
		var taskStatus = task.checkStatus({
			taskId : mapReduceScriptTaskId
		});
		log.debug("taskStatus: " + taskStatus.status);

		//等待Map/Reduce完成后，再响应
		while (taskStatus.status === 'PENDING' || taskStatus.status === 'PROCESSING') {
			sleep(5000);
			taskStatus = task.checkStatus({
				taskId : mapReduceScriptTaskId
			});
		}
		log.debug("taskStatus: " + taskStatus.status);

		if (taskStatus.status == 'COMPLETE')
			log.debug("Complete");
		else if (taskStatus.status == 'FAILED')
			log.debug("Failed");

		log.audit("Remaining governance units end: " + runtime.getCurrentScript().getRemainingUsage());

		return {
			'MapReduceScriptTaskStatus' : taskStatus
		}
		//======================调用Map/Reduce脚本实例 end============================

		//======================自运行 start===================================//
		//		log.debug({
		//			title : "requestBody",
		//			details : requestBody
		//		});
		//		var scriptObj = runtime.getCurrentScript();
		//		try {
		//
		//			var r = dao.upsertBomAllRecordList('PUT', requestBody);
		//
		//			log.debug({
		//				title : 'addSuccess',
		//				details : JSON.stringify(r)
		//			});
		//
		//			log.debug("Remaining governance units success: " + scriptObj.getRemainingUsage());
		//			return {
		//				'isSuccess' : true,
		//				'bomData' : r
		//			}
		//		} catch (e) {
		//			log.debug({
		//				title : 'PUT bom error: ' + e.name,
		//				details : e.message
		//
		//			});
		//			return e;
		//		} finally {
		//			log.debug("Remaining governance units finally: " + scriptObj.getRemainingUsage());
		//		}
		//====================自运行 end==============================//

		//======================辅助函数=======================//
		function sleep(milliseconds) {
			var start = new Date().getTime();
			for (var i = 0; i < 1e7; i++) {
				if ((new Date().getTime() - start) > milliseconds) {
					break;
				}
			}
		}

		//setTimeout不可用
		//var taskStatus = setTimeout(task.checkStatus(scriptTaskId), 20000);
		//======================辅助函数 end=======================//

	}

	return {
		put : doPut
	};
});