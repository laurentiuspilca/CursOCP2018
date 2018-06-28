package main;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;

public class Exemplu2 {

	public static void main(String [] args) {
		Produs p1 = new Produs("ciocolata", 30);
		Produs p2 = new Produs("bere", 10);
		Produs p3 = new Produs("inghetata", 60);
		
		List<Produs> produse = new ArrayList<>();
		produse.add(p1);
		produse.add(p2);
		produse.add(p3);
		
		DoubleSummaryStatistics st =
			produse.stream()
				.mapToDouble(Produs::getPret)
				.summaryStatistics();
		
		System.out.println(st.getAverage());
		System.out.println(st.getSum());
	}
}
