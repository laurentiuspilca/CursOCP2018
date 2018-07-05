package main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Exemplu8 {

	public static void main(String [] args) {
		Transaction t1 = new Transaction(10);
		Transaction t2 = new Transaction(30);
		Transaction t3 = new Transaction(23);
		
		List<Transaction> list = Arrays.asList(t1,t2,t3);
		
		list.stream()
			//.sorted(getAmountComp())
			//.sorted((d1,d2) -> d1.getCreationDate().compareTo(d2.getCreationDate()))
			.skip(1)
			.forEach(System.out::println);
	}
	
	private static Comparator<Transaction> getAmountComp() {
		return new Comparator<Transaction>() {

			@Override
			public int compare(Transaction o1, Transaction o2) {
				if (o2.getAmount() - o1.getAmount() < 0) return -1;
				if (o2.getAmount() - o1.getAmount() > 0) return 1;
				return 0;
			}
		};
	}
}
