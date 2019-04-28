/**
 *@NApiVersion 2.x
 *@NScriptType Suitelet
 * @author
 */
define(['N/ui/serverWidget'], function (ui) {
    function onRequest(context) {
        if (context.request.method === 'GET') {
            var printPage = ui.createForm({
                title: 'YK_批量打印'
            });

            printPage.style = serverWidget.ListStyle.REPORT;
            printPage.addButton({
                id: 'curstom_btn_print_yk',
                label: '领料单批量打印',
                functionName: '#'
            });

            var newCol = printPage.addColumn({
                id: 'curstom_date_print_yk',
                type: severWidget.FielStyle.DATE,
                label: '日期',
                align: serverWidget.LayoutJustification.RIGHT
            });

            printPage.addColumn({
                id: 'curstom_product_print_yk',
                type: serverWidget.FielStyle.TEXT,
                label: '产品名称',
                align: serverWidget.LayoutJustification.RIGHT
            });
            printPage.addColumn({
                id: 'curstom_proNum_print_yk',
                type: serverWidget.FielStyle.INTEGER,
                label: '产品数量',
                align: serverWidget.LayoutJustification.RIGHT
            });

            printPage.addcolumn({
                id: 'curstom_onePri_print_yk',
                type: serverWidget.FielStyle.CURRENCY,
                label: '产品单价',
                align: serverWidget.LayoutJustification.RIGHT
            });
            printPage.addRows({
                rows: [
                    {
                        curstom_date_print_yk: '09/01/2019',curstom_product_print_yk: '好东西',
                        curstom_proNum_print_yk: '5000',curstom_onePri_print_yk: '1.00'
                    },
                ]
            });

            context.response.writePage(printPage);
        } else {

        }


    }

    return {
        onRequest: onRequest
    }
});