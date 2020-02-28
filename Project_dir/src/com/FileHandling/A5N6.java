package com.FileHandling;

import java.io.File;
import java.io.RandomAccessFile;

class Account1 {
	private int acc_no;
	private int bal1;

	public Account1(int acc_no, int bal1) {
		this.acc_no = acc_no;
		this.bal1 = bal1;
	}

	public int getBalance() {
		return this.bal1;
	}

	public int getAcc() {
		return this.acc_no;
	}

	@Override
	public String toString() {
		return "Account No: " + acc_no + ", Balance: " + bal1;
	}
}

public class A5N6 {
	public static void main(String[] args) throws Exception {
		Account1 a = new Account1(123456789, 50000);
		Account1 b = new Account1(987654321, 80000);
		write(a);
		read(a);
		write(b);
		read(b);
	}

	public static void write(Account1 a) throws Exception {
		File fr = new File("C:\\Users\\Akshay Kumar\\Documents\\Ibm Fullstack\\A6F.txt");
		RandomAccessFile raf = new RandomAccessFile(fr, "w");
		raf.writeInt(a.getBalance());
		raf.writeInt(a.getAcc());
		raf.close();
	}

	public static void read(Account1 a) throws Exception {
		File fr = new File("C:\\Users\\Akshay Kumar\\Documents\\Ibm Fullstack\\A6F.txt");
		RandomAccessFile raf = new RandomAccessFile(fr, "r");
		raf.seek(0);
		int res1 = raf.readInt();
		int res2 = raf.readInt();
		System.out.println("Account: " + res2 + " Balance: " + res1);
		raf.close();
	}
}