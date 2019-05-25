/**
 * @NApiVersion 2.0
 * @NScriptType Restlet
 * @author ZhangYuKun
 */

define(['N/record', 'N/search'], function (record, search) {
    function _delete(context) {
        var runTime = new Date().getTime();

        var poId = 0;
        search.create({
            type: search.Type.TRANSACTION,
            columns: ["tranid", "internalid"],
            filters: [{name: 'mainline', operator: 'is', values: ['T']}]
        }).run().each(function (result) {
            if (result.getValue({name: 'tranid'}) == context.id) {
                poId = result.getValue({name: 'internalid'})
            }
            return true
        });

        var recriptId = 0;
        search.create({
            type: search.Type.ITEM_RECEIPT,
            columns: ['createdfrom', 'internalid'],
            filters: [{name: 'mainline', operator: 'is', values: ['T']}]
        }).run().each(function (result) {
            if (result.getValue({name: 'createdfrom'}) == poId) {
                recriptId = result.getValue({name: 'internalid'})
            }
            return true
        });

        var rec = record.delete({
            type: record.Type.ITEM_RECEIPT,
            id: poId
        });
        return [new Date() - runTime + 'ms', '成功删除货品单据: ' + rec]
    }

    return {
        delete: _delete
    }
});