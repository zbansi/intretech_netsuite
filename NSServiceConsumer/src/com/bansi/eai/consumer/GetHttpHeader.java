package com.bansi.eai.consumer;

/**
 * 现实响应头代码
 */
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class GetHttpHeader {

	// 要查找的网址
	private ArrayList<String> websites;

	/**
	 * 构造函数
	 * 
	 * @param websites
	 *            网站列表
	 */
	public GetHttpHeader(ArrayList<String> websites) {
		this.websites = websites;
	}

	/**
	 * 获取响应头 打印到控制台
	 */
	public void getHeaders() {
		if (websites == null) {
			System.err.println("查询网址不能为空！");
			return;
		}
		try {
			for (String website : websites) {
				System.out.println("----------------网站：" + website + "HTTP响应头---------------");
				URL url = new URL(website);
				URLConnection connection = url.openConnection();
				Map<String, List<String>> headerFields = connection.getHeaderFields();
				Set<Entry<String, List<String>>> entrySet = headerFields.entrySet();
				Iterator<Entry<String, List<String>>> iterator = entrySet.iterator();
				while (iterator.hasNext()) {
					Entry<String, List<String>> next = iterator.next();
					String key = next.getKey();
					List<String> value = next.getValue();
					if (key == null)
						System.out.println(value.toString());
					else
						System.out.println(key + ":" + value.toString());
				}
				System.out.println("");
			}
		} catch (IOException e) {
			System.err.println("无法查询网址！");
		}
	}
}