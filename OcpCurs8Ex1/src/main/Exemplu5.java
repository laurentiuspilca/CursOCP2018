package main;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exemplu5 {

	public static void main(String [] args) {
		Path p1 = Paths.get("C://AAA/artists.txt");

		try (PrintStream out = new PrintStream("C://AAA/output.txt")) {
			Files.lines(p1)
				.filter(s -> s.length() % 2 == 0)
				.forEach(s -> out.println(s));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
