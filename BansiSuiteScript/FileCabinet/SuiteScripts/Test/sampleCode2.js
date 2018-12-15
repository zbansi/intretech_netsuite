function userEventBeforeLoad(type, form, request) {
	if (type == 'view') {
		form.setScript('customscript_ue_addbuton')
		form.addButton('custpage_btn', '下推领料单', 'createLLD('
				+ nlapiGetRecordId() + ')');
	}
}

function createLLD(woid) {
	var url = nlapiResolveURL('RECORD', 'customrecorddemo_lingliao');
	window.location.href = url + '&woid=' + woid;
}

function beforeLoad(type, form, request) {
	if (type == 'create') {
		var woid = request.getParameter('woid');
		if (woid) {
			var rec = nlapiLoadRecord('workorder', woid);
			var location = rec.getFieldValue('location');
			var date = new Date();
			nlapiSetFieldValue('custrecord8', location);
			nlapiSetFieldValue('custrecord9', nlapiDateToString(date));
			nlapiSetFieldValue('custrecord_workorder', woid);
			var count = rec.getLineItemCount('item');
			for (var i = 1; i <= count; i++) {
				nlapiSetLineItemValue('recmachcustrecord19', 'custrecord15', i,
						rec.getLineItemValue('item', 'item', i));
				nlapiSetLineItemValue('recmachcustrecord19', 'custrecord16', i,
						rec.getLineItemValue('item', 'quantity', i));
			}
		}
	} else if (type == 'view') {
		form.setScript('customscript804');
		form.addButton('custpage_print', '打印', 'yq_print(' + nlapiGetRecordId()
				+ ')');
	}
}

function yq_print(lldId) {
	var scriptid = 'customscript_sl_print';
	var deployid = 'customdeploy_sl_print';
	var url = nlapiResolveURL('SUITELET', scriptid, deployid) + '&lldid='
			+ lldId;
	window.open(url);
}

function beforeSubmit(type) {
	// throw '错误内容';
}

function sl_print(request, response) {
	var lldid = request.getParameter('lldid');
	var rec = nlapiLoadRecord('customrecorddemo_lingliao', lldid);
	var str = '';
	str += '<?xml version="1.0"?><!DOCTYPE pdf PUBLIC "-//big.faceless.org//report" "report-1.1.dtd"><pdf><head>';
	str += '</head>';
	str += '<body padding="0.5in 0.5in 0.5in 0.5in" size="Letter">';
	str += '<table style="width: 100%; font-size: 10pt;"><tr>';
	str += '<td>' + rec.getFieldText('custrecord12') + '</td></tr>';
	str += '</table></body>';
	str += '</pdf>'
	var file = nlapiXMLToPDF(str);
	response.setContentType('PDF', 'pdf.pdf', 'inline');
	response.write(file.getValue());

}