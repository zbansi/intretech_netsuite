/**
 * @NApiVersion 2.x
 * @NScriptType ClientScript
 * @author YQ12681 Bansi
 */
////////////////////Description//////////////////////
//												
// #1 当领料单批量打印页面字段'状态'变更时，为url添加参数
//
////////////////////////////////////////////////////
define([ 'N/error', 'N/currentRecord', 'N/https', './urlUpdate' ], function(
		error, currentRecord, https, urlUpdate) {
	var statusValue = currentRecord.get().getValue({
		fieldId : 'custpage_status_bs'
	});
	function fieldChanged(context) {
		try {
			if (context.fieldId == 'custpage_status_bs') {
				var url = window.location.href;
				// 检查url中是否包含&status=参数,如果不存在添加key-value,如果存在替换值
				var words = url.split('?');
				var baseUrl = words[0];
				var oldParamsArray = urlUpdate.urlToParameters(url);
				var newParam = [];
				newParam.push("status");
				statusValue = context.currentRecord.getValue({
					fieldId : 'custpage_status_bs'
				});
				newParam.push(statusValue);
				var currentParamsArray = urlUpdate.updateParameters(
						oldParamsArray, newParam);
				var newUrl = urlUpdate.paramsArrayToURL(baseUrl,
						currentParamsArray);

				window.location.href = newUrl;

				log.debug({
					title : 'Success',
					details : 'url重定向成功' + context.fieldId
				});
			}
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