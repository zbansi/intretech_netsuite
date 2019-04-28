/**
 * @NApiVersion 2.x
 * @NScriptType UserEventScript
 */
define([], function () {
    function beforeLoad(context) {
        if (context.type === context.UserEventType.CREATE) ;
        else if (context.type === context.UserEventType.VIEW) {
            var status = context.newRecord.getValue({
                fieldId: 'custrecordcustrecord_status_yk'
            });
            try {
                if (status == 3) {
                    context.form.clientScriptModulePath = './AddOrderToDetailBtn';
                    context.form.addButton({
                        id: 'custpage_btnApp_yk',
                        label: '������������',
                        functionName: 'OrderToDetail'
                    });
                }
                log.debug({
                    title: 'Success',
                    details: 'OOK��ť'
                })
            } catch (e) {
                log.debug({
                    title: e.name,
                    details: e.message
                })
            }

        }

    }

    return {
        beforeLoad: beforeLoad,
    }
});