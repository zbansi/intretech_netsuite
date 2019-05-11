/**
 * utils.js
 * 
 * @NApiversion 2.x
 * @NModuleScope Public
 */

define([],

function() {

	/**
	 * filterExpressionString e.g. filterExpressionStr = "[['name','operator','value']]"
	 */
	function filterExpressionString2Array(filterExpressionStr) {

		var filterList = [];
		var filterRegExp = /.+/;
		var fenceRegExp1 = /(\],)+|(,\[)+/;
		var fenceRegExp2 = /,/;
		if (filterExpressionStr) {
			var filterListStr = filterExpressionStr.replace(/[""''\s]/g, '');
			//去除首尾方括号					
			filterListStr = filterListStr.replace(/\[{2,10}/g, '');
			filterListStr = filterListStr.replace(/\]{2,10}/g, '');

			//将字符串转换成单个元素数组
			filterList = filterRegExp.exec(filterListStr);//返回数组

			//以右方括号逗号|逗号左方括号为分隔符，将原数组元素映射转换成多个元素一维数组
			filterList = filterList.map(function(f) {//f是字符串
				return f.split(fenceRegExp1);
			});

			//过滤掉数组中的"","],",",[",","
			filterList = filterList[0].filter(function(e) {
				if (e != "" && e != "]," && e != ",[" && e != ",")
					return e;
			});

			//将一维数组中的偶数索引的元素按逗号分隔映射转换成数组
			filterList = filterList.map(function(f) {//f是数组
				if (filterList.indexOf(f) % 2)
					return f;
				else
					return f.split(fenceRegExp2);
			});
			return filterList;
		}
	}

	/*
	 * 将一个类数组字符串转换成数组，比如"['a','b','c']"=>['a','b','c'] 
	 */
	function string2Array(arrayString) {
		return eval("(" + arrayString + ")");
		//2nd method
		//		eval("var array = " + arrayString);
		//		return array;
	}

	/*
	 * 将一个JSON对象字符串转换成JSON对象，比如"{'key': 'value'}"=>{'key': 'value'}
	 */
	function string2JSONObject(JSONObjectString) {
		eval("var jsonObject = " + JSONObjectString);
		return jsonObject;
	}

	/**
	 * doValidation
	 */
	function doValidation(args, argNames, methodName) {
		for (var i = 0; i < args.length; i++)
			if (!args[i] && args[i] !== 0)
				throw error.create({
					name : 'MISSING_REQ_ARG',
					message : 'Missing a required argument: [' + argNames[i]
							+ '] for method: ' + methodName
				});
	}

	return {
		'filterExpressionString2Array' : filterExpressionString2Array,
		'string2Array' : string2Array,
		'string2JSONObject' : string2JSONObject,
		'doValidation' : doValidation
	};
});
