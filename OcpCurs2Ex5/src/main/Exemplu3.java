package main;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Exemplu3 {

	public static void main(String [] args) {
		Path p1 = Paths.get("C:/A/B/C/D/E");
		Path p2 = p1.subpath(2, 4);
		System.out.println(p2);
	}
}
