package com.io;


	import java.io.BufferedInputStream;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;

	 

	 

	public class BufferedInputStreamDemo {
	    
	    public static void main(String arg[]) throws IOException {
	        
	        FileInputStream bin = new FileInputStream("D:/io/abc.txt");
	        BufferedInputStream b = new BufferedInputStream(bin);
	        
	        int i;
	        while((i=b.read())!=-1) {
	            
	            System.out.println((char)i);
	            
	        }
	        
	        bin.close();
	        b.close();
	        
	    }

	 

}
