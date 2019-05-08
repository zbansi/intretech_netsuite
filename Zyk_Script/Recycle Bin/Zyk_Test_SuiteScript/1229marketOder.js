/**
 *@NApiVersion 2.x
 *@NScriptType ClientScript
 */
define(['N/error'],
    function (error) {
        // 加载表单进行编辑时，pageInit事件会将客户字段设置为特定客户。
        function pageInit(context) {
            if (context.mode !== 'create')
                return;
            var currentRecord = context.currentRecord;
            currentRecord.setValue({
                fieldId: 'entity',
                value: 107
            });
        }

        // 保存表单更改时，saveRecord事件可确保设置客户字段并列出至少一个销售订单项。
        function saveRecord(context) {
            var currentRecord = context.currentRecord;
            if (!currentRecord.getValue({
                fieldId: 'entity'
            }) || currentRecord.getLineCount({
                sublistId: 'item'
            }) < 1)
                throw error.create({
                    name: 'MISSING_REQ_ARG',
                    message: 'Please enter all the necessary fields on the salesorder before saving'
                });
            return true;
        }

        // 编辑销售订单项目的数量时，validateField事件可确保该数字小于3。
        function validateField(context) {
            var currentRecord = context.currentRecord;
            var sublistName = context.sublistId;
            var sublistFieldName = context.fieldId;
            var line = context.line;
            if (sublistName === 'item') {
                if (sublistFieldName === 'quantity') {
                    if (currentRecord.getCurrentSublistValue({
                        sublistId: sublistName,
                        fieldId: sublistFieldName
                    }) < 3)
                        currentRecord.setValue({
                            fieldId: 'otherrefnum',
                            value: 'Quantity is less than 3'
                        });
                    else
                        currentRecord.setValue({
                            fieldId: 'otherrefnum',
                            value: 'Quantity accepted'
                        });
                }
            }
            return true;
        }

        // 选择销售订单项目时，fieldChanged事件会更新备注字段以指示该项目已被选中。
        function fieldChanged(context) {
            var currentRecord = context.currentRecord;
            var sublistName = context.sublistId;
            var sublistFieldName = context.fieldId;
            var line = context.line;
            if (sublistName === 'item' && sublistFieldName === 'item')
                currentRecord.setValue({
                    fieldId: 'memo',
                    value: 'Item: ' + currentRecord.getCurrentSublistValue({
                        sublistId: 'item',
                        fieldId: 'item'
                    }) + ' is selected'
                });
        }

        // 选择特定销售订单项目后，postSourcing事件将更新该特定项目的价格级别。
        function postSourcing(context) {
            var currentRecord = context.currentRecord;
            var sublistName = context.sublistId;
            var sublistFieldName = context.fieldId;
            var line = context.line;
            if (sublistName === 'item' && sublistFieldName === 'item')
                if (currentRecord.getCurrentSublistValue({
                    sublistId: sublistName,
                    fieldId: sublistFieldName
                }) === '39')
                    if (currentRecord.getCurrentSublistValue({
                        sublistId: sublistName,
                        fieldId: 'pricelevels'
                    }) !== '1-1')
                        currentRecord.setCurrentSublistValue({
                            sublistId: sublistName,
                            fieldId: 'pricelevels',
                            value: '1-1'
                        });
        }

        // 选择现有合作伙伴后，lineInit事件会将所选合作伙伴更改为特定合作伙伴。
        function lineInit(context) {
            var currentRecord = context.currentRecord;
            var sublistName = context.sublistId;
            if (sublistName === 'partners')
                currentRecord.setCurrentSublistValue({
                    sublistId: sublistName,
                    fieldId: 'partner',
                    value: '55'
                });
        }

        // 删除伙伴时，validateDelete事件会更新备注字段以指示已删除伙伴。
        function validateDelete(context) {
            var currentRecord = context.currentRecord;
            var sublistName = context.sublistId;
            if (sublistName === 'partners')
                if (currentRecord.getCurrentSublistValue({
                    sublistId: sublistName,
                    fieldId: 'partner'
                }) === '55')
                    currentRecord.setValue({
                        fieldId: 'memo',
                        value: 'Removing partner sublist'
                    });
            return true;
        }

        // 添加新合作伙伴或编辑现有合作伙伴时，validateInsert和validateLine事件确保其贡献设置为100％
        function validateInsert(context) {
            var currentRecord = context.currentRecord;
            var sublistName = context.sublistId;
            if (sublistName === 'partners')
                if (currentRecord.getCurrentSublistValue({
                    sublistId: sublistName,
                    fieldId: 'contribution'
                }) !== '100.0%')
                    currentRecord.setCurrentSublistValue({
                        sublistId: sublistName,
                        fieldId: 'contribution',
                        value: '100.0%'
                    });
            return true;
        }

        function validateLine(context) {
            var currentRecord = context.currentRecord;
            var sublistName = context.sublistId;
            if (sublistName === 'partners')
                if (currentRecord.getCurrentSublistValue({
                    sublistId: sublistName,
                    fieldId: 'contribution'
                }) !== '100.0%')
                    currentRecord.setCurrentSublistValue({
                        sublistId: sublistName,
                        fieldId: 'contribution',
                        value: '100.0%'
                    });
            return true;
        }

        // 插入，删除或编辑子列表后执行。
        function sublistChanged(context) {
            var currentRecord = context.currentRecord;
            var sublistName = context.sublistId;
            var op = context.operation;
            if (sublistName === 'item')
                currentRecord.setValue({
                    fieldId: 'memo',
                    value: 'Total has changed to ' + currentRecord.getValue({
                        fieldId: 'total'
                    }) + ' with operation: ' + op
                });
        }

        return {
            pageInit: pageInit,
            fieldChanged: fieldChanged,
            postSourcing: postSourcing,
            sublistChanged: sublistChanged,
            lineInit: lineInit,
            validateField: validateField,
            validateLine: validateLine,
            validateInsert: validateInsert,
            validateDelete: validateDelete,
            saveRecord: saveRecord
        };
    });