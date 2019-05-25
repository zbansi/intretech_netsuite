/**
 * @NApiVersion 2.0
 * @NScriptType Restlet
 * @NAmdConfig /SuiteScripts/intretech/configport.json
 * @author ZhangYuKun
 */
define(['PPF','N/record','N/search'], function (ppf,record,search) {
    // ITEM_FULFILLMENT
    // VENDOR_RETURN_AUTHORIZATION
    function _post(context) {
        var runStart = new Date().getTime();
        var rec = ppf.tansactionPOOutStorage(context.returnData);

        return [new Date() - runStart, rec]
    }

    return {
        post: _post
    }
});













