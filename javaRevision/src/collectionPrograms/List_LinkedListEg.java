package collectionPrograms;

import java.util.LinkedList;
import java.util.ListIterator;

public class List_LinkedListEg {

	public static void main(String[] args) {
		
		LinkedList<Integer> l1 = new LinkedList<>();
		l1.add(1);
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(4);
		l1.add(4);
		l1.add(4);
		
		//Display elements
		System.out.println("Linked list l1-->"+l1);
		
		//Add elements at random index
		l1.add(0, null);
		l1.add(6, null);
		System.out.println("Adding null at random index" + l1);
		
		//Deleting element at random positions
		l1.remove(0);
		l1.removeFirstOccurrence(4);
		l1.removeLast();
		l1.removeFirst();
		l1.removeLastOccurrence(4);
		System.out.println("L1 after removing random elemnts --> " + l1);
		
		ListIterator<Integer> iter = l1.listIterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
