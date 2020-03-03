package com.Date;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class TimeFor12 {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		LocalDateTime ldt = LocalDateTime.now();
		LocalDateTime newTime;
		if (ldt.getHour() > 12) {
			newTime = ldt.plusDays(1);
			today = today.plusDays(1);
			newTime = today.atTime(12, 00);
		} else
			newTime = LocalDateTime.now();
		Duration d1 = Duration.between(ldt, newTime);
		System.out.println(d1);
	}
}