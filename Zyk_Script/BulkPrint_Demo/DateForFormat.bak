/**
 *@NApiVersion 2.x
 *@NScriptType ClientScript
 */
define(['N/query'], function (query) {
    function dateTest() {
        try {
            var myRelativeDate = query.createRelativeDate({
                dateId: query.DateId.WEEKS_AGO,
                value: 2
            });

            var theValue = myRelativeDate.value;

            log.debug({
                title: 'Success',
                details: '***' + theValue
            })
        } catch (e) {
            log.debug({
                title: e.name,
                details: e.message
            })
        }
    }

    return {
        pageInit: dateTest
    }
});