package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exemplu2 {

	public static void main(String [] args) {
		Path p = Paths.get("C:/AAA/z");
		try (BufferedReader in = Files.newBufferedReader(p)) {
			String line;
			
			while ((line = in.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
