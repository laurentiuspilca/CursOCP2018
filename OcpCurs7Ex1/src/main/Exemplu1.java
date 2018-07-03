package main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplu1 {

	public static void main(String [] args) {
		List<Integer> list = Arrays.asList(1,4,5,6);
		
		List<Integer> list2 = list.stream()
				.filter(x -> x % 2 == 0)
				.collect(Collectors.toList());
		
		System.out.println(list2);
	}
}
