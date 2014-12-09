package classes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Auteur {
	private String naam;
	private int geboorteJaar, geboorteMaand, geboorteDag;
	
	public Auteur(String Naam, int GeboorteJaar, int GeboorteMaand, int GeboorteDag) {
		this.naam = Naam;
		this.geboorteJaar = GeboorteJaar;
		this.geboorteMaand = GeboorteMaand;
		this.geboorteDag = GeboorteDag;
	}
	
	public int getAge() {
		int jaar, maand, dag;
		
		Date vandaag = new Date();
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		
		String datum = df.format(vandaag);
		jaar = Integer.parseInt(datum.substring(0, 4));
		maand = Integer.parseInt(datum.substring(5, 7));
		dag = Integer.parseInt(datum.substring(8, 10));
		
		int jarenVerschil = 0;
		jarenVerschil = jaar - this.geboorteJaar;
		
		if(this.geboorteMaand > maand) {
			jarenVerschil--;
		} else if(this.geboorteMaand == maand) {
			if(this.geboorteDag > dag) {
				jarenVerschil--;
			}
		}
		
		return jarenVerschil;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public int getGeboorteJaar() {
		return geboorteJaar;
	}

	public void setGeboorteJaar(int geboorteJaar) {
		this.geboorteJaar = geboorteJaar;
	}

	public int getGeboorteMaand() {
		return geboorteMaand;
	}

	public void setGeboorteMaand(int geboorteMaand) {
		this.geboorteMaand = geboorteMaand;
	}

	public int getGeboorteDag() {
		return geboorteDag;
	}

	public void setGeboorteDag(int geboorteDag) {
		this.geboorteDag = geboorteDag;
	}
}
