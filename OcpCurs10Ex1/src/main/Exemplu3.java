package main;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Exemplu3 {

	public static void main(String [] args) {
		ExecutorService service = Executors.newCachedThreadPool();
		
		Callable<Integer> c = () -> 5;
		
		Future<Integer> f = service.submit(c);
		
		try {
			Integer x = f.get();
			System.out.println(x);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		service.shutdown();
	}
}
