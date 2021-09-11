package com.demo;

public class noargconstructor {
	 int i;

	  // constructor with no parameter
	  private noargconstructor() {
	    i = 5;
	    
	    System.out.println("Constructor is called");
	  }

	  public static void main(String[] args) {

	    // calling the constructor without any parameter
		  noargconstructor obj = new noargconstructor();
		  
	    System.out.println("Value of i: " + obj.i);
	  }
	}

