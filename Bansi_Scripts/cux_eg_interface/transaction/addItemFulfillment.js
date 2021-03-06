/*
 * "The item fulfillment record is partially scriptable — it can be updated, deleted, and searched using
SuiteScript. It cannot be created or copied."
 */

require([ 'N/record' ], function(record) {
	function createAndSaveSalesOrderFulfillment(salesOrder, items) {
		var rec = record.transform({
			fromType : record.Type.SALES_ORDER,
			fromId : salesOrder.salesOrderId,
			toType : record.Type.ITEM_FULFILLMENT,
			defaultValues : {
				inventorylocation : 6
			}
		});
		//1 车间
		//6 成品仓
		rec.setSublistValue({
			sublistId : 'item',
			fieldId : 'location',
			value : 1,
			line : 0
		});

		log.debug({
			title : 'rec',
			details : rec
		});

		//for (var itemIndex in rec.sublists.item) {
		//dynamic mode only
		//rec.selectLine({
		//	sublistId: 'item',
		//	line: lineNum
		//});

		/*for ( var key in items[itemIndex]) {
		if (items[itemIndex].hasOwnProperty(key)) {
		rec.setCurrentSublistValue({
		sublistId : 'item',
		fieldId : key,
		value : items[itemIndex][key]
		});
		}
		}
		 */

		var subrec = rec.getSublistSubrecord({
			sublistId : 'item',
			line : 0,
			fieldId : 'inventorydetail'
		});

		log.debug({
			title : 'subrec ',
			details : subrec
		});

		// Insert a line in the subrecord's inventory assignment sublist.
		//subrec.insertLine({
		//sublistId: 'inventoryassignment',
		//line: 0
		//});
		subrec.setSublistValue({
			sublistId : 'inventoryassignment',
			fieldId : 'issueinventorynumber',
			value : 140,
			line : 0
		});
		//14 'BS-P190101'
		//140 20190315-1
		subrec.setSublistValue({
			sublistId : 'inventoryassignment',
			fieldId : 'binnumber',
			value : 1,
			line : 0
		});
		//1 FG001_成品库
		//10 'SHIPPING_发货区'
		subrec.setSublistValue({
			sublistId : 'inventoryassignment',
			fieldId : 'inventorystatus',
			value : 1,
			line : 0
		});
		//1 GOOD
		subrec.setSublistValue({
			sublistId : 'inventoryassignment',
			fieldId : 'quantity',
			value : 1,
			line : 0
		});
		// Set the lot number for the item. Although this value is
		// hardcoded, you do not have to change it, because it doesn't
		// reference a record in your account. For the purpose of this
		// sample, the value can be any string.

		//dynamic mode only
		//subrec.commitLine({
		//	sublistId: 'inventoryassignment'
		//});

		//}
		//dynamic mode only
		//rec.commitLine({
		//	sublistId: 'item'
		//});

		var fulfillId = rec.save({
			enableSourcing : false,
			ignoreMandatoryFields : true
		});
		log.debug({
			title : 'fulfillId ',
			details : fulfillId
		});
		return fulfillId;
	}

	var itemFulfillment = createAndSaveSalesOrderFulfillment({
		'salesOrderId' : 11335
	}, [ {
		'item' : 10,
		'location' : 6,
		'quantity' : 1
	} ]);
});
