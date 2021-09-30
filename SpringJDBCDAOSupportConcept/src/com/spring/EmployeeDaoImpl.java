package com.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDao {

	@Override
	public Employee findEmployeeById(int empId) {
		// TODO Auto-generated method stub
		Employee employee=null;
		String query="select * from employee where emp_id=?";
		Object[] obj=new Object[] {empId};
		employee=(Employee)getJdbcTemplate().queryForObject(query, obj,new BeanPropertyRowMapper<>(Employee.class));
		return employee;
	}

	@Override
	public List<Employee> findAllEmployees() {
		// TODO Auto-generated method stub
		Employee employee;
		List<Employee> empList=new ArrayList<Employee>();
		String query="select * from employee";
		empList= getJdbcTemplate().query(query, new BeanPropertyRowMapper(Employee.class));
		
		return empList;
	}

}
