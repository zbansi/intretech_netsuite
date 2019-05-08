/**
 * @NApiVersion 2.x
 * @author
 * PrintMAO.js
 */
////////////////////////Description///////////////////////
//
// ���塾��ӡ���ϵ����ķ���
// �˷��������ű���¼id�Ͳ���id, ����һ����suitelet�ĵ���URL
//
/////////////////////////////////////////////////////////
define([ 'N/url', 'N/currentRecord' ], function(url, currentRecord) {
    return ({
        yk_print_mao : function() {
            try {
                var record = currentRecord.get();
                var maosId = record.id;
                var u = url.resolveScript({
                    //PrintMAO.js
                    scriptId : 'customscript_printmao_suitelet_yk',
                    deploymentId : 'customdeploy_print_yk',
                    returnExternalUrl : false
                    // if true ������������ֱ�ӵ���ҳ��  https://forms.eu1.netsuite.com/app/site/hosting/scriptlet.nl
                    //?script=18&deploy=1&compid=5144758_SB1&h=2882965d29273aadff92&maoid=1
                    // if false ����

                });
                u += '&maosid=' + maosId;
                log.debug({
                    title : 'Success',
                    details : 'url�����ɹ�'
                });
            } catch (e1) {
                log.debug({
                    title : e1.name,
                    details : e1.message
                });
            }
            window.open(u);
        }
    });
});
