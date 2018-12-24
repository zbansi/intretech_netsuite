/**
 * @NApiVersion 2.0
 * @NScriptType UserEventScript
 * @NModuleScope SameAccount
 */
define([], function() {
	return {
		beforeLoad : function(params) {
			var form = params.form;
			var textfield = form.addField({
				id : 'custpage_textfield',
				type : 'text',
				label : 'Text'
			});
			var resultfield = form.addField({
				id : 'custpage_resultfield',
				type : 'text',
				label : 'Result'
			});
			var sublistResultfield = form.addField({
				id : 'custpage_sublist_resultfield',
				type : 'text',
				label : 'Sublist Result Field'
			});
			var sublistObj = form.getSublist({
				id : 'itemvendor'
			});
			var subtextfield = sublistObj.addField({
				id : 'custpage_subtextfield',
				type : 'text',
				label : 'Sublist Text Field'
			});
			form.clientScriptModulePath = './clientDemo.js';
			form.addButton({
				id : 'custpage_custombutton',
				label : 'SET_GET_VALUE',
				functionName : 'test_set_getValue'
			});
			form.addButton({
				id : 'custpage_custombutton2',
				label : 'SET_GETCURRENTSUBLISTVALUE',
				functionName : 'test_set_getCurrentSublistValue'
			});
		}
	}
});