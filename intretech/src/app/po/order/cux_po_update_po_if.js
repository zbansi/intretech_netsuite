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
        return new Date() - runStart + 'ms ' + i + 'Piece of data has been updated'
    }

    return {
        put: _put
    }

});