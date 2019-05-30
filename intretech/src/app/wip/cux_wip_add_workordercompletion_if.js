/**
 * @NApiVersion 2.x
 * @NScriptType Restlet
 * @NModuleScope SameAccount
 * @NAmdConfig /SuiteScripts/intretech/config.json
 * @author Zhu Yanlong
 */
/////////////////////////workorder completion接口////////////////////////////
//	
// 	POST
//	
//////////////////////////////////////////////////////////
define([ 'dao' ],
/**
 * @param {dao} dao
 */

function(dao) {

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
		try {
			return dao.createAndSaveWorkOrderCompletion(requestBody);
		} catch (e) {
			log.debug({
				title : 'doPOST Error :' + e.name,
				details : e.message
			});
			return e;
		}
	}

	return {
		'post' : doPost
	};
});