/*
 * Module Description
 * 
 * Version    Date            Author           Remarks
 * 1.00       03 Nov 2018     Bansi
 *
 */
/**
 * @NApiVersion 2.x
 * @NScriptType ClientScript Module Description
 * 
 * Version Date Author Remarks 1.00 03 Nov 2018 Bansi
 */
//Example: Client Script that Calls a RESTlet
define([ 'N/https', 'N/ui/dialog' ], function(https, dialog) {
	function clientCallRESTlet() {
		var dataFromRestlet = https
				.get('/app/site/hosting/restlet.nl?script=182&deploy=1');
		console.log(dataFromRestlet.body);
		var options = {
			title : 'Hello!',
			message : 'Hello, World! ' + dataFromRestlet
		};
		try {
			dialog.alert(options);
			log.debug({
				title : 'Success',
				details : 'Client Call RESTlet successfully'
			});
		} catch (e) {
			log.error({
				title : e.name,
				details : e.message
			});
		}
	}

	return {
		pageInit : clientCallRESTlet
	};
});