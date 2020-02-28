package com.Collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

class User implements Comparable {
	private String name;
	private String loginName;
	private String password;
	public User(String name, String loginName, String password) {
		this.name=name;
		this.loginName=loginName;
		this.password=password;
	}

	@Override
	public int compareTo(Object obj) {
		User user=(User)obj;
		if(this.name.compareTo(user.name)>0)
			return 1;
		else if(this.name.compareTo(user.name)<0)
			return -1;
		else return 0;
		
	}

	@Override
	public String toString() {
		return "Name: "+name;
	}
}

public class A_Q6 {
	private static Map<String, TreeSet<User>> userMap=new HashMap<String, TreeSet<User>>();
	private static Map<String, List<String>> msgMap=new HashMap<String, List<String>>();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Create a Chatroom\t 2.Add the User\t 3.User Login");
		System.out.println("4.Send a Message\t 5.Display messages from specific Chatroom\t 6.List all users from specific Chatroom");
		System.out.println("7.Logout\t 8.Delete an User");
		int choice=sc.nextInt();
		switch(choice) {
			case 1: 
				if(userMap.containsKey());
		
		
		/*User u1=new User("Ram");
		User u2=new User("Lakhan");
		TreeSet<User> userTree=new TreeSet<User>();
		userTree.add(u1);
		userTree.add(u2);
		Iterator<User> userItr=userTree.iterator();
		while (userItr.hasNext())
		{
			User u=userItr.next();
			System.out.println(u);
		}
		HashMap<Integer, User> userMap=new HashMap<>();
		userMap.put(101, u1);
		userMap.put(102, u2);
		HashMap<Integer, String> msgMap=new HashMap<>();
		msgMap.put(101, "Hi There");
		msgMap.put(102, "Hello");*/

	}
	}

}
