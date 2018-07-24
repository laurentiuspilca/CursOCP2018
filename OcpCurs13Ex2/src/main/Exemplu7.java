package main;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Exemplu7 {

	public static void main(String [] args) {
		Instant i1 = Instant.ofEpochMilli(System.currentTimeMillis());
		System.out.println(i1);
		
		ZonedDateTime zdt1 = 
				ZonedDateTime.ofInstant(i1, ZoneId.systemDefault());
	}
}
