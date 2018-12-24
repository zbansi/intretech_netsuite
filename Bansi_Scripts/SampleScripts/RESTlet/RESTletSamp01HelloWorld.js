/**
 * @NApiVersion 2.x
 * @NScriptType Restlet
 * 
 *
 * Version Date Author Remarks
 * 
 * 1.00 05 Nov 2018 Bansi
 */
define([], function() {
	function helloWorldRESTlet() {
		return "Hello World!";
	}

	return {
		get : helloWorldRESTlet
	};
});