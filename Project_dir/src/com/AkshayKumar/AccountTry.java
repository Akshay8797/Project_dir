package com.AkshayKumar;

class Account2 {
	private int acc_no;
	private String name;
	private int bal;
	public Account2(int acc_no, String name, int bal)
	{
		this.acc_no=acc_no;
		this.name=name;
		this.bal=bal;
	}
	public void wdraw(int acc_no, int amount) throws InsufficientBalanceException 
	{
		if(bal<amount)
		{
			throw new InsufficientBalanceException(""+bal);
		}
		int d=bal-amount;
		this.bal=d;
	} 
	public String toString()
	{
		return "Amount: "+bal;
	}
}
class InsufficientBalanceException extends Exception
{
	private String msg;
	public InsufficientBalanceException()
	{
		this.msg="";
	}
	public InsufficientBalanceException(String msg)
	{
		this.msg=msg;
	}
	@Override
	public String toString()
	{
		return "Insufficient Balance : "+this.msg;
	}
}
public class AccountTry {

	public static void main(String[] args) throws InsufficientBalanceException {
		Account2 a=new Account2(123456789, "Akshay", 3000);;
		try {
			a.wdraw(123456789, 4000);
		}
		catch(InsufficientBalanceException e)
		{
			e.printStackTrace();
		}
	}
}