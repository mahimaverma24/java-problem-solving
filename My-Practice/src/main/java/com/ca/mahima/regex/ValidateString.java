package com.ca.mahima.regex;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;

/**
 * Validate given string has only characters
 * 
 * @author mverma
 *
 */
public class ValidateString {
	public static void main(String[] args) {

		// String string = "mksbcds";
		// System.out.println(Pattern.matches("^*[a-zA-Z]*$", string));
//		Integer a =1;
//		int b=2;
//		System.out.println(a==b);
//		System.out.println(a.compareTo(b));

		////////////////////////////////////////
		String start = "2020-12-01";
		String end = "2021-01-01";
		LocalDate startDate = LocalDate.parse(start);
		LocalDate endDate = LocalDate.parse(end);

		int days = Days.daysBetween(startDate, endDate).getDays();
		List<LocalDate> dates = new ArrayList<LocalDate>(days); // Set initial capacity to `days`.
		for (int i = 0; i < days; i++) {
			LocalDate d = startDate.withFieldAdded(DurationFieldType.days(), i);
			dates.add(d);
		}

		// System.out.println("Total dates list" + dates);
		////////////////// making list of holidays
		String startHoliday = "2020-12-21";
		String endHoliday = "2020-12-31";
		LocalDate startDateHoliday = LocalDate.parse(startHoliday);
		LocalDate endDateHoliday = LocalDate.parse(endHoliday);

		int holidays = Days.daysBetween(startDateHoliday, endDateHoliday).getDays();
		List<LocalDate> holidayDates = new ArrayList<LocalDate>(holidays); // Set initial capacity to `days`.
		// Set initial capacity to `days`.
		for (int i = 0; i < holidays; i++) {
			LocalDate d = startDate.withFieldAdded(DurationFieldType.days(), i);
			holidayDates.add(d);
		}
		// System.out.println("Total holiday dates list" + holidayDates);
		// get business working dates by subtracting holidays from all days
		dates.removeAll(holidayDates);

		System.out.println(dates);
	}
}
