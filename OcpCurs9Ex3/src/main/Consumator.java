package main;

public class Consumator extends Thread {

	public Consumator(String nume) {
		super(nume);
	}
	
	@Override
	public void run() {
		while (true) {
			synchronized (Main.list) {
				if (!Main.list.isEmpty()) {
					int x = Main.list.get(0); // 10
					Main.list.remove(0);
					System.out.println("Consumatorul " + getName() + " a consumat valoarea " + x);
				}
			}
		}
	}
}
