package com.student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentRecord {

	static HashMap<Integer, Student> StudentDetails = getStudentMap(); //mapping the student record
	public StudentRecord(){
		
		super();
		if (StudentDetails == null) {
			StudentDetails = new HashMap<Integer, Student>();

			 //adding map list of collections in java
			StudentDetails.put(1, new Student(1, "Ravi", "M", "delhi",1000.0));
			StudentDetails.put(2, new Student(2, "Anand", "M", "delhi",5000.0));
			StudentDetails.put(3, new Student(3, "Alok", "M", "delhi",12000.0));
			StudentDetails.put(4, new Student(4, "Ashutosh", "M", "delhi",15000.0));
			}
		
	}
	
	 public static HashMap<Integer, Student> getStudentMap() {
		 return StudentDetails;
	}
	 
	//Getting list of all students
	 
	 public List<Student> getAllStudentlist() {
		List<Student> Studentlist = new ArrayList<Student>(StudentDetails.values());
		return Studentlist;
	 }
}
