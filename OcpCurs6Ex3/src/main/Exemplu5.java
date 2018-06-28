package main;

public class Exemplu5 {

	public static void main(String [] args) {
		int [] x = {1,2,3,4,5,6,7};
		
		m(x);
	}
	
	private static void m(Object... integers) {
		for (Object i : integers) {
			System.out.println(i);
		}
	}
}
