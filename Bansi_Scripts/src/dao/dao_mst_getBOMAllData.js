/**
 * NApiVersion 2.x
 */
require([ 'N/record', 'N/search' ], function(record, search) {
	function getBOMAllData(filterList) {

		var filters = [ [ 'isinactive', 'is', 'F' ] ];
		//		filters.push(search.createFilter({
		//			name: 'isinactive',
		//			operator: 'is',
		//			values: 'F',
		//			isor:'false',
		//			leftparens:1,
		//			rightparens:1
		//		}));				
		if (filterList.length > 0) {
			filters.push("and");
			filters = filters.concat(filterList);
		}
		var columnList = [ 'createddate', 'effectivestartdate',
				'effectiveenddate', 'externalid', 'internalid', 'isinactive',
				'memo', 'name' ];
		var columns = [];
		columns.push(search.createColumn({
			name : 'name',
			join : 'billofmaterials'
		}));

		columns.push(search.createColumn({
			name : 'isinactive',
			join : 'billofmaterials'
		}));

		columnList.forEach(function(e) {
			columns.push(search.createColumn({
				name : e,
			}));
		});

		//		columns.push(search.createColumn({
		//			name: 'linenumber',
		//			join: 'component'
		//		}));
		//		
		columns.push(search.createColumn({
			name : 'internalid',
			join : 'component'
		}));

		columns.push(search.createColumn({
			name : 'item',
			join : 'component'
		}));

		columns.push(search.createColumn({
			name : 'bomquantity',
			join : 'component'
		}));

		columns.push(search.createColumn({
			name : 'quantity',
			join : 'component'
		}));

		columns.push(search.createColumn({
			name : 'componentyield',
			join : 'component'
		}));

		//		columns.push(search.createColumn({
		//			name: 'unit',
		//			join: 'component'
		//		}));
		//		

		var pagedData = search.create({
			type : search.Type.BOM_REVISION, //bomrevision,
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
			title : 'sss',
			details : resultSet
		});
		return resultSet;
	}
	getBOMAllData([]);
});
