package collectionPrograms;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class Set_TreeSet {

	public static void main(String[] args) {
		
		TreeSet<String> t1 = new TreeSet<>();
		TreeSet<Integer> t2 = new TreeSet<Integer>();
		t2.add(1);
		t2.add(-1);
		t2.add(12);
		t2.add(13);
		t2.add(132);
		
		t1.add("abcde");
		t1.add("abcde");
		t1.add("a");
		t1.add("ab");
		t1.add("abc");
		t1.add("abce");
		
		
		
		System.out.println("Tress set t1 --> " + t1);
		
		t1.remove("abcde");
		System.out.println("After remmoving abcde --> " + t1);
		
		System.out.println("Size of treeset t1 --> " + t1.size());
		
//		t1.clear();
//		System.out.println("t1 after claring --> "+t1);
	
		System.out.println("using first()-->" + t2.first());
		System.out.println("using Last()-->" + t2.last());
		
		System.out.println("Celing elmnt --> "+ t2.ceiling(132));
		System.out.println("floor elmnt --> "+ t2.floor(11));
		
		System.out.println("headSet --> " + t2.headSet(132));
		System.out.println("tailSet --> " + t2.tailSet(12));
		System.out.println("SubSet --> " + t2.subSet(1,132));
	}
}


//add(E e): Add an element to the set.
//remove(Object o): Remove an element from the set.
//size(): Get the number of elements in the set.
//isEmpty(): Check if the set is empty.
//clear(): Remove all elements from the set.
//first(): Get the first (lowest) element in the set.
//last(): Get the last (highest) element in the set.
//headSet(E toElement): Get a view of the portion of the set strictly less than toElement.
//tailSet(E fromElement): Get a view of the portion of the set greater than or equal to fromElement.
//subSet(E fromElement, E toElement): Get a view of the portion of the set from fromElement (inclusive) to toElement (exclusive).
//ceiling(E e): Get the least element in the set greater than or equal to e.
//floor(E e): Get the greatest element in the set less than or equal to e.