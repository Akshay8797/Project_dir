package com.Cts.OOP;

public class Account {
	private long accNo;
	private double balance;
	public Account(long accNo, double balance) {
		this.accNo = accNo;
		this.balance = balance;
	}
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double deposit(double depositAmt)
	{
		return balance+depositAmt;
	}
	public boolean withdraw(double withdrawAmt)
	{
		if(balance>withdrawAmt)
		{
			balance=balance-withdrawAmt;
			setBalance(balance);
			return true;
		}
		else
			return false;
	}

}
