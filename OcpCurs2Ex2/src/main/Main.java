package main;

import java.io.File;

public class Main {

	public static void main(String [] args) {
		File f = new File("C:/AAA/MY_FOLDER");
		
		boolean x = f.delete();
		
		System.out.println(x);
	}
}
