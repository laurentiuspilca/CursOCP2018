package main;

import java.util.Arrays;
import java.util.List;

public class Exemplu2 {

	public static void main(String [] args) {
		List<String> list = Arrays.asList("aaa", "zzz", "bb", "c");
		
		list.stream()
			.sorted()
			.mapToInt(s -> s.length()) // String::length
			.forEach(System.out::println);
	}
}
