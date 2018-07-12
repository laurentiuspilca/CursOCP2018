package main;

import java.util.Random;

public class Producator extends Thread {

	public Producator(String nume) {
		super(nume);
	}
	
	@Override
	public void run() {
		while(true) {
			synchronized (Main.list) { // monitor
				if (Main.list.size() < 100) {
					int x = new Random().nextInt(10000);
					Main.list.add(x);
					System.out.println("Producatorul " + getName() + " a adaugat valoarea " + x);
				}
			}
		}
	}
}
 