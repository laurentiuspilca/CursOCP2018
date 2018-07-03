package main;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exemplu9 {

	public static void main(String [] args) {
		List<String> list = Arrays.asList("aaa", "b", "bbb", "cc", "q", "qq");
		
		/*
		 * {
		 *   1 = ["b", "q"],
		 *   2 = ["cc", "qq"]
		 *   3 = ["aaa", "bbb"]
		 * }
		 */
		
		Map<Integer, List<String>> map = 
				list.stream().collect(
						Collectors.groupingBy(String::length)); // s -> s.length()
		
		System.out.println(map);
	}
}
