/**
 * @NApiVersion 2.x
 * @NScriptType Restlet
 * @NModuleScope SameAccount
 * @NAmdConfig ./config.json
 * @author Zhu Yanlong
 */
/////////////////////////BOM接口////////////////////////////
//	
//	PUT
//
//////////////////////////////////////////////////////////
define([ 'N/record', 'N/search', 'N/runtime', 'dao' ],
/**
 * @param {record} record
 * @param {search} search
 * @param {runtime} runtime
 * @param {dao} dao
 */
function(record, search, runtime, dao) {

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

		try {
			if (requestBody)
				var recordType = requestBody.recordType;
			if (recordType == null) {
				throw log.debug({
					title : 'error',
					details : 'the requestBody.recordType'
				});

			} else if (recordType == 'bom') {
				var bomHeaderId = dao.getBomHeaderRecordId(requestBody.assemblyItemNumber);
				/*var bomRecord = record.load({
					type : record.Type.BOM,
					id : bomHeaderId,
					isDynamic : true
				});
				log.debug({
					title : 'bomRecord',
					details : bomRecord
				});

				bomRecord.setText({
					fieldId : 'memo',
					value : 'bomRecord post api test'
				});
				*/
				//record.Type.BOM无nlapiSubmitField
				/*var id = record.submitFields({
					type : record.Type.BOM,
					id : bomHeaderId,
					values : {
						memo : 'ABC'
					}
				});
				*/
				var bomRecord = record.load({
					type : record.Type.BOM,
					id : bomHeaderId
				});
				bomRecord.setValue({
					fieldId : 'memo',
					value : 'ABC'
				});
				var id = bomRecord.save();

				return {
					"isSuccess" : true,
					"id" : id
				};

			} else if (recordType == 'bomrevision') {
				var bomHeaderId = dao.getBomHeaderRecordId(requestBody.assemblyItemNumber);
				var bomRevisionId = dao.getBomRevisionRecordId(requestBody.assemblyItemNumber, requestBody.bomRevisionName);
				/*
				record.submitFields({
					type : record.Type.BOM_REVISION,
					id : bomRevisionId,
					values : {
						memo : 'ABC'
					}
				});
				*/
				var bomRevisionRecord = record.load({
					type : record.Type.BOM_REVISION,
					id : bomRevisionId
				});
				bomRevisionRecord.setValue({
					fieldId : 'memo',
					value : 'Revision ABC'
				});
				var id = bomRevisionRecord.save();
				return {
					"isSuccess" : true,
					"id" : id
				};

			} else if (recordType == 'component') {
				var bomHeaderId = dao.getBomHeaderRecordId(requestBody.assemblyItemNumber);
				var bomRevisionId = dao.getBomRevisionRecordId(requestBody.assemblyItemNumber, requestBody.bomRevisionName);
				var bomRevisionRecord = record.load({
					type : 'bomrevision',
					id : bomRevisionId,
					isDynamic: true
				});

				bomRevisionRecord.selectLine({
					sublistId : 'component',//多了个s
					line : 1
				});
				bomRevisionRecord.setCurrentSublistValue({
					sublistId : 'component',
					fieldId : 'componentyield',
					value : 99.5
				});
				bomRevisionRecord.commitLine({
					sublistId : 'component'
				});
				bomRevisionRecord.save();
			}
		} catch (e) {
			log.debug({
				title : 'post error ' + e.name,
				details : e.message
			});
			return e;
		}

	}

	return {
		put : doPut
	};
});