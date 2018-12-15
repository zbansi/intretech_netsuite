/**
 * @NApiVersion 2.x
 * @NScriptType ClientScript
 * @author YQ12681 Bansi ZHU Description 获取字段id
 */

define([ 'N/error' ], function(e) {
	function pageInit(type) {
		try {
			alert('页面初始化');
			log.debug({
				title : 'Success',
				details : '警告弹出正常'
			});
		} catch (ex) {//建议，生成手工日志（可删除）
			log.error({
				title : ex.name,
				details : ex.message
			});
		}
	}

	function fieldChanged(type, name, linenum) {

		try {
			alert(type);
			alert(name);
			alert(linenum);
			log.debug({
				title : 'Success',
				details : '字段值获取弹出警告提示正常'
			});
		} catch (e2) {//不建议，此方法是生成系统日志（不能删除）
			throw e.create({
				name : 'BANSI_FIELDCHANGED_TEST',
				message : '字段值获取弹出警告提示失败'
			});
		}
	}

	return {
		pageInit : pageInit,
		fieldChanged : fieldChanged
	};
});
