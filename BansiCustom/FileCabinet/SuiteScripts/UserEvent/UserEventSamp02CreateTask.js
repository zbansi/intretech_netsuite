/**
 * Module Description
 * 
 * Version    Date            Author           Remarks
 * 1.00       05 Nov 2018     Bansi            Create
 *
 */
/**
 * @NApiVersion 2.x
 * @NScriptType UserEventScript
 * @NModuleScope SameAccount
 */

// Load two Standard modules.
define([ 'N/record', 'N/ui/serverWidget' ],

// Add the callback function.
function(record, serverWidget) {

	/**
	 * Function definition to be triggered before record is loaded.
	 * 
	 * @param {Object}
	 *            scriptContext
	 * @param {Record}
	 *            scriptContext.newRecord - New record
	 * @param {string}
	 *            scriptContext.type - Trigger type
	 * @param {Form}
	 *            scriptContext.form - Current form
	 * @Since 2015.2
	 */
	// In the beforeLoad function, disable the Notes filed.
	function beforeLoad(scriptContext) {
		if (scriptContext.type !== scriptContext.UserEventType.CREATE)
			return;

		var form = scriptContext.form;

		var notesField = form.getField({
			id : 'comments'
		});
		notesField.updateDisplayType({
			displayType : serverWidget.FieldDisplayType.DISABLED
		});
	}

	/**
	 * Function definition to be triggered before record is loaded.
	 * 
	 * @param {Object}
	 *            scriptContext
	 * @param {Record}
	 *            scriptContext.newRecord - New record
	 * @param {Record}
	 *            scriptContext.oldRecord - Old record
	 * @param {string}
	 *            scriptContext.type - Trigger type
	 * @Since 2015.2
	 */
	// In the beforeSubmit function, add test to the Notes field.
	function beforeSubmit(scriptContext) {
		if (scriptContext.type !== scriptContext.UserEventType.CREATE)
			return;
		var newEmployeeRecord = scriptContext.newRecord;

		newEmployeeRecord.setValue({
			fieldId : 'comments',
			value : 'Orientation date  TBD.'
		});

	}

	/**
	 * Function definition to be triggered before record is loaded.
	 * 
	 * @param {Object}
	 *            scriptContext
	 * @param {Record}
	 *            scriptContext.newRecord - New record
	 * @param {Record}
	 *            scriptContext.oldRecord - Old record
	 * @param {string}
	 *            scriptContext.type - Trigger type
	 * @Since 2015.2
	 */
	// In the afterSubmit function, begin creating a task record.
	function afterSubmit(scriptContext) {
		if (scriptContext.type !== scriptContext.UserEventType.CREATE)
			return;

		var newEmployeeRecord = scriptContext.newRecord;
		var newEmployeeFirstName = newEmployeeRecord.getValue({
			fieldId : 'firstname'
		});
		var newEmployeeLastName = newEmployeeRecord.getValue({
			fieldId : 'lastname'
		});
		var newEmployeeSupervisor = newEmployeeRecord.getValue({
			fieldId : 'supervisor'
		});
		if (newEmployeeSupervisor) {
			var newTask = record.create({
				type : record.Type.TASK,
				isDynamic : true
			});
			newTask.setValue({
				fieldId : 'title',
				value : 'Schedule orientation session for '
						+ newEmployeeFirstName + ' ' + newEmployeeLastName
			});
			newTask.setValue({
				fieldId : 'assigned',
				value : newEmployeeSupervisor
			});
			try {
				var newTaskId = newTask.save();
				log.debug({
					title : 'Task record created successfully',
					details : 'New task record ID: ' + newTaskId
				});
			} catch (e) {
				log.error({
					title : e.name,
					details : e.message
				});
			}
		}
	}

	return {
		beforeLoad : beforeLoad,
		beforeSubmit : beforeSubmit,
		afterSubmit : afterSubmit
	};

});
