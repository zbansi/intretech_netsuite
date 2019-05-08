/**
 * @NApiVersion 2.0
 */
define(['N/currentRecord'], function(currentRecord) {
    return({
        test_set_getValue: function() {
            var record = currentRecord.get();
            record.setValue({
                fieldId: 'custpage_textfield',
                value: 'Body value',
                ignoreFieldChange: true,
                fireSlavingSync: true
            });
            var actValue = record.getValue({
                fieldId: 'custpage_textfield'
            });
            record.setValue({
                fieldId: 'custpage_resultfield',
                value: actValue,
                ignoreFieldChange: true,
                fireSlavingSync: true
            });
        },

        test_set_getCurrentSublistValue: function() {
            var record = currentRecord.get();
            record.setCurrentSublistValue({
                sublistId: 'itemvendor',
                fieldId: 'custpage_subtextfield',
                value: 'Sublist Value',
                ignoreFieldChange: true,
                fireSlavingSync: true
            });
            var actValue = record.getCurrentSublistValue({
                sublistId: 'itemvendor',
                fieldId: 'custpage_subtextfield'
            });
            record.setValue({
                fieldId: 'custpage_sublist_resultfield',
                value: actValue,
                ignoreFieldChange: true,
                fireSlavingSync: true
            });
        },
    });
});