/*
 * NApiVersion 2.x
 */
require([ 'N/record' ], function(record) {
	//create and save BOM and BOM Reversion
	function createAndSaveBomRecord(bomContent) {
		bomContent.forEach(function(bomData) {
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

			return bomRecord.save({
				enableSourcing : false,
				ignoreMandatoryFields : false
			});
		});
	}

	function createAndSaveBomReversionRecord(bomRevisionContent) {
		bomRevisionContent.forEach(function(bomRevisionData) {
			var bomRevisionRecord = record.create({
				type : record.Type.BOM_REVISION,
				isDynamic : true
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

			return bomRevisionRecord.save({
				enableSourcing : false,
				ignoreMandatoryFields : false
			});
		});
	}

	var bomContent = [ {
		'availableforallassemblies' : false,
		'availableforalllocations' : true,
		'includechildren' : true,
		'memo' : 'EAI.TEST.190422A01',
		'name' : 'EAI.TEST.190422A01',
		'restricttoassemblies' : '572',
		'subsidiary' : '1',
		'usecomponentyield' : true,
		'usedonassembly' : true
	}, {
		'availableforallassemblies' : false,
		'availableforalllocations' : true,
		'includechildren' : true,
		'memo' : 'EAI.TEST.190422A02',
		'name' : 'EAI.TEST.190422A02',
		'restricttoassemblies' : '573',
		'subsidiary' : '1',
		'usecomponentyield' : true,
		'usedonassembly' : true
	} ];
	var bomRevisionContent = [ {
		'billofmaterials' : 36,//'EAI.TEST.190422A01',
		'effectivedate' : new Date('2001/01/01'),
		'memo' : 'EAI.TEST.190422A01 v0.1',
		'name' : 'v0.1',
		'obsoletedate' : '',
		'componentlist' : [ {
			'bomquantity' : 3,
			'componentyield' : 99.8,
			'item' : 368,
			'itemsource' : ''

		}, {
			'bomquantity' : 5,
			'componentyield' : 100,
			'item' : 369,
			'itemsource' : ''

		} ]
	}, {
		'billofmaterials' : 37,//'EAI.TEST.190422A02',
		'effectivedate' : new Date('01/01/2018'),
		'memo' : 'EAI.TEST.190422A02 v0.1',
		'name' : 'v0.1',
		'obsoletedate' : '',
		'componentlist' : [ {
			'bomquantity' : 3,
			'componentyield' : 99.8,
			'item' : 570,
			'itemsource' : 'PURCHASE_ORDER'

		}, {
			'bomquantity' : 5,
			'componentyield' : 100,
			'item' : 571,
			'itemsource' : 'STOCK'

		} ]
	} ];
	createAndSaveBomRecord(bomContent);
	createAndSaveBomReversionRecord(bomRevisionContent);
});
