require([ 'N/search', '/SuiteScripts/intretech/src/utils/search_columns' ], function(search, columnset) {

	function getAssemblyBilofMaterials(filterList) {
		var filters = [ [ 'isinactive', 'is', 'F' ] ];
		if (filterList && filterList.length > 0) {
			filters.push("and");
			filters = filters.concat(filterList);
		}
		var resultSet = [];
		var columns = [];
		var columnList = columnset.setColumns(search.Type.ITEM);
		var columnJoins = columnset.setJoinColumns(search.Type.ITEM);
		columns = columns.concat(columnList);
		columns = columns.concat(columnJoins);
		var pagedData = search.create({
			type : search.Type.ITEM,
			filters : filters,
			columns : columns
		}).runPaged();

		var resultSet = [];
		pagedData.pageRanges.forEach(function(pageRange) {
			var page = pagedData.fetch({
				index : pageRange.index
			});
			page.data.forEach(function(result) {
				resultSet.push(result);
			});
		});
		log.debug({
			"title" : "result",
			"details" : resultSet
		});
	}
	var filterList = [ [ 'itemid', 'is', 'S00001' ] ];
	getAssemblyBilofMaterials(filterList);

});

require([ 'N/search', '/SuiteScripts/intretech/src/utils/search_columns' ], function(search, columnset) {

	function getBomAssemblyItem(filterList) {
		var filters = [ [ 'isinactive', 'is', 'F' ] ];
		if (filterList && filterList.length > 0) {
			filters.push("and");
			filters = filters.concat(filterList);
		}
		var resultSet = [];
		var columns = [];
		var columnList = columnset.setColumns(search.Type.BOM);
		var columnJoins = columnset.setJoinColumns(search.Type.BOM);
		columns = columns.concat(columnList);
		columns = columns.concat(columnJoins);
		var pagedData = search.create({
			type : search.Type.BOM,
			filters : filters,
			columns : columns
		}).runPaged();

		var resultSet = [];
		pagedData.pageRanges.forEach(function(pageRange) {
			var page = pagedData.fetch({
				index : pageRange.index
			});
			page.data.forEach(function(result) {
				resultSet.push(result);
			});
		});
		log.debug({
			"title" : "result",
			"details" : resultSet
		});
	}
	var filterList = [ [ 'name', 'is', 'S00001' ] ];
	getBomAssemblyItem(filterList);

});

require([ 'N/search', '/SuiteScripts/intretech/src/utils/search_columns', '/SuiteScripts/intretech/src/dao/dao_eai' ], function(search, columnset, dao) {

	function getBomAssemblyItemAndRevisionAndComponet(filterList) {
		var filters = [ [ 'isinactive', 'is', 'F' ] ];
		if (filterList && filterList.length > 0) {
			filters.push("and");
			filters = filters.concat(filterList);
		}
		var resultSet = [];
		var columns = [];
		var columnList = columnset.setColumns(search.Type.BOM);
		var columnJoins = columnset.setJoinColumns(search.Type.BOM);
		columns = columns.concat(columnList);
		columns = columns.concat(columnJoins);
		var pagedData = search.create({
			type : search.Type.BOM,
			filters : filters,
			columns : columns
		}).runPaged();

		var resultSet = [];
		pagedData.pageRanges.forEach(function(pageRange) {
			var page = pagedData.fetch({
				index : pageRange.index
			});
			page.data.forEach(function(result) {
				//添加组件明细
				log.debug({
					"title" : "resultxxxx",
					"details" : result
				});

				var revisionId = result.getValue({
					"name" : "internalid",
					"join" : "revision"
				});
				log.debug({
					"title" : "revisionName",
					"details" : revisionId
				});
				var compFilter = [ 'internalid', 'is' ];
				compFilter.push(revisionId);
				var flt = [];
				flt.push(compFilter);
				log.debug({
					"title" : "filter",
					"details" : flt
				});
				var components = dao.getBomRevisionComponents(flt);
				var bomObj = Object.create(null);
				//				bomObj.assemblyid = result.getValue({
				//					'name' : 'assemblyid',
				//					'joinid' : 'assemblyitembom'
				//				});
				//				bomObj.assembly = result.getValue({
				//					'name' : 'assembly',
				//					'joinid' : 'assemblyitembom'
				//				});
				//				bomObj['default'] = result.getValue({
				//					'name' : 'default',
				//					'joinid' : 'assemblyitembom'
				//				});
				bomObj.assemblyid = result.getValue(result.columns[8]);
				bomObj.assembly = result.getValue(result.columns[9]);
				bomObj['default'] = result.getValue(result.columns[5]);

				bomObj.bom_id = result.getValue('internalid');
				bomObj.bom_name = result.getValue('name');

				bomObj.revision_internalid = result.getValue({
					'name' : 'internalid',
					'joinid' : 'revision'
				});
				bomObj.revision_name = result.getValue({
					'name' : 'name',
					'joinid' : 'revision'
				});
				bomObj.components = components;

				resultSet.push(bomObj);
			});
		});
		log.debug({
			"title" : "result",
			"details" : resultSet
		});
	}
	var filterList = [ [ 'name', 'is', 'S00001' ] ];
	getBomAssemblyItemAndRevisionAndComponet(filterList);

});

