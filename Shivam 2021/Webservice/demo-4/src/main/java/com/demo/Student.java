package com.demo;
public class Student {
private Integer id;
private String name;
private String email;
private String address;
//constructor
public Student() {
super();
}
//paramaterize constructor
public Student(Integer id, String name,String email,String address) {
super();
this.id = id;
this.name =name;
this.email=email;
this.address = address;
} //id
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
//name
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
//email
public String getEmail() {
return email;
}
public void setEmail(String email) {
this.email = email;
}
//addres
public String getAddress() {
return address;
}
public void setAddress(String address) {
this.address = address;
}
}

