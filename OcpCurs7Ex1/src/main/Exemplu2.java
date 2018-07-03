package main;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exemplu2 {

	public static void main(String [] args) {
		List<Integer> list = 
			Stream.iterate(1, i -> i + 2)
				.limit(10)
				.collect(Collectors.toList());
		
		System.out.println(list);
	}
}
