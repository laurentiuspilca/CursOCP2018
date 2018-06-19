package main;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	public static void main(String [] args) {
		Path p1 = Paths.get("C:/AAA/A");
		Path p2 = Paths.get("C:", "AAA", "A");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1.getClass());
	}
}
