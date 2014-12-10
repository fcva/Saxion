package classes;

public class Containerschip extends VrachtVervoer {
	private int maxContainers;
	
	/**
	 * Maak een nieuw containerschip
	 * @param laadvermogen Laatvermogen in tonnen
	 * @param maxContainers Maximaal aantal containers
	 */
	public Containerschip(float laadvermogen, int maxContainers) {
		super.laadVermogen = laadvermogen;
		this.maxContainers = maxContainers;
	}
	
	public String toString() {
		return "Laadvermogen: " + super.laadVermogen + " ton\n    "
				+ "Max. containers: " + this.maxContainers;
	}
}
