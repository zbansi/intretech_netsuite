/**
 * @NApiVersion 2.0
 * @NScriptType Restlet
 * @NAmdConfig /SuiteScripts/intretech/configport.json
 * @author ZhangYuKun
 */
define(['PMF'], function (pmf) {
    function _put(context) {
        var runStart = new Date().getTime();
        var types = pmf.recordTypes("22");
        var recordId = pmf.modifyRecord(context.itemData, types.itemType, types.searchType, 'number');

        return [new Date() - runStart + 'ms', "成功更新" + recordId + "条记录"]
    }

    return {
        put: _put
    }

});