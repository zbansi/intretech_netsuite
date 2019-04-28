/**
 * @NApiVersion 2.x
 * @NScriptType Suitelet
 */
define(['N/ui/serverWidget', 'N/search', 'N/record', 'N/render','N/format'],
    function (serverWidget, search, record, rep,format) {
        function onRequest(context) {
            if (context.request.method === 'GET') {
                try {
                    var printPage = serverWidget.createForm({
                        title: '���ϵ�'
                    });

                    printPage.addSubmitButton({
                        label: '�ύ��ӡ'
                    });

                    // ɸѡ ������
                    var nameSelect = printPage.addField({
                        id: 'custpage_name_select_bp_yk',
                        label: '������',
                        type: serverWidget.FieldType.SELECT
                    });
                    nameSelect.addSelectOption({
                        value: 'name0',
                        text: '-ȫ��-'
                    });


                    printPage.clientScriptModulePath = './urlDispose';

                    var name = context.request.parameters.name;

                    if (name) {
                        nameSelect.defaultValue = name
                    } else {
                        nameSelect.defaultValue = 'name0';
                    }

                    // ��������Ա��
                    var matWorker = search.create({
                        type: search.Type.EMPLOYEE,
                        columns: ['entityid'],
                    }).run();
                    var w = 1;
                    matWorker.each(function (result) {
                        nameSelect.addSelectOption({
                            value: 'name' + w,
                            text: result.getValue('entityid')
                        });
                        w++;
                        return true
                    });

                    // ɸѡ ����
                    var timeInit = printPage.addField({
                        id: 'custpage_i_date_bp_yk',
                        label: '��',
                        type: serverWidget.FieldType.DATE
                    });

                    var timeEnd = printPage.addField({
                        id: 'custpage_p_date_bp_yk',
                        label: '��',
                        type: serverWidget.FieldType.DATE
                    });

                    // ���δ���ʱ��
                    var sTime =context.request.parameters.startTime;
                    // var month = sTime.getMonth();
                    var eTime =10;
                    // timeInit.defaultValue = sTime.getFullYear()+'��'+sTime.getMonth()+'��'+sTime.getDay()+'��';
                    // timeEnd.defaultValue = eTime.getFullYear()+'��'+eTime.getMonth()+'��'+eTime.getDay()+'��';

                    var timeDs=format.parse({
                       value: sTime,
                       type: format.Type.DATE
                    });
                    var timeDp = format.format({
                       value: timeDs,
                       type: format.Type.DATE
                    });


                    // ɸѡ�Ĳ���
                    nameSelect.updateLayoutType({
                        layoutType: serverWidget.FieldLayoutType.MIDROW
                    });
                    timeInit.updateLayoutType({
                        layoutType: serverWidget.FieldLayoutType.ENDROW
                    });
                    timeEnd.updateLayoutType({
                        layoutType: serverWidget.FieldLayoutType.ENDROW
                    });

                    // �������б�
                    var printList = printPage.addSublist({
                        id: 'custpage_title_bp_yk',
                        label: '���ϵ�',
                        type: 'LIST',
                    });

                    //���ѡ��ť��ȫѡ/ȫ��ѡ��
                    printList.addMarkAllButtons();

                    printList.addField({
                        id: 'custpage_mat_select_bp_yk',
                        label: 'ѡ��',
                        type: serverWidget.FieldType.CHECKBOX
                    });

                    printList.addField({
                        id: 'custpage_mat_order_bp_yk',
                        label: '���ϵ���',
                        type: serverWidget.FieldType.TEXT
                    });

                    printList.addField({
                        id: 'custpage_mat_name_bp_yk',
                        label: '������',
                        type: serverWidget.FieldType.TEXT
                    });

                    printList.addField({
                        id: 'custpage_mat_workshop_bp_yk',
                        label: '���ϳ���',
                        type: serverWidget.FieldType.TEXT
                    });

                    printList.addField({
                        id: 'custpage_mat_house_bp_yk',
                        label: '�ֿ�',
                        type: serverWidget.FieldType.TEXT
                    });

                    printList.addField({
                        id: 'custpage_mat_date_bp_yk',
                        label: '��������',
                        type: serverWidget.FieldType.DATE
                    });

                    //��ǰ�����˵�����
                    var nameNum = nameSelect.defaultValue;
                    var nameText = nameSelect.getSelectOptions().filter(function (x) {
                        return x.value == nameNum;
                    })[0].text;



                    var matResult = search.create({
                        type: 'customrecord_apply_stores_yk',
                        columns: [
                            'name', 'custrecord_apply_approve_status_yk', 'custrecord_apply_workshop_yk', 'custrecord_apply_worker_yk',
                            'custrecord_apply_warehouse_yk', 'custrecord_approve_endtime_yk'
                        ]
                    }).run();
                    var sl = 0;
                    matResult.each(function (result) {
                        var vals = result.getValue({name: 'custrecord_approve_endtime_yk'}).split('��');
                        vals = vals[0].replace('��', '-').replace('��', '-');
                        var pDate = Date.parse(vals);
                        var sDate = new Date(pDate);


                        if ((result.getText({name: 'custrecord_apply_approve_status_yk'})) == '����׼' &&
                            (result.getText({name: 'custrecord_apply_worker_yk'}) == nameText || nameText == '-ȫ��-') &&
                            ((sDate >= sTime && sDate <= eTime) || !sTime || !eTime)
                        ) {
                            printList.setSublistValue({
                                id: 'custpage_mat_order_bp_yk',
                                line: sl,
                                value: result.getValue({name: 'name'})
                            });

                            printList.setSublistValue({
                                id: 'custpage_mat_workshop_bp_yk',
                                line: sl,
                                value: result.getText({name: 'custrecord_apply_workshop_yk'})
                            });

                            printList.setSublistValue({
                                id: 'custpage_mat_name_bp_yk',
                                line: sl,
                                value: result.getText({name: 'custrecord_apply_worker_yk'})
                            });

                            printList.setSublistValue({
                                id: 'custpage_mat_house_bp_yk',
                                line: sl,
                                value: result.getText({name: 'custrecord_apply_warehouse_yk'})
                            });

                            printList.setSublistValue({
                                id: 'custpage_mat_date_bp_yk',
                                line: sl,
                                value: result.getValue({name: 'custrecord_approve_endtime_yk'})
                            });

                            sl++;
                            return true

                        } else {
                            return true
                        }
                    });

                    context.response.writePage(printPage);
                    log.debug({
                        title: 'Success',
                        details: 'Success'+typeof timeDp
                    })

                } catch (e) {
                    log.debug({
                        title: e.name,
                        details: e.message
                    })
                }
            } else {
                var count = context.request.getLineCount({
                        group: 'custpage_title_bp_yk'
                    }),
                    matId = [];

                // ��ȡ����׼�ĵ���ID  ��ID�ַ���ת��Ϊ����  ����matId[i] NAN
                try {
                    for (var j = 0; j < count; j++) {
                        matId.push(Number((context.request.getSublistValue({
                                group: 'custpage_title_bp_yk',
                                name: 'custpage_mat_order_bp_yk',
                                line: j
                            })).replace(/[^0-9]/ig, ""))
                        )
                    }
                    log.debug({
                        title: 'success',
                        details: matId
                    })
                } catch (e) {
                    log.debug({
                        title: e.name,
                        details: e.message
                    })
                }

                //XMLģ��   XML̫�࣬Ϊ�˲鿴���������������
                var xModel = '';
                //ͨ�ò���XML
                (function () {
                    xModel += '<?xml version="1.0"?><!DOCTYPE pdf PUBLIC "-//big.faceless.org//report" "report-1.1.dtd">';
                    xModel += '<pdf><head>';
                    xModel += '<link name="NotoSansCJKsc" type="font" subtype="opentype" src="${nsfont.NotoSansCJKsc_Regular}" src-bold="${nsfont.NotoSansCJKsc_Bold}" bytes="2" />';
                    //ҳüҳ��
                    xModel += '<macrolist>';
                    //ҳü
                    xModel += '<macro id="nlheader">';
                    xModel += '<table class="header" style="width: 100%;"><tr>';
                    xModel += '<td align="center"><span class="title">�������뵥</span></td>';
                    xModel += '</tr></table>';
                    xModel += '</macro>';
                    //ҳ��
                    xModel += '<macro id="nlfooter">';
                    xModel += '<table class="footer" style="width: 100%;"><tr>';
                    xModel += '<td align="center"><pagenumber/> of <totalpages/></td>';
                    xModel += '</tr></table>';
                    xModel += '</macro>';
                    xModel += '</macrolist>';
                    // ��ʽ
                    xModel += '<style type="text/css">*{';
                    xModel += 'font-family: sans-serif, stsong, NotoSans, NotoSansCJKsc;';
                    xModel += '}';
                    xModel += 'table {';
                    xModel += 'font-size: 9pt;';
                    //xModel += 'border: 1;';
                    xModel += 'table-layout: fixed;';
                    xModel += '}';
                    xModel += '        th {';
                    xModel += '            font-weight: bold;';
                    xModel += '            font-size: 8pt;';
                    xModel += '            vertical-align: middle;';
                    xModel += '            padding: 5px 6px 3px;';
                    xModel += '            background-color: #e3e3e3;';
                    xModel += '            color: #333333;';
                    xModel += '        }';
                    xModel += '        td {';
                    xModel += '            padding: 4px 6px;';
                    xModel += '        }';
                    xModel += 'td p { align:left }';
                    xModel += '        b {';
                    xModel += '            font-weight: bold;';
                    xModel += '            color: #333333;';
                    xModel += '        }';
                    xModel += '        table.header td {';
                    xModel += '            padding: 0;';
                    xModel += '            font-size: 10pt;';
                    xModel += '        }';
                    xModel += '        table.footer td {';
                    xModel += '            padding: 0;';
                    xModel += '            font-size: 8pt;';
                    xModel += '        }';
                    xModel += '        table.itemtable th {';
                    xModel += '            padding-bottom: 10px;';
                    xModel += '            padding-top: 10px;';
                    xModel += '        }';
                    xModel += '        table.body td {';
                    xModel += '            padding-top: 2px;';
                    xModel += '        }';
                    xModel += '        table.total {';
                    xModel += '            page-break-inside: avoid;';
                    xModel += '        }';
                    xModel += '        tr.totalrow {';
                    xModel += '            background-color: #e3e3e3;';
                    xModel += '            line-height: 200%;';
                    xModel += '        }';
                    xModel += '        td.totalboxtop {';
                    xModel += '            font-size: 12pt;';
                    xModel += '            background-color: #e3e3e3;';
                    xModel += '        }';
                    xModel += '        td.addressheader {';
                    xModel += '            font-size: 8pt;';
                    xModel += '            padding-top: 6px;';
                    xModel += '            padding-bottom: 2px;';
                    xModel += '        }';
                    xModel += '        td.address {';
                    xModel += '            padding-top: 0;';
                    xModel += '        }';
                    xModel += '        td.totalboxmid {';
                    xModel += '            font-size: 28pt;';
                    xModel += '            padding-top: 20px;';
                    xModel += '            background-color: #e3e3e3;';
                    xModel += '        }';
                    xModel += '        td.totalboxbot {';
                    xModel += '            background-color: #e3e3e3;';
                    xModel += '            font-weight: bold;';
                    xModel += '        }';
                    xModel += '        span.title {';
                    xModel += '            font-size: 28pt;';
                    xModel += '        }';
                    xModel += '        span.number {';
                    xModel += '            font-size: 16pt;';
                    xModel += '        }';
                    xModel += '        span.itemname {';
                    xModel += '            font-weight: bold;';
                    xModel += '            line-height: 150%;';
                    xModel += '        }';
                    xModel += '        hr {';
                    xModel += '            width: 100%;';
                    xModel += '            color: #d3d3d3;';
                    xModel += '            background-color: #d3d3d3;';
                    xModel += '            height: 1px;';
                    xModel += '        }';
                    xModel += '</style>';
                    xModel += '</head>';
                })();

                //ѭ��ȡֵ
                for (var j = 0; j < matId.length; j++) {
                    var recd = null;
                    try {
                        recd = record.load({
                            type: 'customrecord_apply_stores_yk',
                            id: matId[j]
                        });
                        var matgNum = recd.getText({fieldId: 'name'}),
                            matgName = recd.getText({fieldId: 'custrecord_apply_worker_yk'}),
                            matgShop = recd.getText({fieldId: 'custrecord_apply_workshop_yk'}),
                            matgHouse = recd.getText({fieldId: 'custrecord_apply_warehouse_yk'}),
                            matgTime = recd.getText({fieldId: 'custrecord_apply_time_yk'});

                        //ѭ����ֵ
                        xModel += '<body header="nlheader" header-height="10%" footer="nlfooter" footer-height="20pt"' + ' padding="0.5in 0.5in 0.5in 0.5in" size="A5-LANDSCAPE">';
                        xModel += '<h1>' + matgNum
                            + '<img src="http://www.intretech.com/Content/images/logo.png" style="width: 196px; height: 52px;" /></h1>';
                        xModel += '&nbsp;';

                        xModel += '<table border="0" cellpadding="1" cellspacing="1" style="width:500px;">';
                        // xModel += '<tr><td>����</td><td>${companyinformation.companyname}</td>';
                        // xModel += '<td>����</td><td><barcode codetype ="code39" showtext = "false" height = "20" width = "150" value = ""/></td></tr>';
                        xModel += '<tr>';
                        xModel += '<td>���ϳ���</td><td>' + matgShop + '</td>';
                        xModel += '<td>�ֿ�</td><td>' + matgHouse + '</td></tr>';
                        xModel += '<tr>';
                        xModel += '<td>������</td><td>' + matgName + '</td>';
                        xModel += '<td>����</td><td>' + matgTime + '</td></tr>';
                        xModel += '</table>';
                        xModel += '<br/><br/>&nbsp;';

                        xModel += '<table border="1" cellpadding="1" cellspacing="1" style="width:500px;"><tr>';
                        xModel += '<td>#</td>';
                        xModel += '<td>����</td>';
                        xModel += '<td>����</td>';
                        xModel += '</tr>';
                        //��¼���б�ѭ��
                        try {
                            var countSub = recd.getLineCount('recmachcustrecord_apply_header_yk');
                            for (var z = 0; z < countSub; z++) {
                                var wuliao = recd.getSublistText('recmachcustrecord_apply_header_yk',
                                    'custrecord_apply_materail_yk', z),

                                    numSub = recd.getSublistValue('recmachcustrecord_apply_header_yk',
                                        'custrecord_apply_stores_bumber_yk', z),

                                    k = z + 1;
                                xModel += '<tr>';
                                xModel += '<td>' + k + '</td>';
                                xModel += '<td>' + wuliao + '</td>';
                                xModel += '<td>' + numSub + '</td>';
                                xModel += '</tr>';
                            }
                            log.debug({
                                title: 's',
                                details: countSub
                            })
                        } catch (e5) {
                            log.debug({
                                title: e5.name + '**',
                                details: e5.message + '**'
                            })
                        }
                        xModel += '</table>';
                        xModel += '</body>';
                        log.debug({
                            title: 'Success',
                            details: 'w+' + countSub
                        })

                    } catch (e) {
                        log.debug({
                            title: e.name,
                            details: e.message
                        })
                    }

                }
                xModel += '</pdf>';

                var printPdf = rep.xmlToPdf({xmlString: xModel});
                context.response.writeFile({
                    file: printPdf,
                    isInline: true
                })

                // }else {
                //     alert('��ѡ��Ҫ��ӡ�����ϵ���')
                // }
            }
        }


        return {
            onRequest: onRequest
        }
    });