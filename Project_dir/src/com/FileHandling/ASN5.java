package com.FileHandling;

import java.io.*;

class Date implements Serializable {
	private static final long serialVersionUID = 1L;
	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public String toString() {
		return "" + day + "/" + month + "/" + year;
	}
}

class Account implements Serializable {
	private static final long serialVersionUID = 1L;
	private Date dob;

	public Account(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Account's DOB: " + dob;
	}
}

public class ASN5 {
	public static void main(String[] args) throws Exception {
		Account a = new Account(new Date(01, 04, 1997));
		writeObject(a);
		Account a1 = readObject();
		System.out.print(a1);
	}

	public static void writeObject(Account a) throws Exception {
		File f = new File("C:\\Users\\Akshay Kumar\\Documents\\Ibm Fullstack\\A5F.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream Oos = new ObjectOutputStream(fos);
		Oos.writeObject(a);
		Oos.flush();
		fos.flush();
		Oos.close();
		fos.close();
	}

	public static Account readObject() throws Exception {
		File f = new File("C:\\Users\\Akshay Kumar\\Documents\\Ibm Fullstack\\A5F.txt");
		FileInputStream fos = new FileInputStream(f);
		ObjectInputStream Oos = new ObjectInputStream(fos);
		Account a = (Account) Oos.readObject();
		Oos.close();
		return a;
	}
}