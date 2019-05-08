/**
 * @NApiVersion 2.x
 * @NScriptType Restlet
 * @NModuleScope SameAccount
 * @NAmdConfig ./config.json
 * @author Zhu Yanlong
 */
/////////////////////////BOM接口////////////////////////////
//	
// 	GET
//	
//////////////////////////////////////////////////////////
define([ 'N/record', 'N/search', 'N/runtime', 'dao' ], function(record, search,
		runtime, dao) {

	/**
	 * Function called upon sending a GET request to the RESTlet.
	 * 
	 * @param {Object} requestParams - Parameters from HTTP request URL; parameters will be passed into function as an Object (for all supported content types)
	 * @returns {string | Object} HTTP response body; return string when request Content-Type is 'text/plain'; return Object when request Content-Type is
	 *          'application/json'
	 * @since 2015.1
	 */
	/* GET Method: 报文传参格式
	 * 
	 * requestParams.filterList: 混合二维数据，偶数元素是长度2或3的一维数据（谓词要素），奇数元素是逻辑运算符
	 * requestParams.filterList = [ [ 'name', 'is', 'EAI.TEST.190422A01-cBOM' ] ];
	 * 
	 */
	function doGet(requestParams) {

		var filterList = [];
		var filterRegExp = /.+/;
		var fenceRegExp1 = /(\],)+|(,\[)+/;
		var fenceRegExp2 = /,/;
		try {

			var filterListStr = requestParams.filterList.replace(/[""''\s]/g,
					'');
			//去除首尾方括号					
			filterListStr = filterListStr.replace(/\[{2,10}/g, '');
			filterListStr = filterListStr.replace(/\]{2,10}/g, '');
			log.debug({
				title : 'filterList replace',
				details : filterListStr
			});
			//将字符串转换成单个元素数组
			filterList = filterRegExp.exec(filterListStr);//返回数组
			log.debug({
				title : 'filterRegExp.exec',
				details : filterList
			});

			//以右方括号逗号|逗号左方括号为分隔符，将原数组元素映射转换成多个元素一维数组
			filterList = filterList.map(function(f) {//f是字符串
				return f.split(fenceRegExp1);
			});
			log.debug({
				title : 'filterList.map1',
				details : filterList
			});
			//过滤掉数组中的"","],",",[",","
			filterList = filterList[0].filter(function(e) {
				if (e != "" && e != "]," && e != ",[" && e != ",")
					return e;
			});
			log.debug({
				title : 'filterList filter',
				details : filterList
			});
			//将一维数组中的偶数索引的元素按逗号分隔映射转换成数组
			filterList = filterList.map(function(f) {//f是数组
				if (filterList.indexOf(f) % 2)
					return f;
				else
					return f.split(fenceRegExp2);
			});
			log.debug({
				title : 'filterList.map2',
				details : filterList
			});

			return {
				"resultSet" : dao.getBOMAllData(filterList)
			};
		} catch (e) {
			log.debug({
				title : 'doGet Error :' + e.name,
				details : e.message
			});
		}
	}

	return {
		'get' : doGet
	};
});