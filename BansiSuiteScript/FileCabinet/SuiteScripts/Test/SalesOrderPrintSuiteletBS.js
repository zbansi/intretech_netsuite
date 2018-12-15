/**
 * @NApiVersion 2.x
 * @NScriptType Suitelet
 * @author YQ12681 Bansi ZHU Function Decription: 1）画页面：包含状态筛选字段（关闭，打开），单据子列表
 *         2）创建1个已保存销售订单搜索，将结果加载到新页面 3）新页面可以根据筛选字段动态加载订单记录
 */

define(
		[ 'N/ui/serverWidget', 'N/search' ],
		function(ui, search) {
			function onRequest(context) {
				if (context.request.method === 'GET') {
					// 新建表单
					var form = ui.createForm({
						title : 'Bansi 领料单批量打印'
					});

					try {
						var assistant = ui.createAssistant({
							title : 'url assistant'
						});
						assistant.clientScriptId = 'customscript_maoprint_statusfield_bs';
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
					// 添加筛选条件字段
					var statusField = form.addField({
						id : 'custpage_status_bs',
						label : '状态',
						type : ui.FieldType.SELECT
					});
					statusField.addSelectOption({
						value : '1',
						text : '未批准',
					});

					statusField.addSelectOption({
						value : '2',
						text : '已批准',
						isSelected : true
					});
					// 添加打印按钮
					form.addButton({
						id : 'custpage_print',
						label : '批量打印'
					});

					// 创建子列表
					var slt = form.addSublist({
						id : 'custpage_slt',
						label : '领料单',
						type : 'LIST'
					});
					/*
					 * try { // Adds a Mark All and an Unmark All button to a
					 * LIST type of // sublist. slt.addMarkAllButton();
					 * log.debug({ title : 'Success', details : '添加批量标记按钮正常' }); }
					 * catch (e1) { log.error({ title : e1.name, details :
					 * e1.message }); }
					 */

					slt.addField({
						id : 'custpage_checkbox',
						label : '选择',
						type : ui.FieldType.CHECKBOX
					});
					slt.addField({
						id : 'custpage_mtl_num',
						label : '领料单号',
						type : ui.FieldType.TEXT
					});
					slt.addField({
						id : 'custpage_mtl_date',
						label : '领料申请日期',
						type : ui.FieldType.DATE
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
						var status = context.request.parameters.status;
						log.debug({
							title : 'Success',
							details : 'status id = ' + status
						});

						if (status == '1') {
							flt.push(search.createFilter({
								name : 'custrecord_yq_ma_status_bansi',
								join : null,
								operator : search.Operator.ANYOF,
								formula : [ 'value:1', 'value:2', 'value:4',
										'value:5' ]
							}));

							log.debug({
								title : 'Success',
								details : 'status id = 1'
							});
						} else if (status == '2') {
							flt.push(search.createFilter({
								name : 'custrecord_yq_ma_status_bansi',
								join : null,
								operator : search.Operator.ANYOF,
								formula : [ 'value:3' ]
							}));
							log.debug({
								title : 'Success',
								details : 'status id = 1'
							});
						}

					} catch (es) {
						log.debug({
							title : es.name,
							details : es.message
						});
					}

					// 创建saved search
					var sr = search.create({
						type : 'customrecord_yq_material_apply_bansi',
						filters : flt,
						columns : [ 'name', 'custrecord_yq_apply_date_bansi',
								'custrecord_yq_material_apply_dept_bansi',
								'custrecord_yq_material_apply_requestor' ],
						title : 'Bansi mtl Order Search',
						id : 'customsearch_bansi_mtl_search'
					});

					if (sr == null)
						return;
					for (var i = 0; i < sr.length; i++) {
						var mtlNum = sr[i].getValue('name');
						var transDate = sr[i]
								.getValue('custrecord_yq_apply_date_bansi');
						var dept = sr[i]
								.getvalue('custrecord_yq_material_apply_dept_bansi');
						var owner = sr[i]
								.getValue('custrecord_yq_material_apply_requestor');
						slt.setLineItemValue('custpage_mtl_num', i + 1, mtlNum);
						slt.setLineItemValue('custpage_mtl_date', i + 1,
								transDate);
						slt.setLineItemValue('custpage_mtl_dept', i + 1, dept);
						slt
								.setLineItemValue('custpage_mtl_owner', i + 1,
										owner);
					}

					// 子列表根据筛选条件动态加载销售订单

					context.response.writePage(form);
				} else {

				}

			}
			return {
				onRequest : onRequest
			};
		});