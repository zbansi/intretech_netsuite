package com.bansi.eai.consumer.util;

import org.apache.http.client.methods.*;


/**
 * @author jreffchen
 */
public enum HttpRequestMethodEnum {
	// HttpGet����
	HttpGet {
		@Override
		public HttpRequestBase createRequest(String url) {
			return new HttpGet(url);
		}
	},
	// HttpPost ����
	HttpPost {
		@Override
		public HttpRequestBase createRequest(String url) {
			return new HttpPost(url);
		}
	},
	// HttpPut ����
	HttpPut {
		@Override
		public HttpRequestBase createRequest(String url) {
			return new HttpPut(url);
		}
	},
	// HttpDelete ����
	HttpDelete {
		@Override
		public HttpRequestBase createRequest(String url) {
			return new HttpDelete(url);
		}
	};

	public HttpRequestBase createRequest(String url) {
		return null;
	}
}