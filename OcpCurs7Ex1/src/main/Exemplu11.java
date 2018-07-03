package main;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exemplu11 {

	public static void main(String [] args) {
		List<String> list = Arrays.asList("aaa", "b", "bbb", "cc", "q", "qq");
		
		/*
		 * {
		 *   1 = "b,q",
		 *   2 = "cc,qq"
		 *   3 = "aaa,bbb"
		 * }
		 */
		
		Map<Integer, String> map = 
				list.stream().collect(
						Collectors.groupingBy(String::length,
								Collectors.joining(",")
								)); // s -> s.length()
		
		System.out.println(map);
	}
}
