//  main.js

/*require.config({

	shim : {

		'app' : { // 这个键名为要载入的目标文件的文件名，不能随便命名。
			exports : 'sayHello' // exports的值为app.js提供的 对外接口的名称
		}
	}

});

require([ 'app' ],*/ function diss(paa) {
	alert("Hi, " + paa);
}
//);

document.getElementById("abc").innerHTML = diss("Bansi!");