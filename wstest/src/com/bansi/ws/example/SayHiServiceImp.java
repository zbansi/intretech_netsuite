package com.bansi.ws.example;


import java.text.SimpleDateFormat;
import java.util.Date;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


/**
 * ��Ϊ���Ե�WebServiceʵ����
 * 
 * @author Bansi
 * 
 */
@WebService(endpointInterface = "com.bansi.ws.example.SayHiService")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class SayHiServiceImp implements SayHiService {

    @Override
    public void SayHiDefault() {
        System.out.println("Hi, Johness!");
    }

    @Override
    public void SayHi(String name) {
        System.out.println("Hi, " + name + "!");
    }

    @Override
    public int CheckTime(Date clientTime) {
        // ��ȷ����
        String dateServer = new java.sql.Date(System.currentTimeMillis())
                .toString()
                + " "
                + new java.sql.Time(System.currentTimeMillis());
        String dateClient = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
                .format(clientTime);
        return dateServer.equals(dateClient) ? 1 : 0;
    }



 
  
 
}