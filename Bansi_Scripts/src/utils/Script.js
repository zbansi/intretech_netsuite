
/*
 * 将一个类数组字符串转换成数组，比如"['a','b','c']"=>['a','b','c'] 
 */
function stringToArray(arrayStr) {
	var filterListStr="";
	var filterRegExp = /\b.+\b/;
	var fenceRegExp1 = /(\],)+|(,\[)+/;
	var fenceRegExp2 = /,/;
	try {
		
		//去除空格和引号
		 filterListStr = filterListStr.replace(
				/[""''\s]/g, '');
		//去除首尾方括号 将字符串转换成单个元素数组
		var filterList = filterRegExp.exec(filterListStr);//返回数组
		log.debug({
			title : 'filterRegExp.exec',
			details : filterList
		});

		//以右方括号逗号|逗号左方括号为分隔符，将原数组元素映射转换成多个元素一维数组
		filterList = filterList[0].map(function(f) {//f是字符串
			return f.split(fenceRegExp1);
		});
		log.debug({
			title : 'filterList.map1',
			details : filterList
		});
		//过滤掉数组中的"","],",",[",","
		filterList = filterList[0].filter(function(e) {
			if (e != "" && e != "]," && e != ",[" && e != ",")
				return e;
		});
		log.debug({
			title : 'filterList filter',
			details : filterList
		});
		//将一维数组中的偶数索引的元素按逗号分隔映射转换成数组
		filterList = filterList.map(function(f) {//f是数组
			if (filterList.indexOf(f) % 2)
				return f;
			else
				return f.split(fenceRegExp2);
		});
		log.debug({
			title : 'filterList.map2',
			details : filterList
		});

	
}