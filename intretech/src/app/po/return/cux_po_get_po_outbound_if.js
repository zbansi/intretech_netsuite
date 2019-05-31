/**
 * @NApiVersion 2.0
 * @NScriptType Restlet
 * @NAmdConfig /SuiteScripts/intretech/configport.json
 * @author ZhangYuKun
 */
define(['PPF'], function (ppf) {
    function _get(context) {
        var runStart = new Date().getTime();
        var rec = ppf.getTansactionPOOutStorage(context.name);
        return [new Date() - runStart + 'ms', rec]
    }

    return {
        get: _get
    }
});












