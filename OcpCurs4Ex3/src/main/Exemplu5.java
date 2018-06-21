package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplu5 {

	public static void main(String [] args) {
		List<Integer> list = Arrays.asList(1,3,4,5,6,7,8,9);
		List<Integer> impare = new ArrayList<>();
		
		//BAD PRACTICE
		list.stream()
			.filter(x -> x % 2 == 1)
			.peek(x -> impare.add(x))
			.count();
		
		//CORECT
		List<Integer> impare2 = 
				list.stream()
					.filter(x -> x % 2 == 1)
					.collect(Collectors.toList());
	}
}
