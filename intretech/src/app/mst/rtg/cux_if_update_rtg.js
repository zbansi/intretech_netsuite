/**
 * @NApiVersion 2.0
 * @NScriptType Restlet
 * @NAmdConfig /SuiteScripts/intretech/configport.json
 * @author ZhangYuKun
 */
define(['PMF'], function (pmf) {
    function _put(context) {
        var runStart = new Date().getTime();

        var types = pmf.recordTypes("21");
        pmf.modifyRecord(context.itemData,types.itemType, types.searchType,'name');

        return new Date().getTime() - runStart + "ms\n更新成功"
    }

    return {
        put: _put
    }
});