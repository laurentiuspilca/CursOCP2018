package main;

import java.time.ZoneId;

public class Exemplu4 {

	public static void main(String [] args) {
		ZoneId.getAvailableZoneIds()
			.stream()
			.filter(z -> z.contains("Europe"))
			.forEach(System.out::println);
		
		ZoneId z1 = ZoneId.of("Europe/London");
	}
}
