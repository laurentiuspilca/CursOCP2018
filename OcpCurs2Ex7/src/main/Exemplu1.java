package main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Exemplu1 {

	public static void main(String [] args) {
		try (
			FileInputStream fis = new FileInputStream("C:/AAA/z");
			Reader r = new InputStreamReader(fis);
			BufferedReader in = new BufferedReader(r);
		) {
			String line;
			
			while ((line = in.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
