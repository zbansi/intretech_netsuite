/**
 * @NApiVersion 2.x
 * @NScriptType ScheduledScript
 * @author YQ12681
 */
define(
		[ 'N/search', 'N/runtime', 'N/record', 'N/email' ],
		function(search, runtime, record, email) {
			function execute(context) {
				//if (context.type != context.InvocationType.ON_DEMAND)
				//return;
				var searchId = runtime.getCurrentScript().getParameter(
						"custscriptcustomsearch_bansi_mtl_search");
				try {
					var maoRec = search.load({
						id : searchId
					}).run().getRange({
						start : 0,
						end : 13
					});
					log.debug({
						title : 'Success',
						details : 'maoRec = ' + JSON.stringify(maoRec)
					});
					for (var i = 0; i < maoRec.length; i++) {
						try {
							var maoRecord = null;//每次都要置空，否则报错“记录已经被更改”
							maoRecord = record.load({
								type : 'customrecord_yq_material_apply_bansi',
								id : maoRec[i].id
							});
							log.debug({
								title : 'Success',
								details : 'maoRec id = ' + maoRec[i].id
							});
						} catch (er) {
							if (er.code == 'RCRD_LOCKED_BY_WF') // Check what kind of error is thrown, in this case its locked record by a workflow
							{
								continue; // If true, then skipped this record and continue on the next record
							}
						}
						if (maoRecord) {//当记录被锁定时，以下语句不执行
							var count = maoRecord
									.getLineCount('recmachcustrecord_yq_material_apply_detail_h_bs');
							for (var j = 0; j < count; j++) {
								maoRecord
										.setSublistValue({
											sublistId : 'recmachcustrecord_yq_material_apply_detail_h_bs',
											fieldId : 'custrecord_yq_material_apply_line_use_bs',
											line : j,
											value : 'init-for '+ Date()
										});

							}
							maoRecord.save();
							log.debug({
								title : 'Success',
								details : 'MAO编号：' + maoRecord.id + ' count = '
										+ count
							});
						}
					}

					/*search
							.load({
								id : searchId
							})
							.run()
							.each(
									function(result) {

										var maoRecord = record
												.load({
													type : 'customrecord_yq_material_apply_bansi',
													id : result.id
												});
										var count = 0;
										if (maoRecord) {
											count = maoRecord
													.getLineCount('recmachcustrecord_yq_material_apply_detail_h_bs');
											for (var i = 0; i < count; i++) {
												maoRecord
														.setSublistValue({
															sublistId : 'recmachcustrecord_yq_material_apply_detail_h_bs',
															fieldId : 'custrecord_yq_material_apply_line_use_bs',
															line : i,
															value : 'init'
														});

											}
											maoRecord.save();
										}
										log.debug({
											title : 'Success',
											details : 'MAO编号：' + maoRecord.id
													+ ' count = ' + count
										});
										return true;

									});
					*/
				} catch (e) {

					var subject = '更新领料申请单行用途字段失败！';
					var authorId = 5;
					var recipientEmail = 'xmzyl@intretech.com';
					email.send({
						author : authorId,
						recipients : recipientEmail,
						subject : subject,
						body : '脚本中出现错误：' + runtime.getCurrentScript().id
								+ JSON.stringify(e)

					});

					log.debug({
						title : e.name,
						details : e.message
					});
				}
			}

			return {
				execute : execute
			}
		});