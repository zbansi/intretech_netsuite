/**
 * @NApiVersion 2.x
 * @NScriptType ClientScript
 * @author YQ12681
 */
define(
		[ 'N/http', 'N/https', 'N/ui/dialog' ],
		/**
		 * @param {http} http
		 * @param {https} https
		 * @param {dialog} dialog
		 */
		function(http, https, dialog) {
			function pageInit(context) {
				try {

					//var response = http.get({ url : 'http://www.baidu.com' });
					//var response = http
					//.get({ url : 'https://forms.eu1.netsuite.com/app/site/hosting/scriptlet.nl?script=55&deploy=1&compid=5144758_SB1&h=7a7fa4443278bf5defc6' });
					//需要用N/https
					var response = https
							.get({ url : 'https://forms.eu1.netsuite.com/app/site/hosting/scriptlet.nl?script=55&deploy=1&compid=5144758_SB1&h=7a7fa4443278bf5defc6' });
					//var response = 'kdlfjdlf';
					dialog.alert({ title : 'Hello',
					message : JSON.stringify(response) });

					log.debug({ title : 'Success',
					details : 'http' });
				} catch (e) {
					log.debug({ title : e.name,
					details : e.message });
				}

			}

			return { pageInit : pageInit }
		});
