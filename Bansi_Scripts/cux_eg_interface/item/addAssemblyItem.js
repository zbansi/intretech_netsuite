/*
 * NApiVersion 2.x
 */
require([ 'N/record'], function(record) {
	//create and save Lot Numbered Assembly Item
	function createAndSaveAssemblyItemRecord(itemContent) {
		itemContent.forEach(function(itemData) {
			var itemRecord = record.create({
				type : record.Type.LOT_NUMBERED_ASSEMBLY_ITEM,
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
		'itemid' : 'EAI.TEST.190422A01',
		'displayname' : 'EAI.TEST.190422A01',
		'custitem_ps_yq_spec' : 'Assmbly TEST',
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
		'itemid' : 'EAI.TEST.190422A02',
		'displayname' : 'EAI.TEST.190422A02',
		'custitem_ps_yq_spec' : 'Assmbly TEST',
		'revrecforecastrule' : '1',
		'taxschedule' : '1',
		'cogsaccount' : '223',
		'assetaccount' : '242',
		'includechildren' : true,
		'supplyreplenishmentmethod' : 'TIME_PHASED',
		'unitstype' : '3'//3 for PCS
	} ];
	createAndSaveAssemblyItemRecord(itemContent);
});
