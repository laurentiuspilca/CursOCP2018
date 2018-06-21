package main;

public class Main {

	public static void main(String [] args) {
		Predicat<Integer> p1 = new Predicat<Integer>() {
			
			@Override
			public boolean test(Integer x) {
				return x % 2 == 0;
			}
		};
		
		boolean b1 = p1.test(10);
		System.out.println(b1);
		
		//Predicat p2 = Main::test; // x -> test(x)
		
		//boolean b2 = p1.test(10);
		//System.out.println(b2);
		
	}
	
	private static boolean test(int x) {
		System.out.println(":)");
		return x % 2 == 0;
	}
}
