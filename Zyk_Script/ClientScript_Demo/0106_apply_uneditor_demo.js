/**
 * @NApiVersion 2.0
 * @NScriptType ClientScript
 */
////////////////////////Description///////////////////////
// 当已批准的领料单据修改领料数量、删除物料
// 则审批状态改成“要求重新审批”
// 领料申请单：customrecord_apply_stores_yk
// 审批状态：custrecord_apply_approve_status_yk
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