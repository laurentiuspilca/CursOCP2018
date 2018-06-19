package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Exemplu3 {

	public static void main(String [] args) {
		Path p = Paths.get("C:/AAA/z");
		try {
			List<String> list = Files.readAllLines(p);
			list.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
