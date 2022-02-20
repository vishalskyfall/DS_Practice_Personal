package test;

public class stocksPART2 {
	public static void main(String[] args) {
		int[] a = new int[] { 1, 6, 34, 6, 2, 4, 8, 9 };
		int sum = stocks2(a);
		System.out.println(sum);
	}

	static int stocks2(int a[]) {
		int p = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i] > a[i - 1]) {
				p += (a[i] - a[i - 1]);
			}
		}
		return p;
	}
}
