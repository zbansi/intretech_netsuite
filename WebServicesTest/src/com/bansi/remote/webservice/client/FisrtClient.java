/**
 * 
 */
package com.bansi.remote.webservice.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.bansi.remote.webservice.client.wsimport.fisrtwebserviceimpl.FisrtWebServiceImpl;

/**
 * @author YQ12681
 *
 */
public class FisrtClient {
	public static void main(String[] args) throws MalformedURLException {

		// TODO Ҳ���԰������Ű���PhoneAddressClient�������ã����������ǲ��Ǹ����أ����������

		// FisrtWebServiceImplService���Զ����ɵĽӿڣ����Ƿ���˵�ʵ����
		Service service = Service.create(new URL("http://localhost:9999/getAddress?wsdl"),
				new QName("http://impl.server.webservice.remote.bansi.com/", "FisrtWebServiceImplService"));
		FisrtWebServiceImpl impl = service.getPort(FisrtWebServiceImpl.class);
		System.out.println(impl.getAddressByPhoneNo("xxxx1500xxx0815726"));
	}
}