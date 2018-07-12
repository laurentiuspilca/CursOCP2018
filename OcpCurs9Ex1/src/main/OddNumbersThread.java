package main;

import java.util.stream.Stream;

public class OddNumbersThread extends Thread {

	@Override
	public void run() {
		Stream.iterate(1, i -> i + 2)
			.limit(10)
			.forEach(
		x -> System.out.println(x + Thread.currentThread().getName())); 
	}
}
