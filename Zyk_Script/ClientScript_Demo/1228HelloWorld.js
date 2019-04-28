/**
 * @NApiVersion 2.0
 * @NScriptType ClientScript
 */
define(["N/ui/dialog"], function (models) {
    function helloWorld() {
        var str = {
            title: "Hello",
            message: 'Good Bye!'
        };
        try {
            models.alert(str);
            log.debug({
                title: 'Success',
                details: 'Alert displayed successfully'
            })
        } catch (e) {
            log.error({
                title: e.name,
                details: e.message
            })
        }

    }

    return {
        pageInit: helloWorld
    }
});
