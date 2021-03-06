/**
 * @NApiVersion 2.x
 * @author YQ12681
 */
define([ 'N/url', 'N/currentRecord' ], function(url, currentRecord) {
	return ({
		bs_print_mao : function() {
			try {
				var record = currentRecord.get();
				var maoId = record.id;
				var u = url.resolveScript({
					scriptId : 'customscript_yq_bs_printmao_suitelet',
					deploymentId : 'customdeploy_yq_bs_printmao_suitelet',
					returnExternalUrl : true
				});
				u += u + '&maoid' + maoId;
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