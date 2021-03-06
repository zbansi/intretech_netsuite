/**
 * NApiVersion 2.x
 */
require([ 'N/search' ],
/**
 * @param {search} search
 */
function(search) {

	function getSalesorderData(filterList) {

		var filters = [ [ 'recordtype', 'is', 'salesorder' ] ];
		if (filterList.length > 0) {
			filters.push("and");
			filters = filters.concat(filterList);
		}

		var columnList = [ 'entity', 'salesrep', 'linesequencenumber', 'item',
				'itemrevision', 'pricelevel', 'rate', 'status', 'trandate',
				'startdate', 'enddate', 'quantity', 'quantityuom', 'unit',
				'firmed', 'memo', 'shipdate' ];

		var columns = [];
		columns.push(search.createColumn({
			name : 'name',
			join : 'location'
		}));

		columns.push(search.createColumn({
			name : 'name',
			join : 'subsidiary'
		}));

		columns.push(search.createColumn({
			name : 'itemid',
			join : 'item'
		}));

		columnList.forEach(function(e) {
			columns.push(search.createColumn({
				name : e,
			}));
		});

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
	getSalesorderData([ [ 'tranid', 'is', 'SO00000054' ] ]);
});
