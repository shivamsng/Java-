package com.String;

public class IndexofString {
	public static void main(String args[]){  
		String string1="How are you";  
		 
		int index1=string1.indexOf("are");//returns the index of are substring  
		int index2=string1.indexOf("you");//returns the index of index substring  
		
		System.out.println(index1+"  "+index2);
}
}
