package com.bansi.webservices.samples.test;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

import java.io.FileInputStream;

import com.netsuite.webservices.lists.accounting_2019_1.Bom;

public class Test {

	new FileInputStream("interfacedata.json");
	private static final Class Bom = null;

	public static void main(String[] args) {
		JSONObject jsonObject = new JSONObject();
		JSONArray jsonArray = new JSONArray();
		 JsonConfig jsonConfig = new JsonConfig(); 
		 jsonConfig.setRootClass(Bom);
		jsonObject.toBean(jsonObject, jsonConfig);
		
	}
}
