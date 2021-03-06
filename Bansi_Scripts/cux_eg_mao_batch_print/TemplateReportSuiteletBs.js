/**
 * @NApiVersion 2.x
 * @NScriptType Suitelet
 * @author YQ12681 Bansi ZHU
 */
////////////////////Description////////////////////
//
//    html网页报表模板
//
//////////////////////////////////////////////////
define(
		[ 'N/record', 'N/render', 'N/search' ],
		/**
		 * @param {record} record
		 * @param {render} render
		 * @param {search} search
		 */
		function(record, render, search) {
			function onRequest(params) {
				var g_table_width = 1400;
				var g_table_column = 7;
				var xmlStr = '';

				var g_print_header0 = '';
				g_print_header0 += '<html>';
				g_print_header0 += '<head>';
				g_print_header0 += '<meta http-equiv="Content-Language" content="zh-cn">';
				g_print_header0 += '<meta http-equiv="Content-Type" content="text/html; charset=G_CHARSET">';
				var g_print_header1 = '';
				// title内容可替换
				g_print_header1 += '<title>物料主数据报表</title>';
				g_print_header1 += '<style type="text/css">';
				g_print_header1 += 'body {background-color: #ffffff;}';
				g_print_header1 += '.subheader1  {font-family: Arial, Helvetica, Geneva, sans-serif;';
				g_print_header1 += 'font-size: 13pt;';
				g_print_header1 += 'font-weight: bold;';
				g_print_header1 += 'color: #336699;}';
				g_print_header1 += '.subheader2  {font-family: Arial, Helvetica, Geneva, sans-serif;';
				g_print_header1 += 'font-size: 10pt;';
				g_print_header1 += 'font-weight: bold;';
				g_print_header1 += 'color: #336699;}';
				g_print_header1 += '.tableheader {font-family: Arial, Helvetica, Geneva, sans-serif;';
				g_print_header1 += 'font-size: 10pt;';
				g_print_header1 += 'font-weight: bold;';
				g_print_header1 += 'background: #E0ECF8;';
				g_print_header1 += 'color: #336699;';
				g_print_header1 += 'text-align: center;}';
				g_print_header1 += '.tabledata   {font-family: Arial, Helvetica, Geneva, sans-serif;';
				g_print_header1 += 'font-size: 9pt;';
				g_print_header1 += 'background: #EFF5FB;';
				g_print_header1 += 'color: #000000;';
				g_print_header1 += 'mso-number-format: "\@"}';
				g_print_header1 += '.tablenumber {font-family: Arial, Helvetica, Geneva, sans-serif;';
				g_print_header1 += 'font-size: 9pt;';
				g_print_header1 += 'background: #EFF5FB;';
				g_print_header1 += 'color: #000000;';
				g_print_header1 += 'text-align: right}';
				g_print_header1 += '.footer  {font-family: Arial, Helvetica, Geneva, sans-serif;';
				g_print_header1 += 'font-size: 10pt;';
				g_print_header1 += 'font-weight: bold;';
				g_print_header1 += 'color: #336699;}';
				g_print_header1 += '</style>';
				g_print_header1 += '</head>';
				var g_print_header2 = '';
				g_print_header2 += '<body> ';
				g_print_header2 += '<TABLE border=0 cellpadding=0 cellspacing=0 width='
						+ g_table_width + '>';
				// 报表名称可替换
				g_print_header2 += '<TR><th colspan='
						+ g_table_column
						+ ' class=subheader1 align=center style="margin-top: 0">物料主数据报表</th></TR>';
				g_print_header2 += '<TR><TD colspan=' + g_table_column
						+ ' class=subheader2>当前日期：P_SYSDATE_TIME</TD></TR>';
				g_print_header2 += '</TABLE>';

				var g_table_title = '';
				g_table_title += '<TABLE width="' + g_table_width
						+ '"border=1 cellpadding=3 cellspacing=1>';
				g_table_title += '<tr>';
				g_table_title += '<td class="tableheader" nowrap width="200">行号</td>';
				g_table_title += '<td class="tableheader" nowrap width="200">物料编码</td>';
				g_table_title += '<td class="tableheader" nowrap width="200">采购描述</td>';
				g_table_title += '<td class="tableheader" nowrap width="200">地点</td>';
				g_table_title += '<td class="tableheader" nowrap width="200">制造厂商</td>';
				g_table_title += '<td class="tableheader" nowrap width="200">单位类型</td>';
				g_table_title += '<td class="tableheader" nowrap width="200">成本</td>';
				g_table_title += '</tr>';

				var g_table_body = '';
				g_table_body += '<tr>';
				g_table_body += '<td class="tabledata">TEXT01</td>';
				g_table_body += '<td class="tabledata">TEXT02</td>';
				g_table_body += '<td class="tabledata">TEXT03</td>';
				g_table_body += '<td class="tabledata">TEXT04</td>';
				g_table_body += '<td class="tabledata">TEXT05</td>';
				g_table_body += '<td class="tabledata">TEXT06</td>';
				g_table_body += '<td class="tablenumber">TEXT07</td>';
				g_table_body += '</tr>';

				var g_print_footer = '';
				g_print_footer += '</TABLE></body></html>';

				// 以当前时间替换 P_SYSDATE_TIME
				var sysdateTime = new Date();
				g_print_header2 = g_print_header2.replace('P_SYSDATE_TIME',
						sysdateTime);
				xmlStr = g_print_header0 + g_print_header1 + g_print_header2
						+ g_table_title;

				var l_row_num = 0;

				try {

					//限量加载
					/*var itemRec = search.create({
						type : 'item',
						columns : [ 'itemid', 'purchasedescription', 'purchaseunit', 'stockdescription', 'stockunit', 'cost' ]
					}).run().getRange({
						start : 0,
						end : 100
					});

					for (var i = 0; i < itemRec.length; i++) {
						l_row_num = l_row_num + 1;
						var l_table_body = g_table_body;
						l_table_body = l_table_body.replace('TEXT01', l_row_num);
						l_table_body = l_table_body.replace('TEXT02', itemRec[i].getValue('itemid')); 
						l_table_body = l_table_body.replace('TEXT03', itemRec[i].getValue('purchasedescription'));
						l_table_body = l_table_body.replace('TEXT04', itemRec[i].getValue('location')); 
						l_table_body = l_table_body.replace('TEXT05', itemRec[i].getValue('manufacturer')); 
						l_table_body = l_table_body.replace('TEXT06', itemRec[i].getValue('unitstype')); 
						l_table_body = l_table_body.replace('TEXT07', itemRec[i].getValue('cost')); 
						xmlStr += l_table_body;
					}*/
					//不支持以下搜索
					/*var itemRec = search.create({
						type : 'item',
						columns : [ 'itemid', 'purchasedescription', 'purchaseunit', 'stockdescription', 'stockunit', 'cost' ]
					}).run();
					itemRec.each(function(result) {
						l_row_num = l_row_num + 1;
						var l_table_body = g_table_body;
						l_table_body = l_table_body.replace('TEXT01', l_row_num);
						l_table_body = l_table_body.replace('TEXT02', result.getValue('itemid'));
						l_table_body = l_table_body.replace('TEXT03', result.getValue('purchasedescription'));
						l_table_body = l_table_body.replace('TEXT04', result.getText('location'));
						l_table_body = l_table_body.replace('TEXT05', result.getText('manufacturer'));
						l_table_body = l_table_body.replace('TEXT06', result.getText('unitstype'));
						l_table_body = l_table_body.replace('TEXT07', result.getValue('cost'));
						xmlStr += l_table_body;
					});
					*/
					//推荐:分页加载
					var itemPageData = search.create(
							{
								type : 'item',
								columns : [ 'itemid', 'purchasedescription',
										'location', 'manufacturer',
										'unitstype', 'cost' ]
							}).runPaged();
					itemPageData.pageRanges.forEach(function(pageRange) {
						var myPage = itemPageData.fetch({
							index : pageRange.index
						});
						myPage.data.forEach(function(result) {
							l_row_num = l_row_num + 1;
							var l_table_body = g_table_body;
							l_table_body = l_table_body.replace('TEXT01',
									l_row_num);
							l_table_body = l_table_body.replace('TEXT02',
									result.getValue('itemid'));
							l_table_body = l_table_body.replace('TEXT03',
									result.getValue('purchasedescription'));
							l_table_body = l_table_body.replace('TEXT04',
									result.getText('location'));
							l_table_body = l_table_body.replace('TEXT05',
									result.getText('manufacturer'));
							l_table_body = l_table_body.replace('TEXT06',
									result.getText('unitstype'));
							l_table_body = l_table_body.replace('TEXT07',
									result.getValue('cost'));
							xmlStr += l_table_body;
						});
					});

				} catch (err) {
					log.debug({
						title : err.name,
						details : err.message
					});
				}

				xmlStr += g_print_footer;

				//输出文件
				params.response.write({
					output : xmlStr
				});

			}

			return {
				onRequest : onRequest
			};
		});
