package main;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Exemplu5 {

	public static void main(String [] args) {
		ScheduledExecutorService service = 
				Executors.newSingleThreadScheduledExecutor();
		
		service.schedule(() -> System.out.println("Hello world!"), 
				10, TimeUnit.SECONDS);
		
		service.shutdown();
	}
}
