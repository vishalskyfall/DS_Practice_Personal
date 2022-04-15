package SUM_between_0;

import java.util.Vector;

public class final_method {
	public static void main(String[] args) {
		int arr[] = { 1, 0, 3, 4, 0, 4, 4, 0, 2, 1, 4, 0, 3 };
		int N = arr.length;

		// Function call
		sumBetweenZero(arr, N);
	}

	static void sumBetweenZero(int[] a, int n) {
		int i = 0, sum = 0;
		Vector<Integer> v = new Vector<>();
		for (; i < n; i++) {
			if (a[i] == 0) {
				System.out.println(i+" "+a[i]);
				i++;
				break;
			}
		}
		System.out.println(i+" "+a[i]);
		for (; i < n; i++) { // here i will start from 2
			if (a[i] == 0) {
				v.add(sum); //great logic should implement in other amazing
				sum = 0;
			} else {
				sum += a[i];
			}
		}
		for (int j = 0; j < v.size(); j++) {
			System.out.print(v.get(j) + " ");
		}
		if (v.size() == 0)
			System.out.print("-1");
	}
}
