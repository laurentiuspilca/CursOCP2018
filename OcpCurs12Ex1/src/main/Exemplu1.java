package main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Exemplu1 {

	public static void main(String [] args) {
		AtomicInteger i = new AtomicInteger(10);
		ExecutorService service = Executors.newFixedThreadPool(4);
		
		//Runnable r1 = () -> System.out.println(i.getAndIncrement());
		
		service.submit(() -> System.out.println(i.getAndIncrement()));
		service.submit(() -> System.out.println(i.getAndIncrement()));
		service.submit(() -> System.out.println(i.getAndIncrement()));
		service.submit(() -> System.out.println(i.getAndIncrement()));
	}
}
