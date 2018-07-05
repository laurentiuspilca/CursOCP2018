package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Exemplu4 {

	public static void main(String [] args) {
		Path p = Paths.get("C://AAA/numbers.txt");
		
		try {
			System.out.println(
			Files.lines(p)
				 .collect(
					Collectors.mapping(
							s -> Arrays.asList(s.split(",")), 
									Collectors.toList())));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
