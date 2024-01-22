package collectionPrograms;

import java.util.LinkedHashSet;

public class Set_LinkedHashSet {

	public static void main(String[] args) {

		LinkedHashSet<Integer> lhs1 = new LinkedHashSet<>();
		lhs1.add(1);
		lhs1.add(12);
		lhs1.add(122);
		lhs1.add(123);
		lhs1.add(11);
		lhs1.add(1);

		System.out.println("Linked hash set 1 --> " + lhs1);
	}
}
