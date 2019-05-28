require([ 'N/record' ], function(record) {
	function createBomRevision(values, items) {
		var rec = record.create({
			type : 'bomrevision',
			isDynamic : true
		});

		for ( var key in values) {
			if (values.hasOwnProperty(key)) {
				rec.setValue({
					fieldId : key,
					value : values[key]
				});
			}
		}

		for ( var itemIndex in items) {
			rec.selectNewLine({
				sublistId : 'component'
			});

			for ( var key in items[itemIndex]) {
				if (items[itemIndex].hasOwnProperty(key)) {
					rec.setCurrentSublistValue({
						sublistId : 'component',
						fieldId : key,
						value : items[itemIndex][key]
					});
				}
			}

			rec.commitLine({
				sublistId : 'component'
			});
		}

		return rec.save({
			enableSourcing : false,
			ignoreMandatoryFields : false
		});
	}

	var bomRevisionId = createBomRevision({
		'billofmaterials' : 1,
		'name' : 'Rev.1',
		'effectivestartdate' : new Date('1/1/2017')
	}, [ {
		'item' : 63,
		'bomquantity' : 1
	}, {
		'item' : 62,
		'bomquantity' : 2
	} ])
});