package com.spring.employee;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainClient {

	public static void main(String args[]) {
		
		//eg of constructor based
		//Adding to out the resource that is configuration file
		Resource resource=new ClassPathResource("applicationContext.xml");//locate the path of meta data that beans.xml pr applcaition Context.xml
		
		//Createvbean factory container
		
		BeanFactory beanFactory=new XmlBeanFactory(resource);
		// we need to call the service of student

		// Employee object is created by spring container not you.
		
		//Employee d= new Employee()
		
		Employee employee= (Employee) beanFactory.getBean("empbean");
		employee.Empinfo();
		
	}
}
