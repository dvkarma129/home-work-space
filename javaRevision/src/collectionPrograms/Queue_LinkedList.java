package collectionPrograms;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_LinkedList {

	public static void main(String[] args) {

		Queue<Integer> q1 = new LinkedList<>();
		q1.add(1);
		q1.add(-1);
		q1.add(133);
		q1.add(13);
		q1.offer(1234);
		q1.add(12);
		System.out.println("Queue Linkedhashset --> " + q1);

		System.out.println(q1.offer(134));// it is used to add element
		System.out.println(q1.poll());// removes head of the queue and returns ths queue
		System.out.println(q1.peek());// but does not remove, the head of this queue,or returns null if this queue is
										// empty.

		System.out.println("Queue --> " + q1);
	}

}
