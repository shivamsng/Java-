package com.String;

public class Equals {
	public static void main(String args[]){  
		String name1="Shivam";  
		String name2="shivam";  
		String name3="Shivam"; 
		
		System.out.println(name1.equals(name2));//false because content is same but case is not same
		
		System.out.println(name1.equals(name3));//True because case is same  
		
		}
}
