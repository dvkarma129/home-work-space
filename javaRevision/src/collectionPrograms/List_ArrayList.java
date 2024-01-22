package collectionPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class List_ArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> a1 = new ArrayList<Integer>();
		ArrayList<Integer> a2 = new ArrayList<Integer>();

		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		a1.add(7);
//		a1.add(null);
//		a1.add(null);

		// Print elmnt using s.o.p
		System.out.println(a1);

		// print elmnt using for loop
		for (int i = 0; i < a1.size(); i++) {
			System.out.print(" " + a1.get(i));
		}
		System.out.println();

		// print elemntss using Iterator
		ListIterator<Integer> itertor = a1.listIterator();
		System.out.println("Forward iterating");
		while (itertor.hasNext()) {
			System.out.print(" " + itertor.next());
		}
		System.out.println();

		System.out.println("Backward iterating ");
		while (itertor.hasPrevious()) {
			System.out.print(" " + itertor.previous());
		}
		System.out.println();

		// Duplicate an arrayList int new arraylist
		a2.addAll(a1);
		System.out.println("a2 --> " + a2);

		// add at specific index
		a1.add(4, 99);
		System.out.println(a1);

		// Sort Arraylist elements
		Collections.sort(a1);
		System.out.println("AL after sorting " + a1);

		// get element of specific index
		System.out.println("Elmnt at index 4 --> " + a1.get(4));

		// Replace an element at a specific index.
		a1.set(4, 91);
		System.out.println(a1);

		// Remove an element at a given index.
		a1.remove(0);
		System.out.println(a1);

		// Check if the list contains a specific element.
		System.out.println("Check id Al conatins speicific elmnt--> " + a1.contains(91));

		// Find the first occurrence of an element's index.
		System.out.println("first Index of specific elmnt--> " + a1.indexOf(3));

		// Find the first occurrence of an element's index.
		System.out.println("Last Index of specific elmnt--> " + a1.lastIndexOf(5));

		// Get the number of elements in the list.
		System.out.println("Sizee of Arraylist --> " + a1.size());

		// Remove a1l elmts from arraylist
		a1.removeAll(a1);

		// Check if the list is empty.
		System.out.println("Check ArrayList is empty: " + a1.isEmpty());

	}
}
