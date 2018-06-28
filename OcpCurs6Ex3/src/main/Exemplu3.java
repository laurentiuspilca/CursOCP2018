package main;

import java.util.Arrays;
import java.util.List;

public class Exemplu3 {

	public static void main(String [] args) {
		final List<String> VOWELS = Arrays.asList("a","e","i","o","u");
		List<String> list = Arrays.asList("Hello", "World");
		
		long nr = 
		list.stream()
			.flatMap(s -> Arrays.asList(s.split("")).stream())
			//.filter(x -> VOWELS.contains(x.toLowerCase()))
			.count();
			
		System.out.println(nr);
	}
}
