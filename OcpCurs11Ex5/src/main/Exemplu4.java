package main;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exemplu4 {

	public static void main(String [] args) {
		ExecutorService service = Executors.newFixedThreadPool(2);
		CyclicBarrier c = new CyclicBarrier(3);
		
		service.submit(() -> {
			System.out.println("Start");
			try {c.await();} catch(Exception e) {e.printStackTrace();}
			System.out.print("End");
		});
		
		service.submit(() -> {
			System.out.println("Start");
			try {c.await();} catch(Exception e) {e.printStackTrace();}
			System.out.print("End");
		});
		
		service.submit(() -> {
			System.out.println("Start");
			try {c.await();} catch(Exception e) {e.printStackTrace();}
			System.out.print("End");
		});
		
	}
}
