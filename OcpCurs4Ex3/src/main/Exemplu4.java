package main;

import java.util.Arrays;
import java.util.List;

public class Exemplu4 {

	public static void main(String [] args) {
		List<Integer> list = Arrays.asList(3,5,7,8,9,4,3,4,6);
		
		int suma = 
			list.stream()
				.peek(v -> System.out.println("V: " + v))
				.distinct()
				.peek(v -> System.out.println("D: " + v))
				.filter(x -> x % 2 == 1)
				.peek(v -> System.out.println("F: " + v))
				.reduce(0, (x,y) -> x + y);
		
		System.out.println("SUMA: " + suma);
	}
}
