package main;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exemplu12 {

	public static void main(String [] args) {
		List<String> list = Arrays.asList("aaa", "bb", "cccc", "dddddd");
		
		Map<Boolean, List<String>> map = 
				list.stream().collect(Collectors.partitioningBy(x -> x.length() % 2 == 0));
		
		System.out.println(map);
	}
}
