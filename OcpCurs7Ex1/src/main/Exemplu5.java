package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplu5 {

	public static void main(String [] args) {
		List<Integer> list = Arrays.asList(1,4,5,6);
		
		ArrayList<Integer> list2 = list.stream()
				.filter(x -> x % 2 == 0)
				.collect(Collectors.toCollection(ArrayList::new)); // () -> new ArrayList<>()
		
		// (x, y) -> o.m(x, y)    ----->    o::m   O::m
		
		System.out.println(list2);
	}
}
