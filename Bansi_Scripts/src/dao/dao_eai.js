/**
 * dao_eai.js
 * 
 * @NApiversion 2.x
 * @NModuleScope Public
 */

define(
		[ 'N/record', 'N/search', '../utils/search_columns' ],
		/**
		 * @param {record} record
		 * @param {search} search
		 * @param {search_columns} columnset
		 */
		function(record, search, columnset) {

			function getSearchResultSet(recordType, filterList, columnList) {
				var pagedData = search.create({
					type : recordType,
					filters : filterList,
					columns : columnList
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
				return resultSet;
			}

			function deleteRecords(recordType, recordIdList) {
				var deleteRecordIdList = [];
				recordIdList.forEach(function(recordId) {
					deleteRecordIdList.push(record['delete']({
						type : recordType,
						id : recordId
					}));
				});
				return deleteRecordIdList;
			}

			function deleteRecord(recordType, recordId) {
				return record['delete']({
					type : recordType,
					id : recordId
				});
			}

			//create and save BOM and BOM Reversion
			function getBomHeaderRecordId(bomName) {
				var filter = [];

				filter.push(search.createFilter({
					name : 'name',
					operator : search.Operator.IS,
					values : bomName
				}));

				var bom = search.create({
					type : search.Type.BOM,
					filters : filter
				}).run().getRange({
					start : 0,
					end : 1
				});
				log.debug({
					title : 'get bom internalid',
					details : bom
				});

				return bom[0].id;
			}

			function getBomRevisionRecordId(bomName, bomRevisionName) {
				var filter = [];

				filter.push(search.createFilter({
					name : 'name',
					operator : search.Operator.IS,
					values : bomRevisionName
				}));
				filter.push(search.createFilter({
					name : 'name',
					join : 'billofmaterials',
					operator : search.Operator.IS,
					values : bomName
				}));

				var bomRevision = search.create({
					type : search.Type.BOM_REVISION,
					filters : filter
				}).run().getRange({
					start : 0,
					end : 1
				});
				log.debug({
					title : 'get bomRevision internalid',
					details : bomRevision
				});

				return bomRevision[0].id;
			}

			function createAndSaveBomRecord(bomData) {

				var bomRecord = record.create({
					type : record.Type.BOM,
					isDynamic : true
				});
				for ( var key in bomData) {
					if (bomData.hasOwnProperty(key)) {
						bomRecord.setValue({
							fieldId : key,
							value : bomData[key]
						});
					}
				}
				try {
					return bomRecord.save({
						enableSourcing : false,
						ignoreMandatoryFields : false
					});
				} catch (e) {
					if (e.name == 'A_1_WITH_THIS_NAME_ALREADY_EXISTS_PLEASE_USE_ANOTHER') {
						log
								.debug({
									title : 'bom hearder has existed, go on to add bomrevision. '
											+ e.name,
									details : e.message
								});

						return getBomHeaderRecordId(bomData.name);
					} else

						log.debug({
							title : e.name,
							details : e.message
						});
				}

			}

			function createAndSaveBomReversionRecord(bomRevisionData,
					bomHeaderId) {

				var bomRevisionRecord = record.create({
					type : record.Type.BOM_REVISION,
					isDynamic : true
				});
				bomRevisionRecord.setValue({
					fieldId : 'billofmaterials',
					value : bomHeaderId
				});
				bomRevisionRecord.setValue({
					fieldId : 'effectivestartdate',
					value : new Date(978278400000) /*2001/1/1 上午12:00:00*/,
				});
				for ( var key in bomRevisionData) {
					if (bomRevisionData.hasOwnProperty(key)
							&& key != 'componentlist') {
						bomRevisionRecord.setValue({
							fieldId : key,
							value : bomRevisionData[key]
						});
					} else if (bomRevisionData.hasOwnProperty(key)
							&& key == 'componentlist') {

						var items = bomRevisionData[key];
						log.debug({
							title : 'success',
							details : items
						});
						for ( var itemIndex in items) {
							bomRevisionRecord.selectNewLine({
								sublistId : 'component'
							});

							for ( var listkey in items[itemIndex]) {
								if (items[itemIndex].hasOwnProperty(listkey)) {
									bomRevisionRecord.setCurrentSublistValue({
										sublistId : 'component',
										fieldId : listkey,
										value : items[itemIndex][listkey]
									});
								}
							}

							bomRevisionRecord.commitLine({
								sublistId : 'component'
							});
						}
					}
				}

				try {
					return bomRevisionRecord.save({
						enableSourcing : false,
						ignoreMandatoryFields : false
					});
				} catch (e) {
					if (e.name == 'THERE_IS_AN_OVERLAP_ON_THE_EFFECTIVE_DATE_BETWEEN_THIS_REVISION_AND_THE_FOLLOWING_REVISIONS__') {
						log.debug({
							title : 'bom revision has existed, return its id. '
									+ e.name,
							details : e.message
						});
						var bomName = search.lookupFields({
							type : search.Type.BOM,
							id : bomHeaderId,
							columns : [ 'name' ]
						});
						return getBomRevisionRecordId(bomName,
								bomRevisionData.name);
					} else
						log.debug({
							title : 'ERROR ' + e.name,
							details : e.message
						});
				}
			}

			function createAndSaveBomAllRecord(bomAllContent) {
				var result = [];
				var bomAllDataList = bomAllContent.bomAllData;
				bomAllDataList.forEach(function(bomAllData) {
					{
						var bomData = bomAllData.bomHeader;
						var bomRevisionData = bomAllData.bomRevision;
						var bomHeaderId = createAndSaveBomRecord(bomData);
						var bomRevisionId = createAndSaveBomReversionRecord(
								bomRevisionData, bomHeaderId);
						result.push({
							bomHeader : bomHeaderId,
							bomRevision : bomRevisionId
						});
					}
				});
				return result;
			}

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
				if (filterList && filterList.length > 0) {
					filters.push("and");
					filters = filters.concat(filterList);
				}
				var columnList = [ 'createddate', 'effectivestartdate',
						'effectiveenddate', 'externalid', 'internalid',
						'isinactive', 'memo', 'name' ];
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

				return resultSet;
			}

			function getWorkOrderData(filterList) {

				var filters = [ [ 'recordtype', 'is', 'workorder' ], 'and',
						[ 'mainline', 'is', 'T' ] ];
				if (filterList && filterList.length > 0) {
					filters.push("and");
					filters = filters.concat(filterList);
				}

				var columnList = columnset.setColumns(search.Type.WORK_ORDER);
				var joinColumns = columnset
						.setJoinColumns(search.Type.WORK_ORDER);
				var columns = [];
				columns = columns.concat(columnList);
				columns = columns.concat(joinColumns);

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

				return resultSet;

			}
			function getSalesOrderData(filterList) {

				var filters = [ [ 'recordtype', 'is', 'salesorder' ] ];
				if (filterList && filterList.length > 0) {
					filters.push("and");
					filters = filters.concat(filterList);
				}

				var columnList = columnset.setColumns(search.Type.SALES_ORDER);
				var joinColumns = columnset
						.setJoinColumns(search.Type.SALES_ORDER);
				var columns = [];
				columns = columns.concat(columnList);
				columns = columns.concat(joinColumns);

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

				return resultSet;

			}
			function getSalesOrderFulfillment(filterList) {

				var filters = [ [ 'recordtype', 'is', 'itemfulfillment' ] ];
				if (filterList && filterList.length > 0) {
					filters.push("and");
					filters = filters.concat(filterList);
				}

				var columnList = columnset
						.setColumns(search.Type.ITEM_FULFILLMENT);
				var joinColumns = columnset
						.setJoinColumns(search.Type.ITEM_FULFILLMENT);
				var columns = [];
				columns = columns.concat(columnList);
				columns = columns.concat(joinColumns);

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

				return resultSet;

			}

			function getWorkOrderIssue(filterList) {

				var filters = [ [ 'recordtype', 'is', 'workorderissue' ] ];
				if (filterList && filterList.length > 0) {
					filters.push("and");
					filters = filters.concat(filterList);
				}

				var columnList = columnset
						.setColumns(search.Type.WORK_ORDER_ISSUE);
				var joinColumns = columnset
						.setJoinColumns(search.Type.WORK_ORDER_ISSUE);
				var columns = [];
				columns = columns.concat(columnList);
				columns = columns.concat(joinColumns);

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

				return resultSet;

			}

			function getWorkOrderCompletion(filterList) {

				var filters = [ [ 'recordtype', 'is', 'workorderissue' ] ];
				if (filterList && filterList.length > 0) {
					filters.push("and");
					filters = filters.concat(filterList);
				}

				var columnList = columnset
						.setColumns(search.Type.WORK_ORDER_COMPLETION);
				var joinColumns = columnset
						.setJoinColumns(search.Type.WORK_ORDER_COMPLETION);
				var columns = [];
				columns = columns.concat(columnList);
				columns = columns.concat(joinColumns);

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

				return resultSet;

			}

			function getWorkOrderClose(filterList) {

				var filters = [ [ 'recordtype', 'is', 'workorderclose' ] ];
				if (filterList && filterList.length > 0) {
					filters.push("and");
					filters = filters.concat(filterList);
				}

				var columnList = columnset
						.setColumns(search.Type.WORK_ORDER_CLOSE);
				var joinColumns = columnset
						.setJoinColumns(search.Type.WORK_ORDER_CLOSE);
				var columns = [];
				columns = columns.concat(columnList);
				columns = columns.concat(joinColumns);

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

				return resultSet;

			}

			function getTransferOrder(filterList) {

				var filters = [ [ 'recordtype', 'is', 'transferorder' ] ];
				if (filterList && filterList.length > 0) {
					filters.push("and");
					filters = filters.concat(filterList);
				}

				var columnList = columnset
						.setColumns(search.Type.TRANSFER_ORDER);
				var joinColumns = columnset
						.setJoinColumns(search.Type.TRANSFER_ORDER);
				var columns = [];
				columns = columns.concat(columnList);
				columns = columns.concat(joinColumns);

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

				return resultSet;

			}

			function getInventoryTransfer(filterList) {

				var filters = [ [ 'recordtype', 'is', 'inventorytransfer' ] ];
				if (filterList && filterList.length > 0) {
					filters.push("and");
					filters = filters.concat(filterList);
				}

				var columnList = columnset
						.setColumns(search.Type.INVENTORY_TRANSFER);
				var joinColumns = columnset
						.setJoinColumns(search.Type.INVENTORY_TRANSFER);
				var columns = [];
				columns = columns.concat(columnList);
				columns = columns.concat(joinColumns);

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

				return resultSet;

			}

			function getInventoryAdjustment(filterList) {

				var filters = [ [ 'recordtype', 'is', 'inventoryadjustment' ] ];
				if (filterList && filterList.length > 0) {
					filters.push("and");
					filters = filters.concat(filterList);
				}

				var columnList = columnset
						.setColumns(search.Type.INVENTORY_ADJUSTMENT);
				var joinColumns = columnset
						.setJoinColumns(search.Type.INVENTORY_ADJUSTMENT);
				var columns = [];
				columns = columns.concat(columnList);
				columns = columns.concat(joinColumns);

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

				return resultSet;

			}

			function getPurchaseOrder(filterList) {

				var filters = [ [ 'recordtype', 'is', 'purchaseorder' ] ];
				if (filterList && filterList.length > 0) {
					filters.push("and");
					filters = filters.concat(filterList);
				}

				var columnList = columnset
						.setColumns(search.Type.PURCHASE_ORDER);
				var joinColumns = columnset
						.setJoinColumns(search.Type.PURCHASE_ORDER);
				var columns = [];
				columns = columns.concat(columnList);
				columns = columns.concat(joinColumns);

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

				return resultSet;

			}

			function getItemReceipt(filterList) {

				var filters = [ [ 'recordtype', 'is', 'itemreceipt' ] ];
				if (filterList && filterList.length > 0) {
					filters.push("and");
					filters = filters.concat(filterList);
				}

				var columnList = columnset.setColumns(search.Type.ITEM_RECEIPT);
				var joinColumns = columnset
						.setJoinColumns(search.Type.ITEM_RECEIPT);
				var columns = [];
				columns = columns.concat(columnList);
				columns = columns.concat(joinColumns);

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

				return resultSet;

			}
			return {
				'getSearchResultSet' : getSearchResultSet,
				'deleteRecords' : deleteRecords,
				'deleteRecord' : deleteRecord,
				'getBomHeaderRecordId' : getBomHeaderRecordId,
				'getBomRevisionRecordId' : getBomRevisionRecordId,
				'createAndSaveBomRecord' : createAndSaveBomRecord,
				'createAndSaveBomReversionRecord' : createAndSaveBomReversionRecord,
				'createAndSaveBomAllRecord' : createAndSaveBomAllRecord,
				'getBOMAllData' : getBOMAllData,
				'getWorkOrderData' : getWorkOrderData,
				'getSalesOrderData' : getSalesOrderData,
				'getSalesOrderFulfillment' : getSalesOrderFulfillment,
				'getWorkOrderIssue' : getWorkOrderIssue,
				'getWorkOrderCompletion' : getWorkOrderCompletion,
				'getWorkOrderClose' : getWorkOrderClose,
				'getTransferOrder' : getTransferOrder,
				'getInventoryTransfer' : getInventoryTransfer,
				'getInventoryAdjustment' : getInventoryAdjustment,
				'getPurchaseOrder' : getPurchaseOrder,
				'getItemReceipt' : getItemReceipt,
				//createAndSaveTransaction
				'createAndSaveSalesOrderFulfillment' : createAndSaveSalesOrderFulfillment,
				'createAndSaveWorkOrderIssue' : createAndSaveWorkOrderIssue,
				'createAndSaveWorkOrderCompletion' : createAndSaveWorkOrderCompletion,
				'createAndSaveWorkOrderClose' : createAndSaveWorkOrderClose,
				'createAndSaveItemReceipt' : createAndSaveItemReceipt,
				'createAndSaveInventoryTransfer' : createAndSaveInventoryTransfer,
				'createAndSaveInventoryAdjustment' : createAndSaveInventoryAdjustment

			};
		});
