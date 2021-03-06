/**
 * @NApiVersion 2.x
 * @NScriptType suitelet
 * @NAmdConfig ./configuration.json
 */
define(
		[ 'N/https', 'oauth', 'cryptojs' ],
		function(https, oauth, cryptojs) {
			function testRequest(context) {
				if (context.request.method == 'GET') {
					var requestUrl = 'https://rest.netsuite.com/app/site/hosting/restlet.nl?script=182&deploy=1'; // REST
					// Endpoint
					// URL
					var consumerKey = '84473bdb2167f89509e889b01012333930f02e5d7cd3458e5cb27b5a1546784c'; // CONSUMER
					// KEY
					var consumerSecret = '667e8dd31a4a86f22897ae735fd43818f074de576bb181df9f0cead1435264d2'; // CONSUMER
					// SECRET
					var tokenId = ''; // TOKEN
					// ID
					var tokenSecret = ''; // TOKEN
					// SECRET
					var realm = 'TSTDRV1914586'; // REALM

					var baseString = 'jfdkfdklfjkl';

					var reqBody = {
						"a_parameter" : 'abc123',
					};

					// Build Token-Based Authorization
					
					function hashfunctionsha1(base_string, key) { return CryptoJS.HmacSHA256(base_string, key).toString(CryptoJS.enc.Base64); }
				
					var auth = OAuth({
						consumer : {
							public : consumerKey,
							secret : consumerSecret
						},
						signature_method : 'HMAC-SHA256',
						hash_function : hashfunctionsha1(baseString,consumerKey)
					      
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