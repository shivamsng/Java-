package com.spring.employee;

public class Employee {

	private String id;
	private String name;
	
	// we need to create constructor here
	public Employee(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//Information ablout employee
	public void Empinfo() {
		System.out.println("Id of employee is "+id);
		System.out.println("Name of employee is "+name);
	}
}
