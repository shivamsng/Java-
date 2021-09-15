package com.io;

import java.io.File;

public class FilePathExist {
	public static void main(String args[]) {
		File Mydir=new File("D:/io/abc.txt");
		if(Mydir.exists()) {
			System.out.println("file exist");
		}
		else {
			System.out.println("file not exist");
		}
	}

}
