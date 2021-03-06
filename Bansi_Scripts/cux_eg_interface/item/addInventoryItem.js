/*
 * NApiVersion 2.x
 */
require([ 'N/record' ], function(record) {
	//create and save Lot Numbered Inventory Item
	function createAndSaveInventoryItemRecord(itemContent) {
		itemContent.forEach(function(itemData) {
			var itemRecord = record.create({
				type : record.Type.LOT_NUMBERED_INVENTORY_ITEM,
				isDynamic : true
			});
			for ( var key in itemData) {
				if (itemData.hasOwnProperty(key)) {
					itemRecord.setValue({
						fieldId : key,
						value : itemData[key]
					});
				}
			}

			var itemId = itemRecord.save({
				enableSourcing : false,
				ignoreMandatoryFields : false
			});
		});
	}

	var itemContent = [ {
		'atpmethod' : 'CUMULATIVE_ATP_WITH_LOOK_AHEAD',
		'costcategory' : '1',
		'itemid' : 'EAI.TEST.190422003',
		'displayname' : 'EAI.TEST.190422003',
		'custitem_ps_yq_spec' : 'TEST',
		'revrecforecastrule' : '1',
		'taxschedule' : '1',
		'cogsaccount' : '223',
		'assetaccount' : '242',
		'includechildren' : true,
		'supplyreplenishmentmethod' : 'TIME_PHASED',
		'unitstype' : '3'//3 for PCS
	}, {
		'atpmethod' : 'CUMULATIVE_ATP_WITH_LOOK_AHEAD',
		'costcategory' : '1',
		'itemid' : 'EAI.TEST.190422004',
		'displayname' : 'EAI.TEST.190422004',
		'custitem_ps_yq_spec' : 'TEST',
		'revrecforecastrule' : '1',
		'taxschedule' : '1',
		'cogsaccount' : '223',
		'assetaccount' : '242',
		'includechildren' : true,
		'supplyreplenishmentmethod' : 'TIME_PHASED',
		'unitstype' : '3'//3 for PCS
	} ];
	createAndSaveInventoryItemRecord(itemContent);
});
