package com.bansi.eai.consumer;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class ItemMstdataGet {
	public static void main(String[] args) throws IOException {
		//test4();
		//test3();
		//test2();
		test();
	}

	/**
	 * ��ȡURLָ������Դ��
	 * 
	 * @throws IOException
	 */

	public static void test4() throws IOException {
		URL url = new URL("http://lavasoft.blog.51cto.com/attachment/200811/200811271227767778082.jpg");
		// ��ô� URL �����ݡ�
		Object obj = url.getContent();
		System.out.println(obj.getClass().getName());
	}

	/**
	 * ��ȡURLָ������Դ
	 * 
	 * @throws IOException
	 */
	public static void test3() throws IOException {
		URL url = new URL("http://www.hrtsea.com/down/soft/45.htm");
		// ����һ�� URLConnection ��������ʾ�� URL �����õ�Զ�̶�������ӡ�
		URLConnection uc = url.openConnection();
		// �򿪵����Ӷ�ȡ����������
		InputStream in = uc.getInputStream();
		int c;
		while ((c = in.read()) != -1)
			System.out.print(c);
		in.close();
	}

	/**
	 * ��ȡURLָ������ҳ����
	 * 
	 * @throws IOException
	 */
	public static void test2() throws IOException {
		URL url = new URL("http://www.hrtsea.com/down/soft/45.htm");
		// �򿪵��� URL �����Ӳ�����һ�����ڴӸ����Ӷ���� InputStream��
		Reader reader = new InputStreamReader(new BufferedInputStream(url.openStream()));
		int c;
		while ((c = reader.read()) != -1) {
			System.out.print((char) c);
		}
		reader.close();
	}

	/**
	 * ��ȡURL���������������
	 * 
	 * @throws IOException
	 */
	public static void test() throws IOException {
		// https://forms.eu1.netsuite.com/app/site/hosting/scriptlet.nl?script=55&deploy=1&compid=5144758_SB1&h=7a7fa4443278bf5defc6
		// http://lavasoft.blog.51cto.com/62575/120430
		URL url = new URL(
				"https://forms.eu1.netsuite.com/app/site/hosting/scriptlet.nl?script=55&deploy=1&compid=5144758_SB1&h=7a7fa4443278bf5defc6");
		// �򿪵��� URL �����Ӳ�����һ�����ڴӸ����Ӷ���� InputStream��
		InputStream in = url.openStream();
		int c;
		while ((c = in.read()) != -1)
			System.out.print(c);
		in.close();
	}
}