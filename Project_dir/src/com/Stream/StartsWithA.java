package com.Stream;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class StartsWithA {

	public static void main(String[] args) {
		ArrayList<String> arl=new ArrayList<String>();
		arl.add("AXY");
		arl.add("ABC");
		arl.add("ACD");
		arl.add("BCD");
		arl.add("CDE");
		ArrayList<String> arl2=(ArrayList<String>) arl.stream().filter((String name)->name.startsWith("A")).sorted().collect(Collectors.toList());
		System.out.println(arl2);
	}

}