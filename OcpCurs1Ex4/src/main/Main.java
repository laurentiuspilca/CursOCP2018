package main;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import model.Pisica;

public class Main {

	public static void main(String [] args) {
		try (
				FileInputStream fis = new FileInputStream("C:/AAA/pisica");
				ObjectInputStream in = new ObjectInputStream(fis);
		) {
			
			Pisica p2 = (Pisica) in.readObject();
			
			System.out.println(p2.getNume() + " " + p2.getVarsta());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
