package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exemplu2 {

	public static void main(String [] args) {
		Path p1 = Paths.get("C:/AAA");
		try {
			Files.walk(p1, 2)
				 .map(Path::toString)
				 //.filter(f -> f.endsWith(".txt"))
				 .forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
