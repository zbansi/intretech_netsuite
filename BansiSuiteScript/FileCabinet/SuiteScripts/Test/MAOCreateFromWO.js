/**
 * @NApiVersion 2.x
 * @NScriptType UserEventScript
 * @author YQ12681
 */
define(
		[ 'N/record' ],
		function(record) {
			function beforeLoad(context) {
				var maoRecord = context.newRecord;
				var type = context.type;
				var form = context.form;
				if (type == context.UserEventType.CREATE) {
					var woid = context.request.woid;
					if (woid) {
						var rec = record.load({
							type : 'customrecord_yq_workorder_bs',
							id : woid
						});

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
								'custrecord_yq_mao_header_sourcewo_bs', woid);
						maoRecord.setValue(
								'custrecord_yq_mao_source_workshop_bs',
								workshop);
						maoRecord
								.setValue(
										'custrecord_yq_material_apply_requestor',
										clerk);
						maoRecord.setValue('custrecord_yq_warehouse_bansi',
								warehouse);

					}
				} else if (ype == context.UserEventType.VIEW){
					try {
						form.clientScriptModulePath = './BsPrintMAO.js';
						form.addButton({
							id : 'custpage_print_mao',
							label : '打印领料单',
							functionName : 'bs_print_mao'
						});
					
					log.debug({
						title : 'Success',
						details : '添加-打印领料单-按钮成功！'
					});
				} catch (ex) {
					log.debug({
						title : ex.name,
						details : ex.message
					});
				
					}
				}
			}

			return ({
				beforeLoad : beforeLoad
			});
		});
