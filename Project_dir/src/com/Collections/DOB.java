package com.Collections;

class DOB {
	private int day;
	private int month;
	private int year;

	public DOB(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	@Override
	public String toString() {
		return "" + day + "/" + month + "/" + year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public boolean equals(Object d) {
		DOB dob = (DOB) d;
		if(this.year>dob.year)
			return false;
		else if(this.year<dob.year)
			return false;
		else if (this.year==dob.year && this.month > dob.month)
			return false;
		else if (this.year==dob.year && this.month < dob.month)
			return true;
		else if (this.year==dob.year && this.month == dob.month && this.day > dob.day)
			return false;
		else if (this.year==dob.year && this.month == dob.month && this.day < dob.day)
			return true;
		else
			return true;
	}
	@Override
	public int hashCode()
	{
		return 10;
	}
}