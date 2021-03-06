/**
 * @NApiVersion 2.x
 * @NScriptType Restlet
 * @NModuleScope SameAccount
 * @NAmdConfig /SuiteScripts/intretech/config.json
 * @author Zhu Yanlong
 */
/////////////////////////BOM接口////////////////////////////
//
//	DELETE
//
//////////////////////////////////////////////////////////
define([ 'N/record', 'N/search', 'N/runtime', 'dao', 'utils' ],
/**
 * @param {record} record
 * @param {search} search
 * @param {runtime} runtime
 * @param {dao} dao
 * @param {utils} utils
 */

function(record, search, runtime, dao, utils) {
	/**
	 * Function called upon sending a DELETE request to the RESTlet.
	 * 
	 * @param {Object} requestParams - Parameters from HTTP request URL; parameters will be passed into function as an Object (for all supported content types)
	 * @param {String} requestParams.type - text | array
	 * @param {String} requestParams.bomAndRevisionNames - if text: "65;66:v1,v2;67;68:v1" if array:
	 *            [{bom:65,assembly:[a1,a2],bomrev:[v1,v2]},{bom:66,assembly:[a3,a4],bomrev:[v1,v2]}]
	 * @returns {string | Object} HTTP response body; return string when request Content-Type is 'text/plain'; return Object when request Content-Type is
	 *          'application/json'
	 * @since 2015.2
	 */

	function doDelete(requestParams) {
		log.debug({
			title : "deleteRequestParams: ",
			details : requestParams
		});
		var deleteBomResult = [];
		var deleteBomRevisionResult = [];
		try {
			//type 1
			if (requestParams.type == 'text') {
				var bomAndRevisionList = [];

				bomAndRevisionList = requestParams.bomAndRevisionNames.split(";").map(function(a) {
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
						deleteBomResult.push(dao.deleteRecord(record.Type.BOM, bomHeaderId));
					} else {

						var bomRevisionIds = e[1].map(function(n) {
							return dao.getBomRevisionRecordId(e[0][0], n)
						});

						log.debug({
							title : "bomRevisionIds: ",
							details : bomRevisionIds
						});

						deleteBomRevisionResult.push(dao.deleteRecords(record.Type.BOM_REVISION, bomRevisionIds));
					}
				});
			}
			//type 2
			if (requestParams.type == 'array') {
				var deletedObjList = utils.string2Array(requestParams.bomAndRevisionNames);
				deletedObjList.forEach(function(obj) {
					if (obj['bomrev']) {
						var bomRevisionIds = obj['bomrev'].map(function(bomRev) {
							return dao.getBomRevisionRecordId(obj['bom'], bomRev)
						});
						deleteBomRevisionResult.push(dao.deleteRecords(record.Type.BOM_REVISION, bomRevisionIds));
					} else {
						var bomHeaderId = dao.getBomHeaderRecordId(obj['bom']);
						deleteBomResult.push(dao.deleteRecord(record.Type.BOM, bomHeaderId));
					}
				});
			}

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
			return e;
		}
	}

	return {
		'delete' : doDelete
	};
});