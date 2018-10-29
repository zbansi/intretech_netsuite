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

		// TODO 也可以按照入门案例PhoneAddressClient那样调用，但是这样是不是更好呢？更具灵活性

		// FisrtWebServiceImplService是自动生成的接口，不是服务端的实现类
		Service service = Service.create(new URL("http://localhost:9999/getAddress?wsdl"),
				new QName("http://impl.server.webservice.remote.bansi.com/", "FisrtWebServiceImplService"));
		FisrtWebServiceImpl impl = service.getPort(FisrtWebServiceImpl.class);
		System.out.println(impl.getAddressByPhoneNo("xxxx1500xxx0815726"));
	}
}
