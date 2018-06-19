package main;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Exemplu6 {

	public static void main(String [] args) {
		Path p1 = Paths.get("C:/A/B/C/D");
		Path p2 = Paths.get("C:/A/B/E/R");
		// ../../E/R
		
		Path p3 = p1.relativize(p2);
		System.out.println(p3);
	}
}
