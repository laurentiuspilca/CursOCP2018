package main;

public class Main {

	public static void main(String [] args) {
		EvenNumbersRunnable r = new EvenNumbersRunnable();
		Thread t = new Thread(r, "My Thread");
		
		t.start();
		
		System.out.println("END");
		
		Runnable r2 = () -> System.out.println("Do smth");
		new Thread(() -> System.out.println("Do smth")).start();
	}
}
