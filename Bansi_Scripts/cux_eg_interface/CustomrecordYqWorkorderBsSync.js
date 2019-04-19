/**
 * @NApiVersion 2.x
 * @NScriptType Restlet
 * @NModuleScope SameAccount
 */
define([ 'N/record', 'N/search', 'N/runtime', 'N/format' ],
/**
 * @param {record} record
 * @param {search} search
 * @param {runtime} runtime
 * @param {format} format
 */
function(record, search, runtime, format) {

	/**
	 * Function called upon sending a GET request to the RESTlet.
	 * 
	 * @param {Object} requestParams - Parameters from HTTP request URL; parameters will be passed into function as an Object (for all supported content types)
	 * @returns {string | Object} HTTP response body; return string when request Content-Type is 'text/plain'; return Object when request Content-Type is
	 *          'application/json'
	 * @since 2015.1
	 */
	function doGet(requestParams) {
		//最近同步时间
		var lastSyncDate = runtime.getCurrentScript().getParameter(
				"custscript_systemlog_last_date");
		//是否增量同步参数
		var dataSyncType = runtime.getCurrentScript().getParameter(
				"custscript_systemlog_all_or_in");
		if (!lastSyncDate) {
			var dateNow = new Date().getTime();
			var tempDateinit = dateNow - 100 * 365 * 24 * 60 * 60 * 1000;
			var dateInit = new Date(tempDateinit);
			lastSyncDate = dateInit;
		}
		//格式化成字符串，并且由GMT-8转换为本地时间格式GMT+8（不知道为什么可以转换）
		//NS UI：与用户首选项设置的格式有关 YYYY/MM/DD hh:mm:ss  2019/01/02 21:10:24
		//eclipse: 默认日期格式 M/d/yyyy hh:mm:ss 1/4/2019 8:58:18
		var lastSyncDateStr = format.format({
			value : lastSyncDate,
			type : format.Type.DATETIME
		});

		//将原日期格式转换成可以匹配条件比较的yy/MM/dd H:mm格式
		//NS UI:Invalid date value 2019/01/02 21:10:24 (must match yy/MM/dd H:mm)
		//eclipse调用：Invalid date value 1/2/2019 21:11:14 (must match M/d/yy H:mm)

		var dateTimeArray = lastSyncDateStr.split(' ');
		var dateArray = dateTimeArray[0].split('/');
		var timeArray = dateTimeArray[1].split(':');
		var yy = null;
		var mon = null;
		var da = null;
		var h = timeArray[0];
		var m = timeArray[1];
		var dateSplitChar = '/';
		var timeSplitChar = ':';

		if (dateArray[0].length > 2) {
			yy = dateArray[0].slice(2, 4);
			mon = dateArray[1];
			da = dateArray[2];
		} else {
			yy = dateArray[2].slice(2, 4);
			mon = dateArray[0];
			da = dateArray[1];
		}
		var lastSyncDatex = mon + dateSplitChar + da + dateSplitChar + yy
				+ '  ' + h + timeSplitChar + m;
		var updatedRec = [];//Object.create(null);
		var deletedRec = [];//Object.create(null);
		try {
			var updatedRecColumns = [];
			var columnsName = [ 'author', 'direction', 'externalid',
					'formulacurrency', 'formuladate', 'formuladatetime',
					'formulanumeric', 'formulapercent', 'formulatext',
					'internalid', 'note', 'notedate', 'notetype', 'title' ];
			for (var i = 0; i < columnsName.length; i++) {
				updatedRecColumns.push(search.createColumn({
					name : columnsName[i]
				}));
			}

			var updatedRecFilters = [];
			updatedRecFilters[0] = search.createFilter({
				name : 'notedate',
				operator : search.Operator.ONORAFTER,
				//接受的格式为M/d/yy H:mm
				values : lastSyncDatex
			});
			updatedRecFilters[1] = search.createFilter({
				name : 'recordtype',
				operator : search.Operator.IS,
				//接受的格式为M/d/yy H:mm
				values : 'item'
			});

			if (dataSyncType == '1') {//全量同步
				/*
				updatedRec = search.create({
					type : 'note',
					columns : updatedRecColumns
				}).run().getRange({
					start : 0,
					end : 10000
				});
				*/
				var updatedPagedData = search.create({
					type : 'note',
					//filters : updatedRecFilters,
					columns : updatedRecColumns
				}).runPaged();
				updatedPagedData.pageRanges.forEach(function(pageRange) {
					var myPage = updatedPagedData.fetch({
						index : pageRange.index
					});
					myPage.data.forEach(function(result) {
						//deletedRec = {...deletedRec,...result};
						updatedRec.push(result);
					})
				});

			} else if (dataSyncType == '2') {//增量同步				
				var updatedPagedData = search.create({
					type : 'note',
					filters : updatedRecFilters,
					columns : updatedRecColumns
				}).runPaged();
				updatedPagedData.pageRanges.forEach(function(pageRange) {
					var myPage = updatedPagedData.fetch({
						index : pageRange.index
					});
					myPage.data.forEach(function(result) {
						//deletedRec = {...deletedRec,...result};
						updatedRec.push(result);
					})
				});
			}
		} catch (error) {
			log.debug({
				title : error.name,
				details : error.message
			});
		}

		try {
			var deletedRecFilters = [];
			deletedRecFilters.push(search.createFilter({
				name : 'deleteddate',
				operator : search.Operator.ONORAFTER,
				//接受的格式为M/d/yy H:mm
				values : lastSyncDatex
			}));

			var deletedRecColumns = [];
			deletedRecColumns[0] = search.createColumn({
				name : 'context'
			});
			deletedRecColumns[1] = search.createColumn({
				name : 'deletedby'
			});
			deletedRecColumns[2] = search.createColumn({
				name : 'deleteddate'
			});
			deletedRecColumns[3] = search.createColumn({
				name : 'externalid'
			});
			deletedRecColumns[4] = search.createColumn({
				name : 'name'
			});

			if (dataSyncType == '1') {//全量同步
				/*
				deletedRec = search.create({
					type : 'deletedrecord',
					//filters : deletedRecFilters,
					columns : deletedRecColumns

				}).run().getRange({
					//No more than 1000 search results may be requested at one time from nlobjSearchResultSet.getResults(). 
					//Please narrow your range, or use nlobjSearchResultSet.forEachResult() instead.	
					start : 0,
					end : 10000
				});
				*/
				var deletedPagedData = search.create({
					type : 'deletedrecord',
					//filters : deletedRecFilters,
					columns : deletedRecColumns

				}).runPaged();
				deletedPagedData.pageRanges.forEach(function(pageRange) {
					var myPage = deletedPagedData.fetch({
						index : pageRange.index
					});
					myPage.data.forEach(function(result) {
						//deletedRec = {...deletedRec,...result};
						deletedRec.push(result);
					})
				});
			} else if (dataSyncType == '2') {//增量同步

				var deletedPagedData = search.create({
					type : 'deletedrecord',
					filters : deletedRecFilters,
					columns : deletedRecColumns
				}).runPaged();
				deletedPagedData.pageRanges.forEach(function(pageRange) {
					var myPage = deletedPagedData.fetch({
						index : pageRange.index
					});
					myPage.data.forEach(function(result) {
						//deletedRec = {...deletedRec,...result};
						deletedRec.push(result);
					})
				});
			}
		} catch (error) {
			log.debug({
				title : error.name,
				details : error.message
			});
		}

		try {
			//load参数的id注意是internalId不是ID
			//customdeploy_eg_item_sync_interface
			var scriptRecord = record.load({
				type : 'scriptdeployment',
				id : 286
			});
			var date = new Date();

			var dateStr = format.format({
				value : date,
				type : format.Type.DATETIMETZ,
				timezone : format.Timezone.ASIA_HONG_KONG
			});

			var datex = format.parse({
				value : dateStr,
				type : format.Type.DATETIMETZ,
				timezone : format.Timezone.ASIA_HONG_KONG
			});

			scriptRecord.setValue({
				fieldId : 'custscript_systemlog_last_date',
				//需要是日期时间格式
				value : datex
			});
			scriptRecord.save();
			log.debug({
				title : 'Success',
				details : 'scriptRecord = ' + JSON.stringify(scriptRecord)
						+ '\n' + ' lastSyncDate = ' + lastSyncDate + '\n'
						+ 'lastSyncDateStr = ' + lastSyncDateStr + '\n'
						+ ' lastSyncDatex = ' + lastSyncDatex + '\n'
						+ ' date = ' + date + ' dateStr = ' + dateStr + '\n'
						+ ' datex = ' + datex
			});
		} catch (err) {
			log.debug({
				title : err.name,
				details : err.message
			});
		}

		return {
			updatedRec : updatedRec,
			deletedRec : deletedRec
		};

	}

	/**
	 * Function called upon sending a PUT request to the RESTlet.
	 * 
	 * @param {string | Object} requestBody - The HTTP request body; request body will be passed into function as a string when request Content-Type is
	 *            'text/plain' or parsed into an Object when request Content-Type is 'application/json' (in which case the body must be a valid JSON)
	 * @returns {string | Object} HTTP response body; return string when request Content-Type is 'text/plain'; return Object when request Content-Type is
	 *          'application/json'
	 * @since 2015.2
	 */
	function doPut(requestBody) {

	}

	/**
	 * Function called upon sending a POST request to the RESTlet.
	 * 
	 * @param {string | Object} requestBody - The HTTP request body; request body will be passed into function as a string when request Content-Type is
	 *            'text/plain' or parsed into an Object when request Content-Type is 'application/json' (in which case the body must be a valid JSON)
	 * @returns {string | Object} HTTP response body; return string when request Content-Type is 'text/plain'; return Object when request Content-Type is
	 *          'application/json'
	 * @since 2015.2
	 */
	function doPost(requestBody) {

	}

	/**
	 * Function called upon sending a DELETE request to the RESTlet.
	 * 
	 * @param {Object} requestParams - Parameters from HTTP request URL; parameters will be passed into function as an Object (for all supported content types)
	 * @returns {string | Object} HTTP response body; return string when request Content-Type is 'text/plain'; return Object when request Content-Type is
	 *          'application/json'
	 * @since 2015.2
	 */
	function doDelete(requestParams) {

	}

	return {
		'get' : doGet,
		put : doPut,
		post : doPost,
		'delete' : doDelete
	};

});
