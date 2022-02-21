package test;

import java.util.Stack;

public class histogram_area {
	public static void main(String[] args) {
		int[] a = new int[] { 1, 6, 34, 6, 2, 4, 8, 9 };
		
		
	System.out.println(his(a));
	}
static int his(int a[]) {
	int max=0;
	int ps[] = nSmall(a);
	int ns[] = nextSmall(a);
	for(int i=0;i<a.length;i++) {
		int current = (ns[i]-ps[i]-1)*a[i];
		max= Math.max(max, current);
	}
	return max;
}
	static int[] nextSmall(int a[]) {
		int[] nxtsmall = new int[a.length];
		Stack<Integer> s = new Stack<>();

		for (int i = a.length - 1; i >= 0; i--) {

			while (!s.empty() && s.peek() >= a[i]) { // greater or smalled just change < >
				s.pop();

			}
			if (s.isEmpty()) {
				nxtsmall[i]=-1;
			} else {
				nxtsmall[i]=s.peek();
			}

			s.push(i);//pushing index not element
		}
		return nxtsmall;
	}

	static int[] nSmall(int a[]) {
		int[] prevsmall = new int[a.length];
		Stack<Integer> s = new Stack<>();
		for (int i = 0; i < a.length; i++) {

			while (!s.empty() && s.peek() >= a[i]) { // greater or smalled just change < >
				s.pop();

			}
			if (s.isEmpty()) {
				prevsmall[i] =-1;
			} else {
				prevsmall[i] = s.peek();
			}

			s.push(i);//pushing index not element
		}
		return prevsmall;
	}
}
