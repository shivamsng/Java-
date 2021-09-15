package com.io;

	import java.io.*;

	 
	public class ReadingDemoFromConsolenSole {

	 

	    public static void main(String args[]) throws IOException {

	 

	        InputStreamReader cin = null; /// An InputStreamReader is a bridge from byte streams to character streams:
	    
	    
	        FileOutputStream fileOutputStream = null;
	        try {
	            cin = new InputStreamReader(System.in);
	            fileOutputStream = new FileOutputStream("B123.txt");//this 
	            

	 

	            System.out.println("Enter characters, 'q' to quit.");
	            char c;
	            do {
	                c = (char) cin.read();  //type casting
	                fileOutputStream.write(c);
	                
	                
	                System.out.print(c);
	            } while (c != 'q');
	            
	            System.out.println("done"); //this
	        } 
	        
	        
	        
	        finally {
	            if (cin != null) {
	                cin.close();
	            }
	        }
	    }
	}

