/**
 * @NApiVersion 2.x
 * @NScriptType Suitelet
 * @author
 * PrintMAOSuitelet.js
 */
////////////////////Description////////////////////
//
//��Suitelet��������������ϵ�Id(maoId)
//�����PDFԤ����Ӧ
//
//////////////////////////////////////////////////
define(
    ['N/record', 'N/render'],
    function (record, render) {
        function onRequest(params) {
            //����url���� maoid
            var maosId = params.request.parameters.maosid;

            //�������������¼
            var rec = record.load({
                type: 'customrecord_apply_stores_yk',
                id: maosId
            });
            var maoNumber = rec.getText('name');

            //xml�����ӡģ��
            var xmlStr = '';
            xmlStr += '<?xml version="1.0"?><!DOCTYPE pdf PUBLIC "-//big.faceless.org//report" "report-1.1.dtd"><pdf><head></head>';
            xmlStr += '<body padding="0.5in 0.5in 0.5in 0.5in" size="Letter">';
            xmlStr += '<table style="width: 100%; font-size: 10pt;"><tr>';
            xmlStr += '<td>' + maoNumber + '</td></tr>';
            xmlStr += '</table></body>';
            xmlStr += '</pdf>';

            //xmlת��pdf�ļ�
            var pdfFile = render.xmlToPdf({
                xmlString: xmlStr
            });

            //����ļ�
            params.response.writeFile({
                file: pdfFile,
                isInline: true
            });

        }

        return {
            onRequest: onRequest
        };
    });
