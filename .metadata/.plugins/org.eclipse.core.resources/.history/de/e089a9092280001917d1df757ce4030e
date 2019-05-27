/**
 * @NApiVersion 2.x
 * @NScriptType Restlet
 * @NModuleScope SameAccount
 * @NAmdConfig /SuiteScripts/intretech/config.json
 * @author Zhu Yanlong
 */
/////////////////////////work order接口////////////////////////////
//	
// 	GET
//	
//////////////////////////////////////////////////////////
define([ 'N/record', 'N/search', 'N/runtime', 'dao',
		'utils' ],
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
	 * @returns {string | Object} HTTP response body; return string when request Content-Type is 'text/plain'; return Object when request Content-Type is
	 *          'application/json'
	 * @since 2015.1
	 */
	/* GET Method: 请求传参格式
	 * 
	 * requestParams.filterList: 混合二维数据，偶数元素是长度2或3的一维数据（谓词要素），奇数元素是逻辑运算符
	 * requestParams.filterList = [ [ 'name', 'is', 'EAI.TEST.190422A01-cBOM' ] ];
	 * 
	 */
	function doGet(requestParams) {

		var filterList = [];
		try {
			if (requestParams.filterList)
				filterList = utils.string2Array(requestParams.filterList);
			return {
				"resultSet" : dao.getWorkOrderData(filterList)
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