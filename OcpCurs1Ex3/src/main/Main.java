package main;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import model.Pisica;

public class Main {

	public static void main(String [] args) {
		try (
				FileOutputStream fos = new FileOutputStream("C:/AAA/pisica");
				ObjectOutputStream out = new ObjectOutputStream(fos);
		) {
			Pisica p1 = new Pisica();
			p1.setNume("Tom");
			p1.setVarsta(10);
			
			out.writeObject(p1);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
