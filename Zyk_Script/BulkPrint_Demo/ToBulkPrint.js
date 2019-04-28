/**
 * @NApiVersion 2.x
 * @NScriptType UserEventScript
 * @author
 */
define([],function () {
    function beforeLoad(context) {
        context.form.clientScriptModulePath = './Prints';
        context.form.addButton({
            id: 'custpage_btn_bulk_prints_yk',
            label: '打印领料单',
            functionName: 'printTwo'
        })
    }
    return{
        beforeLoad: beforeLoad
    }
});