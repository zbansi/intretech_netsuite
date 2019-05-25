/**
 * @NApiVersion 2.0
 * @NScriptType Restlet
 * @NAmdConfig /SuiteScripts/intretech/configport.json
 * @author ZhangYuKun
 */
define(['PPF','N/runtime'], function (ppf,runtime) {
    function _get(context) {
        var runStart = new Date().getTime();
        var poData = ppf.getPOData(context.name);

        return [new Date() - runStart + ' ms','剩余单位用量：'+runtime.getCurrentScript().getRemainingUsage(),poData];
    }

    return {
        get: _get
    }

});