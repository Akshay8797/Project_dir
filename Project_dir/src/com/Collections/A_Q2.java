package com.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class A_Q2 {
	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("A");
		lhs.add("D");
		lhs.add("C");
		lhs.add("B");
		Iterator<String> itr = lhs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
		HashSet<String> hs = new HashSet<String>();
		hs.add("A");
		hs.add("D");
		hs.add("C");
		hs.add("B");
		Iterator<String> itr1 = hs.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}
}