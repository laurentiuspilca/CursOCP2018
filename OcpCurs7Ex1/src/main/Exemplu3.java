package main;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Exemplu3 {

	public static void main(String [] args) {
		List<Integer> list = Arrays.asList(1,4,5,6,1,4,8,6);
		
		Set<Integer> set = list.stream().collect(Collectors.toSet());
		
		System.out.println(set);
	}
}
