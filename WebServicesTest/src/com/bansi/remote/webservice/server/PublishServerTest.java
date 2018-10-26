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
	        //参数1：服务被访问的url   ip+端口号+服务名
	        //参数2：实现类
	        Endpoint.publish("http://localhost:9999/getAddress", new FisrtWebServiceImpl());
	        System.out.println("服务发布成功");

	        //查看WebService服务是否启动  url+？wsdl
	        //http://localhost:9999/getAddress?wsdl是否能显示

	    }
}
