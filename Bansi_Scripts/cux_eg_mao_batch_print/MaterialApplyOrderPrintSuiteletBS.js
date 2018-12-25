/**
 * @NApiVersion 2.x
 * @NScriptType Suitelet
 * @author YQ12681 Bansi ZHU
 */
// //////////////////Function Decription////////////////////
// name: 领料单批量打印
// 
// #1 画表单：包含状态筛选字段（关闭，打开），单据子列表
// #2 创建1个已保存领料单搜索，将结果加载到新页面
// #3 新页面可以根据筛选字段动态加载领料单记录
//
// currentRecord不能用在suitelet中,也不能用以下模块化方式调用加载了
// currentRecord的ClientScript
// @NAmdConfig /SuiteScripts/Bansi_Scripts/configuration.json
//
// ////////////////////////////////////////////////////////
define(
		[ 'N/ui/serverWidget', 'N/search', 'N/record', 'N/render' ],
		function(ui, search, record, render) {
			function onRequest(context) {
				// if method = GET，调用Suitelet输出或刷新图形界面
				if (context.request.method === 'GET') {
					// #1 新建表单
					var form = ui.createForm({
						title : 'Bansi 领料单批量打印'
					});

					try {
						//两种调用客户端脚本的方式
						//form.clientScriptFileId = 30
						//相对路径 相对当前文件同目录
						form.clientScriptModulePath = './MAOPrintStatusFieldChangedBs.js';
						log
								.debug({
									title : 'Success',
									details : '加载脚本customscript_maoprint_statusfield_bs成功'
								});
					} catch (ea) {
						log.debug({
							title : ea.name,
							details : ea.message
						});
					}

					var status = context.request.parameters.status;

					// 添加筛选条件字段
					var statusField = form.addField({
						id : 'custpage_status_bs',
						label : '状态',
						type : ui.FieldType.SELECT
					});
					statusField.addSelectOption({
						value : 'None_Approved',
						text : '未批准',
					});

					statusField.addSelectOption({
						value : 'Approved',
						text : '已批准',
						isSelected : true
					});
					// 以URL参数，给字段初始化赋值
					if (status == 'Approved')
						statusField.defaultValue = 'Approved';
					else if (status == 'None_Approved')
						statusField.defaultValue = 'None_Approved';

					//form.clientScriptModulePath = './BsBatchPrintMAO.js';

					// 添加打印按钮
					// Suitelet不能调用含currentRecord模块的脚本,可以用http模块

					/*form.addButton({
						id : 'custpage_print',
						label : '批量打印',
						functionName : 'bs_batch_print_mao'
					});
					*/
					form.addSubmitButton({
						label : '批量打印'
					});

					// 创建子列表
					var slt = form.addSublist({
						id : 'custpage_slt',
						label : '领料单',
						type : 'LIST'
					});

					try { // Adds a Mark All and an Unmark All button to a
						// LIST type of sublist.
						slt.addMarkAllButtons();
						log.debug({
							title : 'Success',
							details : '添加批量标记按钮正常'
						});
					} catch (e1) {
						log.error({
							title : e1.name,
							details : e1.message
						});
					}

					slt.addField({
						id : 'custpage_checkbox',
						label : '选择',
						type : ui.FieldType.CHECKBOX
					});
					slt.addField({
						id : 'custpage_mtl_id',
						label : '领料单Id',
						type : ui.FieldType.TEXT
					});
					slt.addField({
						id : 'custpage_mtl_num',
						label : '领料单号',
						type : ui.FieldType.TEXT
					});
					slt.addField({
						id : 'custpage_mtl_date',
						label : '领料申请日期',
						type : ui.FieldType.DATETIMETZ
					});
					slt.addField({
						id : 'custpage_mtl_dept',
						label : '领料部门',
						type : ui.FieldType.TEXT
					});
					slt.addField({
						id : 'custpage_mtl_owner',
						label : '领料人',
						type : ui.FieldType.TEXT
					});

					// 创建筛选器
					try {
						var flt = [];
						if (status == 'Approved' || !status) {

							/*
							 * flt.push(search.createFilter({ name :
							 * 'customsearch_bansi_mtl_search',//必填 join : null,
							 * operator : search.Operator.ANYOF, formula : [
							 * 'value:3' ] }));
							 */
							flt.push([ 'custrecord_yq_ma_status_bansi',
									search.Operator.ANYOF, '3' ]);

							log
									.debug({
										title : 'Success',
										details : 'create filter success when status id = Approved '
												+ flt
									});
						} else if (status == 'None_Approved') {
							/*
							 * flt.push(search .createFilter({ name :
							 * 'customsearch_bansi_mtl_search', join : null,
							 * operator : search.Operator.ANYOF, formula : [
							 * 'value:1', 'value:2', 'value:4', 'value:5' ] }));
							 */
							flt.push([ 'custrecord_yq_ma_status_bansi',
									search.Operator.ANYOF,
									[ '1', '2', '4', '5' ] ]);
							log
									.debug({
										title : 'Success',
										details : 'create filter success when status = None_Approved '
												+ flt
									});
						}
					} catch (es) {
						log.debug({
							title : es.name,
							details : es.message
						});
					}

					// 创建saved search
					try {

						/*
						 * var sr = search.create({ type :
						 * 'customrecord_yq_material_apply_bansi', // filters :
						 * flt, columns : [ 'name',
						 * 'custrecord_yq_apply_date_bansi',
						 * 'custrecord_yq_material_apply_dept_bansi',
						 * 'custrecord_yq_material_apply_requestor' ], title :
						 * 'Customer Bansi MAO Print Search01', id :
						 * 'customsearch_bs_mao_search01' });
						 * 
						 * sr.save();
						 * 
						 * var mysearch = search.load({ id :
						 * 'customsearch_bansi_mtl_search' }); var searchResult =
						 * mysearch.run().getRange({ start : 0, end : 100 });
						 */
						// on demand search, needn't title, id
						var searchResult = search
								.create(
										{
											type : 'customrecord_yq_material_apply_bansi',
											columns : [
													'internalid',
													'name',
													'custrecord_yq_apply_date_bansi',
													'custrecord_yq_material_apply_dept_bansi',
													'custrecord_yq_material_apply_requestor' ],
											filters : flt
										// filters
										// 可以是search.Filter[]对象，也可以是filterExpression
										// object[]
										}).run();

						log.debug({
							title : 'Success',
							details : 'Create or load saved search success'
						});
					} catch (ess) {
						log.debug({
							title : ess.name,
							details : ess.message
						})
					}
					try {
						if (searchResult) {

							// 遍历的两种写法
							/*
							 * for (var i = 0; i < searchResult.length; i++) {
							 * var mtlNum = searchResult[i].getValue({name:
							 * 'name'});
							 * 
							 * var transDate = searchResult[i] .getValue({name:
							 * 'custrecord_yq_apply_date_bansi'}); if (transDate ==
							 * false) transDate = '2018/12/16 23:23:23'; var
							 * dept = searchResult[i] .getValue({name :
							 * 'custrecord_yq_material_apply_dept_bansi'}); var
							 * owner = searchResult[i] .getValue({name :
							 * 'custrecord_yq_material_apply_requestor'});
							 */
							var i = 0;
							searchResult
									.each(function(result) {
										var mtlId = result.getValue({
											name : 'internalid'
										});
										var mtlNum = result.getValue({
											name : 'name'
										});

										var transDate = result
												.getValue({
													name : 'custrecord_yq_apply_date_bansi'
												});
										if (transDate == false)
											transDate = '2018/12/16 23:23:23';
										var dept = result
												.getText({
													name : 'custrecord_yq_material_apply_dept_bansi'
												});
										var owner = result
												.getText({
													name : 'custrecord_yq_material_apply_requestor'
												});

										// Note that line indexing begins at 0
										// with SuiteScript 2.0
										slt.setSublistValue({
											id : 'custpage_mtl_id',
											line : i,
											value : mtlId
										});
										slt.setSublistValue({
											id : 'custpage_mtl_num',
											line : i,
											value : mtlNum
										});
										slt.setSublistValue({
											id : 'custpage_mtl_date',
											line : i,
											value : transDate
										// 如果为空如何处理,现在问题：空导值报错中断
										});
										slt.setSublistValue({
											id : 'custpage_mtl_dept',
											line : i,
											value : dept
										});
										slt.setSublistValue({
											id : 'custpage_mtl_owner',
											line : i,
											value : owner
										});
										i++;
										return true;
									});
							log.debug({
								title : 'Success',
								details : 'search result is not null' + i
							});
						} else
							log.debug({
								title : 'Success',
								details : 'search result is null'
							});

					} catch (esr) {
						log.debug({
							title : esr.name,
							details : esr.message
						});
					}

					// 子列表根据筛选条件动态加载销售订单
					context.response.writePage(form);
				}
				// if method != GET，获取当前页面被选择的领料申请ID，将其详细信息循环打印
				else {
					try {
						var count = context.request.getLineCount({
							group : 'custpage_slt'
						});

						var maoIdArray = [];
						for (var i = 1; i <= count; i++) {
							if (context.request.getSublistValue({
								group : 'custpage_slt',
								name : 'custpage_checkbox',
								line : i
							}) == 'T') {
								var eachMaoId = context.request
										.getSublistValue({
											group : 'custpage_slt',
											name : 'custpage_mtl_id',
											line : i
										});
								maoIdArray.push(eachMaoId);
							}
						}
						log.debug({
							title : 'Success',
							details : 'count = ' + count + ' maoIdArray= '
									+ JSON.stringify(maoIdArray)
						});

						var xmlStr = '';
						//xml定义打印模板
						xmlStr += '<?xml version="1.0"?><!DOCTYPE pdf PUBLIC "-//big.faceless.org//report" "report-1.1.dtd">';
						xmlStr += '<pdf>';
						//加载领料申请记录到模板
						for (var i = 0; i < maoIdArray.length; i++) {
							var rec = record.load({
								type : 'customrecord_yq_material_apply_bansi',
								id : maoIdArray[i]
							});
							var maoNumber = rec.getText('name');
							//模板数据循环
							xmlStr += '<head>';
							xmlStr += '</head>';
							xmlStr += '<body padding="0.5in 0.5in 0.5in 0.5in" size="Letter">';
							xmlStr += '<table style="width: 100%; font-size: 10pt;">';
							xmlStr += '<tr><td>' + maoNumber + '</td></tr>';
							xmlStr += '</table></body>';
						}
						xmlStr += '</pdf>'
						//xml转成pdf文件
						var pdfFile = render.xmlToPdf({
							xmlString : xmlStr
						});

						//输出文件
						context.response.writeFile({
							file : pdfFile,
							isInline : true
						});

					} catch (e1) {
						log.debug({
							title : e1.name,
							details : e1.message
						});
					}

				}

			}
			return {
				onRequest : onRequest
			};
		});