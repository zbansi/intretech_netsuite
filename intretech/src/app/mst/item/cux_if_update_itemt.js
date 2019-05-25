/**
 * @NApiVersion 2.0
 * @NScriptType Restlet
 * @NAmdConfig /SuiteScripts/intretech/configport.json
 * @author ZhangYuKun
 */
define(['PMF'], function (pmf) {
    function _put(context) {
        var runStart = new Date().getTime();

        var types = pmf.recordTypes(context.itemType);
        var i = pmf.modifyRecord(context.itemData, types.itemType, types.searchType,'itemid');

        return new Date().getTime() - runStart + 'ms\n已更新数据' + i + '条记录'
    }

    return {
        put: _put
    }

});