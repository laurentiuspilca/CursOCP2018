package main;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exemplu13 {

	public static void main(String [] args) {
		List<String> list = Arrays.asList("aaa", "bb", "cccc", "dddddd");
		
		Map<Boolean, Integer> map = 
				list.stream().collect(
						Collectors.partitioningBy(x -> x.length() % 2 == 0, 
								Collectors.summingInt(s -> s.length()))); // String::length
		
		System.out.println(map);
	}
}
