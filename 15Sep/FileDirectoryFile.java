package com.io;

import java.io.File;

public class FileDirectoryFile {
	public static void main(String args[]) {
		File dir=new File("D:/io");
		if(dir.isDirectory()) {
			System.out.println(dir.getAbsolutePath()+" is directory");
		}
		else {
			System.out.println(dir.getAbsolutePath()+" is not directory");
		}
		if(dir.isFile()) {
			System.out.println(dir.getAbsolutePath()+" is file");
		}
		else {
			System.out.println(dir.getAbsolutePath()+" is not file");
		}
	}

}