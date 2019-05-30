/**
 * @NApiVersion 2.0
 * @NScriptType Restlet
 * @author ZhangYuKun
 */

define(['N/record', 'N/search'], function (record, search) {
    function _put(context) {
        var runTime = new Date().getTime();

        var poId = 0;
        search.create({
            type: search.Type.TRANSACTION,
            columns: ["tranid", "internalid"],
            filters: [{name: 'mainline', operator: 'is', values: ['T']}]
        }).run().each(function (result) {
            if (result.getValue({name: 'tranid'}) == context.poId) {
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

        var rec = record.load({
            type: record.Type.ITEM_RECEIPT,
            id: recriptId
        });
        context.receiptData.forEach(function (data) {
            for (var key in data) {
                if (key != 'sublistData') {
                    // main field
                    rec.setValue({fieldId: key, value: data[key]});
                } else {
                    // sublist
                    for (var sublistId in data[key]) {
                        data[key][sublistId].forEach(function (sublistValue) {
                            for (var fieldId in sublistValue) {
                                if (fieldId != 'line') {
                                    if (fieldId != 'inventorydetail') {
                                        rec.setSublistValue({
                                            sublistId: sublistId,
                                            fieldId: fieldId,
                                            line: sublistValue.line,
                                            value: sublistValue[fieldId]
                                        });
                                    } else {
                                        // sublist<inventory detailed>
                                        var subRecSubData = sublistValue[fieldId];
                                        subRecSubData.forEach(function (subData) {
                                            var subRec = rec.getSublistSubrecord({
                                                sublistId: 'item',
                                                line: sublistValue.line,
                                                fieldId: 'inventorydetail'
                                            });

                                            for (var subRecFid in subData) {
                                                if (subRecFid != 'line') {
                                                    subRec.setSublistValue({
                                                        sublistId: 'inventoryassignment',
                                                        fieldId: subRecFid,
                                                        line: subData.line,
                                                        value: subData[subRecFid]
                                                    });
                                                }
                                            }
                                        });
                                    }
                                }
                            }
                        });
                    }
                }
            }
        });
        rec.save();

        return {runTime: new Date() - runTime + 'ms', returnData: 'Put Success!'}
    }

    return {
        put: _put
    }
});