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