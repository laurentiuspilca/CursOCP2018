package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exemplu4 {

	public static void main(String [] args) {
		Path p1 = Paths.get("C:/AAA/random.txt");
		
		try {
			int suma = 
				Files.lines(p1)
					 .mapToInt(Integer::parseInt)
					 .filter(n -> n % 2 == 1)
					 .sum();
			System.out.println(suma);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
