package main;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Exemplu5 {

	public static void main(String [] args) {
		Path p1 = Paths.get("C:/A/B/C/./././../E/../R/T/././E/../T");
		//     C:/A/B/R/T/T    
		Path p2 = p1.normalize();
		
		System.out.println(p2);
	}
}
