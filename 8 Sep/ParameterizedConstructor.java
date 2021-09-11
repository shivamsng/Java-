package com.demo;

public class ParameterizedConstructor {
	String languages;

	  // constructor accepting single value
	ParameterizedConstructor(String lang) {
	    languages = lang;
	    
	    System.out.println(languages + " Programming Language");
	  }

	  public static void main(String[] args) {

	    // call constructor by passing a single value
		  ParameterizedConstructor obj1 = new ParameterizedConstructor("Java");
		  ParameterizedConstructor obj2 = new ParameterizedConstructor("Python");
		  ParameterizedConstructor obj3 = new ParameterizedConstructor("C");
	  }
}
