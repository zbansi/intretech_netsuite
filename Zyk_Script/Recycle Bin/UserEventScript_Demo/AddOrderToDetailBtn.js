/**
 * @NApiVersion 2.x
 * @author
 * AddOrderToDetailBtn.js
 */

define(['N/url', 'N/currentRecord'], function (url, rec) {
    return ({
        OrderToDetail: function (context) {
            try {
                var uD = url.resolveRecord({
                    recordType: 'customrecord_apply_stores_yk',
                    recordId: '',
                    isEditMode: true
                });

                log.debug({
                    title: 'Success',
                    details: 'URL�����ɹ�'
                })

            } catch (e) {
                log.debug({
                    title: e.name + '-1',
                    details: e.message
                })
            }

            try {
                var record = rec.get();
                var woid = record.id;
                log.debug({
                    title: 'Success',
                    details: '��ȡID�ɹ�Ϊ' + woid
                })

            } catch (e2) {
                log.debug({
                    title: e2.name + '-2',
                    details: e2.message
                })
            }
            // alert(uD + '&woid=' + woid);
            window.location.href = uD + '&woid=' + woid;
        }
    })
});