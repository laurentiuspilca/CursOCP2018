package main;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Exercitiu2 {

	public static void main(String [] args) {
		List<Integer> list = Arrays.asList(3,1,1,9,5,3);
		
		Optional<Integer> o1 = 
			list.stream()
				.filter(x -> x % 2 == 0) // Predicate<Integer>
				.min( (x,y) -> x-y ); // min()
		
		Integer x = o1.orElseGet(() -> 5); // Supplier<Integer>
		System.out.println(x);
	}
}
