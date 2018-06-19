package main;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Exemplu1 {

	public static void main(String [] args) {
		Path p1 = Paths.get("A/B/C");
		Path p2 = Paths.get("C:/A/B/C");
		
		System.out.println(p1.getRoot()); // null
		System.out.println(p1.getParent()); // A\B
		System.out.println(p1.getFileName()); // C
		
		System.out.println(p2.getRoot()); // C:
		System.out.println(p2.getParent()); // C:\A\B
		System.out.println(p2.getFileName()); // C
		
	}
}
