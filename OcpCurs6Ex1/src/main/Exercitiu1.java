package main;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Exercitiu1 {

	public static void main(String [] args) {
		List<Integer> list = Arrays.asList(3,5,1,7,5,9);
		
		Optional<Integer> o1 = 
			list.stream()
				.filter(x -> x % 2 == 0) // Predicate<Integer>
				.findFirst(); // findAny()
		
		Integer x = o1.orElseGet(() -> 5); // Supplier<Integer>
		System.out.println(x);
	}
}
