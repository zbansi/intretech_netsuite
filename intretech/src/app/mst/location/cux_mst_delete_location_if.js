/**
 * @NApiVersion 2.x
 * @NScriptType Restlet
 * @NModuleScope SameAccount
 * @NAmdConfig /SuiteScripts/intretech/config.json
 * @author Zhu Yanlong
 */
/////////////////////////Location 接口////////////////////////////
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
	 * Function called upon sending a POST request to the RESTlet.
	 * 
	 * @param {Object} requestParams - Parameters from HTTP request URL; parameters will be passed into function as an Object (for all supported content types)
	 * @param {Array} requestParams.locationList
	 * @returns {string | Object} HTTP response body; return string when request Content-Type is 'text/plain'; return Object when request Content-Type is
	 *          'application/json'
	 * @since 2015.1
	 */
	function doDelete(requestParams) {
		var locationList = [];
		try {
			if (requestParams.locationList)
				locationList = utils.string2Array(requestParams.locationList);
			var locationIds = locationList.map(function(name) {
				return dao.getRecordId(record.Type.LOCATION, name);
			});

			var result = dao.deleteRecords(record.Type.LOCATION, locationIds);

			return {
				'isSuccess' : true,
				'locationData' : result
			}
		} catch (e) {
			log.debug({
				title : 'Get location error: ' + e.name,
				details : e.message

			});
			return e;
		}
	}

	return {
		'delete' : doDelete
	};
});