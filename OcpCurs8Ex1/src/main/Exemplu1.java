package main;

import java.util.Arrays;
import java.util.List;

public class Exemplu1 {

	public static void main(String [] args) {
		List<Double> list = 
				Arrays.asList(1.5, 4.0, 3.4, 6.0, 7.7);
		
		double d = 
			list.stream()
				.filter(x -> Math.rint(x) == x)
				.map(x -> 2 * x)
				.findFirst()
				.orElse(-1.0);
		
		System.out.println(d);
	}
}
