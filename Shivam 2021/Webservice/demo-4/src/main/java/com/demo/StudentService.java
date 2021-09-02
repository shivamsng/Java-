package com.demo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/*
* It is just a helper class which should be replaced by database implementation.
* It is not very well written class, it is just used for demonstration.
*/
public class StudentService {
static HashMap<Integer, Student> StudentIdMap = getStudentIdMap(); //map list
public StudentService() {
super();
if (StudentIdMap == null) {
StudentIdMap = new HashMap<Integer, Student>();
// Creating some objects of Student while initializing
Student indiaStudent = new Student(1, "ram1", "ram@gmail.com", "delhi");
Student chinaStudent = new Student(2, "ram2", "ram@gmail.com", "delhi");
Student nepalStudent = new Student(3, "ram3", "ram@gmail.com", "delhi");
Student bhutanStudent = new Student(4, "ram4", "ram@gmail.com", "delhi");
//adding map list of collections in java
StudentIdMap.put(1, indiaStudent);
StudentIdMap.put(4, chinaStudent);
StudentIdMap.put(3, nepalStudent);
StudentIdMap.put(2, bhutanStudent);
}
}
public List<Student> getAllStudentlist() {
List<Student> Studentlist = new ArrayList<Student>(StudentIdMap.values());
return Studentlist;
}
public Student getStudent(int id) {
Student Student = StudentIdMap.get(id);
return Student;
}
// add Student
public Student addStudent(Student Student) {
Student.setId(getMaxId()+ 1);
// key , value
StudentIdMap.put(Student.getId(), Student); ///logic class
return Student;
}
//update
public Student updateStudent(Student Student) {
if (Student.getId() <= 0)
return null;
StudentIdMap.put(Student.getId(), Student);
return Student;
}
//delete
public void deleteStudent(int id) {
StudentIdMap.remove(id);
}
public static HashMap<Integer, Student> getStudentIdMap() {
return StudentIdMap;
}
// Utility method to get max id
public static int getMaxId() {
int max = 0;
for (int id : StudentIdMap.keySet()) {
if (max <= id)
max = id;
}
return max;
}
}