package com.String;

public class Intern {
	public static void main(String args[]){  
		
		String s1=new String("hello");  
		String s2="hello";  
		String s3=s1.intern();//returns string from pool,so it will be same as s2  
		
		System.out.println(s1==s2);//false  
		System.out.println(s2==s3);//true   
		}
}
