/**
 * 
 */
package com.bansi.remote.webservice.server.impl;
import javax.jws.WebService;
import com.bansi.remote.webservice.server.FisrtWebService;

/**
 * @author YQ12681
 *
 */

@WebService
public class FisrtWebServiceImpl implements FisrtWebService{
	

	public String getAddressByPhoneNo(String phoneNo) {
        return phoneNo + ": 归属地是上海";
}
}
