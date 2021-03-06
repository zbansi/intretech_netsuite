package com.bansi.webservices.samples.test;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

import java.io.IOException;

import com.bansi.webservices.samples.v2019_1.JSONContent;
import com.netsuite.webservices.lists.accounting_2019_1.Bom;
import com.netsuite.webservices.platform.core_2019_1.RecordRef;
import com.netsuite.webservices.platform.core_2019_1.RecordRefList;
import com.netsuite.webservices.platform.core_2019_1.types.RecordType;

public class Test {

	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		//		//new FileInputStream("interfacedata.json");
		//		BufferedInputStream in = null;
		//		try {
		//			in = new BufferedInputStream(new FileInputStream("interface_data.json"));
		//		} catch (FileNotFoundException e) {
		//			// TODO Auto-generated catch block
		//			e.printStackTrace();
		//		}
		//		String object = "";
		//		try {
		//			while (in.available() != 0) {
		//				//System.out.print((char) in.read());
		//				object += (char) in.read();
		//			}
		//		} catch (IOException e) {
		//			// TODO Auto-generated catch block
		//			e.printStackTrace();
		//		}
		//
		//		//
		//		System.out.println("object: \n" + object);
		//		JSONObject jsonObject = JSONObject.fromObject(object);
		JSONArray bomJsonArray = JSONContent.fromJSONFile("interface_data.json", "bomAllData");

		for (int i = 0; i < bomJsonArray.size(); i++) {
			JSONObject bomJsonObject = bomJsonArray.getJSONObject(i);

			Object p_bomRevision = bomJsonObject.get("bomRevision");
			Object p_subsidiaryList = bomJsonObject.get("subsidiaryList");
			Object p_restrictToAssembliesList = bomJsonObject.get("restrictToAssembliesList");

			bomJsonObject = bomJsonObject.discard("bomRevision");
			bomJsonObject = bomJsonObject.discard("subsidiaryList");
			bomJsonObject = bomJsonObject.discard("restrictToAssembliesList");

			//restrictToAssembliesList
			/*
			RecordRef assembly = new RecordRef();
			assembly.setInternalId(bomJsonObject.getString("restrictToAssembliesList"));
			assembly.setType(RecordType.assemblyItem);
			RecordRefList restrictToAssembliesList = new RecordRefList();
			restrictToAssembliesList.setRecordRef(new RecordRef[] { assembly });
			bomJsonObject = bomJsonObject.discard("restrictToAssembliesList");
			//不支持添加自定义的值类型
			bomJsonObject = bomJsonObject.elementOpt("restrictToAssembliesList", restrictToAssembliesList);
			*/

			//subsidiaryList
			/*
			RecordRef subsidiary = new RecordRef();
			subsidiary.setInternalId(bomJsonObject.getString("subsidiaryList"));
			subsidiary.setType(RecordType.subsidiary);
			RecordRefList subsidiaryList = new RecordRefList();
			subsidiaryList.setRecordRef(new RecordRef[] { subsidiary });
			
			bomJsonObject = bomJsonObject.element("subsidiaryList", subsidiaryList);
			*/

			JsonConfig jsonConfig = new JsonConfig();
			jsonConfig.setRootClass(Bom.class);
			Bom newBom = (Bom) JSONObject.toBean(bomJsonObject, jsonConfig);

			System.out.println(newBom.toString());
			System.out.println(newBom.getName());
			System.out.println(newBom.getMemo());
			System.out.println(newBom.getAvailableForAllAssemblies());
			System.out.println(newBom.getAvailableForAllLocations());
			System.out.println(newBom.getIncludeChildren());
			System.out.println(newBom.getRestrictToAssembliesList());
			System.out.println(newBom.getSubsidiaryList());
			System.out.println(newBom.getRestrictToLocationsList());

			//restrictToAssembliesList		
			RecordRef assembly = new RecordRef();
			assembly.setInternalId(p_restrictToAssembliesList.toString());
			assembly.setType(RecordType.assemblyItem);
			RecordRefList restrictToAssembliesList = new RecordRefList();
			restrictToAssembliesList.setRecordRef(new RecordRef[] { assembly });
			newBom.setRestrictToAssembliesList(restrictToAssembliesList);

			//subsidiaryList
			RecordRef subsidiary = new RecordRef();
			subsidiary.setInternalId(p_subsidiaryList.toString());
			subsidiary.setType(RecordType.subsidiary);
			RecordRefList subsidiaryList = new RecordRefList();
			subsidiaryList.setRecordRef(new RecordRef[]{subsidiary});
			newBom.setSubsidiaryList(subsidiaryList);

			System.out.println(newBom.getRestrictToAssembliesList());
			System.out.println(newBom.getSubsidiaryList());

		}
		long time = System.currentTimeMillis() - start;
		System.out.println("TIME: " + time + " ms");

	}
}
