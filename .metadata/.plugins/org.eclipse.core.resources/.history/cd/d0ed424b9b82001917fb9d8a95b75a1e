/**
 * @NApiVersion 2.0
 * @NScriptType Restlet
 * @NAmdConfig /SuiteScripts/intretech/configport.json
 * @author ZhangYuKun
 */
define(['PMF'], function (pmf){
    function _get(context) {
        var runStart = new Date().getTime();
        var types = pmf.recordTypes("20");
        var itemData = pmf.getItemData(context.name, types.itemType, types.searchType,'entityid');

        return [new Date().getTime() - runStart + 'ms\n', itemData]
    }

    return {
        get: _get
    }
});