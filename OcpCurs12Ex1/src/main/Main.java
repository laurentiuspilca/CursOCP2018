package main;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {

	public static void main(String [] args) {
		
		MyNumber n = new MyNumber();
		int x = n.incrementAndGet();
		
		AtomicInteger i = new AtomicInteger(10);
		int y = i.incrementAndGet();
		System.out.println(y);
	}
}
