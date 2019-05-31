/**
 * PublicMasterFunction.js
 *
 * @NApiVersion 2.0
 * @NModuleScope Public
 * @author ZhangYuKun
 */

define(['N/record', 'N/search', 'N/format'], function (record, search, format) {

        //recordType and searchType transform
        function recordTypes(itemType) {
            var searchType;
            switch (itemType) {
                case "1":
                    itemType = record.Type.ASSEMBLY_ITEM;
                    searchType = search.Type.ASSEMBLY_ITEM;
                    break;
                case "2" :
                    itemType = record.Type.LOT_NUMBERED_ASSEMBLY_ITEM;
                    searchType = search.Type.LOT_NUMBERED_ASSEMBLY_ITEM;
                    break;
                case "3" :
                    itemType = record.Type.SERIALIZED_ASSEMBLY_ITEM;
                    searchType = search.Type.SERIALIZED_ASSEMBLY_ITEM;
                    break;
                case "4" :
                    itemType = record.Type.INVENTORY_ITEM;
                    searchType = search.Type.INVENTORY_ITEM;
                    break;
                case "5" :
                    itemType = record.Type.LOT_NUMBERED_INVENTORY_ITEM;
                    searchType = search.Type.LOT_NUMBERED_INVENTORY_ITEM;
                    break;
                case "6" :
                    itemType = record.Type.SERIALIZED_INVENTORY_ITEM;
                    searchType = search.Type.SERIALIZED_INVENTORY_ITEM;
                    break;
                case "7" :
                    itemType = record.Type.OTHER_CHARGE_ITEM;
                    searchType = search.Type.OTHER_CHARGE_ITEM;
                    break;
                case "8" :
                    itemType = record.Type.NON_INVENTORY_ITEM;
                    searchType = search.Type.NON_INVENTORY_ITEM;
                    break;
                case "9" :
                    itemType = record.Type.SERVICE_ITEM;
                    searchType = search.Type.SERVICE_ITEM;
                    break;
                case "10":
                    itemType = record.Type.MARKUP_ITEM;
                    searchType = search.Type.MARKUP_ITEM;
                    break;
                case "11":
                    itemType = record.Type.DISCOUNT_ITEM;
                    searchType = search.Type.DISCOUNT_ITEM;
                    break;
                case "12":
                    itemType = record.Type.DESCRIPTION_ITEM;
                    searchType = search.Type.DESCRIPTION_ITEM;
                    break;
                case "13":
                    itemType = record.Type.KIT_ITEM;
                    searchType = search.Type.KIT_ITEM;
                    break;
                case "14":
                    itemType = record.Type.GIFT_CERTIFICATE_ITEM;
                    searchType = search.Type.GIFT_CERTIFICATE_ITEM;
                    break;
                case "15":
                    itemType = record.Type.PAYMENT_ITEM;
                    searchType = search.Type.PAYMENT_ITEM;
                    break;
                case "16":
                    itemType = record.Type.SUBTOTAL_ITEM;
                    searchType = search.Type.SUBTOTAL_ITEM;
                    break;
                case "17":
                    itemType = record.Type.PAYMENT_ITEM;
                    searchType = search.Type.PAYMENT_ITEM;
                    break;
                case "18":
                    itemType = record.Type.ITEM_GROUP;
                    searchType = search.Type.ITEM_GROUP;
                    break;
                case "19":
                    itemType = record.Type.CUSTOMER;
                    searchType = search.Type.CUSTOMER;
                    break;
                case "20":
                    itemType = record.Type.VENDOR;
                    searchType = search.Type.VENDOR;
                    break;
                case "21":
                    itemType = record.Type.MANUFACTURING_ROUTING;
                    searchType = search.Type.MANUFACTURING_ROUTING;
                    break;
                case "22":
                    itemType = record.Type.ACCOUNT;
                    searchType = search.Type.ACCOUNT;
                    break;
                case "23":
                    itemType = record.Type.BOM;
                    searchType = search.Type.BOM;
                    break;
                default:
                    return 'RECORD ERROR!'
            }
            return {itemType: itemType, searchType: searchType}
        }

        //create Item record
        function createItemMain(jsonData, itemType) {
            var recId = 0;
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
        function getItemData(names, itemType, searchType, filterName) {
            var itemNames = names.split(',');
            var itemData = [];
            for (var i = 0; i < itemNames.length; i++) {
                var filter = search.createFilter({
                    name: filterName,
                    operator: search.Operator.IS,
                    values: itemNames[i]
                });

                itemData.push(record.load({
                    type: itemType,
                    id: search.create({type: searchType, filters: filter}).run().getRange(0, 1)[0].id
                }))

            }


            return itemData
        }

        //delete record
        function deleteRecord(names, itemType, searchType, filterName) {
            var recordNames = names.split(','), n = 0;
            for (var i = 0; i < recordNames.length; i++) {
                var bomRec = search.create({
                    type: searchType,
                    filters: [[filterName, 'is', recordNames[i]]]
                }).run().getRange(0, 1);
                record.delete({type: itemType, id: bomRec[0].id});
                n++;
            }
            return n
        }

        //update record
        function modifyRecord(jsonData, itemType, searchType, filterName) {
            var i = 0;
            jsonData.forEach(function (itemData) {
                var filter = search.createFilter({
                    name: filterName,
                    operator: search.Operator.IS,
                    values: itemData.dataName
                });

                var itemRecord = record.load({
                    type: itemType,
                    id: search.create({type: searchType, filters: filter}).run().getRange(0, 1)[0].id
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

        return {
            'recordTypes': recordTypes,
            'createItemMain': createItemMain,
            'createAccount': createAccount,
            'getItemData': getItemData,
            'deleteRecord': deleteRecord,
            'modifyRecord': modifyRecord,
        }
    }
);