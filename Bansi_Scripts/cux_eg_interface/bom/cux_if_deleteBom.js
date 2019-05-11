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
define([ 'N/record', 'N/search', 'N/runtime', 'dao' ],
/**
 * @param {record} record
 * @param {search} search
 * @param {runtime} runtime
 * @param {dao} dao
 */

function(record, search, runtime, dao) {
	/**
	 * Function called upon sending a DELETE request to the RESTlet.
	 * 
	 * @param {Object} requestParams - Parameters from HTTP request URL; parameters will be passed into function as an Object (for all supported content types)
	 * @returns {string | Object} HTTP response body; return string when request Content-Type is 'text/plain'; return Object when request Content-Type is
	 *          'application/json'
	 * @since 2015.2
	 */
	/*
		requestParams.bomAndRevisionNames: "65;66:v1,v2;67;68:v1"
	*/
	function doDelete(requestParams) {
		log.debug({
			title : "deleteRequestParams: ",
			details : requestParams
		});
		try {

			var bomAndRevisionList = [];
			var deleteBomResult = [];
			var deleteBomRevisionResult = [];
			bomAndRevisionList = requestParams.bomAndRevisionNames.split(";")
					.map(function(a) {
						return a.split(":");
					}).map(function(b) {
						return b.map(function(c) {
							return c.split(",");
						});
					});

			log.debug({
				title : "bomAndRevisionList: ",
				details : bomAndRevisionList
			});

			if (bomAndRevisionList.length == 0)
				throw "requestParams bomAndRevisionNames error!";

			bomAndRevisionList.forEach(function(e) {
				log.debug({
					title : "array: ",
					details : e
				});
				var bomHeaderId = dao.getBomHeaderRecordId(e[0][0]);
				if (e.length == 1) {
					deleteBomResult.push(dao.deleteRecord(record.Type.BOM,
							bomHeaderId));
				} else {
					
					var bomRevisionIds = e[1].map(function(n) {
						return dao.getBomRevisionRecordId(e[0][0], n)
					});
					
					log.debug({
						title : "bomRevisionIds: ",
						details : bomRevisionIds
					});

					deleteBomRevisionResult.push(dao.deleteRecords(
							record.Type.BOM_REVISION, bomRevisionIds));
				}
			});

			log.debug({
				title : 'deleteSuccess',
				details : {
					deletedBOMId : deleteBomResult,
					deletedBOMRevisionId : deleteBomRevisionResult
				}
			});
			return {
				isSuccess : true,
				deletedBOMId : deleteBomResult,
				deletedBOMRevisionId : deleteBomRevisionResult
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