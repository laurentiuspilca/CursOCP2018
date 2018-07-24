package main;

import java.time.LocalTime;

public class Exemplu1 {

	/*
	 * LocalTime   ->   13:56:30.4589
	 * LocalDate   ->	2018-07-24
	 * LocalDateTime  ->  2018-07-24T13:56:30.4589
	 * ZoneDateTime -> LocalDateTime + ZoneId  
	 * Instant -> timestamp + ZoneId 
	 * Period   -> P12D
	 * Duration -> PT12H
	 * 
	 */
	
	public static void main(String [] args) {
		LocalTime t1 = LocalTime.now();
		LocalTime t2 = LocalTime.of(12, 43);
		LocalTime t3 = LocalTime.of(12, 23, 56);
		LocalTime t4 = LocalTime.of(12, 23, 54, 100);
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		
		LocalTime t5 = t1.plusMinutes(100);
		LocalTime t6 = t2.withMinute(20);
		
		boolean b1 = t5.isAfter(t6);
		boolean b2 = t5.isBefore(t6);
		
		LocalTime t7 = t1.plusMinutes(100)
						 .plusHours(10)
						 .minusNanos(1000)
						 .withSecond(12);
		
		LocalTime t8 = LocalTime.now().withMinute(0).withSecond(0).withNano(0);
		System.out.println(t8);
	}
}
