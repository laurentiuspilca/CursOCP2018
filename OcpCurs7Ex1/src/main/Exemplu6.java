package main;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplu6 {

	public static void main(String [] args) {
		List<Integer> list = Arrays.asList(1,4,5,6);
		
		double avg = list.stream().collect(Collectors.averagingInt(x -> x));		
		int sum = list.stream().collect(Collectors.summingInt(x -> x));
		
		IntSummaryStatistics st = list.stream().collect(Collectors.summarizingInt(x -> x));
		
		
		System.out.println(avg + " " + sum);
		System.out.println(st.getAverage() + " " + st.getSum());
	}
}
