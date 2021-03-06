//Remove a Sublist Line on the Item Fulfillment from a Transformed Sales Order Record
require([ 'N/record' ], function(record) {
	var newRecord = record.transform({
		fromType : 'salesorder',
		fromId : '<Internal ID of Sales Order>',
		toType : 'itemfulfillment',
		isDynamic : true
	});

	var lineCount = newRecord.getLineCount({
		sublistId : 'item'
	});
	newRecord.selectLine({
		sublistId : 'item',
		line : 0
	});
	newRecord.setCurrentSublistValue({
		sublistId : 'item',
		fieldId : 'location',
		value : 'Location Internal ID'
	});
	newRecord.setCurrentSublistValue({
		sublistId : 'item',
		fieldId : 'quantity',
		value : 1
	});
	newRecord.commitLine({
		sublistId : 'item'
	});

	for (var i = 1; i < lineCount; i++) {
		newRecord.selectLine({
			sublistId : 'item',
			line : i
		});
		newRecord.setCurrentSublistValue({
			sublistId : 'item',
			fieldId : 'itemreceive',
			value : false
		});

		newRecord.commitLine({
			sublistId : 'item'
		});
	}
	newRecord.save();
});
