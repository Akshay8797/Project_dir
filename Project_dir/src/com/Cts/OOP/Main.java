package com.Cts.OOP;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int id, d;
		float b;
		String p, name, t;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Advertisement Id: ");
		id = sc.nextInt();
		System.out.println("Enter the Priority (High / Medium / Low): ");
		sc.nextLine();
		p = sc.nextLine();
		System.out.println("Enter the no. of Days Advertisement is Published: ");
		d = sc.nextInt();
		System.out.println("Enter the Client Name: ");
		sc.nextLine();
		name = sc.nextLine();
		System.out.println("Enter the type of Advertisement (Video / Image / Text): ");
		t = sc.nextLine();
		System.out.println("Enter the Base Cost: ");
		b = sc.nextFloat();
		sc.close();
		if (t.equalsIgnoreCase("video")) {
			System.out.println("Enter the Duration in Minutes: ");
			int dr = sc.nextInt();
			Advertisement a1 = new VideoAdvertisement(id, p, d, name, dr);
			System.out.println("The Advertisement Cost is : " + a1.calculateAdvertisementCharge(b));
		} else if (t.equalsIgnoreCase("image")) {
			System.out.println("Enter the Size in inches: ");
			int in = sc.nextInt();
			Advertisement a1 = new VideoAdvertisement(id, p, d, name, in);
			System.out.println("The Advertisement Cost is : " + a1.calculateAdvertisementCharge(b));
		} else if (t.equalsIgnoreCase("text")) {
			System.out.println("Enter the No. of Characters: ");
			int ch = sc.nextInt();
			Advertisement a1 = new VideoAdvertisement(id, p, d, name, ch);
			System.out.println("The Advertisement Cost is : " + a1.calculateAdvertisementCharge(b));
		} else
			System.out.println("Invalid Input!");
	}
}