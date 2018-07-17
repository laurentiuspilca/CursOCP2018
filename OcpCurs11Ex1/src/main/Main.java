package main;

import java.util.concurrent.ForkJoinPool;

public class Main {

	public static void main(String [] args) {
		ForkJoinPool pool = new ForkJoinPool();
		
		FibboTask f = new FibboTask(6); 
		Integer n = pool.invoke(f);
		
		System.out.println(n);
	}
}
