/**
 * @NApiVersion 2.0
 * @NScriptType Restlet
 * @NAmdConfig /SuiteScripts/intretech/configport.json
 * @author ZhangYuKun
 */
define(['PMF','N/runtime'], function (pmf,runtime) {
    function _get(context) {
        var runStart = new Date().getTime();
        if (context.name) {
            var itemData = pmf.getItemData(context.name, 'itemid', 'item');
            return [runtime.getCurrentScript().getRemainingUsage() + 'ms', itemData]
        } else {
            var recordData = pmf.getAllOrIncrease(context.get);
            return [new Date().getTime() - runStart + 'ms', recordData];
        }
    }

    return {
        get: _get
    }
});