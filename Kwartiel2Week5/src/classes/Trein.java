package classes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Trein extends PersoonsVervoer {
	private int wagonnen, totaleLengte;

	/**
	 * Maak een nieuwe trein aan
	 * @param personen Aantal personen dat in de trein past
	 * @param keurDatum Laatste keurdatum
	 * @param wagonnen Aantal wagonnen
	 * @param totaleLengte Totale lengte van de trein
	 */
	public Trein(int personen, Date keurDatum, int wagonnen, int totaleLengte) {
		super.maxPersonen = personen;
		super.laatsteKeuring = keurDatum;
		this.wagonnen = wagonnen;
		this.totaleLengte = totaleLengte;
	}

	@Override
	public String toString() {
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		return "Maximaal aantal personen: " + super.maxPersonen + "\n    "
				+ "Laatste keuring: " + df.format(super.laatsteKeuring) + "\n    "
				+ "Aantal wagonnen: " + this.wagonnen + "\n    "
				+ "Totale lengte: " + this.totaleLengte + " meter";
	}
}
