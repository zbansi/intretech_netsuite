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
	 * @param {string | Object} requestBody - The HTTP request body; request body will be passed into function as a string when request Content-Type is
	 *            'text/plain' or parsed into an Object when request Content-Type is 'application/json' (in which case the body must be a valid JSON)
	 * @param {Array} requestBody.locationList
	 * @returns {string | Object} HTTP response body; return string when request Content-Type is 'text/plain'; return Object when request Content-Type is
	 *          'application/json'
	 * @since 2015.2
	 */
	function doPost(requestBody) {

		try {
			var result = dao.upsertLocationList('POST', requestBody.locationList);

			return {
				'isSuccess' : true,
				'locationData' : result
			}
		} catch (e) {
			log.debug({
				title : 'Post location error: ' + e.name,
				details : e.message

			});
			return e;
		}
	}

	return {
		post : doPost
	};
});