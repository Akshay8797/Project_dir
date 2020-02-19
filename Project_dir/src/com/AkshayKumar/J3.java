package com.AkshayKumar;
class stackedArray {
	private int ary[];
	private int top=0;
	public stackedArray()
	{
		ary = new int[10];
	}
	public stackedArray(int size)
	{
		ary = new int[size];
	}
	public boolean isEmpty()
	{
		if (top==0)
			return true;
		else
			return false;
	}
	public boolean isFull()
	{
		if (top >= ary.length-1)
			return true;
		else
			return false;
	}
	public void push(int e)
	{
		if (!isFull())
		{
			ary[top]=e;
			++top;
		}
	}
	public void pop()
	{
		if (!isEmpty())
		{
			ary[top]=0;
			--top;
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
public class J3 {
	public static void main(String[] args)
	{
		stackedArray arr=new stackedArray(5);
		arr.push(10);
		arr.push(2);
		arr.push(5);
		arr.push(3);
		arr.push(9);
		arr.pop();
		System.out.print(arr.toString());
	}
}