package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exemplu5 {

	public static void main(String [] args) {
		Path p1 = Paths.get("C:/AAA/x");
		Path p2 = Paths.get("C:/AAA/z");
		try {
			Files.copy(p1, p2);
			// Files.move(p1, p2);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
