package com.FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ASN1 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Akshay Kumar\\Documents\\Ibm Fullstack\\Sample.txt");
		FileInputStream fis = new FileInputStream(f);
		StringBuilder sb = new StringBuilder("");
		int i = 0;
		while (i != -1) {
			i = fis.read();
			if (i != -1)
				sb.append((char) i);
		}
		while (i != -1)
			;
		System.out.println("File contents: " + sb);
		fis.close();
		File fw = new File("C:\\Users\\Akshay Kumar\\Documents\\Ibm Fullstack\\SampleWrite.txt");
		FileOutputStream fos = new FileOutputStream(fw);
		String msg = sb.toString();
		fos.write(msg.getBytes());
		fos.flush();
		fos.close();
		System.out.println("File Written");
	}
}