package com.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileBytetoArray {
	public static void main(String args[]) throws IOException {
		byte array[]=new byte[1000];
		InputStream inp=new FileInputStream("D:/io/abc.txt");
		inp.read(array);
		String Data=new String(array);
		System.out.println(Data);
		inp.close();
	}
}
