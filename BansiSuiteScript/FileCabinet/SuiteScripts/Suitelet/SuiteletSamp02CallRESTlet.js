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
/*
 * scriptId : 'customscript1898', deploymentId : 'customdeploy1',
 */// TDRV1914586
define(
		[ 'N/https', 'N/url' ],
		function(https, urlMod) {
			function suiteletCallRESTlet(options) {
				var url = urlMod.resolveScript({
					scriptId : 'customscript_restletsamp01helloworld',
					deploymentId : 'customdeploy_restletsamp01helloworld',
					returnExternalUrl : true,
					params : {
						parametername : 'value'
					}
				});
				// Using User Credentials for RESTlet Authentication:

				var headers = {
					'Authorization' : 'NLAuth nlauth_account=TSTDRV1891065, nlauth_email=yancen.li@hand-china.com, nlauth_signature=handhand, nlauth_role=3'
				};

				// Using TBA for RESTlet Authentication (OAuth):
				/*
				 * var headers = { 
				 * 'Authorization' : 'OAuth realm="TSTDRV1914586", oauth_consumer_key="f6ebfa3e602ff6c4053487618724c69dd368cab172837269e5d025c4445932f9", oauth_token="37db4565f4c30845ee1832ff2734696e45fce17677686d06278623c57a6cb9e6", oauth_nonce="qUwlmPvtGCS4sHJe8F7x", oauth_timestamp="1542268064", oauth_signature_method="HMAC-SHA1", oauth_version="1.0", oauth_signature="R0VUJmh0dHBzJTNBJTJGJTJGcmVzdC5uZXRzdWl0ZS5jb20lMkZhcHAlMkZzaXRlJTJGaG9zdGluZyUyRnJlc3RsZXQubmwmZGVwbG95JTNEMSUyNm9hdXRoX2NvbnN1bWVyX2tleSUzRGY2ZWJmYTNlNjAyZmY2YzQwNTM0ODc2MTg3MjRjNjlkZDM2OGNhYjE3MjgzNzI2OWU1ZDAyNWM0NDQ1OTMyZjklMjZvYXV0aF9ub25jZSUzRHFVd2xtUHZ0R0NTNHNISmU4Rjd4JTI2b2F1dGhfc2lnbmF0dXJlX21ldGhvZCUzREhNQUMtU0hBMSUyNm9hdXRoX3RpbWVzdGFtcCUzRDE1NDIyNjgwNjQlMjZvYXV0aF90b2tlbiUzRDM3ZGI0NTY1ZjRjMzA4NDVlZTE4MzJmZjI3MzQ2OTZlNDVmY2UxNzY3NzY4NmQwNjI3ODYyM2M1N2E2Y2I5ZTYlMjZvYXV0aF92ZXJzaW9uJTNEMS4wJTI2c2NyaXB0JTNEMTg5OCZkMTAxYjUwM2EzN2JhNTgwMDFiY2I5ZTE4YTUxYTlkYmE4MmY0ZTFhYjFmZGVkNGJiYThmMDJhN2E4N2YyOGFlJjQ0MmIxZTk4ZjMwZDFiODcyMjJmZjA3MWRkMjgwY2VkNmZlZWRhZDQzYjY2NTg3NjY0NDJmYjIwMzExNmQxMTI%3D"' 
				 * };
				 */

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