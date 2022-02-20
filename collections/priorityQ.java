package collections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityQ {
	public static void main(String[] args) {

		PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder()); //here to change priority
		q.offer(100);
		q.offer(34); // use offer as it doesnt throw exception not to use add plzz
		q.offer(46);
		q.offer(93);
		System.out.println(q); // heap type 6 nano element pela jay 
		
		System.out.println(q.poll()); // first in first out & and value jeni nani 6 e
		//poll ma same element ma throw karse jo malse nai to
		System.out.println(q.peek() + "  " + q); // same element ma throw karse jo malse nai to
	}
}
