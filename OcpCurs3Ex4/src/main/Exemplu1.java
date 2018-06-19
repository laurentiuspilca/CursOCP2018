package main;

import java.util.Random;
import java.util.stream.Stream;

public class Exemplu1 {

	public static void main(String [] args) {
		Random r = new Random();
		Stream<Integer> s = Stream.generate(() -> r.nextInt(1000));
		s.limit(10).forEach(System.out::println);
	}
}
