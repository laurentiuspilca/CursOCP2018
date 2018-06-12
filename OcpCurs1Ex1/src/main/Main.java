package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main {

	public static void main(String [] args) {
		try (Reader isr = new InputStreamReader(System.in);
			 BufferedReader br = new BufferedReader(isr)) {
			String line = br.readLine();
			
			System.out.println(new StringBuilder(line).reverse());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
