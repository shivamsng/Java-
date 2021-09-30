package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String args[]) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		// create an Reference of class A

		A a = applicationContext.getBean("a", A.class); // retriving the name of class from xml

		a.show();// this method belongs to class A
	}
}
