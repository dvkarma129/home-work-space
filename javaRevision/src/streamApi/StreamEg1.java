package streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> li = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

//		for (int i = 0; i < li.size(); i++) {
//			System.out.println("-->" + li.get(i));
//		}

//		for (int n : li) {
//			System.out.println(n);
//		}

		Stream<Integer> s1 = li.stream();
		Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
		Stream<Integer> s3 = s2.map(n -> n * 2);

//		s1.forEach(n -> System.out.println("--> "+n));
//		s3.forEach(n -> System.out.println("--> "+n));

//		int results = s3.map()
		
		
	}

}
