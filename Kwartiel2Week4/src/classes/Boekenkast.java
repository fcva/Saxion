package classes;

import java.util.ArrayList;

public class Boekenkast {
	private int aantalBoeken, totaleBladzijden;
	private ArrayList<Boek> boeken = new ArrayList<Boek>();
	
	public Boekenkast() {
		this.aantalBoeken = 0;
		this.totaleBladzijden = 0;
	}
	
	public void addBook(Boek b) {
		boeken.add(b);
		this.aantalBoeken++;
		this.totaleBladzijden = this.totaleBladzijden + b.getPaginas();
	}
	
	public void removeBook(Boek b) {
		boeken.remove(b);
		this.aantalBoeken--;
		this.totaleBladzijden = this.totaleBladzijden - b.getPaginas();
	}
	
	public int getNumberOfBooks() {
		return this.aantalBoeken;
	}
	
	public int getTotalPages() {
		return this.totaleBladzijden;
	}

	public String getOldestAuthor() {
		String naam = "";
		int hoogsteLeeftijd = 0;
		for(int i = 0; i < this.aantalBoeken; i++) {
			if(boeken.get(i).getAuteur().getAge() > hoogsteLeeftijd) {
				hoogsteLeeftijd = boeken.get(i).getAuteur().getAge();
				naam = boeken.get(i).getAuteur().getNaam();
			}
		}
		return naam;
	}
	
}
