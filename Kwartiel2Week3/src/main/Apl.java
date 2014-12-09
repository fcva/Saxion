package main;

import week3.*;


public class Apl {
	public static void main(String[] args) {
		opdracht84();
		System.out.println("-----------------------------------------------------------------------------");
		opdracht86();
		System.out.println("-----------------------------------------------------------------------------");
		opdracht87();
		System.out.println("-----------------------------------------------------------------------------");
		opdracht89();
		System.out.println("-----------------------------------------------------------------------------");
		opdracht814();
		System.out.println("-----------------------------------------------------------------------------");
		opdracht815();
	}
	
	public static void opdracht84() {
		Address a = new Address("Burg. J.C. v/d Bergplein", 1, 7642, "Wierden");
		Address b = new Address("Burg. J.C. v/d Bergplein", 14, 7642, "Wierden");

		System.out.println("Adres 1: " + a.getStreet() + " " + a.getHouseNumber() + ", " + a.getPostal() + " " + a.getResidence());
		System.out.println("Adres 2: " + b.getStreet() + " " + b.getHouseNumber() + ", " + b.getPostal() + " " + b.getResidence());
		System.out.println("");
		
		if(a.comesBefore(b)) {
			System.out.println("Adres 1 komt voor Adres 2");
		} else {
			System.out.println("Adres 2 komt voor Adres 1");
		}
	}
	
	public static void opdracht86() {
		Car myHybrid = new Car(50);
		myHybrid.addGas(10);
		myHybrid.drive(51);
		System.out.println("Gas left: " + myHybrid.getGasLevel());
	}
	
	public static void opdracht87() {
		Student s1 = new Student("Laurens");
		s1.addQuiz(9);
		s1.addQuiz(3);
		s1.addQuiz(7);
		s1.addQuiz(7);

		System.out.println("Total score for " + s1.getName() + "   : " + s1.getTotalScore());
		System.out.println("Average score for " + s1.getName() + " : " + s1.getAverageScore());
	}
	
	public static void opdracht89() {
		ComboLock cl = new ComboLock(1, 0, 1);
		cl.turnRight(1);
		cl.turnLeft(1);
		cl.turnRight(1);
		
		if(cl.open()) {
			System.out.println("De kluis gaat open! Yeah!");
		} else {
			System.out.println("Je hebt het voor mekaar gekregen dat de kluis niet open gaat. Je faalt.");
		}
	}
	
	public static void opdracht814() {
		
	}
	
	public static void opdracht815() {
		
	}
	
	
}
