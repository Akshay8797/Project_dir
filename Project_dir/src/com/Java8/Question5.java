package com.Java8;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;

public class Question5 {

	public static void result(ArrayList<String> at, Function<ArrayList<String>, String> ft, Consumer<String> ch) {
		String sb = ft.apply(at);
		System.out.println("String with Only First Character from all Inputs are: ");
		ch.accept((new String(sb)));
	}

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("Yash");
		a.add("Akshay");
		a.add("Ravi");
		a.add("Anuj");
		Function<ArrayList<String>, String> chr = (ArrayList<String> at) -> {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < at.size(); i++) {
				String m = at.get(i);
				char ch = m.charAt(0);
				sb.append(ch);
			}
			return new String(sb);
		};
		Consumer<String> str = (String c) -> {
			System.out.print(c);
		};
		result(a, chr, str);
	}
}