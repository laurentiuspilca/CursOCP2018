package main;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exemplu6 {

	public static void main(String [] args) {
		List<Integer> list = Arrays.asList(3,8,5,6,2,1,8,9);
		
		list.stream()
			.sorted()
			.forEach(System.out::println);
		
		System.out.println();
		
		list.stream()
			.sorted(Collections.reverseOrder())
			.forEach(System.out::println);
	}
}
