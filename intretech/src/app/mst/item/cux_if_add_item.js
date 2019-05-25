/**
 * @NApiVersion 2.0
 * @NScriptType Restlet
 * @NAmdConfig /SuiteScripts/intretech/configport.json
 * @author ZhangYuKun
 */
define(['PMF'], function (pmf) {
    function _post(context) {
        var runStart = new Date().getTime();
        var itemType = pmf.recordTypes(context.itemType).itemType;
        var recId = pmf.createItemMain(context.itemData, itemType);

        return [new Date().getTime() - runStart + 'ms\n', 'Success Create ! id: ' + recId]
    }

    return {
        post: _post
    }

});