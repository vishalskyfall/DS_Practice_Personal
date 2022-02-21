package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class sliding_window_deque {
	public static void main(String[] args) {
		int[] a = new int[] { 1, 6, 34, 6, 2, 4, 8, 9 };
		//window
		int k=3;
		PriorityQueue<Integer> d = new PriorityQueue<Integer>(Collections.reverseOrder());
		ArrayList<Integer> res = new ArrayList<Integer>();
		int i;
		for (i = 0; i < k; ++i) {
			d.add(a[i]);
		}
		res.add(d.peek());
		d.remove(a[0]);
		for (i = 0; i < d.size(); i++) {
			d.add(a[i]);
			res.add(d.peek());
			d.remove(a[i - k + 1]);
		}
		System.out.println(res);
	}
}