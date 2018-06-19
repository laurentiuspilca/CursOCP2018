package main;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Exemplu4 {

	public static void main(String [] args) {
		Path p1 = Paths.get("A/B/../C");
		Path p2 = Paths.get("D/E/F");
		
		Path p3 = p1.resolve(p2);
		
		System.out.println(p3);
	}
}
