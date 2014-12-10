package programma;

import java.util.Date;

import classes.*;

public class Apl {
	/**
	 * Main method. This is where the programm begins.
	 * 
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		singleLine();
		opdracht98();
		seperator();
		opdracht99();
		seperator();
		opdracht921();
		seperator();
		opdracht922();
		seperator();
		opdrachtHomeAutomation();
		seperator();
		ruudsVervoersBedrijf();
		singleLine();
	}

	public static void seperator() {
		System.out.println("---------------------------------------------");
		System.out.println("");
		System.out.println("---------------------------------------------");
	}

	public static void singleLine() {
		System.out.println("---------------------------------------------");
	}

	public static void opdracht98() {
		System.out.println("Opdracht P9.8");
		singleLine();
		System.out.println();
		System.out.println("    Hier komt de uitwerking van opdracht P9.8");
		System.out.println();
	}

	public static void opdracht99() {
		System.out.println("Opdracht P9.9");
		singleLine();
		System.out.println();
		System.out.println("    Hier komt de uitwerking van opdracht P9.9");
		System.out.println();
	}

	public static void opdracht921() {
		System.out.println("Opdracht P9.21");
		singleLine();
		System.out.println();
		System.out.println("    Hier komt de uitwerking van opdracht P9.21");
		System.out.println();
	}

	public static void opdracht922() {
		System.out.println("Opdracht P9.22");
		singleLine();
		System.out.println();
		System.out.println("    Hier komt de uitwerking van opdracht P9.22");
		System.out.println();
	}

	public static void opdrachtHomeAutomation() {
		System.out.println("Opdracht Home Automation");
		singleLine();
		System.out.println();

		Lamp leeslamp = new Lamp();
		DimbareLamp hanglamp = new DimbareLamp();
		PhilipsHUELamp huelamp = new PhilipsHUELamp();
		// Print de gegevens van de lampen
		System.out.println("    Leeslamp          : " + leeslamp);
		System.out.println("    Hanglamp          : " + hanglamp);
		System.out.println("    Philips HUE lamp  : " + huelamp);
		System.out.println("    ---");
		// Zet leeslamp aan
		leeslamp.zetAan();
		System.out.println("    Leeslamp : " + leeslamp);
		// Zet hanglamp aan en stel in op helderheid 50%
		hanglamp.setHelderheid(50);
		hanglamp.zetAan();
		System.out.println("    Hanglamp : " + hanglamp);
		// Zet huelamp aan en stel in op helderheid van 60% en een
		// roodachtige kleur
		huelamp.setHelderheid(60);
		huelamp.setKleur(255, 10, 10);
		huelamp.zetAan();
		System.out.println("    Huelamp  : " + huelamp);
		System.out.println();
	}

	public static void ruudsVervoersBedrijf() {
		System.out.println("Opdracht Ruuds Vervoersbedrijf");
		singleLine();
		System.out.println();
		
		PersoonsVervoer trein1 = new Trein(250, new Date(), 5, 154);
		PersoonsVervoer bus1 = new Bus(55, new Date(), "Laurens' PartyBus!");
		PersoonsVervoer boot1 = new Boot("Leipe boot jonge", 15, new Date(), true, 1, 15);
		
		VrachtVervoer vrachtwagen1 = new Vrachtwagen((float) 15.3, (float) 15, (float) 4.3, (float) 3.8, false);
		VrachtVervoer containerschip1 = new Containerschip((float) 800.46, 350);
		
		System.out.println("    " + trein1);
		System.out.println();
		System.out.println("    " + bus1);
		System.out.println();
		System.out.println("    " + boot1);
		System.out.println();
		System.out.println("    " + vrachtwagen1);
		System.out.println();
		System.out.println("    " + containerschip1);
		
		System.out.println();
	}
}
