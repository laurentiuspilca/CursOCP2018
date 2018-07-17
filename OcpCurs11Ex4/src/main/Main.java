package main;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String [] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
//		list.parallelStream()
//			.forEachOrdered(System.out::println);
		
		long t1 = System.currentTimeMillis();
		list.parallelStream()
			.map(i -> myWebServiceCall(i))
			.forEachOrdered(System.out::println);
		long t2 = System.currentTimeMillis();
		System.out.println("Time: " + (t2-t1));
	}
	
	private static Integer myWebServiceCall(Integer i) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {e.printStackTrace();}
		return i * 2;
	}
}
