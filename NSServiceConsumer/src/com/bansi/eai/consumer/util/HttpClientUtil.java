package com.bansi.eai.consumer.util;

import com.alibaba.fastjson.JSON;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.*;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.Map;

/**
 * @author jreffchen
 */
public class HttpClientUtil {

	/**
	 * httpclientʹ�ò��� 
	 * 1������һ��HttpClient����;
	 * 2������һ��Http����������������URL������GET����ʹ���һ��HttpGet����POST����ʹ���һ��HttpPost����;
	 * 3�������Ҫ��������������������ͷ������Ҳ��������������������������; 
	 * 4������HttpClient�����execute����ִ������;
	 * 5����ȡ������Ӧ�������ӦEntity; 
	 * 6������Ӧ�����л�ȡ��Ӧ״̬������ӦEntity�л�ȡ��Ӧ����; 
	 * 7���ر���Ӧ����;
	 * 8���ر�HttpClient.
	 */

	private static RequestConfig requestConfig = RequestConfig.custom()
			// �����ӳ��л�ȡ���ӵĳ�ʱʱ��
			// Ҫ������ʱ���Դ����ӳ��л�ȡ�������ڵȴ���һ����ʱ���û�л�ȡ���������ӣ��������ӳ���û�п��������ˣ�����׳���ȡ���ӳ�ʱ�쳣��
			.setConnectionRequestTimeout(15000)
			// ����������ӳ�ʱʱ�䣺httpclient�ᴴ��һ���첽�߳����Դ���socket���ӣ��˴����ø�socket�����ӳ�ʱʱ��
			// ����Ŀ��url�����ӳ�ʱʱ�䣬���ͷ��˷���������Ŀ��url���������ӵ����ʱ�䡣��ʱʱ��3000ms����ϵͳ�����쳣
			.setConnectTimeout(15000)
			// socket�����ݳ�ʱʱ�䣺�ӷ�������ȡ��Ӧ���ݵĳ�ʱʱ��
			// ������һ��url�󣬻�ȡresponse�ķ��صȴ�ʱ��
			// ��������Ŀ��url�������Ӻ󣬵ȴ��Ż�response�����ʱ�䣬�ڹ涨ʱ����û�з�����Ӧ�Ļ����׳�SocketTimeout��
			.setSocketTimeout(15000).build();

	/**
	 * ����http����
	 *
	 * @param requestMethod
	 *            ����ʽ��HttpGet��HttpPost��HttpPut��HttpDelete��
	 * @param url
	 *            ����·��
	 * @param params
	 *            post�������
	 * @param header
	 *            ����ͷ
	 * @return ��Ӧ�ı�
	 */
	public static String sendHttp(HttpRequestMethodEnum requestMethod, String url, Map<String, Object> params, Map<String, String> header) {
		// 1������һ��HttpClient����;
		CloseableHttpClient httpClient = HttpClients.createDefault();
		CloseableHttpResponse httpResponse = null;
		String responseContent = null;
		// 2������һ��Http����������������URL������GET����ʹ���һ��HttpGet����POST����ʹ���һ��HttpPost����;
		HttpRequestBase request = requestMethod.createRequest(url);
		request.setConfig(requestConfig);
		// 3�������Ҫ��������������������ͷ������Ҳ��������������������������;
		if (header != null) {
			for (Map.Entry<String, String> entry : header.entrySet()) {
				request.setHeader(entry.getKey(), entry.getValue());
			}
		}
		// ��������������ز���
		try {
			if (params != null) {
				((HttpEntityEnclosingRequest) request).setEntity(new StringEntity(JSON.toJSONString(params), ContentType.create("application/json", "UTF-8")));
			}
			// 4������HttpClient�����execute����ִ������;
			httpResponse = httpClient.execute(request);
			// 5����ȡ������Ӧ�������ӦEntity;
			HttpEntity httpEntity = httpResponse.getEntity();
			// 6������Ӧ�����л�ȡ��Ӧ״̬������ӦEntity�л�ȡ��Ӧ����;
			if (httpEntity != null) {
				responseContent = EntityUtils.toString(httpEntity, "UTF-8");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 7���ر���Ӧ����;
				if (httpResponse != null) {
					httpResponse.close();
				}
				// 8���ر�HttpClient.
				if (httpClient != null) {
					httpClient.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return responseContent;
	}
}