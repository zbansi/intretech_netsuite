package com.bansi.eai.consumer.util;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.DatatypeConverter;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class HttpClientNS {

	public static void main(String args[]) {
		String url = "https://forms.eu1.netsuite.com/app/site/hosting/scriptlet.nl?script=55&deploy=1&compid=5144758_SB1&h=7a7fa4443278bf5defc6";
		// 存储相关的header值
		Map<String, String> header = new HashMap<String, String>();
		// username:password--->访问的用户名，密码,并使用base64进行加密，将加密的字节信息转化为string类型，encoding--->token
		String encoding = null;
		try {
			encoding = DatatypeConverter.printBase64Binary("kermit:kermit".getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		header.put("Authorization", "Basic " + encoding);

		String response = HttpClientUtil.sendHttp(HttpRequestMethodEnum.HttpGet, url, null, header);
		// System.out.println(JSON.toJSONString(JSONObject.parseObject(response),
		// true));
		System.out.println(response);
	}
}
