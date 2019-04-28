/**
 * @NApiVersion 2.x
 * @NScriptType ClientScript
 * @NAmdConfig  ./jqueryConfig.json
 */
define(['N/record', 'N/search','jquery'], function (record, search,$) {
    function fieldChanged(context) {
        if (context.fieldId == 'custpage_name_select_bp_yk') {

        }

    }

    return {
        fieldChanged: fieldChanged
    }
});