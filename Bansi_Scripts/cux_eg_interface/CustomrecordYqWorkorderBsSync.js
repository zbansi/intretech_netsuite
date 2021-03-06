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
			//GMT-8
			var dateNow = new Date().getTime();
			var tempDateinit = dateNow - 100 * 365 * 24 * 60 * 60 * 1000;
			var dateInit = new Date(tempDateinit);
			lastSyncDate = dateInit;
		}
		//格式化成字符串，并且由GMT-8转换为本地时间格式GMT+8
		//NS UI：与用户首选项设置的格式有关 YYYY/MM/DD hh:mm:ss  2019/01/02 21:10:24
		//eclipse: 默认日期格式 M/d/yyyy hh:mm:ss 1/4/2019 8:58:18
		var lastSyncDateStr = format.format({
			value : lastSyncDate,
			type : format.Type.DATETIME
		});

		//将原日期格式转换成可以匹配条件比较的yy/MM/dd H:mm格式
		//NS UI e.g. date value 2019/01/02 21:10:24 (must match yy/MM/dd H:mm)
		//eclipse e.g. date value 1/2/2019 21:11:14 (must match M/d/yy H:mm)

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
		var updatedRec = [];
		var deletedRec = [];

		/*
		 * 获取新增和更新记录 system_note
		 */
		try {
			var updatedRecColumns = [];
			var columnsName = [ 'date', 'recordtype', 'recordid', 'role',
					'record', 'context', 'type', 'field', 'oldvalue',
					'newvalue' ];

			for (var i = 0; i < columnsName.length; i++) {
				updatedRecColumns.push(search.createColumn({
					name : columnsName[i]
				}));
			}

			var updatedRecFilters = [];
			updatedRecFilters.push(search.createFilter({
				name : 'recordtype',
				operator : search.Operator.IS,
				values : 'customrecord_yq_workorder_bs'
			}));

			//			updatedRecFilters.push(search.createFilter({
			//				name : 'role',
			//				operator : search.Operator.IS,
			//				values : '1001'
			//			}));

			if (dataSyncType == '1') {//全量同步
				var updatedPagedData = search.create({
					type : search.Type.SYSTEM_NOTE,
					//filters : updatedRecFilters,
					columns : updatedRecColumns
				}).runPaged();
				updatedPagedData.pageRanges.forEach(function(pageRange) {
					var myPage = updatedPagedData.fetch({
						index : pageRange.index
					});
					myPage.data.forEach(function(result) {
						updatedRec.push(result);
					});
				});

			} else if (dataSyncType == '2') {//增量同步	

				updatedRecFilters.push(search.createFilter({
					name : 'date',
					operator : search.Operator.ONORAFTER,
					//接受的格式为M/d/yy H:mm
					values : lastSyncDatex
				}));
				var updatedPagedData = search.create({
					type : search.Type.SYSTEM_NOTE,
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
					});
				});
			}
			log.debug({
				title : 'Success1',
				details : 'updatedRec success! ***** ' + updatedRec.length
			});
		} catch (error) {
			log.debug({
				title : error.name,
				details : error.message
			});
		}

		/*
		 * 获取删除记录 deleted_record
		 */
		try {
			var deletedRecFilters = [];

			deletedRecFilters.push(search.createFilter({
				name : 'recordtype',
				operator : search.Operator.IS,
				values : 'customrecord_yq_workorder_bs'
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

				var deletedPagedData = search.create({
					type : search.Type.DELETED_RECORD,
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
					});
				});
			} else if (dataSyncType == '2') {//增量同步
				deletedRecFilters.push(search.createFilter({
					name : 'deleteddate',
					operator : search.Operator.ONORAFTER,
					//接受的格式为M/d/yy H:mm
					values : lastSyncDatex
				}));
				var deletedPagedData = search.create({
					type : search.Type.DELETED_RECORD,
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
					});
				});
			}
			log.debug({
				title : 'Success2',
				details : 'deletedRec success! ***** ' + deletedRec.length
			});
		} catch (error) {
			log.debug({
				title : error.name,
				details : error.message
			});
		}

		try {
			//load参数的id注意是deployment的internalId而不是ID
			//customdeploy_eai_systemlog_sync_if
			var scriptRecord = record.load({
				type : 'scriptdeployment',
				id : 443
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
		} catch (error) {
			log.debug({
				title : error.name,
				details : error.message
			});
		}
		var scriptObj = runtime.getCurrentScript();
		log.debug("Remaining governance units: "
				+ scriptObj.getRemainingUsage());
		return JSON.stringify({
			'updatedRec' : updatedRec,
			'deletedRec' : deletedRec
		});
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
