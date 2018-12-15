/**
 * @NApiVersion 2.x
 * @NScriptType clientScript
 * @author YQ12681 Bansi Description 当领料单打印页面字段'状态'变更时，为url添加参数
 */

define([ 'N/currentRecord' ], function(cr) {
	function fieldChanged(type, name, linenum) {
		try {
			if (name == 'custpage_status_bs') {
				var url = window.location.href;
				url += '&status=' + cr.get().getValue({
					fieldId : 'custpage_status_bs'
				});
				window.location.href = url;
			}
			log.debug({
				title : 'Success',
				details : 'url重定向成功'
			})
		} catch (ex) {
			log.debug({
				title : ex.name,
				details : ex.message
			})
		}
	}
	return {
		fieldChanged : fieldChanged
	};
});