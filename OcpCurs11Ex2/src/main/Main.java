package main;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class Main {

	public static void main(String [] args) {
		List<Integer> list = Arrays.asList(3,5,6,7,8,9,6);
		ListSumTask task = new ListSumTask(list);
		
		ForkJoinPool pool = new ForkJoinPool();
		
		Integer res = pool.invoke(task);
		
		System.out.println(res);
	}
}
