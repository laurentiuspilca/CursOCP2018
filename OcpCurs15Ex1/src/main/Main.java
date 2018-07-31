package main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String [] args) throws Exception {
		C c1 = new C();  // A B C
		
		FileOutputStream fos = new FileOutputStream("c.dat");
		ObjectOutputStream out = new ObjectOutputStream(fos);
		out.writeObject(c1);
		
		FileInputStream fis = new FileInputStream("c.dat");
		ObjectInputStream in = new ObjectInputStream(fis);
		C c2 = (C) in.readObject(); // A
		
	}
}
