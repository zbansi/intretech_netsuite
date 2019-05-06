/**
 * @NApiVersion 2.x
 * @NScriptType Restlet
 * @NModuleScope SameAccount
 * @NAmdConfig ./config.json
 * @author Zhu Yanlong
 */
/////////////////////////BOM接口数据写入NS///////////////////////
//
// 
//
//////////////////////////////////////////////////////////
define(
		[ 'N/record', 'N/search', 'N/runtime', 'dao' ],
		function(record, search, runtime, dao) {
			//create and save BOM and BOM Reversion
			function getBomHeaderRecordId(bomName) {
				var filter = [];

				filter.push(search.createFilter({
					name : 'name',
					operator : search.Operator.IS,
					values : bomName
				}));

				var bom = search.create({
					type : search.Type.BOM,
					filters : filter
				}).run().getRange({
					start : 0,
					end : 1
				});
				log.debug({
					title : 'get bom internalid',
					details : bom
				});

				return bom[0].id;
			}

			function getBomRevisionRecordId(bomRevisionName) {
				var filter = [];

				filter.push(search.createFilter({
					name : 'name',
					operator : search.Operator.IS,
					values : bomRevisionName
				}));

				var bomRevision = search.create({
					type : search.Type.BOM_REVISION,
					filters : filter
				}).run().getRange({
					start : 0,
					end : 1
				});
				log.debug({
					title : 'get bomRevision internalid',
					details : bomRevision
				});

				return bomRevision[0].id;
			}

			function createAndSaveBomRecord(bomData) {

				var bomRecord = record.create({
					type : record.Type.BOM,
					isDynamic : true
				});
				for ( var key in bomData) {
					if (bomData.hasOwnProperty(key)) {
						bomRecord.setValue({
							fieldId : key,
							value : bomData[key]
						});
					}
				}
				try {
					return bomRecord.save({
						enableSourcing : false,
						ignoreMandatoryFields : false
					});
				} catch (e) {
					if (e.name == 'A_1_WITH_THIS_NAME_ALREADY_EXISTS_PLEASE_USE_ANOTHER') {
						log
								.debug({
									title : 'bom hearder has existed, go on to add bomrevision. '
											+ e.name,
									details : e.message
								});

						return getBomHeaderRecordId(bomData.name);
					} else

						log.debug({
							title : e.name,
							details : e.message
						});
				}

			}

			function createAndSaveBomReversionRecord(bomRevisionData,
					bomHeaderId) {

				var bomRevisionRecord = record.create({
					type : record.Type.BOM_REVISION,
					isDynamic : true
				});
				bomRevisionRecord.setValue({
					fieldId : 'billofmaterials',
					value : bomHeaderId
				});
				bomRevisionRecord.setValue({
					fieldId : 'effectivestartdate',
					value : new Date(978278400000) /*2001/1/1 上午12:00:00*/,
				});
				for ( var key in bomRevisionData) {
					if (bomRevisionData.hasOwnProperty(key)
							&& key != 'componentlist') {
						bomRevisionRecord.setValue({
							fieldId : key,
							value : bomRevisionData[key]
						});
					} else if (bomRevisionData.hasOwnProperty(key)
							&& key == 'componentlist') {

						var items = bomRevisionData[key];
						log.debug({
							title : 'success',
							details : items
						});
						for ( var itemIndex in items) {
							bomRevisionRecord.selectNewLine({
								sublistId : 'component'
							});

							for ( var listkey in items[itemIndex]) {
								if (items[itemIndex].hasOwnProperty(listkey)) {
									bomRevisionRecord.setCurrentSublistValue({
										sublistId : 'component',
										fieldId : listkey,
										value : items[itemIndex][listkey]
									});
								}
							}

							bomRevisionRecord.commitLine({
								sublistId : 'component'
							});
						}
					}
				}

				try {
					return bomRevisionRecord.save({
						enableSourcing : false,
						ignoreMandatoryFields : false
					});
				} catch (e) {
					if (e.name == 'THERE_IS_AN_OVERLAP_ON_THE_EFFECTIVE_DATE_BETWEEN_THIS_REVISION_AND_THE_FOLLOWING_REVISIONS__') {
						log.debug({
							title : 'bom revision has existed, return its id. '
									+ e.name,
							details : e.message
						});
						return getBomRevisionRecordId(bomRevisionData.name);
					} else
						log.debug({
							title : 'ERROR ' + e.name,
							details : e.message
						});
				}
			}

			function createAndSaveBomAllRecord(bomAllContent) {
				var result = [];
				var bomAllDataList = bomAllContent.bomAllData;
				bomAllDataList.forEach(function(bomAllData) {
					{
						var bomData = bomAllData.bomHeader;
						var bomRevisionData = bomAllData.bomRevision;
						var bomHeaderId = createAndSaveBomRecord(bomData);
						var bomRevisionId = createAndSaveBomReversionRecord(
								bomRevisionData, bomHeaderId);
						result.push({
							bomHeader : bomHeaderId,
							bomRevision : bomRevisionId
						});
					}
				});
				return result;
			}

			/**
			 * Function called upon sending a GET request to the RESTlet.
			 * 
			 * @param {Object} requestParams - Parameters from HTTP request URL; parameters will be passed into function as an Object (for all supported content
			 *            types)
			 * @returns {string | Object} HTTP response body; return string when request Content-Type is 'text/plain'; return Object when request Content-Type
			 *          is 'application/json'
			 * @since 2015.1
			 */
			function doGet(requestParams) {
				//				var recordType = 'bom';
				//				var filterList = [ [ 'name', 'is', 'EAI.TEST.190422A01-cBOM' ] ];
				//				var columnList = [ 'name', 'memo', ];
				log.debug({
					title : 'requestParams',
					details : requestParams
				});
				var filterList = [];
				var columnList = [];
				var columnRegExp = /.+/;
				var filterRegExp = /.+/;
				var fenceRegExp1 = /(\],)+|(,\[)+/;
				var fenceRegExp2 = /,/;
				try {
					var recordType = requestParams.recordType;
					//去除空格
					var filterListStr = requestParams.filterList.replace(
							/[""''\s]/g, '');
					//去除首尾方括号					
					filterListStr = filterListStr.replace(/\[{2,10}/g, '');
					filterListStr = filterListStr.replace(/\]{2,10}/g, '');
					log.debug({
						title : 'filterList replace',
						details : filterListStr
					});
					//将字符串转换成单个元素数组
					filterList = filterRegExp.exec(filterListStr);//返回数组
					log.debug({
						title : 'filterRegExp.exec',
						details : filterList
					});

					//以右方括号逗号|逗号左方括号为分隔符，将原数组元素映射转换成多个元素一维数组
					filterList = filterList.map(function(f) {//f是字符串
						return f.split(fenceRegExp1);
					});
					log.debug({
						title : 'filterList.map1',
						details : filterList
					});
					//过滤掉数组中的"","],",",[",","
					filterList = filterList[0].filter(function(e) {
						if (e != "" && e != "]," && e != ",[" && e != ",")
							return e;
					});
					log.debug({
						title : 'filterList filter',
						details : filterList
					});
					//将一维数组中的偶数索引的元素按逗号分隔映射转换成数组
					filterList = filterList.map(function(f) {//f是数组
						if (filterList.indexOf(f) % 2)
							return f;
						else
							return f.split(fenceRegExp2);
					});
					log.debug({
						title : 'filterList.map2',
						details : filterList
					});

					var columnListStr = requestParams.columnList.replace(
							/[""''\s]/g, '');

					columnListStr = columnListStr.replace(/\[+/g, '');
					columnListStr = columnListStr.replace(/\]+/g, '');

					log.debug({
						title : 'columnList replace 1',
						details : columnListStr
					});
					columnList = columnRegExp.exec(columnListStr);//返回数组
					log.debug({
						title : 'columnList regexp',
						details : columnList
					});
					columnList = columnList.map(function(f) {//f是数组
						return f.split(",");
					})[0];

					log.debug({
						title : 'columnList map',
						details : columnList
					});

					return {
						"resultSet" : dao.getSearchResultSet(recordType,
								filterList, columnList)
					};
				} catch (e) {
					log.debug({
						title : 'doGet Error :' + e.name,
						details : e.message
					});
				}
			}

			/**
			 * Function called upon sending a PUT request to the RESTlet.
			 * 
			 * @param {string | Object} requestBody - The HTTP request body; request body will be passed into function as a string when request Content-Type is
			 *            'text/plain' or parsed into an Object when request Content-Type is 'application/json' (in which case the body must be a valid JSON)
			 * @returns {string | Object} HTTP response body; return string when request Content-Type is 'text/plain'; return Object when request Content-Type
			 *          is 'application/json'
			 * @since 2015.2
			 */
			function doPut(requestBody) {

			}

			/**
			 * Function called upon sending a POST request to the RESTlet.
			 * 
			 * @param {string | Object} requestBody - The HTTP request body; request body will be passed into function as a string when request Content-Type is
			 *            'text/plain' or parsed into an Object when request Content-Type is 'application/json' (in which case the body must be a valid JSON)
			 * @returns {string | Object} HTTP response body; return string when request Content-Type is 'text/plain'; return Object when request Content-Type
			 *          is 'application/json'
			 * @since 2015.2
			 */
			function doPost(requestBody) {
				var scriptObj = runtime.getCurrentScript();
				log.debug("Remaining governance units: "
						+ scriptObj.getRemainingUsage());
				try {
					var r = createAndSaveBomAllRecord(requestBody);
					log.debug({
						title : 'addSuccess',
						details : JSON.stringify(r)
					});

					log.debug("Remaining governance units: "
							+ scriptObj.getRemainingUsage());
					return {
						'isSuccess' : true,
						'bomData' : r
					}
				} catch (e) {
					log.debug({
						title : 'Post bom error: ' + e.name,
						details : e.message

					})
				}
			}

			/**
			 * Function called upon sending a DELETE request to the RESTlet.
			 * 
			 * @param {Object} requestParams - Parameters from HTTP request URL; parameters will be passed into function as an Object (for all supported content
			 *            types)
			 * @returns {string | Object} HTTP response body; return string when request Content-Type is 'text/plain'; return Object when request Content-Type
			 *          is 'application/json'
			 * @since 2015.2
			 */
			function doDelete(requestParams) {
				log.debug({
					title : "deleteRequestParams: ",
					details : requestParams
				});
				try {
					var deleteResult = dao.deleteRecords(
							requestParams.recordType, requestParams.recordId
									.split(","));
					//					var deleteRecordId = dao.deleteRecord(
					//							requestParams.recordType, requestParams.recordId);
					log.debug({
						title : 'addSuccess',
						details : deleteResult
					});
					return {
						deletedBOMId : deleteResult
					};

				} catch (e) {
					log.debug({
						title : 'delelteError ' + e.name,
						details : e.message
					})
				}

			}

			return {
				'get' : doGet,
				put : doPut,
				post : doPost,
				'delete' : doDelete
			};
			/* POST Method: 报文传参格式
			 * JSON body data
			{"bomAllData": [{
			"bomHeader": {
			"availableforallassemblies": false,
			"availableforalllocations": true,
			"includechildren": true,
			"memo": "EAI.TEST.190422A01-cBOM",
			"name": "EAI.TEST.190422A01-cBOM",
			"restricttoassemblies": "572",
			"subsidiary": "1",
			"usecomponentyield": true,
			"usedonassembly": true
			},
			"bomRevision": {
			"memo": "EAI.TEST.190422A01-cBOM v0.1",
			"name": "v0.1",
			"effectiveenddate": "",
			"componentlist": [
			{
			    "bomquantity": 3,
			    "componentyield": 99.8,
			    "item": 368,
			    "itemsource": ""
			},
			{
			    "bomquantity": 5,
			    "componentyield": 100,
			    "item": 369,
			    "itemsource": ""
			}
			]
			}
			},{
			"bomHeader": {
			"availableforallassemblies": false,
			"availableforalllocations": true,
			"includechildren": true,
			"memo": "EAI.TEST.190422A01-mBOM",
			"name": "EAI.TEST.190422A01-mBOM",
			"restricttoassemblies": "572",
			"subsidiary": "1",
			"usecomponentyield": true,
			"usedonassembly": true
			},
			"bomRevision": {
			"memo": "EAI.TEST.190422A01-mBOM v0.3",
			"name": "v0.3",
			"effectiveenddate": "",
			"componentlist": [
			{
			    "bomquantity": 3,
			    "componentyield": 99.8,
			    "item": 368,
			    "itemsource": ""
			},
			{
			    "bomquantity": 5,
			    "componentyield": 100,
			    "item": 369,
			    "itemsource": ""
			}
			]
			}
			}]}
			 */

			/* GET Method: 报文传参格式
			 * recordType: string
			 * filterList: 混合二维数据，偶数元素是长度2或3的一维数据（谓词要素），奇数元素是逻辑运算符
			 * columnList: 一维数据
			 * 
			 * recordType=bom&filterList=[[ 'name','contains','EAI'],'and',[ 'memo','contains','EAI']]&columnList=['name','memo']
			 * {"recordType":"bom","columnList":"['name','memo']","filterList":"[[ 'name','contains','EAI'],'and',[ 'memo','contains','EAI']]"}
			 * 
			 */

			/* DELETE Method 报文传参格式
			 * recordType: string
			 * recordId: string 多个id以逗号分隔
			 * 
			 */
		});