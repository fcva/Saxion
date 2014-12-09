package P82;

import java.util.Scanner;

import P81.Counter;

public class Apl {
	public static void main(String[] args) {
		System.out.println("Count: c. Undo: u");

		Scanner scn = new Scanner(System.in);
		Counter tally = new Counter(0, 1);
		while (true) {
			String inp = scn.next();
			if (inp.equalsIgnoreCase("c")) {
				tally.count();
			} else if (inp.equalsIgnoreCase("u")) {
				tally.undo();
			}
			
			System.out.println("Current count: " + tally.getCurrentCount());
		}
	}
}
