function pageInit(type) {
	try {
		alert('pageinit');
	} catch (ex) {
		alert(ex);
		nlapiLogExecution('debug', '异常', ex);
	}
}

function fieldChanged(type, name, linenum) {
	try {
		if (name == 'altname') {
			alert(type);
			alert(name);
			alert(linenum);
		}
	} catch (ex) {
		nlapiLogExecution('debug', '异常', ex);
	}
}

function savedRecord(type) {
	alert(type);
	return true;
}

function suitelet(request, response) {
	// var form=nlapiCreateForm('测试页面');
	// form.addField('custpage_input','text','输入框');
	// response.writePage(form);
	// response.write('<body><font color="red">hahahahaha</font></body>');

	/*
	 * var method=request.getMethod(); if(method=='GET'){ var
	 * newForm=nlapiCreateForm('批量打印销售订单');
	 * 
	 * newForm.setScript('customscript_cs_print'); var
	 * status=request.getParameter('status'); newForm.addSubmitButton('打印'); var
	 * statusField=newForm.addField('custpage_status','select','状态');
	 * statusField.addSelectOption('','');
	 * statusField.addSelectOption('1','Open');
	 * statusField.addSelectOption('2','Closed');
	 * statusField.setDefaultValue(status);
	 * 
	 * var sublist=newForm.addSubList('custpage_sublist','list','销售订单');
	 * sublist.addMarkAllButtons();
	 * sublist.addField('custpage_checkbox','checkbox');
	 * sublist.addField('custpage_no','select','订单号','salesorder').setDisplayType('disabled');
	 * sublist.addField('custpage_date','date','日期');
	 * sublist.addField('custpage_amount','currency','金额');
	 * sublist.addField('custpage_memo','text','备注');
	 * 
	 * 
	 * var fils=[]; if(status=='2'){ fils.push(new
	 * nlobjSearchFilter('status',null,'anyof',['SalesOrd:G','SalesOrd:A','SalesOrd:D'])); }
	 * if(status=='1'){ fils.push(new
	 * nlobjSearchFilter('status',null,'noneof',['SalesOrd:G','SalesOrd:A','SalesOrd:D'])); } //
	 * fils.push(new nlobjSearchFilter('status',null,'anyof',['1'])); var
	 * cols=[]; cols[0]=new nlobjSearchColumn('memo');
	 * 
	 * var
	 * rts=nlapiSearchRecord('salesorder','customsearch_printsalesorder',fils,cols);
	 * if(rts){ for(var i=0;i<rts.length;i++){ var internalid=rts[i].getId();
	 * var date=rts[i].getValue('trandate'); var memo=rts[i].getValue(cols[0]);
	 * var cs=rts[i].getAllColumns(); var amount=rts[i].getValue(cs[3]);
	 * sublist.setLineItemValue('custpage_no',i+1,internalid);
	 * sublist.setLineItemValue('custpage_date',i+1,date);
	 * sublist.setLineItemValue('custpage_amount',i+1,amount);
	 * sublist.setLineItemValue('custpage_memo',i+1,memo); } }
	 * 
	 * response.writePage(newForm);
	 */

	var type = request.getParameter('type');
	if (type == 'getsalesorder') {
		/*
		 * var rts=nlapiSearchRecord('salesorder',null,[new
		 * nlobjSearchFilter('mainline',null,'is','T')]); var res=[]; if(rts){
		 * for(var i=0;i<rts.length;i++){ res.push(rts[i].getId()); } }
		 */
		var sc = nlapiCreateSearch('salesorder', [ new nlobjSearchFilter(
				'mainline', null, 'is', 'T') ]);
		var rtsSet = sc.runSearch();
		var res = [];
		for (var n = 0; n < 200; n++) {
			var rts = rtsSet.getResults(n * 1000, (n + 1) * 1000);
			for (var i = 0; i < rts.length; i++) {
				res.push(rts[i].getId());
			}
			if (rts.length < 1000)
				break;
		}
		response.write(JSON.stringify(res));
	}/*
		 * } else{ var soids=[]; var
		 * count=request.getLineItemCount('custpage_sublist'); for(var i=1;i<=count;i++){
		 * if(request.getLineItemValue('custpage_sublist','custpage_checkbox',i)=='T'){
		 * var id=request.getLineItemValue('custpage_sublist','custpage_no',i);
		 * soids.push(id); } } response.write(JSON.stringify(soids));
		 *  }
		 */

}

function clientFieldChanged(type, name, linenum) {
	if (name == 'custpage_status') {
		var url = window.location.href;
		url += '&status=' + nlapiGetFieldValue('custpage_status');
		window.location.href = url;
	}
}
