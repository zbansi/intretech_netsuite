/**
 * 
 */
package com.bansi.remote.webservice.server;

import javax.xml.ws.Endpoint;
import com.bansi.remote.webservice.server.impl.FisrtWebServiceImpl;

/**
 * @author YQ12681
 *
 */
public class PublishServerTest {
	 public static void main(String[] args) {
	        //����1�����񱻷��ʵ�url   ip+�˿ں�+������
	        //����2��ʵ����
	        Endpoint.publish("http://localhost:9999/getAddress", new FisrtWebServiceImpl());
	        System.out.println("���񷢲��ɹ�");

	        //�鿴WebService�����Ƿ�����  url+��wsdl
	        //http://localhost:9999/getAddress?wsdl�Ƿ�����ʾ

	    }
}
