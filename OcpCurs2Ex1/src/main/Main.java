package main;

import java.io.File;

public class Main {

	public static void main(String [] args) {
		File f = new File("C:/AAA/MY_FOLDER");
		System.out.println(f.exists());
		boolean x = f.mkdir(); // f.mkdirs()   A/B/C/D
		
		System.out.println(x);
	}
}
