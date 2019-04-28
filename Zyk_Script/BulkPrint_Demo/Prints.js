/**
 * @NApiVersion 2.x
 * @author
 * Prints.js
 */
define(['N/url', 'N/currentRecord'], function (url, curR) {
    return {
        printTwo: function () {
            try {
                // var matId = curR.get().id;
                var uS = url.resolveScript({
                    scriptId: 'customscript_cs_prints_yk',
                    deploymentId: 'customdeploy_cs_prints_yk',
                    returnExternalUrl: false
                });
                // uS = uS + "&matId=" + matId;
                log.debug({
                    title: 'Success',
                    details: 'URL创建成功'
                })
            } catch (e) {
                log.debug({
                    title: e.name,
                    details: e.message
                })
            }
            window.open(uS);
        }
    }
});