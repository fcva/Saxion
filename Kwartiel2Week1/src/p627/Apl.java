package p627;

import java.util.ArrayList;

public class Apl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Bla leuter zwets
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();

		a.add(1);
		b.add(5);
		a.add(3);
		b.add(7);
		a.add(0);
		b.add(3);
		b.add(4);

		System.out.println(append(a, b));
	}

	public static ArrayList<Integer> append(ArrayList<Integer> a,
			ArrayList<Integer> b) {

		ArrayList<Integer> result = new ArrayList<Integer>();

		result.addAll(a);
		result.addAll(b);

		return result;
	}

}
