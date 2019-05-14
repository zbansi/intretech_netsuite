/**
 * dao_eai.js
 * 
 * @NApiversion 2.x
 * @NModuleScope Public
 */

define([ 'N/record', 'N/search', '../utils/search_columns' ],
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
				log.debug({
					title : 'bom hearder has existed, go on to add bomrevision. ' + e.name,
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

	function createAndSaveBomReversionRecord(bomRevisionData, bomHeaderId) {

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
			if (bomRevisionData.hasOwnProperty(key) && key != 'componentlist') {
				bomRevisionRecord.setValue({
					fieldId : key,
					value : bomRevisionData[key]
				});
			} else if (bomRevisionData.hasOwnProperty(key) && key == 'componentlist') {

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
					title : 'bom revision has existed, return its id. ' + e.name,
					details : e.message
				});
				var bomName = search.lookupFields({
					type : search.Type.BOM,
					id : bomHeaderId,
					columns : [ 'name' ]
				});
				return getBomRevisionRecordId(bomName, bomRevisionData.name);
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
				var bomRevisionId = createAndSaveBomReversionRecord(bomRevisionData, bomHeaderId);
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
		var columnList = [ 'createddate', 'effectivestartdate', 'effectiveenddate', 'externalid', 'internalid', 'isinactive', 'memo', 'name' ];
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

		var filters = [ [ 'recordtype', 'is', 'workorder' ], 'and', [ 'mainline', 'is', 'T' ] ];
		if (filterList && filterList.length > 0) {
			filters.push("and");
			filters = filters.concat(filterList);
		}

		var columnList = columnset.setColumns(search.Type.WORK_ORDER);
		var joinColumns = columnset.setJoinColumns(search.Type.WORK_ORDER);
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
		var joinColumns = columnset.setJoinColumns(search.Type.SALES_ORDER);
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

		var columnList = columnset.setColumns(search.Type.ITEM_FULFILLMENT);
		var joinColumns = columnset.setJoinColumns(search.Type.ITEM_FULFILLMENT);
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

		var columnList = columnset.setColumns(search.Type.WORK_ORDER_ISSUE);
		var joinColumns = columnset.setJoinColumns(search.Type.WORK_ORDER_ISSUE);
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

		var columnList = columnset.setColumns(search.Type.WORK_ORDER_COMPLETION);
		var joinColumns = columnset.setJoinColumns(search.Type.WORK_ORDER_COMPLETION);
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

		var columnList = columnset.setColumns(search.Type.WORK_ORDER_CLOSE);
		var joinColumns = columnset.setJoinColumns(search.Type.WORK_ORDER_CLOSE);
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

		var columnList = columnset.setColumns(search.Type.TRANSFER_ORDER);
		var joinColumns = columnset.setJoinColumns(search.Type.TRANSFER_ORDER);
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

		var columnList = columnset.setColumns(search.Type.INVENTORY_TRANSFER);
		var joinColumns = columnset.setJoinColumns(search.Type.INVENTORY_TRANSFER);
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

		var columnList = columnset.setColumns(search.Type.INVENTORY_ADJUSTMENT);
		var joinColumns = columnset.setJoinColumns(search.Type.INVENTORY_ADJUSTMENT);
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

		var columnList = columnset.setColumns(search.Type.PURCHASE_ORDER);
		var joinColumns = columnset.setJoinColumns(search.Type.PURCHASE_ORDER);
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
		var joinColumns = columnset.setJoinColumns(search.Type.ITEM_RECEIPT);
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
	/*
	 */
	function createAndSaveOrderTransaction(fromType, toType, context) {
		var transactionResult = [];
		context.transactionData.forEach(function(transaction) {
			var rec = record.transform({
				fromType : fromType,
				fromId : transaction.order,
				toType : toType
			//通过defaultValues-inventorylocation 转换生成与之匹配的transaction lines
			//如果订单行上维护了地点，但脚本没有指明defaultValues
			//Transaction Record will return a "VALID_LINE_ITEM_REQD > 
			//You must have at least one valid line item for this transaction" error 
			//if we did not specify an inventoryLocation in the defaultValue parameter. 
			//所以建议一般不在订单行上维护地点
			//						defaultValues : {
			//							inventorylocation : 6
			//						}
			});
			var itemLine = 0;
			log.debug({
				title : 'rec ',
				details : rec
			});
			transaction.item.forEach(function(item) {
				for ( var itemKey in item) {
					if (item.hasOwnProperty(itemKey) && itemKey != 'inventorydetail') {
						rec.setSublistValue({
							sublistId : 'item',
							fieldId : itemKey,
							value : item[itemKey],
							line : itemLine
						});
					}
				}
				var subrec = rec.getSublistSubrecord({
					sublistId : 'item',
					line : itemLine,
					fieldId : 'inventorydetail'
				});
				itemLine++;
				var i = 0;
				item.inventorydetail.forEach(function(detail) {
					if (toType == record.Type.ITEM_FULFILLMENT || toType == record.Type.WORK_ORDER_ISSUE) {
						subrec.setSublistValue({
							sublistId : 'inventoryassignment',
							fieldId : 'issueinventorynumber',
							value : detail.lotnumber,
							line : i
						});
					} else if (toType == record.Type.ITEM_RECEIPT || toType == record.Type.WORK_ORDER_COMPLETION) {
						subrec.setSublistValue({
							sublistId : 'inventoryassignment',
							fieldId : 'receiptinventorynumber',
							value : detail.lotnumber,
							line : i
						});
						subrec.setSublistValue({
							sublistId : 'inventoryassignment',
							fieldId : 'expirationdate',
							value : detail.expirationdate,
							line : i
						});
					}
					subrec.setSublistValue({
						sublistId : 'inventoryassignment',
						fieldId : 'binnumber',
						value : detail.binnumber,
						line : i
					});
					subrec.setSublistValue({
						sublistId : 'inventoryassignment',
						fieldId : 'inventorystatus',
						value : detail.status,
						line : i
					});
					subrec.setSublistValue({
						sublistId : 'inventoryassignment',
						fieldId : 'quantity',
						value : detail.quantity,
						line : i
					});
					i++;
				});

			});

			var transactionId = rec.save({
				enableSourcing : false,
				ignoreMandatoryFields : true
			});

			transactionResult.push(transactionId);

		});

		return {
			'isSuccess' : true,
			transactionResult : transactionResult
		};
	}

	function createAndSaveSalesOrderFulfillment(context) {
		return createAndSaveOrderTransaction(record.Type.SALES_ORDER, record.Type.ITEM_FULFILLMENT, context);
	}

	function createAndSaveReturnMaterialItemReceipt(context) {
		return createAndSaveOrderTransaction(record.Type.RETURN_AUTHORIZATION, record.Type.ITEM_RECEIPT, context);
	}

	function createAndSaveWorkOrderIssue(context) {
		return createAndSaveOrderTransaction(record.Type.WORK_ORDER, record.Type.WORK_ORDER_ISSUE, context);
	}

	function createAndSaveWorkOrderCompletion(context) {
		return createAndSaveOrderTransaction(record.Type.WORK_ORDER, record.Type.WORK_ORDER_COMPLETION, context);
	}

	function createAndSaveWorkOrderClose(context) {
		return createAndSaveOrderTransaction(record.Type.WORK_ORDER, record.Type.WORK_ORDER_CLOSE, context);
	}

	function createAndSavePurchaseOrderItemReceipt(context) {
		return createAndSaveOrderTransaction(record.Type.PURCHASE_ORDER, record.Type.ITEM_RECEIPT, context);
	}

	function createAndSaveVendorReturnItemFulfillment(context) {
		return createAndSaveOrderTransaction(record.Type.VENDOR_RETURN_AUTHORIZATION, record.Type.ITEM_FULFILLMENT, context);
	}

	//pramas 
	//recordType record.Type.INVENTORY_ADJUSTMENT, record.Type.INVENTORY_TRANSFER
	//context.transactionData
	function createAndSaveInventoryTransaction(recordType, context) {
		var transactionResult = [];

		var transactionData = context.transactionData;

		transactionData.forEach(function(transaction) {
			var rec = record.create({
				type : recordType,
				isDynamic : true
			});
			for ( var key in transaction) {
				if (transaction.hasOwnProperty(key) && key != 'inventory') {
					rec.setValue({
						fieldId : key,
						value : transaction[key]
					});
				} else if (transaction.hasOwnProperty(key) && key == 'inventory') {
					var j = 0;
					rec.selectNewLine({
						sublistId : 'inventory'
					});
					transaction.inventory.forEach(function(line) {
						for ( var lineKey in line) {
							if (line.hasOwnProperty(lineKey) && lineKey != 'inventorydetail') {
								rec.setCurrentSublistValue({
									sublistId : 'inventory',
									fieldId : lineKey,
									value : line[lineKey],
									line : j
								});
							}
						}
						var subrec = rec.getCurrentSublistSubrecord({
							sublistId : 'inventory',
							line : j,
							fieldId : 'inventorydetail'
						});
						j++;
						var i = 0;
						subrec.selectNewLine({
							sublistId : 'inventoryassignment'
						});
						line.inventorydetail.forEach(function(detail) {
							for ( var detailKey in detail) {
								if (detail.hasOwnProperty(detailKey)) {
									subrec.setCurrentSublistValue({
										sublistId : 'inventoryassignment',
										fieldId : detailKey,
										value : detail[detailKey],
										line : i
									});
								}
							}
							subrec.commitLine('inventoryassignment');
							i++;
						});
						rec.commitLine({
							sublistId : 'inventory'
						});
					});
				}
			}

			var transId = rec.save({
				enableSourcing : false,
				ignoreMandatoryFields : true
			});
			log.debug({
				title : 'transId ',
				details : transId
			});
			transactionResult.push(transId);
		});

		return {
			"isSuccess" : true,
			"transactionResult" : transactionResult
		}
	}

	/**
	 * context.transactionData
	 */
	function createAndSaveInventoryTransfer(context) {
		return createAndSaveInventoryTransaction(record.Type.INVENTORY_TRANSFER, context);
	}

	/**
	 * context.transactionData
	 */
	function createAndSaveInventoryAdjustment(context) {
		return createAndSaveInventoryTransaction(record.Type.INVENTORY_ADJUSTMENT, context);
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
		//createAndSaveOrderTransaction
		'createAndSaveOrderTransaction' : createAndSaveOrderTransaction,
		'createAndSaveSalesOrderFulfillment' : createAndSaveSalesOrderFulfillment,
		'createAndSaveReturnMaterialItemReceipt' : createAndSaveReturnMaterialItemReceipt,
		'createAndSaveWorkOrderIssue' : createAndSaveWorkOrderIssue,
		'createAndSaveWorkOrderCompletion' : createAndSaveWorkOrderCompletion,
		'createAndSaveWorkOrderClose' : createAndSaveWorkOrderClose,
		'createAndSavePurchaseOrderItemReceipt' : createAndSavePurchaseOrderItemReceipt,
		'createAndSaveVendorReturnItemFulfillment' : createAndSaveVendorReturnItemFulfillment,
		'createAndSaveInventoryTransaction' : createAndSaveInventoryTransaction,
		'createAndSaveInventoryTransfer' : createAndSaveInventoryTransfer,
		'createAndSaveInventoryAdjustment' : createAndSaveInventoryAdjustment

	};
});
