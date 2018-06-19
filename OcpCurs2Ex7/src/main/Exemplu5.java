package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Exemplu5 {

	public static void main(String [] args) {
		Path p = Paths.get("C:/AAA/z");
		try {
			Stream<String> st = Files.lines(p);
			st.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
