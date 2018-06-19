package main;

import java.io.File;

public class Main {

	public static void main(String [] args) {
		File f = new File("C:/");
		File [] content = f.listFiles();
	
		for (File x : content) {
			System.out.println(x);
		}
	}
}
