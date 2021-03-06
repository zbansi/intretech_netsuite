/**
 * @NApiVersion 2.x
 * @NScriptType Suitelet
 * 
 * Sample 2.0 Suitelet to invoke restlet using Token-based Authentication
 */
define(
		[ 'N/https', '/SuiteScripts/util/oauth', '/SuiteScripts/util/secret' ],

		function(https, oauth, secret) {
			function onRequest(context) {
				if (context.request.method == 'GET') {

					var url = 'https://5144758-sb1.restlets.api.netsuite.com/app/site/hosting/restlet.nl?script=24&deploy=1';
					var methodPUT = 'PUT';
					var headersPUT = oauth.getHeaders({
						url : url,
						method : methodPUT,
						tokenKey : secret.token.public,
						tokenSecret : secret.token.secret
					});

					var methodGET = 'GET';
					var headersGET = oauth.getHeaders({
						url : url,
						method : methodGET,
						tokenKey : secret.token.public,
						tokenSecret : secret.token.secret
					});

					var body = {
						datum1 : 'datum1',
						datum2 : 'foobar'
					}

					headersPUT['Content-Type'] = 'application/json';

					var restResponsePUT = https.put({
						url : url,
						headers : headersPUT,
						body : JSON.stringify(body)
					});
					log.debug('response', JSON.stringify(restResponsePUT));
					log.debug('headers', headersPUT);

					headersGET['Content-Type'] = 'application/json';
					var restResponseGET = https.get({
						url : url,
						headers : headersGET
					});
					log.debug('response', JSON.stringify(restResponseGET));
					log.debug('headers', headersGET);

					var html = '<html><body>' + 'Calling: ' + url + '<br><br>'
							+ 'Full headerPUT stack:<br>'
							+ JSON.stringify(headersPUT) + '<br><br>'
							+ 'Payload:<br>' + JSON.stringify(body)
							+ '<br><br>' + 'ResponsePUT:<br>'
							+ restResponsePUT.body + '<br><br>'
							+ 'Full headerGET stack:<br>' + '<br><br>'
							+ JSON.stringify(headersGET) + '<br><br>'
							+ '<br><br>' + 'ResponseGET:<br>'
							+ restResponseGET.body

							+ '</body></html>';

					context.response.write(html);
				}

			}
			return {
				onRequest : onRequest
			};
		});