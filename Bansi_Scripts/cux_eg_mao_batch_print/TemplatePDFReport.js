/**
 * @NApiVersion 2.x
 * @NScriptType Suitelet
 * @author Bansi ZHU
 */
////////////////////Description////////////////////
//
//   PDF报表单据模板
//
//////////////////////////////////////////////////
define(
		[ 'N/record', 'N/search', 'N/render' ],
		/**
		 * @param {record} record
		 * @param {search} search
		 * @param {render} render
		 */
		function(record, search, render) {
			function onRequest(context) {

				var xmlStr = '';
				//xml定义打印模板
				var globalPrintRoot = '';
				globalPrintRoot += '<?xml version="1.0"?><!DOCTYPE pdf PUBLIC "-//big.faceless.org//report" "report-1.1.dtd">'
				globalPrintRoot += '<pdf>'
				globalPrintRoot += '<head>';
				globalPrintRoot += '<link name="NotoSansCJKsc" type="font" subtype="opentype" src="${nsfont.NotoSansCJKsc_Regular}" src-bold="${nsfont.NotoSansCJKsc_Bold}" bytes="2" />';

				var globalPrintHeader = '';
				globalPrintHeader += '<macrolist>'
				globalPrintHeader += '<macro id="nlheader">'
				globalPrintHeader += '<table class="header" style="width: 100%;"><tr>'
				globalPrintHeader += '<td align="center"><span class="title">HEADER_TITLE</span></td>'
				globalPrintHeader += '</tr></table>'
				globalPrintHeader += '</macro>'

				var globalPrintFooter = '';
				globalPrintFooter += '<macro id="nlfooter">'
				globalPrintFooter += '<table class="footer" style="width: 100%;"><tr>'
				globalPrintFooter += '<td align="center"><pagenumber/> of <totalpages/></td>'
				globalPrintFooter += '</tr></table>'
				globalPrintFooter += '</macro>'
				globalPrintFooter += '</macrolist>'

				var globalPrintStyle = '';
				globalPrintStyle += '<style type="text/css">* {';
				globalPrintStyle += 'font-family: sans-serif, stsong, NotoSans, NotoSansCJKsc;';
				globalPrintStyle += '}';
				globalPrintStyle += 'table {';
				globalPrintStyle += 'font-size: 9pt;';
				globalPrintStyle += 'border: 0;';
				globalPrintStyle += 'table-layout: fixed;';
				globalPrintStyle += '}';
				globalPrintStyle += 'th {';
				globalPrintStyle += 'font-weight: bold;';
				globalPrintStyle += 'font-size: 8pt;';
				globalPrintStyle += 'vertical-align: middle;';
				globalPrintStyle += 'padding: 5px 6px 3px;';
				globalPrintStyle += 'background-color: #e3e3e3;';
				globalPrintStyle += 'color: #333333;';
				globalPrintStyle += '}';
				globalPrintStyle += 'td {';
				globalPrintStyle += 'padding: 4px 6px;';
				globalPrintStyle += '}';
				globalPrintStyle += 'td p { align:left }';
				globalPrintStyle += 'b {';
				globalPrintStyle += 'font-weight: bold;';
				globalPrintStyle += 'color: #333333;';
				globalPrintStyle += '}';
				globalPrintStyle += 'table.header td {';
				globalPrintStyle += 'padding: 0;';
				globalPrintStyle += 'font-size: 10pt;';
				globalPrintStyle += '}';
				globalPrintStyle += 'table.footer td {';
				globalPrintStyle += 'padding: 0;';
				globalPrintStyle += 'font-size: 8pt;';
				globalPrintStyle += '}';
				globalPrintStyle += 'table.itemtable th {';
				globalPrintStyle += 'padding-bottom: 10px;';
				globalPrintStyle += 'padding-top: 10px;';
				globalPrintStyle += '}';
				globalPrintStyle += 'table.body td {';
				globalPrintStyle += 'padding-top: 2px;';
				globalPrintStyle += '}';
				globalPrintStyle += 'table.total {';
				globalPrintStyle += 'page-break-inside: avoid;';
				globalPrintStyle += '}';
				globalPrintStyle += 'tr.totalrow {';
				globalPrintStyle += 'background-color: #e3e3e3;';
				globalPrintStyle += 'line-height: 200%;';
				globalPrintStyle += '}';
				globalPrintStyle += 'td.totalboxtop {';
				globalPrintStyle += 'font-size: 12pt;';
				globalPrintStyle += 'background-color: #e3e3e3;';
				globalPrintStyle += '}';
				globalPrintStyle += 'td.addressheader {';
				globalPrintStyle += 'font-size: 8pt;';
				globalPrintStyle += 'padding-top: 6px;';
				globalPrintStyle += 'padding-bottom: 2px;';
				globalPrintStyle += '}';
				globalPrintStyle += 'td.address {';
				globalPrintStyle += 'padding-top: 0;';
				globalPrintStyle += '}';
				globalPrintStyle += 'td.totalboxmid {';
				globalPrintStyle += 'font-size: 28pt;';
				globalPrintStyle += 'padding-top: 20px;';
				globalPrintStyle += 'background-color: #e3e3e3;';
				globalPrintStyle += '}';
				globalPrintStyle += 'td.totalboxbot {';
				globalPrintStyle += 'background-color: #e3e3e3;';
				globalPrintStyle += 'font-weight: bold;';
				globalPrintStyle += '}';
				globalPrintStyle += 'span.title {';
				globalPrintStyle += 'font-size: 28pt;';
				globalPrintStyle += '}';
				globalPrintStyle += 'span.number {';
				globalPrintStyle += 'font-size: 16pt;';
				globalPrintStyle += '}';
				globalPrintStyle += 'span.itemname {';
				globalPrintStyle += 'font-weight: bold;';
				globalPrintStyle += 'line-height: 150%;';
				globalPrintStyle += '}';
				globalPrintStyle += 'hr {';
				globalPrintStyle += 'width: 100%;';
				globalPrintStyle += 'color: #d3d3d3;';
				globalPrintStyle += 'background-color: #d3d3d3;';
				globalPrintStyle += 'height: 1px;';
				globalPrintStyle += '}';
				globalPrintStyle += '</style>';
				globalPrintStyle += '</head>';

				var globalTableHead = '';
				globalTableHead += '<body header="nlheader" header-height="10%" footer="nlfooter" footer-height="20pt" padding="0.5in 0.5in 0.5in 0.5in" size="A5-LANDSCAPE">';
				globalTableHead += '<h1><img src="LOGO_IMG_URL" style="width: 196px; height: 52px;"/></h1>';
				globalTableHead += '&nbsp;';
				globalTableHead += '<table border="0" cellpadding="1" cellspacing="1" style="width:500px;">';
				globalTableHead += '<tr>'
				globalTableHead += '<td>COMPANYNAME</td>';
				globalTableHead += '<td>HEADERID</td>';
				globalTableHead += '<td><barcode codetype ="code39" showtext = "false" height = "20" width = "150" value = "BARCODEVALUE"/></td></tr>';
				globalTableHead += '<tr>';
				globalTableHead += '<td>HEAD_LABEL01</td>';
				globalTableHead += '<td>HEAD_VALUE01</td>';
				globalTableHead += '<td>HEAD_LABEL02</td>';
				globalTableHead += '<td>HEAD_VALUE02</td></tr>';
				globalTableHead += '<tr>';
				globalTableHead += '<td>HEAD_LABEL03</td>';
				globalTableHead += '<td>HEAD_VALUE03</td>';
				globalTableHead += '<td>HEAD_LABEL04</td>';
				globalTableHead += '<td>HEAD_VALUE04</td></tr>';
				globalTableHead += '</table>';
				globalTableHead += '<br/>&nbsp;';

				var globalTableTitle = '';
				globalTableTitle += '<table border="1" cellpadding="1" cellspacing="1" style="width:500px;"><tr>';
				globalTableTitle += '<th>LINE_LABEL01</th>';
				globalTableTitle += '<th>LINE_LABEL02</th>';
				globalTableTitle += '<th>LINE_LABEL03</th>';
				globalTableTitle += '</tr>';

				var globalTableBody = '';
				globalTableBody += '<tr>';
				globalTableBody += '<td>LINE_VALUE01</td>';
				globalTableBody += '<td>LINE_VALUE02</td>';
				globalTableBody += '<td>LINE_VALUE03</td>';
				globalTableBody += '</tr>';

				var globalTableFoot = '';
				globalTableFoot += '</table>';
				globalTableFoot += '</body>';

				var globalRootFoot = '';
				globalRootFoot += '</pdf>';
				//////////////////////////////////////////////////////////////////////////////

				// replace 'HEADER_TITLE' with your report name
				var printHeader = '';
				printHeader = globalPrintHeader;
				printHeader = printHeader.replace('HEADER_TITLE', 'your_reportname单据');//your_reportname

				xmlStr = globalPrintRoot + printHeader + globalPrintFooter + globalPrintStyle;

				// loop replace the follow Table Head Fields with your report needed.
				for (var i = 0; i < 3; i++) {
					var tableHead = '';
					tableHead = globalTableHead;
					tableHead = tableHead.replace('COMPANYNAME', 'your_companyname');//your_companyname
					tableHead = tableHead.replace('LOGO_IMG_URL', 'http://www.intretech.com/Content/images/logo.png');
					tableHead = tableHead.replace('HEADERID', 'your_headerid');
					tableHead = tableHead.replace('BARCODEVALUE', 'YOUR BARCODEVALUE');
					tableHead = tableHead.replace('HEAD_LABEL01', 'your_head_label01');
					tableHead = tableHead.replace('HEAD_LABEL02', 'your_head_label02');
					tableHead = tableHead.replace('HEAD_LABEL03', 'your_head_label03');
					tableHead = tableHead.replace('HEAD_VALUE01', 'your_head_value01');
					tableHead = tableHead.replace('HEAD_VALUE02', 'your_head_value02');
					tableHead = tableHead.replace('HEAD_VALUE03', 'your_head_value03');
					xmlStr += tableHead;

					// replace the follow Table Title Fields with your report needed.
					var tableTitle = '';
					tableTitle = globalTableTitle;
					tableTitle = tableTitle.replace('LINE_LABEL01', 'your_line_label01');
					tableTitle = tableTitle.replace('LINE_LABEL02', 'your_line_label02');
					tableTitle = tableTitle.replace('LINE_LABEL03', 'your_line_label03');
					xmlStr += tableTitle;

					//loop replace table body value
					for (var j = 0; j < 8; j++) {
						var tableBody = '';
						tableBody = globalTableBody;
						tableBody = tableBody.replace('LINE_VALUE01', 'your_line_value01');
						tableBody = tableBody.replace('LINE_VALUE02', 'your_line_value02');
						tableBody = tableBody.replace('LINE_VALUE03', 'your_line_value03');
						xmlStr += tableBody;
					}// end body loop
					xmlStr += globalTableFoot;
				}// end head loop

				xmlStr += globalRootFoot;

				try {
					var pdfFile = render.xmlToPdf({
						xmlString : xmlStr
					});
					context.response.writeFile({
						file : pdfFile,
						isInline : true
					});
				} catch (err) {
					log.debug({
						title : err.name,
						details : err.message
					});
				}
			}
			return {
				onRequest : onRequest
			};
		});