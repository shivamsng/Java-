package com.spring.student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainStudent {

	public static void main(String ar[]) {

		// created spring ioc container
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans1.xml");

		Student s = (Student) applicationContext.getBean("stud");

		s.StudentInfo();

	}
}
