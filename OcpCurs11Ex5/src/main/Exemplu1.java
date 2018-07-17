package main;

import java.util.concurrent.Semaphore;

public class Exemplu1 {

	public static void main(String [] args) {
		Semaphore s1 = new Semaphore(1); // permit
		Semaphore s2 = new Semaphore(4, true); // fair/unfair
		
		try {
			s1.acquire();
			// do something
		} catch (InterruptedException e) { 
			e.printStackTrace();
		} finally {
			s1.release();
		}
		
	}
}
