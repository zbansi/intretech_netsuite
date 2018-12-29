/**
 * @NApiVersion 2.x
 * @NScriptType Suitelet
 */
define([ 'N/file', 'N/search', 'N/record', 'N/url' ],
/**
 * 
 * @param {file} file
 * @param {search} search
 * @param {record} record
 * @param {url} url
 */
function(file, search, record, url) {
	function onRequest(context) {
		var nearestCoursesIds = getNearestCoursesIds(context.request.parameters.custom_lat, context.request.parameters.custom_long);
		if (nearestCoursesIds.length === 0) {
			context.response.write("No golf courses in this account!");
			return;
		}
		var html = generatePageHtml(nearestCoursesIds, context.request.parameters.custom_contact_id);
		context.response.write(html);
	}

	function getNearestCoursesIds(contactLat, contactLong) {
		var latsLongsSearch = search.load({ id : 'customsearch_golfschmoozer_lats_longs' });
		var idToDistance = {};
		latsLongsSearch.run().each(function(result) {
			var id = result.getValue({ name : 'internalid' });
			var lat = result.getValue({ name : 'custrecord_golfschmoozer_course_lat' });
			var long = result.getValue({ name : 'custrecord_golfschmoozer_course_long' });
			idToDistance[id] = distance(lat, long, contactLat, contactLong);
			return true;
		});
		return Object.keys(idToDistance).sort(function(a, b) {
			return idToDistance[a] - idToDistance[b]
		});
		;
	}

	function distance(lat1, long1, lat2, long2) {
		// credit to http://www.geodatasource.com/developers/javascript
		var radlat1 = Math.PI * lat1 / 180;
		var radlat2 = Math.PI * lat2 / 180;
		var theta = long1 - long2;
		var radtheta = Math.PI * theta / 180;
		var dist = Math.sin(radlat1) * Math.sin(radlat2) + Math.cos(radlat1) * Math.cos(radlat2) * Math.cos(radtheta);
		dist = Math.acos(dist);
		dist = dist * 180 / Math.PI;
		return dist * 60 * 1.1515;
	}

	function generatePageHtml(nearestCoursesIds, contactId) {
		var htmlFile = file.load('SuiteApps/com.example.golfschmoozer/resources/selector.html');
		var html = htmlFile.getContents();
		var courseEntryFile = file.load('SuiteApps/com.example.golfschmoozer/resources/course_entry.html');
		var courseEntryHtml = courseEntryFile.getContents();
		html = html.replace('\$\{bootstrap_css\}', file.load('SuiteApps/com.example.golfschmoozer/resources/selector_files/bootstrap.min.css').url);
		html = html.replace('\$\{custom_css\}', file.load('SuiteApps/com.example.golfschmoozer/resources/selector_files/custom.css').url);
		for (var i = 0; i < 25; i++) {
			if (i < nearestCoursesIds.length) {
				var course = record.load({ type : 'customrecord_golfschmoozer_course',
				id : nearestCoursesIds[i] });
				var name = course.getText({ fieldId : 'name' });
				var address = course.getText({ fieldId : 'custrecord_golfschmoozer_course_address' });
				var city = course.getText({ fieldId : 'custrecord_golfschmoozer_course_city' });
				var state = course.getText({ fieldId : 'custrecord_golfschmoozer_course_state' });
				var type = course.getText({ fieldId : 'custrecord_golfschmoozer_course_type' });
				var fullAddress = address + ', ' + city + ', ' + state;
				fullAddress = fullAddress.replace(/\s/g, '+');
				html = html.replace('\$\{course_entry\}', courseEntryHtml);
				html = html.replace('\$\{course_name\}', name);
				html = html.replace('\$\{course_address\}', address);
				html = html.replace('\$\{course_city\}', city);
				html = html.replace('\$\{course_state\}', state);
				html = html.replace('\$\{course_type\}', type);
				html = html.replace('\$\{course_full_address\}', fullAddress);
				html = html.replace('\$\{course_id\}', nearestCoursesIds[i]);
			}
		}
		html = html.replace('\$\{course_entry\}', '');
		var domain = url.resolveDomain({ hostType : url.HostType.APPLICATION });
		var setCourseUrlExt = url.resolveScript({ scriptId : 'customscript_golfschmoozer_set_course',
		deploymentId : 'customdeploy_golfschmoozer_set_course',
		returnExternalUrl : false,
		params : { custom_contact_id : contactId } });
		html = html.replace('\$\{set_course_url\}', 'https://' + domain + setCourseUrlExt);
		return html;
	}

	return { onRequest : onRequest };
});