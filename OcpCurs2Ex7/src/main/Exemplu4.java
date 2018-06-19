package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exemplu4 {

	public static void main(String [] args) {
		Path p = Paths.get("C:/AAA/z");
		try {
			byte [] content = Files.readAllBytes(p);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
