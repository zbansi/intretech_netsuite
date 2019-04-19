/**
 * @NApiVersion 2.x
 * @NScriptType Suitelet
 * @NAmdConfig ./configuration.json
 * 
 * Sample 2.0 Suitelet to invoke restlet using Token-based Authentication
 */
define(
		[ 'N/https', 'oauth', 'hmac-sha256', 'hmac-sha1', 'encbase64' ],
		/**
		 * @param {https} https
		 * @param {oauth} oauth
		 * @param {hmac-sha256} sha256
		 * @param {hmac-sha1} sha1
		 * @param {encbase64} encbase64
		 */
		function(https, oauth, sha256, sha1, encbase64) {
			function testRequest(context) {
				if (context.request.method == 'GET') {
					// Endpoint URL
					var requestUrl = 'https://5144758-sb1.restlets.api.netsuite.com/app/site/hosting/restlet.nl?script=24&deploy=1';// REST

					// //////////// TOKEN-BASED AUTHENTICATION///////////
					//集成名称 EAI_BS_TEST 访问令牌授权角色 CUX_超级用户
					// client credentials
					var consumerKey = 'a4fca249a4ec7d7be1f85b4f9177ad79756df96415c1ad08439592984fed2ab5';
					var consumerSecret = 'a56ede1ee3ea34d0fa85b112568f3d178c63e72a6fe20819bb2463d0d8d081d4';
					// token credentials
					var tokenId = 'e0e754dd5542f58fed363616fea11803d4910e4a1350835001f0b9f0fa3e6d25';
					var tokenSecret = '754086c49441d2b4a218349ab89e5fc15e850024db7346b5401efac3c02d8b55';
					// REALM
					var realm = '5144758_SB1';

					var reqBody = {
						"a_parameter" : 'abc123',
					};

					// ////////// USER CREDENTIALS/////////////
					var email = '377132229@qq.com';
					var signature = 'Welcome123';
					var roleId = 1002;// 用户角色需要访问货品的权限

					// Build Token-Based Authorization
					var auth = OAuth({
						consumer : {
							key : consumerKey,
							secret : consumerSecret
						},
						signature_method : 'HMAC-SHA1',
						hash_function : hashfunctionsha1
					});

					var token = {
						key : tokenId,
						secret : tokenSecret
					};

					var request_data = {
						url : requestUrl,
						method : 'GET' // default GET

					};

					var authHead = auth.toHeader(auth.authorize(request_data,
							token));

					var reqHeaders = {
						'Content-Type' : 'application/json',
						'Authorization' : authHead.Authorization + ', realm="'
								+ realm + '"'
					};
					try {
						var req = https.get({
							url : requestUrl,
							body : JSON.stringify(reqBody),//apply for PUT or POST method
							headers : reqHeaders
						});
					} catch (err) {
						log.debug({
							title : err.name,
							details : err.message
						});
					}

					var html = '<html><body>' + 'Calling request_data:<br>'
							+ JSON.stringify(request_data) + '<br><br>'
							+ '<br><br>' + 'Generated OAuth header:<br>'
							+ authHead.Authorization + ', realm="' + realm
							+ '"' + '<br><br>' + 'Full header1 stack:<br>'
							+ JSON.stringify(reqHeaders) + '<br><br>'
							+ 'reqBody:<br>' + JSON.stringify(reqBody)
							+ '<br><br>' + 'OAuth Response:<br>' + req.body
							+ '<br><br>' + '</body></html>';

					context.response.write(html);
				}
			}

			function hashfunctionsha256(base_string, key) {
				return CryptoJS.HmacSHA256(base_string, key).toString(
						CryptoJS.enc.Base64);
			}

			function hashfunctionsha1(base_string, key) {
				return CryptoJS.HmacSHA1(base_string, key).toString(
						CryptoJS.enc.Base64);
			}

			return {
				onRequest : testRequest
			};
		});