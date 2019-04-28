/**
 * @NApiVersion 2.0
 * @NScriptType ClientScript
 */
////////////////////////Description///////////////////////
// ������׼�����ϵ����޸�����������ɾ������
// ������״̬�ĳɡ�Ҫ������������
// �������뵥��customrecord_apply_stores_yk
// ����״̬��custrecord_apply_approve_status_yk
/////////////////////////////////////////////////////////

define(["N/record"], function (rec) {
    function mySublistChanged(context) {
        var statusId = context.currentRecord.getValue({
            fieldId: 'custrecord_apply_approve_status_yk'
        });
        if (statusId == 3) {
            context.currentRecord.setValue('custrecord_apply_approve_status_yk', 5)
        }
    }
    return {
        sublistChanged: mySublistChanged,
    }
});