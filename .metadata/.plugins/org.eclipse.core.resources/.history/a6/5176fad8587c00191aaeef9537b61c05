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

		var scriptObj = runtime.getCurrentScript();
		log.debug("Remaining governance units: " + scriptObj.getRemainingUsage());
		try {
			var r = dao.upsertBomAllRecord('PUT', requestBody);
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
				title : 'PUT bom error: ' + e.name,
				details : e.message

			});
			return e;
		}
	}

	return {
		put : doPut
	};
});