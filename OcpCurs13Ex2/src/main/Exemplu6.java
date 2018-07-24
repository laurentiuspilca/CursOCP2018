package main;

import java.time.Duration;
import java.time.Period;

public class Exemplu6 {

	public static void main(String [] args) {
		Duration d1 = Duration.ofDays(10);
		
		System.out.println(d1); // PT240H
		
		Period p1 = Period.of(1, 2, 5);
		
		System.out.println(p1);
		
		Period p2 = Period.ofMonths(10);
		
		System.out.println(p2);
	}
}
