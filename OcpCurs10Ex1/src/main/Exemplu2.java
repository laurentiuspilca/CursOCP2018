package main;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Exemplu2 {

	public static void main(String [] args) {
		ExecutorService service = Executors.newCachedThreadPool();
		
		Runnable r = () -> System.out.println("Hello World!");
		
		Future<?> f1 = service.submit(r);
		
		// fac alte chestii
		
		try {
			f1.get();
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
		service.shutdown();
	}
}
