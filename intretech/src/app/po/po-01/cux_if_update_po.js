/**
 * @NApiVersion 2.0
 * @NScriptType Restlet
 * @NAmdConfig /SuiteScripts/intretech/configport.json
 * @author ZhangYuKun
 */
define(['PPF'], function (ppf) {
    function _put(context) {
        var runStart = new Date().getTime();
        var i = ppf.modifyPO(context.poData);

        return new Date() - runStart + 'ms\n�ɹ�����' + i + '����¼'
    }

    return {
        put: _put
    }

});