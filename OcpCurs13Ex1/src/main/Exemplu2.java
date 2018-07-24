package main;

import java.text.NumberFormat;
import java.util.Locale;

public class Exemplu2 {

	public static void main(String [] args) {
		// 10.2  --> 10200 --> "10.2"
		
		Locale loc = new Locale("en", "US");
		NumberFormat nf = NumberFormat.getIntegerInstance(loc);
		
		System.out.println(nf.format(12345));
	}
}
