package main;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class Main {

	public static void main(String [] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		ForkJoinPool pool = new ForkJoinPool();
		pool.invoke(new ListAction(list));
	}
}