require(['N/record', 'N/search', 'N/error', 'N/runtime', 'N/format', '/SuiteScripts/intretech/src/utils/search_columns',
 		'/SuiteScripts/intretech/src/utils/search_filters', '/SuiteScripts/intretech/src/utils/utils', '/SuiteScripts/intretech/src/dao/dao_eai', ],
 	/**
 	 * @param {record} record
 	 * @param {search} search
 	 * @param {error} error
 	 * @param {runtime} runtime
 	 * @param {format} format
 	 * @param {columnset} columnset
 	 * @param {filterset} filterset
 	 * @param {utils} utils
 	 */
 	function (record, search, error, runtime, format, columnset, filterset, utils, dao) {
 	function test() {
 		var filters =
 			[["isinactive", "isnot", "T"], "AND", ["subsidiary", "is", "1"], "AND", ["includechildren", "is", "T"], "AND", ["assemblyitem.default", "is", "T"], "AND", [["revision.name", "contains", "v1"], "or", ["revision.name", "contains", "v2"]]];

 		//, "AND", [["revision.name", "anyof", "v1.0"], "or", ["revision.name", "anyof", "v2.0"]]

 		//[["isinactive", "isnot", "T"], "and", ["subsidiary", "is", "1"], "AND", ["includechildren", "is", "T"], "AND", ["assemblyitem.default", "is", "T"], "AND", //["assemblyitem.locations", "anyof", ["1", "2"]], "AND", ["revision.name", "anyof", ["v1.0", "v2.0"]], "and", ["name", "is", "S00001"]];

 		var columns = [];
 		var columnList = columnset.setColumns(search.Type.BOM);
 		var columnJoins = columnset.setJoinColumns(search.Type.BOM);
 		columns = columns.concat(columnList);
 		columns = columns.concat(columnJoins);
 		var pagedData = search.create({
 				type: search.Type.BOM,
 				filters: filters,
 				columns: columns
 			}).runPaged();

 		var resultSet = [];
 		pagedData.pageRanges.forEach(function (pageRange) {
 			var page = pagedData.fetch({
 					index: pageRange.index
 				});
 			page.data.forEach(function (result) {

 				//构建JSON格式的响应报文
 				var bomObj = Object.create(null);
 				bomObj.assembly = result.getText(result.columns[5]);
 				bomObj.assemblyid = result.getValue(result.columns[6]);
 				bomObj['default'] = result.getValue(result.columns[9]);
 				bomObj.locations = result.getValue(result.columns[10]);

 				bomObj.bom_id = result.getValue('internalid');
 				bomObj.bom_name = result.getValue('name');
 				bomObj.subsidiary = result.getValue('subsidiary');

 				bomObj.revision_internalid = result.getValue({
 						'name': 'internalid',
 						'joinid': 'revision'
 					});
 				bomObj.revision_name = result.getValue({
 						'name': 'name',
 						'joinid': 'revision'
 					});

 				//添加版本的组件明细
 				//获取版本id
 				var revisionId = result.getValue({
 						"name": "internalid",
 						"join": "revision"
 					});
 				var compFilter = ['internalid', 'is'];
 				compFilter.push(revisionId);
 				var flt = [];
 				flt.push(compFilter);
 				//执行子查询
 				var components = dao.getBomRevisionComponents(flt);
 				//添加组件明细
 				bomObj.components = components;

 				resultSet.push(bomObj);
 			});
 		});
 		log.debug({
 			title: 'resultSet',
 			details: resultSet
 		});
 		return resultSet;
 	}

 	test();

 });
