/**
 * @NApiVersion 2.0
 * @NScriptType Restlet
 * @NAmdConfig /SuiteScripts/intretech/configport.json
 * @author ZhangYuKun
 */
define(['PMF'], function (pmf) {
    function _delete(context) {
        var runStart = new Date().getTime();
        var itemTypes = pmf.recordTypes("20");
        var quantity = pmf.deleteRecord(context.name, itemTypes.itemType, itemTypes.searchType, 'entityid');
        return new Date().getTime() - runStart + 'ms\n已成功删除' + quantity + '条记录'
    }

    return {
        delete: _delete
    }
});