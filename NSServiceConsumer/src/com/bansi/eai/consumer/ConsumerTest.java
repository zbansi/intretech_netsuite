package com.bansi.eai.consumer;

import java.util.ArrayList;

public class ConsumerTest {
	public static void main(String[] args) {
		String web1 = "http://www.oschina.net/";
		String web2 = "http://news.baidu.com/";
		String web3 = "https://linux.cn/";
		String web4 = "http://www.taobao.com/";
		String web5 = "https://forms.eu1.netsuite.com/app/site/hosting/scriptlet.nl?script=55&deploy=1&compid=5144758_SB1&h=7a7fa4443278bf5defc6";
		ArrayList<String> websites = new ArrayList<String>();
		websites.add(web1);
		websites.add(web2);
		websites.add(web3);
		websites.add(web4);
		websites.add(web5);
		GetHttpHeader showHttpHeaders = new GetHttpHeader(websites);
		showHttpHeaders.getHeaders();

	}
}
