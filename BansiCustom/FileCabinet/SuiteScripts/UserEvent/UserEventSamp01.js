/**
 * Module Description
 * 
 * Version    Date            Author           Remarks
 * 1.00       08 Nov 2018     Bansi
 *
 */
/**
 * @NApiVersion 2.x
 * @NScriptType UserEventScript
 */
define([ 'N/record' ], function(record) {

	/**
	 * Function definition to be triggered before record is loaded.
	 * 
	 * @param {Object}
	 *            scriptContext
	 * @param {Record}
	 *            scriptContext.newRecord - New record
	 * @param {string}
	 *            scriptContext.type - Trigger type
	 * @param {Form}
	 *            scriptContext.form - Current form
	 * @Since 2015.2
	 */
	function beforeLoad(scriptContext) {
		if (scriptContext.type !== scriptContext.UserEventType.CREATE)
			return;
		var customerRecord = scriptContext.newRecord;
		customerRecord.setValue('phone', '555-555-5555');
		if (!customerRecord.getValue('salesrep'))
			customerRecord.setValue('salesrep', 46);
	}

	/**
	 * Function definition to be triggered before record is loaded.
	 * 
	 * @param {Object}
	 *            scriptContext
	 * @param {Record}
	 *            scriptContext.newRecord - New record
	 * @param {Record}
	 *            scriptContext.oldRecord - Old record
	 * @param {string}
	 *            scriptContext.type - Trigger type
	 * @Since 2015.2
	 */
	function beforeSubmit(scriptContext) {
		if (scriptContext.type !== scriptContext.UserEventType.CREATE)
			return;
		var customerRecord = scriptContext.newRecord;
		customerRecord.setValue('comments',
				'Please  follow  up  with  this customer!');
	}

	/**
	 * Function definition to be triggered before record is loaded.
	 * 
	 * @param {Object}
	 *            scriptContext
	 * @param {Record}
	 *            scriptContext.newRecord - New record
	 * @param {Record}
	 *            scriptContext.oldRecord - Old record
	 * @param {string}
	 *            scriptContext.type - Trigger type
	 * @Since 2015.2
	 */
	function afterSubmit(scriptContext) {
		if (scriptContext.type !== scriptContext.UserEventType.CREATE)
			return;
		var customerRecord = scriptContext.newRecord;
		if (customerRecord.getValue('salesrep')) {
			var call = record.create({
				type : record.Type.PHONE_CALL,
				isDynamic : true
			});
			call.setValue('title', 'Make follow-up call to new customer');
			call.setValue('assigned', customerRecord.getValue('salesrep'));
			call.setValue('phone', customerRecord.getValue('phone'));
			try {
				var callId = call.save();
				log.debug('Call record created successfully', 'Id: ' + callId);
			} catch (e) {
				log.error(e.name);
			}
		}
	}

	return {
		beforeLoad : beforeLoad,
		beforeSubmit : beforeSubmit,
		afterSubmit : afterSubmit
	};

});
