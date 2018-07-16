package main;

import java.util.concurrent.ForkJoinPool;

public class Exemplu8 {

	public static void main(String [] args) {
		ForkJoinPool pool = new ForkJoinPool();
		
		Integer n = pool.invoke(new FibboTask(8));
		
		System.out.println(n);
	}
}
