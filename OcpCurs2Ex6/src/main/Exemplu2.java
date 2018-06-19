package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exemplu2 {

	public static void main(String [] args) {
		Path p1 = Paths.get("C:/AAA/MYFILE");
		try {
			Files.createFile(p1); // createNewFile (File)
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
