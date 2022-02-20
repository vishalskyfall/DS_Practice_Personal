package collections;

import java.util.ArrayDeque;

public class ArrayDeque2 {
	public static void main(String[] args) {

		ArrayDeque<Integer> ad = new ArrayDeque<>();
		ad.offer(23);
		ad.offerFirst(1);
		ad.offerLast(100);
		System.out.println(ad);
		//poll pollfirst last and peek peekfirst & last
	}
}
