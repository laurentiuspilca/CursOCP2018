package main;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Exemplu1 {

	public static void main(String [] args) {
		Produs p1 = new Produs("ciocolata", 30);
		Produs p2 = new Produs("bere", 10);
		Produs p3 = new Produs("inghetata", 60);
		
		List<Produs> produse = new ArrayList<>();
		produse.add(p1);
		produse.add(p2);
		produse.add(p3);
		
		OptionalDouble av =
			produse.stream()
				.mapToDouble(p -> p.getPret()) // Produs::getPret
				.average();
		
		av.ifPresent(System.out::println);
	}
}
