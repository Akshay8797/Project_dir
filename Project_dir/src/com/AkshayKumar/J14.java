package com.AkshayKumar;
class Date1 implements Cloneable {
	private int day;
	private int month;
	private int year;
	public Date1(int day, int month, int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public String toString()
	{
		return +day+" / "+month+" / "+year;
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
}
class Employee4 implements Cloneable {
	private Date1 dob;
	public Employee4(Date1 dob)
	{
		this.dob=dob;
	}
	public Date1 getDob()
	{
		return dob;
	}
	public void setDob(Date1 dob)
	{
		this.dob=dob;
	}
	public Object clone()
	{
		try
		{
			Employee4 e=(Employee4)super.clone();
			e.setDob((Date1)e.getDob().clone());
			return e;
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
public class J14 {
	public static void main (String[] args)
	{
		Employee4 e=new Employee4(new Date1(8, 5, 2010));
		Employee4 ec=(Employee4)e.clone();
		System.out.println(e);
		System.out.println(ec);
		System.out.println("Whether both Objects are Equal: "+(e.getDob()==ec.getDob()));
	}
}