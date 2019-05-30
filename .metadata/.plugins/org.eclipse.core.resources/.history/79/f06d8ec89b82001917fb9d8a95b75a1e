/**
 * @NApiVersion 2.0
 * @NScriptType Restlet
 * @NAmdConfig /SuiteScripts/intretech/configport.json
 * @author ZhangYuKun
 */
define(['PPF'], function (ppf) {
    // ITEM_FULFILLMENT
    // VENDOR_RETURN_AUTHORIZATION
    function _post(context) {
        var runStart = new Date().getTime();
        var rec = ppf.tansactionPOOutStorage(context.returnData);
        return [new Date() - runStart + 'ms', rec]
    }

    return {
        post: _post
    }
});













