package main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplu7 {

	// ["ana", "are", "mere"] -->   "ana,are,mere"
	
	// Collectors.joining()  --> "anaaremere"
	// Collectors.joining(",") --> "ana,are,mere"
	
	public static void main(String [] args) {
		List<String> list = Arrays.asList("ana", "are", "mere");
		
		String res = list.stream().collect(Collectors.joining(","));
		
		System.out.println(res);
	}
}
