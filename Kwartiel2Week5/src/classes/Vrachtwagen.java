package classes;

public class Vrachtwagen extends VrachtVervoer {
	private float diepte, breedte, hoogte;
	private boolean afkoppelbaar;
	
	/**
	 * Maak een nieuwe vrachtwagen aan
	 * @param laadvermogen Laadvermogen in tonnen
	 * @param diepte	   Diepte in meters
	 * @param breedte	   Breedte in meters
	 * @param hoogte	   Hoogte in meters
	 * @param afkoppelbaar Laadklep afkoppelbaar (ja/nee)
	 */
	public Vrachtwagen(float laadvermogen, float diepte, float breedte, float hoogte, boolean afkoppelbaar) {
		super.laadVermogen = laadvermogen;
		this.diepte = diepte;
		this.breedte = breedte;
		this.hoogte = hoogte;
		this.afkoppelbaar = afkoppelbaar;
	}
	
	public String toString() {
		String afkoppelMogelijk = "nee";
		if(this.afkoppelbaar) {
			afkoppelMogelijk = "ja";
		}
		return "Laadvermogen: " + super.laadVermogen + " ton\n    "
				+ "Diepte: " + this.diepte + "\n    "
				+ "Breedte: " + this.breedte + "\n    "
				+ "Hoogte: " + this.hoogte + "\n    "
				+ "Afkoppelbaar: " + afkoppelMogelijk;
	}
}
