package com.FileHandling;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class ASN2 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Akshay Kumar\\Documents\\Ibm Fullstack\\Sample.txt");
		String path = f.getName();
		long size = f.length();
		System.out.println(size + " bytes");
		System.out.println(path);
		System.out.println("Readable : " + f.canRead());
		System.out.println("Writable : " + f.canWrite());
		System.out.println("Executable : " + f.canExecute());
		SimpleDateFormat s = new SimpleDateFormat("MM/dd/yyy HH:mm:ss");
		System.out.println("Last Modified : " + s.format(f.lastModified()));
		System.out.println("Path : " + f.getAbsolutePath());
	}
}
