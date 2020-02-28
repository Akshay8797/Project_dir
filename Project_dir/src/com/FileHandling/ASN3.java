package com.FileHandling;

import java.io.*;

public class ASN3 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Akshay Kumar\\Documents\\Ibm Fullstack\\SampleData.txt");
		FileOutputStream fos = new FileOutputStream(f);
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeInt(123456789);
		dos.writeUTF("Akshay Kumar");
		dos.writeDouble(15000.96);
		dos.flush();
		fos.flush();
		dos.close();
		fos.close();
		FileInputStream fis = new FileInputStream(f);
		DataInputStream dis = new DataInputStream(fis);
		int acc = dis.readInt();
		String name = dis.readUTF();
		double amount = dis.readDouble();
		dis.close();
		fis.close();
		System.out.println("Account No: " + acc + ", Name: " + name + ", Amount: " + amount);
	}
}
