package main;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercitiu2 {

	public static void main(String [] args) {
		List<String> list = Arrays.asList("aaa", "zzzz", "ert");
		
		list.stream().sorted().forEach(System.out::println);
		
		list.stream().sorted( (s1,s2) -> s2.compareTo(s1) ).forEach(System.out::println);
		list.stream().sorted( Collections.reverseOrder() ).forEach(System.out::println);
	}
}
