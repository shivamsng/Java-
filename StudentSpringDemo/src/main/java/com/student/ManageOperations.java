package com.student;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManageOperations {

	StudentRecord studentRecord=new StudentRecord();
	
	//Getting all the student records
	@GetMapping("/getStudentRecords")
	public List<Student> getListOfStudent(){
		List<Student> list=studentRecord.getAllStudentlist();
		return list;
	}
}
