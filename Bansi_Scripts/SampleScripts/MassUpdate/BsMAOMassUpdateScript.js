/**
 * @NApiVersion 2.x
 * @NScriptType MassUpdateScript
 * @author YQ12681
 */
define([ 'N/record' ],
/**
 * @param {record} record
 */
function(record) {
	function each(params) {
		var maoRecord = record.load({ type : params.type,
		id : params.id });
		maoRecord.setValue({ fieldId : 'custrecord_yq_material_apply_line_use_bs',
		value : 'init by massupdate' + Date() });
		maoRecord.save();
	}
	return { each : each };
})