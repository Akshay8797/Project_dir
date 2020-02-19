package com.AkshayKumar;
public class K1{
	public static void sort(int arr[])
	{
		for (int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
			}
		}
	}
	public static void main(String[] args){
	int d[]=new int[args.length];
	for(int i=0; i<args.length; i++)
	{
		d[i]=Integer.parseInt(args[i]);
		System.out.println("args ["+i+"] : "+args[i]);
	}
	sort(d);
	System.out.println("After Sorting : ");
	for(int i=0; i<args.length; i++)
	{
		System.out.println("args ["+i+"] : "+d[i]);
	}
}
}