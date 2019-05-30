/**
 * @NApiVersion 2.x
 * @NScriptType Restlet
 * @NModuleScope SameAccount
 * @NAmdConfig /SuiteScripts/intretech/config.json
 * @author Zhu Yanlong
 */
///////////////return material authorization(客户退货授权) item receipt issue接口////////////////////////////
//	
// 	GET
//	
////////////////////////////////////////////////////////////////////////////////////////////////////////
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
	 * Function called upon sending a GET request to the RESTlet.
	 * 
	 * @param {Object} requestParams - Parameters from HTTP request URL; parameters will be passed into function as an Object (for all supported content types)
	 * 
	 * @param {String} requestParams.filterList - 混合二维数据，偶数元素是长度2或3的一维数据（谓词要素），奇数元素是逻辑运算符 requestParams.filterList = [ [ 'name', 'is', 'EAI.TEST.190422A01-cBOM' ] ];
	 * 
	 * @returns {string | Object} HTTP response body; return string when request Content-Type is 'text/plain'; return Object when request Content-Type is
	 *          'application/json'
	 * @since 2015.1
	 */

	function doGet(requestParams) {

		var filterList = [];
		try {
			if (requestParams.filterList)
				filterList = utils.string2Array(requestParams.filterList);
			return {
				"resultSet" : dao.getItemReceiptRMA(filterList)
			};
		} catch (e) {
			log.debug({
				title : 'doGet Error :' + e.name,
				details : e.message
			});
			return e;
		}
	}

	return {
		'get' : doGet
	};
});