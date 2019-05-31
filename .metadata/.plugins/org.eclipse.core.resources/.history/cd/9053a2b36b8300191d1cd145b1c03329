/**
 * @NApiVersion 2.0
 * @NScriptType Restlet
 * @NAmdConfig /SuiteScripts/intretech/configport.json
 * @author ZhangYuKun
 */
define(['PPF'], function (ppf) {
    function _delete(context) {
        var runStart = new Date().getTime();
        var poData = ppf.deleteData(context.name);
        return new Date() - runStart + 'ms, The deleted ID is' + poData + 'successfully';
    }

    return {
        delete: _delete
    }

});