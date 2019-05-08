/**
 * @NApiVersion 2.x
 * @author
 * PrintMatOrder.js
 */
define(['N/url', 'N/currentRecord'], function (url, curR) {
    return {
        printOne: function () {
            try {
                var matId = curR.get().id;
                var uS = url.resolveScript({
                    scriptId: 'customscript95',
                    deploymentId: 'customdeploy1',
                    returnExternalUrl: false
                });
                uS = uS + "&matId=" + matId;
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