package MEDIAN_binarySearch_matrix;

import java.util.Arrays;

public class final_binary {
	public static void main(String[] args) {
		int r = 3, c = 3;
		int m[][] = { { 1, 3, 5 }, { 2, 64, 10 }, { 32, 61, 9 } }; // 1 2 32 3 64 61 55 10 9

		System.out.println("Median is " + binaryMedian(m, r, c)); // sending matrix row and cols
	}

	static int binaryMedian(int m[][], int r, int c) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < r; i++) {
			// finding min elemnet from all
			if (m[i][0] < min) {
				min = m[i][0];
				System.out.println("min"+min);
			}

			// finding max from all
			if (m[i][c - 1] > max) {
				max = m[i][c - 1];System.out.println("max"+max);
			}
		}

		int planned = (r * c + 1) / 2;
		System.out.println(planned);
		while (min < max) {
			int mid = min + (max - min) / 2; System.out.println("mid"+mid);
			int place = 0;
			int get = 0;
			for (int i = 0; i < r; i++) {
				get = Arrays.binarySearch(m[i], mid);
				// If element is not found in the array the
				// binarySearch() method returns
				// (-(insertion_point) - 1). So once we know
				// the insertion point we can find elements
				// Smaller than the searched element by the
				// following calculation
				if (get < 0)
					get = Math.abs(get) - 1;

				// If element is found in the array it returns
				// the index(any index in case of duplicate). So we go to last
				// index of element which will give the number of
				// elements smaller than the number including
				// the searched element.
				else {
					while (get < m[i].length && m[i][get] == mid)
						get += 1;
				}

				place = place + get;
				System.out.println(place+"get:"+get);
			}
			if (place < planned) {
				min = mid + 1;
			} else {
				max = mid;
			}
		}

		return min;
	}
}
