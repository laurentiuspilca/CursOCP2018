package main;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Exemplu6 {

	public static void main(String [] args) {
		ScheduledExecutorService service = 
				Executors.newScheduledThreadPool(4);
		
		Runnable r = () -> System.out.println("Hello world");
		
		//scheduleAtFixedRate
		//scheduleWithFixedDelay
		service.scheduleWithFixedDelay(r, 1, 5, TimeUnit.SECONDS);
		
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		service.shutdown();
	}
}
