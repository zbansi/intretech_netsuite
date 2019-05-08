/**
 * @NApiVersion 2.x
 * @NScriptType UserEventScript
 * @author
 * MAOCreateFromWO.js
 */
////////////////Function Description//////////////////
// #1 ���ϵ�ҳ�����ǰ
// #1.1 ������½�ģʽ(type=CREATE),�ж��Ƿ�ӹ����Զ�����
//		if true, �ù������ݳ�ʼ����ֵ���ϵ�
//		if false, �ֹ���д��ֵ
// #1.2 ����ǲ鿴ģʽ(type=VIEW),�жϹ���״̬status
//		if status = '����׼', ҳ�����'��ӡ���ϵ�'��ť
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
                        //��ʼ����ֵmaster
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
                            '�����Թ���:' + rec.getText({
                                fieldId : 'name'
                            }));

                        //��ʼ����ֵ��ϸ��
                        //sublistidΪrecmach+�Ӽ�¼����Ϊ���������¼���ֶ�ID
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
                        details : '��ֵ�ɹ���woid = ' + woid + ', warehouse = '
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
                    if (status == '����׼') {
                        form.clientScriptModulePath = './PrintMAO.js';
                        form.addButton({
                            id : 'custpage_print_mao',
                            label : '��ӡ���ϵ�',
                            functionName : 'yk_print_mao'
                        });

                        log.debug({
                            title : 'Success',
                            details : '���-��ӡ���ϵ�-��ť�ɹ���'
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
