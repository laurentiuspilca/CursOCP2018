package main;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static List<Integer> list = new ArrayList<>();

	public static void main(String [] args) {
		new Producator("P1").start();
		new Producator("P2").start();
		new Consumator("C1").start();
		new Consumator("C2").start();
	}
	
	synchronized void m1() {
		
	}
	
	synchronized static void m2() { // Main.class
		
	}
}
