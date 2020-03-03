package com.Date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;

@FunctionalInterface
interface TemporalAdjuster {
	Temporal adjustInto(Temporal temp);
}

public class SundaysCount implements TemporalAdjuster {
	public static void main(String[] args) {
		// LocalDate nextWorkingDate = currentLocalDate.with(new SundaysCount());
		// System.out.println("Next working day = " + nextWorkingDate);
	}

	@Override
	public Temporal adjustInto(Temporal temp) {
		DayOfWeek dow = DayOfWeek.of(temp.get(ChronoField.DAY_OF_WEEK));
		int dayToAdd = 1, count = 0;
		if (dow == DayOfWeek.SUNDAY) {
			dayToAdd = 7;
			count++;
		}
		return temp.plus(dayToAdd, ChronoUnit.DAYS);
	}
}