/**
 * @NApiVersion 2.x
 * @author YQ12681
 */
////////////////////////Description///////////////////////
//
// 定义【打印领料单】的方法
// 此方法解析脚本记录id和部署id, 生成一个对suitelet的调用URL
//
/////////////////////////////////////////////////////////
define([ 'N/url', 'N/currentRecord' ], function(url, currentRecord) {
	return ({
		bs_print_mao : function() {
			try {
				var record = currentRecord.get();
				var maoId = record.id;
				var u = url.resolveScript({
					//BsPrintMAO.js
					scriptId : 'customscript_yq_bs_printmao_suitelet',
					deploymentId : 'customdeploy_yq_bs_printmao_suitelet',
					returnExternalUrl : false
				// if true 报错：不允许您直接到此页面  https://forms.eu1.netsuite.com/app/site/hosting/scriptlet.nl
				//?script=18&deploy=1&compid=5144758_SB1&h=2882965d29273aadff92&maoid=1
				// if false 可行

				});
				u += '&maoid=' + maoId;
				log.debug({
					title : 'Success',
					details : 'url解析成功'
				});
			} catch (e1) {
				log.debug({
					title : e1.name,
					details : e1.message
				});
			}
			window.open(u);
		}
	});
});