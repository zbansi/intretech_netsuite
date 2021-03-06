/**
 * @NApiVersion 2.x
 * @NScriptType Suitelet
 * @author
 * PrintMAOSuitelet.js
 */
////////////////////Description////////////////////
//
//此Suitelet接收请求参数领料单Id(maoId)
//并输出PDF预览响应
//
//////////////////////////////////////////////////
define(
    ['N/record', 'N/render'],
    function (record, render) {
        function onRequest(params) {
            //解析url参数 maoid
            var matId = params.request.parameters.matId;

            //加载领料申请记录
            var rec = record.load({
                type: 'customrecord_apply_stores_yk',
                id: matId
            });
            var maoNumber = rec.getText('name');

            //xml定义打印模板
            var xmlStr = '';
            xmlStr += '<?xml version="1.0"?><!DOCTYPE pdf PUBLIC "-//big.faceless.org//report" "report-1.1.dtd"><pdf><head></head>';
            xmlStr += '<body padding="0.5in 0.5in 0.5in 0.5in" size="Letter">';
            xmlStr += '<table style="width: 100%; font-size: 10pt;"><tr>';
            xmlStr += '<td>' + maoNumber + '</td></tr>';
            xmlStr += '</table></body>';
            xmlStr += '</pdf>';

            //xml转成pdf文件
            var pdfFile = render.xmlToPdf({
                xmlString: xmlStr
            });

            //输出文件
            params.response.writeFile({
                file: pdfFile,
                isInline: true
            });

        }

        return {
            onRequest: onRequest
        };
    });
