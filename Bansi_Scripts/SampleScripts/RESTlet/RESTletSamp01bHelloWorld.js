/**
 * @NApiVersion 2.x
 * @NScriptType Restlet
 * 
 * Module Description
 * 
 * Version Date Author Remarks
 * 
 * 1.00 05 Nov 2018 Bansi
 * 
 */
define([ 'N/record', 'N/error' ], function(record, error) {
	function getRESTlet() {
		return
		{
			"Bansi Says: Hello World!"
		};
	}

	return {
		get : getRESTlet
	}

});