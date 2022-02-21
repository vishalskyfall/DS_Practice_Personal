package test;

import test.histogram_area;

public class Largest_area_submatrix {
	public static void main(String[] args) {
		int a[][] = new int[][] { { 0, 1, 1, 1, 1, 0 }, { 1, 1, 1, 1, 0, 1 }, { 1, 1, 0, 1, 1, 1 },
				{ 1, 1, 1, 1, 1, 0 }, };
		int cur[] = a[0];
		int max = histogram_area.his(cur);
		for (int i = 1; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j] == 1) {
					cur[j] += 1;
				} else {
					cur[j] = 0;
				}

			}
			int curans = histogram_area.his(cur);
			max = Math.max(max, curans);
		}
		System.out.println(max);
	}
}
