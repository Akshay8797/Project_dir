package com.AkshayKumar;
class Date {
	private int day;
	private int month;
	private int year;
	public Date(int day, int month, int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public String toString()
	{
		return +day+" / "+month+" / "+year;
	}
}
class Employee2 implements Cloneable {
	private Date dob;
	public Employee2(Date dob)
	{
		this.dob=dob;
	}
	public Date getDob()
	{
		return dob;
	}
	public Object clone()
	{
		try
		{
			return super.clone();
		}
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
			return null;
		}
	}
	public String toString()
	{
		return "DOB: "+dob;
	}
}
public class J13 {
	public static void main (String[] args)
	{
		Employee2 e=new Employee2(new Date(8, 5, 2010));
		Employee2 ec=(Employee2)e.clone();
		System.out.println(e);
		System.out.println(ec);
	}
}