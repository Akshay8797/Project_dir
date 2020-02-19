package com.AkshayKumar;
class Account {
	private int acc_no;
	private String name;
	private int bal;
	public Account(int acc_no, String name, int bal)
	{
		this.acc_no=acc_no;
		this.name=name;
		this.bal=bal;
	}
	public void deposit(int acc_no, int amount)
	{
		int d=bal+amount;
		this.bal=d;
	}
	public void wdraw(int acc_no, int amount)
	{
		int d=bal-amount;
		this.bal=d;
	} 
	public String toString()
	{
		return "Amount: "+bal;
	}
}
public class J2 {
	public static void main(String[] args)
	{
		Account a=new Account(123456789, "Akshay", 3000);
		Account b=new Account(987654321, "Anuj", 5000);
		a.deposit(123456789, 2000);
		System.out.println("Amount: "+a.toString());
		b.wdraw(987654321, 1000);
		System.out.println("Amount: "+b.toString());
	}
}