/**
 * @NApiVersion 2.x
 * @NScriptType UserEventScript
 * @NModuleScope SameAccount
 * @author
 */
////////////////Function Description//////////////////
// #1 ����ҳ�����ǰ
// #1.1 ������½�ģʽ(type=CREATE), ʲôҲ����
// #1.2 ����ǲ鿴ģʽ(type=VIEW),�жϹ���״̬status
//		if status = 'APPROVED', ҳ�����'�������ϵ�'��ť
//////////////////////////////////////////////////////
define([], function() {
    function beforeLoad(context) {
        // context. newRecord,type,form,request
        if (context.type === context.UserEventType.CREATE)
            ;
        /*context.newRecord.setValue({
            fieldId : 'custrecord_yq_workorder_status_bs',
            value : 1
        });

        * CREATE type�²�����getText����Ҫ��setValue��setText
        * ����ᱨ�� SuiteScript 2.0 Error > SSS_INVALID_API_USAGE error
        *
        * Cause: In Standard Mode, SSS_INVALID_API_USAGE error appears when a
        * user event scripts instantiates records by using the newRecord object
        * provided by the script context in the following scenaros: -- When the
        * script executes on a record that is being created, and the script
        * attempts to use Record.getText(options) without first using
        * Record.setText(options) for the same field. -- When the script
        * executes on an existing record or on a record being created through
        * copying, and the script uses Record.setValue(options) on a field
        * before using Record.getText(options) for the same field
        */
        else if (context.type === context.UserEventType.VIEW) {
            var status = context.newRecord.getText({
                fieldId : 'custrecordcustrecord_status_yk'
            });

            // �������״̬����������<�������ϵ�>��ť
            try {
                if (status === '����׼') {

                    context.form.clientScriptModulePath = './CreateMAOZyk.js';
                    context.form.addButton({
                        id : 'custpage_generate_mao',
                        label : '�������ϵ�',
                        functionName : 'create_mao_url'
                    });
                }
                log.debug({
                    title : 'Success',
                    details : '���-�������ϵ�-��ť�ɹ��� status = ' + status
                });
            } catch (ex) {
                log.debug({
                    title : ex.name,
                    details : ex.message
                });
            }
        }
    }

    return {
        beforeLoad : beforeLoad
    };
});
