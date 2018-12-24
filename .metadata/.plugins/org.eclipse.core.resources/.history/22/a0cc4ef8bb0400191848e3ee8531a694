/**
 * @NApiVersion 2.x
 * @NScriptType Suitelet
 * 
 */

/*
 * @author YQ12681 Bansi ZHU Function Decription: 
 * 
 * #1画页面：包含状态筛选字段（关闭，打开），单据子列表
 * 
 * #2创建1个已保存销售订单搜索，将结果加载到新页面
 * 
 * #3新页面可以根据筛选字段动态加载订单记录
 */
define([ 'N/ui/serverWidget', 'N/search' ], function(ui, search) {
	function onRequest(context) {
		if (context.request.method === 'GET') {
			// 新建表单
			var form = ui.createForm({
				title : 'Bansi 领料单批量打印'
			});

			try {
				form.clientScriptFileId = 30
				log.debug({
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

			try { // Adds a Mark All and an Unmark All button to a LIST type of sublist. 
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
			/*
			try {
				var flt = [];
				var status = context.request.parameters.status; // var status = //
				currentRecord.get().getValue;//currentRecord只能用于客户端执行的脚本
				log.debug({
					title : 'Success',
					details : 'request parameter status id = ' + status
				});
				if (status == '1') {

					flt.push(search.createFilter({
						name : 'custrecord_yq_ma_status_bansi',
						join : null,
						operator : search.Operator.ANYOF,
						formula : [ 'value:3' ]
					}));
					log
							.debug({
								title : 'Success',
								details : 'create filter success when status id = 1'
							});
				} else {
					flt.push(search.createFilter({
						name : 'custrecord_yq_ma_status_bansi',
						join : null,
						operator : search.Operator.ANYOF,
						formula : [ 'value:1', 'value:2', 'value:4',
								'value:5' ]
					}));

					log
							.debug({
								title : 'Success',
								details : 'create filter success when status ！= 1'
							});
				}
			} catch (es) {
				log.debug({
					title : es.name,
					details : es.message
				});
			}
			*/
			// 创建saved search
			try {

				/*
				var sr = search.create({
					type : 'customrecord_yq_material_apply_bansi',
					// filters : flt,
					columns : [ 'name', 'custrecord_yq_apply_date_bansi',
							'custrecord_yq_material_apply_dept_bansi',
							'custrecord_yq_material_apply_requestor' ],
					title : 'Customer Bansi MAO Print Search01',
					id : 'customsearch_bs_mao_search01'
				});
				
				sr.save();
				
				var mysearch = search.load({
					id : 'customsearch_bs_mao_search01'
				});
				var searchResult = mysearch.run().getRange({
					start : 0,
					end : 100
				});
				*/

				// on demand search, needn't title, id
				var searchResult = search.create(
						{
							type : 'customrecord_yq_material_apply_bansi',
							// filters : flt,
							columns : [ 'name',
									'custrecord_yq_apply_date_bansi',
									'custrecord_yq_material_apply_dept_bansi',
									'custrecord_yq_material_apply_requestor' ]
						}).run();
				log.debug({
					title : 'Success',
					details : 'Create saved search success'
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
					for (var i = 0; i < searchResult.length; i++) {
						var mtlNum = searchResult[i].getValue({name: 'name'});

						var transDate = searchResult[i]
								.getValue({name: 'custrecord_yq_apply_date_bansi'});
						if (transDate == false)
							transDate = '2018/12/16 23:23:23';
						var dept = searchResult[i]
								.getValue({name : 'custrecord_yq_material_apply_dept_bansi'});
						var owner = searchResult[i]
								.getValue({name : 'custrecord_yq_material_apply_requestor'});
					*/
					var i = 0;
					searchResult.each(function(result) {
						var mtlNum = result.getValue({
							name : 'name'
						});

						var transDate = result.getValue({
							name : 'custrecord_yq_apply_date_bansi'
						});
						if (transDate == false)
							transDate = '2018/12/16 23:23:23';
						var dept = result.getValue({
							name : 'custrecord_yq_material_apply_dept_bansi'
						});
						var owner = result.getValue({
							name : 'custrecord_yq_material_apply_requestor'
						});

						//Note that line indexing begins at 0 with SuiteScript 2.0
						slt.setSublistValue({
							id : 'custpage_mtl_num',
							line : i,
							value : mtlNum
						});
						slt.setSublistValue({
							id : 'custpage_mtl_date',
							line : i,
							value : transDate
						//如果为空如何处理,现在问题：空导值报错中断
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
						i ++;
						return true;
					});
					log.debug({
						title : 'Success',
						details : 'search result is not null'+ i
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
		} else {

		}

	}
	return {
		onRequest : onRequest
	};
});