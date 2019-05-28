/**
 * @NApiVersion 2.0
 * @NScriptType Restlet
 * @NAmdConfig /SuiteScripts/intretech/configport.json
 * @author ZhangYuKun
 */
define(['PMF'], function (pmf) {
    function _post(context) {
        var runStart = new Date().getTime();

        var types = pmf.recordTypes("21");
        var recordId = pmf.createItemMain(context.itemData, types.itemType);

        return new Date().getTime() - runStart + "ms\n创建成功,id:" + recordId
    }

    return {
        post: _post
    }
});