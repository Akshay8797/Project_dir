package com.Cts.OOP;

public class Main2 {
	public static void main(String[] args)
	{
		Account a=new Account(123, 50000);
		double amt=a.deposit(1000);
		System.out.println(amt);
		if(a.withdraw(5000))
			System.out.println(a.getBalance());
		
	}
}
