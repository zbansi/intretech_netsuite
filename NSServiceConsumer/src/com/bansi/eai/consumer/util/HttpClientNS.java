package com.bansi.eai.consumer.util;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.DatatypeConverter;

public class HttpClientNS {

	public static void main(String args[]) {
		// ���������ݲ�ѯSuitelet EXTERNAL URL for end point
		String url = "https://forms.eu1.netsuite.com/app/site/hosting/scriptlet.nl?script=55&deploy=1&compid=5144758_SB1&h=7a7fa4443278bf5defc6";
		// ���������ݲ�ѯRESTlet EXTERNAL URL for end point
		String urlNLAuth = "https://5144758-sb1.restlets.api.netsuite.com/app/site/hosting/restlet.nl?script=74&deploy=1";

		// �洢��ص�headerֵ
		Map<String, String> header = new HashMap<String, String>();

		// username:password--->���ʵ��û���������,��ʹ��base64���м��ܣ������ܵ��ֽ���Ϣת��Ϊstring���ͣ�encoding--->token
		/*
		String encoding = null;
		try {
			encoding = DatatypeConverter.printBase64Binary("kermit:kermit".getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		header.put("Authorization", "Basic " + encoding);
		*/
		String realm = "5144758_SB1"; // REALM
		String email = "377132229@qq.com";
		String signature = "Welcome123";
		int roleId = 1002;//�û���ɫ��Ҫ���ʻ�Ʒ��Ȩ��

		header.put("Content-Type", "application/json");
		header.put("Authorization",
				"NLAuth nlauth_account=" + realm + ", nlauth_email=" + email + ", nlauth_signature=" + signature + ", nlauth_role=" + roleId);

		//����Suitelet
		String response = HttpClientUtil.sendHttp(HttpRequestMethodEnum.HttpGet, url, null, null);
		//����RESTlet
		String responseNLAuth = HttpClientUtil.sendHttp(HttpRequestMethodEnum.HttpGet, urlNLAuth, null, header);
		// System.out.println(JSON.toJSONString(JSONObject.parseObject(response),
		// true));
		System.out.println("Suitelet: " + response);
		System.out.println("RESTlet: " + responseNLAuth);
	}
}