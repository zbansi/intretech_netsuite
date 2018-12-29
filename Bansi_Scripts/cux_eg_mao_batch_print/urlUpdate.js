/**
 * urlUpdate.js
 * 
 * @NApiVersion 2.x
 * @NModuleScope Public
 * @author YQ12681 Bansi
 */
define(function() {
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

	function paramsArrayToURL(baseUrl, paramsArray) {
		var url = '';
		for (var i = 0; i < paramsArray.length; i++) {
			if (i < paramsArray.length - 1)
				url += paramsArray[i][0] + '=' + paramsArray[i][1] + '&';
			else
				url += paramsArray[i][0] + '=' + paramsArray[i][1];
		}
		return baseUrl + '?' + url;
	}

	return {
		urlToParameters : urlToParameters,
		updateParameters : updateParameters,
		paramsArrayToURL : paramsArrayToURL
	};
});
