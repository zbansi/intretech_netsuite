package com.bansi.webservices.samples.dao;

import java.rmi.RemoteException;

import javax.annotation.ParametersAreNonnullByDefault;

import com.bansi.webservices.samples.v2019_1.WsClient_2019_1;
import com.netsuite.webservices.lists.accounting_2019_1.Bom;
import com.netsuite.webservices.lists.accounting_2019_1.BomRevision;
import com.netsuite.webservices.platform.common_2019_1.BomRevisionSearchBasic;
import com.netsuite.webservices.platform.common_2019_1.BomSearchBasic;
import com.netsuite.webservices.platform.core_2019_1.RecordRef;
import com.netsuite.webservices.platform.core_2019_1.SearchMultiSelectField;
import com.netsuite.webservices.platform.core_2019_1.SearchResult;
import com.netsuite.webservices.platform.core_2019_1.SearchStringField;
import com.netsuite.webservices.platform.core_2019_1.types.RecordType;
import com.netsuite.webservices.platform.core_2019_1.types.SearchMultiSelectFieldOperator;
import com.netsuite.webservices.platform.core_2019_1.types.SearchStringFieldOperator;

@ParametersAreNonnullByDefault
public class Dao {
	private WsClient_2019_1 client;

	public Dao(WsClient_2019_1 client) {
		this.client = client;
	}

	public String getBomIdbyName(String pName) {
		SearchResult response = null;
		BomSearchBasic bomsb = new BomSearchBasic();
		SearchStringField name = new SearchStringField();
		name.setOperator(SearchStringFieldOperator.is);
		name.setSearchValue(pName);
		bomsb.setName(name);

		try {
			response = client.callSearch(bomsb);

		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Bom rec = (Bom) response.getRecordList().getRecord()[0];
		String internalId = rec.getInternalId();
		return internalId;
	}

	public String getBomRevisionIdbyNameJoinBomId(String pName, String pBomId) {
		SearchResult response = null;
		BomRevisionSearchBasic bomRevsb = new BomRevisionSearchBasic();
		SearchStringField name = new SearchStringField();
		name.setOperator(SearchStringFieldOperator.is);
		name.setSearchValue(pName);
		bomRevsb.setName(name);

		RecordRef bomRef = new RecordRef();
		bomRef.setInternalId(pBomId);
		bomRef.setType(RecordType.bom);
		SearchMultiSelectField smsf = new SearchMultiSelectField();
		smsf.setSearchValue(new RecordRef[]{bomRef});
		smsf.setOperator(SearchMultiSelectFieldOperator.anyOf);
		
		bomRevsb.setBillOfMaterials(smsf);
		

		try {
			response = client.callSearch(bomRevsb);

		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		BomRevision rec = (BomRevision) response.getRecordList().getRecord()[0];
		String internalId = rec.getInternalId();
		return internalId;
	}
}
