package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exemplu1 {

	public static void main(String [] args) {
		Path p1 = Paths.get("C:/AAA");
		try {
			Files.list(p1)
				 .map(Path::toString)
				 //.filter(f -> f.endsWith(".txt"))
				 .forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
