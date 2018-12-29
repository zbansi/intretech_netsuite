package com.bansi.eai.consumer;

/**
 * ��ʵ��Ӧͷ����
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

	// Ҫ���ҵ���ַ
	private ArrayList<String> websites;

	/**
	 * ���캯��
	 * 
	 * @param websites
	 *            ��վ�б�
	 */
	public GetHttpHeader(ArrayList<String> websites) {
		this.websites = websites;
	}

	/**
	 * ��ȡ��Ӧͷ ��ӡ������̨
	 */
	public void getHeaders() {
		if (websites == null) {
			System.err.println("��ѯ��ַ����Ϊ�գ�");
			return;
		}
		try {
			for (String website : websites) {
				System.out.println("----------------��վ��" + website + "HTTP��Ӧͷ---------------");
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
			System.err.println("�޷���ѯ��ַ��");
		}
	}
}