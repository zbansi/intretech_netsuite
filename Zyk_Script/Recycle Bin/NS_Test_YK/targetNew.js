/**
 * @NApiVersion 2.x
 * @NScriptType ClientScript
 */

define(["N/record"],
    function (cur) {
        function pageInit(context) {
            var tarId = document.getElementById('ns_navigation');
            tarId.addEventListener('mouseover', function () {
                aTag = tarId.querySelectorAll('ul a');
                for (var i=0;i<aTag.length;i++) {
                    aTag[i].setAttribute('target','_blank')
                }
            });

            window.onerror = function () {
                return true;
            };

            try {
                log.debug({
                    title: 'Success',
                    details: '成功获取'+aTag
                })
            } catch (e) {
                log.debug({
                    title: e.name + '@错误',
                    details: e.message
                })
            }
        }

        return {
            pageInit: pageInit,
        }
    });