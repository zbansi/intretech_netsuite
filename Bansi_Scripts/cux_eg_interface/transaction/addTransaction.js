/*
 * "The item fulfillment record is partially scriptable — it can be updated, deleted, and searched using
SuiteScript. It cannot be created or copied."
 */

require([ 'N/record' ], function(record) {
	function createAndSaveTransaction(fromType, toType, context) {
		var transactionResult = [];
		context.transactionData.forEach(function(transaction) {
			var rec = Object.create(null);
			rec = record.transform({
				fromType : fromType,//record.Type.SALES_ORDER,
				fromId : transaction.order,
				toType : toType,//record.Type.ITEM_FULFILLMENT,
				//如果订单行上维护了地点，通过defaultValues
				//转换生成与inventorylocation匹配的transaction lines
				//建议一般不在订单行上维护地点
				defaultValues : {
					inventorylocation : 6
				}
			});
			//1 车间
			//6 成品仓

			log.debug({
				title : 'rec',
				details : rec
			});

			transaction.item.forEach(function(line) {
				rec.setSublistValue({
					sublistId : 'item',
					fieldId : 'location',
					value : line.location,
					line : line.line
				});
				rec.setSublistValue({
					sublistId : 'item',
					fieldId : 'quantity',
					value : line.quantity,
					line : line.line
				});
				rec.setSublistValue({
					sublistId : 'item',
					fieldId : 'item',
					value : line.item,
					line : line.line
				});

				log.debug({
					title : 'rec',
					details : rec
				});
				var subrec = rec.getSublistSubrecord({
					sublistId : 'item',
					line : line.line,
					fieldId : 'inventorydetail'
				});

				log.debug({
					title : 'subrec ',
					details : subrec
				});
				var i = 0;
				line.details.forEach(function(detail) {
					subrec.setSublistValue({
						sublistId : 'inventoryassignment',
						fieldId : 'issueinventorynumber',
						value : detail.lotnumber,
						line : i
					});
					//14 'BS-P190101'
					//140 20190315-1
					subrec.setSublistValue({
						sublistId : 'inventoryassignment',
						fieldId : 'binnumber',
						value : detail.binnumber,
						line : i
					});
					//1 FG001_成品库
					//10 'SHIPPING_发货区'
					subrec.setSublistValue({
						sublistId : 'inventoryassignment',
						fieldId : 'inventorystatus',
						value : detail.status,
						line : i
					});
					//1 GOOD
					subrec.setSublistValue({
						sublistId : 'inventoryassignment',
						fieldId : 'quantity',
						value : detail.quantity,
						line : i
					});
					i++;
					log.debug({
						title : 'i ==  ',
						details : i
					});
				});

			});

			var fulfillId = rec.save({
				enableSourcing : false,
				ignoreMandatoryFields : true
			});
			log.debug({
				title : 'fulfillId ',
				details : fulfillId
			});
			transactionResult.push(fulfillId);

		});
		return {
			"isSuccess" : true,
			"transactionResult" : transactionResult
		}
		log.debug({
			title : 'transactionResult ',
			details : transactionResult
		});

	}

	var transactionData = {
		"transactionData" : [ {
			"order" : "11335",
			"item" : [ {
				"line" : 0,
				"item" : "10",
				"quantity" : 3,
				"location" : "1",
				"details" : [ {
					"binnumber" : "1",
					"lotnumber" : "141",
					"status" : "1",
					"quantity" : 1
				}, {
					"binnumber" : "1",
					"lotnumber" : "38",
					"status" : "1",
					"quantity" : 1
				}, {
					"binnumber" : "1",
					"lotnumber" : "50",
					"status" : "1",
					"quantity" : 1
				} ]
			} ]
		}, {
			"order" : "20642",
			"item" : [ {
				"line" : 0,
				"item" : "10",
				"quantity" : 2,
				"location" : "1",
				"details" : [ {
					"binnumber" : "1",
					"lotnumber" : "38",
					"status" : "1",
					"quantity" : 2
				} ]
			}, {
				"line" : 1,
				"item" : "10",
				"quantity" : 3,
				"location" : "1",
				"details" : [ {
					"binnumber" : "1",
					"lotnumber" : "38",
					"status" : "1",
					"quantity" : 3
				} ]
			} ]
		} ]
	};

	var itemFulfillment = createAndSaveTransaction(record.Type.SALES_ORDER,
			record.Type.ITEM_FULFILLMENT, transactionData);
});
