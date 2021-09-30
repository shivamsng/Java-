package com.spring;

import java.util.List;

public interface EmployeeDao {

	public Employee findEmployeeById(int empId);//name of emp by id
	
	public List<Employee> findAllEmployees();//all i nfor from db
	
	// create
	// update
	// delete

	// jdbc suport
	// simpls dao class student rowmappler
}
