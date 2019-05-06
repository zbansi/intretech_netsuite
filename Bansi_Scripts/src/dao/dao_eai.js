/**
 * dao_eai.js
 *
 * @NApiversion 2.x
 * @NModuleScope Public
 */

define(['N/record', 'N/search'], function (record, search) {

	function getSearchResultSet(recordType, filterList, columnList) {
		var pagedData = search.create({
				type: recordType,
				filters: filterList,
				columns: columnList
			}).runPaged();
		var resultSet = [];
		pagedData.pageRanges.forEach(function (pageRange) {
			var page = pagedData.fetch({
					index: pageRange.index
				});
			page.data.forEach(function (result) {
				resultSet.push(result);
			});
		});
		return resultSet;
	}

	function deleteRecords(recordType, recordIdList) {
		var deleteRecordIdList = [];
		recordIdList.forEach(function (recordId) {
			deleteRecordIdList.push(record.delete({
					type: recordType,
					id: recordId
				}));
		});
		return deleteRecordIdList;
	}

	function deleteRecord(recordType, recordId) {
		return record.delete({
			type: recordType,
			id: recordId
		});
	}

	function getBOMAllData(filterList) {

		var filters = [];
		
		filters.push(search.createFilter({
			name: 'isinactive',
			operator: 'is',
			values: 'F'		
		}));
		
		filters.concat(filterList);
		
		var columnList = ['createddate', 'effectivestartdate', 'effectiveenddate', 'externalid', 'internalid', 'isinactive', 'memo', 'name'];
		var columns = [];
		columns.push(search.createColumn({
				name: 'name',
				join: 'billofmaterials'
			}));
		
		columns.push(search.createColumn({
			name: 'isinactive',
			join: 'billofmaterials'
		}));
		
		columnList.forEach(function (e) {
			columns.push(search.createColumn({
			name: e,			
		}));
		});		
		
		columns.push(search.createColumn({
			name: 'linenumber',
			join: 'component'
		}));
		
		columns.push(search.createColumn({
				name: 'internalid',
				join: 'component'
			}));
		
		columns.push(search.createColumn({
			name: 'item',
			join: 'component'
		}));
		
		columns.push(search.createColumn({
			name: 'bomquantity',
			join: 'component'
		}));
		
		columns.push(search.createColumn({
			name: 'quantity',
			join: 'component'
		}));
		
		columns.push(search.createColumn({
			name: 'componentyield',
			join: 'component'
		}));
		
		
		columns.push(search.createColumn({
			name: 'unit',
			join: 'component'
		}));
		

		var pagedData = search.create({
				type: search.Type.BOM_REVISION, //bomrevision,
				filters: filters,
				columns: columns
			}).runPaged();

		var resultSet = [];
		pagedData.pageRanges.forEach(function (pageRange) {
			var page = pagedData.fetch({
					index: pageRange.index
				});
			page.data.forEach(function (result) {
				resultSet.push(result);
			});
		});

		return resultSet;

	}

	return {
		getSearchResultSet: getSearchResultSet,
		'deleteRecords': deleteRecords,
		'deleteRecord': deleteRecord,
		'getBOMAllData': getBOMAllData
	};
});