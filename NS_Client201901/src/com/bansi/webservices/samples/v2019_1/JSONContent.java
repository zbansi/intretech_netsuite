package com.bansi.webservices.samples.v2019_1;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JSONContent {

	public JSONContent() {

	}

	public static JSONArray fromJSONFile(String fileName, String recordType) {
		BufferedInputStream in = null;
		try {
			in = new BufferedInputStream(new FileInputStream(fileName));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String object = "";
		try {
			while (in.available() != 0) {
				//System.out.print((char) in.read());
				object += (char) in.read();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		JSONObject jsonObject = JSONObject.fromObject(object);
		JSONArray JsonArray = jsonObject.getJSONArray(recordType);
		return JsonArray;

	}

}
