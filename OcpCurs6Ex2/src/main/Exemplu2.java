package main;

import java.util.stream.IntStream;

public class Exemplu2 {

	public static void main(String [] args) {
		IntStream.of(2,5,6,7,8)
			.mapToDouble(x -> x)
			.forEach(System.out::println);
		
		IntStream.of(2,5,6,7,8)
			.asDoubleStream()
			.forEach(System.out::println);
	}
}
