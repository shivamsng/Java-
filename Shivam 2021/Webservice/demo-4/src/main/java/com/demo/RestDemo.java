package com.demo;
import java.util.List;
import javax.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class RestDemo {
StudentService StudentService = new StudentService();
// Get callusing spring based web service
@GetMapping("/myur")
public String sayHello() {
return "hi how are you";
}
// retrive Student info USing @GET MEthod
@GetMapping("/Studental")
public Student getDummyStudent() {
Student p = new Student();// creating java object
p.setId(105);
p.setName("Ram");
p.setEmail("Ram@gmail.com");
p.setAddress("delhi");
return p;
}
// retrive the Student information by id
@GetMapping("/Studentid/{id}")
public Student getDummyStudentById(@PathVariable("id") Integer id) {
Student p = new Student();// creating java object
p.setId(id);
p.setName("Ram");
p.setEmail("Ram@gmail.com");
p.setAddress("delhi");
return p;
} // add the Student information POst
@PostMapping(value = "/insertStudentdetails")
public Student insertDummyStudent(@RequestBody Student Student) {
return StudentService.addStudent(Student); //calling the service
}
//update Student info
@PutMapping("/update")
public Student updateStudentInfo(@RequestBody Student Student) {
return StudentService.updateStudent(Student); }
//get list
@GetMapping("/getlist")
public List<Student> getDummyStudentList() {
List<Student> listOfStudent = StudentService.getAllStudentlist();
return listOfStudent;
}
}