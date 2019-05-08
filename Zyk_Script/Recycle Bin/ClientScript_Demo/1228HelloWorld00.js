/**
 * @NApiVersion 2.0
 * @NScriptType ClientScript
 */
define(['N/ui/dialog', 'N/format'], function (da, format) {
    function helloWorld(context) {
        try {
            function dateRep(x) {
               return x.replace('��','-').replace('��','-').replace('��','')
            }
            var dateStr = dateRep('2018��2��22��') ;
            var dateEnd = dateRep('2019��4��1��');

            var d1=new Date(Date.parse(dateStr)),
                d2=new Date(Date.parse(dateEnd));

            if (d1<d2){
                var s = '����'
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
