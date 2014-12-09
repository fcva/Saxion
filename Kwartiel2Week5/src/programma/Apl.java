package programma;

import classes.DimbareLamp;
import classes.Lamp;
import classes.PhilipsHUELamp;

public class Apl {
	/**
	 * Main method. This is where the programm begins.
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		opdracht98();
		opdracht99();
		opdracht921();
		opdracht922();
		opdrachtHomeAutomation();
		ruudsVervoersBedrijf();
	}
	
	public static void opdracht98() {
		
	}
	
	public static void opdracht99() {
		
	}
	
	public static void opdracht921() {
		
	}
	
	public static void opdracht922() {
		
	}
	
	public static void opdrachtHomeAutomation() {
		Lamp leeslamp = new Lamp();
		DimbareLamp hanglamp = new DimbareLamp();
		PhilipsHUELamp huelamp = new PhilipsHUELamp();
		//Print de gegevens van de lampen
		System.out.println("Leeslamp : " + leeslamp);
		System.out.println("Hanglamp : " + hanglamp);
		System.out.println("Philips HUE lamp: " + huelamp);
		System.out.println("---");
		//Zet leeslamp aan
		leeslamp.zetAan();
		System.out.println("Leeslamp : " + leeslamp);
		//Zet hanglamp aan en stel in op helderheid 50%
		hanglamp.setHelderheid(50);
		hanglamp.zetAan();
		System.out.println("Hanglamp : " + hanglamp);
		//Zet huelamp aan en stel in op helderheid van 60% en een
		//roodachtige kleur
		huelamp.setHelderheid(60);
		huelamp.setKleur(255, 10, 10);
		huelamp.zetAan();
		System.out.println("Huelamp : " + huelamp);
	}
	
	public static void ruudsVervoersBedrijf() {
		
	}
}
