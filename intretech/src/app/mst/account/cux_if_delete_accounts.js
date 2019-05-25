/**
 * @NApiVersion 2.0
 * @NScriptType Restlet
 * @NAmdConfig /SuiteScripts/intretech/configport.json
 * @author ZhangYuKun
 */
define(['PMF'], function (pmf) {
    function _delete(context) {
        var runStart = new Date().getTime();
        var types = pmf.recordTypes("22");
        var quantity = pmf.deleteRecord(context.name, types.itemType, types.searchType, 'number');
        return [new Date() - runStart, '成功删除' + quantity + '条记录']
    }

    return {
        delete: _delete
    }

});