package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exemplu3 {

	public static void main(String [] args) {
		Path p = Paths.get("C://AAA/artists.txt");
		
		try {
			Map<String, List<String>> res = 
				Files.lines(p)
					 .collect(Collectors.groupingBy(
							 s -> s.split(",")[0],
							 Collectors.mapping(
									 s -> s.split(",")[1],
									 	Collectors.toList())));
			
			System.out.println(res);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
