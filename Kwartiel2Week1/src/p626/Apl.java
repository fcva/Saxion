package p626;

import java.util.ArrayList;

public class Apl {
	
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

		System.out.println(merge(a, b));
	}
	
	public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		int minLength = a.size();
		int maxLength = a.size();
		int largest = 0;
		
		if(b.size() < minLength) {
			minLength = b.size();
		} else {
			maxLength = b.size();
			largest = 1;
		}
		
		int counter = 0;
		
		for(int i = 0; i < minLength; i++) {
			result.add(a.get(i));
			result.add(b.get(i));
			counter++;
		}
		
		for(int i = counter; i < maxLength; i++) {
			if(largest == 0) {
				result.add(a.get(i));
			} else {
				result.add(b.get(i));
			}
		}
		
		return result; 		
	}
}
