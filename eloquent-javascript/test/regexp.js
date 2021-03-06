/**
 * 
 */

var filterListStr = "[[[[[[\"a1\"],['b10','b11','b12']],'ABCD','EFG',['c10','c11']],['d1']],['e1']],'HIJ',['f2'],[[[[[\"a3\"],['b3']],['c3']],['d3']],['e3']],['f4'],[aa,[bb,[cc,[dd,[ee,[ff]]]]]],[aaa,[bbb,[ccc,[ddd,[eee,[fff]]]]]]]";
var S2 = "[aa,[bb,[cc,[dd,[ee,[ff]]]]]]"
var S = "[[a,b,c],or,[c,d,f],and,[[1,2,3],[4,5,6]]]";
var filterRegExp = /\b.+\b/;
var squareBracket6 = /(,\[{6})|(]{6},)/;
var squareBracket5 = /(,\[{5})|(]{5},)/;
var squareBracket4 = /(,\[{4})|(]{4},)/;
var squareBracket3 = /(,\[{3})|(]{3},)/;
var squareBracket2 = /(,\[{2})|(]{2},)/;
var squareBracket1 = /(,\[{1})|(]{1},)/;

var leftSquareBracket1Str = ",[";
var leftSquareBracket2Str = ",[[";
var leftSquareBracket3Str = ",[[[";
var leftSquareBracket4Str = ",[[[[";
var leftSquareBracket5Str = ",[[[[[";
var leftSquareBracket6Str = ",[[[[[[";
var rightSquareBracket1Str = "],";
var rightSquareBracket2Str = "]],";
var rightSquareBracket3Str = "]]],";
var rightSquareBracket4Str = "]]]],";
var rightSquareBracket5Str = "]]]]],";
var rightSquareBracket6Str = "]]]]]],";

var fenceRegExp1 = /(\],)+|(,\[)+/;
var fenceRegExp2 = /,/;

//去除空格和引号
filterListStr = filterListStr.replace(/[\"\'\s]/g, '');
console.log("replace result: " + filterListStr);
//去除首尾方括号 将字符串转换成单个元素数组
var filterList = filterRegExp.exec(filterListStr);//返回数组

console.log("regexp result: " + filterList + "end");
console.log("regexp result: " + filterList[0] + "end");

//以右方括号逗号|逗号左方括号为分隔符，将原数组元素映射转换成多个元素一维数组
filterList = filterList.map(function(f) {//f是字符串
	return f.split(squareBracket6).filter(
			function(e) {//过滤掉数组中的"","],",",[",","
				if (e != "" && e != "]," && e != ",[" && e != ","
						&& e != leftSquareBracket6Str
						&& e != rightSquareBracket6Str)
					return e;
			});
});
filterList[0].forEach(function(e) {
	console.log("squareBracket6 map result: " + e + "\n" + "end");
});

filterList = filterList.map(function(f) {//f是字符串
	return f.map(function(ee) {
		return ee.split(squareBracket5).filter(
				function(e) {//过滤掉数组中的"","],",",[",","
					if (e != "" && e != "]," && e != ",[" && e != ","
							&& e != leftSquareBracket5Str
							&& e != rightSquareBracket5Str)
						return e;
				});
	});
});

filterList[0].forEach(function(e) {
	e.forEach(function(ee) {
		console.log("squareBracket5 map result: " + ee + "\n" + "end");
	})
});

//4
filterList = filterList.map(function(f) {//f是字符串
	return f.map(function(eee) {
		return eee.map(function(ee) {
			return ee.split(squareBracket4).filter(
					function(e) {//过滤掉数组中的"","],",",[",","
						if (e != "" && e != "]," && e != ",[" && e != ","
								&& e != leftSquareBracket4Str
								&& e != rightSquareBracket4Str)
							return e;
					});
		});
	});
});

filterList[0].forEach(function(eee) {
	eee.forEach(function(ee) {
		ee.forEach(function(e) {
			console.log("squareBracket4 map result: " + e + "\n" + "end");
		})
	});
});

//3
filterList = filterList.map(function(f) {//f是字符串
	return f.map(function(eeee) {
		return eeee.map(function(eee) {
			return eee.map(function(ee) {
				return ee.split(squareBracket3).filter(
						function(e) {//过滤掉数组中的"","],",",[",","
							if (e != "" && e != "]," && e != ",[" && e != ","
									&& e != leftSquareBracket3Str
									&& e != rightSquareBracket3Str)
								return e;
						});
			});
		});
	});
});

filterList[0].forEach(function(eeee) {
	eeee.forEach(function(eee) {
		eee.forEach(function(ee) {
			ee.forEach(function(e) {
				console.log("squareBracket3 map result: " + e + "\n" + "end");
			})
		});
	});
});
//2
filterList = filterList.map(function(f) {//f是字符串
	return f.map(function(eeeee) {
		return eeeee.map(function(eeee) {
			return eeee.map(function(eee) {
				return eee.map(function(ee) {
					return ee.split(squareBracket2).filter(
							function(e) {//过滤掉数组中的"","],",",[",","
								if (e != "" && e != "]," && e != ",["
										&& e != ","
										&& e != leftSquareBracket2Str
										&& e != rightSquareBracket2Str)
									return e;
							});
				});
			});
		});
	});
});
filterList[0].forEach(function(eeeee) {
	eeeee.forEach(function(eeee) {
		eeee.forEach(function(eee) {
			eee.forEach(function(ee) {
				ee.forEach(function(e) {
					console.log("squareBracket2 map result: " + e + "\n"
							+ "end");
				})
			});
		});
	});
});

//1
filterList = filterList.map(function(f) {//f是字符串
	return f.map(function(eeeeee) {
		return eeeeee.map(function(eeeee) {
			return eeeee.map(function(eeee) {
				return eeee.map(function(eee) {
					return eee.map(function(ee) {
						return ee.split(squareBracket1).filter(
								function(e) {//过滤掉数组中的"","],",",[",","
									if (e != "" && e != "]," && e != ",["
											&& e != ","
											&& e != leftSquareBracket1Str
											&& e != rightSquareBracket1Str)
										return e;
								});
					});
				});
			});
		});
	});
});
console.log("squareBracket1 map result: " + filterList + "\n" + "end");
filterList[0].forEach(function(eeeeee) {
	eeeeee.forEach(function(eeeee) {
		eeeee.forEach(function(eeee) {
			eeee.forEach(function(eee) {
				eee.forEach(function(ee) {
					ee.forEach(function(e) {
						console.log("squareBracket1 map result: " + e + "\n"
								+ "end");
					})
				});
			});
		});
	});
});
/*
//以右方括号逗号|逗号左方括号为分隔符，将原数组元素映射转换成多个元素一维数组
filterList = filterList[0].map(function(f) {//f是字符串
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
*/