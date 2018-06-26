package main;

import java.util.Optional;
import java.util.stream.Stream;

public class ExempluOptional {

	public static void main(String [] args) {
		Optional<Integer> o1 = Optional.empty();
		
		Integer z = 10;
		Optional<Integer> o2 = Optional.of(z);
		
		Optional<Integer> o3 = Optional.ofNullable(z);
		
		//o3.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
		
		o3.filter(x -> x % 2 == 0).ifPresent(System.out::println);
		
		//o3.map(x -> x * 3).ifPresent(System.out::println);
		//o3.flatMap(x -> Optional.of(x * 3)).ifPresent(System.out::println);
		
		Stream<Integer> s = Stream.of(2,3,4);
		o3.map(x -> s.findFirst()).ifPresent(System.out::println);
		o3.flatMap(x -> s.findFirst()).ifPresent(System.out::println);
		
		if (o1.isPresent()) {
			Integer q = o3.get();
		}
		
		int x = o3.orElse(0);
		int y  = o3.orElseGet(() -> 1);
		
	}
}
