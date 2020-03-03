package com.Java8;

import java.util.*;

public class Question4 {

	public static void main(String[] args) {
		ArrayList<String> students = new ArrayList<String>();
		students.add("Rama");
		students.add("Mohan");
		students.add("Sohan");
		students.add("Anup");
		students.add("Shabbir");
		students.removeIf(stud -> (stud.length() % 2 == 1));
		Iterator<String> iter = students.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}