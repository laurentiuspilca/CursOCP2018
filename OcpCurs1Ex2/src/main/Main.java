package main;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {

	/*
	 * PrintStream
	 * PrintWriter
	 * BufferedWriter
	 */
	public static void main(String [] args) {
		try (PrintStream out = new PrintStream("C:/AAA/xyz")) {
			out.println("Hello World!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
