/**
 * @NApiVersion 2.x
 * @NScriptType UserEventScript
 * @NModuleScope SameAccount
 * @author
 */
////////////////Function Description//////////////////
// #1 工单页面加载前
// #1.1 如果是新建模式(type=CREATE), 什么也不做
// #1.2 如果是查看模式(type=VIEW),判断工单状态status
//		if status = 'APPROVED', 页面添加'生成领料单'按钮
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

        * CREATE type下不能用getText，需要先setValue或setText
        * 否则会报错： SuiteScript 2.0 Error > SSS_INVALID_API_USAGE error
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

            // 如果工单状态已审批加载<生成领料单>按钮
            try {
                if (status === '已批准') {

                    context.form.clientScriptModulePath = './CreateMAOZyk.js';
                    context.form.addButton({
                        id : 'custpage_generate_mao',
                        label : '生成领料单',
                        functionName : 'create_mao_url'
                    });
                }
                log.debug({
                    title : 'Success',
                    details : '添加-生成领料单-按钮成功！ status = ' + status
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
