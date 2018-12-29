package com.bansi.eai.consumer;

import java.net.URL;

/*
 * 测试Java所支持的URL类型
 */
public class SupportedUrlTypeTest {
	public static void main(String[] args) {
		
		String host = "www.java2s.com";
		String file = "/index.html";

		String[] schemes = { "http", "https", "ftp", "mailto", "telnet", "file", "ldap", "gopher", "jdbc", "rmi",
				"jndi", "jar", "doc", "netdoc", "nfs", "verbatim", "finger", "daytime", "systemresource" };

		for (int i = 0; i < schemes.length; i++) {
			try {
				URL u = new URL(schemes[i], host, file);
				System.out.println(schemes[i] + " is supported\r\n");
			} catch (Exception ex) {
				System.out.println(schemes[i] + " is not supported\r\n");
			}
		}
	}
}
