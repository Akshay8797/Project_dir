package com.Collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class A_Q3 {

	public static void main(String[] args) {
		ArrayList<Integer> arrli=new ArrayList<Integer>(4);
		arrli.add(12);
		arrli.add(5);
		arrli.add(10);
		arrli.add(15);
		ListIterator<Integer> litr=arrli.listIterator(arrli.size());
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		
	}
}