package classes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Bus extends PersoonsVervoer {
	private String naam;
	
	/**
	 * Maak een nieuwe bus aan
	 * @param personen Aantal personen dat maximaal in de bus kan
	 * @param laatsteKeuring Datum van de laatste keuring
	 * @param naam Naam van de bus
	 */
	public Bus(int personen, Date laatsteKeuring, String naam) {
		super.maxPersonen = personen;
		super.laatsteKeuring = laatsteKeuring;
		this.naam = naam;
	}
	
	public String toString() {
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		return "Maximaal aantal personen: " + super.maxPersonen + "\n    "
				+ "Laatste keuring: " + df.format(super.laatsteKeuring) + "\n    "
				+ "Naam: " + this.naam;
	}
}
