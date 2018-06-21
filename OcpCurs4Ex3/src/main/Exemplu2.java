package main;

import java.util.Arrays;
import java.util.List;

public class Exemplu2 {

	public static void main(String [] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,4,5,6,2,3,1);
		
		list.stream().distinct().forEach(System.out::println);
		
		long n1 = list.stream().count();
		long n2 = list.stream().distinct().count();
	}
}
