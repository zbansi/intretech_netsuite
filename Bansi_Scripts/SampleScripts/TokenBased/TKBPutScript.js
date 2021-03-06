/**
 * @NApiVersion 2.x
 */
require(['N/https', '/SuiteScripts/util/oauth', '/SuiteScripts/util/secret'], function(https, oauth, secret) {

    var url = 'https://5144758-sb1.restlets.api.netsuite.com/app/site/hosting/restlet.nl?script=24&deploy=1';
    var method = 'PUT';
    var headers = oauth.getHeaders({
        url: url,
        method: method,
        tokenKey: secret.token.public,
        tokenSecret: secret.token.secret
    });

    var body = {
        datum1: 'datum1',
        datum2: 'foobar'
    }

    headers['Content-Type'] = 'application/json';

    var restResponse = https.put({
        url: url,
        headers: headers,
        body: JSON.stringify(body)
    });
    log.debug('response', JSON.stringify(restResponse));
    log.debug('headers', headers);

});