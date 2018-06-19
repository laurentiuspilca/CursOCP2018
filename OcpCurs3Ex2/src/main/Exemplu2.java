package main;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;

/**
 * 
 * Scrieti in fisierul random.txt 10 numere aleatoare
 * intregi [0, 9999] pe linii separate
 * 
 * java.util.Random
 *
 */
public class Exemplu2 {

	
	public static void main(String [] args) {
		Random r = new Random();
		try (PrintStream out = new PrintStream("C:/AAA/random.txt")) {
			for (int i=0 ;i<10; i++) {
				int n = r.nextInt(10000);
				out.println(n);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
