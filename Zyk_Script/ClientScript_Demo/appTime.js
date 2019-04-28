/**
 * @NApiVersion 2.0
 * @NScriptType ClientScript
 */
define(['N/record', 'N/ui/dialog'], function (record, ds) {
    function pageInit(context) {
        ds.alert({
            title: 'www',
            message: '╪сть'
        });
        var s = Date.parse('2018-12-12');
        context.currentRecord.setText({
            fieldId: 'custrecord_apply_time_yk',
            value: s
        })
    }

    return {
        pageInit: pageInit
    }
});