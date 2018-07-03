package main;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exemplu10 {

	public static void main(String [] args) {
		List<String> list = Arrays.asList("aaa", "b", "bbb", "cc", "q", "qq");
		
		/*
		 * {
		 *   1 = 2,
		 *   2 = 2,
		 *   3 = 2
		 * }
		 */
		
		Map<Integer, Long> map = 
				list.stream().collect(
						Collectors.groupingBy(String::length,
								Collectors.counting()
								)); 
		
		System.out.println(map);
	}
}
