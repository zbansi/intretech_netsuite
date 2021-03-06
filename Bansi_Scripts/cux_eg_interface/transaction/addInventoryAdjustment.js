/*
 * "The item fulfillment record is partially scriptable — it can be updated, deleted, and searched using
SuiteScript. It cannot be created or copied."
 */

require([ 'N/record' ], function(record) {
	/**
	 * context.transactionData
	 */
	function createAndSaveInventoryAdjustment(context) {
		var transactionResult = [];

		var transactionData = context.transactionData;

		transactionData.forEach(function(transaction) {

			var rec = record.create({
				type : record.Type.INVENTORY_ADJUSTMENT,
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
					transaction.item.forEach(function(line) {
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
						log.debug({
							title : 'rec',
							details : rec
						});

						var subrec = rec.getCurrentSublistSubrecord({
							sublistId : 'inventory',
							line : j,
							fieldId : 'inventorydetail'
						});

						log.debug({
							title : 'subrec ',
							details : subrec
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
		log.debug({
			title : 'transactionResult ',
			details : transactionResult
		});
	}

	var transactionData = {
		"transactionData" : [ {
			"subsidiary" : "1",
			"account" : "241",
			"adjlocation" : "1",
			"postingperiod" : "126",
			"memo" : "TEST",
			"inventory" : [ {
				"line" : 0,
				"item" : "10",
				"location" : "1",
				"adjustqtyby" : -2,
				"inventorydetail" : [ {
					"issueinventorynumber" : "38",
					"binnumber" : "1",
					"inventorystatus" : "1",
					"quantity" : -2
				} ]
			}, {
				"line" : 1,
				"item" : "10",
				"location" : "1",
				"adjustqtyby" : 3,
				"inventorydetail" : [ {
					"receiptinventorynumber" : "38",
					"binnumber" : "1",
					"inventorystatus" : "1",
					"quantity" : 3
				} ]
			} ]
		} ]
	};

	var itemFulfillment = createAndSaveInventoryAdjustment(transactionData);
});
