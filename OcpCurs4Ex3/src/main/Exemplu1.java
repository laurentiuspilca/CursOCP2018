package main;

import java.util.stream.Stream;

public class Exemplu1 {

	public static void main(String [] args) {
		Stream<Integer> s1 = Stream.of(3,6,7,8,9);
		boolean b1 = s1.allMatch(x -> x % 2 == 0);
		
		Stream<Integer> s2 = Stream.of(3,6,7,8,9);
		boolean b2 = s2.anyMatch(x -> x % 2 == 0);
		
		Stream<Integer> s3 = Stream.of(3,6,7,8,9);
		boolean b3 = s3.noneMatch(x -> x % 2 == 0);
		
		System.out.println(b1 + " " + b2 + " " + b3);
	}
}
