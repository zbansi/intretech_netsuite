package com.bansi.ws.example;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class Hello {
	public String testService(String params) {
		return "hello " + params;
	}

	public String testStudent(Student student) {
		return student.getName() + " : " + student.getAge();
	}
}
