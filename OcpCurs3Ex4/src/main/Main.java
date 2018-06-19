package main;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Main {

	public static void main(String [] args) {
		Stream<String> s1 = Stream.empty();
		Stream<String> s2 = Stream.of("Hello", "World");
		
		Set<Integer> set = new HashSet<>();
		Stream<Integer> s3 = set.stream();
		
		Stream<Integer> s4 = Stream.iterate(0, i -> i+1);
		Stream<Integer> s5 = Stream.generate(() -> 1);
	}
	
	public Stream<Integer> xyz() {
		try {
			return Stream.of(3,5,7,8,9);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return Stream.empty();
	}
}
