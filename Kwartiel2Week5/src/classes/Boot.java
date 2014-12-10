package classes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Boot extends PersoonsVervoer {
	private String naam;
	private boolean koelkast;
	private int volgNummer, zwemvesten;
	
	/**
	 * Maakt een nieuwe boot aan
	 * @param naam Naam van de boot
	 * @param maxPersonen Maximale bezetting in een heel getal
	 * @param laatsteKeuring Datum van de laatste keuring
	 * @param koelkastAanwezig Aanwezigheid van een koelkast
	 * @param volgNummer Volgnummer in een heel getal
	 * @param zwemVesten Aantal zwemvesten in een heel getal
	 */
	public Boot(String naam, int maxPersonen, Date laatsteKeuring, boolean koelkastAanwezig, int volgNummer, int zwemVesten) {
		super.maxPersonen = maxPersonen;
		super.laatsteKeuring = laatsteKeuring;
		this.naam = naam;
		this.koelkast = koelkastAanwezig;
		this.volgNummer = volgNummer;
		this.zwemvesten = zwemVesten;
	}
	
	public String toString() {
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		String koelkastAanwezig = "nee";
		if(this.koelkast) {
			koelkastAanwezig = "ja";
		}
		return "Maximaal aantal personen: " + super.maxPersonen + "\n    "
				+ "Laatste keuring: " + df.format(super.laatsteKeuring) + "\n    "
				+ "Naam: " + this.naam + "\n    "
				+ "Volgnummer: " + this.volgNummer + "\n    "
				+ "Aantal zwemvesten: " + this.zwemvesten + "\n    "
				+ "Koelkast aanwezig: " + koelkastAanwezig;
	}
}
