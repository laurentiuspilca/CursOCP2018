package main;

import java.util.Arrays;
import java.util.List;

public class Exercitiu6 {

	public static void main(String [] args) {
		Product p1 = new Product("A", 10);
		Product p2 = new Product("B", 30);
		Product p3 = new Product("B", 50);
		Product p4 = new Product("C", 15);
		Product p5 = new Product("A", 10);
		
		List<Product> list = Arrays.asList(p1,p2,p3,p4,p5);
		
		boolean b1 = 
			list.stream()
				.allMatch(p -> p.getPrice() < 100);
		
		System.out.println(b1);
		
		boolean b2 = 
			list.stream()
				.anyMatch(p -> p.getPrice() > 100);
			
		System.out.println(b2);
	}
}
