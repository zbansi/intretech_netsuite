/**
 * Module Description
 * 
 * Version Date Author Remarks 2.x 05 Nov 2018 Bansi
 * 
 *
 * @NApiVersion 2.x
 * @NScriptType Suitelet
 */


// Example: Suitelet that Calls a RESTlet
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
				// Using User Credentials for RESTlet Authentication:

				/*var headers = {
					'Authorization' : 'NLAuth nlauth_account=TSTDRV1914586, nlauth_email=858454280@qq.com, nlauth_signature=handhand, nlauth_role=3'
				};*/

				// Using TBA for RESTlet Authentication (OAuth):
				var headers = {
					'Authorization' : 'OAuth realm="TSTDRV1914586", oauth_consumer_key="f6ebfa3e602ff6c4053487618724c69dd368cab172837269e5d025c4445932f9", oauth_token="37db4565f4c30845ee1832ff2734696e45fce17677686d06278623c57a6cb9e6", oauth_nonce="qUwlmPvtGCS4sHJe8F7x", oauth_timestamp="1462453273", oauth_signature_method="HMAC-SHA1", oauth_version="1.0", oauth_signature="8PI9lIYxUmUONjxEFJUSMD9oOmc%3D"'
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