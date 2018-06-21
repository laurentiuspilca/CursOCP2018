package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exemplu3 {

	public static void main(String [] args) {
		List<List<Integer>> list = new ArrayList<>();
		list.add(Arrays.asList(3,6,7,9));
		list.add(Arrays.asList(1,2,3,4));
		
		int suma = 
			list.stream()
				.flatMap(e -> e.stream())
				.reduce(0, (x,y) -> x+y);
	}
}
