/**
 * @NApiVersion 2.x
 * @NScriptType Restlet
 * @NModuleScope SameAccount
 * @NAmdConfig ./config.json
 * @author Zhu Yanlong
 */
/////////////////////////BOM接口////////////////////////////
//
//	DELETE
//
//////////////////////////////////////////////////////////
define([ 'N/record', 'N/search', 'N/runtime', 'dao' ], function(record, search,
		runtime, dao) {
	/**
	 * Function called upon sending a DELETE request to the RESTlet.
	 * 
	 * @param {Object} requestParams - Parameters from HTTP request URL; parameters will be passed into function as an Object (for all supported content types)
	 * @returns {string | Object} HTTP response body; return string when request Content-Type is 'text/plain'; return Object when request Content-Type is
	 *          'application/json'
	 * @since 2015.2
	 */
	/* DELETE Method 报文传参格式
	 * recordType: string
	 * recordId: string 多个id以逗号分隔			 * 
	 */
	function doDelete(requestParams) {
		log.debug({
			title : "deleteRequestParams: ",
			details : requestParams
		});
		try {
			var deleteResult = dao.deleteRecords(requestParams.recordType,
					requestParams.recordId.split(","));
			//					var deleteRecordId = dao.deleteRecord(
			//							requestParams.recordType, requestParams.recordId);
			log.debug({
				title : 'addSuccess',
				details : deleteResult
			});
			return {
				deletedBOMId : deleteResult
			};

		} catch (e) {
			log.debug({
				title : 'delelteError ' + e.name,
				details : e.message
			})
		}
	}

	return {
		'delete' : doDelete
	};
});