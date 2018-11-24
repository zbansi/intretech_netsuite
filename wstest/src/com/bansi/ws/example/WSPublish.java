package com.bansi.ws.example;

import java.util.Scanner;

import javax.xml.ws.Endpoint;

public class WSPublish {

	/**
	 * ����WebService ��
	 */
	public static void main(String[] args) {
		String address = "http://localhost:7775/wstest/service/sayhi";
		// http://localhost:8080/wstest/service/hello
		Endpoint ep = Endpoint.publish(address, new SayHiServiceImp());
		Scanner scanIn = new Scanner(System.in);
		System.out.println("Web Service Release Successfully!");
		while (!scanIn.next().equals("stop")) {
			;
		}
		scanIn.close();
		ep.stop();
		System.out.println("Web Service Close Successfully!");

	}

}
