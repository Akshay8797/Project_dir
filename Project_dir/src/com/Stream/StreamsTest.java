package com.Stream;

import static java.util.stream.Collectors.groupingBy;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsTest {

	public static void main(String[] args) {
		// Question 1
		List<Fruit> fList = TestData.getAllFruits();
		List<Fruit> fl = fList.stream().filter(f -> (f.getCalories() < 100))
				.sorted(Comparator.comparing(Fruit::getCalories).reversed()).collect(Collectors.toList());
		fl.stream().map(f -> f.getName() + " " + f.getCalories()).forEach(System.out::println);
		// Question 2
		Map<String, List<Fruit>> groupMap = fList.stream().collect(groupingBy(Fruit::getColor));
		System.out.println(groupMap);
		// Question 3
		List<Fruit> f2 = fList.stream().filter(ft -> (ft.getColor().equals("Red")))
				.sorted(Comparator.comparing(Fruit::getPrice)).collect(Collectors.toList());
		f2.stream().map(ft -> ft.getName() + " " + ft.getPrice()).forEach(System.out::println);
		// Question 4
		List<News> nList = TestData.getAllNews();
		// Question 5
		long x = nList.stream().filter(n -> n.getComment().contains("budget")).count();
		System.out.println("Count: " + x);
		// Question 6
		nList.stream().collect(Collectors.groupingBy(News::getCommentByUser, Collectors.counting()))
				.forEach((key, value) -> System.out.println(key + " " + value));
		// Question 7
		List<Transaction> lt = TestData.getAllTransactions();
		lt.stream().filter(tr -> tr.getYear() == 2011).sorted(Comparator.comparing(Transaction::getValue))
				.map(tr -> tr.getTrader() + " " + tr.getValue()).forEach(System.out::println);
		

	}

}
