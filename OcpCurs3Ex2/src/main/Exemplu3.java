package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exemplu3 {

	public static void main(String [] args) {
		Path p1 = Paths.get("C:/AAA/random.txt");
		try (BufferedReader in = Files.newBufferedReader(p1)) {
			String line;
			int suma = 0;
			while ((line = in.readLine()) != null) {
				int n = Integer.parseInt(line);
				if (n % 2 == 1) {
					suma += n;
				}
			}
			System.out.println(suma);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
