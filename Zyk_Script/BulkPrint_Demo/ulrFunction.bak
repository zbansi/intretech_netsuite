/**
 * ulrFunction.js
 * @NApiVersion 2.0
 * @NModuleScope Public
 */

define([], function () {
    function disposeToURL(url) {
        var urlArr = url.split('?');
        var parameStr = urlArr[1].split('&');
        var parameArr = [];
        for (var i = 0; i < parameStr.length; i++) {
            parameArr.push(parameStr[i].split('='))
        }
        return parameArr;
    }

    function newParToURL(parmameArr, newParames) {
        var n = 0;
        for (var i = 0; i < parmameArr.length; i++) {
            for (var j = 0; j < newParames.length; j++) {
                if (parmameArr[i][0] == newParames[j][0]) {
                    parmameArr[i][1] = newParames[j][1];
                    n = 1;
                }
            }
        }
        if (n == 0) {
            for (var z = 0; z < newParames.length; z++) {
                parmameArr.push(newParames[z])
            }
        }
        return parmameArr;
    }

    function newURL(urlHeader, parameArr) {
        var urlPar = '';
        for (var i = 0; i < parameArr.length; i++) {
            if (i < parameArr.length - 1) {
                urlPar += (parameArr[i][0] + '=' + parameArr[i][1] + '&')
            } else {
                urlPar += (parameArr[i][0] + '=' + parameArr[i][1])
            }
        }
        var newURL = urlHeader + '?' + urlPar;
        return newURL
    }

    return {
        disposeToURL: disposeToURL,
        newParToURL: newParToURL,
        newURL: newURL
    }

});