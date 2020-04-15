/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.mytime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeTest {

	public static void main(String[] args) {
	    // TODO: Uncomment the test method that you want to run, and comment out the others
	    
		testNow();
		testCreateAndGetValues();
		testParse();
		testFormat();
	}
  
	/**
	 * TASK: create current date, time, and date-time via now() and print them.
	 */
    public static void testNow() {
		LocalDate today = LocalDate.now();
		System.out.println(today);
  	}
  
	public static void testCreateAndGetValues() {
	  // TODO: create your birthday via of() and verify some of the fields are correct by outputting them using sysout
		LocalDate born = LocalDate.of(1978, 8, 17);
		System.out.println(born);
	}
	
	/**
	 * NOTE: verify these via visual inspection (sysout)
	 */
	public static void testParse() {
		// TODO: create your birthday by parsing a text representation in standard format
	   LocalDate bday = LocalDate.parse("1978-08-17");
		System.out.println(bday);

		String start = "2/15/2016 @ 8:30am";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/dd/yyyy");
		LocalDate feb15 = LocalDate.parse("2/15/2016", formatter);
		System.out.println(feb15);

		String time = "8:30am";
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("h:mm a");
		LocalTime time2 = LocalTime.parse(time, formatter2);
		System.out.println(time2);
	  // OPTIONAL: create the training class start date-time by parsing text in the form "2/15/2016 @ 8:30am"
	  // Note: the 'am' is deliberately lowercase.

	  // optional 1: use a formatter builder to remove case sensitivity from the parse (example in coursebook).
	  
	  // optional 2: pre-process the input text for easier parsing.
	  
	}
	
	/**
	 * TASK: create format strings from the date below in these formats:
	 *  10/14/1066
	 *  14-10-1066
	 */
	public static void testFormat() {
	  LocalDate hastings = LocalDate.of(1066, 10, 14);
	  String display = hastings.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
		System.out.println(display);
	  // TODO: 10/14/1066
		String display2 = hastings.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		System.out.println(display2);

	  // TODO: 14-10-1066
	  
	}
}