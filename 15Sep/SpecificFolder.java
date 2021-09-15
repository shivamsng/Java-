package com.io;

import java.io.File;
import java.io.FilenameFilter;

public class SpecificFolder {
public static void main(String args[]) {
	File file= new File("D:/io/");
		 String[] list = file.list(new FilenameFilter() {
			 
	           @Override
	            public boolean accept(File dir, String name) {
	             if(name.toLowerCase().endsWith(".txt")){
	                    return true;
	                } else {
	                    return false;
	                }
	            }
	        });
	        for(String f:list){
	            System.out.println(f);
	        }
	    }

	}
		
