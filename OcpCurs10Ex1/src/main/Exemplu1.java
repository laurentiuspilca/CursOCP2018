package main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exemplu1 {

	public static void main(String [] args) {
		// Executor
		// ExecutorService
		// ScheduledExecutorService
		
		ExecutorService service = Executors.newCachedThreadPool();
				
		//Executors.newSingleThreadExecutor();
		//Executors.newFixedThreadPool(4)
		try {
			Runnable r = () -> System.out.println("Hello world! " + Thread.currentThread().getName());
			
			service.execute(r); // submit() Runnable vs Callable
		} finally {
			service.shutdown(); // shutdownNow()
		}
	}
}
