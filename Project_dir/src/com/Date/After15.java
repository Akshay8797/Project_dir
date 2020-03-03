package com.Date;

import java.time.LocalDate;

public class After15 {

	public static void main(String[] args) {
		LocalDate ld=LocalDate.now();
		System.out.println(ld.plusDays(15));
	}

}