/**
 * @NApiVersion 2.x
 */
require(['N/https', '/SuiteScripts/util/oauth', '/SuiteScripts/Bansi_Scripts/SampleScripts/TokenBased/secret'], function(https, oauth, secret) {

    var url = 'https://5144758-sb1.restlets.api.netsuite.com/app/site/hosting/restlet.nl?script=24&deploy=1';
    var method = 'GET';
    var headers = oauth.getHeaders({
        url: url,
        method: method,
        tokenKey: secret.token.public,
        tokenSecret: secret.token.secret
    });

    headers['Content-Type'] = 'application/json';

    var restResponse = https.get({
        url: url,
        headers: headers
    });
    log.debug('response', JSON.stringify(restResponse));
    log.debug('headers', headers);

});