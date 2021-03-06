/**
 * @NApiVersion 2.x
 * @NScriptType Suitelet
 * @author YQ12681
 */
define(
		[ 'N/record', 'N/render' ],
		function(record, render) {
			function onRequest(params) {
				var maoId = params.request.parameters.maoid;
				var rec = record.load({
					type : 'customrecord_yq_material_apply_bansi',
					id : maoId
				});
				var str = '';
				str += '<?xml version="1.0"?><!DOCTYPE pdf PUBLIC "-//big.faceless.org//report" "report-1.1.dtd"><pdf><head>';
				str += '</head>';
				str += '<body padding="0.5in 0.5in 0.5in 0.5in" size="Letter">';
				str += '<table style="width: 100%; font-size: 10pt;"><tr>';
				str += '<td>' + rec.getFieldText('name') + '</td></tr>';
				str += '</table></body>';
				str += '</pdf>'
				var pdfFile = render.xmltoPdf({
					xmlString : str
				});
				params.response.setContentType('PDF', 'pdf.pdf', 'inline');
				params.response.write(file.getValue());
			}

			return {
				onRequest : onRequest
			};
		});