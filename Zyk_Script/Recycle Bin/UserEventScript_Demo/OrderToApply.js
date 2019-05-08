/**
 * @NApiVersion 2.0
 * @NScriptType UserEventScript
 * OrderToApply.js
 */

////////////////Function Description//////////////////////////
//自动生成领料单，并赋值
//工单明细表和领料明细表*** 物料 数量
//工单和领料单************* 领料员/领料人 领料车间 仓库 来源工单号/工单name
//////////////////////////////////////////////////////////////
define(['N/record'], function (rec) {
    function beforeLoad(context) {
        var newRec = context.newRecord,
            types = context.type;

        if (types == context.UserEventType.CREATE) {
            try {
                var woid = context.request.parameters.woid;
                if (woid) {
                    var recd = rec.load({
                        type: 'customrecord_test_yk',
                        id: woid
                    })
                }

                // 领料单赋值
                var workers = recd.getValue({
                        fieldId: 'custrecordcustrecord_worker_yk'
                    }),
                    wShop = recd.getValue({
                        fieldId: 'custrecordcustrecord_workshop_yk'
                    }),
                    wHouse = recd.getValue({
                        fieldId: 'custrecordcustrecord_warehouse_yk'
                    }),
                    byOrder = recd.getValue({
                        fieldId: 'name'
                    });
                newRec.setValue('custrecord_apply_worker_yk', workers);
                newRec.setValue('custrecord_apply_workshop_yk', wShop);
                newRec.setValue('custrecord_apply_odd_yk', byOrder);
                newRec.setValue('custrecord_apply_warehouse_yk', wHouse);


                // 领料明细表赋值 recmach+ID
                var sublistWorker = 'recmachcustrecordcustrecord_detail_gd_yk',
                    sublistMater = 'recmachcustrecord_apply_header_yk';
                for (var i = 0; i < recd.getLineCount(sublistWorker); i++) {
                    newRec.setSublistValue(
                        sublistMater,
                        'custrecord_apply_materail_yk',
                        i,
                        recd.getSublistValue(sublistWorker, 'custrecordcustrecord_detail_wl_yk', i)
                    );

                    newRec.setSublistValue(
                        sublistMater,
                        'custrecord_apply_stores_bumber_yk',
                        i,
                        recd.getSublistValue(sublistWorker, 'custrecordcustrecord_detail_num_yk', i)
                    )
                }
                log.debug({
                    title: 'OK',
                    details: '创建成功'+byOrder
                })
            } catch (e) {
                log.debug({
                    title: e.name,
                    details: e.message
                })
            }
        } else if (types == context.UserEventType.VIEW) {
            var appStatus = context.newRecord.getValue({
                fieldId: 'custrecord_apply_approve_status_yk'
            });
            try {
                if (appStatus == 3) {
                    context.form.clientScriptModulePath = './PrintMatOrder.js';
                    context.form.addButton({
                        id: 'custpage_btnPrint_yk',
                        label: '打印此领料单',
                        functionName: 'printOne'
                    })
                }
                log.debug({
                    title: 'Success',
                    details: "按钮创建成功"
                })
            } catch (e3) {
                log.debug({
                    title: e3.name,
                    details: e3.message
                })
            }

        }
    }

    return {
        beforeLoad: beforeLoad
    }
});