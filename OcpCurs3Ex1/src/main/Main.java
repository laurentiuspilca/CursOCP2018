package main;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String [] args) {
		List<Integer> list = Arrays.asList(3,6,7,8,9,5,6);
		
		int suma1 = 0;
		for (Integer x : list) {
			if (x % 2 != 0) {
				suma1 += x;
			}
		}
		
		int suma2 = list.stream()
				.filter(x -> x % 2 != 0)
				.reduce(0, (x,y) -> x + y);
		
		System.out.println(suma1 + " " + suma2);
	}
}
