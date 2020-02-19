package com.AkshayKumar;
public class K2{
	public static void main(String[] args)
	{
		StringBuilder sb=new StringBuilder("Welcome To Java");
		int len=sb.length();
		char s;
		for (int i=0; i<len; i++)
		{
			s=sb.charAt(len-1);
			sb =new StringBuilder(s+sb.substring(0, sb.length()-1));
			System.out.println(sb);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.print(e);
			}
		}
	}
}