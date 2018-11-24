package com.bansi.ws.example;

import java.nio.charset.MalformedInputException;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.bansi.ws.example.hello.*;
import com.bansi.ws.example.sayhi.*;

public class WSClientTest {
	public static void main(String[] args) throws DatatypeConfigurationException {
        // 获取service
        Hello helloService = new HelloService().getHelloPort();		
        SayHiService sayhi = new SayHiServiceImpService().getSayHiServiceImpPort();
        //say hi
        helloService.testService("bansi: Hello World!");
        
        sayhi.sayHiDefault();
        sayhi.sayHi("Ahe");
        
     // checktime
        // 这里主要说一下时间日期的xml传递，方法还略显复杂
        GregorianCalendar calender = new GregorianCalendar();
        calender.setTime(new Date(System.currentTimeMillis()));
        XMLGregorianCalendar xmldate = DatatypeFactory.newInstance().newXMLGregorianCalendar(calender);
        System.out.println(sayhi.checkTime(xmldate));
        
	}

}
