package com.io;

import java.io.File;

public class ListofAllFile {
	public static void main(String args[]) {
		
 File file= new File("D:/io/");
 
 String[] fileList = file.list();
 for(String name:fileList){
	 
     System.out.println(name);
}
	}
}