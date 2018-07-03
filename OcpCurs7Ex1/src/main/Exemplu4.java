package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exemplu4 {

	public static void main(String [] args) {
		List<Integer> list = Arrays.asList(1,4,5,7,8,9);
		List<Integer> result = new ArrayList<>();
		
		// NOT BEST PRACTICE
		list.stream()
			.filter(x -> x % 2 == 0)
			.peek(x -> result.add(x))
			.forEach(x -> {});
		
		System.out.println(result);
	}
}
