package search_Matrix;

import java.util.Scanner;

public class final_method {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt();

//		int[][] matrix = new int[4][4];
//		for (int i = 0; i < matrix.length; i++) {
//			for (int j = 0; j < matrix.length; j++) {
//				matrix[i][j] = sc.nextInt();
//			}
//		}
		int[][] matrix = { { 35, 45, 55, 65 },
				{ 40, 50, 60, 70 }, 
				{ 52, 54, 62, 73 }, 
				{ 57, 58, 64, 75 } };

		int[] result = search(matrix, target);
		System.out.println(result[0]+" "+result[1]);

		if (result[0] != -1 && result[1] != -1) {
			System.out.println(target + " found at row - " + (result[0] + 1) + " and column - " + (result[1] + 1));
		} else {
			System.out.println(target + " not found in the matrix");
		}
	}

	static int[] search(int[][] m, int target) {
		if (m.length == 0) {
			return new int[] { -1, -1 };
		}

		int rows = m.length;
		int cols = m[0].length; // columns will be peli line

		int i = 0, j = cols - 1;

		while (i >= 0 && j >= 0 && i < rows && j < cols) {
			if (target == m[i][j])
				return new int[] { i, j };
			else if (target < m[i][j])
				j--; // cols decrease
			else
				i++; // rows increase
		}

		return new int[] { -1, -1 };
	}
}
