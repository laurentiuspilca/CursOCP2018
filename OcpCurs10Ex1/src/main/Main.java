package main;

import java.util.concurrent.Callable;

public class Main {

	public static void main(String [] args) {
		Runnable r = () -> System.out.println("Hello"); // run()
		Callable<Integer> c = () -> 5; // call()
	}
}
