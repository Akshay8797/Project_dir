package com.Date;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.time.temporal.ChronoField;

public class Reach29Feb {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		long year = today.getLong(ChronoField.YEAR);
		LocalDate temp = null, temp1 = null;
		long checkYear = year;
		if (Year.isLeap(year)) {
			temp = LocalDate.parse(year + "-02-29");
			if (today.isAfter(temp)) {
				checkYear = checkYear + 1;
				while (!(Year.isLeap(checkYear))) {
					checkYear = checkYear + 1;
				}
				temp1 = LocalDate.parse(checkYear + "-02-29");
				Period period = Period.between(today, temp1);
				System.out.println(period.getDays() + " Days, " + period.getMonths() + " Months, " + period.getYears()+" Years");
			} else {
				Period period = Period.between(today, temp);
				System.out.println(period.getDays() + " Days, " + period.getMonths() + " Months, " + period.getYears()+" Years");
			}
		}
	}
}