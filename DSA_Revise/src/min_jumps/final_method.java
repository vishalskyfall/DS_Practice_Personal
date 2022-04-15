package min_jumps;

public class final_method {
	public static void main(String[] args) {
		int[][] cost = { { 10, 25, 25, 10, 105 }, { 20, 33, 15, 80, 80 }, { 30, 15, 012, 70, 90 }, { 10, 10, 50, 021, 99 },
				{ 40, 50, 5, 10, 11 } };

		System.out.print("The minimum cost is " + findMinCost(cost));// only with cols not rows
	}

	static int findMinCost(int[][] a) {
		if (a == null || a.length == 0) {
			return 0;
		}
		int N = a.length;
		int[] look = new int[N];
		for (int i = 0; i < N; i++) {
			look[i] = a[0][i]; // only cols
		}
//		boolean isFilled = false;
//		while (!isFilled) {
//			isFilled = true;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					System.out.println(look[i]+"- "+look[j]+" + "+a[j][i]);
					if (look[i] > look[j] + a[j][i]) {

						look[i] = look[j] + a[j][i]; // a[j][i] is for cols check + with current look[j]

//						isFilled = false;
					}
				}
			}
//		}
		return look[N - 1];
	}

}
