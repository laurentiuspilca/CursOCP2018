package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exemplu3 {

	public static void main(String [] args) {
		Path p1 = Paths.get("C:/AAA/TEST");
		
		try {
			// boolean res = Files.deleteIfExists(p1);
			Files.delete(p1);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
