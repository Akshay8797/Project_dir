package com.AkshayKumar;
class Employee5 {
	private int e_id;
	private String name;
	private double sal;
	public Employee5(int e_id, String name, double sal)
	{
		this.e_id=e_id;
		this.name=name;
		this.sal=sal;
	}
	public double getsal()
	{
		return this.sal;
	}
}
class Manager extends Employee5 {
	private double incentive;
	public Manager(int e_id, String name, double sal, double incentive)
	{
		super(e_id, name, sal);
		this.incentive=incentive;
	}
	public double getsal()
	{
		return super.getsal()+this.incentive;
	}
	public String toString()
	{
		return "Salary: "+this.getsal();
	}
}
class Labour extends Employee5 {
	private double overt;
	public Labour(int e_id, String name, double sal, double overt)
	{
		super(e_id, name, sal);
		this.overt=overt;
	}
	public double getsal()
	{
		return super.getsal()+this.overt;
	}
	public String toString()
	{
		return "Salary: "+this.getsal();
	}
}
public class J6 {
	public static double tsal(Employee5 emp[])
	{
		double total=0.0;
		for(int i=0; i<emp.length; i++)
		{
			total=total+emp[i].getsal();
		}
		return total;
	}
	public static void main(String[] args)
	{
		Employee5 e[]=new Employee5[4];
		e[0]=new Manager(100, "Ram", 50000, 2000);
		e[1]=new Manager(101, "Raju", 40000, 1000);
		e[2]=new Labour(102, "Ramu", 15000, 500);
		e[3]=new Manager(103, "Shyam", 18000, 100);
		double totalSal=tsal(e);
		System.out.println(totalSal);
	}
}