package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exercitiu3 {

	public static void main(String [] args) {
		Produs p1 = new Produs("ciocolata", 30);
		Produs p2 = new Produs("bere", 10);
		Produs p3 = new Produs("inghetata", 60);
		
		List<Produs> produse = new ArrayList<>();
		produse.add(p1);
		produse.add(p2);
		produse.add(p3);
		
		// Comparator<T> vs Comparable<T>
		// compare(o1, o2)  vs  compareTo(o1)
		
		Comparator<Produs> c1 = new Comparator<Produs>() {

			@Override
			public int compare(Produs o1, Produs o2) {
				// -   o1 < o2
				// 0   o1 = o2
				// +   o1 > o2
				if (o1.getPret() < o2.getPret()) return -1;
				if (o1.getPret() > o2.getPret()) return 1;
				return 0;
			}
		};
		
		Comparator<Produs> c2 = (o1,o2) -> {
			if (o1.getPret() < o2.getPret()) return -1;
			if (o1.getPret() > o2.getPret()) return 1;
			return 0;
		};
		
		Collections.sort(produse, c1);
		produse.forEach(System.out::println);
	}
}
