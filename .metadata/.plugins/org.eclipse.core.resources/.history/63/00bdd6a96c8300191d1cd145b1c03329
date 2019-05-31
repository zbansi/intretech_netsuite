/**
 * @NApiVersion 2.0
 * @NScriptType Restlet
 * @NAmdConfig  /SuiteScripts/intretech/configport.json
 * @author ZhangYuKun
 */
define(['PMF'], function (pmf) {
    function _get(context) {
        var runStart = new Date().getTime();
        var itemData = pmf.getItemData(context.name, 'number','account');
        return [new Date().getTime() - runStart + 'ms', itemData]
    }

    return {
        get: _get
    }

});