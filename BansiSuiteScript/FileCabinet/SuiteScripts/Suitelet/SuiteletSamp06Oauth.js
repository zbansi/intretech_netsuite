/**
 * @NApiVersion 2.x
 * @NScriptType suitelet
 */
require.config({
	paths : {
		"oauth" : "./oauth_valid",
		"cryptojs" : "./crypto_lib/components",
	},
	shim : {
		"oauth-1.0a" : {//这个键名为要载入的目标文件的文件名，不能随便命名。
			exports : "OAuth"//exports的值为oauth.js提供的 对外接口的名称
		},
		"core" : {
			exports : "CryptoJS"
		}
	}
});

define(
		[ 'N/https', 'oauth', 'cryptojs' ],
		function(https, oauth, cryptojs) {
			function testRequest(context) {
				if (context.request.method == 'GET') {
					var requestUrl = 'https://rest.netsuite.com/app/site/hosting/restlet.nl?script=1898&deploy=1'; // REST
					// Endpoint
					// URL
					var consumerKey = 'f6ebfa3e602ff6c4053487618724c69dd368cab172837269e5d025c4445932f9'; // CONSUMER
					// KEY
					var consumerSecret = 'd101b503a37ba58001bcb9e18a51a9dba82f4e1ab1fded4bba8f02a7a87f28ae'; // CONSUMER
					// SECRET
					var tokenId = '37db4565f4c30845ee1832ff2734696e45fce17677686d06278623c57a6cb9e6'; // TOKEN
					// ID
					var tokenSecret = '442b1e98f30d1b87222ff071dd280ced6feedad43b6658766442fb203116d112'; // TOKEN
					// SECRET
					var realm = 'TSTDRV1914586'; // REALM

					var reqBody = {
						"a_parameter" : 'abc123',
					};

					// Build Token-Based Authorization
					var auth = oauth({
						consumer : {
							public : consumerKey,
							secret : consumerSecret
						},
						signature_method : 'HMAC-SHA256'
					});

					var token = {
						public : tokenId,
						secret : tokenSecret
					};

					var request_data = {
						url : requestUrl,
						method : 'POST',
						data : {}
					};

					var authHead = auth.toHeader(auth.authorize(request_data,
							token));
					var reqHeaders = {
						'Content-Type' : 'application/json',
						'Authorization' : authHead.Authorization + ', realm="'
								+ realm + '"'
					};

					var req = https.post({
						url : requestUrl,
						body : JSON.stringify(reqBody),
						headers : reqHeaders
					});

					log.debug({
						title : 'Resp',
						details : req.body
					});

					var html = '<html><body>' + 'Calling: ' + requestUrl
							+ '<br><br>' + 'Generated OAuth header:<br>'
							+ authHead.Authorization + ', realm="' + realm
							+ '"' + '<br><br>' + 'Full header stack:<br>'
							+ JSON.stringify(reqHeaders) + '<br><br>'
							+ 'Payload:<br>' + JSON.stringify(reqBody)
							+ '<br><br>' + 'Response:<br>' + req.body
							+ '</body></html>';

					context.response.write(html);
				}
			}

			return {
				onRequest : testRequest
			};
		});