package main;

import java.util.Locale;
import java.util.ResourceBundle;

public class Exemplu3 {

	public static void main(String [] args) {
		Locale loc = new Locale("es");
		
		ResourceBundle bundle = ResourceBundle.getBundle("traduceri", loc);
		
		String translated = bundle.getString("msgHello");
		
		System.out.println(translated);
		
		// traduceri_fr_FR -> traduceri_fr -> traduceri_en_US -> traduceri_en -> traduceri
	}
}
