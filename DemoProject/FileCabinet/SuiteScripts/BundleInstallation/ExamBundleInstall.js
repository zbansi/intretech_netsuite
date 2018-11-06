/**
 * Module Description
 * 
 * Version    Date            Author           Remarks
 * 1.00       05 Nov 2018     YQ12681
 *
 */
/**
 * @NApiVersion 2.0
 * @NScriptType BundleInstallationScript
 */
define([ 'N/runtime' ], function(runtime) {

	function beforeUpdate(fromversion, toversion) {

	}

	function checkPrerequisites() {
		if (!runtime.isFeatureInEffect({
			feature : 'TIMEOFFMANAGEMENT'
		}))
			throw 'The TIMEOFFMANAGEMENT feature must be enabled. '
					+ 'Please enable the feature and try again.';
	}

	return {
		beforeInstall : function beforeInstall(params) {
			checkPrerequisites();
		},
		beforeUpdate : function beforeUpdate(params) {
			checkPrerequisites();
		}
	};
});