package com.Date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateLocales {

	public static void main(String[] args) {
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("d. MMMM yyyy", Locale.FRENCH);
		LocalDate date = LocalDate.of(2020, 9, 13);
		String formattedDate = date.format(format1);
		System.out.println("in french pattern " + formattedDate);
	}

}
