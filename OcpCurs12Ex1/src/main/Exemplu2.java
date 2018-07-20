package main;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exemplu2 {

	public static void main(String [] args) {
		List<Integer> list = Arrays.asList(2,5,7,8,9,4);
		
		List<Integer> concurrentList =
				Collections.synchronizedList(list);
		
		// [3,6,7,8]
		// [3,6,7]
	}
	
}
