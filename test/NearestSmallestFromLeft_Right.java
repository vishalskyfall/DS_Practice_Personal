package test;

import java.util.Stack;

public class NearestSmallestFromLeft_Right {
	public static void main(String[] args) {

		int[] a = new int[] { 1, 6, 34, 6, 2, 4, 8, 9 };
		Stack<Integer> s = new Stack<>();
		// System.out.println("test");
		for (int i = 0; i < a.length; i++) {

			while (!s.empty() && s.peek() >= a[i]) { // greater or smalled just change < >
				s.pop();

			}
			if (s.isEmpty()) {
				System.out.println("-1");
			} else {
				System.out.println(s.peek());
			}

			s.push(a[i]);
		}
	}
}
