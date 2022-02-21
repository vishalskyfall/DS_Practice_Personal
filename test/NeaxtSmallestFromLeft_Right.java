package test;

import java.util.Stack;

public class NeaxtSmallestFromLeft_Right {
	public static void main(String[] args) {
		int[] a = new int[] { 3, 10, 5, 1, 15, 10, 7, 6 };
		Stack<Integer> s = new Stack<>();
		for (int i = a.length - 1; i >= 0; i--) {

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
