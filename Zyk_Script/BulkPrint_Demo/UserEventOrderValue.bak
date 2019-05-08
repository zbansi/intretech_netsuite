/**
 * @NApiVersion 2.0
 * @NScriptType ClientScript
 */
define(['N/record','N/url','N/ui/dialog'],function (record,urls,dialog) {
    function fieldChange(context) {
        if (context.fieldId == 'custpage_name_select_bp_yk') {
            var output = urls.format({
                domain: 'http://fruitland.com',
                params: {
                    fruit: 'grape',
                    seedless: true,
                    variety: 'Concord Giant',
                    PLU: 4272
                }
            });

            dialog.alert({
                title: 'URL',
                message: output.toString()
            })
        }else {
            return true
        }
    }
    return{
        fieldChanged: fieldChange
    }
});