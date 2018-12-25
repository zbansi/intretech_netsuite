/**
 * @NApiVersion 2.x
 * @NScriptType Suitelet
 * 
 * Sample 2.0 Suitelet to invoke restlet using UC Authentication
 */
define(
		[ 'N/https' ],
		function(https) {
			function testRequest(context) {
				if (context.request.method == 'GET') {
					var requestUrl = 'https://5144758-sb1.restlets.api.netsuite.com/app/site/hosting/restlet.nl?script=24&deploy=1';// REST
					// Endpoint
					// URL

					var realm = '5144758_SB1'; // REALM
					var email = '377132229@qq.com';
					var signature = 'Welcome123';
					var roleId = 1002;

					var reqBody = {
						"a_parameter" : 'abc123',
					};

					var reqHeaders = {
						'Content-Type' : 'application/json',
						'Authorization' : 'NLAuth nlauth_account=' + realm
								+ ', nlauth_email=' + email
								+ ', nlauth_signature=' + signature
								+ ', nlauth_role=' + roleId
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
							+ '<br><br>' + ', realm="' + realm + '"'
							+ '<br><br>' + 'Full header stack:<br>'
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