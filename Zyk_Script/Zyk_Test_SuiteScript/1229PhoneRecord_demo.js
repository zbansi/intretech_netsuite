define([ 'N/record' ],

function(record) {

	function scheduleCall(context) {

		var newPhoneCall = record.create({
			type : record.Type.PHONE_CALL,
			isDynamic : true
		});

		newPhoneCall.setValue({
			fieldId : 'title',
			value : context.phoneCallTitle
		});

		newPhoneCall.setValue({
			fieldId : 'assigned',
			value : context.phoneCallOwner
		});

		newPhoneCall.setText({
			fieldId : 'phone',
			text : context.phoneNumber
		});

		try {

			var newPhoneCallId = newPhoneCall.save();

			log.debug({
				title : 'Phone call record created successfully',
				details : 'New phone call record ID:  ' + newPhoneCallId
			});

		} catch (e) {
			log.error({
				title : e.name,
				details : e.message
			});
		}
	}


	return {
		schedule : scheduleCall,
	}

});