package main;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Exemplu3 {

	public static void main(String [] args) {
		IntSummaryStatistics st = 
			IntStream.of(2,5,6,7,8)
				.summaryStatistics();
		
		System.out.println(st.getAverage());
		System.out.println(st.getSum());
	}
}
