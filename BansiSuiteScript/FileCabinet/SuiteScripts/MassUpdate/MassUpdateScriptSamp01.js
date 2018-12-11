/**
 * @NApiVersion 2.0
 * @NScriptType MassUpdateScript
 */
define([ 'N/record' ], function(record) {
	function each(params) {
		// Set the probability to 61%
		var recOpportunity = record.load({
			type : params.type,
			id : params.id
		});
		recOpportunity.setValue('probability', 61);
		recOpportunity.save();
	}
	return {
		each : each
	};
});