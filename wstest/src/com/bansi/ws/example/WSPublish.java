package com.bansi.ws.example;

import java.util.Scanner;

import javax.xml.ws.Endpoint;

public class WSPublish {

	/**
	 * ����WebService ��
	 */
	public static void main(String[] args) {
		String addressSayHi = "http://localhost:7775/wstest/service/sayhi";
		String addressHello = "http://localhost:8080/wstest/service/hello";
		Endpoint ep1 = Endpoint.publish(addressSayHi, new SayHiServiceImp());
		Endpoint ep2 = Endpoint.publish(addressHello, new Hello());
		Scanner scanIn = new Scanner(System.in);
		System.out.println("Web Service Release Successfully!");
		while (!scanIn.next().equals("stop")) {
			;
		}
		scanIn.close();
		ep1.stop();
		ep2.stop();
		System.out.println("Web Service Close Successfully!");

	}

}
