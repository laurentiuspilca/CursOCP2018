package main;

public class Exemplu4 {
	private static int x, y;

	public static void main(String [] args) {
		long t1 = System.currentTimeMillis();
		Runnable r1 = () -> {x = getData1();};
		Runnable r2 = () -> {y = getData2();};
		
		Thread q1 = new Thread(r1);
		Thread q2 = new Thread(r2);
		q1.start();
		q2.start();
		
		try {
			q1.join(5000);
			q2.join(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		long t2 = System.currentTimeMillis();
		
		System.out.println(x + y + " Dupa " + (t2 - t1) + " ms");
	}
	
	private static int getData1() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return 10;
	}
	
	private static int getData2() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return 15;
	}
}
