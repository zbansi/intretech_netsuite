/**
 * PublicPurchaseFunction.js
 *
 * @NApiVersion 2.0
 * @NModuleScope Public
 * @author ZhangYuKun
 */

define(['N/record', 'N/search'], function (record, search) {
        //Public procurement code
        function poRecordTransfrom(names, filterName, type) {
            var filter1 = search.createFilter({
                name: 'mainline',
                operator: search.Operator.IS,
                values: true
            });

            var filter2 = search.createFilter({
                name: filterName,
                operator: search.Operator.IS,
                values: names
            });

            var id;
            switch (type) {
                //POId
                case "1":
                    id = search.create({
                        type: search.Type.TRANSACTION,
                        filters: [filter1, filter2]
                    }).run().getRange(0, 1)[0].id;
                    break;
                //ReturnId
                case "2":
                    id = search.create({
                        type: search.Type.VENDOR_RETURN_AUTHORIZATION,
                        filters: [filter1, filter2]
                    }).run().getRange(0, 1)[0].id;
                    break;
                //Out Storage id
                case "3":
                    id = search.create({
                        type: search.Type.ITEM_FULFILLMENT,
                        filters: [filter1, filter2]
                    }).run().getRange(0, 1)[0].id;
                    break;
                default:
                    id = 0;
                    return "ERROR NOT FOUND TYPE 404 !"
            }

            return {id: id};
        }

        //Create Purchase Order
        function createPO(jsonData) {
            var i = 0, posaveId = [];
            jsonData.forEach(function (poData) {
                var poRecord = record.create({
                    type: record.Type.PURCHASE_ORDER
                });
                for (var key in poData) {
                    if (key != "sublistData") {
                        poRecord.setValue({
                            fieldId: key,
                            value: poData[key]
                        })
                    } else {
                        for (var sublistIds in poData[key]) {
                            var z = 0;
                            var sublistValues = poData[key][sublistIds];
                            sublistValues.forEach(function (sublistValue) {
                                for (var fieldIds in sublistValue) {
                                    poRecord.setSublistValue({
                                        sublistId: sublistIds,
                                        fieldId: fieldIds,
                                        line: z,
                                        value: sublistValue[fieldIds]
                                    });
                                }
                                z++;
                            });
                        }
                    }
                }
                poRecord.save();
                i++;
            });
            return posaveId;
        }

        //Update of purchase order
        function modifyPO(jsonData) {
            var i = 0;
            jsonData.forEach(function (poData) {
                var poRecord = record.load({
                    type: record.Type.PURCHASE_ORDER,
                    id: poRecordTransfrom(poData.dataName, 'tranid', '1').id
                });

                for (var key in poData) {
                    if (key != "dataName") {
                        if (key != "sublistData") {
                            poRecord.setValue({
                                fieldId: key,
                                value: poData[key]
                            })
                        } else {
                            for (var sublistIds in poData[key]) {
                                var sublistValues = poData[key][sublistIds];
                                sublistValues.forEach(function (sublistValue) {
                                    for (var fieldIds in sublistValue) {
                                        if (fieldIds != 'line') {
                                            poRecord.setSublistValue({
                                                sublistId: sublistIds,
                                                fieldId: fieldIds,
                                                line: sublistValue.line,
                                                value: sublistValue[fieldIds]
                                            });
                                        }
                                    }

                                });
                            }
                        }
                    }
                }
                poRecord.save();
                i++;
            });
            return i
        }

        //Delete purchase order
        function deleteData(names) {
            var poData = [], poIds = names.split(',');
            for (var i = 0; i < poIds.length; i++) {
                poData.push(record.delete({
                    type: record.Type.PURCHASE_ORDER,
                    id: poRecordTransfrom(poIds, 'tranid', '1').id
                }))
            }
            return poData
        }

        //Get for Purchase Orders
        function getPOData(names) {
            var poData = [], poIds = names.split(',');
            for (var i = 0; i < poIds.length; i++) {
                poData.push(record.load({
                    type: record.Type.PURCHASE_ORDER,
                    id: poRecordTransfrom(poIds[i], 'tranid', '1').id
                }))
            }
            return poData
        }

        //PO In Storage
        function tansactionPOInStorage(jsonData) {
            var recId = [];
            jsonData.forEach(function (data) {
                var rec = record.transform({
                    fromType: record.Type.PURCHASE_ORDER,
                    fromId: poRecordTransfrom(data.dataName, 'tranid', '1').id,
                    toType: record.Type.ITEM_RECEIPT
                });
                for (var key in data) {
                    if (key != 'poId') {
                        if (key != 'sublistData') {
                            rec.setValue({fieldId: key, value: data[key]});
                        } else {
                            for (var sublistId in data[key]) {
                                if (sublistId == 'item') {
                                    var z = 0;
                                    data[key][sublistId].forEach(function (sublistData) {
                                        for (var fieldId in sublistData) {
                                            if (fieldId != 'inventorydetail') {
                                                rec.setSublistValue({
                                                    sublistId: sublistId,
                                                    fieldId: fieldId,
                                                    line: z,
                                                    value: sublistData[fieldId]
                                                });
                                            } else {
                                                var line = 0;
                                                sublistData[fieldId].forEach(function (subRecData) {
                                                    var subRec = rec.getSublistSubrecord({
                                                        sublistId: 'item',
                                                        line: z,
                                                        fieldId: fieldId
                                                    });

                                                    subRec.insertLine({
                                                        sublistId: 'inventoryassignment',
                                                        line: line
                                                    });

                                                    for (var subRecFid in subRecData) {
                                                        subRec.setSublistValue({
                                                            sublistId: 'inventoryassignment',
                                                            fieldId: subRecFid,
                                                            line: line,
                                                            value: subRecData[subRecFid]
                                                        });
                                                    }
                                                    line++;
                                                })
                                            }
                                        }
                                        z++;
                                    });
                                }
                            }
                        }
                    }
                }
                recId.push(rec.save())
            });
            return recId
        }

        //Get PO In Storage
        function getTansactionPOInStorage(names) {
            var recriptId = poRecordTransfrom(poRecordTransfrom(names, 'tranid', '1').id, 'createdfrom', '1').id;
            var rec = record.load({
                type: record.Type.ITEM_RECEIPT,
                id: recriptId
            });

            return [{
                'The goods receipt : ': rec,
                'Inventory details : ': rec.getSublistSubrecord({sublistId: 'item', line: 0, fieldId: 'inventorydetail'})
            }]
        }

        //PO Out Storage
        function tansactionPOOutStorage(jsonData) {
            jsonData.forEach(function (data) {
                var transformId = poRecordTransfrom(poRecordTransfrom(data.dataName, 'tranid', '1').id, 'createdfrom', '2');

                var rec = record.transform({
                    fromType: record.Type.VENDOR_RETURN_AUTHORIZATION,
                    fromId: transformId.id,
                    toType: record.Type.ITEM_FULFILLMENT
                });

                for (var key in data) {
                    if (key != 'dataName') {
                        if (key != 'item') {
                            rec.setValue({
                                fieldId: key,
                                value: data[key]
                            })
                        } else {
                            var n = 0;
                            data[key].forEach(function (subData) {
                                for (var subKey in subData) {
                                    if (subKey != 'inventorydetail') {
                                        rec.setSublistValue({
                                            sublistId: key,
                                            fieldId: subKey,
                                            line: n,
                                            value: subData[subKey]
                                        })
                                    } else {
                                        var line = 0;
                                        subData[subKey].forEach(function (subRecData) {
                                            var subRec = rec.getSublistSubrecord({
                                                sublistId: key,
                                                line: n,
                                                fieldId: subKey
                                            });
                                            subRec.insertLine({
                                                sublistId: 'inventoryassignment',
                                                line: line
                                            });
                                            for (var fieldId in subRecData) {
                                                subRec.setSublistValue({
                                                    sublistId: 'inventoryassignment',
                                                    line: line,
                                                    fieldId: fieldId,
                                                    value: subRecData[fieldId]
                                                })
                                            }
                                            line++;
                                        });
                                    }

                                }
                                n++;
                            });
                        }
                    }
                }
                rec.save();
            });
            return 'Success Dispose!'
        }

        //Get PO Out Storage
        function getTansactionPOOutStorage(names) {
            var tarnid = poRecordTransfrom(poRecordTransfrom(names, 'tranid', '1').id, 'createdfrom', '2').id;
            var recriptId = poRecordTransfrom(tarnid, 'createdfrom', '3').id;
            var rec = record.load({
                type: record.Type.ITEM_FULFILLMENT,
                id: recriptId
            });

         return {
                'Record Data : ': rec,
                'Inventory details : ': rec.getSublistSubrecord({sublistId: 'item', line: 0, fieldId: 'inventorydetail'})
            }
        }

        return {
            'getPOData': getPOData,
            'createPO': createPO,
            'modifyPO': modifyPO,
            'deleteData': deleteData,
            'tansactionPOInStorage': tansactionPOInStorage,
            'getTansactionPOInStorage': getTansactionPOInStorage,
            'getTansactionPOOutStorage': getTansactionPOOutStorage,
            'tansactionPOOutStorage': tansactionPOOutStorage,
        }
    }
);