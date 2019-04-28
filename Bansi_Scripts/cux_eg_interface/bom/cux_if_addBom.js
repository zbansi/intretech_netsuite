/**
 * @NApiVersion 2.x
 * @NScriptType Restlet
 * @NModuleScope SameAccount
 * @author Zhu Yanlong
 */
/////////////////////////BOM接口数据写入NS///////////////////////
//
// 
//
//////////////////////////////////////////////////////////
define(
		[ 'N/record', 'N/search' ],
		function(record, search) {
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
						//THERE_IS_AN_OVERLAP_ON_THE_EFFECTIVE_DATE_BETWEEN_THIS_REVISION_AND_THE_FOLLOWING_REVISIONS__
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
				try {
					var r = createAndSaveBomAllRecord(requestBody);
					log.debug({
						title : 'success',
						details : JSON.stringify(r)
					})
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

			}

			return {
				'get' : doGet,
				put : doPut,
				post : doPost,
				'delete' : doDelete
			};
			/* JSON body data
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
		});
