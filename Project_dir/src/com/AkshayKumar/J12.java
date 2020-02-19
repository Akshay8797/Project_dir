package com.AkshayKumar;
interface Sortable {
	boolean compare(Sortable s);
}
class Employee1 implements Sortable {
	private String name;
	private int sal;
	public Employee1(String name, int sal)
	{
		this.name=name;
		this.sal=sal;
	}
	public boolean compare(Sortable s)
	{
		if (this.sal<((Employee1)s).sal)
			return true;
		else
			return false;
	}
	public String toString()
	{
		return ""+this.sal;
	}
}
class Circle1 implements Sortable {
	private int r;
	public Circle1(int r)
	{
		this.r=r;
	}
	public boolean compare(Sortable s)
	{
		if(this.r<((Circle1)s).r)
			return true;
		else
			return false;
	}
	public String toString()
	{
		return ""+this.r;
	}
}
public class J12 {
	public static void sortAll(Sortable s[])
	{
		Sortable temp;
		for (int i=0; i<s.length; i++)
		{
			for(int j=i+1; j<s.length; j++)
			{
				if(s[i].compare(s[j]))
				{
					temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
			}
		}
		for (int j=0; j<s.length; j++)
		{
			System.out.println(s[j]);
		}
	}
	public static void main (String[] args)
	{
		Sortable s[]=new Sortable[2];
		s[0]=new Circle1(5);
		s[1]=new Circle1(6);
		sortAll(s);
	}
}