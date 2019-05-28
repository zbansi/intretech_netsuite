/**
 * @NApiVersion 2.x
 * @NScriptType Restlet
 * @NModuleScope SameAccount
 * @NAmdConfig /SuiteScripts/intretech/config.json
 * @author Zhu Yanlong
 */
/////////////////////////work order issue鎺ュ彛////////////////////////////
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
	/* GET Method: 璇锋眰浼犲弬鏍煎紡
	 * 
	 * requestParams.filterList: 娣峰悎浜岀淮鏁版嵁锛屽伓鏁板厓绱犳槸闀垮害2鎴��戒竴缁存暟鎹紙璋撹瘝瑕佺礌锛夛紝濂囨暟鍏冪礌鏄拷1锟�借緫杩愮畻绗��
	 * requestParams.filterList = [ [ 'name', 'is', 'EAI.TEST.190422A01-cBOM' ] ];
	 * 
	 */
	function doGet(requestParams) {

		var filterList = [];
		try {
			if (requestParams.filterList)
				filterList = utils.string2Array(requestParams.filterList);
			return {
				"resultSet" : dao.getInventoryTransfer(filterList)
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