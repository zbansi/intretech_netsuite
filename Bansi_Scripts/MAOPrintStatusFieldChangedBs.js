/**
 * @NApiVersion 2.x
 * @NScriptType clientScript
 * @author YQ12681 Bansi
 * 
 * ####################Description###################
 * # 												#
 * # 当领料单批量打印页面字段'状态'变更时，为url添加参数	#
 * #												#
 * ##################################################
 */

define([ 'N/error' ], function(error) {
	var statusValue;
	function fieldChanged(context) {
		try {
			if (context.fieldId == 'custpage_status_bs') {
				var url = window.location.href;
				// 检查url中是否包含&status=参数,如果不存在添加key-value,如果存在替换值
				var words = url.split('?');
				var domain = words[0];
				var oldParamsArray = urlToParameters(url);
				var newParam = [];
				newParam.push("status");
				statusValue = context.currentRecord.getValue({
					fieldId : 'custpage_status_bs'
				});
				newParam.push(statusValue);
				var currentParamsArray = updateParameters(oldParamsArray,
						newParam);
				var newUrl = paramsArrayToURL(domain, currentParamsArray);

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

	function urlToParameters(url) {
		var words = url.split('?');
		var paramArray2 = [];
		if (words.length > 0) {
			var paramStr = words[1];
			var paramArray = paramStr.split('&');

			for (var i = 0; i < paramArray.length; i++) {
				paramArray2.push(paramArray[i].split('='));
			}

		} else {
		}
		;
		return paramArray2;
	}

	function updateParameters(oldParmasArray, newParam) {
		var count = 0;
		for (var i = 0; i < oldParmasArray.length; i++) {
			if (oldParmasArray[i][0] == newParam[0]) {
				oldParmasArray[i][1] = newParam[1];
				count++;
			}
		}
		if (count == 0)
			oldParmasArray.push(newParam);
		return oldParmasArray;
	}

	function paramsArrayToURL(domain, paramsArray) {
		var url = '';
		for (var i = 0; i < paramsArray.length; i++) {
			if (i < paramsArray.length - 1)
				url += paramsArray[i][0] + '=' + paramsArray[i][1] + '&';
			else
				url += paramsArray[i][0] + '=' + paramsArray[i][1];
		}
		return domain + '?' + url;
	}

	/*function pageInit(context) {
		// 重定向后,选择状态值不变
		context.currentRecord.setValue({
			fieldId : 'custpage_status_bs',
			value : statusValue
		});
	}
	*/

	return {
		fieldChanged : fieldChanged
	//,pageInit : pageInit
	};
});