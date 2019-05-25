/**
 * @NApiVersion 2.0
 * @NScriptType Restlet
 * @NAmdConfig /SuiteScripts/intretech/configport.json
 * @author ZhangYuKun
 */
define(['PMF'], function (pmf) {
    function _post(context) {
        var runStart = new Date().getTime();

        var itemType = pmf.recordTypes("20").itemType;
        var recId = pmf.createItemMain(context.itemData, itemType);

        return new Date().getTime() - runStart + 'ms\n�����ɹ���Id��' + recId
    }

    return {
        post: _post
    }

});