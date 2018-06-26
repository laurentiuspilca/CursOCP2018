package main;

import java.util.Arrays;
import java.util.List;

public class Exercitiu3 {

	public static void main(String [] args) {
		List<String> list = 
				Arrays.asList("aaaaaa", "aaa", "aaaaaaaaaaa", "aa", "a");
		
		list.stream()
			.sorted( (s1,s2) -> s2.length() - s1.length())
			.limit(3)
			.forEach(System.out::println);
	}
}
