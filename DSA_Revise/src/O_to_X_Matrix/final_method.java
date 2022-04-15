package O_to_X_Matrix;

import java.util.Arrays;

public class final_method {
	public static void main(String[] args) {
		char[][] mat = { { 'X', 'O', 'X', 'O', 'X', 'X' }, { 'X', 'O', 'X', 'X', 'O', 'X' },
				{ 'X', 'X', 'X', 'O', 'X', 'X' }, { 'O', 'X', 'X', 'X', 'X', 'X' }, { 'X', 'X', 'X', 'O', 'X', 'O' },
				{ 'O', 'O', 'X', 'O', 'O', 'O' } };

		replaceSurrounded(mat);
		for (var r : mat) {
			System.out.println(Arrays.toString(r));
		}
	}

	public static void replaceSurrounded(char[][] a) {
		if (a == null || a.length == 0) {
			return;
		}
		int M = a.length; // row
		int N = a[0].length; // col
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (a[i][j] == 'X') {
//					System.out.println("O's : "+i+" "+j);
					changeRowCol(a, M, N, i, j);
				}
			}
		}
		for (int i = 1; i < M - 1; i++) {
			for (int j = 1; j < N - 1; j++) {
				if (a[i][j] == 'O') {
					a[i][j] = 'X';
				}
			}
		}
	}

	static void changeRowCol(char[][] a, int M, int N, int i, int j) {
		for (int k = 0; k < N; k++) {
			if (a[i][k] != 'X') {
				a[i][k] = 'O';
			}
		}
		for (int k = 0; k < M; k++) {
			if (a[k][j] != 'X') {
				a[k][j] = 'O';
			}
		}

	}

}
