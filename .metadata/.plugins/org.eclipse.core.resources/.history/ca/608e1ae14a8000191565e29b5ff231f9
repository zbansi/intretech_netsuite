/**
 * @NApiVersion 2.0
 * @NScriptType Restlet
 * @NAmdConfig /SuiteScripts/intretech/configport.json
 * @author ZhangYuKun
 */
define(['PMF'], function (pmf) {
    function _delete(context) {
        var runStart = new Date().getTime();

        var types = pmf.recordTypes("21");
        var quantity = pmf.deleteRecord(context.name, types.itemType, types.searchType, 'name');

        return new Date().getTime() - runStart + 'ms\n成功删除' + quantity + '条记录'
    }

    return {
        delete: _delete
    }
});