package com.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReadByLine {
	public static void main(String args[]) throws IOException {
		Reader file=new FileReader("D:/io/abc.txt");
		BufferedReader bi=new BufferedReader(file);
		
		//BufferedReader bi1=null;
		String i="";
		while((i = bi.readLine())!=null) {
			System.out.println(i);
			
		}
		bi.close();
	}
}