/**
 * Module Description
 * 
 * Version    Date            Author           Remarks
 * 2.00       08 Nov 2018     Bansi
 *
 */
/**
 * @NApiVersion 2.x
 * @NScriptType UserEventScript
 */
define([ 'N/record' ], function(record) {

	/**
	 * The recordType (internal id) corresponds to the "Applied To" record in
	 * your script deployment.
	 * 
	 * @appliedtorecord recordType
	 * 
	 * @param {String}
	 *            type Operation types: create, edit, view, copy, print, email
	 * @param {nlobjForm}
	 *            form Current form
	 * @param {nlobjRequest}
	 *            request Request object
	 * @returns {Void}
	 */
	function userEventBeforeLoad(type, form, request) {
		if (type.type !== type.UserEventType.CREATE)
			return;
		var customerRecord = type.newRecord;
		customerRecord.setValue('phone', '555-555-5555');
		if (!customerRecord.getValue('salesrep'))
			customerRecord.setValue('salesrep', 46);
	}

	/**
	 * The recordType (internal id) corresponds to the "Applied To" record in
	 * your script deployment.
	 * 
	 * @appliedtorecord recordType
	 * 
	 * @param {String}
	 *            type Operation types: create, edit, delete, xedit approve,
	 *            reject, cancel (SO, ER, Time Bill, PO & RMA only) pack, ship
	 *            (IF) markcomplete (Call, Task) reassign (Case) editforecast
	 *            (Opp, Estimate)
	 * @returns {Void}
	 */
	function userEventBeforeSubmit(type) {
		if (type.type !== type.UserEventType.CREATE)
			return;
		var customerRecord = type.newRecord;
		customerRecord.setValue('comments',
				'Please  follow  up  with  this customer!');
	}

	/**
	 * The recordType (internal id) corresponds to the "Applied To" record in
	 * your script deployment.
	 * 
	 * @appliedtorecord recordType
	 * 
	 * @param {String}
	 *            type Operation types: create, edit, delete, xedit, approve,
	 *            cancel, reject (SO, ER, Time Bill, PO & RMA only) pack, ship
	 *            (IF only) dropship, specialorder, orderitems (PO only)
	 *            paybills (vendor payments)
	 * @returns {Void}
	 */
	function userEventAfterSubmit(type) {
		if (type.type !== type.UserEventType.CREATE)
			return;
		var customerRecord = type.newRecord;
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
		beforeLoad : userEventBeforeLoad,
		beforeSubmit : userEventBeforeSubmit,
		afterSubmit : userEventAfterSubmit
	};

});
