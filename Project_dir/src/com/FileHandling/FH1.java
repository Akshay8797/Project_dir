package com.FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FH1 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Akshay Kumar\\Documents\\Ibm Fullstack\\Sample.txt");
		FileOutputStream fos = new FileOutputStream(f, true);
		String msg = " This was Added by Eclipse";
		fos.write(msg.getBytes());
		fos.flush();
		fos.close();
		System.out.println("File Written");
	}
}
