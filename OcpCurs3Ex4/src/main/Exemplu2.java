package main;

import java.util.stream.Stream;

public class Exemplu2 {

	public static void main(String [] args) {
		Stream<Integer> s = Stream.iterate(1, i -> i + 2);
		s.limit(10).forEach(System.out::println);
	}
}
