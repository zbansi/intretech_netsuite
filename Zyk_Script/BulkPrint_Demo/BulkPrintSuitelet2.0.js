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
                        title: '领料单'
                    });

                    printPage.addSubmitButton({
                        label: '提交打印'
                    });

                    // 筛选 领料人
                    var nameSelect = printPage.addField({
                        id: 'custpage_name_select_bp_yk',
                        label: '领料人',
                        type: serverWidget.FieldType.SELECT
                    });
                    nameSelect.addSelectOption({
                        value: 'name0',
                        text: '-全部-'
                    });


                    printPage.clientScriptModulePath = './urlDispose';

                    var name = context.request.parameters.name;

                    if (name) {
                        nameSelect.defaultValue = name
                    } else {
                        nameSelect.defaultValue = 'name0';
                    }

                    // 遍历领料员表单
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

                    // 筛选 日期
                    var timeInit = printPage.addField({
                        id: 'custpage_i_date_bp_yk',
                        label: '自',
                        type: serverWidget.FieldType.DATE
                    });

                    var timeEnd = printPage.addField({
                        id: 'custpage_p_date_bp_yk',
                        label: '至',
                        type: serverWidget.FieldType.DATE
                    });

                    // 传参带入时间
                    var sTime =context.request.parameters.startTime;
                    // var month = sTime.getMonth();
                    var eTime =10;
                    // timeInit.defaultValue = sTime.getFullYear()+'年'+sTime.getMonth()+'月'+sTime.getDay()+'日';
                    // timeEnd.defaultValue = eTime.getFullYear()+'年'+eTime.getMonth()+'月'+eTime.getDay()+'日';

                    var timeDs=format.parse({
                       value: sTime,
                       type: format.Type.DATE
                    });
                    var timeDp = format.format({
                       value: timeDs,
                       type: format.Type.DATE
                    });


                    // 筛选的布局
                    nameSelect.updateLayoutType({
                        layoutType: serverWidget.FieldLayoutType.MIDROW
                    });
                    timeInit.updateLayoutType({
                        layoutType: serverWidget.FieldLayoutType.ENDROW
                    });
                    timeEnd.updateLayoutType({
                        layoutType: serverWidget.FieldLayoutType.ENDROW
                    });

                    // 创建子列表
                    var printList = printPage.addSublist({
                        id: 'custpage_title_bp_yk',
                        label: '领料单',
                        type: 'LIST',
                    });

                    //添加选择按钮（全选/全不选）
                    printList.addMarkAllButtons();

                    printList.addField({
                        id: 'custpage_mat_select_bp_yk',
                        label: '选择',
                        type: serverWidget.FieldType.CHECKBOX
                    });

                    printList.addField({
                        id: 'custpage_mat_order_bp_yk',
                        label: '领料单号',
                        type: serverWidget.FieldType.TEXT
                    });

                    printList.addField({
                        id: 'custpage_mat_name_bp_yk',
                        label: '领料人',
                        type: serverWidget.FieldType.TEXT
                    });

                    printList.addField({
                        id: 'custpage_mat_workshop_bp_yk',
                        label: '领料车间',
                        type: serverWidget.FieldType.TEXT
                    });

                    printList.addField({
                        id: 'custpage_mat_house_bp_yk',
                        label: '仓库',
                        type: serverWidget.FieldType.TEXT
                    });

                    printList.addField({
                        id: 'custpage_mat_date_bp_yk',
                        label: '领料日期',
                        type: serverWidget.FieldType.DATE
                    });

                    //当前领料人的文字
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
                        var vals = result.getValue({name: 'custrecord_approve_endtime_yk'}).split('日');
                        vals = vals[0].replace('年', '-').replace('月', '-');
                        var pDate = Date.parse(vals);
                        var sDate = new Date(pDate);


                        if ((result.getText({name: 'custrecord_apply_approve_status_yk'})) == '已批准' &&
                            (result.getText({name: 'custrecord_apply_worker_yk'}) == nameText || nameText == '-全部-') &&
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

                // 获取已批准的单号ID  将ID字符串转化为数字  否则matId[i] NAN
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

                //XML模板   XML太多，为了查看方便添加匿名函数
                var xModel = '';
                //通用部分XML
                (function () {
                    xModel += '<?xml version="1.0"?><!DOCTYPE pdf PUBLIC "-//big.faceless.org//report" "report-1.1.dtd">';
                    xModel += '<pdf><head>';
                    xModel += '<link name="NotoSansCJKsc" type="font" subtype="opentype" src="${nsfont.NotoSansCJKsc_Regular}" src-bold="${nsfont.NotoSansCJKsc_Bold}" bytes="2" />';
                    //页眉页脚
                    xModel += '<macrolist>';
                    //页眉
                    xModel += '<macro id="nlheader">';
                    xModel += '<table class="header" style="width: 100%;"><tr>';
                    xModel += '<td align="center"><span class="title">领料申请单</span></td>';
                    xModel += '</tr></table>';
                    xModel += '</macro>';
                    //页脚
                    xModel += '<macro id="nlfooter">';
                    xModel += '<table class="footer" style="width: 100%;"><tr>';
                    xModel += '<td align="center"><pagenumber/> of <totalpages/></td>';
                    xModel += '</tr></table>';
                    xModel += '</macro>';
                    xModel += '</macrolist>';
                    // 样式
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

                //循环取值
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

                        //循环赋值
                        xModel += '<body header="nlheader" header-height="10%" footer="nlfooter" footer-height="20pt"' + ' padding="0.5in 0.5in 0.5in 0.5in" size="A5-LANDSCAPE">';
                        xModel += '<h1>' + matgNum
                            + '<img src="http://www.intretech.com/Content/images/logo.png" style="width: 196px; height: 52px;" /></h1>';
                        xModel += '&nbsp;';

                        xModel += '<table border="0" cellpadding="1" cellspacing="1" style="width:500px;">';
                        // xModel += '<tr><td>单号</td><td>${companyinformation.companyname}</td>';
                        // xModel += '<td>条码</td><td><barcode codetype ="code39" showtext = "false" height = "20" width = "150" value = ""/></td></tr>';
                        xModel += '<tr>';
                        xModel += '<td>领料车间</td><td>' + matgShop + '</td>';
                        xModel += '<td>仓库</td><td>' + matgHouse + '</td></tr>';
                        xModel += '<tr>';
                        xModel += '<td>领料人</td><td>' + matgName + '</td>';
                        xModel += '<td>日期</td><td>' + matgTime + '</td></tr>';
                        xModel += '</table>';
                        xModel += '<br/><br/>&nbsp;';

                        xModel += '<table border="1" cellpadding="1" cellspacing="1" style="width:500px;"><tr>';
                        xModel += '<td>#</td>';
                        xModel += '<td>物料</td>';
                        xModel += '<td>数量</td>';
                        xModel += '</tr>';
                        //记录子列表循环
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
                //     alert('请选择要打印的领料单！')
                // }
            }
        }


        return {
            onRequest: onRequest
        }
    });