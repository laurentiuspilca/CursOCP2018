package main;

import java.util.Locale;

public class Exemplu1 {

	public static void main(String [] args) {
		Locale loc1 = new Locale("fr");
		Locale loc2 = new Locale("fr", "CA");
		Locale loc3 = new Locale("fr", "FR");
		
		Locale loc4 = new Locale.Builder()
					.setRegion("CA")
					.setLanguage("fr")
					.build();
		
		Locale loc5 = Locale.GERMAN;
		
		// 15,23.156
		// 15.23,256
		// 15.23 256
	}
}
