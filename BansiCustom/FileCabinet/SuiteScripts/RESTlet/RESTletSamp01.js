/**
 * Module Description
 * 
 * Version    Date            Author           Remarks
 * 1.00       05 Nov 2018     Bansi
 *
 */

/**
 * @NApiVersion 2.x
 * @NScriptType restlet
 */
define([], function() {
	function helloWorldRESTlet() {
		return "Hello World!";
	}

	return {
		get : helloWorldRESTlet
	};
});