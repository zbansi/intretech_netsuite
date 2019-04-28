/**
 * @NApiVersion 2.0
 * @NScriptType ClientScript
 */
define(['N/ui/dialog', 'N/format'], function (da, format) {
    function helloWorld(context) {
        try {
            function dateRep(x) {
               return x.replace('年','-').replace('月','-').replace('日','')
            }
            var dateStr = dateRep('2018年2月22日') ;
            var dateEnd = dateRep('2019年4月1日');

            var d1=new Date(Date.parse(dateStr)),
                d2=new Date(Date.parse(dateEnd));

            if (d1<d2){
                var s = '大于'
            }
            log.debug({
                title: 'Success',
                details: s+'***'+d1+'***'+d2
            })
        } catch (e) {
            log.debug({
                title: e.name,
                details: e.message
            })
        }
    }

    return {
        pageInit: helloWorld
    }
});
