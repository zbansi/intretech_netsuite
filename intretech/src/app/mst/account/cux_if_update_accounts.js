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

        return [new Date() - runStart + 'ms', "�ɹ�����" + recordId + "����¼"]
    }

    return {
        put: _put
    }

});