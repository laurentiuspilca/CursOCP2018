package main;


import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exemplu6 {

	public static void main(String [] args) {
		String res = 
			Stream.iterate(1, i -> i+1)
				.limit(10)
				.map(String::valueOf)
				.collect(Collectors.joining("-"));
		
		System.out.println(res);
	}
}
