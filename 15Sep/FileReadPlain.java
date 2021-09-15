package com.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadPlain {
	public static void main(String args[]) throws IOException {
		FileReader dire=new FileReader("D:/io/Shivam.txt");
		BufferedReader diret=new BufferedReader(dire);
		StringBuilder sb=new StringBuilder();
		String name11="";
		
		while(name11!=null) {
			sb.append(name11);
			sb.append(System.lineSeparator());
			name11=diret.readLine();
			
			System.out.println(name11);
			
		}
		diret.close();
	}

}