/**
 * @NApiVersion 2.0
 * @NScriptType Restlet
 * @NAmdConfig /SuiteScripts/intretech/configport.json
 * @author ZhangYuKun
 */
define(['PMF'], function (pmf) {
    function _put(context) {
        var runStart = new Date().getTime();
        var i = pmf.modifyRecord(context.itemData, 'itemid', 'item');
        return new Date().getTime() - runStart + 'ms,' + i + ' Piece of data has been updated'
    }

    return {
        put: _put
    }

});