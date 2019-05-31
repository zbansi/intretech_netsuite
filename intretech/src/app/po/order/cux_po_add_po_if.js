/**
 * @NApiVersion 2.0
 * @NScriptType Restlet
 * @NAmdConfig /SuiteScripts/intretech/configport.json
 */
define(['PPF'], function (ppf) {
    function _post(context) {
        var runStart = new Date().getTime();
        var i = ppf.createPO(context.poData);
        return new Date() - runStart + 'ms ' + i + 'Records were successfully created'
    }


    return {
        post: _post
    }

});