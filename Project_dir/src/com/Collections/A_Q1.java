package com.Collections;

import java.util.Iterator;
import java.util.TreeSet;

class Person implements Comparable<Person> {
	private double weight;
	private double height;
	private String name;

	public Person(double weight, double height, String name) {
		this.weight = weight;
		this.height = height;
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public int compareTo(Person a) {
		if(this.weight>a.weight)
			return 1;
		else if(this.weight<a.weight)
			return -1;
		else
		{
			if(this.height>a.height)
				return 1;
			else if(this.weight<a.weight)
				return -1;
			else
				return 0;
		}
	}

	@Override
	public String toString() {
		return "Weight: "+weight+", Height: "+ height+", Name: "+ name;
	}
}

public class A_Q1 {

	public static void main(String[] args) {
		Person p1 = new Person(75.6, 5.7, "Ram");
		Person p2 = new Person(80, 5.8, "Lakhan");
		Person p3 = new Person(78, 5.8, "Shyam");
		TreeSet<Person> ts = new TreeSet<Person>();
		ts.add(p1);
		ts.add(p2);
		ts.add(p3);
		Iterator<Person> itr=ts.iterator();
		while (itr.hasNext())
		{
			Person p=itr.next();
			System.out.println(p);
		}
	}
}