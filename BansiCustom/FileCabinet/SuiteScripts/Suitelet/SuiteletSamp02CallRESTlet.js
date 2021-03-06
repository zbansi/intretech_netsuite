/**
 * Module Description
 * 
 * Version    Date            Author           Remarks
 * 1.00       05 Nov 2018     Bansi
 *
 */

/**
 * @param {nlobjRequest} request Request object
 * @param {nlobjResponse} response Response object
 * @returns {Void} Any output is written via response object
 */
/**
 * @NApiVersion 2.x
 * @NScriptType Suitelet
 */
define(
		[ 'N/https', 'N/url' ],
		function(https, urlMod) {
			function suiteletCallRESTlet(options) {
				var url = urlMod.resolveScript({
					scriptId : 'customscript1898',
					deploymentId : 'customdeploy1',
					returnExternalUrl : true,
					params : {
						parametername : 'value'
					}
				});
				var headers = {
					'Authorization' : 'NLAuth nlauth_account=TSTDRV1914586, nlauth_email=858454280@qq.com, nlauth_signature=handhand, nlauth_role=3'
				};
				var response = https.get({
					url : url,
					headers : headers
				});
				options.response.write(response.body);
			}

			return {
				onRequest : suiteletCallRESTlet
			};
		});