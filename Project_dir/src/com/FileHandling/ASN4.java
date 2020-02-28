package com.FileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class ASN4 {

	public static void main(String[] args) throws IOException {
		FileInputStream f1 = new FileInputStream("C:\\Users\\Akshay Kumar\\Documents\\Ibm Fullstack\\A4F1.txt");
		FileInputStream f2 = new FileInputStream("C:\\Users\\Akshay Kumar\\Documents\\Ibm Fullstack\\A4F2.txt");
		FileInputStream f3 = new FileInputStream("C:\\Users\\Akshay Kumar\\Documents\\Ibm Fullstack\\A4F3.txt");
		Vector<FileInputStream> v = new Vector<FileInputStream>();
		v.add(f1);
		v.add(f2);
		v.add(f3);
		Enumeration<FileInputStream> e = v.elements();
		SequenceInputStream sis = new SequenceInputStream(e);
		int i;
		while ((i = sis.read()) != -1)
			System.out.print((char) i);
		sis.close();
		f1.close();
		f2.close();
		f3.close();
	}

}
