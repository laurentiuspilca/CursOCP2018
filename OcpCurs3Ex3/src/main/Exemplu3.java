package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exemplu3 {

	public static void main(String [] args) {
		Path p1 = Paths.get("C:/AAA");
		try {
			Files.find(p1, 10, (f,a) -> a.size() > 100)
				 .map(Path::toString)
				 .forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
