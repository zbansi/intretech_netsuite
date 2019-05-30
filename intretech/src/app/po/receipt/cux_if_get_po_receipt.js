/**
 * @NApiVersion 2.0
 * @NScriptType Restlet
 * @NAmdConfig /SuiteScripts/intretech/configport.json
 * @author ZhangYuKun
 */
define(['PPF'], function (ppf) {
    function _get(context) {
        var runTime = new Date().getTime();
        var recordData = ppf.getTansactionPOInStorage(context.name);
        return [new Date() - runTime + 'ms', recordData]
    }

    return {
        get: _get,
    }
});