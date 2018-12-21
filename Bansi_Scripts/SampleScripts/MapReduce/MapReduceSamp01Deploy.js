/**
 * @NApiVersion 2.x
 * @NScriptType MapReduceScript
 * @NModuleScope SameAccount
 */

require([ 'N/task', 'N/runtime', 'N/email' ], function(task, runtime, email) {
	function submitMapReduceDeployment() {
		// Update the following statement so it uses the script ID
		// of the map/reduce script record you want to submit.
		var mapReduceScriptId = 'customscript_mapreducesamp01';//'customscript_test_mapreduce_script' MapReduceSamp01.js
		log.audit('mapreduce id: ', mapReduceScriptId);
		// The following statement creates a map/reduce task. Update the
		// the deploymentId parameter to use the script ID of the deployment
		// record
		// for your map/reduce script.
		var mrTask = task.create({
			taskType : task.TaskType.MAP_REDUCE,
			scriptId : mapReduceScriptId,
			deploymentId : 'customdeploy_mapreducesamp01'
		});
		// The following statement submits the map/reduce task.
		var mrTaskId = mrTask.submit();
		// The following code checks the task's status. Update the authorId
		// value
		// with the internal ID of the user who is the email sender. Update the
		// the recipientEmail value with the appropriate email addresss.
		var taskStatus = task.checkStatus(mrTaskId);
		if (taskStatus.status === 'FAILED') {
			var authorId = -5;
			var recipientEmail = '377132229@qq.com';
			email.send({
				author : authorId,
				recipients : recipientEmail,
				subject : 'Failure executing map/reduce job!',
				body : 'Map reduce task: ' + mapReduceScriptId + ' has failed.'
			});
		}
	}
	submitMapReduceDeployment();
});