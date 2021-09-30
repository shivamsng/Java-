package com.student;

public class Student {

	private Integer rollNumber;
	private String name;
	private String gender;
	private String course;
	private Double fee;
	
	public Student() {
		super();
	}
	
	public Student(Integer rollNumber, String name, String gender, String course, Double fee) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.gender = gender;
		this.course = course;
		this.fee = fee;
	}
	
	
	
	public Integer getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Double getFee() {
		return fee;
	}
	public void setFee(Double fee) {
		this.fee = fee;
	}
}
