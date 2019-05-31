/**
 * @NApiVersion 2.0
 * @NScriptType Restlet
 * @NAmdConfig /SuiteScripts/intretech/configport.json
 * @author ZhangYuKun
 */
define(['PMF'], function (pmf) {
    function _delete(context) {
        var runStart = new Date().getTime();
        var status = pmf.deleteRecord(context.name,'itemid','item');
        return new Date().getTime() - runStart + 'ms ,' + status
    }

    return {
        delete: _delete
    }
});