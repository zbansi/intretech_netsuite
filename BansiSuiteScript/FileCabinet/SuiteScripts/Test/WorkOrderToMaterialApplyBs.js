/**
 * @NApiVersion 2.x
 * @NScriptType UserEventScript
 * @NModuleScope SameAccount
 * @author YQ12681
 */

define([], function() {
	function beforeLoad(context) {
		// context. newRecord,type,form,request
		/*
		 var status = context.form.getField({
			id : 'custrecord_yq_workorder_status_bs'
		});		
		 */

		// 如果工单状态已审批加载下推下按钮
		//status === 'APPROVED' &
		try {
			if (context.type == context.UserEventType.VIEW) {
				
				context.form.clientScriptModulePath = './CreateMAOBs.js';
				context.form.addButton({
					id : 'custpage_generate_mao',
					label : '生成领料单',
					functionName : 'create_mao_url'
				});
			}
			log.debug({
				title : 'Success',
				details : '添加-生成领料单-按钮成功！'
			});
		} catch (ex) {
			log.debug({
				title : ex.name,
				details : ex.message
			});
		}
	}

	return {
		beforeLoad : beforeLoad
	};
});