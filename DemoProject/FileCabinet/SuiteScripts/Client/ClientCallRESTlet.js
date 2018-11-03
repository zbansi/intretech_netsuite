/**
 * Module Description
 * 
 * Version    Date            Author           Remarks
 * 1.00       03 Nov 2018     YQ12681
 *
 */
/**
* @NApiVersion 2.x
* @NScriptType ClientScript
*/
define(['N/https'], function(https) {
return {
pageInit : function() {
var dataFromRestlet = https
.get('/app/site/hosting/restlet.nl?script=1898&deploy=1');
console.log(dataFromRestlet.body);
}
}
});