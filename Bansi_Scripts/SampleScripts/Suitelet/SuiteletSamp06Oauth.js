/**
 * @NApiVersion 2.x
 * @NScriptType suitelet
 * @NAmdConfig ./configuration.json
 * 
 * Sample 2.0 Suitelet to invoke restlet using Token-based Authentication
 */
define(
		[ 'N/https', 'oauth', 'cryptojs' ],
		function(https, oauth, cryptojs) {
			function testRequest(context) {
				if (context.request.method == 'GET') {
					var requestUrl = 'https://5144758-sb1.restlets.api.netsuite.com/app/site/hosting/restlet.nl?script=24&deploy=1';// REST Endpoint URL
					var consumerKey = '7674407ee439d2f053f3aafafaac1e13e58855f3b1f8b394e22a653102ccffff'; // CONSUMER KEY
					var consumerSecret = 'f712df24df85ce77f4ef440e30597be03340b5ab464df6a537f7d506037ed65b'; // CONSUMER SECRET
					var tokenId = '881cc02d2ef4821740d92c07d34c9a188699c407879967373e828fc56af5f83f'; // TOKEN ID
					var tokenSecret = 'c3277ffe691e3f2ee24ff817cf089309de5026bdb4b4a3a799b69b483c304ece'; // TOKEN SECRET
					var realm = '5144758_SB1'; // REALM					

					var reqBody = {
						"a_parameter" : 'abc123',
					};

					// Build Token-Based Authorization

					function hashfunctionsha256(base_string, key) {
						return CryptoJS.HmacSHA256(base_string, key).toString(
								CryptoJS.enc.Base64);
					}

					const
					auth = OAuth({
						consumer : {
							key : consumerKey,
							secret : consumerSecret,
							version : '1.0'

						},
						signature_method : 'HMAC-SHA256',
						hash_function : hashfunctionsha256

					});

					var token = {
						key : tokenId,
						secret : tokenSecret
					};

					var request_data = {
						url : requestUrl,
						method : 'POST', //default GET
						includeBodyHash : false,//default false
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

					var rep2 = https.get({
						url : requestUrl,
						headers : reqHeaders
					});

					log.debug({
						title : 'Resp',
						details : '响应1:' + req.body + '响应2: ' + rep2.body
					});

					var html = '<html><body>' + 'Calling: ' + requestUrl
							+ '<br><br>' + 'Generated OAuth header:<br>'
							+ authHead.Authorization + ', realm="' + realm
							+ '"' + '<br><br>' + 'Full header stack:<br>'
							+ JSON.stringify(reqHeaders) + '<br><br>'
							+ 'Payload:<br>' + JSON.stringify(reqBody)
							+ '<br><br>' + 'Response1:<br>' + req.body
							+ '<br><br>' + 'Response2:<br>' + rep2.body
							+ '</body></html>';

					context.response.write(html);
				}
			}

			return {
				onRequest : testRequest
			};
		});