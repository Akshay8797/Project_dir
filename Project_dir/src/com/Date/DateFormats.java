package com.Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateFormats {

	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss");
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		LocalDate date2 = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime date1 = LocalDateTime.of(date2, time);
		String formattedDate1 = date1.format(dtf);
		String formatedDate2 = date1.format(dtf1);
		System.out.println(formattedDate1);
		System.out.println(formatedDate2);
	}
}