package main;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exemplu8 {

	/*
	 * [{"abc", 10}, {"qwe", 30}, {"asd", 23}]
	 * 
	 * {
	 *	"abc" : 10,
	 *  "awe" : 30,
	 *  "asd" : 23
	 * }
	 */
	
	public static void main(String [] args) {
		List<Produs> produse = 
				Arrays.asList(
						new Produs("abc", 10),
						new Produs("qwe", 30),
						new Produs("abc", 23));
		
		Map<String, Double> map = produse.stream()
				.collect(
						Collectors.toMap(
								Produs::getSerie, 
								Produs::getPret,
								(x, y) -> x + y));
		
		System.out.println(map);
	}
}
