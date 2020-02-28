package com.Training.Assessment;

import java.util.HashMap;
import java.util.Scanner;

class strDup {
	private String str;

	public strDup(String str) {
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	public void Dup(String str) {
		str = str.replaceAll("\\s", "");
		HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
		char[] strAry = str.toCharArray();
		for (char c : strAry) {
			if (charCount.containsKey(c))
				charCount.put(c, charCount.get(c) + 1);
			else
				charCount.put(c, 1);
		}
		System.out.println(charCount);
	}
}

public class Week1_Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String st = sc.nextLine();
		strDup s = new strDup(st);
		System.out.println("The Character Occurences are: ");
		s.Dup(s.getStr());
		sc.close();
	}
}