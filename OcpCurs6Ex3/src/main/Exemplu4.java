package main;

import java.util.Arrays;
import java.util.List;

public class Exemplu4 {

	public static void main(String [] args) {
		final List<String> VOWELS = Arrays.asList("a","e","i","o","u");
		List<String> list = Arrays.asList("Hello", "World");
		
		long nr = 
		list.stream()
			.flatMap(s -> Arrays.asList(s.toCharArray()).stream())
			.count();
			
		System.out.println(nr);
	}
}
