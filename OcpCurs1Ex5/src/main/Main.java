package main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String [] args) {
		C c = new C();
		
		try (
			FileOutputStream fos = new FileOutputStream("test");
			ObjectOutputStream out = new ObjectOutputStream(fos);
			
			FileInputStream fis = new FileInputStream("test");
			ObjectInputStream in = new ObjectInputStream(fis)
			) {
			out.writeObject(c);
			
			System.out.println("\n Acum citim \n");
			
			C c2 = (C) in.readObject();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
