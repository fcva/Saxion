package programma;

import java.util.ArrayList;

import classes.*;

public class Apl {

	public static void main(String[] args) {
		printSeperator();
		opdracht820();
		printSeperator();
		opdracht821();
		printSeperator();
		opdracht822();
		printSeperator();
		opdrachtBoekenkast();
		printSeperator();
	}

	public static void printSeperator() {
		System.out
				.println("---------------------------------------------------");
	}

	public static void opdracht820() {
		ArrayList<Country> countries = new ArrayList<Country>();
		countries.add(new Country("Nederland", 16000000, 30000));
		countries.add(new Country("Belgie", 7500000, 20000));
		countries.add(new Country("Luxemburg", 5000000, 7500));

		System.out.println("Grootste oppervlak: " + biggestCountry(countries));
		System.out.println("Hoogste populatie: " + largestPopulation(countries));
		System.out.println("Grootste bevolkingsdichtheid: " + highestRatio(countries));
	}

	private static String largestPopulation(ArrayList<Country> countries) {
		String resp = "";
		int highest = 0;

		for (int i = 0; i < countries.size(); i++) {
			if (countries.get(i).getPopulation() > highest) {
				highest = countries.get(i).getPopulation();
				resp = countries.get(i).getName() + " (" + countries.get(i).getPopulation() + " inwoners)";
			}
		}

		return resp;
	}
	
	private static String highestRatio(ArrayList<Country> countries) {
		String resp = "";
		int highest = 0;
		
		for (int i = 0; i < countries.size(); i++) {
			int j = (countries.get(i).getPopulation()) / (countries.get(i).getArea()); 
			if (j > highest) {
				highest = j;
				resp = countries.get(i).getName() + " (" + j + " inwoners per km2)";
			}
		}
		
		return resp;
	}

	private static String biggestCountry(ArrayList<Country> countries) {
		String resp = "";
		int biggest = 0;

		for (int i = 0; i < countries.size(); i++) {
			if (countries.get(i).getArea() > biggest) {
				biggest = countries.get(i).getArea();
				resp = countries.get(i).getName() + " (" + countries.get(i).getArea() + " km2)";
			}
		}

		return resp;
	}

	public static void opdracht821() {
		Message mail = new Message("Jij", "Ik");
		mail.append("Dit is een testbericht. Het is om te proberen");
		mail.append("of alles gaat zoals in de opdracht beschreven wordt.");
		mail.append("");
		mail.append("Zoals je kunt zien, gaat alinea's maken ook zeer goed!");
		mail.append("");
		mail.append("Met vriendelijke groet, ");
		mail.append(mail.getSender());
		
		System.out.println("From: " + mail.getSender());
		System.out.println("To: " + mail.getRecipient());
		System.out.println();
		System.out.println(mail.getMessageText());
		System.out.println();
		System.out.println(mail.getMessageTextDebug());
	}

	public static void opdracht822() {
		Message mail = new Message("Jij", "Ik");
		mail.append("Dit is een testbericht. Het is om te proberen");
		mail.append("of alles gaat zoals in de opdracht beschreven wordt.");
		mail.append("");
		mail.append("Zoals je kunt zien, gaat alinea's maken ook zeer goed!");
		mail.append("");
		mail.append("Met vriendelijke groet, ");
		mail.append(mail.getSender());
		
		MailBox m = new MailBox();
		m.addMessage(mail);
		System.out.println("Mail in inbox.");
		System.out.println("Van: " + m.getMessage(0).getSender());
		System.out.println("Aan: " + m.getMessage(0).getRecipient());
		System.out.println();
		System.out.println("Bericht tekst: ");
		System.out.println();
		System.out.println(m.getMessage(0).getMessageText());
	}

	public static void opdrachtBoekenkast() {
		Auteur jeMoeder = new Auteur("Butters Stotch", 1969,
				12, 10);
		Boek b1 = new Boek("The poop that took a pee", 69, jeMoeder);
		Boek b2 = new Boek("Scrotie McBoogerBalls", 267, jeMoeder);

		Boekenkast bk = new Boekenkast();
		bk.addBook(b1);
		bk.addBook(b2);
		System.out.println("Totaal aantal boeken: " + bk.getNumberOfBooks());
		System.out.println("Totaal aantal bladzijden: " + bk.getTotalPages());
		System.out.println();
		System.out.println("Auteur " + b1.getAuteur().getNaam() + " is " + b1.getAuteur().getAge() + " jaar oud");
		System.out.println();
		System.out.println("Oudste auteur: " + bk.getOldestAuthor());
		
		//Boek uit kast halen en in andere kast doen
		Boekenkast bk2 = new Boekenkast();
		bk.removeBook(b1);
		bk2.addBook(b1);
	}

}
