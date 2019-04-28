/**
 *@NApiVersion 2.x
 *@NScriptType Suitelet
 */
/////////////////Function Decription//////////////////////////////////////
// 1）输出领料单批量打印页面，页面要素：
//    筛选字段（领料人、领料日期从、至），
//    批量打印按键，
//    领料申请主单子列表（全选框、单号、领料车间、领料人、仓库、时间）
// 2）限定只能查找到已审批的领料单
// 3）更新筛选字段值，自动刷新子列单
// 4）点击批量打印按钮，可以在线浏览领料单PDF输出
//   （每单包含：单号、领料人、时间、物料、数量）
/////////////////////////////////////////////////////////////////////////

define(['N/ui/serverWidget', 'N/search', 'N/record', 'N/render'],
    function (serverWidget, search, rec, rep) {

        function onRequest(context) {
            // 1.创建批量打印页面
            if (context.request.method === 'GET') {
                try {

                    var printPage = serverWidget.createForm({
                        title: '批量打印'
                    });
                    printPage.addSubmitButton({
                        label: '批量打印'
                    });

                    // 筛选 领料人
                    var nameSelect = printPage.addField({
                        id: 'custpage_name_select_bp_yk',
                        label: '领料人',
                        type: serverWidget.FieldType.SELECT
                    });

                    // 遍历领料员表单
                    //     var fltWork = [];
                    var matWorker = search.create({
                        type: search.Type.EMPLOYEE,
                        columns: ['entityid'],
                    }).run();
                    var w = 0;
                    matWorker.each(function (result) {
                        nameSelect.addSelectOption({
                            value: 'name' + w,
                            text: result.getValue('entityid'),
                        });
                        w++;
                        return true
                    });

                    // 筛选 日期
                    var timeInit = printPage.addField({
                        id: 'custpage_i_date_bp_yk',
                        label: '开始时间',
                        type: serverWidget.FieldType.SELECT
                    });

                    var timeEnd = printPage.addField({
                        id: 'custpage_p_date_bp_yk',
                        label: '结束时间',
                        type: serverWidget.FieldType.SELECT
                    });
                    var offset_GMT = new Date().getTimezoneOffset(); // 本地时间    和格林威治的时间差，单位为分钟
                    var nowDate = new Date().getTime(); // 本地时间距 1970 年 1 月 1 日午夜（GMT 时间）之间的毫秒数
                    var timeMs = nowDate + offset_GMT * 60 * 1000 + 8 * 60 * 60 * 1000;
                    var targetDate = new Date(timeMs);
                    var a = targetDate.getDate();
                    for (var i = 0; i < a; i++) {
                        targetDate.setDate(i + 1);
                        timeEnd.addSelectOption({
                            value: 'etime' + i,
                            text: targetDate.toLocaleDateString(),
                            isSelected: true
                        });
                        timeInit.addSelectOption({
                            value: 'itime' + i,
                            text: targetDate.toLocaleDateString(),
                            isSelected: true
                        });
                    }
                    //判断时间的前后顺序以验证筛选  if

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
                        type: serverWidget.FieldType.DATETIMETZ
                    });

                    //领料申请单 customrecord_apply_stores_yk
                    //创建领料单搜索结果

                    var matFilter = [];//过滤器
                    var matResult = search.create({
                        type: 'customrecord_apply_stores_yk',
                        columns: [
                            'name', 'custrecord_apply_approve_status_yk', 'custrecord_apply_workshop_yk', 'custrecord_apply_worker_yk',
                            'custrecord_apply_warehouse_yk', 'custrecord_apply_time_yk'
                        ],
                        filter: matFilter
                    }).run();

                    //审批状态判断 当前过滤器条件<判断领料人，判断时间> 在载入数据
                    var sl = 0;
                    matResult.each(function (result) {
                        if ((result.getText({name: 'custrecord_apply_approve_status_yk'})) == '已批准') {
                            // if ()
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
                                value: result.getValue(({name: 'custrecord_apply_time_yk'}))
                            });
                            sl++;
                            return true
                        } else {
                            return true
                        }
                    });
                    // custpage_name_select_bp_yk

                    // 载入批量打印页面 （动态加载订单）
                    context.response.writePage(printPage);
                    log.debug({
                        title: 'Success',
                        details: '成功获取'
                    })

                } catch (e) {
                    log.debug({
                        title: e.name,
                        details: e.message
                    })
                }
            } else {
                // if () {
                // 2.提交按钮POST 输出打印  获取已批准的领料单行数
                // try {
                //     var che = context.request.getValue();
                //     log.debug({
                //         title: 'Ss',
                //         details: che
                //     })
                // } catch (eb) {
                //     log.debug({
                //         title: eb.name,
                //         details: eb.message
                //     })
                // }


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
                        recd = rec.load({
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