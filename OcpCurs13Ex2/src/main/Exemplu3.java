package main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Exemplu3 {

	public static void main(String [] args) {
		LocalTime t1 = LocalTime.of(12, 45);
		LocalDate ld1 = LocalDate.of(2018, Month.JANUARY, 12);
		
		LocalDateTime ldt1 = LocalDateTime.of(2018, 1, 12, 12, 45);
		LocalDateTime ldt2 = LocalDateTime.of(ld1, t1);
		
		System.out.println(ldt2);
	}
}
