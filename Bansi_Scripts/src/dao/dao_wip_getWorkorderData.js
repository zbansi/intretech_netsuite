/**
 * NApiVersion 2.x
 */
require([ 'N/record', 'N/search' ], function(record, search) {
	function getWorkorderData(filterList) {

		var filters = [ [ 'recordtype', 'is', 'workorder' ], 'and',
				[ 'mainline', 'is', 'T' ] ];
		if (filterList.length > 0) {
			filters.push("and");
			filters = filters.concat(filterList);
		}

		var columnList = [ 'item', 'itemrevision', 'iswip', 'status',
				'trandate', 'startdate', 'enddate', 'quantity', 'quantityuom',
				'unit', 'firmed', 'memo' ];

		var columns = [];
		columns.push(search.createColumn({
			name : 'name',
			join : 'location'
		}));

		columns.push(search.createColumn({
			name : 'name',
			join : 'subsidiary'
		}));

		columnList.forEach(function(e) {
			columns.push(search.createColumn({
				name : e,
			}));
		});
		columns.push(search.createColumn({
			name : 'name',
			join : 'revision'
		}));

		var pagedData = search.create({
			type : search.Type.TRANSACTION,
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
	getWorkorderData([]);
});
