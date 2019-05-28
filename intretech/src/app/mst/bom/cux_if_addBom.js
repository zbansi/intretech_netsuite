/**
 * @NApiVersion 2.x
 * @NScriptType Restlet
 * @NModuleScope SameAccount
 * @NAmdConfig /SuiteScripts/intretech/config.json
 * @author Zhu Yanlong
 */
/////////////////////////BOM接口////////////////////////////
//	
//	POST
//
//////////////////////////////////////////////////////////
define([ 'N/record', 'N/search', 'N/runtime', 'dao','utils' ],
/**
 * @param {record} record
 * @param {search} search
 * @param {runtime} runtime
 * @param {dao} dao
 * @param {utils} utils
 */
function(record, search, runtime, dao,utils) {

	/**
	 * Function called upon sending a POST request to the RESTlet.
	 * 
	 * @param {string | Object} requestBody - The HTTP request body; request body will be passed into function as a string when request Content-Type is
	 *            'text/plain' or parsed into an Object when request Content-Type is 'application/json' (in which case the body must be a valid JSON)
	 * @returns {string | Object} HTTP response body; return string when request Content-Type is 'text/plain'; return Object when request Content-Type is
	 *          'application/json'
	 * @since 2015.2
	 */
	function doPost(requestBody) {
		//======================调用Map/Reduce脚本实例 start============================
		//		var mapReduceScriptTask = task.create({
		//			taskType : task.TaskType.MAP_REDUCE
		//		});
		//		mapReduceScriptTask.scriptId = 'customscript_if_bom_update_mapreduce';
		//		mapReduceScriptTask.deploymentId = 'customdeploy_if_bom_update_mapreduce';
		//		mapReduceScriptTask.params = {
		//			"custscript_requestbody" : requestBody,
		//          "custscript_methodtype" : "POST"
		//		};
		//		var mapReduceScriptTaskId = mapReduceScriptTask.submit();
		//		var taskStatus = task.checkStatus({
		//			taskId : mapReduceScriptTaskId
		//		});
		//		log.debug("taskStatus: " + taskStatus.status);
		//
		//		//等待Map/Reduce完成后，再响应
		//		while (taskStatus.status === 'PENDING' || taskStatus.status === 'PROCESSING') {
		//			utils.sleep(5000);
		//			taskStatus = task.checkStatus({
		//				taskId : mapReduceScriptTaskId
		//			});
		//		}
		//		log.debug("taskStatus: " + taskStatus.status);
		//
		//		if (taskStatus.status == 'COMPLETE')
		//			log.debug("Complete");
		//		else if (taskStatus.status == 'FAILED')
		//			log.debug("Failed");
		//
		//		log.audit("Remaining governance units end: " + runtime.getCurrentScript().getRemainingUsage());
		//
		//		return {
		//			'MapReduceScriptTaskStatus' : taskStatus
		//		}
		//======================调用Map/Reduce脚本实例 end============================
		
		var scriptObj = runtime.getCurrentScript();
		log.debug("Remaining governance units: " + scriptObj.getRemainingUsage());
		try {
			var r = dao.upsertBomAllRecordList('POST', requestBody);
			log.debug({
				title : 'addSuccess',
				details : JSON.stringify(r)
			});

			log.debug("Remaining governance units: " + scriptObj.getRemainingUsage());
			return {
				'isSuccess' : true,
				'bomData' : r
			}
		} catch (e) {
			log.debug({
				title : 'Post bom error: ' + e.name,
				details : e.message

			});
			return e;
		}
	}

	return {
		post : doPost
	};
});