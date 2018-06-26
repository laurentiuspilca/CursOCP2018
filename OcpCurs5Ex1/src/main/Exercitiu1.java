package main;

import java.util.Arrays;
import java.util.List;

public class Exercitiu1 {

	public static void main(String [] args) {
		List<Integer> list = Arrays.asList(2,4,6,7,8,9);
		list.stream()
			.filter(n -> n % 2 == 1)
			.forEach(System.out::println);
	}
}
