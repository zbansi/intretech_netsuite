/**
 * @NApiVersion 2.0
 * @NScriptType Restlet
 * @NAmdConfig /SuiteScripts/intretech/configport.json
 * @author ZhangYuKun
 */
define(['PMF'], function (pmf) {
    function _post(context) {
        var runStart = new Date().getTime();

        var recordId = pmf.createAccount(context.itemData);

        return [new Date() - runStart + 'ms', "科目创建成功!" + '***' + recordId]
    }

    return {
        post: _post
    }

});