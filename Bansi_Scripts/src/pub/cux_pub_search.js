/**
 * @NApiVersion 2.x
 * @NScriptType Restlet
 * @NModuleScope SameAccount
 * @author Zhu Yanlong
 */
/////////////////////////BOM接口////////////////////////////
//	POST
// 	GET
//	DELETE
//	PUT
//////////////////////////////////////////////////////////
define([ 'N/record', 'N/search', 'N/runtime', '../dao/dao' ], function(record, search,
		runtime, dao) {

	function doGet(requestParams) {
		//				var recordType = 'bom';
		//				var filterList = [ [ 'name', 'is', 'EAI.TEST.190422A01-cBOM' ] ];
		//				var columnList = [ 'name', 'memo', ];
		log.debug({
			title : 'requestParams',
			details : requestParams
		});
		var filterList = [];
		var columnList = [];
		var columnRegExp = /.+/;
		var filterRegExp = /.+/;
		var fenceRegExp1 = /(\],)+|(,\[)+/;
		var fenceRegExp2 = /,/;
		try {
			var recordType = requestParams.recordType;
			//去除空格
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

			var columnListStr = requestParams.columnList.replace(/[""''\s]/g,
					'');

			columnListStr = columnListStr.replace(/\[+/g, '');
			columnListStr = columnListStr.replace(/\]+/g, '');

			log.debug({
				title : 'columnList replace 1',
				details : columnListStr
			});
			columnList = columnRegExp.exec(columnListStr);//返回数组
			log.debug({
				title : 'columnList regexp',
				details : columnList
			});
			columnList = columnList.map(function(f) {//f是数组
				return f.split(",");
			})[0];

			log.debug({
				title : 'columnList map',
				details : columnList
			});

			return {
				"resultSet" : dao.getSearchResultSet(recordType, filterList,
						columnList)
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