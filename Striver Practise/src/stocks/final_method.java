package stocks;

public class final_method {
	public static void main(String[] args) {
		int[] a = new int[] {100, 180, 260, 310,
                40, 535, 695};
		int sum = Total_profit(a);
		System.out.println(sum);
		System.out.println("Max Profit : " + maxProf(a));
	}

	static int Total_profit(int[] a) {
		int p = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i] > a[i - 1]) {
				p += (a[i] - a[i - 1]);
//				System.out.println(p);
			}
		}
		return p;
	}

	static int maxProf(int[] a) {
		int p = 0, current = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length; j++) {
				if (a[j] > a[i] && j>i) {
//					System.out.println(a[j]+" "+j+" "+i+" "+a[i]);
					p = (a[j] - a[i]);
					if (p > current) {
						current = p;
					}
				}
			}
		}
		return current;
	}
}
