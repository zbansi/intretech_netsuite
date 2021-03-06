/**
 * @NApiVersion 2.x
 * @NScriptType MapReduceScript
 * @NModuleScope SameAccount
 * @NAmdConfig /SuiteScripts/intretech/config.json
 */
define([ 'N/runtime', 'N/record', 'N/error', 'N/email', 'N/log', 'utils', 'dao' ],
/**
 * @param {runtime} runtime
 * @param {record} record
 * @param {error} error
 * @param {email} email
 * @param {log} log
 * @param {utils} utils
 * @param {dao} dao
 */
function(runtime, record, error, email, log, utils, dao) {

	function handleErrorAndSendNotification(e, stage) {
		log.error('Stage: ' + stage + ' failed', e);

		var author = 27;
		var recipients = '377132229@qq.com';
		var subject = 'Map/Reduce script ' + runtime.getCurrentScript().id + ' failed for stage: ' + stage;
		var body = 'An error occurred with the following information:\n' + 'Error code: ' + e.name + '\n' + 'Error msg: ' + e.message;

		email.send({
			author : author,
			recipients : recipients,
			subject : subject,
			body : body
		});
	}

	function handleErrorIfAny(summary) {
		var inputSummary = summary.inputSummary;
		var mapSummary = summary.mapSummary;
		var reduceSummary = summary.reduceSummary;

		if (inputSummary.error) {
			var e = error.create({
				name : 'INPUT_STAGE_FAILED',
				message : inputSummary.error
			});
			handleErrorAndSendNotification(e, 'getInputData');
		}

		handleErrorInStage('map', mapSummary);
		handleErrorInStage('reduce', reduceSummary);
	}

	function handleErrorInStage(stage, summary) {
		var errorMsg = [];
		summary.errors.iterator().each(function(key, value) {
			var msg = 'Failure update from BOM data: ' + key + '. Error was: ' + JSON.parse(value).message + '\n';
			errorMsg.push(msg);
			return true;
		});
		if (errorMsg.length > 0) {
			var e = error.create({
				name : 'BOM_UPDATE_FAILED',
				message : JSON.stringify(errorMsg)
			});
			handleErrorAndSendNotification(e, stage);
		}
	}

	function createSummaryRecord(summary) {
		try {
			var seconds = summary.seconds;
			var usage = summary.usage;
			var yields = summary.yields;

			var rec = record.create({
				type : 'customrecord_summary',
			});

			rec.setValue({
				fieldId : 'name',
				value : 'Summary for M/R script: ' + runtime.getCurrentScript().id
			});

			rec.setValue({
				fieldId : 'custrecord_time',
				value : seconds
			});
			rec.setValue({
				fieldId : 'custrecord_usage',
				value : usage
			});
			rec.setValue({
				fieldId : 'custrecord_yields',
				value : yields
			});

			rec.save();
		} catch (e) {
			handleErrorAndSendNotification(e, 'summarize');
		}
	}

	/**
	 * Marks the beginning of the Map/Reduce process and generates input data.
	 * 
	 * @typedef {Object} ObjectRef
	 * @property {number} id - Internal ID of the record instance
	 * @property {string} type - Record type id
	 * 
	 * @return {Array|Object|Search|RecordRef} inputSummary
	 * @since 2015.1
	 */
	function getInputData(context) {
		//获取RESTlet脚本实例的requestBody数据
		//custscript_request_body
		//从请求脚本的参数字段中取数
		//		var scriptRecord = record.load({
		//			type : 'scriptdeployment',
		//			id : 512
		//		});
		//		return utils.string2JSONObject(scriptRecord.getValue({
		//			fieldId : 'custscript_request_body'
		//		}));
		//从当前脚本参数字段取值
		log.audit("Remaining governance units start: " + runtime.getCurrentScript().getRemainingUsage());
		return utils.string2JSONObject(runtime.getCurrentScript().getParameter('custscript_requestbody'));

	}

	/**
	 * Executes when the map entry point is triggered and applies to each key/value pair.
	 * 
	 * @param {MapSummary} context - Data collection containing the key/value pairs to process through the map stage
	 * @since 2015.1
	 */
	function map(context) {
		log.debug({
			title : "mapContext 1",
			details : context
		});
		var i = 0;
		//一定要用JSON.parse将value的string编码值转换成对象
		var bomList = JSON.parse(context.value);
		bomList.forEach(function(b) {
			context.write({
				key : i,
				value : b
			});
			i++;
		});
	}

	/**
	 * Executes when the reduce entry point is triggered and applies to each group.
	 * 
	 * @param {ReduceSummary} context - Data collection containing the groups to process through the reduce stage
	 * @since 2015.1
	 */
	function reduce(context) {
		log.debug({
			title : "reduceContext context key",
			details : context.key
		});
		log.debug({
			title : "reduceContext context values[0] before JSON.parse",
			details : context.values[0]
		});
		log.debug({
			title : "reduceContext context values[0] after JSON.parse",
			details : JSON.parse(context.values[0])
		});

		//更新BOM数据,一定要用JSON.parse将数组string编码值转换成对象
		log.audit("method type" + runtime.getCurrentScript().getParameter('custscript_methodtype'));
		var result = dao.upsertBomAllRecord(runtime.getCurrentScript().getParameter('custscript_methodtype'), JSON.parse(context.values[0]));
		// end 更新BOM数据

		context.write({
			key : context.key,
			value : result
		});

		log.debug({
			title : "reduceContext result",
			details : context
		});
		log.debug({
			title : "reduceContext context",
			details : 'key: ' + context.key + ', value: ' + context.value
		});

	}

	/**
	 * Executes when the summarize entry point is triggered and applies to the result set.
	 * 
	 * @param {Summary} summary - Holds statistics regarding the execution of a map/reduce script
	 * @since 2015.1
	 */
	function summarize(summary) {

		handleErrorIfAny(summary);
		createSummaryRecord(summary);
		log.debug({
			title : "summary",
			details : summary
		});
		log.audit("Remaining governance units end: " + runtime.getCurrentScript().getRemainingUsage());

	}

	return {
		getInputData : getInputData,
		map : map,
		reduce : reduce,
		summarize : summarize
	};

});