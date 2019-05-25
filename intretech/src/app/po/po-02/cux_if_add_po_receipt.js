/**
 * @NApiVersion 2.0
 * @NScriptType Restlet
 * @NAmdConfig /SuiteScripts/intretech/configport.json
 * @author ZhangYuKun
 */
define(['PPF'], function (ppf) {
    function _post(context) {
        var runTime = new Date().getTime();
        var recordId = ppf.tansactionPOInStorage(context.receiptData);
        return [new Date() - runTime + 'ms', 'Post Success! id: '+recordId]
    }

    return {
        post: _post
    }
});