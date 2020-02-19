package com.AkshayKumar;
interface Sortable1{
	boolean compare(Sortable1 s);
}

class Employee3 implements Sortable1
{
   String name;
   float salary;
   public Employee3(String name, float salary)
   {
	   this.name=name;
	   this.salary=salary;
   }
   @Override
   public boolean compare(Sortable1 s) {
	   if(this.salary < ((Employee3)s).salary)
		   return true;
	   return false;
   }
   
   public String toString()
   {
	   return ""+this.salary;
   }
}

class Circle2 implements Sortable1, Cloneable
{
   float radius;
   public Circle2(float radius)
   {
	   this.radius=radius;
   }
	@Override
	public boolean compare(Sortable1 s) {
		if(this.radius < ((Circle2)s).radius)
			return true;
		return false;
	}
	public String toString()
	{
		return ""+this.radius;
	}
}

public class J15 {

	public static void sortAll(Sortable1 x[]) 
	{
	   Sortable1 temp;
	   for(int i=0; i<x.length;i++)
	   {
		   for(int j=i+1; j<x.length;j++)
		   {
			   if(x[i].compare(x[j]))
			   {
				   temp=x[i];
				   x[i]=x[j];
				   x[j]=temp;
			   }
		   }
		   
	   }
	   for(int i=0; i<x.length;i++)
	   {
		   System.out.println(x[i]);
	   }
	
	}
	public static void main(String[] args) throws Exception
	{
		Sortable1 se[]=new Sortable1[2];
		Sortable1 sc[]=new Sortable1[2];
		se[0]=new Employee3("A",100);
		se[1]=new Employee3("B",200);
		sc[0]=new Circle2(2);
		sc[1]=new Circle2(3);
		sortAll(se);
		sortAll(sc);
	}
}