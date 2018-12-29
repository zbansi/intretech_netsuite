/**
 * @NApiVersion 2.x
 * @NScriptType UserEventScript
 * @author YQ12681 Bansi
 */
////////////////Function Description//////////////////
// #1 领料单页面加载前
// #1.1 如果是新建模式(type=CREATE),判断是否从工单自动创建
//		if true, 用工单数据初始化赋值领料单
//		if false, 手工填写赋值
// #1.2 如果是查看模式(type=VIEW),判断工单状态status
//		if status = 'APPROVED', 页面添加'打印领料单'按钮
//////////////////////////////////////////////////////
define(
		[ 'N/record' ],
		function(record) {
			function beforeLoad(context) {
				var maoRecord = context.newRecord;
				var type = context.type;
				var form = context.form;

				if (type == context.UserEventType.CREATE) {
					try {
						var woid = context.request.parameters.woid;
						if (woid) {
							var rec = record.load({
								type : 'customrecord_yq_workorder_bs',
								id : woid
							});
							//初始化赋值master
							var warehouse = rec.getValue({
								fieldId : 'custrecord_yq_workorder_shop_bs'
							});
							var clerk = rec.getValue({
								fieldId : 'custrecord_yq_workorder_lly_bs'
							});
							var workshop = rec.getValue({
								fieldId : 'custrecord_yq_workorder_dept_bs'
							});
							maoRecord.setValue(
									'custrecord_yq_mao_header_sourcewo_bs',
									woid);
							maoRecord.setValue(
									'custrecord_yq_mao_source_workshop_bs',
									workshop);
							maoRecord.setValue(
									'custrecord_yq_material_apply_requestor',
									clerk);
							maoRecord.setValue('custrecord_yq_warehouse_bansi',
									warehouse);
							maoRecord.setValue(
									'custrecord_yq_material_apply_note_bansi',
									'创建自工单:' + rec.getText({
										fieldId : 'name'
									}));

							//初始化赋值明细行
							//sublistid为recmach+子记录中作为外键到父记录的字段ID
							var sublistIdToSet = 'recmachcustrecord_yq_material_apply_detail_h_bs';
							var sublistIdToGet = 'recmachcustrecord_yq_workorder_detail_headid_bs';
							var count = rec.getLineCount(sublistIdToGet);
							for (var i = 0; i < count; i++) {
								maoRecord
										.setSublistValue(
												sublistIdToSet,
												'custrecord1',
												i,
												rec
														.getSublistValue(
																sublistIdToGet,
																'custrecord_yq_workorder_detail_item_bs',
																i));
								maoRecord
										.setSublistValue(
												sublistIdToSet,
												'custrecord_yq_material_apply_line_qyt_bs',
												i,
												rec
														.getSublistValue(
																sublistIdToGet,
																'custrecord_yq_workorder_detail_qty_bs',
																i));
							}
							log.debug({
								title : 'Success',
								details : '赋值成功：woid = ' + woid
										+ ', warehouse = ' + warehouse
										+ ', clerk = ' + clerk
										+ ', workshop = ' + workshop
										+ ', sublist = ' + rec.getSublist()
							});
						}

					} catch (e1) {
						log.debug({
							title : e1.name,
							details : e1.message
						});
					}
				} else if (type == context.UserEventType.VIEW) {
					var status = context.newRecord.getText({
						fieldId : 'custrecord_yq_ma_status_bansi'
					});
					try {
						if (status == '已批准' || status == 'APPROVED') {
							//绝对路径是文件柜完整路径
							form.clientScriptModulePath = '/SuiteScripts/Bansi_Scripts/lib/BsPrintMAO.js';
							form.addButton({
								id : 'custpage_print_mao',
								label : '打印领料单',
								functionName : 'bs_print_mao'
							});

							log.debug({
								title : 'Success',
								details : '添加-打印领料单-按钮成功！'
							});
						}
					} catch (ex) {
						log.debug({
							title : ex.name,
							details : ex.message
						});

					}
				}
			}

			function beforeSubmit(context) {
				if (context.type != context.UserEventType.CREATE)
					return;

			}

			return ({
				beforeLoad : beforeLoad,
				beforeSubmit : beforeSubmit
			});
		});