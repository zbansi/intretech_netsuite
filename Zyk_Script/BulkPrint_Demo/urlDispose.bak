/**
 * @NApiVersion 2.0
 * @NScriptType ClientScript
 */
define(['N/record', 'N/url', './ulrFunction', 'N/ui/dialog'], function (record, url, uft, ds) {
    function fieldChange(context) {
        if (context.fieldId == 'custpage_name_select_bp_yk' ||
            context.fieldId == 'custpage_i_date_bp_yk' ||
            context.fieldId == 'custpage_p_date_bp_yk') {
            var urls = window.location.href,
                urlHeader = (urls.split('?'))[0],
                urlArr = uft.disposeToURL(urls),
                newValue = context.currentRecord.getValue({fieldId: 'custpage_name_select_bp_yk'}),

                timeAText = context.currentRecord.getValue({fieldId: 'custpage_i_date_bp_yk'}),
                timeBText = context.currentRecord.getValue({fieldId: 'custpage_p_date_bp_yk'}),
                timeA = 0, timeB = 0;

            // 1.测试时间获取Value

            var sd = new Date(timeAText);
            ds.alert({
                title: 'www',
                message: sd.getFullYear()
            });

            // 将年月日转换成DATE值
            function strToDate(str) {
                return Date.parse(
                    str.replace('年', '-').replace('月', '-').replace('日', '')
                )
            }

            // if (timeAText) {
            //     timeA = new Date(strToDate(timeAText))
            // }
            // if (timeBText) {
            //     timeB = new Date(strToDate(timeBText))
            // }

            //URL解析
            var newPar = [['name', newValue], ['startTime', timeA], ['endTime', timeB]],
                newUrl = uft.newParToURL(urlArr, newPar);

            if (timeA && timeB) {
                if (timeA > timeB) {
                    ds.alert({title: 'ERROR', message: '结束日期不能小于开始日期'}).then(function () {
                            // context.currentRecord.setText({fieldId: 'custpage_p_date_bp_yk', text: timeAText})
                        }
                    );
                } else {
                    window.location.href = uft.newURL(urlHeader, newUrl);
                }
            } else if (!timeA || !timeB) {

            } else {
                window.location.href = uft.newURL(urlHeader, newUrl)
            }

        } else {
            return true
        }
    }

    return {
        fieldChanged: fieldChange
    }
});