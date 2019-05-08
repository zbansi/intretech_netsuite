/**
 * @NApiVersion 2.x
 * @NScriptType UserEventScript
 * @author
 * MAOCreateFromWO.js
 */
////////////////Function Description//////////////////
// #1 领料单页面加载前
// #1.1 如果是新建模式(type=CREATE),判断是否从工单自动创建
//		if true, 用工单数据初始化赋值领料单
//		if false, 手工填写赋值
// #1.2 如果是查看模式(type=VIEW),判断工单状态status
//		if status = '已批准', 页面添加'打印领料单'按钮
//////////////////////////////////////////////////////
define(
    [ 'N/record' ],
    function(record) {
        function beforeLoad(context) {
            var maoRecord = context.newRecord;
            var type = context.type;
            var form = context.form;

            if (type == context.UserEventType.CREATE) {
                try {
                    var woid = context.request.parameters.woid;
                    if (woid) {
                        var rec = record.load({
                            type : 'customrecord_test_yk',
                            id : woid
                        });
                        //初始化赋值master
                        var warehouse = rec.getValue({
                            fieldId : 'custrecordcustrecord_warehouse_yk'
                        });
                        var clerk = rec.getValue({
                            fieldId : 'custrecordcustrecord_worker_yk'
                        });
                        var workshop = rec.getValue({
                            fieldId : 'custrecordcustrecord_workshop_yk'
                        });
                        maoRecord.setValue(
                            'custrecord_yq_mao_header_sourcewo_yk',
                            woid);
                        maoRecord.setValue(
                            'custrecord_yq_mao_source_workshop_yk',
                            workshop);
                        maoRecord.setValue(
                            'custrecord_yq_material_apply_re_yk',
                            clerk);
                        maoRecord.setValue('custrecord_yq_warehouse_yk',
                            warehouse);
                        maoRecord.setValue(
                            'custrecord_yq_material_apply_note_yk',
                            '创建自工单:' + rec.getText({
                                fieldId : 'name'
                            }));

                        //初始化赋值明细行
                        //sublistid为recmach+子记录中作为外键到父记录的字段ID
                        var sublistIdToSet = 'recmachcustrecord_yq_material_apply_detail_h_bs';
                        var sublistIdToGet = 'recmachcustrecord_yq_workorder_detail_headid_bs';
                        var count = rec.getLineCount(sublistIdToGet);
                        for (var i = 0; i < count; i++) {
                            maoRecord
                                .setSublistValue(
                                    sublistIdToSet,
                                    'custrecord1',
                                    i,
                                    rec
                                        .getSublistValue(
                                            sublistIdToGet,
                                            'custrecordcustrecord_detail_wl_yk',
                                            i));
                            maoRecord
                                .setSublistValue(
                                    sublistIdToSet,
                                    'custrecord_apply_stores_bumber_yk',
                                    i,
                                    rec
                                        .getSublistValue(
                                            sublistIdToGet,
                                            'custrecordcustrecord_detail_wl_yk',
                                            i));
                        }

                    }
                    log.debug({
                        title : 'Success',
                        details : '赋值成功：woid = ' + woid + ', warehouse = '
                            + warehouse + ', clerk = ' + clerk
                            + ', workshop = ' + workshop
                            + ', sublist = ' + rec.getSublist()
                    });
                } catch (e1) {
                    log.debug({
                        title : e1.name,
                        details : e1.message
                    });
                }
            } else if (type == context.UserEventType.VIEW) {
                var status = context.newRecord.getText({
                    fieldId : 'custrecord_apply_approve_status_yk'
                });
                try {
                    if (status == '已批准') {
                        form.clientScriptModulePath = './PrintMAO.js';
                        form.addButton({
                            id : 'custpage_print_mao',
                            label : '打印领料单',
                            functionName : 'yk_print_mao'
                        });

                        log.debug({
                            title : 'Success',
                            details : '添加-打印领料单-按钮成功！'
                        });
                    }
                } catch (ex) {
                    log.debug({
                        title : ex.name,
                        details : ex.message
                    });

                }
            }
        }

        function beforeSubmit(context) {
            if (context.type != context.UserEventType.CREATE)
                return;

        }

        return ({
            beforeLoad : beforeLoad,
            beforeSubmit : beforeSubmit
        });
    });
