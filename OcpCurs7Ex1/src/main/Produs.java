package main;

public class Produs {

	private String serie;
	private double pret;
	
	public Produs(String serie, double pret) {
		this.serie = serie;
		this.pret = pret;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public double getPret() {
		return pret;
	}
	public void setPret(double pret) {
		this.pret = pret;
	}
	
	
}
