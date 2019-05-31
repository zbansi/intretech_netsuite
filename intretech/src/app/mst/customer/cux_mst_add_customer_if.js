/**
 * @NApiVersion 2.0
 * @NScriptType Restlet
 * @NAmdConfig /SuiteScripts/intretech/configport.json
 * @author ZhangYuKun
 */
define(['PMF'], function (pmf) {
    function _post(context) {
        var runStart = new Date().getTime();
        var recId = pmf.createItemMain(context.itemData,'customer');
        return [new Date().getTime() - runStart + 'ms', 'Success Create ! id: ' + recId]
    }

    return {
        post: _post
    }

});