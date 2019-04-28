/**
 * @NApiVersion 2.x
 * @author
 */
////////////////Description//////////////
//
// 定义【生成领料单】按钮的方法
// 此方法生成并打开一个新URL
//
////////////////////////////////////////
define([ 'N/url', 'N/currentRecord' ], function(url, currentRecord) {
    return ({
        create_mao_url : function() {
            try {
                var u = url.resolveRecord({
                    recordType : 'customrecord_apply_stores_yk',
                    recordId : '',
                    isEditMode : true
                });
                log.debug({
                    title : 'Success',
                    details : 'url解析成功'
                });
            } catch (e1) {
                log.debug({
                    title : e1.name,
                    details : e1.message
                });
            }
            try {
                var record = currentRecord.get();
                var woid = record.id;
                /*var status = record.getValue({
                    fieldId : 'custrecord_yq_workorder_status_bs'
                });*/
                log.debug({
                    title : 'Success',
                    details : '获取记录id =' + woid //+ ' status = ' + status
                });
            } catch (e2) {
                log.debug({
                    title : e2.name,
                    details : e2.message
                });
            }
            try {
                //if (status == 'APPROVED')
                window.location.href = u + '&woid=' + woid;
                log.debug({
                    title : 'Success',
                    details : 'url创建成功'
                });
            } catch (e3) {
                log.debug({
                    title : e3.name,
                    details : e3.message
                });
            }
        }
    });
});
