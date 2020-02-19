package com.AkshayKumar;
class queuedArray {
	private int first=0;
	private int last=0;
	private int ary[];
	public queuedArray()
	{
		ary = new int[10];
	}
	public queuedArray(int size)
	{
		ary = new int[size];
	}
	public boolean isEmpty()
	{
		if (last==0)
			return true;
		else 
			return false;
	}
	public boolean isFull()
	{
		if (last>=ary.length)
			return true;
		else
			return false;
	}
	public void push(int e)
	{
		if (!isFull())
		{
			ary[last]=e;
			++last;
		}
	}
	public void pop()
	{
		if (!isEmpty())
		{
			--last;
			for (int i=0; i<last; i++)
			{
				ary[i]=ary[i+1];
			}
			ary[last]=0;
		}
	}
	public String toString()
	{
		StringBuilder sb=new StringBuilder();
		for (int j=0; j<ary.length; j++)
		{
			sb.append(ary[j]+" ");
		}
		return sb.toString();
			
	}
}
public class J4 {
	public static void main(String[] args)
	{
		queuedArray arr=new queuedArray(5);
		arr.push(10);
		arr.push(2);
		arr.push(5);
		arr.push(3);
		arr.push(9);
		arr.pop();
		System.out.print(arr.toString());
	}
}