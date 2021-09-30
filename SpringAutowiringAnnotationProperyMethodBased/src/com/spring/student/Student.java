package com.spring.student;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	@Autowired
	public Address add;

	@Autowired
	public Course c;
	
	public void StudentInfo() {

		add.myAddress();
		c.Subject();

	}
}
