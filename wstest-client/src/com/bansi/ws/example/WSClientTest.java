package com.bansi.ws.example;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.WebServiceException;

import com.bansi.ws.example.hello.*;
import com.bansi.ws.example.sayhi.*;

public class WSClientTest {
	public static void main(String[] args) throws DatatypeConfigurationException {

		// test sayhi
		// ��ȡservice
		System.out.println("====Say Hi!====");
		try {
			SayHiService sayhi = new SayHiServiceImpService().getSayHiServiceImpPort();

			// say hi
			sayhi.sayHiDefault();
			sayhi.sayHi("Ahe");
			// checktime
			// ������Ҫ˵һ��ʱ�����ڵ�xml���ݣ����������Ը���
			GregorianCalendar calender = new GregorianCalendar();
			calender.setTime(new Date(System.currentTimeMillis()));
			XMLGregorianCalendar xmldate = DatatypeFactory.newInstance().newXMLGregorianCalendar(calender);
			System.out.println(sayhi.checkTime(xmldate));
		} catch (WebServiceException wse1) {
			System.out.println("����δ����");
			wse1.printStackTrace();
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		// test hello student
		System.out.println("====Hello World!====");
		try {
			Hello hello = new HelloService().getHelloPort();
			String s = hello.testService("123");
			System.out.println(s);
			Student student = new Student();
			student.setAge(12);
			student.setName("aabbcc");
			String s2 = hello.testStudent(student);
			System.out.println(s2);
		} catch (WebServiceException wse2) {
			System.out.println("����δ����");
			wse2.printStackTrace();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

}