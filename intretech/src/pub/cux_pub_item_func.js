/**
 * PublicMasterFunction.js
 *
 * @NApiVersion 2.0
 * @NModuleScope Public
 * @author ZhangYuKun
 */

define(['N/record', 'N/search', 'N/runtime', 'N/format', 'N/task'], function (record, search, runtime, format, task) {

        //recordType and Id
        function itemRecIdAndType(names, filterName, searchType) {
            var filter = [search.createFilter({
                name: filterName,
                operator: search.Operator.IS,
                values: names
            })];
            return search.create({type: searchType, filters: filter}).run().getRange(0, 1)[0];
        }

        //create Item record
        function createItemMain(jsonData, itemType) {
            var recId = -1;
            jsonData.forEach(function (itemData) {
                var itemRecord = record.create({
                    type: itemType
                });

                for (var key in itemData) {
                    if (key != "sublistData") {
                        itemRecord.setValue({
                            fieldId: key,
                            value: itemData[key]
                        })
                    } else {
                        for (var sublistIds in itemData[key]) {
                            var line = 0;
                            var sublistValues = itemData[key][sublistIds];
                            sublistValues.forEach(function (sublistValue) {
                                for (var fieldIds in sublistValue) {
                                    itemRecord.setSublistValue({
                                        sublistId: sublistIds,
                                        fieldId: fieldIds,
                                        line: line,
                                        value: sublistValue[fieldIds]
                                    });
                                }
                                line++;
                            });
                        }
                    }
                }
                recId = itemRecord.save();
            });
            return recId;
        }

        //create Account
        function createAccount(jsonData) {
            var recordId = [];
            jsonData.forEach(function (data) {
                var account = record.create({type: record.Type.ACCOUNT});
                for (var key in data) {
                    if (key != 'sublistData') {
                        account.setValue({fieldId: key, value: data[key]})
                    } else {
                        account = record.load({type: record.Type.ACCOUNT, id: account.save()});
                        var n = 0;
                        for (var sublistId in data[key]) {
                            data[key][sublistId].forEach(function (subData) {
                                for (var subKey in subData) {
                                    account.setSublistValue({
                                        sublistId: sublistId,
                                        fieldId: subKey,
                                        line: n,
                                        value: subData[subKey]
                                    });
                                }
                                n++;
                            });
                        }
                    }
                }
                recordId.push(account.save());
            });
            return recordId
        }

        //get Item Data
        function getItemData(names, filterName, searchType) {
            var itemNames = names.split(',');
            var itemData = [];
            for (var i = 0; i < itemNames.length; i++) {
                var itemRec = itemRecIdAndType(itemNames[i], filterName, searchType);
                if (runtime.getCurrentScript().getRemainingUsage() >= 4900) {
                    itemData.push(record.load({type: itemRec.recordType, id: itemRec.id}));
                } else {
                    var itemNames2 = names.split(',');
                    itemNames2.splice(0, i);
                    var scriptRecord = record.load({
                        type: 'scriptdeployment',
                        id: 569
                    });
                    scriptRecord.setValue({
                        fieldId: 'custscript_get_input_data_0527',
                        value: JSON.stringify(itemNames2)
                    });
                    scriptRecord.save();

                    // Execute the MapReduce script
                    var scriptTask = task.create({taskType: task.TaskType.MAP_REDUCE});
                    scriptTask.scriptId = 'customscript396';
                    scriptTask.deploymentId = 'customdeploy1';
                    var scriptTaskId = scriptTask.submit();

                    var taskId = scriptTaskId.toString();
                    var statusObject = task.checkStatus({taskId: taskId});

                    while (statusObject.status != 'COMPLETE') {
                        statusObject = task.checkStatus({taskId: taskId});
                    }

                    var rec = record.load({
                        type: 'scriptdeployment',
                        id: 507
                    });

                    var getData = rec.getValue({fieldId: 'custscript_return_get_data'});

                    itemData.push(JSON.parse(getData));

                    break;
                }
            }

            return itemData
        }

        //get Item Data
        function getBeyondItemData(names, filterName, searchType) {
            var itemRec = itemRecIdAndType(names, filterName, searchType);
            return record.load({type: itemRec.recordType, id: itemRec.id})
        }

        //delete record
        function deleteRecord(names, filterName, searchType) {
            var recordNames = names.split(',');
            for (var i = 0; i < recordNames.length; i++) {
                var itemRec = itemRecIdAndType(recordNames[i], filterName, searchType);
                record.delete({type: itemRec.recordType, id: itemRec.id});
            }
            return ' Success Delete Record'
        }

        //update record
        function modifyRecord(jsonData, filterName, searchType) {
            var i = 0;
            jsonData.forEach(function (itemData) {
                var recIT = itemRecIdAndType(itemData.dataName, filterName, searchType);
                var itemRecord = record.load({
                    type: recIT.recordType,
                    id: recIT.id
                });

                for (var key in itemData) {
                    if (key != 'dataName') {
                        if (key != "sublistData") {
                            itemRecord.setValue({
                                fieldId: key,
                                value: itemData[key]
                            })
                        } else {
                            for (var sublistIds in itemData[key]) {
                                itemData[key][sublistIds].forEach(function (sublistValue) {
                                    for (var fieldId in sublistValue) {
                                        if (fieldId != 'line') {
                                            itemRecord.setSublistValue({
                                                sublistId: sublistIds,
                                                fieldId: fieldId,
                                                line: sublistValue.line,
                                                value: sublistValue[fieldId]
                                            });
                                        }
                                    }
                                });
                            }
                        }
                    }
                }
                itemRecord.save();
                i++
            });
            return i
        }

        //GetAllData Or GetIncrease
        function getAllOrIncrease(getManner) {
            var lastDateTime = runtime.getCurrentScript().getParameter('custscript_set_last_runtime');
            // getManner = runtime.getCurrentScript().getParameter('custscript_get_data_manner');

            var scriptRecord = record.load({//usage = 5
                type: 'scriptdeployment',
                id: 507
            });
            var dateNow = new Date(new Date().getTime() + 60 * 60 * 1000);
            var dateStr = format.format({
                    value: dateNow,
                    type: format.Type.DATETIME
                }),
                dateObj = format.parse({
                    value: dateStr,
                    type: format.Type.DATETIME
                });

            scriptRecord.setValue({
                fieldId: 'custscript_set_last_runtime',
                value: dateObj
            });

            scriptRecord.save();//usage = 10

            var recordData = {}, columns = [];
            columns[0] = search.createColumn({name: 'internalid'});
            columns[1] = search.createColumn({name: 'itemid'});
            columns[2] = search.createColumn({name: 'category'});
            columns[3] = search.createColumn({name: 'purchaseunit'});
            columns[4] = search.createColumn({name: 'location'});
            columns[5] = search.createColumn({name: 'created'});


            if (getManner == 'all' || getManner == 'ALL' || !lastDateTime) {
                recordData = search.create({
                    type: 'item',
                    columns: columns
                }).run().getRange({
                    start: 0,
                    end: 1000
                });
            } else {
                var lastTimeStr = format.format({
                    value: lastDateTime,
                    type: format.Type.DATETIME,
                    timezone: format.Timezone.ASIA_HONG_KONG
                }).split('分')[0] + '分';

                var strTime = format.format({
                    value: lastTimeStr,
                    type: format.Type.DATETIME
                });

                var filters = [];
                filters[0] = search.createFilter({
                    name: 'created',
                    operator: search.Operator.ONORAFTER,
                    values: strTime
                });

                // log.debug({title: 'lastTimeStrs', details: strTime});
                filters[1] = search.createFilter({
                    name: 'isinactive',
                    operator: search.Operator.EQUALTO,
                    values: 'N'
                });

                recordData = search.create({
                    type: 'item',
                    filters: filters,
                    columns: columns
                }).run().getRange({
                    start: 0,
                    end: 100
                });
            }
            return recordData
        }

        return {
            'createItemMain': createItemMain,
            'createAccount': createAccount,
            'getItemData': getItemData,
            'deleteRecord': deleteRecord,
            'modifyRecord': modifyRecord,
            'getAllOrIncrease': getAllOrIncrease,
            'getBeyondItemData': getBeyondItemData
        }
    }
);