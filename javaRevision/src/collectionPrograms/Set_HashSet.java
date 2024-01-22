package collectionPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_HashSet {

	public static void main(String[] args) {

		Set<String> s = new HashSet<>();

		s.add("dbc");
		s.add("abc");
		s.add("abcd");
		s.add("abc1");

		// set doesnt store duplicate values
		System.out.println("Set s --> " + s);

		// Forward iterating
		// Set does not allow backward iterating so no hasPrevious and previous method
		// present
//		Iterator<String> itr = s.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}

		// Remve elemnt
		s.remove("abc1");
		for (String elmnt : s) {
			System.out.println(elmnt);
		}

		// Checking if the set is contains the elmnt
		System.out.println("checking for elmny --> " + s.contains("abc1"));

		// Checking if the elemnt is empty or not
		System.out.println("Checkking if elmnt is empty or not --> " + s.isEmpty());

		System.out.println("Hashcode value of set s --> " + s.hashCode());

		ArrayList<String> a1 = new ArrayList<>();
		a1.add("abc");
		a1.add("abc");
		a1.add("abcd");
		a1.add("abcd");
		a1.add("abcee");
		a1.add("abce");

		System.out.println("Arraylist --> " + a1);

		Set<String> s2 = new HashSet<String>();
		s2.addAll(a1);

		System.out.println("Addinf all elmnts of ArrayList with duplicate elmnt " + s2);
		
		
		System.out.println("ReatinaAll of s and s2 set --> " + s2.retainAll(s));
		
//		System.out.println("Split iterator --> " +(s.spliterator()));
	}
}
