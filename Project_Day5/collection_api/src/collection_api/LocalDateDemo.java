package collection_api;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class LocalDateDemo {

	public static void main(String[] args) {
		LocalDate d1 = LocalDate.now();
		System.out.println(d1);
		
		LocalDate d2 = LocalDate.of(2012, 02, 13);
		System.out.println(d2);
		
		LocalDate d3 = LocalDate.parse("2018-05-19");
		System.out.println(d3);
		
		System.out.println("------------------------------------------------");
		System.out.println(d1.plusDays(1));
		System.out.println(d1.minus(1, ChronoUnit.MONTHS));
		System.out.println(d2.getDayOfWeek());
		System.out.println(d3.getDayOfMonth());
		System.out.println(d2.isLeapYear());
		
		//Calculate age based on dob
		System.out.println("------------------------------------------------");
		
		 LocalDate dob = LocalDate.parse("2005-08-02");

	        Period age = Period.between(dob, LocalDate.now());

	        System.out.println("Age = " + age.getYears() + " Years");
	        System.out.println("Months = " + age.getMonths());
	        System.out.println("Days = " + age.getDays());
	}

}
