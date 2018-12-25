/**
 * @NApiVersion 2.x
 * @author Bansi
 */

require([ 'N/search' ], function(search) {
	function maoSaveSearchCreate() {
		var sr = search.create({
			type : 'customrecord_yq_material_apply_bansi',
			// filters : flt,
			columns : [ 'name', 'custrecord_yq_apply_date_bansi',
					'custrecord_yq_material_apply_dept_bansi',
					'custrecord_yq_material_apply_requestor' ],
			title : 'Customer Bansi MAO Print Search',
			id : 'customsearch_bs_mao_search'
		});

		sr.save();
	}
	maoSaveSearchCreate();

})
